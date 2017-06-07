import json
import os

errorNoSeed = 0

"""
t4rpath path to project folder (e.g. Math) that contains all bugs (e.g., Math1, Math2...).
betjsondata parsed jsom data from bet json

returns: for each bug in the project two list, one with all a-overfitting patches with the number of seed that it does occurs , the other the same for B-overfitting patches

"""
def classifyAstorPatchesFromProject(t4rpath, betjsonData, onlyMinImpactPatch = False):
    global errorNoSeed

    results = []

    patchesFolder = os.path.join(t4rpath)
    ##For each bug (i.e., folder)
    for bugid in os.listdir( patchesFolder):
        fbug = os.path.join( patchesFolder, bugid)

        if not os.path.isfile(fbug):

            a_overfit, b_overfit = classifyAstorPatchesFromBugId(patchesFolder,bugid,betjsonData,onlyMinImpactPatch)

            results.append({"bugid":bugid,"a_overfit":a_overfit, "b_overfit":b_overfit})


   # print("Error final report: patches without info in JSON BET: {} ".format(errorNoSeed))
    return results
''''
Analyze the patches of a bug id for All trials (seeds).
input:
t4rpath folder corresponding to a bug (e.g. Math1)

returns two list, one with all a-overfitting patches with the number of seed that it does occurs , the other the same for B-overfitting patches
'''
def classifyAstorPatchesFromBugId(t4rpath, bugid, betjsonData, onlyMinImpactPatch = False):
    global errorNoSeed

    ## <Local path>/ test4repair - experiments / results / jGenProg + MinImpact / Patches and Analysis / Chart / Chart1 / jGenProg / seed_1

    result_a_over = []
    result_b_over = []
    bugIdResultsFolder = os.path.join(t4rpath,bugid, "jGenProg" )
    ##Load all Test_bet Info from JSON
    for seed in os.listdir(bugIdResultsFolder):

                if seed == ".DS_Store" or seed == "readme.md":
                    continue

                pathToTrial = os.path.join(bugIdResultsFolder,seed)
                aoverfitseed, boverfitseed = classifyPatchesFromTrial(pathToTrial, bugid, betjsonData,onlyMinImpactPatch)
                result_a_over.append(aoverfitseed)
                result_b_over.append(boverfitseed)

    ##We have collected patch classification of all trials (seeds), now, let's analyze on seeds

    summarization_a_over = countOverfittingOverSeeds(result_a_over)
    summarization_b_over = countOverfittingOverSeeds(result_b_over)

    return summarization_a_over, summarization_b_over

''''
Input:
result_overfitting is a list, where each element corresponds to a list of patches for one seed

returns:
 list of dict with patches and count of overfitting
'''
def countOverfittingOverSeeds(result_overfitting):
    ##Collect all patches found in all trials
    result = []
    uniquePatches = set()
    for seedresult in result_overfitting:
        for patch in seedresult:
            uniquePatches.add(patch[0])
    ##for each patch, count in how many seeds it appears as Overfitted
    for patch in uniquePatches:
        testsFromSeed = []
        for seedresult in result_overfitting:
              for patchseed in seedresult:
                 #patchesfromseed.append(p[0])
                 if patch == patchseed[0]:
                     testsFromSeed.append(patchseed[1])
        result.append({"patch":patch, "count_overfit":len(testsFromSeed), "seeds":testsFromSeed})

    return result


""""
repairAttempt : path with the location of the attempt (seed)
bugid : bugidentified to find in the json data,
jsonBetData : data read from json bet
onlyMinImpact: if true it only keeps the patch with min impact from a trial, if false: it analyzes all patches from a trial.
:return two lists, one with the a-overfitting patches, the other with the b-overfitting

"""
def classifyPatchesFromTrial(repairAttempt, bugid, jsonBetData, onlyMinImpactPatch = False):

    seedid = repairAttempt.split("_")[1]
    ##The method classifies the patches of one TRIAL i.e., repair attempt (bug id-seed)
    global errorNoSeed
    ## list with a-overfit patches. Each element is a tuple-2: first element a patch, second list of overfitted test cases
    aoverseed = []
    ##list with b-overfiting
    boverseed = []
    ##list with analyzed patched (to avoid analyzing twice)
    patchAnalyzed = []

    #reading the astor json file with the patches of a trial (bug-seed)
    resultTrial = os.path.join(repairAttempt, "results.json")
    json_data = open(resultTrial).read()
    data = json.loads(json_data)
    patches = data.get("patches")


    #Finding data of the trial in the JSON BET file.
    seed = os.path.basename(repairAttempt)
    testbet = jsonBetData[bugid.lower()].get(seed.replace("seed_", "seed"))
    if testbet is None  and patches is not None and len(patches) > 0:
        errorNoSeed += 1
        ##Here are the cases that evosuite fails : Chart15/jGenProg/seed_21 Chart5/jGenProg/seed_19, Chart5/jGenProg/seed_20,Chart5/jGenProg/seed_24
        ##print("Error: no data about the trial in the json bet file for {}".format(repairAttempt))
        #As infomation about the bug is not present in JSON BET, we return empty
        return [],[] 

    #For each patch in the trial
    if patches is not None and len(patches) > 0:
        if onlyMinImpactPatch:
            minImpactPatches = getMinImpactPatch(patches)
            patches = [minImpactPatches[0]]

        for patch in patches:
            ##Get the patch key and check if it was analyzed, to avoid duplicates
            patchkey = getPatchKey(patch)
            if any(patchkey in patch for patch in patchAnalyzed):
                continue
            else:
                patchAnalyzed.append(patchkey)

            #Reading patch info from json generated by Astor for a trial
            pvalidation = patch["patchvalidation"]
            nrEvoFailing = int(pvalidation["numberEvosuiteFailing"])


            ##Now, from the JSON BET, we retrieve the test information
            ##The values are not a json list. Transforming them
            #corresponds to the bug-exposing tests
            bet = toIntList(testbet["bugExposingTest"])


            ##A-Overfit
            ##If we have bet
            if len(bet) > 0:
                test4patches = []
                ##for each failing test in patched version, we find one that is BET
                for failingtest in patch["patchvalidation"]["evoFailingTest"]:
                    #we retrieve the name of the failing test (which is a number after creating the JSON BET files and Astor files)
                    nameFailing = int(failingtest["failingTestName"])
                    if nameFailing in bet:
                        test4patches.append(getTestCaseInformation(failingtest, seedid, bugid))
                if len(test4patches) > 0:
                    aoverseed.append((patchkey, {"seed":seedid, "testOver":test4patches}))

            ##B-Overfit
            if (nrEvoFailing > 0):
                 test4patches = []  ##for each failing test in patched version,
                 for failingtest in patch["patchvalidation"]["evoFailingTest"]:
                    nameFailing = int(failingtest["failingTestName"])
                    if nameFailing not in bet:
                        test4patches.append(getTestCaseInformation(failingtest, seedid, bugid))
                 if len(test4patches) > 0:
                    boverseed.append((patchkey, {"seed": seedid, "testOver": test4patches}))

    return aoverseed,boverseed


def getTestCaseInformation(failingtest, seed, bugid):
    #math/Math2/seed15
    projectId = ''.join([i.lower() for i in bugid if not i.isdigit()])
    link = "https://github.com/Spirals-Team/test4repair-experiments/tree/master/results/astor-test-and-classification/{}/{}/seed{}/generatedTests/".format(projectId,bugid,seed)
    keyTestCase =  failingtest["failingClassName"] + ".test" + failingtest["failingTestName"]
    link+= "/"+failingtest["failingClassName"].replace(".","/")+".java"
    return {"name":keyTestCase,"link":link}

def toIntList(listInString):
    '''from integer to list'''
    result = listInString.replace("[", "").replace("]", "").strip()
    list = []
    if len(result) is not 0:
           for i in result.split(","):
            list.append(int(i))

    return list

def getPatchKey(patchJSON):
    '''returns a key (a string)for a patch presented in a Json file'''
    return patchJSON["patchLocation"]["className"]+"_"+ \
           str(patchJSON["patchLocation"]["line"])+"_"+ \
           patchJSON["patch"]+"_"+  \
           patchJSON["type"]

def getMinImpactPatch(patches):
    sorted_list = sorted(patches, key=lambda k: (int(k["patchvalidation"]["numberEvosuiteFailing"]),
                                                 int(k["time"])))
    return sorted_list

def runExperiment(path,jsonbet, fileoutput = "../../output/patchOverfittingClassification.json",onlyMinImpactPatch = False):
    '''given a test4repair project, classifies the patches'''
    allProjectResults = []
    for project in ["Math", "Chart", "Time"]:
        projPath = os.path.join(path,project)
        result =  classifyAstorPatchesFromProject(projPath,jsonbet,onlyMinImpactPatch)
        allProjectResults.append({"project":project,"result":result})



    with open(fileoutput, 'w') as outfile:
        json.dump(allProjectResults, outfile)