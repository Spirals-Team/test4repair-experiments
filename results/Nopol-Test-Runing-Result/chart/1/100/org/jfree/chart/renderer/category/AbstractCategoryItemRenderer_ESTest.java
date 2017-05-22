package org.jfree.chart.renderer.category;


public class AbstractCategoryItemRenderer_ESTest extends org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        org.jfree.chart.renderer.category.CategoryStepRenderer.State categoryStepRenderer_State0 = new org.jfree.chart.renderer.category.CategoryStepRenderer.State(plotRenderingInfo0);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = ((org.jfree.chart.entity.StandardEntityCollection)(categoryStepRenderer_State0.getEntityCollection()));
        java.lang.Number[][] numberArray0 = new java.lang.Number[8][9];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0 , numberArray0);
        statisticalBarRenderer0.addEntity(standardEntityCollection0, categoryStepRenderer_State0.line, defaultIntervalCategoryDataset0, 1, 0, true, 1708.71981, ((byte)(120)));
        org.junit.Assert.assertEquals(1, standardEntityCollection0.getEntityCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(2.5E-9 , 0.0);
        org.jfree.chart.annotations.CategoryTextAnnotation categoryTextAnnotation0 = new org.jfree.chart.annotations.CategoryTextAnnotation("org.jfree.chart.renderer.category.LineRenderer3D" , ((java.lang.Comparable)("org.jfree.chart.renderer.category.LineRenderer3D")) , 0.0);
        stackedBarRenderer3D0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryTextAnnotation0)));
        org.junit.Assert.assertEquals(8.0, org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_Y_OFFSET, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = stackedAreaRenderer0.getSeriesToolTipGenerator(0);
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer(true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = stackedAreaRenderer0.getSeriesItemLabelGenerator(0);
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false , true);
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis0 = lineAndShapeRenderer0.getRangeAxis(combinedDomainCategoryPlot0, 2090);
        org.junit.Assert.assertNull(valueAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        java.util.Locale locale0 = java.util.Locale.CANADA;
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("W.$_{+oCb)BzNizy]" , ((java.util.TimeZone)(zoneInfo0)) , locale0);
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo0 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo0);
        java.awt.geom.Arc2D.Double arc2D_Double0 = new java.awt.geom.Arc2D.Double(2);
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(arc2D_Double0.getEndPoint()));
        combinedRangeCategoryPlot0.zoomRangeAxes(0.2, plotRenderingInfo0, ((java.awt.geom.Point2D)(point2D_Double0)));
        org.jfree.chart.axis.DateAxis dateAxis1 = ((org.jfree.chart.axis.DateAxis)(boxAndWhiskerRenderer0.getRangeAxis(combinedRangeCategoryPlot0, 5)));
        org.junit.Assert.assertSame(dateAxis1, dateAxis0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = minMaxCategoryRenderer0.getPlot();
        org.junit.Assert.assertNull(categoryPlot0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false , false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = lineAndShapeRenderer0.getLegendItemURLGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedAreaRenderer0.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.LegendItem legendItem0 = boxAndWhiskerRenderer0.getLegendItem((-808), (-1722));
        org.junit.Assert.assertNull(legendItem0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(false);
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis0 = new org.jfree.chart.axis.ExtendedCategoryAxis(((java.lang.String)(null)));
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(0.2 , ((java.lang.String)(null)));
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)(null)) , ((org.jfree.chart.axis.CategoryAxis)(extendedCategoryAxis0)) , ((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)) , ((org.jfree.chart.renderer.category.CategoryItemRenderer)(stackedBarRenderer0)));
        org.jfree.chart.axis.ExtendedCategoryAxis extendedCategoryAxis1 = ((org.jfree.chart.axis.ExtendedCategoryAxis)(stackedBarRenderer0.getDomainAxis(categoryPlot0, ((org.jfree.data.category.CategoryDataset)(null)))));
        org.junit.Assert.assertTrue(extendedCategoryAxis1.isVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = minMaxCategoryRenderer0.getBaseURLGenerator();
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.lang.String[] stringArray0 = new java.lang.String[2];
        stringArray0[0] = "";
        stringArray0[1] = "";
        java.lang.Number[][] numberArray0 = new java.lang.Number[2][2];
        java.lang.Number[] numberArray1 = new java.lang.Number[6];
        numberArray1[2] = ((java.lang.Number)(statisticalBarRenderer0.ZERO));
        numberArray0[0] = numberArray1;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(stringArray0 , numberArray0 , numberArray0);
        org.jfree.data.Range range0 = stackedAreaRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)), true);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
        java.lang.String[] stringArray0 = new java.lang.String[2];
        stringArray0[0] = "";
        stringArray0[1] = "";
        java.lang.Number[][] numberArray0 = new java.lang.Number[2][2];
        java.lang.Number[] numberArray1 = new java.lang.Number[6];
        numberArray1[0] = ((java.lang.Number)(0.2));
        numberArray1[1] = ((java.lang.Number)(3.0));
        numberArray0[0] = numberArray1;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(stringArray0 , numberArray0 , numberArray0);
        org.jfree.data.Range range0 = stackedAreaRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)), true);
        org.junit.Assert.assertEquals(0.2, range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
        java.lang.String[] stringArray0 = new java.lang.String[2];
        stringArray0[0] = "";
        stringArray0[1] = "";
        java.lang.Number[][] numberArray0 = new java.lang.Number[2][2];
        java.lang.Number[] numberArray1 = new java.lang.Number[6];
        numberArray1[3] = ((java.lang.Number)(-2436.435882178));
        numberArray0[0] = numberArray1;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(stringArray0 , numberArray0 , numberArray0);
        org.jfree.data.Range range0 = stackedAreaRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)), true);
        org.junit.Assert.assertEquals((-2436.435882178), range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        java.text.AttributedCharacterIterator.Attribute attributedCharacterIterator_Attribute0 = java.text.AttributedCharacterIterator.Attribute.INPUT_METHOD_SEGMENT;
        boolean boolean0 = lineRenderer3D0.equals(attributedCharacterIterator_Attribute0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer();
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState0 = waterfallBarRenderer0.createState(((org.jfree.chart.plot.PlotRenderingInfo)(null)));
        org.junit.Assert.assertEquals(0, categoryItemRendererState0.getVisibleSeriesCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer();
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer1 = ((org.jfree.chart.renderer.category.StackedBarRenderer)(stackedBarRenderer0.clone()));
        org.junit.Assert.assertFalse(stackedBarRenderer1.getAutoPopulateSeriesFillPaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer stackedBarRenderer0 = new org.jfree.chart.renderer.category.StackedBarRenderer(false);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        try {
            stackedBarRenderer0.addEntity(standardEntityCollection0, rectangle2D_Double0, defaultCategoryDataset0, (-11), (-11), false, (-11), (-11));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(false);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        javax.swing.border.SoftBevelBorder softBevelBorder0 = new javax.swing.border.SoftBevelBorder(1945);
        java.awt.Rectangle rectangle0 = softBevelBorder0.getInteriorRectangle(((java.awt.Component)(null)), (-1596), (-2321), 1, 1650);
        org.jfree.data.general.DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
        try {
            stackedBarRenderer3D0.addEntity(standardEntityCollection0, rectangle0, defaultKeyedValues2DDataset0, (-2318), 1570, false);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        boxAndWhiskerRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(null)), true);
        org.junit.Assert.assertEquals(1, boxAndWhiskerRenderer0.getPassCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D(2248.8821466 , 0.0);
        org.jfree.chart.urls.CustomCategoryURLGenerator customCategoryURLGenerator0 = new org.jfree.chart.urls.CustomCategoryURLGenerator();
        barRenderer3D0.setSeriesURLGenerator(39, ((org.jfree.chart.urls.CategoryURLGenerator)(customCategoryURLGenerator0)), true);
        org.junit.Assert.assertEquals(0.0, barRenderer3D0.getBase(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = barRenderer0.getURLGenerator(181, (-1729), true);
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        boxAndWhiskerRenderer0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(null)), true);
        org.junit.Assert.assertFalse(boxAndWhiskerRenderer0.getBaseItemLabelsVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D(2248.8821466 , 0.0);
        org.jfree.chart.labels.StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator();
        barRenderer3D0.setSeriesToolTipGenerator(39, ((org.jfree.chart.labels.CategoryToolTipGenerator)(standardCategoryToolTipGenerator0)), true);
        org.junit.Assert.assertEquals("({0}, {1}) = {2}", standardCategoryToolTipGenerator0.getLabelFormat());
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new org.jfree.chart.renderer.category.DefaultCategoryItemRenderer();
        defaultCategoryItemRenderer0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)), true);
        org.junit.Assert.assertTrue(defaultCategoryItemRenderer0.getAutoPopulateSeriesStroke());
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        barRenderer0.setSeriesItemLabelGenerator(0, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)), true);
        org.junit.Assert.assertEquals(1.0, barRenderer0.getMaximumBarWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = boxAndWhiskerRenderer0.getItemLabelGenerator(8, 8, false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true , true);
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis("");
        org.jfree.chart.plot.CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(categoryAxis0);
        lineAndShapeRenderer0.setPlot(combinedDomainCategoryPlot0);
        org.junit.Assert.assertEquals(0.0, combinedDomainCategoryPlot0.getAnchorValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D(0.0 , 0.0);
        org.jfree.data.gantt.TaskSeriesCollection taskSeriesCollection0 = new org.jfree.data.gantt.TaskSeriesCollection();
        org.jfree.data.Range range0 = barRenderer3D0.findRangeBounds(taskSeriesCollection0);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D(2248.8821466 , 0.0);
        org.jfree.chart.LegendItemCollection legendItemCollection0 = barRenderer3D0.getLegendItems();
        org.junit.Assert.assertEquals(0, legendItemCollection0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        java.util.Locale locale0 = java.util.Locale.CANADA;
        org.jfree.chart.axis.DateAxis dateAxis0 = new org.jfree.chart.axis.DateAxis("W.$_{+oCb)BzNizy]" , ((java.util.TimeZone)(zoneInfo0)) , locale0);
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(dateAxis0)));
        org.jfree.chart.axis.DateAxis dateAxis1 = ((org.jfree.chart.axis.DateAxis)(boxAndWhiskerRenderer0.getRangeAxis(combinedRangeCategoryPlot0, 5)));
        org.junit.Assert.assertTrue(dateAxis1.isTickLabelsVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.plot.FastScatterPlot fastScatterPlot0 = new org.jfree.chart.plot.FastScatterPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = fastScatterPlot0.getOrientation();
        scatterRenderer0.updateCrosshairValues(((org.jfree.chart.plot.CategoryCrosshairState)(null)), boxAndWhiskerRenderer0.ZERO, boxAndWhiskerRenderer0.ZERO, (-113.9885009449), 31, 0.0, 1603.5839329997116, plotOrientation0);
        org.junit.Assert.assertEquals(2.0, scatterRenderer0.getItemLabelAnchorOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier0 = lineRenderer3D0.getDrawingSupplier();
        org.junit.Assert.assertNull(drawingSupplier0);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , levelRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(waferMapPlot0)) , false);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2358, 10);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType0 = org.jfree.chart.util.LengthAdjustmentType.EXPAND;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor0 = org.jfree.chart.util.RectangleAnchor.RIGHT;
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(statisticalBarRenderer0.calculateRangeMarkerTextAnchorPoint(sunGraphics2D0, plotOrientation0, rectangle2D_Float0, rectangle2D_Float0, waferMapPlot0.DEFAULT_INSETS, lengthAdjustmentType0, rectangleAnchor0)));
        org.junit.Assert.assertEquals((-8.0), point2D_Double0.x, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        org.jfree.chart.plot.WaferMapPlot waferMapPlot0 = new org.jfree.chart.plot.WaferMapPlot();
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart("" , levelRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(waferMapPlot0)) , false);
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2358, 10);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImage0.createGraphics()));
        java.awt.geom.Rectangle2D.Float rectangle2D_Float0 = new java.awt.geom.Rectangle2D.Float();
        org.jfree.chart.plot.ThermometerPlot thermometerPlot0 = new org.jfree.chart.plot.ThermometerPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType0 = org.jfree.chart.util.LengthAdjustmentType.EXPAND;
        java.awt.geom.Point2D.Double point2D_Double0 = ((java.awt.geom.Point2D.Double)(levelRenderer0.calculateDomainMarkerTextAnchorPoint(sunGraphics2D0, plotOrientation0, rectangle2D_Float0, rectangle2D_Float0, waferMapPlot0.DEFAULT_INSETS, lengthAdjustmentType0, ((org.jfree.chart.util.RectangleAnchor)(null)))));
        org.junit.Assert.assertEquals(0.0, point2D_Double0.x, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double(((double)(scatterRenderer0.ZERO)) , (-1374.251661585482) , ((double)(scatterRenderer0.ZERO)) , 0.0);
        org.jfree.chart.renderer.category.GroupedStackedBarRenderer groupedStackedBarRenderer0 = new org.jfree.chart.renderer.category.GroupedStackedBarRenderer();
        org.jfree.chart.axis.CyclicNumberAxis cyclicNumberAxis0 = new org.jfree.chart.axis.CyclicNumberAxis(((double)(1)) , (-976.08803886688));
        org.jfree.chart.plot.CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)(cyclicNumberAxis0)));
        org.jfree.chart.JFreeChart jFreeChart0 = new org.jfree.chart.JFreeChart(",)HtM'Jjic#(s6S" , boxAndWhiskerRenderer0.DEFAULT_VALUE_LABEL_FONT , ((org.jfree.chart.plot.Plot)(combinedRangeCategoryPlot0)) , false);
        org.jfree.chart.entity.StandardEntityCollection standardEntityCollection0 = new org.jfree.chart.entity.StandardEntityCollection();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo0 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)(standardEntityCollection0)));
        java.awt.image.BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 500, 0.0, 669.90555, chartRenderingInfo0);
        org.jfree.chart.BufferedImageRenderingSource bufferedImageRenderingSource0 = new org.jfree.chart.BufferedImageRenderingSource(bufferedImage0);
        sun.java2d.SunGraphics2D sunGraphics2D0 = ((sun.java2d.SunGraphics2D)(bufferedImageRenderingSource0.createGraphics2D()));
        scatterRenderer0.drawDomainLine(sunGraphics2D0, combinedRangeCategoryPlot0, rectangle2D_Double0, 0.0, boxAndWhiskerRenderer0.DEFAULT_PAINT, groupedStackedBarRenderer0.DEFAULT_STROKE);
        org.junit.Assert.assertEquals((-16776961), sunGraphics2D0.pixel);
        org.junit.Assert.assertEquals((-16776961), sunGraphics2D0.eargb);
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.data.Range range0 = boxAndWhiskerRenderer0.findRangeBounds(((org.jfree.data.category.CategoryDataset)(null)), false);
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LevelRenderer levelRenderer0 = new org.jfree.chart.renderer.category.LevelRenderer();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        levelRenderer0.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator0);
        org.junit.Assert.assertEquals(0.2, org.jfree.chart.renderer.category.LevelRenderer.DEFAULT_ITEM_MARGIN, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(false , false);
        org.jfree.chart.text.TextBlock textBlock0 = new org.jfree.chart.text.TextBlock();
        org.jfree.chart.text.TextBox textBox0 = new org.jfree.chart.text.TextBox(textBlock0);
        java.awt.BasicStroke basicStroke0 = ((java.awt.BasicStroke)(textBox0.getOutlineStroke()));
        org.jfree.chart.annotations.CategoryLineAnnotation categoryLineAnnotation0 = new org.jfree.chart.annotations.CategoryLineAnnotation(((java.lang.Comparable)(statisticalLineAndShapeRenderer0.ZERO)) , (-284.625522) , ((java.lang.Comparable)("#")) , ((double)(statisticalLineAndShapeRenderer0.ZERO)) , statisticalLineAndShapeRenderer0.DEFAULT_PAINT , ((java.awt.Stroke)(basicStroke0)));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.BACKGROUND;
        statisticalLineAndShapeRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryLineAnnotation0)), layer0);
        org.junit.Assert.assertTrue(statisticalLineAndShapeRenderer0.getBaseCreateEntities());
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer();
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.annotations.CategoryTextAnnotation categoryTextAnnotation0 = new org.jfree.chart.annotations.CategoryTextAnnotation("W.$_{+oCb)BzNizy]" , ((java.lang.Comparable)(boxAndWhiskerRenderer0.ZERO)) , (-574.075478946157));
        org.jfree.chart.util.Layer layer0 = org.jfree.chart.util.Layer.FOREGROUND;
        categoryStepRenderer0.addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(categoryTextAnnotation0)), layer0);
        org.junit.Assert.assertEquals(0.0, org.jfree.chart.annotations.TextAnnotation.DEFAULT_ROTATION_ANGLE, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test67() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer();
        waterfallBarRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(null)), false);
        org.junit.Assert.assertEquals(2.0, waterfallBarRenderer0.getItemLabelAnchorOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        layeredBarRenderer0.setSeriesURLGenerator(65, ((org.jfree.chart.urls.CategoryURLGenerator)(null)), false);
        org.junit.Assert.assertEquals(0.2, org.jfree.chart.renderer.category.BarRenderer.DEFAULT_ITEM_MARGIN, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D(2248.8821466 , 0.0);
        org.jfree.chart.labels.StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator();
        barRenderer3D0.setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)(standardCategoryToolTipGenerator0)), false);
        org.jfree.chart.labels.StandardCategoryToolTipGenerator standardCategoryToolTipGenerator1 = ((org.jfree.chart.labels.StandardCategoryToolTipGenerator)(barRenderer3D0.getToolTipGenerator(39, 3, true)));
        org.junit.Assert.assertSame(standardCategoryToolTipGenerator1, standardCategoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test71() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D(2248.8821466 , 0.0);
        org.jfree.chart.labels.StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = ((org.jfree.chart.labels.StandardCategoryToolTipGenerator)(barRenderer3D0.getToolTipGenerator(39, 3, true)));
        org.junit.Assert.assertNull(standardCategoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test73() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D0 = new org.jfree.chart.renderer.category.LineRenderer3D();
        lineRenderer3D0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)), false);
        org.junit.Assert.assertTrue(lineRenderer3D0.getBaseSeriesVisibleInLegend());
    }

    @org.junit.Test(timeout = 4000)
    public void test74() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.ScatterRenderer scatterRenderer0 = new org.jfree.chart.renderer.category.ScatterRenderer();
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(1560.336730041653 , (-2536.94018));
        org.jfree.chart.renderer.category.WaterfallBarRenderer waterfallBarRenderer0 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(scatterRenderer0.DEFAULT_PAINT , stackedBarRenderer3D0.DEFAULT_VALUE_LABEL_PAINT , stackedBarRenderer3D0.DEFAULT_OUTLINE_PAINT , stackedBarRenderer3D0.DEFAULT_WALL_PAINT);
        waterfallBarRenderer0.setSeriesItemLabelGenerator(273, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)), false);
        org.junit.Assert.assertTrue(waterfallBarRenderer0.getBaseSeriesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test75() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.plot.PlotOrientation plotOrientation0 = org.jfree.chart.plot.PlotOrientation.VERTICAL;
        boxAndWhiskerRenderer0.drawItemLabel(((java.awt.Graphics2D)(null)), plotOrientation0, ((org.jfree.data.category.CategoryDataset)(null)), 2, 10, true, 1.0E-8, 0.05, true);
        org.junit.Assert.assertFalse(boxAndWhiskerRenderer0.getAutoPopulateSeriesOutlinePaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test77() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedBarRenderer3D stackedBarRenderer3D0 = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
        stackedBarRenderer3D0.setSeriesURLGenerator(4, ((org.jfree.chart.urls.CategoryURLGenerator)(null)));
        org.junit.Assert.assertFalse(stackedBarRenderer3D0.getAutoPopulateSeriesOutlinePaint());
    }

    @org.junit.Test(timeout = 4000)
    public void test78() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator0 = boxAndWhiskerRenderer0.getSeriesURLGenerator(3);
        org.junit.Assert.assertNull(categoryURLGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test79() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator0 = barRenderer3D0.getBaseItemLabelGenerator();
        org.junit.Assert.assertNull(categoryItemLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test80() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.CategoryStepRenderer categoryStepRenderer0 = new org.jfree.chart.renderer.category.CategoryStepRenderer(false);
        categoryStepRenderer0.setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)(null)));
        org.junit.Assert.assertTrue(categoryStepRenderer0.getAutoPopulateSeriesStroke());
    }

    @org.junit.Test(timeout = 4000)
    public void test81() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        barRenderer0.setLegendItemToolTipGenerator(((org.jfree.chart.labels.CategorySeriesLabelGenerator)(null)));
        org.junit.Assert.assertEquals(1.0, barRenderer0.getMaximumBarWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test82() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
        int int0 = statisticalLineAndShapeRenderer0.getRowCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D(2248.8821466 , 0.0);
        barRenderer3D0.setSeriesToolTipGenerator(2, ((org.jfree.chart.labels.CategoryToolTipGenerator)(null)));
        org.junit.Assert.assertTrue(barRenderer3D0.getBaseSeriesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test86() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        stackedAreaRenderer0.removeAnnotations();
        org.junit.Assert.assertFalse(stackedAreaRenderer0.getAutoPopulateSeriesOutlineStroke());
    }

    @org.junit.Test(timeout = 4000)
    public void test87() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StackedAreaRenderer stackedAreaRenderer0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
        stackedAreaRenderer0.setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)(null)));
        org.junit.Assert.assertTrue(stackedAreaRenderer0.getBaseSeriesVisible());
    }

    @org.junit.Test(timeout = 4000)
    public void test89() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test91() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
        int int0 = boxAndWhiskerRenderer0.getPassCount();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test92() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D(2248.8821466 , 0.0);
        int int0 = barRenderer3D0.getColumnCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test93() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.LayeredBarRenderer layeredBarRenderer0 = new org.jfree.chart.renderer.category.LayeredBarRenderer();
        layeredBarRenderer0.setLegendItemURLGenerator(((org.jfree.chart.labels.CategorySeriesLabelGenerator)(null)));
        org.junit.Assert.assertEquals(1, layeredBarRenderer0.getPassCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test94() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = ((org.jfree.chart.labels.StandardCategorySeriesLabelGenerator)(minMaxCategoryRenderer0.getLegendItemLabelGenerator()));
        org.junit.Assert.assertNotNull(standardCategorySeriesLabelGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test95() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        boolean boolean0 = barRenderer3D0.removeAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test98() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.GanttRenderer ganttRenderer0 = new org.jfree.chart.renderer.category.GanttRenderer();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator0 = ganttRenderer0.getBaseToolTipGenerator();
        org.junit.Assert.assertNull(categoryToolTipGenerator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test99() throws java.lang.Throwable {
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        org.jfree.chart.labels.IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator();
        barRenderer3D0.setSeriesItemLabelGenerator(65, ((org.jfree.chart.labels.CategoryItemLabelGenerator)(intervalCategoryItemLabelGenerator0)));
        org.junit.Assert.assertTrue(barRenderer3D0.getAutoPopulateSeriesShape());
    }
}

