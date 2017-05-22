package org.jfree.chart.renderer.category;


public class AbstractCategoryItemRenderer_ESTest extends org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(true);
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("9mT*?![MZd%3=" , stackedBarRenderer3D0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(piePlot0)) , true);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 4, ((double)(1.0F)), 1.0E-5, chartRenderingInfo0);
        org.jfree.chart.BufferedImageRenderingSource bufferedImageRenderingSource0 = new org.jfree.chart.BufferedImageRenderingSource(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImageRenderingSource0.createGraphics2D()));
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot(((org.jfree.data.general.ValueDataset)(null)));
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        stackedBarRenderer3D0.drawItemLabel(sunGraphics2D0, plotOrientation0, defaultBoxAndWhiskerCategoryDataset0, 2, 0, true, 0.0, 15, false);
        org.junit.Assert.assertEquals(1, stackedBarRenderer3D0.getPassCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        java.awt.Color color0 = ((java.awt.Color)(org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_PAINT));
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)));
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(((double)(waterfallBarRenderer0.ZERO)) , (-1.7976931348623157E308) , false);
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1, 7);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis((-2829.6797) , "+>pM`C L");
        stackedBarRenderer3D0.drawRangeLine(sunGraphics2D0, categoryPlot0, cyclicNumberAxis0, rectangle2D_Float0, 2.0F, cyclicNumberAxis0.DEFAULT_ADVANCE_LINE_PAINT, cyclicNumberAxis0.DEFAULT_AXIS_LINE_STROKE);
        org.junit.Assert.assertEquals(0.0, cyclicNumberAxis0.getFixedDimension(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(false);
        stackedBarRenderer3D0.setSeriesToolTipGenerator(2026, ((org.jfree.chart.labels.CategoryToolTipGenerator)(null)));
        org.junit.Assert.assertEquals(0.0, stackedBarRenderer3D0.getBase(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(true);
        org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation0 = new org.jfree.chart.annotations.CategoryLineAnnotation(((java.lang.Comparable)(12.0)) , 0.0 , ((java.lang.Comparable)(3.0)) , 2.5E-7 , stackedBarRenderer3D0.DEFAULT_PAINT , stackedBarRenderer3D0.DEFAULT_STROKE);
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        scatterRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryLineAnnotation0)));
        org.junit.Assert.assertFalse(scatterRenderer0.getBaseItemLabelsVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = lineRenderer3D0.getURLGenerator((-4859), 0, true);
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = scatterRenderer0.getSeriesItemLabelGenerator((-3001));
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false , false);
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D0 = new org.jfree.chart.axis.CategoryAxis3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(categoryAxis3D0)));
        org.jfree.chart.axis.ValueAxis valueAxis0 = lineAndShapeRenderer0.getRangeAxis(combinedDomainCategoryPlot0, (-1604));
        org.junit.Assert.assertNull(valueAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = ((org.jfree.chart.labels.StandardCategorySeriesLabelGenerator)(lineRenderer3D0.getLegendItemLabelGenerator()));
        org.junit.Assert.assertNotNull(standardCategorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer(true);
        org.jfree.data.Range range0 = stackedAreaRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(null)));
        org.junit.Assert.assertEquals(0.0, range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer(false);
        boolean boolean0 = statisticalLineAndShapeRenderer0.equals(categoryStepRenderer0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState0 = lineRenderer3D0.createState(plotRenderingInfo0);
        org.junit.Assert.assertEquals(0.0, categoryItemRendererState0.getBarWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , ((org.jfree.chart.plot.Plot)(combinedDomainCategoryPlot0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis();
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState0 = boxAndWhiskerRenderer0.initialise(sunGraphics2D0, ((java.awt.geom.Rectangle2D)(null)), combinedDomainCategoryPlot0, ((org.jfree.data.category.CategoryDataset)(null)), plotRenderingInfo0);
        groupedStackedBarRenderer0.createHotSpotBounds(sunGraphics2D0, ((java.awt.geom.Rectangle2D)(null)), combinedDomainCategoryPlot0, categoryAxis0, numberAxis0, defaultCategoryDataset0, 213, 2989, false, categoryItemRendererState0, ((java.awt.geom.Rectangle2D)(null)));
        org.junit.Assert.assertEquals(0, categoryItemRendererState0.getVisibleSeriesCount());
        org.junit.Assert.assertEquals(0, boxAndWhiskerRenderer0.getColumnCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false , false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer1 = ((org.jfree.chart.renderer.category.LineAndShapeRenderer)(lineAndShapeRenderer0.clone()));
        org.junit.Assert.assertTrue(lineAndShapeRenderer1.getAutoPopulateSeriesStroke());
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer1 = ((org.jfree.chart.renderer.category.StackedBarRenderer)(stackedBarRenderer0.clone()));
        org.junit.Assert.assertTrue(stackedBarRenderer1.getShadowsVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.data.Range range0 = lineRenderer3D0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(taskSeriesCollection0)), false);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        lineRenderer3D0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(null)), true);
        org.junit.Assert.assertTrue(lineRenderer3D0.getDrawOutlines());
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        lineRenderer3D0.setSeriesURLGenerator(3, ((org.jfree.chart.urls.CategoryURLGenerator)(null)), true);
        org.junit.Assert.assertEquals(8.0, org.jfree.chart.renderer.category.LineRenderer3D.DEFAULT_Y_OFFSET, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        lineRenderer3D0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(null)), true);
        org.junit.Assert.assertTrue(lineRenderer3D0.getBaseShapesFilled());
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = ganttRenderer0.getToolTipGenerator(6, 6, false);
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        lineRenderer3D0.setSeriesItemLabelGenerator(1109, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)), true);
        org.junit.Assert.assertTrue(lineRenderer3D0.getDataBoundsIncludesVisibleSeriesOnly());
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = lineRenderer3D0.getItemLabelGenerator((-1064), (-1064), true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        lineRenderer3D0.setPlot(combinedDomainCategoryPlot0);
        org.junit.Assert.assertEquals(10, org.jfree.chart.plot.Plot.MINIMUM_WIDTH_TO_DRAW);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalBarRenderer0.getSeriesToolTipGenerator(0);
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = categoryStepRenderer0.getPlot();
        org.junit.Assert.assertNull(categoryPlot0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        java.awt.font.FontRenderContext fontRenderContext0 = new java.awt.font.FontRenderContext(((java.awt.geom.AffineTransform)(null)) , true , false);
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = ((java.awt.geom.Rectangle2D.Float)(stackedBarRenderer3D0.DEFAULT_VALUE_LABEL_FONT.getStringBounds("", fontRenderContext0)));
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        try {
            stackedBarRenderer3D0.addEntity(standardEntityCollection0, rectangle2D_Float0, taskSeriesCollection0, (-32), 2093, false);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection0 = ganttRenderer0.getLegendItems();
        org.junit.Assert.assertEquals(0, legendItemCollection0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(false , true);
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
        org.jfree.chart.axis.NumberAxis numberAxis0 = ((org.jfree.chart.axis.NumberAxis)(statisticalLineAndShapeRenderer0.getRangeAxis(combinedRangeCategoryPlot0, 36)));
        org.junit.Assert.assertEquals(0.05, numberAxis0.getLowerMargin(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("oU4]\"$J2{%`&" , statisticalBarRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(categoryPlot0)) , true);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(3, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("oU4]\"$J2{%`&");
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        ganttRenderer0.drawAnnotations(sunGraphics2D0, rectangle2D_Double0, categoryAxis0, numberAxis0, layer0, plotRenderingInfo0);
        org.junit.Assert.assertTrue(org.jfree.chart.axis.NumberAxis.DEFAULT_AUTO_RANGE_INCLUDES_ZERO);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("oU4]\"$J2{%`&" , statisticalBarRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(categoryPlot0)) , true);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(3, 10, chartRenderingInfo0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.chart.axis.NumberAxis numberAxis0 = new org.jfree.chart.axis.NumberAxis("oU4]\"$J2{%`&");
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        ganttRenderer0.drawAnnotations(sunGraphics2D0, rectangle2D_Double0, categoryAxis0, numberAxis0, layer0, plotRenderingInfo0);
        org.junit.Assert.assertEquals(0.2, org.jfree.chart.renderer.category.BarRenderer.DEFAULT_ITEM_MARGIN, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = org.jfree.chart.plot.PlotOrientation.HORIZONTAL;
        scatterRenderer0.updateCrosshairValues(((org.jfree.chart.plot.CategoryCrosshairState)(null)), 3.0, 3.0, 4136.0304878086, 956, 0.2, (-1723.06979344618), plotOrientation0);
        org.junit.Assert.assertEquals(0, scatterRenderer0.getColumnCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier0 = scatterRenderer0.getDrawingSupplier();
        org.junit.Assert.assertNull(drawingSupplier0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = org.jfree.chart.plot.PlotOrientation.HORIZONTAL;
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = ((java.awt.geom.Rectangle2D.Double)(plotRenderingInfo0.getDataArea()));
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = new org.jfree.chart.util.RectangleInsets(0.0 , 0.0 , ((double)(scatterRenderer0.ZERO)) , 0.0);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType0 = org.jfree.chart.util.LengthAdjustmentType.CONTRACT;
        org.jfree.chart.block.LabelBlock labelBlock0 = new org.jfree.chart.block.LabelBlock("Base item URL generator not cloneable." , scatterRenderer0.DEFAULT_VALUE_LABEL_FONT , scatterRenderer0.DEFAULT_PAINT);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor0 = labelBlock0.getTextAnchor();
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(scatterRenderer0.calculateRangeMarkerTextAnchorPoint(((java.awt.Graphics2D)(null)), plotOrientation0, rectangle2D_Double0, rectangle2D_Double0, rectangleInsets0, lengthAdjustmentType0, rectangleAnchor0)));
        org.junit.Assert.assertEquals(0.0, point2D_Double0.x, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , 10 , 4024 , 10 , 4024 , (-476) , 15 , true , false , false , false , false , true);
        java.awt.Rectangle rectangle0 = chartPanel0.getVisibleRect();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType0 = org.jfree.chart.util.LengthAdjustmentType.CONTRACT;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = combinedDomainXYPlot0.getOrientation();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor0 = org.jfree.chart.util.RectangleAnchor.TOP_RIGHT;
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(lineRenderer3D0.calculateRangeMarkerTextAnchorPoint(((java.awt.Graphics2D)(null)), plotOrientation0, rectangle0, rectangle0, combinedDomainXYPlot0.DEFAULT_INSETS, lengthAdjustmentType0, rectangleAnchor0)));
        org.junit.Assert.assertEquals(4.0, point2D_Double0.y, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float(678.0728F , 678.0728F , 678.0728F , 0.0F);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(((org.jfree.chart.plot.Plot)(multiplePiePlot0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
        org.jfree.chart.BufferedImageRenderingSource bufferedImageRenderingSource0 = new org.jfree.chart.BufferedImageRenderingSource(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImageRenderingSource0.createGraphics2D()));
        org.jfree.chart.plot.FastScatterPlot fastScatterPlot0 = new org.jfree.chart.plot.FastScatterPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = fastScatterPlot0.getOrientation();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType0 = org.jfree.chart.util.LengthAdjustmentType.NO_CHANGE;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor0 = org.jfree.chart.util.RectangleAnchor.BOTTOM_RIGHT;
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(ganttRenderer0.calculateDomainMarkerTextAnchorPoint(sunGraphics2D0, plotOrientation0, rectangle2D_Float0, rectangle2D_Float0, multiplePiePlot0.DEFAULT_INSETS, lengthAdjustmentType0, rectangleAnchor0)));
        org.junit.Assert.assertEquals(674.0728149414062, point2D_Double0.y, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot(((org.jfree.data.category.CategoryDataset)(defaultStatisticalCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartPanel chartPanel0 = new org.jfree.chart.ChartPanel(jFreeChart0 , 10 , 4024 , 10 , 4024 , (-476) , 15 , true , false , false , false , false , true);
        java.awt.Rectangle rectangle0 = chartPanel0.getVisibleRect();
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.LogarithmicAxis logarithmicAxis0 = new org.jfree.chart.axis.LogarithmicAxis("ZOOM_RANGE_BOTH");
        org.jfree.chart.plot.CategoryMarker categoryMarker0 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)(1.0F)) , multiplePiePlot0.DEFAULT_OUTLINE_PAINT , combinedDomainCategoryPlot0.DEFAULT_OUTLINE_STROKE);
        lineRenderer3D0.drawRangeMarker(((java.awt.Graphics2D)(null)), combinedDomainCategoryPlot0, logarithmicAxis0, categoryMarker0, rectangle0);
        org.junit.Assert.assertFalse(combinedDomainCategoryPlot0.isRangeMinorGridlinesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.AreaRenderer areaRenderer0 = new org.jfree.chart.renderer.category.AreaRenderer();
        org.jfree.data.Range range0 = areaRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(null)), false);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("TS:EF4c");
        stackedBarRenderer0.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator0);
        org.junit.Assert.assertTrue(stackedBarRenderer0.getBaseCreateEntities());
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        java.awt.Color color0 = java.awt.Color.darkGray;
        org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation0 = new org.jfree.chart.annotations.CategoryLineAnnotation(((java.lang.Comparable)(ganttRenderer0.ZERO)) , ((double)(groupedStackedBarRenderer0.ZERO)) , ((java.lang.Comparable)(8.0)) , 12.0 , ((java.awt.Paint)(color0)) , lineRenderer3D0.DEFAULT_OUTLINE_STROKE);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        ganttRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryLineAnnotation0)), layer0);
        org.junit.Assert.assertTrue(ganttRenderer0.getBaseSeriesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        java.awt.Color color0 = ((java.awt.Color)(org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_PAINT));
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)));
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(((double)(waterfallBarRenderer0.ZERO)) , (-1.7976931348623157E308) , false);
        org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation0 = new org.jfree.chart.annotations.CategoryLineAnnotation(((java.lang.Comparable)(12.0)) , 12.0 , ((java.lang.Comparable)(0.2)) , 3.0 , stackedBarRenderer3D0.DEFAULT_VALUE_LABEL_PAINT , stackedBarRenderer3D0.DEFAULT_OUTLINE_STROKE);
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        stackedBarRenderer3D0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryLineAnnotation0)), layer0);
        org.junit.Assert.assertEquals(8.0, org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_Y_OFFSET, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        groupedStackedBarRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(null)), false);
        org.junit.Assert.assertEquals(2.0, groupedStackedBarRenderer0.getItemLabelAnchorOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        scatterRenderer0.setSeriesURLGenerator(6, ((org.jfree.chart.urls.CategoryURLGenerator)(null)), false);
        org.junit.Assert.assertTrue(scatterRenderer0.getAutoPopulateSeriesPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        scatterRenderer0.setSeriesToolTipGenerator(2, ((org.jfree.chart.labels.CategoryToolTipGenerator)(null)), true);
        org.junit.Assert.assertFalse(scatterRenderer0.getUseOutlinePaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.labels.StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator();
        lineRenderer3D0.setSeriesToolTipGenerator(1109, ((org.jfree.chart.labels.CategoryToolTipGenerator)(standardCategoryToolTipGenerator0)), false);
        org.junit.Assert.assertEquals(0, lineRenderer3D0.getRowCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        defaultCategoryItemRenderer0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)), false);
        org.junit.Assert.assertEquals(2.0, defaultCategoryItemRenderer0.getItemLabelAnchorOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.labels.StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator();
        ganttRenderer0.setSeriesItemLabelGenerator(54, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(standardCategoryItemLabelGenerator0)), false);
        org.junit.Assert.assertEquals(0.0, ganttRenderer0.getBase(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        org.jfree.chart.urls.StandardCategoryURLGenerator standardCategoryURLGenerator0 = new org.jfree.chart.urls.StandardCategoryURLGenerator("!M2hn");
        defaultCategoryItemRenderer0.setSeriesURLGenerator(2005, ((org.jfree.chart.urls.CategoryURLGenerator)(standardCategoryURLGenerator0)));
        org.junit.Assert.assertEquals(3, defaultCategoryItemRenderer0.getDefaultEntityRadius());
    }

    @org.junit.Test(timeout = 4000)
    public void test69() throws java.lang.Throwable {
        java.awt.Color color0 = ((java.awt.Color)(org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_PAINT));
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)) , ((java.awt.Paint)(color0)));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = waterfallBarRenderer0.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true , true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = lineAndShapeRenderer0.getSeriesURLGenerator((-3064));
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test71() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test72() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        levelRenderer0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)));
        org.junit.Assert.assertEquals(0.2, levelRenderer0.getItemMargin(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test73() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        stackedBarRenderer3D0.setLegendItemToolTipGenerator(standardCategorySeriesLabelGenerator0);
        org.junit.Assert.assertTrue(stackedBarRenderer3D0.getAutoPopulateSeriesPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test74() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D(549.139872 , 0.0);
        int int0 = barRenderer3D0.getRowCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test76() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        ganttRenderer0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(null)));
        org.junit.Assert.assertFalse(ganttRenderer0.getIncludeBaseInRange());
    }

    @org.junit.Test(timeout = 4000)
    public void test77() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer();
        org.jfree.data.statistics.DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
        org.jfree.chart.plot.SpiderWebPlot spiderWebPlot0 = new org.jfree.chart.plot.SpiderWebPlot(((org.jfree.data.category.CategoryDataset)(defaultMultiValueCategoryDataset0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("Null 'annotation' argument." , categoryStepRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(spiderWebPlot0)) , false);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(51, 10);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        org.jfree.chart.axis.SubCategoryAxis subCategoryAxis0 = new org.jfree.chart.axis.SubCategoryAxis("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)(subCategoryAxis0)));
        javax.swing.tree.DefaultTreeCellRenderer defaultTreeCellRenderer0 = new javax.swing.tree.DefaultTreeCellRenderer();
        javax.swing.plaf.ColorUIResource colorUIResource0 = ((javax.swing.plaf.ColorUIResource)(defaultTreeCellRenderer0.getBorderSelectionColor()));
        javax.swing.border.SoftBevelBorder softBevelBorder0 = new javax.swing.border.SoftBevelBorder(10 , ((java.awt.Color)(colorUIResource0)) , ((java.awt.Color)(colorUIResource0)) , ((java.awt.Color)(colorUIResource0)) , ((java.awt.Color)(colorUIResource0)));
        java.awt.Rectangle rectangle0 = softBevelBorder0.getInteriorRectangle(((java.awt.Component)(null)), 10, 5, 10, (-2197));
        categoryStepRenderer0.drawBackground(sunGraphics2D0, combinedDomainCategoryPlot0, rectangle0);
        org.junit.Assert.assertEquals(1, combinedDomainCategoryPlot0.getRangeAxisCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test78() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = minMaxCategoryRenderer0.getLegendItemURLGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test79() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        stackedBarRenderer0.removeAnnotations();
        org.junit.Assert.assertFalse(stackedBarRenderer0.getAutoPopulateSeriesOutlineStroke());
    }

    @org.junit.Test(timeout = 4000)
    public void test80() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        org.jfree.chart.urls.CustomCategoryURLGenerator customCategoryURLGenerator0 = new org.jfree.chart.urls.CustomCategoryURLGenerator();
        stackedBarRenderer3D0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(customCategoryURLGenerator0)));
        org.junit.Assert.assertTrue(stackedBarRenderer3D0.getAutoPopulateSeriesPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test81() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = groupedStackedBarRenderer0.getBaseURLGenerator();
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        barRenderer0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test84() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        org.jfree.chart.LegendItem legendItem0 = levelRenderer0.getLegendItem(0, 5);
        org.junit.Assert.assertNull(legendItem0);
    }

    @org.junit.Test(timeout = 4000)
    public void test86() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        int int0 = ganttRenderer0.getPassCount();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test87() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.IntervalBarRenderer intervalBarRenderer0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
        int int0 = intervalBarRenderer0.getColumnCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test88() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = ((org.jfree.chart.labels.StandardCategorySeriesLabelGenerator)(statisticalBarRenderer0.getLegendItemLabelGenerator()));
        scatterRenderer0.setLegendItemURLGenerator(standardCategorySeriesLabelGenerator0);
        org.junit.Assert.assertEquals(1, scatterRenderer0.getPassCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test89() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.IntervalBarRenderer intervalBarRenderer0 = new org.jfree.chart.renderer.category.IntervalBarRenderer();
        org.jfree.chart.annotations.CategoryTextAnnotation categoryTextAnnotation0 = new org.jfree.chart.annotations.CategoryTextAnnotation("Fx\"KIM\"2xQ;uq?" , ((java.lang.Comparable)(3.0)) , 683.0);
        boolean boolean0 = intervalBarRenderer0.removeAnnotation(categoryTextAnnotation0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test90() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.data.statistics.DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
        org.jfree.data.Range range0 = boxAndWhiskerRenderer0.findRangeBounds(defaultMultiValueCategoryDataset0);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test93() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.labels.IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = ((org.jfree.chart.labels.IntervalCategoryToolTipGenerator)(scatterRenderer0.getBaseToolTipGenerator()));
        org.junit.Assert.assertNull(intervalCategoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test94() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        java.text.DecimalFormat decimalFormat0 = ((java.text.DecimalFormat)(java.text.NumberFormat.getCurrencyInstance()));
        org.jfree.chart.labels.StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator("a$P\"NbB#];FNoJB" , ((java.text.NumberFormat)(decimalFormat0)) , ((java.text.NumberFormat)(decimalFormat0)));
        levelRenderer0.setSeriesItemLabelGenerator(0, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(standardCategoryItemLabelGenerator0)));
        org.junit.Assert.assertTrue(levelRenderer0.getAutoPopulateSeriesStroke());
    }
}

