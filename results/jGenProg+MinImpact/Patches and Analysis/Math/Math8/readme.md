
##Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math3/distribution/DiscreteDistribution.java b/src/main/java/org/apache/commons/math3/distribution/DiscreteDistribution.java
index 879eb2a..5cb0e43 100644
--- a/src/main/java/org/apache/commons/math3/distribution/DiscreteDistribution.java
+++ b/src/main/java/org/apache/commons/math3/distribution/DiscreteDistribution.java
@@ -178,13 +178,13 @@ public class DiscreteDistribution<T> {
      * @throws NotStrictlyPositiveException if {@code sampleSize} is not
      * positive.
      */
+    public Object[] sample(int sampleSize) throws NotStrictlyPositiveException {
-    public T[] sample(int sampleSize) throws NotStrictlyPositiveException {
         if (sampleSize <= 0) {
             throw new NotStrictlyPositiveException(LocalizedFormats.NUMBER_OF_SAMPLES,
                     sampleSize);
         }
 
+        final Object[] out = new Object[sampleSize];
-        final T[]out = (T[]) java.lang.reflect.Array.newInstance(singletons.get(0).getClass(), sampleSize);
 
         for (int i = 0; i < sampleSize; i++) {
             out[i] = sample();
```


## Patch Original jGenProg 

org.apache.commons.math3.distribution.DiscreteDistribution:189

Patch type: RemoveOp 
 
```Java
remove
```

Execution Time: 0:19 (hh:mm)



--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0



## Patch 2 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 3 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 2

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0



## Patch 4 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 2

Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 5 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 3

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 1



## Patch 6 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 3

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 7 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2



## Patch 8 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 9 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 1



## Patch 10 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 11 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1



## Patch 12 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 13 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 14 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 15 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2



## Patch 16 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 17 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1



## Patch 18 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 19 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 10

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2



## Patch 20 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 10

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 21 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0



## Patch 22 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 23 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 12

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 24 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 12

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 25 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1



## Patch 26 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 27 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 28 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 29 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 0



## Patch 30 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 31 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 2



## Patch 32 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 33 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 34 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 35 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 36 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 37 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 19

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 1



## Patch 38 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 19

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 39 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1



## Patch 40 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 41 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 21

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 42 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 21

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 43 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 22

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1



## Patch 44 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 22

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 45 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0



## Patch 46 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 47 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 1



## Patch 48 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 49 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 25

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 50 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 25

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 51 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 26

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 52 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 26

Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 53 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 27

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 2



## Patch 54 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 27

Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 55 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 28

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 1



## Patch 56 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 28

Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 57 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 29

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1



## Patch 58 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 29

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 59 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Seed: 30

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 60 #  jGenProg+MinImpact 

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Seed: 30

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 19.83

Average Nb of Failing EvoSuite Tests: 0.93

Average Nb of Test-adequate patches: 2

Running jGenProg + MinImpact changes the original patch for 19 of the 30 seeds. The human patch involves multiple changes to a class. The original patch and the newly generated patches by running jGenProg + MinImpact all delete a statement. We think they are irrelevant to the human patch and just make the failing test pass, and are thus incorrect.

---
