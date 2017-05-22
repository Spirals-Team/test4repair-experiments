package org.jfree.chart;


public class JFreeChart_ESTest extends org.jfree.chart.JFreeChart_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, ((double)(10)), 0.0, chartRenderingInfo0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(10, bufferedImage0.getTileHeight());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(10, bufferedImage0.getWidth());
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(315.0 , 299.3223282003224 , "");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 't' argument." , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        jFreeChart0.setBackgroundImageAlpha((-19.22F));
        org.junit.Assert.assertEquals((-19.22F), jFreeChart0.getBackgroundImageAlpha(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        jFreeChart0.setBackgroundImageAlignment(500);
        org.junit.Assert.assertEquals(500, jFreeChart0.getBackgroundImageAlignment());
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        org.jfree.chart.plot.RingPlot ringPlot0 = new org.jfree.chart.plot.RingPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(ringPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend((-475));
        org.junit.Assert.assertNull(legendTitle0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(thermometerPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1, 2);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double((-2.147483648E9) , ((double)(1.0F)) , 200.0 , ((double)(0.5F)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , false , false , true , false , false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle2D_Double0)), chartRenderingInfo0);
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(2, bufferedImage0.getHeight());
        org.junit.Assert.assertEquals(1, bufferedImage0.getTileWidth());
        org.junit.Assert.assertEquals(1, bufferedImage0.getWidth());
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.notifyListeners(((org.jfree.chart.event.ChartProgressEvent)(null)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        jFreeChart0.setNotify(false);
        boolean boolean0 = jFreeChart0.isNotify();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(315.0 , 299.3223282003224 , "");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 't' argument." , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        jFreeChart0.getXYPlot();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((java.lang.String)(null)) , ((java.awt.Font)(null)) , ((org.jfree.chart.plot.Plot)(piePlot3D0)) , false);
        java.util.List list0 = jFreeChart0.getSubtitles();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(list0.isEmpty());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.getSubtitleCount();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.TextTitle textTitle0 = jFreeChart0.getTitle();
        jFreeChart0.setPadding(textTitle0.DEFAULT_PADDING);
        jFreeChart0.getPadding();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(meterPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend();
        org.junit.Assert.assertNotNull(legendTitle0);
        jFreeChart0.addLegend(legendTitle0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.Color color0 = ((java.awt.Color)(jFreeChart0.getBackgroundPaint()));
        org.junit.Assert.assertNull(color0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("mT)9WF\'bMO1C3T");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("mT)9WF\'bMO1C3T" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        jFreeChart0.setAntiAlias(false);
        boolean boolean0 = jFreeChart0.getAntiAlias();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.TextTitle textTitle0 = new org.jfree.chart.title.TextTitle("kFRB<)B%<OoE+H" , jFreeChart0.DEFAULT_TITLE_FONT);
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , false , false , false , false , false);
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(chartPanel0.getScreenDataArea((-66), (-66))));
        jFreeChart0.drawTitle(textTitle0, ((java.awt.Graphics2D)(null)), rectangle2D_Double0, true);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(compassPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = new org.jfree.chart.title.LegendTitle(((org.jfree.chart.LegendItemSource)(compassPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(33, 1063, 1, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Line2D.Double line2D_Double0 = new java.awt.geom.Line2D.Double(((double)(1.0F)) , java.lang.Double.NaN , ((double)(10)) , 990.16798936187);
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(line2D_Double0.getBounds2D()));
        jFreeChart0.drawTitle(legendTitle0, sunGraphics2D0, rectangle2D_Double0, true);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, rectangle2D_Double0.y, 0.01);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("mT)9WF\'bMO1C3T");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("mT)9WF\'bMO1C3T" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(((double)(500)) , ((double)(15)) , 2.0 , 1721.827639);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(193, 193);
        org.jfree.chart.title.TextTitle textTitle0 = new org.jfree.chart.title.TextTitle("mT)9WF\'bMO1C3T" , dateAxis0.DEFAULT_AXIS_LABEL_FONT);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        jFreeChart0.drawTitle(textTitle0, sunGraphics2D0, rectangle2D_Double0, true);
        org.junit.Assert.assertEquals((-16777216), sunGraphics2D0.eargb);
        org.junit.Assert.assertEquals(193, bufferedImage0.getHeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        java.awt.geom.Point2D.Double point2D_Double0 = new java.awt.geom.Point2D.Double();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        try {
            jFreeChart0.draw(((java.awt.Graphics2D)(null)), ((java.awt.geom.Rectangle2D)(null)), ((java.awt.geom.Point2D)(point2D_Double0)), chartRenderingInfo0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        org.jfree.data.general.DefaultPieDataset defaultPieDataset0 = new org.jfree.data.general.DefaultPieDataset();
        org.jfree.chart.plot.RingPlot ringPlot0 = new org.jfree.chart.plot.RingPlot(((org.jfree.data.general.PieDataset)(defaultPieDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(ringPlot0)));
        jFreeChart0.addProgressListener(((org.jfree.chart.event.ChartProgressListener)(null)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultBoxAndWhiskerCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(((org.jfree.chart.JFreeChart)(null)) , false , false , false , false , false);
        jFreeChart0.addChangeListener(chartPanel0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.AreaRenderer areaRenderer0 = new org.jfree.chart.renderer.category.AreaRenderer();
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , areaRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)) , true);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(3053, 10, ((double)(10)), (-2686.53123835), ((org.jfree.chart.ChartRenderingInfo)(null)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(3053, bufferedImage0.getTileWidth());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(10, bufferedImage0.getTileHeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("{mT)9WF\'bMO1C3T");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("{mT)9WF\'bMO1C3T" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(193, 193);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle2D_Double0)), ((java.awt.geom.Point2D)(null)), chartRenderingInfo0);
        org.junit.Assert.assertEquals(193, bufferedImage0.getTileWidth());
        org.junit.Assert.assertEquals(193, bufferedImage0.getTileHeight());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(193, bufferedImage0.getHeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("{mT)9WF\'bMO1C3T");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((java.lang.String)(null)) , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(0.28565312199430976 , ((double)(15)) , 2.0 , 1721.827639);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(193, 193);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle2D_Double0)), ((java.awt.geom.Point2D)(null)), chartRenderingInfo0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(193, bufferedImage0.getWidth());
        org.junit.Assert.assertEquals(193, bufferedImage0.getHeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("{mT)9WF\'bMO1C3T");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("{mT)9WF\'bMO1C3T" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(0.28565312199430976 , ((double)(15)) , 2.0 , 1721.827639);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(193, 193);
        jFreeChart0.setBackgroundImage(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle2D_Double0)), ((java.awt.geom.Point2D)(null)), chartRenderingInfo0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(193, bufferedImage0.getHeight());
        org.junit.Assert.assertEquals(193, bufferedImage0.getTileWidth());
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        org.jfree.chart.annotations.CategoryPointerAnnotation categoryPointerAnnotation0 = new org.jfree.chart.annotations.CategoryPointerAnnotation("org.jfree.data.time.TimeTableXYDataset" , ((java.lang.Comparable)("org.jfree.data.time.TimeTableXYDataset")) , 3802.3 , 3802.3);
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("org.jfree.data.time.TimeTableXYDataset" , categoryPointerAnnotation0.DEFAULT_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)) , true);
        jFreeChart0.setNotify(true);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((java.lang.String)(null)) , ((java.awt.Font)(null)) , ((org.jfree.chart.plot.Plot)(piePlot3D0)) , false);
        java.awt.Color color0 = ((java.awt.Color)(org.jfree.chart.annotations.XYTextAnnotation.DEFAULT_PAINT));
        jFreeChart0.setBackgroundPaint(color0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.clearSubtitles();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("{mT)9WF\'bMO1C3T");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("{mT)9WF\'bMO1C3T" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertNotNull(legendTitle0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset();
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Index out of range." , ((org.jfree.chart.plot.Plot)(meterPlot0)));
        jFreeChart0.setTitle("Z<");
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(121 , 121 , ((java.lang.Number)(0.0)));
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer0 = new org.jfree.chart.renderer.WaferMapRenderer();
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0 , waferMapRenderer0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        org.jfree.chart.title.DateTitle dateTitle0 = new org.jfree.chart.title.DateTitle();
        jFreeChart0.setTitle(((org.jfree.chart.title.TextTitle)(dateTitle0)));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        jFreeChart0.getSubtitleCount();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultBoxAndWhiskerCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        boolean boolean0 = jFreeChart0.isBorderVisible();
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(((java.lang.Number)(0)));
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(meterPlot0)));
        org.jfree.chart.title.DateTitle dateTitle0 = new org.jfree.chart.title.DateTitle(0);
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent0 = new org.jfree.chart.event.TitleChangeEvent(((org.jfree.chart.title.Title)(dateTitle0)));
        jFreeChart0.titleChanged(titleChangeEvent0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("mT)9WF\'bMO1C3T");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("mT)9WF\'bMO1C3T" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent0 = new org.jfree.chart.event.PlotChangeEvent(((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        jFreeChart0.plotChanged(plotChangeEvent0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.TextTitle textTitle0 = new org.jfree.chart.title.TextTitle("" , jFreeChart0.DEFAULT_TITLE_FONT);
        jFreeChart0.removeSubtitle(textTitle0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        org.jfree.chart.plot.FastScatterPlot fastScatterPlot0 = new org.jfree.chart.plot.FastScatterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(";!2BUO:R" , ((org.jfree.chart.plot.Plot)(fastScatterPlot0)));
        jFreeChart0.fireChartChanged();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        org.jfree.data.general.DefaultPieDataset defaultPieDataset0 = new org.jfree.data.general.DefaultPieDataset();
        org.jfree.chart.plot.RingPlot ringPlot0 = new org.jfree.chart.plot.RingPlot(((org.jfree.data.general.PieDataset)(defaultPieDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(ringPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        try {
            jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(null)), chartRenderingInfo0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset();
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(compassPlot0)));
        jFreeChart0.removeLegend();
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultBoxAndWhiskerCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.getLegend();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        org.jfree.chart.renderer.xy.CandlestickRenderer candlestickRenderer0 = new org.jfree.chart.renderer.xy.CandlestickRenderer(1.0);
        org.jfree.chart.plot.RingPlot ringPlot0 = new org.jfree.chart.plot.RingPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("4`9EPM>\"UZ|13~[" , candlestickRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(ringPlot0)) , false);
        jFreeChart0.getPlot();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("mT)9WF\'bMO1C3T");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("mT)9WF\'bMO1C3T" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        org.jfree.chart.JFreeChart jFreeChart1 = ((org.jfree.chart.JFreeChart)(jFreeChart0.clone()));
        org.junit.Assert.assertNotSame(jFreeChart1, jFreeChart0);
        org.junit.Assert.assertFalse(jFreeChart1.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart1.isNotify());
        org.junit.Assert.assertTrue(jFreeChart1.equals(((java.lang.Object)(jFreeChart0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("{mT)9WF\'bMO1C3T");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((java.lang.String)(null)) , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        org.jfree.chart.JFreeChart jFreeChart1 = ((org.jfree.chart.JFreeChart)(jFreeChart0.clone()));
        org.junit.Assert.assertTrue(jFreeChart1.isNotify());
        org.junit.Assert.assertTrue(jFreeChart1.equals(((java.lang.Object)(jFreeChart0))));
        org.junit.Assert.assertFalse(jFreeChart1.isBorderVisible());
        org.junit.Assert.assertNotSame(jFreeChart1, jFreeChart0);
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("[Z|XQoaU" , ((org.jfree.chart.plot.Plot)(thermometerPlot0)));
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(thermometerPlot0)));
        thermometerPlot0.removeChangeListener(jFreeChart0);
        org.junit.Assert.assertFalse(jFreeChart0.equals(((java.lang.Object)(jFreeChart1))));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset((-1.0));
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        boolean boolean0 = jFreeChart0.equals(meterPlot0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new org.jfree.data.general.DefaultKeyedValuesDataset();
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)(defaultKeyedValuesDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("rU" , piePlot0.DEFAULT_LABEL_FONT , ((org.jfree.chart.plot.Plot)(piePlot0)) , false);
        jFreeChart0.removeProgressListener(((org.jfree.chart.event.ChartProgressListener)(null)));
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(315.0 , 299.3223282003224 , "");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 't' argument." , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , true , true , true , true , false);
        jFreeChart0.removeProgressListener(chartPanel0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("{mT)9WF\'bMO1C3T");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("{mT)9WF\'bMO1C3T" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , 193 , (-1) , (-1627) , 2146012816 , 15 , (-1) , false , true , true , false , false , false);
        jFreeChart0.addProgressListener(chartPanel0);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(193, 193);
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(193, bufferedImage0.getTileWidth());
        org.junit.Assert.assertEquals(193, bufferedImage0.getTileHeight());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , false , false , false , false , true);
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("RenderingHints given are null");
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent0 = new org.jfree.chart.event.AxisChangeEvent(((org.jfree.chart.axis.Axis)(categoryAxis0)));
        jFreeChart0.notifyListeners(axisChangeEvent0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("&jthIU<\"DFIN=_" , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0);
        jFreeChart0.removeChangeListener(chartPanel0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , false , false , false , false , true);
        jFreeChart0.addChangeListener(chartPanel0);
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("RenderingHints given are null");
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent0 = new org.jfree.chart.event.AxisChangeEvent(((org.jfree.chart.axis.Axis)(categoryAxis0)));
        jFreeChart0.notifyListeners(axisChangeEvent0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("mT)9WF\'bMO1C3T");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("mT)9WF\'bMO1C3T" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(0.0 , ((double)(15)) , 2.0 , 1721.827639);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(193, 193);
        jFreeChart0.setBackgroundImage(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle2D_Double0)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(193, bufferedImage0.getHeight());
        org.junit.Assert.assertEquals(193, bufferedImage0.getTileWidth());
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset();
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(thermometerPlot0)));
        jFreeChart0.setBackgroundImageAlpha(1);
        org.junit.Assert.assertEquals(1.0F, jFreeChart0.getBackgroundImageAlpha(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBackgroundImageAlpha(0.5F);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("e(CjwNOQXv[YgPx" , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        jFreeChart0.setBackgroundImageAlignment((-835));
        int int0 = jFreeChart0.getBackgroundImageAlignment();
        org.junit.Assert.assertEquals((-835), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("e(CjwNOQXv[YgPx" , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        jFreeChart0.setBackgroundImageAlignment(15);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(15, jFreeChart0.getBackgroundImageAlignment());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(thermometerPlot0)));
        jFreeChart0.setBackgroundImage(((java.awt.Image)(null)));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("mT)9WF\'bMO1C3T");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("mT)9WF\'bMO1C3T" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(193, 193);
        jFreeChart0.setBackgroundImage(bufferedImage0);
        java.awt.image.BufferedImage bufferedImage1 = ((java.awt.image.BufferedImage)(jFreeChart0.getBackgroundImage()));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(193, bufferedImage1.getWidth());
        org.junit.Assert.assertNotNull(bufferedImage1);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(193, bufferedImage1.getTileHeight());
        org.junit.Assert.assertEquals(2, bufferedImage1.getType());
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBackgroundPaint(multiplePiePlot0.DEFAULT_OUTLINE_PAINT);
        jFreeChart0.setBackgroundPaint(multiplePiePlot0.DEFAULT_OUTLINE_PAINT);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        jFreeChart0.setTextAntiAlias(true);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("e(CjwNOQXv[YgPx" , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        jFreeChart0.setAntiAlias(false);
        org.junit.Assert.assertFalse(jFreeChart0.getAntiAlias());
        jFreeChart0.setAntiAlias(true);
        org.junit.Assert.assertTrue(jFreeChart0.getAntiAlias());
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("e(CjwNOQXv[YgPx" , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        jFreeChart0.setAntiAlias(true);
        org.junit.Assert.assertTrue(jFreeChart0.getAntiAlias());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        org.jfree.chart.title.TextTitle textTitle0 = jFreeChart0.getTitle();
        jFreeChart0.addSubtitle(0, ((org.jfree.chart.title.Title)(textTitle0)));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("{mT)9WF\'bMO1C3T");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("{mT)9WF\'bMO1C3T" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        org.jfree.chart.title.TextTitle textTitle0 = new org.jfree.chart.title.TextTitle();
        jFreeChart0.addSubtitle(((org.jfree.chart.title.Title)(textTitle0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend(420);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertNull(legendTitle0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        jFreeChart0.setTitle("");
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setTitle(((java.lang.String)(null)));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        org.jfree.chart.plot.FastScatterPlot fastScatterPlot0 = new org.jfree.chart.plot.FastScatterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(";!2BUO:R" , ((org.jfree.chart.plot.Plot)(fastScatterPlot0)));
        jFreeChart0.setTitle(((org.jfree.chart.title.TextTitle)(null)));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(xYPlot0)));
        java.awt.RenderingHints renderingHints0 = jFreeChart0.getRenderingHints();
        jFreeChart0.setRenderingHints(renderingHints0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        jFreeChart0.getPadding();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        jFreeChart0.setBorderVisible(true);
        org.junit.Assert.assertTrue(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        jFreeChart0.getSubtitle(0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        jFreeChart0.getTitle();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultBoxAndWhiskerCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setTextAntiAlias(false);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("mT)9WF\'bMO1C3T");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("mT)9WF\'bMO1C3T" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        jFreeChart0.getBackgroundPaint();
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((java.lang.String)(null)) , ((java.awt.Font)(null)) , ((org.jfree.chart.plot.Plot)(piePlot3D0)) , false);
        jFreeChart0.setBorderStroke(piePlot3D0.DEFAULT_LABEL_OUTLINE_STROKE);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        org.jfree.chart.annotations.CategoryPointerAnnotation categoryPointerAnnotation0 = new org.jfree.chart.annotations.CategoryPointerAnnotation("org.jfree.data.time.TimeTableXYDataset" , ((java.lang.Comparable)("org.jfree.data.time.TimeTableXYDataset")) , 3802.3 , 3802.3);
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("org.jfree.data.time.TimeTableXYDataset" , categoryPointerAnnotation0.DEFAULT_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)) , true);
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(jFreeChart0.getBorderStroke()));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)));
        java.util.List list0 = jFreeChart0.getSubtitles();
        jFreeChart0.setSubtitles(list0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        java.awt.Font font0 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_FONT;
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("lX[MC" , font0 , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)) , true);
        jFreeChart0.getCategoryPlot();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[7];
        org.jfree.chart.JFreeChart.main(stringArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        org.jfree.chart.annotations.CategoryPointerAnnotation categoryPointerAnnotation0 = new org.jfree.chart.annotations.CategoryPointerAnnotation("org.jfree.data.time.TimeTableXYDataset" , ((java.lang.Comparable)("org.jfree.data.time.TimeTableXYDataset")) , 3802.3 , 3802.3);
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("org.jfree.data.time.TimeTableXYDataset" , categoryPointerAnnotation0.DEFAULT_FONT , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)) , true);
        jFreeChart0.getBackgroundImage();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.getAntiAlias();
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        java.awt.Font font0 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_FONT;
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("lX[MC" , font0 , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)) , true);
        float float0 = jFreeChart0.getBackgroundImageAlpha();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertEquals(0.5F, float0, 0.01F);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultBoxAndWhiskerCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        jFreeChart0.handleClick((-4), 58, chartRenderingInfo0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBorderPaint(multiplePiePlot0.DEFAULT_BACKGROUND_PAINT);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("e(CjwNOQXv[YgPx" , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        int int0 = jFreeChart0.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(15, int0);
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultBoxAndWhiskerCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.Color color0 = ((java.awt.Color)(jFreeChart0.getBorderPaint()));
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, color0.getGreen());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.getTextAntiAlias();
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset();
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(compassPlot0)));
        boolean boolean0 = jFreeChart0.isNotify();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(boolean0);
    }
}

