#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//chart/ project chart
##Original Patch 

```Java
diff --git a/source/org/jfree/chart/renderer/category/StatisticalBarRenderer.java b/source/org/jfree/chart/renderer/category/StatisticalBarRenderer.java
index 6ff5e36..ab65ba3 100644
--- a/source/org/jfree/chart/renderer/category/StatisticalBarRenderer.java
+++ b/source/org/jfree/chart/renderer/category/StatisticalBarRenderer.java
@@ -256,9 +256,6 @@ public class StatisticalBarRenderer extends BarRenderer
 
         // BAR X
         Number meanValue = dataset.getMeanValue(row, column);
-        if (meanValue == null) {
-            return;
-        }
 
         double value = meanValue.doubleValue();
         double base = 0.0;
@@ -315,9 +312,7 @@ public class StatisticalBarRenderer extends BarRenderer
         }
 
         // standard deviation lines
-        Number n = dataset.getStdDevValue(row, column);
-        if (n != null) {
-            double valueDelta = n.doubleValue();
+            double valueDelta = dataset.getStdDevValue(row, column).doubleValue();
             double highVal = rangeAxis.valueToJava2D(meanValue.doubleValue() 
                     + valueDelta, dataArea, yAxisLocation);
             double lowVal = rangeAxis.valueToJava2D(meanValue.doubleValue() 
@@ -346,7 +341,6 @@ public class StatisticalBarRenderer extends BarRenderer
             line = new Line2D.Double(lowVal, rectY + rectHeight * 0.25, 
                                      lowVal, rectY + rectHeight * 0.75);
             g2.draw(line);
-        }
         
         CategoryItemLabelGenerator generator = getItemLabelGenerator(row, 
                 column);
@@ -406,9 +400,6 @@ public class StatisticalBarRenderer extends BarRenderer
 
         // BAR Y
         Number meanValue = dataset.getMeanValue(row, column);
-        if (meanValue == null) {
-            return;
-        }
 
         double value = meanValue.doubleValue();
         double base = 0.0;
@@ -465,9 +456,7 @@ public class StatisticalBarRenderer extends BarRenderer
         }
 
         // standard deviation lines
-        Number n = dataset.getStdDevValue(row, column);
-        if (n != null) {
-            double valueDelta = n.doubleValue();
+            double valueDelta = dataset.getStdDevValue(row, column).doubleValue();
             double highVal = rangeAxis.valueToJava2D(meanValue.doubleValue() 
                     + valueDelta, dataArea, yAxisLocation);
             double lowVal = rangeAxis.valueToJava2D(meanValue.doubleValue() 
@@ -495,7 +484,6 @@ public class StatisticalBarRenderer extends BarRenderer
             line = new Line2D.Double(rectX + rectWidth / 2.0d - 5.0d, lowVal,
                                      rectX + rectWidth / 2.0d + 5.0d, lowVal);
             g2.draw(line);
-        }
         
         CategoryItemLabelGenerator generator = getItemLabelGenerator(row, 
                 column);
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.plot.CategoryPlot : 2672

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 243

Nb of Failing EvoSuite Tests: 243


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.plot.CategoryPlot : 2865

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 236

Nb of Failing EvoSuite Tests: 236


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.plot.CategoryPlot : 2864

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 230

Nb of Failing EvoSuite Tests: 230


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.plot.CategoryPlot : 2867

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 243

Nb of Failing EvoSuite Tests: 243


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.plot.CategoryPlot : 2864

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.plot.CategoryPlot.this.foregroundDomainMarkers) != null) {
	java.util.Set keys = org.jfree.chart.plot.CategoryPlot.this.foregroundDomainMarkers.keySet();
	java.util.Iterator iterator = keys.iterator();
	while (iterator.hasNext()) {
		java.lang.Integer key = ((java.lang.Integer)(iterator.next()));
		clearDomainMarkers(key.intValue());
	}
	org.jfree.chart.plot.CategoryPlot.this.foregroundDomainMarkers.clear();
} 

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 237

Nb of Failing EvoSuite Tests: 237


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.plot.CategoryPlot : 2866

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 230

Nb of Failing EvoSuite Tests: 230


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.plot.CategoryPlot : 2673

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 233

Nb of Failing EvoSuite Tests: 233


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.plot.CategoryPlot : 2865

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 229

Nb of Failing EvoSuite Tests: 229


--- 
#Seed: 9

## Patch 9 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.plot.CategoryPlot : 2867

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 241

Nb of Failing EvoSuite Tests: 241


--- 
#Seed: 10

## Patch 10 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.plot.CategoryPlot : 2867

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 243

Nb of Failing EvoSuite Tests: 243


--- 
#Seed: 11

## Patch 11 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.plot.CategoryPlot : 2866

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 250

Nb of Failing EvoSuite Tests: 250


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 111

Patch type: InsertBeforeOp

```Java

org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data = new org.jfree.data.KeyedObjects2D()

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 73

Nb of Failing EvoSuite Tests: 73


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.plot.CategoryPlot : 2673

Patch type: ReplaceOp

```Java

org.jfree.chart.plot.CategoryPlot.this.annotations = new java.util.ArrayList()

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 240

Nb of Failing EvoSuite Tests: 240


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.plot.CategoryPlot : 2855

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 243

Nb of Failing EvoSuite Tests: 243


--- 
#Seed: 15

## Patch 15 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.plot.CategoryPlot : 3012

Patch type: InsertBeforeOp

```Java

org.jfree.chart.plot.CategoryPlot.this.renderers = new org.jfree.chart.util.ObjectList()

```


Execution Time: 2:16 (hh:mm) 

Nb of EvoSuite Tests: 243

Nb of Failing EvoSuite Tests: 243


--- 
#Seed: 16

## Patch 16 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.plot.CategoryPlot : 2855

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 247

Nb of Failing EvoSuite Tests: 247


--- 
#Seed: 17

## Patch 17 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.plot.CategoryPlot : 2855

Patch type: ReplaceOp

```Java

if (renderer != null) {
	renderer.setPlot(org.jfree.chart.plot.CategoryPlot.this);
	renderer.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
} 

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 232

Nb of Failing EvoSuite Tests: 232


--- 
#Seed: 18

## Patch 18 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.plot.CategoryPlot : 2855

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 253

Nb of Failing EvoSuite Tests: 253


--- 
#Seed: 19

## Patch 19 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.plot.CategoryPlot : 2767

Patch type: InsertBeforeOp

```Java

org.jfree.chart.plot.CategoryPlot.this.renderers = new org.jfree.chart.util.ObjectList()

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 242

Nb of Failing EvoSuite Tests: 242


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

org.jfree.data.general.DatasetUtilities : 577

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 174

Nb of Failing EvoSuite Tests: 174


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.plot.CategoryPlot : 2855

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 245

Nb of Failing EvoSuite Tests: 245


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.plot.CategoryPlot : 2863

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (org.jfree.chart.plot.CategoryPlot.this.renderers.size()) ; i++) {
	drawRangeMarkers(g2, dataArea, i, org.jfree.chart.util.Layer.BACKGROUND);
}

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 218

Nb of Failing EvoSuite Tests: 218


--- 
#Seed: 25

## Patch 23 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.plot.CategoryPlot : 2867

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 242

Nb of Failing EvoSuite Tests: 242


--- 
#Seed: 26

## Patch 24 #  jGenProg+MinImpact With Seed 26

org.jfree.data.KeyedObjects2D : 108

Patch type: InsertBeforeOp

```Java

org.jfree.data.KeyedObjects2D.this.rowKeys = new java.util.ArrayList()

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 52

Nb of Failing EvoSuite Tests: 52


--- 
#Seed: 27

## Patch 25 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.plot.CategoryPlot : 1240

Patch type: InsertBeforeOp

```Java

org.jfree.chart.plot.CategoryPlot.this.renderers = new org.jfree.chart.util.ObjectList()

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 250

Nb of Failing EvoSuite Tests: 250


--- 
#Seed: 28

## Patch 26 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.plot.CategoryPlot : 2867

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.size()) ; i++) {
	org.jfree.chart.axis.ValueAxis yAxis = ((org.jfree.chart.axis.ValueAxis)(org.jfree.chart.plot.CategoryPlot.this.rangeAxes.get(i)));
	if (yAxis != null) {
		yAxis.setPlot(org.jfree.chart.plot.CategoryPlot.this);
		yAxis.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
	} 
}

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 242

Nb of Failing EvoSuite Tests: 242


--- 
#Seed: 29

## Patch 27 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.plot.CategoryPlot : 2864

Patch type: ReplaceOp

```Java

if (!foundData) {
	drawNoDataMessage(g2, dataArea);
} 

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 228

Nb of Failing EvoSuite Tests: 228


--- 
#Seed: 30

## Patch 28 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.plot.CategoryPlot : 2629

Patch type: ReplaceOp

```Java

if ((anchor != null) && (!(dataArea.contains(anchor)))) {
	anchor = null;
} 

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 220

Nb of Failing EvoSuite Tests: 220


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 216.95

Average Nb of Failing EvoSuite Tests: 0.15

---