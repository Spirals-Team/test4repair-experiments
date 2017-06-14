import os.path
import unittest
from src.bet.core.OverfittingJSON2Table import *
from src.bet.Parameters import *

class OverfittingClassification2Table(unittest.TestCase):

    def testCreateTableByBug(self):
        path_to_classification_result = pathToTest4RepairRoot \
                                        + patchClassificationFolder \
                                        + "patchOverfittingClassificationAllPatchesMinImpact.json"
        if os.path.isfile(path_to_classification_result):
            content = overfittingJSON2Table(path_to_classification_result)
            file = open(pathToTest4RepairRoot
                        + patchClassificationFolder+ "/readme.md", "w")
            file.write(content)
            file.close()

        else:
            print("Error: The summary file with the overfitting classificationn result does not exist at {}".format(path_to_classification_result))

    def testCreateTableByPatchMinImpact(self):
        path_to_classification_result = pathToTest4RepairRoot \
                                        + patchClassificationFolder \
                                        + "patchOverfittingClassificationAllPatchesMinImpact.json"
        if os.path.isfile(path_to_classification_result):
            content = overfittingJSON2TableByPatch(path_to_classification_result)
            file = open(pathToTest4RepairRoot
                       + patchClassificationFolder+ "/readmeMinImpact.md", "w")
            file.write("# Overfitting Classification of MinImpact Patches \n")
            file.write(content)
            file.close()

        else:
            print("Error: The summary file with the overfitting classificationn result does not exist at {}".format(
                path_to_classification_result))


    def testCreateTableByPatchAllPatches(self):
        path_to_classification_result = pathToTest4RepairRoot \
                                        + patchClassificationFolder \
                                        + "patchOverfittingClassificationAllPatches.json"
        if os.path.isfile(path_to_classification_result):
            content = overfittingJSON2TableByPatch(path_to_classification_result)
            file = open(pathToTest4RepairRoot
                       + patchClassificationFolder+ "/readmeAllPatches.md", "w")
            file.write("# Overfitting Classification of All Patches\n")
            file.write(content)
            file.close()

        else:
            print("Error: The summary file with the overfitting classificationn result does not exist at {}".format(
                path_to_classification_result))

    def testCreateTableByPatchFirstJGenProgPatch(self):
        path_to_classification_result = pathToTest4RepairRoot \
                                        + patchClassificationFolder \
                                        + "patchOverfittingClassificationFirstJGenProg.json"
        if os.path.isfile(path_to_classification_result):
            content = overfittingJSON2TableByPatch(path_to_classification_result)
            file = open(pathToTest4RepairRoot
                       + patchClassificationFolder+ "/readmejGenProgFirstPatch.md", "w")
            file.write("# Overfitting Classification of All Patches\n")
            file.write(content)
            file.close()

        else:
            print("Error: The summary file with the overfitting classificationn result does not exist at {}".format(
                path_to_classification_result))


