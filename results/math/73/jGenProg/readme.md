#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//math/ project math
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/analysis/solvers/BrentSolver.java b/src/main/java/org/apache/commons/math/analysis/solvers/BrentSolver.java
index e0cb427..8142b5e 100644
--- a/src/main/java/org/apache/commons/math/analysis/solvers/BrentSolver.java
+++ b/src/main/java/org/apache/commons/math/analysis/solvers/BrentSolver.java
@@ -133,10 +133,6 @@ public class BrentSolver extends UnivariateRealSolverImpl {
             return solve(f, initial, yInitial, max, yMax, initial, yInitial);
         }
 
-        if (yMin * yMax > 0) {
-            throw MathRuntimeException.createIllegalArgumentException(
-                  NON_BRACKETING_MESSAGE, min, max, yMin, yMax);
-        }
 
         // full Brent algorithm starting with provided initial guess
         return solve(f, min, yMin, max, yMax, initial, yInitial);
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37


--- 
#Seed: 9

## Patch 9 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33


--- 
#Seed: 10

## Patch 10 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36


--- 
#Seed: 11

## Patch 11 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36


--- 
#Seed: 15

## Patch 15 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33


--- 
#Seed: 16

## Patch 16 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35


--- 
#Seed: 17

## Patch 17 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32


--- 
#Seed: 18

## Patch 18 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36


--- 
#Seed: 19

## Patch 19 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34


--- 
#Seed: 23

## Patch 23 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31


--- 
#Seed: 24

## Patch 24 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33


--- 
#Seed: 25

## Patch 25 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34


--- 
#Seed: 26

## Patch 26 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32


--- 
#Seed: 27

## Patch 27 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32


--- 
#Seed: 28

## Patch 28 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35


--- 
#Seed: 29

## Patch 29 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34


--- 
#Seed: 30

## Patch 30 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 35.12

Average Nb of Failing EvoSuite Tests: 3.75

---