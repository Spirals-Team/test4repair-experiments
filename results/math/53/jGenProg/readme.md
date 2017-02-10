#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//math/ project math
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/complex/Complex.java b/src/main/java/org/apache/commons/math/complex/Complex.java
index ab58c78..e0a8e97 100644
--- a/src/main/java/org/apache/commons/math/complex/Complex.java
+++ b/src/main/java/org/apache/commons/math/complex/Complex.java
@@ -150,9 +150,6 @@ public class Complex implements FieldElement<Complex>, Serializable  {
     public Complex add(Complex rhs)
         throws NullArgumentException {
         MathUtils.checkNotNull(rhs);
-        if (isNaN || rhs.isNaN) {
-            return NaN;
-        }
         return createComplex(real + rhs.getReal(),
             imaginary + rhs.getImaginary());
     }
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 128

Nb of Failing EvoSuite Tests: 128


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 122


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 118

Nb of Failing EvoSuite Tests: 118


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 127


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 125


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 126


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 126


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 121


--- 
#Seed: 9

## Patch 9 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 127


--- 
#Seed: 10

## Patch 10 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 129

Nb of Failing EvoSuite Tests: 129


--- 
#Seed: 11

## Patch 11 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 126


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 125


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 121


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 127


--- 
#Seed: 15

## Patch 15 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 122


--- 
#Seed: 16

## Patch 16 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 123


--- 
#Seed: 17

## Patch 17 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 125


--- 
#Seed: 18

## Patch 18 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 124

Nb of Failing EvoSuite Tests: 124


--- 
#Seed: 19

## Patch 19 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 123


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 121


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 128

Nb of Failing EvoSuite Tests: 128


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 126


--- 
#Seed: 23

## Patch 23 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 119


--- 
#Seed: 24

## Patch 24 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 123


--- 
#Seed: 25

## Patch 25 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 126


--- 
#Seed: 26

## Patch 26 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 126


--- 
#Seed: 27

## Patch 27 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 129

Nb of Failing EvoSuite Tests: 129


--- 
#Seed: 28

## Patch 28 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 123


--- 
#Seed: 29

## Patch 29 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 122


--- 
#Seed: 30

## Patch 30 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 126


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 129

Average Nb of Failing EvoSuite Tests: 1.5

---