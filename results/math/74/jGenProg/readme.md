#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//math/ project math
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/ode/nonstiff/EmbeddedRungeKuttaIntegrator.java b/src/main/java/org/apache/commons/math/ode/nonstiff/EmbeddedRungeKuttaIntegrator.java
index 1bbad3e..6f3e883 100644
--- a/src/main/java/org/apache/commons/math/ode/nonstiff/EmbeddedRungeKuttaIntegrator.java
+++ b/src/main/java/org/apache/commons/math/ode/nonstiff/EmbeddedRungeKuttaIntegrator.java
@@ -242,15 +242,12 @@ public abstract class EmbeddedRungeKuttaIntegrator
         }
 
         if (firstTime) {
-          final double[] scale = new double[y0.length];
+          final double[] scale;
           if (vecAbsoluteTolerance == null) {
-              for (int i = 0; i < scale.length; ++i) {
-                scale[i] = scalAbsoluteTolerance + scalRelativeTolerance * Math.abs(y[i]);
-              }
+              scale = new double[y0.length];
+              java.util.Arrays.fill(scale, scalAbsoluteTolerance);
             } else {
-              for (int i = 0; i < scale.length; ++i) {
-                scale[i] = vecAbsoluteTolerance[i] + vecRelativeTolerance[i] * Math.abs(y[i]);
-              }
+              scale = vecAbsoluteTolerance;
             }
           hNew = initializeStep(equations, forward, getOrder(), scale,
                                 stepStart, y, yDotK[0], yTmp, yDotK[1]);
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 317

Patch type: InsertAfterOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 242

Patch type: InsertAfterOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 2:06 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 407

Patch type: InsertAfterOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 12

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 435

Patch type: InsertBeforeOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 9

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 208

Patch type: InsertAfterOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 2:24 (hh:mm) 

Nb of EvoSuite Tests: 9

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 251

Patch type: InsertAfterOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 319

Patch type: InsertBeforeOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 2:34 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 10

## Patch 8 #  jGenProg+MinImpact With Seed 10

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 407

Patch type: InsertAfterOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 12

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 11

## Patch 9 #  jGenProg+MinImpact With Seed 11

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 409

Patch type: InsertBeforeOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 2:05 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 13

## Patch 10 #  jGenProg+MinImpact With Seed 13

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 425

Patch type: InsertBeforeOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 2:22 (hh:mm) 

Nb of EvoSuite Tests: 8

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 14

## Patch 11 #  jGenProg+MinImpact With Seed 14

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 210

Patch type: InsertBeforeOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 3:00 (hh:mm) 

Nb of EvoSuite Tests: 10

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 15

## Patch 12 #  jGenProg+MinImpact With Seed 15

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 407

Patch type: InsertBeforeOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 10

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 16

## Patch 13 #  jGenProg+MinImpact With Seed 16

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 229

Patch type: ReplaceOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 2:25 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 21

## Patch 14 #  jGenProg+MinImpact With Seed 21

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 279

Patch type: InsertBeforeOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 22

## Patch 15 #  jGenProg+MinImpact With Seed 22

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 229

Patch type: InsertBeforeOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 8

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 23

## Patch 16 #  jGenProg+MinImpact With Seed 23

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 426

Patch type: InsertAfterOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 9

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 24

## Patch 17 #  jGenProg+MinImpact With Seed 24

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsIntegrator : 128

Patch type: InsertBeforeOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 13

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 26

## Patch 18 #  jGenProg+MinImpact With Seed 26

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 237

Patch type: InsertAfterOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 9

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 29

## Patch 19 #  jGenProg+MinImpact With Seed 29

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 287

Patch type: ReplaceOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 2:41 (hh:mm) 

Nb of EvoSuite Tests: 11

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 30

## Patch 20 #  jGenProg+MinImpact With Seed 30

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 223

Patch type: InsertAfterOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 12

Nb of Failing EvoSuite Tests: 3



## Patch 21 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator : 251

Patch type: InsertBeforeOp

```Java

setMaxGrowth(10.0)

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 12

Nb of Failing EvoSuite Tests: 3


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 10.52

Average Nb of Failing EvoSuite Tests: 0.71

Average Nb of Test-adequate patches: 1.05

---