package org.jfree.chart.renderer.category;


public class AbstractCategoryItemRenderer_ESTest extends org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer(false);
        org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation0 = new org.jfree.chart.annotations.CategoryLineAnnotation(((java.lang.Comparable)(5)) , (-1192.806) , ((java.lang.Comparable)(5)) , ((double)(categoryStepRenderer0.ZERO)) , categoryStepRenderer0.DEFAULT_OUTLINE_PAINT , categoryStepRenderer0.DEFAULT_STROKE);
        categoryStepRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryLineAnnotation0)));
        org.junit.Assert.assertEquals(0, categoryStepRenderer0.getRowCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = ganttRenderer0.getSeriesItemLabelGenerator((-326));
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        org.jfree.data.Range range0 = defaultCategoryItemRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        boolean boolean0 = groupedStackedBarRenderer0.equals(layeredBarRenderer0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer(false);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        org.jfree.chart.renderer.category.CategoryStepRenderer.State categoryStepRenderer_State0 = ((org.jfree.chart.renderer.category.CategoryStepRenderer.State)(categoryStepRenderer0.createState(plotRenderingInfo0)));
        org.junit.Assert.assertEquals((-1), categoryStepRenderer_State0.getVisibleSeriesCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.AreaRenderer areaRenderer0 = new org.jfree.chart.renderer.category.AreaRenderer();
        org.jfree.chart.renderer.category.AreaRenderer areaRenderer1 = ((org.jfree.chart.renderer.category.AreaRenderer)(areaRenderer0.clone()));
        org.junit.Assert.assertFalse(areaRenderer1.getAutoPopulateSeriesOutlinePaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        java.awt.geom.Line2D.Float line2D_Float0 = new java.awt.geom.Line2D.Float();
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        try {
            groupedStackedBarRenderer0.addEntity(standardEntityCollection0, line2D_Float0, defaultKeyedValues2DDataset0, (-66), 1581, false, 0.0, (-1807.0));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer1 = ((org.jfree.chart.renderer.category.BoxAndWhiskerRenderer)(boxAndWhiskerRenderer0.clone()));
        org.junit.Assert.assertEquals(0.2, boxAndWhiskerRenderer1.getItemMargin(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier0 = ganttRenderer0.getDrawingSupplier();
        org.junit.Assert.assertNull(drawingSupplier0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        java.lang.Number[][] numberArray0 = new java.lang.Number[9][4];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0 , numberArray0);
        org.jfree.data.Range range0 = scatterRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)), false);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.urls.StandardCategoryURLGenerator standardCategoryURLGenerator0 = new org.jfree.chart.urls.StandardCategoryURLGenerator("");
        minMaxCategoryRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(standardCategoryURLGenerator0)), true);
        org.junit.Assert.assertEquals(1, minMaxCategoryRenderer0.getPassCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer(true);
        org.jfree.chart.urls.CustomCategoryURLGenerator customCategoryURLGenerator0 = new org.jfree.chart.urls.CustomCategoryURLGenerator();
        stackedAreaRenderer0.setSeriesURLGenerator(3734, ((org.jfree.chart.urls.CategoryURLGenerator)(customCategoryURLGenerator0)), true);
        org.junit.Assert.assertFalse(stackedAreaRenderer0.getAutoPopulateSeriesFillPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = defaultCategoryItemRenderer0.getURLGenerator((-2936), 1728, false);
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        java.util.Locale locale0 = java.util.Locale.forLanguageTag("org.jfree.data.jdbc.JDBCXYDataset");
        java.text.DecimalFormat decimalFormat0 = ((java.text.DecimalFormat)(java.text.NumberFormat.getIntegerInstance(locale0)));
        org.jfree.chart.labels.IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator("Unknown layer." , ((java.text.NumberFormat)(decimalFormat0)));
        stackedBarRenderer0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(intervalCategoryToolTipGenerator0)), true);
        org.junit.Assert.assertEquals(0.0, stackedBarRenderer0.getBase(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.text.DecimalFormat decimalFormat0 = ((java.text.DecimalFormat)(java.text.NumberFormat.getNumberInstance(locale0)));
        org.jfree.chart.labels.IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator("xvy;k9eTa!yx|KK=" , ((java.text.NumberFormat)(decimalFormat0)));
        levelRenderer0.setSeriesToolTipGenerator(3, ((org.jfree.chart.labels.CategoryToolTipGenerator)(intervalCategoryToolTipGenerator0)), true);
        org.junit.Assert.assertEquals(0.2, org.jfree.chart.renderer.category.LevelRenderer.DEFAULT_ITEM_MARGIN, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = minMaxCategoryRenderer0.getToolTipGenerator((-619), 8, false);
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(false , true);
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.text.DecimalFormat decimalFormat0 = ((java.text.DecimalFormat)(java.text.NumberFormat.getPercentInstance(locale0)));
        org.jfree.chart.labels.StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator("ItemLabelGenerator not cloneable." , ((java.text.NumberFormat)(decimalFormat0)) , ((java.text.NumberFormat)(decimalFormat0)));
        statisticalLineAndShapeRenderer0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(standardCategoryItemLabelGenerator0)), true);
        org.junit.Assert.assertEquals(2, statisticalLineAndShapeRenderer0.getPassCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        groupedStackedBarRenderer0.setSeriesItemLabelGenerator(1581, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)), true);
        org.junit.Assert.assertEquals(3, groupedStackedBarRenderer0.getPassCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalBarRenderer0.getSeriesToolTipGenerator(2201);
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(true , false);
        int int0 = statisticalLineAndShapeRenderer0.getRowCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = defaultCategoryItemRenderer0.getPlot();
        org.junit.Assert.assertNull(categoryPlot0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection0 = minMaxCategoryRenderer0.getLegendItems();
        org.junit.Assert.assertEquals(0, legendItemCollection0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.axis.ValueAxis valueAxis0 = stackedBarRenderer0.getRangeAxis(combinedDomainCategoryPlot0, 0);
        org.junit.Assert.assertNull(valueAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(null)));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        statisticalBarRenderer0.drawAnnotations(((java.awt.Graphics2D)(null)), rectangle2D_Float0, categoryAxis3D0, ((org.jfree.chart.axis.ValueAxis)(null)), layer0, plotRenderingInfo0);
        org.junit.Assert.assertTrue(org.jfree.chart.axis.Axis.DEFAULT_TICK_MARKS_VISIBLE);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(((org.jfree.chart.JFreeChart)(null)) , true , false , false , true , false);
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = chartPanel0.getOrientation();
        minMaxCategoryRenderer0.updateCrosshairValues(((org.jfree.chart.plot.CategoryCrosshairState)(null)), ((java.lang.Comparable)(null)), 3.141592653589793, 500, (-522), 3.141592653589793, 0.0, plotOrientation0);
        org.junit.Assert.assertEquals(1, minMaxCategoryRenderer0.getPassCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        boolean boolean0 = barRenderer0.equals(layeredBarRenderer0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator();
        layeredBarRenderer0.setSeriesToolTipGenerator(6, ((org.jfree.chart.labels.CategoryToolTipGenerator)(boxAndWhiskerToolTipGenerator0)));
        boolean boolean0 = barRenderer0.equals(layeredBarRenderer0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.LegendItem legendItem0 = minMaxCategoryRenderer0.getLegendItem((-718), (-231));
        org.junit.Assert.assertNull(legendItem0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.renderer.category.AreaRenderer areaRenderer0 = new org.jfree.chart.renderer.category.AreaRenderer();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("OHLCDataItem.compareTo()." , areaRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)) , false);
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , true , true , false , true , true);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        java.awt.geom.RoundRectangle2D.Float roundRectangle2D_Float0 = new java.awt.geom.RoundRectangle2D.Float();
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = ((java.awt.geom.Rectangle2D.Float)(roundRectangle2D_Float0.getBounds2D()));
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(20000.0 , "PROPERTIES");
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(267, 1, chartRenderingInfo0);
        org.jfree.chart.BufferedImageRenderingSource bufferedImageRenderingSource0 = new org.jfree.chart.BufferedImageRenderingSource(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImageRenderingSource0.createGraphics2D()));
        org.jfree.chart.plot.IntervalMarker intervalMarker0 = new org.jfree.chart.plot.IntervalMarker(((double)(0.0F)) , ((double)(10)) , lineRenderer3D0.DEFAULT_WALL_PAINT , lineRenderer3D0.DEFAULT_OUTLINE_STROKE , ganttRenderer0.DEFAULT_VALUE_LABEL_PAINT , cyclicNumberAxis0.DEFAULT_ADVANCE_LINE_STROKE , ((float)(1)));
        lineRenderer3D0.drawRangeMarker(sunGraphics2D0, combinedDomainCategoryPlot0, cyclicNumberAxis0, intervalMarker0, rectangle2D_Float0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.AreaRenderer areaRenderer0 = new org.jfree.chart.renderer.category.AreaRenderer();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("OHLCDataItem.compareTo()." , areaRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)) , false);
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        java.awt.geom.RoundRectangle2D.Float roundRectangle2D_Float0 = new java.awt.geom.RoundRectangle2D.Float();
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = ((java.awt.geom.Rectangle2D.Float)(roundRectangle2D_Float0.getBounds2D()));
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(20000.0 , "PROPERTIES");
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(280, 1, chartRenderingInfo0);
        org.jfree.chart.BufferedImageRenderingSource bufferedImageRenderingSource0 = new org.jfree.chart.BufferedImageRenderingSource(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImageRenderingSource0.createGraphics2D()));
        org.jfree.chart.plot.IntervalMarker intervalMarker0 = new org.jfree.chart.plot.IntervalMarker(((double)(1024)) , ((double)(areaRenderer0.ZERO)));
        lineRenderer3D0.drawRangeMarker(sunGraphics2D0, combinedDomainCategoryPlot0, cyclicNumberAxis0, intervalMarker0, rectangle2D_Float0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.AreaRenderer areaRenderer0 = new org.jfree.chart.renderer.category.AreaRenderer();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("OHLCDataItem.compareTo()." , areaRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)) , false);
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , true , true , false , true , true);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        java.awt.geom.RoundRectangle2D.Float roundRectangle2D_Float0 = new java.awt.geom.RoundRectangle2D.Float();
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = ((java.awt.geom.Rectangle2D.Float)(roundRectangle2D_Float0.getBounds2D()));
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("PRINT");
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(20000.0 , "PROPERTIES");
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(267, 1, chartRenderingInfo0);
        org.jfree.chart.BufferedImageRenderingSource bufferedImageRenderingSource0 = new org.jfree.chart.BufferedImageRenderingSource(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImageRenderingSource0.createGraphics2D()));
        org.jfree.chart.plot.IntervalMarker intervalMarker0 = new org.jfree.chart.plot.IntervalMarker(((double)(-1)) , ((double)(10)) , subCategoryAxis0.DEFAULT_AXIS_LABEL_PAINT);
        lineRenderer3D0.drawRangeMarker(sunGraphics2D0, combinedDomainCategoryPlot0, cyclicNumberAxis0, intervalMarker0, rectangle2D_Float0);
        org.junit.Assert.assertFalse(combinedDomainCategoryPlot0.isRangePannable());
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        org.jfree.data.Range range0 = defaultCategoryItemRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(null)), false);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState0 = ganttRenderer0.createState(plotRenderingInfo0);
        org.junit.Assert.assertEquals(0.0, categoryItemRendererState0.getBarWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("");
        scatterRenderer0.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator0);
        org.junit.Assert.assertTrue(scatterRenderer0.getAutoPopulateSeriesShape());
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(false , true);
        org.jfree.chart.annotations.CategoryPointerAnnotation categoryPointerAnnotation0 = new org.jfree.chart.annotations.CategoryPointerAnnotation("7RFd)zzk_zCI9\"B.w)" , ((java.lang.Comparable)(statisticalLineAndShapeRenderer0.ZERO)) , (-531.7407607238862) , (-1.0));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        statisticalLineAndShapeRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryPointerAnnotation0)), layer0);
        org.junit.Assert.assertEquals(3.0, org.jfree.chart.annotations.CategoryPointerAnnotation.DEFAULT_LABEL_OFFSET, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(false , true);
        org.jfree.chart.annotations.CategoryPointerAnnotation categoryPointerAnnotation0 = new org.jfree.chart.annotations.CategoryPointerAnnotation("7RFd)zzk_zCI9\"B.w)" , ((java.lang.Comparable)(statisticalLineAndShapeRenderer0.ZERO)) , (-531.7407607238862) , 0.0);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        statisticalLineAndShapeRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryPointerAnnotation0)), layer0);
        org.junit.Assert.assertEquals(3.0, categoryPointerAnnotation0.getLabelOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        ganttRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(null)), false);
        org.junit.Assert.assertEquals(1.0, ganttRenderer0.getMaximumBarWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false , true);
        lineAndShapeRenderer0.setSeriesURLGenerator(0, ((org.jfree.chart.urls.CategoryURLGenerator)(null)), false);
        org.junit.Assert.assertFalse(lineAndShapeRenderer0.getAutoPopulateSeriesOutlineStroke());
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator();
        minMaxCategoryRenderer0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(standardCategoryToolTipGenerator0)), false);
        org.junit.Assert.assertTrue(minMaxCategoryRenderer0.getBaseCreateEntities());
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        java.text.DecimalFormat decimalFormat0 = ((java.text.DecimalFormat)(java.text.NumberFormat.getInstance()));
        org.jfree.chart.labels.StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator("Not implemented." , ((java.text.NumberFormat)(decimalFormat0)));
        layeredBarRenderer0.setSeriesToolTipGenerator(2000, ((org.jfree.chart.labels.CategoryToolTipGenerator)(standardCategoryToolTipGenerator0)), false);
        org.junit.Assert.assertEquals(2.0, layeredBarRenderer0.getItemLabelAnchorOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        scatterRenderer0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)), false);
        org.junit.Assert.assertTrue(scatterRenderer0.getBaseSeriesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        levelRenderer0.setSeriesItemLabelGenerator(999, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)), false);
        org.junit.Assert.assertTrue(levelRenderer0.getAutoPopulateSeriesStroke());
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = scatterRenderer0.getItemLabelGenerator(102, 2333, true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test67() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        ganttRenderer0.setPlot(combinedDomainCategoryPlot0);
        org.junit.Assert.assertFalse(org.jfree.chart.plot.CategoryPlot.DEFAULT_DOMAIN_GRIDLINES_VISIBLE);
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        scatterRenderer0.setSeriesURLGenerator(1, ((org.jfree.chart.urls.CategoryURLGenerator)(null)));
        org.junit.Assert.assertTrue(scatterRenderer0.getAutoPopulateSeriesPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test69() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = defaultCategoryItemRenderer0.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(false , true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = statisticalLineAndShapeRenderer0.getSeriesURLGenerator(0);
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test71() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = layeredBarRenderer0.getBaseItemLabelGenerator();
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test73() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        scatterRenderer0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)));
        org.junit.Assert.assertTrue(scatterRenderer0.getAutoPopulateSeriesPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test74() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.IntervalBarRenderer intervalBarRenderer0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        intervalBarRenderer0.setLegendItemToolTipGenerator(standardCategorySeriesLabelGenerator0);
        org.junit.Assert.assertTrue(intervalBarRenderer0.getBaseSeriesVisibleInLegend());
    }

    @org.junit.Test(timeout = 4000)
    public void test77() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(false , true);
        statisticalLineAndShapeRenderer0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(null)));
        org.junit.Assert.assertFalse(statisticalLineAndShapeRenderer0.getAutoPopulateSeriesFillPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test78() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        barRenderer3D0.removeAnnotations();
        org.junit.Assert.assertEquals(1, barRenderer3D0.getPassCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test79() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.urls.StandardCategoryURLGenerator standardCategoryURLGenerator0 = new org.jfree.chart.urls.StandardCategoryURLGenerator("bt/^{*" , "bt/^{*" , "bt/^{*");
        ganttRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(standardCategoryURLGenerator0)));
        org.junit.Assert.assertFalse(ganttRenderer0.getIncludeBaseInRange());
    }

    @org.junit.Test(timeout = 4000)
    public void test80() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = categoryStepRenderer0.getBaseURLGenerator();
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        boxAndWhiskerRenderer0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test86() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        int int0 = ganttRenderer0.getPassCount();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test87() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        int int0 = ganttRenderer0.getColumnCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test88() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        defaultCategoryItemRenderer0.setLegendItemURLGenerator(((org.jfree.chart.labels.CategorySeriesLabelGenerator)(null)));
        org.junit.Assert.assertFalse(defaultCategoryItemRenderer0.getUseSeriesOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test89() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = ((org.jfree.chart.labels.StandardCategorySeriesLabelGenerator)(barRenderer3D0.getLegendItemLabelGenerator()));
        org.junit.Assert.assertNotNull(standardCategorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test90() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        boolean boolean0 = minMaxCategoryRenderer0.removeAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test91() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        double[][] doubleArray0 = new double[3][4];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray0 , doubleArray0);
        org.jfree.data.Range range0 = defaultCategoryItemRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
        org.junit.Assert.assertEquals(0.0, range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test94() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = boxAndWhiskerRenderer0.getBaseToolTipGenerator();
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test95() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        defaultCategoryItemRenderer0.setSeriesItemLabelGenerator(16, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)));
        org.junit.Assert.assertFalse(defaultCategoryItemRenderer0.getAutoPopulateSeriesFillPaint());
    }
}

