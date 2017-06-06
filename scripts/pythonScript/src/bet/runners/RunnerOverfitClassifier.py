import unittest
from src.bet.core.AstorPatchOverfitClassifier import *
from src.bet.core.ParserBugExposingJSON import *
from src.bet.Parameters import *


class Runner(unittest.TestCase):

    def testRunCompleteExperimentAllPatches(self):
        '''Analyze overfitting of ALL patches generated, e.g. if a repair trial (bug-seed) generates X patches, we analyze all of them '''
        jsonbet = parseTBetJSONFile(pathToTest4RepairRoot + JSONBETFolder)
        minImpact = False
        path = (pathToTest4RepairRoot + JSONASTORFolder)
        fileoutput = pathToTest4RepairRoot +patchClassificationFolder + "patchOverfittingClassificationAllPatches.json"
        runExperiment(path, jsonbet,fileoutput=fileoutput, onlyMinImpactPatch=minImpact)
        self.assertTrue(os.path.isfile(fileoutput))

    def testRunCompleteExperimentMinImpact(self):
        '''Analyze overfitting of patches with minImpact, that is, only the first patch of a trial according to minImpact classification'''
        jsonbet = parseTBetJSONFile(pathToTest4RepairRoot + JSONBETFolder)
        path = (pathToTest4RepairRoot + JSONASTORFolder)
        minImpact = True
        fileoutput = pathToTest4RepairRoot + patchClassificationFolder + "/patchOverfittingClassificationAllPatchesMinImpact.json"
        runExperiment(path, jsonbet,fileoutput = fileoutput,onlyMinImpactPatch=minImpact)
        self.assertTrue(os.path.isfile(fileoutput))