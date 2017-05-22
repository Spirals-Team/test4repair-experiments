package org.jfree.chart.renderer.category;


public class StatisticalBarRenderer_ESTest extends org.jfree.chart.renderer.category.StatisticalBarRenderer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE));
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer();
        org.jfree.chart.renderer.category.CategoryStepRenderer.State categoryStepRenderer_State0 = ((org.jfree.chart.renderer.category.CategoryStepRenderer.State)(categoryStepRenderer0.createState(((org.jfree.chart.plot.PlotRenderingInfo)(null)))));
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis("A");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)));
        org.jfree.chart.axis.LogAxis logAxis0 = new org.jfree.chart.axis.LogAxis("A");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        try {
            statisticalBarRenderer0.drawVerticalItem(((java.awt.Graphics2D)(null)), categoryStepRenderer_State0, rectangle2D_Double0, combinedDomainCategoryPlot0, extendedCategoryAxis0, logAxis0, defaultStatisticalCategoryDataset0, (-27), 730);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        java.awt.geom.Line2D.Double line2D_Double0 = new java.awt.geom.Line2D.Double(3531.11978372443 , 3531.11978372443 , 3531.11978372443 , 3531.11978372443);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean0 = statisticalBarRenderer0.equals(line2D_Double0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.chart.renderer.xy.XYDifferenceRenderer xYDifferenceRenderer0 = new org.jfree.chart.renderer.xy.XYDifferenceRenderer();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(((double)(xYDifferenceRenderer0.ZERO)) , ((double)(xYDifferenceRenderer0.ZERO)) , ((double)(xYDifferenceRenderer0.ZERO)) , (-944.8608));
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer(true);
        org.jfree.chart.renderer.category.CategoryStepRenderer.State categoryStepRenderer_State0 = ((org.jfree.chart.renderer.category.CategoryStepRenderer.State)(categoryStepRenderer0.createState(((org.jfree.chart.plot.PlotRenderingInfo)(null)))));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("1w6_q^~*yhd)eQ^a{/#");
        try {
            statisticalBarRenderer0.drawItem(((java.awt.Graphics2D)(null)), categoryStepRenderer_State0, rectangle2D_Double0, combinedDomainCategoryPlot0, subCategoryAxis0, cyclicNumberAxis0, defaultStatisticalCategoryDataset0, (-3268), 0, (-915));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setErrorIndicatorStroke(((java.awt.Stroke)(null)));
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(statisticalBarRenderer0.getErrorIndicatorStroke()));
        org.junit.Assert.assertNull(basicStroke0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setErrorIndicatorPaint(((java.awt.Paint)(null)));
        java.awt.Color color0 = ((java.awt.Color)(statisticalBarRenderer0.getErrorIndicatorPaint()));
        org.junit.Assert.assertNull(color0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(statisticalBarRenderer0.getErrorIndicatorStroke()));
        org.junit.Assert.assertEquals(0.5F, basicStroke0.getLineWidth(), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Color color0 = ((java.awt.Color)(statisticalBarRenderer0.getErrorIndicatorPaint()));
        org.junit.Assert.assertEquals(128, color0.getGreen());
    }
}

