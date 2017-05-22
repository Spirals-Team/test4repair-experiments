package org.jfree.chart.renderer.category;


public class StatisticalBarRenderer_ESTest extends org.jfree.chart.renderer.category.StatisticalBarRenderer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        org.jfree.chart.renderer.category.CategoryStepRenderer.State categoryStepRenderer_State0 = ((org.jfree.chart.renderer.category.CategoryStepRenderer.State)(categoryStepRenderer0.createState(plotRenderingInfo0)));
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE));
        categoryStepRenderer_State0.setBarWidth(0.05);
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        try {
            statisticalBarRenderer0.drawItem(((java.awt.Graphics2D)(null)), categoryStepRenderer_State0, rectangle2D_Double0, combinedDomainCategoryPlot0, categoryAxis3D0, numberAxis0, defaultStatisticalCategoryDataset0, (-629), (-629), 10);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.plot.CompassPlot compassPlot0 = new org.jfree.chart.plot.CompassPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(compassPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 15, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState0 = statisticalBarRenderer0.createState(plotRenderingInfo0);
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(chartRenderingInfo0.getChartArea()));
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryItemRendererState0.setBarWidth(1107.103);
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("org.jfree.chart.event.ChartProgressListener");
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D("G!>VUq 6Nv>6<");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        try {
            statisticalBarRenderer0.drawHorizontalItem(sunGraphics2D0, categoryItemRendererState0, rectangle2D_Double0, categoryPlot0, extendedCategoryAxis0, numberAxis3D0, defaultStatisticalCategoryDataset0, (-2185), 2893);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE));
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean0 = statisticalBarRenderer0.equals(rectangle2D_Double0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.junit.Assert.assertTrue(statisticalBarRenderer1.equals(((java.lang.Object)(statisticalBarRenderer0))));
        statisticalBarRenderer1.setMinimumBarLength((-580.8));
        boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
        org.junit.Assert.assertFalse(statisticalBarRenderer1.equals(((java.lang.Object)(statisticalBarRenderer0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setErrorIndicatorPaint(((java.awt.Paint)(null)));
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(statisticalBarRenderer1.equals(((java.lang.Object)(statisticalBarRenderer0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(statisticalBarRenderer0.getErrorIndicatorStroke()));
        statisticalBarRenderer0.setErrorIndicatorStroke(basicStroke0);
        org.junit.Assert.assertEquals(0.5F, basicStroke0.getLineWidth(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Color color0 = ((java.awt.Color)(statisticalBarRenderer0.getErrorIndicatorPaint()));
        org.junit.Assert.assertEquals(128, color0.getBlue());
    }
}

