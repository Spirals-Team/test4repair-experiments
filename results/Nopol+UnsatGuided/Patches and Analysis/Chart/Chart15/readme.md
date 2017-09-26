
## Human Patch 

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


## Original Patch # Nopol 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(org.jfree.chart.JFreeChart.this.changeListeners!=null) && ((plotInfo!=null) || (!(org.jfree.chart.JFreeChart.this.title!=null)))
```

Execution Time: 00:04 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(entities!=null) || (!((org.jfree.chart.JFreeChart.this.backgroundPaint!=null) && (org.jfree.chart.JFreeChart.this.title!=null)))
```

Seed: 4

Execution Time: 06:27 (hh:mm)

Nb of EvoSuite Tests:125

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(!((org.jfree.chart.JFreeChart.this.title!=null) && (org.jfree.chart.JFreeChart.this.backgroundPaint!=null))) || (plotInfo!=null)
```

Seed: 12

Execution Time: 06:51 (hh:mm)

Nb of EvoSuite Tests:126

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(!(org.jfree.chart.JFreeChart.this.title!=null)) || (info!=null)
```

Seed: 18

Execution Time: 06:36 (hh:mm)

Nb of EvoSuite Tests:129

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(plotInfo!=null) || (!((org.jfree.chart.JFreeChart.this.title!=null) && (org.jfree.chart.JFreeChart.this.backgroundPaint!=null)))
```

Seed: 26

Execution Time: 06:22 (hh:mm)

Nb of EvoSuite Tests:122

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(plotInfo!=null) || (!((org.jfree.chart.JFreeChart.this.title!=null) && (org.jfree.chart.JFreeChart.this.backgroundPaint!=null)))
```

Seed: 28

Execution Time: 06:33 (hh:mm)

Nb of EvoSuite Tests:124

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(plotInfo!=null) || (!((org.jfree.chart.JFreeChart.this.backgroundPaint!=null) && (org.jfree.chart.JFreeChart.this.title!=null)))
```

Seed: 35

Execution Time: 05:59 (hh:mm)

Nb of EvoSuite Tests:125

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(plotInfo!=null) || (!((org.jfree.chart.JFreeChart.this.backgroundPaint!=null) && (org.jfree.chart.JFreeChart.this.title!=null)))
```

Seed: 41

Execution Time: 06:13 (hh:mm)

Nb of EvoSuite Tests:118

Nb of Removed Tests:1


## Patch 8 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(info!=null) || (!((org.jfree.chart.JFreeChart.this.backgroundPaint!=null) && (org.jfree.chart.JFreeChart.this.title!=null)))
```

Seed: 54

Execution Time: 06:30 (hh:mm)

Nb of EvoSuite Tests:125

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(!((org.jfree.chart.JFreeChart.this.title!=null) && (org.jfree.chart.JFreeChart.this.backgroundPaint!=null))) || (plotInfo!=null)
```

Seed: 60

Execution Time: 06:08 (hh:mm)

Nb of EvoSuite Tests:121

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(!(org.jfree.chart.JFreeChart.this.title!=null)) || (info!=null)
```

Seed: 66

Execution Time: 06:30 (hh:mm)

Nb of EvoSuite Tests:124

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(!((org.jfree.chart.JFreeChart.this.title!=null) && (0 < org.jfree.chart.JFreeChart.this.subtitles.size()))) || (info!=null)
```

Seed: 75

Execution Time: 06:24 (hh:mm)

Nb of EvoSuite Tests:125

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
((info!=null) || (!(org.jfree.chart.JFreeChart.this.title!=null))) && ((info!=null) || (!(org.jfree.chart.JFreeChart.this.title!=null)))
```

Seed: 83

Execution Time: 06:35 (hh:mm)

Nb of EvoSuite Tests:119

Nb of Removed Tests:1


## Patch 13 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(entities!=null) || (!((org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_IMAGE_ALPHA <= org.jfree.chart.JFreeChart.this.subtitles.size()) && (org.jfree.chart.JFreeChart.this.title!=null)))
```

Seed: 98

Execution Time: 06:37 (hh:mm)

Nb of EvoSuite Tests:121

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(plotInfo!=null) || (!((org.jfree.chart.JFreeChart.this.title!=null) && (0 < org.jfree.chart.JFreeChart.this.subtitles.size())))
```

Seed: 100

Execution Time: 06:41 (hh:mm)

Nb of EvoSuite Tests:125

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(!((org.jfree.chart.JFreeChart.this.title!=null) && (org.jfree.chart.JFreeChart.this.backgroundPaint!=null))) || (info!=null)
```

Seed: 104

Execution Time: 05:48 (hh:mm)

Nb of EvoSuite Tests:118

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(!((org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_IMAGE_ALPHA <= org.jfree.chart.JFreeChart.this.subtitles.size()) && (org.jfree.chart.JFreeChart.this.title!=null))) || (entities!=null)
```

Seed: 111

Execution Time: 06:40 (hh:mm)

Nb of EvoSuite Tests:135

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(entities!=null) || (!((1 == org.jfree.chart.JFreeChart.this.subtitles.size()) && (org.jfree.chart.JFreeChart.this.title!=null)))
```

Seed: 113

Execution Time: 06:16 (hh:mm)

Nb of EvoSuite Tests:118

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(!((org.jfree.chart.JFreeChart.this.backgroundPaint!=null) && (org.jfree.chart.JFreeChart.this.title!=null))) || (entities!=null)
```

Seed: 120

Execution Time: 06:25 (hh:mm)

Nb of EvoSuite Tests:119

Nb of Removed Tests:2


## Patch 19 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(entities!=null) || (!((org.jfree.chart.JFreeChart.this.renderingHints.size() <= org.jfree.chart.JFreeChart.this.subtitles.size()) && (org.jfree.chart.JFreeChart.this.title!=null)))
```

Seed: 128

Execution Time: 07:57 (hh:mm)

Nb of EvoSuite Tests:119

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(!((org.jfree.chart.JFreeChart.this.title!=null) && (org.jfree.chart.JFreeChart.this.backgroundPaint!=null))) || (info!=null)
```

Seed: 135

Execution Time: 08:18 (hh:mm)

Nb of EvoSuite Tests:126

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(info!=null) || (!((org.jfree.chart.JFreeChart.this.title!=null) && (org.jfree.chart.JFreeChart.this.backgroundPaint!=null)))
```

Seed: 143

Execution Time: 08:45 (hh:mm)

Nb of EvoSuite Tests:130

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(org.jfree.chart.JFreeChart.this.subtitles.isEmpty()) || (!(org.jfree.chart.JFreeChart.this.title!=null))
```

Seed: 150

Execution Time: 07:58 (hh:mm)

Nb of EvoSuite Tests:133

Nb of Removed Tests:1


## Patch 23 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(plotInfo!=null) || (!((org.jfree.chart.JFreeChart.this.title!=null) && (1 == org.jfree.chart.JFreeChart.this.subtitles.size())))
```

Seed: 153

Execution Time: 06:58 (hh:mm)

Nb of EvoSuite Tests:121

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(!((org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_IMAGE_ALPHA < org.jfree.chart.JFreeChart.this.subtitles.size()) && (org.jfree.chart.JFreeChart.this.title!=null))) || (plotInfo!=null)
```

Seed: 161

Execution Time: 06:39 (hh:mm)

Nb of EvoSuite Tests:116

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(!((org.jfree.chart.JFreeChart.this.title!=null) && (org.jfree.chart.JFreeChart.this.backgroundPaint!=null))) || (info!=null)
```

Seed: 166

Execution Time: 08:10 (hh:mm)

Nb of EvoSuite Tests:122

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
((!(org.jfree.chart.JFreeChart.this.title!=null)) && (!(org.jfree.chart.JFreeChart.this.title!=null))) || (plotInfo!=null)
```

Seed: 173

Execution Time: 08:29 (hh:mm)

Nb of EvoSuite Tests:123

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(anchor!=null) || (!(((0) != (org.jfree.chart.JFreeChart.this.subtitles.size())) && (org.jfree.chart.JFreeChart.this.title!=null)))
```

Seed: 180

Execution Time: 08:24 (hh:mm)

Nb of EvoSuite Tests:122

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(entities!=null) || (!((org.jfree.chart.JFreeChart.this.title!=null) && ((0) != (org.jfree.chart.JFreeChart.this.subtitles.size()))))
```

Seed: 181

Execution Time: 05:44 (hh:mm)

Nb of EvoSuite Tests:121

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(!(org.jfree.chart.JFreeChart.this.title!=null)) || (org.jfree.chart.JFreeChart.this.subtitles.isEmpty())
```

Seed: 186

Execution Time: 05:54 (hh:mm)

Nb of EvoSuite Tests:127

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.jfree.chart.JFreeChart : 1219

Patch type: PRECONDITION

```Java
(org.jfree.chart.JFreeChart.this.subtitles.isEmpty()) || (!(org.jfree.chart.JFreeChart.this.title!=null))
```

Seed: 193

Execution Time: 05:44 (hh:mm)

Nb of EvoSuite Tests:131

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 06:49 (hh:mm)

Average Nb of EvoSuite Tests:123.67

Average Nb of Removed Tests:0.17

Running Nopol+UnsatGuided changes the original patch for 27 of the 30 seeds. The human patch adds code to check whether this.dataset equates to null and what to do if so, the original Nopol patch and newly generated patches by running Nopol+UnsatGuided all add a precondition to the same statement in a different class, we think they are incorrect. We observe failing EvoSuite tests for both programs patched with the original Nopol patch and the new patches genertaed by running Nopol+UnsatGuided, which verifies our analysis.
