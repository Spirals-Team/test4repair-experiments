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

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 104

Nb of Failing EvoSuite Tests: 0



## Patch 2 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 104

Nb of Failing EvoSuite Tests: 0



## Patch 3 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 104

Nb of Failing EvoSuite Tests: 0



## Patch 4 #  jGenProg+MinImpact With Seed 1

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


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 104

Nb of Failing EvoSuite Tests: 0



## Patch 5 #  jGenProg+MinImpact With Seed 1

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 104

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 2

## Patch 6 #  jGenProg+MinImpact With Seed 2

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 7 #  jGenProg+MinImpact With Seed 2

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


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 8 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 9 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 10 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 11 #  jGenProg+MinImpact With Seed 2

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 3

## Patch 12 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 107

Nb of Failing EvoSuite Tests: 0



## Patch 13 #  jGenProg+MinImpact With Seed 3

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


Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 107

Nb of Failing EvoSuite Tests: 0



## Patch 14 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 107

Nb of Failing EvoSuite Tests: 0



## Patch 15 #  jGenProg+MinImpact With Seed 3

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 107

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 4

## Patch 16 #  jGenProg+MinImpact With Seed 4

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 17 #  jGenProg+MinImpact With Seed 4

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


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 18 #  jGenProg+MinImpact With Seed 4

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 5

## Patch 19 #  jGenProg+MinImpact With Seed 5

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 0



## Patch 20 #  jGenProg+MinImpact With Seed 5

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 6

## Patch 21 #  jGenProg+MinImpact With Seed 6

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0



## Patch 22 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0



## Patch 23 #  jGenProg+MinImpact With Seed 6

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 7

## Patch 24 #  jGenProg+MinImpact With Seed 7

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 25 #  jGenProg+MinImpact With Seed 7

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


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 26 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 27 #  jGenProg+MinImpact With Seed 7

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 8

## Patch 28 #  jGenProg+MinImpact With Seed 8

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 2



## Patch 29 #  jGenProg+MinImpact With Seed 8

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


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 3



## Patch 30 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 3



## Patch 31 #  jGenProg+MinImpact With Seed 8

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 9

## Patch 32 #  jGenProg+MinImpact With Seed 9

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 111

Nb of Failing EvoSuite Tests: 0



## Patch 33 #  jGenProg+MinImpact With Seed 9

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


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 111

Nb of Failing EvoSuite Tests: 0



## Patch 34 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 111

Nb of Failing EvoSuite Tests: 0



## Patch 35 #  jGenProg+MinImpact With Seed 9

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 111

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 10

## Patch 36 #  jGenProg+MinImpact With Seed 10

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0



## Patch 37 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0



## Patch 38 #  jGenProg+MinImpact With Seed 10

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


Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0



## Patch 39 #  jGenProg+MinImpact With Seed 10

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 11

## Patch 40 #  jGenProg+MinImpact With Seed 11

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 41 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 42 #  jGenProg+MinImpact With Seed 11

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


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 43 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 44 #  jGenProg+MinImpact With Seed 11

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 12

## Patch 45 #  jGenProg+MinImpact With Seed 12

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0



## Patch 46 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0



## Patch 47 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0



## Patch 48 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0



## Patch 49 #  jGenProg+MinImpact With Seed 12

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 13

## Patch 50 #  jGenProg+MinImpact With Seed 13

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 51 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 52 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 53 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 54 #  jGenProg+MinImpact With Seed 13

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 55 #  jGenProg+MinImpact With Seed 13

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


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 14

## Patch 56 #  jGenProg+MinImpact With Seed 14

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 57 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 58 #  jGenProg+MinImpact With Seed 14

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 59 #  jGenProg+MinImpact With Seed 14

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


Execution Time: 2:02 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 15

## Patch 60 #  jGenProg+MinImpact With Seed 15

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 61 #  jGenProg+MinImpact With Seed 15

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


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 62 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 63 #  jGenProg+MinImpact With Seed 15

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 2:03 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 16

## Patch 64 #  jGenProg+MinImpact With Seed 16

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0



## Patch 65 #  jGenProg+MinImpact With Seed 16

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0



## Patch 66 #  jGenProg+MinImpact With Seed 16

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


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 17

## Patch 67 #  jGenProg+MinImpact With Seed 17

jGenProg+MinImpact returns this patch in the first place

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

Nb of Failing EvoSuite Tests: 0



## Patch 68 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 69 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 70 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 71 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 72 #  jGenProg+MinImpact With Seed 17

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 18

## Patch 73 #  jGenProg+MinImpact With Seed 18

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 74 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 75 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 76 #  jGenProg+MinImpact With Seed 18

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


Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 77 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 78 #  jGenProg+MinImpact With Seed 18

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 19

## Patch 79 #  jGenProg+MinImpact With Seed 19

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 91

Nb of Failing EvoSuite Tests: 0



## Patch 80 #  jGenProg+MinImpact With Seed 19

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


Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 91

Nb of Failing EvoSuite Tests: 0



## Patch 81 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 91

Nb of Failing EvoSuite Tests: 0



## Patch 82 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 91

Nb of Failing EvoSuite Tests: 0



## Patch 83 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 91

Nb of Failing EvoSuite Tests: 0



## Patch 84 #  jGenProg+MinImpact With Seed 19

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 91

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 20

## Patch 85 #  jGenProg+MinImpact With Seed 20

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 0



## Patch 86 #  jGenProg+MinImpact With Seed 20

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


Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 0



## Patch 87 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 0



## Patch 88 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 0



## Patch 89 #  jGenProg+MinImpact With Seed 20

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 21

## Patch 90 #  jGenProg+MinImpact With Seed 21

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 105

Nb of Failing EvoSuite Tests: 0



## Patch 91 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 105

Nb of Failing EvoSuite Tests: 0



## Patch 92 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 105

Nb of Failing EvoSuite Tests: 0



## Patch 93 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 105

Nb of Failing EvoSuite Tests: 0



## Patch 94 #  jGenProg+MinImpact With Seed 21

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 105

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 22

## Patch 95 #  jGenProg+MinImpact With Seed 22

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 96 #  jGenProg+MinImpact With Seed 22

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 23

## Patch 97 #  jGenProg+MinImpact With Seed 23

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 0



## Patch 98 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 0



## Patch 99 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:50 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 0



## Patch 100 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 1:09 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 0



## Patch 101 #  jGenProg+MinImpact With Seed 23

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 25

## Patch 102 #  jGenProg+MinImpact With Seed 25

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0



## Patch 103 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0



## Patch 104 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0



## Patch 105 #  jGenProg+MinImpact With Seed 25

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 26

## Patch 106 #  jGenProg+MinImpact With Seed 26

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 0



## Patch 107 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 0



## Patch 108 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 0



## Patch 109 #  jGenProg+MinImpact With Seed 26

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 27

## Patch 110 #  jGenProg+MinImpact With Seed 27

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 103

Nb of Failing EvoSuite Tests: 0



## Patch 111 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 103

Nb of Failing EvoSuite Tests: 0



## Patch 112 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 103

Nb of Failing EvoSuite Tests: 0



## Patch 113 #  jGenProg+MinImpact With Seed 27

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 103

Nb of Failing EvoSuite Tests: 0



## Patch 114 #  jGenProg+MinImpact With Seed 27

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


Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 103

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 28

## Patch 115 #  jGenProg+MinImpact With Seed 28

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 89

Nb of Failing EvoSuite Tests: 0



## Patch 116 #  jGenProg+MinImpact With Seed 28

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 89

Nb of Failing EvoSuite Tests: 0



## Patch 117 #  jGenProg+MinImpact With Seed 28

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


Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 89

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 29

## Patch 118 #  jGenProg+MinImpact With Seed 29

jGenProg+MinImpact returns this patch in the first place

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

Nb of Failing EvoSuite Tests: 0



## Patch 119 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0



## Patch 120 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0



## Patch 121 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0



## Patch 122 #  jGenProg+MinImpact With Seed 29

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 30

## Patch 123 #  jGenProg+MinImpact With Seed 30

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 101

Nb of Failing EvoSuite Tests: 0



## Patch 124 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 101

Nb of Failing EvoSuite Tests: 0



## Patch 125 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 101

Nb of Failing EvoSuite Tests: 0



## Patch 126 #  jGenProg+MinImpact With Seed 30

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Execution Time: 2:03 (hh:mm) 

Nb of EvoSuite Tests: 101

Nb of Failing EvoSuite Tests: 0


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 97.56

Average Nb of Failing EvoSuite Tests: 0.1

Average Nb of Test-adequate patches: 4.34

---