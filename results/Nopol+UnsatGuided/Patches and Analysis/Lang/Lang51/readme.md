
## Human Patch 

```Java
diff --git a/src/java/org/apache/commons/lang/BooleanUtils.java b/src/java/org/apache/commons/lang/BooleanUtils.java
index 8b5028c..3fda4ec 100644
--- a/src/java/org/apache/commons/lang/BooleanUtils.java
+++ b/src/java/org/apache/commons/lang/BooleanUtils.java
@@ -679,7 +679,6 @@ public class BooleanUtils {
                         (str.charAt(1) == 'E' || str.charAt(1) == 'e') &&
                         (str.charAt(2) == 'S' || str.charAt(2) == 's');
                 }
+                return false;
             }
             case 4: {
                 char ch = str.charAt(0);

```


## Original Patch # Nopol 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
str!=null
```

Execution Time: 00:00 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 4

Execution Time: 01:00 (hh:mm)

Nb of EvoSuite Tests:124

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 12

Execution Time: 01:03 (hh:mm)

Nb of EvoSuite Tests:125

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 18

Execution Time: 01:04 (hh:mm)

Nb of EvoSuite Tests:124

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 26

Execution Time: 01:04 (hh:mm)

Nb of EvoSuite Tests:127

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 28

Execution Time: 01:00 (hh:mm)

Nb of EvoSuite Tests:121

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 35

Execution Time: 01:01 (hh:mm)

Nb of EvoSuite Tests:124

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 41

Execution Time: 00:58 (hh:mm)

Nb of EvoSuite Tests:123

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 54

Execution Time: 01:02 (hh:mm)

Nb of EvoSuite Tests:126

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 60

Execution Time: 01:03 (hh:mm)

Nb of EvoSuite Tests:124

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 66

Execution Time: 01:04 (hh:mm)

Nb of EvoSuite Tests:121

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 75

Execution Time: 01:01 (hh:mm)

Nb of EvoSuite Tests:123

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 83

Execution Time: 01:04 (hh:mm)

Nb of EvoSuite Tests:127

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 98

Execution Time: 01:01 (hh:mm)

Nb of EvoSuite Tests:122

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 100

Execution Time: 01:06 (hh:mm)

Nb of EvoSuite Tests:125

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 104

Execution Time: 01:01 (hh:mm)

Nb of EvoSuite Tests:122

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 111

Execution Time: 01:01 (hh:mm)

Nb of EvoSuite Tests:120

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 113

Execution Time: 01:02 (hh:mm)

Nb of EvoSuite Tests:125

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 120

Execution Time: 01:00 (hh:mm)

Nb of EvoSuite Tests:125

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 128

Execution Time: 01:03 (hh:mm)

Nb of EvoSuite Tests:128

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 135

Execution Time: 01:01 (hh:mm)

Nb of EvoSuite Tests:124

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 143

Execution Time: 01:01 (hh:mm)

Nb of EvoSuite Tests:125

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 150

Execution Time: 01:00 (hh:mm)

Nb of EvoSuite Tests:122

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 153

Execution Time: 01:00 (hh:mm)

Nb of EvoSuite Tests:123

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 161

Execution Time: 01:01 (hh:mm)

Nb of EvoSuite Tests:123

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 166

Execution Time: 01:04 (hh:mm)

Nb of EvoSuite Tests:128

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
str!=null
```

Seed: 173

Execution Time: 01:03 (hh:mm)

Nb of EvoSuite Tests:123

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 180

Execution Time: 01:02 (hh:mm)

Nb of EvoSuite Tests:126

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 181

Execution Time: 01:00 (hh:mm)

Nb of EvoSuite Tests:123

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 186

Execution Time: 01:03 (hh:mm)

Nb of EvoSuite Tests:127

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.lang.BooleanUtils : 677

Patch type: CONDITIONAL

```Java
'Y' <= ch
```

Seed: 193

Execution Time: 01:00 (hh:mm)

Nb of EvoSuite Tests:120

Nb of Contradiction Tests:1

Nb of Removed Tests:1


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 01:02 (hh:mm)

Average Nb of EvoSuite Tests:124

Average Nb of Contradiction Tests:0.5

Average Nb of Removed Tests:0.5

Running Nopol+UnsatGuided changes the original patch for 29 of the 30 seeds. The human patch add a return false after an if condition, the original patch and the newly generated patch by running Nopol+UnsatGuided both do not fix the problem caused by the wrong switch-case flow, they just overfit the tests.