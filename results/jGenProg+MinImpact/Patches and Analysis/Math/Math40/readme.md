
##Human Patch 

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


## Patch Original jGenProg 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver:235

Patch type: InsertBeforeOp 
 
```Java
signChangeIndex++
```

Execution Time: 0:18 (hh:mm)


--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 204

Patch type: InsertBeforeOp

```Java

signChangeIndex = 2

```


Seed: 1

Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 2



## Patch 2 #  jGenProg+MinImpact 

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


Seed: 1

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 3



## Patch 3 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: ReplaceOp

```Java

signChangeIndex++

```


Seed: 1

Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 3



## Patch 4 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: InsertBeforeOp

```Java

x[signChangeIndex] = nextX

```


Seed: 1

Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 5 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 327

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Seed: 2

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 6 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 235

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Seed: 6

Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 2



## Patch 7 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: InsertAfterOp

```Java

signChangeIndex++

```


Seed: 6

Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 8 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 329

Patch type: InsertAfterOp

```Java

signChangeIndex++

```


Seed: 8

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 1



## Patch 9 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: InsertAfterOp

```Java

end = signChangeIndex

```


Seed: 8

Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 1



## Patch 10 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 202

Patch type: InsertBeforeOp

```Java

signChangeIndex = 2

```


Seed: 8

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 2



## Patch 11 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 323

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Seed: 8

Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 12 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 200

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Seed: 9

Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 13 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 204

Patch type: InsertBeforeOp

```Java

signChangeIndex++

```


Seed: 11

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 3



## Patch 14 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: InsertAfterOp

```Java

targetY = (-(org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.REDUCTION_FACTOR)) * yA

```


Seed: 11

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 15 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 328

Patch type: InsertBeforeOp

```Java

signChangeIndex = 2

```


Seed: 14

Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 16 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: ReplaceOp

```Java

signChangeIndex++

```


Seed: 14

Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 17 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: ReplaceOp

```Java

signChangeIndex++

```


Seed: 15

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 5



## Patch 18 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: InsertBeforeOp

```Java

x[signChangeIndex] = nextX

```


Seed: 15

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 5


--- 


## Patch 19 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 269

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Seed: 16

Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 1



## Patch 20 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: ReplaceOp

```Java

signChangeIndex++

```


Seed: 16

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 21 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: ReplaceOp

```Java

signChangeIndex++

```


Seed: 17

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 22 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 295

Patch type: ReplaceOp

```Java

java.lang.System.arraycopy(x, 1, x, 0, nbPoints)

```


Seed: 18

Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 23 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 205

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Seed: 19

Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 24 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 326

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Seed: 20

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4



## Patch 25 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 241

Patch type: InsertBeforeOp

```Java

signChangeIndex = 2

```


Seed: 20

Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 26 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 260

Patch type: InsertBeforeOp

```Java

signChangeIndex = 2

```


Seed: 23

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 1



## Patch 27 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: ReplaceOp

```Java

signChangeIndex++

```


Seed: 23

Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 1



## Patch 28 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 213

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Seed: 23

Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 29 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 241

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Seed: 24

Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 30 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 323

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Seed: 26

Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 6



## Patch 31 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: InsertBeforeOp

```Java

x[signChangeIndex] = nextX

```


Seed: 26

Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 8


--- 


## Patch 32 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 265

Patch type: ReplaceOp

```Java

signChangeIndex++

```


Seed: 29

Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 5


--- 


## Patch 33 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 299

Patch type: InsertAfterOp

```Java

signChangeIndex = 2

```


Seed: 30

Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 1



## Patch 34 #  jGenProg+MinImpact 

org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver : 246

Patch type: InsertBeforeOp

```Java

signChangeIndex = 2

```


Seed: 30

Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 6


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 27.65

Average Nb of Failing EvoSuite Tests: 2.74

Average Nb of Test-adequate patches: 1.89

Running jGenProg + MinImpact changes the original patch for each of the 30 seeds. The human patch modifies the right part of one variable's assignment and this variable is further used to exit the loop. The original patch and the newly generated patches by running jGenProg + MinImpact seem to be irrelevant to the human patch. We think they just make changes to the program to make the failing tests pass and are incorrect. Note for some seeds, running jGenProg does not generate a single patch, so the approach MinImpact is not used.

---
