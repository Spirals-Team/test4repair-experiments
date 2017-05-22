package org.jfree.chart.renderer.category;


public class AbstractCategoryItemRenderer_ESTest extends org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = combinedDomainXYPlot0.getOrientation();
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float();
        java.awt.geom.Rectangle2D.Float rectangle2D_Float1 = ((java.awt.geom.Rectangle2D.Float)(rectangle2D_Float0.getBounds2D()));
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType0 = org.jfree.chart.util.LengthAdjustmentType.CONTRACT;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor0 = org.jfree.chart.util.RectangleAnchor.TOP;
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(stackedAreaRenderer0.calculateDomainMarkerTextAnchorPoint(((java.awt.Graphics2D)(null)), plotOrientation0, rectangle2D_Float1, rectangle2D_Float0, combinedDomainXYPlot0.DEFAULT_INSETS, lengthAdjustmentType0, rectangleAnchor0)));
        org.junit.Assert.assertEquals(4.0, point2D_Double0.y, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        stackedBarRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(null)));
        org.junit.Assert.assertFalse(stackedBarRenderer0.getAutoPopulateSeriesOutlinePaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(true , false);
        statisticalLineAndShapeRenderer0.removeAnnotations();
        org.junit.Assert.assertTrue(statisticalLineAndShapeRenderer0.getBaseShapesFilled());
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        layeredBarRenderer0.setSeriesURLGenerator(243, ((org.jfree.chart.urls.CategoryURLGenerator)(null)));
        org.junit.Assert.assertFalse(layeredBarRenderer0.getBaseItemLabelsVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        ganttRenderer0.setSeriesToolTipGenerator(6, ((org.jfree.chart.labels.CategoryToolTipGenerator)(null)));
        org.junit.Assert.assertFalse(ganttRenderer0.getAutoPopulateSeriesFillPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis0 = minMaxCategoryRenderer0.getRangeAxis(combinedDomainCategoryPlot0, 4697);
        org.junit.Assert.assertNull(valueAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = ganttRenderer0.getLegendItemURLGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        stackedBarRenderer0.setLegendItemURLGenerator(standardCategorySeriesLabelGenerator0);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator1 = ((org.jfree.chart.labels.StandardCategorySeriesLabelGenerator)(stackedBarRenderer0.getLegendItemURLGenerator()));
        org.junit.Assert.assertSame(standardCategorySeriesLabelGenerator1, standardCategorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float();
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("%NxW");
        double double0 = levelRenderer0.getItemMiddle((-1.0F), (-1.0F), defaultStatisticalCategoryDataset0, categoryAxis3D0, rectangle2D_Float0, ((org.jfree.chart.util.RectangleEdge)(null)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(false , true);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("zLZ$7");
        org.jfree.data.time.DateRange dateRange0 = org.jfree.chart.axis.DateAxis.DEFAULT_DATE_RANGE;
        org.jfree.chart.axis.ModuloAxis moduloAxis0 = new org.jfree.chart.axis.ModuloAxis(((java.lang.String)(null)) , ((org.jfree.data.Range)(dateRange0)));
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(moduloAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(statisticalLineAndShapeRenderer0)));
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = statisticalLineAndShapeRenderer0.getDomainAxis(categoryPlot0, defaultCategoryDataset0);
        org.junit.Assert.assertEquals(0.05, categoryAxis1.getUpperMargin(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = statisticalBarRenderer0.getBaseURLGenerator();
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        boolean boolean0 = boxAndWhiskerRenderer0.equals(categoryPlot0.MINIMUM_WIDTH_TO_DRAW);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState0 = stackedBarRenderer0.createState(plotRenderingInfo0);
        org.junit.Assert.assertEquals(0.0, categoryItemRendererState0.getBarWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(false);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(stackedBarRenderer0.getBaseShape()));
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.data.gantt.SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new org.jfree.data.gantt.SlidingGanttCategoryDataset(((org.jfree.data.gantt.GanttCategoryDataset)(taskSeriesCollection0)) , 5 , 3515);
        try {
            stackedBarRenderer0.addEntity(standardEntityCollection0, rectangle2D_Double0, slidingGanttCategoryDataset0, (-2196), 3515, true, 3515, 5);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier0 = ganttRenderer0.getDrawingSupplier();
        org.junit.Assert.assertNull(drawingSupplier0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.Range range0 = stackedAreaRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(defaultBoxAndWhiskerCategoryDataset0)), false);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation0 = new org.jfree.chart.annotations.CategoryLineAnnotation(((java.lang.Comparable)(groupedStackedBarRenderer0.ZERO)) , (-1697.3336) , ((java.lang.Comparable)(3.0)) , ((double)(stackedAreaRenderer0.ZERO)) , groupedStackedBarRenderer0.DEFAULT_OUTLINE_PAINT , stackedAreaRenderer0.DEFAULT_OUTLINE_STROKE);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        stackedAreaRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryLineAnnotation0)), layer0);
        org.junit.Assert.assertTrue(stackedAreaRenderer0.getBaseSeriesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        org.jfree.chart.urls.StandardCategoryURLGenerator standardCategoryURLGenerator0 = new org.jfree.chart.urls.StandardCategoryURLGenerator("@Hj,R6");
        stackedBarRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(standardCategoryURLGenerator0)), true);
        org.junit.Assert.assertEquals(4.0, stackedBarRenderer0.getShadowYOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = groupedStackedBarRenderer0.getURLGenerator(3, 3, false);
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = stackedBarRenderer3D0.getToolTipGenerator(10, 10, true);
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        groupedStackedBarRenderer0.setSeriesItemLabelGenerator(1, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)), true);
        org.junit.Assert.assertTrue(groupedStackedBarRenderer0.getAutoPopulateSeriesStroke());
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection0 = levelRenderer0.getLegendItems();
        org.junit.Assert.assertEquals(0, legendItemCollection0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.axis.LogAxis logAxis0 = new org.jfree.chart.axis.LogAxis();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(logAxis0)));
        org.jfree.chart.axis.LogAxis logAxis1 = ((org.jfree.chart.axis.LogAxis)(minMaxCategoryRenderer0.getRangeAxis(combinedRangeCategoryPlot0, (-1179))));
        org.junit.Assert.assertNull(logAxis1.getLabel());
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(groupedStackedBarRenderer0.getRangeAxis(combinedRangeCategoryPlot0, 0)));
        org.junit.Assert.assertFalse(org.jfree.chart.axis.NumberAxis.DEFAULT_VERTICAL_TICK_LABELS);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        stackedAreaRenderer0.setLegendItemToolTipGenerator(standardCategorySeriesLabelGenerator0);
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer1 = ((org.jfree.chart.renderer.category.StackedAreaRenderer)(stackedAreaRenderer0.clone()));
        org.junit.Assert.assertTrue(stackedAreaRenderer1.getAutoPopulateSeriesPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        java.text.DecimalFormat decimalFormat0 = new java.text.DecimalFormat("");
        org.jfree.chart.labels.IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator("@" , ((java.text.NumberFormat)(decimalFormat0)));
        stackedAreaRenderer0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(intervalCategoryToolTipGenerator0)), true);
        stackedAreaRenderer0.clone();
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
        org.jfree.chart.labels.IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator();
        statisticalLineAndShapeRenderer0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(intervalCategoryItemLabelGenerator0)), true);
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer1 = ((org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer)(statisticalLineAndShapeRenderer0.clone()));
        org.junit.Assert.assertTrue(statisticalLineAndShapeRenderer1.getBaseLinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer1 = ((org.jfree.chart.renderer.category.MinMaxCategoryRenderer)(minMaxCategoryRenderer0.clone()));
        org.junit.Assert.assertTrue(minMaxCategoryRenderer1.equals(((java.lang.Object)(minMaxCategoryRenderer0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(1.0E11 , 1.0E11 , (-4071.1) , (-4071.1));
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("e0j}z|0A`j0~!Ti");
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        scatterRenderer0.drawAnnotations(((java.awt.Graphics2D)(null)), rectangle2D_Double0, categoryAxis0, ((org.jfree.chart.axis.ValueAxis)(null)), layer0, plotRenderingInfo0);
        org.junit.Assert.assertEquals("e0j}z|0A`j0~!Ti", categoryAxis0.getLabel());
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = combinedDomainCategoryPlot0.getOrientation();
        minMaxCategoryRenderer0.updateCrosshairValues(((org.jfree.chart.plot.CategoryCrosshairState)(null)), minMaxCategoryRenderer0.ZERO, minMaxCategoryRenderer0.ZERO, 2505.052, 207, 231.6997869863201, 2505.052, plotOrientation0);
        org.junit.Assert.assertEquals(3, minMaxCategoryRenderer0.getDefaultEntityRadius());
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        org.jfree.chart.LegendItem legendItem0 = levelRenderer0.getLegendItem(270, (-494));
        org.junit.Assert.assertNull(legendItem0);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis();
        ganttRenderer0.drawRangeLine(((java.awt.Graphics2D)(null)), ((org.jfree.chart.plot.CategoryPlot)(null)), dateAxis0, ((java.awt.geom.Rectangle2D)(null)), (-1692.213401778), dateAxis0.DEFAULT_AXIS_LINE_PAINT, statisticalBarRenderer0.DEFAULT_STROKE);
        org.junit.Assert.assertEquals(4.0, ganttRenderer0.getShadowXOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer(false);
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(1071 , 71);
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , statisticalBarRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(waferMapPlot0)) , false);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 1071, 10, ((org.jfree.chart.ChartRenderingInfo)(null)));
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        javax.swing.text.DefaultCaret defaultCaret0 = new javax.swing.text.DefaultCaret();
        categoryStepRenderer0.drawDomainLine(sunGraphics2D0, categoryPlot0, defaultCaret0, 3, waferMapPlot0.DEFAULT_GRIDLINE_PAINT, levelRenderer0.DEFAULT_STROKE);
        org.junit.Assert.assertEquals((-4144960), sunGraphics2D0.eargb);
        org.junit.Assert.assertEquals(192, sunGraphics2D0.pixel);
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.data.Range range0 = minMaxCategoryRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("Unknown layer.");
        scatterRenderer0.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator0);
        org.junit.Assert.assertFalse(scatterRenderer0.getUseOutlinePaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(levelRenderer0.lookupSeriesOutlineStroke(250)));
        org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation0 = new org.jfree.chart.annotations.CategoryLineAnnotation(((java.lang.Comparable)(levelRenderer0.ZERO)) , 0.0 , ((java.lang.Comparable)(0.2)) , 0.2 , levelRenderer0.DEFAULT_OUTLINE_PAINT , ((java.awt.Stroke)(basicStroke0)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        levelRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryLineAnnotation0)), layer0);
        org.junit.Assert.assertTrue(levelRenderer0.getBaseCreateEntities());
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        ganttRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(null)), false);
        org.junit.Assert.assertEquals(1.0, ganttRenderer0.getMaximumBarWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D(448.6 , 448.6);
        barRenderer3D0.setSeriesURLGenerator(1025, ((org.jfree.chart.urls.CategoryURLGenerator)(null)), true);
        org.junit.Assert.assertFalse(barRenderer3D0.getAutoPopulateSeriesOutlinePaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.urls.CustomCategoryURLGenerator customCategoryURLGenerator0 = new org.jfree.chart.urls.CustomCategoryURLGenerator();
        lineRenderer3D0.setSeriesURLGenerator(7, ((org.jfree.chart.urls.CategoryURLGenerator)(customCategoryURLGenerator0)), false);
        org.junit.Assert.assertEquals(2, lineRenderer3D0.getPassCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(true , false);
        java.text.DecimalFormat decimalFormat0 = ((java.text.DecimalFormat)(java.text.NumberFormat.getIntegerInstance()));
        org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator("FZAY;DRl;*G&|" , ((java.text.NumberFormat)(decimalFormat0)));
        statisticalLineAndShapeRenderer0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(boxAndWhiskerToolTipGenerator0)), false);
        org.junit.Assert.assertFalse(statisticalLineAndShapeRenderer0.getAutoPopulateSeriesFillPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        java.text.SimpleDateFormat simpleDateFormat0 = ((java.text.SimpleDateFormat)(java.text.DateFormat.getTimeInstance()));
        org.jfree.chart.labels.IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator("" , ((java.text.DateFormat)(simpleDateFormat0)));
        boxAndWhiskerRenderer0.setSeriesToolTipGenerator(0, ((org.jfree.chart.labels.CategoryToolTipGenerator)(intervalCategoryToolTipGenerator0)), true);
        org.junit.Assert.assertEquals("", intervalCategoryToolTipGenerator0.getLabelFormat());
    }

    @org.junit.Test(timeout = 4000)
    public void test67() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D((-325.87208) , ((double)(-3302)));
        stackedBarRenderer3D0.setSeriesToolTipGenerator(2, ((org.jfree.chart.labels.CategoryToolTipGenerator)(null)), false);
        org.junit.Assert.assertEquals(1.0, stackedBarRenderer3D0.getMaximumBarWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test69() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-6 , 1.0E-6);
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot();
        org.jfree.chart.labels.StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = ((org.jfree.chart.labels.StandardCategoryItemLabelGenerator)(spiderWebPlot0.getLabelGenerator()));
        barRenderer3D0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(standardCategoryItemLabelGenerator0)), false);
        org.junit.Assert.assertEquals(8.0, org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_Y_OFFSET, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        double[][] doubleArray0 = new double[2][8];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray0 , doubleArray0);
        org.jfree.chart.util.TableOrder tableOrder0 = org.jfree.chart.util.TableOrder.BY_COLUMN;
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)) , tableOrder0);
        org.jfree.chart.labels.StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = ((org.jfree.chart.labels.StandardCategoryItemLabelGenerator)(spiderWebPlot0.getLabelGenerator()));
        defaultCategoryItemRenderer0.setSeriesItemLabelGenerator(41, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(standardCategoryItemLabelGenerator0)), false);
        org.junit.Assert.assertTrue(defaultCategoryItemRenderer0.getBaseSeriesVisibleInLegend());
    }

    @org.junit.Test(timeout = 4000)
    public void test71() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(383.0996467263822 , 383.0996467263822 , false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = stackedBarRenderer3D0.getItemLabelGenerator(7, 71, false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test73() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = ganttRenderer0.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test74() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = barRenderer3D0.getSeriesURLGenerator((-1783));
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test75() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = ganttRenderer0.getBaseItemLabelGenerator();
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test76() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot();
        org.jfree.chart.labels.StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = ((org.jfree.chart.labels.StandardCategoryItemLabelGenerator)(spiderWebPlot0.getLabelGenerator()));
        barRenderer3D0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(standardCategoryItemLabelGenerator0)));
        org.junit.Assert.assertFalse(barRenderer3D0.getBaseItemLabelsVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test77() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        int int0 = scatterRenderer0.getRowCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test79() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        java.text.SimpleDateFormat simpleDateFormat0 = ((java.text.SimpleDateFormat)(java.text.DateFormat.getTimeInstance()));
        org.jfree.chart.labels.IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator("" , ((java.text.DateFormat)(simpleDateFormat0)));
        boxAndWhiskerRenderer0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(intervalCategoryToolTipGenerator0)));
        org.junit.Assert.assertTrue(boxAndWhiskerRenderer0.getAutoPopulateSeriesShape());
    }

    @org.junit.Test(timeout = 4000)
    public void test80() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = stackedBarRenderer0.getSeriesItemLabelGenerator((-201));
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test81() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = boxAndWhiskerRenderer0.getSeriesToolTipGenerator((-3443));
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test82() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.plot.FastScatterPlot fastScatterPlot0 = new org.jfree.chart.plot.FastScatterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("M5+a(F0D0Gq{#\"(" , ((org.jfree.chart.plot.Plot)(fastScatterPlot0)));
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1679, 5, chartRenderingInfo0);
        org.jfree.chart.BufferedImageRenderingSource bufferedImageRenderingSource0 = new org.jfree.chart.BufferedImageRenderingSource(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImageRenderingSource0.createGraphics2D()));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        ganttRenderer0.drawOutline(sunGraphics2D0, combinedDomainCategoryPlot0, rectangle2D_Double0);
        org.junit.Assert.assertEquals(0, combinedDomainCategoryPlot0.getWeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        barRenderer3D0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test85() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.IntervalBarRenderer intervalBarRenderer0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
        int int0 = intervalBarRenderer0.getPassCount();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test86() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        int int0 = stackedBarRenderer3D0.getColumnCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test87() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(((double)(stackedBarRenderer0.ZERO)) , 0.0 , true);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = ((org.jfree.chart.labels.StandardCategorySeriesLabelGenerator)(statisticalBarRenderer0.getLegendItemLabelGenerator()));
        stackedBarRenderer3D0.setLegendItemURLGenerator(standardCategorySeriesLabelGenerator0);
        org.junit.Assert.assertEquals(0.0, stackedBarRenderer3D0.getYOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test88() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-6 , 1.0E-6);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = ((org.jfree.chart.labels.StandardCategorySeriesLabelGenerator)(barRenderer3D0.getLegendItemLabelGenerator()));
        org.junit.Assert.assertNotNull(standardCategorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test89() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.annotations.CategoryTextAnnotation categoryTextAnnotation0 = new org.jfree.chart.annotations.CategoryTextAnnotation("" , ((java.lang.Comparable)("")) , ((double)(minMaxCategoryRenderer0.ZERO)));
        boolean boolean0 = minMaxCategoryRenderer0.removeAnnotation(categoryTextAnnotation0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test90() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        double[][] doubleArray0 = new double[7][4];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray0 , doubleArray0);
        org.jfree.data.Range range0 = minMaxCategoryRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
        org.junit.Assert.assertEquals(0.0, range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test91() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = ganttRenderer0.getDomainAxis(combinedRangeCategoryPlot0, ((org.jfree.data.category.CategoryDataset)(null)));
        org.junit.Assert.assertNull(categoryAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test92() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.IntervalBarRenderer intervalBarRenderer0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
        org.jfree.chart.annotations.CategoryPointerAnnotation categoryPointerAnnotation0 = new org.jfree.chart.annotations.CategoryPointerAnnotation("{0}" , ((java.lang.Comparable)(0.2)) , 2000.0 , 2897.637154237358);
        intervalBarRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryPointerAnnotation0)));
        org.junit.Assert.assertEquals(0.0, intervalBarRenderer0.getBase(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test93() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1617.187582777 , (-4.0));
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = stackedBarRenderer3D0.getBaseToolTipGenerator();
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test94() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesItemLabelGenerator(7, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)));
        org.junit.Assert.assertTrue(statisticalBarRenderer0.getBaseSeriesVisibleInLegend());
    }
}

