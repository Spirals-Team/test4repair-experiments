package org.jfree.chart.renderer.category;


public class StatisticalBarRenderer_ESTest extends org.jfree.chart.renderer.category.StatisticalBarRenderer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setErrorIndicatorPaint(((java.awt.Paint)(null)));
        java.awt.Color color0 = ((java.awt.Color)(statisticalBarRenderer0.getErrorIndicatorPaint()));
        org.junit.Assert.assertNull(color0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE));
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Hb2UMs5>S9" , ((org.jfree.chart.plot.Plot)(categoryPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState0 = new org.jfree.chart.renderer.category.CategoryItemRendererState(plotRenderingInfo0);
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("Hb2UMs5>S9");
        org.jfree.chart.axis.NumberAxis3D numberAxis3D0 = new org.jfree.chart.axis.NumberAxis3D("Hb2UMs5>S9");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        try {
            statisticalBarRenderer0.drawVerticalItem(sunGraphics2D0, categoryItemRendererState0, rectangle2D_Double0, categoryPlot0, subCategoryAxis0, numberAxis3D0, defaultStatisticalCategoryDataset0, (-1), 10);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(((double)(statisticalBarRenderer0.ZERO)) , "");
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        javax.swing.text.DefaultCaret defaultCaret0 = new javax.swing.text.DefaultCaret();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(cyclicNumberAxis0.DEFAULT_AXIS_LABEL_INSETS.createOutsetRectangle(((java.awt.geom.Rectangle2D)(defaultCaret0)))));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(((org.jfree.chart.ChartRenderingInfo)(null)));
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState0 = statisticalBarRenderer0.initialise(((java.awt.Graphics2D)(null)), rectangle2D_Double0, combinedRangeCategoryPlot0, 10, plotRenderingInfo0);
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        try {
            statisticalBarRenderer0.drawHorizontalItem(((java.awt.Graphics2D)(null)), categoryItemRendererState0, rectangle2D_Double0, combinedRangeCategoryPlot0, categoryAxis3D0, cyclicNumberAxis0, defaultStatisticalCategoryDataset0, (-2627), (-2636));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(747.2790210091 , 0.0 , 0.0 , 0.0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean0 = statisticalBarRenderer0.equals(rectangle2D_Double0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.junit.Assert.assertTrue(statisticalBarRenderer1.equals(((java.lang.Object)(statisticalBarRenderer0))));
        statisticalBarRenderer0.setDrawBarOutline(true);
        boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
        org.junit.Assert.assertFalse(statisticalBarRenderer1.equals(((java.lang.Object)(statisticalBarRenderer0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(org.jfree.chart.axis.CyclicNumberAxis.DEFAULT_ADVANCE_LINE_STROKE));
        statisticalBarRenderer0.setErrorIndicatorStroke(basicStroke0);
        org.junit.Assert.assertEquals(1, statisticalBarRenderer0.getPassCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(statisticalBarRenderer0.getErrorIndicatorStroke()));
        org.junit.Assert.assertEquals(0.5F, basicStroke0.getLineWidth(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Color color0 = ((java.awt.Color)(statisticalBarRenderer0.getErrorIndicatorPaint()));
        org.junit.Assert.assertEquals(128, color0.getGreen());
    }
}

