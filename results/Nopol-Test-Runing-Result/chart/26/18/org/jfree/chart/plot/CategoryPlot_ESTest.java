package org.jfree.chart.plot;


public class CategoryPlot_ESTest extends org.jfree.chart.plot.CategoryPlot_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("");
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1.0E-8 , 1138.217796349449);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 15, 3.0, ((double)(0.5F)), chartRenderingInfo0);
        org.junit.Assert.assertEquals(0.5F, bufferedImage0.getAccelerationPriority(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.mapDatasetToRangeAxis(1, 1);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(">1rJ<");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        combinedDomainCategoryPlot0.getRangeAxisLocation(1);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.mapDatasetToDomainAxis(1923, 1923);
        org.junit.Assert.assertEquals(1.0F, org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(combinedRangeCategoryPlot0.DEFAULT_BACKGROUND_PAINT , combinedRangeCategoryPlot0.DEFAULT_GRIDLINE_PAINT , combinedRangeCategoryPlot0.DEFAULT_BACKGROUND_PAINT , combinedRangeCategoryPlot0.DEFAULT_CROSSHAIR_PAINT);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(3.0)) , waterfallBarRenderer0.DEFAULT_VALUE_LABEL_PAINT , combinedRangeCategoryPlot0.DEFAULT_OUTLINE_STROKE);
        combinedRangeCategoryPlot0.addRangeMarker(((org.jfree.chart.plot.Marker)(categoryMarker0)), layer0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("m5+ED");
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(waterfallBarRenderer0)));
        javax.swing.JInternalFrame jInternalFrame0 = new javax.swing.JInternalFrame();
        java.awt.Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        categoryPlot0.drawRangeMarkers(((java.awt.Graphics2D)(null)), rectangle0, (-1885), layer0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("'" , combinedDomainCategoryPlot0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)) , false);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2, 1, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        combinedDomainCategoryPlot0.drawDomainGridlines(sunGraphics2D0, ((java.awt.geom.Rectangle2D)(null)));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(categoryPlot0)));
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, ((double)(10)), 259.0681492280645, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(plotRenderingInfo0.getDataArea()));
        categoryPlot0.drawAnnotations(sunGraphics2D0, rectangle2D_Double0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        combinedRangeCategoryPlot0.zoom(2.0);
        org.junit.Assert.assertEquals((-1.0), dateAxis0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(1.0, dateAxis0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        categoryPlot0.setRangeAxisLocation(axisLocation0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)));
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainXYPlot0.getDomainAxisLocation((-670));
        combinedRangeCategoryPlot0.setDomainAxisLocation(axisLocation0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        combinedRangeCategoryPlot0.setDomainAxisLocation(10, axisLocation0);
        org.junit.Assert.assertEquals(1.0F, org.jfree.chart.plot.Plot.DEFAULT_FOREGROUND_ALPHA, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("TGdUq%I(iCrE#_JU");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        combinedDomainCategoryPlot0.setRenderer(((org.jfree.chart.renderer.category.CategoryItemRenderer)(levelRenderer0)));
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer1 = ((org.jfree.chart.renderer.category.LevelRenderer)(combinedDomainCategoryPlot0.getRendererForDataset(((org.jfree.data.category.CategoryDataset)(null)))));
        org.junit.Assert.assertNotNull(levelRenderer1);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("m5I8D");
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(waterfallBarRenderer0)));
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer1 = ((org.jfree.chart.renderer.category.WaterfallBarRenderer)(categoryPlot0.getRenderer()));
        org.junit.Assert.assertNotNull(waterfallBarRenderer1);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-3549.6565310208384) , (-3549.6565310208384) , "");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        combinedRangeCategoryPlot0.getRangeMarkers(layer0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.setRangeCrosshairValue(((double)(1191)), false);
        double double0 = combinedDomainCategoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertEquals(1191.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        dateAxis0.setNegativeArrowVisible(true);
        combinedRangeCategoryPlot0.getRangeAxisForDataset(15);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis0 = combinedDomainCategoryPlot0.getRangeAxis();
        org.junit.Assert.assertNull(valueAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        int int0 = combinedRangeCategoryPlot0.getIndexOf(((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray0 = new org.jfree.chart.renderer.category.CategoryItemRenderer[5];
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        categoryItemRendererArray0[2] = ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer0));
        combinedDomainCategoryPlot0.setRenderers(categoryItemRendererArray0);
        int int0 = combinedDomainCategoryPlot0.getIndexOf(stackedBarRenderer0);
        org.junit.Assert.assertEquals(2, int0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("Hari");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        combinedDomainCategoryPlot0.getDomainAxisIndex(extendedCategoryAxis0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray0 = new org.jfree.chart.axis.CategoryAxis[3];
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        categoryAxisArray0[1] = ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0));
        categoryPlot0.setDomainAxes(categoryAxisArray0);
        int int0 = categoryPlot0.getDomainAxisIndex(categoryAxis3D0);
        org.junit.Assert.assertEquals(3, categoryPlot0.getDomainAxisCount());
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDomainAxis();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("m5I8D");
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(waterfallBarRenderer0)));
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection1 = ((org.jfree.data.gantt.TaskSeriesCollection)(categoryPlot0.getDataset()));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertNotNull(taskSeriesCollection1);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("bins");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("bins" , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 10);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , 213 , 604 , 0 , 1769 , 213 , 15 , true , true , true , true , true , true);
        java.awt.Rectangle rectangle0 = chartPanel0.getBounds();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        java.util.Map map0 = combinedRangeCategoryPlot0.drawAxes(sunGraphics2D0, rectangle0, rectangle0, plotRenderingInfo0);
        org.junit.Assert.assertEquals((-16777216), sunGraphics2D0.eargb);
        org.junit.Assert.assertEquals(1, map0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("*j50O:U");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(3111.328369 , ((double)(10)) , ((double)(10)) , ((double)(10)));
        rectangle2D_Double0.setRect(1.0, (-2877.5689), (-822.78672090211), (-116.03533));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 630, 0.0, (-160.0), chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("*j50O:U");
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.LEFT;
        org.jfree.chart.axis.AxisSpace axisSpace0 = combinedDomainCategoryPlot0.calculateAxisSpace(sunGraphics2D0, rectangle2D_Double0);
        subCategoryAxis0.reserveSpace(sunGraphics2D0, combinedDomainCategoryPlot0, rectangle2D_Double0, rectangleEdge0, axisSpace0);
        combinedDomainCategoryPlot0.calculateRangeAxisSpace(sunGraphics2D0, rectangle2D_Double0, axisSpace0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2000, 10);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace0 = combinedDomainCategoryPlot0.calculateAxisSpace(sunGraphics2D0, rectangle2D_Double0);
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.calculateRangeAxisSpace(sunGraphics2D0, rectangle2D_Double0, axisSpace0);
        org.junit.Assert.assertEquals(4.0, axisSpace1.getBottom(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("*j50O:U");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(3111.328369 , ((double)(10)) , ((double)(10)) , ((double)(10)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 630, 0.0, (-160.0), chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.axis.AxisSpace axisSpace0 = combinedDomainCategoryPlot0.calculateAxisSpace(sunGraphics2D0, rectangle2D_Double0);
        combinedDomainCategoryPlot0.calculateDomainAxisSpace(sunGraphics2D0, rectangle2D_Double0, axisSpace0);
        org.junit.Assert.assertEquals(47.9375, axisSpace0.getBottom(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = ((org.jfree.chart.plot.CategoryPlot)(categoryPlot0.clone()));
        org.junit.Assert.assertEquals(1, categoryPlot1.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot1.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX));
        categoryPlot0.equals(rectangle2D_Double0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot();
        categoryPlot0.equals(waferMapPlot0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setAnchorValue(873.54121, true);
        org.junit.Assert.assertEquals(873.54121, categoryPlot0.getAnchorValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("Null 'position' argument.");
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("Null 'position' argument.");
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(dateAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedAreaRenderer0)));
        org.jfree.data.Range range0 = categoryPlot0.getDataRange(dateAxis0);
        org.junit.Assert.assertEquals(0.0, range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDataRange(((org.jfree.chart.axis.ValueAxis)(null)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("c)NUxv");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(((double)((byte)(75))) , ((double)((byte)(3))) , 853.18977744664 , (-924.55));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(((org.jfree.chart.ChartRenderingInfo)(null)));
        combinedDomainCategoryPlot0.render(((java.awt.Graphics2D)(null)), rectangle2D_Double0, (-312), plotRenderingInfo0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1.0E-8 , 1138.217796349449);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(15, 15);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float((-1683.0F) , 8.0F , ((float)(500)) , (-958.099F));
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(combinedDomainXYPlot0.getQuadrantOrigin()));
        org.jfree.chart.plot.PlotState plotState0 = new org.jfree.chart.plot.PlotState();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        categoryPlot0.draw(sunGraphics2D0, rectangle2D_Float0, point2D_Double0, plotState0, plotRenderingInfo0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertFalse(categoryPlot0.isRangeCrosshairVisible());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeGridlinesVisible());
        org.junit.Assert.assertEquals(0.0, stackedBarRenderer3D0.getUpperClip(), 0.01);
        org.junit.Assert.assertEquals(8.0F, rectangle2D_Float0.y, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.clearRangeMarkers((-1089));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("/18D0$BmacPp|%4Xj ");
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(null)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(ganttRenderer0)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection0 = categoryPlot0.getRangeMarkers(1596, layer0);
        org.junit.Assert.assertNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("D");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        combinedDomainCategoryPlot0.getRangeMarkers((-569), layer0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        try {
            categoryPlot0.addRangeMarker(1191, ((org.jfree.chart.plot.Marker)(null)), layer0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(false)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        combinedRangeCategoryPlot0.addRangeMarker((-2767), ((org.jfree.chart.plot.Marker)(categoryMarker0)), layer0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        categoryPlot0.getDomainMarkers(719, layer0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        categoryPlot0.getDomainMarkers(10, layer0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(false)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        categoryPlot0.addDomainMarker(10, categoryMarker0, layer0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)));
        combinedRangeCategoryPlot0.datasetChanged(((org.jfree.data.general.DatasetChangeEvent)(null)));
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double(2705.2750857 , 1340.8887393830335);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent0 = new org.jfree.data.general.DatasetChangeEvent(((java.lang.Object)(point2D_Double0)) , ((org.jfree.data.general.Dataset)(defaultValueDataset0)));
        categoryPlot0.datasetChanged(datasetChangeEvent0);
        org.junit.Assert.assertEquals(1.0F, org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("m5I8D");
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(waterfallBarRenderer0)));
        org.jfree.chart.LegendItemCollection legendItemCollection0 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertEquals(0, legendItemCollection0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getLegendItems();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("Negative 'periods' argument.");
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(5.0E7 , 0.05);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultBoxAndWhiskerCategoryDataset0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)));
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer0 = categoryPlot0.getRendererForDataset(defaultBoxAndWhiskerCategoryDataset0);
        org.junit.Assert.assertNull(categoryItemRenderer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("org.jfree.data.xy.TableXYDataset");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        combinedDomainCategoryPlot0.setRenderer(1, ((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)), true);
        org.junit.Assert.assertEquals(10, org.jfree.chart.plot.Plot.MINIMUM_WIDTH_TO_DRAW);
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        combinedRangeCategoryPlot0.setRenderer(500, ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer0)), false);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getRenderer((-590));
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        combinedDomainCategoryPlot0.getRenderer(7);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(combinedRangeCategoryPlot0.getRangeAxisForDataset(0)));
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertNotNull(numberAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = combinedRangeCategoryPlot0.getDomainAxisForDataset(0);
        org.junit.Assert.assertNull(categoryAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDataset((-1897));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getDataset(863);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.configureRangeAxes();
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        combinedDomainCategoryPlot0.configureRangeAxes();
        org.junit.Assert.assertFalse(combinedDomainCategoryPlot0.isSubplot());
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation(10, axisLocation0, true);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainXYPlot0.getRangeAxisLocation();
        combinedRangeCategoryPlot0.setRangeAxisLocation(472, axisLocation0, false);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = categoryPlot0.getRangeAxisLocation((-5));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertNotNull(axisLocation0);
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(((java.lang.Number)(0.2)));
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(waterfallBarRenderer0)));
        categoryPlot0.getRangeAxisLocation(939);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setRangeAxis(22, ((org.jfree.chart.axis.ValueAxis)(null)), false);
        org.junit.Assert.assertEquals(23, combinedRangeCategoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D();
        combinedDomainCategoryPlot0.setRangeAxis(9, ((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)), true);
        org.junit.Assert.assertEquals(1.05, numberAxis3D0.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals(10, combinedDomainCategoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis0 = categoryPlot0.getRangeAxis(2147001006);
        org.junit.Assert.assertNull(valueAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("Invalid 'day' argument.");
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("Invalid 'day' argument.");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)) , ((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(lineAndShapeRenderer0)));
        categoryPlot0.getRangeAxis((-1672));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.configureDomainAxes();
        org.junit.Assert.assertNull(combinedDomainCategoryPlot0.getNoDataMessage());
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT;
        categoryPlot0.setDomainAxisLocation(10, axisLocation0, false);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.TOP_OR_RIGHT;
        combinedRangeCategoryPlot0.setDomainAxisLocation(0, axisLocation0, true);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        combinedDomainCategoryPlot0.getDomainAxisLocation(0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)));
        combinedRangeCategoryPlot0.getDomainAxisLocation(2);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        java.lang.Number[][] numberArray0 = new java.lang.Number[5][4];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0 , numberArray0);
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("");
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(null)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedAreaRenderer0)));
        categoryPlot0.setDomainAxis(2, ((org.jfree.chart.axis.CategoryAxis)(null)), false);
        org.junit.Assert.assertEquals(3, categoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("org.jfree.chart.util.AbstractObjectList");
        combinedDomainCategoryPlot0.setDomainAxis(10, ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)), true);
        org.junit.Assert.assertEquals(11, combinedDomainCategoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("D");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        combinedDomainCategoryPlot0.getDomainAxis((-569));
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D();
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(categoryStepRenderer0)));
        org.junit.Assert.assertEquals(1.0F, org.jfree.chart.plot.Plot.DEFAULT_FOREGROUND_ALPHA, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation0, false);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals("AxisLocation.TOP_OR_LEFT", axisLocation0.toString());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDataset();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean0 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = categoryPlot0.getOrientation();
        org.junit.Assert.assertEquals("PlotOrientation.VERTICAL", plotOrientation0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean0 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = combinedDomainCategoryPlot0.getDomainAxis();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertNotNull(categoryAxis1);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("*j50O:U");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        combinedDomainCategoryPlot0.getRenderer();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getAnnotations();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.TOP_OR_RIGHT;
        combinedRangeCategoryPlot0.setRangeAxisLocation(axisLocation0, false);
        org.junit.Assert.assertEquals(0.5F, combinedRangeCategoryPlot0.getBackgroundImageAlpha(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        try {
            combinedDomainCategoryPlot0.addRangeMarker(((org.jfree.chart.plot.Marker)(null)), layer0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace0 = combinedRangeCategoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNull(axisSpace0);
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.LegendItemCollection legendItemCollection0 = combinedDomainCategoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertNull(legendItemCollection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(combinedDomainCategoryPlot0.getRangeGridlineStroke()));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals(0, basicStroke0.getEndCap());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean0 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot();
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        combinedRangeCategoryPlot0.setRangeAxis(500, ((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.junit.Assert.assertEquals(501, combinedRangeCategoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1.0E-8 , 1138.217796349449);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.jfree.chart.axis.NumberAxis numberAxis1 = ((org.jfree.chart.axis.NumberAxis)(categoryPlot0.getRangeAxis()));
        org.junit.Assert.assertTrue(org.jfree.chart.axis.Axis.DEFAULT_TICK_MARKS_VISIBLE);
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("TGdUq%I(iCrE#_JU");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot1 = ((org.jfree.chart.plot.CombinedDomainCategoryPlot)(combinedDomainCategoryPlot0.clone()));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot1.getDomainAxisCount());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDomainAxisCount());
        org.junit.Assert.assertEquals(0, combinedDomainCategoryPlot1.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot1 = ((org.jfree.chart.plot.CombinedRangeCategoryPlot)(combinedRangeCategoryPlot0.clone()));
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot1.getRangeAxisCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot1.equals(((java.lang.Object)(combinedRangeCategoryPlot0))));
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot1.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("m5I8D");
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(waterfallBarRenderer0)));
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = ((org.jfree.chart.plot.CategoryPlot)(categoryPlot0.clone()));
        org.junit.Assert.assertTrue(categoryPlot1.equals(((java.lang.Object)(categoryPlot0))));
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray0 = new org.jfree.chart.renderer.category.CategoryItemRenderer[8];
        categoryPlot1.setRangeCrosshairValue(5.0, true);
        categoryPlot1.setRenderers(categoryItemRendererArray0);
        org.junit.Assert.assertEquals(1, categoryPlot1.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("m5I8D");
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(waterfallBarRenderer0)));
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = ((org.jfree.chart.plot.CategoryPlot)(categoryPlot0.clone()));
        categoryPlot1.setAnchorValue(500000.0, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray0 = new org.jfree.chart.renderer.category.CategoryItemRenderer[10];
        categoryPlot1.setRenderers(categoryItemRendererArray0);
        org.junit.Assert.assertEquals(500000.0, categoryPlot1.getAnchorValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("m5I8D");
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(waterfallBarRenderer0)));
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = ((org.jfree.chart.plot.CategoryPlot)(categoryPlot0.clone()));
        org.junit.Assert.assertTrue(categoryPlot1.equals(((java.lang.Object)(categoryPlot0))));
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray0 = new org.jfree.chart.renderer.category.CategoryItemRenderer[10];
        categoryAxis0.setTickMarkOutsideLength(1.0F);
        categoryPlot1.setRenderers(categoryItemRendererArray0);
        org.junit.Assert.assertFalse(categoryPlot1.equals(((java.lang.Object)(categoryPlot0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("m5I8D");
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)) , categoryAxis0 , ((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(waterfallBarRenderer0)));
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = ((org.jfree.chart.plot.CategoryPlot)(categoryPlot0.clone()));
        org.junit.Assert.assertTrue(categoryPlot1.equals(((java.lang.Object)(categoryPlot0))));
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray0 = new org.jfree.chart.renderer.category.CategoryItemRenderer[10];
        categoryPlot1.setRenderers(categoryItemRendererArray0);
        org.junit.Assert.assertFalse(categoryPlot1.equals(((java.lang.Object)(categoryPlot0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(null)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(barRenderer3D0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double(5.0E8 , (-1294.0));
        categoryPlot0.zoomRangeAxes(((double)(2.0F)), 17.0, plotRenderingInfo0, ((java.awt.geom.Point2D)(point2D_Double0)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test121() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        combinedRangeCategoryPlot0.zoomRangeAxes((-190.56731239434401), 2.0, plotRenderingInfo0, ((java.awt.geom.Point2D)(null)));
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("/18D0$BmacPp|%4Xj ");
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(null)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(ganttRenderer0)));
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double();
        categoryPlot0.zoomRangeAxes((-1210.0), ((org.jfree.chart.plot.PlotRenderingInfo)(null)), ((java.awt.geom.Point2D)(point2D_Double0)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeZoomable());
    }

    @org.junit.Test(timeout = 4000)
    public void test123() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((java.lang.String)(null)) , combinedRangeCategoryPlot0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(xYPlot0)) , false);
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(((double)(1.0F)) , ((double)(600)) , ((double)(10)) , (-2010.8820098480892));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor0 = org.jfree.chart.util.RectangleAnchor.RIGHT;
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D_Double0, rectangleAnchor0)));
        combinedRangeCategoryPlot0.zoomRangeAxes(1210.5, plotRenderingInfo0, ((java.awt.geom.Point2D)(point2D_Double0)));
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test124() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1.0E-8 , 1138.217796349449);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        java.util.List list0 = categoryPlot0.getCategories();
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test125() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("");
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        categoryPlot0.getCategoriesForAxis(extendedCategoryAxis0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test126() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        java.util.List list0 = categoryPlot0.getCategoriesForAxis(categoryAxis3D0);
        org.junit.Assert.assertTrue(list0.isEmpty());
    }

    @org.junit.Test(timeout = 4000)
    public void test127() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        combinedDomainCategoryPlot0.setDataset(115, ((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)));
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(((double)(150)));
        org.jfree.chart.axis.ValueAxis[] valueAxisArray0 = new org.jfree.chart.axis.ValueAxis[1];
        valueAxisArray0[0] = ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0));
        combinedDomainCategoryPlot0.setRangeAxes(valueAxisArray0);
        org.junit.Assert.assertEquals(116, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test128() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(((double)(150)));
        org.jfree.data.Range range0 = combinedDomainCategoryPlot0.getDataRange(cyclicNumberAxis0);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test129() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(categoryPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(((org.jfree.chart.JFreeChart)(null)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        jFreeChart0.createBufferedImage(10, 10, 4459.101, ((double)(10)), chartRenderingInfo0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test130() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(0.0 , ((double)(1.0F)) , 190.324 , (-45.0));
        combinedDomainCategoryPlot0.calculateRangeAxisSpace(((java.awt.Graphics2D)(null)), rectangle2D_Double0, ((org.jfree.chart.axis.AxisSpace)(null)));
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test132() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.annotations.CategoryPointerAnnotation categoryPointerAnnotation0 = new org.jfree.chart.annotations.CategoryPointerAnnotation("" , ((java.lang.Comparable)(false)) , ((double)(10)) , 1.0);
        boolean boolean0 = categoryPlot0.removeAnnotation(categoryPointerAnnotation0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test134() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.annotations.CategoryPointerAnnotation categoryPointerAnnotation0 = new org.jfree.chart.annotations.CategoryPointerAnnotation("" , ((java.lang.Comparable)(false)) , 1376.24832951819 , 1376.24832951819);
        categoryPlot0.addAnnotation(categoryPointerAnnotation0);
        boolean boolean0 = categoryPlot0.removeAnnotation(categoryPointerAnnotation0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test136() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        combinedDomainCategoryPlot0.setRangeCrosshairPaint(subCategoryAxis0.DEFAULT_TICK_LABEL_PAINT);
        org.junit.Assert.assertEquals(1.0F, org.jfree.chart.plot.Plot.DEFAULT_FOREGROUND_ALPHA, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test137() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.setRangeCrosshairStroke(categoryAxis3D0.DEFAULT_TICK_MARK_STROKE);
        org.junit.Assert.assertEquals(0.05, categoryAxis3D0.getLowerMargin(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test138() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        combinedDomainCategoryPlot0.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertFalse(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test139() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        combinedDomainCategoryPlot0.setRangeCrosshairLockedOnData(true);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test140() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairVisible(true);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test141() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.junit.Assert.assertEquals(15, categoryPlot0.getBackgroundImageAlignment());
    }

    @org.junit.Test(timeout = 4000)
    public void test142() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.ValueMarker valueMarker0 = new org.jfree.chart.plot.ValueMarker(((double)(10)));
        categoryPlot0.addRangeMarker(((org.jfree.chart.plot.Marker)(valueMarker0)));
        categoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertEquals(10, org.jfree.chart.plot.Plot.MINIMUM_WIDTH_TO_DRAW);
    }

    @org.junit.Test(timeout = 4000)
    public void test143() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(true)) , categoryAxis3D0.DEFAULT_AXIS_LINE_PAINT , combinedDomainCategoryPlot0.DEFAULT_CROSSHAIR_STROKE , categoryAxis3D0.DEFAULT_TICK_MARK_PAINT , categoryAxis3D0.DEFAULT_TICK_MARK_STROKE , 0.0F);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        combinedDomainCategoryPlot0.addRangeMarker(0, ((org.jfree.chart.plot.Marker)(categoryMarker0)), layer0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test144() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.clearDomainMarkers((-3714));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test145() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDomainMarkers(2594, ((org.jfree.chart.util.Layer)(null)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test146() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(10)) , categoryPlot0.DEFAULT_CROSSHAIR_PAINT , categoryPlot0.DEFAULT_GRIDLINE_STROKE);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        categoryPlot0.addDomainMarker(categoryMarker0, layer0);
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeZoomable());
    }

    @org.junit.Test(timeout = 4000)
    public void test147() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(false)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        categoryPlot0.addDomainMarker(10, categoryMarker0, layer0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test150() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent0 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)(ganttRenderer0)));
        combinedDomainCategoryPlot0.rendererChanged(rendererChangeEvent0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test151() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        categoryPlot0.handleClick((-1663), (-1663), plotRenderingInfo0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test152() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.setRangeGridlinePaint(categoryAxis3D0.DEFAULT_TICK_LABEL_PAINT);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test154() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.setRangeGridlineStroke(categoryAxis3D0.DEFAULT_AXIS_LINE_STROKE);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test155() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.setRangeGridlinesVisible(false);
        org.junit.Assert.assertFalse(combinedDomainCategoryPlot0.isRangeGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test156() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test157() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.setDomainGridlinePaint(categoryAxis3D0.DEFAULT_AXIS_LABEL_PAINT);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test159() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        combinedDomainCategoryPlot0.setDomainGridlineStroke(subCategoryAxis0.DEFAULT_AXIS_LINE_STROKE);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test161() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor0 = org.jfree.chart.axis.CategoryAnchor.START;
        categoryPlot0.setDomainGridlinePosition(categoryAnchor0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test162() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("Haqri");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        combinedDomainCategoryPlot0.setDomainGridlinesVisible(true);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isDomainGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test163() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("Haqri");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        combinedDomainCategoryPlot0.setDomainGridlinesVisible(false);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test165() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder0 = org.jfree.chart.util.SortOrder.DESCENDING;
        categoryPlot0.setRowRenderingOrder(sortOrder0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test168() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder0 = categoryPlot0.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test169() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer0 = categoryPlot0.getRendererForDataset(defaultBoxAndWhiskerCategoryDataset0);
        org.junit.Assert.assertNull(categoryItemRenderer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test170() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        combinedDomainCategoryPlot0.drawDomainMarkers(((java.awt.Graphics2D)(null)), rectangle2D_Double0, 150, layer0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test171() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getRangeAxisForDataset(34);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test172() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = combinedDomainCategoryPlot0.getDomainAxisForDataset((-1154));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertNotNull(categoryAxis1);
    }

    @org.junit.Test(timeout = 4000)
    public void test173() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setDataset(77, ((org.jfree.data.category.CategoryDataset)(null)));
        org.junit.Assert.assertEquals(78, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test174() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.clearRangeAxes();
        org.junit.Assert.assertEquals(0, combinedRangeCategoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test175() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getRangeAxisEdge(233);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test177() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.clearDomainAxes();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test178() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        combinedDomainCategoryPlot0.clearDomainAxes();
        combinedDomainCategoryPlot0.getDomainAxisForDataset((-1154));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test179() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDomainAxisEdge(57);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test180() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(1877.967639346 , "3fGI)@{8/Y=l");
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(boxAndWhiskerRenderer0)));
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray0 = new org.jfree.chart.axis.CategoryAxis[4];
        categoryPlot0.setDomainAxes(categoryAxisArray0);
        org.junit.Assert.assertEquals(4, categoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test181() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("Null 'layer' not permitted.");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        combinedDomainCategoryPlot0.getDomainAxis(8);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test182() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(1877.967639346 , "3fGI)@{8/Y=l");
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(boxAndWhiskerRenderer0)));
        categoryPlot0.setAxisOffset(cyclicNumberAxis0.DEFAULT_AXIS_LABEL_INSETS);
        org.junit.Assert.assertEquals(0.0, categoryPlot0.getAnchorValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test184() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = org.jfree.chart.plot.PlotOrientation.HORIZONTAL;
        categoryPlot0.setOrientation(plotOrientation0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test185() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(categoryPlot0.getDomainGridlineStroke()));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals(2, basicStroke0.getLineJoin());
    }

    @org.junit.Test(timeout = 4000)
    public void test186() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDomainGridlinePosition();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test187() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1308, 10, 1121.7401, ((double)(1.0F)), chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Area area0 = new java.awt.geom.Area();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(area0.getBounds2D()));
        combinedRangeCategoryPlot0.drawBackground(sunGraphics2D0, rectangle2D_Double0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test188() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        combinedDomainCategoryPlot0.getDomainAxisIndex(categoryAxis3D0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test189() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        combinedRangeCategoryPlot0.setRenderer(((org.jfree.chart.renderer.category.CategoryItemRenderer)(defaultCategoryItemRenderer0)), false);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test190() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("D");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        combinedDomainCategoryPlot0.clearAnnotations();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test191() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list0 = categoryPlot0.getCategories();
        org.junit.Assert.assertNull(list0);
    }

    @org.junit.Test(timeout = 4000)
    public void test192() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        boolean boolean0 = combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test193() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setWeight(2982);
        org.junit.Assert.assertEquals(2982, categoryPlot0.getWeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test194() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("/18D0$BmacPp|%4Xj ");
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(null)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(ganttRenderer0)));
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double();
        categoryPlot0.zoomDomainAxes(2571.922295, (-1210.0), ((org.jfree.chart.plot.PlotRenderingInfo)(null)), ((java.awt.geom.Point2D)(point2D_Double0)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test195() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        categoryPlot0.setDomainAxis(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test196() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        java.awt.Color color0 = ((java.awt.Color)(combinedDomainCategoryPlot0.getDomainGridlinePaint()));
        org.junit.Assert.assertEquals(192, color0.getGreen());
    }

    @org.junit.Test(timeout = 4000)
    public void test197() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(1877.967639346 , "3fGI)@{8/Y=l");
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(boxAndWhiskerRenderer0)));
        java.lang.String string0 = categoryPlot0.getPlotType();
        org.junit.Assert.assertEquals("Category Plot", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test198() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setRangeCrosshairValue((-1310.50441));
        org.junit.Assert.assertEquals((-1310.50441), categoryPlot0.getRangeCrosshairValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test199() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        java.awt.Color color0 = ((java.awt.Color)(combinedRangeCategoryPlot0.getRangeCrosshairPaint()));
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals(0, color0.getGreen());
    }

    @org.junit.Test(timeout = 4000)
    public void test200() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        categoryPlot0.setDataset(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test201() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis();
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.LegendItemCollection legendItemCollection0 = combinedRangeXYPlot0.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test202() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("/M;U81z6/i+9pfA" , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(37, 10, ((double)(10)), 1282.011451982358, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.util.TableOrder tableOrder0 = org.jfree.chart.util.TableOrder.BY_ROW;
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)) , tableOrder0);
        javax.swing.text.DefaultCaret defaultCaret0 = new javax.swing.text.DefaultCaret();
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(spiderWebPlot0.calculateLabelLocation(defaultCaret0, 0, defaultCaret0, 2479.710177618)));
        java.awt.geom.Line2D.Float line2D_Float0 = new java.awt.geom.Line2D.Float(((java.awt.geom.Point2D)(point2D_Double0)) , ((java.awt.geom.Point2D)(point2D_Double0)));
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = ((java.awt.geom.Rectangle2D.Float)(line2D_Float0.getBounds2D()));
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(((double)(1.0F)));
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        java.util.List list0 = meterPlot0.getIntervals();
        combinedDomainCategoryPlot0.drawRangeGridlines(sunGraphics2D0, rectangle2D_Float0, list0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test203() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        double double0 = combinedDomainCategoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test204() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = combinedRangeCategoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals("RectangleEdge.LEFT", rectangleEdge0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test205() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("D");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        boolean boolean0 = combinedDomainCategoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test206() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertEquals("RectangleEdge.BOTTOM", rectangleEdge0.toString());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test207() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.util.SortOrder sortOrder0 = combinedDomainCategoryPlot0.getRowRenderingOrder();
        combinedDomainCategoryPlot0.setColumnRenderingOrder(sortOrder0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test208() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        combinedRangeCategoryPlot0.setRenderer(0, ((org.jfree.chart.renderer.category.CategoryItemRenderer)(defaultCategoryItemRenderer0)));
        combinedRangeCategoryPlot0.setRenderer(((org.jfree.chart.renderer.category.CategoryItemRenderer)(defaultCategoryItemRenderer0)), false);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeZoomable());
    }

    @org.junit.Test(timeout = 4000)
    public void test209() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(1877.967639346 , "3fGI)@{8/Y=l");
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(boxAndWhiskerRenderer0)));
        int int0 = categoryPlot0.getWeight();
        org.junit.Assert.assertEquals(0, int0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test210() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        combinedDomainCategoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test211() throws java.lang.Throwable {
        org.jfree.chart.axis.PeriodAxis periodAxis0 = new org.jfree.chart.axis.PeriodAxis("2oQd{VY*OuyfY.)E");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(periodAxis0)));
        combinedRangeCategoryPlot0.setRangeAxis(((org.jfree.chart.axis.ValueAxis)(periodAxis0)));
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getRangeAxisCount());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test212() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("Hari");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection0 = combinedDomainCategoryPlot0.getRangeMarkers(layer0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test213() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)((byte)(0))) , combinedDomainCategoryPlot0.DEFAULT_BACKGROUND_PAINT , combinedDomainCategoryPlot0.DEFAULT_CROSSHAIR_STROKE);
        combinedDomainCategoryPlot0.addDomainMarker(categoryMarker0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test214() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.setAnchorValue(441.0);
        org.junit.Assert.assertEquals(441.0, combinedDomainCategoryPlot0.getAnchorValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test216() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.chart.axis.PeriodAxis periodAxis0 = new org.jfree.chart.axis.PeriodAxis("KcG" , ((org.jfree.data.time.RegularTimePeriod)(minute0)) , ((org.jfree.data.time.RegularTimePeriod)(minute0)));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(periodAxis0)));
        combinedRangeCategoryPlot0.setFixedRangeAxisSpace(((org.jfree.chart.axis.AxisSpace)(null)));
        org.junit.Assert.assertEquals(0, combinedRangeCategoryPlot0.getWeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test217() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("* ");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        combinedDomainCategoryPlot0.setFixedDomainAxisSpace(((org.jfree.chart.axis.AxisSpace)(null)));
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test218() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test219() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        categoryPlot0.getDomainMarkers(layer0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test220() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getAxisOffset();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test222() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getAnchorValue();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test223() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test224() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(categoryPlot0.getRangeCrosshairStroke()));
        org.junit.Assert.assertEquals(0, basicStroke0.getEndCap());
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test225() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("D");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        combinedDomainCategoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test227() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double(((double)(1.0F)) , (-1407.57461282435));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        categoryPlot0.zoomDomainAxes(0.0, plotRenderingInfo0, ((java.awt.geom.Point2D)(point2D_Double0)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test228() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(1877.967639346 , "3fGI)@{8/Y=l");
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(boxAndWhiskerRenderer0)));
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.junit.Assert.assertTrue(categoryPlot0.getDrawSharedDomainAxis());
    }

    @org.junit.Test(timeout = 4000)
    public void test229() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.getDatasetCount();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test230() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getColumnRenderingOrder();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test231() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1181, 1181, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.axis.AxisSpace axisSpace0 = categoryPlot0.calculateAxisSpace(sunGraphics2D0, ((java.awt.geom.Rectangle2D)(null)));
        org.junit.Assert.assertEquals(0.0, axisSpace0.getRight(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test232() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        combinedDomainCategoryPlot0.getIndexOf(stackedBarRenderer0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test233() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        categoryPlot0.setDomainAxis(10, ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        boolean boolean0 = categoryAxis3D0.hasListener(categoryPlot0);
        org.junit.Assert.assertEquals(11, categoryPlot0.getDomainAxisCount());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test234() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(10.0);
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedRangeCategoryPlot0.getDomainAxisLocation();
        combinedRangeCategoryPlot0.setRangeAxisLocation(500, axisLocation0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }
}

