#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//math/ project math
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/analysis/solvers/BisectionSolver.java b/src/main/java/org/apache/commons/math/analysis/solvers/BisectionSolver.java
index 180caef..3f66927 100644
--- a/src/main/java/org/apache/commons/math/analysis/solvers/BisectionSolver.java
+++ b/src/main/java/org/apache/commons/math/analysis/solvers/BisectionSolver.java
@@ -69,7 +69,7 @@ public class BisectionSolver extends UnivariateRealSolverImpl {
     /** {@inheritDoc} */
     public double solve(final UnivariateRealFunction f, double min, double max, double initial)
         throws MaxIterationsExceededException, FunctionEvaluationException {
-        return solve(f, min, max);
+        return solve(min, max);
     }
 
     /** {@inheritDoc} */
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 9

## Patch 9 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 10

## Patch 10 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 11

## Patch 11 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 15

## Patch 15 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 16

## Patch 16 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23


--- 
#Seed: 17

## Patch 17 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 18

## Patch 18 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 19

## Patch 19 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 23

## Patch 23 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 24

## Patch 24 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22


--- 
#Seed: 25

## Patch 25 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 26

## Patch 26 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 27

## Patch 27 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22


--- 
#Seed: 28

## Patch 28 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 29

## Patch 29 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 30

## Patch 30 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 22

Average Nb of Failing EvoSuite Tests: 3.5

---