package org.jfree.chart.plot;


public class CategoryPlot_ESTest extends org.jfree.chart.plot.CategoryPlot_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(categoryPlot0)));
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        jFreeChart0.createBufferedImage(749, 10, chartRenderingInfo0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("");
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D();
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(boxAndWhiskerRenderer0)));
        categoryPlot0.zoom(0.0);
        org.junit.Assert.assertTrue(numberAxis3D0.isAutoRange());
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getRenderer(1);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("Yan Liu");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        combinedDomainCategoryPlot0.mapDatasetToRangeAxis(1, 10);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = combinedDomainCategoryPlot0.getRangeAxisEdge(1);
        org.junit.Assert.assertEquals("RectangleEdge.RIGHT", rectangleEdge0.toString());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.clearDomainAxes();
        categoryPlot0.getDomainAxis();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainCategoryPlot0.getRangeAxisLocation(3001);
        combinedDomainCategoryPlot0.setRangeAxisLocation(axisLocation0, true);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D();
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer0)));
        categoryPlot0.mapDatasetToRangeAxis(10, 15);
        org.junit.Assert.assertEquals(1.0F, categoryPlot0.getBackgroundAlpha(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(false)) , categoryPlot0.DEFAULT_BACKGROUND_PAINT , categoryPlot0.DEFAULT_OUTLINE_STROKE);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        categoryPlot0.addDomainMarker(categoryMarker0, layer0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , false , false , false , false , true);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 297, ((double)(1.0F)), (-1588.67790361), chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Area area0 = new java.awt.geom.Area();
        java.awt.Rectangle rectangle0 = area0.getBounds();
        combinedDomainCategoryPlot0.drawDomainGridlines(sunGraphics2D0, rectangle0);
        org.junit.Assert.assertFalse(chartPanel0.isDomainZoomable());
        org.junit.Assert.assertFalse(combinedDomainCategoryPlot0.isDomainGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("richard_c_atkinson@ntlworld.com");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        javax.swing.text.DefaultCaret defaultCaret0 = new javax.swing.text.DefaultCaret();
        combinedRangeCategoryPlot0.drawAnnotations(((java.awt.Graphics2D)(null)), defaultCaret0);
        org.junit.Assert.assertFalse(combinedRangeCategoryPlot0.isRangeCrosshairVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("Jnz!i|^l[T31o5E_.");
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(dateAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)));
        categoryPlot0.zoom(1.0E-8);
        org.junit.Assert.assertEquals((-5.0E-9), dateAxis0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(5.0E-9, dateAxis0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("c6(w+r4C*j9M+;0");
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(1.0E-5 , "c6(w+r4C*j9M+;0");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)) , ((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)));
        subCategoryAxis0.removeChangeListener(categoryPlot0);
        org.junit.Assert.assertEquals(1.0F, org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeGridlinesVisible());
        combinedRangeCategoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean0 = combinedRangeCategoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray0 = new org.jfree.chart.renderer.category.CategoryItemRenderer[4];
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        categoryItemRendererArray0[0] = ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0));
        categoryPlot0.setRenderers(categoryItemRendererArray0);
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D1 = ((org.jfree.chart.renderer.category.StackedBarRenderer3D)(categoryPlot0.getRenderer()));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertNotNull(stackedBarRenderer3D1);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D("1zFM,n{XSICUU>2");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)));
        numberAxis3D0.setNegativeArrowVisible(true);
        org.jfree.chart.axis.NumberAxis3D numberAxis3D1 = ((org.jfree.chart.axis.NumberAxis3D)(combinedRangeCategoryPlot0.getRangeAxisForDataset((-178))));
        org.junit.Assert.assertNotNull(numberAxis3D1);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(((double)(1.0F)));
        cyclicNumberAxis0.setTickUnit(cyclicNumberAxis0.DEFAULT_TICK_UNIT);
        combinedRangeCategoryPlot0.setRangeAxis(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis1 = ((org.jfree.chart.axis.CyclicNumberAxis)(combinedRangeCategoryPlot0.getRangeAxisForDataset((-3010))));
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getRangeAxisCount());
        org.junit.Assert.assertNotNull(cyclicNumberAxis1);
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("Yan Liu");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        combinedDomainCategoryPlot0.getRangeAxis();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("Null 'paint' argument.");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        dateAxis0.setTickLabelsVisible(false);
        org.jfree.chart.axis.DateAxis dateAxis1 = ((org.jfree.chart.axis.DateAxis)(combinedRangeCategoryPlot0.getRangeAxis()));
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertNotNull(dateAxis1);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        numberAxis0.setAutoTickUnitSelection(false);
        org.jfree.chart.axis.NumberAxis numberAxis1 = ((org.jfree.chart.axis.NumberAxis)(combinedRangeCategoryPlot0.getRangeAxis()));
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertNotNull(numberAxis1);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        int int0 = combinedRangeCategoryPlot0.getIndexOf(((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("Pie_Plot");
        combinedDomainCategoryPlot0.setDomainAxis(10, ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        int int0 = combinedDomainCategoryPlot0.getDomainAxisIndex(extendedCategoryAxis0);
        org.junit.Assert.assertEquals(11, combinedDomainCategoryPlot0.getDomainAxisCount());
        org.junit.Assert.assertEquals(10, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryPlot0.getDomainAxisIndex(categoryAxis0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = combinedDomainCategoryPlot0.getDomainAxis();
        org.junit.Assert.assertTrue(org.jfree.chart.axis.Axis.DEFAULT_AXIS_VISIBLE);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("Null 'layer' not permitted.");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        combinedDomainCategoryPlot0.setAnchorValue(2.5, true);
        double double0 = combinedDomainCategoryPlot0.getAnchorValue();
        org.junit.Assert.assertEquals(2.5, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double((-139.6) , 2346.1775643616484 , 2346.1775643616484 , 831.0);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(categoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 2544);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace0 = combinedRangeCategoryPlot0.calculateAxisSpace(sunGraphics2D0, rectangle2D_Double0);
        org.jfree.chart.axis.AxisSpace axisSpace1 = categoryPlot0.calculateRangeAxisSpace(sunGraphics2D0, rectangle2D_Double0, axisSpace0);
        org.junit.Assert.assertEquals(35.0, axisSpace1.getLeft(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-2535.4111121148) , ((double)(1.0F)) , "(Ss*7:4WH'");
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("_\"B0HpAh~}!" , cyclicNumberAxis0.DEFAULT_AXIS_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)) , false);
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 500, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX));
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.axis.AxisSpace axisSpace0 = combinedRangeXYPlot0.calculateAxisSpace(sunGraphics2D0, rectangle2D_Double0);
        combinedDomainCategoryPlot0.calculateDomainAxisSpace(sunGraphics2D0, rectangle2D_Double0, axisSpace0);
        org.junit.Assert.assertEquals(4.0, axisSpace0.getBottom(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 22, ((double)(10)), ((double)(22)), ((org.jfree.chart.ChartRenderingInfo)(null)));
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(((double)(10)) , ((double)(10)) , 223.80677 , (-984.659998378));
        org.jfree.chart.axis.AxisSpace axisSpace0 = combinedRangeCategoryPlot0.calculateAxisSpace(sunGraphics2D0, rectangle2D_Double0);
        org.junit.Assert.assertEquals(35.0, axisSpace0.getLeft(), 0.01);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        try {
            combinedDomainCategoryPlot0.addRangeMarker(((org.jfree.chart.plot.Marker)(null)), layer0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        try {
            categoryPlot0.addRangeMarker(6, ((org.jfree.chart.plot.Marker)(null)), layer0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("k?Tme48(ee{%A:l");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        combinedDomainCategoryPlot0.getDataRange(numberAxis0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        org.jfree.data.Range range0 = combinedDomainCategoryPlot0.getDataRange(((org.jfree.chart.axis.ValueAxis)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D();
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , categoryPlot0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(categoryPlot0)) , true);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(822, 1);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        javax.swing.JInternalFrame jInternalFrame0 = new javax.swing.JInternalFrame();
        java.awt.Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
        categoryPlot0.render(sunGraphics2D0, rectangle0, 500, plotRenderingInfo0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float(2.0F , 1.0F , 0.0F , 2.0F);
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(((org.jfree.chart.JFreeChart)(null)) , (-2250) , 10 , 524 , (-2250) , 4563 , 14 , true , true , false , false , true , true);
        java.awt.GridBagLayout gridBagLayout0 = new java.awt.GridBagLayout();
        java.awt.Point point0 = gridBagLayout0.location(14, 0);
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(chartPanel0.translateScreenToJava2D(point0)));
        org.jfree.chart.plot.PlotState plotState0 = new org.jfree.chart.plot.PlotState();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        categoryPlot0.draw(((java.awt.Graphics2D)(null)), rectangle2D_Float0, point2D_Double0, plotState0, plotRenderingInfo0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setRangeCrosshairValue(1783.6520369812802, true);
        combinedRangeCategoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("\n");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.clearRangeMarkers((-1360));
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(null)));
        combinedRangeCategoryPlot0.clearRangeMarkers(0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection0 = combinedDomainCategoryPlot0.getRangeMarkers(0, layer0);
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection0 = combinedDomainCategoryPlot0.getRangeMarkers(18, layer0);
        org.junit.Assert.assertNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.ValueMarker valueMarker0 = new org.jfree.chart.plot.ValueMarker(0.0);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        combinedRangeCategoryPlot0.addRangeMarker(1683, ((org.jfree.chart.plot.Marker)(valueMarker0)), layer0);
        org.junit.Assert.assertEquals(5.0, combinedRangeCategoryPlot0.getGap(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.IntervalMarker intervalMarker0 = new org.jfree.chart.plot.IntervalMarker(0.0 , 2210.29596 , combinedRangeCategoryPlot0.DEFAULT_CROSSHAIR_PAINT , combinedRangeCategoryPlot0.DEFAULT_CROSSHAIR_STROKE , combinedRangeCategoryPlot0.DEFAULT_BACKGROUND_PAINT , combinedRangeCategoryPlot0.DEFAULT_OUTLINE_STROKE , 0.0F);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        combinedRangeCategoryPlot0.addRangeMarker(0, ((org.jfree.chart.plot.Marker)(intervalMarker0)), layer0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D("Last");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection0 = combinedRangeCategoryPlot0.getDomainMarkers(10, layer0);
        org.junit.Assert.assertNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(false)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        categoryPlot0.addDomainMarker(2203, categoryMarker0, layer0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(622.7562008537931 , "/4|Q");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent0 = new org.jfree.data.general.DatasetChangeEvent(((java.lang.Object)("/4|Q")) , ((org.jfree.data.general.Dataset)(null)));
        combinedRangeCategoryPlot0.datasetChanged(datasetChangeEvent0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.data.general.CombinedDataset combinedDataset0 = new org.jfree.data.general.CombinedDataset();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent0 = new org.jfree.data.general.DatasetChangeEvent(((java.lang.Object)("\'4m1jF(yB\"M>w*S")) , ((org.jfree.data.general.Dataset)(combinedDataset0)));
        combinedDomainCategoryPlot0.datasetChanged(datasetChangeEvent0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection0 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNotNull(legendItemCollection0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        combinedRangeCategoryPlot0.setDataset(1279, ((org.jfree.data.category.CategoryDataset)(defaultBoxAndWhiskerCategoryDataset0)));
        combinedRangeCategoryPlot0.getRendererForDataset(defaultBoxAndWhiskerCategoryDataset0);
        org.junit.Assert.assertEquals(1280, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        combinedDomainCategoryPlot0.setRenderer(10, ((org.jfree.chart.renderer.category.CategoryItemRenderer)(barRenderer3D0)), true);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setRenderer(1, ((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)), false);
        org.junit.Assert.assertEquals(0.0, combinedRangeCategoryPlot0.getRangeCrosshairValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer0 = combinedDomainCategoryPlot0.getRenderer((-1226));
        org.junit.Assert.assertNull(categoryItemRenderer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D();
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer0)));
        org.jfree.chart.axis.NumberAxis3D numberAxis3D1 = ((org.jfree.chart.axis.NumberAxis3D)(categoryPlot0.getRangeAxisForDataset(0)));
        org.junit.Assert.assertFalse(numberAxis3D1.isInverted());
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("k?Tme48(ee{%A:l");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = combinedDomainCategoryPlot0.getDomainAxisForDataset(0);
        org.junit.Assert.assertNotNull(categoryAxis1);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(622.7562008537931 , "/4|Q");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        combinedRangeCategoryPlot0.getDataset(0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.configureRangeAxes();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainXYPlot0.getDomainAxisLocation((-343));
        categoryPlot0.setRangeAxisLocation(1, axisLocation0, false);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("CategoryItemEntity: rowKey=");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainXYPlot0.getDomainAxisLocation(10);
        combinedDomainCategoryPlot0.setRangeAxisLocation(0, axisLocation0, true);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getRangeAxisLocation(0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(((double)(1.0F)) , 162.527);
        combinedDomainCategoryPlot0.setRangeAxis(0, ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)), false);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(989.57667 , "G{O{KE]SZYzoV6).");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        combinedRangeCategoryPlot0.setRangeAxis(0, ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)), true);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getRangeAxis(91);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getRangeAxis(0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.configureDomainAxes();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        combinedRangeCategoryPlot0.configureDomainAxes();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDomainAxisEdge(2203);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainCategoryPlot0.getRangeAxisLocation(2);
        combinedDomainCategoryPlot0.setDomainAxisLocation(2, axisLocation0, false);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedRangeCategoryPlot0.getRangeAxisLocation();
        combinedRangeCategoryPlot0.setDomainAxisLocation(43, axisLocation0, true);
        org.junit.Assert.assertEquals("AxisLocation.TOP_OR_LEFT", axisLocation0.toString());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        combinedRangeCategoryPlot0.getDomainAxisLocation(0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        combinedRangeCategoryPlot0.setDomainAxis(2, ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)), true);
        org.junit.Assert.assertEquals(3, combinedRangeCategoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)(null)));
        combinedRangeCategoryPlot0.setDomainAxis(0, categoryAxis0, false);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDomainAxisCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        combinedRangeCategoryPlot0.getDomainAxis(0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.FastScatterPlot fastScatterPlot0 = new org.jfree.chart.plot.FastScatterPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = fastScatterPlot0.getOrientation();
        categoryPlot0.setOrientation(plotOrientation0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("The renderer has changed and I don't know what to do!");
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("The renderer has changed and I don't know what to do!");
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(dateAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(ganttRenderer0)));
        org.junit.Assert.assertFalse(categoryPlot0.isSubplot());
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setWeight((-296));
        int int0 = combinedRangeCategoryPlot0.getWeight();
        org.junit.Assert.assertEquals((-296), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(null)) , ((org.jfree.chart.axis.ValueAxis)(null)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)));
        categoryPlot0.setDomainAxis(((org.jfree.chart.axis.CategoryAxis)(null)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainCategoryPlot0.getDomainAxisLocation((-1));
        combinedDomainCategoryPlot0.setDomainAxisLocation(axisLocation0, false);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset0 = combinedRangeCategoryPlot0.getDataset();
        org.junit.Assert.assertNull(categoryDataset0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("\n");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        boolean boolean0 = combinedDomainCategoryPlot0.isDomainZoomable();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.mapDatasetToDomainAxis(0, 0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isOutlineVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D("Last");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)));
        boolean boolean0 = combinedRangeCategoryPlot0.isRangeZoomable();
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = categoryPlot0.getOrientation();
        org.junit.Assert.assertEquals("PlotOrientation.VERTICAL", plotOrientation0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(989.57667 , "G{O{KE]SZYzoV6).");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        combinedRangeCategoryPlot0.getRenderer();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getAnnotations();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = combinedDomainCategoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertEquals("RectangleEdge.BOTTOM", rectangleEdge0.toString());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder0 = categoryPlot0.getDatasetRenderingOrder();
        org.junit.Assert.assertEquals("DatasetRenderingOrder.REVERSE", datasetRenderingOrder0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = categoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertEquals("RectangleEdge.LEFT", rectangleEdge0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D("Last");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)));
        java.awt.Color color0 = ((java.awt.Color)(combinedRangeCategoryPlot0.getRangeGridlinePaint()));
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals(192, color0.getGreen());
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.AxisSpace axisSpace0 = combinedDomainCategoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNull(axisSpace0);
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("k?Tme48(ee{%A:l");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        combinedDomainCategoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getRangeGridlineStroke();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        org.jfree.chart.axis.PeriodAxis periodAxis0 = new org.jfree.chart.axis.PeriodAxis("Null 'layer' not permitted.");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(periodAxis0)));
        combinedRangeCategoryPlot0.setRangeAxis(500, ((org.jfree.chart.axis.ValueAxis)(periodAxis0)));
        org.junit.Assert.assertEquals(501, combinedRangeCategoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("");
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(2696.77903379716);
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer0)));
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis1 = ((org.jfree.chart.axis.CyclicNumberAxis)(categoryPlot0.getRangeAxis()));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertNotNull(cyclicNumberAxis1);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot1 = ((org.jfree.chart.plot.CombinedRangeCategoryPlot)(combinedRangeCategoryPlot0.clone()));
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot1.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot1.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = ((org.jfree.chart.plot.CategoryPlot)(categoryPlot0.clone()));
        int int0 = categoryPlot1.getDomainAxisCount();
        org.junit.Assert.assertTrue(categoryPlot1.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot1 = ((org.jfree.chart.plot.CombinedDomainCategoryPlot)(combinedDomainCategoryPlot0.clone()));
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedDomainXYPlot0.getRangeAxisLocation();
        combinedDomainCategoryPlot0.setDomainAxisLocation(42, axisLocation0);
        combinedDomainCategoryPlot1.clearRangeMarkers();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot1.getDatasetCount());
        org.junit.Assert.assertEquals(0, combinedDomainCategoryPlot1.getRangeAxisCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot1.equals(((java.lang.Object)(combinedDomainCategoryPlot0))));
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot1.getDomainAxisCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot1.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        byte[] byteArray0 = new byte[4];
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0 , 0 , (-1));
        boolean boolean0 = categoryPlot0.equals(byteArrayInputStream0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot1 = ((org.jfree.chart.plot.CombinedDomainCategoryPlot)(combinedDomainCategoryPlot0.clone()));
        combinedDomainCategoryPlot1.clearRangeMarkers();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot1.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.equals(((java.lang.Object)(combinedDomainCategoryPlot1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.setAnchorValue(1.0E-8, false);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test121() throws java.lang.Throwable {
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(989.57667 , "G{O{KE]SZYzoV6).");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("G{O{KE]SZYzoV6)." , cyclicNumberAxis0.DEFAULT_TICK_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)) , false);
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        combinedRangeCategoryPlot0.setRangeAxis(232, ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)), true);
        combinedRangeCategoryPlot0.zoomRangeAxes(2.0, 2.0, plotRenderingInfo0, ((java.awt.geom.Point2D)(point2D_Double0)));
        org.junit.Assert.assertFalse(cyclicNumberAxis0.isAutoRange());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeZoomable());
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(989.57667 , "G{O{KE]SZYzoV6).");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("G{O{KE]SZYzoV6)." , cyclicNumberAxis0.DEFAULT_TICK_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)) , false);
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        combinedRangeCategoryPlot0.zoomRangeAxes(2.0, 2.0, plotRenderingInfo0, ((java.awt.geom.Point2D)(point2D_Double0)));
        combinedRangeCategoryPlot0.getRangeAxis();
        org.junit.Assert.assertEquals(1.05, cyclicNumberAxis0.getPeriod(), 0.01);
        org.junit.Assert.assertFalse(cyclicNumberAxis0.isAutoRange());
    }

    @org.junit.Test(timeout = 4000)
    public void test123() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double();
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        categoryPlot0.zoomRangeAxes((-908.5698), plotRenderingInfo0, ((java.awt.geom.Point2D)(point2D_Double0)));
        org.junit.Assert.assertEquals(1.0F, org.jfree.chart.plot.Plot.DEFAULT_FOREGROUND_ALPHA, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test124() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D();
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer0)));
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double();
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        categoryPlot0.zoomRangeAxes(((double)(10)), plotRenderingInfo0, ((java.awt.geom.Point2D)(point2D_Double0)));
        categoryPlot0.getRangeAxisForDataset(500);
        org.junit.Assert.assertEquals((-4.725), numberAxis3D0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(5.775, numberAxis3D0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test125() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.PeriodAxis periodAxis0 = new org.jfree.chart.axis.PeriodAxis("Null 'item' argument.");
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultBoxAndWhiskerCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(periodAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(lineRenderer3D0)));
        categoryPlot0.setDataset(500, ((org.jfree.data.category.CategoryDataset)(defaultBoxAndWhiskerCategoryDataset0)));
        org.junit.Assert.assertEquals(0.0, periodAxis0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test126() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryPlot0.getCategoriesForAxis(categoryAxis0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test127() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.SystemColor systemColor0 = java.awt.SystemColor.inactiveCaptionText;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(((double)(10)) , ((double)(10)) , 0.001 , ((double)(1)));
        org.jfree.chart.axis.PeriodAxis periodAxis0 = new org.jfree.chart.axis.PeriodAxis("Null 'order' argument.");
        categoryPlot0.drawRangeCrosshair(((java.awt.Graphics2D)(null)), rectangle2D_Double0, ((org.jfree.chart.plot.PlotOrientation)(null)), 1.0F, periodAxis0, combinedDomainXYPlot0.DEFAULT_GRIDLINE_STROKE, systemColor0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test128() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("");
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(2696.77903379716);
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(categoryPlot0)));
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(((int)((short)(1136))), ((int)((short)(1101))), ((double)((short)(500))), 0.6428571428571429, chartRenderingInfo0);
        org.junit.Assert.assertEquals(1, bufferedImage0.getNumXTiles());
    }

    @org.junit.Test(timeout = 4000)
    public void test129() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-2535.4111121148) , ((double)(1.0F)) , "(Ss*7:4WH'");
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("(Ss*7:4WH'" , cyclicNumberAxis0.DEFAULT_TICK_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)) , true);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1, 500);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float();
        org.jfree.chart.axis.AxisSpace axisSpace0 = combinedDomainCategoryPlot0.calculateDomainAxisSpace(sunGraphics2D0, rectangle2D_Float0, ((org.jfree.chart.axis.AxisSpace)(null)));
        org.junit.Assert.assertEquals(4.0, axisSpace0.getBottom(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test130() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        categoryPlot0.calculateDomainAxisSpace(((java.awt.Graphics2D)(null)), rectangle2D_Double0, ((org.jfree.chart.axis.AxisSpace)(null)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test131() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.annotations.CategoryPointerAnnotation categoryPointerAnnotation0 = new org.jfree.chart.annotations.CategoryPointerAnnotation("[FY)}K';eq8$TC6(_" , ((java.lang.Comparable)(10)) , 4524.1162 , (-2362.194006083));
        combinedDomainCategoryPlot0.addAnnotation(categoryPointerAnnotation0);
        boolean boolean0 = combinedDomainCategoryPlot0.removeAnnotation(categoryPointerAnnotation0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test133() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.annotations.CategoryPointerAnnotation categoryPointerAnnotation0 = new org.jfree.chart.annotations.CategoryPointerAnnotation("" , ((java.lang.Comparable)(true)) , ((double)(1.0F)) , ((double)(10)));
        combinedDomainCategoryPlot0.removeAnnotation(categoryPointerAnnotation0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test135() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("Jnz!i|^l[T31o5E_.");
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(dateAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(null)));
        categoryPlot0.setRangeCrosshairPaint(categoryAxis3D0.DEFAULT_TICK_MARK_PAINT);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test137() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(combinedDomainXYPlot0.getRangeCrosshairStroke()));
        combinedDomainCategoryPlot0.setRangeCrosshairStroke(basicStroke0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test138() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("\n");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.setRangeCrosshairVisible(true);
        combinedDomainCategoryPlot0.setRangeCrosshairValue(0.2, false);
        org.junit.Assert.assertEquals(0.2, combinedDomainCategoryPlot0.getRangeCrosshairValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test139() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertFalse(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test140() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        combinedDomainCategoryPlot0.setRangeCrosshairLockedOnData(true);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test141() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("\n");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        combinedDomainCategoryPlot0.setRangeCrosshairVisible(true);
        combinedDomainCategoryPlot0.setRangeCrosshairValue((-2701.41712), true);
        org.junit.Assert.assertEquals((-2701.41712), combinedDomainCategoryPlot0.getRangeCrosshairValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test142() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setRangeCrosshairVisible(false);
        org.junit.Assert.assertFalse(combinedRangeCategoryPlot0.isDomainZoomable());
    }

    @org.junit.Test(timeout = 4000)
    public void test143() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getRangeMarkers((-2737), ((org.jfree.chart.util.Layer)(null)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test144() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection0 = categoryPlot0.getRangeMarkers(layer0);
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test145() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.FastScatterPlot fastScatterPlot0 = new org.jfree.chart.plot.FastScatterPlot();
        org.jfree.chart.plot.IntervalMarker intervalMarker0 = new org.jfree.chart.plot.IntervalMarker(0.04 , ((double)(1.0F)) , fastScatterPlot0.DEFAULT_OUTLINE_PAINT , fastScatterPlot0.DEFAULT_GRIDLINE_STROKE , combinedRangeCategoryPlot0.DEFAULT_OUTLINE_PAINT , combinedRangeCategoryPlot0.DEFAULT_GRIDLINE_STROKE , 1.0F);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        combinedRangeCategoryPlot0.addRangeMarker(1742, ((org.jfree.chart.plot.Marker)(intervalMarker0)), layer0);
        combinedRangeCategoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertFalse(combinedRangeCategoryPlot0.isDomainGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test146() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.ValueMarker valueMarker0 = new org.jfree.chart.plot.ValueMarker(((double)(10)) , categoryPlot0.DEFAULT_CROSSHAIR_PAINT , categoryPlot0.DEFAULT_CROSSHAIR_STROKE , categoryPlot0.DEFAULT_CROSSHAIR_PAINT , categoryPlot0.DEFAULT_CROSSHAIR_STROKE , 1.0F);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        categoryPlot0.addRangeMarker(((org.jfree.chart.plot.Marker)(valueMarker0)), layer0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test147() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.clearDomainMarkers((-1341));
        org.junit.Assert.assertFalse(org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_VISIBLE);
    }

    @org.junit.Test(timeout = 4000)
    public void test148() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        java.util.Collection collection0 = combinedDomainCategoryPlot0.getDomainMarkers(3740, ((org.jfree.chart.util.Layer)(null)));
        org.junit.Assert.assertNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test149() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        combinedDomainCategoryPlot0.getDomainMarkers((-3), layer0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test150() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test151() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(day0)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        combinedDomainCategoryPlot0.addDomainMarker((-4504), categoryMarker0, layer0);
        org.junit.Assert.assertFalse(combinedDomainCategoryPlot0.isDomainZoomable());
    }

    @org.junit.Test(timeout = 4000)
    public void test154() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent0 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)(categoryPlot0)));
        categoryPlot0.rendererChanged(rendererChangeEvent0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test156() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.zoom((-995.72223225));
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test157() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
        categoryPlot0.handleClick((-347), (-2299), plotRenderingInfo0);
        org.junit.Assert.assertEquals(1.0F, org.jfree.chart.plot.Plot.DEFAULT_FOREGROUND_ALPHA, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test159() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot();
        java.awt.Color color0 = ((java.awt.Color)(meterPlot0.getTickLabelPaint()));
        combinedRangeCategoryPlot0.setRangeGridlinePaint(color0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test161() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.setRangeGridlineStroke(combinedDomainCategoryPlot0.DEFAULT_CROSSHAIR_STROKE);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test162() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test164() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.setDomainGridlinePaint(combinedDomainCategoryPlot0.DEFAULT_CROSSHAIR_PAINT);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test166() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D();
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer0)));
        org.jfree.chart.renderer.xy.CandlestickRenderer candlestickRenderer0 = new org.jfree.chart.renderer.xy.CandlestickRenderer(((double)(10)));
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(candlestickRenderer0.getBaseStroke()));
        categoryPlot0.setDomainGridlineStroke(basicStroke0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test168() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        org.jfree.chart.axis.CategoryAnchor categoryAnchor0 = org.jfree.chart.axis.CategoryAnchor.END;
        combinedDomainCategoryPlot0.setDomainGridlinePosition(categoryAnchor0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test169() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.setDomainGridlinesVisible(true);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isDomainGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test170() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.setDomainGridlinesVisible(false);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test172() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder0 = org.jfree.chart.util.SortOrder.ASCENDING;
        categoryPlot0.setRowRenderingOrder(sortOrder0);
        org.junit.Assert.assertTrue(org.jfree.chart.plot.CategoryPlot.DEFAULT_RANGE_GRIDLINES_VISIBLE);
    }

    @org.junit.Test(timeout = 4000)
    public void test174() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.SortOrder sortOrder0 = org.jfree.chart.util.SortOrder.DESCENDING;
        categoryPlot0.setColumnRenderingOrder(sortOrder0);
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test176() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder0 = org.jfree.chart.plot.DatasetRenderingOrder.FORWARD;
        combinedDomainCategoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test177() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("Null 'paint' argument.");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        combinedRangeCategoryPlot0.getRendererForDataset(taskSeriesCollection0);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test178() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getRangeAxisForDataset(749);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test179() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        combinedDomainCategoryPlot0.getDomainAxisForDataset(2958465);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test180() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(null)));
        combinedRangeCategoryPlot0.setDataset(1037, ((org.jfree.data.category.CategoryDataset)(null)));
        org.junit.Assert.assertEquals(1038, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test181() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        combinedRangeCategoryPlot0.getDataset(35);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test182() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.clearRangeAxes();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test184() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        categoryPlot0.setRangeAxis(1330, ((org.jfree.chart.axis.ValueAxis)(numberAxis0)), true);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 'annotation' argument." , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2396, 2515);
        org.junit.Assert.assertEquals(0, bufferedImage0.getMinX());
    }

    @org.junit.Test(timeout = 4000)
    public void test185() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray0 = new org.jfree.chart.axis.ValueAxis[4];
        combinedDomainCategoryPlot0.setRangeAxes(valueAxisArray0);
        org.junit.Assert.assertEquals(4, combinedDomainCategoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test187() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        combinedDomainCategoryPlot0.clearRangeAxes();
        combinedDomainCategoryPlot0.getDataRange(((org.jfree.chart.axis.ValueAxis)(null)));
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test188() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("Pie_Plot");
        combinedDomainCategoryPlot0.setDomainAxis(10, ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        org.junit.Assert.assertEquals(11, combinedDomainCategoryPlot0.getDomainAxisCount());
        combinedDomainCategoryPlot0.clearDomainAxes();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test190() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedRangeCategoryPlot0.getDomainAxisLocation(1);
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals("AxisLocation.TOP_OR_RIGHT", axisLocation0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test191() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray0 = new org.jfree.chart.axis.CategoryAxis[3];
        combinedDomainCategoryPlot0.setDomainAxes(categoryAxisArray0);
        org.junit.Assert.assertEquals(3, combinedDomainCategoryPlot0.getDomainAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test192() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getDomainAxis(812);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test194() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)(null)));
        combinedRangeCategoryPlot0.setAxisOffset(categoryAxis0.DEFAULT_TICK_LABEL_INSETS);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test196() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(combinedDomainCategoryPlot0.getDomainGridlineStroke()));
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals(2, basicStroke0.getLineJoin());
    }

    @org.junit.Test(timeout = 4000)
    public void test197() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getDomainGridlinePosition();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test198() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("k?Tme48(ee{%A:l");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        int int0 = combinedDomainCategoryPlot0.getDomainAxisIndex(categoryAxis0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test199() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("Null 'layer' not permitted.");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        combinedDomainCategoryPlot0.setRenderer(((org.jfree.chart.renderer.category.CategoryItemRenderer)(lineAndShapeRenderer0)), true);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray0 = new org.jfree.chart.renderer.category.CategoryItemRenderer[2];
        combinedDomainCategoryPlot0.setRenderers(categoryItemRendererArray0);
        org.junit.Assert.assertFalse(org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_VISIBLE);
    }

    @org.junit.Test(timeout = 4000)
    public void test200() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        combinedDomainCategoryPlot0.clearAnnotations();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test201() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getCategories();
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test202() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean0 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test203() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)));
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double();
        combinedRangeCategoryPlot0.zoomDomainAxes((-1.0), 522.982789168747, ((org.jfree.chart.plot.PlotRenderingInfo)(null)), ((java.awt.geom.Point2D)(point2D_Double0)));
        org.junit.Assert.assertEquals(0.0, combinedRangeCategoryPlot0.getAnchorValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test204() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.addChangeListener(((org.jfree.chart.event.PlotChangeListener)(null)));
        byte[] byteArray0 = new byte[0];
        try {
            combinedDomainCategoryPlot0.add(((org.jfree.chart.plot.CategoryPlot)(combinedDomainCategoryPlot0)), 15);
            org.junit.Assert.fail("Expecting exception: StackOverflowError");
        } catch (java.lang.StackOverflowError e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test205() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Color color0 = ((java.awt.Color)(categoryPlot0.getDomainGridlinePaint()));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertEquals(192, color0.getRed());
    }

    @org.junit.Test(timeout = 4000)
    public void test206() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getPlotType();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test207() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setRangeCrosshairValue(0.1);
        org.junit.Assert.assertEquals(0.1, combinedRangeCategoryPlot0.getRangeCrosshairValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test208() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        categoryPlot0.setDataset(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test209() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection0 = combinedRangeCategoryPlot0.getLegendItems();
        combinedRangeCategoryPlot0.setFixedLegendItems(legendItemCollection0);
        org.junit.Assert.assertEquals(5.0, combinedRangeCategoryPlot0.getGap(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test210() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test211() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset();
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        combinedRangeCategoryPlot0.setRenderer(((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.junit.Assert.assertEquals(0.0, stackedBarRenderer3D0.getMinimumBarLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test212() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test213() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        categoryPlot0.setRenderer(64, ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer3D0)));
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test214() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        int int0 = combinedDomainCategoryPlot0.getWeight();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test215() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 'annotation' argument." , combinedDomainCategoryPlot0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)) , true);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 848.9849096022, 3959.258923693568, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double((-2666.532) , 3.0 , (-887.5881) , ((double)(0.5F)));
        java.awt.Rectangle rectangle0 = rectangle2D_Double0.getBounds();
        combinedDomainCategoryPlot0.drawBackground(sunGraphics2D0, rectangle0);
        org.junit.Assert.assertEquals(0, rectangle0.x);
    }

    @org.junit.Test(timeout = 4000)
    public void test216() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int0 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test217() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        combinedDomainCategoryPlot0.getRangeMarkers(layer0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test218() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D();
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer0)));
        org.jfree.chart.renderer.xy.CandlestickRenderer candlestickRenderer0 = new org.jfree.chart.renderer.xy.CandlestickRenderer(((double)(10)));
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(candlestickRenderer0.getBaseStroke()));
        java.awt.Color color0 = ((java.awt.Color)(categoryPlot0.getRangeCrosshairPaint()));
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(1.0F)) , categoryAxis3D0.DEFAULT_TICK_LABEL_PAINT , ((java.awt.Stroke)(basicStroke0)) , ((java.awt.Paint)(color0)) , categoryPlot0.DEFAULT_GRIDLINE_STROKE , 0.1F);
        categoryPlot0.addDomainMarker(categoryMarker0);
        org.junit.Assert.assertEquals(1.0F, categoryPlot0.getBackgroundAlpha(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test219() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        combinedRangeCategoryPlot0.setAnchorValue(0.05);
        org.junit.Assert.assertEquals(0.05, combinedRangeCategoryPlot0.getAnchorValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test220() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT;
        combinedDomainCategoryPlot0.setDomainAxisLocation(axisLocation0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test221() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        combinedDomainCategoryPlot0.setFixedRangeAxisSpace(((org.jfree.chart.axis.AxisSpace)(null)));
        org.junit.Assert.assertEquals(15, combinedDomainCategoryPlot0.getBackgroundImageAlignment());
    }

    @org.junit.Test(timeout = 4000)
    public void test222() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.setFixedDomainAxisSpace(((org.jfree.chart.axis.AxisSpace)(null)));
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test223() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test224() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        combinedRangeCategoryPlot0.getDomainMarkers(layer0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test225() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = categoryPlot0.getAxisOffset();
        org.junit.Assert.assertEquals(0.0, rectangleInsets0.getLeft(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test226() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = categoryPlot0.getRangeAxisLocation((-3605));
        categoryPlot0.setRangeAxisLocation(axisLocation0);
        org.junit.Assert.assertEquals(1.0F, org.jfree.chart.plot.Plot.DEFAULT_FOREGROUND_ALPHA, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test227() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("");
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D();
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer0)));
        double double0 = categoryPlot0.getAnchorValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test228() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test229() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset();
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(3.0)) , numberAxis0.DEFAULT_AXIS_LINE_PAINT , combinedRangeCategoryPlot0.DEFAULT_OUTLINE_STROKE , numberAxis0.DEFAULT_AXIS_LABEL_PAINT , stackedBarRenderer3D0.DEFAULT_STROKE , 0.0F);
        combinedRangeCategoryPlot0.addRangeMarker(((org.jfree.chart.plot.Marker)(categoryMarker0)));
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test230() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        combinedDomainCategoryPlot0.getRangeCrosshairStroke();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test231() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float();
        java.util.List list0 = combinedDomainCategoryPlot0.getCategoriesForAxis(((org.jfree.chart.axis.CategoryAxis)(null)));
        combinedDomainCategoryPlot0.drawRangeGridlines(((java.awt.Graphics2D)(null)), rectangle2D_Float0, list0);
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test232() throws java.lang.Throwable {
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("Yan Liu");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        java.awt.geom.Arc2D.Double arc2D_Double0 = new java.awt.geom.Arc2D.Double();
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(arc2D_Double0.getEndPoint()));
        combinedDomainCategoryPlot0.zoomDomainAxes(1505.97194871, ((org.jfree.chart.plot.PlotRenderingInfo)(null)), ((java.awt.geom.Point2D)(point2D_Double0)));
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test233() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        combinedRangeCategoryPlot0.setDrawSharedDomainAxis(true);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.getDrawSharedDomainAxis());
    }

    @org.junit.Test(timeout = 4000)
    public void test234() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(null)));
        combinedDomainCategoryPlot0.getDatasetCount();
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test235() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.getColumnRenderingOrder();
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test237() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.AreaRenderer areaRenderer0 = new org.jfree.chart.renderer.category.AreaRenderer();
        categoryPlot0.getIndexOf(areaRenderer0);
        org.junit.Assert.assertEquals(1, categoryPlot0.getDatasetCount());
        org.junit.Assert.assertTrue(categoryPlot0.isRangeCrosshairLockedOnData());
    }

    @org.junit.Test(timeout = 4000)
    public void test238() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot1 = ((org.jfree.chart.plot.CombinedDomainCategoryPlot)(combinedDomainCategoryPlot0.clone()));
        org.junit.Assert.assertTrue(combinedDomainCategoryPlot1.equals(((java.lang.Object)(combinedDomainCategoryPlot0))));
        combinedDomainCategoryPlot1.setOutlinePaint(combinedDomainCategoryPlot0.DEFAULT_GRIDLINE_PAINT);
        combinedDomainCategoryPlot1.clearRangeMarkers();
        org.junit.Assert.assertFalse(combinedDomainCategoryPlot1.equals(((java.lang.Object)(combinedDomainCategoryPlot0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test239() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation0 = combinedRangeCategoryPlot0.getDomainAxisLocation();
        combinedRangeCategoryPlot0.setRangeAxisLocation(10, axisLocation0);
        org.junit.Assert.assertTrue(combinedRangeCategoryPlot0.isRangeCrosshairLockedOnData());
        org.junit.Assert.assertEquals(1, combinedRangeCategoryPlot0.getDatasetCount());
    }
}

