
## Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math3/ode/AbstractIntegrator.java b/src/main/java/org/apache/commons/math3/ode/AbstractIntegrator.java
index 6e0237f..f24f87c 100644
--- a/src/main/java/org/apache/commons/math3/ode/AbstractIntegrator.java
+++ b/src/main/java/org/apache/commons/math3/ode/AbstractIntegrator.java
@@ -343,10 +343,8 @@ public abstract class AbstractIntegrator implements FirstOrderIntegrator {
                 final double[] eventY = interpolator.getInterpolatedState().clone();
 
                 // advance all event states to current time
+                for (final EventState state : eventsStates) {
+                    state.stepAccepted(eventT, eventY);
+                    isLastStep = isLastStep || state.stop();
+                }
-                currentEvent.stepAccepted(eventT, eventY);
-                isLastStep = currentEvent.stop();
 
                 // handle the first part of the step, up to the event
                 for (final StepHandler handler : stepHandlers) {
@@ -356,19 +354,22 @@ public abstract class AbstractIntegrator implements FirstOrderIntegrator {
                 if (isLastStep) {
                     // the event asked to stop integration
                     System.arraycopy(eventY, 0, y, 0, y.length);
-                    for (final EventState remaining : occuringEvents) {
-                        remaining.stepAccepted(eventT, eventY);
-                    }
                     return eventT;
                 }
 
+                boolean needReset = false;
+                for (final EventState state : eventsStates) {
+                    needReset =  needReset || state.reset(eventT, eventY);
+                }
-                boolean needReset = currentEvent.reset(eventT, eventY);
                 if (needReset) {
                     // some event handler has triggered changes that
                     // invalidate the derivatives, we need to recompute them
                     System.arraycopy(eventY, 0, y, 0, y.length);
                     computeDerivatives(eventT, y, yDot);
                     resetOccurred = true;
-                    for (final EventState remaining : occuringEvents) {
-                        remaining.stepAccepted(eventT, eventY);
-                    }
                     return eventT;
                 }
 

```


## Original Patch # Nopol 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Execution Time: 00:16 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 4

Execution Time: 04:28 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 12

Execution Time: 05:17 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 18

Execution Time: 04:11 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 26

Execution Time: 05:15 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 28

Execution Time: 05:15 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 35

Execution Time: 05:31 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 41

Execution Time: 05:46 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 54

Execution Time: 05:46 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 60

Execution Time: 04:43 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 66

Execution Time: 05:15 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 75

Execution Time: 04:58 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 83

Execution Time: 04:27 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 98

Execution Time: 04:48 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
orderingSign == org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size()
```

Seed: 100

Execution Time: 05:15 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
orderingSign == org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size()
```

Seed: 104

Execution Time: 04:28 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 111

Execution Time: 05:15 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 113

Execution Time: 04:09 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 120

Execution Time: 05:32 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 128

Execution Time: 04:12 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 135

Execution Time: 06:19 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 143

Execution Time: 04:45 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 150

Execution Time: 04:45 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 153

Execution Time: 05:45 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 161

Execution Time: 05:16 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 166

Execution Time: 05:15 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 173

Execution Time: 04:29 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 180

Execution Time: 05:03 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 181

Execution Time: 04:58 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size() == 1
```

Seed: 186

Execution Time: 04:12 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math3.ode.AbstractIntegrator : 351

Patch type: PRECONDITION

```Java
1 == org.apache.commons.math3.ode.AbstractIntegrator.this.stepHandlers.size()
```

Seed: 193

Execution Time: 05:34 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 05:02 (hh:mm)

Average Nb of EvoSuite Tests:29.17

Average Nb of Removed Tests:0

Running Nopol+UnsatGuided changes the original patch for 2 of the 30 seeds. The human patch involves multiple changes to a class, the original patch and the newly generated patches by running Nopol+UnsatGuided add a precondition to the same statement, we think they are incorrect. We observe failing EvoSuite tests for both the programs patched with the original Nopol patch and the new patches genertaed by running Nopol+UnsatGuided, which verifies our analysis.
