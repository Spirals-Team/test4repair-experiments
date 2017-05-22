package org.jfree.chart.renderer.category;


public class AbstractCategoryItemRenderer_ESTest extends org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(false , false);
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.pie.PieDataset)(null)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(piePlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = combinedDomainXYPlot0.getOrientation();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(1729.919294551 , (-2085.036) , 0.0 , (-1394.27655));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double1 = ((java.awt.geom.Rectangle2D.Double)(rectangle2D_Double0.getBounds2D()));
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType0 = org.jfree.chart.util.LengthAdjustmentType.CONTRACT;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor0 = org.jfree.chart.util.RectangleAnchor.BOTTOM_RIGHT;
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(statisticalLineAndShapeRenderer0.calculateRangeMarkerTextAnchorPoint(sunGraphics2D0, plotOrientation0, rectangle2D_Double1, rectangle2D_Double0, piePlot0.DEFAULT_INSETS, lengthAdjustmentType0, rectangleAnchor0)));
        org.junit.Assert.assertEquals((-3483.31255), point2D_Double0.y, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        ganttRenderer0.setLegendItemURLGenerator(((org.jfree.chart.labels.CategorySeriesLabelGenerator)(null)));
        org.junit.Assert.assertFalse(ganttRenderer0.getAutoPopulateSeriesOutlinePaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis0 = stackedBarRenderer3D0.getRangeAxis(categoryPlot0, 10);
        org.junit.Assert.assertNull(valueAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(false , false);
        org.jfree.chart.renderer.LookupPaintScale lookupPaintScale0 = new org.jfree.chart.renderer.LookupPaintScale();
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis();
        org.jfree.chart.title.PaintScaleLegend paintScaleLegend0 = new org.jfree.chart.title.PaintScaleLegend(((org.jfree.chart.renderer.PaintScale)(lookupPaintScale0)) , ((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        double[][] doubleArray0 = new double[0][7];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray0 , doubleArray0);
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(dateAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(statisticalLineAndShapeRenderer0)));
        org.jfree.chart.axis.DateAxis dateAxis1 = ((org.jfree.chart.axis.DateAxis)(minMaxCategoryRenderer0.getRangeAxis(categoryPlot0, (-4025))));
        org.junit.Assert.assertEquals(2.0, org.jfree.chart.axis.DateAxis.DEFAULT_AUTO_RANGE_MINIMUM_SIZE_IN_MILLISECONDS, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(false , false);
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        double[][] doubleArray0 = new double[0][7];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray0 , doubleArray0);
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(dateAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(statisticalLineAndShapeRenderer0)));
        org.jfree.chart.axis.DateAxis dateAxis1 = ((org.jfree.chart.axis.DateAxis)(minMaxCategoryRenderer0.getRangeAxis(categoryPlot0, (-4025))));
        org.junit.Assert.assertEquals(2.0F, org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_OUTSIDE_LENGTH, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot();
        java.awt.Color color0 = ((java.awt.Color)(meterPlot0.getNeedlePaint()));
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)) , meterPlot0.DEFAULT_BACKGROUND_PAINT);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = waterfallBarRenderer0.getPlot();
        org.junit.Assert.assertNull(categoryPlot0);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = ganttRenderer0.getLegendItemURLGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.IntervalBarRenderer intervalBarRenderer0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = intervalBarRenderer0.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = ((org.jfree.chart.labels.StandardCategorySeriesLabelGenerator)(minMaxCategoryRenderer0.getLegendItemLabelGenerator()));
        org.junit.Assert.assertNotNull(standardCategorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(0.0 , 0.0);
        org.jfree.chart.LegendItem legendItem0 = stackedBarRenderer3D0.getLegendItem(0, 34);
        org.junit.Assert.assertNull(legendItem0);
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        java.lang.Number[][] numberArray0 = new java.lang.Number[1][9];
        java.lang.Number[] numberArray1 = new java.lang.Number[2];
        numberArray1[0] = ((java.lang.Number)(6));
        numberArray1[1] = ((java.lang.Number)(levelRenderer0.ZERO));
        numberArray0[0] = numberArray1;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0 , numberArray0);
        org.jfree.data.Range range0 = levelRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)), true);
        org.junit.Assert.assertEquals(3.0, range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        java.lang.Number[][] numberArray0 = new java.lang.Number[1][9];
        java.lang.Number[] numberArray1 = new java.lang.Number[2];
        numberArray1[0] = ((java.lang.Number)(6));
        numberArray0[0] = numberArray1;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0 , numberArray0);
        org.jfree.data.Range range0 = levelRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)), true);
        org.junit.Assert.assertEquals(6.0, range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.AreaRenderer areaRenderer0 = new org.jfree.chart.renderer.category.AreaRenderer();
        boolean boolean0 = areaRenderer0.equals(((java.lang.Object)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D1 = ((org.jfree.chart.renderer.category.BarRenderer3D)(barRenderer3D0.clone()));
        org.junit.Assert.assertTrue(barRenderer3D1.getBaseCreateEntities());
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE));
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.data.statistics.DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
        try {
            stackedBarRenderer0.addEntity(standardEntityCollection0, rectangle2D_Double0, defaultMultiValueCategoryDataset0, (-1), (-1), false);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier0 = statisticalBarRenderer0.getDrawingSupplier();
        org.junit.Assert.assertNull(drawingSupplier0);
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        org.jfree.chart.annotations.CategoryPointerAnnotation categoryPointerAnnotation0 = new org.jfree.chart.annotations.CategoryPointerAnnotation("_B!*svJ CHiIzwJ&5'" , ((java.lang.Comparable)("_B!*svJ CHiIzwJ&5'")) , 0.0 , 0.0);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        levelRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryPointerAnnotation0)), layer0);
        org.junit.Assert.assertEquals(3.0, org.jfree.chart.annotations.CategoryPointerAnnotation.DEFAULT_LABEL_OFFSET, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        ganttRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(null)), true);
        org.junit.Assert.assertTrue(ganttRenderer0.getAutoPopulateSeriesShape());
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer(true);
        org.jfree.chart.urls.StandardCategoryURLGenerator standardCategoryURLGenerator0 = new org.jfree.chart.urls.StandardCategoryURLGenerator("");
        categoryStepRenderer0.setSeriesURLGenerator(0, ((org.jfree.chart.urls.CategoryURLGenerator)(standardCategoryURLGenerator0)), true);
        org.junit.Assert.assertFalse(categoryStepRenderer0.getAutoPopulateSeriesOutlinePaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        levelRenderer0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(null)), true);
        org.junit.Assert.assertFalse(levelRenderer0.getBaseItemLabelsVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        layeredBarRenderer0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)), true);
        org.junit.Assert.assertFalse(layeredBarRenderer0.getBaseItemLabelsVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(false);
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.text.DecimalFormat decimalFormat0 = ((java.text.DecimalFormat)(java.text.NumberFormat.getNumberInstance(locale0)));
        org.jfree.chart.labels.IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator("'Po<~NevH1VMI9w[I$" , ((java.text.NumberFormat)(decimalFormat0)));
        stackedBarRenderer3D0.setSeriesItemLabelGenerator(62, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(intervalCategoryItemLabelGenerator0)), true);
        org.junit.Assert.assertFalse(stackedBarRenderer3D0.getAutoPopulateSeriesFillPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(0.0 , 1.0E10 , true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = stackedBarRenderer3D0.getItemLabelGenerator(0, 0, true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        org.jfree.chart.renderer.xy.CandlestickRenderer candlestickRenderer0 = new org.jfree.chart.renderer.xy.CandlestickRenderer(1330.0);
        java.awt.Color color0 = ((java.awt.Color)(candlestickRenderer0.getBasePaint()));
        java.awt.SystemColor systemColor0 = java.awt.SystemColor.windowBorder;
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(((java.awt.Paint)(color0)) , candlestickRenderer0.DEFAULT_PAINT , candlestickRenderer0.DEFAULT_VALUE_LABEL_PAINT , ((java.awt.Paint)(systemColor0)));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(null)));
        waterfallBarRenderer0.setPlot(combinedRangeCategoryPlot0);
        org.junit.Assert.assertEquals(0.0, combinedRangeCategoryPlot0.getAnchorValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = defaultCategoryItemRenderer0.getSeriesToolTipGenerator((-1));
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        int int0 = layeredBarRenderer0.getColumnCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.LegendItemCollection legendItemCollection0 = stackedBarRenderer3D0.getLegendItems();
        org.junit.Assert.assertEquals(0, legendItemCollection0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.data.gantt.SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new org.jfree.data.gantt.SlidingGanttCategoryDataset(((org.jfree.data.gantt.GanttCategoryDataset)(taskSeriesCollection0)) , (-1) , (-1));
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.LogAxis logAxis0 = new org.jfree.chart.axis.LogAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(slidingGanttCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(logAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(ganttRenderer0)));
        org.jfree.chart.LegendItemCollection legendItemCollection0 = ganttRenderer0.getLegendItems();
        org.junit.Assert.assertEquals(0, legendItemCollection0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        org.jfree.chart.axis.LogAxis logAxis0 = new org.jfree.chart.axis.LogAxis();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(logAxis0)));
        org.jfree.chart.axis.LogAxis logAxis1 = ((org.jfree.chart.axis.LogAxis)(levelRenderer0.getRangeAxis(combinedRangeCategoryPlot0, 10)));
        org.junit.Assert.assertTrue(org.jfree.chart.axis.ValueAxis.DEFAULT_AUTO_TICK_UNIT_SELECTION);
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        ganttRenderer0.setLegendItemToolTipGenerator(standardCategorySeriesLabelGenerator0);
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer1 = ((org.jfree.chart.renderer.category.GanttRenderer)(ganttRenderer0.clone()));
        org.junit.Assert.assertEquals(0.2, ganttRenderer1.getItemMargin(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("\"5@`4wQ,w0Vm" , minMaxCategoryRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)) , false);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        org.jfree.chart.BufferedImageRenderingSource bufferedImageRenderingSource0 = new org.jfree.chart.BufferedImageRenderingSource(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImageRenderingSource0.createGraphics2D()));
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double((-230.79438) , (-1.0) , 2.0 , ((double)(10)));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        stackedBarRenderer3D0.drawAnnotations(sunGraphics2D0, rectangle2D_Double0, categoryAxis0, numberAxis3D0, layer0, plotRenderingInfo0);
        org.junit.Assert.assertEquals(9.0, rectangle2D_Double0.getMaxY(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(false);
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
        ganttRenderer0.updateCrosshairValues(((org.jfree.chart.plot.CategoryCrosshairState)(null)), stackedBarRenderer0.ZERO, stackedBarRenderer0.ZERO, 0.2, 3, 3.0, 4.0, plotOrientation0);
        org.junit.Assert.assertTrue(stackedBarRenderer0.getAutoPopulateSeriesStroke());
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer1 = new org.jfree.chart.renderer.category.GanttRenderer();
        boolean boolean0 = ganttRenderer0.equals(ganttRenderer1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer1 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.junit.Assert.assertTrue(groupedStackedBarRenderer1.equals(((java.lang.Object)(groupedStackedBarRenderer0))));
        groupedStackedBarRenderer1.setItemLabelAnchorOffset(((double)(minMaxCategoryRenderer0.ZERO)));
        boolean boolean0 = groupedStackedBarRenderer0.equals(groupedStackedBarRenderer1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("\"5@`4wQ,w0Vm" , minMaxCategoryRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)) , false);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        org.jfree.chart.BufferedImageRenderingSource bufferedImageRenderingSource0 = new org.jfree.chart.BufferedImageRenderingSource(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImageRenderingSource0.createGraphics2D()));
        org.jfree.chart.plot.PolarPlot polarPlot0 = new org.jfree.chart.plot.PolarPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = polarPlot0.getOrientation();
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double((-230.79438) , (-1.0) , 2.0 , ((double)(10)));
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType0 = org.jfree.chart.util.LengthAdjustmentType.CONTRACT;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor0 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(stackedBarRenderer3D0.calculateDomainMarkerTextAnchorPoint(sunGraphics2D0, plotOrientation0, rectangle2D_Double0, rectangle2D_Double0, polarPlot0.DEFAULT_INSETS, lengthAdjustmentType0, rectangleAnchor0)));
        org.junit.Assert.assertEquals(4.0, point2D_Double0.y, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float(7.7F , 2868.8105F , 0.0F , 2868.8105F);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        org.jfree.chart.plot.PolarPlot polarPlot0 = new org.jfree.chart.plot.PolarPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("QC6k3z" , ((org.jfree.chart.plot.Plot)(polarPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(11, 10, chartRenderingInfo0);
        org.jfree.chart.BufferedImageRenderingSource bufferedImageRenderingSource0 = new org.jfree.chart.BufferedImageRenderingSource(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImageRenderingSource0.createGraphics2D()));
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = org.jfree.chart.plot.PlotOrientation.VERTICAL;
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor0 = legendTitle0.getLegendItemGraphicLocation();
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(lineAndShapeRenderer0.calculateDomainMarkerTextAnchorPoint(sunGraphics2D0, plotOrientation0, rectangle2D_Float0, rectangle2D_Float0, polarPlot0.DEFAULT_INSETS, ((org.jfree.chart.util.LengthAdjustmentType)(null)), rectangleAnchor0)));
        org.junit.Assert.assertEquals(7.699999809265137, point2D_Double0.x, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.pie.PieDataset)(null)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(piePlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(1729.919294551 , (-2085.036) , 0.0 , (-1394.27655));
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.SystemColor systemColor0 = java.awt.SystemColor.activeCaptionText;
        org.jfree.chart.plot.ValueMarker valueMarker0 = new org.jfree.chart.plot.ValueMarker(1805.5786436722362 , ((java.awt.Paint)(systemColor0)) , dateAxis0.DEFAULT_TICK_MARK_STROKE , ((java.awt.Paint)(systemColor0)) , sunGraphics2D0.stroke , 1.0F);
        minMaxCategoryRenderer0.drawRangeMarker(sunGraphics2D0, ((org.jfree.chart.plot.CategoryPlot)(null)), dateAxis0, valueMarker0, rectangle2D_Double0);
        org.junit.Assert.assertTrue(dateAxis0.isAxisLineVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        java.lang.Number[][] numberArray0 = new java.lang.Number[1][9];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0 , numberArray0);
        org.jfree.data.Range range0 = levelRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)), true);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(true , true);
        org.jfree.data.Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.pie.PieDataset)(null)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(piePlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(1729.919294551 , (-2085.036) , 0.0 , (-1394.27655));
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState0 = stackedBarRenderer0.initialise(sunGraphics2D0, rectangle2D_Double0, combinedRangeCategoryPlot0, ((org.jfree.data.category.CategoryDataset)(null)), ((org.jfree.chart.plot.PlotRenderingInfo)(null)));
        org.junit.Assert.assertEquals(0, stackedBarRenderer0.getColumnCount());
        org.junit.Assert.assertEquals(0, categoryItemRendererState0.getVisibleSeriesCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = ((org.jfree.chart.labels.StandardCategorySeriesLabelGenerator)(statisticalBarRenderer0.getLegendItemLabelGenerator()));
        stackedAreaRenderer0.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator0);
        org.junit.Assert.assertTrue(stackedAreaRenderer0.getAutoPopulateSeriesPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.annotations.CategoryTextAnnotation categoryTextAnnotation0 = new org.jfree.chart.annotations.CategoryTextAnnotation("p" , ((java.lang.Comparable)("p")) , 5.0);
        stackedAreaRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryTextAnnotation0)));
        org.junit.Assert.assertFalse(stackedAreaRenderer0.getAutoPopulateSeriesOutlineStroke());
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.annotations.CategoryPointerAnnotation categoryPointerAnnotation0 = new org.jfree.chart.annotations.CategoryPointerAnnotation("\"@8H|NRc" , ((java.lang.Comparable)(true)) , (-3996.0) , 12.0);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        boxAndWhiskerRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryPointerAnnotation0)), layer0);
        org.junit.Assert.assertEquals(5.0, categoryPointerAnnotation0.getArrowLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(null)), false);
        org.junit.Assert.assertTrue(minMaxCategoryRenderer0.getAutoPopulateSeriesStroke());
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        ganttRenderer0.setSeriesURLGenerator(3, ((org.jfree.chart.urls.CategoryURLGenerator)(null)), false);
        org.junit.Assert.assertEquals(3.0, org.jfree.chart.renderer.category.BarRenderer.BAR_OUTLINE_WIDTH_THRESHOLD, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = stackedBarRenderer3D0.getURLGenerator(69, 69, false);
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.IntervalBarRenderer intervalBarRenderer0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
        intervalBarRenderer0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(null)), false);
        org.junit.Assert.assertEquals(2.0, intervalBarRenderer0.getItemLabelAnchorOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.IntervalBarRenderer intervalBarRenderer0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
        intervalBarRenderer0.setSeriesToolTipGenerator(1569, ((org.jfree.chart.labels.CategoryToolTipGenerator)(null)), false);
        org.junit.Assert.assertEquals(0.2, org.jfree.chart.renderer.category.BarRenderer.DEFAULT_ITEM_MARGIN, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        org.jfree.chart.labels.IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator();
        defaultCategoryItemRenderer0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(intervalCategoryItemLabelGenerator0)), false);
        org.junit.Assert.assertTrue(defaultCategoryItemRenderer0.getBaseCreateEntities());
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator();
        minMaxCategoryRenderer0.setSeriesItemLabelGenerator(36, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(intervalCategoryItemLabelGenerator0)));
        org.junit.Assert.assertEquals(2.0, minMaxCategoryRenderer0.getItemLabelAnchorOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        ganttRenderer0.setSeriesItemLabelGenerator(147, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)), false);
        org.junit.Assert.assertEquals(0.2, org.jfree.chart.renderer.category.BarRenderer.DEFAULT_ITEM_MARGIN, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("\"5@`4wQ,w0Vm" , minMaxCategoryRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)) , false);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        org.jfree.chart.BufferedImageRenderingSource bufferedImageRenderingSource0 = new org.jfree.chart.BufferedImageRenderingSource(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImageRenderingSource0.createGraphics2D()));
        org.jfree.chart.plot.PolarPlot polarPlot0 = new org.jfree.chart.plot.PolarPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = polarPlot0.getOrientation();
        org.jfree.data.statistics.DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
        minMaxCategoryRenderer0.drawItemLabel(sunGraphics2D0, plotOrientation0, defaultMultiValueCategoryDataset0, 0, 1, true, 1.0F, 1287.57622565575, false);
        org.junit.Assert.assertEquals(1, sunGraphics2D0.antialiasHint);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        ganttRenderer0.setSeriesURLGenerator(500, ((org.jfree.chart.urls.CategoryURLGenerator)(null)));
        org.junit.Assert.assertTrue(ganttRenderer0.getBaseSeriesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = scatterRenderer0.getSeriesURLGenerator(738);
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = scatterRenderer0.getBaseItemLabelGenerator();
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.AreaRenderer areaRenderer0 = new org.jfree.chart.renderer.category.AreaRenderer();
        areaRenderer0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)));
        org.junit.Assert.assertTrue(areaRenderer0.getBaseCreateEntities());
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        int int0 = barRenderer3D0.getRowCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.labels.IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator();
        ganttRenderer0.setSeriesToolTipGenerator(3, ((org.jfree.chart.labels.CategoryToolTipGenerator)(intervalCategoryToolTipGenerator0)));
        org.junit.Assert.assertEquals(4.0, ganttRenderer0.getShadowXOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot();
        java.text.DecimalFormat decimalFormat0 = ((java.text.DecimalFormat)(meterPlot0.getTickLabelFormat()));
        org.jfree.chart.labels.IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator("p" , ((java.text.NumberFormat)(decimalFormat0)));
        stackedAreaRenderer0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(intervalCategoryToolTipGenerator0)));
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer1 = ((org.jfree.chart.renderer.category.StackedAreaRenderer)(stackedAreaRenderer0.clone()));
        org.junit.Assert.assertEquals(2, stackedAreaRenderer1.getPassCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalLineAndShapeRenderer0.getSeriesItemLabelGenerator(2062);
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        stackedAreaRenderer0.removeAnnotations();
        org.junit.Assert.assertTrue(stackedAreaRenderer0.getBaseCreateEntities());
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
        statisticalLineAndShapeRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(null)));
        org.junit.Assert.assertFalse(statisticalLineAndShapeRenderer0.getBaseItemLabelsVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = stackedAreaRenderer0.getBaseURLGenerator();
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = boxAndWhiskerRenderer0.getToolTipGenerator((-1619), (-1177), true);
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer();
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(categoryStepRenderer0.DEFAULT_PAINT , categoryStepRenderer0.DEFAULT_PAINT , categoryStepRenderer0.DEFAULT_PAINT , categoryStepRenderer0.DEFAULT_OUTLINE_PAINT);
        waterfallBarRenderer0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        int int0 = ganttRenderer0.getPassCount();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true , true);
        org.jfree.chart.annotations.CategoryTextAnnotation categoryTextAnnotation0 = new org.jfree.chart.annotations.CategoryTextAnnotation("qX_s~}^dDrKFYO" , ((java.lang.Comparable)(ganttRenderer0.ZERO)) , 0.0);
        boolean boolean0 = lineAndShapeRenderer0.removeAnnotation(categoryTextAnnotation0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.Range range0 = layeredBarRenderer0.findRangeBounds(defaultBoxAndWhiskerCategoryDataset0);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = lineRenderer3D0.getBaseToolTipGenerator();
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }
}

