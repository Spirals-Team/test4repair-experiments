import os
import unittest
from pprint import pprint
from src.bet.core.ParserBugExposingJSON import *
from src.bet.core.AstorPatchOverfitClassifier import *
from src.bet.Parameters import *


class OverfittingClassificationTest(unittest.TestCase):

    def testParseBetJSON(self):
        jsonParentFolder =  "results/astor-test-and-classification"
        fbug = os.path.join(pathToTest4RepairRoot, jsonParentFolder)
        result = parseTBetJSONFile(fbug)

        self.assertNotEquals(result["time4"],None)

        self.assertTrue(len(result.keys())> 0 )

    def testPatchOverfitClassifMath_50_Seed1_AOverfitting(self):


        jsonbet = parseTBetJSONFile("../../../test-resources/resources-jsonbet/")

        bugfolder = "../../../test-resources/resources-jsonbet/Math50/jGenProg/seed_1"
        bugidentified = "Math50"
        aoverseed, boverseed = classifyPatchesFromTrial(bugfolder, bugid= bugidentified, jsonBetData=jsonbet)
        print("Patches a-over: ")
        print(*aoverseed,sep="\n")
        self.assertTrue(len(aoverseed)>0)

        aoverseedPatches = []
        for patch in aoverseed:
            aoverseedPatches.append(patch[0])

        self.assertTrue("org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_ReplaceOp" in aoverseedPatches)

        print("\nPatches b-over: ")
        print(*boverseed, sep="\n")

    def testPatchOverfitClassifMath_50_Seed_10_BOverfitting(self):

            jsonbet = parseTBetJSONFile("../../../test-resources/resources-jsonbet/")

            bugfolder = "../../../test-resources/resources-jsonbet/Math50/jGenProg/seed_10"

            bugidentified = "Math50"

            aoverseed, boverseed = classifyPatchesFromTrial(bugfolder, bugid=bugidentified, jsonBetData=jsonbet)
            print("Patches a-over: ")
            print(*aoverseed, sep="\n")

            print("\nPatches b-over: ")
            print(*boverseed, sep="\n")

            boverseedPatches = []
            for patch in boverseed:
                boverseedPatches.append(patch[0])

            self.assertTrue("org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.commons.math.analysis.solvers.BaseSecantSolver.this.allowed = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE_ReplaceOp" in boverseedPatches)
            self.assertTrue(len(boverseed) > 0)

    def testOverfiting_Math_50_b_overfitting_allSeed(self):

            jsonbet = parseTBetJSONFile("../../../test-resources/resources-jsonbet/")

            result_a_overfit,result_b_overfit =  classifyAstorPatchesFromBugId("../../../test-resources/resources-jsonbet/","Math50",jsonbet)
            print("\nSummary a-over:")
            print(result_a_overfit)
            pprint(result_a_overfit)


            patchTest = "org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.commons.math.analysis.solvers.BaseSecantSolver.this.allowed = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE_ReplaceOp"

            found = False
            for result in result_a_overfit:
                if result["patch"] == patchTest:
                    found = True
                    self.assertEqual(10, result["count_overfit"])
            self.assertTrue(found)

            # now, let's evaluate each trial: a-overfitting is seed 11,15,17,18,20,23,28,29,3,32
            bugidentified = "Math50"
            seedWithPatchOverfitted = [11,15,17,18,20,23,28,29,3,32]
            for seed in range(1, 13):
                bugfolder = "../../../test-resources/resources-jsonbet/Math50/jGenProg/seed_" + str(seed)
                a_over_seed, b_over_seed = classifyPatchesFromTrial(bugfolder, bugid=bugidentified, jsonBetData=jsonbet)
                isOverfit = any((patchTest in s for s in a_over_seed))
                if seed in seedWithPatchOverfitted:
                    self.assertTrue(isOverfit)
                else:
                    self.assertFalse(isOverfit)

    def testOverfiting_Math_50_b_overfitting_allSeed(self):

            jsonbet = parseTBetJSONFile("../../../test-resources/resources-jsonbet/")

            result_a_overfit,result_b_overfit =  classifyAstorPatchesFromBugId("../../../test-resources/resources-jsonbet/","Math50",jsonbet)

            print("\nSummary b-over:")
            pprint(result_b_overfit)

            patchTest = "org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.commons.math.analysis.solvers.BaseSecantSolver.this.allowed = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE_ReplaceOp"

            found = False
            for result in result_b_overfit:
                if result["patch"] == patchTest:
                    found = True
                    self.assertEqual(4, result["count_overfit"])
            self.assertTrue(found)

            #now, let's evaluate each trial: b-overfitting is seed 10, 17, 6 ,2.
            bugidentified = "Math50"
            seedWithPatchOverfitted = [2,6,10,17]
            for seed in range(1,13):
                bugfolder = "../../../test-resources/resources-jsonbet/Math50/jGenProg/seed_"+str(seed)
                aoverseed,boverseed = classifyPatchesFromTrial(bugfolder, bugid=bugidentified, jsonBetData=jsonbet)
                isOverfit = any((patchTest in s for s in boverseed))
                if seed in seedWithPatchOverfitted:
                    self.assertTrue(isOverfit)
                else:
                    self.assertFalse(isOverfit)

    def testOverfiting_MultipleBugsAllSeed(self):

        jsonbet = parseTBetJSONFile("../../../test-resources/resources-jsonbet/")
        result = classifyAstorPatchesFromProject("../../../test-resources/resources-jsonbet/",jsonbet)
        print("Results: ")
        print(result)
        patchTest = "org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.commons.math.analysis.solvers.BaseSecantSolver.this.allowed = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE_ReplaceOp"

        patchFound = False
        for bugs in result:
            bugid = bugs["bugid"]
            if bugid == "Math50":
                #isOverfit = any((patchTest in s for s in bugs['a_overfit']))
                for overfitted in  bugs['a_overfit']:
                    if overfitted["patch"] == patchTest:
                        patchFound = True
                        self.assertTrue(overfitted["count_overfit"]>0)

        self.assertTrue(patchFound)

    def testOverfiting_MultipleBugsAllSeedChart5(self):

        jsonbet = parseTBetJSONFile("../../../test-resources/resources-jsonbet/")
        result = classifyAstorPatchesFromProject("../../../test-resources/resources-jsonbet/", jsonbet)
        print("Results: ")
        print(result)
        patchTest = "org.jfree.data.xy.XYSeries_564_add(x, y, true)_ReplaceOp"

        patchFound = False
        for bugs in result:
            bugid = bugs["bugid"]
            if bugid == "Chart5":
                 for overfitted in bugs['a_overfit']:
                    if overfitted["patch"] == patchTest:
                        patchFound = True
                        self.assertTrue(overfitted["count_overfit"] == 22)
                        self.assertEquals(overfitted["count_overfit"], len(overfitted["seeds"]) )

        self.assertTrue(patchFound)

    def testOverfiting_MultipleBugsAllSeedMinImpact(self):

        jsonbet = parseTBetJSONFile("../../../test-resources/resources-jsonbet/")
        result = classifyAstorPatchesFromProject("../../../test-resources/resources-jsonbet/",jsonbet, onlyMinImpactPatch=True)
        print("Results: ")
        print(result)


        patchTest = "org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.commons.math.analysis.solvers.BaseSecantSolver.this.allowed = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE_ReplaceOp"

        patchFound = False
        for bugs in result:
            bugid = bugs["bugid"]
            #self.assertTrue(len(bugs['a_overfit']) <=1)
            #self.assertTrue(len(bugs['b_overfit']) <= 1)
            for patches_over in bugs['a_overfit']:
               if  patches_over['patch'] == patchTest:
                   patchFound = True

        self.assertTrue(patchFound)



    def testPatchOverfitClassifMath_50_Seed_10_AOverfittingMIn(self):

            jsonbet = parseTBetJSONFile("../../../test-resources/resources-jsonbet/")

            attemptfolder = "../../../test-resources/resources-jsonbet/Math50/jGenProg/seed_17"

            bugidentified = "Math50"

            aoverseed, boverseed = classifyPatchesFromTrial(attemptfolder, bugid=bugidentified, jsonBetData=jsonbet, onlyMinImpactPatch=False)
            print("Patches a-over: ")
            print(*aoverseed, sep="\n")

            print("\nPatches b-over: ")
            print(*boverseed, sep="\n")

            self.assertTrue(len(aoverseed) > 0)

            aoverseedmin, boverseedmin = classifyPatchesFromTrial(attemptfolder, bugid=bugidentified, jsonBetData=jsonbet,
                                                            onlyMinImpactPatch=True)
            ##The patch that is in first in minImpact ranking does not overfit.
            self.assertTrue(len(aoverseedmin) == 0)
            self.assertTrue(len(boverseedmin) == 0)

            #Now, let's take the first patch from minImpact
            resultTrial = os.path.join(attemptfolder, "results.json")
            json_data = open(resultTrial).read()
            data = json.loads(json_data)
            patches = data.get("patches")

            patchesSorted = getMinImpactPatch(data["patches"])

            self.assertTrue(len(patchesSorted)>0)

            patchMinImpactkey = getPatchKey(patchesSorted[0])

            #if the min patch is on a-overf fails
            for overfitted in aoverseed:
                self.failIf(overfitted == patchMinImpactkey)

            for overfitted in boverseed:
                self.failIf(overfitted == patchMinImpactkey)

    def testMinImpactPatch(self):
        bugfolder = "../../../test-resources/resources-jsonbet/Math50/jGenProg/seed_17/results.json"
        self.assertTrue(os.path.isfile(bugfolder))
        json_data = open(bugfolder).read()
        data = json.loads(json_data)
        allpatches = data["patches"]
        print(*allpatches, sep="\n")
        patchesSorted = getMinImpactPatch(data["patches"])
        print("Result: ")
        #print(*patchesSorted, sep="\n")
        self.printpatch(patchesSorted)

        #Let's check that the variant id of the first element is the minImpact
        self.assertEqual(1148,patchesSorted[0]["variant"])

        #check that patches are ordered by minImpact
        nrfailing_iminus1 = int(patchesSorted[0]["patchvalidation"]["numberEvosuiteFailing"])
        for i in range(1, len(patchesSorted)):
            nrfailing_i = int(patchesSorted[i]["patchvalidation"]["numberEvosuiteFailing"])
            self.assertTrue(nrfailing_iminus1 <= nrfailing_i)
            nrfailing_iminus1 = nrfailing_i



    def printpatch(self, patches):
        for patch in patches:
            print("P: {} {}".format(patch["patchvalidation"]["numberEvosuiteFailing"], patch['time'] ))