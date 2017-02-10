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



## Patch 2 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 3 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 4 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 5 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 6 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 7 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 8 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 9 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 10 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 11 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 12 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 13 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 14 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 15 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 16 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36


--- 
#Seed: 2

## Patch 17 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 18 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 19 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 20 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 21 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 22 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 23 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 24 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 25 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 26 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 27 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 28 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 29 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 30 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 31 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 32 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 33 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35


--- 
#Seed: 3

## Patch 34 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 35 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 36 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 37 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 38 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 39 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 40 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 41 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 42 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 43 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 44 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 45 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 46 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 47 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 48 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 49 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 50 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30


--- 
#Seed: 4

## Patch 51 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 52 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 53 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 54 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 55 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 56 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 57 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 58 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 59 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 60 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 61 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 62 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 63 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 64 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 65 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 66 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 67 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37


--- 
#Seed: 5

## Patch 68 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 69 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 70 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 71 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 72 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 73 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 74 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 75 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 76 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 77 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 78 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 79 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 80 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 81 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 82 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 83 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 84 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35


--- 
#Seed: 6

## Patch 85 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 86 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 87 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 88 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 89 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 90 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 91 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 92 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 93 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34


--- 
#Seed: 7

## Patch 94 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 95 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 96 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 97 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 98 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 99 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 100 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 101 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 102 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 103 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 104 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 105 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 106 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 107 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 108 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 109 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 110 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35


--- 
#Seed: 8

## Patch 111 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 112 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 113 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 114 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 115 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 116 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 117 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 118 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 119 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 120 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 121 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 122 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 123 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 124 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 125 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 126 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 127 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37


--- 
#Seed: 9

## Patch 128 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 129 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 130 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 131 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 132 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 133 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 134 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 135 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 136 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 137 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 138 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 139 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 140 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 141 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 142 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 143 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 144 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33


--- 
#Seed: 10

## Patch 145 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 146 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 147 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 148 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 149 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 150 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 151 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 152 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 153 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 154 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 155 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 156 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 157 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 158 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 159 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 160 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 161 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36


--- 
#Seed: 11

## Patch 162 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 163 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 164 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 165 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 166 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 167 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 168 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 169 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 170 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 171 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34


--- 
#Seed: 12

## Patch 172 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 173 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 174 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 175 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 176 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 177 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 178 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 179 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 180 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 181 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 182 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 183 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 184 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 185 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 186 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 187 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 188 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34


--- 
#Seed: 13

## Patch 189 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 190 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 191 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 192 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 193 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 194 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 195 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 196 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 197 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 198 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 199 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 200 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 201 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 202 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 203 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33


--- 
#Seed: 14

## Patch 204 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 205 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 206 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 207 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 208 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 209 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 210 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 211 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 212 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 213 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 214 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 215 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 216 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 217 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 218 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 219 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36


--- 
#Seed: 15

## Patch 220 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 221 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 222 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 223 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 224 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 225 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 226 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 227 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 228 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 229 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 230 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 231 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 232 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 233 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 234 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 235 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 236 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33


--- 
#Seed: 16

## Patch 237 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 238 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 239 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 240 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 241 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 242 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 243 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 244 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 245 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 246 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 247 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 248 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 249 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 250 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 251 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 252 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 253 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35


--- 
#Seed: 17

## Patch 254 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 255 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 256 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 257 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 258 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 259 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 260 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 261 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 262 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 263 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 264 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 265 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 266 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 267 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 268 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 269 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 270 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32


--- 
#Seed: 18

## Patch 271 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 272 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 273 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 274 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 275 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 276 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 277 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 278 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 279 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 280 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 281 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 282 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 283 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 284 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 285 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36



## Patch 286 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36


--- 
#Seed: 19

## Patch 287 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 288 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 289 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 290 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 291 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 292 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 293 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 294 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 295 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 296 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 297 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 298 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 299 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 300 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 301 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 302 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32


--- 
#Seed: 20

## Patch 303 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 304 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 305 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 306 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 307 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 308 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 309 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 310 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 311 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 312 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 313 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 314 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 315 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 316 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 317 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32


--- 
#Seed: 21

## Patch 318 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 319 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 320 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 321 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 322 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 323 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 324 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 325 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 326 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 327 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 328 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 329 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 330 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 331 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 332 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 333 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 334 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33


--- 
#Seed: 22

## Patch 335 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 336 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 337 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 338 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 339 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 340 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 341 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 342 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 343 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 344 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 345 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 346 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 347 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 348 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 349 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 350 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34


--- 
#Seed: 23

## Patch 351 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 352 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 353 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 354 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 355 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 356 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 357 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 358 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 359 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 360 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 361 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 362 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 363 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 364 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 365 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 366 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 367 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31


--- 
#Seed: 24

## Patch 368 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 369 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 370 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 371 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 372 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 373 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 374 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 375 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 376 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 377 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 378 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 379 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 380 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 381 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 382 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 383 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33



## Patch 384 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 33

Nb of Failing EvoSuite Tests: 33


--- 
#Seed: 25

## Patch 385 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 386 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 387 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 388 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 389 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 390 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 391 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 392 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 393 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 394 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 395 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 396 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 397 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 398 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 399 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 400 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34


--- 
#Seed: 26

## Patch 401 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 402 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 403 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 404 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 405 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 406 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 407 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 408 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 409 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 410 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 411 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 412 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 413 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 414 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32


--- 
#Seed: 27

## Patch 415 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 416 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 417 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 418 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 419 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 420 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 421 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 422 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 423 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 424 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 425 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 426 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 427 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 428 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 429 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 430 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32


--- 
#Seed: 28

## Patch 431 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 432 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 433 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 434 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 435 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 436 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 437 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 438 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 439 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 440 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 441 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 442 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 443 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 444 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 445 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 446 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35



## Patch 447 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35


--- 
#Seed: 29

## Patch 448 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 449 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 450 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 451 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 452 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 453 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 454 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 455 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 456 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 457 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 458 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 459 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 460 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 461 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 462 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34


--- 
#Seed: 30

## Patch 463 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 464 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 465 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 466 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: ReplaceOp

```Java

return solve(f, min, initial)

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 467 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BrentSolver : 138

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 468 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 469 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BrentSolver : 132

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 470 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 471 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BrentSolver : 125

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 472 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 473 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BrentSolver : 120

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 474 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BrentSolver : 126

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 475 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 476 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BrentSolver : 114

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 477 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BrentSolver : 107

Patch type: InsertAfterOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 478 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BrentSolver : 113

Patch type: InsertBeforeOp

```Java

verifyBracketing(min, max, f)

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 37

Average Nb of Failing EvoSuite Tests: 8

---