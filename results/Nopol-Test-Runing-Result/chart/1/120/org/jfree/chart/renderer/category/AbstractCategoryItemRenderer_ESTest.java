package org.jfree.chart.renderer.category;


public class AbstractCategoryItemRenderer_ESTest extends org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(xYPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D("");
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(org.jfree.chart.axis.CyclicNumberAxis.DEFAULT_ADVANCE_LINE_STROKE));
        try {
            stackedAreaRenderer0.drawRangeLine(sunGraphics2D0, combinedDomainCategoryPlot0, numberAxis3D0, ((java.awt.geom.Rectangle2D)(null)), 0.0, numberAxis3D0.DEFAULT_TICK_LABEL_PAINT, basicStroke0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(true , false);
        org.jfree.chart.annotations.CategoryPointerAnnotation categoryPointerAnnotation0 = new org.jfree.chart.annotations.CategoryPointerAnnotation("Base tool tip generator not cloneable." , ((java.lang.Comparable)(0.0)) , 1963.53389687 , 1.0);
        statisticalLineAndShapeRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryPointerAnnotation0)));
        org.junit.Assert.assertFalse(statisticalLineAndShapeRenderer0.getAutoPopulateSeriesFillPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = waterfallBarRenderer0.getDomainAxis(combinedRangeCategoryPlot0, ((org.jfree.data.category.CategoryDataset)(null)));
        org.junit.Assert.assertNull(categoryAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("Null 'hotspot' argument.");
        subCategoryAxis0.setTickMarkInsideLength(400.2F);
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("{2}");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(dateAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(boxAndWhiskerRenderer0)));
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis1 = ((org.jfree.chart.axis.SubCategoryAxis)(minMaxCategoryRenderer0.getDomainAxis(categoryPlot0, ((org.jfree.data.category.CategoryDataset)(null)))));
        org.junit.Assert.assertEquals(0.0F, org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_INSIDE_LENGTH, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true , true);
        org.jfree.chart.urls.StandardCategoryURLGenerator standardCategoryURLGenerator0 = new org.jfree.chart.urls.StandardCategoryURLGenerator();
        lineAndShapeRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(standardCategoryURLGenerator0)));
        org.jfree.chart.urls.StandardCategoryURLGenerator standardCategoryURLGenerator1 = ((org.jfree.chart.urls.StandardCategoryURLGenerator)(lineAndShapeRenderer0.getBaseURLGenerator()));
        org.junit.Assert.assertSame(standardCategoryURLGenerator1, standardCategoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.chart.renderer.DefaultPolarItemRenderer defaultPolarItemRenderer0 = new org.jfree.chart.renderer.DefaultPolarItemRenderer();
        java.awt.Color color0 = ((java.awt.Color)(defaultPolarItemRenderer0.getBaseItemLabelPaint()));
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(((java.awt.Paint)(color0)) , defaultPolarItemRenderer0.DEFAULT_VALUE_LABEL_PAINT , defaultPolarItemRenderer0.DEFAULT_VALUE_LABEL_PAINT , defaultPolarItemRenderer0.DEFAULT_PAINT);
        boolean boolean0 = waterfallBarRenderer0.equals(((java.lang.Object)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(true , false);
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer1 = ((org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer)(statisticalLineAndShapeRenderer0.clone()));
        org.junit.Assert.assertTrue(statisticalLineAndShapeRenderer1.getAutoPopulateSeriesPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        org.jfree.chart.renderer.category.CategoryStepRenderer.State categoryStepRenderer_State0 = new org.jfree.chart.renderer.category.CategoryStepRenderer.State(plotRenderingInfo0);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = ((org.jfree.chart.entity.StandardEntityCollection)(categoryStepRenderer_State0.getEntityCollection()));
        org.jfree.data.statistics.DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
        org.jfree.data.category.SlidingCategoryDataset slidingCategoryDataset0 = new org.jfree.data.category.SlidingCategoryDataset(((org.jfree.data.category.CategoryDataset)(defaultMultiValueCategoryDataset0)) , (-9) , 0);
        try {
            scatterRenderer0.addEntity(standardEntityCollection0, minMaxCategoryRenderer0.DEFAULT_SHAPE, slidingCategoryDataset0, (-9), 58, true, 593.02111919293, 0.0);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(statisticalBarRenderer0.DEFAULT_OUTLINE_PAINT , statisticalBarRenderer0.DEFAULT_VALUE_LABEL_PAINT , statisticalBarRenderer0.DEFAULT_PAINT , statisticalBarRenderer0.DEFAULT_PAINT);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        try {
            waterfallBarRenderer0.addEntity(standardEntityCollection0, rectangle2D_Float0, defaultBoxAndWhiskerCategoryDataset0, (-2288), 4579, false);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier0 = scatterRenderer0.getDrawingSupplier();
        org.junit.Assert.assertNull(drawingSupplier0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.data.Range range0 = boxAndWhiskerRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(null)), false);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        groupedStackedBarRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(null)), true);
        org.junit.Assert.assertEquals(0, groupedStackedBarRenderer0.getColumnCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer(true);
        org.jfree.chart.urls.StandardCategoryURLGenerator standardCategoryURLGenerator0 = new org.jfree.chart.urls.StandardCategoryURLGenerator();
        stackedAreaRenderer0.setSeriesURLGenerator(2901, ((org.jfree.chart.urls.CategoryURLGenerator)(standardCategoryURLGenerator0)), true);
        org.junit.Assert.assertFalse(stackedAreaRenderer0.getAutoPopulateSeriesOutlinePaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = boxAndWhiskerRenderer0.getURLGenerator((-1377), (-1377), false);
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        stackedAreaRenderer0.setSeriesToolTipGenerator(140, ((org.jfree.chart.labels.CategoryToolTipGenerator)(null)), true);
        org.junit.Assert.assertEquals(2.0, stackedAreaRenderer0.getItemLabelAnchorOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = stackedAreaRenderer0.getToolTipGenerator((-1700), 128, true);
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true , false);
        java.lang.Number[][] numberArray0 = new java.lang.Number[3][8];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0 , numberArray0);
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)));
        org.jfree.chart.labels.StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = ((org.jfree.chart.labels.StandardCategoryItemLabelGenerator)(spiderWebPlot0.getLabelGenerator()));
        lineAndShapeRenderer0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(standardCategoryItemLabelGenerator0)), true);
        org.junit.Assert.assertTrue(lineAndShapeRenderer0.getAutoPopulateSeriesShape());
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
        statisticalLineAndShapeRenderer0.setSeriesItemLabelGenerator(0, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)), true);
        org.junit.Assert.assertTrue(statisticalLineAndShapeRenderer0.getDrawOutlines());
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = minMaxCategoryRenderer0.getSeriesToolTipGenerator(2);
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = barRenderer3D0.getPlot();
        org.junit.Assert.assertNull(categoryPlot0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection0 = stackedAreaRenderer0.getLegendItems();
        org.junit.Assert.assertEquals(0, legendItemCollection0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        org.jfree.chart.axis.ValueAxis valueAxis0 = levelRenderer0.getRangeAxis(combinedDomainCategoryPlot0, (-101));
        org.junit.Assert.assertNull(valueAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(true , false);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        statisticalLineAndShapeRenderer0.setLegendItemToolTipGenerator(standardCategorySeriesLabelGenerator0);
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer1 = ((org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer)(statisticalLineAndShapeRenderer0.clone()));
        org.junit.Assert.assertTrue(statisticalLineAndShapeRenderer1.getBaseSeriesVisibleInLegend());
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer1 = ((org.jfree.chart.renderer.category.StackedBarRenderer)(stackedBarRenderer0.clone()));
        org.junit.Assert.assertTrue(stackedBarRenderer1.getAutoPopulateSeriesShape());
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("T`zD0u;2]" , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0);
        sun.swing.PrintColorUIResource printColorUIResource0 = ((sun.swing.PrintColorUIResource)(chartPanel0.getForeground()));
        java.awt.SystemColor systemColor0 = java.awt.SystemColor.controlDkShadow;
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(((java.awt.Paint)(printColorUIResource0)) , ((java.awt.Paint)(systemColor0)) , combinedRangeCategoryPlot0.DEFAULT_GRIDLINE_PAINT , combinedRangeCategoryPlot0.DEFAULT_OUTLINE_PAINT);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 680, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = chartPanel0.getOrientation();
        java.lang.Number[][] numberArray0 = new java.lang.Number[1][2];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.Comparable[])(null)) , ((java.lang.Comparable[])(null)) , numberArray0 , numberArray0);
        waterfallBarRenderer0.drawItemLabel(sunGraphics2D0, plotOrientation0, defaultIntervalCategoryDataset0, 854, 10, false, (-1514.394), 300, false);
        org.junit.Assert.assertTrue(waterfallBarRenderer0.getBaseSeriesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        stackedBarRenderer0.setPlot(categoryPlot0);
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(stackedBarRenderer0.lookupSeriesShape(2656)));
        org.junit.Assert.assertEquals((-3.0), rectangle2D_Double0.x, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer1 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        boolean boolean0 = groupedStackedBarRenderer0.equals(groupedStackedBarRenderer1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer1 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.junit.Assert.assertTrue(groupedStackedBarRenderer1.equals(((java.lang.Object)(groupedStackedBarRenderer0))));
        groupedStackedBarRenderer1.setDefaultEntityRadius(181);
        boolean boolean0 = groupedStackedBarRenderer0.equals(groupedStackedBarRenderer1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        org.jfree.chart.LegendItem legendItem0 = levelRenderer0.getLegendItem(1267, 1267);
        org.junit.Assert.assertNull(legendItem0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        java.lang.Number[][] numberArray0 = new java.lang.Number[6][6];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0 , numberArray0);
        org.jfree.data.Range range0 = layeredBarRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("T`zD0u;2]" , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 680, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        javax.swing.text.DefaultCaret defaultCaret0 = new javax.swing.text.DefaultCaret();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState0 = boxAndWhiskerRenderer0.initialise(sunGraphics2D0, defaultCaret0, combinedRangeCategoryPlot0, ((org.jfree.data.category.CategoryDataset)(null)), plotRenderingInfo0);
        org.junit.Assert.assertEquals(0, boxAndWhiskerRenderer0.getColumnCount());
        org.junit.Assert.assertEquals(0, categoryItemRendererState0.getVisibleSeriesCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.awt.Color color0 = ((java.awt.Color)(defaultDrawingSupplier0.getNextFillPaint()));
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)));
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState0 = waterfallBarRenderer0.createState(((org.jfree.chart.plot.PlotRenderingInfo)(null)));
        org.junit.Assert.assertEquals(0, categoryItemRendererState0.getVisibleSeriesCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        barRenderer0.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator0);
        org.junit.Assert.assertEquals(0.2, org.jfree.chart.renderer.category.BarRenderer.DEFAULT_ITEM_MARGIN, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.annotations.CategoryTextAnnotation categoryTextAnnotation0 = new org.jfree.chart.annotations.CategoryTextAnnotation("`qpH " , ((java.lang.Comparable)(scatterRenderer0.ZERO)) , (-127.0));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        statisticalBarRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryTextAnnotation0)), layer0);
        org.junit.Assert.assertEquals(3.0, org.jfree.chart.renderer.category.BarRenderer.BAR_OUTLINE_WIDTH_THRESHOLD, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        org.jfree.chart.annotations.CategoryPointerAnnotation categoryPointerAnnotation0 = new org.jfree.chart.annotations.CategoryPointerAnnotation("Not implemented." , ((java.lang.Comparable)("Not implemented.")) , 270.0 , (-970.06492441717));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        levelRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryPointerAnnotation0)), layer0);
        org.junit.Assert.assertEquals(270.0, categoryPointerAnnotation0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        boxAndWhiskerRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(null)), false);
        org.junit.Assert.assertEquals(0, boxAndWhiskerRenderer0.getRowCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer();
        waterfallBarRenderer0.setSeriesURLGenerator(45, ((org.jfree.chart.urls.CategoryURLGenerator)(null)), false);
        org.junit.Assert.assertEquals(1.0, waterfallBarRenderer0.getMinimumBarLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test67() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        java.util.Locale locale0 = new java.util.Locale("Null 'stroke' argument." , "Null 'stroke' argument." , "Null 'stroke' argument.");
        java.text.DecimalFormat decimalFormat0 = ((java.text.DecimalFormat)(java.text.NumberFormat.getInstance(locale0)));
        org.jfree.chart.labels.IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator("Null 'stroke' argument." , ((java.text.NumberFormat)(decimalFormat0)));
        ganttRenderer0.setSeriesToolTipGenerator(0, ((org.jfree.chart.labels.CategoryToolTipGenerator)(intervalCategoryToolTipGenerator0)));
        org.junit.Assert.assertTrue(ganttRenderer0.getShadowsVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        layeredBarRenderer0.setSeriesToolTipGenerator(0, ((org.jfree.chart.labels.CategoryToolTipGenerator)(null)), false);
        org.junit.Assert.assertFalse(layeredBarRenderer0.getAutoPopulateSeriesFillPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test69() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(false);
        org.jfree.chart.labels.IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator();
        stackedBarRenderer3D0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(intervalCategoryItemLabelGenerator0)), false);
        org.jfree.chart.labels.IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator1 = ((org.jfree.chart.labels.IntervalCategoryItemLabelGenerator)(stackedBarRenderer3D0.getItemLabelGenerator((-656), 0, true)));
        org.junit.Assert.assertEquals("({0}, {1}) = {3} - {4}", intervalCategoryItemLabelGenerator1.getLabelFormat());
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        stackedAreaRenderer0.setSeriesItemLabelGenerator(140, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)));
        org.junit.Assert.assertTrue(stackedAreaRenderer0.getAutoPopulateSeriesShape());
    }

    @org.junit.Test(timeout = 4000)
    public void test71() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.labels.IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator();
        lineRenderer3D0.setSeriesItemLabelGenerator(2459, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(intervalCategoryItemLabelGenerator0)), false);
        org.junit.Assert.assertEquals(2.0, lineRenderer3D0.getItemLabelAnchorOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test72() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(false);
        org.jfree.chart.labels.IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = ((org.jfree.chart.labels.IntervalCategoryItemLabelGenerator)(stackedBarRenderer3D0.getItemLabelGenerator((-656), 0, true)));
        org.junit.Assert.assertNull(intervalCategoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test74() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false , true);
        lineAndShapeRenderer0.setSeriesURLGenerator(0, ((org.jfree.chart.urls.CategoryURLGenerator)(null)));
        org.junit.Assert.assertEquals(0, lineAndShapeRenderer0.getColumnCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test75() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = ganttRenderer0.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test76() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer(true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = categoryStepRenderer0.getSeriesURLGenerator(250);
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test77() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true , true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = lineAndShapeRenderer0.getBaseItemLabelGenerator();
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test78() throws java.lang.Throwable {
        org.jfree.chart.labels.IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator();
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        ganttRenderer0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(intervalCategoryItemLabelGenerator0)));
        org.junit.Assert.assertEquals(1, ganttRenderer0.getPassCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test79() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        int int0 = layeredBarRenderer0.getRowCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test82() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D(0.0 , (-3394.3934962));
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = barRenderer3D0.getSeriesItemLabelGenerator((-1377));
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = groupedStackedBarRenderer0.getLegendItemURLGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test84() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false , true);
        lineAndShapeRenderer0.removeAnnotations();
        org.junit.Assert.assertFalse(lineAndShapeRenderer0.getUseFillPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test85() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true , true);
        org.jfree.chart.urls.StandardCategoryURLGenerator standardCategoryURLGenerator0 = ((org.jfree.chart.urls.StandardCategoryURLGenerator)(lineAndShapeRenderer0.getBaseURLGenerator()));
        org.junit.Assert.assertNull(standardCategoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test86() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.renderer.xy.XYDotRenderer xYDotRenderer0 = new org.jfree.chart.renderer.xy.XYDotRenderer();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(xYDotRenderer0.getLegendShape()));
        java.lang.Number[][] numberArray0 = new java.lang.Number[2][7];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0 , numberArray0);
        org.jfree.data.category.SlidingCategoryDataset slidingCategoryDataset0 = new org.jfree.data.category.SlidingCategoryDataset(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)) , 0 , (-3716));
        groupedStackedBarRenderer0.addEntity(standardEntityCollection0, rectangle2D_Double0, slidingCategoryDataset0, 0, 4, false);
        org.junit.Assert.assertEquals(1, standardEntityCollection0.getEntityCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test87() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        boxAndWhiskerRenderer0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test89() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        int int0 = minMaxCategoryRenderer0.getPassCount();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test90() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        int int0 = defaultCategoryItemRenderer0.getColumnCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test91() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        ganttRenderer0.setLegendItemURLGenerator(((org.jfree.chart.labels.CategorySeriesLabelGenerator)(null)));
        org.junit.Assert.assertEquals(4.0, ganttRenderer0.getShadowYOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test92() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(false);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = ((org.jfree.chart.labels.StandardCategorySeriesLabelGenerator)(stackedBarRenderer0.getLegendItemLabelGenerator()));
        org.junit.Assert.assertNotNull(standardCategorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test93() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("T`zD0u;2]" , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0);
        sun.swing.PrintColorUIResource printColorUIResource0 = ((sun.swing.PrintColorUIResource)(chartPanel0.getForeground()));
        java.awt.SystemColor systemColor0 = java.awt.SystemColor.controlDkShadow;
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(((java.awt.Paint)(printColorUIResource0)) , ((java.awt.Paint)(systemColor0)) , combinedRangeCategoryPlot0.DEFAULT_GRIDLINE_PAINT , combinedRangeCategoryPlot0.DEFAULT_OUTLINE_PAINT);
        boolean boolean0 = waterfallBarRenderer0.removeAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test94() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("Null 'hotspot' argument.");
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("{2}");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(dateAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(boxAndWhiskerRenderer0)));
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis1 = ((org.jfree.chart.axis.SubCategoryAxis)(minMaxCategoryRenderer0.getDomainAxis(categoryPlot0, ((org.jfree.data.category.CategoryDataset)(null)))));
        org.junit.Assert.assertEquals(0.2, subCategoryAxis1.getCategoryMargin(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test96() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = boxAndWhiskerRenderer0.getBaseToolTipGenerator();
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }
}

