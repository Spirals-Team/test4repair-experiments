
## Human Patch 

```Java
diff --git a/src/main/java/org/joda/time/tz/ZoneInfoCompiler.java b/src/main/java/org/joda/time/tz/ZoneInfoCompiler.java
index 64da5ea..6efe071 100644
--- a/src/main/java/org/joda/time/tz/ZoneInfoCompiler.java
+++ b/src/main/java/org/joda/time/tz/ZoneInfoCompiler.java
@@ -65,11 +65,10 @@ public class ZoneInfoCompiler {
 
     static Chronology cLenientISO;
 
+    static ThreadLocal<Boolean> cVerbose = new ThreadLocal<Boolean>() {
+        protected Boolean initialValue() {
+            return Boolean.FALSE;
+        }
+    };
-    static ThreadLocal<Boolean> cVerbose = new ThreadLocal<Boolean>();
-    static {
-        cVerbose.set(Boolean.FALSE);
-    }
 
     /**
      * Gets a flag indicating that verbose logging is required.

```


## Original Patch # Nopol 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Execution Time: 00:04 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 4

Execution Time: 01:24 (hh:mm)

Nb of EvoSuite Tests:53

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 12

Execution Time: 01:32 (hh:mm)

Nb of EvoSuite Tests:53

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 18

Execution Time: 01:15 (hh:mm)

Nb of EvoSuite Tests:51

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 26

Execution Time: 01:45 (hh:mm)

Nb of EvoSuite Tests:50

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 28

Execution Time: 01:15 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 35

Execution Time: 01:37 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 41

Execution Time: 01:40 (hh:mm)

Nb of EvoSuite Tests:53

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 54

Execution Time: 01:31 (hh:mm)

Nb of EvoSuite Tests:50

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 60

Execution Time: 01:56 (hh:mm)

Nb of EvoSuite Tests:53

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 66

Execution Time: 01:31 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 75

Execution Time: 02:04 (hh:mm)

Nb of EvoSuite Tests:54

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 83

Execution Time: 01:54 (hh:mm)

Nb of EvoSuite Tests:50

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 98

Execution Time: 01:16 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 100

Execution Time: 02:13 (hh:mm)

Nb of EvoSuite Tests:54

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 104

Execution Time: 02:01 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 111

Execution Time: 01:30 (hh:mm)

Nb of EvoSuite Tests:53

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 113

Execution Time: 02:07 (hh:mm)

Nb of EvoSuite Tests:57

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 120

Execution Time: 01:31 (hh:mm)

Nb of EvoSuite Tests:39

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 128

Execution Time: 01:55 (hh:mm)

Nb of EvoSuite Tests:54

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 135

Execution Time: 01:40 (hh:mm)

Nb of EvoSuite Tests:51

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 143

Execution Time: 01:21 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 150

Execution Time: 01:40 (hh:mm)

Nb of EvoSuite Tests:51

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 153

Execution Time: 01:02 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 161

Execution Time: 01:40 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 166

Execution Time: 01:26 (hh:mm)

Nb of EvoSuite Tests:54

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 173

Execution Time: 01:28 (hh:mm)

Nb of EvoSuite Tests:50

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 180

Execution Time: 01:28 (hh:mm)

Nb of EvoSuite Tests:55

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 181

Execution Time: 01:47 (hh:mm)

Nb of EvoSuite Tests:53

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 186

Execution Time: 01:10 (hh:mm)

Nb of EvoSuite Tests:50

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: PRECONDITION

```Java
(id.length()) != (8)
```

Seed: 193

Execution Time: 01:47 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 01:37 (hh:mm)

Average Nb of EvoSuite Tests:49.9

Average Nb of Contradiction Tests:0

Average Nb of Removed Tests:0

Running Nopol+UnsatGuided does not changes the original patch for any of the 30 seeds. The human patch forces the initialization of a thread that throws an exception, the generated patch adds a precondition before a statement, we think it is incorrect.