
## Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/optimization/linear/SimplexTableau.java b/src/main/java/org/apache/commons/math/optimization/linear/SimplexTableau.java
index d96c916..02c22b5 100644
--- a/src/main/java/org/apache/commons/math/optimization/linear/SimplexTableau.java
+++ b/src/main/java/org/apache/commons/math/optimization/linear/SimplexTableau.java
@@ -407,12 +407,10 @@ class SimplexTableau implements Serializable {
             continue;
           }
           Integer basicRow = getBasicRow(colIndex);
+          if (basicRow != null && basicRow == 0) {
               // if the basic row is found to be the objective function row
               // set the coefficient to 0 -> this case handles unconstrained 
               // variables that are still part of the objective function
+              coefficients[i] = 0;
+          } else if (basicRows.contains(basicRow)) {
-          if (basicRows.contains(basicRow)) {
               // if multiple variables can take a given value
               // then we choose the first and set the rest equal to 0
               coefficients[i] = 0 - (restrictToNonNegative ? 0 : mostNegative);

```


## Original Patch # Nopol 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
(!(org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative)) || ((org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative) && (org.apache.commons.math.optimization.linear.SimplexTableau.DEFAULT_ULPS <= org.apache.commons.math.optimization.linear.SimplexTableau.this.columnLabels.size()))
```

Execution Time: 00:04 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
!((org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables == 0) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative))
```

Seed: 4

Execution Time: 03:54 (hh:mm)

Nb of EvoSuite Tests:61

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
(!(org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative)) || ((org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative) && (org.apache.commons.math.optimization.linear.SimplexTableau.DEFAULT_ULPS <= org.apache.commons.math.optimization.linear.SimplexTableau.this.columnLabels.size()))
```

Seed: 12

Execution Time: 03:35 (hh:mm)

Nb of EvoSuite Tests:57

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
((!(org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative)) && (!(org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative))) || ((org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables) != (0))
```

Seed: 18

Execution Time: 03:50 (hh:mm)

Nb of EvoSuite Tests:63

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
(2 < org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables) || (!((org.apache.commons.math.optimization.linear.SimplexTableau.NEGATIVE_VAR_COLUMN_LABEL.length()) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numArtificialVariables)))
```

Seed: 26

Execution Time: 03:45 (hh:mm)

Nb of EvoSuite Tests:61

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
((org.apache.commons.math.optimization.linear.SimplexTableau.NEGATIVE_VAR_COLUMN_LABEL.length()) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables)) || (org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables <= org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 28

Execution Time: 03:39 (hh:mm)

Nb of EvoSuite Tests:60

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
!((org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables < 1))
```

Seed: 35

Execution Time: 03:33 (hh:mm)

Nb of EvoSuite Tests:55

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
(!((org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.numArtificialVariables == 1))) || (10 <= 0)
```

Seed: 41

Execution Time: 04:03 (hh:mm)

Nb of EvoSuite Tests:64

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
(2 < org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables) || (!(org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative))
```

Seed: 54

Execution Time: 03:48 (hh:mm)

Nb of EvoSuite Tests:60

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
!((1 == org.apache.commons.math.optimization.linear.SimplexTableau.this.constraints.size()) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative))
```

Seed: 60

Execution Time: 03:47 (hh:mm)

Nb of EvoSuite Tests:59

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
!((0 == org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative))
```

Seed: 66

Execution Time: 03:57 (hh:mm)

Nb of EvoSuite Tests:62

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
(!(org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative)) || ((org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative) && (org.apache.commons.math.optimization.linear.SimplexTableau.DEFAULT_ULPS <= org.apache.commons.math.optimization.linear.SimplexTableau.this.columnLabels.size()))
```

Seed: 75

Execution Time: 03:45 (hh:mm)

Nb of EvoSuite Tests:58

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
(org.apache.commons.math.optimization.linear.SimplexTableau.DEFAULT_ULPS <= org.apache.commons.math.optimization.linear.SimplexTableau.this.columnLabels.size()) || ((!(org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative)) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.tableau!=null))
```

Seed: 83

Execution Time: 03:33 (hh:mm)

Nb of EvoSuite Tests:56

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
(org.apache.commons.math.optimization.linear.SimplexTableau.this.numArtificialVariables == org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables) || ((2) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables))
```

Seed: 98

Execution Time: 04:05 (hh:mm)

Nb of EvoSuite Tests:62

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided (selected for manual analysis)

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
!((org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables < 1) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative))
```

Seed: 100

Execution Time: 03:29 (hh:mm)

Nb of EvoSuite Tests:55

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
!((org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables < org.apache.commons.math.optimization.linear.SimplexTableau.this.epsilon) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative))
```

Seed: 104

Execution Time: 03:43 (hh:mm)

Nb of EvoSuite Tests:58

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables == 0)) || (org.apache.commons.math.optimization.linear.SimplexTableau.this.columnLabels.isEmpty()))
```

Seed: 111

Execution Time: 03:48 (hh:mm)

Nb of EvoSuite Tests:60

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
!((org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables < org.apache.commons.math.optimization.linear.SimplexTableau.this.epsilon) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative))
```

Seed: 113

Execution Time: 04:16 (hh:mm)

Nb of EvoSuite Tests:65

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
((!(org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative)) || ((0) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables))) && (org.apache.commons.math.optimization.linear.SimplexTableau.NEGATIVE_VAR_COLUMN_LABEL!=null)
```

Seed: 120

Execution Time: 03:48 (hh:mm)

Nb of EvoSuite Tests:60

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
(!(org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative)) || ((org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative) && (org.apache.commons.math.optimization.linear.SimplexTableau.DEFAULT_ULPS <= org.apache.commons.math.optimization.linear.SimplexTableau.this.columnLabels.size()))
```

Seed: 128

Execution Time: 03:47 (hh:mm)

Nb of EvoSuite Tests:59

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
(org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables == org.apache.commons.math.optimization.linear.SimplexTableau.this.constraints.size()) || (!(org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables <= 2))
```

Seed: 135

Execution Time: 03:58 (hh:mm)

Nb of EvoSuite Tests:60

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
(!(org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative)) || ((org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative) && (org.apache.commons.math.optimization.linear.SimplexTableau.DEFAULT_ULPS <= org.apache.commons.math.optimization.linear.SimplexTableau.this.columnLabels.size()))
```

Seed: 143

Execution Time: 04:18 (hh:mm)

Nb of EvoSuite Tests:58

Nb of Removed Tests:1


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
((org.apache.commons.math.optimization.linear.SimplexTableau.NEGATIVE_VAR_COLUMN_LABEL.length()) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables)) || (org.apache.commons.math.optimization.linear.SimplexTableau.this.numArtificialVariables == 2)
```

Seed: 150

Execution Time: 04:07 (hh:mm)

Nb of EvoSuite Tests:57

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 419

Patch type: PRECONDITION

```Java
(org.apache.commons.math.optimization.linear.SimplexTableau.this.constraints.isEmpty()) || (org.apache.commons.math.optimization.linear.SimplexTableau.this.epsilon <= org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 153

Execution Time: 04:17 (hh:mm)

Nb of EvoSuite Tests:56

Nb of Removed Tests:1


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
!((org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables < org.apache.commons.math.optimization.linear.SimplexTableau.this.epsilon) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative))
```

Seed: 161

Execution Time: 03:57 (hh:mm)

Nb of EvoSuite Tests:56

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
(!(org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative)) || ((org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative) && (org.apache.commons.math.optimization.linear.SimplexTableau.DEFAULT_ULPS <= org.apache.commons.math.optimization.linear.SimplexTableau.this.columnLabels.size()))
```

Seed: 166

Execution Time: 04:05 (hh:mm)

Nb of EvoSuite Tests:56

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
(!((org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables <= org.apache.commons.math.optimization.linear.SimplexTableau.this.epsilon) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative))) || (org.apache.commons.math.optimization.linear.SimplexTableau.this.constraints.isEmpty())
```

Seed: 173

Execution Time: 04:12 (hh:mm)

Nb of EvoSuite Tests:59

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
!((org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables < org.apache.commons.math.optimization.linear.SimplexTableau.this.epsilon))
```

Seed: 180

Execution Time: 04:10 (hh:mm)

Nb of EvoSuite Tests:58

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
(!(org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative)) || ((0 < org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative))
```

Seed: 181

Execution Time: 04:22 (hh:mm)

Nb of EvoSuite Tests:62

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
(!(org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative)) || ((org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative) && (org.apache.commons.math.optimization.linear.SimplexTableau.DEFAULT_ULPS <= org.apache.commons.math.optimization.linear.SimplexTableau.this.columnLabels.size()))
```

Seed: 186

Execution Time: 04:13 (hh:mm)

Nb of EvoSuite Tests:59

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 347

Patch type: PRECONDITION

```Java
(!(org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative)) || ((org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative) && (org.apache.commons.math.optimization.linear.SimplexTableau.DEFAULT_ULPS <= org.apache.commons.math.optimization.linear.SimplexTableau.this.columnLabels.size()))
```

Seed: 193

Execution Time: 04:02 (hh:mm)

Nb of EvoSuite Tests:56

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 03:55 (hh:mm)

Average Nb of EvoSuite Tests:59.07

Average Nb of Removed Tests:0.07

Running Nopol+UnsatGuided changes the original patch for 24 of the 30 seeds. The human patch manages the case when a value is equals to 0 or null, the original and selected newly generated patch by running Nopol+UnsatGuided all add a precondition to the same statement, we think they are incorrect. We observe failing EvoSuite tests for both programs patched with the original Nopol patch and the selected new patch genertaed by running Nopol+UnsatGuided, which verifies our analysis.
