
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/optimization/direct/MultiDirectional.java b/src/main/java/org/apache/commons/math/optimization/direct/MultiDirectional.java
index 929560c..42a4d9d 100644
--- a/src/main/java/org/apache/commons/math/optimization/direct/MultiDirectional.java
+++ b/src/main/java/org/apache/commons/math/optimization/direct/MultiDirectional.java
@@ -61,7 +61,6 @@ public class MultiDirectional extends DirectSearchOptimizer {
     protected void iterateSimplex(final Comparator<RealPointValuePair> comparator)
         throws FunctionEvaluationException, OptimizationException, IllegalArgumentException {
 
-        final RealConvergenceChecker checker = getConvergenceChecker();
         while (true) {
 
             incrementIterationsCounter();
@@ -90,16 +89,8 @@ public class MultiDirectional extends DirectSearchOptimizer {
             final RealPointValuePair contracted = evaluateNewSimplex(original, gamma, comparator);
             if (comparator.compare(contracted, best) < 0) {
                 // accept the contracted simplex
-                return;
-            }
 
             // check convergence
-            final int iter = getIterations();
-            boolean converged = true;
-            for (int i = 0; i < simplex.length; ++i) {
-                converged &= checker.converged(iter, original[i], simplex[i]);
-            }
-            if (converged) {
                 return;
             }
 
```

## Patch Original jGenProg 

[org.apache.commons.math.optimization.direct.MultiDirectional:90](https://github.com/apache/commons-math/blob/9cb0ca6b0fa639d30d9070f422de5a59c61eb86c/src/main/java//org/apache/commons/math/optimization/direct/MultiDirectional.java#L90) (Suspicious rank: ample 16, jaccard 16, ochiai 7, naish1 16169, gp13 16, naish2 16, tarantula 16, )

Patch type: REPLACE 
 
```Java
return 
```

Execution time: 0:17:39.817000

Grid5000 node: graphene-25.nancy.grid5000.fr

--- 
#Seed: 2

## Patch 1 #  jGenProg+MinImpact With Seed 2

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

break

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 5

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 3

## Patch 2 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

return 

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 6

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 6

## Patch 3 #  jGenProg+MinImpact With Seed 6

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

return 

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 6

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 10

## Patch 4 #  jGenProg+MinImpact With Seed 10

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

return 

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 6

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 12

## Patch 5 #  jGenProg+MinImpact With Seed 12

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

break

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 6

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 13

## Patch 6 #  jGenProg+MinImpact With Seed 13

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

return 

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 5

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 16

## Patch 7 #  jGenProg+MinImpact With Seed 16

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

return 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 5

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 18

## Patch 8 #  jGenProg+MinImpact With Seed 18

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

return 

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 6

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 20

## Patch 9 #  jGenProg+MinImpact With Seed 20

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

break

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 5

Nb of Failing EvoSuite Tests: 0



## Patch 10 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

return 

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 5

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 23

## Patch 11 #  jGenProg+MinImpact With Seed 23

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

break

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 24

## Patch 12 #  jGenProg+MinImpact With Seed 24

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

break

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 5

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 26

## Patch 13 #  jGenProg+MinImpact With Seed 26

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

break

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 5

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 27

## Patch 14 #  jGenProg+MinImpact With Seed 27

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

return 

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 5

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 28

## Patch 15 #  jGenProg+MinImpact With Seed 28

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

return 

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 29

## Patch 16 #  jGenProg+MinImpact With Seed 29

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

break

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 5

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 30

## Patch 17 #  jGenProg+MinImpact With Seed 30

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

break

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 6

Nb of Failing EvoSuite Tests: 0


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 5.59

Average Nb of Failing EvoSuite Tests: 0

Average Nb of Test-adequate patches: 1.06

---