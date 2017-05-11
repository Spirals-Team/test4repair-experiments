
##Human Patch 

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

org.jfree.chart.JFreeChart:1219 

Patch type: ReplaceOp 
 
```Java
fireChartChanged()
```

Execution Time: 0:02 (hh:mm)

--- 


## Patch 1 #  jGenProg+MinImpact 

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


Seed: 1

Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 12

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 2 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1219

Patch type: ReplaceOp

```Java

removeSubtitle(getLegend())

```


Seed: 3

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 116

Nb of Failing EvoSuite Tests: 2



## Patch 3 #  jGenProg+MinImpact 

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Seed: 3

Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 116

Nb of Failing EvoSuite Tests: 2



## Patch 4 #  jGenProg+MinImpact 

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


Seed: 3

Execution Time: 2:03 (hh:mm) 

Nb of EvoSuite Tests: 15

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 5 #  jGenProg+MinImpact 

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


Seed: 4

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 15

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 6 #  jGenProg+MinImpact 

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


Seed: 5

Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 7 #  jGenProg+MinImpact 

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


Seed: 6

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 1



## Patch 8 #  jGenProg+MinImpact 

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 117

Nb of Failing EvoSuite Tests: 2



## Patch 9 #  jGenProg+MinImpact 

org.jfree.chart.JFreeChart : 1219

Patch type: ReplaceOp

```Java

g2.clip(chartArea)

```


Seed: 6

Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 117

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 10 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 5


--- 


## Patch 11 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 3



## Patch 12 #  jGenProg+MinImpact 

org.jfree.chart.JFreeChart : 1219

Patch type: ReplaceOp

```Java

g2.setPaintMode()

```


Seed: 9

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 13 #  jGenProg+MinImpact 

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


Seed: 10

Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 1



## Patch 14 #  jGenProg+MinImpact 

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Seed: 10

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 15 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1219

Patch type: ReplaceOp

```Java

org.jfree.chart.JFreeChart.this.subtitles.clear()

```


Seed: 12

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 2



## Patch 16 #  jGenProg+MinImpact 

org.jfree.chart.JFreeChart : 1207

Patch type: InsertAfterOp

```Java

return 

```


Seed: 12

Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 17 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 116

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 18 #  jGenProg+MinImpact 

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


Seed: 14

Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 19 #  jGenProg+MinImpact 

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


Seed: 15

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 1



## Patch 20 #  jGenProg+MinImpact 

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


Seed: 15

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 21 #  jGenProg+MinImpact 

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


Seed: 16

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 0



## Patch 22 #  jGenProg+MinImpact 

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


Seed: 16

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 0



## Patch 23 #  jGenProg+MinImpact 

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


Seed: 16

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 0



## Patch 24 #  jGenProg+MinImpact 

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


Seed: 16

Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 0



## Patch 25 #  jGenProg+MinImpact 

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 2:05 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 6


--- 


## Patch 26 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1219

Patch type: ReplaceOp

```Java

g2.setXORMode(java.awt.Color.orange)

```


Seed: 17

Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 27 #  jGenProg+MinImpact 

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


Seed: 19

Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 28 #  jGenProg+MinImpact 

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


Seed: 20

Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 2


--- 

--- 


## Patch 29 #  jGenProg+MinImpact 

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


Seed: 22

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 0



## Patch 30 #  jGenProg+MinImpact 

org.jfree.chart.JFreeChart : 1219

Patch type: ReplaceOp

```Java

setTextAntiAlias(java.awt.RenderingHints.VALUE_TEXT_ANTIALIAS_OFF)

```


Seed: 22

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 3



## Patch 31 #  jGenProg+MinImpact 

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Seed: 22

Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 32 #  jGenProg+MinImpact 

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


Seed: 23

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 33 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 34 #  jGenProg+MinImpact 

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


Seed: 25

Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 12

Nb of Failing EvoSuite Tests: 1



## Patch 35 #  jGenProg+MinImpact 

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


Seed: 25

Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 12

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 36 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1219

Patch type: ReplaceOp

```Java

org.jfree.chart.JFreeChart.this.subtitles.remove(title)

```


Seed: 26

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 37 #  jGenProg+MinImpact 

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


Seed: 28

Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 1



## Patch 38 #  jGenProg+MinImpact 

org.jfree.chart.JFreeChart : 1219

Patch type: RemoveOp

```Java

remove

```


Seed: 28

Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 116

Nb of Failing EvoSuite Tests: 1



## Patch 39 #  jGenProg+MinImpact 

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


Seed: 28

Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 40 #  jGenProg+MinImpact 

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


Seed: 29

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 12

Nb of Failing EvoSuite Tests: 1


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 57.84

Average Nb of Failing EvoSuite Tests: 1.63

Average Nb of Test-adequate patches: 1.72

Running jGenProg + MinImpact changes the original patch for each of the 30 seeds. The human patch adds code to check whether this.dataset equates to null and what to do if so. The original patch and the newly generated patches by running jGenProg + MinImpact seem to be irrelevant to the human change. We think they change the program just to make the failing test pass and are incorrect. Note for some seeds, running jGenProg does not generate a single patch, so the approach MinImpact is not used.

---
