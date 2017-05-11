
## Human Patch 

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


## Original Patch # Nopol 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Execution Time: 00:02 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 4

Execution Time: 03:16 (hh:mm)

Nb of EvoSuite Tests:108

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 12

Execution Time: 03:03 (hh:mm)

Nb of EvoSuite Tests:105

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 18

Execution Time: 03:00 (hh:mm)

Nb of EvoSuite Tests:100

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 26

Execution Time: 03:02 (hh:mm)

Nb of EvoSuite Tests:100

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 28

Execution Time: 02:52 (hh:mm)

Nb of EvoSuite Tests:100

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 35

Execution Time: 03:07 (hh:mm)

Nb of EvoSuite Tests:105

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 41

Execution Time: 03:00 (hh:mm)

Nb of EvoSuite Tests:99

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 54

Execution Time: 02:57 (hh:mm)

Nb of EvoSuite Tests:98

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 60

Execution Time: 03:16 (hh:mm)

Nb of EvoSuite Tests:109

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 66

Execution Time: 02:51 (hh:mm)

Nb of EvoSuite Tests:96

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 75

Execution Time: 02:54 (hh:mm)

Nb of EvoSuite Tests:96

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 83

Execution Time: 03:05 (hh:mm)

Nb of EvoSuite Tests:103

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 98

Execution Time: 03:13 (hh:mm)

Nb of EvoSuite Tests:107

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 100

Execution Time: 02:54 (hh:mm)

Nb of EvoSuite Tests:100

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 104

Execution Time: 02:55 (hh:mm)

Nb of EvoSuite Tests:100

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 111

Execution Time: 03:06 (hh:mm)

Nb of EvoSuite Tests:101

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 113

Execution Time: 02:54 (hh:mm)

Nb of EvoSuite Tests:0

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 120

Execution Time: 02:49 (hh:mm)

Nb of EvoSuite Tests:98

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 128

Execution Time: 03:13 (hh:mm)

Nb of EvoSuite Tests:104

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 135

Execution Time: 03:05 (hh:mm)

Nb of EvoSuite Tests:105

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 143

Execution Time: 02:54 (hh:mm)

Nb of EvoSuite Tests:94

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 150

Execution Time: 02:49 (hh:mm)

Nb of EvoSuite Tests:99

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 153

Execution Time: 02:45 (hh:mm)

Nb of EvoSuite Tests:99

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 161

Execution Time: 02:50 (hh:mm)

Nb of EvoSuite Tests:103

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 166

Execution Time: 02:47 (hh:mm)

Nb of EvoSuite Tests:100

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 173

Execution Time: 02:43 (hh:mm)

Nb of EvoSuite Tests:97

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 180

Execution Time: 02:47 (hh:mm)

Nb of EvoSuite Tests:95

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 181

Execution Time: 03:00 (hh:mm)

Nb of EvoSuite Tests:102

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 186

Execution Time: 02:43 (hh:mm)

Nb of EvoSuite Tests:95

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.jfree.chart.renderer.category.AbstractCategoryItemRenderer : 1798

Patch type: PRECONDITION

```Java
org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator!=null
```

Seed: 193

Execution Time: 02:48 (hh:mm)

Nb of EvoSuite Tests:95

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 02:57 (hh:mm)

Average Nb of EvoSuite Tests:100.44

 Average Nb of Contradiction Tests:0

Average Nb of Removed Tests:0

Running Nopol+UnsatGuided does not change the original patch for any of the 30 seeds. The human patch changes an if condition to check whether the variable dataset is null, the generated patch adds a precondition before a statement and makes the failing test pass, we think it is incorrect.