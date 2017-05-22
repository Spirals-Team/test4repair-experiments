package org.jfree.chart;


public class JFreeChart_ESTest extends org.jfree.chart.JFreeChart_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , 15 , 18 , 15 , 15 , (-220) , (-220) , false , false , false , true , true , true);
        jFreeChart0.addProgressListener(chartPanel0);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(680, 10);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(10, bufferedImage0.getHeight());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(680, bufferedImage0.getTileWidth());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , false , false , false , false , false);
        jFreeChart0.addChangeListener(chartPanel0);
        jFreeChart0.setBackgroundPaint(multiplePiePlot0.DEFAULT_OUTLINE_PAINT);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 1, (-1198.9005470341647), ((double)(1)), ((org.jfree.chart.ChartRenderingInfo)(null)));
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(10, bufferedImage0.getWidth());
        org.junit.Assert.assertEquals(1, bufferedImage0.getHeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(";^[D#Ke$|O?sAU" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        jFreeChart0.setBackgroundPaint(categoryPlot0.DEFAULT_OUTLINE_PAINT);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        org.junit.Assert.assertEquals(1, standardEntityCollection0.getEntityCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultMultiValueCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBackgroundImageAlpha(0.0F);
        org.junit.Assert.assertEquals(0.0F, jFreeChart0.getBackgroundImageAlpha(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(1725.8572);
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 't' argument." , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.setBackgroundImageAlpha(1.0F);
        float float0 = jFreeChart0.getBackgroundImageAlpha();
        org.junit.Assert.assertEquals(1.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("F~JaP]CVJ1Z" , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        jFreeChart0.setBackgroundImageAlignment(411);
        jFreeChart0.setBackgroundImageAlignment(1);
        org.junit.Assert.assertEquals(1, jFreeChart0.getBackgroundImageAlignment());
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(2.0);
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("%" , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend((-1));
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertNull(legendTitle0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 'name' argument." , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        org.jfree.chart.event.ChartProgressEvent chartProgressEvent0 = new org.jfree.chart.event.ChartProgressEvent(((java.lang.Object)(combinedRangeCategoryPlot0)) , jFreeChart0 , 0 , 1);
        jFreeChart0.notifyListeners(chartProgressEvent0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 'name' argument." , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        org.jfree.chart.event.ChartChangeEvent chartChangeEvent0 = new org.jfree.chart.event.ChartChangeEvent(((java.lang.Object)(combinedRangeCategoryPlot0)));
        jFreeChart0.notifyListeners(chartChangeEvent0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("F~JaP]CVJ1Z" , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(null)));
        jFreeChart0.handleClick(10, 22, chartRenderingInfo0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(0.18 , 0.18 , 0.18 , 7.0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 5486);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle2D_Double0)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(5486, bufferedImage0.getTileHeight());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(10, bufferedImage0.getWidth());
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(piePlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = new org.jfree.chart.title.LegendTitle(((org.jfree.chart.LegendItemSource)(piePlot0)));
        jFreeChart0.addLegend(legendTitle0);
        org.junit.Assert.assertEquals(2, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(piePlot0)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        jFreeChart0.setBorderVisible(true);
        boolean boolean0 = jFreeChart0.isBorderVisible();
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        org.jfree.chart.axis.LogAxis logAxis0 = new org.jfree.chart.axis.LogAxis("");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(logAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        combinedDomainXYPlot0.setRangeCrosshairVisible(true);
        jFreeChart0.getXYPlot();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        combinedRangeXYPlot0.setRangeCrosshairValue(3664.48912927, true);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.getXYPlot();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        org.jfree.chart.axis.LogAxis logAxis0 = new org.jfree.chart.axis.LogAxis("");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(logAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        jFreeChart0.getTitle();
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.util.List list0 = jFreeChart0.getSubtitles();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, list0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        int int0 = jFreeChart0.getSubtitleCount();
        org.junit.Assert.assertEquals(0, int0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(0 , 1900);
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer0 = new org.jfree.chart.renderer.WaferMapRenderer();
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0 , waferMapRenderer0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        waferMapPlot0.setForegroundAlpha(0);
        jFreeChart0.getPlot();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(1900 , 0 , 20);
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer0 = new org.jfree.chart.renderer.WaferMapRenderer();
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0 , waferMapRenderer0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        waferMapPlot0.setForegroundAlpha((-2146175467));
        jFreeChart0.getPlot();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(1900 , 0 , 20);
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer0 = new org.jfree.chart.renderer.WaferMapRenderer();
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0 , waferMapRenderer0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        waferMapPlot0.setBackgroundImageAlignment(0);
        jFreeChart0.getPlot();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertNotNull(legendTitle0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(logarithmicAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("*NHZc:" , logarithmicAxis0.DEFAULT_AXIS_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)) , true);
        jFreeChart0.getCategoryPlot();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.Color color0 = ((java.awt.Color)(jFreeChart0.getBackgroundPaint()));
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertNull(color0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBackgroundImageAlignment((-4332));
        int int0 = jFreeChart0.getBackgroundImageAlignment();
        org.junit.Assert.assertEquals((-4332), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        org.jfree.chart.title.DateTitle dateTitle0 = new org.jfree.chart.title.DateTitle();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(544, 420);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        jFreeChart0.drawTitle(dateTitle0, sunGraphics2D0, rectangle2D_Double0, false);
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertEquals(544, bufferedImage0.getTileWidth());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(420, bufferedImage0.getHeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        boolean boolean0 = jFreeChart0.equals(jFreeChart0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(((org.jfree.chart.JFreeChart)(null)));
        jFreeChart0.addProgressListener(chartPanel0);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset();
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(compassPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 1834.0, (-2698.4325), chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , 408 , 15 , 1698 , 356 , 408 , (-2706) , true , true , true , true , true , false);
        java.awt.Point point0 = chartPanel0.getLocation();
        try {
            jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(null)), ((java.awt.geom.Point2D)(point0)), chartRenderingInfo0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setNotify(true);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(";^[D#Ke$|O?sAU" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        jFreeChart0.setNotify(false);
        org.junit.Assert.assertFalse(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(";^[D#Ke$|O?sAU" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        jFreeChart0.setBackgroundPaint(categoryPlot0.DEFAULT_BACKGROUND_PAINT);
        jFreeChart0.setBackgroundPaint(categoryPlot0.DEFAULT_OUTLINE_PAINT);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        jFreeChart0.clearSubtitles();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(1900 , 0 , 20);
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer0 = new org.jfree.chart.renderer.WaferMapRenderer(1900 , 0);
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0 , waferMapRenderer0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertNotNull(legendTitle0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(1725.8572);
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 't' argument." , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        int int0 = jFreeChart0.getSubtitleCount();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, int0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        boolean boolean0 = jFreeChart0.isBorderVisible();
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("6,C XIMk}g2L");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.title.LegendTitle legendTitle0 = new org.jfree.chart.title.LegendTitle(((org.jfree.chart.LegendItemSource)(combinedDomainCategoryPlot0)) , ((org.jfree.chart.block.Arrangement)(borderArrangement0)) , ((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent0 = new org.jfree.chart.event.TitleChangeEvent(((org.jfree.chart.title.Title)(legendTitle0)));
        jFreeChart0.titleChanged(titleChangeEvent0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(null)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(multiplePiePlot0)));
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent0 = new org.jfree.chart.event.PlotChangeEvent(((org.jfree.chart.plot.Plot)(multiplePiePlot0)));
        jFreeChart0.plotChanged(plotChangeEvent0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(2.0);
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("%" , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        java.awt.Color color0 = ((java.awt.Color)(jFreeChart0.getBorderPaint()));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertEquals((-16777216), color0.getRGB());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("");
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        org.jfree.chart.renderer.category.IntervalBarRenderer intervalBarRenderer0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(intervalBarRenderer0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((java.lang.String)(null)) , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        org.jfree.chart.renderer.xy.XYBlockRenderer xYBlockRenderer0 = new org.jfree.chart.renderer.xy.XYBlockRenderer();
        org.jfree.chart.renderer.LookupPaintScale lookupPaintScale0 = ((org.jfree.chart.renderer.LookupPaintScale)(xYBlockRenderer0.getPaintScale()));
        org.jfree.chart.title.PaintScaleLegend paintScaleLegend0 = new org.jfree.chart.title.PaintScaleLegend(((org.jfree.chart.renderer.PaintScale)(lookupPaintScale0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        jFreeChart0.removeSubtitle(paintScaleLegend0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-488.0) , (-488.0));
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("(" , cyclicNumberAxis0.DEFAULT_AXIS_LABEL_FONT , ((org.jfree.chart.plot.Plot)(piePlot3D0)) , true);
        jFreeChart0.fireChartChanged();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(jFreeChart0.getBorderStroke()));
        org.junit.Assert.assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultMultiValueCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.removeLegend();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart1 = ((org.jfree.chart.JFreeChart)(jFreeChart0.clone()));
        org.junit.Assert.assertFalse(jFreeChart1.isBorderVisible());
        org.junit.Assert.assertNotSame(jFreeChart1, jFreeChart0);
        org.junit.Assert.assertEquals(0, jFreeChart1.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart1.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        org.jfree.chart.JFreeChart jFreeChart1 = ((org.jfree.chart.JFreeChart)(jFreeChart0.clone()));
        org.junit.Assert.assertTrue(jFreeChart1.equals(((java.lang.Object)(jFreeChart0))));
        spiderWebPlot0.setSeriesOutlinePaint(jFreeChart0.DEFAULT_BACKGROUND_PAINT);
        spiderWebPlot0.removeChangeListener(jFreeChart1);
        org.junit.Assert.assertFalse(jFreeChart1.equals(((java.lang.Object)(jFreeChart0))));
        org.junit.Assert.assertNotSame(jFreeChart1, jFreeChart0);
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        java.awt.Font font0 = org.jfree.chart.annotations.TextAnnotation.DEFAULT_FONT;
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart("wC~-<|`Oe[]G" , font0 , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)) , false);
        boolean boolean0 = jFreeChart1.equals(jFreeChart0);
        org.junit.Assert.assertFalse(jFreeChart1.isBorderVisible());
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0, jFreeChart1.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart1.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        org.jfree.chart.JFreeChart jFreeChart1 = ((org.jfree.chart.JFreeChart)(jFreeChart0.clone()));
        org.junit.Assert.assertTrue(jFreeChart1.equals(((java.lang.Object)(jFreeChart0))));
        jFreeChart1.setPadding(spiderWebPlot0.DEFAULT_INSETS);
        spiderWebPlot0.removeChangeListener(jFreeChart1);
        org.junit.Assert.assertFalse(jFreeChart1.equals(((java.lang.Object)(jFreeChart0))));
        org.junit.Assert.assertNotSame(jFreeChart1, jFreeChart0);
        org.junit.Assert.assertEquals(1, jFreeChart1.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        org.jfree.chart.JFreeChart jFreeChart1 = ((org.jfree.chart.JFreeChart)(jFreeChart0.clone()));
        spiderWebPlot0.removeChangeListener(jFreeChart1);
        org.junit.Assert.assertFalse(jFreeChart1.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart1.equals(((java.lang.Object)(jFreeChart0))));
        org.junit.Assert.assertTrue(jFreeChart1.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart1.getSubtitleCount());
        org.junit.Assert.assertNotSame(jFreeChart1, jFreeChart0);
        org.junit.Assert.assertTrue(jFreeChart0.equals(((java.lang.Object)(jFreeChart1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        java.awt.Font font0 = org.jfree.chart.annotations.TextAnnotation.DEFAULT_FONT;
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.setTextAntiAlias(false);
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart("wC~-<|`Oe[]G" , font0 , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)) , false);
        boolean boolean0 = jFreeChart1.equals(jFreeChart0);
        org.junit.Assert.assertFalse(jFreeChart1.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart1.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart1.isNotify());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("");
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        org.jfree.chart.renderer.category.IntervalBarRenderer intervalBarRenderer0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , ((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(intervalBarRenderer0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((java.lang.String)(null)) , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        jFreeChart0.removeProgressListener(((org.jfree.chart.event.ChartProgressListener)(null)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("F~JaP]CVJ1Z" , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , false , true , false , true , true);
        jFreeChart0.removeProgressListener(chartPanel0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(((org.jfree.chart.JFreeChart)(null)) , false);
        jFreeChart0.removeChangeListener(chartPanel0);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0);
        jFreeChart0.removeChangeListener(chartPanel0);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        org.jfree.chart.title.DateTitle dateTitle0 = new org.jfree.chart.title.DateTitle();
        jFreeChart0.addSubtitle(((org.jfree.chart.title.Title)(dateTitle0)));
        jFreeChart0.createBufferedImage(544, 420);
        org.junit.Assert.assertEquals(2, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(1725.8572);
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 't' argument." , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.setBackgroundImageAlpha(1.0F);
        jFreeChart0.setBackgroundImageAlpha(1.0F);
        org.junit.Assert.assertEquals(1.0F, jFreeChart0.getBackgroundImageAlpha(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBackgroundImageAlignment(15);
        org.junit.Assert.assertEquals(15, jFreeChart0.getBackgroundImageAlignment());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        jFreeChart0.setBackgroundImage(((java.awt.Image)(null)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBackgroundPaint(((java.awt.Paint)(null)));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(";;^[D#Ke$|?sAU" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        jFreeChart0.setBackgroundPaint(jFreeChart0.DEFAULT_BACKGROUND_PAINT);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.setTextAntiAlias(true);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
        org.jfree.chart.util.TableOrder tableOrder0 = org.jfree.chart.util.TableOrder.BY_ROW;
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(defaultMultiValueCategoryDataset0)) , tableOrder0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        jFreeChart0.setAntiAlias(false);
        jFreeChart0.setAntiAlias(false);
        org.junit.Assert.assertFalse(jFreeChart0.getAntiAlias());
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(1900 , 0 , 20);
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer0 = new org.jfree.chart.renderer.WaferMapRenderer();
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0 , waferMapRenderer0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        jFreeChart0.setAntiAlias(false);
        boolean boolean0 = jFreeChart0.getAntiAlias();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setAntiAlias(true);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.getAntiAlias());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        org.jfree.chart.title.DateTitle dateTitle0 = new org.jfree.chart.title.DateTitle();
        jFreeChart0.addSubtitle(0, ((org.jfree.chart.title.Title)(dateTitle0)));
        org.junit.Assert.assertEquals(2, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(piePlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend(2143774695);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertNull(legendTitle0);
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.getLegend();
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        jFreeChart0.setTitle("");
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot();
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(thermometerPlot0.getRangeAxis()));
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        jFreeChart0.setTitle(((java.lang.String)(null)));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        jFreeChart0.setTitle(((org.jfree.chart.title.TextTitle)(null)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(";^[D#Ke$|O?sAU" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        org.jfree.chart.title.TextTitle textTitle0 = new org.jfree.chart.title.TextTitle("" , jFreeChart0.DEFAULT_TITLE_FONT);
        jFreeChart0.setTitle(textTitle0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setPadding(multiplePiePlot0.DEFAULT_INSETS);
        jFreeChart0.getPadding();
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        java.awt.RenderingHints renderingHints0 = jFreeChart0.getRenderingHints();
        jFreeChart0.setRenderingHints(renderingHints0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset((-1649.60508794));
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((java.awt.Font)(null)) , ((org.jfree.chart.plot.Plot)(thermometerPlot0)) , true);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(759, 991, 3, chartRenderingInfo0);
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(991, bufferedImage0.getHeight());
        org.junit.Assert.assertTrue(bufferedImage0.isAlphaPremultiplied());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(759, bufferedImage0.getTileWidth());
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.getPadding();
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        org.jfree.chart.JFreeChart jFreeChart1 = ((org.jfree.chart.JFreeChart)(jFreeChart0.clone()));
        jFreeChart1.setBorderVisible(true);
        spiderWebPlot0.removeChangeListener(jFreeChart1);
        org.junit.Assert.assertTrue(jFreeChart1.isBorderVisible());
        org.junit.Assert.assertFalse(jFreeChart1.equals(((java.lang.Object)(jFreeChart0))));
        org.junit.Assert.assertNotSame(jFreeChart0, jFreeChart1);
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(thermometerPlot0)));
        jFreeChart0.getTitle();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(1725.8572);
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 't' argument." , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.getBackgroundPaint();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        jFreeChart0.setBorderStroke(combinedRangeCategoryPlot0.DEFAULT_CROSSHAIR_STROKE);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(";^[D#Ke$|O?sAU" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        java.util.List list0 = jFreeChart0.getSubtitles();
        jFreeChart0.setSubtitles(list0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[6];
        org.jfree.chart.JFreeChart.main(stringArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(1900 , 0 , 20);
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer0 = new org.jfree.chart.renderer.WaferMapRenderer();
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0 , waferMapRenderer0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        jFreeChart0.getBackgroundImage();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(";;^[D#Ke$|?sAU" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        jFreeChart0.getAntiAlias();
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        jFreeChart0.setBorderPaint(spiderWebPlot0.DEFAULT_LABEL_OUTLINE_PAINT);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(1900 , 0 , 20);
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer0 = new org.jfree.chart.renderer.WaferMapRenderer();
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0 , waferMapRenderer0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle2D_Double0)), chartRenderingInfo0);
        org.junit.Assert.assertEquals((-1), sunGraphics2D0.eargb);
        org.junit.Assert.assertEquals(10, bufferedImage0.getHeight());
        org.junit.Assert.assertEquals(10, bufferedImage0.getWidth());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(1900 , 0 , 20);
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer0 = new org.jfree.chart.renderer.WaferMapRenderer();
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0 , waferMapRenderer0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        int int0 = jFreeChart0.getBackgroundImageAlignment();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(15, int0);
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(piePlot0)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        jFreeChart0.setBorderVisible(true);
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , 10 , 10 , 10 , 1669 , 114 , 15 , false , false , true , false , false , true);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, java.lang.Double.NaN, java.lang.Double.NaN, chartRenderingInfo0);
        org.junit.Assert.assertEquals(10, bufferedImage0.getTileHeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setTitle("ZOOM_RESET_DOMAIN");
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test123() throws java.lang.Throwable {
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(piePlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , 10 , 10 , 10 , 1669 , 114 , 15 , false , false , true , false , false , true);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, java.lang.Double.NaN, java.lang.Double.NaN, chartRenderingInfo0);
        jFreeChart0.setBackgroundImage(bufferedImage0);
        org.junit.Assert.assertTrue(chartPanel0.getRefreshBuffer());
        java.awt.image.BufferedImage bufferedImage1 = jFreeChart0.createBufferedImage(800, 10);
        org.junit.Assert.assertEquals(10, bufferedImage1.getHeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test124() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.getTextAntiAlias();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test125() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        boolean boolean0 = jFreeChart0.isNotify();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(boolean0);
    }
}

