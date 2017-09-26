
## Human Patch 

```Java
diff --git a/src/java/org/apache/commons/lang/NumberUtils.java b/src/java/org/apache/commons/lang/NumberUtils.java
index c5ca8cd..18a05ef 100644
--- a/src/java/org/apache/commons/lang/NumberUtils.java
+++ b/src/java/org/apache/commons/lang/NumberUtils.java
@@ -142,9 +142,6 @@ public final class NumberUtils {
         if (val.length() == 0) {
             throw new NumberFormatException("\"\" is not a valid number.");
         }
+        if (val.length() == 1 && !Character.isDigit(val.charAt(0))) {
+            throw new NumberFormatException(val + " is not a valid number.");
+        }
         if (val.startsWith("--")) {
             // this is protection for poorness in java.lang.BigDecimal.
             // it accepts this as a legal value, but it does not appear 

```


## Original Patch # Nopol 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Execution Time: 00:00 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 4

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:104

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 12

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:97

Nb of Removed Tests:1


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 18

Execution Time: 00:41 (hh:mm)

Nb of EvoSuite Tests:95

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 26

Execution Time: 00:41 (hh:mm)

Nb of EvoSuite Tests:95

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 28

Execution Time: 00:46 (hh:mm)

Nb of EvoSuite Tests:106

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 35

Execution Time: 00:44 (hh:mm)

Nb of EvoSuite Tests:99

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 41

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:100

Nb of Removed Tests:1


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 54

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:107

Nb of Removed Tests:1


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 60

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:101

Nb of Removed Tests:1


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 66

Execution Time: 00:47 (hh:mm)

Nb of EvoSuite Tests:103

Nb of Removed Tests:1


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 75

Execution Time: 00:40 (hh:mm)

Nb of EvoSuite Tests:93

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 83

Execution Time: 00:43 (hh:mm)

Nb of EvoSuite Tests:96

Nb of Removed Tests:1


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 98

Execution Time: 00:46 (hh:mm)

Nb of EvoSuite Tests:105

Nb of Removed Tests:1


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 100

Execution Time: 00:47 (hh:mm)

Nb of EvoSuite Tests:104

Nb of Removed Tests:1


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 104

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:102

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 111

Execution Time: 00:47 (hh:mm)

Nb of EvoSuite Tests:107

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 113

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:102

Nb of Removed Tests:1


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 120

Execution Time: 00:44 (hh:mm)

Nb of EvoSuite Tests:102

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 128

Execution Time: 00:46 (hh:mm)

Nb of EvoSuite Tests:101

Nb of Removed Tests:1


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: PRECONDITION

```Java
1 < val.length()
```

Seed: 135

Execution Time: 00:46 (hh:mm)

Nb of EvoSuite Tests:103

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 143

Execution Time: 00:47 (hh:mm)

Nb of EvoSuite Tests:107

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 150

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:101

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 153

Execution Time: 00:40 (hh:mm)

Nb of EvoSuite Tests:95

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: PRECONDITION

```Java
1 < val.length()
```

Seed: 161

Execution Time: 00:46 (hh:mm)

Nb of EvoSuite Tests:100

Nb of Removed Tests:1


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: PRECONDITION

```Java
1 < val.length()
```

Seed: 166

Execution Time: 00:42 (hh:mm)

Nb of EvoSuite Tests:96

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 173

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:105

Nb of Removed Tests:1


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 180

Execution Time: 00:47 (hh:mm)

Nb of EvoSuite Tests:104

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 181

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:101

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 186

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:105

Nb of Removed Tests:1


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.lang.NumberUtils : 193

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 193

Execution Time: 00:44 (hh:mm)

Nb of EvoSuite Tests:104

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:45 (hh:mm)

Average Nb of EvoSuite Tests:101.33

Average Nb of Removed Tests:0.43

Running Nopol+UnsatGuided changes the original patch for 3 of the 30 seeds. The human patch adds a check at the beginning of the method which parses a String to a number (String to int, long, float or double), the original patch (changes the condition to ((dec == null) && (exp == null)) simplifies the condition, remove the buggy part, and relies on checks available in called methods. The newly generated patch adds a precondition before the method call which parses the string to a long. The method will only be executed when the length of the string is bigger than 1. If the condition is not respected the program continues and throws the expected exception. Both the original patch and the new patch generated by running Nopol+UnsatGuided are semantically equivalent to the human patch.  
