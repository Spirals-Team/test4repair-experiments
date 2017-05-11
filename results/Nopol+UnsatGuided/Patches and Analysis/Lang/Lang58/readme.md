
## Human Patch 

```Java
diff --git a/src/java/org/apache/commons/lang/math/NumberUtils.java b/src/java/org/apache/commons/lang/math/NumberUtils.java
index eb74e72..c0f06a4 100644
--- a/src/java/org/apache/commons/lang/math/NumberUtils.java
+++ b/src/java/org/apache/commons/lang/math/NumberUtils.java
@@ -451,7 +451,8 @@ public class NumberUtils {
                 case 'L' :
                     if (dec == null
                         && exp == null
+                        && (numeric.charAt(0) == '-' && isDigits(numeric.substring(1)) || isDigits(numeric))) {
-                        && isDigits(numeric.substring(1))
-                        && (numeric.charAt(0) == '-' || Character.isDigit(numeric.charAt(0)))) {
                         try {
                             return createLong(numeric);
                         } catch (NumberFormatException nfe) {

```


## Original Patch # Nopol 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Execution Time: 00:00 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 4

Execution Time: 01:39 (hh:mm)

Nb of EvoSuite Tests:216

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 12

Execution Time: 01:39 (hh:mm)

Nb of EvoSuite Tests:221

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 18

Execution Time: 01:35 (hh:mm)

Nb of EvoSuite Tests:211

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 26

Execution Time: 01:42 (hh:mm)

Nb of EvoSuite Tests:219

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 28

Execution Time: 01:36 (hh:mm)

Nb of EvoSuite Tests:211

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 35

Execution Time: 01:37 (hh:mm)

Nb of EvoSuite Tests:215

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 41

Execution Time: 01:40 (hh:mm)

Nb of EvoSuite Tests:222

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 54

Execution Time: 01:39 (hh:mm)

Nb of EvoSuite Tests:217

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 60

Execution Time: 01:45 (hh:mm)

Nb of EvoSuite Tests:228

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 66

Execution Time: 01:38 (hh:mm)

Nb of EvoSuite Tests:211

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 75

Execution Time: 01:38 (hh:mm)

Nb of EvoSuite Tests:216

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 83

Execution Time: 01:36 (hh:mm)

Nb of EvoSuite Tests:216

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 98

Execution Time: 01:38 (hh:mm)

Nb of EvoSuite Tests:212

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 100

Execution Time: 01:31 (hh:mm)

Nb of EvoSuite Tests:205

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 104

Execution Time: 01:36 (hh:mm)

Nb of EvoSuite Tests:213

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 111

Execution Time: 01:39 (hh:mm)

Nb of EvoSuite Tests:219

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 113

Execution Time: 01:40 (hh:mm)

Nb of EvoSuite Tests:222

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 120

Execution Time: 01:36 (hh:mm)

Nb of EvoSuite Tests:213

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 128

Execution Time: 01:36 (hh:mm)

Nb of EvoSuite Tests:214

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 135

Execution Time: 01:40 (hh:mm)

Nb of EvoSuite Tests:216

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 143

Execution Time: 01:39 (hh:mm)

Nb of EvoSuite Tests:215

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 150

Execution Time: 01:37 (hh:mm)

Nb of EvoSuite Tests:212

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 153

Execution Time: 01:37 (hh:mm)

Nb of EvoSuite Tests:213

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 161

Execution Time: 01:42 (hh:mm)

Nb of EvoSuite Tests:222

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 166

Execution Time: 01:36 (hh:mm)

Nb of EvoSuite Tests:208

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 173

Execution Time: 01:39 (hh:mm)

Nb of EvoSuite Tests:215

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 180

Execution Time: 01:39 (hh:mm)

Nb of EvoSuite Tests:221

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 181

Execution Time: 01:45 (hh:mm)

Nb of EvoSuite Tests:218

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 186

Execution Time: 01:42 (hh:mm)

Nb of EvoSuite Tests:215

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.lang.math.NumberUtils : 452

Patch type: CONDITIONAL

```Java
((dec == null) && (exp == null))
```

Seed: 193

Execution Time: 01:40 (hh:mm)

Nb of EvoSuite Tests:215

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 01:39 (hh:mm)

Average Nb of EvoSuite Tests:215.7

Average Nb of Contradiction Tests:0.17

Average Nb of Removed Tests:0.17

Running Nopol+UnsatGuided does not change the original patch for any of the 30 seeds. The human patch fixes the condition which invalidates the string 1l (long), the generated patch simplifies the condition, remove the buggy part, and relies on checks available in called methods. The generated patch is semantically equivalent to the human patch.