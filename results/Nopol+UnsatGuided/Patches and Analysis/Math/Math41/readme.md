
## Human Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/stat/descriptive/moment/Variance.java b/src/main/java/org/apache/commons/math/stat/descriptive/moment/Variance.java
index 1de139f..e5518e3 100644
--- a/src/main/java/org/apache/commons/math/stat/descriptive/moment/Variance.java
+++ b/src/main/java/org/apache/commons/math/stat/descriptive/moment/Variance.java
@@ -517,7 +517,7 @@ public class Variance extends AbstractStorelessUnivariateStatistic implements Se
                 }
 
                 double sumWts = 0;
+                for (int i = begin; i < begin + length; i++) {
-                for (int i = 0; i < weights.length; i++) {
                     sumWts += weights[i];
                 }
 

```


## Original Patch # Nopol 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
xbarw < length
```

Execution Time: 00:05 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
((1 == length) && (org.apache.commons.math.stat.descriptive.moment.Mean.this.moment!=null)) || (!(length < xbarw))
```

Seed: 4

Execution Time: 02:52 (hh:mm)

Nb of EvoSuite Tests:43

Nb of Removed Tests:6


## Patch 2 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
xbarw < length
```

Seed: 12

Execution Time: 02:20 (hh:mm)

Nb of EvoSuite Tests:40

Nb of Removed Tests:1


## Patch 3 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
((xbarw <= sumw) || (xbarw < length)) && (org.apache.commons.math.stat.descriptive.moment.Mean.this.incMoment)
```

Seed: 18

Execution Time: 02:00 (hh:mm)

Nb of EvoSuite Tests:40

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
xbarw < length
```

Seed: 26

Execution Time: 01:43 (hh:mm)

Nb of EvoSuite Tests:40

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
(xbarw <= length) || ((!(org.apache.commons.math.stat.descriptive.moment.Mean.this.moment!=null)) && (sum!=null))
```

Seed: 28

Execution Time: 01:54 (hh:mm)

Nb of EvoSuite Tests:41

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
(xbarw <= length) || (xbarw == sumw)
```

Seed: 35

Execution Time: 01:49 (hh:mm)

Nb of EvoSuite Tests:41

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
((!(org.apache.commons.math.stat.descriptive.moment.Mean.this.incMoment)) && (values!=null)) || (xbarw < length)
```

Seed: 41

Execution Time: 01:52 (hh:mm)

Nb of EvoSuite Tests:40

Nb of Removed Tests:1


## Patch 8 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
((-1 < xbarw) && (!(org.apache.commons.math.stat.descriptive.moment.Mean.this.incMoment))) || (xbarw <= length)
```

Seed: 54

Execution Time: 01:59 (hh:mm)

Nb of EvoSuite Tests:43

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
(xbarw <= length) || ((!((1) != (length))) && (!((1) != (length))))
```

Seed: 60

Execution Time: 02:27 (hh:mm)

Nb of EvoSuite Tests:41

Nb of Removed Tests:5


## Patch 10 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
((xbarw < values.length) && (values.length <= length)) || (!((correction) != (0)))
```

Seed: 66

Execution Time: 01:48 (hh:mm)

Nb of EvoSuite Tests:41

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
(xbarw < length) || (xbarw <= sumw)
```

Seed: 75

Execution Time: 01:57 (hh:mm)

Nb of EvoSuite Tests:41

Nb of Removed Tests:1


## Patch 12 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
(xbarw <= length) || (!(org.apache.commons.math.stat.descriptive.moment.Mean.this.moment!=null))
```

Seed: 83

Execution Time: 01:57 (hh:mm)

Nb of EvoSuite Tests:41

Nb of Removed Tests:1


## Patch 13 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
(!(org.apache.commons.math.stat.descriptive.moment.Mean.this.incMoment)) || (xbarw <= length)
```

Seed: 98

Execution Time: 02:02 (hh:mm)

Nb of EvoSuite Tests:42

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided (selected for manual analysis)

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
(!(org.apache.commons.math.stat.descriptive.moment.Mean.this.incMoment)) || ((xbarw < length) && (values!=null))
```

Seed: 100

Execution Time: 01:54 (hh:mm)

Nb of EvoSuite Tests:41

Nb of Removed Tests:1


## Patch 15 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
(!((length <= xbarw) && (org.apache.commons.math.stat.descriptive.moment.Mean.this.moment!=null))) || (xbarw < sumw)
```

Seed: 104

Execution Time: 01:43 (hh:mm)

Nb of EvoSuite Tests:37

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
(xbarw <= sumw) || (xbarw < length)
```

Seed: 111

Execution Time: 01:48 (hh:mm)

Nb of EvoSuite Tests:40

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
(org.apache.commons.math.stat.descriptive.moment.Mean.this.moment!=null) && ((xbarw <= length) || (!(1 < length)))
```

Seed: 113

Execution Time: 01:57 (hh:mm)

Nb of EvoSuite Tests:41

Nb of Removed Tests:1


## Patch 18 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
(0 == correction) || (xbarw < length)
```

Seed: 120

Execution Time: 01:52 (hh:mm)

Nb of EvoSuite Tests:39

Nb of Removed Tests:1


## Patch 19 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
(xbarw <= sumw) || ((!(xbarw <= sumw)) && (xbarw < length))
```

Seed: 128

Execution Time: 01:50 (hh:mm)

Nb of EvoSuite Tests:41

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
(!(sumw < xbarw)) || (xbarw <= length)
```

Seed: 135

Execution Time: 02:04 (hh:mm)

Nb of EvoSuite Tests:43

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
(!(org.apache.commons.math.stat.descriptive.moment.Mean.this.incMoment)) || (xbarw < length)
```

Seed: 143

Execution Time: 02:24 (hh:mm)

Nb of EvoSuite Tests:40

Nb of Removed Tests:5


## Patch 22 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
(xbarw < length) || (xbarw <= sumw)
```

Seed: 150

Execution Time: 02:01 (hh:mm)

Nb of EvoSuite Tests:42

Nb of Removed Tests:1


## Patch 23 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
((xbarw < length) || (!(org.apache.commons.math.stat.descriptive.moment.Mean.this.incMoment))) && (values!=null)
```

Seed: 153

Execution Time: 01:51 (hh:mm)

Nb of EvoSuite Tests:41

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
((xbarw <= length) && (xbarw <= length)) || (!(org.apache.commons.math.stat.descriptive.moment.Mean.this.incMoment))
```

Seed: 161

Execution Time: 01:46 (hh:mm)

Nb of EvoSuite Tests:39

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
xbarw < length
```

Seed: 166

Execution Time: 01:51 (hh:mm)

Nb of EvoSuite Tests:41

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
((1 == length) || (!(length <= xbarw))) && (weights!=null)
```

Seed: 173

Execution Time: 02:39 (hh:mm)

Nb of EvoSuite Tests:41

Nb of Removed Tests:7


## Patch 27 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
(xbarw <= length) || (!(org.apache.commons.math.stat.descriptive.moment.Mean.this.incMoment))
```

Seed: 180

Execution Time: 01:58 (hh:mm)

Nb of EvoSuite Tests:42

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
(xbarw < sumw) || (!(length <= xbarw))
```

Seed: 181

Execution Time: 01:58 (hh:mm)

Nb of EvoSuite Tests:41

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
(xbarw < length) || (length <= 1)
```

Seed: 186

Execution Time: 02:15 (hh:mm)

Nb of EvoSuite Tests:43

Nb of Removed Tests:1


## Patch 30 # Nopol+UnsatGuided 

org.apache.commons.math.stat.descriptive.moment.Mean : 217

Patch type: PRECONDITION

```Java
((xbarw < length) || (!(org.apache.commons.math.stat.descriptive.moment.Mean.this.moment!=null))) && ((xbarw < length) || (!(org.apache.commons.math.stat.descriptive.moment.Mean.this.moment!=null)))
```

Seed: 193

Execution Time: 01:55 (hh:mm)

Nb of EvoSuite Tests:38

Nb of Removed Tests:3


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 02:01 (hh:mm)

Average Nb of EvoSuite Tests:40.8

Average Nb of Removed Tests:1.17

Running Nopol+UnsatGuided changes the original patch for 27 of the 30 seeds. The human patch changes the body of a for loop, the original patch and the selected newly generated patch by running Nopol+UnsatGuided all add a precondition to the same statement, we think they are incorrect. We observe failing EvoSuite tests for both programs patched with the original Nopol patch and the selected new patch genertaed by running Nopol+UnsatGuided, which verifies our analysis.
