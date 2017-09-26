
## Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/analysis/solvers/BrentSolver.java b/src/main/java/org/apache/commons/math/analysis/solvers/BrentSolver.java
index e0cb427..8142b5e 100644
--- a/src/main/java/org/apache/commons/math/analysis/solvers/BrentSolver.java
+++ b/src/main/java/org/apache/commons/math/analysis/solvers/BrentSolver.java
@@ -133,10 +133,6 @@ public class BrentSolver extends UnivariateRealSolverImpl {
             return solve(f, initial, yInitial, max, yMax, initial, yInitial);
         }
 
+        if (yMin * yMax > 0) {
+            throw MathRuntimeException.createIllegalArgumentException(
+                  NON_BRACKETING_MESSAGE, min, max, yMin, yMax);
+        }
 
         // full Brent algorithm starting with provided initial guess
         return solve(f, min, yMin, max, yMax, initial, yInitial);

```


## Original Patch # Nopol 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
((!((1) != (lower))) && (org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result < org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.defaultFunctionValueAccuracy)) || (initial <= lower)
```

Execution Time: 00:00 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
(initial <= lower) || ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result < 1) && (!((1) != (lower))))
```

Seed: 4

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:34

Nb of Removed Tests:1


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
!((((lower) != (1)) || (initial < org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result)) && (lower <= initial))
```

Seed: 12

Execution Time: 00:18 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Removed Tests:1


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result < lower) && (!((1) != (lower)))) || (initial <= lower)
```

Seed: 18

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
((!((1) != (lower))) && (org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result < org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.defaultFunctionValueAccuracy)) || (initial <= lower)
```

Seed: 26

Execution Time: 00:23 (hh:mm)

Nb of EvoSuite Tests:37

Nb of Removed Tests:2


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
((!((1) != (lower))) && (org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result < org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.defaultFunctionValueAccuracy)) || (initial <= lower)
```

Seed: 28

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:36

Nb of Removed Tests:1


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
(initial <= lower) || ((1 == lower) && (org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result < lower))
```

Seed: 35

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:38

Nb of Removed Tests:1


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
((!((1) != (lower))) && (org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result < org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.defaultFunctionValueAccuracy)) || (initial <= lower)
```

Seed: 41

Execution Time: 00:17 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Removed Tests:1


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
(initial <= lower) || (!(((upper) - (lower) + (upper) - (lower)) != (1)))
```

Seed: 54

Execution Time: 00:18 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result <= lower) && (1 == lower)) || (initial < lower)
```

Seed: 60

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result < initial) && (lower == 1)) || (initial <= lower)
```

Seed: 66

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
(!(lower < initial)) || ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result <= 0) && (1 == lower))
```

Seed: 75

Execution Time: 00:17 (hh:mm)

Nb of EvoSuite Tests:34

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
((!((1) != (lower))) && (org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result < org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.defaultFunctionValueAccuracy)) || (initial <= lower)
```

Seed: 83

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Removed Tests:1


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
(initial <= lower) || ((lower == 1) && (org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result < org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.defaultFunctionValueAccuracy))
```

Seed: 98

Execution Time: 00:17 (hh:mm)

Nb of EvoSuite Tests:34

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
(initial <= lower) || ((!(lower < org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result)) && (1 == lower))
```

Seed: 100

Execution Time: 00:18 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
(!(lower < initial)) || ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result <= lower) && (1 == lower))
```

Seed: 104

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:34

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result <= lower) && (1 == lower)) || (initial < lower)
```

Seed: 111

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:32

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
((!(org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.functionValueAccuracy < org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result)) && (lower == 1)) || (initial <= lower)
```

Seed: 113

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
(initial <= lower) || ((lower == 1) && (!((0) != (org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result))))
```

Seed: 120

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
(initial < lower) || ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result <= org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.defaultFunctionValueAccuracy) && (1 == lower))
```

Seed: 128

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
((lower == 1) && (org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result < initial)) || (!(lower <= initial))
```

Seed: 135

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
(initial <= lower) || ((1 == lower) && (org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result < org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.defaultFunctionValueAccuracy))
```

Seed: 143

Execution Time: 00:20 (hh:mm)

Nb of EvoSuite Tests:36

Nb of Removed Tests:1


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
((1 == lower) && (!(initial < org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result))) || (initial <= lower)
```

Seed: 150

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result < org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.defaultFunctionValueAccuracy) && (lower == 1)) || (initial <= lower)
```

Seed: 153

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:34

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
(initial < lower) || ((!((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.functionValue) != (org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result))) && (1 == lower))
```

Seed: 161

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
(initial <= lower) || ((!(lower < org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result)) && (lower == 1))
```

Seed: 166

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:34

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
((1 == lower) && (!(org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.functionValue < org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result))) || (initial <= lower)
```

Seed: 173

Execution Time: 00:18 (hh:mm)

Nb of EvoSuite Tests:36

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result <= lower) && (1 == lower)) || (initial < lower)
```

Seed: 180

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:34

Nb of Removed Tests:1


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
(initial < lower) || ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result <= org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.defaultFunctionValueAccuracy) && (1 == lower))
```

Seed: 181

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:37

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
((0 == org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result) && (!((1) != (lower)))) || (initial <= lower)
```

Seed: 186

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl : 225

Patch type: CONDITIONAL

```Java
((!((lower) != (1))) && (org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl.this.result < lower)) || (initial <= lower)
```

Seed: 193

Execution Time: 00:18 (hh:mm)

Nb of EvoSuite Tests:34

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:17 (hh:mm)

Average Nb of EvoSuite Tests:34.5

Average Nb of Removed Tests:0.33

Running Nopol+UnsatGuided changes the original patch for 25 of the 30 seeds. The human patch adds an if precondition to check whether the arguments are invalid and throws an exception if so, the original and the newly generated patches by running Nopol+UnsatGuided make changes to the same conditional statement just to pass the failing test, we think they are incorrect. We observe failing EvoSuite tests for program patched with the original Nopol patch, which means the original Nopol patch is incorrect. We do not observe any failing EvoSuite tests for programs patched with the patches genertaed by running Nopol+UnsatGuided, yet we are still not quite sure about the correctness of the newly generated patches.
