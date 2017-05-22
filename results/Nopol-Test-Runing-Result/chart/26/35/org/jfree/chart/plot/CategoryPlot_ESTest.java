package org.jfree.chart.plot;


public class CategoryPlot_ESTest extends org.jfree.chart.plot.CategoryPlot_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(0.0);
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        combinedRangeCategoryPlot0.getRangeAxisLocation(1);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        java.util.SimpleTimeZone simpleTimeZone0 = new java.util.SimpleTimeZone(1402 , "");
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("" , ((java.util.TimeZone)(simpleTimeZone0)));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot1 = ((org.jfree.chart.plot.CombinedRangeCategoryPlot)(combinedRangeCategoryPlot0.clone()));
        combinedRangeCategoryPlot1.getDomainAxisForDataset(41);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot1.getRangeAxisCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot1.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(0, combinedRangeCategoryPlot1.getDomainAxisCount());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("\"J<");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        combinedDomainCategoryPlot0.setRangeAxis(2, ((org.jfree.chart.axis.ValueAxis)(null)));
        org.junit.Assert.assertEquals(3, combinedDomainCategoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("^uN,oYz");
        java.lang.String[] stringArray0 = new java.lang.String[8];
        org.jfree.chart.axis.SymbolAxis symbolAxis0 = new org.jfree.chart.axis.SymbolAxis("p`ti#dDO" , stringArray0);
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(symbolAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer0)));
        categoryPlot0.mapDatasetToRangeAxis(9999, 500);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(true)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        categoryPlot0.addDomainMarker(categoryMarker0, layer0);
        org.junit.Assert.assertEquals(0, categoryPlot0.getWeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        combinedDomainCategoryPlot0.drawRangeMarkers(((java.awt.Graphics2D)(null)), rectangle2D_Double0, 1, layer0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        combinedDomainCategoryPlot0.drawDomainMarkers(((java.awt.Graphics2D)(null)), ((java.awt.geom.Rectangle2D)(null)), 2, layer0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 2839, ((double)(2839)), ((double)(1.0F)), chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        combinedDomainCategoryPlot0.drawDomainGridlines(sunGraphics2D0, ((java.awt.geom.Rectangle2D)(null)));
        org.junit.Assert.assertEquals(0, sunGraphics2D0.renderHint);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , 0.0 , 0.0);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("<5&a.w3SL?HZ" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, ((org.jfree.chart.ChartRenderingInfo)(null)));
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        categoryPlot0.drawAnnotations(sunGraphics2D0, rectangle2D_Double0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.zoom(2.5E7);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , 0.0 , 0.0);
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("<5&a.w3SL?HZ" , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 3, ((org.jfree.chart.ChartRenderingInfo)(null)));
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        java.util.Map map0 = combinedDomainCategoryPlot0.drawAxes(sunGraphics2D0, rectangle2D_Double0, rectangle2D_Double0, plotRenderingInfo0);
        org.junit.Assert.assertEquals((-8355712), sunGraphics2D0.eargb);
        org.junit.Assert.assertFalse(map0.isEmpty());
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.ValueMarker valueMarker0 = new org.jfree.chart.plot.ValueMarker((-3477.6944604618));
        categoryPlot0.addRangeMarker(((org.jfree.chart.plot.Marker)(valueMarker0)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getRangeMarkers(((org.jfree.chart.util.Layer)(null)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(combinedRangeCategoryPlot0.getRangeAxisForDataset((-2149))));
        org.junit.Assert.assertEquals(0.0, numberAxis0.getFixedAutoRange(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.clearRangeAxes();
        categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getRangeAxis();
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        java.util.SimpleTimeZone simpleTimeZone0 = new java.util.SimpleTimeZone(1402 , "");
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("" , ((java.util.TimeZone)(simpleTimeZone0)));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        combinedRangeCategoryPlot0.getIndexOf(((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)));
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("HOUR");
        combinedRangeCategoryPlot0.getDomainAxisIndex(categoryAxis3D0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(0.0);
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = combinedRangeCategoryPlot0.getDomainAxis();
        org.junit.Assert.assertNull(categoryAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis(((java.lang.String)(null)));
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(waterfallBarRenderer0)));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset1 = ((org.jfree.data.statistics.DefaultStatisticalCategoryDataset)(categoryPlot0.getDataset()));
        org.junit.Assert.assertSame(defaultStatisticalCategoryDataset0, defaultStatisticalCategoryDataset1);
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , 0.0 , 0.0);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("<5&a.w3SL?HZ" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, ((org.jfree.chart.ChartRenderingInfo)(null)));
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        categoryPlot0.drawAxes(sunGraphics2D0, rectangle2D_Double0, rectangle2D_Double0, plotRenderingInfo0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , 0.0 , 0.0);
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("<5&a.w3SL?HZ" , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 3, ((org.jfree.chart.ChartRenderingInfo)(null)));
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.axis.AxisSpace axisSpace0 = combinedDomainCategoryPlot0.calculateAxisSpace(sunGraphics2D0, rectangle2D_Double0);
        org.junit.Assert.assertEquals(0.0, axisSpace0.getLeft(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test036() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = ((org.jfree.chart.plot.CategoryPlot)(categoryPlot0.clone()));
        org.junit.Assert.assertEquals(0, categoryPlot1.getRangeAxisCount());
        org.junit.Assert.assertEquals(1, categoryPlot1.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.setAnchorValue(419.31632344, true);
        org.junit.Assert.assertEquals(419.31632344, combinedDomainCategoryPlot0.getAnchorValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("}v/Z>oqbq");
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.2 , "0[C )jTZ>(");
        org.jfree.chart.renderer.category.AreaRenderer areaRenderer0 = new org.jfree.chart.renderer.category.AreaRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(areaRenderer0)));
        org.jfree.data.Range range0 = categoryPlot0.getDataRange(cyclicNumberAxis0);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("");
        combinedDomainCategoryPlot0.getDataRange(logarithmicAxis0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        combinedDomainCategoryPlot0.getDataRange(((org.jfree.chart.axis.ValueAxis)(null)));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , 0.0 , 0.0);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("<5&a.w3SL?HZ" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 3, ((org.jfree.chart.ChartRenderingInfo)(null)));
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        rectangle2D_Double0.setRect(3017.31171, 3138.0, 10.0, ((double)(15)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        org.jfree.chart.plot.PlotState plotState0 = new org.jfree.chart.plot.PlotState();
        categoryPlot0.draw(sunGraphics2D0, rectangle2D_Double0, ((java.awt.geom.Point2D)(null)), plotState0, plotRenderingInfo0);
        org.junit.Assert.assertEquals(15.0, rectangle2D_Double0.height, 0.01);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , 0.0 , 0.0);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("<5&a.w3SL?HZ" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 3, ((org.jfree.chart.ChartRenderingInfo)(null)));
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        org.jfree.chart.plot.PlotState plotState0 = new org.jfree.chart.plot.PlotState();
        categoryPlot0.draw(sunGraphics2D0, rectangle2D_Double0, ((java.awt.geom.Point2D)(null)), plotState0, plotRenderingInfo0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setRangeCrosshairValue((-25.809006137472), false);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(0.0);
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        combinedRangeCategoryPlot0.clearRangeMarkers(0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection0 = combinedDomainCategoryPlot0.getRangeMarkers(0, layer0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection0 = categoryPlot0.getRangeMarkers((-697), layer0);
        org.junit.Assert.assertNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(2.0F)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        combinedDomainCategoryPlot0.addRangeMarker((-3308), ((org.jfree.chart.plot.Marker)(categoryMarker0)), layer0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(10)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        combinedRangeCategoryPlot0.addDomainMarker(0, categoryMarker0, layer0);
        java.util.Collection collection0 = combinedRangeCategoryPlot0.getDomainMarkers(0, layer0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(0.0);
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection0 = combinedRangeCategoryPlot0.getDomainMarkers(2, layer0);
        org.junit.Assert.assertNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)));
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(1.0F)) , categoryPlot0.DEFAULT_BACKGROUND_PAINT , multiplePiePlot0.DEFAULT_OUTLINE_STROKE);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        categoryPlot0.addDomainMarker((-3066), categoryMarker0, layer0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("$z&B,RUIg9!");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent0 = new org.jfree.data.general.DatasetChangeEvent(((java.lang.Object)(extendedCategoryAxis0)) , ((org.jfree.data.general.Dataset)(null)));
        combinedDomainCategoryPlot0.datasetChanged(datasetChangeEvent0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        javax.swing.KeyStroke keyStroke0 = javax.swing.KeyStroke.getKeyStroke(10, (-2137456663), false);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent0 = new org.jfree.data.general.DatasetChangeEvent(((java.lang.Object)(keyStroke0)) , ((org.jfree.data.general.Dataset)(null)));
        combinedRangeCategoryPlot0.datasetChanged(datasetChangeEvent0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection0 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNotNull(legendItemCollection0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        java.util.SimpleTimeZone simpleTimeZone0 = new java.util.SimpleTimeZone(1402 , "");
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("" , ((java.util.TimeZone)(simpleTimeZone0)));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer(true);
        combinedRangeCategoryPlot0.setRenderer(680, ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedAreaRenderer0)), true);
        org.junit.Assert.assertEquals(0, combinedRangeCategoryPlot0.getWeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setRenderer(0, ((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)), false);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getRenderer(0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(0.0);
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.axis.NumberAxis numberAxis1 = ((org.jfree.chart.axis.NumberAxis)(combinedRangeCategoryPlot0.getRangeAxisForDataset(0)));
        org.junit.Assert.assertNotNull(numberAxis1);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        combinedDomainCategoryPlot0.setDataset(184, ((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)));
        org.junit.Assert.assertEquals(185, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset0 = categoryPlot0.getDataset(0);
        org.junit.Assert.assertNull(categoryDataset0);
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.configureRangeAxes();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getRangeAxisEdge(3843);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("CategoryLabelWidthType.RANGE");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)));
        combinedRangeCategoryPlot0.setRangeAxisLocation(500, ((org.jfree.chart.axis.AxisLocation)(null)), true);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("7-[");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)));
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainXYPlot0.getDomainAxisLocation((-1272));
        combinedDomainCategoryPlot0.setRangeAxisLocation(1380, axisLocation0, false);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.TOP_OR_RIGHT;
        combinedDomainCategoryPlot0.setRangeAxisLocation(0, axisLocation0, false);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getRangeAxisLocation(0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(((double)(1.0F)) , "");
        categoryPlot0.setRangeAxis(3209, ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)), false);
        org.junit.Assert.assertEquals(1.05, cyclicNumberAxis0.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals(3210, categoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        categoryPlot0.setRangeAxis(0, ((org.jfree.chart.axis.ValueAxis)(numberAxis0)), true);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getRangeAxis(10);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getRangeAxis(0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.configureDomainAxes();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.configureDomainAxes();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getDomainAxisEdge((-886));
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        categoryPlot0.setDomainAxisLocation(0, axisLocation0, true);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDomainAxisLocation(0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("+");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.getDomainAxisLocation((-1205));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        combinedDomainCategoryPlot0.setDomainAxis(1143, categoryAxis0, false);
        org.junit.Assert.assertEquals(1144, combinedDomainCategoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setDomainAxis(0, ((org.jfree.chart.axis.CategoryAxis)(null)), true);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDomainAxisCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(",n(o5rN3W%");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        combinedDomainCategoryPlot0.setDomainAxis(0, ((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)), true);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDomainAxisCount());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDomainAxis((-7));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = org.jfree.chart.plot.PlotOrientation.VERTICAL;
        categoryPlot0.setOrientation(plotOrientation0);
        org.junit.Assert.assertFalse(categoryPlot0.isDomainZoomable());
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[4][8];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray0 , doubleArray0);
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("sA0S$iRhM#on._*w");
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(null)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(groupedStackedBarRenderer0)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("o");
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-2377.6023321452703) , "iYP1<4VouyrSD.6\"qL");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setWeight((-2));
        org.junit.Assert.assertEquals((-2), categoryPlot0.getWeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        combinedDomainCategoryPlot0.setDomainAxis(categoryAxis0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset0 = categoryPlot0.getDataset();
        org.junit.Assert.assertNull(categoryDataset0);
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.isDomainZoomable();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.mapDatasetToDomainAxis(1, (-1285));
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isOutlineVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean0 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        boolean boolean0 = combinedDomainCategoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.getDomainAxisLocation();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = combinedDomainCategoryPlot0.getDomainAxis();
        org.junit.Assert.assertNotNull(categoryAxis0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("\"J<");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT;
        combinedDomainCategoryPlot0.setRangeAxisLocation(axisLocation0, false);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        int int0 = combinedRangeCategoryPlot0.getIndexOf(ganttRenderer0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = combinedDomainCategoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertEquals("RectangleEdge.LEFT", rectangleEdge0.toString());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(combinedDomainCategoryPlot0.getRangeGridlineStroke()));
        org.junit.Assert.assertEquals(0.0F, basicStroke0.getDashPhase(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getRangeAxis();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("SansSerif");
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-1.0));
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer0)));
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = ((org.jfree.chart.plot.CategoryPlot)(categoryPlot0.clone()));
        org.junit.Assert.assertEquals(1, categoryPlot1.getDomainAxisCount());
        org.junit.Assert.assertTrue(categoryPlot1.equals(((java.lang.Object)(categoryPlot0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot1 = ((org.jfree.chart.plot.CombinedDomainCategoryPlot)(combinedDomainCategoryPlot0.clone()));
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot1.equals(((java.lang.Object)(combinedDomainCategoryPlot0))));
        org.jfree.chart.axis.CategoryAnchor categoryAnchor0 = org.jfree.chart.axis.CategoryAnchor.END;
        combinedDomainCategoryPlot0.setDomainGridlinePosition(categoryAnchor0);
        combinedDomainCategoryPlot1.clearRangeMarkers();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot1 = ((org.jfree.chart.plot.CombinedDomainCategoryPlot)(combinedDomainCategoryPlot0.clone()));
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        combinedDomainCategoryPlot0.setDomainAxisLocation(2, axisLocation0, false);
        combinedDomainCategoryPlot1.clearRangeMarkers();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot1.getDomainAxisCount());
        org.junit.Assert.assertFalse(combinedDomainCategoryPlot0.equals(((java.lang.Object)(combinedDomainCategoryPlot1))));
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot1.equals(((java.lang.Object)(combinedDomainCategoryPlot0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot1 = ((org.jfree.chart.plot.CombinedDomainCategoryPlot)(combinedDomainCategoryPlot0.clone()));
        subCategoryAxis0.setUpperMargin(1.0);
        combinedDomainCategoryPlot1.clearRangeMarkers();
        org.junit.Assert.assertFalse(combinedDomainCategoryPlot1.equals(((java.lang.Object)(combinedDomainCategoryPlot0))));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot1.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot1 = ((org.jfree.chart.plot.CombinedDomainCategoryPlot)(combinedDomainCategoryPlot0.clone()));
        combinedDomainCategoryPlot1.clearRangeMarkers();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.equals(((java.lang.Object)(combinedDomainCategoryPlot1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.equals(stackedAreaRenderer0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        java.util.SimpleTimeZone simpleTimeZone0 = new java.util.SimpleTimeZone(1402 , "");
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("" , ((java.util.TimeZone)(simpleTimeZone0)));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot1 = ((org.jfree.chart.plot.CombinedRangeCategoryPlot)(combinedRangeCategoryPlot0.clone()));
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot1.equals(((java.lang.Object)(combinedRangeCategoryPlot0))));
        combinedRangeCategoryPlot0.setAxisOffset(combinedRangeCategoryPlot0.DEFAULT_INSETS);
        combinedRangeCategoryPlot1.clearRangeMarkers();
        org.junit.Assert.assertFalse(combinedRangeCategoryPlot1.equals(((java.lang.Object)(combinedRangeCategoryPlot0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.setAnchorValue((-1.0), false);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0);
        java.awt.Point point0 = chartPanel0.getLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        categoryPlot0.zoomRangeAxes(((double)(500)), ((double)(0.5F)), plotRenderingInfo0, ((java.awt.geom.Point2D)(point0)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double();
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        combinedRangeCategoryPlot0.zoomRangeAxes(1670.0, plotRenderingInfo0, ((java.awt.geom.Point2D)(point2D_Double0)));
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(layeredBarRenderer0)));
        categoryPlot0.getCategoriesForAxis(((org.jfree.chart.axis.CategoryAxis)(null)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("");
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)));
        java.util.List list0 = categoryPlot0.getCategories();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertNotNull(list0);
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.clearRangeAxes();
        org.jfree.data.Range range0 = categoryPlot0.getDataRange(((org.jfree.chart.axis.ValueAxis)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("org.jfree.chart.JFreeChart");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("cAx1*`;!0Q" , extendedCategoryAxis0.DEFAULT_TICK_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)) , true);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.1);
        combinedDomainCategoryPlot0.drawRangeCrosshair(sunGraphics2D0, ((java.awt.geom.Rectangle2D)(null)), ((org.jfree.chart.plot.PlotOrientation)(null)), 467.96415943, cyclicNumberAxis0, cyclicNumberAxis0.DEFAULT_TICK_MARK_STROKE, extendedCategoryAxis0.DEFAULT_TICK_LABEL_PAINT);
        org.junit.Assert.assertTrue(org.jfree.chart.axis.NumberAxis.DEFAULT_AUTO_RANGE_INCLUDES_ZERO);
    }

    @org.junit.Test(timeout = 4000)
    public void test121() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = combinedRangeCategoryPlot0.getDomainAxisForDataset(2146660226);
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("yZdYVY");
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.05 , 2.302585092994046 , "org.jfree.chart.plot.LocalizationBundle");
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("mxd" , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(410, 403);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float(((float)(10)) , ((float)(10)) , (-1001.0354F) , 2.0F);
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = combinedDomainXYPlot0.getOrientation();
        combinedRangeCategoryPlot0.drawRangeCrosshair(sunGraphics2D0, rectangle2D_Float0, plotOrientation0, 1.0F, logarithmicAxis0, categoryAxis0.DEFAULT_TICK_MARK_STROKE, cyclicNumberAxis0.DEFAULT_TICK_MARK_PAINT);
        org.junit.Assert.assertEquals((-8355712), sunGraphics2D0.eargb);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , 0.0 , 0.0);
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("<5&a.w3SL?HZ" , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 3, ((org.jfree.chart.ChartRenderingInfo)(null)));
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        java.util.Map map0 = combinedRangeCategoryPlot0.drawAxes(sunGraphics2D0, rectangle2D_Double0, rectangle2D_Double0, plotRenderingInfo0);
        org.junit.Assert.assertEquals((-8355712), sunGraphics2D0.eargb);
        org.junit.Assert.assertFalse(map0.isEmpty());
    }

    @org.junit.Test(timeout = 4000)
    public void test124() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(categoryPlot0)));
        jFreeChart0.createBufferedImage(600, 800);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test125() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("SansSerif");
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-1.0));
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        jFreeChart0.createBufferedImage(10, 2619, ((double)(1.0F)), ((double)(2619)), chartRenderingInfo0);
        org.junit.Assert.assertEquals(0, standardEntityCollection0.getEntityCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test126() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        combinedDomainCategoryPlot0.calculateRangeAxisSpace(((java.awt.Graphics2D)(null)), ((java.awt.geom.Rectangle2D)(null)), ((org.jfree.chart.axis.AxisSpace)(null)));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test128() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE));
        org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation0 = new org.jfree.chart.annotations.CategoryLineAnnotation(((java.lang.Comparable)(10)) , 1107.4 , ((java.lang.Comparable)(true)) , 0.0 , combinedDomainCategoryPlot0.DEFAULT_BACKGROUND_PAINT , ((java.awt.Stroke)(basicStroke0)));
        combinedDomainCategoryPlot0.removeAnnotation(categoryLineAnnotation0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test130() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.annotations.CategoryTextAnnotation categoryTextAnnotation0 = new org.jfree.chart.annotations.CategoryTextAnnotation("g\"SoP|O}7!1OU" , ((java.lang.Comparable)(1.0F)) , 0.0);
        combinedDomainCategoryPlot0.addAnnotation(categoryTextAnnotation0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test132() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(0.0);
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        java.awt.Color color0 = ((java.awt.Color)(combinedRangeCategoryPlot0.getRangeGridlinePaint()));
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(((java.awt.Paint)(color0)) , numberAxis0.DEFAULT_AXIS_LINE_PAINT , combinedRangeCategoryPlot0.DEFAULT_OUTLINE_PAINT , numberAxis0.DEFAULT_TICK_MARK_PAINT);
        combinedRangeCategoryPlot0.setRangeCrosshairPaint(waterfallBarRenderer0.DEFAULT_VALUE_LABEL_PAINT);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals((-4144960), color0.getRGB());
    }

    @org.junit.Test(timeout = 4000)
    public void test133() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(0.0);
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        java.awt.Color color0 = ((java.awt.Color)(combinedRangeCategoryPlot0.getRangeGridlinePaint()));
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(((java.awt.Paint)(color0)) , numberAxis0.DEFAULT_AXIS_LINE_PAINT , combinedRangeCategoryPlot0.DEFAULT_OUTLINE_PAINT , numberAxis0.DEFAULT_TICK_MARK_PAINT);
        combinedRangeCategoryPlot0.setRangeCrosshairStroke(waterfallBarRenderer0.DEFAULT_OUTLINE_STROKE);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals((-4144960), color0.getRGB());
    }

    @org.junit.Test(timeout = 4000)
    public void test134() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertFalse(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test135() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        combinedDomainCategoryPlot0.setRangeCrosshairLockedOnData(true);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test136() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairVisible(true);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test137() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.0);
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        combinedRangeCategoryPlot0.setRangeCrosshairVisible(false);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test138() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.clearRangeMarkers((-790));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test139() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getRangeMarkers((-2942), ((org.jfree.chart.util.Layer)(null)));
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test140() throws java.lang.Throwable {
        java.util.SimpleTimeZone simpleTimeZone0 = new java.util.SimpleTimeZone(1402 , "");
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("" , ((java.util.TimeZone)(simpleTimeZone0)));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        combinedRangeCategoryPlot0.getRangeMarkers(1402, layer0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test141() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test142() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.plot.ValueMarker valueMarker0 = new org.jfree.chart.plot.ValueMarker(((double)(10)) , combinedDomainCategoryPlot0.DEFAULT_CROSSHAIR_PAINT , combinedDomainCategoryPlot0.DEFAULT_CROSSHAIR_STROKE);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        combinedDomainCategoryPlot0.addRangeMarker(0, ((org.jfree.chart.plot.Marker)(valueMarker0)), layer0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test143() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.IntervalMarker intervalMarker0 = new org.jfree.chart.plot.IntervalMarker(2.0 , ((double)(3871)));
        combinedRangeCategoryPlot0.addRangeMarker(3871, ((org.jfree.chart.plot.Marker)(intervalMarker0)), ((org.jfree.chart.util.Layer)(null)));
        org.junit.Assert.assertNull(intervalMarker0.getLabel());
    }

    @org.junit.Test(timeout = 4000)
    public void test144() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(true)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        combinedDomainCategoryPlot0.addRangeMarker(((org.jfree.chart.plot.Marker)(categoryMarker0)), layer0);
        combinedDomainCategoryPlot0.addRangeMarker(((org.jfree.chart.plot.Marker)(categoryMarker0)), layer0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test145() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.clearDomainMarkers(500);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test146() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(layeredBarRenderer0)));
        java.util.Collection collection0 = categoryPlot0.getDomainMarkers(((int)((byte)(1))), ((org.jfree.chart.util.Layer)(null)));
        org.junit.Assert.assertNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test147() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        combinedDomainCategoryPlot0.getDomainMarkers(3599, layer0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test148() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertFalse(combinedDomainCategoryPlot0.isRangeCrosshairVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test149() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(0.0);
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(10)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        combinedRangeCategoryPlot0.addDomainMarker(0, categoryMarker0, layer0);
        java.util.Collection collection0 = combinedRangeCategoryPlot0.getDomainMarkers(layer0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test152() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.general.CombinedDataset combinedDataset0 = new org.jfree.data.general.CombinedDataset();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(40.0);
        org.jfree.chart.renderer.DefaultPolarItemRenderer defaultPolarItemRenderer0 = new org.jfree.chart.renderer.DefaultPolarItemRenderer();
        org.jfree.chart.plot.PolarPlot polarPlot0 = new org.jfree.chart.plot.PolarPlot(((org.jfree.data.xy.XYDataset)(combinedDataset0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.PolarItemRenderer)(defaultPolarItemRenderer0)));
        categoryPlot0.setParent(polarPlot0);
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("5vPPvq 5zBH .>AU9a");
        java.util.List list0 = categoryPlot0.getCategoriesForAxis(categoryAxis0);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent0 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)(list0)));
        categoryPlot0.rendererChanged(rendererChangeEvent0);
        org.junit.Assert.assertTrue(categoryPlot0.isOutlineVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test153() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent0 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)(categoryPlot0)));
        categoryPlot0.rendererChanged(rendererChangeEvent0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test155() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        categoryPlot0.handleClick((-2282), (-2282), plotRenderingInfo0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test156() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("SansSerif");
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-1.0));
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer0)));
        defaultCategoryDataset0.setValue(0.05, ((java.lang.Comparable)(0.0F)), ((java.lang.Comparable)(-553.8264)));
        org.jfree.chart.LegendItemCollection legendItemCollection0 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertEquals(1, legendItemCollection0.getItemCount());
        org.junit.Assert.assertNotNull(legendItemCollection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test157() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("SansSerif" , categoryPlot0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(categoryPlot0)) , true);
        jFreeChart0.setTitle(((org.jfree.chart.title.TextTitle)(null)));
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        jFreeChart0.createBufferedImage(15, 10, chartRenderingInfo0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test159() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        java.awt.Color color0 = ((java.awt.Color)(org.jfree.chart.plot.MeterPlot.DEFAULT_NEEDLE_PAINT));
        combinedDomainCategoryPlot0.setRangeGridlinePaint(color0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test161() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_STROKE));
        categoryPlot0.setRangeGridlineStroke(basicStroke0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test162() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertEquals(1.0F, org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test164() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.PeriodAxis periodAxis0 = new org.jfree.chart.axis.PeriodAxis("lrI128");
        combinedDomainCategoryPlot0.setDomainGridlinePaint(periodAxis0.DEFAULT_TICK_MARK_PAINT);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test166() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer(true);
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(stackedAreaRenderer0.lookupSeriesOutlineStroke(10)));
        combinedDomainCategoryPlot0.setDomainGridlineStroke(basicStroke0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test168() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.setDomainGridlinesVisible(true);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isDomainGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test171() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("java.awt.geom.Rectangle2D$Double[x=-4.0,y=-4.0,w=8.0,h=8.0]");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        org.jfree.chart.util.SortOrder sortOrder0 = org.jfree.chart.util.SortOrder.ASCENDING;
        combinedDomainCategoryPlot0.setRowRenderingOrder(sortOrder0);
        org.junit.Assert.assertFalse(combinedDomainCategoryPlot0.getDrawSharedDomainAxis());
    }

    @org.junit.Test(timeout = 4000)
    public void test173() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder0 = combinedRangeCategoryPlot0.getColumnRenderingOrder();
        combinedRangeCategoryPlot0.setColumnRenderingOrder(sortOrder0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test175() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder0 = org.jfree.chart.plot.DatasetRenderingOrder.FORWARD;
        combinedDomainCategoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test176() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        categoryPlot0.getRendererForDataset(defaultCategoryDataset0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test177() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray0 = new org.jfree.chart.renderer.category.CategoryItemRenderer[2];
        combinedDomainCategoryPlot0.setRenderers(categoryItemRendererArray0);
        org.junit.Assert.assertEquals(5.0, combinedDomainCategoryPlot0.getGap(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test178() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis();
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(dateAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        categoryPlot0.setRenderer(((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)), true);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test179() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer0 = categoryPlot0.getRenderer(92);
        org.junit.Assert.assertNull(categoryItemRenderer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test180() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        java.awt.Rectangle rectangle0 = rectangle2D_Double0.getBounds();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        boolean boolean0 = combinedDomainCategoryPlot0.render(((java.awt.Graphics2D)(null)), rectangle0, 0, plotRenderingInfo0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test181() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = combinedDomainCategoryPlot0.getDomainAxisForDataset((-1737));
        org.junit.Assert.assertNotNull(categoryAxis0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test182() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        categoryPlot0.setDataset(10, ((org.jfree.data.category.CategoryDataset)(null)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test183() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset0 = categoryPlot0.getDataset(36);
        org.junit.Assert.assertNull(categoryDataset0);
    }

    @org.junit.Test(timeout = 4000)
    public void test184() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.clearRangeAxes();
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test185() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray0 = new org.jfree.chart.axis.ValueAxis[2];
        combinedRangeCategoryPlot0.setRangeAxes(valueAxisArray0);
        org.junit.Assert.assertEquals(2, combinedRangeCategoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test186() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.clearDomainAxes();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test187() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.clearDomainAxes();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test190() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDomainAxisLocation(2278);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test191() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray0 = new org.jfree.chart.axis.CategoryAxis[7];
        combinedRangeCategoryPlot0.setDomainAxes(categoryAxisArray0);
        org.junit.Assert.assertEquals(7, combinedRangeCategoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test192() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        combinedDomainCategoryPlot0.setDomainAxis(0, categoryAxis0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test194() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getDomainAxis(500);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test196() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(combinedRangeCategoryPlot0.getDomainGridlineStroke()));
        org.junit.Assert.assertEquals(0.0F, basicStroke0.getMiterLimit(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test197() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getDomainGridlinePosition();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test198() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(layeredBarRenderer0)));
        int int0 = categoryPlot0.getDomainAxisIndex(((org.jfree.chart.axis.CategoryAxis)(null)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test199() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.clearAnnotations();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test200() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getCategories();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test201() throws java.lang.Throwable {
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("CategoryLabelWidthType.RANGE");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)));
        boolean boolean0 = combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test202() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.zoomDomainAxes(244.255018375777, 244.255018375777, ((org.jfree.chart.plot.PlotRenderingInfo)(null)), ((java.awt.geom.Point2D)(null)));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test203() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        java.awt.Color color0 = ((java.awt.Color)(combinedDomainCategoryPlot0.getDomainGridlinePaint()));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals((-4144960), color0.getRGB());
    }

    @org.junit.Test(timeout = 4000)
    public void test204() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getPlotType();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test205() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        java.awt.Color color0 = ((java.awt.Color)(combinedDomainCategoryPlot0.getRangeCrosshairPaint()));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(255, color0.getBlue());
    }

    @org.junit.Test(timeout = 4000)
    public void test206() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        combinedDomainCategoryPlot0.setDataset(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test207() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection0 = stackedAreaRenderer0.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection0);
        org.jfree.chart.LegendItemCollection legendItemCollection1 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertSame(legendItemCollection1, legendItemCollection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test208() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean0 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test209() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test210() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertEquals("RectangleEdge.BOTTOM", rectangleEdge0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test211() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        categoryPlot0.setRenderer(((org.jfree.chart.renderer.category.CategoryItemRenderer)(lineRenderer3D0)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test212() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test213() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(0.0);
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        java.awt.Color color0 = ((java.awt.Color)(combinedRangeCategoryPlot0.getRangeGridlinePaint()));
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(((java.awt.Paint)(color0)) , numberAxis0.DEFAULT_AXIS_LINE_PAINT , combinedRangeCategoryPlot0.DEFAULT_OUTLINE_PAINT , numberAxis0.DEFAULT_TICK_MARK_PAINT);
        combinedRangeCategoryPlot0.setRenderer(500, ((org.jfree.chart.renderer.category.CategoryItemRenderer)(waterfallBarRenderer0)));
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(192, color0.getRed());
    }

    @org.junit.Test(timeout = 4000)
    public void test214() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        int int0 = combinedDomainCategoryPlot0.getWeight();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test215() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test216() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test217() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(((double)(1.0F)) , 0.0);
        categoryPlot0.setRangeAxis(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getRangeAxisCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test218() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("p>L~N7(Gn>1ks/");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection0 = combinedDomainCategoryPlot0.getRangeMarkers(layer0);
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test219() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getDatasetRenderingOrder();
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test220() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(1.0F)));
        combinedDomainCategoryPlot0.addDomainMarker(categoryMarker0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test221() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(null)));
        combinedRangeCategoryPlot0.setAnchorValue(3.0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test222() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation0);
        org.junit.Assert.assertEquals("AxisLocation.TOP_OR_LEFT", axisLocation0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test223() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        combinedDomainCategoryPlot0.setFixedRangeAxisSpace(((org.jfree.chart.axis.AxisSpace)(null)));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test224() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setFixedDomainAxisSpace(((org.jfree.chart.axis.AxisSpace)(null)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test225() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("Null 'annotation' argument.");
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.0 , 0.0);
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(((double)(0.0F)) , ((double)(2.0F)) , true);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test226() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(0.0);
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection0 = combinedRangeCategoryPlot0.getDomainMarkers(layer0);
        org.junit.Assert.assertNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test227() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getAxisOffset();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test228() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(null)));
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainXYPlot0.getRangeAxisLocation(2213);
        categoryPlot0.setRangeAxisLocation(axisLocation0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test229() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        double double0 = combinedDomainCategoryPlot0.getAnchorValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test230() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test232() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot();
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(2.5E7 , 1448.65079204176);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        categoryPlot0.getRangeCrosshairStroke();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test233() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getAnnotations();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test234() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , 0.0 , 0.0);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("<5&a.w3SL?HZ" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 3, ((org.jfree.chart.ChartRenderingInfo)(null)));
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        categoryPlot0.drawRangeGridlines(sunGraphics2D0, rectangle2D_Double0, ((java.util.List)(null)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeGridlinesVisible());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test235() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getRenderer();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test236() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainCategoryPlot0.getRangeAxisLocation();
        combinedDomainCategoryPlot0.setDomainAxisLocation(0, axisLocation0);
        org.junit.Assert.assertEquals("AxisLocation.TOP_OR_LEFT", axisLocation0.toString());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test237() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("^uN,oYz");
        java.lang.String[] stringArray0 = new java.lang.String[8];
        org.jfree.chart.axis.SymbolAxis symbolAxis0 = new org.jfree.chart.axis.SymbolAxis("p`ti#dDO" , stringArray0);
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(symbolAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        categoryPlot0.zoomDomainAxes(0.0, plotRenderingInfo0, ((java.awt.geom.Point2D)(null)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test238() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setDrawSharedDomainAxis(true);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.getDrawSharedDomainAxis());
    }

    @org.junit.Test(timeout = 4000)
    public void test239() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(0.0 , 0.0 , 0.0 , 0.0);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("<5&a.w3SL?HZ" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 3, ((org.jfree.chart.ChartRenderingInfo)(null)));
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        categoryPlot0.calculateAxisSpace(sunGraphics2D0, rectangle2D_Double0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test240() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int0 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test241() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue(1.0E8);
        org.junit.Assert.assertEquals(1.0E8, categoryPlot0.getRangeCrosshairValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test242() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 80, ((double)(0.0F)), 0.05, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        javax.swing.border.BevelBorder bevelBorder0 = new javax.swing.border.BevelBorder(10);
        javax.swing.text.StringContent stringContent0 = new javax.swing.text.StringContent();
        javax.swing.text.StyleContext styleContext0 = javax.swing.text.StyleContext.getDefaultStyleContext();
        javax.swing.text.DefaultStyledDocument defaultStyledDocument0 = new javax.swing.text.DefaultStyledDocument(((javax.swing.text.AbstractDocument.Content)(stringContent0)) , styleContext0);
        javax.swing.JTextField jTextField0 = new javax.swing.JTextField(((javax.swing.text.Document)(defaultStyledDocument0)) , "" , 500);
        java.awt.Rectangle rectangle0 = bevelBorder0.getInteriorRectangle(((java.awt.Component)(jTextField0)), 10, 6, 15, (-1964));
        combinedRangeCategoryPlot0.drawBackground(sunGraphics2D0, rectangle0);
        org.junit.Assert.assertEquals(1, sunGraphics2D0.interpolationType);
    }

    @org.junit.Test(timeout = 4000)
    public void test243() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        combinedDomainCategoryPlot0.setRangeAxisLocation(213, axisLocation0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isOutlineVisible());
    }
}

