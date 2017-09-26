
## Human Patch 

```Java
diff --git a/src/java/org/apache/commons/math/optimization/linear/SimplexTableau.java b/src/java/org/apache/commons/math/optimization/linear/SimplexTableau.java
index b0d114e..0ab790c 100644
--- a/src/java/org/apache/commons/math/optimization/linear/SimplexTableau.java
+++ b/src/java/org/apache/commons/math/optimization/linear/SimplexTableau.java
@@ -272,10 +272,12 @@ class SimplexTableau implements Serializable {
     private Integer getBasicRow(final int col) {
         Integer row = null;
         for (int i = getNumObjectiveFunctions(); i < getHeight(); i++) {
+            if (MathUtils.equals(getEntry(i, col), 1.0, epsilon) && (row == null)) {
-            if (!MathUtils.equals(getEntry(i, col), 0.0, epsilon)) {
-                if (row == null) {
                 row = i;
+            } else if (!MathUtils.equals(getEntry(i, col), 0.0, epsilon)) {
-                } else {
                 return null;
-                }
             }
         }
         return row;

```


## Original Patch # Nopol 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
2 < matrix.length
```

Execution Time: 00:01 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
2 < matrix.length
```

Seed: 4

Execution Time: 00:51 (hh:mm)

Nb of EvoSuite Tests:65

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(!((org.apache.commons.math.optimization.linear.SimplexTableau.this.numArtificialVariables == artificialVar) && (maximize))) || ((org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables) != (matrix.length))
```

Seed: 12

Execution Time: 00:55 (hh:mm)

Nb of EvoSuite Tests:63

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
((matrix.length) != (2)) || (org.apache.commons.math.optimization.linear.SimplexTableau.this.epsilon <= artificialVar)
```

Seed: 18

Execution Time: 00:58 (hh:mm)

Nb of EvoSuite Tests:61

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(((org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables) != (matrix.length)) && ((org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables) != (matrix.length))) || (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables <= org.apache.commons.math.optimization.linear.SimplexTableau.this.epsilon)
```

Seed: 26

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:58

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(((org.apache.commons.math.optimization.linear.SimplexTableau.this.numArtificialVariables) != (artificialVar)) || (2 < org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables)) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.f!=null)
```

Seed: 28

Execution Time: 00:51 (hh:mm)

Nb of EvoSuite Tests:62

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
!((org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables <= 2) && (((2) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.constraints.size())) || (org.apache.commons.math.optimization.linear.SimplexTableau.this.restrictToNonNegative)))
```

Seed: 35

Execution Time: 00:55 (hh:mm)

Nb of EvoSuite Tests:60

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
!((org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables <= 2) && ((2) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.constraints.size())))
```

Seed: 41

Execution Time: 00:57 (hh:mm)

Nb of EvoSuite Tests:63

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
((matrix.length) != (2)) || (!(maximize))
```

Seed: 54

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:59

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(org.apache.commons.math.optimization.linear.SimplexTableau.this.epsilon <= zIndex) || ((constraint!=null) && (2 < constraints.size()))
```

Seed: 60

Execution Time: 00:59 (hh:mm)

Nb of EvoSuite Tests:61

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(((2) != (matrix.length)) || (org.apache.commons.math.optimization.linear.SimplexTableau.this.tableau!=null)) && (((2) != (matrix.length)) || (org.apache.commons.math.optimization.linear.SimplexTableau.this.tableau!=null))
```

Seed: 66

Execution Time: 00:57 (hh:mm)

Nb of EvoSuite Tests:68

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(((org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables) != (matrix.length)) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.f!=null)) || (0 == org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables)
```

Seed: 75

Execution Time: 00:57 (hh:mm)

Nb of EvoSuite Tests:65

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(2) != (matrix.length)
```

Seed: 83

Execution Time: 00:52 (hh:mm)

Nb of EvoSuite Tests:63

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(2) != (matrix.length)
```

Seed: 98

Execution Time: 00:58 (hh:mm)

Nb of EvoSuite Tests:63

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(!(maximize)) || ((org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables) != (1))
```

Seed: 100

Execution Time: 01:07 (hh:mm)

Nb of EvoSuite Tests:68

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(!((2 == org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables) && (maximize))) || (1 < row)
```

Seed: 104

Execution Time: 00:56 (hh:mm)

Nb of EvoSuite Tests:62

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
!(((org.apache.commons.math.optimization.linear.SimplexTableau.this.constraints.size()) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables)) && (zIndex < org.apache.commons.math.optimization.linear.SimplexTableau.this.epsilon))
```

Seed: 111

Execution Time: 00:53 (hh:mm)

Nb of EvoSuite Tests:61

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
!(((zIndex == 0) || (zIndex == 0)) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables <= 2))
```

Seed: 113

Execution Time: 00:56 (hh:mm)

Nb of EvoSuite Tests:64

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(2 < matrix.length) || ((matrix.length) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables))
```

Seed: 120

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:59

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
((matrix.length) != (2)) || ((!(maximize)) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.constraints.size() < height))
```

Seed: 128

Execution Time: 00:53 (hh:mm)

Nb of EvoSuite Tests:62

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(constraints.size() == 2) || (((org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables) != (2)) && (constraint!=null))
```

Seed: 135

Execution Time: 00:52 (hh:mm)

Nb of EvoSuite Tests:63

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(org.apache.commons.math.optimization.linear.SimplexTableau.this.epsilon <= zIndex) || (!(org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables < org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables))
```

Seed: 143

Execution Time: 00:51 (hh:mm)

Nb of EvoSuite Tests:64

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
((2) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables)) || (2 < matrix.length)
```

Seed: 150

Execution Time: 00:54 (hh:mm)

Nb of EvoSuite Tests:62

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(org.apache.commons.math.optimization.linear.SimplexTableau.this.epsilon <= zIndex) || ((maximize) && (org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables == org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables))
```

Seed: 153

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:55

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
!((org.apache.commons.math.optimization.linear.SimplexTableau.this.numArtificialVariables < org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables) && ((constraints.isEmpty()) || (height == org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables)))
```

Seed: 161

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:59

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(2) != (height)
```

Seed: 166

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:65

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
!((org.apache.commons.math.optimization.linear.SimplexTableau.this.epsilon < org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables) && (1 == org.apache.commons.math.optimization.linear.SimplexTableau.this.constraints.size()))
```

Seed: 173

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:59

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(2 < org.apache.commons.math.optimization.linear.SimplexTableau.this.epsilon) || (!((matrix.length <= org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables) && ((artificialVar) != (org.apache.commons.math.optimization.linear.SimplexTableau.this.numSlackVariables))))
```

Seed: 180

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:64

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(((2) != (matrix.length)) && ((2) != (matrix.length))) || (matrix.length < org.apache.commons.math.optimization.linear.SimplexTableau.this.numDecisionVariables)
```

Seed: 181

Execution Time: 00:55 (hh:mm)

Nb of EvoSuite Tests:64

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(matrix.length) != (2)
```

Seed: 186

Execution Time: 00:46 (hh:mm)

Nb of EvoSuite Tests:64

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math.optimization.linear.SimplexTableau : 161

Patch type: PRECONDITION

```Java
(!((org.apache.commons.math.optimization.linear.SimplexTableau.this.numArtificialVariables <= org.apache.commons.math.optimization.linear.SimplexTableau.this.epsilon) && (maximize))) || ((2) != (matrix.length))
```

Seed: 193

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:60

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:52 (hh:mm)

Average Nb of EvoSuite Tests:62.2

Average Nb of Removed Tests:0

Running Nopol+UnsatGuided changes the original patch for 29 of the 30 seeds. The human patch changes the logic of the body of a for loop, the original patch and the newly generated patches by running Nopol+UnsatGuided add a precondition before the same assignement statement, we think they are incorrect. We observe failing EvoSuite tests for both the programs patched with the original Nopol patch and the new patches genertaed by running Nopol+UnsatGuided, which verifies our analysis.
