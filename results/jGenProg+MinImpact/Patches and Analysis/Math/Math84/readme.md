
##Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/optimization/direct/MultiDirectional.java b/src/main/java/org/apache/commons/math/optimization/direct/MultiDirectional.java
index 929560c..42a4d9d 100644
--- a/src/main/java/org/apache/commons/math/optimization/direct/MultiDirectional.java
+++ b/src/main/java/org/apache/commons/math/optimization/direct/MultiDirectional.java
@@ -61,7 +61,6 @@ public class MultiDirectional extends DirectSearchOptimizer {
     protected void iterateSimplex(final Comparator<RealPointValuePair> comparator)
         throws FunctionEvaluationException, OptimizationException, IllegalArgumentException {
 
+        final RealConvergenceChecker checker = getConvergenceChecker();
         while (true) {
 
             incrementIterationsCounter();
@@ -90,16 +89,8 @@ public class MultiDirectional extends DirectSearchOptimizer {
             final RealPointValuePair contracted = evaluateNewSimplex(original, gamma, comparator);
             if (comparator.compare(contracted, best) < 0) {
                 // accept the contracted simplex
+                return;
+            }
 
             // check convergence
+            final int iter = getIterations();
+            boolean converged = true;
+            for (int i = 0; i < simplex.length; ++i) {
+                converged &= checker.converged(iter, original[i], simplex[i]);
+            }
+            if (converged) {
                 return;
             }
 
```

## Patch Original jGenProg 

org.apache.commons.math.optimization.direct.MultiDirectional:90

Patch type: ReplaceOp 
 
```Java
return 
```

Execution Time: 0:17 (hh:mm)


--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

break

```


Seed: 2

Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 5

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 2 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

return 

```


Seed: 3

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 6

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 3 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

return 

```


Seed: 6

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 6

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 4 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

return 

```


Seed: 10

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 6

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 5 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

break

```


Seed: 12

Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 6

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 6 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

return 

```


Seed: 13

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 5

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 7 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

return 

```


Seed: 16

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 5

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 8 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

return 

```


Seed: 18

Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 6

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 9 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

break

```


Seed: 20

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 5

Nb of Failing EvoSuite Tests: 0



## Patch 10 #  jGenProg+MinImpact 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

return 

```


Seed: 20

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 5

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 11 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

break

```


Seed: 23

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 12 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

break

```


Seed: 24

Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 5

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 13 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

break

```


Seed: 26

Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 5

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 14 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

return 

```


Seed: 27

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 5

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 15 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

return 

```


Seed: 28

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 7

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 16 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

break

```


Seed: 29

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 5

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 17 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: InsertAfterOp

```Java

break

```


Seed: 30

Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 6

Nb of Failing EvoSuite Tests: 0


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 5.59

Average Nb of Failing EvoSuite Tests: 0

Average Nb of Test-adequate patches: 1.06

Running jGenProg + MinImpact changes the original patch for 22 of the 30 seeds. The human patch involves multiple changes to the code, the original patch and the newly generated patches by running jGenProg + MinImpact are much simpler comapred to the human patch, we think they just make the failing test pass and are incorrect. Note for some seeds, running jGenProg does not generate a single patch, so the approach MinImpact is not used.

---
