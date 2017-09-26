
## Human Patch 

```Java
diff --git a/src/main/java/org/joda/time/format/DateTimeFormatter.java b/src/main/java/org/joda/time/format/DateTimeFormatter.java
index 913d036..447674a 100644
--- a/src/main/java/org/joda/time/format/DateTimeFormatter.java
+++ b/src/main/java/org/joda/time/format/DateTimeFormatter.java
@@ -705,9 +705,9 @@ public class DateTimeFormatter {
         
         long instantMillis = instant.getMillis();
         Chronology chrono = instant.getChronology();
+        int defaultYear = DateTimeUtils.getChronology(chrono).year().get(instantMillis);
         long instantLocal = instantMillis + chrono.getZone().getOffset(instantMillis);
         chrono = selectChronology(chrono);
-        int defaultYear = chrono.year().get(instantLocal);
         
         DateTimeParserBucket bucket = new DateTimeParserBucket(
             instantLocal, chrono, iLocale, iPivotYear, defaultYear);

```


## Original Patch # Nopol 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Execution Time: 00:01 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Seed: 4

Execution Time: 00:51 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!((2 < text.length()) && ((2000) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (text.length())))))
```

Seed: 12

Execution Time: 01:03 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(!((org.joda.time.format.DateTimeParserBucket.this.iSavedFieldsCount < org.joda.time.format.DateTimeParserBucket.this.iMillis) && ((text.length()) != ((2000) - (org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) + org.joda.time.format.DateTimeParserBucket.this.iSavedFields.length)))) || (org.joda.time.format.DateTimeParserBucket.this.iSavedFieldsCount <= 2)
```

Seed: 18

Execution Time: 01:00 (hh:mm)

Nb of EvoSuite Tests:50

Nb of Removed Tests:1


## Patch 4 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Seed: 26

Execution Time: 00:51 (hh:mm)

Nb of EvoSuite Tests:53

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Seed: 28

Execution Time: 00:42 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
((org.joda.time.format.DateTimeParserBucket.this.iSavedFieldsCount) - (-1) + 2000 == org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) || (!((10 < org.joda.time.format.DateTimeParserBucket.this.iMillis) && ((org.joda.time.format.DateTimeParserBucket.this.iSavedFieldsCount) - (-1) <= text.length())))
```

Seed: 35

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000) == text.length()) || (!((org.joda.time.format.DateTimeParserBucket.this.iSavedFieldsCount < text.length()) && ((org.joda.time.format.DateTimeParserBucket.this.iMillis) != (0))))
```

Seed: 41

Execution Time: 00:58 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Removed Tests:3


## Patch 8 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Seed: 54

Execution Time: 00:46 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Seed: 60

Execution Time: 00:58 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:2


## Patch 10 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Seed: 66

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Removed Tests:1


## Patch 11 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Seed: 75

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:50

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Seed: 83

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:51

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Seed: 98

Execution Time: 00:47 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Seed: 100

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:54

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Seed: 104

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Seed: 111

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Seed: 113

Execution Time: 00:51 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(!((2 < text.length()) && (((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000)) != (text.length())))) || (resetFields)
```

Seed: 120

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:53

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Seed: 128

Execution Time: 00:39 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Seed: 135

Execution Time: 00:52 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Removed Tests:2


## Patch 21 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(!((((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (text.length())) != (2000)) && (org.joda.time.format.DateTimeParserBucket.this.iSavedFieldsCount < text.length()))) || (resetFields)
```

Seed: 143

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
((((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000)) != (org.joda.time.format.DateTimeParserBucket.this.iSavedFieldsCount)) && (!(savedFields.length < text.length() + (org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000)))) || (resetFields)
```

Seed: 150

Execution Time: 00:42 (hh:mm)

Nb of EvoSuite Tests:43

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
((resetFields) || ((2000 + text.length()) - (org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) < 1)) && (((2000 + text.length()) - (org.joda.time.format.DateTimeParserBucket.this.iDefaultYear)) != (-1))
```

Seed: 153

Execution Time: 00:57 (hh:mm)

Nb of EvoSuite Tests:50

Nb of Removed Tests:2


## Patch 24 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Seed: 161

Execution Time: 00:47 (hh:mm)

Nb of EvoSuite Tests:51

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
((text.length() + (2000) - (org.joda.time.format.DateTimeParserBucket.this.iDefaultYear)) != (1)) && (!((-1 == text.length() + (2000) - (org.joda.time.format.DateTimeParserBucket.this.iDefaultYear)) || (org.joda.time.format.DateTimeParserBucket.this.iSavedFieldsShared)))
```

Seed: 166

Execution Time: 00:58 (hh:mm)

Nb of EvoSuite Tests:50

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(text.length() <= org.joda.time.format.DateTimeParserBucket.this.iSavedFieldsCount) || (!(((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) != (2000 + text.length())) && (savedFields.length < org.joda.time.format.DateTimeParserBucket.this.iMillis)))
```

Seed: 173

Execution Time: 01:02 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Seed: 180

Execution Time: 00:47 (hh:mm)

Nb of EvoSuite Tests:51

Nb of Removed Tests:1


## Patch 28 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(!(((2000 + text.length()) != (org.joda.time.format.DateTimeParserBucket.this.iDefaultYear)) && (count == 2))) || (resetFields)
```

Seed: 181

Execution Time: 00:54 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(resetFields) || (!(((text.length()) != ((org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))) && (count == 2)))
```

Seed: 186

Execution Time: 00:46 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.joda.time.format.DateTimeParserBucket : 359

Patch type: PRECONDITION

```Java
(!(((org.joda.time.format.DateTimeParserBucket.this.iMillis) != (0)) && (2 <= count))) || (text.length() == (org.joda.time.format.DateTimeParserBucket.this.iDefaultYear) - (2000))
```

Seed: 193

Execution Time: 00:52 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:51 (hh:mm)

Average Nb of EvoSuite Tests:49.67

Average Nb of Removed Tests:0.4

Running Nopol+UnsatGuided changes the original patch for 12 for the 30 seeds. The human patch changes the assignment of a variable named defaultYear, the original patch and the newly generated patches by running Nopol+UnsatGuided add a precondition to the same statement, we think they are incorrect. We observe failing EvoSuite tests for both the programs patched with the original Nopol patch and the new patches genertaed by running Nopol+UnsatGuided, which verifies our analysis.
