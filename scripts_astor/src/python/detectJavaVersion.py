#!/usr/bin/env python

import os
import re
import json
from core.Config import conf


rootProjects = conf.projectsRoot
rootProjectsData = os.path.join(conf.defects4jRepairRoot, "src", "python", "data", "projects")
for project in os.listdir(rootProjects):
    projectPath = os.path.join(rootProjects, project)
    projectDataPath = os.path.join(rootProjectsData, project.lower() + ".json")
    print projectDataPath
    if not os.path.exists(projectDataPath):
        continue
    if os.path.isfile(projectPath):
        continue
    data_file = open(projectDataPath, "r+")
    data = json.load(data_file)
    if "complianceLevel" not in data:
        data["complianceLevel"] = {}
    for bugId in os.listdir(projectPath):
        bugPath = os.path.join(projectPath, bugId)
        if os.path.isfile(bugPath):
            continue
        propertiesPath = os.path.join(bugPath, "default.properties")
        if not os.path.exists(propertiesPath):
            propertiesPath = os.path.join(bugPath, "project.properties")
            if not os.path.exists(propertiesPath):
                propertiesPath = os.path.join(bugPath, "pom.xml")
                if not os.path.exists(propertiesPath):
                    propertiesPath = os.path.join(bugPath, "ant/build.xml")
                    if not os.path.exists(propertiesPath):
                        propertiesPath = os.path.join(bugPath, "build.xml")
                        if not os.path.exists(propertiesPath):
                            propertiesPath = None
        target = None
        source = None
        if propertiesPath:
            print propertiesPath
            with open(propertiesPath) as file:
                for line in file:
                    m = re.search('compile.target ?= ?1.([0-9])', line)
                    if m:
                        target = m.group(1)
                    else:
                        m = re.search('target>1.([0-9])', line)
                        if m:
                            target = m.group(1)
                        else:
                            m = re.search('target="1.([0-9])"', line)
                            if m:
                                target = m.group(1)
                            else:
                                m = re.search('name="ant.build.javac.target" value="1.([0-9])"', line)
                                if m:
                                    target = m.group(1)

                    m = re.search('compile.source ?= ?1.([0-9])', line)
                    if m:
                        source = m.group(1)
                    else:
                        m = re.search('source>1.([0-9])', line)
                        if m:
                            source = m.group(1)
                        else:
                            m = re.search('source="1.([0-9])"', line)
                            if m:
                                source = m.group(1)
                            else:
                                m = re.search('name="ant.build.javac.source" value="1.([0-9])"', line)
                                if m:
                                    source = m.group(1)
        if target is None:
            continue
        data["complianceLevel"][int(bugId.split("_")[1])] = {
            "target": int(target),
            "source": int(source)
        }
    data_file.seek(0)
    data_file.write(json.dumps(data, indent=4, sort_keys=True))
    data_file.truncate()
    data_file.close()
