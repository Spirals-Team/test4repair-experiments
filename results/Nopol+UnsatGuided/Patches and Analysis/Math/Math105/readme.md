
## Human Patch 

```Java
diff --git a/src/java/org/apache/commons/math/stat/regression/SimpleRegression.java b/src/java/org/apache/commons/math/stat/regression/SimpleRegression.java
index d9fa592..dcf512b 100644
--- a/src/java/org/apache/commons/math/stat/regression/SimpleRegression.java
+++ b/src/java/org/apache/commons/math/stat/regression/SimpleRegression.java
@@ -261,7 +261,7 @@ public class SimpleRegression implements Serializable {
      * @return sum of squared errors associated with the regression model
      */
     public double getSumSquaredErrors() {
+        return Math.max(0d, sumYY - sumXY * sumXY / sumXX);
-        return sumYY - sumXY * sumXY / sumXX;
     }
 
     /**

```


## Original Patch # Nopol 

org.apache.commons.math.stat.regression.SimpleRegression : 115

Patch type: PRECONDITION

```Java
(dy <= org.apache.commons.math.stat.regression.SimpleRegression.this.n) || (1 < org.apache.commons.math.stat.regression.SimpleRegression.this.sumXX)
```

Execution Time: 00:09 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
(y <= org.apache.commons.math.stat.regression.SimpleRegression.this.xbar) || (!((2 < org.apache.commons.math.stat.regression.SimpleRegression.this.xbar) && (2 < org.apache.commons.math.stat.regression.SimpleRegression.this.xbar)))
```

Seed: 4

Execution Time: 02:57 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
(y <= x) || (!((org.apache.commons.math.stat.regression.SimpleRegression.this.sumXX < x) && ((2) != (y))))
```

Seed: 12

Execution Time: 04:22 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
((y < x) && (y < x)) || (y <= 10)
```

Seed: 18

Execution Time: 04:33 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 115

Patch type: PRECONDITION

```Java
!(((10 <= x) || (10 <= x)) && (org.apache.commons.math.stat.regression.SimpleRegression.this.sumX < org.apache.commons.math.stat.regression.SimpleRegression.this.ybar))
```

Seed: 26

Execution Time: 06:01 (hh:mm)

Nb of EvoSuite Tests:49

Nb of Removed Tests:2


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
(org.apache.commons.math.stat.regression.SimpleRegression.this.xbar < 2) || (y <= org.apache.commons.math.stat.regression.SimpleRegression.this.xbar)
```

Seed: 28

Execution Time: 04:25 (hh:mm)

Nb of EvoSuite Tests:43

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
!((-1 == 1) || ((org.apache.commons.math.stat.regression.SimpleRegression.this.xbar < y) && (2 <= org.apache.commons.math.stat.regression.SimpleRegression.this.xbar)))
```

Seed: 35

Execution Time: 05:55 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Removed Tests:1


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
(!(10 < x)) || (y <= x)
```

Seed: 41

Execution Time: 00:32 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 114

Patch type: PRECONDITION

```Java
(x < 10) || (dx <= org.apache.commons.math.stat.regression.SimpleRegression.this.sumXX)
```

Seed: 54

Execution Time: 04:30 (hh:mm)

Nb of EvoSuite Tests:44

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
(y <= 10) || (!(((x) != (org.apache.commons.math.stat.regression.SimpleRegression.this.sumX)) && (org.apache.commons.math.stat.regression.SimpleRegression.this.xbar < y)))
```

Seed: 60

Execution Time: 00:40 (hh:mm)

Nb of EvoSuite Tests:44

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
(y <= org.apache.commons.math.stat.regression.SimpleRegression.this.xbar) || (x < 3)
```

Seed: 66

Execution Time: 00:37 (hh:mm)

Nb of EvoSuite Tests:48

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided (selected for manual analysis)

org.apache.commons.math.stat.regression.SimpleRegression : 115

Patch type: PRECONDITION

```Java
((!(org.apache.commons.math.stat.regression.SimpleRegression.this.sumX < org.apache.commons.math.stat.regression.SimpleRegression.this.ybar)) && (!(org.apache.commons.math.stat.regression.SimpleRegression.this.sumX < org.apache.commons.math.stat.regression.SimpleRegression.this.ybar))) || (x <= 10)
```

Seed: 75

Execution Time: 06:06 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
(y <= x) || (x < 3)
```

Seed: 83

Execution Time: 00:39 (hh:mm)

Nb of EvoSuite Tests:40

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
(x < 2) || (y <= x)
```

Seed: 98

Execution Time: 05:40 (hh:mm)

Nb of EvoSuite Tests:44

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
(((2) != (org.apache.commons.math.stat.regression.SimpleRegression.this.ybar)) && (y < org.apache.commons.math.stat.regression.SimpleRegression.this.xbar)) || (org.apache.commons.math.stat.regression.SimpleRegression.this.xbar <= 3)
```

Seed: 100

Execution Time: 05:50 (hh:mm)

Nb of EvoSuite Tests:42

Nb of Removed Tests:1


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
(!(x < y)) || (org.apache.commons.math.stat.regression.SimpleRegression.this.xbar <= 1)
```

Seed: 104

Execution Time: 04:48 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
!((3 <= org.apache.commons.math.stat.regression.SimpleRegression.this.xbar) && (org.apache.commons.math.stat.regression.SimpleRegression.this.xbar < y))
```

Seed: 111

Execution Time: 05:39 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
((x <= 10) || (!(x < y))) && ((x <= 10) || (!(x < y)))
```

Seed: 113

Execution Time: 04:35 (hh:mm)

Nb of EvoSuite Tests:44

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
(y <= x) || (y < 10)
```

Seed: 120

Execution Time: 05:17 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
!((x < y) && ((10 <= y) || (x == 2)))
```

Seed: 128

Execution Time: 05:42 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 114

Patch type: PRECONDITION

```Java
(org.apache.commons.math.stat.regression.SimpleRegression.this.xbar < 10) || (dx <= org.apache.commons.math.stat.regression.SimpleRegression.this.sumXX)
```

Seed: 135

Execution Time: 04:28 (hh:mm)

Nb of EvoSuite Tests:42

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
(!(org.apache.commons.math.stat.regression.SimpleRegression.this.xbar < y)) || ((org.apache.commons.math.stat.regression.SimpleRegression.this.xbar <= 2) && (org.apache.commons.math.stat.regression.SimpleRegression.this.xbar <= 2))
```

Seed: 143

Execution Time: 06:23 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Removed Tests:2


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 115

Patch type: PRECONDITION

```Java
!((org.apache.commons.math.stat.regression.SimpleRegression.this.sumYY <= org.apache.commons.math.stat.regression.SimpleRegression.this.xbar) && (org.apache.commons.math.stat.regression.SimpleRegression.this.sumXX < org.apache.commons.math.stat.regression.SimpleRegression.this.sumXY))
```

Seed: 150

Execution Time: 05:17 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
(y <= org.apache.commons.math.stat.regression.SimpleRegression.this.xbar) || ((!(10 < x)) && ((y) != (org.apache.commons.math.stat.regression.SimpleRegression.this.ybar)))
```

Seed: 153

Execution Time: 06:25 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
(x <= 2) || (!(x < y))
```

Seed: 161

Execution Time: 03:55 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 114

Patch type: PRECONDITION

```Java
((!(org.apache.commons.math.stat.regression.SimpleRegression.this.n < dy)) && (!(org.apache.commons.math.stat.regression.SimpleRegression.this.n < dy))) || (org.apache.commons.math.stat.regression.SimpleRegression.this.n <= org.apache.commons.math.stat.regression.SimpleRegression.this.sumXX)
```

Seed: 166

Execution Time: 06:00 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 115

Patch type: PRECONDITION

```Java
(org.apache.commons.math.stat.regression.SimpleRegression.this.ybar < org.apache.commons.math.stat.regression.SimpleRegression.this.sumYY) || (org.apache.commons.math.stat.regression.SimpleRegression.this.sumYY <= 2)
```

Seed: 173

Execution Time: 05:15 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
(!(x < y)) || (x <= 10)
```

Seed: 180

Execution Time: 01:35 (hh:mm)

Nb of EvoSuite Tests:47

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
(!(2 < x)) || (y <= org.apache.commons.math.stat.regression.SimpleRegression.this.xbar)
```

Seed: 181

Execution Time: 06:00 (hh:mm)

Nb of EvoSuite Tests:46

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 108

Patch type: PRECONDITION

```Java
(x + x <= 3) || (y < x + x)
```

Seed: 186

Execution Time: 04:43 (hh:mm)

Nb of EvoSuite Tests:42

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math.stat.regression.SimpleRegression : 115

Patch type: PRECONDITION

```Java
(org.apache.commons.math.stat.regression.SimpleRegression.this.ybar <= org.apache.commons.math.stat.regression.SimpleRegression.this.sumX) || (org.apache.commons.math.stat.regression.SimpleRegression.this.xbar < 2)
```

Seed: 193

Execution Time: 05:39 (hh:mm)

Nb of EvoSuite Tests:45

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 04:29 (hh:mm)

Average Nb of EvoSuite Tests:45.13

Average Nb of Removed Tests:0.2

Running Nopol+UnsatGuided changes the original patch for 29 of the 30 seeds. The human patch adds return 0 if the result of the method getSumSquaredErrors() is lower than 0, the original patch and the selected newly generated patch by running Nopol+UnsatGuided add a precondition to the statement, we think they are incorrect. We observe failing EvoSuite tests for both the programs patched with the original Nopol patch and the selected new patch genertaed by running Nopol+UnsatGuided, which verifies our analysis.
