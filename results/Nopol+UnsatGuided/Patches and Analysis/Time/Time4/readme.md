
## Human Patch 

```Java
diff --git a/src/main/java/org/joda/time/Partial.java b/src/main/java/org/joda/time/Partial.java
index 8e8e603..0d4edf4 100644
--- a/src/main/java/org/joda/time/Partial.java
+++ b/src/main/java/org/joda/time/Partial.java
@@ -461,7 +461,7 @@ public final class Partial
             System.arraycopy(iValues, i, newValues, i + 1, newValues.length - i - 1);
             // use public constructor to ensure full validation
             // this isn't overly efficient, but is safe
+            Partial newPartial = new Partial(newTypes, newValues, iChronology);
-            Partial newPartial = new Partial(iChronology, newTypes, newValues);
             iChronology.validate(newPartial, newValues);
             return newPartial;
         }

```


## Original Patch # Nopol 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(!((2 < value) && ((0) - (newValues.length) + value <= newValues.length))) || (org.joda.time.Partial.this.iFormatter!=null)
```

Execution Time: 00:01 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(org.joda.time.Partial.this.iFormatter!=null) || (!(newValues.length + newValues.length == value))
```

Seed: 4

Execution Time: 01:01 (hh:mm)

Nb of EvoSuite Tests:97

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(value) != (newValues.length + newValues.length)
```

Seed: 12

Execution Time: 00:59 (hh:mm)

Nb of EvoSuite Tests:91

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(value <= 2) || (!((value + index) - (newTypes.length) < newValues.length))
```

Seed: 18

Execution Time: 01:02 (hh:mm)

Nb of EvoSuite Tests:95

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(!((2 < value) && ((0) - (newValues.length) + value <= newValues.length))) || (org.joda.time.Partial.this.iFormatter!=null)
```

Seed: 26

Execution Time: 01:01 (hh:mm)

Nb of EvoSuite Tests:91

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(!((2 < value) && ((0) - (newValues.length) + value <= newValues.length))) || (org.joda.time.Partial.this.iFormatter!=null)
```

Seed: 28

Execution Time: 00:58 (hh:mm)

Nb of EvoSuite Tests:97

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(value <= newValues.length) || (!(value < (newTypes.length) - (index) + newTypes.length))
```

Seed: 35

Execution Time: 01:04 (hh:mm)

Nb of EvoSuite Tests:100

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided (selected for manual analysis)

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
((-1) != (newTypes.length + (2) - (value))) || (newTypes.length == 2)
```

Seed: 41

Execution Time: 01:00 (hh:mm)

Nb of EvoSuite Tests:89

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(!((2 < value) && ((0) - (newValues.length) + value <= newValues.length))) || (org.joda.time.Partial.this.iFormatter!=null)
```

Seed: 54

Execution Time: 00:33 (hh:mm)

Nb of EvoSuite Tests:90

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(((2) != (org.joda.time.Partial.this.iValues.length)) && ((2) != (org.joda.time.Partial.this.iValues.length))) || (org.joda.time.Partial.this.iValues.length < value + (-1) - (newValues.length))
```

Seed: 60

Execution Time: 01:01 (hh:mm)

Nb of EvoSuite Tests:98

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(newValues.length) != (value + (index) - (org.joda.time.Partial.this.iTypes.length))
```

Seed: 66

Execution Time: 00:53 (hh:mm)

Nb of EvoSuite Tests:94

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(!((2 < value) && ((0) - (newValues.length) + value <= newValues.length))) || (org.joda.time.Partial.this.iFormatter!=null)
```

Seed: 75

Execution Time: 00:57 (hh:mm)

Nb of EvoSuite Tests:85

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(org.joda.time.Partial.this.iFormatter!=null) || (!(newValues.length + newValues.length == value))
```

Seed: 83

Execution Time: 00:57 (hh:mm)

Nb of EvoSuite Tests:94

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
!(1 + newTypes.length == (value) - (org.joda.time.Partial.this.iValues.length))
```

Seed: 98

Execution Time: 00:52 (hh:mm)

Nb of EvoSuite Tests:91

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
!(1 == (value) - (newTypes.length + org.joda.time.Partial.this.iTypes.length))
```

Seed: 100

Execution Time: 01:03 (hh:mm)

Nb of EvoSuite Tests:96

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(((value) != (newValues.length + newValues.length)) && ((value) != (newValues.length + newValues.length))) || (org.joda.time.Partial.this.iFormatter!=null)
```

Seed: 104

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:86

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(!(newValues.length + newValues.length == value)) || (org.joda.time.Partial.this.iFormatter!=null)
```

Seed: 111

Execution Time: 00:55 (hh:mm)

Nb of EvoSuite Tests:92

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(!((2 < value) && ((0) - (newValues.length) + value <= newValues.length))) || (org.joda.time.Partial.this.iFormatter!=null)
```

Seed: 113

Execution Time: 00:54 (hh:mm)

Nb of EvoSuite Tests:92

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(!((2 < value) && ((0) - (newValues.length) + value <= newValues.length))) || (org.joda.time.Partial.this.iFormatter!=null)
```

Seed: 120

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:82

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
!((value) - (newTypes.length) == newValues.length)
```

Seed: 128

Execution Time: 00:50 (hh:mm)

Nb of EvoSuite Tests:99

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(org.joda.time.Partial.this.iValues!=null) && ((value) != (newValues.length + newValues.length))
```

Seed: 135

Execution Time: 01:02 (hh:mm)

Nb of EvoSuite Tests:96

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(!((2 < value) && ((0) - (newValues.length) + value <= newValues.length))) || (org.joda.time.Partial.this.iFormatter!=null)
```

Seed: 143

Execution Time: 01:01 (hh:mm)

Nb of EvoSuite Tests:90

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(value + (-1) - (newTypes.length)) != (org.joda.time.Partial.this.iTypes.length)
```

Seed: 150

Execution Time: 00:54 (hh:mm)

Nb of EvoSuite Tests:86

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
((newTypes.length) - (index) + (newTypes.length) - (index) <= value) || ((org.joda.time.Partial.this.iTypes.length) != (2))
```

Seed: 153

Execution Time: 00:58 (hh:mm)

Nb of EvoSuite Tests:96

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(org.joda.time.Partial.this.iValues.length == 0) || (!((value <= newTypes.length + newTypes.length) && (org.joda.time.Partial.this.iTypes.length < value)))
```

Seed: 161

Execution Time: 00:50 (hh:mm)

Nb of EvoSuite Tests:91

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
((((-1) - (org.joda.time.Partial.this.iValues.length) + value) != (newTypes.length)) && (((-1) - (org.joda.time.Partial.this.iValues.length) + value) != (newTypes.length))) || (newValues.length <= index)
```

Seed: 166

Execution Time: 00:56 (hh:mm)

Nb of EvoSuite Tests:98

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
!((-1) - (newTypes.length) + value == org.joda.time.Partial.this.iValues.length)
```

Seed: 173

Execution Time: 00:52 (hh:mm)

Nb of EvoSuite Tests:87

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(org.joda.time.Partial.this.iValues.length) != ((value) - (newTypes.length + 1))
```

Seed: 180

Execution Time: 00:59 (hh:mm)

Nb of EvoSuite Tests:97

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
(!((fieldType!=null) && (index == (org.joda.time.Partial.this.iValues.length) - (value) + newTypes.length))) || (org.joda.time.Partial.this.iFormatter!=null)
```

Seed: 181

Execution Time: 00:43 (hh:mm)

Nb of EvoSuite Tests:88

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
!(newValues.length == (value) - (newValues.length))
```

Seed: 186

Execution Time: 00:55 (hh:mm)

Nb of EvoSuite Tests:89

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.joda.time.Partial : 459

Patch type: PRECONDITION

```Java
((org.joda.time.Partial.this.iValues.length) != (2)) || (!((value) - (newTypes.length) + -1 < newTypes.length))
```

Seed: 193

Execution Time: 01:04 (hh:mm)

Nb of EvoSuite Tests:100

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:55 (hh:mm)

Average Nb of EvoSuite Tests:92.57

Average Nb of Removed Tests:0

Running Nopol+UnsatGuided changes the original patch for 23 of the 30 seeds. The human patch uses a different constructor of the class Partial, the original patch and the selected newly generated patch by running Nopol+UnsatGuided add a precondition to the same statement, we think they are incorrect. We observe failing EvoSuite tests for both the programs patched with the original Nopol patch and the selected new patch genertaed by running Nopol+UnsatGuided, which verifies our analysis.
