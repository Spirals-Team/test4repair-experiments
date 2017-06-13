import unittest
from src.bet.core.AstorPatchOverfitClassifier import *
from src.bet.core.ParserBugExposingJSON import *
from src.bet.Parameters import *
from src.bet.core.CreateTableOverfittingImprovement import *


class Runner(unittest.TestCase):

    def testRunCompleteExperimentMinImpact(self):
        '''Analyze overfitting of patches with minImpact, that is, only the first patch of a trial according to minImpact classification'''
        jsonbet = parseTBetJSONFile(pathToTest4RepairRoot + JSONBETFolder)
        path = (pathToTest4RepairRoot + JSONASTORFolder)
        content = createTableOverfittigImprovement(path, jsonbet)
        print(content)
        fileoutput = pathToTest4RepairRoot + patchClassificationFolder + "/readmeOverfittingImprovement.md"
        file = open(fileoutput, "w")
        file.write("# Overfitting Classification of MinImpact and jGenProg Baseline\n")
        file.write(content)
        file.close()
        print("Writting result file at {}".format(fileoutput))