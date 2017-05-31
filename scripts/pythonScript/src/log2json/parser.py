import json
import re
import os
import datetime
import json

def getLogContent(root = None,filename = 'stdout.log'):

	file_path = os.path.join(root, filename)
	f= open(file_path, 'r').read()
	slittedLog = f.split(' --SOLUTIONS DESCRIPTION--')
	if (len(slittedLog) > 1):
		return (slittedLog[1])


def parseLog( log,  root):

	date = datetime.datetime.now().isoformat()

	m = re.search('ProgramVariant ([0-9]+)', log)
	if m:
		programVariant = m.group(1)
	m = re.search('Time Repair Loop \(s\): ([0-9]+)', log)
	if m:
		timeEvaluation = m.group(1)
	m = re.search('Time Total\(s\): ([0-9]+)', log)
	if m:
		timeTotal = m.group(1)
	else:
		return
	m = re.search('Node: ([a-zA-Z0-9\-\.]+)', log)
	if m:
		node = m.group(1)
	m = re.search('Date: ([^`]+)$', log)
	if m:
		date = m.group(1)


	programVariant = log.split('ProgramVariant ')
	if (len(programVariant) > 1):
		operations = []

		for op in programVariant:
			generation = None
			className = None
			line = None
			patch = None
			buggyStatement = None
			type = None
			variant = 0
			timepatch = 0
			scopepatch = None
			ingrpatch = None
			#
			fvaltcfailing = None
			#
			#
			mvaltcfailing = None
			mvalresult = None
			mvaltcall = None
			#
			evaltcfailing = None
			evalresult = None
			evaltcall = None
			m = re.search('^([0-9]+)$', op, flags=re.MULTILINE + re.DOTALL)
			if m:
				variant = m.group(1)
			#m = re.search('(REPLACE|DELETE|INSERT_BEFORE|INSERT_AFTER)', op)
			m = re.search('operation: (.*)', op)
			if m:
				type = m.group(1)
			m = re.search('location= (.*)', op)
			if m:
				className = m.group(1)
			else:
				continue
			m = re.search('line= ([0-9]+)', op)
			if m:
				line = m.group(1)
			m = re.search('^original statement= "?(.*)"?\nfixed statement', op, flags=re.MULTILINE + re.DOTALL)
			if m:
				buggyStatement = m.group(1)
			m = re.search('^fixed statement= "?(.*)"?\ngeneration', op, flags=re.MULTILINE + re.DOTALL)
			if m:
				patch = m.group(1)
			if type == "RemoveOp":
				patch = 'remove'
			m = re.search('generation= ([0-9]+)', op)
			if m:
				generation = m.group(1)
			m = re.search('time\(sec\)= ([0-9]+)', op)
			if m:
				timepatch = m.group(1)
			m = re.search('ingredientScope= (.*)', op)
			if m:
				scopepatch = m.group(1)
			m = re.search('ingredients= (.*)', op)
			if m:
				ingrpatch = m.group(1)
			# new
			m = re.search('failing: (.*)', op)
			if m:
				sl = m.group(1).split("|")
				fvaltcfailing = sl[2]
				fvalresult = sl[1]
				fvaltcall = sl[3]
			#
			# new
			m = re.search('manual_regression: (.*)', op)
			if m:
				sl = m.group(1).split("|")
				mvaltcfailing = sl[2]
				mvalresult = sl[1]
				mvaltcall = sl[3]
			#
			if  mvaltcfailing is None or mvalresult is 'false' or mvalresult is 'NULL' or int(mvaltcfailing) > 0:
				continue

			m = re.search('evo_regression: (.*)', op)
			if m:
				sl = m.group(1).split("|")
				evaltcfailing = sl[2]
				evalresult = sl[1]
				evaltcall = sl[3]

				efailingpairs = []
				#the sl[4] possition has a list of failing test names
				###test04(org.apache.commons.math.util.Incrementor_ESTest): Expecting exception: IllegalStateException-, test10(org.apache.commons.math.util.Incrementor_ESTest): Expe
				if sl[4] != '[]':
					etestNames = sl[4].split(", test")
					try:
						for fail in etestNames:
							##For each test name in the list of evosuite failing tests:
							if fail.__contains__('failures more'):
								continue
							fnames = fail.split("(")
							tname = fnames[0].replace("[test","")
							tclass = fnames[1].split(")")[0]
							efailingpairs.append({"failingClassName":tclass, "failingTestName":tname})
					except:
						print("Error")
						return None
			if (patch == None):
				continue
			operations.append({
				'type': type,
				'generation': int(generation),
				'variant': int(variant), #"variant"
				'patchLocation': {
					'className': className,
					'line': int(line)
				},
				'patch': patch,
				'buggyStatement': buggyStatement,
				'time': timepatch,
				'scope': scopepatch,
				'ingredients': ingrpatch,
				'patchvalidation': {
					'numberInitialFailing': fvaltcfailing,
					'numberAllTestRegression': mvaltcall,
					#
					'numberEvosuiteFailing': evaltcfailing,
					#'evalresult': evalresult,
					'numberAllEvosuiteTestGenerated': evaltcall,
					'evoFailingTest':efailingpairs
				},
			})

	results = {
		'patches': operations, #Previously called operations#
		'timeTotal': timeTotal,
		'node': node,
		'date': date
	}
	reg = re.compile('#([a-zA-Z]+) *: *([0-9]+)')
	m = reg.findall(log)
	for i in m:
		results[i[0]] = i[1]
	reg = re.compile("time val([0-9]+) \[[0-9]+\]: \[([0-9, ]+)\]")
	m = reg.findall(log)
	for i in m:
		results["timeVal" + i[0]] = []
		t = re.compile('([0-9]+)')
		v = t.findall(i[1])
		for j in v:
			results["timeVal" + i[0]].append(int(j))

	#path = os.path.join(project.logPath, "seed", seed, scope, str(id), self.name, "results.json")  # scope
	return results



def parserFailingNames(line):
		return None
	#reg = re.compile("\[ ('test'([0-9]+) \[[0-9]+\]: \[([0-9, ]+) *)  \]")
###test04(org.apache.commons.math.util.Incrementor_ESTest): Expecting exception: IllegalStateException-, test10(org.apache.commons.math.util.Incrementor_ESTest): Expe
