
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math3/distribution/DiscreteDistribution.java b/src/main/java/org/apache/commons/math3/distribution/DiscreteDistribution.java
index 879eb2a..5cb0e43 100644
--- a/src/main/java/org/apache/commons/math3/distribution/DiscreteDistribution.java
+++ b/src/main/java/org/apache/commons/math3/distribution/DiscreteDistribution.java
@@ -178,13 +178,13 @@ public class DiscreteDistribution<T> {
      * @throws NotStrictlyPositiveException if {@code sampleSize} is not
      * positive.
      */
-    public Object[] sample(int sampleSize) throws NotStrictlyPositiveException {
+    public T[] sample(int sampleSize) throws NotStrictlyPositiveException {
         if (sampleSize <= 0) {
             throw new NotStrictlyPositiveException(LocalizedFormats.NUMBER_OF_SAMPLES,
                     sampleSize);
         }
 
-        final Object[] out = new Object[sampleSize];
+        final T[]out = (T[]) java.lang.reflect.Array.newInstance(singletons.get(0).getClass(), sampleSize);
 
         for (int i = 0; i < sampleSize; i++) {
             out[i] = sample();
```


## Patch Original jGenProg 

[org.apache.commons.math3.distribution.DiscreteDistribution:189](https://github.com/apache/commons-math/blob/e65901dcb8044b41bd282f2c4b324c93c67a93cb/src/main/java//org/apache/commons/math3/distribution/DiscreteDistribution.java#L189) (Suspicious rank: ample 3, jaccard 3, ochiai 3, naish1 33466, gp13 3, naish2 3, tarantula 3, )

Patch type: DELETE 
 
```Java
remove
```

Execution time: 0:19:12.515000

Grid5000 node: graphene-4.nancy.grid5000.fr


--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0



## Patch 2 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 2

## Patch 3 #  jGenProg+MinImpact With Seed 2

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0



## Patch 4 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 3

## Patch 5 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 1



## Patch 6 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 4

## Patch 7 #  jGenProg+MinImpact With Seed 4

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2



## Patch 8 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 5

## Patch 9 #  jGenProg+MinImpact With Seed 5

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 1



## Patch 10 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 6

## Patch 11 #  jGenProg+MinImpact With Seed 6

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1



## Patch 12 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 7

## Patch 13 #  jGenProg+MinImpact With Seed 7

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 14 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 8

## Patch 15 #  jGenProg+MinImpact With Seed 8

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2



## Patch 16 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 9

## Patch 17 #  jGenProg+MinImpact With Seed 9

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1



## Patch 18 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 10

## Patch 19 #  jGenProg+MinImpact With Seed 10

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2



## Patch 20 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 11

## Patch 21 #  jGenProg+MinImpact With Seed 11

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0



## Patch 22 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 12

## Patch 23 #  jGenProg+MinImpact With Seed 12

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 24 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 13

## Patch 25 #  jGenProg+MinImpact With Seed 13

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1



## Patch 26 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 14

## Patch 27 #  jGenProg+MinImpact With Seed 14

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 28 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 15

## Patch 29 #  jGenProg+MinImpact With Seed 15

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 0



## Patch 30 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 17

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 16

## Patch 31 #  jGenProg+MinImpact With Seed 16

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 2



## Patch 32 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 17

## Patch 33 #  jGenProg+MinImpact With Seed 17

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 34 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 18

## Patch 35 #  jGenProg+MinImpact With Seed 18

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 36 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 19

## Patch 37 #  jGenProg+MinImpact With Seed 19

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 1



## Patch 38 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 20

## Patch 39 #  jGenProg+MinImpact With Seed 20

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1



## Patch 40 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 21

## Patch 41 #  jGenProg+MinImpact With Seed 21

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 42 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 22

## Patch 43 #  jGenProg+MinImpact With Seed 22

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1



## Patch 44 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 23

## Patch 45 #  jGenProg+MinImpact With Seed 23

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0



## Patch 46 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 24

## Patch 47 #  jGenProg+MinImpact With Seed 24

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 1



## Patch 48 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 25

## Patch 49 #  jGenProg+MinImpact With Seed 25

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 50 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 26

## Patch 51 #  jGenProg+MinImpact With Seed 26

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 52 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 27

## Patch 53 #  jGenProg+MinImpact With Seed 27

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 2



## Patch 54 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 19

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 28

## Patch 55 #  jGenProg+MinImpact With Seed 28

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 1



## Patch 56 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 29

## Patch 57 #  jGenProg+MinImpact With Seed 29

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1



## Patch 58 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 30

## Patch 59 #  jGenProg+MinImpact With Seed 30

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.distribution.DiscreteDistribution : 190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 60 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math3.distribution.DiscreteDistribution : 189

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 19.83

Average Nb of Failing EvoSuite Tests: 0.93

Average Nb of Test-adequate patches: 2

---