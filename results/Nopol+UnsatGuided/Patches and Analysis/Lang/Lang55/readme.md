
## Human Patch 

```Java
diff --git a/src/java/org/apache/commons/lang/time/StopWatch.java b/src/java/org/apache/commons/lang/time/StopWatch.java
index 0f0786a..8f39421 100644
--- a/src/java/org/apache/commons/lang/time/StopWatch.java
+++ b/src/java/org/apache/commons/lang/time/StopWatch.java
@@ -115,9 +115,7 @@ public class StopWatch {
         if(this.runningState != STATE_RUNNING && this.runningState != STATE_SUSPENDED) {
             throw new IllegalStateException("Stopwatch is not running. ");
         }
+        if(this.runningState == STATE_RUNNING) {
             stopTime = System.currentTimeMillis();
+        }
         this.runningState = STATE_STOPPED;
     }
 

```


## Original Patch # Nopol 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
(org.apache.commons.lang.time.StopWatch.STATE_SUSPENDED) != (org.apache.commons.lang.time.StopWatch.this.runningState)
```

Execution Time: 00:01 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 4

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:20

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 12

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:1


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 18

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:20

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 26

Execution Time: 00:13 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 28

Execution Time: 00:14 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 35

Execution Time: 00:13 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 41

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:20

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 54

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:20

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 60

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:19

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 66

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:20

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 75

Execution Time: 00:13 (hh:mm)

Nb of EvoSuite Tests:20

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 83

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:20

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 98

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:20

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 100

Execution Time: 00:13 (hh:mm)

Nb of EvoSuite Tests:20

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 104

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:20

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 111

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:19

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 113

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 120

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:19

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 128

Execution Time: 00:13 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 135

Execution Time: 00:13 (hh:mm)

Nb of EvoSuite Tests:20

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 143

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:20

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 150

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 153

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 161

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 166

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:20

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 173

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:18

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 180

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:19

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 181

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:20

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 186

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:20

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.lang.time.StopWatch : 118

Patch type: PRECONDITION

```Java
org.apache.commons.lang.time.StopWatch.this.stopTime <= org.apache.commons.lang.time.StopWatch.this.startTime
```

Seed: 193

Execution Time: 00:14 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:12 (hh:mm)

Average Nb of EvoSuite Tests:20.17

Average Nb of Removed Tests:0.03

Running Nopol+UnsatGuided changes the original patch for each of the 30 seeds. The human adds a precondition before the assignment, both the original patch and the newly generated patches also add a precondition to the buggy statement, and the precondition is semantically equivalent to the precondition added by human developer.
