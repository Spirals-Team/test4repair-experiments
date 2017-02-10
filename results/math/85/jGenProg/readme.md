#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//math/ project math
##Original Patch 

```Java
diff --git a/src/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverUtils.java b/src/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverUtils.java
index e6398f6..bf3e4bf 100644
--- a/src/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverUtils.java
+++ b/src/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverUtils.java
@@ -195,7 +195,7 @@ public class UnivariateRealSolverUtils {
         } while ((fa * fb > 0.0) && (numIterations < maximumIterations) && 
                 ((a > lowerBound) || (b < upperBound)));
    
-        if (fa * fb > 0.0 ) {
+        if (fa * fb >= 0.0 ) {
             throw new ConvergenceException(
                       "number of iterations={0}, maximum iterations={1}, " +
                       "initial={2}, lower bound={3}, upper bound={4}, final a value={5}, " +
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24


--- 
#Seed: 9

## Patch 9 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24


--- 
#Seed: 10

## Patch 10 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25


--- 
#Seed: 11

## Patch 11 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24


--- 
#Seed: 15

## Patch 15 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27


--- 
#Seed: 16

## Patch 16 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26


--- 
#Seed: 17

## Patch 17 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27


--- 
#Seed: 18

## Patch 18 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25


--- 
#Seed: 19

## Patch 19 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26


--- 
#Seed: 23

## Patch 23 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26


--- 
#Seed: 24

## Patch 24 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27


--- 
#Seed: 25

## Patch 25 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27


--- 
#Seed: 26

## Patch 26 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26


--- 
#Seed: 27

## Patch 27 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27


--- 
#Seed: 28

## Patch 28 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25


--- 
#Seed: 29

## Patch 29 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27


--- 
#Seed: 30

## Patch 30 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 27

Average Nb of Failing EvoSuite Tests: 3.4

---