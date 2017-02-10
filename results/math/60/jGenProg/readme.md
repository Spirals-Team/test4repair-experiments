#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//math/ project math
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/distribution/NormalDistributionImpl.java b/src/main/java/org/apache/commons/math/distribution/NormalDistributionImpl.java
index 0d7ce7d..0e124d8 100644
--- a/src/main/java/org/apache/commons/math/distribution/NormalDistributionImpl.java
+++ b/src/main/java/org/apache/commons/math/distribution/NormalDistributionImpl.java
@@ -123,11 +123,18 @@ public class NormalDistributionImpl extends AbstractContinuousDistribution
      */
     public double cumulativeProbability(double x) throws MathException {
         final double dev = x - mean;
-        if (FastMath.abs(dev) > 40 * standardDeviation) { 
-            return dev < 0 ? 0.0d : 1.0d;
-        }
+        try {
         return 0.5 * (1.0 + Erf.erf((dev) /
                     (standardDeviation * FastMath.sqrt(2.0))));
+        } catch (MaxIterationsExceededException ex) {
+            if (x < (mean - 20 * standardDeviation)) { // JDK 1.5 blows at 38
+                return 0;
+            } else if (x > (mean + 20 * standardDeviation)) {
+                return 1;
+            } else {
+                throw ex;
+            }
+        }
     }
 
     /**
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:18 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 6

## Patch 2 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:57 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 7

## Patch 3 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:18 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 8

## Patch 4 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:11 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 9

## Patch 5 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:33 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 10

## Patch 6 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:12 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 11

## Patch 7 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:09 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 14

## Patch 8 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:39 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 15

## Patch 9 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:25 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 16

## Patch 10 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:43 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 18

## Patch 11 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:13 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 20

## Patch 12 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.util.ContinuedFraction : 164

Patch type: InsertAfterOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:16 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 21

## Patch 13 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:38 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 22

## Patch 14 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:45 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 24

## Patch 15 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:05 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 25

## Patch 16 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:26 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 26

## Patch 17 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:50 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 27

## Patch 18 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:54 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 28

## Patch 19 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:42 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 29

## Patch 20 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.util.ContinuedFraction : 186

Patch type: ReplaceOp

```Java

throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations , org.apache.commons.math.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION , x)

```


Execution Time: 5:19 (hh:mm) 

Nb of EvoSuite Tests: 1

Nb of Failing EvoSuite Tests: 1


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 1

Average Nb of Failing EvoSuite Tests: 0

---