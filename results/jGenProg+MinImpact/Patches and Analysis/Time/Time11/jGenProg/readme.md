
##Original Patch 

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

[org.joda.time.tz.DateTimeZoneBuilder:1460](https://github.com/JodaOrg/joda-time/blob/6d5104753470c130336e319a64009c0553b29c96/src/main/java//org/joda/time/tz/DateTimeZoneBuilder.java#L1460)

Patch type: DELETE 
 
```Java
remove
```

Execution time: 0:01:17.251000

Grid5000 node: graphene-7.nancy.grid5000.fr


--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 2 #  jGenProg+MinImpact With Seed 1

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 3 #  jGenProg+MinImpact With Seed 1

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 4 #  jGenProg+MinImpact With Seed 1

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ("UTC".equalsIgnoreCase(id)) {
	return org.joda.time.DateTimeZone.UTC;
} 

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 5 #  jGenProg+MinImpact With Seed 1

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 6 #  jGenProg+MinImpact With Seed 1

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 7 #  jGenProg+MinImpact With Seed 1

org.joda.time.tz.DateTimeZoneBuilder : 424

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 8 #  jGenProg+MinImpact With Seed 1

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 9 #  jGenProg+MinImpact With Seed 1

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 10 #  jGenProg+MinImpact With Seed 1

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 11 #  jGenProg+MinImpact With Seed 1

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 12 #  jGenProg+MinImpact With Seed 1

org.joda.time.tz.DateTimeZoneBuilder : 1394

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 13 #  jGenProg+MinImpact With Seed 1

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 14 #  jGenProg+MinImpact With Seed 1

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 15 #  jGenProg+MinImpact With Seed 1

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 16 #  jGenProg+MinImpact With Seed 1

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 17 #  jGenProg+MinImpact With Seed 1

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (tailZone != null) {
	break;
} 

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 2

## Patch 18 #  jGenProg+MinImpact With Seed 2

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 19 #  jGenProg+MinImpact With Seed 2

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear()

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 20 #  jGenProg+MinImpact With Seed 2

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 21 #  jGenProg+MinImpact With Seed 2

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 22 #  jGenProg+MinImpact With Seed 2

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 23 #  jGenProg+MinImpact With Seed 2

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 24 #  jGenProg+MinImpact With Seed 2

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 25 #  jGenProg+MinImpact With Seed 2

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


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 26 #  jGenProg+MinImpact With Seed 2

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 27 #  jGenProg+MinImpact With Seed 2

org.joda.time.tz.DateTimeZoneBuilder : 1143

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 28 #  jGenProg+MinImpact With Seed 2

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 29 #  jGenProg+MinImpact With Seed 2

org.joda.time.tz.DateTimeZoneBuilder : 1043

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 1



## Patch 30 #  jGenProg+MinImpact With Seed 2

org.joda.time.tz.DateTimeZoneBuilder : 428

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 2



## Patch 31 #  jGenProg+MinImpact With Seed 2

org.joda.time.tz.DateTimeZoneBuilder : 1434

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 2



## Patch 32 #  jGenProg+MinImpact With Seed 2

org.joda.time.tz.DateTimeZoneBuilder : 1417

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 2



## Patch 33 #  jGenProg+MinImpact With Seed 2

org.joda.time.tz.DateTimeZoneBuilder : 846

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 2



## Patch 34 #  jGenProg+MinImpact With Seed 2

org.joda.time.tz.DateTimeZoneBuilder : 1426

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 2



## Patch 35 #  jGenProg+MinImpact With Seed 2

org.joda.time.tz.DateTimeZoneBuilder : 320

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 6


--- 
#Seed: 3

## Patch 36 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 37 #  jGenProg+MinImpact With Seed 3

org.joda.time.tz.DateTimeZoneBuilder : 406

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 38 #  jGenProg+MinImpact With Seed 3

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 39 #  jGenProg+MinImpact With Seed 3

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 40 #  jGenProg+MinImpact With Seed 3

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 41 #  jGenProg+MinImpact With Seed 3

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 42 #  jGenProg+MinImpact With Seed 3

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 43 #  jGenProg+MinImpact With Seed 3

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 44 #  jGenProg+MinImpact With Seed 3

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 45 #  jGenProg+MinImpact With Seed 3

org.joda.time.tz.DateTimeZoneBuilder : 845

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 46 #  jGenProg+MinImpact With Seed 3

org.joda.time.tz.DateTimeZoneBuilder : 379

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 47 #  jGenProg+MinImpact With Seed 3

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC())

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 48 #  jGenProg+MinImpact With Seed 3

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 49 #  jGenProg+MinImpact With Seed 3

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 4

## Patch 50 #  jGenProg+MinImpact With Seed 4

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 51 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 418

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 52 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 53 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 54 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 55 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 56 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 410

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 57 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 1430

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 58 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 1082

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 59 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 60 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (addTransition(transitions, next)) {
	if (tailZone != null) {
		break;
	} 
} 

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 61 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 62 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 63 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 64 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 985

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 65 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 66 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 67 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 68 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 69 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 70 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 71 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 72 #  jGenProg+MinImpact With Seed 4

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 5

## Patch 73 #  jGenProg+MinImpact With Seed 5

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 333

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 74 #  jGenProg+MinImpact With Seed 5

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 75 #  jGenProg+MinImpact With Seed 5

org.joda.time.tz.DateTimeZoneBuilder : 252

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 76 #  jGenProg+MinImpact With Seed 5

org.joda.time.tz.DateTimeZoneBuilder : 1420

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 77 #  jGenProg+MinImpact With Seed 5

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 78 #  jGenProg+MinImpact With Seed 5

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 79 #  jGenProg+MinImpact With Seed 5

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


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 80 #  jGenProg+MinImpact With Seed 5

org.joda.time.tz.DateTimeZoneBuilder : 772

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 81 #  jGenProg+MinImpact With Seed 5

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: ReplaceOp

```Java

return null

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 82 #  jGenProg+MinImpact With Seed 5

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 83 #  jGenProg+MinImpact With Seed 5

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 84 #  jGenProg+MinImpact With Seed 5

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 85 #  jGenProg+MinImpact With Seed 5

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 86 #  jGenProg+MinImpact With Seed 5

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 87 #  jGenProg+MinImpact With Seed 5

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 88 #  jGenProg+MinImpact With Seed 5

org.joda.time.tz.DateTimeZoneBuilder : 1042

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 89 #  jGenProg+MinImpact With Seed 5

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 90 #  jGenProg+MinImpact With Seed 5

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 91 #  jGenProg+MinImpact With Seed 5

org.joda.time.tz.DateTimeZoneBuilder : 268

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 6

## Patch 92 #  jGenProg+MinImpact With Seed 6

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 93 #  jGenProg+MinImpact With Seed 6

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 94 #  jGenProg+MinImpact With Seed 6

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 95 #  jGenProg+MinImpact With Seed 6

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 96 #  jGenProg+MinImpact With Seed 6

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 97 #  jGenProg+MinImpact With Seed 6

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 98 #  jGenProg+MinImpact With Seed 6

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 99 #  jGenProg+MinImpact With Seed 6

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 100 #  jGenProg+MinImpact With Seed 6

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 101 #  jGenProg+MinImpact With Seed 6

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 102 #  jGenProg+MinImpact With Seed 6

org.joda.time.tz.DateTimeZoneBuilder : 1101

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 103 #  jGenProg+MinImpact With Seed 6

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((iRuleSets.size()) == 0) {
	addCutover(java.lang.Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
} 

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 104 #  jGenProg+MinImpact With Seed 6

org.joda.time.tz.DateTimeZoneBuilder : 312

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 105 #  jGenProg+MinImpact With Seed 6

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 106 #  jGenProg+MinImpact With Seed 6

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 7

## Patch 107 #  jGenProg+MinImpact With Seed 7

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((iRuleSets.size()) == 0) {
	addCutover(java.lang.Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
} 

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 108 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 109 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 110 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 985

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 111 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 112 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 1042

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 113 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 339

Patch type: InsertAfterOp

```Java

iRuleSets.add(new org.joda.time.tz.DateTimeZoneBuilder.RuleSet())

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 114 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 339

Patch type: InsertBeforeOp

```Java

iRuleSets.add(new org.joda.time.tz.DateTimeZoneBuilder.RuleSet())

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 115 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 116 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 117 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 118 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 1396

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 119 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 120 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 995

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 121 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 122 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 1142

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 123 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 351

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 124 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 125 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 126 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

millis = next.getMillis()

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 127 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 128 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 424

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 129 #  jGenProg+MinImpact With Seed 7

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC())

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 8

## Patch 130 #  jGenProg+MinImpact With Seed 8

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 131 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 843

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 132 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 133 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (((transitions.size()) == 1) && (tailZone == null)) {
	org.joda.time.tz.DateTimeZoneBuilder.Transition tr = transitions.get(0);
	return org.joda.time.tz.DateTimeZoneBuilder.buildFixedZone(id, tr.getNameKey(), tr.getWallOffset(), tr.getStandardOffset());
} 

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 134 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 135 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 761

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 136 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 1124

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 137 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 138 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 1143

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 139 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 1142

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 140 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 1428

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 141 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 142 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 143 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 144 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 145 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 146 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 147 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 148 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 149 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 150 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (next == null) {
	continue;
} 

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 151 #  jGenProg+MinImpact With Seed 8

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 9

## Patch 152 #  jGenProg+MinImpact With Seed 9

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 153 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 154 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 155 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 156 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 157 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 849

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 158 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 159 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 160 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 161 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 1011

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 162 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 163 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 164 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 343

Patch type: InsertAfterOp

```Java

iRuleSets.add(new org.joda.time.tz.DateTimeZoneBuilder.RuleSet())

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 165 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 166 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 1429

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 167 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 168 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 169 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 419

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 170 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 846

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 171 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 172 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0



## Patch 173 #  jGenProg+MinImpact With Seed 9

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 51

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 10

## Patch 174 #  jGenProg+MinImpact With Seed 10

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 175 #  jGenProg+MinImpact With Seed 10

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 176 #  jGenProg+MinImpact With Seed 10

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 177 #  jGenProg+MinImpact With Seed 10

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 178 #  jGenProg+MinImpact With Seed 10

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 179 #  jGenProg+MinImpact With Seed 10

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


Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 180 #  jGenProg+MinImpact With Seed 10

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 181 #  jGenProg+MinImpact With Seed 10

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

rs = new org.joda.time.tz.DateTimeZoneBuilder.RuleSet(rs)

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 182 #  jGenProg+MinImpact With Seed 10

org.joda.time.tz.DateTimeZoneBuilder : 364

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 183 #  jGenProg+MinImpact With Seed 10

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 184 #  jGenProg+MinImpact With Seed 10

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 2:02 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 11

## Patch 185 #  jGenProg+MinImpact With Seed 11

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 186 #  jGenProg+MinImpact With Seed 11

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 187 #  jGenProg+MinImpact With Seed 11

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 188 #  jGenProg+MinImpact With Seed 11

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 189 #  jGenProg+MinImpact With Seed 11

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 190 #  jGenProg+MinImpact With Seed 11

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

saveMillis = next.getSaveMillis()

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 191 #  jGenProg+MinImpact With Seed 11

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 192 #  jGenProg+MinImpact With Seed 11

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 193 #  jGenProg+MinImpact With Seed 11

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 194 #  jGenProg+MinImpact With Seed 11

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 195 #  jGenProg+MinImpact With Seed 11

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 196 #  jGenProg+MinImpact With Seed 11

org.joda.time.tz.DateTimeZoneBuilder : 1421

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 197 #  jGenProg+MinImpact With Seed 11

org.joda.time.tz.DateTimeZoneBuilder : 1132

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 198 #  jGenProg+MinImpact With Seed 11

org.joda.time.tz.DateTimeZoneBuilder : 827

Patch type: ReplaceOp

```Java

return java.lang.Integer.MIN_VALUE

```


Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 199 #  jGenProg+MinImpact With Seed 11

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 45

Nb of Failing EvoSuite Tests: 0



## Patch 200 #  jGenProg+MinImpact With Seed 11

org.joda.time.tz.ZoneInfoCompiler : 78

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 2



## Patch 201 #  jGenProg+MinImpact With Seed 11

org.joda.time.tz.ZoneInfoCompiler : 78

Patch type: ReplaceOp

```Java

return false

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 12

## Patch 202 #  jGenProg+MinImpact With Seed 12

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1032

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 203 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 204 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 205 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 206 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

millis = next.getMillis()

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 207 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 208 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 209 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 210 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 211 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 212 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 213 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 214 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 1066

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 215 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 1390

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 216 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ("UTC".equalsIgnoreCase(id)) {
	return org.joda.time.DateTimeZone.UTC;
} 

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 217 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 218 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 1049

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 219 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 316

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 220 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0



## Patch 221 #  jGenProg+MinImpact With Seed 12

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

saveMillis = next.getSaveMillis()

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 44

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 13

## Patch 222 #  jGenProg+MinImpact With Seed 13

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 223 #  jGenProg+MinImpact With Seed 13

org.joda.time.tz.DateTimeZoneBuilder : 843

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 224 #  jGenProg+MinImpact With Seed 13

org.joda.time.tz.DateTimeZoneBuilder : 867

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 225 #  jGenProg+MinImpact With Seed 13

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 226 #  jGenProg+MinImpact With Seed 13

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 227 #  jGenProg+MinImpact With Seed 13

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 228 #  jGenProg+MinImpact With Seed 13

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 229 #  jGenProg+MinImpact With Seed 13

org.joda.time.tz.DateTimeZoneBuilder : 418

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 230 #  jGenProg+MinImpact With Seed 13

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 231 #  jGenProg+MinImpact With Seed 13

org.joda.time.tz.DateTimeZoneBuilder : 339

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 232 #  jGenProg+MinImpact With Seed 13

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 233 #  jGenProg+MinImpact With Seed 13

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 234 #  jGenProg+MinImpact With Seed 13

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 235 #  jGenProg+MinImpact With Seed 13

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear()

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 236 #  jGenProg+MinImpact With Seed 13

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

rs = new org.joda.time.tz.DateTimeZoneBuilder.RuleSet(rs)

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 237 #  jGenProg+MinImpact With Seed 13

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 238 #  jGenProg+MinImpact With Seed 13

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 14

## Patch 239 #  jGenProg+MinImpact With Seed 14

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 240 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 241 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 242 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 243 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 244 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 343

Patch type: InsertBeforeOp

```Java

iRuleSets.add(new org.joda.time.tz.DateTimeZoneBuilder.RuleSet())

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 245 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 246 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 247 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 248 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 249 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 250 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 1026

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 251 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 1433

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 252 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

rs = new org.joda.time.tz.DateTimeZoneBuilder.RuleSet(rs)

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 253 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear()

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 254 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 255 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 1399

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 256 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 257 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0



## Patch 258 #  jGenProg+MinImpact With Seed 14

org.joda.time.tz.DateTimeZoneBuilder : 863

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 38

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 15

## Patch 259 #  jGenProg+MinImpact With Seed 15

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 260 #  jGenProg+MinImpact With Seed 15

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 261 #  jGenProg+MinImpact With Seed 15

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 262 #  jGenProg+MinImpact With Seed 15

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 263 #  jGenProg+MinImpact With Seed 15

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 264 #  jGenProg+MinImpact With Seed 15

org.joda.time.tz.DateTimeZoneBuilder : 1396

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 265 #  jGenProg+MinImpact With Seed 15

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 266 #  jGenProg+MinImpact With Seed 15

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

saveMillis = next.getSaveMillis()

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 267 #  jGenProg+MinImpact With Seed 15

org.joda.time.tz.DateTimeZoneBuilder : 339

Patch type: InsertBeforeOp

```Java

iRuleSets.add(new org.joda.time.tz.DateTimeZoneBuilder.RuleSet())

```


Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 268 #  jGenProg+MinImpact With Seed 15

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 269 #  jGenProg+MinImpact With Seed 15

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 270 #  jGenProg+MinImpact With Seed 15

org.joda.time.tz.DateTimeZoneBuilder : 418

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 271 #  jGenProg+MinImpact With Seed 15

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 272 #  jGenProg+MinImpact With Seed 15

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC())

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 273 #  jGenProg+MinImpact With Seed 15

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 274 #  jGenProg+MinImpact With Seed 15

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 275 #  jGenProg+MinImpact With Seed 15

org.joda.time.tz.DateTimeZoneBuilder : 1420

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0



## Patch 276 #  jGenProg+MinImpact With Seed 15

org.joda.time.tz.DateTimeZoneBuilder : 995

Patch type: InsertBeforeOp

```Java

if (!(iRules.contains(rule))) {
	iRules.add(rule);
} 

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 47

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 16

## Patch 277 #  jGenProg+MinImpact With Seed 16

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 278 #  jGenProg+MinImpact With Seed 16

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 279 #  jGenProg+MinImpact With Seed 16

org.joda.time.tz.DateTimeZoneBuilder : 1409

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 280 #  jGenProg+MinImpact With Seed 16

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 281 #  jGenProg+MinImpact With Seed 16

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 282 #  jGenProg+MinImpact With Seed 16

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 283 #  jGenProg+MinImpact With Seed 16

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 284 #  jGenProg+MinImpact With Seed 16

org.joda.time.tz.DateTimeZoneBuilder : 1390

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 285 #  jGenProg+MinImpact With Seed 16

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 286 #  jGenProg+MinImpact With Seed 16

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 287 #  jGenProg+MinImpact With Seed 16

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((iRuleSets.size()) == 0) {
	addCutover(java.lang.Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
} 

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 288 #  jGenProg+MinImpact With Seed 16

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 289 #  jGenProg+MinImpact With Seed 16

org.joda.time.tz.DateTimeZoneBuilder : 1418

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 290 #  jGenProg+MinImpact With Seed 16

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

rs = new org.joda.time.tz.DateTimeZoneBuilder.RuleSet(rs)

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 291 #  jGenProg+MinImpact With Seed 16

org.joda.time.tz.ZoneInfoCompiler : 78

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 17

## Patch 292 #  jGenProg+MinImpact With Seed 17

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 293 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 294 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 295 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 296 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 297 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 370

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 298 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 356

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 299 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (next == null) {
	continue;
} 

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 300 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 301 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 302 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 910

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 303 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 866

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 304 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 305 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 306 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 307 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 308 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 309 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (((transitions.size()) == 1) && (tailZone == null)) {
	org.joda.time.tz.DateTimeZoneBuilder.Transition tr = transitions.get(0);
	return org.joda.time.tz.DateTimeZoneBuilder.buildFixedZone(id, tr.getNameKey(), tr.getWallOffset(), tr.getStandardOffset());
} 

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 310 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 1407

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 311 #  jGenProg+MinImpact With Seed 17

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 18

## Patch 312 #  jGenProg+MinImpact With Seed 18

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1132

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 313 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 314 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 315 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 316 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 419

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 317 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 318 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (tailZone != null) {
	return tailZone;
} 

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 319 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 1397

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 320 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 321 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 863

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 322 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 914

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 323 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (addTransition(transitions, next)) {
	if (tailZone != null) {
		break;
	} 
} 

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 324 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 325 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 326 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 327 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 328 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 329 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 330 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 331 #  jGenProg+MinImpact With Seed 18

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


Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0



## Patch 332 #  jGenProg+MinImpact With Seed 18

org.joda.time.tz.DateTimeZoneBuilder : 1105

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 40

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 19

## Patch 333 #  jGenProg+MinImpact With Seed 19

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 339

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 334 #  jGenProg+MinImpact With Seed 19

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 335 #  jGenProg+MinImpact With Seed 19

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (((transitions.size()) == 1) && (tailZone == null)) {
	org.joda.time.tz.DateTimeZoneBuilder.Transition tr = transitions.get(0);
	return org.joda.time.tz.DateTimeZoneBuilder.buildFixedZone(id, tr.getNameKey(), tr.getWallOffset(), tr.getStandardOffset());
} 

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 336 #  jGenProg+MinImpact With Seed 19

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 337 #  jGenProg+MinImpact With Seed 19

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 338 #  jGenProg+MinImpact With Seed 19

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 339 #  jGenProg+MinImpact With Seed 19

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

rs = new org.joda.time.tz.DateTimeZoneBuilder.RuleSet(rs)

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 340 #  jGenProg+MinImpact With Seed 19

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 341 #  jGenProg+MinImpact With Seed 19

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 342 #  jGenProg+MinImpact With Seed 19

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 343 #  jGenProg+MinImpact With Seed 19

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 344 #  jGenProg+MinImpact With Seed 19

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 345 #  jGenProg+MinImpact With Seed 19

org.joda.time.tz.DateTimeZoneBuilder : 1085

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 48

Nb of Failing EvoSuite Tests: 0



## Patch 346 #  jGenProg+MinImpact With Seed 19

org.joda.time.tz.ZoneInfoCompiler : 78

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 20

## Patch 347 #  jGenProg+MinImpact With Seed 20

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 351

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 348 #  jGenProg+MinImpact With Seed 20

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 349 #  jGenProg+MinImpact With Seed 20

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (addTransition(transitions, next)) {
	if (tailZone != null) {
		break;
	} 
} 

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 350 #  jGenProg+MinImpact With Seed 20

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 351 #  jGenProg+MinImpact With Seed 20

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 352 #  jGenProg+MinImpact With Seed 20

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 353 #  jGenProg+MinImpact With Seed 20

org.joda.time.tz.DateTimeZoneBuilder : 1436

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 354 #  jGenProg+MinImpact With Seed 20

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 355 #  jGenProg+MinImpact With Seed 20

org.joda.time.tz.DateTimeZoneBuilder : 352

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 356 #  jGenProg+MinImpact With Seed 20

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 357 #  jGenProg+MinImpact With Seed 20

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 358 #  jGenProg+MinImpact With Seed 20

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 359 #  jGenProg+MinImpact With Seed 20

org.joda.time.tz.DateTimeZoneBuilder : 252

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 360 #  jGenProg+MinImpact With Seed 20

org.joda.time.tz.DateTimeZoneBuilder : 865

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 361 #  jGenProg+MinImpact With Seed 20

org.joda.time.tz.DateTimeZoneBuilder : 309

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 362 #  jGenProg+MinImpact With Seed 20

org.joda.time.tz.DateTimeZoneBuilder : 1026

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0



## Patch 363 #  jGenProg+MinImpact With Seed 20

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

saveMillis = next.getSaveMillis()

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 53

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 21

## Patch 364 #  jGenProg+MinImpact With Seed 21

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 365 #  jGenProg+MinImpact With Seed 21

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 366 #  jGenProg+MinImpact With Seed 21

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (tailZone != null) {
	return tailZone;
} 

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 367 #  jGenProg+MinImpact With Seed 21

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (size == 0) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 368 #  jGenProg+MinImpact With Seed 21

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 369 #  jGenProg+MinImpact With Seed 21

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 370 #  jGenProg+MinImpact With Seed 21

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 371 #  jGenProg+MinImpact With Seed 21

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1



## Patch 372 #  jGenProg+MinImpact With Seed 21

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 43

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 22

## Patch 373 #  jGenProg+MinImpact With Seed 22

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 349

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 374 #  jGenProg+MinImpact With Seed 22

org.joda.time.tz.DateTimeZoneBuilder : 932

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 375 #  jGenProg+MinImpact With Seed 22

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 376 #  jGenProg+MinImpact With Seed 22

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 377 #  jGenProg+MinImpact With Seed 22

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 378 #  jGenProg+MinImpact With Seed 22

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 379 #  jGenProg+MinImpact With Seed 22

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 380 #  jGenProg+MinImpact With Seed 22

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 381 #  jGenProg+MinImpact With Seed 22

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 382 #  jGenProg+MinImpact With Seed 22

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 383 #  jGenProg+MinImpact With Seed 22

org.joda.time.tz.DateTimeZoneBuilder : 1066

Patch type: InsertAfterOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 384 #  jGenProg+MinImpact With Seed 22

org.joda.time.tz.DateTimeZoneBuilder : 390

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 0



## Patch 385 #  jGenProg+MinImpact With Seed 22

org.joda.time.tz.ZoneInfoCompiler : 78

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 23

## Patch 386 #  jGenProg+MinImpact With Seed 23

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 387 #  jGenProg+MinImpact With Seed 23

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (tailZone != null) {
	break;
} 

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 388 #  jGenProg+MinImpact With Seed 23

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 389 #  jGenProg+MinImpact With Seed 23

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 390 #  jGenProg+MinImpact With Seed 23

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 391 #  jGenProg+MinImpact With Seed 23

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 392 #  jGenProg+MinImpact With Seed 23

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 393 #  jGenProg+MinImpact With Seed 23

org.joda.time.tz.DateTimeZoneBuilder : 827

Patch type: ReplaceOp

```Java

return iFromYear

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 394 #  jGenProg+MinImpact With Seed 23

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 395 #  jGenProg+MinImpact With Seed 23

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 396 #  jGenProg+MinImpact With Seed 23

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
} 

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 397 #  jGenProg+MinImpact With Seed 23

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 398 #  jGenProg+MinImpact With Seed 23

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 399 #  jGenProg+MinImpact With Seed 23

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: ReplaceOp

```Java

if (next == null) {
	continue;
} 

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0



## Patch 400 #  jGenProg+MinImpact With Seed 23

org.joda.time.tz.DateTimeZoneBuilder : 343

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 46

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 24

## Patch 401 #  jGenProg+MinImpact With Seed 24

jGenProg+MinImpact returns this patch in the first place

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 402 #  jGenProg+MinImpact With Seed 24

org.joda.time.tz.DateTimeZoneBuilder : 371

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 403 #  jGenProg+MinImpact With Seed 24

org.joda.time.tz.DateTimeZoneBuilder : 1154

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 404 #  jGenProg+MinImpact With Seed 24

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: ReplaceOp

```Java

if (id == null) {
	return null;
} 

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 405 #  jGenProg+MinImpact With Seed 24

org.joda.time.tz.DateTimeZoneBuilder : 1026

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 406 #  jGenProg+MinImpact With Seed 24

org.joda.time.tz.DateTimeZoneBuilder : 1458

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 407 #  jGenProg+MinImpact With Seed 24

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear()

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 408 #  jGenProg+MinImpact With Seed 24

org.joda.time.tz.DateTimeZoneBuilder : 1457

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 409 #  jGenProg+MinImpact With Seed 24

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: ReplaceOp

```Java

if (id == null) {
	throw new java.lang.IllegalArgumentException();
} 

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 410 #  jGenProg+MinImpact With Seed 24

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC())

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 411 #  jGenProg+MinImpact With Seed 24

org.joda.time.tz.DateTimeZoneBuilder : 1141

Patch type: ReplaceOp

```Java

if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
	org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
} 

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 412 #  jGenProg+MinImpact With Seed 24

org.joda.time.tz.DateTimeZoneBuilder : 372

Patch type: ReplaceOp

```Java

saveMillis = next.getSaveMillis()

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 413 #  jGenProg+MinImpact With Seed 24

org.joda.time.tz.DateTimeZoneBuilder : 333

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 414 #  jGenProg+MinImpact With Seed 24

org.joda.time.tz.DateTimeZoneBuilder : 1460

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 415 #  jGenProg+MinImpact With Seed 24

org.joda.time.tz.DateTimeZoneBuilder : 1144

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 416 #  jGenProg+MinImpact With Seed 24

org.joda.time.tz.DateTimeZoneBuilder : 352

Patch type: InsertBeforeOp

```Java

org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE)

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 42

Nb of Failing EvoSuite Tests: 0



## Patch 417 #  jGenProg+MinImpact With Seed 24

org.joda.time.tz.ZoneInfoCompiler : 78

Patch type: ReplaceOp

```Java

return true

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 61

Nb of Failing EvoSuite Tests: 1



## Patch 418 #  jGenProg+MinImpact With Seed 24

org.joda.time.tz.ZoneInfoCompiler : 78

Patch type: ReplaceOp

```Java

return false

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 61

Nb of Failing EvoSuite Tests: 1


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 46.59

Average Nb of Failing EvoSuite Tests: 0.09

Average Nb of Test-adequate patches: 17.42

---