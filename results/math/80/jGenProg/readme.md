#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//math/ project math
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java b/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java
index 9d1b797..3fc328d 100644
--- a/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java
+++ b/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java
@@ -1132,7 +1132,7 @@ public class EigenDecompositionImpl implements EigenDecomposition {
     private boolean flipIfWarranted(final int n, final int step) {
         if (1.5 * work[pingPong] < work[4 * (n - 1) + pingPong]) {
             // flip array
-            int j = 4 * (n - 1);
+            int j = 4 * n - 1;
             for (int i = 0; i < j; i += 4) {
                 for (int k = 0; k < 4; k += step) {
                     final double tmp = work[i + k];
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

tau = 0.25 * (dMin1)

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (realEigenvalues.length) ; ++i) {
	if (((realEigenvalues[i]) == 0) && ((imagEigenvalues[i]) == 0)) {
		return false;
	} 
}

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.linear.EigenDecompositionImpl : 1217

Patch type: InsertBeforeOp

```Java

pingPong = 1 - (pingPong)

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 51


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 44


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

tau = 0.25 * (dMin2)

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 44


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 44


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.linear.EigenDecompositionImpl : 599

Patch type: InsertBeforeOp

```Java

findEigenvalues()

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.linear.EigenDecompositionImpl : 1133

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47


--- 
#Seed: 9

## Patch 9 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (realEigenvalues.length) ; ++i) {
	if (((realEigenvalues[i]) == 0) && ((imagEigenvalues[i]) == 0)) {
		return false;
	} 
}

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 48


--- 
#Seed: 10

## Patch 10 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45


--- 
#Seed: 11

## Patch 11 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 44


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

dN2 = 0

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 41

Nb of Failing EvoSuite Tests: 41


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

pingPong = 1 - (pingPong)

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46


--- 
#Seed: 15

## Patch 15 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.linear.EigenDecompositionImpl : 840

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 48


--- 
#Seed: 16

## Patch 16 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.linear.EigenDecompositionImpl : 840

Patch type: ReplaceOp

```Java

updateSigma(tau)

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46


--- 
#Seed: 17

## Patch 17 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.linear.EigenDecompositionImpl : 840

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49


--- 
#Seed: 18

## Patch 18 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (squaredSecondary.length) ; ++i) {
	final double s = secondary[i];
	squaredSecondary[i] = s * s;
}

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47


--- 
#Seed: 19

## Patch 19 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (squaredSecondary.length) ; ++i) {
	final double s = secondary[i];
	squaredSecondary[i] = s * s;
}

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

cachedVt = null

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.linear.EigenDecompositionImpl : 1133

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 44


--- 
#Seed: 23

## Patch 23 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (squaredSecondary.length) ; ++i) {
	final double s = secondary[i];
	squaredSecondary[i] = s * s;
}

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 24

## Patch 24 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46


--- 
#Seed: 25

## Patch 25 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.linear.EigenDecompositionImpl : 1262

Patch type: InsertAfterOp

```Java

flipIfWarranted(n, 2)

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 55


--- 
#Seed: 26

## Patch 26 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49


--- 
#Seed: 27

## Patch 27 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (realEigenvalues.length) ; ++i) {
	if (((realEigenvalues[i]) == 0) && ((imagEigenvalues[i]) == 0)) {
		return false;
	} 
}

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 51


--- 
#Seed: 28

## Patch 28 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50


--- 
#Seed: 29

## Patch 29 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45


--- 
#Seed: 30

## Patch 30 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 46.5

Average Nb of Failing EvoSuite Tests: 2.5

---