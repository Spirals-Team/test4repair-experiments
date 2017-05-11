
##Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/linear/OpenMapRealVector.java b/src/main/java/org/apache/commons/math/linear/OpenMapRealVector.java
index 13ebfd2..5db4884 100644
--- a/src/main/java/org/apache/commons/math/linear/OpenMapRealVector.java
+++ b/src/main/java/org/apache/commons/math/linear/OpenMapRealVector.java
@@ -342,7 +342,7 @@ public class OpenMapRealVector extends AbstractRealVector
     public OpenMapRealVector ebeDivide(RealVector v) {
         checkVectorDimensions(v.getDimension());
         OpenMapRealVector res = new OpenMapRealVector(this);
+        Iterator iter = entries.iterator();
-        Iterator iter = res.entries.iterator();
         while (iter.hasNext()) {
             iter.advance();
             res.setEntry(iter.key(), iter.value() / v.getEntry(iter.key()));
@@ -355,7 +355,7 @@ public class OpenMapRealVector extends AbstractRealVector
     public OpenMapRealVector ebeDivide(double[] v) {
         checkVectorDimensions(v.length);
         OpenMapRealVector res = new OpenMapRealVector(this);
+        Iterator iter = entries.iterator();
-        Iterator iter = res.entries.iterator();
         while (iter.hasNext()) {
             iter.advance();
             res.setEntry(iter.key(), iter.value() / v[iter.key()]);
@@ -367,7 +367,7 @@ public class OpenMapRealVector extends AbstractRealVector
     public OpenMapRealVector ebeMultiply(RealVector v) {
         checkVectorDimensions(v.getDimension());
         OpenMapRealVector res = new OpenMapRealVector(this);
+        Iterator iter = entries.iterator();
-        Iterator iter = res.entries.iterator();
         while (iter.hasNext()) {
             iter.advance();
             res.setEntry(iter.key(), iter.value() * v.getEntry(iter.key()));
@@ -380,7 +380,7 @@ public class OpenMapRealVector extends AbstractRealVector
     public OpenMapRealVector ebeMultiply(double[] v) {
         checkVectorDimensions(v.length);
         OpenMapRealVector res = new OpenMapRealVector(this);
+        Iterator iter = entries.iterator();
-        Iterator iter = res.entries.iterator();
         while (iter.hasNext()) {
             iter.advance();
             res.setEntry(iter.key(), iter.value() * v[iter.key()]);
```


## Patch Original jGenProg 

org.apache.commons.math.linear.OpenMapRealVector:667

Patch type: ReplaceOp 
 
```Java
entries.put(index, value)
```

Execution Time: 0:08 (hh:mm)

--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 1

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 176

Nb of Failing EvoSuite Tests: 8


--- 


## Patch 2 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 2

Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 3 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 2

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 175

Nb of Failing EvoSuite Tests: 8


--- 


## Patch 4 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 3

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 1



## Patch 5 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 3

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 186

Nb of Failing EvoSuite Tests: 6


--- 


## Patch 6 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 7 #  jGenProg+MinImpact 

org.apache.commons.math.util.OpenIntToDoubleHashMap : 395

Patch type: InsertAfterOp

```Java

int count = 1

```


Seed: 4

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 8 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 4

Execution Time: 2:18 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 6


--- 


## Patch 9 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 10 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 5

Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 167

Nb of Failing EvoSuite Tests: 8


--- 


## Patch 11 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 41

Nb of Failing EvoSuite Tests: 1



## Patch 12 #  jGenProg+MinImpact 

org.apache.commons.math.util.OpenIntToDoubleHashMap : 398

Patch type: InsertAfterOp

```Java

int count = 1

```


Seed: 6

Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 41

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 13 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 0



## Patch 14 #  jGenProg+MinImpact 

org.apache.commons.math.util.OpenIntToDoubleHashMap : 398

Patch type: InsertBeforeOp

```Java

int count = 1

```


Seed: 7

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 0



## Patch 15 #  jGenProg+MinImpact 

org.apache.commons.math.util.OpenIntToDoubleHashMap : 396

Patch type: InsertAfterOp

```Java

int count = 1

```


Seed: 7

Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 16 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1



## Patch 17 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 8

Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 169

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 18 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 19 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 10

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 20 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 10

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 179

Nb of Failing EvoSuite Tests: 13


--- 


## Patch 21 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 41

Nb of Failing EvoSuite Tests: 1



## Patch 22 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 11

Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 172

Nb of Failing EvoSuite Tests: 11


--- 


## Patch 23 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 12

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 0



## Patch 24 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 12

Execution Time: 2:23 (hh:mm) 

Nb of EvoSuite Tests: 162

Nb of Failing EvoSuite Tests: 8


--- 


## Patch 25 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 1



## Patch 26 #  jGenProg+MinImpact 

org.apache.commons.math.util.OpenIntToDoubleHashMap : 397

Patch type: InsertAfterOp

```Java

int count = 1

```


Seed: 13

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 27 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 41

Nb of Failing EvoSuite Tests: 0



## Patch 28 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 14

Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 187

Nb of Failing EvoSuite Tests: 9


--- 


## Patch 29 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 0



## Patch 30 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 15

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 169

Nb of Failing EvoSuite Tests: 13


--- 


## Patch 31 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 32 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 16

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 166

Nb of Failing EvoSuite Tests: 12


--- 


## Patch 33 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 34 #  jGenProg+MinImpact 

org.apache.commons.math.util.OpenIntToDoubleHashMap : 394

Patch type: InsertAfterOp

```Java

int count = 1

```


Seed: 17

Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 35 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 17

Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 157

Nb of Failing EvoSuite Tests: 9


--- 


## Patch 36 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 37 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 18

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 175

Nb of Failing EvoSuite Tests: 6


--- 


## Patch 38 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 19

Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 1



## Patch 39 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 19

Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 170

Nb of Failing EvoSuite Tests: 17


--- 


## Patch 40 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 41

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 41 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 21

Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 1



## Patch 42 #  jGenProg+MinImpact 

org.apache.commons.math.util.OpenIntToDoubleHashMap : 394

Patch type: InsertBeforeOp

```Java

int count = 1

```


Seed: 21

Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 1



## Patch 43 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 21

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 185

Nb of Failing EvoSuite Tests: 11


--- 


## Patch 44 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 22

Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 45 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 2



## Patch 46 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 23

Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 175

Nb of Failing EvoSuite Tests: 14


--- 


## Patch 47 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 41

Nb of Failing EvoSuite Tests: 0



## Patch 48 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 24

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 176

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 49 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 25

Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 0



## Patch 50 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 25

Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 174

Nb of Failing EvoSuite Tests: 5


--- 


## Patch 51 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 395

Patch type: InsertAfterOp

```Java

int count = 1

```


Seed: 26

Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 2



## Patch 52 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 26

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 177

Nb of Failing EvoSuite Tests: 15


--- 


## Patch 53 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 27

Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 0



## Patch 54 #  jGenProg+MinImpact 

org.apache.commons.math.util.OpenIntToDoubleHashMap : 396

Patch type: InsertBeforeOp

```Java

int count = 1

```


Seed: 27

Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 55 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 28

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 0



## Patch 56 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 28

Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 182

Nb of Failing EvoSuite Tests: 8


--- 


## Patch 57 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 397

Patch type: InsertBeforeOp

```Java

int count = 1

```


Seed: 29

Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 58 #  jGenProg+MinImpact 

org.apache.commons.math.util.OpenIntToDoubleHashMap : 394

Patch type: InsertBeforeOp

```Java

int count = 1

```


Seed: 29

Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 59 #  jGenProg+MinImpact 

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 29

Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 60 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 29

Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 177

Nb of Failing EvoSuite Tests: 7


--- 


## Patch 61 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.util.OpenIntToDoubleHashMap : 399

Patch type: RemoveOp

```Java

remove

```


Seed: 30

Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1



## Patch 62 #  jGenProg+MinImpact 

org.apache.commons.math.util.OpenIntToDoubleHashMap : 396

Patch type: InsertAfterOp

```Java

int count = 1

```


Seed: 30

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1



## Patch 63 #  jGenProg+MinImpact 

org.apache.commons.math.linear.OpenMapRealVector : 667

Patch type: ReplaceOp

```Java

entries.put(index, value)

```


Seed: 30

Execution Time: 2:34 (hh:mm) 

Nb of EvoSuite Tests: 184

Nb of Failing EvoSuite Tests: 6


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 90.29

Average Nb of Failing EvoSuite Tests: 3.59

Average Nb of Test-adequate patches: 2.1

Running jGenProg + MinImpact changes the original patch for 29 of the 30 seeds. The human patch changes the iterator. The original patch and the newly generated patches by running jGenProg + MinImpact seem to be irrelevant to the human patch, we think they are incorrect. 

---
