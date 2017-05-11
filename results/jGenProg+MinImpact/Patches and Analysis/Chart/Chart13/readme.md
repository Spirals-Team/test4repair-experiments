
##Human Patch 

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


## Patch Original jGenProg 

org.jfree.chart.block.BorderArrangement:330 

Patch type: INSERT_BEFORE 
 
```Java
this.leftBlock = null
```

Execution Time: 0:01 (hh:mm)



--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 2 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 1

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 3 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 4 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 1

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 5 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Seed: 1

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 6 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 1

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 7 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 1

Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 8 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 1

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 9 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 10 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 1

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 11 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 1

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 12 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 295

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 1

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 13 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Seed: 1

Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 14 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 1

Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 15 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 1

Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 16 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 1

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 17 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 1

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 18 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 1

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 19 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = ((constraint.getHeight()) - (h[1])) - (h[0])

```


Seed: 1

Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 20 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Seed: 1

Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 21 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 1

Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 22 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 1

Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 23 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 1

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 24 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 1

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 25 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 2

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 26 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 2

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 27 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 2

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 28 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 2

Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 29 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = java.lang.Math.max(h[2], h[3])

```


Seed: 2

Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 30 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 2

Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 31 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 2

Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 32 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 2

Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 33 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Seed: 2

Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 34 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 2

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 35 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 2

Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 36 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 2

Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 37 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 427

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 2

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 38 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 2

Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 39 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 2

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 40 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 306

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 2

Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 41 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Seed: 2

Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 42 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 449

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 2

Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 43 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 2

Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 44 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 2

Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 45 #  jGenProg+MinImpact 

org.jfree.chart.block.AbstractBlock : 492

Patch type: ReplaceOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Seed: 2

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 66

Nb of Failing EvoSuite Tests: 2



## Patch 46 #  jGenProg+MinImpact 

org.jfree.chart.block.AbstractBlock : 489

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Seed: 2

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 66

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 47 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 3

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 48 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Seed: 3

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 49 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 3

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 50 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 3

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 51 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 3

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 52 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 3

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 53 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 3

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 54 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 3

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 55 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 300

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 3

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 56 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 3

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 57 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 3

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 58 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 3

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 59 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 3

Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 60 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 3

Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 61 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 3

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 62 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 3

Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 63 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 3

Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 64 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 3

Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 65 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 3

Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 66 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 308

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 3

Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 67 #  jGenProg+MinImpact 

org.jfree.chart.block.AbstractBlock : 474

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Seed: 3

Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 66

Nb of Failing EvoSuite Tests: 0



## Patch 68 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 3

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 69 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 3

Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 70 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Seed: 3

Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 71 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Seed: 3

Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 72 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 3

Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 73 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 3

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 74 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 4

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 75 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 76 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Seed: 4

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 77 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 78 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 4

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 79 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 4

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 80 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 4

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 81 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 4

Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 82 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 4

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 83 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 84 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 308

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 4

Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 85 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 4

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 86 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 4

Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 87 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 4

Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 88 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 4

Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 89 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 4

Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 90 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 301

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 4

Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 91 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Seed: 4

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 92 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Seed: 4

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 93 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 4

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 94 #  jGenProg+MinImpact 

org.jfree.chart.block.AbstractBlock : 476

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Seed: 4

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 0



## Patch 95 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 4

Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 96 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 4

Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 97 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 306

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 4

Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 98 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 4

Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 99 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 100 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 5

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 101 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Seed: 5

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 102 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 297

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 5

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 103 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 5

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 104 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 105 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 5

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 106 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 5

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 107 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 323

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 5

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 108 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 298

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 5

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 109 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 5

Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 110 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 5

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 111 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 5

Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 112 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Seed: 5

Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 113 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 5

Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 114 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 5

Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 115 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 5

Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 116 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 5

Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 117 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 5

Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 118 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 5

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 119 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 5

Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 120 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Seed: 5

Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 121 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 5

Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 122 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 306

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 5

Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 123 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 5

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 124 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 314

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 5

Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 125 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 152

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 5

Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 126 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 5

Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 127 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Seed: 6

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 128 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 6

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 129 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 130 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 6

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 131 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 6

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 132 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 133 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 6

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 134 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 135 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 6

Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 136 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 6

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 137 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = ((constraint.getHeight()) - (h[1])) - (h[0])

```


Seed: 6

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 138 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 314

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 6

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 139 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = java.lang.Math.max(h[2], h[3])

```


Seed: 6

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 140 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Seed: 6

Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 141 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 6

Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 142 #  jGenProg+MinImpact 

org.jfree.chart.block.AbstractBlock : 476

Patch type: ReplaceOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Seed: 6

Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 65

Nb of Failing EvoSuite Tests: 0



## Patch 143 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 308

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 6

Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 144 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 6

Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 145 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 6

Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 146 #  jGenProg+MinImpact 

org.jfree.chart.block.AbstractBlock : 477

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Seed: 6

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 65

Nb of Failing EvoSuite Tests: 0



## Patch 147 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 6

Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 148 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 301

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 6

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 149 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Seed: 6

Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 150 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 6

Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0



## Patch 151 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 6

Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 29

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 152 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 153 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Seed: 7

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 154 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 155 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 7

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 156 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 157 #  jGenProg+MinImpact 

org.jfree.chart.block.AbstractBlock : 492

Patch type: ReplaceOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Seed: 7

Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 68

Nb of Failing EvoSuite Tests: 0



## Patch 158 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 7

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 159 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 7

Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 160 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 7

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 161 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 7

Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 162 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 300

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 7

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 163 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 7

Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 164 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 295

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 7

Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 165 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 7

Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 166 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 7

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 167 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 7

Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 168 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 7

Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 169 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 7

Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 170 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 7

Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 171 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 7

Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 172 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 301

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 8

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 173 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 424

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 8

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 174 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 8

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 175 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 8

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 176 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 8

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 177 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 8

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 178 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 296

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 8

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 179 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 8

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 180 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 181 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 182 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 8

Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 183 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Seed: 8

Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 184 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 185 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Seed: 8

Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 186 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Seed: 8

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 187 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 8

Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 188 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 8

Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 189 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 8

Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 190 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 8

Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 191 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 8

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 192 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 8

Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 193 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Seed: 8

Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 194 #  jGenProg+MinImpact 

org.jfree.chart.block.AbstractBlock : 492

Patch type: ReplaceOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Seed: 8

Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 0



## Patch 195 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 8

Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 196 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 297

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 8

Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 0



## Patch 197 #  jGenProg+MinImpact 

org.jfree.chart.block.AbstractBlock : 474

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Seed: 8

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 70

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 198 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 199 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 9

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 200 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 201 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 202 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Seed: 9

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 203 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Seed: 9

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 204 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 9

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 205 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Seed: 9

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 206 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 9

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 207 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 9

Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 208 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 9

Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 209 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Seed: 9

Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 210 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = ((constraint.getHeight()) - (h[1])) - (h[0])

```


Seed: 9

Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 211 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 9

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 212 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 9

Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 213 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 9

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 214 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 9

Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 215 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = java.lang.Math.max(h[2], h[3])

```


Seed: 9

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 216 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Seed: 9

Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 217 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 9

Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 218 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 9

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 219 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 9

Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 220 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 9

Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 221 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 9

Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 222 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 301

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 9

Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 223 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Seed: 10

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 224 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 10

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 225 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 10

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 226 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 424

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 10

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 227 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 10

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 228 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 10

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 229 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 10

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 230 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 10

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 231 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 10

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 232 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 10

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 233 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 10

Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 234 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 10

Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 235 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 10

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 236 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Seed: 10

Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 237 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 298

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 10

Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 238 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 10

Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 239 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 10

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 240 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 10

Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 241 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 10

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 242 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 10

Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 243 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 427

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 10

Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 244 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Seed: 10

Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 245 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 10

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 246 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 10

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 247 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 10

Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 248 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Seed: 10

Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 249 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 10

Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 250 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Seed: 10

Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0



## Patch 251 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 10

Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 25

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 252 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 11

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 253 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = java.lang.Math.max(h[2], h[3])

```


Seed: 11

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 254 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 11

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 255 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 11

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 256 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 11

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 257 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Seed: 11

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 258 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 259 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 11

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 260 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 11

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 261 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 262 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Seed: 11

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 263 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 11

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 264 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 265 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Seed: 11

Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 266 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 11

Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 267 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 11

Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 268 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 11

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 269 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Seed: 11

Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 270 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 11

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 271 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 11

Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 272 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Seed: 11

Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 273 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 11

Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 274 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 11

Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 275 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 11

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 276 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 12

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 277 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 12

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 278 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 12

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 279 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 12

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 280 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 311

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 12

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 281 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 12

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 282 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Seed: 12

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 283 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 12

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 284 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 12

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 285 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 12

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 286 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 12

Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 287 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 12

Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 288 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 12

Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 289 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 12

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 290 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Seed: 12

Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 291 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 323

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 12

Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 292 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 12

Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 293 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 12

Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 294 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 12

Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 295 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 12

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 296 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = java.lang.Math.max(h[2], h[3])

```


Seed: 12

Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 297 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 12

Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 298 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 12

Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0



## Patch 299 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 300

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 12

Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 20

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 300 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Seed: 13

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 301 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 13

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 302 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Seed: 13

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 303 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 304 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 13

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 305 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 13

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 306 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 13

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 307 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 427

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 13

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 308 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 13

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 309 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 310 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 13

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 311 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 13

Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 312 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 13

Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 313 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 311

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 13

Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 314 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 13

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 315 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 314

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 13

Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 316 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 13

Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 317 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 13

Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 318 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 302

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 13

Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 319 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 13

Execution Time: 1:27 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 320 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 13

Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 321 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 322 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 13

Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 323 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Seed: 13

Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 324 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 13

Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 325 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 13

Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 326 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 151

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 13

Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 327 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 13

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 328 #  jGenProg+MinImpact 

org.jfree.chart.block.AbstractBlock : 489

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Seed: 13

Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 62

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 329 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 330 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 331 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 14

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 332 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 14

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 333 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 334 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 14

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 335 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 297

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 14

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 336 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 300

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 14

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 337 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 14

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 338 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 14

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 339 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Seed: 14

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 340 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 14

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 341 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Seed: 14

Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 342 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Seed: 14

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 343 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Seed: 14

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 344 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 308

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 14

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 345 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 311

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 14

Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 346 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 14

Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 347 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 14

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 348 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = java.lang.Math.max(h[2], h[3])

```


Seed: 14

Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 349 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 297

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 14

Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 350 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = ((constraint.getHeight()) - (h[1])) - (h[0])

```


Seed: 14

Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 351 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 427

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 14

Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0



## Patch 352 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Seed: 14

Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 30

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 353 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 295

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 15

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 354 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 308

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 15

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 355 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 15

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 356 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 357 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 358 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 15

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 359 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 296

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 15

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 360 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Seed: 15

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 361 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 15

Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 362 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 15

Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 363 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 449

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 15

Execution Time: 0:59 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 364 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 15

Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 365 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 366 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 15

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 367 #  jGenProg+MinImpact 

org.jfree.chart.block.AbstractBlock : 491

Patch type: ReplaceOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Seed: 15

Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 78

Nb of Failing EvoSuite Tests: 0



## Patch 368 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 15

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 369 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Seed: 15

Execution Time: 1:49 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 370 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 15

Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 371 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 15

Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 372 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 373 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Seed: 16

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 374 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 16

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 375 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 376 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 377 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 16

Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 378 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 16

Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 379 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 16

Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 380 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 16

Execution Time: 1:24 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 381 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Seed: 16

Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 382 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 16

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 383 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 16

Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 384 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 16

Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 385 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 16

Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 386 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 449

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 16

Execution Time: 1:50 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 387 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 16

Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 388 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 16

Execution Time: 2:02 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 389 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 390 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 391 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 17

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 392 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 393 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Seed: 17

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 394 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 17

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 395 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 17

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 396 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 17

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 397 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 17

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 398 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 17

Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 399 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 17

Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 400 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Seed: 17

Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 401 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 17

Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 402 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 452

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 17

Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 403 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 17

Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 404 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 17

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 405 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 17

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 406 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 17

Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 407 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 17

Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 408 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 17

Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 409 #  jGenProg+MinImpact 

org.jfree.chart.block.AbstractBlock : 475

Patch type: ReplaceOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Seed: 17

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 72

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 410 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = java.lang.Math.max(h[2], h[3])

```


Seed: 18

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 411 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 18

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 412 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Seed: 18

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 413 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 414 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 415 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 308

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 18

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 416 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 300

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 18

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 417 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 18

Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 418 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 18

Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 419 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 18

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 420 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 314

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 18

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 421 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Seed: 18

Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 422 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Seed: 18

Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 423 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Seed: 18

Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 424 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 425 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = ((constraint.getHeight()) - (h[1])) - (h[0])

```


Seed: 18

Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 426 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 18

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 427 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Seed: 18

Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 428 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 18

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 429 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 18

Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 430 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 18

Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 431 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 18

Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0



## Patch 432 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 18

Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 28

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 433 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 19

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 434 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 308

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 19

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 435 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 19

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 436 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = ((constraint.getHeight()) - (h[1])) - (h[0])

```


Seed: 19

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 437 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 19

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 438 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 19

Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 439 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 427

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 19

Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 440 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 19

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 441 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 19

Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 442 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 19

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 443 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 19

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 444 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Seed: 19

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 445 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Seed: 19

Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 446 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 19

Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 447 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Seed: 19

Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 448 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 19

Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 449 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 298

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 19

Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 450 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 19

Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 451 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 19

Execution Time: 1:37 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 452 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Seed: 19

Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 453 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 19

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 454 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Seed: 19

Execution Time: 1:54 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 455 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 19

Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 456 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 19

Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 457 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 19

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 458 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 459 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 460 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 314

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 20

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 461 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 462 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 302

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 20

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 463 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 20

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 464 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = ((constraint.getHeight()) - (h[1])) - (h[0])

```


Seed: 20

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 465 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 20

Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 466 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Seed: 20

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 467 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Seed: 20

Execution Time: 0:48 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 468 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 20

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 469 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 20

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 470 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 20

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 471 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 20

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 472 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 20

Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 473 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 20

Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 474 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 20

Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 475 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Seed: 20

Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 476 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Seed: 20

Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 477 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 20

Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 478 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 20

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 479 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 20

Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 480 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 20

Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 481 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 20

Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0



## Patch 482 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 20

Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 27

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 483 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 21

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 484 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 21

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 485 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 21

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 486 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 21

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 487 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Seed: 21

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 488 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Seed: 21

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 489 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Seed: 21

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 490 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 21

Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 491 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 21

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 492 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 21

Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 493 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 21

Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 494 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[1] = w[0]

```


Seed: 21

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 495 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 21

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 496 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 21

Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 497 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 21

Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 498 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 21

Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 499 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 21

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 500 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 21

Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 501 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 311

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 21

Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 502 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 296

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 21

Execution Time: 1:58 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0



## Patch 503 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 21

Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 504 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 22

Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 505 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 314

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 22

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 506 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 22

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 507 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Seed: 22

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 508 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 22

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 509 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 22

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 510 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Seed: 22

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 511 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 22

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 512 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 22

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 513 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 22

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 514 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Seed: 22

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 515 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 22

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 516 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 311

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 22

Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 517 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 22

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 518 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 306

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 22

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 519 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 22

Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 520 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 22

Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 521 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 22

Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 522 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 425

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 22

Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 523 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 22

Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 524 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 22

Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 525 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Seed: 22

Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 526 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 22

Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 527 #  jGenProg+MinImpact 

org.jfree.chart.block.AbstractBlock : 492

Patch type: ReplaceOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Seed: 22

Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 0



## Patch 528 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 22

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 529 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 22

Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 530 #  jGenProg+MinImpact 

org.jfree.chart.block.AbstractBlock : 478

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Seed: 22

Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 531 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 23

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 1



## Patch 532 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 323

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 23

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 1



## Patch 533 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 23

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 1



## Patch 534 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 1



## Patch 535 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 298

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 23

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 1



## Patch 536 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 1



## Patch 537 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Seed: 23

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 1



## Patch 538 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 23

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 1



## Patch 539 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 1



## Patch 540 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Seed: 23

Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 1



## Patch 541 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 23

Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 1



## Patch 542 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 23

Execution Time: 1:52 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 543 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 544 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 545 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 24

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 546 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 24

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 547 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 24

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 548 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 24

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 549 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 24

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 550 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 24

Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 551 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 24

Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 552 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 553 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 24

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 554 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 24

Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 555 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 424

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 24

Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 556 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 24

Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 557 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 24

Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 558 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 24

Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 559 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 24

Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0



## Patch 560 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 24

Execution Time: 2:03 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 561 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Seed: 25

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 562 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 25

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 563 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 25

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 564 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.topBlock = null

```


Seed: 25

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 565 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 25

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 566 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 25

Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 567 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Seed: 25

Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 568 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 25

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 569 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 25

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 570 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 25

Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 571 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Seed: 25

Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 572 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 25

Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 573 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 25

Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 574 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 311

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 25

Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 575 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 25

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 576 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 25

Execution Time: 1:25 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 577 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 25

Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 578 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 311

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 25

Execution Time: 1:43 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 579 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 25

Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0



## Patch 580 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 25

Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 26

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 581 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 26

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 582 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[0] = constraint.getWidth()

```


Seed: 26

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 583 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 26

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 584 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 308

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 26

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 585 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 26

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 586 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 26

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 587 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 26

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 588 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 322

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 26

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 589 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 26

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 590 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 26

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 591 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Seed: 26

Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 592 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 26

Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 593 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 26

Execution Time: 1:13 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 594 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 26

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 595 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 26

Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 596 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 26

Execution Time: 1:40 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0



## Patch 597 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 26

Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 32

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 598 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 27

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 599 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 27

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 600 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 443

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 27

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 601 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 27

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 602 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.centerBlock = null

```


Seed: 27

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 603 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 27

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 604 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 27

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 605 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 27

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 606 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 27

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 607 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 27

Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 608 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 302

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 27

Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 609 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Seed: 27

Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 610 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 300

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 27

Execution Time: 1:10 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 611 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 27

Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 612 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 27

Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 613 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 27

Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 614 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 27

Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 615 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 27

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 616 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 27

Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 617 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 27

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 34

Nb of Failing EvoSuite Tests: 0



## Patch 618 #  jGenProg+MinImpact 

org.jfree.chart.block.AbstractBlock : 477

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Seed: 27

Execution Time: 1:38 (hh:mm) 

Nb of EvoSuite Tests: 64

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 619 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Seed: 28

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 620 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 28

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 621 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 28

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 622 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 28

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 623 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 445

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 28

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 624 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 28

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 625 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 297

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 28

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 626 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 28

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 627 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 28

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 628 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 28

Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 629 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Seed: 28

Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 630 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 28

Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 631 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 311

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 28

Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 632 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 312

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 28

Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 633 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 28

Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 634 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 28

Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0



## Patch 635 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 28

Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 18

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 636 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 29

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 637 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 29

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 638 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 29

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 639 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 29

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 640 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , h[0] , w[2] , h[2]));
} 

```


Seed: 29

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 641 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 29

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 642 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 29

Execution Time: 0:43 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 643 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 308

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 29

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 644 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 29

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 645 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 424

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 29

Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 646 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 152

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 29

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 647 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[2] = java.lang.Math.max(h[2], h[3])

```


Seed: 29

Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 648 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 300

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 29

Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 649 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 29

Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 650 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[4] = h[2]

```


Seed: 29

Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 651 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 29

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 652 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 29

Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 653 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 29

Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 24

Nb of Failing EvoSuite Tests: 0



## Patch 654 #  jGenProg+MinImpact 

org.jfree.chart.block.AbstractBlock : 476

Patch type: ReplaceOp

```Java

org.jfree.chart.block.AbstractBlock.this.width = 0.0

```


Seed: 29

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 71

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 655 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , w[0] , h[0]));
} 

```


Seed: 30

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0



## Patch 656 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 436

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 30

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0



## Patch 657 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 452

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 30

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0



## Patch 658 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: RemoveOp

```Java

remove

```


Seed: 30

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0



## Patch 659 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: RemoveOp

```Java

remove

```


Seed: 30

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0



## Patch 660 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0 , ((h[0]) + (h[2])) , w[1] , h[1]));
} 

```


Seed: 30

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0



## Patch 661 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.bottomBlock = null

```


Seed: 30

Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0



## Patch 662 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

h[3] = h[2]

```


Seed: 30

Execution Time: 0:39 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0



## Patch 663 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

w[4] = ((constraint.getWidth()) - (w[3])) - (w[2])

```


Seed: 30

Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0



## Patch 664 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 426

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 30

Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0



## Patch 665 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: RemoveOp

```Java

remove

```


Seed: 30

Execution Time: 0:58 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0



## Patch 666 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2] , h[0] , w[4] , h[4]));
} 

```


Seed: 30

Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0



## Patch 667 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 450

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 30

Execution Time: 1:11 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0



## Patch 668 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 314

Patch type: InsertBeforeOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 30

Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0



## Patch 669 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 435

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 30

Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0



## Patch 670 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 298

Patch type: InsertAfterOp

```Java

org.jfree.chart.block.BorderArrangement.this.leftBlock = null

```


Seed: 30

Execution Time: 1:39 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0



## Patch 671 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 307

Patch type: ReplaceOp

```Java

org.jfree.chart.block.BorderArrangement.this.rightBlock = null

```


Seed: 30

Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0



## Patch 672 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 444

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 30

Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0



## Patch 673 #  jGenProg+MinImpact 

org.jfree.chart.block.BorderArrangement : 453

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
	org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])) , h[0] , w[3] , h[3]));
} 

```


Seed: 30

Execution Time: 2:00 (hh:mm) 

Nb of EvoSuite Tests: 31

Nb of Failing EvoSuite Tests: 0


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 26.57

Average Nb of Failing EvoSuite Tests: 0.07

Average Nb of Test-adequate patches: 22.43

Running jGenProg + MinImpact changes the original patch for each of the 30 seeds. The human patch checks the issue value. If the value is negative, the program uses 0 instead of the negative value. The original patch and the newly generated patches by running jGenProg + MinImpact all just change the program to make the failing test pass, we think they are incorrect.

---
