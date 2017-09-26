
## Human Patch 

```Java
diff --git a/src/main/java/org/joda/time/chrono/BasicMonthOfYearDateTimeField.java b/src/main/java/org/joda/time/chrono/BasicMonthOfYearDateTimeField.java
index 2892a2d..afca44e 100644
--- a/src/main/java/org/joda/time/chrono/BasicMonthOfYearDateTimeField.java
+++ b/src/main/java/org/joda/time/chrono/BasicMonthOfYearDateTimeField.java
@@ -206,12 +206,7 @@ class BasicMonthOfYearDateTimeField extends ImpreciseDateTimeField {
         if (valueToAdd == 0) {
             return values;
         }
+        if (partial.size() > 0 && partial.getFieldType(0).equals(DateTimeFieldType.monthOfYear()) && fieldIndex == 0) {
             // month is largest field and being added to, such as month-day
+            int curMonth0 = partial.getValue(0) - 1;
+            int newMonth = ((curMonth0 + (valueToAdd % 12) + 12) % 12) + 1;
+            return set(partial, 0, values, newMonth);
+        }
         if (DateTimeUtils.isContiguous(partial)) {
             long instant = 0L;
             for (int i = 0, isize = partial.size(); i < isize; i++) {

```


## Original Patch # Nopol 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
((!(-1 == valueToAdd)) && ((valueToAdd) != (1))) || (1 <= fieldIndex)
```

Execution Time: 00:00 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(((valueToAdd) != (1)) && (!(valueToAdd == -1))) || (1 <= fieldIndex)
```

Seed: 4

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
((0) != (fieldIndex)) || (!((valueToAdd < values.length) && (-1 <= valueToAdd)))
```

Seed: 12

Execution Time: 00:17 (hh:mm)

Nb of EvoSuite Tests:24

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(org.joda.time.chrono.BasicMonthOfYearDateTimeField.MIN <= fieldIndex) || (((valueToAdd) != (org.joda.time.chrono.BasicMonthOfYearDateTimeField.MIN)) && (!(valueToAdd == -1)))
```

Seed: 18

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
((!(-1 == valueToAdd)) && ((valueToAdd) != (1))) || (1 <= fieldIndex)
```

Seed: 26

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(((valueToAdd) != (org.joda.time.chrono.BasicMonthOfYearDateTimeField.MIN)) && (!(-1 == valueToAdd))) || (org.joda.time.chrono.BasicMonthOfYearDateTimeField.MIN <= fieldIndex)
```

Seed: 28

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:24

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
((!(valueToAdd == -1)) && ((valueToAdd) != (1))) || (0 < fieldIndex)
```

Seed: 35

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(((-1) != (valueToAdd)) && (!(valueToAdd == 1))) || (org.joda.time.chrono.BasicMonthOfYearDateTimeField.this.iLeapMonth < values.length)
```

Seed: 41

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:24

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(((-1) != (valueToAdd)) && (!(valueToAdd == 1))) || (org.joda.time.chrono.BasicMonthOfYearDateTimeField.MIN <= fieldIndex)
```

Seed: 54

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(org.joda.time.chrono.BasicMonthOfYearDateTimeField.MIN < valueToAdd) || (!((-1 <= valueToAdd) && (0 == fieldIndex)))
```

Seed: 60

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(valueToAdd < -1) || (!((valueToAdd <= 1) && (fieldIndex == 0)))
```

Seed: 66

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
((!(-1 == valueToAdd)) && ((valueToAdd) != (1))) || (1 <= fieldIndex)
```

Seed: 75

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(0 < fieldIndex) || (((valueToAdd) != (-1)) && (!(1 == valueToAdd)))
```

Seed: 83

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(((valueToAdd) != (1)) && (!(-1 == valueToAdd))) || (org.joda.time.chrono.BasicMonthOfYearDateTimeField.this.iLeapMonth < values.length)
```

Seed: 98

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(((1) != (valueToAdd)) && (!(valueToAdd == -1))) || (org.joda.time.chrono.BasicMonthOfYearDateTimeField.this.iLeapMonth < values.length)
```

Seed: 100

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(((valueToAdd) != (1)) && (!(-1 == valueToAdd))) || (org.joda.time.chrono.BasicMonthOfYearDateTimeField.MIN <= fieldIndex)
```

Seed: 104

Execution Time: 00:18 (hh:mm)

Nb of EvoSuite Tests:25

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(!((-1 <= valueToAdd) && ((1) != (fieldIndex)))) || (org.joda.time.chrono.BasicMonthOfYearDateTimeField.MIN < valueToAdd)
```

Seed: 111

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
((!(-1 == valueToAdd)) && ((valueToAdd) != (1))) || (1 <= fieldIndex)
```

Seed: 113

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(((valueToAdd) != (-1)) && (!(org.joda.time.chrono.BasicMonthOfYearDateTimeField.MIN == valueToAdd))) || (0 < fieldIndex)
```

Seed: 120

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(((valueToAdd) != (-1)) && (!(valueToAdd == 1))) || (org.joda.time.chrono.BasicMonthOfYearDateTimeField.this.iLeapMonth < values.length)
```

Seed: 128

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
((!(-1 == valueToAdd)) && ((valueToAdd) != (1))) || (1 <= fieldIndex)
```

Seed: 135

Execution Time: 00:13 (hh:mm)

Nb of EvoSuite Tests:21

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(((valueToAdd) != (1)) && (!(-1 == valueToAdd))) || (org.joda.time.chrono.BasicMonthOfYearDateTimeField.this.iLeapMonth < values.length)
```

Seed: 143

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(org.joda.time.chrono.BasicMonthOfYearDateTimeField.MIN < valueToAdd) || (!((-1 <= valueToAdd) && (0 == fieldIndex)))
```

Seed: 150

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(org.joda.time.chrono.BasicMonthOfYearDateTimeField.this.iLeapMonth < values.length) || (((valueToAdd) != (-1)) && (!(org.joda.time.chrono.BasicMonthOfYearDateTimeField.MIN == valueToAdd)))
```

Seed: 153

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:24

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(org.joda.time.chrono.BasicMonthOfYearDateTimeField.MIN <= fieldIndex) || (((valueToAdd) != (-1)) && (!(valueToAdd == 1)))
```

Seed: 161

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:24

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(org.joda.time.chrono.BasicMonthOfYearDateTimeField.MIN == fieldIndex) || (!((-1 <= valueToAdd) && (valueToAdd < values.length)))
```

Seed: 166

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
((!(-1 == valueToAdd)) && ((valueToAdd) != (1))) || (1 <= fieldIndex)
```

Seed: 173

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:1


## Patch 27 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
((!(-1 == valueToAdd)) && ((valueToAdd) != (1))) || (1 <= fieldIndex)
```

Seed: 180

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(1 <= fieldIndex) || (((valueToAdd) != (-1)) && (!(org.joda.time.chrono.BasicMonthOfYearDateTimeField.MIN == valueToAdd)))
```

Seed: 181

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
(0 < fieldIndex) || ((!(valueToAdd == 1)) && ((valueToAdd) != (-1)))
```

Seed: 186

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.joda.time.chrono.BasicMonthOfYearDateTimeField : 210

Patch type: CONDITIONAL

```Java
((!(valueToAdd == 1)) && ((valueToAdd) != (-1))) || (org.joda.time.chrono.BasicMonthOfYearDateTimeField.MIN <= fieldIndex)
```

Seed: 193

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:16 (hh:mm)

Average Nb of EvoSuite Tests:22.9

Average Nb of Removed Tests:0.03

Running Nopol+UnsatGuided changes the original patch for 24 of the 30 seeds. The human patch adds an if condition and the accompanying if body, the original patch and the newly generated patches by running accompanying make changes to the same conditional statement, we think they are incorrect. We observe failing EvoSuite tests for both the programs patched with the original Nopol patch and the new patches genertaed by running Nopol+UnsatGuided, which verifies our analysis.
