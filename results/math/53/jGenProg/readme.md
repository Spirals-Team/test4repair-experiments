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

## Patch Original jGenProg 

[org.apache.commons.math.complex.Complex:153](https://github.com/apache/commons-math/blob/fe761c28ceca03d859ec34273798d67d85bd704b/src/main/java//org/apache/commons/math/complex/Complex.java#L153) (Suspicious rank: ample 1, jaccard 1, ochiai 2, naish1 21135, gp13 1, naish2 1, tarantula 1, )

Patch type: INSERT_BEFORE 
 
```Java
if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 
```

Execution time: 0:05:02.971000

Grid5000 node: graphene-77.nancy.grid5000.fr

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 128

Nb of Failing EvoSuite Tests: 0



## Patch 2 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 128

Nb of Failing EvoSuite Tests: 0



## Patch 3 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 128

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 2

## Patch 4 #  jGenProg+MinImpact With Seed 2

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 1



## Patch 5 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 1



## Patch 6 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 3

## Patch 7 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 118

Nb of Failing EvoSuite Tests: 1



## Patch 8 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 118

Nb of Failing EvoSuite Tests: 1



## Patch 9 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 118

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 4

## Patch 10 #  jGenProg+MinImpact With Seed 4

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 1



## Patch 11 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 1



## Patch 12 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 5

## Patch 13 #  jGenProg+MinImpact With Seed 5

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 1



## Patch 14 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 1



## Patch 15 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 6

## Patch 16 #  jGenProg+MinImpact With Seed 6

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 0



## Patch 17 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 0



## Patch 18 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 7

## Patch 19 #  jGenProg+MinImpact With Seed 7

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 0



## Patch 20 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 8

## Patch 21 #  jGenProg+MinImpact With Seed 8

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 1



## Patch 22 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 9

## Patch 23 #  jGenProg+MinImpact With Seed 9

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 0



## Patch 24 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 0



## Patch 25 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 10

## Patch 26 #  jGenProg+MinImpact With Seed 10

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 129

Nb of Failing EvoSuite Tests: 0



## Patch 27 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 129

Nb of Failing EvoSuite Tests: 0



## Patch 28 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 129

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 11

## Patch 29 #  jGenProg+MinImpact With Seed 11

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 2



## Patch 30 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 2



## Patch 31 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 12

## Patch 32 #  jGenProg+MinImpact With Seed 12

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 33 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 0



## Patch 34 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 13

## Patch 35 #  jGenProg+MinImpact With Seed 13

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 1



## Patch 36 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 1



## Patch 37 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 14

## Patch 38 #  jGenProg+MinImpact With Seed 14

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 1



## Patch 39 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 1



## Patch 40 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 127

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 15

## Patch 41 #  jGenProg+MinImpact With Seed 15

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 1



## Patch 42 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 1



## Patch 43 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 16

## Patch 44 #  jGenProg+MinImpact With Seed 16

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 0



## Patch 45 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 17

## Patch 46 #  jGenProg+MinImpact With Seed 17

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 1



## Patch 47 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 1



## Patch 48 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 125

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 18

## Patch 49 #  jGenProg+MinImpact With Seed 18

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 124

Nb of Failing EvoSuite Tests: 1



## Patch 50 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 124

Nb of Failing EvoSuite Tests: 1



## Patch 51 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 124

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 19

## Patch 52 #  jGenProg+MinImpact With Seed 19

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 1



## Patch 53 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 1



## Patch 54 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 20

## Patch 55 #  jGenProg+MinImpact With Seed 20

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 0



## Patch 56 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 0



## Patch 57 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 21

## Patch 58 #  jGenProg+MinImpact With Seed 21

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 128

Nb of Failing EvoSuite Tests: 1



## Patch 59 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 128

Nb of Failing EvoSuite Tests: 1



## Patch 60 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 128

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 22

## Patch 61 #  jGenProg+MinImpact With Seed 22

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 1



## Patch 62 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 23

## Patch 63 #  jGenProg+MinImpact With Seed 23

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 2



## Patch 64 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 2



## Patch 65 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 24

## Patch 66 #  jGenProg+MinImpact With Seed 24

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 1



## Patch 67 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 1



## Patch 68 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 25

## Patch 69 #  jGenProg+MinImpact With Seed 25

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 1



## Patch 70 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 1



## Patch 71 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 26

## Patch 72 #  jGenProg+MinImpact With Seed 26

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 1



## Patch 73 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 27

## Patch 74 #  jGenProg+MinImpact With Seed 27

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 129

Nb of Failing EvoSuite Tests: 1



## Patch 75 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 129

Nb of Failing EvoSuite Tests: 1



## Patch 76 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 129

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 28

## Patch 77 #  jGenProg+MinImpact With Seed 28

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 1



## Patch 78 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 1



## Patch 79 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 29

## Patch 80 #  jGenProg+MinImpact With Seed 29

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 1



## Patch 81 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 1



## Patch 82 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 30

## Patch 83 #  jGenProg+MinImpact With Seed 30

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.complex.Complex : 152

Patch type: InsertAfterOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 0



## Patch 84 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.complex.Complex : 153

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 0



## Patch 85 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.complex.Complex : 152

Patch type: InsertBeforeOp

```Java

if ((isNaN) || (rhs.isNaN)) {
	return org.apache.commons.math.complex.Complex.NaN;
} 

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 126

Nb of Failing EvoSuite Tests: 1


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 124.47

Average Nb of Failing EvoSuite Tests: 1.08

Average Nb of Test-adequate patches: 2.83

---