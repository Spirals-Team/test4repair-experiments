#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//math/ project math
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math3/optimization/direct/CMAESOptimizer.java b/src/main/java/org/apache/commons/math3/optimization/direct/CMAESOptimizer.java
index b54cb37..4b7dbf6 100644
--- a/src/main/java/org/apache/commons/math3/optimization/direct/CMAESOptimizer.java
+++ b/src/main/java/org/apache/commons/math3/optimization/direct/CMAESOptimizer.java
@@ -918,8 +918,7 @@ public class CMAESOptimizer
          * @return the original objective variables, possibly repaired.
          */
         public double[] repairAndDecode(final double[] x) {
-            return boundaries != null && isRepairMode ?
-                decode(repair(x)) :
+            return
                 decode(x);
         }
 
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 995

Patch type: ReplaceOp

```Java

isRepairMode = true

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 995

Patch type: ReplaceOp

```Java

isRepairMode = true

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 909

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 911

Patch type: ReplaceOp

```Java

valueRange = 1.0

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 911

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 911

Patch type: ReplaceOp

```Java

valueRange = 1.0

```


Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 911

Patch type: ReplaceOp

```Java

valueRange = 1.0

```


Execution Time: 2:04 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 9

## Patch 8 #  jGenProg+MinImpact With Seed 9

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 911

Patch type: RemoveOp

```Java

remove

```


Execution Time: 2:46 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 10

## Patch 9 #  jGenProg+MinImpact With Seed 10

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 909

Patch type: RemoveOp

```Java

remove

```


Execution Time: 2:24 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 11

## Patch 10 #  jGenProg+MinImpact With Seed 11

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 995

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 11 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 911

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 995

Patch type: ReplaceOp

```Java

org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.this.valueRange = valueRange

```


Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 911

Patch type: ReplaceOp

```Java

org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.this.valueRange = valueRange

```


Execution Time: 2:13 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 913

Patch type: ReplaceOp

```Java

return x

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 16

## Patch 15 #  jGenProg+MinImpact With Seed 16

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 995

Patch type: ReplaceOp

```Java

isRepairMode = true

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 16 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 995

Patch type: ReplaceOp

```Java

org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.this.valueRange = valueRange

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 17 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 911

Patch type: ReplaceOp

```Java

isRepairMode = true

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 17

## Patch 18 #  jGenProg+MinImpact With Seed 17

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 995

Patch type: RemoveOp

```Java

remove

```


Execution Time: 2:29 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 18

## Patch 19 #  jGenProg+MinImpact With Seed 18

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 911

Patch type: ReplaceOp

```Java

valueRange = 1.0

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 911

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 911

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 911

Patch type: ReplaceOp

```Java

isRepairMode = true

```


Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 23 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 909

Patch type: RemoveOp

```Java

remove

```


Execution Time: 2:03 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 23

## Patch 24 #  jGenProg+MinImpact With Seed 23

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 995

Patch type: ReplaceOp

```Java

org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.this.valueRange = valueRange

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 24

## Patch 25 #  jGenProg+MinImpact With Seed 24

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 909

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 25

## Patch 26 #  jGenProg+MinImpact With Seed 25

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 995

Patch type: ReplaceOp

```Java

isRepairMode = true

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 26

## Patch 27 #  jGenProg+MinImpact With Seed 26

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 995

Patch type: ReplaceOp

```Java

valueRange = 1.0

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 27

## Patch 28 #  jGenProg+MinImpact With Seed 27

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 995

Patch type: ReplaceOp

```Java

valueRange = 1.0

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 29 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 911

Patch type: ReplaceOp

```Java

org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.this.valueRange = valueRange

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 28

## Patch 30 #  jGenProg+MinImpact With Seed 28

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 995

Patch type: ReplaceOp

```Java

valueRange = 1.0

```


Execution Time: 2:21 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 29

## Patch 31 #  jGenProg+MinImpact With Seed 29

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.direct.CMAESOptimizer : 909

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 24

Average Nb of Failing EvoSuite Tests: 0

Average Nb of Test-adequate patches: 1.19

---