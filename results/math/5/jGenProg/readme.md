#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//math/ project math
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math3/complex/Complex.java b/src/main/java/org/apache/commons/math3/complex/Complex.java
index ac8185b..22b23f2 100644
--- a/src/main/java/org/apache/commons/math3/complex/Complex.java
+++ b/src/main/java/org/apache/commons/math3/complex/Complex.java
@@ -302,7 +302,7 @@ public class Complex implements FieldElement<Complex>, Serializable  {
         }
 
         if (real == 0.0 && imaginary == 0.0) {
-            return INF;
+            return NaN;
         }
 
         if (isInfinite) {
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 167

Nb of Failing EvoSuite Tests: 167


--- 
#Seed: 3

## Patch 2 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 170

Nb of Failing EvoSuite Tests: 170


--- 
#Seed: 5

## Patch 3 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 169

Nb of Failing EvoSuite Tests: 169


--- 
#Seed: 6

## Patch 4 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 168

Nb of Failing EvoSuite Tests: 168


--- 
#Seed: 7

## Patch 5 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 165

Nb of Failing EvoSuite Tests: 165


--- 
#Seed: 8

## Patch 6 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 164

Nb of Failing EvoSuite Tests: 164


--- 
#Seed: 11

## Patch 7 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 167

Nb of Failing EvoSuite Tests: 167


--- 
#Seed: 12

## Patch 8 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 170

Nb of Failing EvoSuite Tests: 170


--- 
#Seed: 13

## Patch 9 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 165

Nb of Failing EvoSuite Tests: 165


--- 
#Seed: 15

## Patch 10 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 167

Nb of Failing EvoSuite Tests: 167


--- 
#Seed: 16

## Patch 11 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 167

Nb of Failing EvoSuite Tests: 167


--- 
#Seed: 17

## Patch 12 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 158

Nb of Failing EvoSuite Tests: 158


--- 
#Seed: 18

## Patch 13 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 173

Nb of Failing EvoSuite Tests: 173


--- 
#Seed: 21

## Patch 14 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 171

Nb of Failing EvoSuite Tests: 171


--- 
#Seed: 22

## Patch 15 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 162

Nb of Failing EvoSuite Tests: 162


--- 
#Seed: 23

## Patch 16 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 162

Nb of Failing EvoSuite Tests: 162


--- 
#Seed: 24

## Patch 17 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 155

Nb of Failing EvoSuite Tests: 155


--- 
#Seed: 25

## Patch 18 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 163

Nb of Failing EvoSuite Tests: 163


--- 
#Seed: 27

## Patch 19 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 163

Nb of Failing EvoSuite Tests: 163


--- 
#Seed: 28
--- 
#Seed: 29

## Patch 20 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 173

Nb of Failing EvoSuite Tests: 173


--- 
#Seed: 30

## Patch 21 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 156

Nb of Failing EvoSuite Tests: 156


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 173

Average Nb of Failing EvoSuite Tests: 10

---