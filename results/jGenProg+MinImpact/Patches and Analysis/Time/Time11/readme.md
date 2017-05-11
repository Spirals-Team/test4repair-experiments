
##Human Patch 

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


## Patch Original jGenProg 

org.joda.time.tz.DateTimeZoneBuilder:1460

Patch type: RemoveOp 
 
```Java
remove
```

Execution Time: 0:01 (hh:mm)


--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 2 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 1

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 3 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 4 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ("UTC".equalsIgnoreCase(id)) {
	return org.joda.time.DateTimeZone.UTC;
} 

```


Seed: 1

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 5 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 1

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 6 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 7 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 424

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 1

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 8 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 1

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 9 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 10 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 1

Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 11 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 12 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1394

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 1

Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 13 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 1

Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 14 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 15 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 1

Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 16 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 1

Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 17 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (tailZone != null) {
	break;
} 

```


Seed: 1

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 18 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 2

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 19 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear()

```


Seed: 2

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 20 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 2

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 21 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 2

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 22 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Seed: 2

Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 23 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 2

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 24 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 2

Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 25 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 310

Patch type: InsertBeforeOp

```Java

if (fromYear <= toYear) {
	org.joda.time.tz.DateTimeZoneBuilder.OfYear ofYear = new org.joda.time.tz.DateTimeZoneBuilder.OfYear(mode , monthOfYear , dayOfMonth , dayOfWeek , advanceDayOfWeek , millisOfDay);
	org.joda.time.tz.DateTimeZoneBuilder.Recurrence recurrence = new org.joda.time.tz.DateTimeZoneBuilder.Recurrence(ofYear , nameKey , saveMillis);
	org.joda.time.tz.DateTimeZoneBuilder.Rule rule = new org.joda.time.tz.DateTimeZoneBuilder.Rule(recurrence , fromYear , toYear);
	getLastRuleSet().addRule(rule);
} 

```


Seed: 2

Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 26 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Seed: 2

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 27 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1143

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 2

Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 28 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 2

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 29 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1043

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 2

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 1



## Patch 30 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 428

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 2

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 2



## Patch 31 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1434

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 2

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 2



## Patch 32 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1417

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 2

Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 2



## Patch 33 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 846

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 2

Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 2



## Patch 34 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1426

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 2

Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 2



## Patch 35 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 320

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 2

Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 6


--- 


## Patch 36 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 3

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 37 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 406

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 3

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 38 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 3

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 39 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 3

Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 40 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 3

Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 41 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 3

Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 42 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 3

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 43 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 3

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 44 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 3

Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 45 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 845

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 3

Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 46 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 379

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 3

Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 47 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC())

```


Seed: 3

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 48 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Seed: 3

Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 49 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 3

Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 50 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 51 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 418

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 4

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 52 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 53 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 54 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 55 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 4

Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 56 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 410

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 4

Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 57 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1430

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 4

Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 58 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1082

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 4

Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 59 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 4

Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 60 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (addTransition(transitions, next)) {
	if (tailZone != null) {
		break;
	} 
} 

```


Seed: 4

Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 61 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 4

Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 62 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 63 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 64 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 985

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 4

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 65 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 4

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 66 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 67 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 4

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 68 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 4

Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 69 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 4

Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 70 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 4

Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 71 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 4

Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 72 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 4

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 73 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 333

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 5

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 74 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 5

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 75 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 252

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 5

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 76 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1420

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 5

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 77 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 5

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 78 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 79 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((transitions.size()) == 0) {
	if (tailZone != null) {
		return tailZone;
	} 
	return org.joda.time.tz.DateTimeZoneBuilder.buildFixedZone(id, "UTC", 0, 0);
} 

```


Seed: 5

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 80 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 772

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 5

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 81 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: ReplaceOp

```Java

return null

```


Seed: 5

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 82 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 83 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 5

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 84 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 85 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 86 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 87 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 88 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1042

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 5

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 89 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 90 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 5

Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 91 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 268

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 5

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 92 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 93 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 94 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 6

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 95 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 96 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 6

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 97 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 6

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 98 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 6

Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 99 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 100 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 101 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 6

Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 102 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1101

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 6

Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 103 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((iRuleSets.size()) == 0) {
	addCutover(java.lang.Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
} 

```


Seed: 6

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 104 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 312

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 6

Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 105 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 106 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 6

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 107 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((iRuleSets.size()) == 0) {
	addCutover(java.lang.Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
} 

```


Seed: 7

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 108 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 109 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 7

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 110 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 985

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 7

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 111 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 112 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1042

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 7

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 113 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 339

Patch type: InsertAfterOp

```Java

iRuleSets.add(new org.joda.time.tz.DateTimeZoneBuilder.RuleSet())

```


Seed: 7

Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 114 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 339

Patch type: InsertBeforeOp

```Java

iRuleSets.add(new org.joda.time.tz.DateTimeZoneBuilder.RuleSet())

```


Seed: 7

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 115 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 7

Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 116 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 117 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 118 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1396

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 7

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 119 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 7

Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 120 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 995

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 7

Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 121 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 7

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 122 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1142

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 7

Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 123 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 351

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 7

Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 124 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 125 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 126 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

millis = next.getMillis()

```


Seed: 7

Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 127 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 128 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 424

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 7

Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 129 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC())

```


Seed: 7

Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 130 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 131 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 843

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 8

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 132 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 8

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 133 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (((transitions.size()) == 1) && (tailZone == null)) {
	org.joda.time.tz.DateTimeZoneBuilder.Transition tr = transitions.get(0);
	return org.joda.time.tz.DateTimeZoneBuilder.buildFixedZone(id, tr.getNameKey(), tr.getWallOffset(), tr.getStandardOffset());
} 

```


Seed: 8

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 134 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 135 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 761

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 8

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 136 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1124

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 8

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 137 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 8

Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 138 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1143

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 8

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 139 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1142

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 8

Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 140 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1428

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 8

Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 141 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 142 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 8

Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 143 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 144 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 8

Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 145 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 8

Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 146 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 8

Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 147 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 8

Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 148 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 149 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 150 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (next == null) {
	continue;
} 

```


Seed: 8

Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 151 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 152 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 153 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 154 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 9

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 155 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 156 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 9

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 157 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 849

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 9

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 158 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 159 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 160 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 9

Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 161 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1011

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 9

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 162 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 9

Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 163 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 164 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 343

Patch type: InsertAfterOp

```Java

iRuleSets.add(new org.joda.time.tz.DateTimeZoneBuilder.RuleSet())

```


Seed: 9

Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 165 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 9

Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 166 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1429

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 9

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 167 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 9

Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 168 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 169 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 419

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 9

Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 170 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 846

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 9

Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 171 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 9

Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 172 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 9

Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 173 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 174 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 10

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 175 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 10

Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 176 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 10

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 177 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Seed: 10

Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 178 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 10

Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 179 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 310

Patch type: InsertBeforeOp

```Java

if (fromYear <= toYear) {
	org.joda.time.tz.DateTimeZoneBuilder.OfYear ofYear = new org.joda.time.tz.DateTimeZoneBuilder.OfYear(mode , monthOfYear , dayOfMonth , dayOfWeek , advanceDayOfWeek , millisOfDay);
	org.joda.time.tz.DateTimeZoneBuilder.Recurrence recurrence = new org.joda.time.tz.DateTimeZoneBuilder.Recurrence(ofYear , nameKey , saveMillis);
	org.joda.time.tz.DateTimeZoneBuilder.Rule rule = new org.joda.time.tz.DateTimeZoneBuilder.Rule(recurrence , fromYear , toYear);
	getLastRuleSet().addRule(rule);
} 

```


Seed: 10

Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 180 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 10

Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 181 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

rs = new org.joda.time.tz.DateTimeZoneBuilder.RuleSet(rs)

```


Seed: 10

Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 182 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 364

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 10

Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 183 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 10

Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 184 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 10

Execution Time: 2:02 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 185 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 186 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 187 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 188 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 11

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 189 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 190 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

saveMillis = next.getSaveMillis()

```


Seed: 11

Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 191 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 192 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 193 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 11

Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 194 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 11

Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 195 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 196 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1421

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 11

Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 197 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1132

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 11

Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 198 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 827

Patch type: ReplaceOp

```Java

return java.lang.Integer.MIN_VALUE

```


Seed: 11

Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 199 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 200 #  jGenProg+MinImpact 

org.joda.time.tz.ZoneInfoCompiler : 78

Patch type: ReplaceOp

```Java

return true

```


Seed: 11

Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 2



## Patch 201 #  jGenProg+MinImpact 

org.joda.time.tz.ZoneInfoCompiler : 78

Patch type: ReplaceOp

```Java

return false

```


Seed: 11

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 3


--- 


## Patch 202 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1032

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 12

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 203 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 12

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 204 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 12

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 205 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Seed: 12

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 206 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

millis = next.getMillis()

```


Seed: 12

Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 207 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 12

Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 208 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 12

Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 209 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 12

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 210 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Seed: 12

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 211 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 12

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 212 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 12

Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 213 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 12

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 214 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1066

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 12

Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 215 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1390

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 12

Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 216 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ("UTC".equalsIgnoreCase(id)) {
	return org.joda.time.DateTimeZone.UTC;
} 

```


Seed: 12

Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 217 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 12

Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 218 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1049

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 12

Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 219 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 316

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 12

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 220 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 12

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 221 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

saveMillis = next.getSaveMillis()

```


Seed: 12

Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 222 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 223 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 843

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 13

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 224 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 867

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 13

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 225 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 226 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 227 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 228 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 229 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 418

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 13

Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 230 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 13

Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 231 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 339

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 13

Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 232 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 233 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 13

Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 234 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 235 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear()

```


Seed: 13

Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 236 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

rs = new org.joda.time.tz.DateTimeZoneBuilder.RuleSet(rs)

```


Seed: 13

Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 237 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 13

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 238 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 13

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 239 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 240 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 14

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 241 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 242 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 14

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 243 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 244 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 343

Patch type: InsertBeforeOp

```Java

iRuleSets.add(new org.joda.time.tz.DateTimeZoneBuilder.RuleSet())

```


Seed: 14

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 245 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 246 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 247 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 248 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 249 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 14

Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 250 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1026

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 14

Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 251 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1433

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 14

Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 252 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

rs = new org.joda.time.tz.DateTimeZoneBuilder.RuleSet(rs)

```


Seed: 14

Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 253 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear()

```


Seed: 14

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 254 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 14

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 255 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1399

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 14

Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 256 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 14

Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 257 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 14

Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 258 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 863

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 14

Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 259 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 15

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 260 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 261 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 15

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 262 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 263 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 264 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1396

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 15

Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 265 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 266 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

saveMillis = next.getSaveMillis()

```


Seed: 15

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 267 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 339

Patch type: InsertBeforeOp

```Java

iRuleSets.add(new org.joda.time.tz.DateTimeZoneBuilder.RuleSet())

```


Seed: 15

Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 268 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 269 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 270 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 418

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 15

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 271 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 272 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC())

```


Seed: 15

Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 273 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 15

Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 274 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 15

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 275 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1420

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 15

Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 276 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 995

Patch type: InsertBeforeOp

```Java

if (!(iRules.contains(rule))) {
	iRules.add(rule);
} 

```


Seed: 15

Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 277 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 278 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 279 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1409

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 16

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 280 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 281 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 282 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 283 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 284 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1390

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 16

Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 285 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 16

Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 286 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 287 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((iRuleSets.size()) == 0) {
	addCutover(java.lang.Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
} 

```


Seed: 16

Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 288 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 16

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 289 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1418

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 16

Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 290 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

rs = new org.joda.time.tz.DateTimeZoneBuilder.RuleSet(rs)

```


Seed: 16

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 291 #  jGenProg+MinImpact 

org.joda.time.tz.ZoneInfoCompiler : 78

Patch type: ReplaceOp

```Java

return true

```


Seed: 16

Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 292 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 17

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 293 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 294 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 295 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 17

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 296 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 297 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 370

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 17

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 298 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 356

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 17

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 299 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (next == null) {
	continue;
} 

```


Seed: 17

Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 300 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 17

Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 301 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 302 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 910

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 17

Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 303 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 866

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 17

Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 304 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 17

Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 305 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 306 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 307 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 308 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 17

Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 309 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (((transitions.size()) == 1) && (tailZone == null)) {
	org.joda.time.tz.DateTimeZoneBuilder.Transition tr = transitions.get(0);
	return org.joda.time.tz.DateTimeZoneBuilder.buildFixedZone(id, tr.getNameKey(), tr.getWallOffset(), tr.getStandardOffset());
} 

```


Seed: 17

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 310 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1407

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 17

Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 311 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 312 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1132

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 18

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 313 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 314 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 315 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 316 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 419

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 18

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 317 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 318 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (tailZone != null) {
	return tailZone;
} 

```


Seed: 18

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 319 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1397

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 18

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 320 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 18

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 321 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 863

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 18

Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 322 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 914

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 18

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 323 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (addTransition(transitions, next)) {
	if (tailZone != null) {
		break;
	} 
} 

```


Seed: 18

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 324 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 325 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 18

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 326 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 327 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 328 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 18

Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 329 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 330 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 18

Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 331 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((transitions.size()) == 0) {
	if (tailZone != null) {
		return tailZone;
	} 
	return org.joda.time.tz.DateTimeZoneBuilder.buildFixedZone(id, "UTC", 0, 0);
} 

```


Seed: 18

Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 332 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1105

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 18

Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 333 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 339

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 19

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 334 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Seed: 19

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 335 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (((transitions.size()) == 1) && (tailZone == null)) {
	org.joda.time.tz.DateTimeZoneBuilder.Transition tr = transitions.get(0);
	return org.joda.time.tz.DateTimeZoneBuilder.buildFixedZone(id, tr.getNameKey(), tr.getWallOffset(), tr.getStandardOffset());
} 

```


Seed: 19

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 336 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 19

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 337 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 19

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 338 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 19

Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 339 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

rs = new org.joda.time.tz.DateTimeZoneBuilder.RuleSet(rs)

```


Seed: 19

Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 340 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Seed: 19

Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 341 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Seed: 19

Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 342 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 19

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 343 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 19

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 344 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 19

Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 345 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1085

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 19

Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 346 #  jGenProg+MinImpact 

org.joda.time.tz.ZoneInfoCompiler : 78

Patch type: ReplaceOp

```Java

return true

```


Seed: 19

Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 347 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 351

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 20

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 348 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 349 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (addTransition(transitions, next)) {
	if (tailZone != null) {
		break;
	} 
} 

```


Seed: 20

Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 350 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 351 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 352 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 353 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1436

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 20

Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 354 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 355 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 352

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 20

Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 356 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 20

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 357 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 358 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 20

Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 359 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 252

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 20

Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 360 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 865

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 20

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 361 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 309

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 20

Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 362 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1026

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 20

Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 363 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

saveMillis = next.getSaveMillis()

```


Seed: 20

Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 364 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 21

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 365 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 21

Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 366 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (tailZone != null) {
	return tailZone;
} 

```


Seed: 21

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 367 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 21

Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 368 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 21

Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 369 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 21

Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 370 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 21

Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 371 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 21

Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 372 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Seed: 21

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 373 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 349

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 22

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 374 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 932

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 22

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 375 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 22

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 376 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Seed: 22

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 377 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Seed: 22

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 378 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 22

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 379 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 22

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 380 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 22

Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 381 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 22

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 382 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 22

Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 383 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1066

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 22

Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 384 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 390

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 22

Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 385 #  jGenProg+MinImpact 

org.joda.time.tz.ZoneInfoCompiler : 78

Patch type: ReplaceOp

```Java

return true

```


Seed: 22

Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 386 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 23

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 387 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (tailZone != null) {
	break;
} 

```


Seed: 23

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 388 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 389 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 390 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 391 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 392 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 393 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 827

Patch type: ReplaceOp

```Java

return iFromYear

```


Seed: 23

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 394 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 395 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 23

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 396 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Seed: 23

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 397 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 398 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 399 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (next == null) {
	continue;
} 

```


Seed: 23

Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 400 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 343

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 23

Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 401 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 402 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 403 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 404 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Seed: 24

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 405 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1026

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 24

Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 406 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 24

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 407 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear()

```


Seed: 24

Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 408 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 409 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Seed: 24

Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 410 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC())

```


Seed: 24

Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 411 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Seed: 24

Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 412 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

saveMillis = next.getSaveMillis()

```


Seed: 24

Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 413 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 333

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 24

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 414 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 415 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 416 #  jGenProg+MinImpact 

org.joda.time.tz.DateTimeZoneBuilder : 352

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Seed: 24

Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 417 #  jGenProg+MinImpact 

org.joda.time.tz.ZoneInfoCompiler : 78

Patch type: ReplaceOp

```Java

return true

```


Seed: 24

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 61

Nb of Failing EvoSuite Tests: 1



## Patch 418 #  jGenProg+MinImpact 

org.joda.time.tz.ZoneInfoCompiler : 78

Patch type: ReplaceOp

```Java

return false

```


Seed: 24

Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 61

Nb of Failing EvoSuite Tests: 1


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 46.59

Average Nb of Failing EvoSuite Tests: 0.09

Average Nb of Test-adequate patches: 17.42

Running jGenProg + MinImpact changes the original patch for 26 of the 30 seeds. The human patch forces the initialization of a thread that throws an exception, the orginal patch and the newly generated patches by running jGenProg + MinImpact seem to be irrevlant to the human change, we think they just make the failing test pass and are incorrect. Note for some seeds, running jGenProg does not generate a single patch, so the approach MinImpact is not used.

---
