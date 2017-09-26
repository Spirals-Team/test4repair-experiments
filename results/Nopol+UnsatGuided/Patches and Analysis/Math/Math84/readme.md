
## Human Patch 

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


## Original Patch # Nopol 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Execution Time: 00:00 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 4

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:5

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 12

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:6

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 18

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:6

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 26

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:5

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 28

Execution Time: 00:02 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 35

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:5

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 41

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:5

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 54

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:6

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 60

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:6

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 66

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:5

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 75

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:6

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 83

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:6

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 98

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:6

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 100

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:6

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 104

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:5

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 111

Execution Time: 00:02 (hh:mm)

Nb of EvoSuite Tests:6

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 113

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:6

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 120

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:5

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 128

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:6

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 135

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:4

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 143

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:4

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 150

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:5

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 153

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:4

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 161

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:5

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 166

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:4

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 173

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:6

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 180

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:6

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 181

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:6

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 186

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:6

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.direct.MultiDirectional : 90

Patch type: CONDITIONAL

```Java
reflected!=null
```

Seed: 193

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:6

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:01 (hh:mm)

Average Nb of EvoSuite Tests:5.47

Average Nb of Removed Tests:0

Running Nopol+UnsatGuided does not change the original patch for any of the 30 seeds. The human patch involves multiple changes to the code, the generated patch makes a change to a conditional statement, we think it is incorrect.
