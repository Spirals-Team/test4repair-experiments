
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



## Patch Original jGenProg 

org.jfree.data.statistics.DefaultStatisticalCategoryDataset:301 (Suspicious rank: ample 65, jaccard 144, ochiai 102, naish1 19848, gp13 65, naish2 65, tarantula 160, )

Patch type: DELETE 
 
```Java
remove
```



--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2672

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 243

Nb of Failing EvoSuite Tests: 0



## Patch 2 #  jGenProg+MinImpact With Seed 1

org.jfree.data.general.DatasetUtilities : 577

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 195

Nb of Failing EvoSuite Tests: 1



## Patch 3 #  jGenProg+MinImpact With Seed 1

org.jfree.data.general.DatasetUtilities : 576

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 195

Nb of Failing EvoSuite Tests: 1



## Patch 4 #  jGenProg+MinImpact With Seed 1

org.jfree.data.general.DatasetUtilities : 574

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 195

Nb of Failing EvoSuite Tests: 1



## Patch 5 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: ReplaceOp

```Java

if (!(data instanceof org.jfree.data.statistics.StatisticalCategoryDataset)) {
	throw new java.lang.IllegalArgumentException("Requires StatisticalCategoryDataset.");
} 

```


Execution Time: 2:02 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 1



## Patch 6 #  jGenProg+MinImpact With Seed 1

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 110

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 67

Nb of Failing EvoSuite Tests: 4



## Patch 7 #  jGenProg+MinImpact With Seed 1

org.jfree.data.KeyedObjects2D : 236

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 14


--- 
#Seed: 2

## Patch 8 #  jGenProg+MinImpact With Seed 2

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2865

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 236

Nb of Failing EvoSuite Tests: 0



## Patch 9 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.plot.CategoryPlot : 2867

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (org.jfree.chart.plot.CategoryPlot.this.renderers.size()) ; i++) {
	drawDomainMarkers(g2, dataArea, i, org.jfree.chart.util.Layer.FOREGROUND);
}

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 236

Nb of Failing EvoSuite Tests: 0



## Patch 10 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.plot.CategoryPlot : 2864

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 236

Nb of Failing EvoSuite Tests: 0



## Patch 11 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.plot.CategoryPlot : 3334

Patch type: InsertAfterOp

```Java

org.jfree.chart.plot.CategoryPlot.this.datasets = new org.jfree.chart.util.ObjectList()

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 236

Nb of Failing EvoSuite Tests: 0



## Patch 12 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.plot.CategoryPlot : 2868

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 236

Nb of Failing EvoSuite Tests: 0



## Patch 13 #  jGenProg+MinImpact With Seed 2

org.jfree.data.KeyedObjects2D : 113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 3



## Patch 14 #  jGenProg+MinImpact With Seed 2

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 113

Patch type: ReplaceOp

```Java

return null

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 11



## Patch 15 #  jGenProg+MinImpact With Seed 2

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 111

Patch type: ReplaceOp

```Java

org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev = java.lang.Double.NaN

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 11



## Patch 16 #  jGenProg+MinImpact With Seed 2

org.jfree.data.KeyedObjects2D : 238

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 18



## Patch 17 #  jGenProg+MinImpact With Seed 2

org.jfree.data.KeyedObjects2D : 239

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 18


--- 
#Seed: 3

## Patch 18 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2864

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 230

Nb of Failing EvoSuite Tests: 0



## Patch 19 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.plot.CategoryPlot : 2673

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 230

Nb of Failing EvoSuite Tests: 0



## Patch 20 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.plot.CategoryPlot : 2673

Patch type: ReplaceOp

```Java

org.jfree.chart.plot.CategoryPlot.this.domainGridlineStroke = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE

```


Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 230

Nb of Failing EvoSuite Tests: 0



## Patch 21 #  jGenProg+MinImpact With Seed 3

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 264

Patch type: ReplaceOp

```Java

return -1

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 66

Nb of Failing EvoSuite Tests: 2



## Patch 22 #  jGenProg+MinImpact With Seed 3

org.jfree.data.KeyedObjects2D : 112

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 4



## Patch 23 #  jGenProg+MinImpact With Seed 3

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 110

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 66

Nb of Failing EvoSuite Tests: 4



## Patch 24 #  jGenProg+MinImpact With Seed 3

org.jfree.data.KeyedObjects2D : 236

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 12



## Patch 25 #  jGenProg+MinImpact With Seed 3

org.jfree.data.KeyedObjects2D : 239

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 18


--- 
#Seed: 4

## Patch 26 #  jGenProg+MinImpact With Seed 4

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2867

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 243

Nb of Failing EvoSuite Tests: 0



## Patch 27 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorStroke) != null) {
	g2.setStroke(org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorStroke);
} else {
	g2.setStroke(getItemOutlineStroke(row, column));
}

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 13

Nb of Failing EvoSuite Tests: 0



## Patch 28 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.plot.CategoryPlot : 2673

Patch type: ReplaceOp

```Java

org.jfree.chart.plot.CategoryPlot.this.domainGridlinesVisible = org.jfree.chart.plot.CategoryPlot.DEFAULT_DOMAIN_GRIDLINES_VISIBLE

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 243

Nb of Failing EvoSuite Tests: 0



## Patch 29 #  jGenProg+MinImpact With Seed 4

org.jfree.data.KeyedObjects2D : 109

Patch type: InsertAfterOp

```Java

org.jfree.data.KeyedObjects2D.this.rowKeys = new java.util.ArrayList()

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 0



## Patch 30 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.plot.CategoryPlot : 2864

Patch type: ReplaceOp

```Java

if (rangeAxis != null) {
	rangeAxis.setPlot(org.jfree.chart.plot.CategoryPlot.this);
	rangeAxis.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
} 

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 243

Nb of Failing EvoSuite Tests: 0



## Patch 31 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.plot.CategoryPlot : 3016

Patch type: InsertBeforeOp

```Java

org.jfree.chart.plot.CategoryPlot.this.renderers = new org.jfree.chart.util.ObjectList()

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 243

Nb of Failing EvoSuite Tests: 0



## Patch 32 #  jGenProg+MinImpact With Seed 4

org.jfree.data.general.DatasetUtilities : 574

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 191

Nb of Failing EvoSuite Tests: 1



## Patch 33 #  jGenProg+MinImpact With Seed 4

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 110

Patch type: RemoveOp

```Java

remove

```


Execution Time: 2:02 (hh:mm) 

Nb of EvoSuite Tests: 73

Nb of Failing EvoSuite Tests: 4



## Patch 34 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.JFreeChart : 1393

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 6


--- 
#Seed: 5

## Patch 35 #  jGenProg+MinImpact With Seed 5

jGenProg+MinImpact returns this patch in the first place

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

Nb of Failing EvoSuite Tests: 0



## Patch 36 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.plot.CategoryPlot : 2866

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 237

Nb of Failing EvoSuite Tests: 0



## Patch 37 #  jGenProg+MinImpact With Seed 5

org.jfree.data.general.DatasetUtilities : 576

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 191

Nb of Failing EvoSuite Tests: 1



## Patch 38 #  jGenProg+MinImpact With Seed 5

org.jfree.data.general.DatasetUtilities : 575

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 191

Nb of Failing EvoSuite Tests: 1



## Patch 39 #  jGenProg+MinImpact With Seed 5

org.jfree.data.KeyedObjects2D : 236

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 14



## Patch 40 #  jGenProg+MinImpact With Seed 5

org.jfree.data.KeyedObjects2D : 239

Patch type: InsertAfterOp

```Java

org.jfree.data.KeyedObjects2D.this.columnKeys = new java.util.ArrayList()

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 16


--- 
#Seed: 6

## Patch 41 #  jGenProg+MinImpact With Seed 6

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2866

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 230

Nb of Failing EvoSuite Tests: 0



## Patch 42 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.plot.CategoryPlot : 2863

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 230

Nb of Failing EvoSuite Tests: 0



## Patch 43 #  jGenProg+MinImpact With Seed 6

org.jfree.data.general.DatasetUtilities : 576

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 156

Nb of Failing EvoSuite Tests: 1



## Patch 44 #  jGenProg+MinImpact With Seed 6

org.jfree.data.statistics.MeanAndStandardDeviation : 95

Patch type: ReplaceOp

```Java

return null

```


Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 2



## Patch 45 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 3



## Patch 46 #  jGenProg+MinImpact With Seed 6

org.jfree.data.KeyedObjects2D : 113

Patch type: ReplaceOp

```Java

org.jfree.data.KeyedObjects2D.this.rowKeys = new java.util.ArrayList()

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 4



## Patch 47 #  jGenProg+MinImpact With Seed 6

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 111

Patch type: ReplaceOp

```Java

org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue = java.lang.Double.NaN

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 4



## Patch 48 #  jGenProg+MinImpact With Seed 6

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 111

Patch type: InsertAfterOp

```Java

return null

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 4



## Patch 49 #  jGenProg+MinImpact With Seed 6

org.jfree.data.KeyedObjects2D : 112

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 7

## Patch 50 #  jGenProg+MinImpact With Seed 7

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2673

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 233

Nb of Failing EvoSuite Tests: 0



## Patch 51 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.plot.CategoryPlot : 2868

Patch type: ReplaceOp

```Java

org.jfree.chart.plot.CategoryPlot.this.renderers.set(index, renderer)

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 233

Nb of Failing EvoSuite Tests: 0



## Patch 52 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.plot.CategoryPlot : 2672

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (org.jfree.chart.plot.CategoryPlot.this.renderers.size()) ; i++) {
	drawRangeMarkers(g2, dataArea, i, org.jfree.chart.util.Layer.FOREGROUND);
}

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 233

Nb of Failing EvoSuite Tests: 0



## Patch 53 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.plot.CategoryPlot : 2867

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (org.jfree.chart.plot.CategoryPlot.this.renderers.size()) ; i++) {
	drawDomainMarkers(g2, dataArea, i, org.jfree.chart.util.Layer.FOREGROUND);
}

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 233

Nb of Failing EvoSuite Tests: 0



## Patch 54 #  jGenProg+MinImpact With Seed 7

org.jfree.data.general.DatasetUtilities : 575

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 170

Nb of Failing EvoSuite Tests: 1



## Patch 55 #  jGenProg+MinImpact With Seed 7

org.jfree.data.general.DatasetUtilities : 574

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 170

Nb of Failing EvoSuite Tests: 1



## Patch 56 #  jGenProg+MinImpact With Seed 7

org.jfree.data.general.DatasetUtilities : 576

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 170

Nb of Failing EvoSuite Tests: 1



## Patch 57 #  jGenProg+MinImpact With Seed 7

org.jfree.data.KeyedObjects2D : 112

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 2



## Patch 58 #  jGenProg+MinImpact With Seed 7

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 110

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 72

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 8

## Patch 59 #  jGenProg+MinImpact With Seed 8

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2865

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 229

Nb of Failing EvoSuite Tests: 0



## Patch 60 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.plot.CategoryPlot : 2673

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 229

Nb of Failing EvoSuite Tests: 0



## Patch 61 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.plot.CategoryPlot : 2868

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 229

Nb of Failing EvoSuite Tests: 0



## Patch 62 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.plot.CategoryPlot : 2864

Patch type: ReplaceOp

```Java

if (info != null) {
	info.setDataArea(dataArea);
} 

```


Execution Time: 2:02 (hh:mm) 

Nb of EvoSuite Tests: 229

Nb of Failing EvoSuite Tests: 0



## Patch 63 #  jGenProg+MinImpact With Seed 8

org.jfree.data.general.DatasetUtilities : 574

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 165

Nb of Failing EvoSuite Tests: 1



## Patch 64 #  jGenProg+MinImpact With Seed 8

org.jfree.data.general.DatasetUtilities : 576

Patch type: ReplaceOp

```Java

if ((rowCount == 0) || (columnCount == 0)) {
	return true;
} 

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 165

Nb of Failing EvoSuite Tests: 1



## Patch 65 #  jGenProg+MinImpact With Seed 8

org.jfree.data.general.DatasetUtilities : 576

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 165

Nb of Failing EvoSuite Tests: 1



## Patch 66 #  jGenProg+MinImpact With Seed 8

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 111

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 4



## Patch 67 #  jGenProg+MinImpact With Seed 8

org.jfree.data.KeyedObjects2D : 238

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 13


--- 
#Seed: 9

## Patch 68 #  jGenProg+MinImpact With Seed 9

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2867

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 241

Nb of Failing EvoSuite Tests: 1



## Patch 69 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.plot.CategoryPlot : 2672

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 241

Nb of Failing EvoSuite Tests: 2



## Patch 70 #  jGenProg+MinImpact With Seed 9

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 111

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 67

Nb of Failing EvoSuite Tests: 3



## Patch 71 #  jGenProg+MinImpact With Seed 9

org.jfree.data.KeyedObjects2D : 113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 4



## Patch 72 #  jGenProg+MinImpact With Seed 9

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 301

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 67

Nb of Failing EvoSuite Tests: 30


--- 
#Seed: 10

## Patch 73 #  jGenProg+MinImpact With Seed 10

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2867

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 243

Nb of Failing EvoSuite Tests: 0



## Patch 74 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.plot.CategoryPlot : 2866

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 243

Nb of Failing EvoSuite Tests: 0



## Patch 75 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.plot.CategoryPlot : 2532

Patch type: ReplaceOp

```Java

org.jfree.chart.plot.CategoryPlot.this.renderers = new org.jfree.chart.util.ObjectList()

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 243

Nb of Failing EvoSuite Tests: 0



## Patch 76 #  jGenProg+MinImpact With Seed 10

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 264

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 1



## Patch 77 #  jGenProg+MinImpact With Seed 10

org.jfree.data.KeyedObjects2D : 239

Patch type: RemoveOp

```Java

remove

```


Execution Time: 2:02 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 18


--- 
#Seed: 11

## Patch 78 #  jGenProg+MinImpact With Seed 11

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2866

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 250

Nb of Failing EvoSuite Tests: 0



## Patch 79 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.plot.CategoryPlot : 2865

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (org.jfree.chart.plot.CategoryPlot.this.domainAxes.size()) ; i++) {
	org.jfree.chart.axis.CategoryAxis xAxis = ((org.jfree.chart.axis.CategoryAxis)(org.jfree.chart.plot.CategoryPlot.this.domainAxes.get(i)));
	if (xAxis != null) {
		xAxis.setPlot(org.jfree.chart.plot.CategoryPlot.this);
		xAxis.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
	} 
}

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 250

Nb of Failing EvoSuite Tests: 0



## Patch 80 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 15

Nb of Failing EvoSuite Tests: 0



## Patch 81 #  jGenProg+MinImpact With Seed 11

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 111

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 3



## Patch 82 #  jGenProg+MinImpact With Seed 11

org.jfree.data.statistics.MeanAndStandardDeviation : 95

Patch type: ReplaceOp

```Java

return null

```


Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 3



## Patch 83 #  jGenProg+MinImpact With Seed 11

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 110

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 3



## Patch 84 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.JFreeChart : 1393

Patch type: ReplaceOp

```Java

notifyListeners(new org.jfree.chart.event.ChartProgressEvent(org.jfree.chart.JFreeChart.this , org.jfree.chart.JFreeChart.this , org.jfree.chart.event.ChartProgressEvent.DRAWING_STARTED , 0))

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 5



## Patch 85 #  jGenProg+MinImpact With Seed 11

org.jfree.data.KeyedObjects2D : 236

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 11


--- 
#Seed: 12

## Patch 86 #  jGenProg+MinImpact With Seed 12

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 111

Patch type: InsertBeforeOp

```Java

org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data = new org.jfree.data.KeyedObjects2D()

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 73

Nb of Failing EvoSuite Tests: 0



## Patch 87 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.plot.CategoryPlot : 2868

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 245

Nb of Failing EvoSuite Tests: 0



## Patch 88 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.plot.CategoryPlot : 3334

Patch type: InsertBeforeOp

```Java

org.jfree.chart.plot.CategoryPlot.this.renderers = new org.jfree.chart.util.ObjectList()

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 245

Nb of Failing EvoSuite Tests: 0



## Patch 89 #  jGenProg+MinImpact With Seed 12

org.jfree.data.general.DatasetUtilities : 577

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 183

Nb of Failing EvoSuite Tests: 1



## Patch 90 #  jGenProg+MinImpact With Seed 12

org.jfree.data.general.DatasetUtilities : 577

Patch type: RemoveOp

```Java

remove

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 183

Nb of Failing EvoSuite Tests: 1



## Patch 91 #  jGenProg+MinImpact With Seed 12

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 111

Patch type: ReplaceOp

```Java

org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue = java.lang.Double.NaN

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 73

Nb of Failing EvoSuite Tests: 6


--- 
#Seed: 13

## Patch 92 #  jGenProg+MinImpact With Seed 13

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2673

Patch type: ReplaceOp

```Java

org.jfree.chart.plot.CategoryPlot.this.annotations = new java.util.ArrayList()

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 240

Nb of Failing EvoSuite Tests: 0



## Patch 93 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.plot.CategoryPlot : 3332

Patch type: InsertBeforeOp

```Java

org.jfree.chart.plot.CategoryPlot.this.datasets = new org.jfree.chart.util.ObjectList()

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 240

Nb of Failing EvoSuite Tests: 0



## Patch 94 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 1



## Patch 95 #  jGenProg+MinImpact With Seed 13

org.jfree.data.KeyedObjects2D : 113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 4



## Patch 96 #  jGenProg+MinImpact With Seed 13

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 111

Patch type: ReplaceOp

```Java

org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev = java.lang.Double.NaN

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 5



## Patch 97 #  jGenProg+MinImpact With Seed 13

org.jfree.data.KeyedObjects2D : 238

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 18


--- 
#Seed: 14

## Patch 98 #  jGenProg+MinImpact With Seed 14

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2855

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 243

Nb of Failing EvoSuite Tests: 1



## Patch 99 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 2



## Patch 100 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorStroke) != null) {
	g2.setStroke(org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorStroke);
} else {
	g2.setStroke(getItemOutlineStroke(row, column));
}

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 2



## Patch 101 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.plot.CategoryPlot : 1756

Patch type: InsertAfterOp

```Java

org.jfree.chart.plot.CategoryPlot.this.datasets = new org.jfree.chart.util.ObjectList()

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 243

Nb of Failing EvoSuite Tests: 2



## Patch 102 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 2



## Patch 103 #  jGenProg+MinImpact With Seed 14

org.jfree.data.KeyedObjects2D : 110

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 4



## Patch 104 #  jGenProg+MinImpact With Seed 14

org.jfree.data.KeyedObjects2D : 238

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 15


--- 
#Seed: 15

## Patch 105 #  jGenProg+MinImpact With Seed 15

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 3012

Patch type: InsertBeforeOp

```Java

org.jfree.chart.plot.CategoryPlot.this.renderers = new org.jfree.chart.util.ObjectList()

```


Execution Time: 2:16 (hh:mm) 

Nb of EvoSuite Tests: 243

Nb of Failing EvoSuite Tests: 0



## Patch 106 #  jGenProg+MinImpact With Seed 15

org.jfree.data.general.DatasetUtilities : 574

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 194

Nb of Failing EvoSuite Tests: 2



## Patch 107 #  jGenProg+MinImpact With Seed 15

org.jfree.data.general.DatasetUtilities : 575

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 194

Nb of Failing EvoSuite Tests: 2



## Patch 108 #  jGenProg+MinImpact With Seed 15

org.jfree.data.KeyedObjects2D : 113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 4



## Patch 109 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.JFreeChart : 1393

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 4



## Patch 110 #  jGenProg+MinImpact With Seed 15

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 301

Patch type: ReplaceOp

```Java

fireDatasetChanged()

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 66

Nb of Failing EvoSuite Tests: 30



## Patch 111 #  jGenProg+MinImpact With Seed 15

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 301

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 66

Nb of Failing EvoSuite Tests: 30


--- 
#Seed: 16

## Patch 112 #  jGenProg+MinImpact With Seed 16

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2855

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 247

Nb of Failing EvoSuite Tests: 0



## Patch 113 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.plot.CategoryPlot : 2629

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 247

Nb of Failing EvoSuite Tests: 0



## Patch 114 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.plot.CategoryPlot : 2863

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 247

Nb of Failing EvoSuite Tests: 0



## Patch 115 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.plot.CategoryPlot : 2673

Patch type: ReplaceOp

```Java

foundData = true

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 247

Nb of Failing EvoSuite Tests: 0



## Patch 116 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.plot.CategoryPlot : 2867

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 247

Nb of Failing EvoSuite Tests: 0



## Patch 117 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 118 #  jGenProg+MinImpact With Seed 16

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 126

Patch type: ReplaceOp

```Java

return null

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 3



## Patch 119 #  jGenProg+MinImpact With Seed 16

org.jfree.data.KeyedObjects2D : 113

Patch type: ReplaceOp

```Java

org.jfree.data.KeyedObjects2D.this.rowKeys = new java.util.ArrayList()

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 17

## Patch 120 #  jGenProg+MinImpact With Seed 17

jGenProg+MinImpact returns this patch in the first place

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

Nb of Failing EvoSuite Tests: 0



## Patch 121 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.plot.CategoryPlot : 2867

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 232

Nb of Failing EvoSuite Tests: 0



## Patch 122 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.plot.CategoryPlot : 2629

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 232

Nb of Failing EvoSuite Tests: 0



## Patch 123 #  jGenProg+MinImpact With Seed 17

org.jfree.data.general.DatasetUtilities : 576

Patch type: ReplaceOp

```Java

if ((rowCount == 0) || (columnCount == 0)) {
	return true;
} 

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 176

Nb of Failing EvoSuite Tests: 1



## Patch 124 #  jGenProg+MinImpact With Seed 17

org.jfree.data.general.DatasetUtilities : 576

Patch type: RemoveOp

```Java

remove

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 176

Nb of Failing EvoSuite Tests: 1



## Patch 125 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 2



## Patch 126 #  jGenProg+MinImpact With Seed 17

org.jfree.data.KeyedObjects2D : 113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 52

Nb of Failing EvoSuite Tests: 4



## Patch 127 #  jGenProg+MinImpact With Seed 17

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 111

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 6



## Patch 128 #  jGenProg+MinImpact With Seed 17

org.jfree.data.KeyedObjects2D : 238

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 52

Nb of Failing EvoSuite Tests: 18


--- 
#Seed: 18

## Patch 129 #  jGenProg+MinImpact With Seed 18

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2855

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 253

Nb of Failing EvoSuite Tests: 0



## Patch 130 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.plot.CategoryPlot : 2629

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 253

Nb of Failing EvoSuite Tests: 0



## Patch 131 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.plot.CategoryPlot : 2672

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 253

Nb of Failing EvoSuite Tests: 0



## Patch 132 #  jGenProg+MinImpact With Seed 18

org.jfree.data.general.DatasetUtilities : 577

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 172

Nb of Failing EvoSuite Tests: 1



## Patch 133 #  jGenProg+MinImpact With Seed 18

org.jfree.data.KeyedObjects2D : 113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 52

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 19

## Patch 134 #  jGenProg+MinImpact With Seed 19

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2767

Patch type: InsertBeforeOp

```Java

org.jfree.chart.plot.CategoryPlot.this.renderers = new org.jfree.chart.util.ObjectList()

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 242

Nb of Failing EvoSuite Tests: 0



## Patch 135 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.plot.CategoryPlot : 2672

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 242

Nb of Failing EvoSuite Tests: 0



## Patch 136 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.plot.CategoryPlot : 2866

Patch type: ReplaceOp

```Java

if (isRangeCrosshairVisible()) {
	drawRangeCrosshair(g2, dataArea, getOrientation(), getRangeCrosshairValue(), getRangeAxis(), getRangeCrosshairStroke(), getRangeCrosshairPaint());
} 

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 242

Nb of Failing EvoSuite Tests: 0



## Patch 137 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.plot.CategoryPlot : 2855

Patch type: ReplaceOp

```Java

if (rangeAxis != null) {
	rangeAxis.configure();
} 

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 242

Nb of Failing EvoSuite Tests: 0



## Patch 138 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.plot.CategoryPlot : 2006

Patch type: InsertBeforeOp

```Java

org.jfree.chart.plot.CategoryPlot.this.renderers = new org.jfree.chart.util.ObjectList()

```


Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 242

Nb of Failing EvoSuite Tests: 0



## Patch 139 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.JFreeChart : 1393

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 6



## Patch 140 #  jGenProg+MinImpact With Seed 19

org.jfree.data.KeyedObjects2D : 238

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 18



## Patch 141 #  jGenProg+MinImpact With Seed 19

org.jfree.data.KeyedObjects2D : 239

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 18


--- 
#Seed: 20

## Patch 142 #  jGenProg+MinImpact With Seed 20

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.general.DatasetUtilities : 577

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 174

Nb of Failing EvoSuite Tests: 1



## Patch 143 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.plot.CategoryPlot : 2000

Patch type: InsertAfterOp

```Java

org.jfree.chart.plot.CategoryPlot.this.datasets = new org.jfree.chart.util.ObjectList()

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 244

Nb of Failing EvoSuite Tests: 2



## Patch 144 #  jGenProg+MinImpact With Seed 20

org.jfree.data.KeyedObjects2D : 113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 4



## Patch 145 #  jGenProg+MinImpact With Seed 20

org.jfree.data.KeyedObjects2D : 95

Patch type: ReplaceOp

```Java

return 1

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 6



## Patch 146 #  jGenProg+MinImpact With Seed 20

org.jfree.data.KeyedObjects2D : 239

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 17



## Patch 147 #  jGenProg+MinImpact With Seed 20

org.jfree.data.KeyedObjects2D : 238

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 17



## Patch 148 #  jGenProg+MinImpact With Seed 20

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 301

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 32


--- 
#Seed: 21

## Patch 149 #  jGenProg+MinImpact With Seed 21

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2855

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 245

Nb of Failing EvoSuite Tests: 0



## Patch 150 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.plot.CategoryPlot : 2864

Patch type: ReplaceOp

```Java

if (renderer != null) {
	renderer.setPlot(org.jfree.chart.plot.CategoryPlot.this);
	renderer.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
} 

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 245

Nb of Failing EvoSuite Tests: 0



## Patch 151 #  jGenProg+MinImpact With Seed 21

org.jfree.data.KeyedObjects2D : 112

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 52

Nb of Failing EvoSuite Tests: 4



## Patch 152 #  jGenProg+MinImpact With Seed 21

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 301

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 72

Nb of Failing EvoSuite Tests: 35


--- 
#Seed: 22

## Patch 153 #  jGenProg+MinImpact With Seed 22

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2863

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (org.jfree.chart.plot.CategoryPlot.this.renderers.size()) ; i++) {
	drawRangeMarkers(g2, dataArea, i, org.jfree.chart.util.Layer.BACKGROUND);
}

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 218

Nb of Failing EvoSuite Tests: 0



## Patch 154 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.plot.CategoryPlot : 2806

Patch type: ReplaceOp

```Java

org.jfree.chart.plot.CategoryPlot.this.renderers = new org.jfree.chart.util.ObjectList()

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 218

Nb of Failing EvoSuite Tests: 0



## Patch 155 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.plot.CategoryPlot : 2855

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 218

Nb of Failing EvoSuite Tests: 0



## Patch 156 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.plot.CategoryPlot : 2855

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.plot.CategoryPlot.this.backgroundDomainMarkers) != null) {
	java.util.Set keys = org.jfree.chart.plot.CategoryPlot.this.backgroundDomainMarkers.keySet();
	java.util.Iterator iterator = keys.iterator();
	while (iterator.hasNext()) {
		java.lang.Integer key = ((java.lang.Integer)(iterator.next()));
		clearDomainMarkers(key.intValue());
	}
	org.jfree.chart.plot.CategoryPlot.this.backgroundDomainMarkers.clear();
} 

```


Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 218

Nb of Failing EvoSuite Tests: 0



## Patch 157 #  jGenProg+MinImpact With Seed 22

org.jfree.data.general.DatasetUtilities : 576

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 191

Nb of Failing EvoSuite Tests: 1



## Patch 158 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 2



## Patch 159 #  jGenProg+MinImpact With Seed 22

org.jfree.data.KeyedObjects2D : 236

Patch type: ReplaceOp

```Java

org.jfree.data.KeyedObjects2D.this.rows.add(row)

```


Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 52

Nb of Failing EvoSuite Tests: 14



## Patch 160 #  jGenProg+MinImpact With Seed 22

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 301

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 32


--- 
#Seed: 23

## Patch 161 #  jGenProg+MinImpact With Seed 23

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 162 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.plot.CategoryPlot : 2867

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 232

Nb of Failing EvoSuite Tests: 0



## Patch 163 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.plot.CategoryPlot : 2863

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 232

Nb of Failing EvoSuite Tests: 0



## Patch 164 #  jGenProg+MinImpact With Seed 23

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 110

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 2



## Patch 165 #  jGenProg+MinImpact With Seed 23

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 301

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 34



## Patch 166 #  jGenProg+MinImpact With Seed 23

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 325

Patch type: InsertBeforeOp

```Java

org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data = new org.jfree.data.KeyedObjects2D()

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 34


--- 
#Seed: 24

## Patch 167 #  jGenProg+MinImpact With Seed 24

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2855

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 232

Nb of Failing EvoSuite Tests: 0



## Patch 168 #  jGenProg+MinImpact With Seed 24

org.jfree.chart.plot.CategoryPlot : 2672

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 232

Nb of Failing EvoSuite Tests: 0



## Patch 169 #  jGenProg+MinImpact With Seed 24

org.jfree.data.general.DatasetUtilities : 577

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 192

Nb of Failing EvoSuite Tests: 1



## Patch 170 #  jGenProg+MinImpact With Seed 24

org.jfree.chart.JFreeChart : 1393

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 117

Nb of Failing EvoSuite Tests: 2



## Patch 171 #  jGenProg+MinImpact With Seed 24

org.jfree.data.KeyedObjects2D : 112

Patch type: ReplaceOp

```Java

if (columnKey == null) {
	throw new java.lang.IllegalArgumentException("Null 'columnKey' argument.");
} 

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 6



## Patch 172 #  jGenProg+MinImpact With Seed 24

org.jfree.data.KeyedObjects2D : 239

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 16


--- 
#Seed: 25

## Patch 173 #  jGenProg+MinImpact With Seed 25

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2867

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 242

Nb of Failing EvoSuite Tests: 0



## Patch 174 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.plot.CategoryPlot : 2863

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (org.jfree.chart.plot.CategoryPlot.this.domainAxes.size()) ; i++) {
	org.jfree.chart.axis.CategoryAxis axis = ((org.jfree.chart.axis.CategoryAxis)(org.jfree.chart.plot.CategoryPlot.this.domainAxes.get(i)));
	if (axis != null) {
		axis.removeChangeListener(org.jfree.chart.plot.CategoryPlot.this);
	} 
}

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 242

Nb of Failing EvoSuite Tests: 0



## Patch 175 #  jGenProg+MinImpact With Seed 25

org.jfree.data.general.DatasetUtilities : 576

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 184

Nb of Failing EvoSuite Tests: 1



## Patch 176 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.renderer.category.StatisticalBarRenderer : 207

Patch type: ReplaceOp

```Java

if (!(data instanceof org.jfree.data.statistics.StatisticalCategoryDataset)) {
	throw new java.lang.IllegalArgumentException("Requires StatisticalCategoryDataset.");
} 

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 13

Nb of Failing EvoSuite Tests: 1



## Patch 177 #  jGenProg+MinImpact With Seed 25

org.jfree.data.KeyedObjects2D : 86

Patch type: ReplaceOp

```Java

return -1

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 7



## Patch 178 #  jGenProg+MinImpact With Seed 25

org.jfree.data.KeyedObjects2D : 238

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 15


--- 
#Seed: 26

## Patch 179 #  jGenProg+MinImpact With Seed 26

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.KeyedObjects2D : 108

Patch type: InsertBeforeOp

```Java

org.jfree.data.KeyedObjects2D.this.rowKeys = new java.util.ArrayList()

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 52

Nb of Failing EvoSuite Tests: 0



## Patch 180 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.plot.CategoryPlot : 2673

Patch type: ReplaceOp

```Java

org.jfree.chart.plot.CategoryPlot.this.datasetToRangeAxisMap = new org.jfree.chart.util.ObjectList()

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 231

Nb of Failing EvoSuite Tests: 0



## Patch 181 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.plot.CategoryPlot : 2868

Patch type: ReplaceOp

```Java

org.jfree.chart.plot.CategoryPlot.this.axisOffset.trim(dataArea)

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 231

Nb of Failing EvoSuite Tests: 0



## Patch 182 #  jGenProg+MinImpact With Seed 26

org.jfree.data.general.DatasetUtilities : 574

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 164

Nb of Failing EvoSuite Tests: 1



## Patch 183 #  jGenProg+MinImpact With Seed 26

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 301

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 74

Nb of Failing EvoSuite Tests: 38


--- 
#Seed: 27

## Patch 184 #  jGenProg+MinImpact With Seed 27

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 1240

Patch type: InsertBeforeOp

```Java

org.jfree.chart.plot.CategoryPlot.this.renderers = new org.jfree.chart.util.ObjectList()

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 250

Nb of Failing EvoSuite Tests: 0



## Patch 185 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.plot.CategoryPlot : 2470

Patch type: InsertBeforeOp

```Java

org.jfree.chart.plot.CategoryPlot.this.renderers = new org.jfree.chart.util.ObjectList()

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 250

Nb of Failing EvoSuite Tests: 0



## Patch 186 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.plot.CategoryPlot : 2866

Patch type: ReplaceOp

```Java

if (rangeAxis != null) {
	rangeAxis.configure();
} 

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 250

Nb of Failing EvoSuite Tests: 0



## Patch 187 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.plot.CategoryPlot : 2867

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 250

Nb of Failing EvoSuite Tests: 0



## Patch 188 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.plot.CategoryPlot : 2960

Patch type: InsertAfterOp

```Java

org.jfree.chart.plot.CategoryPlot.this.datasets = new org.jfree.chart.util.ObjectList()

```


Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 250

Nb of Failing EvoSuite Tests: 1



## Patch 189 #  jGenProg+MinImpact With Seed 27

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 301

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 75

Nb of Failing EvoSuite Tests: 37


--- 
#Seed: 28

## Patch 190 #  jGenProg+MinImpact With Seed 28

jGenProg+MinImpact returns this patch in the first place

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

Nb of Failing EvoSuite Tests: 0



## Patch 191 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.plot.CategoryPlot : 2867

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 242

Nb of Failing EvoSuite Tests: 0



## Patch 192 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.plot.CategoryPlot : 2629

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 242

Nb of Failing EvoSuite Tests: 0



## Patch 193 #  jGenProg+MinImpact With Seed 28

org.jfree.data.general.DatasetUtilities : 576

Patch type: ReplaceOp

```Java

if ((rowCount == 0) || (columnCount == 0)) {
	return true;
} 

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 194

Nb of Failing EvoSuite Tests: 1



## Patch 194 #  jGenProg+MinImpact With Seed 28

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 110

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 72

Nb of Failing EvoSuite Tests: 4



## Patch 195 #  jGenProg+MinImpact With Seed 28

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 126

Patch type: ReplaceOp

```Java

return null

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 72

Nb of Failing EvoSuite Tests: 5



## Patch 196 #  jGenProg+MinImpact With Seed 28

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 318

Patch type: InsertAfterOp

```Java

org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data = new org.jfree.data.KeyedObjects2D()

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 72

Nb of Failing EvoSuite Tests: 34


--- 
#Seed: 29

## Patch 197 #  jGenProg+MinImpact With Seed 29

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2864

Patch type: ReplaceOp

```Java

if (!foundData) {
	drawNoDataMessage(g2, dataArea);
} 

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 228

Nb of Failing EvoSuite Tests: 0



## Patch 198 #  jGenProg+MinImpact With Seed 29

org.jfree.data.general.DatasetUtilities : 576

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 173

Nb of Failing EvoSuite Tests: 1



## Patch 199 #  jGenProg+MinImpact With Seed 29

org.jfree.data.general.DatasetUtilities : 574

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 173

Nb of Failing EvoSuite Tests: 1



## Patch 200 #  jGenProg+MinImpact With Seed 29

org.jfree.data.KeyedObjects2D : 95

Patch type: ReplaceOp

```Java

return 1

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 3



## Patch 201 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.JFreeChart : 1393

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 6


--- 
#Seed: 30

## Patch 202 #  jGenProg+MinImpact With Seed 30

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.CategoryPlot : 2629

Patch type: ReplaceOp

```Java

if ((anchor != null) && (!(dataArea.contains(anchor)))) {
	anchor = null;
} 

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 220

Nb of Failing EvoSuite Tests: 0



## Patch 203 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.plot.CategoryPlot : 2855

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 220

Nb of Failing EvoSuite Tests: 0



## Patch 204 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.plot.CategoryPlot : 2855

Patch type: ReplaceOp

```Java

if (info != null) {
	info.setDataArea(dataArea);
} 

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 220

Nb of Failing EvoSuite Tests: 0



## Patch 205 #  jGenProg+MinImpact With Seed 30

org.jfree.data.KeyedObjects2D : 111

Patch type: InsertAfterOp

```Java

org.jfree.data.KeyedObjects2D.this.rowKeys = new java.util.ArrayList()

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 52

Nb of Failing EvoSuite Tests: 1



## Patch 206 #  jGenProg+MinImpact With Seed 30

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 111

Patch type: InsertAfterOp

```Java

return null

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 3



## Patch 207 #  jGenProg+MinImpact With Seed 30

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 110

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 3



## Patch 208 #  jGenProg+MinImpact With Seed 30

org.jfree.data.KeyedObjects2D : 110

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 52

Nb of Failing EvoSuite Tests: 4



## Patch 209 #  jGenProg+MinImpact With Seed 30

org.jfree.data.statistics.DefaultStatisticalCategoryDataset : 301

Patch type: ReplaceOp

```Java

fireDatasetChanged()

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 32


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 144.56

Average Nb of Failing EvoSuite Tests: 4.69

Average Nb of Test-adequate patches: 6.97

---