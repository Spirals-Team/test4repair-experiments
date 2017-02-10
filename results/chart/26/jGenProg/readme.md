#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//chart/ project chart
##Original Patch 

```Java
diff --git a/source/org/jfree/chart/axis/Axis.java b/source/org/jfree/chart/axis/Axis.java
index 3f74811..78a6c66 100644
--- a/source/org/jfree/chart/axis/Axis.java
+++ b/source/org/jfree/chart/axis/Axis.java
@@ -1189,13 +1189,11 @@ public abstract class Axis implements Cloneable, Serializable {
         }
         if (plotState != null && hotspot != null) {
             ChartRenderingInfo owner = plotState.getOwner();
-            if (owner != null) {
                 EntityCollection entities = owner.getEntityCollection();
                 if (entities != null) {
                     entities.add(new AxisLabelEntity(this, hotspot, 
                             this.labelToolTip, this.labelURL));
                 }
-            }
         }
         return state;
 
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.axis.Axis : 1064

Patch type: InsertBeforeOp

```Java

label = null

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 92

Nb of Failing EvoSuite Tests: 92


--- 
#Seed: 2
--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.axis.Axis : 1113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 81

Nb of Failing EvoSuite Tests: 81


--- 
#Seed: 5

## Patch 4 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.axis.Axis : 1113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 86

Nb of Failing EvoSuite Tests: 86


--- 
#Seed: 6

## Patch 5 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.axis.Axis : 1190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 89

Nb of Failing EvoSuite Tests: 89


--- 
#Seed: 7

## Patch 6 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.axis.Axis : 1113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 86

Nb of Failing EvoSuite Tests: 86


--- 
#Seed: 8

## Patch 7 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.JFreeChart : 1213

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 120


--- 
#Seed: 9

## Patch 8 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.axis.Axis : 1113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 86

Nb of Failing EvoSuite Tests: 86


--- 
#Seed: 10

## Patch 9 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.axis.Axis : 1113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 83

Nb of Failing EvoSuite Tests: 83


--- 
#Seed: 11
--- 
#Seed: 13

## Patch 11 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.axis.AxisCollection : 132

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 10

Nb of Failing EvoSuite Tests: 10


--- 
#Seed: 15

## Patch 12 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.axis.Axis : 1190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 84

Nb of Failing EvoSuite Tests: 84


--- 
#Seed: 16
--- 
#Seed: 17

## Patch 14 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.axis.Axis : 1113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 79

Nb of Failing EvoSuite Tests: 79


--- 
#Seed: 19
--- 
#Seed: 20

## Patch 16 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.axis.Axis : 1113

Patch type: ReplaceOp

```Java

if (labelPaint == null) {
	throw new java.lang.IllegalArgumentException("Null 'labelPaint' argument.");
} 

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 92

Nb of Failing EvoSuite Tests: 92


--- 
#Seed: 21
--- 
#Seed: 25

## Patch 18 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.axis.Axis : 1190

Patch type: ReplaceOp

```Java

if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
	java.awt.geom.AffineTransform t = java.awt.geom.AffineTransform.getRotateInstance(getLabelAngle(), labelBounds.getCenterX(), labelBounds.getCenterY());
	java.awt.Shape rotatedLabelBounds = t.createTransformedShape(labelBounds);
	labelBounds = rotatedLabelBounds.getBounds2D();
	float w = ((float)(labelBounds.getWidth()));
	float h = ((float)(labelBounds.getHeight()));
	float labelx = ((float)(dataArea.getCenterX()));
	float labely = ((float)(((state.getCursor()) + (insets.getTop())) + (h / 2.0)));
	org.jfree.chart.text.TextUtilities.drawRotatedString(label, g2, labelx, labely, org.jfree.chart.text.TextAnchor.CENTER, getLabelAngle(), org.jfree.chart.text.TextAnchor.CENTER);
	hotspot = new java.awt.geom.Rectangle2D.Float((labelx - (w / 2.0F)) , (labely - (h / 2.0F)) , w , h);
	state.cursorDown((((insets.getTop()) + (labelBounds.getHeight())) + (insets.getBottom())));
} else {
	if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
		java.awt.geom.AffineTransform t = java.awt.geom.AffineTransform.getRotateInstance(((getLabelAngle()) - ((java.lang.Math.PI) / 2.0)), labelBounds.getCenterX(), labelBounds.getCenterY());
		java.awt.Shape rotatedLabelBounds = t.createTransformedShape(labelBounds);
		labelBounds = rotatedLabelBounds.getBounds2D();
		float w = ((float)(labelBounds.getWidth()));
		float h = ((float)(labelBounds.getHeight()));
		float labelx = ((float)(((state.getCursor()) - (insets.getRight())) - (w / 2.0)));
		float labely = ((float)(dataArea.getCenterY()));
		org.jfree.chart.text.TextUtilities.drawRotatedString(label, g2, labelx, labely, org.jfree.chart.text.TextAnchor.CENTER, ((getLabelAngle()) - ((java.lang.Math.PI) / 2.0)), org.jfree.chart.text.TextAnchor.CENTER);
		hotspot = new java.awt.geom.Rectangle2D.Float((labelx - (w / 2.0F)) , (labely - (h / 2.0F)) , w , h);
		state.cursorLeft((((insets.getLeft()) + (labelBounds.getWidth())) + (insets.getRight())));
	} else {
		if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
			java.awt.geom.AffineTransform t = java.awt.geom.AffineTransform.getRotateInstance(((getLabelAngle()) + ((java.lang.Math.PI) / 2.0)), labelBounds.getCenterX(), labelBounds.getCenterY());
			java.awt.Shape rotatedLabelBounds = t.createTransformedShape(labelBounds);
			labelBounds = rotatedLabelBounds.getBounds2D();
			float w = ((float)(labelBounds.getWidth()));
			float h = ((float)(labelBounds.getHeight()));
			float labelx = ((float)(((state.getCursor()) + (insets.getLeft())) + (w / 2.0)));
			float labely = ((float)((dataArea.getY()) + ((dataArea.getHeight()) / 2.0)));
			org.jfree.chart.text.TextUtilities.drawRotatedString(label, g2, labelx, labely, org.jfree.chart.text.TextAnchor.CENTER, ((getLabelAngle()) + ((java.lang.Math.PI) / 2.0)), org.jfree.chart.text.TextAnchor.CENTER);
			hotspot = new java.awt.geom.Rectangle2D.Float((labelx - (w / 2.0F)) , (labely - (h / 2.0F)) , w , h);
			state.cursorRight((((insets.getLeft()) + (labelBounds.getWidth())) + (insets.getRight())));
		} 
	}
}

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 89

Nb of Failing EvoSuite Tests: 89


--- 
#Seed: 29

## Patch 19 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.JFreeChart : 1213

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 118

Nb of Failing EvoSuite Tests: 118


--- 
#Seed: 30

## Patch 20 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.JFreeChart : 1213

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 121


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 57.9

Average Nb of Failing EvoSuite Tests: 0.7

---