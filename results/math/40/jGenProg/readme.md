#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//math/ project math
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/analysis/solvers/BracketingNthOrderBrentSolver.java b/src/main/java/org/apache/commons/math/analysis/solvers/BracketingNthOrderBrentSolver.java
index 59dc461..93dd3bb 100644
--- a/src/main/java/org/apache/commons/math/analysis/solvers/BracketingNthOrderBrentSolver.java
+++ b/src/main/java/org/apache/commons/math/analysis/solvers/BracketingNthOrderBrentSolver.java
@@ -232,16 +232,10 @@ public class BracketingNthOrderBrentSolver
             double targetY;
             if (agingA >= MAXIMAL_AGING) {
                 // we keep updating the high bracket, try to compensate this
-                final int p = agingA - MAXIMAL_AGING;
-                final double weightA = (1 << p) - 1;
-                final double weightB = p + 1;
-                targetY = (weightA * yA - weightB * REDUCTION_FACTOR * yB) / (weightA + weightB);
+                targetY = -REDUCTION_FACTOR * yB;
             } else if (agingB >= MAXIMAL_AGING) {
                 // we keep updating the low bracket, try to compensate this
-                final int p = agingB - MAXIMAL_AGING;
-                final double weightA = p + 1;
-                final double weightB = (1 << p) - 1;
-                targetY = (weightB * yB - weightA * REDUCTION_FACTOR * yA) / (weightA + weightB);
+                targetY = -REDUCTION_FACTOR * yA;
             } else {
                 // bracketing is balanced, try to find the root itself
                 targetY = 0;
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 204

Patch type: InsertBeforeOp

```Java

signChangeIndex = 2

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 2 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: InsertBeforeOp

```Java

if (!((nextX > xA) && (nextX < xB))) {
	if ((signChangeIndex - start) >= (end - signChangeIndex)) {
		++start;
	} else {
		--end;
	}
	nextX = java.lang.Double.NaN;
} 

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 3 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: ReplaceOp

```Java

signChangeIndex++

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 4 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: InsertBeforeOp

```Java

x[signChangeIndex] = nextX

```


Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28


--- 
#Seed: 2

## Patch 5 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 327

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 235

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 7 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: InsertAfterOp

```Java

signChangeIndex++

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 329

Patch type: InsertAfterOp

```Java

signChangeIndex++

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 9 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: InsertAfterOp

```Java

end = signChangeIndex

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 10 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 202

Patch type: InsertBeforeOp

```Java

signChangeIndex = 2

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 11 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 323

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27


--- 
#Seed: 9

## Patch 12 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 200

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27


--- 
#Seed: 11

## Patch 13 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 204

Patch type: InsertBeforeOp

```Java

signChangeIndex++

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 14 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: InsertAfterOp

```Java

targetY = (-(org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.REDUCTION_FACTOR)) * yA

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29


--- 
#Seed: 14

## Patch 15 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 328

Patch type: InsertBeforeOp

```Java

signChangeIndex = 2

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 16 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: ReplaceOp

```Java

signChangeIndex++

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30


--- 
#Seed: 15

## Patch 17 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: ReplaceOp

```Java

signChangeIndex++

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 18 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: InsertBeforeOp

```Java

x[signChangeIndex] = nextX

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26


--- 
#Seed: 16

## Patch 19 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 269

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 20 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: ReplaceOp

```Java

signChangeIndex++

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29


--- 
#Seed: 17

## Patch 21 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: ReplaceOp

```Java

signChangeIndex++

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27


--- 
#Seed: 18

## Patch 22 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 295

Patch type: ReplaceOp

```Java

java.lang.System.arraycopy(x, 1, x, 0, nbPoints)

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26


--- 
#Seed: 19

## Patch 23 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 205

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26


--- 
#Seed: 20

## Patch 24 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 326

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 25 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 241

Patch type: InsertBeforeOp

```Java

signChangeIndex = 2

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26


--- 
#Seed: 23

## Patch 26 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: InsertBeforeOp

```Java

signChangeIndex = 2

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 27 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: ReplaceOp

```Java

signChangeIndex++

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 28 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 213

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27


--- 
#Seed: 24

## Patch 29 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 241

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29


--- 
#Seed: 26

## Patch 30 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 323

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 31 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: InsertBeforeOp

```Java

x[signChangeIndex] = nextX

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28


--- 
#Seed: 29

## Patch 32 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: ReplaceOp

```Java

signChangeIndex++

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30


--- 
#Seed: 30

## Patch 33 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 299

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 34 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 246

Patch type: InsertBeforeOp

```Java

signChangeIndex = 2

```


Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 27.68

Average Nb of Failing EvoSuite Tests: 2.72

---