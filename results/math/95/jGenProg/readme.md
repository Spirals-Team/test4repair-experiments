#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//math/ project math
##Original Patch 

```Java
diff --git a/src/java/org/apache/commons/math/distribution/FDistributionImpl.java b/src/java/org/apache/commons/math/distribution/FDistributionImpl.java
index 59aeb07..e19e97a 100644
--- a/src/java/org/apache/commons/math/distribution/FDistributionImpl.java
+++ b/src/java/org/apache/commons/math/distribution/FDistributionImpl.java
@@ -141,12 +141,10 @@ public class FDistributionImpl
      * @return initial domain value
      */
     protected double getInitialDomain(double p) {
-        double ret = 1.0;
+        double ret;
         double d = getDenominatorDegreesOfFreedom();
-        if (d > 2.0) {
             // use mean
             ret = d / (d - 2.0);
-        }
         return ret;
     }
     
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return denominatorDegreesOfFreedom

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.0

```


Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return denominatorDegreesOfFreedom

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return denominatorDegreesOfFreedom

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18


--- 
#Seed: 9

## Patch 9 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20


--- 
#Seed: 10

## Patch 10 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0.0

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19


--- 
#Seed: 11

## Patch 11 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return denominatorDegreesOfFreedom

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return denominatorDegreesOfFreedom

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 15

## Patch 15 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return denominatorDegreesOfFreedom

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20


--- 
#Seed: 16

## Patch 16 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return p

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 17


--- 
#Seed: 17

## Patch 17 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20


--- 
#Seed: 18

## Patch 18 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20


--- 
#Seed: 19

## Patch 19 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0.0

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return p

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20


--- 
#Seed: 23

## Patch 23 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19


--- 
#Seed: 24

## Patch 24 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 20.11

Average Nb of Failing EvoSuite Tests: 1.67

---