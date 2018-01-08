
## Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math3/optimization/linear/SimplexTableau.java b/src/main/java/org/apache/commons/math3/optimization/linear/SimplexTableau.java
index 327b2ae..9a6993a 100644
--- a/src/main/java/org/apache/commons/math3/optimization/linear/SimplexTableau.java
+++ b/src/main/java/org/apache/commons/math3/optimization/linear/SimplexTableau.java
@@ -335,7 +335,7 @@ class SimplexTableau implements Serializable {
         // positive cost non-artificial variables
         for (int i = getNumObjectiveFunctions(); i < getArtificialVariableOffset(); i++) {
             final double entry = tableau.getEntry(0, i);
+            if (Precision.compareTo(entry, 0d, epsilon) > 0) {
-            if (Precision.compareTo(entry, 0d, maxUlps) > 0) {
                 columnsToDrop.add(i);
             }
         }

```


## Original Patch # Nopol 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(org.apache.commons.math3.optimization.linear.SimplexTableau.NEGATIVE_VAR_COLUMN_LABEL.length()) != (org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables)
```

Execution Time: 00:13 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(2) != (org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables)
```

Seed: 4

Execution Time: 10:01 (hh:mm)

Nb of EvoSuite Tests:55

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(org.apache.commons.math3.optimization.linear.SimplexTableau.this.constraints.size()) != (org.apache.commons.math3.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 12

Execution Time: 11:00 (hh:mm)

Nb of EvoSuite Tests:61

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables) != (2)
```

Seed: 18

Execution Time: 09:27 (hh:mm)

Nb of EvoSuite Tests:52

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables) != (2)
```

Seed: 26

Execution Time: 10:34 (hh:mm)

Nb of EvoSuite Tests:58

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(2) != (org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables)
```

Seed: 28

Execution Time: 10:04 (hh:mm)

Nb of EvoSuite Tests:58

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables) != (org.apache.commons.math3.optimization.linear.SimplexTableau.NEGATIVE_VAR_COLUMN_LABEL.length())
```

Seed: 35

Execution Time: 10:48 (hh:mm)

Nb of EvoSuite Tests:58

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables) != (2)
```

Seed: 41

Execution Time: 10:34 (hh:mm)

Nb of EvoSuite Tests:61

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(org.apache.commons.math3.optimization.linear.SimplexTableau.NEGATIVE_VAR_COLUMN_LABEL.length()) != (org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables)
```

Seed: 54

Execution Time: 11:30 (hh:mm)

Nb of EvoSuite Tests:63

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided (selected for manual analysis)

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
org.apache.commons.math3.optimization.linear.SimplexTableau.this.numSlackVariables < org.apache.commons.math3.optimization.linear.SimplexTableau.this.constraints.size()
```

Seed: 60

Execution Time: 10:44 (hh:mm)

Nb of EvoSuite Tests:59

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(2) != (org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables)
```

Seed: 66

Execution Time: 11:10 (hh:mm)

Nb of EvoSuite Tests:63

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables) != (2)
```

Seed: 75

Execution Time: 10:57 (hh:mm)

Nb of EvoSuite Tests:59

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables) != (org.apache.commons.math3.optimization.linear.SimplexTableau.NEGATIVE_VAR_COLUMN_LABEL.length())
```

Seed: 83

Execution Time: 10:33 (hh:mm)

Nb of EvoSuite Tests:57

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(2) != (org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables)
```

Seed: 98

Execution Time: 11:23 (hh:mm)

Nb of EvoSuite Tests:64

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(2) != (org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables)
```

Seed: 100

Execution Time: 09:53 (hh:mm)

Nb of EvoSuite Tests:54

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables) != (org.apache.commons.math3.optimization.linear.SimplexTableau.NEGATIVE_VAR_COLUMN_LABEL.length())
```

Seed: 104

Execution Time: 08:46 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(2) != (org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables)
```

Seed: 111

Execution Time: 10:19 (hh:mm)

Nb of EvoSuite Tests:56

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
org.apache.commons.math3.optimization.linear.SimplexTableau.this.constraints.size() == org.apache.commons.math3.optimization.linear.SimplexTableau.this.numDecisionVariables
```

Seed: 113

Execution Time: 12:36 (hh:mm)

Nb of EvoSuite Tests:60

Nb of Removed Tests:2


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
org.apache.commons.math3.optimization.linear.SimplexTableau.this.constraints.size() == org.apache.commons.math3.optimization.linear.SimplexTableau.this.numDecisionVariables
```

Seed: 120

Execution Time: 12:06 (hh:mm)

Nb of EvoSuite Tests:59

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
org.apache.commons.math3.optimization.linear.SimplexTableau.this.constraints.size() == org.apache.commons.math3.optimization.linear.SimplexTableau.this.numDecisionVariables
```

Seed: 128

Execution Time: 12:43 (hh:mm)

Nb of EvoSuite Tests:58

Nb of Removed Tests:2


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
org.apache.commons.math3.optimization.linear.SimplexTableau.this.constraints.size() == org.apache.commons.math3.optimization.linear.SimplexTableau.this.numDecisionVariables
```

Seed: 135

Execution Time: 11:55 (hh:mm)

Nb of EvoSuite Tests:60

Nb of Removed Tests:1


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(org.apache.commons.math3.optimization.linear.SimplexTableau.this.numSlackVariables) != (org.apache.commons.math3.optimization.linear.SimplexTableau.this.constraints.size())
```

Seed: 143

Execution Time: 07:16 (hh:mm)

Nb of EvoSuite Tests:60

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(2) != (org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables)
```

Seed: 150

Execution Time: 07:24 (hh:mm)

Nb of EvoSuite Tests:60

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(2) != (org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables)
```

Seed: 153

Execution Time: 07:07 (hh:mm)

Nb of EvoSuite Tests:57

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
org.apache.commons.math3.optimization.linear.SimplexTableau.this.constraints.size() == org.apache.commons.math3.optimization.linear.SimplexTableau.this.numDecisionVariables
```

Seed: 161

Execution Time: 12:19 (hh:mm)

Nb of EvoSuite Tests:60

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
org.apache.commons.math3.optimization.linear.SimplexTableau.this.constraints.size() == org.apache.commons.math3.optimization.linear.SimplexTableau.this.numDecisionVariables
```

Seed: 166

Execution Time: 13:29 (hh:mm)

Nb of EvoSuite Tests:60

Nb of Removed Tests:4


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
org.apache.commons.math3.optimization.linear.SimplexTableau.this.constraints.size() == org.apache.commons.math3.optimization.linear.SimplexTableau.this.numDecisionVariables
```

Seed: 173

Execution Time: 13:27 (hh:mm)

Nb of EvoSuite Tests:61

Nb of Removed Tests:3


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
org.apache.commons.math3.optimization.linear.SimplexTableau.this.constraints.size() == org.apache.commons.math3.optimization.linear.SimplexTableau.this.numDecisionVariables
```

Seed: 180

Execution Time: 13:57 (hh:mm)

Nb of EvoSuite Tests:58

Nb of Removed Tests:7


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables) != (org.apache.commons.math3.optimization.linear.SimplexTableau.NEGATIVE_VAR_COLUMN_LABEL.length())
```

Seed: 181

Execution Time: 07:19 (hh:mm)

Nb of EvoSuite Tests:57

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(org.apache.commons.math3.optimization.linear.SimplexTableau.NEGATIVE_VAR_COLUMN_LABEL.length()) != (org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables)
```

Seed: 186

Execution Time: 06:57 (hh:mm)

Nb of EvoSuite Tests:56

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math3.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(2) != (org.apache.commons.math3.optimization.linear.SimplexTableau.this.numArtificialVariables)
```

Seed: 193

Execution Time: 06:58 (hh:mm)

Nb of EvoSuite Tests:56

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 10:27 (hh:mm)

Average Nb of EvoSuite Tests:58.3

Average Nb of Removed Tests:0.63

Running Nopol+UnsatGuided changes the original patch for 28 of the 30 seeds. The human patch changes the incorrect parameter in an if condition, the original patch and the selected newly generated patch by running Nopol+UnsatGuided add a precondition before the buggy statement, the precondition is true for the usual case but false for the failing assert, we think they are incorrect. We observe failing EvoSuite tests for both programs patched with the original Nopol patch and the selected new patch genertaed by running Nopol+UnsatGuided, which verifies our analysis.
