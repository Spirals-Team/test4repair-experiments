import unittest

from src.log2json.DirWalk import *

pathToTest4Repair = "/Users/matias/develop/results/test4Repair/jsontest4repair/test4repair-experiments/"

class DirWalkTest(unittest.TestCase):


    def testWT(self):
        visit(pathToTest4Repair+"/results/jGenProg+MinImpact/Patches and Analysis")