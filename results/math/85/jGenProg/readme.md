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


## Patch Original jGenProg 

[org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils:199](https://github.com/apache/commons-math/blob/26281773d85fa96594c16aee56e36805f3254064/src/java//org/apache/commons/math/analysis/solvers/UnivariateRealSolverUtils.java#L199) (Suspicious rank: ample 4, jaccard 4, ochiai 1, naish1 15706, gp13 4, naish2 4, tarantula 4, )

Patch type: DELETE 
 
```Java
remove
```

Execution time: 0:05:17.263000

Grid5000 node: graphene-70.nancy.grid5000.fr


--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 2 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 3 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 4 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 5 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 2

## Patch 6 #  jGenProg+MinImpact With Seed 2

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 7 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 8 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 3

## Patch 9 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 10 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 11 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 12 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 13 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 4

## Patch 14 #  jGenProg+MinImpact With Seed 4

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 4



## Patch 15 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 4



## Patch 16 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 4



## Patch 17 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 4



## Patch 18 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 5

## Patch 19 #  jGenProg+MinImpact With Seed 5

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 20 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 21 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 22 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 23 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 6

## Patch 24 #  jGenProg+MinImpact With Seed 6

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 25 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 26 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 27 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 28 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 7

## Patch 29 #  jGenProg+MinImpact With Seed 7

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 30 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 31 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 8

## Patch 32 #  jGenProg+MinImpact With Seed 8

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 33 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 34 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 35 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 9

## Patch 36 #  jGenProg+MinImpact With Seed 9

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 37 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 38 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 39 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 40 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 10

## Patch 41 #  jGenProg+MinImpact With Seed 10

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 42 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 43 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 44 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 11

## Patch 45 #  jGenProg+MinImpact With Seed 11

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 46 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 47 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 12

## Patch 48 #  jGenProg+MinImpact With Seed 12

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 4



## Patch 49 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 4



## Patch 50 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 4



## Patch 51 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 13

## Patch 52 #  jGenProg+MinImpact With Seed 13

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 53 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 54 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 55 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 56 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 14

## Patch 57 #  jGenProg+MinImpact With Seed 14

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 58 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 59 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 60 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 61 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 15

## Patch 62 #  jGenProg+MinImpact With Seed 15

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 63 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 64 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 65 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 66 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 16

## Patch 67 #  jGenProg+MinImpact With Seed 16

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 68 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 69 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 70 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 17

## Patch 71 #  jGenProg+MinImpact With Seed 17

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 72 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 73 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 74 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 18

## Patch 75 #  jGenProg+MinImpact With Seed 18

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 76 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 77 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 19

## Patch 78 #  jGenProg+MinImpact With Seed 19

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 79 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 80 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 81 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 82 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 20

## Patch 83 #  jGenProg+MinImpact With Seed 20

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 2



## Patch 84 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 2



## Patch 85 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 2



## Patch 86 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 2



## Patch 87 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 21

## Patch 88 #  jGenProg+MinImpact With Seed 21

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 4



## Patch 89 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 4



## Patch 90 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 4



## Patch 91 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 22

## Patch 92 #  jGenProg+MinImpact With Seed 22

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 93 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 94 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 95 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 96 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 23

## Patch 97 #  jGenProg+MinImpact With Seed 23

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 98 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 99 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 100 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 101 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 24

## Patch 102 #  jGenProg+MinImpact With Seed 24

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 103 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 104 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 105 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 25

## Patch 106 #  jGenProg+MinImpact With Seed 25

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 107 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 108 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 109 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 26

## Patch 110 #  jGenProg+MinImpact With Seed 26

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 111 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 112 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 113 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 114 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 27

## Patch 115 #  jGenProg+MinImpact With Seed 27

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 116 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 117 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 28

## Patch 118 #  jGenProg+MinImpact With Seed 28

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 119 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 120 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 121 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 29

## Patch 122 #  jGenProg+MinImpact With Seed 29

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 123 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 124 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 125 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 30

## Patch 126 #  jGenProg+MinImpact With Seed 30

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 127 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 128 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 129 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 26.2

Average Nb of Failing EvoSuite Tests: 3.29

Average Nb of Test-adequate patches: 4.3

---