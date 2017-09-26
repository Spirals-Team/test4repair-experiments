import unittest

from src.log2json.parser import *


class JSONParserTest(unittest.TestCase):


    def test_parserS1M40(self):
        content = getLogContent(root="../../test-resources/resources-parser/", filename="stdout_seed1M40.log")
        json = parseLog(root="../../test-resources/resources-parser/", log=content)
        patches = json["patches"]
        self.assertEqual(4, len(patches)) ##3 patches discard

        for p in json["patches"]: ##we dont analyze this variants (failures in regression)
            self.assertNotEquals(p["variant"], 1600)
            self.assertNotEquals(p["variant"], 578)


        patch0Results = patches[0]["patchvalidation"]
        self.assertEqual(patches[0]["variant"], 292)
        self.assertEqual(int(patch0Results["numberEvosuiteFailing"]), 3)
        self.assertEqual(int(patch0Results['numberAllEvosuiteTestGenerated']), 28)
        self.assertEqual(len(patch0Results["evoFailingTest"]), 3)
        self.assertEqual(int(patch0Results["evoFailingTest"][0]["failingTestName"]), 14)
        self.assertEqual((patch0Results["evoFailingTest"][0]["failingClassName"]), 'org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_ESTest')
        self.assertEqual(int(patch0Results["evoFailingTest"][1]["failingTestName"]), 16)
        self.assertEqual(int(patch0Results["evoFailingTest"][2]["failingTestName"]), 17)



        patch0Results = patches[1]["patchvalidation"]
        self.assertEqual(patches[1]["variant"], 1024)
        self.assertEqual(int(patch0Results["numberEvosuiteFailing"]), 2)
        self.assertEqual(int(patch0Results['numberAllEvosuiteTestGenerated']), 28)
        self.assertEqual(len(patch0Results["evoFailingTest"]), 2)
        self.assertEqual(int(patch0Results["evoFailingTest"][0]["failingTestName"]), 16)
        self.assertEqual((patch0Results["evoFailingTest"][0]["failingClassName"]), 'org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_ESTest')
        self.assertEqual(int(patch0Results["evoFailingTest"][1]["failingTestName"]), 2)

    def test_parserS1C25(self):
        content = getLogContent(root="../../test-resources/resources-parser/", filename="stdout_seed1_c25.log")
        json = parseLog(root="../../test-resources/resources-parser/", log=content)
        patches = json["patches"]
        self.assertEqual(7, len(patches))  ##3 patches discard

        for p in json["patches"]:  ##we dont analyze this variants (failures in regression)
            self.assertNotEquals(p["variant"], 28)


        patch0Results = patches[0]["patchvalidation"]
        self.assertEqual(patches[0]["variant"], 142)
        self.assertEqual(int(patch0Results["numberEvosuiteFailing"]), 4)
        self.assertEqual(int(patch0Results['numberAllEvosuiteTestGenerated']), 67)
        self.assertEqual(len(patch0Results["evoFailingTest"]), 4)
        self.assertEqual(int(patch0Results["evoFailingTest"][0]["failingTestName"]), 18)
        self.assertEqual((patch0Results["evoFailingTest"][0]["failingClassName"]),
                         'org.jfree.data.statistics.DefaultStatisticalCategoryDataset_ESTest')
        self.assertEqual(int(patch0Results["evoFailingTest"][1]["failingTestName"]), 54)
        self.assertEqual(int(patch0Results["evoFailingTest"][2]["failingTestName"]), 5)
        self.assertEqual(int(patch0Results["evoFailingTest"][3]["failingTestName"]), 4)

        patch0Results = patches[1]["patchvalidation"]
        self.assertEqual(patches[1]["variant"], 300)
        self.assertEqual(int(patch0Results["numberEvosuiteFailing"]), 0)
        self.assertEqual(int(patch0Results['numberAllEvosuiteTestGenerated']), 243)
        self.assertEqual(len(patch0Results["evoFailingTest"]), 0)
