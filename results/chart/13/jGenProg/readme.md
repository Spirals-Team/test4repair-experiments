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



## Patch 2 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 3 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 4 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 5 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 6 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 435

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 7 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 8 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 9 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 10 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 11 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 12 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 295

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 13 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 14 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 15 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 307

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 16 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 17 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 18 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 19 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = ((constraint.getHeight()) - (h[1])) - (h[0])

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 20 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 21 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 22 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 23 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 24 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20


--- 
#Seed: 2

## Patch 25 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 26 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 27 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 28 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 29 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = java.lang.Math.max(h[2], h[3])

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 30 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 31 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 435

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 32 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 443

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 33 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 34 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 35 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 435

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 36 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 37 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 427

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 38 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 39 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 40 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 306

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 41 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 42 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 449

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 43 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 44 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 45 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.AbstractBlock : 492

Patch type: ReplaceOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 66

Nb of Failing EvoSuite Tests: 66



## Patch 46 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.block.AbstractBlock : 489

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 66

Nb of Failing EvoSuite Tests: 66


--- 
#Seed: 3

## Patch 47 #  jGenProg+MinImpact With Seed 3

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



## Patch 48 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 49 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 50 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 51 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 52 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 53 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 54 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 55 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 300

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 56 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 57 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 58 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 59 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 60 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 312

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 61 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 62 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 63 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 64 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 65 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 435

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 66 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 308

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 67 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.AbstractBlock : 474

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 66

Nb of Failing EvoSuite Tests: 66



## Patch 68 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 69 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 70 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 71 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 72 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 435

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 73 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22


--- 
#Seed: 4

## Patch 74 #  jGenProg+MinImpact With Seed 4

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



## Patch 75 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 76 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 77 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 78 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 79 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 80 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 81 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 82 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 83 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 84 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 308

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 85 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 86 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 87 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 88 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 89 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 90 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 301

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 91 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 92 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 93 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 450

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 94 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.AbstractBlock : 476

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 71



## Patch 95 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 96 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 97 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 306

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 98 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30


--- 
#Seed: 5

## Patch 99 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 100 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 101 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 102 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 297

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 103 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 104 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 105 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 106 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 107 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 323

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 108 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 298

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 109 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 110 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 307

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 111 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 112 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 113 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 312

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 114 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 115 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 444

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 116 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 117 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 118 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 119 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 120 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 121 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 122 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 306

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 123 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 124 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 314

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 125 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 152

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 126 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29


--- 
#Seed: 6

## Patch 127 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 128 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 129 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 130 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 131 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 132 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 133 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 307

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 134 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 135 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 136 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 137 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = ((constraint.getHeight()) - (h[1])) - (h[0])

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 138 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 314

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 139 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = java.lang.Math.max(h[2], h[3])

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 140 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 141 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 142 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.AbstractBlock : 476

Patch type: ReplaceOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 65

Nb of Failing EvoSuite Tests: 65



## Patch 143 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 308

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 144 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 145 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 146 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.AbstractBlock : 477

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 65

Nb of Failing EvoSuite Tests: 65



## Patch 147 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 148 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 301

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 149 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 150 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29



## Patch 151 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 29


--- 
#Seed: 7

## Patch 152 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 153 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 154 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 155 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 156 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 157 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.AbstractBlock : 492

Patch type: ReplaceOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 68



## Patch 158 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 159 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 160 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 161 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 162 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 300

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 163 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 164 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 295

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 165 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 166 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 167 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 168 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 169 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 426

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 170 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 171 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32


--- 
#Seed: 8

## Patch 172 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 301

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 173 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 424

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 174 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 175 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 176 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 177 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 178 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 296

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 179 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 180 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 181 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 182 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 183 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 184 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 185 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 186 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 187 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 188 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 189 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 190 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 191 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 192 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 193 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 194 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.AbstractBlock : 492

Patch type: ReplaceOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 70



## Patch 195 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 196 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.BorderArrangement : 297

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 22



## Patch 197 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.block.AbstractBlock : 474

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 70


--- 
#Seed: 9

## Patch 198 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 199 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 200 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 201 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 202 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 203 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 204 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 426

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 205 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 206 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 207 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 208 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 209 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 210 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = ((constraint.getHeight()) - (h[1])) - (h[0])

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 211 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 212 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 213 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 214 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 215 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = java.lang.Math.max(h[2], h[3])

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 216 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 217 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 218 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 219 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 312

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 220 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 221 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 222 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.block.BorderArrangement : 301

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24


--- 
#Seed: 10

## Patch 223 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 224 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 225 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 226 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 424

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 227 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 228 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 229 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 230 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 444

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 231 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 232 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 233 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 234 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 235 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 236 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 237 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 298

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 238 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 239 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 240 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 450

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 241 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 242 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 243 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 427

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 244 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 245 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 246 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 247 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 248 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 249 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 250 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25



## Patch 251 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 25


--- 
#Seed: 11

## Patch 252 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 253 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = java.lang.Math.max(h[2], h[3])

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 254 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 444

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 255 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 256 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 257 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 258 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 259 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 260 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 261 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 262 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 263 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 450

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 264 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 265 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 266 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 267 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 268 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 435

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 269 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 270 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 444

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 271 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 272 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 273 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 274 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 275 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18


--- 
#Seed: 12

## Patch 276 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 277 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 278 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 279 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 280 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 311

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 281 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 282 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 283 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 284 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 285 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 286 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 287 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 288 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 289 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 290 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 291 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 323

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 292 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 293 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 294 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 295 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 296 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = java.lang.Math.max(h[2], h[3])

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 297 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 298 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 435

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20



## Patch 299 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.block.BorderArrangement : 300

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 20


--- 
#Seed: 13

## Patch 300 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 301 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 302 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 303 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 304 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 426

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 305 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 306 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 307 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 427

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 308 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 309 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 310 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 311 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 312 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 313 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 311

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 314 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 315 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 314

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 316 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 317 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 318 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 302

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 319 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 320 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 321 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 322 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 323 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 324 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 325 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 326 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 151

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 327 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 328 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.block.AbstractBlock : 489

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 62

Nb of Failing EvoSuite Tests: 62


--- 
#Seed: 14

## Patch 329 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 330 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 331 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 332 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 333 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 334 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 335 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 297

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 336 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 300

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 337 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 338 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 339 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 340 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 341 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 342 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 343 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 344 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 308

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 345 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 311

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 346 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 347 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 348 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = java.lang.Math.max(h[2], h[3])

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 349 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 297

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 350 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = ((constraint.getHeight()) - (h[1])) - (h[0])

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 351 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 427

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30



## Patch 352 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 30


--- 
#Seed: 15

## Patch 353 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 295

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 354 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 308

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 355 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 356 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 357 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 358 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 359 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 296

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 360 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 361 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 362 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 363 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 449

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 364 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 365 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 366 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 367 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.AbstractBlock : 491

Patch type: ReplaceOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 78

Nb of Failing EvoSuite Tests: 78



## Patch 368 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 307

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 369 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 370 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 371 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24


--- 
#Seed: 16

## Patch 372 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 373 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 374 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 375 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 376 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 377 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 378 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.block.BorderArrangement : 443

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 379 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 380 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 381 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 382 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 383 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 384 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 385 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 386 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.block.BorderArrangement : 449

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 387 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21



## Patch 388 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 2:02 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 21


--- 
#Seed: 17

## Patch 389 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 390 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 391 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 392 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 393 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 394 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 395 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 396 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 397 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 398 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 399 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 400 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 401 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 402 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 452

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 403 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 404 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 405 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 406 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 407 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 408 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.BorderArrangement : 444

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 409 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.block.AbstractBlock : 475

Patch type: ReplaceOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 72

Nb of Failing EvoSuite Tests: 72


--- 
#Seed: 18

## Patch 410 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = java.lang.Math.max(h[2], h[3])

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 411 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 412 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 413 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 414 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 415 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 308

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 416 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 300

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 417 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 418 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 312

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 419 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 420 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 314

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 421 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 422 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 423 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 424 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 425 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = ((constraint.getHeight()) - (h[1])) - (h[0])

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 426 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 427 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 428 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 429 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 430 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 435

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 431 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28



## Patch 432 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 28


--- 
#Seed: 19

## Patch 433 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 434 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 308

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 435 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 436 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = ((constraint.getHeight()) - (h[1])) - (h[0])

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 437 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 438 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 439 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 427

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 440 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 441 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 442 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 443 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 444 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 445 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 446 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 447 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 448 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 449 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 298

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 450 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 451 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 452 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 453 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 454 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 455 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 456 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 457 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23


--- 
#Seed: 20

## Patch 458 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 459 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 460 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 314

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 461 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 462 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 302

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 463 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 464 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = ((constraint.getHeight()) - (h[1])) - (h[0])

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 465 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 466 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 467 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 468 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 469 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 470 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 471 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 472 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 473 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 474 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 475 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 476 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 477 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 478 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 479 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 480 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 481 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27



## Patch 482 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 27


--- 
#Seed: 21

## Patch 483 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 484 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 485 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 486 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 487 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 488 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 489 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 490 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 491 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 492 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 493 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 494 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 495 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 496 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 497 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 498 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 499 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 500 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 501 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 311

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 502 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 296

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23



## Patch 503 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 23


--- 
#Seed: 22

## Patch 504 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 505 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 314

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 506 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 507 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 508 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 509 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 510 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 511 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 512 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 513 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 514 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 515 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 516 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 311

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 517 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 518 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 306

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 519 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 520 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 521 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 522 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 523 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 524 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 525 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 526 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 527 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.AbstractBlock : 492

Patch type: ReplaceOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 64



## Patch 528 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 529 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 530 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.block.AbstractBlock : 478

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 64


--- 
#Seed: 23

## Patch 531 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 532 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 323

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 533 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 534 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 535 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 298

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 536 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 537 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 538 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 539 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 540 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 541 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 542 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 543 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 307

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 544 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 545 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = java.lang.Math.max(h[2], h[3])

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 546 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 312

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 547 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 301

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 548 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 549 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 550 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 551 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 552 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26


--- 
#Seed: 25

## Patch 553 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 554 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 555 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 556 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 557 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 558 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 559 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 560 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 426

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 561 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 562 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 563 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 564 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 565 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 566 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 311

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 567 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 568 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 569 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 307

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 570 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 311

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 571 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 443

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26



## Patch 572 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 26


--- 
#Seed: 26

## Patch 573 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 574 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 575 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.block.BorderArrangement : 443

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 576 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.block.BorderArrangement : 308

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 577 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 578 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 579 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 580 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 581 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 582 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 583 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 584 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 585 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 586 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 587 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 588 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32



## Patch 589 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 32


--- 
#Seed: 27

## Patch 590 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 591 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 592 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 593 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 594 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 595 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 596 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 597 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 598 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 599 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 600 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 302

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 601 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 602 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 300

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 603 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 604 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 605 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 606 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 607 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 608 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 609 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 34



## Patch 610 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.block.AbstractBlock : 477

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 64


--- 
#Seed: 28

## Patch 611 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 612 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 613 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 614 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 615 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.block.BorderArrangement : 445

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 616 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 617 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 618 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 619 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 620 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.block.BorderArrangement : 435

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 621 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 622 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 623 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.block.BorderArrangement : 311

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 624 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 625 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 626 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18



## Patch 627 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 18


--- 
#Seed: 29

## Patch 628 #  jGenProg+MinImpact With Seed 29

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



## Patch 629 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 630 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 631 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 632 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 633 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 634 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 635 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.BorderArrangement : 308

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 636 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 637 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.BorderArrangement : 424

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 638 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.BorderArrangement : 152

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 639 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = java.lang.Math.max(h[2], h[3])

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 640 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.BorderArrangement : 300

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 641 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 642 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 643 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 644 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 645 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 24



## Patch 646 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.block.AbstractBlock : 476

Patch type: ReplaceOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 71


--- 
#Seed: 30

## Patch 647 #  jGenProg+MinImpact With Seed 30

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



## Patch 648 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 649 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 650 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 651 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 652 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 653 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 654 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 655 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 656 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 657 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 658 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 659 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 660 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 314

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 661 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 662 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 298

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 663 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 664 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31



## Patch 665 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 31


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 33.38

Average Nb of Failing EvoSuite Tests: 0.3

---