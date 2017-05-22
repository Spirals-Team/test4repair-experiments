package org.jfree.chart;


public class JFreeChart_ESTest extends org.jfree.chart.JFreeChart_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , 81 , 1073741824 , 81 , 2105376125 , 15 , 1 , false , false , false , false , false , false);
        org.jfree.chart.ChartPanel chartPanel1 = new org.jfree.chart.ChartPanel(jFreeChart0 , false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel1.getChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 15, chartRenderingInfo0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(10, bufferedImage0.getWidth());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(15, bufferedImage0.getHeight());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.plot.PiePlot piePlot0 = ((org.jfree.chart.plot.PiePlot)(jFreeChart0.getPlot()));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        jFreeChart0.setBackgroundPaint(piePlot0.DEFAULT_OUTLINE_PAINT);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Point2D.Float point2D_Float0 = new java.awt.geom.Point2D.Float();
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle2D_Double0)), ((java.awt.geom.Point2D)(point2D_Float0)), chartRenderingInfo0);
        org.junit.Assert.assertEquals((-8355712), sunGraphics2D0.pixel);
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBackgroundImageAlpha(10);
        float float0 = jFreeChart0.getBackgroundImageAlpha();
        org.junit.Assert.assertEquals(10.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        org.jfree.chart.plot.FastScatterPlot fastScatterPlot0 = new org.jfree.chart.plot.FastScatterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(fastScatterPlot0)));
        jFreeChart0.setBackgroundImageAlignment(2021161080);
        jFreeChart0.setBackgroundImageAlignment(10);
        org.junit.Assert.assertEquals(10, jFreeChart0.getBackgroundImageAlignment());
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend(2);
        org.junit.Assert.assertNull(legendTitle0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("2p5" , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend();
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent0 = new org.jfree.chart.event.TitleChangeEvent(((org.jfree.chart.title.Title)(legendTitle0)));
        jFreeChart0.titleChanged(titleChangeEvent0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.chart.axis.LogAxis logAxis0 = new org.jfree.chart.axis.LogAxis();
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot(((org.jfree.chart.axis.ValueAxis)(logAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        org.jfree.chart.event.ChartProgressEvent chartProgressEvent0 = new org.jfree.chart.event.ChartProgressEvent(((java.lang.Object)(combinedRangeXYPlot0)) , jFreeChart0 , 10 , 2491);
        jFreeChart0.notifyListeners(chartProgressEvent0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(((java.lang.Number)(null)));
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("$DSB" , ((org.jfree.chart.plot.Plot)(thermometerPlot0)));
        org.jfree.chart.event.ChartChangeEvent chartChangeEvent0 = new org.jfree.chart.event.ChartChangeEvent(((java.lang.Object)(thermometerPlot0)) , jFreeChart0);
        jFreeChart0.notifyListeners(chartChangeEvent0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 16);
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle2D_Double0)));
        org.junit.Assert.assertEquals((-8355712), sunGraphics2D0.pixel);
        org.junit.Assert.assertEquals(16, bufferedImage0.getTileHeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.chart.plot.RingPlot ringPlot0 = new org.jfree.chart.plot.RingPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(ringPlot0)));
        jFreeChart0.getTitle();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(piePlot3D0)));
        jFreeChart0.getSubtitles();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        java.awt.Font font0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        org.jfree.chart.plot.RingPlot ringPlot0 = new org.jfree.chart.plot.RingPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((java.lang.String)(null)) , font0 , ((org.jfree.chart.plot.Plot)(ringPlot0)) , true);
        jFreeChart0.removeLegend();
        jFreeChart0.getSubtitleCount();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setPadding(multiplePiePlot0.DEFAULT_INSETS);
        jFreeChart0.getPadding();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.getLegend();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.Color color0 = ((java.awt.Color)(jFreeChart0.getBackgroundPaint()));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertNull(color0);
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        org.jfree.chart.title.TextTitle textTitle0 = new org.jfree.chart.title.TextTitle();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        jFreeChart0.drawTitle(textTitle0, ((java.awt.Graphics2D)(null)), rectangle2D_Double0, true);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("OxN" , ((org.jfree.chart.plot.Plot)(piePlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 10, chartRenderingInfo0);
        org.junit.Assert.assertEquals(10, bufferedImage0.getType());
        org.junit.Assert.assertEquals(10, bufferedImage0.getTileHeight());
        org.junit.Assert.assertEquals(10, bufferedImage0.getTileWidth());
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(4339 , 4339);
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer0 = new org.jfree.chart.renderer.WaferMapRenderer(192 , 4339);
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0 , waferMapRenderer0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((java.lang.String)(null)) , ((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        jFreeChart0.createBufferedImage(1691, 4339, chartRenderingInfo0);
    }

    @org.junit.Test(timeout = 4000)
    public void test036() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(1176 , 23);
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer0 = new org.jfree.chart.renderer.WaferMapRenderer();
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0 , waferMapRenderer0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        boolean boolean0 = jFreeChart0.equals(jFreeChart0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(null)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(thermometerPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , true);
        jFreeChart0.addProgressListener(chartPanel0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(0.0);
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("ItemLabelAnchor.INSIDE7" , meterPlot0.DEFAULT_LABEL_FONT , ((org.jfree.chart.plot.Plot)(meterPlot0)) , false);
        jFreeChart0.addProgressListener(((org.jfree.chart.event.ChartProgressListener)(null)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("OxN" , ((org.jfree.chart.plot.Plot)(piePlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , false);
        jFreeChart0.fireChartChanged();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("org.jfree.data.time.SerialDate" , ((org.jfree.chart.plot.Plot)(piePlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , false , false , false , false , false);
        jFreeChart0.addChangeListener(chartPanel0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double((-788.4728621) , (-4755.09740841) , (-4755.09740841) , (-788.4728621));
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(meterPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Point2D.Float point2D_Float0 = new java.awt.geom.Point2D.Float();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(null)));
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle2D_Double0)), ((java.awt.geom.Point2D)(point2D_Float0)), chartRenderingInfo0);
        org.junit.Assert.assertEquals(10, bufferedImage0.getHeight());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals((-1), sunGraphics2D0.pixel);
        org.junit.Assert.assertEquals(10, bufferedImage0.getWidth());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Point2D.Float point2D_Float0 = new java.awt.geom.Point2D.Float();
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle2D_Double0)), ((java.awt.geom.Point2D)(point2D_Float0)), chartRenderingInfo0);
        org.junit.Assert.assertEquals((-8355712), sunGraphics2D0.pixel);
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        org.jfree.chart.annotations.XYPointerAnnotation xYPointerAnnotation0 = new org.jfree.chart.annotations.XYPointerAnnotation("N'Vj+(yb" , 0.0 , 0.0 , 1561.91373);
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D("AxisLocation.TOP_OR_LEFT");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(numberAxis3D0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 'subtitles' argument." , xYPointerAnnotation0.DEFAULT_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)) , true);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(((int)((byte)(1))), 5173, ((org.jfree.chart.ChartRenderingInfo)(null)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , 84 , ((int)((byte)(0))) , ((int)((byte)(0))) , (-49) , 57 , 2 , true , false , false , true , true , true);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Point2D.Float point2D_Float0 = new java.awt.geom.Point2D.Float();
        java.awt.Point point0 = chartPanel0.translateJava2DToScreen(point2D_Float0);
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(chartPanel0.translateScreenToJava2D(point0)));
        try {
            jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(null)), ((java.awt.geom.Point2D)(point2D_Double0)), ((org.jfree.chart.ChartRenderingInfo)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(compassPlot0)));
        jFreeChart0.setNotify(true);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        jFreeChart0.setNotify(false);
        org.junit.Assert.assertFalse(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        org.jfree.data.time.DynamicTimeSeriesCollection dynamicTimeSeriesCollection0 = new org.jfree.data.time.DynamicTimeSeriesCollection(3 , 3);
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        org.jfree.chart.renderer.DefaultPolarItemRenderer defaultPolarItemRenderer0 = new org.jfree.chart.renderer.DefaultPolarItemRenderer();
        org.jfree.chart.plot.PolarPlot polarPlot0 = new org.jfree.chart.plot.PolarPlot(((org.jfree.data.xy.XYDataset)(dynamicTimeSeriesCollection0)) , ((org.jfree.chart.axis.ValueAxis)(numberAxis0)) , ((org.jfree.chart.renderer.PolarItemRenderer)(defaultPolarItemRenderer0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(polarPlot0)));
        jFreeChart0.setBackgroundPaint(numberAxis0.DEFAULT_AXIS_LINE_PAINT);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(piePlot3D0)));
        jFreeChart0.clearSubtitles();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("^sGmx#43p,^u%-" , ((java.awt.Font)(null)) , ((org.jfree.chart.plot.Plot)(compassPlot0)) , false);
        org.jfree.chart.title.TextTitle textTitle0 = jFreeChart0.getTitle();
        jFreeChart0.addSubtitle(((org.jfree.chart.title.Title)(textTitle0)));
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setTitle(((org.jfree.chart.title.TextTitle)(null)));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(multiplePiePlot0)));
        org.jfree.chart.title.DateTitle dateTitle0 = new org.jfree.chart.title.DateTitle();
        jFreeChart0.setTitle(((org.jfree.chart.title.TextTitle)(dateTitle0)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((java.lang.String)(null)) , ((java.awt.Font)(null)) , ((org.jfree.chart.plot.Plot)(xYPlot0)) , false);
        jFreeChart0.getXYPlot();
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        org.jfree.chart.axis.LogAxis logAxis0 = new org.jfree.chart.axis.LogAxis();
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot(((org.jfree.chart.axis.ValueAxis)(logAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        boolean boolean0 = jFreeChart0.isBorderVisible();
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent0 = new org.jfree.chart.event.PlotChangeEvent(((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        jFreeChart0.plotChanged(plotChangeEvent0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(((java.lang.Number)(null)));
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("$DSB" , ((org.jfree.chart.plot.Plot)(thermometerPlot0)));
        jFreeChart0.removeSubtitle(((org.jfree.chart.title.Title)(null)));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart1 = ((org.jfree.chart.JFreeChart)(jFreeChart0.clone()));
        org.junit.Assert.assertFalse(jFreeChart1.isBorderVisible());
        org.junit.Assert.assertNotSame(jFreeChart1, jFreeChart0);
        org.junit.Assert.assertTrue(jFreeChart1.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        org.jfree.chart.plot.RingPlot ringPlot0 = new org.jfree.chart.plot.RingPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(ringPlot0)));
        org.jfree.chart.JFreeChart jFreeChart1 = ((org.jfree.chart.JFreeChart)(jFreeChart0.clone()));
        org.junit.Assert.assertFalse(jFreeChart1.isBorderVisible());
        org.junit.Assert.assertNotSame(jFreeChart1, jFreeChart0);
        org.junit.Assert.assertTrue(jFreeChart1.isNotify());
        org.junit.Assert.assertTrue(jFreeChart1.equals(((java.lang.Object)(jFreeChart0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset();
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(thermometerPlot0)));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(((double)(1.0F)) , ((double)(1)) , (-74.61727) , ((double)(1.0F)));
        boolean boolean0 = jFreeChart0.equals(rectangle2D_Double0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        org.jfree.data.general.DefaultPieDataset defaultPieDataset0 = new org.jfree.data.general.DefaultPieDataset();
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)(defaultPieDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((java.lang.String)(null)) , ((org.jfree.chart.plot.Plot)(piePlot0)));
        jFreeChart0.removeProgressListener(((org.jfree.chart.event.ChartProgressListener)(null)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D(((org.jfree.data.general.PieDataset)(null)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(piePlot3D0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0);
        jFreeChart0.removeProgressListener(chartPanel0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0);
        jFreeChart0.removeChangeListener(chartPanel0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , 81 , 1073741824 , 81 , 2105376125 , 15 , 1 , false , false , false , false , false , false);
        org.jfree.chart.ChartPanel chartPanel1 = new org.jfree.chart.ChartPanel(jFreeChart0 , false);
        jFreeChart0.setPadding(multiplePiePlot0.DEFAULT_INSETS);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("OxN" , ((org.jfree.chart.plot.Plot)(piePlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(600, 10, 0.08, 90.0, chartRenderingInfo0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(600, bufferedImage0.getTileWidth());
        org.junit.Assert.assertEquals(10, bufferedImage0.getTileHeight());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertFalse(bufferedImage0.isAlphaPremultiplied());
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double((-788.4728621) , (-4754.3447013439845) , (-4754.3447013439845) , (-788.4728621));
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(meterPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
        jFreeChart0.setTitle("2EI;vTb@}H");
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Point2D.Float point2D_Float0 = new java.awt.geom.Point2D.Float();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(null)));
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle2D_Double0)), ((java.awt.geom.Point2D)(point2D_Float0)), chartRenderingInfo0);
        org.junit.Assert.assertEquals((-1), sunGraphics2D0.eargb);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(10, bufferedImage0.getHeight());
        org.junit.Assert.assertEquals(10, bufferedImage0.getWidth());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("h;WmXF" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        jFreeChart0.setBackgroundImageAlpha(0.0F);
        jFreeChart0.setBackgroundImageAlpha(10);
        org.junit.Assert.assertEquals(10.0F, jFreeChart0.getBackgroundImageAlpha(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBackgroundImageAlignment(10);
        int int0 = jFreeChart0.getBackgroundImageAlignment();
        org.junit.Assert.assertEquals(10, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBackgroundImageAlignment(15);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(15, jFreeChart0.getBackgroundImageAlignment());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , 81 , 1073741824 , 81 , 2105376125 , 15 , 1 , false , false , false , false , false , false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 15, chartRenderingInfo0);
        jFreeChart0.setBackgroundImage(bufferedImage0);
        org.junit.Assert.assertTrue(chartPanel0.getRefreshBuffer());
        org.junit.Assert.assertEquals(10, bufferedImage0.getWidth());
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBackgroundImage(((java.awt.Image)(null)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBackgroundPaint(((java.awt.Paint)(null)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        java.awt.Font font0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("EqZb$yX}Rs)^,NY" , font0 , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)) , false);
        jFreeChart0.setBackgroundPaint(combinedRangeCategoryPlot0.DEFAULT_GRIDLINE_PAINT);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setTextAntiAlias(false);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        java.awt.Font font0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("EqZb$yX}Rs)^,NY" , font0 , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)) , false);
        jFreeChart0.setAntiAlias(true);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.getAntiAlias());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setAntiAlias(false);
        boolean boolean0 = jFreeChart0.getAntiAlias();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset();
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(thermometerPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
        jFreeChart0.addSubtitle(1, ((org.jfree.chart.title.Title)(legendTitle0)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset((-162) , 0);
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("+LHdnqDslEn." , ((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        jFreeChart0.getSubtitle(0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        java.util.List list0 = defaultKeyedValues0.getKeys();
        jFreeChart0.setSubtitles(list0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend((-268));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertNull(legendTitle0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(((java.lang.Number)(null)));
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("$DSB" , ((org.jfree.chart.plot.Plot)(thermometerPlot0)));
        jFreeChart0.setTitle("qG-8ju5rYb");
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(categoryPlot0)));
        jFreeChart0.setTitle(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        java.awt.RenderingHints renderingHints0 = jFreeChart0.getRenderingHints();
        jFreeChart0.setRenderingHints(renderingHints0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(meterPlot0)));
        jFreeChart0.getPadding();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(((java.lang.Number)(null)));
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("$DSB" , ((org.jfree.chart.plot.Plot)(thermometerPlot0)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        jFreeChart0.setBorderVisible(true);
        org.junit.Assert.assertTrue(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(meterPlot0)));
        jFreeChart0.getSubtitleCount();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(compassPlot0)));
        jFreeChart0.setTextAntiAlias(true);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        org.jfree.chart.plot.FastScatterPlot fastScatterPlot0 = new org.jfree.chart.plot.FastScatterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(fastScatterPlot0)));
        jFreeChart0.getBackgroundPaint();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBorderStroke(((java.awt.Stroke)(null)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        org.jfree.chart.plot.RingPlot ringPlot0 = new org.jfree.chart.plot.RingPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(ringPlot0)));
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(jFreeChart0.getBorderStroke()));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.getSubtitles();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(categoryPlot0)));
        jFreeChart0.getCategoryPlot();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[4];
        org.jfree.chart.JFreeChart.main(stringArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.getBackgroundImage();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        org.jfree.chart.axis.LogAxis logAxis0 = new org.jfree.chart.axis.LogAxis();
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot(((org.jfree.chart.axis.ValueAxis)(logAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.getAntiAlias();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(null)));
        jFreeChart0.handleClick(10, 1512, chartRenderingInfo0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(compassPlot0)));
        jFreeChart0.setBorderPaint(compassPlot0.DEFAULT_BACKGROUND_PAINT);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double((-788.4728621) , (-4754.3447013439845) , (-4754.3447013439845) , (-788.4728621));
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(meterPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(null)));
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle2D_Double0)), chartRenderingInfo0);
        org.junit.Assert.assertEquals((-1), sunGraphics2D0.pixel);
        org.junit.Assert.assertEquals(10, bufferedImage0.getHeight());
        org.junit.Assert.assertEquals(10, bufferedImage0.getWidth());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(meterPlot0)));
        java.awt.Color color0 = ((java.awt.Color)(jFreeChart0.getBorderPaint()));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, color0.getGreen());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(compassPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend();
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertNotNull(legendTitle0);
        jFreeChart0.addLegend(legendTitle0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.getTextAntiAlias();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(meterPlot0)));
        boolean boolean0 = jFreeChart0.isNotify();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }
}

