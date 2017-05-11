
## Human Patch 

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


## Original Patch # Nopol 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
-1 <= delta
```

Execution Time: 00:00 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
((oldDelta <= tolerance) || (!(100 < x1))) && ((oldDelta <= tolerance) || (!(100 < x1)))
```

Seed: 4

Execution Time: 00:31 (hh:mm)

Nb of EvoSuite Tests:37

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
x1 <= 100
```

Seed: 12

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
(x2 < -1) || (!(delta <= -1))
```

Seed: 18

Execution Time: 00:33 (hh:mm)

Nb of EvoSuite Tests:36

Nb of Contradiction Tests:2

Nb of Removed Tests:2


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
(x2 <= 0) || ((f!=null) && (y1 < 100))
```

Seed: 26

Execution Time: 00:30 (hh:mm)

Nb of EvoSuite Tests:32

Nb of Contradiction Tests:3

Nb of Removed Tests:3


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
x1 < 100
```

Seed: 28

Execution Time: 00:34 (hh:mm)

Nb of EvoSuite Tests:36

Nb of Contradiction Tests:2

Nb of Removed Tests:2


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
x0 < 100
```

Seed: 35

Execution Time: 00:25 (hh:mm)

Nb of EvoSuite Tests:37

Nb of Contradiction Tests:3

Nb of Removed Tests:3


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
-1 < delta
```

Seed: 41

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
x0 <= 100
```

Seed: 54

Execution Time: 00:18 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Contradiction Tests:2

Nb of Removed Tests:2


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
(!(dx <= -1)) || (dx < y2)
```

Seed: 60

Execution Time: 00:33 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
x0 < 100
```

Seed: 66

Execution Time: 00:25 (hh:mm)

Nb of EvoSuite Tests:37

Nb of Contradiction Tests:2

Nb of Removed Tests:2


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
x1 < 100
```

Seed: 75

Execution Time: 00:20 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
x1 < 100
```

Seed: 83

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:32

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
((i) != (1)) || ((-1 < delta) && (f!=null))
```

Seed: 98

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
x0 <= 100
```

Seed: 100

Execution Time: 00:23 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Contradiction Tests:3

Nb of Removed Tests:3


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
-1 <= delta
```

Seed: 104

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Contradiction Tests:2

Nb of Removed Tests:2


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
-1 < delta
```

Seed: 111

Execution Time: 00:25 (hh:mm)

Nb of EvoSuite Tests:34

Nb of Contradiction Tests:4

Nb of Removed Tests:4


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
x1 < 100
```

Seed: 113

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Contradiction Tests:2

Nb of Removed Tests:2


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
x0 <= 100
```

Seed: 120

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:34

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
x1 <= 100
```

Seed: 128

Execution Time: 00:25 (hh:mm)

Nb of EvoSuite Tests:34

Nb of Contradiction Tests:3

Nb of Removed Tests:3


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
x0 < 100
```

Seed: 135

Execution Time: 00:18 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
-1 <= delta
```

Seed: 143

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
(!(100 <= x1)) || (r3 < tolerance)
```

Seed: 150

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
x0 <= 100
```

Seed: 153

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Contradiction Tests:2

Nb of Removed Tests:2


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
!((((0) != (x2)) && (y2 < -1)) || (0 <= -1))
```

Seed: 161

Execution Time: 00:30 (hh:mm)

Nb of EvoSuite Tests:36

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
((-1 < delta) && (!(oldDelta == delta))) || (oldDelta == delta)
```

Seed: 166

Execution Time: 00:30 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
x1 <= 100
```

Seed: 173

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
x1 < 100
```

Seed: 180

Execution Time: 00:23 (hh:mm)

Nb of EvoSuite Tests:34

Nb of Contradiction Tests:3

Nb of Removed Tests:3


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
x0 <= 100
```

Seed: 181

Execution Time: 00:25 (hh:mm)

Nb of EvoSuite Tests:34

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
(!((delta < -1) && (f!=null))) || (1 <= tolerance)
```

Seed: 186

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Contradiction Tests:2

Nb of Removed Tests:2


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math.analysis.solvers.BrentSolver : 282

Patch type: PRECONDITION

```Java
!((i <= y1) && ((0) != (x2)))
```

Seed: 193

Execution Time: 00:31 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:25 (hh:mm)

Average Nb of EvoSuite Tests:33.8

Average Nb of Contradiction Tests:1.63

Average Nb of Removed Tests:1.63

Running Nopol+UnsatGuided changes the original patch for 28 of the 30 seeds. The human patch adds an if condition with a large code block inside the method stepAccepted, the original patch and the newly generated patches by running Nopol+UnsatGuided add a precondition to the same statement, we think they are incorrect.