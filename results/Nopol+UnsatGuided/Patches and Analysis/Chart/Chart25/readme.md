
## Human Patch 

```Java
diff --git a/source/org/jfree/chart/renderer/category/StatisticalBarRenderer.java b/source/org/jfree/chart/renderer/category/StatisticalBarRenderer.java
index 6ff5e36..ab65ba3 100644
--- a/source/org/jfree/chart/renderer/category/StatisticalBarRenderer.java
+++ b/source/org/jfree/chart/renderer/category/StatisticalBarRenderer.java
@@ -256,9 +256,6 @@ public class StatisticalBarRenderer extends BarRenderer
 
         // BAR X
         Number meanValue = dataset.getMeanValue(row, column);
+        if (meanValue == null) {
+            return;
+        }
 
         double value = meanValue.doubleValue();
         double base = 0.0;
@@ -315,9 +312,7 @@ public class StatisticalBarRenderer extends BarRenderer
         }
 
         // standard deviation lines
+        Number n = dataset.getStdDevValue(row, column);
+        if (n != null) {
+            double valueDelta = n.doubleValue();
-            double valueDelta = dataset.getStdDevValue(row, column).doubleValue();
             double highVal = rangeAxis.valueToJava2D(meanValue.doubleValue() 
                     + valueDelta, dataArea, yAxisLocation);
             double lowVal = rangeAxis.valueToJava2D(meanValue.doubleValue() 
@@ -346,7 +341,6 @@ public class StatisticalBarRenderer extends BarRenderer
             line = new Line2D.Double(lowVal, rectY + rectHeight * 0.25, 
                                      lowVal, rectY + rectHeight * 0.75);
             g2.draw(line);
+        }
         
         CategoryItemLabelGenerator generator = getItemLabelGenerator(row, 
                 column);
@@ -406,9 +400,6 @@ public class StatisticalBarRenderer extends BarRenderer
 
         // BAR Y
         Number meanValue = dataset.getMeanValue(row, column);
+        if (meanValue == null) {
+            return;
+        }
 
         double value = meanValue.doubleValue();
         double base = 0.0;
@@ -465,9 +456,7 @@ public class StatisticalBarRenderer extends BarRenderer
         }
 
         // standard deviation lines
+        Number n = dataset.getStdDevValue(row, column);
+        if (n != null) {
+            double valueDelta = n.doubleValue();
-            double valueDelta = dataset.getStdDevValue(row, column).doubleValue();
             double highVal = rangeAxis.valueToJava2D(meanValue.doubleValue() 
                     + valueDelta, dataArea, yAxisLocation);
             double lowVal = rangeAxis.valueToJava2D(meanValue.doubleValue() 
@@ -495,7 +484,6 @@ public class StatisticalBarRenderer extends BarRenderer
             line = new Line2D.Double(rectX + rectWidth / 2.0d - 5.0d, lowVal,
                                      rectX + rectWidth / 2.0d + 5.0d, lowVal);
             g2.draw(line);
+        }
         
         CategoryItemLabelGenerator generator = getItemLabelGenerator(row, 
                 column);

```


## Original Patch # Nopol 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Execution Time: 00:00 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 4

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:16

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 12

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:16

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 18

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:16

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 26

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:19

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 28

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:18

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 < pass
```

Seed: 35

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
(pass) != (row)
```

Seed: 41

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:14

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 54

Execution Time: 00:07 (hh:mm)

Nb of EvoSuite Tests:12

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 60

Execution Time: 00:07 (hh:mm)

Nb of EvoSuite Tests:12

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 66

Execution Time: 00:07 (hh:mm)

Nb of EvoSuite Tests:12

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 75

Execution Time: 00:08 (hh:mm)

Nb of EvoSuite Tests:13

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 83

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:18

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
column < -1
```

Seed: 98

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 100

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:15

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
(pass) != (row)
```

Seed: 104

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 111

Execution Time: 00:04 (hh:mm)

Nb of EvoSuite Tests:12

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 < pass
```

Seed: 113

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:15

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
(pass) != (row)
```

Seed: 120

Execution Time: 00:07 (hh:mm)

Nb of EvoSuite Tests:14

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 128

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:11

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 135

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 143

Execution Time: 00:08 (hh:mm)

Nb of EvoSuite Tests:12

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
(pass) != (0)
```

Seed: 150

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:19

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 153

Execution Time: 00:07 (hh:mm)

Nb of EvoSuite Tests:12

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 161

Execution Time: 00:04 (hh:mm)

Nb of EvoSuite Tests:10

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 166

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:14

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 173

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:12

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 180

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:15

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 181

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:16

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
0 == 1
```

Seed: 186

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:18

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: PRECONDITION

```Java
(row) != (0)
```

Seed: 193

Execution Time: 00:07 (hh:mm)

Nb of EvoSuite Tests:13

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:09 (hh:mm)

Average Nb of EvoSuite Tests:14.73

Average Nb of Removed Tests:0

Running Nopol+UnsatGuided changes the original patch for 8 of the 30 seeds. The human patch involves multiple changes to a class, the original patch and the newly generated patches by running Nopol+UnsatGuided all add a precondition to the same statement. We observe failing EvoSuite tests for programs patched with the original Nopol patch, which means the original Nopol patch is incorrect. We do not observe any failing EvoSuite tests for programs patched with the new patches genertaed by running Nopol+UnsatGuided, yet we are still not quite sure about the correctness of the newly generated patches.
