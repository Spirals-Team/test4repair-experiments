from src.bet.runners.RunnerOverfitClassifier import *
from src.bet.runners.Overfitting2Table import *

nrAOjgp = 0
nrBOjgp = 0
nrAOmi = 0
nrBOmi = 0
nrPatches = 0
nrimprovementAO = 0
nrimprovementBO = 0
nrchangedPatch = 0
nrWorseAO = 0
nrWorseBO = 0

def sizeL(patches):
    if(len(patches) is 0):
        return 0
    #First index is the patch (we always take the best one), second is the tuple (patch info is in 0)
    listTest = patches[0][1]["testOver"]
    return len(listTest)

def patchContent(patchesA, patchesB, noOverPatches):
    if(len(patchesA) is not 0):
        return formatPatch(patchesA[0][0])
    #First index is the patch (we always take the best one), second is the tuple (patch info is in 0)
    if (len(patchesB) is not 0):
        return formatPatch(patchesB[0][0])
    #
    return formatPatch(noOverPatches[0]) if len(noOverPatches)> 0 else ""

def formatPatch(patch):
    s = patch.split("_")
    className  = s[0]
    lastDot = className.rindex(".")
    return patch[lastDot+1:]

def analyzeSeed(t4rpath, bugid, betjsonData):
    global nrchangedPatch,nrimprovementAO,nrimprovementBO,nrWorseAO,nrWorseBO,nrAOjgp,nrAOmi,nrBOjgp,nrBOmi, nrPatches


    sorted_list = sorted( [x for x in os.listdir(t4rpath) if x.startswith("seed_") ] , key=lambda k: (int(k.replace("seed_",""))))
    content = ""
    for seed in  sorted_list:

                if seed == ".DS_Store" or seed == "readme.md":
                    continue

                pathToTrial = os.path.join(t4rpath,seed)
                #We read the json file with the result to take the first patch.

                #First patch with MinImpact
                aoverfitseedMI, boverfitseedMI, noOverfittedMI = classifyPatchesFromTrial(pathToTrial, bugid, betjsonData,approach=MIN_IMPACT_PATCH)
                #First patch with jGenProg
                aoverfitseedJGP, boverfitseedJPG,noOverfittedJGP = classifyPatchesFromTrial(pathToTrial, bugid, betjsonData, approach=FIRST_JGP)

                patchJGP = patchContent(aoverfitseedJGP, boverfitseedJPG, noOverfittedJGP)
                patchMI = patchContent(aoverfitseedMI, boverfitseedMI, noOverfittedMI)
                changePatch = (patchJGP != patchMI)
                nrchangedPatch+= 1 if changePatch else 0

                aOverJGP = sizeL(aoverfitseedJGP)
                aOverMI = sizeL(aoverfitseedMI)
                bOverJGP = sizeL(boverfitseedJPG)
                bOverMI = sizeL(boverfitseedMI)

                nrimprovementAO += 1 if (aOverJGP>aOverMI) else  0
                nrimprovementBO += 1 if  (bOverJGP > bOverMI)  else  0

                nrWorseAO += 1 if (aOverJGP < aOverMI) else  0
                nrWorseBO += 1 if (bOverJGP < bOverMI)  else  0

                nrBOmi += 1 if bOverMI > 0 else 0
                nrAOmi += 1 if aOverMI > 0 else 0

                nrBOjgp += 1 if bOverJGP > 0 else 0
                nrAOjgp += 1 if aOverJGP > 0 else 0

                nrPatches += 1 if aOverJGP > 0 or bOverJGP > 0 or noOverfittedJGP else 0

                content += ("\n| {} | {} | {} | {} | {} | {} | {} | {} | {} | {} | {} ".format(
                    bugid, \
                    seed.replace("seed_",""),\

                                                                                   formatPatchString(patchJGP, 75) \
                                                                                   , aOverJGP, bOverJGP \
                                                                                   , formatPatchString(patchMI, 75), \
                                                                                   aOverMI, bOverMI \
                                                                                   , "Changed" if changePatch else ""\
                                                                                   , "Improved_AO" if (aOverJGP>aOverMI) else ("Worse AO" if (aOverJGP < aOverMI) else "")\
                                                                                   , "Improved_BO" if  (bOverJGP > bOverMI)  else ("Worse BO" if (bOverJGP < bOverMI) else "")\
                                                                                   ))


    return content

def createTableOverfittigImprovement(path, jsonbet):
        global nrchangedPatch, nrimprovementAO, nrimprovementBO, nrAOjgp,nrAOmi,nrBOjgp,nrBOmi, nrPatches

        content = ("\n| Bug id | Seed | jGP Patch| jGenProg NrTests A-over | jGenProg NrTests B-over | MinImpact Patch | MinImpact NrTest A-over | Min NrTests B-over | Patch change? | Improved A-over? | Improved B-over? | ")
        content += ("\n| ----- | ----- | ----- | ----- | ----- | ----- | ----- | ----- | ----- | ----- | -----| ")

        for project in ["Math", "Chart", "Time"]:
            proj = os.path.join(path, project)
            patchesFolder = os.path.join(proj)

            ##For each bug (i.e., folder)
            for bugid in os.listdir(patchesFolder):

                if bugid == ".DS_Store" or bugid == "readme.md":
                        continue

                fbug = os.path.join(patchesFolder, bugid)
                if not os.path.isfile(fbug):
                    ##For each bug (i.e., folder)
                        bugIdResultsFolder = os.path.join(fbug, "jGenProg")
                        content += analyzeSeed(bugIdResultsFolder,bugid,jsonbet)

        content += ("\n| {} | {} | {} | {} | {} | {} | {} | {} | {} | {} | {} |".format(
            "TOTAL Patches", \
            "", \
             nrPatches, nrAOjgp \
            , nrBOjgp, \
            "", nrAOmi \
            , nrBOmi \
            , nrchangedPatch \
            , "" \
            , "" \
            ))

        content += ("\n| {} | {} | {} | {} | {} | {} | {} | {} | {} | {} | {} |".format(
            "TOTAL Improvement", \
            "", \
            "" \
            , "", "" \
            , "", \
            "", "" \
            , "" \
            , nrimprovementAO \
            , nrimprovementBO \
            ))

        content += ("\n| {} | {} | {} | {} | {} | {} | {} | {} | {} | {} | {} |".format(
            "TOTAL Worse", \
            "", \
            "" \
            , "", "" \
            , "", \
            "", "" \
            , "" \
            , nrWorseAO \
            , nrWorseBO \
            ))

        return content
