#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//chart/ project chart
##Original Patch 

```Java
diff --git a/source/org/jfree/chart/plot/MultiplePiePlot.java b/source/org/jfree/chart/plot/MultiplePiePlot.java
index 5fe04cb..fedc205 100644
--- a/source/org/jfree/chart/plot/MultiplePiePlot.java
+++ b/source/org/jfree/chart/plot/MultiplePiePlot.java
@@ -142,7 +142,7 @@ public class MultiplePiePlot extends Plot implements Cloneable, Serializable {
      */
     public MultiplePiePlot(CategoryDataset dataset) {
         super();
-        setDataset(dataset);
+        this.dataset = dataset;
         PiePlot piePlot = new PiePlot(null);
         this.pieChart = new JFreeChart(piePlot);
         this.pieChart.removeLegend();
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 12

Nb of Failing EvoSuite Tests: 12


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 12

Nb of Failing EvoSuite Tests: 12


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 15

Nb of Failing EvoSuite Tests: 15


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 15

Nb of Failing EvoSuite Tests: 15


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 13

Nb of Failing EvoSuite Tests: 13


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 14


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 14


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 16

Nb of Failing EvoSuite Tests: 16


--- 
#Seed: 9

## Patch 9 #  jGenProg+MinImpact With Seed 9

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 13

Nb of Failing EvoSuite Tests: 13


--- 
#Seed: 10

## Patch 10 #  jGenProg+MinImpact With Seed 10

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 15

Nb of Failing EvoSuite Tests: 15


--- 
#Seed: 11

## Patch 11 #  jGenProg+MinImpact With Seed 11

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 13

Nb of Failing EvoSuite Tests: 13


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 14


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 15

Nb of Failing EvoSuite Tests: 15


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 16

Nb of Failing EvoSuite Tests: 16


--- 
#Seed: 15

## Patch 15 #  jGenProg+MinImpact With Seed 15

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 12

Nb of Failing EvoSuite Tests: 12


--- 
#Seed: 16

## Patch 16 #  jGenProg+MinImpact With Seed 16

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 13

Nb of Failing EvoSuite Tests: 13


--- 
#Seed: 17

## Patch 17 #  jGenProg+MinImpact With Seed 17

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 14


--- 
#Seed: 18

## Patch 18 #  jGenProg+MinImpact With Seed 18

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 13

Nb of Failing EvoSuite Tests: 13


--- 
#Seed: 19

## Patch 19 #  jGenProg+MinImpact With Seed 19

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 13

Nb of Failing EvoSuite Tests: 13


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 14


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 15

Nb of Failing EvoSuite Tests: 15


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 14


--- 
#Seed: 23

## Patch 23 #  jGenProg+MinImpact With Seed 23

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 12

Nb of Failing EvoSuite Tests: 12


--- 
#Seed: 25

## Patch 24 #  jGenProg+MinImpact With Seed 25

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 14


--- 
#Seed: 26

## Patch 25 #  jGenProg+MinImpact With Seed 26

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 13

Nb of Failing EvoSuite Tests: 13


--- 
#Seed: 27

## Patch 26 #  jGenProg+MinImpact With Seed 27

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 16

Nb of Failing EvoSuite Tests: 16


--- 
#Seed: 28

## Patch 27 #  jGenProg+MinImpact With Seed 28

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 14


--- 
#Seed: 29

## Patch 28 #  jGenProg+MinImpact With Seed 29

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 15

Nb of Failing EvoSuite Tests: 15


--- 
#Seed: 30

## Patch 29 #  jGenProg+MinImpact With Seed 30

org.jfree.data.general.AbstractDataset : 161

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 14


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 16

Average Nb of Failing EvoSuite Tests: 1

---