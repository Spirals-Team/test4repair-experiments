package org.jfree.chart.renderer.category;


public class StatisticalBarRenderer_ESTest extends org.jfree.chart.renderer.category.StatisticalBarRenderer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        java.awt.geom.Line2D.Double line2D_Double0 = new java.awt.geom.Line2D.Double(0.0 , 0.0 , 0.0 , (-674.30623696));
        java.awt.Rectangle rectangle0 = line2D_Double0.getBounds();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.AreaRenderer areaRenderer0 = new org.jfree.chart.renderer.category.AreaRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState0 = areaRenderer0.initialise(((java.awt.Graphics2D)(null)), rectangle0, categoryPlot0, (-675), plotRenderingInfo0);
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryItemRendererState0.setBarWidth(0.2);
        org.jfree.chart.axis.PeriodAxis periodAxis0 = new org.jfree.chart.axis.PeriodAxis("org.jfree.chart.renderer.xy.XYLine3DRenderer");
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        try {
            statisticalBarRenderer0.drawHorizontalItem(((java.awt.Graphics2D)(null)), categoryItemRendererState0, rectangle0, categoryPlot0, categoryAxis0, periodAxis0, defaultStatisticalCategoryDataset0, (-675), (-675));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        java.awt.geom.Line2D.Double line2D_Double0 = new java.awt.geom.Line2D.Double(0.0 , 0.0 , 0.0 , (-674.30623696));
        java.awt.Rectangle rectangle0 = line2D_Double0.getBounds();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState0 = statisticalBarRenderer0.createState(plotRenderingInfo0);
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        try {
            statisticalBarRenderer0.drawVerticalItem(((java.awt.Graphics2D)(null)), categoryItemRendererState0, rectangle0, categoryPlot0, categoryAxis0, ((org.jfree.chart.axis.ValueAxis)(null)), defaultStatisticalCategoryDataset0, (-1078), 1);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState0 = new org.jfree.chart.renderer.category.CategoryItemRendererState(((org.jfree.chart.plot.PlotRenderingInfo)(null)));
        javax.swing.text.DefaultCaret defaultCaret0 = new javax.swing.text.DefaultCaret();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        java.util.SimpleTimeZone simpleTimeZone0 = ((java.util.SimpleTimeZone)(org.jfree.chart.axis.SegmentedTimeline.NO_DST_TIME_ZONE));
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("" , ((java.util.TimeZone)(simpleTimeZone0)));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        try {
            statisticalBarRenderer0.drawItem(((java.awt.Graphics2D)(null)), categoryItemRendererState0, defaultCaret0, combinedDomainCategoryPlot0, categoryAxis0, dateAxis0, defaultStatisticalCategoryDataset0, (-4307), (-2422), 0);
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
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        javax.swing.text.StyleConstants styleConstants0 = ((javax.swing.text.StyleConstants)(javax.swing.text.AttributeSet.ResolveAttribute));
        boolean boolean0 = statisticalBarRenderer0.equals(styleConstants0);
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
        statisticalBarRenderer0.setMinimumBarLength((-1350.113));
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setErrorIndicatorStroke(((java.awt.Stroke)(null)));
        org.junit.Assert.assertEquals(0.0, statisticalBarRenderer0.getLowerClip(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.SystemColor systemColor0 = java.awt.SystemColor.controlDkShadow;
        statisticalBarRenderer0.setErrorIndicatorPaint(systemColor0);
        java.awt.SystemColor systemColor1 = ((java.awt.SystemColor)(statisticalBarRenderer0.getErrorIndicatorPaint()));
        org.junit.Assert.assertSame(systemColor1, systemColor0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(statisticalBarRenderer0.getErrorIndicatorStroke()));
        org.junit.Assert.assertEquals(0.5F, basicStroke0.getLineWidth(), 0.01F);
    }
}

