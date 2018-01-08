
## Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/stat/correlation/PearsonsCorrelation.java b/src/main/java/org/apache/commons/math/stat/correlation/PearsonsCorrelation.java
index dc83314..83b4c41 100644
--- a/src/main/java/org/apache/commons/math/stat/correlation/PearsonsCorrelation.java
+++ b/src/main/java/org/apache/commons/math/stat/correlation/PearsonsCorrelation.java
@@ -168,7 +168,7 @@ public class PearsonsCorrelation {
                 } else {
                     double r = correlationMatrix.getEntry(i, j);
                     double t = Math.abs(r * Math.sqrt((nObs - 2)/(1 - r * r)));
+                    out[i][j] = 2 * tDistribution.cumulativeProbability(-t);
-                    out[i][j] = 2 * (1 - tDistribution.cumulativeProbability(t));
                 }
             }
         }

```


## Original Patch # Nopol 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 193

Patch type: PRECONDITION

```Java
2 < nVars
```

Execution Time: 00:00 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
((nVars) != (2)) || ((org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs) - (2 + nVars) <= 2 + nVars)
```

Seed: 4

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Removed Tests:2


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(nVars) != (2)
```

Seed: 12

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs == nVars) || ((nVars) != (2))
```

Seed: 18

Execution Time: 00:14 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:3


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(nVars) != (2)
```

Seed: 26

Execution Time: 00:08 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs <= 2) || ((nVars) != (2))
```

Seed: 28

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
((2) - (-1 + -1) < nVars) || (org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs == (2) - (-1 + -1))
```

Seed: 35

Execution Time: 00:13 (hh:mm)

Nb of EvoSuite Tests:32

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
!((nVars <= 2) && (((org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs) - (2)) != (2 + nVars)))
```

Seed: 41

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:2


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
((org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs + -1) - (2) < 2) || (((nVars) != (2)) && (outMatrix!=null))
```

Seed: 54

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:32

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(nVars) != (2)
```

Seed: 60

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:1


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(matrix!=null) && (((nVars) != (2)) || (!(nVars + nVars < (org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs) - (nVars + nVars))))
```

Seed: 66

Execution Time: 00:14 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Removed Tests:4


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(2) != (nVars)
```

Seed: 75

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:1


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs == nVars) || (((nVars) != (2)) && ((nVars) != (2)))
```

Seed: 83

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Removed Tests:1


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(nVars) != (2)
```

Seed: 98

Execution Time: 00:09 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(2) != (nVars)
```

Seed: 100

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Removed Tests:1


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
((2 < nVars) && (2 < nVars)) || (org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs <= 2)
```

Seed: 104

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:1


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(2) != (nVars)
```

Seed: 111

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:1


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs <= 2) || (!(2 == nVars))
```

Seed: 113

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:2


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
((2 < nVars) && (2 < nVars)) || (!(((org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs) - (2 + nVars)) != (2 + nVars)))
```

Seed: 120

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided (selected for manual analysis)

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(nVars + 2 == org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs) || (!(nVars <= 2))
```

Seed: 128

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:1


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs <= nVars) || ((nVars) != (2))
```

Seed: 135

Execution Time: 00:08 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(2) != (nVars)
```

Seed: 143

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
((org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs) - (1) == nVars) || (2 <= nVars + -1)
```

Seed: 150

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(2) != (nVars)
```

Seed: 153

Execution Time: 00:15 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:2


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
!((2 == nVars) && (nVars < org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs))
```

Seed: 161

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Removed Tests:1


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
!((2 == nVars) && (((2) != (org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs)) || ((2) != (org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs))))
```

Seed: 166

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(2) != (nVars)
```

Seed: 173

Execution Time: 00:13 (hh:mm)

Nb of EvoSuite Tests:32

Nb of Removed Tests:2


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(nVars == -1 + org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs) || (2 < nVars)
```

Seed: 180

Execution Time: 00:13 (hh:mm)

Nb of EvoSuite Tests:32

Nb of Removed Tests:1


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(((2) != (nVars)) && (nVars + nVars < (org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs) - (nVars + nVars))) || (!(nVars + nVars < (org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs) - (nVars + nVars)))
```

Seed: 181

Execution Time: 00:11 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:1


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
(2) != (nVars)
```

Seed: 186

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:3


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math.stat.correlation.PearsonsCorrelation : 190

Patch type: PRECONDITION

```Java
((nVars == org.apache.commons.math.stat.correlation.PearsonsCorrelation.this.nObs) || (2 < nVars)) && (outMatrix!=null)
```

Seed: 193

Execution Time: 00:10 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:11 (hh:mm)

Average Nb of EvoSuite Tests:29.93

Average Nb of Removed Tests:1

Running Nopol+UnsatGuided changes the original patch for each of the 30 seeds. The human patch changes the assignment of an array, the original patch and the selected newly generated patch by running Nopol+UnsatGuided all add a precondition to the same statement, we think they are incorrect.
