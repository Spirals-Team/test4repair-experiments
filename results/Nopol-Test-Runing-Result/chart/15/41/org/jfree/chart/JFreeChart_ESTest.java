package org.jfree.chart;


public class JFreeChart_ESTest extends org.jfree.chart.JFreeChart_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(4186.956275287811);
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("ItemLabelAnchor.INSIDE4" , ((org.jfree.chart.plot.Plot)(meterPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , true , true , false , true , true);
        jFreeChart0.addProgressListener(chartPanel0);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(15, 15);
        org.junit.Assert.assertEquals(15, bufferedImage0.getHeight());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(15, bufferedImage0.getWidth());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        org.jfree.data.statistics.DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder0 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(defaultMultiValueCategoryDataset0)) , tableOrder0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Location not recognised." , ((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , 500 , 54 , 2796 , 2145590142 , (-891) , 0 , false , true , false , false , false , true);
        jFreeChart0.addChangeListener(chartPanel0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent0 = new org.jfree.chart.event.PlotChangeEvent(((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        jFreeChart0.notifyListeners(plotChangeEvent0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 100, ((double)(10)), (-543.196), chartRenderingInfo0);
        org.junit.Assert.assertEquals(10, bufferedImage0.getWidth());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, standardEntityCollection0.getEntityCount());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertEquals(100, bufferedImage0.getHeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("n~RYw3K[pPlSPhV*RQ");
        java.util.SimpleTimeZone simpleTimeZone0 = ((java.util.SimpleTimeZone)(org.jfree.chart.axis.SegmentedTimeline.NO_DST_TIME_ZONE));
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("n~RYw3K[pPlSPhV*RQ" , ((java.util.TimeZone)(simpleTimeZone0)));
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , categoryAxis3D0.DEFAULT_AXIS_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)) , true);
        jFreeChart0.setBackgroundImageAlignment(java.lang.Integer.MAX_VALUE);
        org.junit.Assert.assertEquals(2147483647, jFreeChart0.getBackgroundImageAlignment());
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("^+P48x" , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        jFreeChart0.setBackgroundImageAlignment(10);
        jFreeChart0.setBackgroundImageAlignment((-1073741824));
        org.junit.Assert.assertEquals((-1073741824), jFreeChart0.getBackgroundImageAlignment());
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.chart.plot.FastScatterPlot fastScatterPlot0 = new org.jfree.chart.plot.FastScatterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(fastScatterPlot0)));
        jFreeChart0.setBackgroundImageAlignment(10);
        int int0 = jFreeChart0.getBackgroundImageAlignment();
        org.junit.Assert.assertEquals(10, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(18 , (-1353) , 64);
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("[FA?V<1]s14L%" , ((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        jFreeChart0.setBackgroundPaint(waferMapPlot0.DEFAULT_GRIDLINE_PAINT);
        jFreeChart0.setBackgroundPaint(waferMapPlot0.DEFAULT_CROSSHAIR_PAINT);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new org.jfree.data.general.DefaultKeyedValuesDataset();
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)(defaultKeyedValuesDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(piePlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend(10);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertNull(legendTitle0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset();
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(thermometerPlot0)));
        org.jfree.chart.event.ChartProgressEvent chartProgressEvent0 = new org.jfree.chart.event.ChartProgressEvent(((java.lang.Object)(defaultValueDataset0)) , jFreeChart0 , 2 , 3);
        jFreeChart0.notifyListeners(chartProgressEvent0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle2D_Double0)));
        org.junit.Assert.assertEquals(1, standardEntityCollection0.getEntityCount());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(piePlot3D0)));
        jFreeChart0.getTitle();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("l-,B|;U[ok^s.>|" , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.removeLegend();
        jFreeChart0.getSubtitles();
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        java.awt.Font font0 = org.jfree.chart.annotations.XYTextAnnotation.DEFAULT_FONT;
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset((-2325) , (-2325) , 1886610481);
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , font0 , ((org.jfree.chart.plot.Plot)(waferMapPlot0)) , false);
        int int0 = jFreeChart0.getSubtitleCount();
        org.junit.Assert.assertEquals(0, int0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        java.awt.Font font0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 'listener' argument." , font0 , ((org.jfree.chart.plot.Plot)(piePlot3D0)) , false);
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertNull(legendTitle0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("&*3[N" , ((org.jfree.chart.plot.Plot)(meterPlot0)));
        jFreeChart0.getBackgroundPaint();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        org.jfree.chart.plot.RingPlot ringPlot0 = new org.jfree.chart.plot.RingPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("}0v-caZ:L:Z/" , ((org.jfree.chart.plot.Plot)(ringPlot0)));
        jFreeChart0.setBackgroundImageAlpha(0.0F);
        float float0 = jFreeChart0.getBackgroundImageAlpha();
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setAntiAlias(false);
        boolean boolean0 = jFreeChart0.getAntiAlias();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("l-,B|;U[ok^s.>|" , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(300, 10);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.title.DateTitle dateTitle0 = new org.jfree.chart.title.DateTitle();
        jFreeChart0.drawTitle(dateTitle0, sunGraphics2D0, rectangle2D_Double0, false);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(bufferedImage0.isAlphaPremultiplied());
        org.junit.Assert.assertEquals(300, bufferedImage0.getTileWidth());
        org.junit.Assert.assertEquals(10, bufferedImage0.getHeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.addProgressListener(((org.jfree.chart.event.ChartProgressListener)(null)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 15, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Point2D.Float point2D_Float0 = new java.awt.geom.Point2D.Float(1583.0F , 0.0F);
        try {
            jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(null)), ((java.awt.geom.Point2D)(point2D_Float0)), chartRenderingInfo0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("n~RYw3K[pPlSPhV*RQ");
        java.util.SimpleTimeZone simpleTimeZone0 = ((java.util.SimpleTimeZone)(org.jfree.chart.axis.SegmentedTimeline.NO_DST_TIME_ZONE));
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("n~RYw3K[pPlSPhV*RQ" , ((java.util.TimeZone)(simpleTimeZone0)));
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , categoryAxis3D0.DEFAULT_TICK_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)) , true);
        jFreeChart0.setNotify(true);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(992.1174858822);
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("org.jfree.chart.event.ChartProgressListener" , meterPlot0.DEFAULT_LABEL_FONT , ((org.jfree.chart.plot.Plot)(meterPlot0)) , false);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        jFreeChart0.setNotify(false);
        boolean boolean0 = jFreeChart0.isNotify();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(18 , (-1353) , 64);
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("[FA?V<1]s14L%" , ((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        jFreeChart0.clearSubtitles();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Bl-,B|;U[ok^s.>|" , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertNotNull(legendTitle0);
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        java.awt.Font font0 = org.jfree.chart.plot.CompassPlot.DEFAULT_LABEL_FONT;
        org.jfree.chart.plot.PolarPlot polarPlot0 = new org.jfree.chart.plot.PolarPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("^@" , font0 , ((org.jfree.chart.plot.Plot)(polarPlot0)) , true);
        org.jfree.chart.title.TextTitle textTitle0 = jFreeChart0.getTitle();
        jFreeChart0.setTitle(textTitle0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[3];
        java.lang.Number[][] numberArray0 = new java.lang.Number[0][0];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(stringArray0 , numberArray0 , numberArray0);
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        jFreeChart0.setTitle(((org.jfree.chart.title.TextTitle)(null)));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        org.jfree.data.xy.DefaultTableXYDataset defaultTableXYDataset0 = new org.jfree.data.xy.DefaultTableXYDataset(true);
        org.jfree.chart.renderer.DefaultPolarItemRenderer defaultPolarItemRenderer0 = new org.jfree.chart.renderer.DefaultPolarItemRenderer();
        org.jfree.chart.plot.PolarPlot polarPlot0 = new org.jfree.chart.plot.PolarPlot(((org.jfree.data.xy.XYDataset)(defaultTableXYDataset0)) , ((org.jfree.chart.axis.ValueAxis)(null)) , ((org.jfree.chart.renderer.PolarItemRenderer)(defaultPolarItemRenderer0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(polarPlot0)));
        jFreeChart0.getSubtitleCount();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        boolean boolean0 = jFreeChart0.isBorderVisible();
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(992.1174858822);
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("org.jfree.chart.event.ChartProgressListener" , meterPlot0.DEFAULT_LABEL_FONT , ((org.jfree.chart.plot.Plot)(meterPlot0)) , false);
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.title.LegendTitle legendTitle0 = new org.jfree.chart.title.LegendTitle(((org.jfree.chart.LegendItemSource)(meterPlot0)) , ((org.jfree.chart.block.Arrangement)(borderArrangement0)) , ((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent0 = new org.jfree.chart.event.TitleChangeEvent(((org.jfree.chart.title.Title)(legendTitle0)));
        jFreeChart0.titleChanged(titleChangeEvent0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(meterPlot0)));
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent0 = new org.jfree.chart.event.PlotChangeEvent(((org.jfree.chart.plot.Plot)(meterPlot0)));
        jFreeChart0.plotChanged(plotChangeEvent0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D("n~RYw3K[pPlSPhV*RQ");
        java.util.SimpleTimeZone simpleTimeZone0 = ((java.util.SimpleTimeZone)(org.jfree.chart.axis.SegmentedTimeline.NO_DST_TIME_ZONE));
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("n~RYw3K[pPlSPhV*RQ" , ((java.util.TimeZone)(simpleTimeZone0)));
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , categoryAxis3D0.DEFAULT_AXIS_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)) , true);
        org.jfree.chart.util.HorizontalAlignment horizontalAlignment0 = org.jfree.chart.util.HorizontalAlignment.RIGHT;
        org.jfree.chart.util.VerticalAlignment verticalAlignment0 = org.jfree.chart.title.Title.DEFAULT_VERTICAL_ALIGNMENT;
        org.jfree.chart.block.FlowArrangement flowArrangement0 = new org.jfree.chart.block.FlowArrangement(horizontalAlignment0 , verticalAlignment0 , 0.4 , 0.0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(flowArrangement0)));
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle(blockContainer0);
        jFreeChart0.removeSubtitle(compositeTitle0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(xYPlot0)));
        jFreeChart0.fireChartChanged();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-215.1193906479455));
        org.jfree.chart.plot.FastScatterPlot fastScatterPlot0 = new org.jfree.chart.plot.FastScatterPlot(((float[][])(null)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(fastScatterPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = jFreeChart0.getLegend();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertNotNull(legendTitle0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.AreaRenderer areaRenderer0 = new org.jfree.chart.renderer.category.AreaRenderer();
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(null)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , areaRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(spiderWebPlot0)) , true);
        jFreeChart0.getPlot();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart1 = ((org.jfree.chart.JFreeChart)(jFreeChart0.clone()));
        org.junit.Assert.assertEquals(0, jFreeChart1.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart1.isBorderVisible());
        org.junit.Assert.assertNotSame(jFreeChart1, jFreeChart0);
        org.junit.Assert.assertTrue(jFreeChart1.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        org.jfree.chart.JFreeChart jFreeChart1 = ((org.jfree.chart.JFreeChart)(jFreeChart0.clone()));
        org.junit.Assert.assertNotSame(jFreeChart1, jFreeChart0);
        org.junit.Assert.assertFalse(jFreeChart1.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart1.equals(((java.lang.Object)(jFreeChart0))));
        org.junit.Assert.assertTrue(jFreeChart1.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(8.0 , ((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 'plot' argument." , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        boolean boolean0 = jFreeChart0.equals("Null 'plot' argument.");
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.removeProgressListener(((org.jfree.chart.event.ChartProgressListener)(null)));
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(8.0 , ((java.lang.String)(null)));
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 'plot' argument." , ((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , 1850 , 24 , (-3565) , 24 , (-3565) , 500 , true , true , true , false , true , false);
        jFreeChart0.removeProgressListener(chartPanel0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("l-,B|;U[ok^s.>|" , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , false , true , false , false , false);
        jFreeChart0.removeChangeListener(chartPanel0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBorderVisible(true);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(70, 288, (-1593.6), 82.1320628302, ((org.jfree.chart.ChartRenderingInfo)(null)));
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(288, bufferedImage0.getTileHeight());
        org.junit.Assert.assertEquals(70, bufferedImage0.getTileWidth());
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("[FA?V<1]s14L%" , ((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 18, chartRenderingInfo0);
        jFreeChart0.setBackgroundImage(bufferedImage0);
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(10, bufferedImage0.getWidth());
        org.junit.Assert.assertEquals(18, bufferedImage0.getTileHeight());
        jFreeChart0.createBufferedImage(10, 10, 10, chartRenderingInfo0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(992.1174858822);
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("org.jfree.chart.event.ChartProgressListener" , meterPlot0.DEFAULT_LABEL_FONT , ((org.jfree.chart.plot.Plot)(meterPlot0)) , false);
        jFreeChart0.setBackgroundImageAlpha(1.0F);
        org.junit.Assert.assertEquals(1.0F, jFreeChart0.getBackgroundImageAlpha(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBackgroundImageAlpha(0.5F);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBackgroundImageAlignment(15);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(15, jFreeChart0.getBackgroundImageAlignment());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("[FA?V<1]s14L%" , ((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 18, chartRenderingInfo0);
        jFreeChart0.setBackgroundImage(bufferedImage0);
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
        org.junit.Assert.assertEquals(18, bufferedImage0.getHeight());
        org.junit.Assert.assertEquals(10, bufferedImage0.getWidth());
        jFreeChart0.setBackgroundImage(((java.awt.Image)(null)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset(18 , (-1353) , 64);
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("[FA?V<1]s14L%" , ((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 18, chartRenderingInfo0);
        jFreeChart0.setBackgroundImage(bufferedImage0);
        jFreeChart0.setBackgroundImage(bufferedImage0);
        org.junit.Assert.assertEquals(10, bufferedImage0.getTileWidth());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(18, bufferedImage0.getHeight());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(2, bufferedImage0.getType());
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset();
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(meterPlot0)));
        jFreeChart0.setBackgroundImage(((java.awt.Image)(null)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("l-,B|;U[ok^s.>|" , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.setBackgroundPaint(combinedRangeXYPlot0.DEFAULT_GRIDLINE_PAINT);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBackgroundPaint(multiplePiePlot0.DEFAULT_OUTLINE_PAINT);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[2];
        java.lang.Number[][] numberArray0 = new java.lang.Number[0][1];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(stringArray0 , numberArray0 , numberArray0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setTextAntiAlias(true);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setAntiAlias(false);
        jFreeChart0.setAntiAlias(false);
        org.junit.Assert.assertFalse(jFreeChart0.getAntiAlias());
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setAntiAlias(true);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.getAntiAlias());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset((-2020.3));
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(compassPlot0)));
        org.jfree.chart.title.DateTitle dateTitle0 = new org.jfree.chart.title.DateTitle();
        jFreeChart0.addSubtitle(1, ((org.jfree.chart.title.Title)(dateTitle0)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[3];
        java.lang.Number[][] numberArray0 = new java.lang.Number[0][0];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(stringArray0 , numberArray0 , numberArray0);
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        jFreeChart0.getSubtitle(0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Bl-,B|;U[ok^s.>|" , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        org.jfree.chart.title.LegendTitle legendTitle0 = new org.jfree.chart.title.LegendTitle(((org.jfree.chart.LegendItemSource)(combinedRangeXYPlot0)));
        org.jfree.chart.block.BlockContainer blockContainer0 = legendTitle0.getItemContainer();
        org.jfree.chart.title.CompositeTitle compositeTitle0 = new org.jfree.chart.title.CompositeTitle(blockContainer0);
        jFreeChart0.addSubtitle(((org.jfree.chart.title.Title)(compositeTitle0)));
        jFreeChart0.getLegend((-1));
        org.junit.Assert.assertEquals(2, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        jFreeChart0.setTitle("Null 'listener' argument.");
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 18, chartRenderingInfo0);
        jFreeChart0.setBackgroundImage(bufferedImage0);
        java.awt.image.BufferedImage bufferedImage1 = ((java.awt.image.BufferedImage)(jFreeChart0.getBackgroundImage()));
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertEquals(2, bufferedImage1.getType());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(18, bufferedImage1.getTileHeight());
        org.junit.Assert.assertNotNull(bufferedImage1);
        org.junit.Assert.assertEquals(10, bufferedImage1.getTileWidth());
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        org.jfree.chart.plot.PolarPlot polarPlot0 = new org.jfree.chart.plot.PolarPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(polarPlot0)));
        jFreeChart0.setTitle("Requires 'count' > 0.");
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(992.1174858822);
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("org.jfree.chart.event.ChartProgressListener" , meterPlot0.DEFAULT_LABEL_FONT , ((org.jfree.chart.plot.Plot)(meterPlot0)) , false);
        jFreeChart0.setTitle(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setPadding(multiplePiePlot0.DEFAULT_INSETS);
        jFreeChart0.getPadding();
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(992.1174858822);
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("org.jfree.chart.event.ChartProgressListener" , meterPlot0.DEFAULT_LABEL_FONT , ((org.jfree.chart.plot.Plot)(meterPlot0)) , false);
        java.awt.RenderingHints renderingHints0 = jFreeChart0.getRenderingHints();
        jFreeChart0.setRenderingHints(renderingHints0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("q07+ZEN" , ((java.awt.Font)(null)) , ((org.jfree.chart.plot.Plot)(thermometerPlot0)) , false);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Bl-,B|;U[ok^s.>|" , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.getPadding();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("l-,B|;U[ok^s.>|" , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.setTextAntiAlias(false);
        jFreeChart0.getTextAntiAlias();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.Color color0 = ((java.awt.Color)(jFreeChart0.getBackgroundPaint()));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertNull(color0);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBorderStroke(multiplePiePlot0.DEFAULT_OUTLINE_STROKE);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("series" , ((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(jFreeChart0.getBorderStroke()));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Bl-,B|;U[ok^s.>|" , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        jFreeChart0.getXYPlot();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("l-,B|;U[ok^s.>|" , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        java.util.List list0 = jFreeChart0.getSubtitles();
        jFreeChart0.setSubtitles(list0);
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        jFreeChart0.getCategoryPlot();
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[3];
        org.jfree.chart.JFreeChart.main(stringArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(combinedDomainXYPlot0)));
        jFreeChart0.getBackgroundImage();
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        java.awt.Font font0 = org.jfree.chart.annotations.XYTextAnnotation.DEFAULT_FONT;
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = new org.jfree.data.general.WaferMapDataset((-2325) , (-2325) , 1886610481);
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , font0 , ((org.jfree.chart.plot.Plot)(waferMapPlot0)) , false);
        jFreeChart0.getAntiAlias();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        float float0 = jFreeChart0.getBackgroundImageAlpha();
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(0.5F, float0, 0.01F);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(waferMapPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        jFreeChart0.handleClick(18, 18, chartRenderingInfo0);
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        jFreeChart0.setBorderPaint(multiplePiePlot0.DEFAULT_BACKGROUND_PAINT);
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("l-,B|;U[ok^s.>|" , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(300, 10);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        jFreeChart0.draw(((java.awt.Graphics2D)(sunGraphics2D0)), ((java.awt.geom.Rectangle2D)(rectangle2D_Double0)), ((org.jfree.chart.ChartRenderingInfo)(null)));
        org.junit.Assert.assertEquals((-8355712), sunGraphics2D0.pixel);
        org.junit.Assert.assertEquals(10, bufferedImage0.getTileHeight());
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-215.1193906479455));
        org.jfree.chart.plot.FastScatterPlot fastScatterPlot0 = new org.jfree.chart.plot.FastScatterPlot(((float[][])(null)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(fastScatterPlot0)));
        java.awt.Color color0 = ((java.awt.Color)(jFreeChart0.getBorderPaint()));
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(0, color0.getBlue());
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        org.jfree.data.general.DefaultValueDataset defaultValueDataset0 = new org.jfree.data.general.DefaultValueDataset(992.1174858822);
        org.jfree.chart.plot.MeterPlot meterPlot0 = new org.jfree.chart.plot.MeterPlot(((org.jfree.data.general.ValueDataset)(defaultValueDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("org.jfree.chart.event.ChartProgressListener" , meterPlot0.DEFAULT_LABEL_FONT , ((org.jfree.chart.plot.Plot)(meterPlot0)) , false);
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.title.LegendTitle legendTitle0 = new org.jfree.chart.title.LegendTitle(((org.jfree.chart.LegendItemSource)(meterPlot0)) , ((org.jfree.chart.block.Arrangement)(borderArrangement0)) , ((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        jFreeChart0.addLegend(legendTitle0);
        legendTitle0.setItemFont(jFreeChart0.DEFAULT_TITLE_FONT);
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Bl-,B|;U[ok^s.>|" , ((org.jfree.chart.plot.Plot)(combinedRangeXYPlot0)));
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , false , true , false , false , true);
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        jFreeChart0.removeLegend();
        org.junit.Assert.assertEquals(0, jFreeChart0.getSubtitleCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.AreaRenderer areaRenderer0 = new org.jfree.chart.renderer.category.AreaRenderer();
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(null)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , areaRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(spiderWebPlot0)) , true);
        jFreeChart0.getTextAntiAlias();
        org.junit.Assert.assertTrue(jFreeChart0.isNotify());
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(defaultKeyedValues2DDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("series" , ((org.jfree.chart.plot.Plot)(spiderWebPlot0)));
        boolean boolean0 = jFreeChart0.isNotify();
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(1, jFreeChart0.getSubtitleCount());
        org.junit.Assert.assertFalse(jFreeChart0.isBorderVisible());
    }
}

