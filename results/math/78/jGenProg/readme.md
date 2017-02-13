
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/ode/events/EventState.java b/src/main/java/org/apache/commons/math/ode/events/EventState.java
index ff09646..5006065 100644
--- a/src/main/java/org/apache/commons/math/ode/events/EventState.java
+++ b/src/main/java/org/apache/commons/math/ode/events/EventState.java
@@ -188,7 +188,6 @@ public class EventState {
                 if (g0Positive ^ (gb >= 0)) {
                     // there is a sign change: an event is expected during this step
 
-                    if (ga * gb > 0) {
                         // this is a corner case:
                         // - there was an event near ta,
                         // - there is another event between ta and tb
@@ -196,17 +195,7 @@ public class EventState {
                         // this implies that the real sign of ga is the same as gb, so we need to slightly
                         // shift ta to make sure ga and gb get opposite signs and the solver won't complain
                         // about bracketing
-                        final double epsilon = (forward ? 0.25 : -0.25) * convergence;
-                        for (int k = 0; (k < 4) && (ga * gb > 0); ++k) {
-                            ta += epsilon;
-                            interpolator.setInterpolatedTime(ta);
-                            ga = handler.g(ta, interpolator.getInterpolatedState());
-                        }
-                        if (ga * gb > 0) {
                             // this should never happen
-                            throw MathRuntimeException.createInternalError(null);
-                        }
-                    }
                          
                     // variation direction, with respect to the integration direction
                     increasing = gb >= ga;
```


## Patch Original jGenProg 

[org.apache.commons.math.ode.events.EventState:283](https://github.com/apache/commons-math/blob/335572b99ea84b7b0665e6a818cba41e34f97203/src/main/java//org/apache/commons/math/ode/events/EventState.java#L283) (Suspicious rank: ample 185, jaccard 185, ochiai 182, naish1 16660, gp13 185, naish2 185, tarantula 185, )

Patch type: DELETE 
 
```Java
remove
```

Execution time: 0:02:32.501000

Grid5000 node: graphene-76.nancy.grid5000.fr


--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 3 #  jGenProg+MinImpact With Seed 2

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 3

## Patch 4 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 5 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 4

## Patch 6 #  jGenProg+MinImpact With Seed 4

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 7 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 5

## Patch 8 #  jGenProg+MinImpact With Seed 5

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 177

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 9 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 10 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.ode.events.EventState : 175

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 11 #  jGenProg+MinImpact With Seed 5

org.apache.commons.math.ode.events.EventState : 183

Patch type: InsertBeforeOp

```Java

ta = tb

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 7

## Patch 12 #  jGenProg+MinImpact With Seed 7

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 13 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 8

## Patch 14 #  jGenProg+MinImpact With Seed 8

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 15 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 9

## Patch 16 #  jGenProg+MinImpact With Seed 9

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 17 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 10

## Patch 18 #  jGenProg+MinImpact With Seed 10

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 19 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 11

## Patch 20 #  jGenProg+MinImpact With Seed 11

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 12

## Patch 21 #  jGenProg+MinImpact With Seed 12

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 180

Patch type: InsertBeforeOp

```Java

ta = tb

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 22 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.ode.events.EventState : 175

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 23 #  jGenProg+MinImpact With Seed 12

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 13

## Patch 24 #  jGenProg+MinImpact With Seed 13

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 175

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 14

## Patch 25 #  jGenProg+MinImpact With Seed 14

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 26 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.ode.events.EventState : 177

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 27 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 15

## Patch 28 #  jGenProg+MinImpact With Seed 15

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 29 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.ode.events.EventState : 177

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 30 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.ode.events.EventState : 183

Patch type: InsertBeforeOp

```Java

ta = tb

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 16

## Patch 31 #  jGenProg+MinImpact With Seed 16

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 180

Patch type: InsertBeforeOp

```Java

ta = tb

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 17

## Patch 32 #  jGenProg+MinImpact With Seed 17

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 175

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 18

## Patch 33 #  jGenProg+MinImpact With Seed 18

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 34 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.ode.events.EventState : 180

Patch type: InsertBeforeOp

```Java

ta = tb

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 35 #  jGenProg+MinImpact With Seed 18

org.apache.commons.math.ode.events.EventState : 175

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 20

## Patch 36 #  jGenProg+MinImpact With Seed 20

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 175

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:01 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 37 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 38 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 22

## Patch 39 #  jGenProg+MinImpact With Seed 22

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 23

## Patch 40 #  jGenProg+MinImpact With Seed 23

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 41 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 42 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.ode.events.EventState : 177

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 43 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 25

## Patch 44 #  jGenProg+MinImpact With Seed 25

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 45 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.ode.events.EventState : 180

Patch type: InsertBeforeOp

```Java

ta = tb

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 26

## Patch 46 #  jGenProg+MinImpact With Seed 26

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 27

## Patch 47 #  jGenProg+MinImpact With Seed 27

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 28

## Patch 48 #  jGenProg+MinImpact With Seed 28

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 49 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.ode.events.EventState : 173

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 50 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.ode.events.EventState : 177

Patch type: InsertBeforeOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 51 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.ode.events.EventState : 180

Patch type: InsertBeforeOp

```Java

ta = tb

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 30

## Patch 52 #  jGenProg+MinImpact With Seed 30

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertAfterOp

```Java

final double t0 = interpolator.getPreviousTime()

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 21.9

Average Nb of Failing EvoSuite Tests: 0

Average Nb of Test-adequate patches: 2.08

---