
##Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math3/distribution/HypergeometricDistribution.java b/src/main/java/org/apache/commons/math3/distribution/HypergeometricDistribution.java
index 81e180c..2769127 100644
--- a/src/main/java/org/apache/commons/math3/distribution/HypergeometricDistribution.java
+++ b/src/main/java/org/apache/commons/math3/distribution/HypergeometricDistribution.java
@@ -265,7 +265,7 @@ public class HypergeometricDistribution extends AbstractIntegerDistribution {
      * size {@code n}, the mean is {@code n * m / N}.
      */
     public double getNumericalMean() {
+        return getSampleSize() * (getNumberOfSuccesses() / (double) getPopulationSize());
-        return (double) (getSampleSize() * getNumberOfSuccesses()) / (double) getPopulationSize();
     }
 
     /**
```

## Patch Original jGenProg 

org.apache.commons.math3.distribution.AbstractIntegerDistribution:138

Patch type: ReplaceOp 
 
```Java
tmp = mu + (k * sigma)
```

Execution Time: 0:11 (hh:mm)

--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.HypergeometricDistribution : 321

Patch type: InsertBeforeOp

```Java

numericalVarianceIsCalculated = true

```


Seed: 8

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 0



## Patch 2 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.HypergeometricDistribution : 308

Patch type: InsertBeforeOp

```Java

numericalVarianceIsCalculated = true

```


Seed: 8

Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 3 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.HypergeometricDistribution : 321

Patch type: InsertBeforeOp

```Java

numericalVarianceIsCalculated = true

```


Seed: 15

Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 1



## Patch 4 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.HypergeometricDistribution : 308

Patch type: InsertBeforeOp

```Java

numericalVarianceIsCalculated = true

```


Seed: 15

Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 5 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.HypergeometricDistribution : 321

Patch type: InsertBeforeOp

```Java

numericalVarianceIsCalculated = true

```


Seed: 23

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 6 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.HypergeometricDistribution : 321

Patch type: InsertBeforeOp

```Java

numericalVarianceIsCalculated = true

```


Seed: 24

Execution Time: 2:08 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 0


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 36.17

Average Nb of Failing EvoSuite Tests: 0.5

Average Nb of Test-adequate patches: 1.5

Running jGenProg + MinImpact changes the original patch for each of the 30 seeds. The human patch changes a mathematical formula from method getNumericalMean by including parenthesis for prioritizing the multiplication operation over a division. The original patch and the newly generated patches by running jGenProg + MinImpact seem to be irrelevant to the human patch, we think they are incorrect. Note for majority of the seeds, running jGenProg does not generate a single patch, so the approach MinImpact is not used.

---
