
##Human Patch 

```Java
diff --git a/src/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverUtils.java b/src/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverUtils.java
index e6398f6..bf3e4bf 100644
--- a/src/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverUtils.java
+++ b/src/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverUtils.java
@@ -195,7 +195,7 @@ public class UnivariateRealSolverUtils {
         } while ((fa * fb > 0.0) && (numIterations < maximumIterations) && 
                 ((a > lowerBound) || (b < upperBound)));
    
+        if (fa * fb > 0.0 ) {
-        if (fa * fb >= 0.0 ) {
             throw new ConvergenceException(
                       "number of iterations={0}, maximum iterations={1}, " +
                       "initial={2}, lower bound={3}, upper bound={4}, final a value={5}, " +
```


## Patch Original jGenProg 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils:199

Patch type: RemoveOp 
 
```Java
remove
```

Execution Time: 0:05 (hh:mm)



--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 2 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 1

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 3 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 4 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 1

Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 5 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 1

Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 6 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 2

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 7 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 2

Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 8 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 2

Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 9 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 3

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 10 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 3

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 11 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 3

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 12 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 3

Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 13 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 3

Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 14 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 4



## Patch 15 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 4

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 4



## Patch 16 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 4



## Patch 17 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 4

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 4



## Patch 18 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 4

Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 19 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 20 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 5

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 21 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 5

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 22 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 23 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 5

Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 24 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 25 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 6

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 26 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 27 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 6

Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 28 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 6

Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 29 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 30 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 7

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 31 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 32 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 33 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 8

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 34 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 8

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 35 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 36 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 9

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 37 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 38 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 39 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 9

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 40 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 9

Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 41 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 10

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 42 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 10

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 43 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 10

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 44 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 10

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 45 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 46 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 47 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 11

Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 48 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 12

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 4



## Patch 49 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 12

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 4



## Patch 50 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 12

Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 4



## Patch 51 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 12

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 52 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 13

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 53 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 54 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 55 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 13

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 56 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 13

Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 57 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 58 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 59 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 14

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 60 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 14

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3



## Patch 61 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 14

Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 62 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 63 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 64 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 15

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 65 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 15

Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4



## Patch 66 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 15

Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 67 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 68 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 16

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 69 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 70 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 16

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 71 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 72 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 17

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 73 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 74 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 17

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 75 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 76 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 18

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 77 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 18

Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 78 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 19

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 79 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 19

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 80 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 19

Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 81 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 19

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 82 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 19

Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 83 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 2



## Patch 84 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 20

Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 2



## Patch 85 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 20

Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 2



## Patch 86 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 2



## Patch 87 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 20

Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 88 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 21

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 4



## Patch 89 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 21

Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 4



## Patch 90 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 21

Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 4



## Patch 91 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 21

Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 92 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 22

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 93 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 22

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 94 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 22

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 95 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 22

Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 96 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 22

Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 97 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 98 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 23

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 99 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 100 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 23

Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 101 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 23

Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 102 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 103 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 104 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 24

Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 105 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 24

Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 106 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 25

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 107 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 25

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 108 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 25

Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 109 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 25

Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 110 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 26

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 111 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 26

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 112 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 26

Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 113 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 26

Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3



## Patch 114 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 26

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 115 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 27

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 116 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 27

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 117 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 27

Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 118 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 28

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 119 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 28

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 120 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 28

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3



## Patch 121 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 28

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 122 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 29

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 123 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 29

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 124 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 29

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3



## Patch 125 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}", lowerBound, initial, upperBound);
} 

```


Seed: 29

Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 126 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 199

Patch type: RemoveOp

```Java

remove

```


Seed: 30

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 127 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: RemoveOp

```Java

remove

```


Seed: 30

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 128 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (function == null) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("function is null");
} 

```


Seed: 30

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 129 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: ReplaceOp

```Java

if (maximumIterations <= 0) {
	throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("bad value for maximum iterations number: {0}", maximumIterations);
} 

```


Seed: 30

Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 26.2

Average Nb of Failing EvoSuite Tests: 3.29

Average Nb of Test-adequate patches: 4.3

Running jGenProg + MinImpact changes the original patch for 7 of the 30 seeds. The human patch changes an if condition if (fa * fb >= 0.0 ) by replacing it with if (fa * fb > 0.0 ). The orginal patch and the newly generated patches by running jGenProg + MinImpact seem to be irrevlant to the human change, we think they just make the failing test pass and are incorrect. 

---
