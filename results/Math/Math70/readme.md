
##Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/analysis/solvers/BisectionSolver.java b/src/main/java/org/apache/commons/math/analysis/solvers/BisectionSolver.java
index 180caef..3f66927 100644
--- a/src/main/java/org/apache/commons/math/analysis/solvers/BisectionSolver.java
+++ b/src/main/java/org/apache/commons/math/analysis/solvers/BisectionSolver.java
@@ -69,7 +69,7 @@ public class BisectionSolver extends UnivariateRealSolverImpl {
     /** {@inheritDoc} */
     public double solve(final UnivariateRealFunction f, double min, double max, double initial)
         throws MaxIterationsExceededException, FunctionEvaluationException {
+        return solve(f, min, max);
-        return solve(min, max);
     }
 
     /** {@inheritDoc} */
```


## Patch Original jGenProg 

org.apache.commons.math.analysis.solvers.BisectionSolver:72

Patch type: ReplaceOp 
 
```Java
return solve(f, min, max)
```

Execution Time: 0:01 (hh:mm)


--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 1

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 2 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 1

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 3 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 2

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 4 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 3

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 5 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 3

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 6 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 4

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 7 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 4

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 8 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 5

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 5


--- 


## Patch 9 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 6

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2



## Patch 10 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 6

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 11 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 7

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 1



## Patch 12 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 7

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 13 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 8

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 14 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 8

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 15 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 9

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 16 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 9

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 17 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 10

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 18 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 10

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 19 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 11

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 20 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 11

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 21 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 12

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 22 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 13

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 1



## Patch 23 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 13

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 24 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 14

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 25 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 14

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 26 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 15

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 27 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 15

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 28 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 16

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 29 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 16

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 30 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 17

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 31 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 17

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 32 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 18

Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 33 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 19

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 34 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 19

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 35 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 20

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 36 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 20

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 37 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 21

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 2



## Patch 38 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 21

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 6


--- 


## Patch 39 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 22

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 40 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 22

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 41 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 23

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 42 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 23

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 43 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 24

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 1



## Patch 44 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 24

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 45 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 25

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 46 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 25

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 47 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 26

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 48 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 26

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 49 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 27

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 1



## Patch 50 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 27

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 51 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 28

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 52 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 28

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 53 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 29

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 54 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 29

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 55 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Seed: 30

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 56 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Seed: 30

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 4


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 21.32

Average Nb of Failing EvoSuite Tests: 2.09

Average Nb of Test-adequate patches: 1.87

Running jGenProg + MinImpact changes the original patch for 2 of the 30 seeds. The human replaces a method invocation by an overloaded version. The original patch is the same as the human patch. For 2 of the 30 seeds, running jGenProg + MinImpact generates a different patch that just makes the failing test pass, we think they are incorrect.

---
