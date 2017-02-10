#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//math/ project math
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math3/distribution/HypergeometricDistribution.java b/src/main/java/org/apache/commons/math3/distribution/HypergeometricDistribution.java
index 81e180c..2769127 100644
--- a/src/main/java/org/apache/commons/math3/distribution/HypergeometricDistribution.java
+++ b/src/main/java/org/apache/commons/math3/distribution/HypergeometricDistribution.java
@@ -265,7 +265,7 @@ public class HypergeometricDistribution extends AbstractIntegerDistribution {
      * size {@code n}, the mean is {@code n * m / N}.
      */
     public double getNumericalMean() {
-        return getSampleSize() * (getNumberOfSuccesses() / (double) getPopulationSize());
+        return (double) (getSampleSize() * getNumberOfSuccesses()) / (double) getPopulationSize();
     }
 
     /**
```

## Patch Original jGenProg 

[org.apache.commons.math3.distribution.AbstractIntegerDistribution:138](https://github.com/apache/commons-math/blob/6d66a863b5c0049926330ef217accba4e022a1db/src/main/java//org/apache/commons/math3/distribution/AbstractIntegerDistribution.java#L138) (Suspicious rank: ample 17, jaccard 17, ochiai 22, naish1 35438, gp13 17, naish2 17, tarantula 17, )

Patch type: REPLACE 
 
```Java
tmp = mu + (k * sigma)
```


--- 
#Seed: 8

## Patch 1 #  jGenProg+MinImpact With Seed 8

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.HypergeometricDistribution : 321

Patch type: InsertBeforeOp

```Java

numericalVarianceIsCalculated = true

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 0



## Patch 2 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math3.distribution.HypergeometricDistribution : 308

Patch type: InsertBeforeOp

```Java

numericalVarianceIsCalculated = true

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 15

## Patch 3 #  jGenProg+MinImpact With Seed 15

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.HypergeometricDistribution : 321

Patch type: InsertBeforeOp

```Java

numericalVarianceIsCalculated = true

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 1



## Patch 4 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math3.distribution.HypergeometricDistribution : 308

Patch type: InsertBeforeOp

```Java

numericalVarianceIsCalculated = true

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 23

## Patch 5 #  jGenProg+MinImpact With Seed 23

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.HypergeometricDistribution : 321

Patch type: InsertBeforeOp

```Java

numericalVarianceIsCalculated = true

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 24

## Patch 6 #  jGenProg+MinImpact With Seed 24

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.HypergeometricDistribution : 321

Patch type: InsertBeforeOp

```Java

numericalVarianceIsCalculated = true

```


Execution Time: 2:08 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 0


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 36.17

Average Nb of Failing EvoSuite Tests: 0.5

Average Nb of Test-adequate patches: 1.5

---