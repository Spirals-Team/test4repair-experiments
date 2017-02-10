#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//chart/ project chart
##Original Patch 

```Java
diff --git a/source/org/jfree/data/time/TimeSeries.java b/source/org/jfree/data/time/TimeSeries.java
index 72bb2ea..795d791 100644
--- a/source/org/jfree/data/time/TimeSeries.java
+++ b/source/org/jfree/data/time/TimeSeries.java
@@ -1054,8 +1054,6 @@ public class TimeSeries extends Series implements Cloneable, Serializable {
             throw new IllegalArgumentException("Requires start <= end.");
         }
         TimeSeries copy = (TimeSeries) super.clone();
-        copy.minY = Double.NaN;
-        copy.maxY = Double.NaN;
         copy.data = new java.util.ArrayList();
         if (this.data.size() > 0) {
             for (int index = start; index <= end; index++) {
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.jfree.data.time.TimeSeries : 629

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 101

Nb of Failing EvoSuite Tests: 101


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.jfree.data.time.TimeSeries : 606

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 122


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.jfree.data.time.TimeSeries : 581

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 135


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

org.jfree.data.time.TimeSeries : 576

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 119


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

org.jfree.data.time.TimeSeries : 885

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 131


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.jfree.data.time.TimeSeries : 600

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 135


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

org.jfree.data.time.TimeSeries : 606

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 141

Nb of Failing EvoSuite Tests: 141


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.jfree.data.time.TimeSeries : 579

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 132

Nb of Failing EvoSuite Tests: 132


--- 
#Seed: 9

## Patch 9 #  jGenProg+MinImpact With Seed 9

org.jfree.data.time.TimeSeries : 581

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 138

Nb of Failing EvoSuite Tests: 138


--- 
#Seed: 10

## Patch 10 #  jGenProg+MinImpact With Seed 10

org.jfree.data.time.TimeSeries : 599

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 144

Nb of Failing EvoSuite Tests: 144


--- 
#Seed: 11

## Patch 11 #  jGenProg+MinImpact With Seed 11

org.jfree.data.time.TimeSeries : 345

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 126


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

org.jfree.data.time.TimeSeries : 627

Patch type: InsertBeforeOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 131


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

org.jfree.data.time.TimeSeries : 604

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 142

Nb of Failing EvoSuite Tests: 142


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

org.jfree.data.time.TimeSeries : 627

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 122


--- 
#Seed: 15

## Patch 15 #  jGenProg+MinImpact With Seed 15

org.jfree.data.time.TimeSeries : 638

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 125


--- 
#Seed: 16

## Patch 16 #  jGenProg+MinImpact With Seed 16

org.jfree.data.time.TimeSeries : 878

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 125


--- 
#Seed: 17

## Patch 17 #  jGenProg+MinImpact With Seed 17

org.jfree.data.time.TimeSeries : 879

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 119


--- 
#Seed: 18

## Patch 18 #  jGenProg+MinImpact With Seed 18

org.jfree.data.time.TimeSeries : 584

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 125


--- 
#Seed: 19

## Patch 19 #  jGenProg+MinImpact With Seed 19

org.jfree.data.time.TimeSeries : 885

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 120


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

org.jfree.data.time.TimeSeries : 629

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 120


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 122


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 124

Nb of Failing EvoSuite Tests: 124


--- 
#Seed: 23

## Patch 23 #  jGenProg+MinImpact With Seed 23

org.jfree.data.time.TimeSeries : 580

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 131


--- 
#Seed: 25

## Patch 24 #  jGenProg+MinImpact With Seed 25

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 131


--- 
#Seed: 26

## Patch 25 #  jGenProg+MinImpact With Seed 26

org.jfree.data.time.TimeSeries : 579

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 148

Nb of Failing EvoSuite Tests: 148


--- 
#Seed: 27

## Patch 26 #  jGenProg+MinImpact With Seed 27

org.jfree.data.time.TimeSeries : 627

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 135


--- 
#Seed: 28

## Patch 27 #  jGenProg+MinImpact With Seed 28

org.jfree.data.time.TimeSeries : 878

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 139


--- 
#Seed: 29

## Patch 28 #  jGenProg+MinImpact With Seed 29

org.jfree.data.time.TimeSeries : 629

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 139


--- 
#Seed: 30

## Patch 29 #  jGenProg+MinImpact With Seed 30

org.jfree.data.time.TimeSeries : 599

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 122


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 130.32

Average Nb of Failing EvoSuite Tests: 0

---