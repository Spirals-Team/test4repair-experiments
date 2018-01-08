
## Human Patch 

```Java
diff --git a/src/main/java/org/joda/time/format/DateTimeFormatter.java b/src/main/java/org/joda/time/format/DateTimeFormatter.java
index baa276a..a4b1612 100644
--- a/src/main/java/org/joda/time/format/DateTimeFormatter.java
+++ b/src/main/java/org/joda/time/format/DateTimeFormatter.java
@@ -706,7 +706,7 @@ public class DateTimeFormatter {
         chrono = selectChronology(chrono);
         
         DateTimeParserBucket bucket = new DateTimeParserBucket(
+            instantLocal, chrono, iLocale, iPivotYear, chrono.year().get(instantLocal));
-            instantLocal, chrono, iLocale, iPivotYear, iDefaultYear);
         int newPos = parser.parseInto(bucket, text, position);
         instant.setMillis(bucket.computeMillis(false, text));
         if (iOffsetParsed && bucket.getOffsetInteger() != null) {

```


## Original Patch # Nopol 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Execution Time: 00:00 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 4

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 12

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:51

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 18

Execution Time: 00:20 (hh:mm)

Nb of EvoSuite Tests:51

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 26

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 28

Execution Time: 00:25 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Removed Tests:1


## Patch 6 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 35

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 41

Execution Time: 00:20 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 54

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:54

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 60

Execution Time: 00:20 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 66

Execution Time: 00:14 (hh:mm)

Nb of EvoSuite Tests:35

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 75

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:50

Nb of Removed Tests:1


## Patch 12 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 83

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 98

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 100

Execution Time: 00:20 (hh:mm)

Nb of EvoSuite Tests:50

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 104

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 111

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:51

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 113

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:55

Nb of Removed Tests:1


## Patch 18 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 120

Execution Time: 00:18 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 128

Execution Time: 00:20 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 135

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 143

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 150

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:1


## Patch 23 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 153

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 161

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 166

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 173

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:53

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 180

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:53

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 181

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Removed Tests:1


## Patch 29 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
resetFields
```

Seed: 186

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided (selected for manual analysis)

org.joda.time.format.DateTimeParserBucket : 358

Patch type: PRECONDITION

```Java
org.joda.time.format.DateTimeParserBucket.this.iMillis < org.joda.time.format.DateTimeParserBucket.this.iDefaultYear
```

Seed: 193

Execution Time: 00:20 (hh:mm)

Nb of EvoSuite Tests:51

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:21 (hh:mm)

Average Nb of EvoSuite Tests:49.23

Average Nb of Removed Tests:0.17

Running Nopol+UnsatGuided changes the original patch for 1 of the 30 seeds. The human patch changes the parameters used in the constructor of DateTimeParserBucket, the original patch and the selected newly generated patches by running accompanying add a precondition to the same statement, we think they are incorrect. We observe failing EvoSuite tests for both the programs patched with the original Nopol patch and the selected new patch genertaed by running Nopol+UnsatGuided, which verifies our analysis.
