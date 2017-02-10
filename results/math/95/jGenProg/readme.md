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



## Patch 2 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 1.0

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 3 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 4 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return p

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 5 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1.0

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 6 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 7 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0.0

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 8 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 9 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 10 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 11 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 12 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.0

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19


--- 
#Seed: 2

## Patch 13 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.0

```


Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 14 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 15 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 16 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 17 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 18 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 19 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 1.0

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 20 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return p

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 21 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.5

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 22 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.5

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 23 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19


--- 
#Seed: 3

## Patch 24 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 25 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1.0

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 26 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 27 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 28 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 29 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 30 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 31 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.5

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 32 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.5

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19


--- 
#Seed: 4

## Patch 33 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return denominatorDegreesOfFreedom

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 34 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 35 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 36 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 1.0

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 37 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0.0

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 38 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1.0

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 39 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 40 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 41 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.0

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 42 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19


--- 
#Seed: 5

## Patch 43 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 44 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 45 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 46 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 47 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1.0

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 48 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 49 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0.0

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 50 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return p

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 51 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.0

```


Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 52 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 1.0

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 53 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 54 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.5

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 6

## Patch 55 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 56 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 57 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 58 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 59 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.0

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 60 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1.0

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 61 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0.0

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 62 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 63 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 1.0

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 64 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.5

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 65 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 7

## Patch 66 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 67 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 1.0

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 68 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return denominatorDegreesOfFreedom

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 69 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 70 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 71 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 1.0

```


Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 72 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.0

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 73 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 74 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 75 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.5

```


Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18


--- 
#Seed: 8

## Patch 76 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return denominatorDegreesOfFreedom

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 77 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 78 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1.0

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 79 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 80 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 1.0

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 81 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 82 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return p

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 83 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 84 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 85 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.0

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 86 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.5

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 87 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18


--- 
#Seed: 9

## Patch 88 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 89 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 90 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return p

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 91 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 92 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.0

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 93 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 94 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 95 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 96 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1.0

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20


--- 
#Seed: 10

## Patch 97 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0.0

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 98 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.0

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 99 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 100 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return p

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 101 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 102 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 103 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 104 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.0

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 105 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1.0

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 106 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 107 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 1.0

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 108 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 109 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.5

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19


--- 
#Seed: 11

## Patch 110 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return denominatorDegreesOfFreedom

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 111 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 112 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 1.0

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 113 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0.0

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 114 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1.0

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 115 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 116 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 117 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.0

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 118 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 119 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return p

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 120 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 121 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.5

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 122 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.5

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20


--- 
#Seed: 12

## Patch 123 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return denominatorDegreesOfFreedom

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 124 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 125 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 126 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 127 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 128 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 129 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 130 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 1.0

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 131 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 132 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.5

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18


--- 
#Seed: 13

## Patch 133 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 134 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 135 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 136 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0.0

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 137 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return denominatorDegreesOfFreedom

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 138 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 1.0

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 139 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 140 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1.0

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 141 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 142 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.5

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 143 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 1.0

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19


--- 
#Seed: 14

## Patch 144 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 145 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1.0

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 146 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.0

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 147 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 148 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 149 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 150 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 151 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.0

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 152 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 15

## Patch 153 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return denominatorDegreesOfFreedom

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 154 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 155 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 156 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 157 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1.0

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 158 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return p

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 159 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 160 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.0

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 161 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 162 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.5

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20


--- 
#Seed: 16

## Patch 163 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return p

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 17



## Patch 164 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return denominatorDegreesOfFreedom

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 17



## Patch 165 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 17



## Patch 166 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 17



## Patch 167 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 17



## Patch 168 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.0

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 17



## Patch 169 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 17



## Patch 170 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 17



## Patch 171 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 17



## Patch 172 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 1.0

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 17


--- 
#Seed: 17

## Patch 173 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 174 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 175 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0.0

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 176 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return p

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 177 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 178 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.5

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 179 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 180 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20


--- 
#Seed: 18

## Patch 181 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 182 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 183 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0.0

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 184 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return p

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 185 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 186 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1.0

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 187 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return denominatorDegreesOfFreedom

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 188 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 189 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.0

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 190 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 191 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 192 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.5

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20


--- 
#Seed: 19

## Patch 193 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0.0

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 194 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 195 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return p

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 196 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 197 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return denominatorDegreesOfFreedom

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 198 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 199 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 200 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.0

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 201 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 1.0

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 202 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.5

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 203 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 20

## Patch 204 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 205 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.0

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 206 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 207 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return p

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 208 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 209 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 1.0

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 210 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 211 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 212 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1.0

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 213 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.5

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 214 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.5

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 215 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 1.0

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20


--- 
#Seed: 21

## Patch 216 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 217 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1.0

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 218 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 1.0

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 219 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 220 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return p

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 221 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 222 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 223 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 224 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 225 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.0

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19


--- 
#Seed: 22

## Patch 226 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return p

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 227 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return denominatorDegreesOfFreedom

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 228 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 229 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 230 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 231 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 232 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.0

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 233 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 234 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 235 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.0

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 236 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 1.0

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 237 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 1.0

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 238 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.5

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 239 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20


--- 
#Seed: 23

## Patch 240 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 241 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 242 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 0.0

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 243 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0.0

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 244 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return denominatorDegreesOfFreedom

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 245 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 246 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: InsertAfterOp

```Java

ret = 1.0

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 247 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1.0

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 248 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 249 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 1.0

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 250 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 251 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.5

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19


--- 
#Seed: 24

## Patch 252 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return numeratorDegreesOfFreedom

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 253 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1.0

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 254 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.0

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 255 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return java.lang.Double.MIN_VALUE

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 256 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return p

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 257 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 1

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 258 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 259 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: ReplaceOp

```Java

return 0.0

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 260 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 1.0

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 261 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.0

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 262 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 1.0

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 263 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.distribution.FDistributionImpl : 148

Patch type: InsertBeforeOp

```Java

ret = 0.5

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19



## Patch 264 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.distribution.FDistributionImpl : 147

Patch type: ReplaceOp

```Java

ret = 0.5

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 19


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 21

Average Nb of Failing EvoSuite Tests: 3.24

---