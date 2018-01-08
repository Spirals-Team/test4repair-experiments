
## Human Patch 

```Java
diff --git a/src/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverUtils.java b/src/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverUtils.java
index e6398f6..bf3e4bf 100644
--- a/src/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverUtils.java
+++ b/src/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverUtils.java
@@ -195,7 +195,7 @@ public class UnivariateRealSolverUtils {
         } while ((fa * fb > 0.0) && (numIterations < maximumIterations) && 
                 ((a > lowerBound) || (b < upperBound)));
    
+        if (fa * fb > 0.0 ) {
-        if (fa * fb >= 0.0 ) {
             throw new ConvergenceException(
                       "number of iterations={0}, maximum iterations={1}, " +
                       "initial={2}, lower bound={3}, upper bound={4}, final a value={5}, " +

```


## Original Patch # Nopol 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
(fa * fb) < 0.0
```

Execution Time: 00:00 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
(a) != ((fa * fb))
```

Seed: 4

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:1


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (a)
```

Seed: 12

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:1


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
(fb) != ((fa * fb))
```

Seed: 18

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:25

Nb of Removed Tests:1


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
(0.0) != ((fa * fb))
```

Seed: 26

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Removed Tests:1


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (0.0)
```

Seed: 28

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Removed Tests:1


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
(0.0) != (fb)
```

Seed: 35

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Removed Tests:1


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
(0) != ((fa * fb))
```

Seed: 41

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (0)
```

Seed: 54

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Removed Tests:1


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (0.0)
```

Seed: 60

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:1


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (0.0)
```

Seed: 66

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Removed Tests:1


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (0)
```

Seed: 75

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Removed Tests:1


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
(fa * fb) < 0.0
```

Seed: 83

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Removed Tests:2


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (0)
```

Seed: 98

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Removed Tests:1


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (0)
```

Seed: 100

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Removed Tests:1


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (0.0)
```

Seed: 104

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Removed Tests:1


## Patch 16 # Nopol+UnsatGuided (selected for manual analysis)

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (0.0)
```

Seed: 111

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Removed Tests:1


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
(fb) != (0.0)
```

Seed: 113

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Removed Tests:1


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
(0.0) != ((fa * fb))
```

Seed: 120

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Removed Tests:1


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (fb)
```

Seed: 128

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Removed Tests:1


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (0.0)
```

Seed: 135

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Removed Tests:1


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (0)
```

Seed: 143

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Removed Tests:1


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
(0.0) != ((fa * fb))
```

Seed: 150

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Removed Tests:1


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (0.0)
```

Seed: 153

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:2


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (0.0)
```

Seed: 161

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Removed Tests:1


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
(fa * fb) < 0.0
```

Seed: 166

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:25

Nb of Removed Tests:2


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (0.0)
```

Seed: 173

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:1


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (0.0)
```

Seed: 180

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:1


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
(0) != ((fa * fb))
```

Seed: 181

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Removed Tests:1


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (0.0)
```

Seed: 186

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Removed Tests:1


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils : 198

Patch type: PRECONDITION

```Java
((fa * fb)) != (0.0)
```

Seed: 193

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:24

Nb of Removed Tests:1


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:10 (hh:mm)

Average Nb of EvoSuite Tests:26.57

Average Nb of Removed Tests:1.07

Runing Nopol+UnsatGuided changes the original patch for 28 of the 30 seeds. The human patch changes an if condition if (fa * fb >= 0.0 ) by replacing it with if (fa * fb > 0.0 ). The original patch changes the same if condition by adding a precondition if (fa * fb < 0.0 ), which is self-self-contradictory and is thus incorrect. Among the generated new patches by running Nopol+UnsatGuided, 21 seeds generate the same new patch which adds a precondition if ((fa * fb)) != (0) before if (fa * fb >= 0.0 ), which is equivalent to the human patch and thus is correct. Other newly generated patches also add a precondition before  if (fa * fb >= 0.0), but adds a different precondition, we think they are incorrect.
