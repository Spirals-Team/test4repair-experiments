
##Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/complex/Complex.java b/src/main/java/org/apache/commons/math/complex/Complex.java
index ab58c78..e0a8e97 100644
--- a/src/main/java/org/apache/commons/math/complex/Complex.java
+++ b/src/main/java/org/apache/commons/math/complex/Complex.java
@@ -150,9 +150,6 @@ public class Complex implements FieldElement<Complex>, Serializable  {
     public Complex add(Complex rhs)
         throws NullArgumentException {
         MathUtils.checkNotNull(rhs);
+        if (isNaN || rhs.isNaN) {
+            return NaN;
+        }
         return createComplex(real + rhs.getReal(),
             imaginary + rhs.getImaginary());
     }
```

## Patch Original jGenProg 

org.apache.commons.math.complex.Complex:153

Patch type: InsertBeforeOp 
 
```Java
if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 
```

Execution Time: 0:05 (hh:mm)


--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 1

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 128

Nb of Failing EvoSuite Tests: 0



## Patch 2 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 1

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 128

Nb of Failing EvoSuite Tests: 0



## Patch 3 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 1

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 128

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 4 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 2

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 1



## Patch 5 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 2

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 1



## Patch 6 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 2

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 7 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 3

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 118

Nb of Failing EvoSuite Tests: 1



## Patch 8 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 3

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 118

Nb of Failing EvoSuite Tests: 1



## Patch 9 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 3

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 118

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 10 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 4

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 1



## Patch 11 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 4

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 1



## Patch 12 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 4

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 13 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 5

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 1



## Patch 14 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 5

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 1



## Patch 15 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 5

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 16 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 6

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 0



## Patch 17 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 6

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 0



## Patch 18 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 6

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 19 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 7

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 0



## Patch 20 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 7

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 21 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 8

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 1



## Patch 22 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 8

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 23 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 9

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 0



## Patch 24 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 9

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 0



## Patch 25 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 9

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 26 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 10

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 129

Nb of Failing EvoSuite Tests: 0



## Patch 27 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 10

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 129

Nb of Failing EvoSuite Tests: 0



## Patch 28 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 10

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 129

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 29 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 11

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 2



## Patch 30 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 11

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 2



## Patch 31 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 11

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 32 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 12

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 33 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 12

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 34 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 12

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 35 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 13

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 1



## Patch 36 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 13

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 1



## Patch 37 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 13

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 38 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 14

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 1



## Patch 39 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 14

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 1



## Patch 40 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 14

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 41 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 15

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 1



## Patch 42 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 15

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 1



## Patch 43 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 15

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 44 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 16

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 0



## Patch 45 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 16

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 46 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 17

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 1



## Patch 47 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 17

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 1



## Patch 48 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 17

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 49 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 18

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 124

Nb of Failing EvoSuite Tests: 1



## Patch 50 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 18

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 124

Nb of Failing EvoSuite Tests: 1



## Patch 51 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 18

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 124

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 52 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 19

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 1



## Patch 53 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 19

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 1



## Patch 54 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 19

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 55 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 20

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 0



## Patch 56 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 20

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 0



## Patch 57 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 20

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 58 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 21

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 128

Nb of Failing EvoSuite Tests: 1



## Patch 59 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 21

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 128

Nb of Failing EvoSuite Tests: 1



## Patch 60 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 21

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 128

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 61 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 22

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 1



## Patch 62 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 22

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 63 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 23

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 2



## Patch 64 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 23

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 2



## Patch 65 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 23

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 66 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 24

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 1



## Patch 67 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 24

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 1



## Patch 68 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 24

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 69 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 25

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 1



## Patch 70 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 25

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 1



## Patch 71 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 25

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 72 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 26

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 1



## Patch 73 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 26

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 74 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 27

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 129

Nb of Failing EvoSuite Tests: 1



## Patch 75 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 27

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 129

Nb of Failing EvoSuite Tests: 1



## Patch 76 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 27

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 129

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 77 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 28

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 1



## Patch 78 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 28

Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 1



## Patch 79 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 28

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 80 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 29

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 1



## Patch 81 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 29

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 1



## Patch 82 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 29

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 83 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 30

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 0



## Patch 84 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 30

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 0



## Patch 85 #  jGenProg+MinImpact 

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Seed: 30

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 1


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 124.47

Average Nb of Failing EvoSuite Tests: 1.08

Average Nb of Test-adequate patches: 2.83

Running jGenProg + MinImpact changes the original patch for 13 of the 30 seeds. The human patch adds a precondition to check whether the argument is a Nan, and returns an appropriate value. The original patch and the newly generated patches by running jGenProg + MinImpact all equate to the human patch, and are thus correct.

---
