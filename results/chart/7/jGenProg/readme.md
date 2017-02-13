
##Original Patch 

```Java
Index: source/org/jfree/data/time/TimePeriodValues.java
===================================================================
--- source/org/jfree/data/time/TimePeriodValues.java	(revision 1087)
+++ source/org/jfree/data/time/TimePeriodValues.java	(revision 1086)
@@ -297,9 +296,9 @@
         }
         
         if (this.maxMiddleIndex >= 0) {
-            long s = getDataItem(this.maxMiddleIndex).getPeriod().getStart()
+            long s = getDataItem(this.minMiddleIndex).getPeriod().getStart()
                 .getTime();
-            long e = getDataItem(this.maxMiddleIndex).getPeriod().getEnd()
+            long e = getDataItem(this.minMiddleIndex).getPeriod().getEnd()
                 .getTime();
             long maxMiddle = s + (e - s) / 2;
             if (middle > maxMiddle) {
```



## Patch Original jGenProg 

org.jfree.data.time.TimePeriodValues:552 (Suspicious rank: ample 1, jaccard 1, ochiai 1, naish1 22060, gp13 1, naish2 1, tarantula 1, )

Patch type: REPLACE

return this.maxEndIndex
Execution time: 0:01:50.659000

Grid5000 node: graphene-75.nancy.grid5000.fr


--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 0



## Patch 2 #  jGenProg+MinImpact With Seed 1

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 2

## Patch 3 #  jGenProg+MinImpact With Seed 2

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 0



## Patch 4 #  jGenProg+MinImpact With Seed 2

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 3

## Patch 5 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 67

Nb of Failing EvoSuite Tests: 0



## Patch 6 #  jGenProg+MinImpact With Seed 3

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 67

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 4

## Patch 7 #  jGenProg+MinImpact With Seed 4

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 0



## Patch 8 #  jGenProg+MinImpact With Seed 4

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 5

## Patch 9 #  jGenProg+MinImpact With Seed 5

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 6

## Patch 10 #  jGenProg+MinImpact With Seed 6

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 61

Nb of Failing EvoSuite Tests: 0



## Patch 11 #  jGenProg+MinImpact With Seed 6

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 61

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 7

## Patch 12 #  jGenProg+MinImpact With Seed 7

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 1



## Patch 13 #  jGenProg+MinImpact With Seed 7

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 8

## Patch 14 #  jGenProg+MinImpact With Seed 8

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 0



## Patch 15 #  jGenProg+MinImpact With Seed 8

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 9

## Patch 16 #  jGenProg+MinImpact With Seed 9

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 0



## Patch 17 #  jGenProg+MinImpact With Seed 9

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 10

## Patch 18 #  jGenProg+MinImpact With Seed 10

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 0



## Patch 19 #  jGenProg+MinImpact With Seed 10

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 11

## Patch 20 #  jGenProg+MinImpact With Seed 11

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 61

Nb of Failing EvoSuite Tests: 0



## Patch 21 #  jGenProg+MinImpact With Seed 11

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 61

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 12

## Patch 22 #  jGenProg+MinImpact With Seed 12

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 0



## Patch 23 #  jGenProg+MinImpact With Seed 12

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 13

## Patch 24 #  jGenProg+MinImpact With Seed 13

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 0



## Patch 25 #  jGenProg+MinImpact With Seed 13

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 14

## Patch 26 #  jGenProg+MinImpact With Seed 14

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 0



## Patch 27 #  jGenProg+MinImpact With Seed 14

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 15

## Patch 28 #  jGenProg+MinImpact With Seed 15

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 0



## Patch 29 #  jGenProg+MinImpact With Seed 15

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 16

## Patch 30 #  jGenProg+MinImpact With Seed 16

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 0



## Patch 31 #  jGenProg+MinImpact With Seed 16

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 17

## Patch 32 #  jGenProg+MinImpact With Seed 17

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 0



## Patch 33 #  jGenProg+MinImpact With Seed 17

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 18

## Patch 34 #  jGenProg+MinImpact With Seed 18

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 67

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 19

## Patch 35 #  jGenProg+MinImpact With Seed 19

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 66

Nb of Failing EvoSuite Tests: 0



## Patch 36 #  jGenProg+MinImpact With Seed 19

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 66

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 20

## Patch 37 #  jGenProg+MinImpact With Seed 20

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 0



## Patch 38 #  jGenProg+MinImpact With Seed 20

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 21

## Patch 39 #  jGenProg+MinImpact With Seed 21

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 62

Nb of Failing EvoSuite Tests: 0



## Patch 40 #  jGenProg+MinImpact With Seed 21

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 62

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 22

## Patch 41 #  jGenProg+MinImpact With Seed 22

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 72

Nb of Failing EvoSuite Tests: 0



## Patch 42 #  jGenProg+MinImpact With Seed 22

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 72

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 23

## Patch 43 #  jGenProg+MinImpact With Seed 23

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 1



## Patch 44 #  jGenProg+MinImpact With Seed 23

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 24

## Patch 45 #  jGenProg+MinImpact With Seed 24

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 62

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 25

## Patch 46 #  jGenProg+MinImpact With Seed 25

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 0



## Patch 47 #  jGenProg+MinImpact With Seed 25

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 26

## Patch 48 #  jGenProg+MinImpact With Seed 26

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 0



## Patch 49 #  jGenProg+MinImpact With Seed 26

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 27

## Patch 50 #  jGenProg+MinImpact With Seed 27

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 0



## Patch 51 #  jGenProg+MinImpact With Seed 27

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 28

## Patch 52 #  jGenProg+MinImpact With Seed 28

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 0



## Patch 53 #  jGenProg+MinImpact With Seed 28

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 29

## Patch 54 #  jGenProg+MinImpact With Seed 29

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 0



## Patch 55 #  jGenProg+MinImpact With Seed 29

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 30

## Patch 56 #  jGenProg+MinImpact With Seed 30

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 0



## Patch 57 #  jGenProg+MinImpact With Seed 30

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 0


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 66.65

Average Nb of Failing EvoSuite Tests: 0.09

Average Nb of Test-adequate patches: 1.9

---