
## Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/optimization/fitting/GaussianFitter.java b/src/main/java/org/apache/commons/math/optimization/fitting/GaussianFitter.java
index e1b54f4..ae7ac39 100644
--- a/src/main/java/org/apache/commons/math/optimization/fitting/GaussianFitter.java
+++ b/src/main/java/org/apache/commons/math/optimization/fitting/GaussianFitter.java
@@ -118,7 +118,7 @@ public class GaussianFitter extends CurveFitter {
      */
     public double[] fit() {
         final double[] guess = (new ParameterGuesser(getObservations())).guess();
+        return fit(guess);
-        return fit(new Gaussian.Parametric(), guess);
     }
 
     /**

```


## Original Patch # Nopol 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Execution Time: 00:05 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 4

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:8

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 12

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 18

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:8

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 26

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:4

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 28

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:4

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 35

Execution Time: 00:17 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 41

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:9

Nb of Contradiction Tests:0

Nb of Removed Tests:1


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 54

Execution Time: 00:17 (hh:mm)

Nb of EvoSuite Tests:6

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 60

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:9

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 66

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:8

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance <= gNorm
```

Seed: 75

Execution Time: 00:42 (hh:mm)

Nb of EvoSuite Tests:12

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 83

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 98

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:3

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 100

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:3

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 104

Execution Time: 00:23 (hh:mm)

Nb of EvoSuite Tests:9

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 111

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:11

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 113

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:4

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 120

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:10

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 128

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:8

Nb of Contradiction Tests:0

Nb of Removed Tests:1


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 135

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:9

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 143

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:10

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance <= gNorm
```

Seed: 150

Execution Time: 00:33 (hh:mm)

Nb of EvoSuite Tests:11

Nb of Contradiction Tests:0

Nb of Removed Tests:1


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 153

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:8

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 161

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:8

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 166

Execution Time: 00:18 (hh:mm)

Nb of EvoSuite Tests:9

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 173

Execution Time: 00:06 (hh:mm)

Nb of EvoSuite Tests:7

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 180

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:9

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 181

Execution Time: 00:17 (hh:mm)

Nb of EvoSuite Tests:9

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 186

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:3

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer : 620

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.this.orthoTolerance < gNorm
```

Seed: 193

Execution Time: 00:23 (hh:mm)

Nb of EvoSuite Tests:9

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:16 (hh:mm)

Average Nb of EvoSuite Tests:7.63

Average Nb of Contradiction Tests:0.1

Average Nb of Removed Tests:0.23

Running Nopol+UnsatGuided changes the original patch for 2 of the 30 seeds. The human patch removes one parameter form a method call, the original patch and newly generated patches by running Nopol+UnsatGuided all add a precondition to the same statement, we think they are incorrect.