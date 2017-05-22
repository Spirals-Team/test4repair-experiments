package org.jfree.chart.renderer.category;


public class AbstractCategoryItemRenderer_ESTest extends org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        boxAndWhiskerRenderer0.setSeriesToolTipGenerator(33, ((org.jfree.chart.labels.CategoryToolTipGenerator)(null)));
        org.junit.Assert.assertFalse(boxAndWhiskerRenderer0.isMeanVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D((-2571.179347879568) , (-2571.179347879568) , true);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        java.awt.geom.Ellipse2D.Double ellipse2D_Double0 = new java.awt.geom.Ellipse2D.Double();
        double[][] doubleArray0 = new double[4][3];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray0 , doubleArray0);
        stackedBarRenderer3D0.addEntity(standardEntityCollection0, ellipse2D_Double0, defaultIntervalCategoryDataset0, 0, 0, true, 1954.0, 0.0);
        org.junit.Assert.assertEquals(1, standardEntityCollection0.getEntityCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(ganttRenderer0.getRangeAxis(combinedRangeCategoryPlot0, 10)));
        org.junit.Assert.assertEquals(0.0F, numberAxis0.getMinorTickMarkInsideLength(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedBarRenderer3D0.getLegendItemURLGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer(true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = stackedAreaRenderer0.getItemLabelGenerator((-2628), (-2628), true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(null)));
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = lineRenderer3D0.getDomainAxis(combinedRangeCategoryPlot0, ((org.jfree.data.category.CategoryDataset)(null)));
        org.junit.Assert.assertNull(categoryAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = statisticalLineAndShapeRenderer0.getBaseURLGenerator();
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = lineAndShapeRenderer0.getBaseToolTipGenerator();
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false , false);
        org.jfree.data.Range range0 = lineAndShapeRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        org.jfree.chart.renderer.category.IntervalBarRenderer intervalBarRenderer0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
        boolean boolean0 = defaultCategoryItemRenderer0.equals(intervalBarRenderer0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        org.jfree.chart.renderer.category.CategoryStepRenderer.State categoryStepRenderer_State0 = new org.jfree.chart.renderer.category.CategoryStepRenderer.State(plotRenderingInfo0);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = ((org.jfree.chart.entity.StandardEntityCollection)(categoryStepRenderer_State0.getEntityCollection()));
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        try {
            ganttRenderer0.addEntity(standardEntityCollection0, categoryStepRenderer_State0.line, defaultKeyedValues2DDataset0, ((byte)(-1)), (-6334), false, 3356.579572, (-180.394597802));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        try {
            lineRenderer3D0.addEntity(standardEntityCollection0, stackedBarRenderer0.DEFAULT_SHAPE, taskSeriesCollection0, (-1681), 3, false);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(false);
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer1 = ((org.jfree.chart.renderer.category.StackedBarRenderer)(stackedBarRenderer0.clone()));
        org.junit.Assert.assertEquals(1.0, stackedBarRenderer1.getMaximumBarWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier0 = lineRenderer3D0.getDrawingSupplier();
        org.junit.Assert.assertNull(drawingSupplier0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer();
        java.lang.Number[][] numberArray0 = new java.lang.Number[1][6];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0 , numberArray0);
        org.jfree.data.Range range0 = categoryStepRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)), false);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true , true);
        org.jfree.data.gantt.TaskSeries taskSeries0 = new org.jfree.data.gantt.TaskSeries("");
        java.lang.Comparable comparable0 = taskSeries0.getKey();
        org.jfree.chart.annotations.CategoryTextAnnotation categoryTextAnnotation0 = new org.jfree.chart.annotations.CategoryTextAnnotation("" , ((java.lang.Comparable)(comparable0)) , 0.0);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        lineAndShapeRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryTextAnnotation0)), layer0);
        org.junit.Assert.assertTrue(lineAndShapeRenderer0.getBaseSeriesVisibleInLegend());
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.IntervalBarRenderer intervalBarRenderer0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
        org.jfree.chart.urls.CustomCategoryURLGenerator customCategoryURLGenerator0 = new org.jfree.chart.urls.CustomCategoryURLGenerator();
        intervalBarRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(customCategoryURLGenerator0)), true);
        org.junit.Assert.assertTrue(intervalBarRenderer0.getShadowsVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        stackedBarRenderer3D0.setSeriesURLGenerator(0, ((org.jfree.chart.urls.CategoryURLGenerator)(null)), true);
        org.junit.Assert.assertTrue(stackedBarRenderer3D0.getBaseCreateEntities());
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = layeredBarRenderer0.getURLGenerator(0, 72, false);
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(null)), true);
        org.junit.Assert.assertTrue(minMaxCategoryRenderer0.getAutoPopulateSeriesStroke());
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = ganttRenderer0.getToolTipGenerator(968, 243, true);
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
        statisticalLineAndShapeRenderer0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)), true);
        org.junit.Assert.assertTrue(statisticalLineAndShapeRenderer0.getAutoPopulateSeriesPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesItemLabelGenerator(10, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)), true);
        org.junit.Assert.assertTrue(statisticalBarRenderer0.getAutoPopulateSeriesStroke());
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = stackedBarRenderer3D0.getSeriesToolTipGenerator(0);
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = levelRenderer0.getPlot();
        org.junit.Assert.assertNull(categoryPlot0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection0 = scatterRenderer0.getLegendItems();
        org.junit.Assert.assertEquals(0, legendItemCollection0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.chart.renderer.xy.CandlestickRenderer candlestickRenderer0 = new org.jfree.chart.renderer.xy.CandlestickRenderer(0.0);
        java.awt.Color color0 = ((java.awt.Color)(candlestickRenderer0.getBaseItemLabelPaint()));
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)) , candlestickRenderer0.DEFAULT_OUTLINE_PAINT , candlestickRenderer0.DEFAULT_PAINT);
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis0 = waterfallBarRenderer0.getRangeAxis(combinedDomainCategoryPlot0, 2);
        org.junit.Assert.assertNull(valueAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer1 = ((org.jfree.chart.renderer.category.ScatterRenderer)(scatterRenderer0.clone()));
        org.junit.Assert.assertEquals(0, scatterRenderer1.getRowCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.0 , 2481.27233028 , "Y/d07pwasll%h");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((java.lang.String)(null)) , stackedBarRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)) , true);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(70, 3, 0.2, 3.0, chartRenderingInfo0);
        org.jfree.chart.BufferedImageRenderingSource bufferedImageRenderingSource0 = new org.jfree.chart.BufferedImageRenderingSource(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImageRenderingSource0.createGraphics2D()));
        java.awt.geom.Ellipse2D.Float ellipse2D_Float0 = new java.awt.geom.Ellipse2D.Float(2.0F , ((float)(10)) , 0.0F , 1697.1183F);
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = ((java.awt.geom.Rectangle2D.Float)(ellipse2D_Float0.getBounds2D()));
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("NT~)IDx\"");
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        waterfallBarRenderer0.drawAnnotations(sunGraphics2D0, rectangle2D_Float0, extendedCategoryAxis0, cyclicNumberAxis0, layer0, ((org.jfree.chart.plot.PlotRenderingInfo)(null)));
        org.junit.Assert.assertFalse(cyclicNumberAxis0.isInverted());
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.0 , 2481.27233028 , "Y/d07pwasll%h");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((java.lang.String)(null)) , stackedBarRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)) , true);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 3, 0.2, 3.0, chartRenderingInfo0);
        org.jfree.chart.BufferedImageRenderingSource bufferedImageRenderingSource0 = new org.jfree.chart.BufferedImageRenderingSource(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImageRenderingSource0.createGraphics2D()));
        java.awt.geom.Ellipse2D.Float ellipse2D_Float0 = new java.awt.geom.Ellipse2D.Float(2.0F , ((float)(10)) , 0.0F , 1697.1183F);
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = ((java.awt.geom.Rectangle2D.Float)(ellipse2D_Float0.getBounds2D()));
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("NT~)IDx\"");
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        waterfallBarRenderer0.drawAnnotations(sunGraphics2D0, rectangle2D_Float0, extendedCategoryAxis0, cyclicNumberAxis0, layer0, ((org.jfree.chart.plot.PlotRenderingInfo)(null)));
        org.junit.Assert.assertEquals(0.05, cyclicNumberAxis0.getLowerMargin(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.data.statistics.DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
        ganttRenderer0.drawItemLabel(((java.awt.Graphics2D)(null)), ((org.jfree.chart.plot.PlotOrientation)(null)), defaultMultiValueCategoryDataset0, 33, 300, false, ((double)(lineRenderer3D0.ZERO)), 1336.6, true);
        org.junit.Assert.assertFalse(lineRenderer3D0.getAutoPopulateSeriesOutlineStroke());
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer1 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        boolean boolean0 = groupedStackedBarRenderer0.equals(groupedStackedBarRenderer1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer1 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.junit.Assert.assertTrue(groupedStackedBarRenderer1.equals(((java.lang.Object)(groupedStackedBarRenderer0))));
        groupedStackedBarRenderer1.setItemLabelAnchorOffset((-4804.888643107));
        boolean boolean0 = groupedStackedBarRenderer0.equals(groupedStackedBarRenderer1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.LegendItem legendItem0 = minMaxCategoryRenderer0.getLegendItem(1, (-3250));
        org.junit.Assert.assertNull(legendItem0);
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(true);
        java.awt.Polygon polygon0 = new java.awt.Polygon();
        java.awt.Rectangle rectangle0 = polygon0.getBounds();
        float[][] floatArray0 = new float[5][9];
        org.jfree.chart.axis.PeriodAxis periodAxis0 = new org.jfree.chart.axis.PeriodAxis("Null 'hotspot' argument.");
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.FastScatterPlot fastScatterPlot0 = new org.jfree.chart.plot.FastScatterPlot(floatArray0 , ((org.jfree.chart.axis.ValueAxis)(periodAxis0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = fastScatterPlot0.getOrientation();
        org.jfree.chart.plot.IntervalMarker intervalMarker0 = new org.jfree.chart.plot.IntervalMarker((-2591.0) , 1422.1980860560263);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType0 = intervalMarker0.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor0 = org.jfree.chart.util.RectangleAnchor.TOP;
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(stackedBarRenderer3D0.calculateRangeMarkerTextAnchorPoint(((java.awt.Graphics2D)(null)), plotOrientation0, rectangle0, rectangle0, numberAxis0.DEFAULT_AXIS_LABEL_INSETS, lengthAdjustmentType0, rectangleAnchor0)));
        org.junit.Assert.assertEquals(3.0, point2D_Double0.y, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(">XG_^R" , ganttRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)) , false);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, ((int)((byte)(86))), ((double)((byte)(-29))), 2162.19, ((org.jfree.chart.ChartRenderingInfo)(null)));
        org.jfree.chart.BufferedImageRenderingSource bufferedImageRenderingSource0 = new org.jfree.chart.BufferedImageRenderingSource(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImageRenderingSource0.createGraphics2D()));
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(ganttRenderer0)));
        ganttRenderer0.drawRangeLine(sunGraphics2D0, categoryPlot0, numberAxis3D0, ((java.awt.geom.Rectangle2D)(null)), (-533.960675279), jFreeChart0.DEFAULT_BACKGROUND_PAINT, categoryAxis0.DEFAULT_TICK_MARK_STROKE);
        org.junit.Assert.assertNull(numberAxis3D0.getLabel());
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        org.jfree.data.Range range0 = defaultCategoryItemRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(null)), false);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        stackedBarRenderer0.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator0);
        org.junit.Assert.assertEquals(0.2, org.jfree.chart.renderer.category.BarRenderer.DEFAULT_ITEM_MARGIN, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false , false);
        org.jfree.data.gantt.TaskSeries taskSeries0 = new org.jfree.data.gantt.TaskSeries("");
        java.lang.Comparable comparable0 = taskSeries0.getKey();
        org.jfree.chart.annotations.CategoryTextAnnotation categoryTextAnnotation0 = new org.jfree.chart.annotations.CategoryTextAnnotation("" , ((java.lang.Comparable)(comparable0)) , 0.0);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        lineAndShapeRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryTextAnnotation0)), layer0);
        org.junit.Assert.assertEquals(0, lineAndShapeRenderer0.getRowCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
        statisticalLineAndShapeRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(null)), false);
        org.junit.Assert.assertFalse(statisticalLineAndShapeRenderer0.getUseFillPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test69() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        boxAndWhiskerRenderer0.setSeriesURLGenerator(3, ((org.jfree.chart.urls.CategoryURLGenerator)(null)), false);
        org.junit.Assert.assertFalse(boxAndWhiskerRenderer0.getAutoPopulateSeriesOutlineStroke());
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.text.DecimalFormat decimalFormat0 = ((java.text.DecimalFormat)(java.text.NumberFormat.getCurrencyInstance(locale0)));
        org.jfree.chart.labels.IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator("[s" , ((java.text.NumberFormat)(decimalFormat0)));
        ganttRenderer0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(intervalCategoryToolTipGenerator0)), false);
        org.junit.Assert.assertEquals(0.0, ganttRenderer0.getMinimumBarLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test71() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        ganttRenderer0.setSeriesToolTipGenerator(968, ((org.jfree.chart.labels.CategoryToolTipGenerator)(null)), true);
        org.junit.Assert.assertEquals(0, ganttRenderer0.getColumnCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test72() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        scatterRenderer0.setSeriesToolTipGenerator(4, ((org.jfree.chart.labels.CategoryToolTipGenerator)(null)), false);
        org.junit.Assert.assertEquals(2.0, scatterRenderer0.getItemLabelAnchorOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test73() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(scatterRenderer0.DEFAULT_OUTLINE_PAINT , scatterRenderer0.DEFAULT_VALUE_LABEL_PAINT , scatterRenderer0.DEFAULT_PAINT , scatterRenderer0.DEFAULT_OUTLINE_PAINT);
        waterfallBarRenderer0.setSeriesItemLabelGenerator(4, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)), false);
        org.junit.Assert.assertTrue(waterfallBarRenderer0.getBaseSeriesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test75() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false , false);
        org.jfree.chart.urls.StandardCategoryURLGenerator standardCategoryURLGenerator0 = new org.jfree.chart.urls.StandardCategoryURLGenerator();
        lineAndShapeRenderer0.setSeriesURLGenerator(0, ((org.jfree.chart.urls.CategoryURLGenerator)(standardCategoryURLGenerator0)));
        org.junit.Assert.assertFalse(lineAndShapeRenderer0.getUseFillPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test76() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = lineAndShapeRenderer0.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test77() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = stackedBarRenderer3D0.getSeriesURLGenerator((-1));
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test78() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = stackedBarRenderer0.getBaseItemLabelGenerator();
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test79() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        lineAndShapeRenderer0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)));
        org.junit.Assert.assertEquals(0.0, lineAndShapeRenderer0.getItemMargin(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test80() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        scatterRenderer0.setLegendItemToolTipGenerator(((org.jfree.chart.labels.CategorySeriesLabelGenerator)(null)));
        org.junit.Assert.assertEquals(2.0, scatterRenderer0.getItemLabelAnchorOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test81() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        int int0 = scatterRenderer0.getRowCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        defaultCategoryItemRenderer0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(null)));
        org.junit.Assert.assertTrue(defaultCategoryItemRenderer0.getAutoPopulateSeriesStroke());
    }

    @org.junit.Test(timeout = 4000)
    public void test85() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = lineAndShapeRenderer0.getSeriesItemLabelGenerator((-2480));
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test86() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        lineAndShapeRenderer0.removeAnnotations();
        org.junit.Assert.assertTrue(lineAndShapeRenderer0.getBaseCreateEntities());
    }

    @org.junit.Test(timeout = 4000)
    public void test87() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        ganttRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(null)));
        org.junit.Assert.assertEquals(1, ganttRenderer0.getPassCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test89() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        lineRenderer3D0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test91() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        int int0 = statisticalBarRenderer0.getPassCount();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test92() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        int int0 = layeredBarRenderer0.getColumnCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test93() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        lineRenderer3D0.setLegendItemURLGenerator(((org.jfree.chart.labels.CategorySeriesLabelGenerator)(null)));
        org.junit.Assert.assertTrue(lineRenderer3D0.getBaseSeriesVisibleInLegend());
    }

    @org.junit.Test(timeout = 4000)
    public void test94() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = ((org.jfree.chart.labels.StandardCategorySeriesLabelGenerator)(defaultCategoryItemRenderer0.getLegendItemLabelGenerator()));
        org.junit.Assert.assertNotNull(standardCategorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test95() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(true);
        boolean boolean0 = stackedBarRenderer3D0.removeAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test96() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        double[][] doubleArray0 = new double[3][7];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray0 , doubleArray0);
        org.jfree.data.Range range0 = layeredBarRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
        org.junit.Assert.assertEquals(0.0, range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test98() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
        org.jfree.chart.annotations.CategoryPointerAnnotation categoryPointerAnnotation0 = new org.jfree.chart.annotations.CategoryPointerAnnotation("Null 'orientation' argument." , ((java.lang.Comparable)(25.7)) , 0.0 , (-4.0));
        statisticalLineAndShapeRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryPointerAnnotation0)));
        org.junit.Assert.assertTrue(statisticalLineAndShapeRenderer0.getAutoPopulateSeriesShape());
    }

    @org.junit.Test(timeout = 4000)
    public void test99() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(scatterRenderer0.DEFAULT_OUTLINE_PAINT , scatterRenderer0.DEFAULT_VALUE_LABEL_PAINT , scatterRenderer0.DEFAULT_PAINT , scatterRenderer0.DEFAULT_OUTLINE_PAINT);
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot();
        org.jfree.chart.labels.StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = ((org.jfree.chart.labels.StandardCategoryItemLabelGenerator)(spiderWebPlot0.getLabelGenerator()));
        waterfallBarRenderer0.setSeriesItemLabelGenerator(2, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(standardCategoryItemLabelGenerator0)));
        org.junit.Assert.assertEquals("{2}", standardCategoryItemLabelGenerator0.getLabelFormat());
    }
}

