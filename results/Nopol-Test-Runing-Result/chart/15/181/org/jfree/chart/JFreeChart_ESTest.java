package org.jfree.chart;


public class JFreeChart_ESTest extends org.jfree.chart.JFreeChart_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.chart.plot.PolarPlot polarPlot0 = new org.jfree.chart.plot.PolarPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 'orientation' argument." , ((org.jfree.chart.plot.Plot)(polarPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 18);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(10, bufferedImage0.getWidth());
        org.junit.Assert.assertEquals(18, bufferedImage0.getHeight());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(15 , 2126634292 , ((java.lang.Number)((byte)(5))));
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer0 = new org.jfree.chart.renderer.WaferMapRenderer();
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0 , waferMapRenderer0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        jFreeChart0.setBackgroundPaint(waferMapPlot0.DEFAULT_GRIDLINE_PAINT);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(10, bufferedImage0.getTileWidth());
        org.junit.Assert.assertEquals(10, bufferedImage0.getHeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(((java.lang.Number)((byte)(14))));
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(".hzW~VvJ2&r_N_c9nQ" , ((org.jfree.chart.plot.Plot)(meterPlot0)));
        jFreeChart0.setBackgroundImageAlignment(842);
        org.junit.Assert.assertEquals(842, jFreeChart0.getBackgroundImageAlignment());
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        org.jfree.chart.renderer.DefaultPolarItemRenderer defaultPolarItemRenderer0 = new org.jfree.chart.renderer.DefaultPolarItemRenderer();
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(0.0);
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("1.2.0-pre" , defaultPolarItemRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(compassPlot0)) , true);
        org.jfree.chart.title.TextTitle textTitle0 = new org.jfree.chart.title.TextTitle("Rotation.ANTICLOCKWISE" , compassPlot0.DEFAULT_LABEL_FONT);
        jFreeChart0.addSubtitle(0, ((org.jfree.chart.title.Title)(textTitle0)));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        org.jfree.chart.plot.PolarPlot polarPlot0 = new org.jfree.chart.plot.PolarPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(polarPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend(193);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertNull(legendTitle0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.notifyListeners(((org.jfree.chart.event.ChartProgressEvent)(null)));
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.DateTitle dateTitle0 = new org.jfree.chart.title.DateTitle();
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent0 = new org.jfree.chart.event.TitleChangeEvent(((org.jfree.chart.title.Title)(dateTitle0)));
        jFreeChart0.notifyListeners(titleChangeEvent0);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(800, 420);
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle2D_Double0)));
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertEquals(420, bufferedImage0.getHeight());
        org.junit.Assert.assertEquals(800, bufferedImage0.getTileWidth());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("njE3GspG6+ Q" , ((java.awt.Font)(null)) , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)) , false);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        jFreeChart0.setBorderVisible(true);
        boolean boolean0 = jFreeChart0.isBorderVisible();
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.getXYPlot();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset();
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(compassPlot0)));
        jFreeChart0.getTitle();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.util.TableOrder tableOrder0 = org.jfree.chart.util.TableOrder.BY_ROW;
        org.jfree.data.category.CategoryToPieDataset categoryToPieDataset0 = new org.jfree.data.category.CategoryToPieDataset(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , tableOrder0 , (-640));
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D(((org.jfree.data.general.PieDataset)(categoryToPieDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(piePlot3D0)));
        jFreeChart0.getSubtitles();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        java.awt.Font font0 = combinedDomainXYPlot0.getNoDataMessageFont();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((java.lang.String)(null)) , font0 , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)) , false);
        int int0 = jFreeChart0.getSubtitleCount();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, int0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.RenderingHints renderingHints0 = jFreeChart0.getRenderingHints();
        renderingHints0.clear();
        jFreeChart0.getRenderingHints();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        org.jfree.chart.plot.RingPlot ringPlot0 = new org.jfree.chart.plot.RingPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(ringPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertNotNull(legendTitle0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("NE&zYU;8-f?=y7Mt" , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        jFreeChart0.getCategoryPlot();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.Color color0 = ((java.awt.Color)(jFreeChart0.getBackgroundPaint()));
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertNull(color0);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(defaultMultiValueCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((java.lang.String)(null)) , ((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        jFreeChart0.setBackgroundImageAlpha(0.0F);
        float float0 = jFreeChart0.getBackgroundImageAlpha();
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        rectangle2D_Double0.setRect(1022.25651919627, 1022.25651919627, 1022.25651919627, 1022.25651919627);
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((java.awt.Font)(null)) , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)) , true);
        org.jfree.chart.renderer.xy.DefaultXYItemRenderer defaultXYItemRenderer0 = new org.jfree.chart.renderer.xy.DefaultXYItemRenderer();
        org.jfree.chart.title.LegendTitle legendTitle0 = new org.jfree.chart.title.LegendTitle(((org.jfree.chart.LegendItemSource)(defaultXYItemRenderer0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = ((org.jfree.chart.entity.StandardEntityCollection)(jFreeChart0.drawTitle(legendTitle0, sunGraphics2D0, rectangle2D_Double0, true)));
        org.junit.Assert.assertNotNull(standardEntityCollection0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(10, bufferedImage0.getTileHeight());
        org.junit.Assert.assertEquals(10, bufferedImage0.getWidth());
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((java.awt.Font)(null)) , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)) , true);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 10, chartRenderingInfo0);
        org.junit.Assert.assertEquals(10, bufferedImage0.getType());
        org.junit.Assert.assertEquals(10, bufferedImage0.getTileHeight());
        org.junit.Assert.assertEquals(10, bufferedImage0.getWidth());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        boolean boolean0 = jFreeChart0.equals(jFreeChart0);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , true , false , true , true , true);
        jFreeChart0.removeProgressListener(chartPanel0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , 3 , 10 , 3 , 10 , 3 , 15 , true , true , false , false , true , true);
        jFreeChart0.addProgressListener(chartPanel0);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(38, 10, 0.05, ((double)(10)), chartRenderingInfo0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(38, bufferedImage0.getWidth());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(10, bufferedImage0.getTileHeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("AO@i~:" , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        jFreeChart0.addProgressListener(((org.jfree.chart.event.ChartProgressListener)(null)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0);
        jFreeChart0.removeChangeListener(chartPanel0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , false);
        jFreeChart0.addChangeListener(chartPanel0);
        jFreeChart0.setAntiAlias(false);
        org.junit.Assert.assertFalse(jFreeChart0.getAntiAlias());
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(15 , 2126634292 , ((java.lang.Number)((byte)(5))));
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer0 = new org.jfree.chart.renderer.WaferMapRenderer();
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0 , waferMapRenderer0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(((int)((byte)(5))), 1);
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(null)));
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle2D_Double0)), ((java.awt.geom.Point2D)(null)), chartRenderingInfo0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(5, bufferedImage0.getTileWidth());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals((-1), sunGraphics2D0.pixel);
        org.junit.Assert.assertEquals(1, bufferedImage0.getHeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(meterPlot0)));
        jFreeChart0.setNotify(true);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.util.TableOrder tableOrder0 = org.jfree.chart.util.TableOrder.BY_COLUMN;
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , tableOrder0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("&{y=|Lsq/~c" , ((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        jFreeChart0.setNotify(false);
        org.junit.Assert.assertFalse(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
        org.junit.Assert.assertNotNull(legendTitle0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("njE3GspG6+ Q" , ((java.awt.Font)(null)) , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)) , false);
        boolean boolean0 = jFreeChart0.isBorderVisible();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent0 = new org.jfree.chart.event.PlotChangeEvent(((org.jfree.chart.plot.Plot)(multiplePiePlot0)));
        jFreeChart0.plotChanged(plotChangeEvent0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.Color color0 = ((java.awt.Color)(jFreeChart0.getBorderPaint()));
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, color0.getBlue());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(1567 , 1757);
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("OpEtbl0|VOyTV" , ((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = ((org.jfree.chart.title.LegendTitle)(jFreeChart0.getSubtitle(0)));
        jFreeChart0.removeSubtitle(legendTitle0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        org.jfree.chart.renderer.DefaultPolarItemRenderer defaultPolarItemRenderer0 = new org.jfree.chart.renderer.DefaultPolarItemRenderer();
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(0.0);
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("1.2.0-pre" , defaultPolarItemRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(compassPlot0)) , false);
        jFreeChart0.fireChartChanged();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(15 , 2126634292 , ((java.lang.Number)((byte)(5))));
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer0 = new org.jfree.chart.renderer.WaferMapRenderer();
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0 , waferMapRenderer0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(jFreeChart0.getBorderStroke()));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.removeLegend();
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(meterPlot0)));
        jFreeChart0.getPlot();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        org.jfree.chart.util.TableOrder tableOrder0 = org.jfree.chart.util.TableOrder.BY_COLUMN;
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(null)) , tableOrder0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        org.jfree.chart.JFreeChart jFreeChart1 = ((org.jfree.chart.JFreeChart)(jFreeChart0.clone()));
        org.junit.Assert.assertTrue(jFreeChart1.isNotify());
        org.junit.Assert.assertTrue(jFreeChart1.equals(((java.lang.Object)(jFreeChart0))));
        org.junit.Assert.assertFalse(jFreeChart1.isBorderVisible());
        org.junit.Assert.assertNotSame(jFreeChart1, jFreeChart0);
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(multiplePiePlot0)));
        boolean boolean0 = jFreeChart0.equals(jFreeChart1);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(jFreeChart1.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart1.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        boolean boolean0 = jFreeChart0.equals(combinedRangeXYPlot0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.removeProgressListener(((org.jfree.chart.event.ChartProgressListener)(null)));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        javax.swing.text.StyleContext styleContext0 = new javax.swing.text.StyleContext();
        java.awt.Font font0 = styleContext0.getFont("", 366, 366);
        org.jfree.chart.plot.PolarPlot polarPlot0 = new org.jfree.chart.plot.PolarPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("`C<z}Ax3" , font0 , ((org.jfree.chart.plot.Plot)(polarPlot0)) , false);
        org.jfree.chart.title.DateTitle dateTitle0 = new org.jfree.chart.title.DateTitle(0);
        jFreeChart0.setTitle(((org.jfree.chart.title.TextTitle)(dateTitle0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 222);
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(222, bufferedImage0.getTileHeight());
        org.junit.Assert.assertEquals(10, bufferedImage0.getTileWidth());
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(38, 10, 0.05, ((double)(10)), chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double((-1515.2155) , ((double)(1.0F)) , ((double)(-1)) , ((double)(-1)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
        org.junit.Assert.assertNotNull(legendTitle0);
        jFreeChart0.drawTitle(legendTitle0, sunGraphics2D0, rectangle2D_Double0, false);
        org.junit.Assert.assertEquals(10, bufferedImage0.getHeight());
        org.junit.Assert.assertEquals(38, bufferedImage0.getWidth());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        org.jfree.chart.renderer.DefaultPolarItemRenderer defaultPolarItemRenderer0 = new org.jfree.chart.renderer.DefaultPolarItemRenderer();
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(0.0);
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("1.2.0-pre" , defaultPolarItemRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(compassPlot0)) , false);
        jFreeChart0.setBackgroundImageAlpha(1.0F);
        org.junit.Assert.assertEquals(1.0F, jFreeChart0.getBackgroundImageAlpha(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 'subtitle' argument." , ((org.jfree.chart.plot.Plot)(multiplePiePlot0)));
        jFreeChart0.setBackgroundImageAlpha(0.5F);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBackgroundImageAlignment(10);
        org.junit.Assert.assertEquals(10, jFreeChart0.getBackgroundImageAlignment());
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBackgroundImageAlignment(15);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(15, jFreeChart0.getBackgroundImageAlignment());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 'subtitle' argument." , ((org.jfree.chart.plot.Plot)(multiplePiePlot0)));
        jFreeChart0.setBackgroundImage(((java.awt.Image)(null)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBackgroundPaint(multiplePiePlot0.DEFAULT_OUTLINE_PAINT);
        jFreeChart0.setBackgroundPaint(multiplePiePlot0.DEFAULT_OUTLINE_PAINT);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setTextAntiAlias(false);
        jFreeChart0.getTextAntiAlias();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.util.TableOrder tableOrder0 = org.jfree.chart.util.TableOrder.BY_ROW;
        org.jfree.data.category.CategoryToPieDataset categoryToPieDataset0 = new org.jfree.data.category.CategoryToPieDataset(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)) , tableOrder0 , (-640));
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D(((org.jfree.data.general.PieDataset)(categoryToPieDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(piePlot3D0)));
        jFreeChart0.setAntiAlias(true);
        org.junit.Assert.assertTrue(jFreeChart0.getAntiAlias());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 'subtitle' argument." , ((org.jfree.chart.plot.Plot)(multiplePiePlot0)));
        jFreeChart0.setAntiAlias(false);
        jFreeChart0.setAntiAlias(false);
        org.junit.Assert.assertFalse(jFreeChart0.getAntiAlias());
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.RenderingHints renderingHints0 = jFreeChart0.getRenderingHints();
        renderingHints0.clear();
        jFreeChart0.setAntiAlias(true);
        org.junit.Assert.assertTrue(jFreeChart0.getAntiAlias());
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        org.jfree.chart.renderer.DefaultPolarItemRenderer defaultPolarItemRenderer0 = new org.jfree.chart.renderer.DefaultPolarItemRenderer();
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(0.0);
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("1.2.0-pre" , defaultPolarItemRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(compassPlot0)) , false);
        org.jfree.chart.title.TextTitle textTitle0 = new org.jfree.chart.title.TextTitle("Rotation.ANTICLOCKWISE" , compassPlot0.DEFAULT_LABEL_FONT);
        jFreeChart0.addSubtitle(0, ((org.jfree.chart.title.Title)(textTitle0)));
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        org.jfree.chart.renderer.DefaultPolarItemRenderer defaultPolarItemRenderer0 = new org.jfree.chart.renderer.DefaultPolarItemRenderer();
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(((double)(defaultPolarItemRenderer0.ZERO)));
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        java.lang.String[] stringArray0 = new java.lang.String[1];
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(compassPlot0)));
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        java.lang.Number[][] numberArray0 = new java.lang.Number[1][9];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(stringArray0 , numberArray0 , numberArray0);
        java.util.List list0 = defaultIntervalCategoryDataset0.getRowKeys();
        jFreeChart0.setSubtitles(list0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("hgV<T6x-, " , ((org.jfree.chart.plot.Plot)(xYPlot0)));
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        jFreeChart0.clearSubtitles();
        org.jfree.chart.title.TextTitle textTitle0 = new org.jfree.chart.title.TextTitle();
        jFreeChart0.addSubtitle(((org.jfree.chart.title.Title)(textTitle0)));
        jFreeChart0.getLegend();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        java.awt.Font font0 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("org.jfree.chart.util.RectangleEdge" , font0 , ((org.jfree.chart.plot.Plot)(meterPlot0)) , true);
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend((-1901));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertNull(legendTitle0);
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((java.lang.String)(null)) , subCategoryAxis0.DEFAULT_AXIS_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)) , true);
        jFreeChart0.setTitle("org.jfree.chart.event.ChartChangeListener");
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        org.jfree.chart.renderer.DefaultPolarItemRenderer defaultPolarItemRenderer0 = new org.jfree.chart.renderer.DefaultPolarItemRenderer();
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(0.0);
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("1.2.0-pre" , defaultPolarItemRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(compassPlot0)) , false);
        jFreeChart0.setTitle("");
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 'subtitle' argument." , ((org.jfree.chart.plot.Plot)(multiplePiePlot0)));
        jFreeChart0.setTitle(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset();
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(compassPlot0)));
        jFreeChart0.setTitle(((org.jfree.chart.title.TextTitle)(null)));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.0 , (-2776.143332435));
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.setPadding(cyclicNumberAxis0.DEFAULT_TICK_LABEL_INSETS);
        jFreeChart0.getPadding();
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.RenderingHints renderingHints0 = jFreeChart0.getRenderingHints();
        jFreeChart0.setRenderingHints(renderingHints0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.0 , (-2776.143332435));
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.getPadding();
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        int int0 = jFreeChart0.getSubtitleCount();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, int0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("njE3GspG6+ Q" , ((java.awt.Font)(null)) , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)) , false);
        jFreeChart0.getTitle();
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("=" , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        jFreeChart0.setTextAntiAlias(true);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        java.awt.Font font0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        org.jfree.chart.plot.PolarPlot polarPlot0 = new org.jfree.chart.plot.PolarPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("l\"{$\'NoIi/`\'\'o" , font0 , ((org.jfree.chart.plot.Plot)(polarPlot0)) , true);
        jFreeChart0.getBackgroundPaint();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 'subtitle' argument." , ((org.jfree.chart.plot.Plot)(multiplePiePlot0)));
        jFreeChart0.setBorderStroke(multiplePiePlot0.DEFAULT_OUTLINE_STROKE);
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("njE3GspG6+ Q" , ((java.awt.Font)(null)) , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)) , false);
        java.util.List list0 = jFreeChart0.getSubtitles();
        org.junit.Assert.assertTrue(list0.isEmpty());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[1];
        org.jfree.chart.JFreeChart.main(stringArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        org.jfree.chart.renderer.DefaultPolarItemRenderer defaultPolarItemRenderer0 = new org.jfree.chart.renderer.DefaultPolarItemRenderer();
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(0.0);
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("1.2.0-pre" , defaultPolarItemRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(compassPlot0)) , false);
        jFreeChart0.getBackgroundImage();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(15 , 2126634292 , ((java.lang.Number)((byte)(5))));
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer0 = new org.jfree.chart.renderer.WaferMapRenderer();
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0 , waferMapRenderer0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        jFreeChart0.getAntiAlias();
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(defaultMultiValueCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((java.lang.String)(null)) , ((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        float float0 = jFreeChart0.getBackgroundImageAlpha();
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0.5F, float0, 0.01F);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(((java.lang.Number)((byte)(14))));
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(".hzW~VvJ2&r_N_c9nQ" , ((org.jfree.chart.plot.Plot)(meterPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , 0 , 0 , 0 , 2 , 10 , (-1979) , false , true , true , true , true , true);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        jFreeChart0.handleClick(10, 2, chartRenderingInfo0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(((java.lang.Number)((byte)(14))));
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(".hzW~VvJ2&r_N_c9nQ" , ((org.jfree.chart.plot.Plot)(meterPlot0)));
        jFreeChart0.setBorderPaint(meterPlot0.DEFAULT_BACKGROUND_PAINT);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        java.lang.Number[][] numberArray0 = new java.lang.Number[0][5];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0 , numberArray0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle2D_Double0)), chartRenderingInfo0);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertEquals(10, bufferedImage0.getWidth());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(10, bufferedImage0.getTileHeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        int int0 = jFreeChart0.getBackgroundImageAlignment();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertEquals(15, int0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("njE3GspG6+ Q" , ((java.awt.Font)(null)) , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)) , false);
        jFreeChart0.setBorderVisible(true);
        jFreeChart0.createBufferedImage(43, 2);
        org.junit.Assert.assertTrue(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.block.FlowArrangement flowArrangement0 = new org.jfree.chart.block.FlowArrangement();
        org.jfree.chart.title.LegendTitle legendTitle0 = new org.jfree.chart.title.LegendTitle(((org.jfree.chart.LegendItemSource)(multiplePiePlot0)) , ((org.jfree.chart.block.Arrangement)(flowArrangement0)) , ((org.jfree.chart.block.Arrangement)(flowArrangement0)));
        jFreeChart0.addLegend(legendTitle0);
        jFreeChart0.clone();
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        org.jfree.chart.title.DateTitle dateTitle0 = new org.jfree.chart.title.DateTitle();
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent0 = new org.jfree.chart.event.TitleChangeEvent(((org.jfree.chart.title.Title)(dateTitle0)));
        jFreeChart0.titleChanged(titleChangeEvent0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , true , true , false , false , false);
        combinedDomainCategoryPlot0.setForegroundAlpha(0.5F);
        org.junit.Assert.assertEquals(0.5F, combinedDomainCategoryPlot0.getForegroundAlpha(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.getTextAntiAlias();
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("njE3GspG6+ Q" , ((java.awt.Font)(null)) , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)) , false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1, 18, chartRenderingInfo0);
        jFreeChart0.setBackgroundImage(bufferedImage0);
        java.awt.image.BufferedImage bufferedImage1 = jFreeChart0.createBufferedImage(3, 2);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertEquals(2, bufferedImage1.getType());
        org.junit.Assert.assertEquals(2, bufferedImage1.getTileHeight());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(3, bufferedImage1.getWidth());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("njE3GspG6+ Q" , ((java.awt.Font)(null)) , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)) , false);
        boolean boolean0 = jFreeChart0.isNotify();
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        java.lang.Number[][] numberArray0 = new java.lang.Number[0][5];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0 , numberArray0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 1886, 3.141592653589793, ((double)(1.0F)), chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        javax.swing.ImageIcon imageIcon0 = new javax.swing.ImageIcon("h-\n}Bnb8" , "h-\n}Bnb8");
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem0 = new javax.swing.JRadioButtonMenuItem("Invalid 'percent' (" , ((javax.swing.Icon)(imageIcon0)) , true);
        javax.swing.JScrollPane jScrollPane0 = new javax.swing.JScrollPane(((java.awt.Component)(jRadioButtonMenuItem0)));
        javax.swing.JViewport jViewport0 = jScrollPane0.getViewport();
        java.awt.Rectangle rectangle0 = jViewport0.getViewRect();
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double();
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle0)), ((java.awt.geom.Point2D)(point2D_Double0)), chartRenderingInfo0);
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertEquals(1886, bufferedImage0.getTileHeight());
        org.junit.Assert.assertEquals(10, bufferedImage0.getTileWidth());
    }
}

