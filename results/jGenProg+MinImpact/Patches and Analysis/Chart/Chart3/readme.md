
##Human Patch 

```Java
diff --git a/source/org/jfree/data/time/TimeSeries.java b/source/org/jfree/data/time/TimeSeries.java
index 72bb2ea..795d791 100644
--- a/source/org/jfree/data/time/TimeSeries.java
+++ b/source/org/jfree/data/time/TimeSeries.java
@@ -1054,8 +1054,6 @@ public class TimeSeries extends Series implements Cloneable, Serializable {
             throw new IllegalArgumentException("Requires start <= end.");
         }
         TimeSeries copy = (TimeSeries) super.clone();
+        copy.minY = Double.NaN;
+        copy.maxY = Double.NaN;
         copy.data = new java.util.ArrayList();
         if (this.data.size() > 0) {
             for (int index = start; index <= end; index++) {
```


## Patch  Original jGenProg 

org.jfree.data.time.TimeSeries:579 

Patch type: InsertBeforeOp 
 
```Java
findBoundsByIteration()
```

Execution Time: 0:01 (hh:mm)



--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 629

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 1

Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 101

Nb of Failing EvoSuite Tests: 0



## Patch 2 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 879

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 1

Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 101

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 3 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 606

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Seed: 2

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 4 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 627

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Seed: 2

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 5 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 877

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 2

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 6 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 634

Patch type: InsertBeforeOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Seed: 2

Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 7 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 581

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 3

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 0



## Patch 8 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 463

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 3

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 0



## Patch 9 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 598

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 3

Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 0



## Patch 10 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Seed: 3

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 0



## Patch 11 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 3

Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 12 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 576

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 4

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 0



## Patch 13 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Seed: 4

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 0



## Patch 14 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 596

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 4

Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 15 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 885

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 5

Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 16 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 878

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 5

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 17 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 254

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 5

Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 18 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 600

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 6

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 0



## Patch 19 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 606

Patch type: InsertBeforeOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Seed: 6

Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 0



## Patch 20 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 576

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 6

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 21 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 606

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 7

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 141

Nb of Failing EvoSuite Tests: 0



## Patch 22 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Seed: 7

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 141

Nb of Failing EvoSuite Tests: 0



## Patch 23 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 7

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 141

Nb of Failing EvoSuite Tests: 0



## Patch 24 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 581

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 7

Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 141

Nb of Failing EvoSuite Tests: 0



## Patch 25 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 596

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 7

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 141

Nb of Failing EvoSuite Tests: 0



## Patch 26 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 254

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 7

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 141

Nb of Failing EvoSuite Tests: 1



## Patch 27 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 564

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 7

Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 141

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 28 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 579

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 8

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 132

Nb of Failing EvoSuite Tests: 0



## Patch 29 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 564

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 8

Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 132

Nb of Failing EvoSuite Tests: 0



## Patch 30 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 627

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Seed: 8

Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 132

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 31 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 581

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 9

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 138

Nb of Failing EvoSuite Tests: 0



## Patch 32 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 878

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 9

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 138

Nb of Failing EvoSuite Tests: 0



## Patch 33 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 579

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 9

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 138

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 34 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 599

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 10

Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 144

Nb of Failing EvoSuite Tests: 0



## Patch 35 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 10

Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 144

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 36 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 345

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 11

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 0



## Patch 37 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 638

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 11

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 0



## Patch 38 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 580

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 11

Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 0



## Patch 39 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 634

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 11

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 40 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 627

Patch type: InsertBeforeOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Seed: 12

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 41 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 12

Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 42 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 598

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 12

Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 43 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 12

Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 44 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 877

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 12

Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 45 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 581

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 12

Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 46 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Seed: 12

Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 47 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 604

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Seed: 13

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 142

Nb of Failing EvoSuite Tests: 0



## Patch 48 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 13

Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 142

Nb of Failing EvoSuite Tests: 0



## Patch 49 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 637

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 13

Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 142

Nb of Failing EvoSuite Tests: 0



## Patch 50 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 581

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 13

Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 142

Nb of Failing EvoSuite Tests: 0



## Patch 51 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 576

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 13

Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 142

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 52 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 627

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Seed: 14

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 53 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 627

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Seed: 14

Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 54 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 634

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 14

Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 55 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 627

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 14

Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 56 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 463

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 14

Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 57 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 605

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 14

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 58 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 638

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 15

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 59 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 634

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 15

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 60 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 626

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 15

Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 61 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Seed: 15

Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 62 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 878

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 16

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 63 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 16

Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 64 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 564

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 16

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 1



## Patch 65 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 581

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 16

Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 66 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 879

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 17

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 0



## Patch 67 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 605

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Seed: 17

Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 68 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 584

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 18

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 69 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 580

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 18

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 70 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 581

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 18

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 71 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 18

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 72 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 579

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 18

Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 73 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 576

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 18

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 74 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 885

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 19

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 75 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 19

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 76 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Seed: 19

Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 77 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 627

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Seed: 19

Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 78 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 629

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 19

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 79 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Seed: 19

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 80 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 638

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 19

Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 81 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 604

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 19

Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 82 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 629

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Seed: 20

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 83 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 600

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 20

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 84 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 564

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 20

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 85 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 629

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 20

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 86 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 885

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 20

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 87 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 254

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 20

Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 88 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 627

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Seed: 20

Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 89 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 878

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 20

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 90 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 21

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 91 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 580

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 21

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 92 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 627

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 21

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 93 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 21

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 94 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 584

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 21

Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 95 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 598

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 21

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 96 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 629

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 21

Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 97 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Seed: 22

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 124

Nb of Failing EvoSuite Tests: 0



## Patch 98 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 637

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 22

Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 124

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 99 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 580

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 23

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 100 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 627

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 23

Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 101 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 596

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 23

Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 102 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 627

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Seed: 24

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 118

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 103 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 25

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 104 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 576

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 25

Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 105 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 579

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 26

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 148

Nb of Failing EvoSuite Tests: 0



## Patch 106 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Seed: 26

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 148

Nb of Failing EvoSuite Tests: 0



## Patch 107 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 254

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 26

Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 148

Nb of Failing EvoSuite Tests: 0



## Patch 108 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 877

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 26

Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 148

Nb of Failing EvoSuite Tests: 0



## Patch 109 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 627

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 26

Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 148

Nb of Failing EvoSuite Tests: 0



## Patch 110 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 564

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 26

Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 148

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 111 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 627

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Seed: 27

Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 0



## Patch 112 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Seed: 27

Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 113 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 878

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 28

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0



## Patch 114 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 634

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 28

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0



## Patch 115 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 629

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Seed: 28

Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0



## Patch 116 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Seed: 28

Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 117 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 629

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 29

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0



## Patch 118 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 878

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 29

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0



## Patch 119 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 627

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 29

Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0



## Patch 120 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 584

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 29

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0



## Patch 121 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 254

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 29

Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0



## Patch 122 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 606

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Seed: 29

Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 123 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 599

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 30

Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 124 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 638

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 30

Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 125 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 600

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Seed: 30

Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 126 #  jGenProg+MinImpact 

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

updateBoundsForRemovedItem(item)

```


Seed: 30

Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 129.26

Average Nb of Failing EvoSuite Tests: 0.07

Average Nb of Test-adequate patches: 4.2

Running jGenProg + MinImpact changes the original patch for each of the 30 seeds. The human patch initializes some fields e.g., copy.minY = Double.NaN before initializing the object, the original patch and the newly generated patches by running jGenProg + MinImpact insert a statement or replace some old statements with new statements. We think they are irrelevant to the human patch and just make the failing test pass, and are thus incorrect. 

---
