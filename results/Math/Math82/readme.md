
##Human Patch 

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


## Patch Original jGenProg 

org.apache.commons.math.optimization.linear.SimplexSolver:63

Patch type: RemoveOp 
 
```Java
remove
```

Execution Time: 0:06 (hh:mm)


--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 2 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 2

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 3 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 3

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 15

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 4 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 16

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 5 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 6 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 7 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 8 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 9 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 10 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 10

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 11 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 12 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 12

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 13 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 16

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 14 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 15 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 16 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 17 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 18 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 19 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 19

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 20 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 16

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 21 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 21

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 16

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 22 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 22

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 23 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 24 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 16

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 25 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 25

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 16

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 26 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 26

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 27 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 27

Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 28 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 28

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 29 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 29

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 30 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.optimization.linear.SimplexSolver : 63

Patch type: RemoveOp

```Java

remove

```


Seed: 30

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 0


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 17.2

Average Nb of Failing EvoSuite Tests: 0

Average Nb of Test-adequate patches: 1

unning jGenProg + MinImpact does not change the original patch for any of the 30 seeds. The human patch changes the if condition, the generated patch seems to be irrevlant to the human patch, we think it just makes the failing test pass and is incorrect.

---
