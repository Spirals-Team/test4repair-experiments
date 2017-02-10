#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//math/ project math
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/linear/OpenMapRealVector.java b/src/main/java/org/apache/commons/math/linear/OpenMapRealVector.java
index 13ebfd2..5db4884 100644
--- a/src/main/java/org/apache/commons/math/linear/OpenMapRealVector.java
+++ b/src/main/java/org/apache/commons/math/linear/OpenMapRealVector.java
@@ -342,7 +342,7 @@ public class OpenMapRealVector extends AbstractRealVector
     public OpenMapRealVector ebeDivide(RealVector v) {
         checkVectorDimensions(v.getDimension());
         OpenMapRealVector res = new OpenMapRealVector(this);
-        Iterator iter = entries.iterator();
+        Iterator iter = res.entries.iterator();
         while (iter.hasNext()) {
             iter.advance();
             res.setEntry(iter.key(), iter.value() / v.getEntry(iter.key()));
@@ -355,7 +355,7 @@ public class OpenMapRealVector extends AbstractRealVector
     public OpenMapRealVector ebeDivide(double[] v) {
         checkVectorDimensions(v.length);
         OpenMapRealVector res = new OpenMapRealVector(this);
-        Iterator iter = entries.iterator();
+        Iterator iter = res.entries.iterator();
         while (iter.hasNext()) {
             iter.advance();
             res.setEntry(iter.key(), iter.value() / v[iter.key()]);
@@ -367,7 +367,7 @@ public class OpenMapRealVector extends AbstractRealVector
     public OpenMapRealVector ebeMultiply(RealVector v) {
         checkVectorDimensions(v.getDimension());
         OpenMapRealVector res = new OpenMapRealVector(this);
-        Iterator iter = entries.iterator();
+        Iterator iter = res.entries.iterator();
         while (iter.hasNext()) {
             iter.advance();
             res.setEntry(iter.key(), iter.value() * v.getEntry(iter.key()));
@@ -380,7 +380,7 @@ public class OpenMapRealVector extends AbstractRealVector
     public OpenMapRealVector ebeMultiply(double[] v) {
         checkVectorDimensions(v.length);
         OpenMapRealVector res = new OpenMapRealVector(this);
-        Iterator iter = entries.iterator();
+        Iterator iter = res.entries.iterator();
         while (iter.hasNext()) {
             iter.advance();
             res.setEntry(iter.key(), iter.value() * v[iter.key()]);
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 176

Nb of Failing EvoSuite Tests: 176


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 44


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 44


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 41

Nb of Failing EvoSuite Tests: 41


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46


--- 
#Seed: 9

## Patch 9 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 10

## Patch 10 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42


--- 
#Seed: 11

## Patch 11 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 41

Nb of Failing EvoSuite Tests: 41


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 41

Nb of Failing EvoSuite Tests: 41


--- 
#Seed: 15

## Patch 15 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 16

## Patch 16 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 44


--- 
#Seed: 17

## Patch 17 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 44


--- 
#Seed: 18

## Patch 18 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45


--- 
#Seed: 19

## Patch 19 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 41

Nb of Failing EvoSuite Tests: 41


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 23

## Patch 23 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45


--- 
#Seed: 24

## Patch 24 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 41

Nb of Failing EvoSuite Tests: 41


--- 
#Seed: 25

## Patch 25 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 26

## Patch 26 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.util.OpenIntToDoubleHashMap : 395

Patch type: InsertAfterOp

```Java

int count = 1

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 27

## Patch 27 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 28

## Patch 28 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 29

## Patch 29 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.util.OpenIntToDoubleHashMap : 397

Patch type: InsertBeforeOp

```Java

int count = 1

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 40


--- 
#Seed: 30

## Patch 30 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 76.25

Average Nb of Failing EvoSuite Tests: 3

---