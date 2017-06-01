import json
import unittest
from pprint import pprint


def computePatchesWithAandBoverfitting(bug):
    count = 0
    for patchOverfittedinA in bug["a_overfit"]:
        for patchOverfittedinB in bug["b_overfit"]:
            if patchOverfittedinA['patch'] == patchOverfittedinB['patch']:
                count += 1
                break
    return count


def overfittingJSON2Table(path_json_result):
    json_data = open(path_json_result).read()
    dataPatchCLassification = json.loads(json_data)
    #pprint(dataPatchCLassification)

    #We should take from the JSON ASTOR only the first
    ##
    bugsWithAOver = 0
    bugsWithBOver = 0

    ##
    output = "|bug id|A-Overfitting patches|B-Overfitting patches|"

    seedsWithAOver = 0
    for project in dataPatchCLassification :
        #print(i["a_overfit"])
        print("\nProject {} ".format(project["project"]))
        bugs = project["result"]
        for bug in bugs:
            bugid = bug["bugid"]
            a = 0
            b = 0
            #if len(bug["a_overfit"]) > 0:
            #    print("Bug {} has a-over".format(bugid))

            for patchOverfitted in bug["a_overfit"]:
                count =  patchOverfitted["count_overfit"]
                bugsWithAOver+=1

            #if len(bug["b_overfit"]) > 0:
            #    print("Bug {} has b-over".format(bugid))

            for patchOverfitted in bug["b_overfit"]:
                count = patchOverfitted["count_overfit"]
                bugsWithBOver += 1

            bothOverfittings = computePatchesWithAandBoverfitting(bug)

            output+="\n|"+bugid+"|"+str(len(bug["a_overfit"]))+"|"+str(len(bug["b_overfit"]))+"|" + str(bothOverfittings) +"|"

    print("{}".format(output))

    #output: MD table

