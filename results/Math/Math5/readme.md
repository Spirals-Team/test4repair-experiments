
##Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math3/complex/Complex.java b/src/main/java/org/apache/commons/math3/complex/Complex.java
index ac8185b..22b23f2 100644
--- a/src/main/java/org/apache/commons/math3/complex/Complex.java
+++ b/src/main/java/org/apache/commons/math3/complex/Complex.java
@@ -302,7 +302,7 @@ public class Complex implements FieldElement<Complex>, Serializable  {
         }
 
         if (real == 0.0 && imaginary == 0.0) {
+            return INF;
-            return NaN;
         }
 
         if (isInfinite) {
```

## Patch Original jGenProg 

org.apache.commons.math3.complex.Complex:305

Patch type: ReplaceOp 
 
```Java
return org.apache.commons.math3.complex.Complex.INF
```

Execution Time: 0:21 (hh:mm)

--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 1

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 167

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 2 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 3

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 170

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 3 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 5

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 169

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 4 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 6

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 168

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 5 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 7

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 165

Nb of Failing EvoSuite Tests: 8


--- 


## Patch 6 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 8

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 164

Nb of Failing EvoSuite Tests: 6


--- 


## Patch 7 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 11

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 167

Nb of Failing EvoSuite Tests: 10


--- 


## Patch 8 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 12

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 170

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 9 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 13

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 165

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 10 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 15

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 167

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 11 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 16

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 167

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 12 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 17

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 158

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 13 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 18

Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 173

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 14 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 21

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 171

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 15 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 22

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 162

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 16 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 23

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 162

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 17 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 24

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 155

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 18 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 25

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 163

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 19 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 27

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 163

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 20 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 29

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 173

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 21 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.complex.Complex : 305

Patch type: ReplaceOp

```Java

return org.apache.commons.math3.complex.Complex.INF

```


Seed: 30

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 156

Nb of Failing EvoSuite Tests: 4


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 157.95

Average Nb of Failing EvoSuite Tests: 2.55

Average Nb of Test-adequate patches: 1

Running jGenProg + MinImpact changes the original patch for 9 of the 30 seeds. The human patch replaces the statement return 0 with statement return INF. The original patch is the same as the human patch. For some seeds, running jGenProg does not generate a single patch, so the approach MinImpact is not used. For other seeds, running jGenProg + MinImpact always generates the patch that is the same with the original patch.

---
