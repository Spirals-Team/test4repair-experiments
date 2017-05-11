
##Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java b/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java
index 3fc328d..2d0d72f 100644
--- a/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java
+++ b/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java
@@ -600,7 +600,6 @@ public class EigenDecompositionImpl implements EigenDecomposition {
         lowerSpectra = Math.min(lowerSpectra, lower);
         final double upper = dCurrent + eCurrent;
         work[upperStart + m - 1] = upper;
+        upperSpectra = Math.max(upperSpectra, upper);
         minPivot = MathUtils.SAFE_MIN * Math.max(1.0, eMax * eMax);
 
     }
@@ -903,8 +902,8 @@ public class EigenDecompositionImpl implements EigenDecomposition {
                     diagMax    = work[4 * i0];
                     offDiagMin = work[4 * i0 + 2];
                     double previousEMin = work[4 * i0 + 3];
+                    for (int i = 4 * i0; i < 4 * n0 - 16; i += 4) {
+                        if ((work[i + 3] <= TOLERANCE_2 * work[i]) ||
-                    for (int i = 4 * i0; i < 4 * n0 - 11; i += 4) {
-                        if ((work[i + 3] <= TOLERANCE_2 * work[i]) &&
                             (work[i + 2] <= TOLERANCE_2 * sigma)) {
                             // insert a split
                             work[i + 2]  = -sigma;
@@ -1541,7 +1540,7 @@ public class EigenDecompositionImpl implements EigenDecomposition {
                 double a2 = (work[np - 8] / b2) * (1 + work[np - 4] / b1);
 
                 // approximate contribution to norm squared from i < nn-2.
+                if (end - start > 3) {
-                if (end - start > 2) {
                     b2 = work[nn - 13] / work[nn - 15];
                     a2 = a2 + b2;
                     for (int i4 = nn - 17; i4 >= 4 * start + 2 + pingPong; i4 -= 4) {
```



## Patch Original jGenProg 

org.apache.commons.math.linear.EigenDecompositionImpl:1480

Patch type: RemoveOp 
 
```Java
remove
```

Execution Time: 0:01 (hh:mm)


--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 0



## Patch 2 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 0



## Patch 3 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 0



## Patch 4 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

gam = dN

```


Seed: 1

Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 0



## Patch 5 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 2:02 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 0



## Patch 6 #  jGenProg+MinImpact 

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


Seed: 1

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 5


--- 


## Patch 7 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if (b2 == 0.0) {
	break;
} 

```


Seed: 2

Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 8 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if ((work[(nn - 9)]) > (work[(nn - 11)])) {
	return ;
} 

```


Seed: 2

Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 9 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: ReplaceOp

```Java

if ((dMin1) == (dN1)) {
	tau = 0.5 * (dMin1);
} 

```


Seed: 2

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 1



## Patch 10 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

tType = 0

```


Seed: 2

Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 1



## Patch 11 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: RemoveOp

```Java

remove

```


Seed: 2

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 1



## Patch 12 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Seed: 2

Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 1



## Patch 13 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

g = 0.25

```


Seed: 2

Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 1



## Patch 14 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: ReplaceOp

```Java

tType = -8

```


Seed: 2

Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 15 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1043

Patch type: InsertBeforeOp

```Java

dMin = dN

```


Seed: 3

Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 1



## Patch 16 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

tau = 0.25 * (dMin2)

```


Seed: 3

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 2



## Patch 17 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: ReplaceOp

```Java

cachedD = null

```


Seed: 3

Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 2



## Patch 18 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Seed: 3

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 2



## Patch 19 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

imagEigenvalues = new double[main.length]

```


Seed: 3

Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 2



## Patch 20 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

dMin = java.lang.Math.min(dMin, dN)

```


Seed: 3

Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 2



## Patch 21 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

dMin2 = 0

```


Seed: 3

Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 2



## Patch 22 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

b2 = (work[(nn - 9)]) / (work[(nn - 11)])

```


Seed: 3

Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 23 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

tType = -3

```


Seed: 4

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 1



## Patch 24 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 1



## Patch 25 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 1



## Patch 26 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1536

Patch type: InsertAfterOp

```Java

b2 = (work[(nn - 5)]) / (work[(nn - 7)])

```


Seed: 4

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 1



## Patch 27 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 2



## Patch 28 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 2



## Patch 29 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

tType = -6

```


Seed: 4

Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 2



## Patch 30 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 828

Patch type: InsertBeforeOp

```Java

initialSplits(n)

```


Seed: 4

Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 7


--- 


## Patch 31 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1526

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 2



## Patch 32 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

s = (gam * (1 - (java.lang.Math.sqrt(a2)))) / (1 + a2)

```


Seed: 5

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 2



## Patch 33 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 4



## Patch 34 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: ReplaceOp

```Java

if (((100 * (java.lang.Math.max(b2, b1))) < a2) || (cnst1 < a2)) {
	break;
} 

```


Seed: 5

Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 4



## Patch 35 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

sigmaLow = 0

```


Seed: 5

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 5



## Patch 36 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

tau = (gam * (1 - (java.lang.Math.sqrt(a2)))) / (1 + a2)

```


Seed: 5

Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 5


--- 


## Patch 37 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 38 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

dN1 = 0

```


Seed: 7

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 39 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 40 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: ReplaceOp

```Java

if ((100 * b1) < b2) {
	break;
} 

```


Seed: 7

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1



## Patch 41 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1



## Patch 42 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if (((work[(np - 8)]) > b2) || ((work[(np - 4)]) > b1)) {
	return ;
} 

```


Seed: 7

Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1



## Patch 43 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1003

Patch type: InsertAfterOp

```Java

dN2 = 0

```


Seed: 7

Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1



## Patch 44 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1



## Patch 45 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

tau = java.lang.Math.max(s, (0.333 * (dMin)))

```


Seed: 7

Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 46 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

lowerSpectra = java.lang.Double.POSITIVE_INFINITY

```


Seed: 8

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 47 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

org.apache.commons.math.linear.EigenDecompositionImpl.this.main = main.clone()

```


Seed: 8

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 48 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 49 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 50 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 51 #  jGenProg+MinImpact 

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


Seed: 8

Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 52 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 53 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 54 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1526

Patch type: ReplaceOp

```Java

if ((dMin1) == (dN1)) {
	tau = 0.5 * (dMin1);
} 

```


Seed: 9

Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 7



## Patch 55 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

cachedVt = null

```


Seed: 9

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 7



## Patch 56 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 7



## Patch 57 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

dMin2 = dMin

```


Seed: 9

Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 9



## Patch 58 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: InsertAfterOp

```Java

s = java.lang.Math.min(s, (a2 - (b1 + b2)))

```


Seed: 9

Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 12


--- 


## Patch 59 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if (((work[(np - 8)]) > b2) || ((work[(np - 4)]) > b1)) {
	return ;
} 

```


Seed: 10

Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 1



## Patch 60 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

squaredSecondary = new double[secondary.length]

```


Seed: 10

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 3



## Patch 61 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

dMin = dN1

```


Seed: 10

Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 3



## Patch 62 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

b2 = b2 + b1

```


Seed: 10

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 3



## Patch 63 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Seed: 10

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 4



## Patch 64 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: ReplaceOp

```Java

dMin = 0.0

```


Seed: 10

Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 65 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 5



## Patch 66 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

dMin2 = dMin

```


Seed: 11

Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 7



## Patch 67 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1052

Patch type: InsertBeforeOp

```Java

work[(((4 * deflatedEnd) - 3) - (pingPong))] = 0.0

```


Seed: 11

Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 9


--- 


## Patch 68 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

tau = java.lang.Math.max(s, (a2 * (1 - (cnst2 * b2))))

```


Seed: 12

Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1



## Patch 69 #  jGenProg+MinImpact 

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


Seed: 12

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 2



## Patch 70 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

b2 = (work[(nn - 5)]) / (work[(nn - 7)])

```


Seed: 12

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 2



## Patch 71 #  jGenProg+MinImpact 

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


Seed: 12

Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 2



## Patch 72 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if ((dN) > b1) {
	s = (dN) - b1;
} 

```


Seed: 12

Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 2



## Patch 73 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if (b2 == 0.0) {
	break;
} 

```


Seed: 12

Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 2



## Patch 74 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Seed: 12

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 3



## Patch 75 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: ReplaceOp

```Java

org.apache.commons.math.linear.EigenDecompositionImpl.this.main = main.clone()

```


Seed: 12

Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 3



## Patch 76 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1526

Patch type: RemoveOp

```Java

remove

```


Seed: 12

Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 77 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

eMin = 0.0

```


Seed: 13

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 78 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

tType = -5

```


Seed: 13

Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 79 #  jGenProg+MinImpact 

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


Seed: 13

Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 80 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 81 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1438

Patch type: InsertBeforeOp

```Java

dMin = dN

```


Seed: 13

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 1



## Patch 82 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1526

Patch type: ReplaceOp

```Java

if ((work[(nn - 5)]) > (work[(nn - 7)])) {
	return ;
} 

```


Seed: 13

Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 1



## Patch 83 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1485

Patch type: InsertBeforeOp

```Java

b2 = (work[(nn - 9)]) / (work[(nn - 11)])

```


Seed: 13

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 3



## Patch 84 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

np = nn - 9

```


Seed: 13

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 3



## Patch 85 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

tType = -2

```


Seed: 13

Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 3



## Patch 86 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: ReplaceOp

```Java

if ((dMin1) == (dN1)) {
	tau = 0.5 * (dMin1);
} 

```


Seed: 13

Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 4



## Patch 87 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: ReplaceOp

```Java

tType = -2

```


Seed: 13

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 4



## Patch 88 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 89 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

tau = -(dMin)

```


Seed: 14

Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 4



## Patch 90 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 4



## Patch 91 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

g = 0.25 * 0.333

```


Seed: 14

Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 4



## Patch 92 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 828

Patch type: InsertAfterOp

```Java

initialSplits(n)

```


Seed: 14

Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 4



## Patch 93 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

org.apache.commons.math.linear.EigenDecompositionImpl.this.secondary = secondary.clone()

```


Seed: 14

Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 4



## Patch 94 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 95 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 96 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if ((dMin) <= 0.0) {
	tau = -(dMin);
	tType = -1;
	return ;
} 

```


Seed: 15

Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 97 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

b2 = (work[(nn - 5)]) / (work[(nn - 7)])

```


Seed: 15

Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 98 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 99 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

eigenvectors = null

```


Seed: 16

Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 5



## Patch 100 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1526

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 7



## Patch 101 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if (b2 == 0.0) {
	break;
} 

```


Seed: 16

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 7



## Patch 102 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: ReplaceOp

```Java

if (a2 > (b1 + b2)) {
	s = java.lang.Math.min(s, (a2 - (b1 + b2)));
} 

```


Seed: 16

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 10



## Patch 103 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 11


--- 


## Patch 104 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1



## Patch 105 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1



## Patch 106 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1003

Patch type: InsertBeforeOp

```Java

dMin = dN

```


Seed: 17

Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 107 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1311

Patch type: InsertBeforeOp

```Java

dN2 = 0

```


Seed: 18

Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 108 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 1



## Patch 109 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 110 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if ((tType) == (-18)) {
	g = 0.25 * 0.333;
} else {
	g = 0.25;
}

```


Seed: 19

Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 111 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Seed: 19

Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 112 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

b1 = b2

```


Seed: 19

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 113 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1526

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 5



## Patch 114 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if ((cachedD) == null) {
	cachedD = org.apache.commons.math.linear.MatrixUtils.createRealDiagonalMatrix(realEigenvalues);
} 

```


Seed: 20

Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 5



## Patch 115 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 5



## Patch 116 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 7



## Patch 117 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: ReplaceOp

```Java

dMin2 = dMin

```


Seed: 20

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 8


--- 


## Patch 118 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Seed: 21

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 1



## Patch 119 #  jGenProg+MinImpact 

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


Seed: 21

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 1



## Patch 120 #  jGenProg+MinImpact 

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


Seed: 21

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 1



## Patch 121 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: RemoveOp

```Java

remove

```


Seed: 21

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 2



## Patch 122 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

org.apache.commons.math.linear.EigenDecompositionImpl.this.main = main.clone()

```


Seed: 21

Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 2



## Patch 123 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Seed: 21

Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 124 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

tau = java.lang.Math.max(s, (0.333 * (dMin)))

```


Seed: 22

Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 2



## Patch 125 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Seed: 22

Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 2



## Patch 126 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Seed: 22

Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 3



## Patch 127 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: RemoveOp

```Java

remove

```


Seed: 22

Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 3



## Patch 128 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Seed: 22

Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 129 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

tType = -8

```


Seed: 23

Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 1



## Patch 130 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 2



## Patch 131 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 132 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 133 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

org.apache.commons.math.linear.EigenDecompositionImpl.this.splitTolerance = splitTolerance

```


Seed: 24

Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 134 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: ReplaceOp

```Java

if (((work[(np - 8)]) > b2) || ((work[(np - 4)]) > b1)) {
	return ;
} 

```


Seed: 24

Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 135 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

cachedD = org.apache.commons.math.linear.MatrixUtils.createRealDiagonalMatrix(realEigenvalues)

```


Seed: 24

Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 136 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: ReplaceOp

```Java

cachedVt = null

```


Seed: 24

Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 137 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

tType = -9

```


Seed: 25

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 3



## Patch 138 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1313

Patch type: InsertAfterOp

```Java

dMin = dN1

```


Seed: 25

Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 3



## Patch 139 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1682

Patch type: InsertAfterOp

```Java

dMin = dN

```


Seed: 25

Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 4



## Patch 140 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: ReplaceOp

```Java

if ((work[(nn - 9)]) > (work[(nn - 11)])) {
	return ;
} 

```


Seed: 25

Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 141 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Seed: 26

Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 2



## Patch 142 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

a2 = cnst3 * a2

```


Seed: 26

Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 2



## Patch 143 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: RemoveOp

```Java

remove

```


Seed: 26

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 4



## Patch 144 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: ReplaceOp

```Java

tType = -4

```


Seed: 26

Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 4



## Patch 145 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

tau = ((tau) + (dMin)) * (1.0 - (2.0 * (org.apache.commons.math.util.MathUtils.EPSILON)))

```


Seed: 26

Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 4



## Patch 146 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

lowerSpectra = java.lang.Double.POSITIVE_INFINITY

```


Seed: 26

Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 147 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Seed: 27

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 148 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1526

Patch type: RemoveOp

```Java

remove

```


Seed: 27

Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 149 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

dMin = -0.0

```


Seed: 27

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 150 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

imagEigenvalues = new double[main.length]

```


Seed: 27

Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 2



## Patch 151 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Seed: 27

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 152 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

b2 = java.lang.Math.sqrt((cnst3 * b2))

```


Seed: 28

Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 0



## Patch 153 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

upperSpectra = java.lang.Double.NEGATIVE_INFINITY

```


Seed: 28

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 4



## Patch 154 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: RemoveOp

```Java

remove

```


Seed: 28

Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 4



## Patch 155 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1480

Patch type: ReplaceOp

```Java

cachedD = org.apache.commons.math.linear.MatrixUtils.createRealDiagonalMatrix(realEigenvalues)

```


Seed: 28

Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 4



## Patch 156 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

np = nn - 13

```


Seed: 28

Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 5



## Patch 157 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: InsertAfterOp

```Java

if (a2 > (b1 + b2)) {
	s = java.lang.Math.min(s, (a2 - (b1 + b2)));
} 

```


Seed: 28

Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 5



## Patch 158 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: RemoveOp

```Java

remove

```


Seed: 28

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 6


--- 


## Patch 159 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

org.apache.commons.math.linear.EigenDecompositionImpl.this.splitTolerance = splitTolerance

```


Seed: 29

Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 3



## Patch 160 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

tau = (gam * (1 - (java.lang.Math.sqrt(a2)))) / (1 + a2)

```


Seed: 29

Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 3



## Patch 161 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

dN = 0

```


Seed: 29

Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 3



## Patch 162 #  jGenProg+MinImpact 

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


Seed: 29

Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 3



## Patch 163 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Seed: 29

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 6



## Patch 164 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1689

Patch type: InsertAfterOp

```Java

dMin = 0.0

```


Seed: 29

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 6


--- 


## Patch 165 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: RemoveOp

```Java

remove

```


Seed: 30

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 0



## Patch 166 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: ReplaceOp

```Java

b2 = java.lang.Math.sqrt((cnst3 * b2))

```


Seed: 30

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 0



## Patch 167 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 898

Patch type: InsertBeforeOp

```Java

dMin = dN

```


Seed: 30

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 0



## Patch 168 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1520

Patch type: RemoveOp

```Java

remove

```


Seed: 30

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 0



## Patch 169 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1543

Patch type: RemoveOp

```Java

remove

```


Seed: 30

Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 0



## Patch 170 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1438

Patch type: InsertBeforeOp

```Java

dMin = dN

```


Seed: 30

Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 0



## Patch 171 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: RemoveOp

```Java

remove

```


Seed: 30

Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 0



## Patch 172 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: RemoveOp

```Java

remove

```


Seed: 30

Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 0



## Patch 173 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1484

Patch type: ReplaceOp

```Java

imagEigenvalues = new double[main.length]

```


Seed: 30

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 0



## Patch 174 #  jGenProg+MinImpact 

org.apache.commons.math.linear.EigenDecompositionImpl : 1521

Patch type: ReplaceOp

```Java

dMin = dN

```


Seed: 30

Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 0


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 44.94

Average Nb of Failing EvoSuite Tests: 2.45

Average Nb of Test-adequate patches: 5.8

Running jGenProg + MinImpact changes the original patch for 29 of the 30 seeds. The human patch involves multiple changes to the code, such as changes to if condition and for loop, the original patch and the newly generated patches by running jGenProg + MinImpact seem to be irrevelant to the human change, we think they just make the failing test pass and are thus incorrect.

---
