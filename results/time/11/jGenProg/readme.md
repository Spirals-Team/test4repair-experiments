#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//time/ project time
##Original Patch 

```Java
diff --git a/src/main/java/org/joda/time/tz/ZoneInfoCompiler.java b/src/main/java/org/joda/time/tz/ZoneInfoCompiler.java
index 64da5ea..6efe071 100644
--- a/src/main/java/org/joda/time/tz/ZoneInfoCompiler.java
+++ b/src/main/java/org/joda/time/tz/ZoneInfoCompiler.java
@@ -65,11 +65,10 @@ public class ZoneInfoCompiler {
 
     static Chronology cLenientISO;
 
-    static ThreadLocal<Boolean> cVerbose = new ThreadLocal<Boolean>() {
-        protected Boolean initialValue() {
-            return Boolean.FALSE;
-        }
-    };
+    static ThreadLocal<Boolean> cVerbose = new ThreadLocal<Boolean>();
+    static {
+        cVerbose.set(Boolean.FALSE);
+    }
 
     /**
      * Gets a flag indicating that verbose logging is required.
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 48


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 51


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 44


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

org.joda.time.tz.DateTimeZoneBuilder : 333

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 51


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 54


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((iRuleSets.size()) == 0) {
	addCutover(java.lang.Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
} 

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 48


--- 
#Seed: 9

## Patch 9 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 51


--- 
#Seed: 10

## Patch 10 #  jGenProg+MinImpact With Seed 10

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45


--- 
#Seed: 11

## Patch 11 #  jGenProg+MinImpact With Seed 11

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 45


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 1032

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 44


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 38


--- 
#Seed: 15

## Patch 15 #  jGenProg+MinImpact With Seed 15

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 47


--- 
#Seed: 16

## Patch 16 #  jGenProg+MinImpact With Seed 16

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 53


--- 
#Seed: 17

## Patch 17 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 40


--- 
#Seed: 18

## Patch 18 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 1132

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 40


--- 
#Seed: 19

## Patch 19 #  jGenProg+MinImpact With Seed 19

org.joda.time.tz.DateTimeZoneBuilder : 339

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 48


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

org.joda.time.tz.DateTimeZoneBuilder : 351

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 53


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 43


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

org.joda.time.tz.DateTimeZoneBuilder : 349

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 54


--- 
#Seed: 23

## Patch 23 #  jGenProg+MinImpact With Seed 23

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 46


--- 
#Seed: 24

## Patch 24 #  jGenProg+MinImpact With Seed 24

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 42


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 47.76

Average Nb of Failing EvoSuite Tests: 0.06

---