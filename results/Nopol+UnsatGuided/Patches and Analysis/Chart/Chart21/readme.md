
## Human Patch 

```Java
diff --git a/source/org/jfree/data/statistics/DefaultBoxAndWhiskerCategoryDataset.java b/source/org/jfree/data/statistics/DefaultBoxAndWhiskerCategoryDataset.java
index a973da9..7fd86f4 100644
--- a/source/org/jfree/data/statistics/DefaultBoxAndWhiskerCategoryDataset.java
+++ b/source/org/jfree/data/statistics/DefaultBoxAndWhiskerCategoryDataset.java
@@ -154,7 +154,6 @@ public class DefaultBoxAndWhiskerCategoryDataset extends AbstractDataset
                 && this.minimumRangeValueColumn == c))  {
             updateBounds();
         }
+        else {
         
             double minval = Double.NaN;
             if (item.getMinOutlier() != null) {
@@ -186,7 +185,6 @@ public class DefaultBoxAndWhiskerCategoryDataset extends AbstractDataset
                 this.minimumRangeValueRow = r;
                 this.minimumRangeValueColumn = c;
             }
+        }
         
         this.rangeBounds = new Range(this.minimumRangeValue,
               this.maximumRangeValue);
@@ -740,44 +738,7 @@ public class DefaultBoxAndWhiskerCategoryDataset extends AbstractDataset
      */
     private void updateBounds() {
         this.minimumRangeValue = Double.NaN;
+        this.minimumRangeValueRow = -1;
+        this.minimumRangeValueColumn = -1;
         this.maximumRangeValue = Double.NaN;
+        this.maximumRangeValueRow = -1;
+        this.maximumRangeValueColumn = -1;
+        int rowCount = getRowCount();
+        int columnCount = getColumnCount();
+        for (int r = 0; r < rowCount; r++) {
+            for (int c = 0; c < columnCount; c++) {
+                BoxAndWhiskerItem item = getItem(r, c);
+                if (item != null) {
+                    Number min = item.getMinOutlier();
+                    if (min != null) {
+                        double minv = min.doubleValue();
+                        if (!Double.isNaN(minv)) {
+                            if (minv < this.minimumRangeValue || Double.isNaN(
+                                    this.minimumRangeValue)) {
+                                this.minimumRangeValue = minv;
+                                this.minimumRangeValueRow = r;
+                                this.minimumRangeValueColumn = c;
+                            }
+                        }
+                    }
+                    Number max = item.getMaxOutlier();
+                    if (max != null) {
+                        double maxv = max.doubleValue();
+                        if (!Double.isNaN(maxv)) {
+                            if (maxv > this.maximumRangeValue || Double.isNaN(
+                                    this.maximumRangeValue)) {
+                                this.maximumRangeValue = maxv;
+                                this.maximumRangeValueRow = r;
+                                this.maximumRangeValueColumn = c;
+                            }
+                        }
+                    }
+                }
+            }
+        }
     }
     
     /**

```


## Original Patch # Nopol 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(29 < org.jfree.data.Range.this.lower + org.jfree.data.Range.this.lower) || (org.jfree.data.Range.this.lower + org.jfree.data.Range.this.lower <= org.jfree.data.Range.this.upper)
```

Execution Time: 00:00 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(32 < org.jfree.data.Range.this.lower) || (org.jfree.data.Range.this.lower <= (32) - (29))
```

Seed: 4

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:54

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(org.jfree.data.Range.this.lower <= (32) - (29) + -1) || (32 < org.jfree.data.Range.this.upper)
```

Seed: 12

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:55

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(!(1 < (org.jfree.data.Range.this.lower) - (1))) || (32 <= (org.jfree.data.Range.this.lower) - (1))
```

Seed: 18

Execution Time: 00:47 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(29 < org.jfree.data.Range.this.upper) || (org.jfree.data.Range.this.lower <= (1) - (-1))
```

Seed: 26

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:56

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
!((org.jfree.data.Range.this.upper < 32) && ((32) - (org.jfree.data.Range.this.lower) <= 29))
```

Seed: 28

Execution Time: 00:43 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
((32) - (org.jfree.data.Range.this.lower) <= org.jfree.data.Range.this.lower) || (29 < (32) - (org.jfree.data.Range.this.lower))
```

Seed: 35

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:51

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(range!=null) && ((!(32 < 29 + org.jfree.data.Range.this.lower)) || (29 <= org.jfree.data.Range.this.upper))
```

Seed: 41

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(!((org.jfree.data.Range.this.upper) != (org.jfree.data.Range.this.upper))) && ((org.jfree.data.Range.this.lower + -1 <= 1) || (32 < org.jfree.data.Range.this.lower))
```

Seed: 54

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:51

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(1 <= (32) - (29 + org.jfree.data.Range.this.lower)) || (!((org.jfree.data.Range.this.upper < 32) && (((32) - (29 + org.jfree.data.Range.this.lower)) != (-1))))
```

Seed: 60

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(org.jfree.data.Range.this.lower <= (0) - (-1 + -1)) || ((obj!=null) && (!(org.jfree.data.Range.this.lower < 32)))
```

Seed: 66

Execution Time: 00:42 (hh:mm)

Nb of EvoSuite Tests:51

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
((32 < org.jfree.data.Range.this.lower) && (32 < org.jfree.data.Range.this.lower)) || (29 + org.jfree.data.Range.this.lower <= 32)
```

Seed: 75

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:51

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(!((org.jfree.data.Range.this.upper < 29) && ((1 + org.jfree.data.Range.this.upper) - (org.jfree.data.Range.this.lower) <= org.jfree.data.Range.this.lower))) || (org.jfree.data.Range.this.lower == org.jfree.data.Range.this.upper)
```

Seed: 83

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:54

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(1 + org.jfree.data.Range.this.lower <= (org.jfree.data.Range.this.upper) - (1)) || ((range!=null) && (!(org.jfree.data.Range.this.lower < (org.jfree.data.Range.this.upper) - (1))))
```

Seed: 98

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(29 + 0 <= org.jfree.data.Range.this.upper) || ((org.jfree.data.Range.this.lower) - (1) < 1)
```

Seed: 100

Execution Time: 00:46 (hh:mm)

Nb of EvoSuite Tests:54

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
((org.jfree.data.Range.this.upper) - (org.jfree.data.Range.this.lower) == org.jfree.data.Range.this.lower + 1) || (!((((org.jfree.data.Range.this.upper) - (org.jfree.data.Range.this.lower)) != (org.jfree.data.Range.this.lower)) && (org.jfree.data.Range.this.upper <= 29)))
```

Seed: 104

Execution Time: 00:51 (hh:mm)

Nb of EvoSuite Tests:54

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
((org.jfree.data.Range.this.upper) - (32) + 29 < 1) || (1 <= (org.jfree.data.Range.this.upper) - (32))
```

Seed: 111

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(!(((org.jfree.data.Range.this.lower + 1) != (org.jfree.data.Range.this.upper)) && (org.jfree.data.Range.this.upper < (org.jfree.data.Range.this.lower + 1) - (-1)))) || (org.jfree.data.Range.this.lower + 1 <= 0)
```

Seed: 113

Execution Time: 00:52 (hh:mm)

Nb of EvoSuite Tests:54

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(!(org.jfree.data.Range.this.upper < 29)) || (org.jfree.data.Range.this.lower <= (32) - (29))
```

Seed: 120

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:54

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(29 + org.jfree.data.Range.this.lower < 32) || (32 <= org.jfree.data.Range.this.upper)
```

Seed: 128

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:56

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(org.jfree.data.Range.this.upper + 29 < (32) - (-1)) || ((32) - (-1) <= org.jfree.data.Range.this.lower)
```

Seed: 135

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:54

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
((org.jfree.data.Range.this.lower) - (1) <= 1) || (29 < org.jfree.data.Range.this.upper)
```

Seed: 143

Execution Time: 00:46 (hh:mm)

Nb of EvoSuite Tests:54

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
((0 <= 1 + (org.jfree.data.Range.this.lower) - (org.jfree.data.Range.this.upper)) || (!(-1 < 1 + (org.jfree.data.Range.this.lower) - (org.jfree.data.Range.this.upper)))) && ((0 <= 1 + (org.jfree.data.Range.this.lower) - (org.jfree.data.Range.this.upper)) || (!(-1 < 1 + (org.jfree.data.Range.this.lower) - (org.jfree.data.Range.this.upper))))
```

Seed: 150

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(!(org.jfree.data.Range.this.lower < 32)) || (org.jfree.data.Range.this.lower <= 1 + 1)
```

Seed: 153

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:51

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(29 <= (1) - (org.jfree.data.Range.this.lower) + 32) || (32 < org.jfree.data.Range.this.upper)
```

Seed: 161

Execution Time: 00:43 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
((-1 + org.jfree.data.Range.this.lower <= 1) && (-1 + org.jfree.data.Range.this.lower <= 1)) || (29 < org.jfree.data.Range.this.upper)
```

Seed: 166

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:53

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(29 + (org.jfree.data.Range.this.upper) - (32) <= 1) || (org.jfree.data.Range.this.lower < 29 + (org.jfree.data.Range.this.upper) - (32))
```

Seed: 173

Execution Time: 00:51 (hh:mm)

Nb of EvoSuite Tests:53

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(!(org.jfree.data.Range.this.lower + org.jfree.data.Range.this.upper < 29)) || (org.jfree.data.Range.this.lower <= (32) - (29))
```

Seed: 180

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:56

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(29 + (org.jfree.data.Range.this.lower) - (32) < 0) || (!((org.jfree.data.Range.this.lower) - (32) <= 0))
```

Seed: 181

Execution Time: 00:43 (hh:mm)

Nb of EvoSuite Tests:51

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(32 < org.jfree.data.Range.this.upper) || ((org.jfree.data.Range.this.lower <= (32) - (-1 + 29)) && (org.jfree.data.Range.this.lower <= (32) - (-1 + 29)))
```

Seed: 186

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.jfree.data.Range : 335

Patch type: PRECONDITION

```Java
(org.jfree.data.Range.this.lower <= (org.jfree.data.Range.this.upper) - (org.jfree.data.Range.this.lower)) || (!((org.jfree.data.Range.this.lower < 29) && (obj!=null)))
```

Seed: 193

Execution Time: 00:43 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:46 (hh:mm)

Average Nb of EvoSuite Tests:52.8

Average Nb of Removed Tests:0

Running Nopol+UnsatGuided changes the original patch for each of the 30 seeds. The human patch involves systematic changes to a method, the original patch and the newly generated patches by running Nopol+UnsatGuided all add a precondition to the same statement. We observe failing EvoSuite tests for programs patched with the original Nopol patch, which means the original Nopol patch is incorrect. We do not observe any failing EvoSuite tests for programs patched with the patches genertaed by running Nopol+UnsatGuided, yet we are still not quite sure about the correctness of the newly generated patches. 
