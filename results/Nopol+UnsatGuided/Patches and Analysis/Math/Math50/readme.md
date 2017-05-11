
## Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/analysis/solvers/BaseSecantSolver.java b/src/main/java/org/apache/commons/math/analysis/solvers/BaseSecantSolver.java
index c781a90..e47d982 100644
--- a/src/main/java/org/apache/commons/math/analysis/solvers/BaseSecantSolver.java
+++ b/src/main/java/org/apache/commons/math/analysis/solvers/BaseSecantSolver.java
@@ -184,6 +184,10 @@ public abstract class BaseSecantSolver
                     break;
                 case REGULA_FALSI:
                     // Nothing.
-                    if (x == x1) {
-                        x0 = 0.5 * (x0 + x1 - FastMath.max(rtol * FastMath.abs(x1), atol));
-                        f0 = computeObjectiveValue(x0);
-                    }
                     break;
                 default:
                     // Should never happen.

```


## Original Patch # Nopol 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
!(((-1) != (fx)) && (org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY <= f0))
```

Execution Time: 00:11 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
((org.apache.commons.math.analysis.solvers.BaseSecantSolver.this.method!=null) && (!(atol <= f0))) || ((atol) != (org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY))
```

Seed: 4

Execution Time: 04:49 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
(((org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY) != (atol)) || (f0 <= org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY)) && (((org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY) != (atol)) || (f0 <= org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY))
```

Seed: 12

Execution Time: 05:10 (hh:mm)

Nb of EvoSuite Tests:38

Nb of Contradiction Tests:0

Nb of Removed Tests:1


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: PRECONDITION

```Java
x < rtol
```

Seed: 18

Execution Time: 05:08 (hh:mm)

Nb of EvoSuite Tests:36

Nb of Contradiction Tests:0

Nb of Removed Tests:3


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
(((atol) != (org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY)) && (inverted)) || (f0 <= atol)
```

Seed: 26

Execution Time: 04:26 (hh:mm)

Nb of EvoSuite Tests:36

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
(fx == -1) || ((f0 < org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY) && (f0 < org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY))
```

Seed: 28

Execution Time: 04:58 (hh:mm)

Nb of EvoSuite Tests:38

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: PRECONDITION

```Java
0 == atol
```

Seed: 35

Execution Time: 03:36 (hh:mm)

Nb of EvoSuite Tests:36

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: PRECONDITION

```Java
x0 < org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY
```

Seed: 41

Execution Time: 04:03 (hh:mm)

Nb of EvoSuite Tests:36

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: PRECONDITION

```Java
-1 == rtol
```

Seed: 54

Execution Time: 03:45 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
(f0 < atol) || (!((atol) != (ftol)))
```

Seed: 60

Execution Time: 04:36 (hh:mm)

Nb of EvoSuite Tests:38

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
(f0 <= atol) || ((atol) != (org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY))
```

Seed: 66

Execution Time: 04:51 (hh:mm)

Nb of EvoSuite Tests:36

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: PRECONDITION

```Java
f0 < 1
```

Seed: 75

Execution Time: 04:10 (hh:mm)

Nb of EvoSuite Tests:37

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
((org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY) != (atol)) || (f0 <= atol)
```

Seed: 83

Execution Time: 04:53 (hh:mm)

Nb of EvoSuite Tests:38

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
(f0 <= atol) || ((atol) != (org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY))
```

Seed: 98

Execution Time: 04:25 (hh:mm)

Nb of EvoSuite Tests:37

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
(((org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY) != (atol)) && ((org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY) != (atol))) || (f0 <= atol)
```

Seed: 100

Execution Time: 04:42 (hh:mm)

Nb of EvoSuite Tests:36

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
((org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY) != (atol)) || (f0 <= atol)
```

Seed: 104

Execution Time: 05:10 (hh:mm)

Nb of EvoSuite Tests:38

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
(f0 <= atol) || ((atol < org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY) && (inverted))
```

Seed: 111

Execution Time: 04:37 (hh:mm)

Nb of EvoSuite Tests:37

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
(f0 <= org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY) || (rtol == ftol)
```

Seed: 113

Execution Time: 05:06 (hh:mm)

Nb of EvoSuite Tests:38

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
((org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY) != (atol)) || (f0 <= org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY)
```

Seed: 120

Execution Time: 05:02 (hh:mm)

Nb of EvoSuite Tests:38

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
(atol == rtol) || (f0 <= atol)
```

Seed: 128

Execution Time: 05:46 (hh:mm)

Nb of EvoSuite Tests:37

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
(atol < org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY) || (f0 <= atol)
```

Seed: 135

Execution Time: 03:52 (hh:mm)

Nb of EvoSuite Tests:38

Nb of Contradiction Tests:0

Nb of Removed Tests:2


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
((f0 < org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY) && (org.apache.commons.math.analysis.solvers.BaseSecantSolver.this.allowed!=null)) || (!((ftol) != (rtol)))
```

Seed: 143

Execution Time: 03:43 (hh:mm)

Nb of EvoSuite Tests:36

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 174

Patch type: PRECONDITION

```Java
-1 <= f0
```

Seed: 150

Execution Time: 04:31 (hh:mm)

Nb of EvoSuite Tests:38

Nb of Contradiction Tests:0

Nb of Removed Tests:3


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: PRECONDITION

```Java
x1 < org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY
```

Seed: 153

Execution Time: 03:14 (hh:mm)

Nb of EvoSuite Tests:40

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
(f0 <= atol) || (atol < org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY)
```

Seed: 161

Execution Time: 04:55 (hh:mm)

Nb of EvoSuite Tests:39

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
((org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY) != (atol)) || (!(atol < f0))
```

Seed: 166

Execution Time: 04:59 (hh:mm)

Nb of EvoSuite Tests:38

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: PRECONDITION

```Java
x1 == f1
```

Seed: 173

Execution Time: 03:37 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
!((org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY < f0) && (((x1) != (x)) || (org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY == atol)))
```

Seed: 180

Execution Time: 05:16 (hh:mm)

Nb of EvoSuite Tests:37

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 187

Patch type: CONDITIONAL

```Java
f0 < -1
```

Seed: 181

Execution Time: 04:01 (hh:mm)

Nb of EvoSuite Tests:34

Nb of Contradiction Tests:0

Nb of Removed Tests:3


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
!(((-1) != (fx)) && (org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY <= f0))
```

Seed: 186

Execution Time: 04:33 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Contradiction Tests:0

Nb of Removed Tests:5


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 237

Patch type: PRECONDITION

```Java
!(((-1) != (fx)) && (org.apache.commons.math.analysis.solvers.BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY <= f0))
```

Seed: 193

Execution Time: 05:24 (hh:mm)

Nb of EvoSuite Tests:37

Nb of Contradiction Tests:0

Nb of Removed Tests:6


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 04:34 (hh:mm)

Average Nb of EvoSuite Tests:36.9

Average Nb of Contradiction Tests:0

Average Nb of Removed Tests:0.77

Running Nopol+UnsatGuided changes the original patch for 28 of the 30 seeds. The human patch completely removes an if condition which corresponds to the REGULA_FALSI method. The Nopol version used in the EMSE paper (Automatic Repair of Real Bugs in Java: A Large-Scale Experiment on the Defects4J Dataset) generates a patch which adds a precondition if(!((x == 1) || ((1 < x) && (inverted)))) before the removed if condition and the authors claim that the patch is correct as after adding this precondition, the body of the removed if condition will never be executed. We think the patch just overfits the orginal failing test case RegulaFalsiSolverTest and makes it pass now, and thus is not a really correct patch. The patch generated by the Nopol version used in our study and newly patches generated by running Nopol+UnsatGuided also overfit the failing test case RegulaFalsiSolverTest, we think they are also incorrect.