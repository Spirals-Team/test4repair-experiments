#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//math/ project math
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/analysis/solvers/BaseSecantSolver.java b/src/main/java/org/apache/commons/math/analysis/solvers/BaseSecantSolver.java
index c781a90..e47d982 100644
--- a/src/main/java/org/apache/commons/math/analysis/solvers/BaseSecantSolver.java
+++ b/src/main/java/org/apache/commons/math/analysis/solvers/BaseSecantSolver.java
@@ -184,6 +184,10 @@ public abstract class BaseSecantSolver
                     break;
                 case REGULA_FALSI:
                     // Nothing.
+                    if (x == x1) {
+                        x0 = 0.5 * (x0 + x1 - FastMath.max(rtol * FastMath.abs(x1), atol));
+                        f0 = computeObjectiveValue(x0);
+                    }
                     break;
                 default:
                     // Should never happen.
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: InsertAfterOp

```Java

incrementEvaluationCount()

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 189

Patch type: InsertAfterOp

```Java

incrementEvaluationCount()

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: InsertBeforeOp

```Java

double y1 = computeObjectiveValue(x1)

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 39

Nb of Failing EvoSuite Tests: 39


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: ReplaceOp

```Java

x1 = x

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 39

Nb of Failing EvoSuite Tests: 39


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 189

Patch type: InsertBeforeOp

```Java

double y0 = computeObjectiveValue(x0)

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 38


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35


--- 
#Seed: 9

## Patch 9 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: InsertBeforeOp

```Java

double y1 = computeObjectiveValue(x1)

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 38


--- 
#Seed: 10

## Patch 10 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: InsertBeforeOp

```Java

double y0 = computeObjectiveValue(x0)

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37


--- 
#Seed: 11

## Patch 11 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 189

Patch type: ReplaceOp

```Java

f0 = f1

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 38


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: InsertAfterOp

```Java

double y0 = computeObjectiveValue(x0)

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 38


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 189

Patch type: InsertBeforeOp

```Java

double y1 = computeObjectiveValue(x1)

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37


--- 
#Seed: 15

## Patch 15 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: InsertAfterOp

```Java

f0 = computeObjectiveValue(x0)

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35


--- 
#Seed: 16

## Patch 16 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 189

Patch type: InsertBeforeOp

```Java

double y0 = computeObjectiveValue(x0)

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 38


--- 
#Seed: 17

## Patch 17 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: InsertAfterOp

```Java

double y1 = computeObjectiveValue(x1)

```


Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37


--- 
#Seed: 18

## Patch 18 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: InsertAfterOp

```Java

double y0 = computeObjectiveValue(x0)

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36


--- 
#Seed: 19

## Patch 19 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 189

Patch type: InsertBeforeOp

```Java

incrementEvaluationCount()

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: ReplaceOp

```Java

inverted = !inverted

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 39

Nb of Failing EvoSuite Tests: 39


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: ReplaceOp

```Java

f1 = fx

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 35

Nb of Failing EvoSuite Tests: 35


--- 
#Seed: 23

## Patch 23 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: InsertBeforeOp

```Java

double y1 = computeObjectiveValue(x1)

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37


--- 
#Seed: 24

## Patch 24 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: ReplaceOp

```Java

org.apache.commons.math.analysis.solvers.BaseSecantSolver.this.allowed = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34


--- 
#Seed: 25

## Patch 25 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: InsertAfterOp

```Java

incrementEvaluationCount()

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37


--- 
#Seed: 26

## Patch 26 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: ReplaceOp

```Java

f0 = computeObjectiveValue(x0)

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36


--- 
#Seed: 27

## Patch 27 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 39

Nb of Failing EvoSuite Tests: 39


--- 
#Seed: 28

## Patch 28 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: ReplaceOp

```Java

org.apache.commons.math.analysis.solvers.BaseSecantSolver.this.allowed = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 39

Nb of Failing EvoSuite Tests: 39


--- 
#Seed: 29

## Patch 29 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: InsertBeforeOp

```Java

double y0 = computeObjectiveValue(x0)

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 37

Nb of Failing EvoSuite Tests: 37


--- 
#Seed: 30

## Patch 30 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BaseSecantSolver : 188

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 36

Nb of Failing EvoSuite Tests: 36


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 37

Average Nb of Failing EvoSuite Tests: 0.12

---