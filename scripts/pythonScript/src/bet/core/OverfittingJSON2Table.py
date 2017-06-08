import json
import numpy

#TODO: I m not sure if it' ok: what if the overfitted came from difference seeds.
def computePatchesWithAandBoverfitting(bug):
    count = 0
    for patchOverfittedinA in bug["a_overfit"]:
        for patchOverfittedinB in bug["b_overfit"]:
            if patchOverfittedinA['patch'] == patchOverfittedinB['patch']:
                count += 1
                break
    return count

strNoOver = "-"

def overfittingJSON2Table(path_json_result):
    """Returns and prints in stdout the Summary table of patch overfitting classification from the JSON
    file that contains the A- and B- overfitting patches for each bug id """
    json_data = open(path_json_result).read()
    dataPatchCLassification = json.loads(json_data)

    ##
    bugsWithAOver = 0
    bugsWithBOver = 0

    ##
    output = "|bug id|A-Overfitting patches|B-Overfitting patches|Both Overfitting|"
    output+= "| ----- | ----- | ----- | ----- |"

    for project in dataPatchCLassification :

        print("\nProject {} ".format(project["project"]))
        bugs = project["result"]
        for bug in bugs:
            bugid = bug["bugid"]

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
    # output: MD table
    return output

def overfittingJSON2TableByPatch(path_json_result):
    """Returns and prints in stdout the Summary table of patch overfitting classification from the JSON
    file that contains the A- and B- overfitting patches for each bug id """
    json_data = open(path_json_result).read()
    dataPatchCLassification = json.loads(json_data)

    ##
    bugsWithAOver = 0
    bugsWithBOver = 0

    a_over_patches = {}
    b_over_patches = {}

    ##
    output = "\n|Bug Id| Patch Id | A-Overfitting NrTC (NrSeeds)|B-Overfitting NrTC(NrSeeds)|Both Overfitting|"
    output+= "\n| ----- | ----- | ----- | ----- | ----- |"

    for project in dataPatchCLassification :

        print("\nProject {} ".format(project["project"]))
        bugs = project["result"]
        totalPatches = 0
        totalA = 0
        totalB = 0
        totalAB = 0

        for bug in bugs:
            bugid = bug["bugid"]


            for patchOverfitted in bug["a_overfit"]:
                a_over_patches[patchOverfitted ["patch"]] = patchOverfitted["seeds"]


            for patchOverfitted in bug["b_overfit"]:
                b_over_patches[patchOverfitted["patch"]] = patchOverfitted["seeds"]

            keysPatchID = []

            keysPatchID.extend(a_over_patches.keys())

            keysPatchID.extend(b_over_patches.keys())

            for patchID in keysPatchID:

                totalPatches +=1

                aov = getPatchOverfitting(a_over_patches, patchID)
                bov = getPatchOverfitting(b_over_patches, patchID)

                totalA += 1 if aov != strNoOver else 0
                totalB += 1 if bov != strNoOver else 0

                bothOverfittings = (patchID in a_over_patches.keys() and patchID in b_over_patches)  #computePatchesWithAandBoverfittingByPatches(bug)
                totalAB += 1 if bothOverfittings else 0

                strlim = 75
                patchstr = formatPatchString(patchID, strlim)
                output += "\n|"+bugid+"|"+ patchstr+"|"+aov+"|"+bov+"|" + str(bothOverfittings) +"|"


    output += "\n|Total|{}|{}|{}|{}|".format(totalPatches,totalA,totalB,totalAB)

    print("{}".format(output))
    # output: MD table
    return output


def formatPatchString(patchID, strlim):
    patchstr = (patchID[:strlim] + '..') if len(patchID) > strlim else patchID
    return "```"+patchstr.replace("\n"," ")+"```"


def getPatchOverfitting(a_over_patches, key):
    if key in a_over_patches.keys():
        patch = a_over_patches[key]
        medianNrTest = getMedianOverfittingTest(patch)
        seeds = len(patch)

        return str("%g"%(medianNrTest)) + " (" + str(seeds)+ ")"
    else:
        return strNoOver

def getMedianOverfittingTest(seeds):
    testOverSide = []
    for seed in seeds:
        testOverSide.append(len(seed["testOver"]))

    return numpy.median(testOverSide)



