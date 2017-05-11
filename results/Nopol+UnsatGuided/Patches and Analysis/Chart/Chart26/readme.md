
## Human Patch 

```Java
diff --git a/source/org/jfree/chart/axis/Axis.java b/source/org/jfree/chart/axis/Axis.java
index 3f74811..78a6c66 100644
--- a/source/org/jfree/chart/axis/Axis.java
+++ b/source/org/jfree/chart/axis/Axis.java
@@ -1189,13 +1189,11 @@ public abstract class Axis implements Cloneable, Serializable {
         }
         if (plotState != null && hotspot != null) {
             ChartRenderingInfo owner = plotState.getOwner();
+            if (owner != null) {
                 EntityCollection entities = owner.getEntityCollection();
                 if (entities != null) {
                     entities.add(new AxisLabelEntity(this, hotspot, 
                             this.labelToolTip, this.labelURL));
                 }
+            }
         }
         return state;
 

```


## Original Patch # Nopol 

org.jfree.chart.plot.CategoryPlot : 2538

Patch type: CONDITIONAL

```Java
!(state!=null)
```

Execution Time: 00:02 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.jfree.chart.plot.CategoryPlot : 2538

Patch type: CONDITIONAL

```Java
(!(state!=null)) || (b1 || b2)
```

Seed: 4

Execution Time: 12:17 (hh:mm)

Nb of EvoSuite Tests:254

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.jfree.chart.plot.CategoryPlot : 2538

Patch type: CONDITIONAL

```Java
(!(state!=null)) || (b1 || b2)
```

Seed: 12

Execution Time: 14:14 (hh:mm)

Nb of EvoSuite Tests:236

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.jfree.chart.plot.CategoryPlot : 2538

Patch type: CONDITIONAL

```Java
(b1 || b2) || ((org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE!=null) && (!(state!=null)))
```

Seed: 18

Execution Time: 12:52 (hh:mm)

Nb of EvoSuite Tests:235

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.jfree.chart.plot.CategoryPlot : 2538

Patch type: CONDITIONAL

```Java
(!(state!=null)) || (b1 || b2)
```

Seed: 26

Execution Time: 11:11 (hh:mm)

Nb of EvoSuite Tests:242

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.jfree.chart.plot.CategoryPlot : 2538

Patch type: CONDITIONAL

```Java
(b1 || b2) || (!(state!=null))
```

Seed: 28

Execution Time: 09:36 (hh:mm)

Nb of EvoSuite Tests:249

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.jfree.chart.plot.CategoryPlot : 2538

Patch type: CONDITIONAL

```Java
(!(state!=null)) || (b1 || b2)
```

Seed: 35

Execution Time: 15:46 (hh:mm)

Nb of EvoSuite Tests:244

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 7 # Nopol+UnsatGuided 

org.jfree.chart.plot.CategoryPlot : 2538

Patch type: CONDITIONAL

```Java
((!(state!=null)) && (!(state!=null))) || (b1)
```

Seed: 41

Execution Time: 16:50 (hh:mm)

Nb of EvoSuite Tests:239

Nb of Contradiction Tests:1

Nb of Removed Tests:2


## Patch 8 # Nopol+UnsatGuided 

org.jfree.chart.plot.CategoryPlot : 2538

Patch type: CONDITIONAL

```Java
(!(state!=null)) || (b2)
```

Seed: 54

Execution Time: 11:26 (hh:mm)

Nb of EvoSuite Tests:243

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.jfree.chart.plot.CategoryPlot : 2538

Patch type: CONDITIONAL

```Java
(!(state!=null)) || (b2)
```

Seed: 60

Execution Time: 16:07 (hh:mm)

Nb of EvoSuite Tests:240

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.jfree.chart.plot.CategoryPlot : 2538

Patch type: CONDITIONAL

```Java
(!(state!=null)) || (b1 || b2)
```

Seed: 66

Execution Time: 15:42 (hh:mm)

Nb of EvoSuite Tests:250

Nb of Contradiction Tests:2

Nb of Removed Tests:3


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 13:36 (hh:mm)

Average Nb of EvoSuite Tests:243.2

 Average Nb of Contradiction Tests:0.4

Average Nb of Removed Tests:0.6

Running Nopol+UnsatGuided changes the original patch for each of the 10 seeds. The human patch adds an if condition to check whether the owner is not null, the original patch and the newly generated patches by running Nopol+UnsatGuided all make changes to the same conditional statement in a different class, we think they are incorrect.