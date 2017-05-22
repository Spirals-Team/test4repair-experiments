package org.jfree.chart.plot;


public class CategoryPlot_ESTest extends org.jfree.chart.plot.CategoryPlot_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(categoryPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        org.junit.Assert.assertEquals(10, bufferedImage0.getTileHeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.zoom(0.0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer0 = combinedDomainCategoryPlot0.getRenderer(1);
        org.junit.Assert.assertNull(categoryItemRenderer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.mapDatasetToDomainAxis(1, (-461));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getDomainAxisEdge(1);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("Null 'icon' argument.");
        combinedRangeCategoryPlot0.setDomainAxis(1, ((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        org.junit.Assert.assertEquals(2, combinedRangeCategoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        combinedDomainCategoryPlot0.handleClick((-5), 809, plotRenderingInfo0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , categoryPlot0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(categoryPlot0)) , false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        categoryPlot0.drawBackground(sunGraphics2D0, rectangle2D_Double0);
        org.junit.Assert.assertEquals(0, sunGraphics2D0.transX);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.2 , ((java.lang.String)(null)));
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        java.awt.Color color0 = ((java.awt.Color)(categoryStepRenderer0.lookupSeriesOutlinePaint((-2380))));
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(cyclicNumberAxis0.DEFAULT_TICK_UNIT)) , cyclicNumberAxis0.DEFAULT_TICK_MARK_PAINT , categoryStepRenderer0.DEFAULT_STROKE , ((java.awt.Paint)(color0)) , categoryStepRenderer0.DEFAULT_OUTLINE_STROKE , 0.0F);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        combinedDomainCategoryPlot0.addRangeMarker(5, ((org.jfree.chart.plot.Marker)(categoryMarker0)), layer0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , categoryPlot0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(categoryPlot0)) , false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        categoryPlot0.drawRangeMarkers(sunGraphics2D0, ((java.awt.geom.Rectangle2D)(null)), 0, layer0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , categoryPlot0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(categoryPlot0)) , false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        categoryPlot0.drawDomainMarkers(sunGraphics2D0, ((java.awt.geom.Rectangle2D)(null)), (-1263), layer0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.geom.Line2D.Double line2D_Double0 = new java.awt.geom.Line2D.Double(2.0 , (-1267.1037) , ((double)(1.0F)) , ((double)(10)));
        java.awt.Rectangle rectangle0 = line2D_Double0.getBounds();
        categoryPlot0.drawDomainGridlines(((java.awt.Graphics2D)(null)), rectangle0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertFalse(categoryPlot0.isDomainGridlinesVisible());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2129, 261, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        combinedRangeCategoryPlot0.drawAnnotations(sunGraphics2D0, ((java.awt.geom.Rectangle2D)(null)));
        org.junit.Assert.assertEquals(0, sunGraphics2D0.strokeHint);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(948.1821189724981);
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT;
        combinedRangeCategoryPlot0.setRangeAxisLocation(500, axisLocation0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot0.setDomainAxisLocation(axisLocation0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("stT~j<zd4&sTIXdBa`w");
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("stT~j<zd4&sTIXdBa`w");
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(dateAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(boxAndWhiskerRenderer0)));
        categoryPlot0.setWeight(500);
        int int0 = categoryPlot0.getWeight();
        org.junit.Assert.assertEquals(500, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("Y-Z");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(true);
        combinedRangeCategoryPlot0.setRenderer(((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D1 = ((org.jfree.chart.renderer.category.StackedBarRenderer3D)(combinedRangeCategoryPlot0.getRenderer()));
        org.junit.Assert.assertNotNull(stackedBarRenderer3D1);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        combinedDomainCategoryPlot0.getRangeMarkers(layer0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.axis.NumberAxis numberAxis1 = ((org.jfree.chart.axis.NumberAxis)(combinedRangeCategoryPlot0.getRangeAxisForDataset(5)));
        org.junit.Assert.assertTrue(numberAxis1.isTickLabelsVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-1619.202) , 2914.82 , "2C$Tb'9yK>p:D");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis1 = ((org.jfree.chart.axis.CyclicNumberAxis)(combinedRangeCategoryPlot0.getRangeAxisForDataset(3955)));
        org.junit.Assert.assertNotNull(cyclicNumberAxis1);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(combinedRangeCategoryPlot0.getRangeAxis(0)));
        org.junit.Assert.assertNotNull(numberAxis0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(952.67457427);
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.axis.NumberAxis numberAxis1 = ((org.jfree.chart.axis.NumberAxis)(combinedRangeCategoryPlot0.getRangeAxis()));
        org.junit.Assert.assertFalse(org.jfree.chart.axis.ValueAxis.DEFAULT_INVERTED);
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(combinedRangeCategoryPlot0.getRangeAxis()));
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertNotNull(numberAxis0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("");
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(minMaxCategoryRenderer0)));
        int int0 = categoryPlot0.getIndexOf(minMaxCategoryRenderer0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        java.lang.Number[][] numberArray0 = new java.lang.Number[0][6];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0 , numberArray0);
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.renderer.category.IntervalBarRenderer intervalBarRenderer0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(null)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(intervalBarRenderer0)));
        categoryPlot0.getDomainAxisIndex(categoryAxis0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getDomainAxisForDataset(1900);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDomainAxis();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        categoryAxis3D0.setVisible(false);
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D1 = ((org.jfree.chart.axis.CategoryAxis3D)(combinedDomainCategoryPlot0.getDomainAxis()));
        org.junit.Assert.assertEquals(1, categoryAxis3D1.getMaximumCategoryLabelLines());
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        categoryAxis3D0.setMaximumCategoryLabelWidthRatio(1.0F);
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D1 = ((org.jfree.chart.axis.CategoryAxis3D)(combinedDomainCategoryPlot0.getDomainAxis()));
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertNotNull(categoryAxis3D1);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("4fjcJ;*=O,pgg/");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Line2D.Double line2D_Double0 = new java.awt.geom.Line2D.Double((-929.8098344) , ((double)(1.0F)) , 25.5 , ((double)(1.0F)));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(line2D_Double0.getBounds2D()));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        java.util.Map map0 = combinedDomainCategoryPlot0.drawAxes(sunGraphics2D0, rectangle2D_Double0, rectangle2D_Double0, plotRenderingInfo0);
        org.junit.Assert.assertEquals((-16777216), sunGraphics2D0.eargb);
        org.junit.Assert.assertEquals(1, map0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        org.jfree.chart.axis.AxisSpace axisSpace0 = categoryPlot0.calculateAxisSpace(((java.awt.Graphics2D)(null)), rectangle2D_Double0);
        org.junit.Assert.assertEquals(0.0, axisSpace0.getBottom(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        try {
            categoryPlot0.addRangeMarker(((org.jfree.chart.plot.Marker)(null)), layer0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.setAnchorValue(0.0, true);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("(txs]?tn?5X*b");
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("(txs]?tn?5X*b" , ((java.util.TimeZone)(zoneInfo0)));
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D((-594.810385) , ((double)(0.0F)));
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(dateAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(barRenderer3D0)));
        categoryPlot0.getDataRange(dateAxis0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(((double)(0.0F)) , "Jm(wxFo;o[");
        categoryPlot0.getDataRange(cyclicNumberAxis0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot();
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        combinedDomainCategoryPlot0.setRangeAxis(546, ((org.jfree.chart.axis.ValueAxis)(numberAxis0)), true);
        org.jfree.data.Range range0 = combinedDomainCategoryPlot0.getDataRange(numberAxis0);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(((double)(1)) , 417.79845 , 8.0 , 0.0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , true);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 2299, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        combinedRangeCategoryPlot0.render(sunGraphics2D0, rectangle2D_Double0, 571, plotRenderingInfo0);
        org.junit.Assert.assertTrue(chartPanel0.isRangeZoomable());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(((double)(1)) , 417.79845 , 8.0 , 0.0);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 500, (-3460.67077), 540.964, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor0 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D_Double0, rectangleAnchor0)));
        org.jfree.chart.plot.PlotState plotState0 = new org.jfree.chart.plot.PlotState();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        categoryPlot0.draw(sunGraphics2D0, rectangle2D_Double0, point2D_Double0, plotState0, plotRenderingInfo0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue(4.5, true);
        org.junit.Assert.assertEquals(4.5, categoryPlot0.getRangeCrosshairValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.clearRangeMarkers(0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection0 = categoryPlot0.getRangeMarkers(0, layer0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        combinedRangeCategoryPlot0.getRangeMarkers((-41), layer0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        try {
            categoryPlot0.addRangeMarker(500, ((org.jfree.chart.plot.Marker)(null)), ((org.jfree.chart.util.Layer)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        try {
            combinedDomainCategoryPlot0.addRangeMarker((-2270), ((org.jfree.chart.plot.Marker)(null)), layer0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection0 = combinedRangeCategoryPlot0.getDomainMarkers(500, layer0);
        org.junit.Assert.assertNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        categoryPlot0.getDomainMarkers(467, layer0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(952.67457427);
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(10)) , numberAxis0.DEFAULT_AXIS_LABEL_PAINT , numberAxis0.DEFAULT_TICK_MARK_STROKE);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        combinedRangeCategoryPlot0.addDomainMarker(1, categoryMarker0, layer0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("Y-Z");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent0 = new org.jfree.data.general.DatasetChangeEvent(((java.lang.Object)(layer0)) , ((org.jfree.data.general.Dataset)(taskSeriesCollection0)));
        combinedRangeCategoryPlot0.datasetChanged(datasetChangeEvent0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.data.xy.VectorSeriesCollection vectorSeriesCollection0 = new org.jfree.data.xy.VectorSeriesCollection();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent0 = new org.jfree.data.general.DatasetChangeEvent(((java.lang.Object)(combinedDomainCategoryPlot0)) , ((org.jfree.data.general.Dataset)(vectorSeriesCollection0)));
        combinedDomainCategoryPlot0.datasetChanged(datasetChangeEvent0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection0 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertEquals(0, legendItemCollection0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("clone");
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.2 , "clone");
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedAreaRenderer0)));
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer1 = ((org.jfree.chart.renderer.category.StackedAreaRenderer)(categoryPlot0.getRendererForDataset(((org.jfree.data.category.CategoryDataset)(null)))));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertNotNull(stackedAreaRenderer1);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false , true);
        categoryPlot0.setRenderer(2673, ((org.jfree.chart.renderer.category.CategoryItemRenderer)(lineAndShapeRenderer0)), true);
        org.junit.Assert.assertEquals(0.0, categoryPlot0.getAnchorValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.setRenderer(10, ((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)), false);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getRenderer((-566));
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getRangeAxisForDataset(0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getDomainAxisForDataset(0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.setDataset(10, ((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)));
        org.junit.Assert.assertEquals(11, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(1137.062 , ((java.lang.String)(null)));
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(levelRenderer0)));
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection1 = ((org.jfree.data.gantt.TaskSeriesCollection)(categoryPlot0.getDataset(0)));
        org.junit.Assert.assertNotNull(taskSeriesCollection1);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDataset(79);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.configureRangeAxes();
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        combinedDomainCategoryPlot0.configureRangeAxes();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getRangeAxisEdge(3);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.TOP_OR_RIGHT;
        categoryPlot0.setRangeAxisLocation(2373, axisLocation0, true);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainCategoryPlot0.getRangeAxisLocation();
        combinedDomainCategoryPlot0.setRangeAxisLocation(571, axisLocation0, false);
        org.junit.Assert.assertEquals("AxisLocation.TOP_OR_LEFT", axisLocation0.toString());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getRangeAxisLocation(0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeAxis(500, ((org.jfree.chart.axis.ValueAxis)(null)), false);
        org.junit.Assert.assertEquals(501, categoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis0 = categoryPlot0.getRangeAxis(10);
        org.junit.Assert.assertNull(valueAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(952.67457427);
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.axis.NumberAxis numberAxis1 = ((org.jfree.chart.axis.NumberAxis)(combinedRangeCategoryPlot0.getRangeAxis(0)));
        org.junit.Assert.assertNotNull(numberAxis1);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.configureDomainAxes();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        combinedDomainCategoryPlot0.configureDomainAxes();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainXYPlot0.getDomainAxisLocation(10);
        combinedDomainCategoryPlot0.setDomainAxisLocation(3, axisLocation0, false);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        combinedDomainCategoryPlot0.setDomainAxis(1026, ((org.jfree.chart.axis.CategoryAxis)(null)), false);
        org.junit.Assert.assertEquals(1027, combinedDomainCategoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)(null)));
        combinedRangeCategoryPlot0.setDomainAxis(0, categoryAxis0, true);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("");
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("" , ((java.util.TimeZone)(zoneInfo0)));
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D((-594.810385) , (-1442.523387234653));
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(dateAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(barRenderer3D0)));
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis(0);
        org.junit.Assert.assertNotNull(categoryAxis1);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("Null 'marker' not permitted.");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        combinedDomainCategoryPlot0.getDomainAxis((-1664));
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PolarPlot polarPlot0 = new org.jfree.chart.plot.PolarPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = polarPlot0.getOrientation();
        categoryPlot0.setOrientation(plotOrientation0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        combinedRangeCategoryPlot0.setDomainAxisLocation(axisLocation0, false);
        org.junit.Assert.assertEquals(10, org.jfree.chart.plot.Plot.MINIMUM_HEIGHT_TO_DRAW);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.mapDatasetToRangeAxis(10, 3446);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.isRangeZoomable();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        boolean boolean0 = combinedDomainCategoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getOrientation();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("Null 'marker' not permitted.");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainCategoryPlot0.getDomainAxisLocation();
        org.junit.Assert.assertEquals("AxisLocation.BOTTOM_OR_LEFT", axisLocation0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer0 = combinedDomainCategoryPlot0.getRenderer();
        org.junit.Assert.assertNull(categoryItemRenderer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list0 = categoryPlot0.getAnnotations();
        org.junit.Assert.assertTrue(list0.isEmpty());
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainCategoryPlot0.getDomainAxisLocation(0);
        combinedDomainCategoryPlot0.setRangeAxisLocation(axisLocation0, true);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = combinedDomainCategoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertEquals("RectangleEdge.BOTTOM", rectangleEdge0.toString());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("clone");
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.2 , "clone");
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedAreaRenderer0)));
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder0 = categoryPlot0.getDatasetRenderingOrder();
        org.junit.Assert.assertEquals("DatasetRenderingOrder.REVERSE", datasetRenderingOrder0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = categoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals("RectangleEdge.LEFT", rectangleEdge0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        java.awt.Color color0 = ((java.awt.Color)(combinedDomainCategoryPlot0.getRangeGridlinePaint()));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(192, color0.getRed());
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("w4Slr*u!pE[0");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultBoxAndWhiskerCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(null)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)));
        org.jfree.chart.LegendItemCollection legendItemCollection0 = categoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertNull(legendItemCollection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getRangeGridlineStroke();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean0 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("Null 'layer' not permitted.");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D();
        combinedDomainCategoryPlot0.setRangeAxis(870, ((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)));
        org.junit.Assert.assertEquals(871, combinedDomainCategoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getRangeAxis();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = ((org.jfree.chart.plot.CategoryPlot)(categoryPlot0.clone()));
        org.junit.Assert.assertNull(categoryPlot1.getNoDataMessage());
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot1 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot1.equals(((java.lang.Object)(combinedDomainCategoryPlot0))));
        combinedDomainCategoryPlot0.setDomainGridlinePaint(combinedDomainCategoryPlot1.DEFAULT_OUTLINE_PAINT);
        boolean boolean0 = combinedDomainCategoryPlot0.equals(combinedDomainCategoryPlot1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot1 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        combinedDomainCategoryPlot1.setDomainGridlinesVisible(true);
        boolean boolean0 = combinedDomainCategoryPlot0.equals(combinedDomainCategoryPlot1);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot1.isDomainGridlinesVisible());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test121() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot1 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot1.equals(((java.lang.Object)(combinedDomainCategoryPlot0))));
        org.jfree.chart.util.SortOrder sortOrder0 = org.jfree.chart.util.SortOrder.DESCENDING;
        combinedDomainCategoryPlot1.setColumnRenderingOrder(sortOrder0);
        boolean boolean0 = combinedDomainCategoryPlot0.equals(combinedDomainCategoryPlot1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot1 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot1.equals(((java.lang.Object)(combinedDomainCategoryPlot0))));
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray0 = new org.jfree.chart.renderer.category.CategoryItemRenderer[4];
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D(((double)(1.0F)) , 8.0);
        categoryItemRendererArray0[0] = ((org.jfree.chart.renderer.category.CategoryItemRenderer)(barRenderer3D0));
        combinedDomainCategoryPlot1.setRenderers(categoryItemRendererArray0);
        boolean boolean0 = combinedDomainCategoryPlot0.equals(combinedDomainCategoryPlot1);
        org.junit.Assert.assertFalse(combinedDomainCategoryPlot1.equals(((java.lang.Object)(combinedDomainCategoryPlot0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test123() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis0.setMaximumCategoryLabelWidthRatio(10);
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot1 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        boolean boolean0 = combinedDomainCategoryPlot0.equals(combinedDomainCategoryPlot1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot1.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test124() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot1 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        boolean boolean0 = combinedDomainCategoryPlot0.equals(combinedDomainCategoryPlot1);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot1.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test125() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        boolean boolean0 = categoryPlot0.equals(stackedBarRenderer3D0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test126() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.setAnchorValue((-1.0), false);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test127() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        categoryPlot0.zoomRangeAxes(540.964, 385.8781984637, plotRenderingInfo0, ((java.awt.geom.Point2D)(null)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test128() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("");
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("" , ((java.util.TimeZone)(zoneInfo0)));
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D((-594.810385) , (-1442.523387234653));
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(dateAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(barRenderer3D0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        java.awt.geom.Arc2D.Double arc2D_Double0 = new java.awt.geom.Arc2D.Double();
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(arc2D_Double0.getStartPoint()));
        categoryPlot0.zoomRangeAxes((-594.810385), ((double)(0.0F)), plotRenderingInfo0, ((java.awt.geom.Point2D)(point2D_Double0)));
        org.junit.Assert.assertEquals((-594.0), dateAxis0.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(dateAxis0.isAutoRange());
    }

    @org.junit.Test(timeout = 4000)
    public void test129() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("The renderer has changed and I don't know what to do!" , ((java.util.TimeZone)(zoneInfo0)));
        categoryPlot0.setRangeAxis(273, ((org.jfree.chart.axis.ValueAxis)(dateAxis0)), true);
        categoryPlot0.zoomRangeAxes(269.98473406402, ((org.jfree.chart.plot.PlotRenderingInfo)(null)), ((java.awt.geom.Point2D)(null)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test130() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("(txs]?tn?5X*b");
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("(txs]?tn?5X*b" , ((java.util.TimeZone)(zoneInfo0)));
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D((-594.810385) , (-1442.523387234653));
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(dateAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(barRenderer3D0)));
        java.util.List list0 = categoryPlot0.getCategories();
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test131() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getCategories();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test132() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("stT~j<zd4&sTIXdBa`w");
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("stT~j<zd4&sTIXdBa`w");
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(dateAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(boxAndWhiskerRenderer0)));
        java.util.List list0 = categoryPlot0.getCategoriesForAxis(extendedCategoryAxis0);
        org.junit.Assert.assertEquals(0, list0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test133() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("Null 'annotation' argument.");
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D("AreaRendererEndType.LEVEL");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)));
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(true)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        categoryPlot0.addDomainMarker(500, categoryMarker0, layer0);
        org.junit.Assert.assertEquals(10, org.jfree.chart.plot.Plot.MINIMUM_HEIGHT_TO_DRAW);
    }

    @org.junit.Test(timeout = 4000)
    public void test134() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(":R+!mlAQIT='em1:qh" , combinedRangeCategoryPlot0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)) , false);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(15, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        javax.swing.table.DefaultTableColumnModel defaultTableColumnModel0 = new javax.swing.table.DefaultTableColumnModel();
        javax.swing.table.JTableHeader jTableHeader0 = new javax.swing.table.JTableHeader(((javax.swing.table.TableColumnModel)(defaultTableColumnModel0)));
        java.awt.Rectangle rectangle0 = jTableHeader0.getHeaderRect(10);
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(combinedRangeCategoryPlot0.DEFAULT_INSETS.createOutsetRectangle(((java.awt.geom.Rectangle2D)(rectangle0)))));
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = org.jfree.chart.plot.PlotOrientation.HORIZONTAL;
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(1480.251840413 , 5.0E7 , ":R+!mlAQIT='em1:qh");
        combinedRangeCategoryPlot0.drawRangeCrosshair(sunGraphics2D0, rectangle2D_Double0, plotOrientation0, 10, cyclicNumberAxis0, cyclicNumberAxis0.DEFAULT_ADVANCE_LINE_STROKE, cyclicNumberAxis0.DEFAULT_AXIS_LINE_PAINT);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test135() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(":R+!mlAQIT='em1:qh" , combinedRangeCategoryPlot0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)) , false);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2299, 10, chartRenderingInfo0);
        javax.swing.table.DefaultTableColumnModel defaultTableColumnModel0 = new javax.swing.table.DefaultTableColumnModel();
        javax.swing.table.JTableHeader jTableHeader0 = new javax.swing.table.JTableHeader(((javax.swing.table.TableColumnModel)(defaultTableColumnModel0)));
        java.awt.Rectangle rectangle0 = jTableHeader0.getHeaderRect(2299);
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(combinedRangeCategoryPlot0.DEFAULT_INSETS.createOutsetRectangle(((java.awt.geom.Rectangle2D)(rectangle0)))));
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE));
        combinedRangeCategoryPlot0.drawRangeLine(sunGraphics2D0, rectangle2D_Double0, 2.5E10, basicStroke0, jFreeChart0.DEFAULT_BACKGROUND_PAINT);
        org.junit.Assert.assertEquals(1, sunGraphics2D0.strokeState);
        org.junit.Assert.assertEquals((-1118482), sunGraphics2D0.pixel);
    }

    @org.junit.Test(timeout = 4000)
    public void test136() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(null)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedAreaRenderer0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(((int)((short)(102))), 500);
        org.junit.Assert.assertEquals(500, bufferedImage0.getTileHeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test137() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.2);
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedAreaRenderer0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("RangeType.NEGATIVE" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 15);
        org.junit.Assert.assertEquals(1, bufferedImage0.getNumXTiles());
    }

    @org.junit.Test(timeout = 4000)
    public void test138() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , categoryPlot0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(categoryPlot0)) , false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        categoryPlot0.calculateRangeAxisSpace(sunGraphics2D0, ((java.awt.geom.Rectangle2D)(null)), ((org.jfree.chart.axis.AxisSpace)(null)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test139() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("RangeType.NEGATIVE" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        jFreeChart0.createBufferedImage(((int)((short)(102))), 500);
        org.junit.Assert.assertFalse(categoryPlot0.isDomainGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test140() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.DefaultKeyedValue defaultKeyedValue0 = new org.jfree.data.DefaultKeyedValue(((java.lang.Comparable)(false)) , ((java.lang.Number)(-1.0)));
        java.lang.Comparable comparable0 = defaultKeyedValue0.getKey();
        org.jfree.chart.annotations.CategoryPointerAnnotation categoryPointerAnnotation0 = new org.jfree.chart.annotations.CategoryPointerAnnotation("~#Buvs7}?vQM95Y|S" , ((java.lang.Comparable)(comparable0)) , (-1.0) , (-1.0));
        categoryPlot0.addAnnotation(categoryPointerAnnotation0);
        boolean boolean0 = categoryPlot0.removeAnnotation(categoryPointerAnnotation0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test142() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.DefaultKeyedValue defaultKeyedValue0 = new org.jfree.data.DefaultKeyedValue(((java.lang.Comparable)(false)) , ((java.lang.Number)(-1.0)));
        java.lang.Comparable comparable0 = defaultKeyedValue0.getKey();
        org.jfree.chart.annotations.CategoryPointerAnnotation categoryPointerAnnotation0 = new org.jfree.chart.annotations.CategoryPointerAnnotation("~#Buvs7}?vQM95Y|S" , ((java.lang.Comparable)(comparable0)) , (-1.0) , (-1.0));
        categoryPlot0.removeAnnotation(categoryPointerAnnotation0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test145() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.setRangeCrosshairPaint(categoryAxis3D0.DEFAULT_AXIS_LABEL_PAINT);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test147() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(null)));
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE));
        combinedRangeCategoryPlot0.setRangeCrosshairStroke(basicStroke0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test148() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        combinedRangeCategoryPlot0.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertFalse(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test149() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("J47");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        combinedRangeCategoryPlot0.setRangeCrosshairLockedOnData(true);
        org.junit.Assert.assertFalse(combinedRangeCategoryPlot0.isSubplot());
    }

    @org.junit.Test(timeout = 4000)
    public void test150() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        combinedDomainCategoryPlot0.setRangeCrosshairVisible(true);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test151() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("J47");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        combinedRangeCategoryPlot0.setRangeCrosshairVisible(false);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isOutlineVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test152() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.clearRangeMarkers((-1));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test153() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getRangeMarkers(1, ((org.jfree.chart.util.Layer)(null)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test154() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertEquals(0.5F, categoryPlot0.getBackgroundImageAlpha(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test155() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.ValueMarker valueMarker0 = new org.jfree.chart.plot.ValueMarker(195.02);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        combinedRangeCategoryPlot0.addRangeMarker(((org.jfree.chart.plot.Marker)(valueMarker0)), layer0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test156() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.IntervalMarker intervalMarker0 = new org.jfree.chart.plot.IntervalMarker((-1507.4585) , 1145.6087018731196);
        combinedRangeCategoryPlot0.addRangeMarker(((org.jfree.chart.plot.Marker)(intervalMarker0)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        combinedRangeCategoryPlot0.addRangeMarker(((org.jfree.chart.plot.Marker)(intervalMarker0)), layer0);
        org.junit.Assert.assertFalse(org.jfree.chart.plot.CategoryPlot.DEFAULT_DOMAIN_GRIDLINES_VISIBLE);
    }

    @org.junit.Test(timeout = 4000)
    public void test157() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(948.1821189724981);
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        combinedRangeCategoryPlot0.clearDomainMarkers(1);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test158() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        combinedDomainCategoryPlot0.getDomainMarkers(((org.jfree.chart.util.Layer)(null)));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test159() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("clone");
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.2 , 0.05);
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedAreaRenderer0)));
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)("clone")));
        categoryPlot0.addDomainMarker(categoryMarker0);
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test160() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(0)) , combinedDomainXYPlot0.DEFAULT_GRIDLINE_PAINT , categoryPlot0.DEFAULT_OUTLINE_STROKE);
        categoryPlot0.addDomainMarker(categoryMarker0, layer0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test162() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double(540.964 , 2538.00123);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent0 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)(point2D_Double0)));
        combinedDomainCategoryPlot0.rendererChanged(rendererChangeEvent0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test163() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.zoom(2.0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test165() throws java.lang.Throwable {
        java.lang.Number[][] numberArray0 = new java.lang.Number[5][5];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0 , numberArray0);
        org.jfree.chart.axis.PeriodAxis periodAxis0 = new org.jfree.chart.axis.PeriodAxis("");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(periodAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(statisticalBarRenderer0)));
        org.jfree.chart.LegendItemCollection legendItemCollection0 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertEquals(5, legendItemCollection0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test166() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection0 = ganttRenderer0.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , categoryPlot0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(categoryPlot0)) , true);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test168() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        categoryPlot0.setRangeGridlinePaint(ganttRenderer0.DEFAULT_PAINT);
        org.junit.Assert.assertFalse(org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_VISIBLE);
    }

    @org.junit.Test(timeout = 4000)
    public void test170() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer(false);
        categoryPlot0.setRangeGridlineStroke(categoryStepRenderer0.DEFAULT_STROKE);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test171() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.junit.Assert.assertFalse(categoryPlot0.isRangeGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test172() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-1619.202) , 2914.82 , "2C$Tb'9yK>p:D");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        combinedRangeCategoryPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test175() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE));
        categoryPlot0.setDomainGridlineStroke(basicStroke0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test177() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("");
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(minMaxCategoryRenderer0)));
        org.jfree.chart.axis.CategoryAnchor categoryAnchor0 = org.jfree.chart.axis.CategoryAnchor.MIDDLE;
        categoryPlot0.setDomainGridlinePosition(categoryAnchor0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test178() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setDomainGridlinesVisible(false);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test180() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder0 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test182() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(714.2334 , 0.2);
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(true , false);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultBoxAndWhiskerCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(statisticalLineAndShapeRenderer0)));
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder0 = org.jfree.chart.plot.DatasetRenderingOrder.REVERSE;
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder0);
        org.junit.Assert.assertEquals((-714.2334), cyclicNumberAxis0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(0.0, cyclicNumberAxis0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test183() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        combinedRangeCategoryPlot0.getRendererForDataset(defaultBoxAndWhiskerCategoryDataset0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test184() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        categoryPlot0.setRenderer(0, ((org.jfree.chart.renderer.category.CategoryItemRenderer)(ganttRenderer0)), false);
        categoryPlot0.setRenderer(((org.jfree.chart.renderer.category.CategoryItemRenderer)(ganttRenderer0)), false);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test185() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("{3/T=6(G");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        combinedRangeCategoryPlot0.clearRangeAxes();
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test186() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test188() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getRangeAxisLocation(10);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test189() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray0 = new org.jfree.chart.axis.ValueAxis[2];
        combinedRangeCategoryPlot0.setRangeAxes(valueAxisArray0);
        org.junit.Assert.assertEquals(2, combinedRangeCategoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test190() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(((double)(2.0F)));
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(categoryStepRenderer0)));
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = ((org.jfree.chart.plot.CategoryPlot)(categoryPlot0.clone()));
        org.junit.Assert.assertEquals(1, categoryPlot1.getDomainAxisCount());
        org.junit.Assert.assertEquals(1, categoryPlot1.getRangeAxisCount());
        org.junit.Assert.assertTrue(categoryPlot1.equals(((java.lang.Object)(categoryPlot0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test191() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        combinedDomainCategoryPlot0.clearDomainAxes();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test192() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-1619.202) , 2914.82 , "2C$Tb'9yK>p:D");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        combinedRangeCategoryPlot0.clearDomainAxes();
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test193() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = categoryPlot0.getDomainAxisLocation(10);
        org.junit.Assert.assertNotNull(axisLocation0);
        categoryPlot0.setDomainAxisLocation(0, axisLocation0, true);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals("AxisLocation.TOP_OR_RIGHT", axisLocation0.toString());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test194() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-1619.202) , 2914.82 , "2C$Tb'9yK>p:D");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray0 = new org.jfree.chart.axis.CategoryAxis[7];
        combinedRangeCategoryPlot0.setDomainAxes(categoryAxisArray0);
        org.junit.Assert.assertEquals(7, combinedRangeCategoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test195() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getDomainAxis(3);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test197() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(((java.lang.Number)(14)));
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = combinedRangeCategoryPlot0.getDomainAxisForDataset((-742));
        combinedRangeCategoryPlot0.setAxisOffset(categoryAxis0.DEFAULT_AXIS_LABEL_INSETS);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isOutlineVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test199() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(categoryPlot0.getDomainGridlineStroke()));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(2, basicStroke0.getLineJoin());
    }

    @org.junit.Test(timeout = 4000)
    public void test200() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getDomainGridlinePosition();
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test201() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(null)));
        combinedRangeCategoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test202() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        combinedDomainCategoryPlot0.getDomainAxisIndex(categoryAxis3D0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test203() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("&#]@+mRr&*SW");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        combinedRangeCategoryPlot0.clearAnnotations();
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test204() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.getDataset();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test205() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        boolean boolean0 = combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test206() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-1619.202) , 2914.82 , "2C$Tb'9yK>p:D");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        combinedRangeCategoryPlot0.zoomDomainAxes(30.0, ((double)(2.0F)), plotRenderingInfo0, ((java.awt.geom.Point2D)(null)));
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test207() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Color color0 = ((java.awt.Color)(categoryPlot0.getDomainGridlinePaint()));
        org.junit.Assert.assertEquals(192, color0.getBlue());
    }

    @org.junit.Test(timeout = 4000)
    public void test208() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        combinedRangeCategoryPlot0.getPlotType();
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test209() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setRangeCrosshairValue((-147.6597736434));
        org.junit.Assert.assertEquals((-147.6597736434), combinedRangeCategoryPlot0.getRangeCrosshairValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test210() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Color color0 = ((java.awt.Color)(categoryPlot0.getRangeCrosshairPaint()));
        org.junit.Assert.assertEquals(0, color0.getGreen());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test211() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        combinedDomainCategoryPlot0.setDataset(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test212() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test213() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        boolean boolean0 = combinedDomainCategoryPlot0.isDomainZoomable();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test214() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("9f#Xc-91}g*");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        combinedDomainCategoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test215() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        combinedDomainCategoryPlot0.setRenderer(1, ((org.jfree.chart.renderer.category.CategoryItemRenderer)(levelRenderer0)));
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test216() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int0 = categoryPlot0.getWeight();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test217() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Point2D.Double[540.964, 2538.00123]" , combinedDomainCategoryPlot0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)) , true);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(338, 10, ((org.jfree.chart.ChartRenderingInfo)(null)));
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float(2.0F , 2.0F , 1.0F , (-2046.5647F));
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        java.util.List list0 = taskSeriesCollection0.getColumnKeys();
        combinedDomainCategoryPlot0.drawRangeGridlines(sunGraphics2D0, rectangle2D_Float0, list0);
        org.junit.Assert.assertEquals(0, sunGraphics2D0.transY);
    }

    @org.junit.Test(timeout = 4000)
    public void test218() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        combinedDomainCategoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test219() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(null)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(levelRenderer0)));
        categoryPlot0.setRangeAxis(((org.jfree.chart.axis.ValueAxis)(null)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals(1, categoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test220() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("4fjcJ;*=O,pgg/");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection0 = combinedDomainCategoryPlot0.getRangeMarkers(layer0);
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test221() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setAnchorValue(1772.34);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test223() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.setFixedRangeAxisSpace(((org.jfree.chart.axis.AxisSpace)(null)));
        org.junit.Assert.assertFalse(combinedDomainCategoryPlot0.getDrawSharedDomainAxis());
    }

    @org.junit.Test(timeout = 4000)
    public void test224() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setFixedDomainAxisSpace(((org.jfree.chart.axis.AxisSpace)(null)));
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isOutlineVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test225() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        combinedDomainCategoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test226() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("");
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("" , ((java.util.TimeZone)(zoneInfo0)));
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D((-594.810385) , (-1442.523387234653));
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(dateAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(barRenderer3D0)));
        categoryPlot0.getAxisOffset();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test227() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test228() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getAnchorValue();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test229() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test230() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(combinedRangeCategoryPlot0.getRangeCrosshairStroke()));
        org.junit.Assert.assertEquals(0.0F, basicStroke0.getMiterLimit(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test231() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(29, axisLocation0);
        org.junit.Assert.assertEquals(1.0F, org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test232() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("Null 'layer' not permitted.");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        combinedDomainCategoryPlot0.zoomDomainAxes(0.05, plotRenderingInfo0, ((java.awt.geom.Point2D)(null)));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test233() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        combinedDomainCategoryPlot0.setDrawSharedDomainAxis(true);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.getDrawSharedDomainAxis());
    }

    @org.junit.Test(timeout = 4000)
    public void test234() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        int int0 = combinedDomainCategoryPlot0.getDatasetCount();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test235() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(((double)(2.0F)) , 0.2 , "");
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedAreaRenderer0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("RangeType.NEGATIVE" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        jFreeChart0.createBufferedImage(((int)((short)(102))), 500);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test236() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer(false);
        categoryPlot0.getIndexOf(categoryStepRenderer0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test237() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("clone");
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.2 , "clone");
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedAreaRenderer0)));
        categoryPlot0.setDomainAxis(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDomainAxisCount());
    }
}

