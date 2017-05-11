
##Human Patch 

```Java
Index: source/org/jfree/chart/renderer/category/AbstractCategoryItemRenderer.java
===================================================================
--- source/org/jfree/chart/renderer/category/AbstractCategoryItemRenderer.java	(revision 2266)
+++ source/org/jfree/chart/renderer/category/AbstractCategoryItemRenderer.java	(revision 2264)
@@ -1794,7 +1794,7 @@
         }
         int index = this.plot.getIndexOf(this);
         CategoryDataset dataset = this.plot.getDataset(index);
+        if (dataset == null) {
-        if (dataset != null) {
             return result;
         }
         int seriesCount = dataset.getRowCount();
```


## Patch  Original jGenProg 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer:1797

Patch type: RemoveOp 
 
```Java
remove
```

Execution Time: 0:09 (hh:mm)



--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 104

Nb of Failing EvoSuite Tests: 0



## Patch 2 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 1

Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 104

Nb of Failing EvoSuite Tests: 0



## Patch 3 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Seed: 1

Execution Time: 1:30 (hh:mm) 

Nb of EvoSuite Tests: 104

Nb of Failing EvoSuite Tests: 0



## Patch 4 #  jGenProg+MinImpact 

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


Seed: 1

Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 104

Nb of Failing EvoSuite Tests: 0



## Patch 5 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 1

Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 104

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 6 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 2

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 7 #  jGenProg+MinImpact 

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


Seed: 2

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 8 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 2

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 9 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Seed: 2

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 10 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 2

Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 11 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Seed: 2

Execution Time: 1:53 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 12 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 3

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 107

Nb of Failing EvoSuite Tests: 0



## Patch 13 #  jGenProg+MinImpact 

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


Seed: 3

Execution Time: 1:12 (hh:mm) 

Nb of EvoSuite Tests: 107

Nb of Failing EvoSuite Tests: 0



## Patch 14 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 3

Execution Time: 1:14 (hh:mm) 

Nb of EvoSuite Tests: 107

Nb of Failing EvoSuite Tests: 0



## Patch 15 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 3

Execution Time: 1:46 (hh:mm) 

Nb of EvoSuite Tests: 107

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 16 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 4

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 17 #  jGenProg+MinImpact 

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


Seed: 4

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 18 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 4

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 19 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 0



## Patch 20 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 5

Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 21 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0



## Patch 22 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 6

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0



## Patch 23 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 6

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 24 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 25 #  jGenProg+MinImpact 

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


Seed: 7

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 26 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Seed: 7

Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 27 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 7

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 28 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 2



## Patch 29 #  jGenProg+MinImpact 

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


Seed: 8

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 3



## Patch 30 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 8

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 3



## Patch 31 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Seed: 8

Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 32 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 111

Nb of Failing EvoSuite Tests: 0



## Patch 33 #  jGenProg+MinImpact 

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


Seed: 9

Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 111

Nb of Failing EvoSuite Tests: 0



## Patch 34 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 9

Execution Time: 0:53 (hh:mm) 

Nb of EvoSuite Tests: 111

Nb of Failing EvoSuite Tests: 0



## Patch 35 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Seed: 9

Execution Time: 1:45 (hh:mm) 

Nb of EvoSuite Tests: 111

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 36 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 10

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0



## Patch 37 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 10

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0



## Patch 38 #  jGenProg+MinImpact 

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


Seed: 10

Execution Time: 0:54 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0



## Patch 39 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 10

Execution Time: 1:02 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 40 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 41 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 11

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 42 #  jGenProg+MinImpact 

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


Seed: 11

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 43 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Seed: 11

Execution Time: 1:42 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 44 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 11

Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 45 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 12

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0



## Patch 46 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 12

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0



## Patch 47 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 12

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0



## Patch 48 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Seed: 12

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0



## Patch 49 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Seed: 12

Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 50 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 51 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Seed: 13

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 52 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Seed: 13

Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 53 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 13

Execution Time: 0:51 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 54 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 13

Execution Time: 0:55 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 55 #  jGenProg+MinImpact 

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


Seed: 13

Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 56 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 57 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 14

Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 58 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Seed: 14

Execution Time: 1:21 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 59 #  jGenProg+MinImpact 

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


Seed: 14

Execution Time: 2:02 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 60 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 61 #  jGenProg+MinImpact 

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


Seed: 15

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 62 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 15

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 63 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 15

Execution Time: 2:03 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 64 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0



## Patch 65 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 16

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0



## Patch 66 #  jGenProg+MinImpact 

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


Seed: 16

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 95

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 67 #  jGenProg+MinImpact 

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


Seed: 17

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 68 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 69 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Seed: 17

Execution Time: 0:37 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 70 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 17

Execution Time: 0:49 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 71 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 17

Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0



## Patch 72 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Seed: 17

Execution Time: 1:28 (hh:mm) 

Nb of EvoSuite Tests: 96

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 73 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 74 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 18

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 75 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 18

Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 76 #  jGenProg+MinImpact 

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


Seed: 18

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 77 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Seed: 18

Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 78 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Seed: 18

Execution Time: 1:07 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 79 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 19

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 91

Nb of Failing EvoSuite Tests: 0



## Patch 80 #  jGenProg+MinImpact 

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


Seed: 19

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 91

Nb of Failing EvoSuite Tests: 0



## Patch 81 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Seed: 19

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 91

Nb of Failing EvoSuite Tests: 0



## Patch 82 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 19

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 91

Nb of Failing EvoSuite Tests: 0



## Patch 83 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 19

Execution Time: 1:00 (hh:mm) 

Nb of EvoSuite Tests: 91

Nb of Failing EvoSuite Tests: 0



## Patch 84 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Seed: 19

Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 91

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 85 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 0:52 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 0



## Patch 86 #  jGenProg+MinImpact 

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


Seed: 20

Execution Time: 1:03 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 0



## Patch 87 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 20

Execution Time: 1:29 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 0



## Patch 88 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Seed: 20

Execution Time: 1:55 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 0



## Patch 89 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 20

Execution Time: 1:59 (hh:mm) 

Nb of EvoSuite Tests: 93

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 90 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 21

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 105

Nb of Failing EvoSuite Tests: 0



## Patch 91 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 21

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 105

Nb of Failing EvoSuite Tests: 0



## Patch 92 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Seed: 21

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 105

Nb of Failing EvoSuite Tests: 0



## Patch 93 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 21

Execution Time: 1:19 (hh:mm) 

Nb of EvoSuite Tests: 105

Nb of Failing EvoSuite Tests: 0



## Patch 94 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Seed: 21

Execution Time: 1:56 (hh:mm) 

Nb of EvoSuite Tests: 105

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 95 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 22

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 96 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 22

Execution Time: 1:41 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 97 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 23

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 98 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 0:47 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 99 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 23

Execution Time: 1:05 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0



## Patch 100 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Seed: 23

Execution Time: 1:32 (hh:mm) 

Nb of EvoSuite Tests: 94

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 101 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Seed: 24

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 102 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 103 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 24

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0



## Patch 104 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 24

Execution Time: 0:57 (hh:mm) 

Nb of EvoSuite Tests: 97

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 105 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 25

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0



## Patch 106 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Seed: 25

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0



## Patch 107 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Seed: 25

Execution Time: 0:46 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0



## Patch 108 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 25

Execution Time: 1:08 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 109 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 26

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 0



## Patch 110 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 26

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 0



## Patch 111 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Seed: 26

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 0



## Patch 112 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Seed: 26

Execution Time: 1:44 (hh:mm) 

Nb of EvoSuite Tests: 99

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 113 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 27

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 103

Nb of Failing EvoSuite Tests: 0



## Patch 114 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Seed: 27

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 103

Nb of Failing EvoSuite Tests: 0



## Patch 115 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 27

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 103

Nb of Failing EvoSuite Tests: 0



## Patch 116 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 27

Execution Time: 1:18 (hh:mm) 

Nb of EvoSuite Tests: 103

Nb of Failing EvoSuite Tests: 0



## Patch 117 #  jGenProg+MinImpact 

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


Seed: 27

Execution Time: 1:47 (hh:mm) 

Nb of EvoSuite Tests: 103

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 118 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 28

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 89

Nb of Failing EvoSuite Tests: 0



## Patch 119 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 28

Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 89

Nb of Failing EvoSuite Tests: 0



## Patch 120 #  jGenProg+MinImpact 

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


Seed: 28

Execution Time: 1:31 (hh:mm) 

Nb of EvoSuite Tests: 89

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 121 #  jGenProg+MinImpact 

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


Seed: 29

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0



## Patch 122 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Seed: 29

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0



## Patch 123 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 29

Execution Time: 0:45 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0



## Patch 124 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 29

Execution Time: 1:22 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0



## Patch 125 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
	return result;
} 

```


Seed: 29

Execution Time: 1:48 (hh:mm) 

Nb of EvoSuite Tests: 98

Nb of Failing EvoSuite Tests: 0


--- 


## Patch 126 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: RemoveOp

```Java

remove

```


Seed: 30

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 101

Nb of Failing EvoSuite Tests: 0



## Patch 127 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (plot == null) {
	throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
} 

```


Seed: 30

Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 101

Nb of Failing EvoSuite Tests: 0



## Patch 128 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1797

Patch type: ReplaceOp

```Java

if (dataset == null) {
	return null;
} 

```


Seed: 30

Execution Time: 1:51 (hh:mm) 

Nb of EvoSuite Tests: 101

Nb of Failing EvoSuite Tests: 0



## Patch 129 #  jGenProg+MinImpact 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: RemoveOp

```Java

remove

```


Seed: 30

Execution Time: 2:03 (hh:mm) 

Nb of EvoSuite Tests: 101

Nb of Failing EvoSuite Tests: 0


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 97.6

Average Nb of Failing EvoSuite Tests: 0.09

Average Nb of Test-adequate patches: 4.3

Running jGenProg + MinImpact changes the original patch for 17 of the 30 seeds. The human patch changes an if condition to check whether the variable dataset is null, the original patch and most of the newly generated patches by running jGenProg + MinImpact remove a statement to make the failing test pass, several other newly generated patches by running jGenProg + MinImpact also change the if condition just to make the failing test pass, we think they are all incorrect.

---
