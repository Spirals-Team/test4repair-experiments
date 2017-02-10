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



## Patch 2 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49



## Patch 3 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49



## Patch 4 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

gam = dN

```


Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49



## Patch 5 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Execution Time: 2:02 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49



## Patch 6 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.linear.EigenDecompositionImpl : 1526

Patch type: ReplaceOp

```Java

if ((tType) < (-22)) {
	tau = 0.0;
} else {
	if ((dMin1) > 0.0) {
		tau = ((tau) + (dMin)) * (1.0 - (2.0 * (org.apache.commons.math.util.MathUtils.EPSILON)));
		tType -= 11;
	} else {
		tau *= 0.25;
		tType -= 12;
	}
}

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49


--- 
#Seed: 2

## Patch 7 #  jGenProg+MinImpact With Seed 2

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



## Patch 8 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if ((work[(nn - 9)]) > (work[(nn - 11)])) {
	return ;
} 

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 51



## Patch 9 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: ReplaceOp

```Java

if ((dMin1) == (dN1)) {
	tau = 0.5 * (dMin1);
} 

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 51



## Patch 10 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

tType = 0

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 51



## Patch 11 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 51



## Patch 12 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 51



## Patch 13 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

g = 0.25

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 51



## Patch 14 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: ReplaceOp

```Java

tType = -8

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 51


--- 
#Seed: 3

## Patch 15 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.linear.EigenDecompositionImpl : 1043

Patch type: InsertBeforeOp

```Java

dMin = dN

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42



## Patch 16 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

tau = 0.25 * (dMin2)

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42



## Patch 17 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: ReplaceOp

```Java

cachedD = null

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42



## Patch 18 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42



## Patch 19 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

imagEigenvalues = new double[main.length]

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42



## Patch 20 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

dMin = java.lang.Math.min(dMin, dN)

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42



## Patch 21 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

dMin2 = 0

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42



## Patch 22 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

b2 = (work[(nn - 9)]) / (work[(nn - 11)])

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42


--- 
#Seed: 4

## Patch 23 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

tType = -3

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45



## Patch 24 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45



## Patch 25 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45



## Patch 26 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.linear.EigenDecompositionImpl : 1536

Patch type: InsertAfterOp

```Java

b2 = (work[(nn - 5)]) / (work[(nn - 7)])

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45



## Patch 27 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45



## Patch 28 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45



## Patch 29 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

tType = -6

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45



## Patch 30 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.linear.EigenDecompositionImpl : 828

Patch type: InsertBeforeOp

```Java

initialSplits(n)

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45


--- 
#Seed: 5

## Patch 31 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.linear.EigenDecompositionImpl : 1526

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43



## Patch 32 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

s = (gam * (1 - (java.lang.Math.sqrt(a2)))) / (1 + a2)

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43



## Patch 33 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43



## Patch 34 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: ReplaceOp

```Java

if (((100 * (java.lang.Math.max(b2, b1))) < a2) || (cnst1 < a2)) {
	break;
} 

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43



## Patch 35 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

sigmaLow = 0

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43



## Patch 36 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

tau = (gam * (1 - (java.lang.Math.sqrt(a2)))) / (1 + a2)

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 6

## Patch 37 #  jGenProg+MinImpact With Seed 6

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

## Patch 38 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

dN1 = 0

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 39 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 40 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: ReplaceOp

```Java

if ((100 * b1) < b2) {
	break;
} 

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 41 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 42 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if (((work[(np - 8)]) > b2) || ((work[(np - 4)]) > b1)) {
	return ;
} 

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 43 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.linear.EigenDecompositionImpl : 1003

Patch type: InsertAfterOp

```Java

dN2 = 0

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 44 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 45 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

tau = java.lang.Math.max(s, (0.333 * (dMin)))

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46


--- 
#Seed: 8

## Patch 46 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

lowerSpectra = java.lang.Double.POSITIVE_INFINITY

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 47 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

org.apache.commons.math.linear.EigenDecompositionImpl.this.main = main.clone()

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 48 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 49 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 50 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 51 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.linear.EigenDecompositionImpl : 1540

Patch type: InsertBeforeOp

```Java

if (b2 != 0.0) {
	for (int i4 = ((4 * end) - 9) + (pingPong) ; i4 >= (((4 * start) + 2) + (pingPong)) ; i4 -= 4) {
		if ((work[i4]) > (work[(i4 - 2)])) {
			return ;
		} 
		b1 *= (work[i4]) / (work[(i4 - 2)]);
		b2 += b1;
		if ((100 * b1) < b2) {
			break;
		} 
	}
} 

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 52 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 53 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: RemoveOp

```Java

remove

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30


--- 
#Seed: 9

## Patch 54 #  jGenProg+MinImpact With Seed 9

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



## Patch 55 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

cachedVt = null

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 56 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 57 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

dMin2 = dMin

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 58 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: InsertAfterOp

```Java

s = java.lang.Math.min(s, (a2 - (b1 + b2)))

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46


--- 
#Seed: 10

## Patch 59 #  jGenProg+MinImpact With Seed 10

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



## Patch 60 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

squaredSecondary = new double[secondary.length]

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50



## Patch 61 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

dMin = dN1

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50



## Patch 62 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

b2 = b2 + b1

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50



## Patch 63 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50



## Patch 64 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: ReplaceOp

```Java

dMin = 0.0

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50


--- 
#Seed: 11

## Patch 65 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43



## Patch 66 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

dMin2 = dMin

```


Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43



## Patch 67 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.linear.EigenDecompositionImpl : 1052

Patch type: InsertBeforeOp

```Java

work[(((4 * deflatedEnd) - 3) - (pingPong))] = 0.0

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 12

## Patch 68 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

tau = java.lang.Math.max(s, (a2 * (1 - (cnst2 * b2))))

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 69 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if (b2 != 0.0) {
	for (int i4 = ((4 * end) - 10) + (pingPong) ; i4 >= (((4 * start) + 2) + (pingPong)) ; i4 -= 4) {
		final double oldB1 = b1;
		if ((work[i4]) > (work[(i4 - 2)])) {
			return ;
		} 
		b1 = b1 * ((work[i4]) / (work[(i4 - 2)]));
		b2 = b2 + b1;
		if ((100 * (java.lang.Math.max(b1, oldB1))) < b2) {
			break;
		} 
	}
} 

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 70 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

b2 = (work[(nn - 5)]) / (work[(nn - 7)])

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 71 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.linear.EigenDecompositionImpl : 1536

Patch type: InsertBeforeOp

```Java

if (b2 != 0.0) {
	for (int i4 = ((4 * end) - 9) + (pingPong) ; i4 >= (((4 * start) + 2) + (pingPong)) ; i4 -= 4) {
		if ((work[i4]) > (work[(i4 - 2)])) {
			return ;
		} 
		b1 *= (work[i4]) / (work[(i4 - 2)]);
		b2 += b1;
		if ((100 * b1) < b2) {
			break;
		} 
	}
} 

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 72 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if ((dN) > b1) {
	s = (dN) - b1;
} 

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 73 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if (b2 == 0.0) {
	break;
} 

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 74 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 75 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: ReplaceOp

```Java

org.apache.commons.math.linear.EigenDecompositionImpl.this.main = main.clone()

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 76 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.linear.EigenDecompositionImpl : 1526

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46


--- 
#Seed: 13

## Patch 77 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

eMin = 0.0

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42



## Patch 78 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

tType = -5

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42



## Patch 79 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if ((dMin1) > 0.0) {
	tau = ((tau) + (dMin)) * (1.0 - (2.0 * (org.apache.commons.math.util.MathUtils.EPSILON)));
	tType -= 11;
} else {
	tau *= 0.25;
	tType -= 12;
}

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42



## Patch 80 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42



## Patch 81 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.linear.EigenDecompositionImpl : 1438

Patch type: InsertBeforeOp

```Java

dMin = dN

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42



## Patch 82 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.linear.EigenDecompositionImpl : 1526

Patch type: ReplaceOp

```Java

if ((work[(nn - 5)]) > (work[(nn - 7)])) {
	return ;
} 

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42



## Patch 83 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.linear.EigenDecompositionImpl : 1485

Patch type: InsertBeforeOp

```Java

b2 = (work[(nn - 9)]) / (work[(nn - 11)])

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42



## Patch 84 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

np = nn - 9

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42



## Patch 85 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

tType = -2

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42



## Patch 86 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: ReplaceOp

```Java

if ((dMin1) == (dN1)) {
	tau = 0.5 * (dMin1);
} 

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42



## Patch 87 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: ReplaceOp

```Java

tType = -2

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42



## Patch 88 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42


--- 
#Seed: 14

## Patch 89 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

tau = -(dMin)

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49



## Patch 90 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49



## Patch 91 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

g = 0.25 * 0.333

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49



## Patch 92 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.linear.EigenDecompositionImpl : 828

Patch type: InsertAfterOp

```Java

initialSplits(n)

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49



## Patch 93 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

org.apache.commons.math.linear.EigenDecompositionImpl.this.secondary = secondary.clone()

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49



## Patch 94 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49


--- 
#Seed: 15

## Patch 95 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43



## Patch 96 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if ((dMin) <= 0.0) {
	tau = -(dMin);
	tType = -1;
	return ;
} 

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43



## Patch 97 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

b2 = (work[(nn - 5)]) / (work[(nn - 7)])

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43



## Patch 98 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 16

## Patch 99 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

eigenvectors = null

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47



## Patch 100 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.linear.EigenDecompositionImpl : 1526

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47



## Patch 101 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if (b2 == 0.0) {
	break;
} 

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47



## Patch 102 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: ReplaceOp

```Java

if (a2 > (b1 + b2)) {
	s = java.lang.Math.min(s, (a2 - (b1 + b2)));
} 

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47



## Patch 103 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47


--- 
#Seed: 17

## Patch 104 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 105 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 106 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.linear.EigenDecompositionImpl : 1003

Patch type: InsertBeforeOp

```Java

dMin = dN

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46


--- 
#Seed: 18

## Patch 107 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.linear.EigenDecompositionImpl : 1311

Patch type: InsertBeforeOp

```Java

dN2 = 0

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 44



## Patch 108 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 44



## Patch 109 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 44


--- 
#Seed: 19

## Patch 110 #  jGenProg+MinImpact With Seed 19

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



## Patch 111 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47



## Patch 112 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

b1 = b2

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47


--- 
#Seed: 20

## Patch 113 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.linear.EigenDecompositionImpl : 1526

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50



## Patch 114 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if ((cachedD) == null) {
	cachedD = org.apache.commons.math.linear.MatrixUtils.createRealDiagonalMatrix(realEigenvalues);
} 

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50



## Patch 115 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50



## Patch 116 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50



## Patch 117 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: ReplaceOp

```Java

dMin2 = dMin

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50


--- 
#Seed: 21

## Patch 118 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45



## Patch 119 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if ((dMin1) > 0.0) {
	tau = ((tau) + (dMin)) * (1.0 - (2.0 * (org.apache.commons.math.util.MathUtils.EPSILON)));
	tType -= 11;
} else {
	tau *= 0.25;
	tType -= 12;
}

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45



## Patch 120 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.linear.EigenDecompositionImpl : 1540

Patch type: InsertAfterOp

```Java

for (int i4 = ((4 * end) - 9) + (pingPong) ; i4 >= (((4 * start) + 2) + (pingPong)) ; i4 -= 4) {
	if ((work[i4]) > (work[(i4 - 2)])) {
		return ;
	} 
	b1 *= (work[i4]) / (work[(i4 - 2)]);
	b2 += b1;
	if ((100 * b1) < b2) {
		break;
	} 
}

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45



## Patch 121 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45



## Patch 122 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

org.apache.commons.math.linear.EigenDecompositionImpl.this.main = main.clone()

```


Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45



## Patch 123 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45


--- 
#Seed: 22

## Patch 124 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

tau = java.lang.Math.max(s, (0.333 * (dMin)))

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49



## Patch 125 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49



## Patch 126 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49



## Patch 127 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49



## Patch 128 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 49


--- 
#Seed: 23

## Patch 129 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

tType = -8

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 51



## Patch 130 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 51



## Patch 131 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 51


--- 
#Seed: 24

## Patch 132 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 133 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

org.apache.commons.math.linear.EigenDecompositionImpl.this.splitTolerance = splitTolerance

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 134 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if (((work[(np - 8)]) > b2) || ((work[(np - 4)]) > b1)) {
	return ;
} 

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 135 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

cachedD = org.apache.commons.math.linear.MatrixUtils.createRealDiagonalMatrix(realEigenvalues)

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46



## Patch 136 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: ReplaceOp

```Java

cachedVt = null

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46


--- 
#Seed: 25

## Patch 137 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

tType = -9

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47



## Patch 138 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.linear.EigenDecompositionImpl : 1313

Patch type: InsertAfterOp

```Java

dMin = dN1

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47



## Patch 139 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.linear.EigenDecompositionImpl : 1682

Patch type: InsertAfterOp

```Java

dMin = dN

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47



## Patch 140 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: ReplaceOp

```Java

if ((work[(nn - 9)]) > (work[(nn - 11)])) {
	return ;
} 

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47


--- 
#Seed: 26

## Patch 141 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45



## Patch 142 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

a2 = cnst3 * a2

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45



## Patch 143 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45



## Patch 144 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: ReplaceOp

```Java

tType = -4

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45



## Patch 145 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

tau = ((tau) + (dMin)) * (1.0 - (2.0 * (org.apache.commons.math.util.MathUtils.EPSILON)))

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45



## Patch 146 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

lowerSpectra = java.lang.Double.POSITIVE_INFINITY

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45


--- 
#Seed: 27

## Patch 147 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43



## Patch 148 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.linear.EigenDecompositionImpl : 1526

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43



## Patch 149 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

dMin = -0.0

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43



## Patch 150 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

imagEigenvalues = new double[main.length]

```


Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43



## Patch 151 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 28

## Patch 152 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

b2 = java.lang.Math.sqrt((cnst3 * b2))

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50



## Patch 153 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

upperSpectra = java.lang.Double.NEGATIVE_INFINITY

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50



## Patch 154 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50



## Patch 155 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

cachedD = org.apache.commons.math.linear.MatrixUtils.createRealDiagonalMatrix(realEigenvalues)

```


Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50



## Patch 156 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

np = nn - 13

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50



## Patch 157 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: InsertAfterOp

```Java

if (a2 > (b1 + b2)) {
	s = java.lang.Math.min(s, (a2 - (b1 + b2)));
} 

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50



## Patch 158 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 50


--- 
#Seed: 29

## Patch 159 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

org.apache.commons.math.linear.EigenDecompositionImpl.this.splitTolerance = splitTolerance

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47



## Patch 160 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

tau = (gam * (1 - (java.lang.Math.sqrt(a2)))) / (1 + a2)

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47



## Patch 161 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

dN = 0

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47



## Patch 162 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if ((dMin1) > 0.0) {
	tau = ((tau) + (dMin)) * (1.0 - (2.0 * (org.apache.commons.math.util.MathUtils.EPSILON)));
	tType -= 11;
} else {
	tau *= 0.25;
	tType -= 12;
}

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47



## Patch 163 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47



## Patch 164 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.linear.EigenDecompositionImpl : 1689

Patch type: InsertAfterOp

```Java

dMin = 0.0

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47


--- 
#Seed: 30

## Patch 165 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 166 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

b2 = java.lang.Math.sqrt((cnst3 * b2))

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 167 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.linear.EigenDecompositionImpl : 898

Patch type: InsertBeforeOp

```Java

dMin = dN

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 168 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 169 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 170 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.linear.EigenDecompositionImpl : 1438

Patch type: InsertBeforeOp

```Java

dMin = dN

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 171 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 172 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 173 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

imagEigenvalues = new double[main.length]

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37



## Patch 174 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: ReplaceOp

```Java

dMin = dN

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 45.99

Average Nb of Failing EvoSuite Tests: 3.09

---