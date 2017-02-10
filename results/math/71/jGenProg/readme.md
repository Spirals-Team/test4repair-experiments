#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//math/ project math
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/ode/nonstiff/EmbeddedRungeKuttaIntegrator.java b/src/main/java/org/apache/commons/math/ode/nonstiff/EmbeddedRungeKuttaIntegrator.java
index e03be9e..0840ac1 100644
--- a/src/main/java/org/apache/commons/math/ode/nonstiff/EmbeddedRungeKuttaIntegrator.java
+++ b/src/main/java/org/apache/commons/math/ode/nonstiff/EmbeddedRungeKuttaIntegrator.java
@@ -297,10 +297,6 @@ public abstract class EmbeddedRungeKuttaIntegrator
                   // it is so small (much probably exactly 0 due to limited accuracy)
                   // that the code above would fail handling it.
                   // So we set up an artificial 0 size step by copying states
-                  interpolator.storeTime(stepStart);
-                  System.arraycopy(y, 0, yTmp, 0, y0.length);
-                  hNew     = 0;
-                  stepSize = 0;
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
-                interpolator.storeTime(stepStart);
-                System.arraycopy(y, 0, yTmp, 0, y0.length);
-                stepSize = 0;
                 loop     = false;
             } else {
                 // reject the step to match exactly the next switch time
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 230

Patch type: InsertBeforeOp

```Java

pendingEvent = true

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 3

## Patch 2 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertAfterOp

```Java

pendingEvent = true

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 8

## Patch 3 #  jGenProg+MinImpact With Seed 8

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 229

Patch type: InsertBeforeOp

```Java

if ((pendingEvent) && ((java.lang.Math.abs((t1 - (pendingEventTime)))) <= (convergence))) {
	return false;
} 

```


Execution Time: 0:01 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 9

## Patch 4 #  jGenProg+MinImpact With Seed 9

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertAfterOp

```Java

pendingEvent = true

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 5 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.ode.events.EventState : 174

Patch type: InsertBeforeOp

```Java

pendingEvent = true

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 6 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.ode.events.EventState : 185

Patch type: InsertBeforeOp

```Java

pendingEvent = true

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 7 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.ode.events.EventState : 175

Patch type: InsertBeforeOp

```Java

if ((pendingEvent) && ((java.lang.Math.abs((t1 - (pendingEventTime)))) <= (convergence))) {
	return false;
} 

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 10

## Patch 8 #  jGenProg+MinImpact With Seed 10

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 191

Patch type: InsertBeforeOp

```Java

pendingEvent = true

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 9 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.ode.events.EventState : 184

Patch type: InsertBeforeOp

```Java

if ((pendingEvent) && ((java.lang.Math.abs((t1 - (pendingEventTime)))) <= (convergence))) {
	return false;
} 

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 10 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.ode.events.EventState : 248

Patch type: InsertBeforeOp

```Java

if (((java.lang.Math.abs((root - ta))) <= (convergence)) && ((java.lang.Math.abs((root - (previousEventTime)))) <= (convergence))) {
	ta = tb;
	ga = gb;
} else {
	if ((java.lang.Double.isNaN(previousEventTime)) || ((java.lang.Math.abs(((previousEventTime) - root))) > (convergence))) {
		pendingEventTime = root;
		if ((pendingEvent) && ((java.lang.Math.abs((t1 - (pendingEventTime)))) <= (convergence))) {
			return false;
		} 
		pendingEvent = true;
		return true;
	} 
}

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 14

## Patch 11 #  jGenProg+MinImpact With Seed 14

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 175

Patch type: InsertAfterOp

```Java

pendingEvent = true

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 15

## Patch 12 #  jGenProg+MinImpact With Seed 15

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 179

Patch type: InsertBeforeOp

```Java

if ((pendingEvent) && ((java.lang.Math.abs((t1 - (pendingEventTime)))) <= (convergence))) {
	return false;
} 

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 13 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.ode.events.EventState : 172

Patch type: InsertBeforeOp

```Java

pendingEvent = true

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 19

## Patch 14 #  jGenProg+MinImpact With Seed 19

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 179

Patch type: InsertAfterOp

```Java

if ((pendingEvent) && ((java.lang.Math.abs((t1 - (pendingEventTime)))) <= (convergence))) {
	return false;
} 

```


Execution Time: 0:01 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 15 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.ode.events.EventState : 229

Patch type: InsertAfterOp

```Java

if ((pendingEvent) && ((java.lang.Math.abs((t1 - (pendingEventTime)))) <= (convergence))) {
	return false;
} 

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 20

## Patch 16 #  jGenProg+MinImpact With Seed 20

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 229

Patch type: InsertBeforeOp

```Java

pendingEvent = true

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 22

## Patch 17 #  jGenProg+MinImpact With Seed 22

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 180

Patch type: InsertBeforeOp

```Java

pendingEvent = true

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 27

## Patch 18 #  jGenProg+MinImpact With Seed 27

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 227

Patch type: InsertAfterOp

```Java

if ((pendingEvent) && ((java.lang.Math.abs((t1 - (pendingEventTime)))) <= (convergence))) {
	return false;
} 

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 19 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.ode.events.EventState : 191

Patch type: InsertAfterOp

```Java

if ((pendingEvent) && ((java.lang.Math.abs((t1 - (pendingEventTime)))) <= (convergence))) {
	return false;
} 

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 29

## Patch 20 #  jGenProg+MinImpact With Seed 29

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 253

Patch type: InsertBeforeOp

```Java

if ((pendingEvent) && ((java.lang.Math.abs((t1 - (pendingEventTime)))) <= (convergence))) {
	return false;
} 

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 30

## Patch 21 #  jGenProg+MinImpact With Seed 30

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.ode.events.EventState : 180

Patch type: InsertBeforeOp

```Java

if ((pendingEvent) && ((java.lang.Math.abs((t1 - (pendingEventTime)))) <= (convergence))) {
	return false;
} 

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 22

Average Nb of Failing EvoSuite Tests: 0

Average Nb of Test-adequate patches: 1.62

---