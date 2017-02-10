#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//chart/ project chart
##Original Patch 

```Java
diff --git a/source/org/jfree/chart/block/BorderArrangement.java b/source/org/jfree/chart/block/BorderArrangement.java
index b3ae54b..730aeb3 100644
--- a/source/org/jfree/chart/block/BorderArrangement.java
+++ b/source/org/jfree/chart/block/BorderArrangement.java
@@ -452,7 +452,7 @@ public class BorderArrangement implements Arrangement, Serializable {
         h[3] = h[2];
         if (this.rightBlock != null) {
             RectangleConstraint c4 = new RectangleConstraint(0.0,
-                    new Range(0.0, Math.max(constraint.getWidth() - w[2], 0.0)),
+                    new Range(0.0, constraint.getWidth() - w[2]),
                     LengthConstraintType.RANGE, h[2], null,
                     LengthConstraintType.FIXED);
             Size2D size = this.rightBlock.arrange(g2, c4);
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 301

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22


--- 
#Seed: 9

## Patch 9 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24


--- 
#Seed: 10

## Patch 10 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25


--- 
#Seed: 11

## Patch 11 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30


--- 
#Seed: 15

## Patch 15 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 295

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24


--- 
#Seed: 16

## Patch 16 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 17

## Patch 17 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24


--- 
#Seed: 18

## Patch 18 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = java.lang.Math.max(h[2], h[3])

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28


--- 
#Seed: 19

## Patch 19 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32


--- 
#Seed: 23

## Patch 23 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26


--- 
#Seed: 25

## Patch 24 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26


--- 
#Seed: 26

## Patch 25 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32


--- 
#Seed: 27

## Patch 26 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34


--- 
#Seed: 28

## Patch 27 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18


--- 
#Seed: 29

## Patch 28 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24


--- 
#Seed: 30

## Patch 29 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 26.17

Average Nb of Failing EvoSuite Tests: 0.06

---