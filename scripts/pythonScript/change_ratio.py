#!/usr/bin/env python

import os
import json
import re
def natural_key(string_):
    """See http://www.codinghorror.com/blog/archives/001018.html"""
    return [int(s) if s.isdigit() else s for s in re.split(r'(\d+)', string_)]

count = 0
def extract_results(path, project, bug, seed):
	global count
	result_path = os.path.join(path, "results.json")
	if not os.path.isfile(result_path):
		return
	with open(result_path) as file:
		results = json.load(file)
		if "patches" not in results or len(results["patches"]) == 0:
			return
		isMin = True
		first_eval = int(results["patches"][0]["patchvalidation"]["numberEvosuiteFailing"])
		for i in range(1, len(results["patches"])):
			eval = int(results["patches"][i]["patchvalidation"]["numberEvosuiteFailing"])
			failing = results["patches"][i]["patchvalidation"]["numberInitialFailing"]
			if failing is None or int(failing) > 0:
				continue
			if eval < first_eval:
				isMin = False
				break

		return isMin

root = "../../results"
experiment_path = os.path.join(root, "jGenProg+MinImpact", "Patches and Analysis")
for project in sorted(os.listdir(experiment_path)):
	project_path = os.path.join(experiment_path, project)
	if os.path.isfile(project_path):
		continue
	for bug in sorted(os.listdir(project_path), key=natural_key):

		changed = []

		bug_path = os.path.join(project_path, bug)
		for tool in os.listdir(bug_path):
			tool_path = os.path.join(bug_path, tool)
			if os.path.isfile(tool_path):
				continue
			allseed = []
			for seed in os.listdir(tool_path):
				seed_path = os.path.join(tool_path, seed)
				if os.path.isfile(seed_path):
					continue
				allseed += [int(seed[5:])]
				if not extract_results(seed_path, project, bug, seed):
					changed += [int(seed[5:])]
		print bug, "%d/%d seeds with changes due to MinImpact:" % (len(changed),len(allseed)) , sorted(changed)