
##Human Patch 

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

org.jfree.data.xy.XYSeries:564

Patch type: ReplaceOp 
 
```Java
org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))
```

Execution Time: 0:02 (hh:mm)


--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 1

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 1



## Patch 2 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 1

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 3 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 2

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 2



## Patch 4 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 2

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 5 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 3

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 110

Nb of Failing EvoSuite Tests: 2



## Patch 6 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 3

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 110

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 7 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 4

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 116

Nb of Failing EvoSuite Tests: 2



## Patch 8 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 4

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 116

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 9 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 5

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 103

Nb of Failing EvoSuite Tests: 2



## Patch 10 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 5

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 103

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 11 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 6

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 2



## Patch 12 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 6

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 13 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 7

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 102

Nb of Failing EvoSuite Tests: 1



## Patch 14 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 7

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 102

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 15 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 8

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 2



## Patch 16 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 8

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 17 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 10

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 92

Nb of Failing EvoSuite Tests: 2



## Patch 18 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 10

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 92

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 19 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 11

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 2



## Patch 20 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 11

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 21 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 12

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 2



## Patch 22 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 12

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 23 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 13

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 85

Nb of Failing EvoSuite Tests: 2



## Patch 24 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 13

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 85

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 25 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 14

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 2



## Patch 26 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 14

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 27 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 15

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 2



## Patch 28 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 15

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 29 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 16

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 104

Nb of Failing EvoSuite Tests: 2



## Patch 30 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 16

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 104

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 31 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 17

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 2



## Patch 32 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 17

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 33 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 18

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 2



## Patch 34 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 18

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 35 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 21

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 2



## Patch 36 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 21

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 37 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 22

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 2



## Patch 38 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 22

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 39 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 26

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 100

Nb of Failing EvoSuite Tests: 2



## Patch 40 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 26

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 100

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 41 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 28

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 3



## Patch 42 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 28

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 43 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 29

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 105

Nb of Failing EvoSuite Tests: 2



## Patch 44 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 29

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 105

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 45 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

org.jfree.data.xy.XYSeries.this.data.add(new org.jfree.data.xy.XYDataItem(x , y))

```


Seed: 30

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 2



## Patch 46 #  jGenProg+MinImpact 

org.jfree.data.xy.XYSeries : 564

Patch type: ReplaceOp

```Java

add(x, y, true)

```


Seed: 30

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 2


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 77.66

Average Nb of Failing EvoSuite Tests: 1.59

Average Nb of Test-adequate patches: 2

Running jGenProg + MinImpact changes the original patch for 19 of the 30 seeds. The human patch extracts a predicate !this.allowDuplicateXValues from an if condition and adds a specific if condition to deal with the situation corresponding to the extracted predicate. The original patch and newly generated patches by running jGenProg + MinImpact replace an old statement with a new statement to make the failing test pass, we think they are incorrect. Note for some seeds, running jGenProg does not generate a single patch, so the approach MinImpact is not used.

---
