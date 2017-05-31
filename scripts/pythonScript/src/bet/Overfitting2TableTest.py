
import os.path

from src.bet.OverfittingJSON2Table import *

pathToTest4Repair = "/Users/matias/develop/results/test4Repair/jsontest4repair/test4repair-experiments/"
JSONASTORFolder = "/results/jGenProg+MinImpact/Patches and Analysis/"
JSONBETFolder = "/results/astor-test-and-classification/"

class ClassificationTest(unittest.TestCase):

    def testParseBetJSON(self):
        ##Here, I use the classification of MinImpact patches, but we can classify All patches..
        path_to_classification_result = pathToTest4Repair+ "/results/jGenProg+MinImpact/patch_classification/"+"patchOverfittingClassificationAllPatchesMinImpact.json"
        if os.path.isfile(path_to_classification_result):
            overfittingJSON2Table(path_to_classification_result)
        else:
            print("Error: The summary file with the overfitting classificationn result does not exist at {}".format(path_to_classification_result))

