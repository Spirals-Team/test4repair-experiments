
## Human Patch 

```Java
diff --git a/source/org/jfree/data/xy/XYSeries.java b/source/org/jfree/data/xy/XYSeries.java
index b26e11e..0b37e6e 100644
--- a/source/org/jfree/data/xy/XYSeries.java
+++ b/source/org/jfree/data/xy/XYSeries.java
@@ -541,15 +541,11 @@ public class XYSeries extends Series implements Cloneable, Serializable {
         if (x == null) {
             throw new IllegalArgumentException("Null 'x' argument.");
         }
+        if (this.allowDuplicateXValues) {
+            add(x, y);
+            return null;
+        }
 
         // if we get to here, we know that duplicate X values are not permitted
         XYDataItem overwritten = null;
         int index = indexOf(x);
+        if (index >= 0) {
-        if (index >= 0 && !this.allowDuplicateXValues) {
             XYDataItem existing = (XYDataItem) this.data.get(index);
             try {
                 overwritten = (XYDataItem) existing.clone();

```


## Original Patch # Nopol 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
!(org.jfree.data.xy.XYSeries.this.allowDuplicateXValues)
```

Execution Time: 00:01 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
(((y) != (x)) && (org.jfree.data.xy.XYSeries.this.data.isEmpty())) || (!(-1 <= index))
```

Seed: 4

Execution Time: 01:34 (hh:mm)

Nb of EvoSuite Tests:116

Nb of Contradiction Tests:6

Nb of Removed Tests:6


## Patch 2 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
!(((org.jfree.data.xy.XYSeries.this.allowDuplicateXValues) || (0 == x)) && (29 < org.jfree.data.xy.XYSeries.this.maximumItemCount))
```

Seed: 12

Execution Time: 01:15 (hh:mm)

Nb of EvoSuite Tests:95

Nb of Contradiction Tests:3

Nb of Removed Tests:3


## Patch 3 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
!(org.jfree.data.xy.XYSeries.this.allowDuplicateXValues)
```

Seed: 18

Execution Time: 01:04 (hh:mm)

Nb of EvoSuite Tests:85

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 4 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
(!((1 == 2) || (-1 < index))) && ((1) != (y))
```

Seed: 26

Execution Time: 01:30 (hh:mm)

Nb of EvoSuite Tests:107

Nb of Contradiction Tests:5

Nb of Removed Tests:7


## Patch 5 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
!(((org.jfree.data.xy.XYSeries.this.maximumItemCount) != (org.jfree.data.xy.XYSeries.this.data.size())) && (org.jfree.data.xy.XYSeries.this.allowDuplicateXValues))
```

Seed: 28

Execution Time: 01:23 (hh:mm)

Nb of EvoSuite Tests:94

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 6 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
(!((overwritten!=null) || (index == 0))) && ((x) != (y))
```

Seed: 35

Execution Time: 00:55 (hh:mm)

Nb of EvoSuite Tests:94

Nb of Contradiction Tests:4

Nb of Removed Tests:4


## Patch 7 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
(org.jfree.data.xy.XYSeries.this.autoSort) && (!((1 == y) || (-1 < index)))
```

Seed: 41

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:89

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
(!(org.jfree.data.xy.XYSeries.this.allowDuplicateXValues)) && (org.jfree.data.xy.XYSeries.this.autoSort)
```

Seed: 54

Execution Time: 01:16 (hh:mm)

Nb of EvoSuite Tests:94

Nb of Contradiction Tests:2

Nb of Removed Tests:2


## Patch 9 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
(org.jfree.data.xy.XYSeries.this.autoSort) && (!(org.jfree.data.xy.XYSeries.this.allowDuplicateXValues))
```

Seed: 60

Execution Time: 01:10 (hh:mm)

Nb of EvoSuite Tests:94

Nb of Contradiction Tests:3

Nb of Removed Tests:3


## Patch 10 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
(org.jfree.data.xy.XYSeries.this.maximumItemCount <= 1) || (!(org.jfree.data.xy.XYSeries.this.allowDuplicateXValues))
```

Seed: 66

Execution Time: 01:31 (hh:mm)

Nb of EvoSuite Tests:104

Nb of Contradiction Tests:5

Nb of Removed Tests:7


## Patch 11 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
!((-1 <= index) && ((y == x) || ((0) != (org.jfree.data.xy.XYSeries.this.data.size()))))
```

Seed: 75

Execution Time: 01:18 (hh:mm)

Nb of EvoSuite Tests:97

Nb of Contradiction Tests:3

Nb of Removed Tests:3


## Patch 12 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
(org.jfree.data.xy.XYSeries.this.maximumItemCount == 1) || (!(org.jfree.data.xy.XYSeries.this.allowDuplicateXValues))
```

Seed: 83

Execution Time: 01:04 (hh:mm)

Nb of EvoSuite Tests:95

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 13 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
!(org.jfree.data.xy.XYSeries.this.allowDuplicateXValues)
```

Seed: 98

Execution Time: 01:11 (hh:mm)

Nb of EvoSuite Tests:90

Nb of Contradiction Tests:3

Nb of Removed Tests:3


## Patch 14 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
(!(org.jfree.data.xy.XYSeries.this.allowDuplicateXValues)) && (org.jfree.data.xy.XYSeries.this.autoSort)
```

Seed: 100

Execution Time: 01:30 (hh:mm)

Nb of EvoSuite Tests:105

Nb of Contradiction Tests:7

Nb of Removed Tests:7


## Patch 15 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
(index < 0) && ((y) != (x))
```

Seed: 104

Execution Time: 00:56 (hh:mm)

Nb of EvoSuite Tests:97

Nb of Contradiction Tests:2

Nb of Removed Tests:2


## Patch 16 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
((0) != (index)) && (!(1 == y))
```

Seed: 111

Execution Time: 01:00 (hh:mm)

Nb of EvoSuite Tests:94

Nb of Contradiction Tests:3

Nb of Removed Tests:5


## Patch 17 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
(!(org.jfree.data.xy.XYSeries.this.allowDuplicateXValues)) || (org.jfree.data.xy.XYSeries.this.maximumItemCount <= 1)
```

Seed: 113

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:101

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
(index < 0) && (!(1 == y))
```

Seed: 120

Execution Time: 01:15 (hh:mm)

Nb of EvoSuite Tests:99

Nb of Contradiction Tests:5

Nb of Removed Tests:5


## Patch 19 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
(index < 0) && ((y) != (1))
```

Seed: 128

Execution Time: 01:12 (hh:mm)

Nb of EvoSuite Tests:100

Nb of Contradiction Tests:3

Nb of Removed Tests:5


## Patch 20 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
!((0 == -1) || ((0 < org.jfree.data.xy.XYSeries.this.maximumItemCount) && (org.jfree.data.xy.XYSeries.this.allowDuplicateXValues)))
```

Seed: 135

Execution Time: 01:14 (hh:mm)

Nb of EvoSuite Tests:96

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 21 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
!(org.jfree.data.xy.XYSeries.this.allowDuplicateXValues)
```

Seed: 143

Execution Time: 01:17 (hh:mm)

Nb of EvoSuite Tests:102

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 22 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
((!(org.jfree.data.xy.XYSeries.this.allowDuplicateXValues)) && (org.jfree.data.xy.XYSeries.this.autoSort)) || (org.jfree.data.xy.XYSeries.this.data.size() == org.jfree.data.xy.XYSeries.this.maximumItemCount)
```

Seed: 150

Execution Time: 01:33 (hh:mm)

Nb of EvoSuite Tests:106

Nb of Contradiction Tests:2

Nb of Removed Tests:2


## Patch 23 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
((org.jfree.data.xy.XYSeries.this.autoSort) && (!(org.jfree.data.xy.XYSeries.this.allowDuplicateXValues))) || (2 == x)
```

Seed: 153

Execution Time: 01:27 (hh:mm)

Nb of EvoSuite Tests:103

Nb of Contradiction Tests:4

Nb of Removed Tests:4


## Patch 24 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
(org.jfree.data.xy.XYSeries.this.maximumItemCount == 2) || ((!(org.jfree.data.xy.XYSeries.this.allowDuplicateXValues)) && (org.jfree.data.xy.XYSeries.this.autoSort))
```

Seed: 161

Execution Time: 01:39 (hh:mm)

Nb of EvoSuite Tests:102

Nb of Contradiction Tests:4

Nb of Removed Tests:4


## Patch 25 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
!(((org.jfree.data.xy.XYSeries.this.data.isEmpty()) || ((-1) != (index))) && (org.jfree.data.xy.XYSeries.this.allowDuplicateXValues))
```

Seed: 166

Execution Time: 00:52 (hh:mm)

Nb of EvoSuite Tests:77

Nb of Contradiction Tests:2

Nb of Removed Tests:2


## Patch 26 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
!((org.jfree.data.xy.XYSeries.this.allowDuplicateXValues) || (y == 0))
```

Seed: 173

Execution Time: 01:03 (hh:mm)

Nb of EvoSuite Tests:103

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
!(((0 <= index) && ((x) != (y))) || (y == 1))
```

Seed: 180

Execution Time: 01:10 (hh:mm)

Nb of EvoSuite Tests:92

Nb of Contradiction Tests:6

Nb of Removed Tests:6


## Patch 28 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
!(((0 <= index) || (org.jfree.data.xy.XYSeries.this.data.isEmpty())) && (org.jfree.data.xy.XYSeries.this.allowDuplicateXValues))
```

Seed: 181

Execution Time: 01:19 (hh:mm)

Nb of EvoSuite Tests:98

Nb of Contradiction Tests:5

Nb of Removed Tests:7


## Patch 29 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
!((0 <= index) || ((y == x) && (org.jfree.data.xy.XYSeries.this.data.isEmpty())))
```

Seed: 186

Execution Time: 01:35 (hh:mm)

Nb of EvoSuite Tests:94

Nb of Contradiction Tests:8

Nb of Removed Tests:10


## Patch 30 # Nopol+UnsatGuided 

org.jfree.data.xy.XYSeries : 563

Patch type: CONDITIONAL

```Java
(((x) != (y)) && (0 == org.jfree.data.xy.XYSeries.this.data.size())) || (index < -1)
```

Seed: 193

Execution Time: 01:29 (hh:mm)

Nb of EvoSuite Tests:108

Nb of Contradiction Tests:2

Nb of Removed Tests:2


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 01:15 (hh:mm)

Average Nb of EvoSuite Tests:97.7

 Average Nb of Contradiction Tests:3.07

Average Nb of Removed Tests:3.47

Running Nopol+UnsatGuided changes the original patch for 27 of the 30 seeds. The human patch extracts a predicate !this.allowDuplicateXValues from an if condition and adds a specific if condition to deal with the situation corresponding to the extracted predicate.The patch generated by the newest Nopol is exactly the same as the patch generated by the Nopol version used in the EMSE paper (Automatic Repair of Real Bugs in Java: A Large-Scale Experiment on the Defects4J Dataset) and the authors claim the patch is correct. The patch replaces an if condition this.autoSort by another if condition !allowDuplicateXValues, the patch somewhat protects the intended behaviour of the method but does not consider whether the items in the series are sorted or not, thus we think it is not a correct patch. The newly generated patches by running Nopol+UnsatGuided suffer from similar problems, and are thus also incorrect. .