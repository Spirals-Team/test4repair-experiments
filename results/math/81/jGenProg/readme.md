#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//math/ project math
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java b/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java
index 3fc328d..2d0d72f 100644
--- a/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java
+++ b/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java
@@ -600,7 +600,6 @@ public class EigenDecompositionImpl implements EigenDecomposition {
         lowerSpectra = Math.min(lowerSpectra, lower);
         final double upper = dCurrent + eCurrent;
         work[upperStart + m - 1] = upper;
-        upperSpectra = Math.max(upperSpectra, upper);
         minPivot = MathUtils.SAFE_MIN * Math.max(1.0, eMax * eMax);
 
     }
@@ -903,8 +902,8 @@ public class EigenDecompositionImpl implements EigenDecomposition {
                     diagMax    = work[4 * i0];
                     offDiagMin = work[4 * i0 + 2];
                     double previousEMin = work[4 * i0 + 3];
-                    for (int i = 4 * i0; i < 4 * n0 - 16; i += 4) {
-                        if ((work[i + 3] <= TOLERANCE_2 * work[i]) ||
+                    for (int i = 4 * i0; i < 4 * n0 - 11; i += 4) {
+                        if ((work[i + 3] <= TOLERANCE_2 * work[i]) &&
                             (work[i + 2] <= TOLERANCE_2 * sigma)) {
                             // insert a split
                             work[i + 2]  = -sigma;
@@ -1541,7 +1540,7 @@ public class EigenDecompositionImpl implements EigenDecomposition {
                 double a2 = (work[np - 8] / b2) * (1 + work[np - 4] / b1);
 
                 // approximate contribution to norm squared from i < nn-2.
-                if (end - start > 3) {
+                if (end - start > 2) {
                     b2 = work[nn - 13] / work[nn - 15];
                     a2 = a2 + b2;
                     for (int i4 = nn - 17; i4 >= 4 * start + 2 + pingPong; i4 -= 4) {
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if (b2 == 0.0) {
	break;
} 

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 51


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.linear.EigenDecompositionImpl : 1043

Patch type: InsertBeforeOp

```Java

dMin = dN

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

tType = -3

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.linear.EigenDecompositionImpl : 1526

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 44


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

dN1 = 0

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

lowerSpectra = java.lang.Double.POSITIVE_INFINITY

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30


--- 
#Seed: 9

## Patch 9 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.linear.EigenDecompositionImpl : 1526

Patch type: ReplaceOp

```Java

if ((dMin1) == (dN1)) {
	tau = 0.5 * (dMin1);
} 

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46


--- 
#Seed: 10

## Patch 10 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if (((work[(np - 8)]) > b2) || ((work[(np - 4)]) > b1)) {
	return ;
} 

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50


--- 
#Seed: 11

## Patch 11 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

tau = java.lang.Math.max(s, (a2 * (1 - (cnst2 * b2))))

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

eMin = 0.0

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

tau = -(dMin)

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49


--- 
#Seed: 15

## Patch 15 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 16

## Patch 16 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

eigenvectors = null

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47


--- 
#Seed: 17

## Patch 17 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46


--- 
#Seed: 18

## Patch 18 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.linear.EigenDecompositionImpl : 1311

Patch type: InsertBeforeOp

```Java

dN2 = 0

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 44


--- 
#Seed: 19

## Patch 19 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if ((tType) == (-18)) {
	g = 0.25 * 0.333;
} else {
	g = 0.25;
}

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.linear.EigenDecompositionImpl : 1526

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

tau = java.lang.Math.max(s, (0.333 * (dMin)))

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49


--- 
#Seed: 23

## Patch 23 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

tType = -8

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 51


--- 
#Seed: 24

## Patch 24 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46


--- 
#Seed: 25

## Patch 25 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

tType = -9

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47


--- 
#Seed: 26

## Patch 26 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45


--- 
#Seed: 27

## Patch 27 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 28

## Patch 28 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

b2 = java.lang.Math.sqrt((cnst3 * b2))

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50


--- 
#Seed: 29

## Patch 29 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

org.apache.commons.math.linear.EigenDecompositionImpl.this.splitTolerance = splitTolerance

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47


--- 
#Seed: 30

## Patch 30 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 46.21

Average Nb of Failing EvoSuite Tests: 1.96

---