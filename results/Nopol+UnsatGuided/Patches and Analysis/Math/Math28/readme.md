
## Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math3/optimization/linear/SimplexSolver.java b/src/main/java/org/apache/commons/math3/optimization/linear/SimplexSolver.java
index dec310b..a84438d 100644
--- a/src/main/java/org/apache/commons/math3/optimization/linear/SimplexSolver.java
+++ b/src/main/java/org/apache/commons/math3/optimization/linear/SimplexSolver.java
@@ -116,7 +116,6 @@ public class SimplexSolver extends AbstractLinearOptimizer {
             // there's a degeneracy as indicated by a tie in the minimum ratio test
 
             // 1. check if there's an artificial variable that can be forced out of the basis
+            if (tableau.getNumArtificialVariables() > 0) {
                 for (Integer row : minRatioPositions) {
                     for (int i = 0; i < tableau.getNumArtificialVariables(); i++) {
                         int column = i + tableau.getArtificialVariableOffset();
@@ -126,7 +125,6 @@ public class SimplexSolver extends AbstractLinearOptimizer {
                         }
                     }
                 }
+            }
 
             // 2. apply Bland's rule to prevent cycling:
             //    take the row for which the corresponding basic variable has the smallest index
@@ -137,7 +135,6 @@ public class SimplexSolver extends AbstractLinearOptimizer {
             // Additional heuristic: if we did not get a solution after half of maxIterations
             //                       revert to the simple case of just returning the top-most row
             // This heuristic is based on empirical data gathered while investigating MATH-828.
+            if (getIterations() < getMaxIterations() / 2) {
                 Integer minRow = null;
                 int minIndex = tableau.getWidth();
                 for (Integer row : minRatioPositions) {
@@ -152,7 +149,6 @@ public class SimplexSolver extends AbstractLinearOptimizer {
                     }
                 }
                 return minRow;
+            }
         }
         return minRatioPositions.get(0);
     }

```


## Original Patch # Nopol 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Execution Time: 00:16 (hh:mm)


## Patch 1 # Nopol+UnsatGuided (selected for manual analysis)

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 4

Execution Time: 00:41 (hh:mm)

Nb of EvoSuite Tests:8

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 12

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 18

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 26

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 28

Execution Time: 00:42 (hh:mm)

Nb of EvoSuite Tests:8

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 35

Execution Time: 00:42 (hh:mm)

Nb of EvoSuite Tests:8

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 41

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 54

Execution Time: 00:42 (hh:mm)

Nb of EvoSuite Tests:8

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 60

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 66

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 75

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 83

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 98

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 100

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 104

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 111

Execution Time: 00:41 (hh:mm)

Nb of EvoSuite Tests:8

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 113

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 120

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 128

Execution Time: 00:42 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 135

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 143

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:8

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 150

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 153

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 161

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 166

Execution Time: 00:42 (hh:mm)

Nb of EvoSuite Tests:8

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 173

Execution Time: 00:41 (hh:mm)

Nb of EvoSuite Tests:8

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 180

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 181

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 186

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexSolver : 151

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math3.optimization.linear.SimplexSolver.this.maxUlps < minIndex) && (10 <= col)) || (minRatioPositions.size() == minRow))
```

Seed: 193

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:31 (hh:mm)

Average Nb of EvoSuite Tests:7.27

Average Nb of Removed Tests:0

Running Nopol+UnsatGuided does not change the original patch for any of the 30 seeds. The human patch involves the add of two if preconditions, the generated patch adds a different precondition in a different code location, we think it is incorrect.
