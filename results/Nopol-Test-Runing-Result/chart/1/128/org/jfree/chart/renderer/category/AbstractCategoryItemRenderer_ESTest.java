package org.jfree.chart.renderer.category;


public class AbstractCategoryItemRenderer_ESTest extends org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D((-2104.9784491156524) , (-2104.9784491156524));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        org.jfree.chart.renderer.category.CategoryStepRenderer.State categoryStepRenderer_State0 = new org.jfree.chart.renderer.category.CategoryStepRenderer.State(plotRenderingInfo0);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = ((org.jfree.chart.entity.StandardEntityCollection)(categoryStepRenderer_State0.getEntityCollection()));
        double[][] doubleArray0 = new double[9][8];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray0 , doubleArray0);
        barRenderer3D0.addEntity(standardEntityCollection0, categoryStepRenderer_State0.line, defaultIntervalCategoryDataset0, 2, 2, false);
        org.junit.Assert.assertEquals(1, standardEntityCollection0.getEntityCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(false);
        org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation0 = new org.jfree.chart.annotations.CategoryLineAnnotation(((java.lang.Comparable)(0.2)) , 0.0 , ((java.lang.Comparable)(stackedBarRenderer0.ZERO)) , (-4689.14334) , stackedBarRenderer0.DEFAULT_PAINT , stackedBarRenderer0.DEFAULT_OUTLINE_STROKE);
        stackedBarRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryLineAnnotation0)));
        org.junit.Assert.assertEquals(2.0, stackedBarRenderer0.getItemLabelAnchorOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis0 = stackedBarRenderer0.getRangeAxis(combinedDomainCategoryPlot0, 3);
        org.junit.Assert.assertNull(valueAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis();
        dateAxis0.setAutoTickUnitSelection(false);
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.axis.DateAxis dateAxis1 = ((org.jfree.chart.axis.DateAxis)(defaultCategoryItemRenderer0.getRangeAxis(combinedRangeCategoryPlot0, 1575)));
        org.junit.Assert.assertEquals(0.05, org.jfree.chart.axis.ValueAxis.DEFAULT_LOWER_MARGIN, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        dateAxis0.resizeRange(2464.8);
        org.jfree.chart.axis.DateAxis dateAxis1 = ((org.jfree.chart.axis.DateAxis)(defaultCategoryItemRenderer0.getRangeAxis(combinedRangeCategoryPlot0, 1575)));
        org.junit.Assert.assertNull(dateAxis1.getLabel());
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = lineRenderer3D0.getPlot();
        org.junit.Assert.assertNull(categoryPlot0);
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = boxAndWhiskerRenderer0.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.LegendItem legendItem0 = groupedStackedBarRenderer0.getLegendItem((-2129), (-4630));
        org.junit.Assert.assertNull(legendItem0);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = stackedBarRenderer0.getItemLabelGenerator(1856, 1856, false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = scatterRenderer0.getDomainAxis(categoryPlot0, ((org.jfree.data.category.CategoryDataset)(null)));
        org.junit.Assert.assertNull(categoryAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.data.statistics.DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.0 , ((double)(2.0F)) , ((java.lang.String)(null)));
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultMultiValueCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(groupedStackedBarRenderer0)));
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D1 = ((org.jfree.chart.axis.CategoryAxis3D)(levelRenderer0.getDomainAxis(categoryPlot0, defaultMultiValueCategoryDataset0)));
        org.junit.Assert.assertEquals(0.0F, org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_INSIDE_LENGTH, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer();
        boolean boolean0 = categoryStepRenderer0.equals("Null 'anchor' argument.");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState0 = stackedBarRenderer3D0.createState(plotRenderingInfo0);
        org.junit.Assert.assertEquals(0.0, categoryItemRendererState0.getSeriesRunningTotal(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D((-388.4277276377) , (-1523.23867584632));
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.renderer.xy.XYBlockRenderer xYBlockRenderer0 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
        org.jfree.chart.renderer.LookupPaintScale lookupPaintScale0 = ((org.jfree.chart.renderer.LookupPaintScale)(xYBlockRenderer0.getPaintScale()));
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        org.jfree.chart.title.PaintScaleLegend paintScaleLegend0 = new org.jfree.chart.title.PaintScaleLegend(((org.jfree.chart.renderer.PaintScale)(lookupPaintScale0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = ((java.awt.geom.Rectangle2D.Float)(paintScaleLegend0.getBounds()));
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        try {
            barRenderer3D0.addEntity(standardEntityCollection0, rectangle2D_Float0, defaultKeyedValues2DDataset0, (-97), 363, true);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(true , true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier0 = statisticalLineAndShapeRenderer0.getDrawingSupplier();
        org.junit.Assert.assertNull(drawingSupplier0);
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.data.Range range0 = stackedAreaRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)), false);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float();
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.0);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedAreaRenderer0)));
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState0 = stackedAreaRenderer0.initialise(((java.awt.Graphics2D)(null)), rectangle2D_Float0, categoryPlot0, defaultKeyedValues2DDataset0, ((org.jfree.chart.plot.PlotRenderingInfo)(null)));
        org.junit.Assert.assertEquals(0.0, categoryItemRendererState0.getBarWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer(true);
        stackedAreaRenderer0.setSeriesURLGenerator(0, ((org.jfree.chart.urls.CategoryURLGenerator)(null)), true);
        org.junit.Assert.assertEquals(2, stackedAreaRenderer0.getPassCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.IntervalBarRenderer intervalBarRenderer0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = intervalBarRenderer0.getURLGenerator(334, (-339), true);
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.IntervalBarRenderer intervalBarRenderer0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.text.DecimalFormat decimalFormat0 = ((java.text.DecimalFormat)(java.text.NumberFormat.getInstance(locale0)));
        org.jfree.chart.labels.StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator("6m" , ((java.text.NumberFormat)(decimalFormat0)));
        intervalBarRenderer0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(standardCategoryToolTipGenerator0)), true);
        org.junit.Assert.assertTrue(intervalBarRenderer0.getAutoPopulateSeriesPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        org.jfree.chart.text.TextBox textBox0 = new org.jfree.chart.text.TextBox();
        java.awt.Color color0 = ((java.awt.Color)(textBox0.getOutlinePaint()));
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)));
        org.jfree.chart.labels.StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator();
        waterfallBarRenderer0.setSeriesToolTipGenerator(0, ((org.jfree.chart.labels.CategoryToolTipGenerator)(standardCategoryToolTipGenerator0)), true);
        org.junit.Assert.assertFalse(waterfallBarRenderer0.getAutoPopulateSeriesOutlineStroke());
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = categoryStepRenderer0.getToolTipGenerator(0, 0, false);
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(false);
        stackedBarRenderer0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)), true);
        org.junit.Assert.assertEquals(4.0, stackedBarRenderer0.getShadowYOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.IntervalBarRenderer intervalBarRenderer0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
        java.text.DecimalFormat decimalFormat0 = ((java.text.DecimalFormat)(java.text.NumberFormat.getInstance()));
        org.jfree.chart.labels.IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator("java.util.RandomAccess" , ((java.text.NumberFormat)(decimalFormat0)));
        intervalBarRenderer0.setSeriesItemLabelGenerator(39, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(intervalCategoryItemLabelGenerator0)), true);
        org.junit.Assert.assertEquals(4.0, intervalBarRenderer0.getShadowYOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(0.0 , 0.0);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        stackedBarRenderer3D0.setPlot(categoryPlot0);
        org.junit.Assert.assertEquals(12.0, org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_X_OFFSET, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = boxAndWhiskerRenderer0.getSeriesToolTipGenerator(0);
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        int int0 = scatterRenderer0.getColumnCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.urls.CustomCategoryURLGenerator customCategoryURLGenerator0 = new org.jfree.chart.urls.CustomCategoryURLGenerator();
        scatterRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(customCategoryURLGenerator0)), false);
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        try {
            scatterRenderer0.addEntity(((org.jfree.chart.entity.EntityCollection)(null)), scatterRenderer0.DEFAULT_SHAPE, defaultKeyedValues2DDataset0, (-175), (-175), false, ((double)(scatterRenderer0.ZERO)), ((double)(scatterRenderer0.ZERO)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.LegendItemCollection legendItemCollection0 = lineRenderer3D0.getLegendItems();
        org.junit.Assert.assertEquals(0, legendItemCollection0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer1 = ((org.jfree.chart.renderer.category.BoxAndWhiskerRenderer)(boxAndWhiskerRenderer0.clone()));
        org.junit.Assert.assertTrue(boxAndWhiskerRenderer1.getAutoPopulateSeriesShape());
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(false , false);
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1, 1, 1.0E8, 25.0, ((org.jfree.chart.ChartRenderingInfo)(null)));
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        java.awt.Rectangle rectangle0 = rectangle2D_Double0.getBounds();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("Tv]");
        java.lang.String[] stringArray0 = new java.lang.String[0];
        org.jfree.chart.axis.SymbolAxis symbolAxis0 = new org.jfree.chart.axis.SymbolAxis("Tv]" , stringArray0);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        statisticalLineAndShapeRenderer0.drawAnnotations(sunGraphics2D0, rectangle0, categoryAxis0, symbolAxis0, layer0, plotRenderingInfo0);
        org.junit.Assert.assertEquals(2.0F, categoryAxis0.getMinorTickMarkOutsideLength(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(null)));
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
        scatterRenderer0.drawItemLabel(((java.awt.Graphics2D)(null)), plotOrientation0, ((org.jfree.data.category.CategoryDataset)(null)), 3, 2, false, 2, (-1157.9562990621), false);
        org.junit.Assert.assertEquals(2.0, scatterRenderer0.getItemLabelAnchorOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = categoryPlot0.getOrientation();
        barRenderer0.updateCrosshairValues(((org.jfree.chart.plot.CategoryCrosshairState)(null)), 0.0F, 0.0F, 1237.434F, 0, 1237.434F, (-909.3215), plotOrientation0);
        org.junit.Assert.assertTrue(barRenderer0.getAutoPopulateSeriesPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D1 = new org.jfree.chart.renderer.category.LineRenderer3D();
        boolean boolean0 = lineRenderer3D0.equals(lineRenderer3D1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D1 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.junit.Assert.assertTrue(lineRenderer3D1.equals(((java.lang.Object)(lineRenderer3D0))));
        lineRenderer3D1.setSeriesLinesVisible(1, true);
        boolean boolean0 = lineRenderer3D0.equals(lineRenderer3D1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        java.awt.Color color0 = java.awt.Color.DARK_GRAY;
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)));
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset((-4956.2622268877));
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
        javax.swing.JViewport jViewport0 = new javax.swing.JViewport();
        java.awt.Rectangle rectangle0 = jViewport0.getViewRect();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType0 = org.jfree.chart.util.LengthAdjustmentType.CONTRACT;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor0 = org.jfree.chart.util.RectangleAnchor.TOP_RIGHT;
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(waterfallBarRenderer0.calculateRangeMarkerTextAnchorPoint(((java.awt.Graphics2D)(null)), plotOrientation0, rectangle0, rectangle0, thermometerPlot0.DEFAULT_INSETS, lengthAdjustmentType0, rectangleAnchor0)));
        org.junit.Assert.assertEquals(4.0, point2D_Double0.y, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(true , true);
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(86, 5, chartRenderingInfo0);
        org.jfree.chart.BufferedImageRenderingSource bufferedImageRenderingSource0 = new org.jfree.chart.BufferedImageRenderingSource(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImageRenderingSource0.createGraphics2D()));
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        float[] floatArray0 = new float[7];
        java.awt.image.Kernel kernel0 = new java.awt.image.Kernel(0 , 0 , floatArray0);
        java.awt.image.ConvolveOp convolveOp0 = new java.awt.image.ConvolveOp(kernel0 , 61 , sunGraphics2D0.hints);
        java.awt.Rectangle rectangle0 = ((java.awt.Rectangle)(convolveOp0.getBounds2D(bufferedImage0)));
        org.jfree.chart.plot.IntervalMarker intervalMarker0 = new org.jfree.chart.plot.IntervalMarker(((double)(10)) , ((double)(-1)));
        statisticalLineAndShapeRenderer0.drawRangeMarker(sunGraphics2D0, ((org.jfree.chart.plot.CategoryPlot)(null)), numberAxis0, intervalMarker0, rectangle0);
        org.junit.Assert.assertEquals(1, sunGraphics2D0.antialiasHint);
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(true , true);
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(86, 5, chartRenderingInfo0);
        org.jfree.chart.BufferedImageRenderingSource bufferedImageRenderingSource0 = new org.jfree.chart.BufferedImageRenderingSource(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImageRenderingSource0.createGraphics2D()));
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        float[] floatArray0 = new float[7];
        java.awt.image.Kernel kernel0 = new java.awt.image.Kernel(0 , 0 , floatArray0);
        java.awt.image.ConvolveOp convolveOp0 = new java.awt.image.ConvolveOp(kernel0 , 61 , sunGraphics2D0.hints);
        java.awt.Rectangle rectangle0 = ((java.awt.Rectangle)(convolveOp0.getBounds2D(bufferedImage0)));
        statisticalLineAndShapeRenderer0.drawRangeLine(sunGraphics2D0, ((org.jfree.chart.plot.CategoryPlot)(null)), numberAxis0, rectangle0, 1963.271003965712, numberAxis0.DEFAULT_AXIS_LINE_PAINT, numberAxis0.DEFAULT_TICK_MARK_STROKE);
        org.junit.Assert.assertFalse(rectangle0.isEmpty());
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(86, 5, chartRenderingInfo0);
        org.jfree.chart.BufferedImageRenderingSource bufferedImageRenderingSource0 = new org.jfree.chart.BufferedImageRenderingSource(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImageRenderingSource0.createGraphics2D()));
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        float[] floatArray0 = new float[7];
        java.awt.image.Kernel kernel0 = new java.awt.image.Kernel(0 , 0 , floatArray0);
        java.awt.image.ConvolveOp convolveOp0 = new java.awt.image.ConvolveOp(kernel0 , 61 , sunGraphics2D0.hints);
        java.awt.Rectangle rectangle0 = ((java.awt.Rectangle)(convolveOp0.getBounds2D(bufferedImage0)));
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        stackedAreaRenderer0.drawDomainLine(sunGraphics2D0, combinedRangeCategoryPlot0, rectangle0, 0.0, combinedRangeXYPlot0.DEFAULT_OUTLINE_PAINT, combinedRangeXYPlot0.DEFAULT_OUTLINE_STROKE);
        org.junit.Assert.assertEquals((-8355712), sunGraphics2D0.pixel);
        org.junit.Assert.assertEquals((-8355712), sunGraphics2D0.eargb);
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
        org.jfree.data.Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.IntervalBarRenderer intervalBarRenderer0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset((-339) , 335);
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer0 = new org.jfree.chart.renderer.WaferMapRenderer();
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0 , waferMapRenderer0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(334, 10);
        org.jfree.chart.BufferedImageRenderingSource bufferedImageRenderingSource0 = new org.jfree.chart.BufferedImageRenderingSource(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImageRenderingSource0.createGraphics2D()));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        java.awt.Rectangle rectangle0 = rectangle2D_Double0.getBounds();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState0 = intervalBarRenderer0.initialise(sunGraphics2D0, rectangle0, combinedDomainCategoryPlot0, ((org.jfree.data.category.CategoryDataset)(null)), ((org.jfree.chart.plot.PlotRenderingInfo)(null)));
        org.junit.Assert.assertEquals(0, intervalBarRenderer0.getColumnCount());
        org.junit.Assert.assertEquals(0, categoryItemRendererState0.getVisibleSeriesCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float();
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.0);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedAreaRenderer0)));
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        defaultKeyedValues2DDataset0.setValue(0.0, ((java.lang.Comparable)("({0}, {1}) = {2}")), ((java.lang.Comparable)(0.2)));
        statisticalBarRenderer0.initialise(((java.awt.Graphics2D)(null)), rectangle2D_Float0, categoryPlot0, defaultKeyedValues2DDataset0, ((org.jfree.chart.plot.PlotRenderingInfo)(null)));
        org.junit.Assert.assertEquals(1, statisticalBarRenderer0.getColumnCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        stackedBarRenderer0.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator0);
        org.junit.Assert.assertFalse(stackedBarRenderer0.getAutoPopulateSeriesOutlinePaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.annotations.CategoryPointerAnnotation categoryPointerAnnotation0 = new org.jfree.chart.annotations.CategoryPointerAnnotation("J,_qt#;[z8]kbsr" , ((java.lang.Comparable)(8.0)) , ((double)(lineRenderer3D0.ZERO)) , 0.0);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        lineRenderer3D0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryPointerAnnotation0)), layer0);
        org.junit.Assert.assertTrue(lineRenderer3D0.getDataBoundsIncludesVisibleSeriesOnly());
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation0 = new org.jfree.chart.annotations.CategoryLineAnnotation(((java.lang.Comparable)(lineRenderer3D0.ZERO)) , 107.0 , ((java.lang.Comparable)(12.0)) , 154.5 , lineRenderer3D0.DEFAULT_VALUE_LABEL_PAINT , lineRenderer3D0.DEFAULT_OUTLINE_STROKE);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        defaultCategoryItemRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryLineAnnotation0)), layer0);
        org.junit.Assert.assertFalse(defaultCategoryItemRenderer0.getAutoPopulateSeriesOutlinePaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.urls.CustomCategoryURLGenerator customCategoryURLGenerator0 = new org.jfree.chart.urls.CustomCategoryURLGenerator();
        scatterRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(customCategoryURLGenerator0)), false);
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer1 = ((org.jfree.chart.renderer.category.ScatterRenderer)(scatterRenderer0.clone()));
        org.junit.Assert.assertTrue(scatterRenderer1.getDataBoundsIncludesVisibleSeriesOnly());
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        stackedBarRenderer3D0.setSeriesURLGenerator(43, ((org.jfree.chart.urls.CategoryURLGenerator)(null)), false);
        org.junit.Assert.assertEquals(8.0, org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_Y_OFFSET, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer();
        categoryStepRenderer0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(null)), false);
        org.junit.Assert.assertTrue(categoryStepRenderer0.getAutoPopulateSeriesPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        org.jfree.chart.text.TextBox textBox0 = new org.jfree.chart.text.TextBox();
        java.awt.Color color0 = ((java.awt.Color)(textBox0.getOutlinePaint()));
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)));
        org.jfree.chart.labels.IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator();
        waterfallBarRenderer0.setSeriesToolTipGenerator(0, ((org.jfree.chart.labels.CategoryToolTipGenerator)(intervalCategoryToolTipGenerator0)), false);
        org.junit.Assert.assertEquals(1.0, waterfallBarRenderer0.getMaximumBarWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot();
        org.jfree.chart.labels.StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = ((org.jfree.chart.labels.StandardCategoryItemLabelGenerator)(spiderWebPlot0.getLabelGenerator()));
        defaultCategoryItemRenderer0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(standardCategoryItemLabelGenerator0)), false);
        org.junit.Assert.assertTrue(defaultCategoryItemRenderer0.getAutoPopulateSeriesPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        stackedBarRenderer0.setSeriesItemLabelGenerator(3, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)), false);
        org.junit.Assert.assertFalse(stackedBarRenderer0.getAutoPopulateSeriesFillPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D(0.0 , (-1376.943570652986));
        barRenderer3D0.setSeriesURLGenerator(633, ((org.jfree.chart.urls.CategoryURLGenerator)(null)));
        org.junit.Assert.assertEquals(8.0, org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_Y_OFFSET, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = scatterRenderer0.getSeriesURLGenerator(234);
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = groupedStackedBarRenderer0.getBaseItemLabelGenerator();
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(false , false);
        statisticalLineAndShapeRenderer0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)));
        org.junit.Assert.assertEquals(0, statisticalLineAndShapeRenderer0.getRowCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        scatterRenderer0.setLegendItemToolTipGenerator(((org.jfree.chart.labels.CategorySeriesLabelGenerator)(null)));
        org.junit.Assert.assertTrue(scatterRenderer0.getBaseSeriesVisibleInLegend());
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        int int0 = defaultCategoryItemRenderer0.getRowCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        defaultCategoryItemRenderer0.setSeriesToolTipGenerator(1696, ((org.jfree.chart.labels.CategoryToolTipGenerator)(null)));
        org.junit.Assert.assertEquals(0, defaultCategoryItemRenderer0.getRowCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.labels.StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator();
        scatterRenderer0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(standardCategoryToolTipGenerator0)));
        org.junit.Assert.assertTrue(scatterRenderer0.getBaseShapesFilled());
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = scatterRenderer0.getSeriesItemLabelGenerator((-477));
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = boxAndWhiskerRenderer0.getLegendItemURLGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        levelRenderer0.removeAnnotations();
        org.junit.Assert.assertTrue(levelRenderer0.getAutoPopulateSeriesPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        scatterRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(null)));
        org.junit.Assert.assertTrue(scatterRenderer0.getAutoPopulateSeriesPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = lineRenderer3D0.getBaseURLGenerator();
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        scatterRenderer0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        int int0 = scatterRenderer0.getPassCount();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        lineRenderer3D0.setLegendItemURLGenerator(((org.jfree.chart.labels.CategorySeriesLabelGenerator)(null)));
        org.junit.Assert.assertFalse(lineRenderer3D0.getUseFillPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = ((org.jfree.chart.labels.StandardCategorySeriesLabelGenerator)(categoryStepRenderer0.getLegendItemLabelGenerator()));
        org.junit.Assert.assertNotNull(standardCategorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer();
        boolean boolean0 = categoryStepRenderer0.removeAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.data.Range range0 = boxAndWhiskerRenderer0.findRangeBounds(defaultKeyedValues2DDataset0);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = defaultCategoryItemRenderer0.getBaseToolTipGenerator();
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        scatterRenderer0.setSeriesItemLabelGenerator(6, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)));
        org.junit.Assert.assertEquals(2.0, scatterRenderer0.getItemLabelAnchorOffset(), 0.01);
    }
}

