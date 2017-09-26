
## Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/stat/clustering/KMeansPlusPlusClusterer.java b/src/main/java/org/apache/commons/math/stat/clustering/KMeansPlusPlusClusterer.java
index e09bbc3..b73ac9d 100644
--- a/src/main/java/org/apache/commons/math/stat/clustering/KMeansPlusPlusClusterer.java
+++ b/src/main/java/org/apache/commons/math/stat/clustering/KMeansPlusPlusClusterer.java
@@ -172,7 +172,7 @@ public class KMeansPlusPlusClusterer<T extends Clusterable<T>> {
         while (resultSet.size() < k) {
             // For each data point x, compute D(x), the distance between x and
             // the nearest center that has already been chosen.
+            double sum = 0;
-            int sum = 0;
             for (int i = 0; i < pointSet.size(); i++) {
                 final T p = pointSet.get(i);
                 final Cluster<T> nearest = getNearestCluster(resultSet, p);

```


## Original Patch # Nopol 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(otherPoint.length) != (1)
```

Execution Time: 00:03 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(otherPoint.length) != (1)
```

Seed: 4

Execution Time: 00:39 (hh:mm)

Nb of EvoSuite Tests:20

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(otherPoint.length) != (1)
```

Seed: 12

Execution Time: 00:43 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(1) != (org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.this.point.length)
```

Seed: 18

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
1 < org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.this.point.length
```

Seed: 26

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(otherPoint.length) != (1)
```

Seed: 28

Execution Time: 00:43 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(otherPoint.length) != (1)
```

Seed: 35

Execution Time: 00:39 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(otherPoint.length) != (1)
```

Seed: 41

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
1 < otherPoint.length
```

Seed: 54

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(otherPoint.length) != (1)
```

Seed: 60

Execution Time: 00:43 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(otherPoint.length) != (1)
```

Seed: 66

Execution Time: 00:43 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(1) != (org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.this.point.length)
```

Seed: 75

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(otherPoint.length) != (1)
```

Seed: 83

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(1) != (org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.this.point.length)
```

Seed: 98

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(otherPoint.length) != (1)
```

Seed: 100

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(1) != (org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.this.point.length)
```

Seed: 104

Execution Time: 00:52 (hh:mm)

Nb of EvoSuite Tests:24

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(otherPoint.length) != (1)
```

Seed: 111

Execution Time: 00:52 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(otherPoint.length) != (1)
```

Seed: 113

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(otherPoint.length) != (1)
```

Seed: 120

Execution Time: 00:39 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(1) != (org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.this.point.length)
```

Seed: 128

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(otherPoint.length) != (1)
```

Seed: 135

Execution Time: 00:52 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(1) != (org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.this.point.length)
```

Seed: 143

Execution Time: 00:51 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(1) != (org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.this.point.length)
```

Seed: 150

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(otherPoint.length) != (1)
```

Seed: 153

Execution Time: 00:43 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
1 < otherPoint.length
```

Seed: 161

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
1 < otherPoint.length
```

Seed: 166

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(1) != (org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.this.point.length)
```

Seed: 173

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(otherPoint.length) != (1)
```

Seed: 180

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
(otherPoint.length) != (1)
```

Seed: 181

Execution Time: 00:39 (hh:mm)

Nb of EvoSuite Tests:20

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
1 < otherPoint.length
```

Seed: 186

Execution Time: 00:44 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math.stat.clustering.EuclideanIntegerPoint : 86

Patch type: PRECONDITION

```Java
1 < otherPoint.length
```

Seed: 193

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:46 (hh:mm)

Average Nb of EvoSuite Tests:21.7

Average Nb of Removed Tests:0

Runnin Nopol+UnsatGuided changes the original patch for 15 of the 30 seeds. The human patch changes the type of a parameter from int to double to avoid integer overflow, the original and newly generated patches by running Nopol+UnsatGuided add a precondition before the same statement, we think they are incorrect.
