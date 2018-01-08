
## Human Patch 

```Java
diff --git a/src/java/org/apache/commons/math/optimization/linear/SimplexTableau.java b/src/java/org/apache/commons/math/optimization/linear/SimplexTableau.java
index a6d7419..3bcb17f 100644
--- a/src/java/org/apache/commons/math/optimization/linear/SimplexTableau.java
+++ b/src/java/org/apache/commons/math/optimization/linear/SimplexTableau.java
@@ -326,18 +326,19 @@ class SimplexTableau implements Serializable {
         Integer basicRow =
             getBasicRow(getNumObjectiveFunctions() + getOriginalNumDecisionVariables());
         double mostNegative = basicRow == null ? 0 : getEntry(basicRow, getRhsOffset());
+        Set<Integer> basicRows = new HashSet<Integer>();
         for (int i = 0; i < coefficients.length; i++) {
             basicRow = getBasicRow(getNumObjectiveFunctions() + i);
+            if (basicRows.contains(basicRow)) {
                 // if multiple variables can take a given value 
                 // then we choose the first and set the rest equal to 0
+                coefficients[i] = 0;
+            } else {
+                basicRows.add(basicRow);
                 coefficients[i] =
                     (basicRow == null ? 0 : getEntry(basicRow, getRhsOffset())) -
                     (restrictToNonNegative ? 0 : mostNegative);
-            if (basicRow != null) {
-                for (int j = getNumObjectiveFunctions(); j < getNumObjectiveFunctions() + i; j++) {
-                    if (tableau.getEntry(basicRow, j) == 1) {
-                         coefficients[i] = 0;
-                    }
-                }
             }
         }
         return new RealPointValuePair(coefficients, f.getValue(coefficients));

```


## Original Patch # Nopol 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Execution Time: 00:00 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 4

Execution Time: 00:26 (hh:mm)

Nb of EvoSuite Tests:61

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 12

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:66

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 18

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:71

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 26

Execution Time: 00:29 (hh:mm)

Nb of EvoSuite Tests:71

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 28

Execution Time: 00:25 (hh:mm)

Nb of EvoSuite Tests:63

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.constraints.size())
```

Seed: 35

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:63

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided (selected for manual analysis)

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
org.apache.commons.math.optimization.linear.SimplexTableau.this.constraints.size() < coefficients.length
```

Seed: 41

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:65

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 54

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:64

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 60

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:65

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.constraints.size())
```

Seed: 66

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:56

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 75

Execution Time: 00:25 (hh:mm)

Nb of EvoSuite Tests:60

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 83

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:57

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 98

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:65

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 100

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:56

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 104

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:66

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 111

Execution Time: 00:29 (hh:mm)

Nb of EvoSuite Tests:69

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 113

Execution Time: 00:25 (hh:mm)

Nb of EvoSuite Tests:63

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 120

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:63

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 128

Execution Time: 00:26 (hh:mm)

Nb of EvoSuite Tests:63

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 135

Execution Time: 00:26 (hh:mm)

Nb of EvoSuite Tests:60

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 143

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:66

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 150

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:59

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 153

Execution Time: 00:25 (hh:mm)

Nb of EvoSuite Tests:63

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables) != (coefficients.length)
```

Seed: 161

Execution Time: 00:26 (hh:mm)

Nb of EvoSuite Tests:63

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 166

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:60

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 173

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:66

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 180

Execution Time: 00:26 (hh:mm)

Nb of EvoSuite Tests:62

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(org.apache.commons.math.optimization.linear.SimplexTableau.this.constraints.size()) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables)
```

Seed: 181

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:60

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(org.apache.commons.math.optimization.linear.SimplexTableau.this.constraints.size()) != (coefficients.length)
```

Seed: 186

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:68

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 339

Patch type: PRECONDITION

```Java
(coefficients.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 193

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:56

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:26 (hh:mm)

Average Nb of EvoSuite Tests:63

Average Nb of Removed Tests:0

Running Nopol+UnsatGuided changes the original patch for 6 of the 30 seeds. The human patch involves multiple changes to the code, the original patch and the selected newly generated patch by running Nopol+UnsatGuided add a precondition before the same statement, we think they are incorrect. We observe failing EvoSuite tests for both the programs patched with the original Nopol patch and the selected new patch genertaed by running Nopol+UnsatGuided, which verifies our analysis. 
