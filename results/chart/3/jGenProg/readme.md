
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


## Patch  Original jGenProg 

org.jfree.data.time.TimeSeries:579 (Suspicious rank: ample 59, jaccard 59, ochiai 53, naish1 25132, gp13 59, naish2 59, tarantula 59, )

Patch type: INSERT_BEFORE 
 
```Java
findBoundsByIteration()
```

Execution time: 0:01:47.511000

Grid5000 node: graphene-75.nancy.grid5000.fr



--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 629

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 101

Nb of Failing EvoSuite Tests: 0



## Patch 2 #  jGenProg+MinImpact With Seed 1

org.jfree.data.time.TimeSeries : 879

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 101

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 2

## Patch 3 #  jGenProg+MinImpact With Seed 2

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 606

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 4 #  jGenProg+MinImpact With Seed 2

org.jfree.data.time.TimeSeries : 627

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 5 #  jGenProg+MinImpact With Seed 2

org.jfree.data.time.TimeSeries : 877

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 6 #  jGenProg+MinImpact With Seed 2

org.jfree.data.time.TimeSeries : 634

Patch type: InsertBeforeOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 3

## Patch 7 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 581

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 0



## Patch 8 #  jGenProg+MinImpact With Seed 3

org.jfree.data.time.TimeSeries : 463

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 0



## Patch 9 #  jGenProg+MinImpact With Seed 3

org.jfree.data.time.TimeSeries : 598

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 0



## Patch 10 #  jGenProg+MinImpact With Seed 3

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 0



## Patch 11 #  jGenProg+MinImpact With Seed 3

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 4

## Patch 12 #  jGenProg+MinImpact With Seed 4

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 576

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 0



## Patch 13 #  jGenProg+MinImpact With Seed 4

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 0



## Patch 14 #  jGenProg+MinImpact With Seed 4

org.jfree.data.time.TimeSeries : 596

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 5

## Patch 15 #  jGenProg+MinImpact With Seed 5

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 885

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 16 #  jGenProg+MinImpact With Seed 5

org.jfree.data.time.TimeSeries : 878

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 17 #  jGenProg+MinImpact With Seed 5

org.jfree.data.time.TimeSeries : 254

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 6

## Patch 18 #  jGenProg+MinImpact With Seed 6

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 600

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 0



## Patch 19 #  jGenProg+MinImpact With Seed 6

org.jfree.data.time.TimeSeries : 606

Patch type: InsertBeforeOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 0



## Patch 20 #  jGenProg+MinImpact With Seed 6

org.jfree.data.time.TimeSeries : 576

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 7

## Patch 21 #  jGenProg+MinImpact With Seed 7

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 606

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 141

Nb of Failing EvoSuite Tests: 0



## Patch 22 #  jGenProg+MinImpact With Seed 7

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 141

Nb of Failing EvoSuite Tests: 0



## Patch 23 #  jGenProg+MinImpact With Seed 7

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 141

Nb of Failing EvoSuite Tests: 0



## Patch 24 #  jGenProg+MinImpact With Seed 7

org.jfree.data.time.TimeSeries : 581

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 141

Nb of Failing EvoSuite Tests: 0



## Patch 25 #  jGenProg+MinImpact With Seed 7

org.jfree.data.time.TimeSeries : 596

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 141

Nb of Failing EvoSuite Tests: 0



## Patch 26 #  jGenProg+MinImpact With Seed 7

org.jfree.data.time.TimeSeries : 254

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 141

Nb of Failing EvoSuite Tests: 1



## Patch 27 #  jGenProg+MinImpact With Seed 7

org.jfree.data.time.TimeSeries : 564

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 141

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 8

## Patch 28 #  jGenProg+MinImpact With Seed 8

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 579

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 132

Nb of Failing EvoSuite Tests: 0



## Patch 29 #  jGenProg+MinImpact With Seed 8

org.jfree.data.time.TimeSeries : 564

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 132

Nb of Failing EvoSuite Tests: 0



## Patch 30 #  jGenProg+MinImpact With Seed 8

org.jfree.data.time.TimeSeries : 627

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 132

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 9

## Patch 31 #  jGenProg+MinImpact With Seed 9

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 581

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 138

Nb of Failing EvoSuite Tests: 0



## Patch 32 #  jGenProg+MinImpact With Seed 9

org.jfree.data.time.TimeSeries : 878

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 138

Nb of Failing EvoSuite Tests: 0



## Patch 33 #  jGenProg+MinImpact With Seed 9

org.jfree.data.time.TimeSeries : 579

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 138

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 10

## Patch 34 #  jGenProg+MinImpact With Seed 10

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 599

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 144

Nb of Failing EvoSuite Tests: 0



## Patch 35 #  jGenProg+MinImpact With Seed 10

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 144

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 11

## Patch 36 #  jGenProg+MinImpact With Seed 11

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 345

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 0



## Patch 37 #  jGenProg+MinImpact With Seed 11

org.jfree.data.time.TimeSeries : 638

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 0



## Patch 38 #  jGenProg+MinImpact With Seed 11

org.jfree.data.time.TimeSeries : 580

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 0



## Patch 39 #  jGenProg+MinImpact With Seed 11

org.jfree.data.time.TimeSeries : 634

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 12

## Patch 40 #  jGenProg+MinImpact With Seed 12

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 627

Patch type: InsertBeforeOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 41 #  jGenProg+MinImpact With Seed 12

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 42 #  jGenProg+MinImpact With Seed 12

org.jfree.data.time.TimeSeries : 598

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 43 #  jGenProg+MinImpact With Seed 12

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 44 #  jGenProg+MinImpact With Seed 12

org.jfree.data.time.TimeSeries : 877

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 45 #  jGenProg+MinImpact With Seed 12

org.jfree.data.time.TimeSeries : 581

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 46 #  jGenProg+MinImpact With Seed 12

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 13

## Patch 47 #  jGenProg+MinImpact With Seed 13

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 604

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 142

Nb of Failing EvoSuite Tests: 0



## Patch 48 #  jGenProg+MinImpact With Seed 13

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 142

Nb of Failing EvoSuite Tests: 0



## Patch 49 #  jGenProg+MinImpact With Seed 13

org.jfree.data.time.TimeSeries : 637

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 142

Nb of Failing EvoSuite Tests: 0



## Patch 50 #  jGenProg+MinImpact With Seed 13

org.jfree.data.time.TimeSeries : 581

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 142

Nb of Failing EvoSuite Tests: 0



## Patch 51 #  jGenProg+MinImpact With Seed 13

org.jfree.data.time.TimeSeries : 576

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 142

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 14

## Patch 52 #  jGenProg+MinImpact With Seed 14

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 627

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 53 #  jGenProg+MinImpact With Seed 14

org.jfree.data.time.TimeSeries : 627

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 54 #  jGenProg+MinImpact With Seed 14

org.jfree.data.time.TimeSeries : 634

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 55 #  jGenProg+MinImpact With Seed 14

org.jfree.data.time.TimeSeries : 627

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 56 #  jGenProg+MinImpact With Seed 14

org.jfree.data.time.TimeSeries : 463

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 57 #  jGenProg+MinImpact With Seed 14

org.jfree.data.time.TimeSeries : 605

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 15

## Patch 58 #  jGenProg+MinImpact With Seed 15

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 638

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 59 #  jGenProg+MinImpact With Seed 15

org.jfree.data.time.TimeSeries : 634

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 60 #  jGenProg+MinImpact With Seed 15

org.jfree.data.time.TimeSeries : 626

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 61 #  jGenProg+MinImpact With Seed 15

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 16

## Patch 62 #  jGenProg+MinImpact With Seed 16

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 878

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 63 #  jGenProg+MinImpact With Seed 16

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 64 #  jGenProg+MinImpact With Seed 16

org.jfree.data.time.TimeSeries : 564

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 1



## Patch 65 #  jGenProg+MinImpact With Seed 16

org.jfree.data.time.TimeSeries : 581

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 17

## Patch 66 #  jGenProg+MinImpact With Seed 17

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 879

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 0



## Patch 67 #  jGenProg+MinImpact With Seed 17

org.jfree.data.time.TimeSeries : 605

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 18

## Patch 68 #  jGenProg+MinImpact With Seed 18

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 584

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 69 #  jGenProg+MinImpact With Seed 18

org.jfree.data.time.TimeSeries : 580

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 70 #  jGenProg+MinImpact With Seed 18

org.jfree.data.time.TimeSeries : 581

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 71 #  jGenProg+MinImpact With Seed 18

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 72 #  jGenProg+MinImpact With Seed 18

org.jfree.data.time.TimeSeries : 579

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 73 #  jGenProg+MinImpact With Seed 18

org.jfree.data.time.TimeSeries : 576

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 19

## Patch 74 #  jGenProg+MinImpact With Seed 19

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 885

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 75 #  jGenProg+MinImpact With Seed 19

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 76 #  jGenProg+MinImpact With Seed 19

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 77 #  jGenProg+MinImpact With Seed 19

org.jfree.data.time.TimeSeries : 627

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 78 #  jGenProg+MinImpact With Seed 19

org.jfree.data.time.TimeSeries : 629

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 79 #  jGenProg+MinImpact With Seed 19

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 80 #  jGenProg+MinImpact With Seed 19

org.jfree.data.time.TimeSeries : 638

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 81 #  jGenProg+MinImpact With Seed 19

org.jfree.data.time.TimeSeries : 604

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 20

## Patch 82 #  jGenProg+MinImpact With Seed 20

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 629

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 83 #  jGenProg+MinImpact With Seed 20

org.jfree.data.time.TimeSeries : 600

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 84 #  jGenProg+MinImpact With Seed 20

org.jfree.data.time.TimeSeries : 564

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 85 #  jGenProg+MinImpact With Seed 20

org.jfree.data.time.TimeSeries : 629

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 86 #  jGenProg+MinImpact With Seed 20

org.jfree.data.time.TimeSeries : 885

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 87 #  jGenProg+MinImpact With Seed 20

org.jfree.data.time.TimeSeries : 254

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 88 #  jGenProg+MinImpact With Seed 20

org.jfree.data.time.TimeSeries : 627

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0



## Patch 89 #  jGenProg+MinImpact With Seed 20

org.jfree.data.time.TimeSeries : 878

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 21

## Patch 90 #  jGenProg+MinImpact With Seed 21

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 91 #  jGenProg+MinImpact With Seed 21

org.jfree.data.time.TimeSeries : 580

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 92 #  jGenProg+MinImpact With Seed 21

org.jfree.data.time.TimeSeries : 627

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 93 #  jGenProg+MinImpact With Seed 21

org.jfree.data.time.TimeSeries : 564

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 94 #  jGenProg+MinImpact With Seed 21

org.jfree.data.time.TimeSeries : 584

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 95 #  jGenProg+MinImpact With Seed 21

org.jfree.data.time.TimeSeries : 598

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 96 #  jGenProg+MinImpact With Seed 21

org.jfree.data.time.TimeSeries : 629

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 22

## Patch 97 #  jGenProg+MinImpact With Seed 22

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 124

Nb of Failing EvoSuite Tests: 0



## Patch 98 #  jGenProg+MinImpact With Seed 22

org.jfree.data.time.TimeSeries : 637

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 124

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 23

## Patch 99 #  jGenProg+MinImpact With Seed 23

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 580

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 100 #  jGenProg+MinImpact With Seed 23

org.jfree.data.time.TimeSeries : 627

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 101 #  jGenProg+MinImpact With Seed 23

org.jfree.data.time.TimeSeries : 596

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 24

## Patch 102 #  jGenProg+MinImpact With Seed 24

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 627

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 118

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 25

## Patch 103 #  jGenProg+MinImpact With Seed 25

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0



## Patch 104 #  jGenProg+MinImpact With Seed 25

org.jfree.data.time.TimeSeries : 576

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 26

## Patch 105 #  jGenProg+MinImpact With Seed 26

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 579

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 148

Nb of Failing EvoSuite Tests: 0



## Patch 106 #  jGenProg+MinImpact With Seed 26

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 148

Nb of Failing EvoSuite Tests: 0



## Patch 107 #  jGenProg+MinImpact With Seed 26

org.jfree.data.time.TimeSeries : 254

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 148

Nb of Failing EvoSuite Tests: 0



## Patch 108 #  jGenProg+MinImpact With Seed 26

org.jfree.data.time.TimeSeries : 877

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 148

Nb of Failing EvoSuite Tests: 0



## Patch 109 #  jGenProg+MinImpact With Seed 26

org.jfree.data.time.TimeSeries : 627

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 148

Nb of Failing EvoSuite Tests: 0



## Patch 110 #  jGenProg+MinImpact With Seed 26

org.jfree.data.time.TimeSeries : 564

Patch type: InsertBeforeOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 148

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 27

## Patch 111 #  jGenProg+MinImpact With Seed 27

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 627

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 0



## Patch 112 #  jGenProg+MinImpact With Seed 27

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 135

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 28

## Patch 113 #  jGenProg+MinImpact With Seed 28

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 878

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0



## Patch 114 #  jGenProg+MinImpact With Seed 28

org.jfree.data.time.TimeSeries : 634

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0



## Patch 115 #  jGenProg+MinImpact With Seed 28

org.jfree.data.time.TimeSeries : 629

Patch type: InsertAfterOp

```Java

org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue())

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0



## Patch 116 #  jGenProg+MinImpact With Seed 28

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

findBoundsByIteration()

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 29

## Patch 117 #  jGenProg+MinImpact With Seed 29

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 629

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0



## Patch 118 #  jGenProg+MinImpact With Seed 29

org.jfree.data.time.TimeSeries : 878

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0



## Patch 119 #  jGenProg+MinImpact With Seed 29

org.jfree.data.time.TimeSeries : 627

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0



## Patch 120 #  jGenProg+MinImpact With Seed 29

org.jfree.data.time.TimeSeries : 584

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0



## Patch 121 #  jGenProg+MinImpact With Seed 29

org.jfree.data.time.TimeSeries : 254

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0



## Patch 122 #  jGenProg+MinImpact With Seed 29

org.jfree.data.time.TimeSeries : 606

Patch type: InsertBeforeOp

```Java

findBoundsByIteration()

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 139

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 30

## Patch 123 #  jGenProg+MinImpact With Seed 30

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimeSeries : 599

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 124 #  jGenProg+MinImpact With Seed 30

org.jfree.data.time.TimeSeries : 638

Patch type: InsertAfterOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 125 #  jGenProg+MinImpact With Seed 30

org.jfree.data.time.TimeSeries : 600

Patch type: InsertAfterOp

```Java

findBoundsByIteration()

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0



## Patch 126 #  jGenProg+MinImpact With Seed 30

org.jfree.data.time.TimeSeries : 638

Patch type: ReplaceOp

```Java

updateBoundsForRemovedItem(item)

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 0


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 129.26

Average Nb of Failing EvoSuite Tests: 0.07

Average Nb of Test-adequate patches: 4.2

---