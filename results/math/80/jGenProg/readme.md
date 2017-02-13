
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java b/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java
index 9d1b797..3fc328d 100644
--- a/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java
+++ b/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java
@@ -1132,7 +1132,7 @@ public class EigenDecompositionImpl implements EigenDecomposition {
     private boolean flipIfWarranted(final int n, final int step) {
         if (1.5 * work[pingPong] < work[4 * (n - 1) + pingPong]) {
             // flip array
+            int j = 4 * (n - 1);
-            int j = 4 * n - 1;
             for (int i = 0; i < j; i += 4) {
                 for (int k = 0; k < 4; k += step) {
                     final double tmp = work[i + k];
```

## Patch Original jGenProg 

[org.apache.commons.math.linear.EigenDecompositionImpl:1137](https://github.com/apache/commons-math/blob/c78a0e3b003ac36d57a3c895fc8240ef66546a56/src/main/java//org/apache/commons/math/linear/EigenDecompositionImpl.java#L1137) (Suspicious rank: ample 3, jaccard 3, ochiai 16, naish1 16070, gp13 3, naish2 3, tarantula 3, )

Patch type: DELETE 
 
```Java
remove
```

Execution time: 0:01:02.271000

Grid5000 node: graphene-76.nancy.grid5000.fr

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

tau = 0.25 * (dMin1)

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 3



## Patch 2 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

dMin = java.lang.Math.min(dMin, dN)

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 3



## Patch 3 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 2

## Patch 4 #  jGenProg+MinImpact With Seed 2

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (realEigenvalues.length) ; ++i) {
	if (((realEigenvalues[i]) == 0) && ((imagEigenvalues[i]) == 0)) {
		return false;
	} 
}

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 5 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 3

## Patch 6 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1217

Patch type: InsertBeforeOp

```Java

pingPong = 1 - (pingPong)

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 2



## Patch 7 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.linear.EigenDecompositionImpl : 840

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 4

## Patch 8 #  jGenProg+MinImpact With Seed 4

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 1



## Patch 9 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (squaredSecondary.length) ; ++i) {
	final double s = secondary[i];
	squaredSecondary[i] = s * s;
}

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 1



## Patch 10 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.linear.EigenDecompositionImpl : 1133

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 1



## Patch 11 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 1



## Patch 12 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 5

## Patch 13 #  jGenProg+MinImpact With Seed 5

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

tau = 0.25 * (dMin2)

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 3



## Patch 14 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (squaredSecondary.length) ; ++i) {
	final double s = secondary[i];
	squaredSecondary[i] = s * s;
}

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 3



## Patch 15 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

squaredSecondary = new double[secondary.length]

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 3



## Patch 16 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

tType = -5

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 3



## Patch 17 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

g = 0.25

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 6

## Patch 18 #  jGenProg+MinImpact With Seed 6

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 7

## Patch 19 #  jGenProg+MinImpact With Seed 7

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 599

Patch type: InsertBeforeOp

```Java

findEigenvalues()

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 0



## Patch 20 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 21 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 22 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

tType = -9

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 23 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 24 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.linear.EigenDecompositionImpl : 1135

Patch type: InsertAfterOp

```Java

for (int i = 0 ; i < (realEigenvalues.length) ; ++i) {
	if (((realEigenvalues[i]) == 0) && ((imagEigenvalues[i]) == 0)) {
		return false;
	} 
}

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 8

## Patch 25 #  jGenProg+MinImpact With Seed 8

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1133

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 26 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 27 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (squaredSecondary.length) ; ++i) {
	final double s = secondary[i];
	squaredSecondary[i] = s * s;
}

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 28 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

dMin = dN1

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 29 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 9

## Patch 30 #  jGenProg+MinImpact With Seed 9

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (realEigenvalues.length) ; ++i) {
	if (((realEigenvalues[i]) == 0) && ((imagEigenvalues[i]) == 0)) {
		return false;
	} 
}

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 4



## Patch 31 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 4



## Patch 32 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 10

## Patch 33 #  jGenProg+MinImpact With Seed 10

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 5



## Patch 34 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (squaredSecondary.length) ; ++i) {
	final double s = secondary[i];
	squaredSecondary[i] = s * s;
}

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 5



## Patch 35 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

qMax = java.lang.Math.max(qMax, java.lang.Math.max(work[(3 + (pingPong))], work[(7 + (pingPong))]))

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 5


--- 
#Seed: 11

## Patch 36 #  jGenProg+MinImpact With Seed 11

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 4



## Patch 37 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 4



## Patch 38 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 12

## Patch 39 #  jGenProg+MinImpact With Seed 12

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 2



## Patch 40 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

cachedV = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(n, n)

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 2



## Patch 41 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 13

## Patch 42 #  jGenProg+MinImpact With Seed 13

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

dN2 = 0

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 41

Nb of Failing EvoSuite Tests: 1



## Patch 43 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 41

Nb of Failing EvoSuite Tests: 1



## Patch 44 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 41

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 14

## Patch 45 #  jGenProg+MinImpact With Seed 14

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

pingPong = 1 - (pingPong)

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 3



## Patch 46 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (realEigenvalues.length) ; ++i) {
	if (((realEigenvalues[i]) == 0) && ((imagEigenvalues[i]) == 0)) {
		return false;
	} 
}

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 3



## Patch 47 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 3



## Patch 48 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 3



## Patch 49 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.linear.EigenDecompositionImpl : 840

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 3



## Patch 50 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 15

## Patch 51 #  jGenProg+MinImpact With Seed 15

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 840

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 52 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 1



## Patch 53 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 1



## Patch 54 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

tType = -7

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 1



## Patch 55 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.linear.EigenDecompositionImpl : 1133

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 16

## Patch 56 #  jGenProg+MinImpact With Seed 16

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 840

Patch type: ReplaceOp

```Java

updateSigma(tau)

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 57 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1



## Patch 58 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1



## Patch 59 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

org.apache.commons.math.linear.EigenDecompositionImpl.this.secondary = secondary.clone()

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1



## Patch 60 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (realEigenvalues.length) ; ++i) {
	if (((realEigenvalues[i]) == 0) && ((imagEigenvalues[i]) == 0)) {
		return false;
	} 
}

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 17

## Patch 61 #  jGenProg+MinImpact With Seed 17

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 840

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 1



## Patch 62 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 2



## Patch 63 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

cachedD = org.apache.commons.math.linear.MatrixUtils.createRealDiagonalMatrix(realEigenvalues)

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 2



## Patch 64 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.linear.EigenDecompositionImpl : 601

Patch type: InsertAfterOp

```Java

findEigenvalues()

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 18

## Patch 65 #  jGenProg+MinImpact With Seed 18

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (squaredSecondary.length) ; ++i) {
	final double s = secondary[i];
	squaredSecondary[i] = s * s;
}

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 2



## Patch 66 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 2



## Patch 67 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.linear.EigenDecompositionImpl : 840

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 2



## Patch 68 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 2



## Patch 69 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 2



## Patch 70 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (realEigenvalues.length) ; ++i) {
	if (((realEigenvalues[i]) == 0) && ((imagEigenvalues[i]) == 0)) {
		return false;
	} 
}

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 19

## Patch 71 #  jGenProg+MinImpact With Seed 19

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (squaredSecondary.length) ; ++i) {
	final double s = secondary[i];
	squaredSecondary[i] = s * s;
}

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1



## Patch 72 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.linear.EigenDecompositionImpl : 840

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 20

## Patch 73 #  jGenProg+MinImpact With Seed 20

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

cachedVt = null

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 2



## Patch 74 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 2



## Patch 75 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 2



## Patch 76 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

dMin1 = dMin

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 2



## Patch 77 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (realEigenvalues.length) ; ++i) {
	if (((realEigenvalues[i]) == 0) && ((imagEigenvalues[i]) == 0)) {
		return false;
	} 
}

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 21

## Patch 78 #  jGenProg+MinImpact With Seed 21

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1133

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 5



## Patch 79 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

dMin = dN1

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 5



## Patch 80 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (squaredSecondary.length) ; ++i) {
	final double s = secondary[i];
	squaredSecondary[i] = s * s;
}

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 5



## Patch 81 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 5



## Patch 82 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (realEigenvalues.length) ; ++i) {
	if (((realEigenvalues[i]) == 0) && ((imagEigenvalues[i]) == 0)) {
		return false;
	} 
}

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 5


--- 
#Seed: 22

## Patch 83 #  jGenProg+MinImpact With Seed 22

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 2



## Patch 84 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 2



## Patch 85 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 23

## Patch 86 #  jGenProg+MinImpact With Seed 23

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (squaredSecondary.length) ; ++i) {
	final double s = secondary[i];
	squaredSecondary[i] = s * s;
}

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 87 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (realEigenvalues.length) ; ++i) {
	if (((realEigenvalues[i]) == 0) && ((imagEigenvalues[i]) == 0)) {
		return false;
	} 
}

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 88 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 24

## Patch 89 #  jGenProg+MinImpact With Seed 24

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 2



## Patch 90 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

tau = 0.0

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 2



## Patch 91 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 2



## Patch 92 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 25

## Patch 93 #  jGenProg+MinImpact With Seed 25

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1262

Patch type: InsertAfterOp

```Java

flipIfWarranted(n, 2)

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 94 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.linear.EigenDecompositionImpl : 1133

Patch type: ReplaceOp

```Java

if ((dMin1) > 0.0) {
	tau = ((tau) + (dMin)) * (1.0 - (2.0 * (org.apache.commons.math.util.MathUtils.EPSILON)));
	tType -= 11;
} else {
	tau *= 0.25;
	tType -= 12;
}

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 2



## Patch 95 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 2



## Patch 96 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 2



## Patch 97 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 2



## Patch 98 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (realEigenvalues.length) ; ++i) {
	if (((realEigenvalues[i]) == 0) && ((imagEigenvalues[i]) == 0)) {
		return false;
	} 
}

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 26

## Patch 99 #  jGenProg+MinImpact With Seed 26

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 4



## Patch 100 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 4



## Patch 101 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (squaredSecondary.length) ; ++i) {
	final double s = secondary[i];
	squaredSecondary[i] = s * s;
}

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 4



## Patch 102 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 4



## Patch 103 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

cachedV = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(n, n)

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 49

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 27

## Patch 104 #  jGenProg+MinImpact With Seed 27

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (realEigenvalues.length) ; ++i) {
	if (((realEigenvalues[i]) == 0) && ((imagEigenvalues[i]) == 0)) {
		return false;
	} 
}

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 2



## Patch 105 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

tau = -(dMin)

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 2



## Patch 106 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 2



## Patch 107 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 28

## Patch 108 #  jGenProg+MinImpact With Seed 28

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 4



## Patch 109 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: ReplaceOp

```Java

tau = 0.25 * (dMin2)

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 29

## Patch 110 #  jGenProg+MinImpact With Seed 29

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 6



## Patch 111 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.linear.EigenDecompositionImpl : 1133

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 6



## Patch 112 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.linear.EigenDecompositionImpl : 1133

Patch type: ReplaceOp

```Java

if ((tType) == (-18)) {
	g = 0.25 * 0.333;
} else {
	g = 0.25;
}

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 6


--- 
#Seed: 30

## Patch 113 #  jGenProg+MinImpact With Seed 30

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.linear.EigenDecompositionImpl : 1137

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 3



## Patch 114 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.linear.EigenDecompositionImpl : 1139

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 3



## Patch 115 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (realEigenvalues.length) ; ++i) {
	if (((realEigenvalues[i]) == 0) && ((imagEigenvalues[i]) == 0)) {
		return false;
	} 
}

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 3



## Patch 116 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.linear.EigenDecompositionImpl : 1136

Patch type: ReplaceOp

```Java

for (int i = 0 ; i < (squaredSecondary.length) ; ++i) {
	final double s = secondary[i];
	squaredSecondary[i] = s * s;
}

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 50

Nb of Failing EvoSuite Tests: 3


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 46.33

Average Nb of Failing EvoSuite Tests: 2.3

Average Nb of Test-adequate patches: 3.87

---