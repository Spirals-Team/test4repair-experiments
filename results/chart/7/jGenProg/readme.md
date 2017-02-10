#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//chart/ project chart
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

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 68


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 68


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 67

Nb of Failing EvoSuite Tests: 67


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 70


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 68


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 61

Nb of Failing EvoSuite Tests: 61


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 68


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 70


--- 
#Seed: 9

## Patch 9 #  jGenProg+MinImpact With Seed 9

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 64


--- 
#Seed: 10

## Patch 10 #  jGenProg+MinImpact With Seed 10

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 64


--- 
#Seed: 11

## Patch 11 #  jGenProg+MinImpact With Seed 11

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 61

Nb of Failing EvoSuite Tests: 61


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 64


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 69


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 69


--- 
#Seed: 15

## Patch 15 #  jGenProg+MinImpact With Seed 15

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 71


--- 
#Seed: 16

## Patch 16 #  jGenProg+MinImpact With Seed 16

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 63


--- 
#Seed: 17

## Patch 17 #  jGenProg+MinImpact With Seed 17

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 71


--- 
#Seed: 18

## Patch 18 #  jGenProg+MinImpact With Seed 18

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 67

Nb of Failing EvoSuite Tests: 67


--- 
#Seed: 19

## Patch 19 #  jGenProg+MinImpact With Seed 19

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 66

Nb of Failing EvoSuite Tests: 66


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 63


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 62

Nb of Failing EvoSuite Tests: 62


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 72

Nb of Failing EvoSuite Tests: 72


--- 
#Seed: 23

## Patch 23 #  jGenProg+MinImpact With Seed 23

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 64


--- 
#Seed: 25

## Patch 24 #  jGenProg+MinImpact With Seed 25

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 70


--- 
#Seed: 26

## Patch 25 #  jGenProg+MinImpact With Seed 26

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 71


--- 
#Seed: 27

## Patch 26 #  jGenProg+MinImpact With Seed 27

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 63

Nb of Failing EvoSuite Tests: 63


--- 
#Seed: 28

## Patch 27 #  jGenProg+MinImpact With Seed 28

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxEndIndex

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 64


--- 
#Seed: 29

## Patch 28 #  jGenProg+MinImpact With Seed 29

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 69

Nb of Failing EvoSuite Tests: 69


--- 
#Seed: 30

## Patch 29 #  jGenProg+MinImpact With Seed 30

org.jfree.data.time.TimePeriodValues : 552

Patch type: ReplaceOp

```Java

return org.jfree.data.time.TimePeriodValues.this.maxStartIndex

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 70


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 71.5

Average Nb of Failing EvoSuite Tests: 0.5

---