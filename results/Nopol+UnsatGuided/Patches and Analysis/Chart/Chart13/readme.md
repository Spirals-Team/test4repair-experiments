
## Human Patch 

```Java
diff --git a/source/org/jfree/chart/block/BorderArrangement.java b/source/org/jfree/chart/block/BorderArrangement.java
index b3ae54b..730aeb3 100644
--- a/source/org/jfree/chart/block/BorderArrangement.java
+++ b/source/org/jfree/chart/block/BorderArrangement.java
@@ -452,7 +452,7 @@ public class BorderArrangement implements Arrangement, Serializable {
         h[3] = h[2];
         if (this.rightBlock != null) {
             RectangleConstraint c4 = new RectangleConstraint(0.0,
+                    new Range(0.0, Math.max(constraint.getWidth() - w[2], 0.0)),
-                    new Range(0.0, constraint.getWidth() - w[2]),
                     LengthConstraintType.RANGE, h[2], null,
                     LengthConstraintType.FIXED);
             Size2D size = this.rightBlock.arrange(g2, c4);

```


## Original Patch # Nopol 

org.jfree.chart.block.BorderArrangement : 453

Patch type: PRECONDITION

```Java
null!=null
```

Execution Time: 00:01 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
!(g2!=null)
```

Seed: 4

Execution Time: 00:31 (hh:mm)

Nb of EvoSuite Tests:32

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 12

Execution Time: 00:30 (hh:mm)

Nb of EvoSuite Tests:33

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 18

Execution Time: 00:29 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
!(g2!=null)
```

Seed: 26

Execution Time: 00:29 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 28

Execution Time: 00:18 (hh:mm)

Nb of EvoSuite Tests:23

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 35

Execution Time: 00:25 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 41

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 54

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
!(g2!=null)
```

Seed: 60

Execution Time: 00:30 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 66

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 75

Execution Time: 00:32 (hh:mm)

Nb of EvoSuite Tests:32

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 83

Execution Time: 00:23 (hh:mm)

Nb of EvoSuite Tests:24

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 98

Execution Time: 00:31 (hh:mm)

Nb of EvoSuite Tests:32

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
!(g2!=null)
```

Seed: 100

Execution Time: 00:30 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 104

Execution Time: 00:26 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 111

Execution Time: 00:23 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 113

Execution Time: 00:36 (hh:mm)

Nb of EvoSuite Tests:34

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 120

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:24

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 128

Execution Time: 00:18 (hh:mm)

Nb of EvoSuite Tests:22

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 135

Execution Time: 00:23 (hh:mm)

Nb of EvoSuite Tests:29

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 143

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:27

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
!(g2!=null)
```

Seed: 150

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 153

Execution Time: 00:23 (hh:mm)

Nb of EvoSuite Tests:26

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 161

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:24

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 166

Execution Time: 00:26 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 173

Execution Time: 00:25 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 180

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:25

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 181

Execution Time: 00:22 (hh:mm)

Nb of EvoSuite Tests:28

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
4 == -1
```

Seed: 186

Execution Time: 00:28 (hh:mm)

Nb of EvoSuite Tests:31

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.jfree.chart.block.BorderArrangement : 450

Patch type: PRECONDITION

```Java
!(g2!=null)
```

Seed: 193

Execution Time: 00:30 (hh:mm)

Nb of EvoSuite Tests:30

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:26 (hh:mm)

Average Nb of EvoSuite Tests:28.37

Average Nb of Removed Tests:0

Running Nopol+UnsatGuided changes the original patch for each of the 30 seeds. The buggy statement contains an instantiation of a range which may contain a negative value in upper, the human patch compares two values to avoid this situation. The original patch avoids the assignement of w[2] and all the newly generated patches avoid the assignement of w[3], we think they are incorrect. 
