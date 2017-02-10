#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//chart/ project chart
##Original Patch 

```Java
Index: source/org/jfree/chart/renderer/category/AbstractCategoryItemRenderer.java
===================================================================
--- source/org/jfree/chart/renderer/category/AbstractCategoryItemRenderer.java	(revision 2266)
+++ source/org/jfree/chart/renderer/category/AbstractCategoryItemRenderer.java	(revision 2264)
@@ -1794,7 +1794,7 @@
         }
         int index = this.plot.getIndexOf(this);
         CategoryDataset dataset = this.plot.getDataset(index);
-        if (dataset == null) {
+        if (dataset != null) {
             return result;
         }
         int seriesCount = dataset.getRowCount();
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 104

Nb of Failing EvoSuite Tests: 104


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 94


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 107

Nb of Failing EvoSuite Tests: 107


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 94


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 99


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 98


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 97


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 98


--- 
#Seed: 9

## Patch 9 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 111

Nb of Failing EvoSuite Tests: 111


--- 
#Seed: 10

## Patch 10 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 95


--- 
#Seed: 11

## Patch 11 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 97


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 95


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 96


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 97


--- 
#Seed: 15

## Patch 15 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 94


--- 
#Seed: 16

## Patch 16 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 95


--- 
#Seed: 17

## Patch 17 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset != null) {
	org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.rowCount = dataset.getRowCount();
	org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.columnCount = dataset.getColumnCount();
} else {
	org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.rowCount = 0;
	org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.columnCount = 0;
}

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 96


--- 
#Seed: 18

## Patch 18 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 97


--- 
#Seed: 19

## Patch 19 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 91

Nb of Failing EvoSuite Tests: 91


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 93


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 105

Nb of Failing EvoSuite Tests: 105


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 97


--- 
#Seed: 23

## Patch 23 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 93


--- 
#Seed: 25

## Patch 24 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 98


--- 
#Seed: 26

## Patch 25 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 99


--- 
#Seed: 27

## Patch 26 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 103

Nb of Failing EvoSuite Tests: 103


--- 
#Seed: 28

## Patch 27 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 89

Nb of Failing EvoSuite Tests: 89


--- 
#Seed: 29

## Patch 28 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset != null) {
	org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.rowCount = dataset.getRowCount();
	org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.columnCount = dataset.getColumnCount();
} else {
	org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.rowCount = 0;
	org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.columnCount = 0;
}

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 98


--- 
#Seed: 30

## Patch 29 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 101

Nb of Failing EvoSuite Tests: 101


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 103.25

Average Nb of Failing EvoSuite Tests: 0.5

---