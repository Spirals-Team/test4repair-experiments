
##Human Patch 

```Java
Index: source/org/jfree/data/time/TimePeriodValues.java
===================================================================
--- source/org/jfree/data/time/TimePeriodValues.java	(revision 1087)
+++ source/org/jfree/data/time/TimePeriodValues.java	(revision 1086)
@@ -297,9 +296,9 @@
         }
         
         if (this.maxMiddleIndex >= 0) {
+            long s = getDataItem(this.maxMiddleIndex).getPeriod().getStart()
-            long s = getDataItem(this.minMiddleIndex).getPeriod().getStart()
                 .getTime();
+            long e = getDataItem(this.maxMiddleIndex).getPeriod().getEnd()
-            long e = getDataItem(this.minMiddleIndex).getPeriod().getEnd()
                 .getTime();
             long maxMiddle = s + (e - s) / 2;
             if (middle > maxMiddle) {
```



## Patch Original jGenProg 

org.jfree.data.time.TimePeriodValues:552 

Patch type: ReplaceOp

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

Execution Time: 0:01 (hh:mm)



--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 1

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 0



## Patch 2 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 1

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 3 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 2

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 0



## Patch 4 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 2

Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 5 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 3

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 67

Nb of Failing EvoSuite Tests: 0



## Patch 6 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 3

Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 67

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 7 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 4

Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 0



## Patch 8 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 4

Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 9 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 5

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 10 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 6

Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 61

Nb of Failing EvoSuite Tests: 0



## Patch 11 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 6

Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 61

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 12 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 7

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 1



## Patch 13 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 7

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 14 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 8

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 0



## Patch 15 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 8

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 16 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 9

Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 0



## Patch 17 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 9

Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 18 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 10

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 0



## Patch 19 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 10

Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 20 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 11

Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 61

Nb of Failing EvoSuite Tests: 0



## Patch 21 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 11

Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 61

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 22 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 12

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 0



## Patch 23 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 12

Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 24 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 13

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 0



## Patch 25 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 13

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 26 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 14

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 0



## Patch 27 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 14

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 28 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 15

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 0



## Patch 29 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 15

Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 30 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 16

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 0



## Patch 31 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 16

Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 32 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 17

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 0



## Patch 33 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 17

Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 34 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 18

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 67

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 35 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 19

Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 66

Nb of Failing EvoSuite Tests: 0



## Patch 36 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 19

Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 66

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 37 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 20

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 0



## Patch 38 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 20

Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 39 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 21

Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 62

Nb of Failing EvoSuite Tests: 0



## Patch 40 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 21

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 62

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 41 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 22

Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 72

Nb of Failing EvoSuite Tests: 0



## Patch 42 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 22

Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 72

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 43 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 23

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 1



## Patch 44 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 23

Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 45 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 24

Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 62

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 46 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 25

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 0



## Patch 47 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 25

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 48 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 26

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 0



## Patch 49 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 26

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 50 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 27

Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 0



## Patch 51 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 27

Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 52 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 28

Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 0



## Patch 53 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 28

Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 54 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 29

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 0



## Patch 55 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 29

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 56 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Seed: 30

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 0



## Patch 57 #  jGenProg+MinImpact 

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Seed: 30

Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 0


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 66.65

Average Nb of Failing EvoSuite Tests: 0.09

Average Nb of Test-adequate patches: 1.9

Running jGenProg + MinImpact changes the original patch for 16 of the 30 seeds. The human patch corrects wrong fields in the process of calculating the bounds of a period, the original patch and the newly generated patches by running jGenProg + MinImpact all replace an old statement with a new statement just to make the failing test pass, we think they are all incorrect.

---
