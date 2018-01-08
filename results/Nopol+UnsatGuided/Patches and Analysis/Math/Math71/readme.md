
## Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/ode/nonstiff/EmbeddedRungeKuttaIntegrator.java b/src/main/java/org/apache/commons/math/ode/nonstiff/EmbeddedRungeKuttaIntegrator.java
index e03be9e..0840ac1 100644
--- a/src/main/java/org/apache/commons/math/ode/nonstiff/EmbeddedRungeKuttaIntegrator.java
+++ b/src/main/java/org/apache/commons/math/ode/nonstiff/EmbeddedRungeKuttaIntegrator.java
@@ -297,10 +297,6 @@ public abstract class EmbeddedRungeKuttaIntegrator
                   // it is so small (much probably exactly 0 due to limited accuracy)
                   // that the code above would fail handling it.
                   // So we set up an artificial 0 size step by copying states
+                  interpolator.storeTime(stepStart);
+                  System.arraycopy(y, 0, yTmp, 0, y0.length);
+                  hNew     = 0;
+                  stepSize = 0;
                   loop     = false;
               } else {
                   // reject the step to match exactly the next switch time
diff --git a/src/main/java/org/apache/commons/math/ode/nonstiff/RungeKuttaIntegrator.java b/src/main/java/org/apache/commons/math/ode/nonstiff/RungeKuttaIntegrator.java
index b61b0b1..255b1f4 100644
--- a/src/main/java/org/apache/commons/math/ode/nonstiff/RungeKuttaIntegrator.java
+++ b/src/main/java/org/apache/commons/math/ode/nonstiff/RungeKuttaIntegrator.java
@@ -177,9 +177,6 @@ public abstract class RungeKuttaIntegrator extends AbstractIntegrator {
                 // it is so small (much probably exactly 0 due to limited accuracy)
                 // that the code above would fail handling it.
                 // So we set up an artificial 0 size step by copying states
+                interpolator.storeTime(stepStart);
+                System.arraycopy(y, 0, yTmp, 0, y0.length);
+                stepSize = 0;
                 loop     = false;
             } else {
                 // reject the step to match exactly the next switch time

```


## Original Patch # Nopol 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
t0 == 0
```

Execution Time: 00:00 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 150

Patch type: PRECONDITION

```Java
(0) != (org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep)
```

Seed: 4

Execution Time: 00:23 (hh:mm)

Nb of EvoSuite Tests:32

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
t0 < y0.length
```

Seed: 12

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
t0 <= org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.scalRelativeTolerance
```

Seed: 18

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:34

Nb of Removed Tests:1


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
(0) != (org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep)
```

Seed: 26

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 153

Patch type: PRECONDITION

```Java
(org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep) != (0)
```

Seed: 28

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:1


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
t0 <= org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.scalRelativeTolerance
```

Seed: 35

Execution Time: 00:20 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
t0 == 0
```

Seed: 41

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Removed Tests:1


## Patch 8 # Nopol+UnsatGuided (selected for manual analysis)

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 150

Patch type: PRECONDITION

```Java
(org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep) != (0)
```

Seed: 54

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:32

Nb of Removed Tests:1


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
(org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep) != (0)
```

Seed: 60

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:34

Nb of Removed Tests:1


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
t0 == 0
```

Seed: 66

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
(0) != (org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep)
```

Seed: 75

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 153

Patch type: PRECONDITION

```Java
(0) != (org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep)
```

Seed: 83

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:32

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
(0) != (org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep)
```

Seed: 98

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:2


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 153

Patch type: PRECONDITION

```Java
org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.scalRelativeTolerance < org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep
```

Seed: 100

Execution Time: 00:18 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Removed Tests:1


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
t0 < y1.length
```

Seed: 104

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.scalRelativeTolerance < org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep
```

Seed: 111

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
t0 == 0
```

Seed: 113

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:2


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
0 < org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep
```

Seed: 120

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:37

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
(org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep) != (0)
```

Seed: 128

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Removed Tests:1


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
(org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep) != (0)
```

Seed: 135

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:32

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
(org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep) != (0)
```

Seed: 143

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:32

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
(org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep) != (0)
```

Seed: 150

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
(org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep) != (0)
```

Seed: 153

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:34

Nb of Removed Tests:1


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
(0) != (org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep)
```

Seed: 161

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
t0 < org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.maxStep
```

Seed: 166

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Removed Tests:2


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 153

Patch type: PRECONDITION

```Java
org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.scalRelativeTolerance < org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.minStep
```

Seed: 173

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:37

Nb of Removed Tests:1


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
t0 <= y0.length
```

Seed: 180

Execution Time: 00:25 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Removed Tests:1


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.this.initialStep < yDot0.length
```

Seed: 181

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
t0 == 0
```

Seed: 186

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator : 211

Patch type: PRECONDITION

```Java
t0 == 0
```

Seed: 193

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:1


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:22 (hh:mm)

Average Nb of EvoSuite Tests:31.73

Average Nb of Removed Tests:0.57

Runing Nopol+UnsatGuided changes the original patch for 25 of the 30 seeds. The human patch involves changes to multiple files, the original patch and the selected newly generated patch by running Nopol+UnsatGuided add a precondition to a specific statement, we think they are incorrect. We observe failing EvoSuite tests for both programs patched with the original Nopol patch and the selected new patch genertaed by running Nopol+UnsatGuided, which verifies our analysis.
