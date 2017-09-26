
## Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math3/optimization/univariate/BrentOptimizer.java b/src/main/java/org/apache/commons/math3/optimization/univariate/BrentOptimizer.java
index cff5bfd..b6ce68e 100644
--- a/src/main/java/org/apache/commons/math3/optimization/univariate/BrentOptimizer.java
+++ b/src/main/java/org/apache/commons/math3/optimization/univariate/BrentOptimizer.java
@@ -227,7 +227,7 @@ public class BrentOptimizer extends BaseAbstractUnivariateOptimizer {
 
                 if (checker != null) {
                     if (checker.converged(iter, previous, current)) {
+                        return best(current, previous, isMinim);
-                        return current;
                     }
                 }
 
@@ -264,7 +264,7 @@ public class BrentOptimizer extends BaseAbstractUnivariateOptimizer {
                     }
                 }
             } else { // Default termination (Brent's criterion).
+                return best(current, previous, isMinim);
-                return current;
             }
             ++iter;
         }

```


## Original Patch # Nopol 

org.apache.commons.math3.util.MathArrays : 561

Patch type: PRECONDITION

```Java
((-1) != ((1) - (source.length) + 1)) || (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR == output.length)
```

Execution Time: 00:14 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math3.util.MathArrays : 561

Patch type: PRECONDITION

```Java
!(1 + 1 == (output.length) - (1))
```

Seed: 4

Execution Time: 01:12 (hh:mm)

Nb of EvoSuite Tests:138

Nb of Removed Tests:3


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math3.util.MathArrays : 561

Patch type: PRECONDITION

```Java
((-1) != ((1) - (-1 + output.length))) || (len == 134217729)
```

Seed: 12

Execution Time: 23:51 (hh:mm)

Nb of EvoSuite Tests:130

Nb of Removed Tests:3


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math3.util.MathArrays : 561

Patch type: PRECONDITION

```Java
(len) != ((1) - (-1 + -1))
```

Seed: 18

Execution Time: 00:56 (hh:mm)

Nb of EvoSuite Tests:128

Nb of Removed Tests:5


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math3.util.MathArrays : 561

Patch type: PRECONDITION

```Java
(!(1 == (-1) - (1) + source.length)) || (source.length <= 0)
```

Seed: 26

Execution Time: 00:13 (hh:mm)

Nb of EvoSuite Tests:132

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math3.util.MathArrays : 561

Patch type: PRECONDITION

```Java
((output.length) - (1)) != (1 + 1)
```

Seed: 28

Execution Time: 00:34 (hh:mm)

Nb of EvoSuite Tests:139

Nb of Removed Tests:2


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math3.util.MathArrays : 561

Patch type: PRECONDITION

```Java
((!(output.length <= (1) - (-1 + -1))) && (!(output.length <= (1) - (-1 + -1)))) || (len < (1) - (-1 + -1))
```

Seed: 35

Execution Time: 01:20 (hh:mm)

Nb of EvoSuite Tests:134

Nb of Removed Tests:4


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math3.util.MathArrays : 561

Patch type: PRECONDITION

```Java
(-1 < (1) - (len + -1)) || (!(-1 <= (1) - (len + -1)))
```

Seed: 41

Execution Time: 01:29 (hh:mm)

Nb of EvoSuite Tests:133

Nb of Removed Tests:4


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math3.util.MathArrays : 561

Patch type: PRECONDITION

```Java
!((1) - (output.length) == -1 + -1)
```

Seed: 54

Execution Time: 22:45 (hh:mm)

Nb of EvoSuite Tests:130

Nb of Removed Tests:2


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math3.util.MathArrays : 561

Patch type: PRECONDITION

```Java
(source.length == -1) || ((source.length) != ((1) - (-1 + -1)))
```

Seed: 60

Execution Time: 21:33 (hh:mm)

Nb of EvoSuite Tests:131

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math3.util.MathArrays : 561

Patch type: PRECONDITION

```Java
((len) - (1 + 1)) != (1)
```

Seed: 66

Execution Time: 23:32 (hh:mm)

Nb of EvoSuite Tests:132

Nb of Removed Tests:2


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:09 (hh:mm)

Average Nb of EvoSuite Tests:132.7

Average Nb of Removed Tests:2.5

Running Nopol+UnsatGuided changes the original patch for each of the 10 seeds. The human patch involves changes to two return statements, the original and newly generated patches by running Nopol+UnsatGuided add a precondition to the same statement, we think they are incorrect.
