
## Human Patch 

```Java
diff --git a/src/java/org/apache/commons/lang/time/DateUtils.java b/src/java/org/apache/commons/lang/time/DateUtils.java
index e5138b5..0dd0ded 100644
--- a/src/java/org/apache/commons/lang/time/DateUtils.java
+++ b/src/java/org/apache/commons/lang/time/DateUtils.java
@@ -640,18 +640,18 @@ public class DateUtils {
         int millisecs = val.get(Calendar.MILLISECOND);
         if (!round || millisecs < 500) {
             time = time - millisecs;
+        }
         if (field == Calendar.SECOND) {
             done = true;
-            }
         }
 
         // truncate seconds
         int seconds = val.get(Calendar.SECOND);
         if (!done && (!round || seconds < 30)) {
             time = time - (seconds * 1000L);
+        }
         if (field == Calendar.MINUTE) {
             done = true;
-            }
         }
 
         // truncate minutes

```


## Original Patch # Nopol 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
!((15 < seconds) && (round))
```

Execution Time: 00:01 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
(!(round)) || ((round) && (seconds < 12))
```

Seed: 4

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:106

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
(!(round)) || ((seconds < 12) && (round))
```

Seed: 12

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:92

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
(seconds < 15) || ((!(round)) && (!(round)))
```

Seed: 18

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:103

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
(seconds <= 12) || (!(round))
```

Seed: 26

Execution Time: 00:03 (hh:mm)

Nb of EvoSuite Tests:100

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
(seconds < 15) || (!(round))
```

Seed: 28

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:96

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
(!(round)) || (seconds < 12)
```

Seed: 35

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:104

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
!((15 <= seconds) && (round))
```

Seed: 41

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:97

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
!((round) && ((12 < seconds) || (12 <= org.apache.commons.lang.time.DateUtils.fields.length)))
```

Seed: 54

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:91

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
(!(round)) || (seconds <= 15)
```

Seed: 60

Execution Time: 00:02 (hh:mm)

Nb of EvoSuite Tests:91

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
(seconds < 12) || (!(round))
```

Seed: 66

Execution Time: 00:03 (hh:mm)

Nb of EvoSuite Tests:103

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
(seconds < 12) || (!(round))
```

Seed: 75

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:96

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
!((15 < seconds) && (round))
```

Seed: 83

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:98

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
(!(round)) || (seconds <= 12)
```

Seed: 98

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:103

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
!((15 < seconds) && (round))
```

Seed: 100

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:95

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
(seconds <= 12) || ((!(round)) && (date!=null))
```

Seed: 104

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:107

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
!((round) && (12 < seconds))
```

Seed: 111

Execution Time: 00:03 (hh:mm)

Nb of EvoSuite Tests:102

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
(seconds <= 12) || (!(round))
```

Seed: 113

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:97

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
!((12 <= seconds) && (round))
```

Seed: 120

Execution Time: 00:03 (hh:mm)

Nb of EvoSuite Tests:99

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
(!(round)) || (seconds <= 15)
```

Seed: 128

Execution Time: 00:03 (hh:mm)

Nb of EvoSuite Tests:89

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
(seconds < 15) || (!(round))
```

Seed: 135

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:101

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
(!(round)) || (seconds <= 15)
```

Seed: 143

Execution Time: 00:03 (hh:mm)

Nb of EvoSuite Tests:99

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
!((15 <= seconds) && (round))
```

Seed: 150

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:99

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
(!(round)) || (seconds < 15)
```

Seed: 153

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:99

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
!((15 < seconds) && (round))
```

Seed: 161

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:102

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
(!((round) && (15 <= seconds))) || (time < 280000000)
```

Seed: 166

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:92

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
!(((org.apache.commons.lang.time.DateUtils.SEMI_MONTH <= 5) || (15 < seconds)) && (round))
```

Seed: 173

Execution Time: 00:02 (hh:mm)

Nb of EvoSuite Tests:94

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
(seconds <= 12) || (!(round))
```

Seed: 180

Execution Time: 00:01 (hh:mm)

Nb of EvoSuite Tests:94

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
!((round) && (12 < seconds))
```

Seed: 181

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:96

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
!((15 < seconds) && (round))
```

Seed: 186

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:97

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DateUtils : 666

Patch type: PRECONDITION

```Java
!((15 < seconds) && (round))
```

Seed: 193

Execution Time: 00:00 (hh:mm)

Nb of EvoSuite Tests:88

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:01 (hh:mm)

Average Nb of EvoSuite Tests:97.67

Average Nb of Removed Tests:0

Running Nopol+UnsatGuided changes the original patch for 26 of the 30 seeds. The human patch involves changes to two if structures, the original patch and newly generated patches by running Nopol+UnsatGuided all add a precondition to the same statement, we think they are incorrect.
