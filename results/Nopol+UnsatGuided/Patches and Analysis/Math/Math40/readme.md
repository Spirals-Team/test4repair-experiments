
## Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/analysis/solvers/BracketingNthOrderBrentSolver.java b/src/main/java/org/apache/commons/math/analysis/solvers/BracketingNthOrderBrentSolver.java
index 59dc461..93dd3bb 100644
--- a/src/main/java/org/apache/commons/math/analysis/solvers/BracketingNthOrderBrentSolver.java
+++ b/src/main/java/org/apache/commons/math/analysis/solvers/BracketingNthOrderBrentSolver.java
@@ -232,16 +232,10 @@ public class BracketingNthOrderBrentSolver
             double targetY;
             if (agingA >= MAXIMAL_AGING) {
                 // we keep updating the high bracket, try to compensate this
+                final int p = agingA - MAXIMAL_AGING;
+                final double weightA = (1 << p) - 1;
+                final double weightB = p + 1;
+                targetY = (weightA * yA - weightB * REDUCTION_FACTOR * yB) / (weightA + weightB);
-                targetY = -REDUCTION_FACTOR * yB;
             } else if (agingB >= MAXIMAL_AGING) {
                 // we keep updating the low bracket, try to compensate this
+                final int p = agingB - MAXIMAL_AGING;
+                final double weightA = p + 1;
+                final double weightB = (1 << p) - 1;
+                targetY = (weightB * yB - weightA * REDUCTION_FACTOR * yA) / (weightA + weightB);
-                targetY = -REDUCTION_FACTOR * yA;
             } else {
                 // bracketing is balanced, try to find the root itself
                 targetY = 0;

```


## Original Patch # Nopol 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Execution Time: 00:16 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((xA < xTol) && (xA < xTol)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 4

Execution Time: 06:52 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Contradiction Tests:9

Nb of Removed Tests:9


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 12

Execution Time: 08:49 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Contradiction Tests:16

Nb of Removed Tests:16


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 18

Execution Time: 08:15 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Contradiction Tests:15

Nb of Removed Tests:15


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 26

Execution Time: 07:42 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Contradiction Tests:14

Nb of Removed Tests:14


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 28

Execution Time: 08:15 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Contradiction Tests:15

Nb of Removed Tests:15


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 35

Execution Time: 08:15 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Contradiction Tests:15

Nb of Removed Tests:15


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
(((signChangeIndex - start) >= (end - signChangeIndex)) || (xA <= yA)) && (((signChangeIndex - start) >= (end - signChangeIndex)) || (xA <= yA))
```

Seed: 41

Execution Time: 07:34 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Contradiction Tests:14

Nb of Removed Tests:14


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 54

Execution Time: 06:30 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Contradiction Tests:13

Nb of Removed Tests:13


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 60

Execution Time: 07:30 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Contradiction Tests:15

Nb of Removed Tests:15


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 66

Execution Time: 07:00 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Contradiction Tests:14

Nb of Removed Tests:14


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 75

Execution Time: 07:00 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Contradiction Tests:14

Nb of Removed Tests:14


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 83

Execution Time: 07:00 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Contradiction Tests:14

Nb of Removed Tests:14


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 98

Execution Time: 06:30 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Contradiction Tests:13

Nb of Removed Tests:13


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 100

Execution Time: 06:00 (hh:mm)

Nb of EvoSuite Tests:25

Nb of Contradiction Tests:12

Nb of Removed Tests:12


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
(xA <= xTol) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 104

Execution Time: 04:52 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Contradiction Tests:7

Nb of Removed Tests:7


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
(y!=null) && ((xA <= org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.REDUCTION_FACTOR) || ((signChangeIndex - start) >= (end - signChangeIndex)))
```

Seed: 111

Execution Time: 04:14 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Contradiction Tests:3

Nb of Removed Tests:3


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((xA < yA) || ((signChangeIndex - start) >= (end - signChangeIndex))) && ((xA) != (xTol))
```

Seed: 113

Execution Time: 06:51 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Contradiction Tests:12

Nb of Removed Tests:12


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 120

Execution Time: 07:42 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Contradiction Tests:14

Nb of Removed Tests:14


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 128

Execution Time: 07:42 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Contradiction Tests:14

Nb of Removed Tests:14


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 135

Execution Time: 08:48 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Contradiction Tests:16

Nb of Removed Tests:16


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 143

Execution Time: 07:09 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Contradiction Tests:13

Nb of Removed Tests:13


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 150

Execution Time: 08:48 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Contradiction Tests:16

Nb of Removed Tests:16


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((xA <= org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.REDUCTION_FACTOR) && (xA <= org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.REDUCTION_FACTOR)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 153

Execution Time: 05:27 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Contradiction Tests:9

Nb of Removed Tests:9


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
(xA < yA) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 161

Execution Time: 05:48 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Contradiction Tests:10

Nb of Removed Tests:10


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 166

Execution Time: 06:18 (hh:mm)

Nb of EvoSuite Tests:25

Nb of Contradiction Tests:14

Nb of Removed Tests:14


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 173

Execution Time: 06:18 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Contradiction Tests:14

Nb of Removed Tests:14


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 180

Execution Time: 06:18 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Contradiction Tests:14

Nb of Removed Tests:14


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 181

Execution Time: 06:45 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Contradiction Tests:15

Nb of Removed Tests:15


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 186

Execution Time: 05:24 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Contradiction Tests:12

Nb of Removed Tests:12


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: CONDITIONAL

```Java
((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed!=null) && (xA < yA)) || ((signChangeIndex - start) >= (end - signChangeIndex))
```

Seed: 193

Execution Time: 07:12 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Contradiction Tests:16

Nb of Removed Tests:16


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 06:58 (hh:mm)

Average Nb of EvoSuite Tests:27.73

Average Nb of Contradiction Tests:13.07

Average Nb of Removed Tests:13.07

Runing Nopol+UnsatGuided changes the original patch for 7 of the 30 seeds. The human patch involves multiple changes to the body of an if-else block, the original patch and the newly generated patches by running Nopol+UnsatGuided all make changes to the same conditional statement, we think they are incorrect.