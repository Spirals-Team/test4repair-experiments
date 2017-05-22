package org.jfree.chart.plot;


public class CategoryPlot_ESTest extends org.jfree.chart.plot.CategoryPlot_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 500);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        combinedDomainCategoryPlot0.render(sunGraphics2D0, rectangle2D_Double0, 1, plotRenderingInfo0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = combinedDomainCategoryPlot0.getRangeAxisEdge(1);
        org.junit.Assert.assertEquals("RectangleEdge.RIGHT", rectangleEdge0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-4487.51355) , "Null 'position' argument.");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        combinedRangeCategoryPlot0.getDomainAxisLocation(1);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("The renderer has changed and I don't know what to do!");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = ((org.jfree.chart.plot.CategoryPlot)(categoryPlot0.clone()));
        categoryPlot1.getDomainAxisForDataset(2038);
        org.junit.Assert.assertEquals(1, categoryPlot1.getDatasetCount());
        org.junit.Assert.assertEquals(1, categoryPlot1.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainCategoryPlot0.getDomainAxisLocation();
        combinedDomainCategoryPlot0.setRangeAxisLocation(axisLocation0, false);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.mapDatasetToDomainAxis(3, 10);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 500);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        combinedDomainCategoryPlot0.drawBackground(sunGraphics2D0, rectangle2D_Double0);
        org.junit.Assert.assertTrue(org.jfree.chart.plot.CategoryPlot.DEFAULT_RANGE_GRIDLINES_VISIBLE);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        combinedRangeCategoryPlot0.drawRangeMarkers(((java.awt.Graphics2D)(null)), ((java.awt.geom.Rectangle2D)(null)), ((byte)(-128)), layer0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(((org.jfree.chart.JFreeChart)(null)) , false);
        java.awt.Rectangle rectangle0 = chartPanel0.getVisibleRect();
        combinedDomainCategoryPlot0.drawDomainMarkers(((java.awt.Graphics2D)(null)), rectangle0, (-1966), ((org.jfree.chart.util.Layer)(null)));
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.drawDomainGridlines(((java.awt.Graphics2D)(null)), ((java.awt.geom.Rectangle2D)(null)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float(0.0F , 0.0F , (-1569.2864F) , ((float)(10)));
        combinedRangeCategoryPlot0.drawAnnotations(((java.awt.Graphics2D)(null)), rectangle2D_Float0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        combinedDomainCategoryPlot0.setRenderer(42, ((org.jfree.chart.renderer.category.CategoryItemRenderer)(lineRenderer3D0)));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        combinedDomainCategoryPlot0.setRangeAxisLocation(axisLocation0);
        org.junit.Assert.assertEquals("AxisLocation.BOTTOM_OR_RIGHT", axisLocation0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1994.263 , 0.0025);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        numberAxis0.setVisible(false);
        org.jfree.chart.axis.NumberAxis numberAxis1 = ((org.jfree.chart.axis.NumberAxis)(categoryPlot0.getRangeAxisForDataset(40)));
        org.junit.Assert.assertSame(numberAxis0, numberAxis1);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1994.263 , 0.0025);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        categoryPlot0.getRangeAxisForDataset(40);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getRangeAxis();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1994.263 , 0.0025);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        numberAxis0.setVisible(false);
        org.jfree.chart.axis.NumberAxis numberAxis1 = ((org.jfree.chart.axis.NumberAxis)(categoryPlot0.getRangeAxis()));
        org.junit.Assert.assertFalse(org.jfree.chart.axis.NumberAxis.DEFAULT_VERTICAL_TICK_LABELS);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.0 , "n");
        cyclicNumberAxis0.setRangeWithMargins(0.0, 0.0);
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        combinedRangeCategoryPlot0.getRangeAxis();
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("The renderer has changed and I don't know what to do!");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        int int0 = categoryPlot0.getIndexOf(stackedBarRenderer3D0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("Oa#1=<");
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(lineRenderer3D0)));
        categoryPlot0.getDomainAxisIndex(((org.jfree.chart.axis.CategoryAxis)(null)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDomainAxis();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("{d");
        categoryAxis3D0.setLabelAngle((-1005.32439));
        combinedRangeCategoryPlot0.setDomainAxis(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D1 = ((org.jfree.chart.axis.CategoryAxis3D)(combinedRangeCategoryPlot0.getDomainAxis()));
        org.junit.Assert.assertNotNull(categoryAxis3D1);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.data.category.CategoryDataset categoryDataset0 = combinedRangeCategoryPlot0.getDataset();
        org.junit.Assert.assertNull(categoryDataset0);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = combinedDomainCategoryPlot0.getRangeAxisEdge((-1));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 500);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.chart.axis.PeriodAxis periodAxis0 = new org.jfree.chart.axis.PeriodAxis("SAVE" , ((org.jfree.data.time.RegularTimePeriod)(year0)) , ((org.jfree.data.time.RegularTimePeriod)(year0)) , year0.DEFAULT_TIME_ZONE);
        org.jfree.chart.axis.AxisSpace axisSpace0 = combinedDomainCategoryPlot0.calculateAxisSpace(sunGraphics2D0, rectangle2D_Double0);
        org.jfree.chart.axis.AxisSpace axisSpace1 = periodAxis0.reserveSpace(sunGraphics2D0, combinedDomainXYPlot0, rectangle2D_Double0, rectangleEdge0, axisSpace0);
        org.jfree.chart.axis.AxisSpace axisSpace2 = combinedDomainCategoryPlot0.calculateRangeAxisSpace(sunGraphics2D0, rectangle2D_Double0, axisSpace1);
        org.junit.Assert.assertSame(axisSpace2, axisSpace1);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 500);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.axis.AxisSpace axisSpace0 = combinedRangeXYPlot0.calculateAxisSpace(sunGraphics2D0, rectangle2D_Double0);
        org.jfree.chart.axis.AxisSpace axisSpace1 = combinedDomainCategoryPlot0.calculateRangeAxisSpace(sunGraphics2D0, rectangle2D_Double0, axisSpace0);
        org.junit.Assert.assertSame(axisSpace1, axisSpace0);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 500);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.axis.AxisSpace axisSpace0 = combinedDomainCategoryPlot0.calculateAxisSpace(sunGraphics2D0, rectangle2D_Double0);
        combinedDomainCategoryPlot0.calculateDomainAxisSpace(sunGraphics2D0, rectangle2D_Double0, axisSpace0);
        org.junit.Assert.assertEquals(8.0, axisSpace0.getBottom(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(1.0E-4);
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(10.0 , ((double)(1.0F)) , 0.0 , 1.0E-4);
        combinedRangeCategoryPlot0.calculateAxisSpace(sunGraphics2D0, rectangle2D_Double0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 500);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        combinedDomainCategoryPlot0.calculateAxisSpace(sunGraphics2D0, rectangle2D_Double0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        try {
            combinedDomainCategoryPlot0.addRangeMarker(((org.jfree.chart.plot.Marker)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        try {
            categoryPlot0.addRangeMarker(17, ((org.jfree.chart.plot.Marker)(null)), layer0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("The renderer has changed and I don't know what to do!");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(0 , 500);
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer0 = new org.jfree.chart.renderer.WaferMapRenderer(10 , 8);
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0 , waferMapRenderer0);
        categoryPlot0.equals(waferMapPlot0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setAnchorValue(0.0, true);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis();
        combinedDomainCategoryPlot0.getDataRange(dateAxis0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1994.263 , 0.0025);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.jfree.data.Range range0 = categoryPlot0.getDataRange(numberAxis0);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 500);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        combinedDomainCategoryPlot0.render(sunGraphics2D0, rectangle2D_Double0, 4, plotRenderingInfo0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.setRangeCrosshairValue(((double)((byte)(87))), true);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertFalse(combinedDomainCategoryPlot0.isRangeCrosshairVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.clearRangeMarkers(0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.clearRangeMarkers((-1));
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeZoomable());
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getRangeMarkers((-1637), ((org.jfree.chart.util.Layer)(null)));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.PeriodAxis periodAxis0 = new org.jfree.chart.axis.PeriodAxis("|$l3h>2'E|$o2N+{Rx");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultBoxAndWhiskerCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(periodAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)));
        org.jfree.chart.plot.IntervalMarker intervalMarker0 = new org.jfree.chart.plot.IntervalMarker((-291.03381) , (-2450.404076486) , categoryPlot0.DEFAULT_CROSSHAIR_PAINT , categoryAxis3D0.DEFAULT_AXIS_LINE_STROKE , categoryAxis3D0.DEFAULT_TICK_LABEL_PAINT , categoryPlot0.DEFAULT_CROSSHAIR_STROKE , 0.0F);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        categoryPlot0.addRangeMarker(500, ((org.jfree.chart.plot.Marker)(intervalMarker0)), layer0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("p\"ki{\'4c8a");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)));
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(0.2)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        combinedRangeCategoryPlot0.addRangeMarker(0, ((org.jfree.chart.plot.Marker)(categoryMarker0)), layer0);
        org.junit.Assert.assertEquals(1.0F, combinedRangeCategoryPlot0.getForegroundAlpha(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.clearDomainMarkers(0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)));
        combinedRangeCategoryPlot0.getDomainMarkers(500, ((org.jfree.chart.util.Layer)(null)));
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(false)) , combinedDomainCategoryPlot0.DEFAULT_OUTLINE_PAINT , combinedDomainCategoryPlot0.DEFAULT_CROSSHAIR_STROKE);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        combinedDomainCategoryPlot0.addDomainMarker(102, categoryMarker0, layer0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList(15);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent0 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)(objectList0)));
        categoryPlot0.rendererChanged(rendererChangeEvent0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(true , true);
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent0 = new org.jfree.data.general.DatasetChangeEvent(((java.lang.Object)(statisticalLineAndShapeRenderer0)) , ((org.jfree.data.general.Dataset)(defaultValueDataset0)));
        combinedDomainCategoryPlot0.datasetChanged(datasetChangeEvent0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection0 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertEquals(0, legendItemCollection0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1994.263 , 0.0025);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D1 = ((org.jfree.chart.renderer.category.StackedBarRenderer3D)(categoryPlot0.getRendererForDataset(defaultKeyedValues2DDataset0)));
        org.junit.Assert.assertEquals(0.0, stackedBarRenderer3D1.getMinimumBarLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setRenderer(1, ((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)), false);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        categoryPlot0.setRenderer(77, ((org.jfree.chart.renderer.category.CategoryItemRenderer)(groupedStackedBarRenderer0)), true);
        org.junit.Assert.assertEquals(0.0, groupedStackedBarRenderer0.getMinimumBarLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer0 = combinedDomainCategoryPlot0.getRenderer(0);
        org.junit.Assert.assertNull(categoryItemRenderer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(null)));
        org.jfree.chart.axis.ValueAxis valueAxis0 = combinedRangeCategoryPlot0.getRangeAxisForDataset(0);
        org.junit.Assert.assertNull(valueAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset0 = categoryPlot0.getDataset((-2146607626));
        org.junit.Assert.assertNull(categoryDataset0);
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.0 , "n");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.data.category.CategoryDataset categoryDataset0 = combinedRangeCategoryPlot0.getDataset(500);
        org.junit.Assert.assertNull(categoryDataset0);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("The renderer has changed and I don't know what to do!");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = categoryPlot0.getDomainAxisLocation();
        categoryPlot0.setRangeAxisLocation(10, axisLocation0, true);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis();
        combinedDomainCategoryPlot0.setRangeAxis(3295, ((org.jfree.chart.axis.ValueAxis)(dateAxis0)), false);
        org.junit.Assert.assertEquals(3296, combinedDomainCategoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeAxis(0, ((org.jfree.chart.axis.ValueAxis)(null)), true);
        org.junit.Assert.assertEquals(1, categoryPlot0.getRangeAxisCount());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis();
        combinedDomainCategoryPlot0.setRangeAxis(3315, ((org.jfree.chart.axis.ValueAxis)(dateAxis0)), true);
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(true , true);
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent0 = new org.jfree.data.general.DatasetChangeEvent(((java.lang.Object)(statisticalLineAndShapeRenderer0)) , ((org.jfree.data.general.Dataset)(defaultValueDataset0)));
        combinedDomainCategoryPlot0.datasetChanged(datasetChangeEvent0);
        org.junit.Assert.assertEquals(3316, combinedDomainCategoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(combinedRangeCategoryPlot0.getRangeAxis(0)));
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertNotNull(numberAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1982.0255924503433 , 0.0025);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertEquals(1.0F, categoryPlot0.getForegroundAlpha(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getDomainAxisEdge((-1008));
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedRangeCategoryPlot0.getRangeAxisLocation();
        combinedRangeCategoryPlot0.setDomainAxisLocation(10, axisLocation0, true);
        org.junit.Assert.assertEquals(0.0, combinedRangeCategoryPlot0.getAnchorValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainCategoryPlot0.getDomainAxisLocation();
        combinedDomainCategoryPlot0.setDomainAxisLocation(0, axisLocation0, false);
        org.junit.Assert.assertEquals("AxisLocation.BOTTOM_OR_LEFT", axisLocation0.toString());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDomainAxisLocation(0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-4487.51355) , "Null 'position' argument.");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("");
        combinedRangeCategoryPlot0.setDomainAxis(500, categoryAxis0, false);
        org.junit.Assert.assertEquals(501, combinedRangeCategoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("Oa#1=<");
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(lineRenderer3D0)));
        categoryPlot0.setDomainAxis(0, ((org.jfree.chart.axis.CategoryAxis)(null)), true);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDomainAxisCount());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("p\"ki{\'4c8a");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)));
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        combinedRangeCategoryPlot0.setDomainAxis(1308, ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedRangeCategoryPlot0.getDomainAxis(1308);
        org.junit.Assert.assertEquals(1309, combinedRangeCategoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = combinedRangeCategoryPlot0.getDomainAxis((-2547));
        org.junit.Assert.assertNull(categoryAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = combinedDomainXYPlot0.getOrientation();
        categoryPlot0.setOrientation(plotOrientation0);
        org.junit.Assert.assertEquals(10, org.jfree.chart.plot.Plot.MINIMUM_HEIGHT_TO_DRAW);
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(null)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainXYPlot0.getRangeAxisLocation();
        combinedRangeCategoryPlot0.setDomainAxisLocation(axisLocation0, false);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("Oa#1=<");
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(lineRenderer3D0)));
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset1 = ((org.jfree.data.category.DefaultCategoryDataset)(categoryPlot0.getDataset()));
        org.junit.Assert.assertSame(defaultCategoryDataset0, defaultCategoryDataset1);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean0 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.isRangeZoomable();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = combinedRangeCategoryPlot0.getOrientation();
        org.junit.Assert.assertEquals("PlotOrientation.VERTICAL", plotOrientation0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = categoryPlot0.getDomainAxisLocation();
        categoryPlot0.setRangeAxisLocation(0, axisLocation0, false);
        org.junit.Assert.assertEquals("AxisLocation.BOTTOM_OR_LEFT", axisLocation0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("hK`3Uapo`&J");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D1 = ((org.jfree.chart.axis.CategoryAxis3D)(combinedDomainCategoryPlot0.getDomainAxis()));
        org.junit.Assert.assertNotNull(categoryAxis3D1);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer0 = combinedDomainCategoryPlot0.getRenderer();
        org.junit.Assert.assertNull(categoryItemRenderer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        java.util.List list0 = combinedRangeCategoryPlot0.getAnnotations();
        org.junit.Assert.assertTrue(list0.isEmpty());
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDatasetRenderingOrder();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray0 = new org.jfree.chart.renderer.category.CategoryItemRenderer[3];
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , categoryItemRendererArray0[1]);
        categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-2039.7) , ">KC");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(combinedRangeCategoryPlot0.getRangeGridlineStroke()));
        org.junit.Assert.assertEquals(2, basicStroke0.getLineJoin());
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean0 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("m");
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(layeredBarRenderer0)));
        categoryPlot0.setRangeAxis(2141, ((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.junit.Assert.assertEquals(2142, categoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(true , false);
        boolean boolean0 = categoryPlot0.equals(statisticalLineAndShapeRenderer0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setAnchorValue(373.346744916616, false);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(((org.jfree.chart.ChartRenderingInfo)(null)));
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double(((double)(3316)) , ((double)(1.0F)));
        combinedRangeCategoryPlot0.zoomRangeAxes((-2737.2528465), 0.05, plotRenderingInfo0, ((java.awt.geom.Point2D)(point2D_Double0)));
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double();
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        categoryPlot0.zoomRangeAxes(2712.6879395, 10.0, plotRenderingInfo0, ((java.awt.geom.Point2D)(point2D_Double0)));
        org.junit.Assert.assertFalse(categoryPlot0.isDomainZoomable());
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(1.0E-4);
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        combinedRangeCategoryPlot0.zoomRangeAxes(((double)(0.5F)), plotRenderingInfo0, ((java.awt.geom.Point2D)(null)));
        org.junit.Assert.assertFalse(cyclicNumberAxis0.isAutoRange());
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        categoryPlot0.zoomRangeAxes(10.0, plotRenderingInfo0, ((java.awt.geom.Point2D)(point2D_Double0)));
        org.junit.Assert.assertEquals(0.5F, categoryPlot0.getBackgroundImageAlpha(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getCategories();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("The renderer has changed and I don't know what to do!");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.jfree.chart.axis.ValueAxis[] valueAxisArray0 = new org.jfree.chart.axis.ValueAxis[8];
        org.jfree.chart.axis.PeriodAxis periodAxis0 = new org.jfree.chart.axis.PeriodAxis("The renderer has changed and I don't know what to do!");
        valueAxisArray0[7] = ((org.jfree.chart.axis.ValueAxis)(periodAxis0));
        categoryPlot0.setRangeAxes(valueAxisArray0);
        categoryPlot0.setDataset(1, ((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)));
        org.junit.Assert.assertEquals(8, categoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("The renderer has changed and I don't know what to do!");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = ((org.jfree.chart.plot.CategoryPlot)(categoryPlot0.clone()));
        categoryPlot1.setDataset(1, ((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)));
        categoryPlot1.getCategoriesForAxis(((org.jfree.chart.axis.CategoryAxis)(null)));
        org.junit.Assert.assertEquals(2, categoryPlot1.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test121() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("The renderer has changed and I don't know what to do!");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        categoryPlot0.setDataset(1, ((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)));
        categoryPlot0.getCategoriesForAxis(((org.jfree.chart.axis.CategoryAxis)(null)));
        org.junit.Assert.assertEquals(2, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("");
        java.util.List list0 = categoryPlot0.getCategoriesForAxis(extendedCategoryAxis0);
        org.junit.Assert.assertTrue(list0.isEmpty());
    }

    @org.junit.Test(timeout = 4000)
    public void test123() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray0 = new org.jfree.chart.renderer.category.CategoryItemRenderer[3];
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , categoryItemRendererArray0[1]);
        java.lang.Number[][] numberArray0 = new java.lang.Number[6][9];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0 , numberArray0);
        categoryPlot0.setDataset(500, ((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)));
        org.junit.Assert.assertEquals(501, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test124() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("The renderer has changed and I don't know what to do!");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.jfree.chart.axis.ValueAxis[] valueAxisArray0 = new org.jfree.chart.axis.ValueAxis[8];
        valueAxisArray0[0] = ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0));
        valueAxisArray0[1] = ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0));
        categoryPlot0.setRangeAxes(valueAxisArray0);
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = ((org.jfree.chart.plot.CategoryPlot)(categoryPlot0.clone()));
        org.junit.Assert.assertEquals(2, categoryPlot1.getRangeAxisCount());
        org.junit.Assert.assertTrue(categoryPlot1.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertTrue(categoryPlot1.equals(((java.lang.Object)(categoryPlot0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test126() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("The renderer has changed and I don't know what to do!");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        java.util.List list0 = categoryPlot0.getCategoriesForAxis(((org.jfree.chart.axis.CategoryAxis)(null)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("The renderer has changed and I don't know what to do!" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 24);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        categoryPlot0.drawRangeGridlines(sunGraphics2D0, rectangle2D_Double0, list0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test127() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 500);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("");
        java.util.List list0 = combinedDomainCategoryPlot0.getCategoriesForAxis(categoryAxis0);
        combinedDomainCategoryPlot0.drawRangeGridlines(sunGraphics2D0, rectangle2D_Double0, list0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test130() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(categoryPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        jFreeChart0.createBufferedImage(15, 10, chartRenderingInfo0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test131() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Fft" , categoryPlot0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(categoryPlot0)) , false);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, (-25.57), ((double)(1.0F)), chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX));
        java.awt.geom.Point2D.Float point2D_Float0 = new java.awt.geom.Point2D.Float((-1.0F) , ((float)(10)));
        org.jfree.chart.plot.PlotState plotState0 = new org.jfree.chart.plot.PlotState();
        categoryPlot0.draw(sunGraphics2D0, rectangle2D_Double0, point2D_Float0, plotState0, ((org.jfree.chart.plot.PlotRenderingInfo)(null)));
        org.junit.Assert.assertTrue(org.jfree.chart.plot.CategoryPlot.DEFAULT_RANGE_GRIDLINES_VISIBLE);
    }

    @org.junit.Test(timeout = 4000)
    public void test133() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(categoryPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(15, 3283, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.axis.AxisSpace axisSpace0 = categoryPlot0.calculateRangeAxisSpace(sunGraphics2D0, rectangle2D_Double0, ((org.jfree.chart.axis.AxisSpace)(null)));
        org.junit.Assert.assertEquals(0.0, axisSpace0.getRight(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test135() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float(0.0F , 0.0F , (-1569.2864F) , ((float)(10)));
        org.jfree.chart.axis.AxisSpace axisSpace0 = combinedRangeCategoryPlot0.calculateDomainAxisSpace(((java.awt.Graphics2D)(null)), rectangle2D_Float0, ((org.jfree.chart.axis.AxisSpace)(null)));
        org.junit.Assert.assertEquals(0.0, axisSpace0.getLeft(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test137() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation0 = new org.jfree.chart.annotations.CategoryLineAnnotation(((java.lang.Comparable)(1.0F)) , 0.05 , ((java.lang.Comparable)(10)) , (-630.4) , combinedDomainCategoryPlot0.DEFAULT_BACKGROUND_PAINT , combinedDomainCategoryPlot0.DEFAULT_OUTLINE_STROKE);
        combinedDomainCategoryPlot0.removeAnnotation(categoryLineAnnotation0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test139() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.annotations.CategoryTextAnnotation categoryTextAnnotation0 = new org.jfree.chart.annotations.CategoryTextAnnotation("1l>/" , ((java.lang.Comparable)(false)) , (-36.968388927248));
        combinedRangeCategoryPlot0.addAnnotation(categoryTextAnnotation0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test141() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.FastScatterPlot fastScatterPlot0 = new org.jfree.chart.plot.FastScatterPlot();
        categoryPlot0.setRangeCrosshairPaint(fastScatterPlot0.DEFAULT_GRIDLINE_PAINT);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test143() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE));
        categoryPlot0.setRangeCrosshairStroke(basicStroke0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test144() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertFalse(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test145() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setRangeCrosshairLockedOnData(true);
        org.junit.Assert.assertFalse(combinedRangeCategoryPlot0.isDomainGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test146() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.junit.Assert.assertFalse(combinedRangeCategoryPlot0.isRangeCrosshairVisible());
        combinedRangeCategoryPlot0.setRangeCrosshairVisible(true);
        boolean boolean0 = combinedRangeCategoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test147() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setRangeCrosshairVisible(false);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test148() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection0 = combinedDomainCategoryPlot0.getRangeMarkers(layer0);
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test149() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        categoryPlot0.getRangeMarkers(30, layer0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test150() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection0 = combinedRangeCategoryPlot0.getRangeMarkers(39, layer0);
        org.junit.Assert.assertNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test151() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test152() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(1.0F)) , combinedRangeCategoryPlot0.DEFAULT_GRIDLINE_PAINT , combinedRangeCategoryPlot0.DEFAULT_OUTLINE_STROKE);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        combinedRangeCategoryPlot0.addRangeMarker(((org.jfree.chart.plot.Marker)(categoryMarker0)), layer0);
        org.junit.Assert.assertEquals(5.0, combinedRangeCategoryPlot0.getGap(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test153() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(1.0F)));
        combinedRangeCategoryPlot0.addRangeMarker((-1), ((org.jfree.chart.plot.Marker)(categoryMarker0)), ((org.jfree.chart.util.Layer)(null)));
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test154() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection0 = categoryPlot0.getDomainMarkers((-8), layer0);
        org.junit.Assert.assertNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test155() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        combinedDomainCategoryPlot0.getDomainMarkers((-2992), layer0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test156() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(12.0)) , categoryAxis3D0.DEFAULT_AXIS_LINE_PAINT , categoryAxis3D0.DEFAULT_AXIS_LINE_STROKE , boxAndWhiskerRenderer0.DEFAULT_VALUE_LABEL_PAINT , combinedDomainCategoryPlot0.DEFAULT_CROSSHAIR_STROKE , 0.0F);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        combinedDomainCategoryPlot0.addDomainMarker((-154), categoryMarker0, layer0);
        combinedDomainCategoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test157() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(10)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        categoryPlot0.addDomainMarker(categoryMarker0, layer0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test160() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        combinedRangeCategoryPlot0.zoom(0.05);
        org.junit.Assert.assertFalse(dateAxis0.isAutoRange());
        org.junit.Assert.assertEquals((-0.025), dateAxis0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test162() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1994.263 , 0.0025);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(null)));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        categoryPlot0.handleClick(500, 40, plotRenderingInfo0);
        org.junit.Assert.assertEquals(0.0, categoryPlot0.getRangeCrosshairValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test163() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("The renderer has changed and I don't know what to do!");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        categoryPlot0.getLegendItems();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test165() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.setRangeGridlinePaint(categoryAxis3D0.DEFAULT_TICK_LABEL_PAINT);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test167() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.FastScatterPlot fastScatterPlot0 = new org.jfree.chart.plot.FastScatterPlot();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(fastScatterPlot0.getRangeGridlineStroke()));
        categoryPlot0.setRangeGridlineStroke(basicStroke0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test168() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("hK`3Uapo`&J");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.setRangeGridlinesVisible(false);
        org.junit.Assert.assertFalse(combinedDomainCategoryPlot0.isRangeGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test169() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test171() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("The renderer has changed and I don't know what to do!");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        categoryPlot0.setDomainGridlinePaint(stackedBarRenderer3D0.DEFAULT_PAINT);
        org.junit.Assert.assertEquals(1, categoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test173() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.setDomainGridlineStroke(categoryAxis3D0.DEFAULT_AXIS_LINE_STROKE);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test175() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("The renderer has changed and I don't know what to do!");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        categoryPlot0.setDomainGridlinesVisible(true);
        org.junit.Assert.assertTrue(categoryPlot0.isDomainGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test176() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setDomainGridlinesVisible(false);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test178() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("The renderer has changed and I don't know what to do!");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.jfree.chart.util.SortOrder sortOrder0 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder0);
        org.junit.Assert.assertNull(categoryPlot0.getNoDataMessage());
    }

    @org.junit.Test(timeout = 4000)
    public void test180() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder0 = org.jfree.chart.plot.DatasetRenderingOrder.REVERSE;
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test181() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        combinedDomainCategoryPlot0.getRendererForDataset(defaultCategoryDataset0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test182() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.setRenderer(((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test183() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray0 = new org.jfree.chart.renderer.category.CategoryItemRenderer[1];
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(categoryPlot0.DEFAULT_BACKGROUND_PAINT , categoryPlot0.DEFAULT_OUTLINE_PAINT , categoryPlot0.DEFAULT_BACKGROUND_PAINT , categoryPlot0.DEFAULT_CROSSHAIR_PAINT);
        categoryItemRendererArray0[0] = ((org.jfree.chart.renderer.category.CategoryItemRenderer)(waterfallBarRenderer0));
        categoryPlot0.setRenderers(categoryItemRendererArray0);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        categoryPlot0.setRenderer(((org.jfree.chart.renderer.category.CategoryItemRenderer)(lineAndShapeRenderer0)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test184() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer0 = categoryPlot0.getRenderer(1702);
        org.junit.Assert.assertNull(categoryItemRenderer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test185() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.mapDatasetToRangeAxis(10, 10);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test186() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("Oa#1=<");
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(lineRenderer3D0)));
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test187() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT;
        combinedDomainCategoryPlot0.setRangeAxisLocation(2958465, axisLocation0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test188() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getRangeAxisLocation(10);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test189() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("The renderer has changed and I don't know what to do!");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.jfree.chart.axis.ValueAxis[] valueAxisArray0 = new org.jfree.chart.axis.ValueAxis[8];
        categoryPlot0.setRangeAxes(valueAxisArray0);
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertFalse(categoryPlot0.isDomainZoomable());
    }

    @org.junit.Test(timeout = 4000)
    public void test190() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("Oa#1=<");
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(lineRenderer3D0)));
        categoryPlot0.getRangeAxis(500);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test191() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.clearDomainAxes();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test192() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.clearDomainAxes();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test193() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray0 = new org.jfree.chart.axis.CategoryAxis[1];
        combinedDomainCategoryPlot0.setDomainAxes(categoryAxisArray0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test194() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1994.263 , 0.0025);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D1 = ((org.jfree.chart.axis.CategoryAxis3D)(categoryPlot0.getDomainAxisForDataset(0)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertNotNull(categoryAxis3D1);
    }

    @org.junit.Test(timeout = 4000)
    public void test195() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = combinedDomainCategoryPlot0.getDomainAxis(176);
        org.junit.Assert.assertNull(categoryAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test197() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(null)));
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("%W.E4gr");
        combinedRangeCategoryPlot0.setAxisOffset(categoryAxis3D0.DEFAULT_AXIS_LABEL_INSETS);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test199() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test200() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor0 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test201() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryPlot0.getDomainAxisIndex(categoryAxis0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test202() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(((double)(-1174)) , ((double)(1.0F)) , false);
        combinedDomainCategoryPlot0.setRenderer(((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)), true);
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D1 = ((org.jfree.chart.renderer.category.StackedBarRenderer3D)(combinedDomainCategoryPlot0.getRenderer()));
        org.junit.Assert.assertNotNull(stackedBarRenderer3D1);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test203() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("The renderer has changed and I don't know what to do!");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        categoryPlot0.clearAnnotations();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test204() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test205() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1994.263 , 0.0025);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        java.util.List list0 = categoryPlot0.getCategories();
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test206() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1994.263 , 0.0025);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        boolean boolean0 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test207() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setWeight(1);
        org.junit.Assert.assertEquals(1, categoryPlot0.getWeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test208() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double((-2236.20273319) , (-420.376386721714));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(null)));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        combinedDomainCategoryPlot0.zoomDomainAxes(0.0, (-291.03381), plotRenderingInfo0, ((java.awt.geom.Point2D)(point2D_Double0)));
        org.junit.Assert.assertFalse(org.jfree.chart.plot.CategoryPlot.DEFAULT_DOMAIN_GRIDLINES_VISIBLE);
    }

    @org.junit.Test(timeout = 4000)
    public void test209() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        java.awt.Color color0 = ((java.awt.Color)(combinedDomainCategoryPlot0.getDomainGridlinePaint()));
        org.junit.Assert.assertEquals(192, color0.getRed());
    }

    @org.junit.Test(timeout = 4000)
    public void test210() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getPlotType();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test211() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setRangeCrosshairValue((-874.0744142136));
        org.junit.Assert.assertEquals((-874.0744142136), combinedRangeCategoryPlot0.getRangeCrosshairValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test212() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("The renderer has changed and I don't know what to do!");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        java.awt.Color color0 = ((java.awt.Color)(categoryPlot0.getRangeCrosshairPaint()));
        org.junit.Assert.assertEquals(0, color0.getGreen());
    }

    @org.junit.Test(timeout = 4000)
    public void test213() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray0 = new org.jfree.chart.renderer.category.CategoryItemRenderer[3];
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , categoryItemRendererArray0[1]);
        categoryPlot0.setDataset(((org.jfree.data.category.CategoryDataset)(null)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test214() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.LegendItemCollection legendItemCollection0 = multiplePiePlot0.getLegendItems();
        combinedRangeCategoryPlot0.setFixedLegendItems(legendItemCollection0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeZoomable());
    }

    @org.junit.Test(timeout = 4000)
    public void test216() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        double double0 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test217() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = combinedRangeCategoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertEquals("RectangleEdge.LEFT", rectangleEdge0.toString());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test218() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean0 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test219() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = combinedRangeCategoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertEquals("RectangleEdge.BOTTOM", rectangleEdge0.toString());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test221() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1994.263 , 0.0025);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        int int0 = categoryPlot0.getWeight();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(0, int0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test222() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test223() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test224() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        categoryPlot0.setRangeAxis(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.junit.Assert.assertEquals(1.05, numberAxis0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test225() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.Collection collection0 = categoryPlot0.getRangeMarkers(((org.jfree.chart.util.Layer)(null)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test226() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(1.0F)));
        combinedRangeCategoryPlot0.addDomainMarker(categoryMarker0);
        combinedRangeCategoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test227() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.setAnchorValue(2.0);
        org.junit.Assert.assertEquals(2.0, combinedDomainCategoryPlot0.getAnchorValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test228() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = categoryPlot0.getDomainAxisLocation(3589);
        org.junit.Assert.assertNotNull(axisLocation0);
        categoryPlot0.setDomainAxisLocation(axisLocation0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test229() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("The renderer has changed and I don't know what to do!");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        categoryPlot0.setFixedRangeAxisSpace(((org.jfree.chart.axis.AxisSpace)(null)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test230() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("dH }9V");
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D("");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1.0E-8 , (-350.0));
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        categoryPlot0.setFixedDomainAxisSpace(((org.jfree.chart.axis.AxisSpace)(null)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test231() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        boolean boolean0 = combinedRangeCategoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test232() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getDomainMarkers(((org.jfree.chart.util.Layer)(null)));
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test233() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = combinedDomainCategoryPlot0.getAxisOffset();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(0.0, rectangleInsets0.getTop(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test235() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        double double0 = combinedRangeCategoryPlot0.getAnchorValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test236() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1994.263 , 0.0025);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test237() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.ValueMarker valueMarker0 = new org.jfree.chart.plot.ValueMarker(812.53707444);
        combinedRangeCategoryPlot0.addRangeMarker(((org.jfree.chart.plot.Marker)(valueMarker0)));
        combinedRangeCategoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertEquals(0.0, combinedRangeCategoryPlot0.getRangeCrosshairValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test238() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(combinedRangeCategoryPlot0.getRangeCrosshairStroke()));
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals(2, basicStroke0.getLineJoin());
    }

    @org.junit.Test(timeout = 4000)
    public void test239() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        java.awt.Color color0 = ((java.awt.Color)(combinedDomainCategoryPlot0.getRangeGridlinePaint()));
        org.junit.Assert.assertEquals(192, color0.getBlue());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test240() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainXYPlot0.getRangeAxisLocation(10);
        categoryPlot0.setDomainAxisLocation(1702, axisLocation0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test241() throws java.lang.Throwable {
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("1" , categoryPlot0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(categoryPlot0)) , false);
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        categoryPlot0.zoomDomainAxes(8.0, plotRenderingInfo0, ((java.awt.geom.Point2D)(point2D_Double0)));
        org.junit.Assert.assertFalse(chartPanel0.isDomainZoomable());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertTrue(chartPanel0.isRangeZoomable());
    }

    @org.junit.Test(timeout = 4000)
    public void test242() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.setDrawSharedDomainAxis(true);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.getDrawSharedDomainAxis());
    }

    @org.junit.Test(timeout = 4000)
    public void test243() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int0 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test244() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder0 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test245() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(categoryPlot0)));
        jFreeChart0.createBufferedImage(15, 15, ((org.jfree.chart.ChartRenderingInfo)(null)));
        org.junit.Assert.assertFalse(categoryPlot0.isDomainGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test246() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        int int0 = combinedRangeCategoryPlot0.getIndexOf(barRenderer3D0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test247() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray0 = new org.jfree.chart.axis.CategoryAxis[7];
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        categoryAxisArray0[0] = ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0));
        categoryPlot0.setDomainAxes(categoryAxisArray0);
        categoryPlot0.clone();
        org.junit.Assert.assertEquals(7, categoryPlot0.getDomainAxisCount());
    }
}

