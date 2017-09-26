import json
import os

from src.log2json import parser

logfilename = 'stdout.log'

def visit(walk_dir):
    totallog = 0
    nr_errors = 0
    logwithoutpatch = []
    jsonfilename = "results.json"
    print('walk_dir = ' + walk_dir)

    print('walk_dir (absolute) = ' + os.path.abspath(walk_dir))

    for root, subdirs, files in os.walk(walk_dir):
        print('--\nroot = ' + root)

        for filename in files:

            file_path = os.path.join(root, filename)

            if filename == logfilename:
                try:
                    print(filename)
                    file = open(file_path, 'r').read()
                    slittedLog = file.split(' --SOLUTIONS DESCRIPTION--')
                    if (len(slittedLog) > 1):
                        jsonresults = parser.parseLog(slittedLog[1], root)
                        if jsonresults is not None:
                            saveJSONOnFIle(root, jsonresults, jsonfilename)
                            totallog+=1
                        else:
                            nr_errors += 1

                    else:
                        logwithoutpatch.append(file_path)
                except Exception as s:
                    print("error {}".format(file_path))
                    print(str(s))
                    return


    print("Total {} files:  {} with any patch: {} ".format(logfilename,totallog,nr_errors))
    print("With no patch: ")
    print(*logwithoutpatch, sep="\n")

def saveJSONOnFIle(root, results, filename= "test1.json"):
    path = os.path.join(root, filename)  # scope
    if not os.path.exists(os.path.dirname(path)):
        os.makedirs(os.path.dirname(path))
    file = open(path, "w")
    file.write(json.dumps(results, indent=4, sort_keys=True))
    file.close()