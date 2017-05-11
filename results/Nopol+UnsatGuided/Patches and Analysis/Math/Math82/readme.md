
## Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/optimization/linear/SimplexSolver.java b/src/main/java/org/apache/commons/math/optimization/linear/SimplexSolver.java
index 60a1b3a..8309d7b 100644
--- a/src/main/java/org/apache/commons/math/optimization/linear/SimplexSolver.java
+++ b/src/main/java/org/apache/commons/math/optimization/linear/SimplexSolver.java
@@ -79,7 +79,7 @@ public class SimplexSolver extends AbstractLinearOptimizer {
         for (int i = tableau.getNumObjectiveFunctions(); i < tableau.getHeight(); i++) {
             final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
             final double entry = tableau.getEntry(i, col);
+            if (MathUtils.compareTo(entry, 0, epsilon) > 0) {
-            if (MathUtils.compareTo(entry, 0, epsilon) >= 0) {
                 final double ratio = rhs / entry;
                 if (ratio < minRatio) {
                     minRatio = ratio;

```


## Original Patch # Nopol 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Execution Time: 00:00 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 4

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:16

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 12

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 18

Execution Time: 00:04 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 26

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 28

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 35

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:18

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 41

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 54

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:18

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 60

Execution Time: 00:04 (hh:mm)

Nb of EvoSuite Tests:15

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 66

Execution Time: 00:05 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 75

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 83

Execution Time: 00:04 (hh:mm)

Nb of EvoSuite Tests:16

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 98

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:15

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 100

Execution Time: 00:04 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 104

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 111

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:18

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 113

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:18

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 120

Execution Time: 00:07 (hh:mm)

Nb of EvoSuite Tests:18

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 128

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:18

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 135

Execution Time: 00:04 (hh:mm)

Nb of EvoSuite Tests:16

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 143

Execution Time: 00:05 (hh:mm)

Nb of EvoSuite Tests:18

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 150

Execution Time: 00:05 (hh:mm)

Nb of EvoSuite Tests:16

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 153

Execution Time: 00:04 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 161

Execution Time: 00:05 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 166

Execution Time: 00:07 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 173

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 180

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 181

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:18

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 186

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:17

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: PRECONDITION

```Java
(0) != (minValue)
```

Seed: 193

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:19

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:06 (hh:mm)

Average Nb of EvoSuite Tests:17.07

Average Nb of Contradiction Tests:0

Average Nb of Removed Tests:0

Running Nopol+UnsatGuided does not changes the original patch for any of the 30 seeds. The human patch changes the if condition, the generated patch modifies the value of the column index, we think it is incorrect.