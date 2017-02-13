
##Original Patch 

```Java
diff --git a/source/org/jfree/data/xy/XYSeries.java b/source/org/jfree/data/xy/XYSeries.java
index b26e11e..0b37e6e 100644
--- a/source/org/jfree/data/xy/XYSeries.java
+++ b/source/org/jfree/data/xy/XYSeries.java
@@ -541,15 +541,11 @@ public class XYSeries extends Series implements Cloneable, Serializable {
         if (x == null) {
             throw new IllegalArgumentException("Null 'x' argument.");
         }
+        if (this.allowDuplicateXValues) {
+            add(x, y);
+            return null;
+        }
 
         // if we get to here, we know that duplicate X values are not permitted
         XYDataItem overwritten = null;
         int index = indexOf(x);
+        if (index >= 0) {
-        if (index >= 0 && !this.allowDuplicateXValues) {
             XYDataItem existing = (XYDataItem) this.data.get(index);
             try {
                 overwritten = (XYDataItem) existing.clone();
```

## Patch Original jGenProg 

org.jfree.data.xy.XYSeries:562 (Suspicious rank: ample 1, jaccard 1, ochiai 1, naish1 24209, gp13 1, naish2 1, tarantula 1, )

Patch type: REPLACE 
 
```Java
this.data.add(new org.jfree.data.xy.XYDataItem(x , y))
```

Execution time: 0:02:24.405000

Grid5000 node: graphene-68.nancy.grid5000.fr

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 1



## Patch 2 #  jGenProg+MinImpact With Seed 1

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 2

## Patch 3 #  jGenProg+MinImpact With Seed 2

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 2



## Patch 4 #  jGenProg+MinImpact With Seed 2

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 3

## Patch 5 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 110

Nb of Failing EvoSuite Tests: 2



## Patch 6 #  jGenProg+MinImpact With Seed 3

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 110

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 4

## Patch 7 #  jGenProg+MinImpact With Seed 4

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 116

Nb of Failing EvoSuite Tests: 2



## Patch 8 #  jGenProg+MinImpact With Seed 4

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 116

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 5

## Patch 9 #  jGenProg+MinImpact With Seed 5

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 103

Nb of Failing EvoSuite Tests: 2



## Patch 10 #  jGenProg+MinImpact With Seed 5

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 103

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 6

## Patch 11 #  jGenProg+MinImpact With Seed 6

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 2



## Patch 12 #  jGenProg+MinImpact With Seed 6

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 7

## Patch 13 #  jGenProg+MinImpact With Seed 7

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 102

Nb of Failing EvoSuite Tests: 1



## Patch 14 #  jGenProg+MinImpact With Seed 7

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 102

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 8

## Patch 15 #  jGenProg+MinImpact With Seed 8

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 2



## Patch 16 #  jGenProg+MinImpact With Seed 8

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 9
--- 
#Seed: 10

## Patch 17 #  jGenProg+MinImpact With Seed 10

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 92

Nb of Failing EvoSuite Tests: 2



## Patch 18 #  jGenProg+MinImpact With Seed 10

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 92

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 11

## Patch 19 #  jGenProg+MinImpact With Seed 11

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 2



## Patch 20 #  jGenProg+MinImpact With Seed 11

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 12

## Patch 21 #  jGenProg+MinImpact With Seed 12

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 2



## Patch 22 #  jGenProg+MinImpact With Seed 12

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 13

## Patch 23 #  jGenProg+MinImpact With Seed 13

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 85

Nb of Failing EvoSuite Tests: 2



## Patch 24 #  jGenProg+MinImpact With Seed 13

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 85

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 14

## Patch 25 #  jGenProg+MinImpact With Seed 14

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 2



## Patch 26 #  jGenProg+MinImpact With Seed 14

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 15

## Patch 27 #  jGenProg+MinImpact With Seed 15

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 2



## Patch 28 #  jGenProg+MinImpact With Seed 15

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 16

## Patch 29 #  jGenProg+MinImpact With Seed 16

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 104

Nb of Failing EvoSuite Tests: 2



## Patch 30 #  jGenProg+MinImpact With Seed 16

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 104

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 17

## Patch 31 #  jGenProg+MinImpact With Seed 17

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 2



## Patch 32 #  jGenProg+MinImpact With Seed 17

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 18

## Patch 33 #  jGenProg+MinImpact With Seed 18

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 2



## Patch 34 #  jGenProg+MinImpact With Seed 18

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 19
--- 
#Seed: 20
--- 
#Seed: 21

## Patch 35 #  jGenProg+MinImpact With Seed 21

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 2



## Patch 36 #  jGenProg+MinImpact With Seed 21

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 22

## Patch 37 #  jGenProg+MinImpact With Seed 22

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 2



## Patch 38 #  jGenProg+MinImpact With Seed 22

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 23
--- 
#Seed: 24
--- 
#Seed: 25
--- 
#Seed: 26

## Patch 39 #  jGenProg+MinImpact With Seed 26

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 100

Nb of Failing EvoSuite Tests: 2



## Patch 40 #  jGenProg+MinImpact With Seed 26

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 100

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 28

## Patch 41 #  jGenProg+MinImpact With Seed 28

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 3



## Patch 42 #  jGenProg+MinImpact With Seed 28

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 29

## Patch 43 #  jGenProg+MinImpact With Seed 29

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 105

Nb of Failing EvoSuite Tests: 2



## Patch 44 #  jGenProg+MinImpact With Seed 29

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 105

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 30

## Patch 45 #  jGenProg+MinImpact With Seed 30

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 2



## Patch 46 #  jGenProg+MinImpact With Seed 30

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 2


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 77.66

Average Nb of Failing EvoSuite Tests: 1.59

Average Nb of Test-adequate patches: 2

---