
## Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java b/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java
index 9d1b797..3fc328d 100644
--- a/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java
+++ b/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java
@@ -1132,7 +1132,7 @@ public class EigenDecompositionImpl implements EigenDecomposition {
     private boolean flipIfWarranted(final int n, final int step) {
         if (1.5 * work[pingPong] < work[4 * (n - 1) + pingPong]) {
             // flip array
+            int j = 4 * (n - 1);
-            int j = 4 * n - 1;
             for (int i = 0; i < j; i += 4) {
                 for (int k = 0; k < 4; k += step) {
                     final double tmp = work[i + k];

```


## Original Patch # Nopol 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.cachedD!=null
```

Execution Time: 00:01 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
n < org.apache.commons.math.linear.EigenDecompositionImpl.this.main.length
```

Seed: 4

Execution Time: 00:55 (hh:mm)

Nb of EvoSuite Tests:44

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.g == org.apache.commons.math.linear.EigenDecompositionImpl.this.splitTolerance
```

Seed: 12

Execution Time: 00:43 (hh:mm)

Nb of EvoSuite Tests:44

Nb of Removed Tests:1


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: PRECONDITION

```Java
(6) != (org.apache.commons.math.linear.EigenDecompositionImpl.this.secondary.length)
```

Seed: 18

Execution Time: 01:01 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Removed Tests:2


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.splitTolerance < org.apache.commons.math.linear.EigenDecompositionImpl.this.dN1
```

Seed: 26

Execution Time: 01:07 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Removed Tests:2


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
(org.apache.commons.math.linear.EigenDecompositionImpl.this.qMax < org.apache.commons.math.linear.EigenDecompositionImpl.this.dMin2) || (org.apache.commons.math.linear.EigenDecompositionImpl.TOLERANCE_2 <= org.apache.commons.math.linear.EigenDecompositionImpl.this.splitTolerance)
```

Seed: 28

Execution Time: 01:18 (hh:mm)

Nb of EvoSuite Tests:50

Nb of Removed Tests:1


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: PRECONDITION

```Java
6 == org.apache.commons.math.linear.EigenDecompositionImpl.this.imagEigenvalues.length
```

Seed: 35

Execution Time: 01:01 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Removed Tests:1


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.splitTolerance <= -1
```

Seed: 41

Execution Time: 00:53 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Removed Tests:1


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: PRECONDITION

```Java
(6) != (org.apache.commons.math.linear.EigenDecompositionImpl.this.secondary.length)
```

Seed: 54

Execution Time: 00:51 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Removed Tests:1


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.splitTolerance <= org.apache.commons.math.linear.EigenDecompositionImpl.this.dMin1
```

Seed: 60

Execution Time: 00:55 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Removed Tests:1


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.splitTolerance <= -1
```

Seed: 66

Execution Time: 00:36 (hh:mm)

Nb of EvoSuite Tests:42

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.TOLERANCE_2 < org.apache.commons.math.linear.EigenDecompositionImpl.this.splitTolerance
```

Seed: 75

Execution Time: 00:58 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Removed Tests:1


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
(6) != (org.apache.commons.math.linear.EigenDecompositionImpl.this.squaredSecondary.length)
```

Seed: 83

Execution Time: 01:04 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Removed Tests:1


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.splitTolerance < org.apache.commons.math.linear.EigenDecompositionImpl.this.dN
```

Seed: 98

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: PRECONDITION

```Java
(org.apache.commons.math.linear.EigenDecompositionImpl.this.main.length) != (n)
```

Seed: 100

Execution Time: 01:10 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.cachedD!=null
```

Seed: 104

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: PRECONDITION

```Java
10 <= org.apache.commons.math.linear.EigenDecompositionImpl.this.splitTolerance
```

Seed: 111

Execution Time: 00:57 (hh:mm)

Nb of EvoSuite Tests:43

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided (selected for manual analysis)

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
6 == org.apache.commons.math.linear.EigenDecompositionImpl.this.main.length
```

Seed: 113

Execution Time: 00:40 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Removed Tests:1


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
(org.apache.commons.math.linear.EigenDecompositionImpl.this.imagEigenvalues.length) != (7)
```

Seed: 120

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:40

Nb of Removed Tests:2


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
7 <= org.apache.commons.math.linear.EigenDecompositionImpl.this.squaredSecondary.length
```

Seed: 128

Execution Time: 00:53 (hh:mm)

Nb of EvoSuite Tests:42

Nb of Removed Tests:4


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
(6) != (org.apache.commons.math.linear.EigenDecompositionImpl.this.squaredSecondary.length)
```

Seed: 135

Execution Time: 00:47 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Removed Tests:3


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.main.length <= 6
```

Seed: 143

Execution Time: 00:47 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Removed Tests:2


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.realEigenvalues.length == 8
```

Seed: 150

Execution Time: 01:01 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.realEigenvalues.length == 6
```

Seed: 153

Execution Time: 00:42 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
2 < org.apache.commons.math.linear.EigenDecompositionImpl.this.dMin1
```

Seed: 161

Execution Time: 00:32 (hh:mm)

Nb of EvoSuite Tests:41

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
9 == org.apache.commons.math.linear.EigenDecompositionImpl.this.main.length
```

Seed: 166

Execution Time: 00:58 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Removed Tests:2


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.this.work.length == 54
```

Seed: 173

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:44

Nb of Removed Tests:1


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: PRECONDITION

```Java
5 == org.apache.commons.math.linear.EigenDecompositionImpl.this.imagEigenvalues.length
```

Seed: 180

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:44

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
9 == org.apache.commons.math.linear.EigenDecompositionImpl.this.realEigenvalues.length
```

Seed: 181

Execution Time: 00:44 (hh:mm)

Nb of EvoSuite Tests:44

Nb of Removed Tests:1


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
org.apache.commons.math.linear.EigenDecompositionImpl.TOLERANCE < org.apache.commons.math.linear.EigenDecompositionImpl.this.dMin1
```

Seed: 186

Execution Time: 00:43 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: PRECONDITION

```Java
7 == org.apache.commons.math.linear.EigenDecompositionImpl.this.secondary.length
```

Seed: 193

Execution Time: 00:43 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Removed Tests:1


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:51 (hh:mm)

Average Nb of EvoSuite Tests:45.23

Average Nb of Removed Tests:0.97

Running Nopol+UnsatGuided changes the original patch for 29 of the 30 seeds. The human patch has changed the expression that represents the number of rows, the original patch and the selected newly generated patch by running Nopol+UnsatGuided add a precondition before the same statement, we think they are incorrect. We observe failing EvoSuite tests for both the programs patched with the original Nopol patch and the selected new patch genertaed by running Nopol+UnsatGuided, which verifies our analysis.
