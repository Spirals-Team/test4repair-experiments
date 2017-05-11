
## Human Patch 

```Java
diff --git a/src/java/org/apache/commons/lang/time/DurationFormatUtils.java b/src/java/org/apache/commons/lang/time/DurationFormatUtils.java
index 3a9d9f6..127b927 100644
--- a/src/java/org/apache/commons/lang/time/DurationFormatUtils.java
+++ b/src/java/org/apache/commons/lang/time/DurationFormatUtils.java
@@ -303,20 +303,25 @@ public class DurationFormatUtils {
             days -= 1;
         }
         while (days < 0) {
+            end.add(Calendar.MONTH, -1);
+            days += end.getActualMaximum(Calendar.DAY_OF_MONTH);
-            days += 31;
 //days += 31; // TODO: Need tests to show this is bad and the new code is good.
 // HEN: It's a tricky subject. Jan 15th to March 10th. If I count days-first it is 
 // 1 month and 26 days, but if I count month-first then it is 1 month and 23 days.
 // Also it's contextual - if asked for no M in the format then I should probably 
 // be doing no calculating here.
             months -= 1;
+            end.add(Calendar.MONTH, 1);
         }
         while (months < 0) {
             months += 12;
             years -= 1;
         }
-        milliseconds -= reduceAndCorrect(start, end, Calendar.MILLISECOND, milliseconds);
-        seconds -= reduceAndCorrect(start, end, Calendar.SECOND, seconds);
-        minutes -= reduceAndCorrect(start, end, Calendar.MINUTE, minutes);
-        hours -= reduceAndCorrect(start, end, Calendar.HOUR_OF_DAY, hours);
-        days -= reduceAndCorrect(start, end, Calendar.DAY_OF_MONTH, days);
-        months -= reduceAndCorrect(start, end, Calendar.MONTH, months);
-        years -= reduceAndCorrect(start, end, Calendar.YEAR, years);
 
         // This next block of code adds in values that 
         // aren't requested. This allows the user to ask for the 
@@ -424,6 +429,18 @@ public class DurationFormatUtils {
         }
         return buffer.toString();
     }
-    static int reduceAndCorrect(Calendar start, Calendar end, int field, int difference) {
-        end.add( field, -1 * difference );
-        int endValue = end.get(field);
-        int startValue = start.get(field);
-        if (endValue < startValue) {
-            int newdiff = startValue - endValue;
-            end.add( field, newdiff );
-            return newdiff;
-        } else {
-            return 0;
-        }
-    }
 
     static final Object y = "y";
     static final Object M = "M";

```


## Original Patch # Nopol 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
(years) != (milliseconds)
```

Execution Time: 00:01 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
(seconds) != (years)
```

Seed: 4

Execution Time: 00:38 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis <= millis
```

Seed: 12

Execution Time: 00:38 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis <= millis
```

Seed: 18

Execution Time: 00:38 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis <= millis
```

Seed: 26

Execution Time: 00:37 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis < millis
```

Seed: 28

Execution Time: 00:36 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
(years) != (milliseconds)
```

Seed: 35

Execution Time: 00:04 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Contradiction Tests:30

Nb of Removed Tests:33


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
days <= format.length()
```

Seed: 41

Execution Time: 00:30 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis <= millis
```

Seed: 54

Execution Time: 00:33 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis < millis
```

Seed: 60

Execution Time: 00:36 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis <= millis
```

Seed: 66

Execution Time: 00:30 (hh:mm)

Nb of EvoSuite Tests:43

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis <= millis
```

Seed: 75

Execution Time: 00:35 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis <= millis
```

Seed: 83

Execution Time: 00:31 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis <= millis
```

Seed: 98

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:43

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis < millis
```

Seed: 100

Execution Time: 00:33 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis < millis
```

Seed: 104

Execution Time: 00:34 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis <= millis
```

Seed: 111

Execution Time: 00:30 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis < millis
```

Seed: 113

Execution Time: 00:29 (hh:mm)

Nb of EvoSuite Tests:44

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis < millis
```

Seed: 120

Execution Time: 00:36 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis <= millis
```

Seed: 128

Execution Time: 00:33 (hh:mm)

Nb of EvoSuite Tests:44

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis < millis
```

Seed: 135

Execution Time: 00:31 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis <= millis
```

Seed: 143

Execution Time: 00:29 (hh:mm)

Nb of EvoSuite Tests:41

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis < millis
```

Seed: 150

Execution Time: 00:36 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
(years) != (milliseconds)
```

Seed: 153

Execution Time: 00:38 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis < millis
```

Seed: 161

Execution Time: 00:42 (hh:mm)

Nb of EvoSuite Tests:50

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis < millis
```

Seed: 166

Execution Time: 00:30 (hh:mm)

Nb of EvoSuite Tests:42

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis <= millis
```

Seed: 173

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:44

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis <= millis
```

Seed: 180

Execution Time: 00:37 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis < millis
```

Seed: 181

Execution Time: 00:35 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
days <= format.length()
```

Seed: 186

Execution Time: 00:31 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.lang.time.DurationFormatUtils : 323

Patch type: PRECONDITION

```Java
startMillis < millis
```

Seed: 193

Execution Time: 00:34 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:33 (hh:mm)

Average Nb of EvoSuite Tests:46.1

Average Nb of Contradiction Tests:1

Average Nb of Removed Tests:1.1

Runnning Nopol+UnsatGuided changes the original patch for 27 of the 30 seeds. The human patch involves multiple changes to a class, the original patch and the newly generated patches by running Nopol+UnsatGuided add a precondition to the same statement, we think they are incorrect.