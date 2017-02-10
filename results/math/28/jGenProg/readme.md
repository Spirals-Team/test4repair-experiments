#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//math/ project math
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math3/optimization/linear/SimplexSolver.java b/src/main/java/org/apache/commons/math3/optimization/linear/SimplexSolver.java
index dec310b..a84438d 100644
--- a/src/main/java/org/apache/commons/math3/optimization/linear/SimplexSolver.java
+++ b/src/main/java/org/apache/commons/math3/optimization/linear/SimplexSolver.java
@@ -116,7 +116,6 @@ public class SimplexSolver extends AbstractLinearOptimizer {
             // there's a degeneracy as indicated by a tie in the minimum ratio test
 
             // 1. check if there's an artificial variable that can be forced out of the basis
-            if (tableau.getNumArtificialVariables() > 0) {
                 for (Integer row : minRatioPositions) {
                     for (int i = 0; i < tableau.getNumArtificialVariables(); i++) {
                         int column = i + tableau.getArtificialVariableOffset();
@@ -126,7 +125,6 @@ public class SimplexSolver extends AbstractLinearOptimizer {
                         }
                     }
                 }
-            }
 
             // 2. apply Bland's rule to prevent cycling:
             //    take the row for which the corresponding basic variable has the smallest index
@@ -137,7 +135,6 @@ public class SimplexSolver extends AbstractLinearOptimizer {
             // Additional heuristic: if we did not get a solution after half of maxIterations
             //                       revert to the simple case of just returning the top-most row
             // This heuristic is based on empirical data gathered while investigating MATH-828.
-            if (getIterations() < getMaxIterations() / 2) {
                 Integer minRow = null;
                 int minIndex = tableau.getWidth();
                 for (Integer row : minRatioPositions) {
@@ -152,7 +149,6 @@ public class SimplexSolver extends AbstractLinearOptimizer {
                     }
                 }
                 return minRow;
-            }
         }
         return minRatioPositions.get(0);
     }
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math3.optimization.linear.SimplexSolver : 124

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 8

Nb of Failing EvoSuite Tests: 8


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math3.optimization.linear.SimplexSolver : 77

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math3.optimization.linear.SimplexSolver : 104

Patch type: ReplaceOp

```Java

setMaxIterations(org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS)

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 8

Nb of Failing EvoSuite Tests: 8


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math3.optimization.linear.SimplexSolver : 124

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 8

Nb of Failing EvoSuite Tests: 8


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math3.optimization.linear.SimplexSolver : 145

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 6

Nb of Failing EvoSuite Tests: 6


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math3.optimization.linear.SimplexSolver : 77

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 8

Nb of Failing EvoSuite Tests: 8


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math3.optimization.linear.SimplexSolver : 104

Patch type: InsertBeforeOp

```Java

minRatioPositions = new java.util.ArrayList<java.lang.Integer>()

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math3.optimization.linear.SimplexSolver : 120

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 9

## Patch 9 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math3.optimization.linear.SimplexSolver : 145

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 10

## Patch 10 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math3.optimization.linear.SimplexSolver : 145

Patch type: ReplaceOp

```Java

minRatioPositions = new java.util.ArrayList<java.lang.Integer>()

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 11

## Patch 11 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math3.optimization.linear.SimplexSolver : 124

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math3.optimization.linear.SimplexSolver : 119

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math3.optimization.linear.SimplexSolver : 145

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 8

Nb of Failing EvoSuite Tests: 8


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math3.optimization.linear.SimplexSolver : 123

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 15

## Patch 15 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math3.optimization.linear.SimplexSolver : 123

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 16

## Patch 16 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math3.optimization.linear.SimplexSolver : 123

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 8

Nb of Failing EvoSuite Tests: 8


--- 
#Seed: 17

## Patch 17 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math3.optimization.linear.SimplexSolver : 120

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 18

## Patch 18 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 19

## Patch 19 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math3.optimization.linear.SimplexSolver : 115

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math3.optimization.linear.SimplexSolver : 115

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math3.optimization.linear.SimplexSolver : 77

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math3.optimization.linear.SimplexSolver : 124

Patch type: ReplaceOp

```Java

return minRatioPositions.get(0)

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 23

## Patch 23 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math3.optimization.linear.SimplexSolver : 120

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 8

Nb of Failing EvoSuite Tests: 8


--- 
#Seed: 24

## Patch 24 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math3.optimization.linear.SimplexSolver : 123

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 8

Nb of Failing EvoSuite Tests: 8


--- 
#Seed: 25

## Patch 25 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math3.optimization.linear.SimplexSolver : 104

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 26

## Patch 26 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math3.optimization.linear.SimplexSolver : 145

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 27

## Patch 27 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 28

## Patch 28 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 8

Nb of Failing EvoSuite Tests: 8


--- 
#Seed: 29

## Patch 29 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math3.optimization.linear.SimplexSolver : 124

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


--- 
#Seed: 30

## Patch 30 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math3.optimization.linear.SimplexSolver : 77

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 7


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 7.54

Average Nb of Failing EvoSuite Tests: 0

---