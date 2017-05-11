
## Human Patch 

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


## Original Patch # Nopol 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.dN1 < org.apache.commons.math.linear.EigenDecompositionImpl.this.work.length
```

Execution Time: 00:00 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.eMin < 22
```

Seed: 4

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.lowerSpectra <= org.apache.commons.math.linear.EigenDecompositionImpl.this.qMax
```

Seed: 12

Execution Time: 00:34 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Contradiction Tests:3

Nb of Removed Tests:3


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
10 < np
```

Seed: 18

Execution Time: 00:30 (hh:mm)

Nb of EvoSuite Tests:44

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1586

Patch type: CONDITIONAL

```Java
(((dMin1) == (dN1)) && ((dMin2) == (dN2))) || (org.apache.commons.math.linear.EigenDecompositionImpl.this.dMin <= org.apache.commons.math.linear.EigenDecompositionImpl.this.lowerSpectra)
```

Seed: 26

Execution Time: 00:37 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
(np) != (10)
```

Seed: 28

Execution Time: 00:26 (hh:mm)

Nb of EvoSuite Tests:50

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.lowerSpectra <= end
```

Seed: 35

Execution Time: 00:33 (hh:mm)

Nb of EvoSuite Tests:50

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.dN1 < org.apache.commons.math.linear.EigenDecompositionImpl.this.work.length
```

Seed: 41

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
(org.apache.commons.math.linear.EigenDecompositionImpl.this.imagEigenvalues.length) != (5)
```

Seed: 54

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.lowerSpectra < org.apache.commons.math.linear.EigenDecompositionImpl.this.sigmaLow
```

Seed: 60

Execution Time: 00:26 (hh:mm)

Nb of EvoSuite Tests:44

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.dN1 < org.apache.commons.math.linear.EigenDecompositionImpl.this.work.length
```

Seed: 66

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.dN1 < org.apache.commons.math.linear.EigenDecompositionImpl.this.work.length
```

Seed: 75

Execution Time: 00:20 (hh:mm)

Nb of EvoSuite Tests:43

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
(org.apache.commons.math.linear.EigenDecompositionImpl.this.work.length) != (30)
```

Seed: 83

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.dN1 < org.apache.commons.math.linear.EigenDecompositionImpl.this.work.length
```

Seed: 98

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.eMin <= 27
```

Seed: 100

Execution Time: 00:25 (hh:mm)

Nb of EvoSuite Tests:44

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.eMin < org.apache.commons.math.linear.EigenDecompositionImpl.this.dN
```

Seed: 104

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:43

Nb of Contradiction Tests:2

Nb of Removed Tests:2


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.lowerSpectra < -1
```

Seed: 111

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:41

Nb of Contradiction Tests:2

Nb of Removed Tests:2


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.eMin < b1
```

Seed: 113

Execution Time: 00:30 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Contradiction Tests:3

Nb of Removed Tests:3


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.dN1 < org.apache.commons.math.linear.EigenDecompositionImpl.this.work.length
```

Seed: 120

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:42

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1586

Patch type: CONDITIONAL

```Java
(((dMin1) == (dN1)) && ((dMin2) == (dN2))) || (7 <= org.apache.commons.math.linear.EigenDecompositionImpl.this.lowerSpectra)
```

Seed: 128

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:51

Nb of Contradiction Tests:2

Nb of Removed Tests:2


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.lowerSpectra < org.apache.commons.math.linear.EigenDecompositionImpl.this.qMax
```

Seed: 135

Execution Time: 00:32 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Contradiction Tests:2

Nb of Removed Tests:2


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
(org.apache.commons.math.linear.EigenDecompositionImpl.this.main.length) != (5)
```

Seed: 143

Execution Time: 00:25 (hh:mm)

Nb of EvoSuite Tests:43

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
(3) != (end)
```

Seed: 150

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
(nn) != (12)
```

Seed: 153

Execution Time: 00:23 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.lowerSpectra <= cnst3
```

Seed: 161

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.eMin < b1
```

Seed: 166

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.lowerSpectra < -1
```

Seed: 173

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.dN1 < org.apache.commons.math.linear.EigenDecompositionImpl.this.work.length
```

Seed: 180

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:40

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.lowerSpectra < 0
```

Seed: 181

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:42

Nb of Contradiction Tests:3

Nb of Removed Tests:3


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
(30) != (org.apache.commons.math.linear.EigenDecompositionImpl.this.work.length)
```

Seed: 186

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:37

Nb of Contradiction Tests:2

Nb of Removed Tests:2


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1544

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.dN1 < org.apache.commons.math.linear.EigenDecompositionImpl.this.work.length
```

Seed: 193

Execution Time: 00:20 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:26 (hh:mm)

Average Nb of EvoSuite Tests:44.03

Average Nb of Contradiction Tests:1

Average Nb of Removed Tests:1

Running Nopol+UnsatGuided changes the original patch for 23 of the 30 seeds. The human patch involves multiple changes to the code, such as changes to if condition and for loop, 2 newly generated patches by running Nopol+UnsatGuided make changes to the same conditional statement, the original patch and other newly generated patches by running Nopol+UnsatGuided add a precondition to the same statement, we think they are incorrect.