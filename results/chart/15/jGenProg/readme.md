
##Original Patch 

```Java
diff --git a/source/org/jfree/chart/plot/PiePlot.java b/source/org/jfree/chart/plot/PiePlot.java
index 7c3cd04..f575e72 100644
--- a/source/org/jfree/chart/plot/PiePlot.java
+++ b/source/org/jfree/chart/plot/PiePlot.java
@@ -1375,9 +1375,6 @@ public class PiePlot extends Plot implements Cloneable, Serializable {
      * @return The percent.
      */
     public double getMaximumExplodePercent() {
+        if (this.dataset == null) {
+            return 0.0;
+        }
         double result = 0.0;
         Iterator iterator = this.dataset.getKeys().iterator();
         while (iterator.hasNext()) {
@@ -2051,10 +2048,8 @@ public class PiePlot extends Plot implements Cloneable, Serializable {
      
         PiePlotState state = new PiePlotState(info);
         state.setPassesRequired(2);
+        if (this.dataset != null) {
             state.setTotal(DatasetUtilities.calculatePieDatasetTotal(
                     plot.getDataset()));
+        }
         state.setLatestAngle(plot.getStartAngle());
         return state;
         
```

## Patch Original jGenProg 

org.jfree.chart.JFreeChart:1219 (Suspicious rank: ample 457, jaccard 457, ochiai 333, naish1 21756, gp13 457, naish2 457, tarantula 457, )

Patch type: REPLACE 
 
```Java
fireChartChanged()
```



--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.PiePlot3D : 247

Patch type: ReplaceOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 12

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 2
--- 
#Seed: 3

## Patch 2 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1219

Patch type: ReplaceOp

```Java

removeSubtitle(getLegend())

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 116

Nb of Failing EvoSuite Tests: 2



## Patch 3 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 116

Nb of Failing EvoSuite Tests: 2



## Patch 4 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.plot.PiePlot3D : 247

Patch type: ReplaceOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 2:03 (hh:mm) 

Nb of EvoSuite Tests: 15

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 4

## Patch 5 #  jGenProg+MinImpact With Seed 4

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.PiePlot3D : 266

Patch type: InsertBeforeOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 15

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 5

## Patch 6 #  jGenProg+MinImpact With Seed 5

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.PiePlot3D : 252

Patch type: InsertAfterOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 6

## Patch 7 #  jGenProg+MinImpact With Seed 6

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.PiePlot3D : 252

Patch type: InsertBeforeOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 1



## Patch 8 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 117

Nb of Failing EvoSuite Tests: 2



## Patch 9 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.JFreeChart : 1219

Patch type: ReplaceOp

```Java

g2.clip(chartArea)

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 117

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 8

## Patch 10 #  jGenProg+MinImpact With Seed 8

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 5


--- 
#Seed: 9

## Patch 11 #  jGenProg+MinImpact With Seed 9

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 3



## Patch 12 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.JFreeChart : 1219

Patch type: ReplaceOp

```Java

g2.setPaintMode()

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 10

## Patch 13 #  jGenProg+MinImpact With Seed 10

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.PiePlot3D : 272

Patch type: ReplaceOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 1



## Patch 14 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 12

## Patch 15 #  jGenProg+MinImpact With Seed 12

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1219

Patch type: ReplaceOp

```Java

org.jfree.chart.JFreeChart.this.subtitles.clear()

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 2



## Patch 16 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.JFreeChart : 1207

Patch type: InsertAfterOp

```Java

return 

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 13

## Patch 17 #  jGenProg+MinImpact With Seed 13

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 116

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 14

## Patch 18 #  jGenProg+MinImpact With Seed 14

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.PiePlot3D : 266

Patch type: InsertBeforeOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 15

## Patch 19 #  jGenProg+MinImpact With Seed 15

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.PiePlot3D : 272

Patch type: ReplaceOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 1



## Patch 20 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.plot.PiePlot3D : 246

Patch type: InsertBeforeOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 16

## Patch 21 #  jGenProg+MinImpact With Seed 16

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.PiePlot3D : 252

Patch type: InsertBeforeOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 0



## Patch 22 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.plot.PiePlot3D : 242

Patch type: InsertAfterOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 0



## Patch 23 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.plot.PiePlot3D : 247

Patch type: ReplaceOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 0



## Patch 24 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.plot.PiePlot3D : 247

Patch type: InsertBeforeOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 0



## Patch 25 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Execution Time: 2:05 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 6


--- 
#Seed: 17

## Patch 26 #  jGenProg+MinImpact With Seed 17

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1219

Patch type: ReplaceOp

```Java

g2.setXORMode(java.awt.Color.orange)

```


Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 19

## Patch 27 #  jGenProg+MinImpact With Seed 19

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.PiePlot3D : 252

Patch type: InsertBeforeOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 20

## Patch 28 #  jGenProg+MinImpact With Seed 20

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.PiePlot3D : 247

Patch type: ReplaceOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 21
--- 
#Seed: 22

## Patch 29 #  jGenProg+MinImpact With Seed 22

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.PiePlot3D : 247

Patch type: ReplaceOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 0



## Patch 30 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.JFreeChart : 1219

Patch type: ReplaceOp

```Java

setTextAntiAlias(java.awt.RenderingHints.VALUE_TEXT_ANTIALIAS_OFF)

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 3



## Patch 31 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 23

## Patch 32 #  jGenProg+MinImpact With Seed 23

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.PiePlot3D : 252

Patch type: InsertAfterOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 24

## Patch 33 #  jGenProg+MinImpact With Seed 24

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 25

## Patch 34 #  jGenProg+MinImpact With Seed 25

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.PiePlot3D : 272

Patch type: ReplaceOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 12

Nb of Failing EvoSuite Tests: 1



## Patch 35 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.plot.PiePlot3D : 247

Patch type: ReplaceOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 12

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 26

## Patch 36 #  jGenProg+MinImpact With Seed 26

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1219

Patch type: ReplaceOp

```Java

org.jfree.chart.JFreeChart.this.subtitles.remove(title)

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 28

## Patch 37 #  jGenProg+MinImpact With Seed 28

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.plot.PiePlot3D : 268

Patch type: InsertBeforeOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 1



## Patch 38 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 116

Nb of Failing EvoSuite Tests: 1



## Patch 39 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.plot.PiePlot3D : 272

Patch type: ReplaceOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 29

## Patch 40 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.plot.PiePlot3D : 272

Patch type: ReplaceOp

```Java

if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
	drawNoDataMessage(g2, plotArea);
	g2.setClip(savedClip);
	drawOutline(g2, plotArea);
	return ;
} 

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 12

Nb of Failing EvoSuite Tests: 1


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 57.84

Average Nb of Failing EvoSuite Tests: 1.63

Average Nb of Test-adequate patches: 1.72

---