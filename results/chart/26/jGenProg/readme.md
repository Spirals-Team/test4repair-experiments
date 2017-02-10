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

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.axis.Axis : 1064

Patch type: InsertBeforeOp

```Java

label = null

```


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 92

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.axis.AxisCollection : 132

Patch type: ReplaceOp

```Java

if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
	org.jfree.chart.axis.AxisCollection.this.axesAtRight.add(axis);
} 

```


Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 10

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.axis.Axis : 1113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 81

Nb of Failing EvoSuite Tests: 0



## Patch 4 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.axis.AxisCollection : 132

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 10

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.axis.Axis : 1113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 86

Nb of Failing EvoSuite Tests: 0



## Patch 6 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.JFreeChart : 1181

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 117

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 6

## Patch 7 #  jGenProg+MinImpact With Seed 6

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.axis.Axis : 1190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 89

Nb of Failing EvoSuite Tests: 1



## Patch 8 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.JFreeChart : 1213

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:16 (hh:mm) 

Nb of EvoSuite Tests: 123

Nb of Failing EvoSuite Tests: 3



## Patch 9 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.axis.AxisCollection : 132

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 10

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 7

## Patch 10 #  jGenProg+MinImpact With Seed 7

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.axis.Axis : 1113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 86

Nb of Failing EvoSuite Tests: 0



## Patch 11 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.JFreeChart : 1213

Patch type: ReplaceOp

```Java

notifyListeners(new org.jfree.chart.event.ChartChangeEvent(org.jfree.chart.JFreeChart.this))

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 117

Nb of Failing EvoSuite Tests: 2



## Patch 12 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.JFreeChart : 1181

Patch type: ReplaceOp

```Java

g2.clip(chartArea)

```


Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 117

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 8

## Patch 13 #  jGenProg+MinImpact With Seed 8

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1213

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 120

Nb of Failing EvoSuite Tests: 1



## Patch 14 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.axis.AxisCollection : 132

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 10

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 9

## Patch 15 #  jGenProg+MinImpact With Seed 9

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.axis.Axis : 1113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 86

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 10

## Patch 16 #  jGenProg+MinImpact With Seed 10

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.axis.Axis : 1113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 83

Nb of Failing EvoSuite Tests: 0



## Patch 17 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.axis.Axis : 1190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:56 (hh:mm) 

Nb of EvoSuite Tests: 83

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 11

## Patch 18 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.axis.Axis : 1190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:35 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 13

## Patch 19 #  jGenProg+MinImpact With Seed 13

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.axis.AxisCollection : 132

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 10

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 15

## Patch 20 #  jGenProg+MinImpact With Seed 15

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.axis.Axis : 1190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 84

Nb of Failing EvoSuite Tests: 0



## Patch 21 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.JFreeChart : 1181

Patch type: ReplaceOp

```Java

org.jfree.chart.JFreeChart.this.renderingHints.put(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_OFF)

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 2



## Patch 22 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.JFreeChart : 1213

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:23 (hh:mm) 

Nb of EvoSuite Tests: 119

Nb of Failing EvoSuite Tests: 6


--- 
#Seed: 16
--- 
#Seed: 17

## Patch 23 #  jGenProg+MinImpact With Seed 17

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.axis.Axis : 1113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 79

Nb of Failing EvoSuite Tests: 0



## Patch 24 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.axis.AxisCollection : 132

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 10

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 19
--- 
#Seed: 20

## Patch 25 #  jGenProg+MinImpact With Seed 20

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.axis.Axis : 1113

Patch type: ReplaceOp

```Java

if (labelPaint == null) {
	throw new java.lang.IllegalArgumentException("Null 'labelPaint' argument.");
} 

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 92

Nb of Failing EvoSuite Tests: 0



## Patch 26 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.axis.Axis : 1190

Patch type: ReplaceOp

```Java

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

```


Execution Time: 1:17 (hh:mm) 

Nb of EvoSuite Tests: 92

Nb of Failing EvoSuite Tests: 0



## Patch 27 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.axis.Axis : 1113

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:34 (hh:mm) 

Nb of EvoSuite Tests: 92

Nb of Failing EvoSuite Tests: 0



## Patch 28 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.axis.Axis : 1113

Patch type: ReplaceOp

```Java

if (edge == null) {
	throw new java.lang.IllegalArgumentException("Null 'edge' argument.");
} 

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 92

Nb of Failing EvoSuite Tests: 0



## Patch 29 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.JFreeChart : 1181

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 122

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 21
--- 
#Seed: 25

## Patch 30 #  jGenProg+MinImpact With Seed 25

jGenProg+MinImpact returns this patch in the first place

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

Nb of Failing EvoSuite Tests: 0



## Patch 31 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.axis.Axis : 1190

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 89

Nb of Failing EvoSuite Tests: 0



## Patch 32 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.JFreeChart : 1181

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:36 (hh:mm) 

Nb of EvoSuite Tests: 131

Nb of Failing EvoSuite Tests: 4



## Patch 33 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.axis.AxisCollection : 132

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 10

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 29

## Patch 34 #  jGenProg+MinImpact With Seed 29

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1213

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 118

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 30

## Patch 35 #  jGenProg+MinImpact With Seed 30

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.JFreeChart : 1213

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 121

Nb of Failing EvoSuite Tests: 1



## Patch 36 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.axis.AxisCollection : 132

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 10

Nb of Failing EvoSuite Tests: 4


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 67.26

Average Nb of Failing EvoSuite Tests: 1.37

Average Nb of Test-adequate patches: 2.15

---