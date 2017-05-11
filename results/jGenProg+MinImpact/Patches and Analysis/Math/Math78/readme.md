
##Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/ode/events/EventState.java b/src/main/java/org/apache/commons/math/ode/events/EventState.java
index ff09646..5006065 100644
--- a/src/main/java/org/apache/commons/math/ode/events/EventState.java
+++ b/src/main/java/org/apache/commons/math/ode/events/EventState.java
@@ -188,7 +188,6 @@ public class EventState {
                 if (g0Positive ^ (gb >= 0)) {
                     // there is a sign change: an event is expected during this step
 
+                    if (ga * gb > 0) {
                         // this is a corner case:
                         // - there was an event near ta,
                         // - there is another event between ta and tb
@@ -196,17 +195,7 @@ public class EventState {
                         // this implies that the real sign of ga is the same as gb, so we need to slightly
                         // shift ta to make sure ga and gb get opposite signs and the solver won't complain
                         // about bracketing
+                        final double epsilon = (forward ? 0.25 : -0.25) * convergence;
+                        for (int k = 0; (k < 4) && (ga * gb > 0); ++k) {
+                            ta += epsilon;
+                            interpolator.setInterpolatedTime(ta);
+                            ga = handler.g(ta, interpolator.getInterpolatedState());
+                        }
+                        if (ga * gb > 0) {
                             // this should never happen
+                            throw MathRuntimeException.createInternalError(null);
+                        }
+                    }
                          
                     // variation direction, with respect to the integration direction
                     increasing = gb >= ga;
```


## Patch Original jGenProg 

org.apache.commons.math.ode.events.EventState:283

Patch type: RemoveOp 
 
```Java
remove
```

Execution Time: 0:02 (hh:mm)



--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 1

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 2 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 2

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 3 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 2

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 4 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 3

Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 5 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 3

Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 6 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 4

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 7 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 4

Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 8 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 177

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 5

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 9 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 5

Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 10 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 175

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 5

Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 11 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 183

Patch type: InsertBeforeOp

```Java

ta = tb

```


Seed: 5

Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 12 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 7

Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 13 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 7

Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 14 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 8

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 15 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 8

Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 16 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 9

Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 17 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 9

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 18 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 10

Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 19 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 10

Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 20 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 11

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 21 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 180

Patch type: InsertBeforeOp

```Java

ta = tb

```


Seed: 12

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 22 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 175

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 12

Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 23 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 12

Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 24 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 175

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 13

Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 25 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 14

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 26 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 177

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 14

Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 27 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 14

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 28 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 15

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 29 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 177

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 15

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 30 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 183

Patch type: InsertBeforeOp

```Java

ta = tb

```


Seed: 15

Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 31 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 180

Patch type: InsertBeforeOp

```Java

ta = tb

```


Seed: 16

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 32 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 175

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 17

Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 33 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 18

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 34 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 180

Patch type: InsertBeforeOp

```Java

ta = tb

```


Seed: 18

Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 35 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 175

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 18

Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 36 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 175

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 20

Execution Time: 0:01 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 37 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 20

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 38 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 20

Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 39 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 22

Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 40 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 23

Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 41 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 23

Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 42 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 177

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 23

Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 43 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 23

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 44 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 25

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 45 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 180

Patch type: InsertBeforeOp

```Java

ta = tb

```


Seed: 25

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 46 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 26

Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 47 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 27

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 48 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 28

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 49 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 28

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 50 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 177

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 28

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 51 #  jGenProg+MinImpact 

org.apache.commons.math.ode.events.EventState : 180

Patch type: InsertBeforeOp

```Java

ta = tb

```


Seed: 28

Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 52 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Seed: 30

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 21.9

Average Nb of Failing EvoSuite Tests: 0

Average Nb of Test-adequate patches: 2.08

Running jGenProg + MinImpact changes the original patch for each of the 30 seeds. The human patch adds an if condition with a large code block inside method stepAccepted. The original patch and newly generated patches by running jGenProg + MinImpact are all much simpler comapred to the human patch, we think they just make the failing test pass and are thus incorrect. Note for some seeds, running jGenProg does not generate a single patch, so the approach MinImpact is not used.

---
