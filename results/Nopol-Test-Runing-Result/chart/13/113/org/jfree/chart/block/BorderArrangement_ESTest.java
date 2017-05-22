package org.jfree.chart.block;


public class BorderArrangement_ESTest extends org.jfree.chart.block.BorderArrangement_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.Range range0 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-1.0), 0.0);
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.BOTTOM;
        borderArrangement0.add(blockContainer0, rectangleEdge0);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range1, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.getHeight(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.Range range0 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-1.0), 0.0);
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.TOP;
        borderArrangement0.add(blockContainer0, rectangleEdge0);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range1, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.getWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        blockContainer0.setPadding(1.0, (-921.875), 0.0, 0.0);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 1.0);
        org.junit.Assert.assertEquals((-920.875), size2D0.width, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        blockContainer0.setMargin(1.0, 1.0, 3580.47424, 2971.943985973742);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0);
        org.junit.Assert.assertEquals(3581.47424, size2D0.getHeight(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        blockContainer0.setPadding((-1806.51768929045), 0.0, (-1.0), 0.0);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0);
        org.junit.Assert.assertEquals((-1807.51768929045), size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        try {
            borderArrangement0.arrangeFN(((org.jfree.chart.block.BlockContainer)(null)), ((java.awt.Graphics2D)(null)), 0.0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0);
        org.junit.Assert.assertEquals(0.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BorderArrangement borderArrangement1 = new org.jfree.chart.block.BorderArrangement();
        org.junit.Assert.assertTrue(borderArrangement1.equals(((java.lang.Object)(borderArrangement0))));
        org.jfree.chart.block.LabelBlock labelBlock0 = new org.jfree.chart.block.LabelBlock("createInstance");
        borderArrangement0.add(labelBlock0, ((java.lang.Object)(null)));
        boolean boolean0 = borderArrangement0.equals(borderArrangement1);
        org.junit.Assert.assertFalse(borderArrangement1.equals(((java.lang.Object)(borderArrangement0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.block.BorderArrangement borderArrangement1 = new org.jfree.chart.block.BorderArrangement();
        org.junit.Assert.assertTrue(borderArrangement1.equals(((java.lang.Object)(borderArrangement0))));
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.RIGHT;
        borderArrangement1.add(blockContainer0, rectangleEdge0);
        boolean boolean0 = borderArrangement0.equals(borderArrangement1);
        org.junit.Assert.assertFalse(borderArrangement1.equals(((java.lang.Object)(borderArrangement0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BorderArrangement borderArrangement1 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean0 = borderArrangement0.equals(borderArrangement1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.block.BorderArrangement borderArrangement1 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.TOP;
        borderArrangement1.add(blockContainer0, rectangleEdge0);
        boolean boolean0 = borderArrangement0.equals(borderArrangement1);
        org.junit.Assert.assertFalse(borderArrangement1.equals(((java.lang.Object)(borderArrangement0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list0 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        boolean boolean0 = borderArrangement0.equals(list0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean0 = borderArrangement0.equals(borderArrangement0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.block.BorderArrangement borderArrangement1 = new org.jfree.chart.block.BorderArrangement();
        org.junit.Assert.assertTrue(borderArrangement1.equals(((java.lang.Object)(borderArrangement0))));
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.LEFT;
        borderArrangement1.add(blockContainer0, rectangleEdge0);
        boolean boolean0 = borderArrangement1.equals(borderArrangement0);
        org.junit.Assert.assertFalse(borderArrangement1.equals(((java.lang.Object)(borderArrangement0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.Range range0 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.chart.block.BorderArrangement borderArrangement1 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.LEFT;
        borderArrangement1.add(blockContainer0, rectangleEdge0);
        org.junit.Assert.assertFalse(borderArrangement1.equals(((java.lang.Object)(borderArrangement0))));
        org.jfree.chart.util.HorizontalAlignment horizontalAlignment0 = org.jfree.chart.util.HorizontalAlignment.RIGHT;
        org.jfree.chart.block.ColumnArrangement columnArrangement0 = new org.jfree.chart.block.ColumnArrangement(horizontalAlignment0 , ((org.jfree.chart.util.VerticalAlignment)(null)) , (-1.0) , (-1.0));
        org.jfree.chart.block.BlockContainer blockContainer1 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(columnArrangement0)));
        blockContainer0.add(((org.jfree.chart.block.Block)(blockContainer1)));
        org.jfree.chart.util.Size2D size2D0 = borderArrangement1.arrangeRR(blockContainer0, range0, range0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, size2D0.getHeight(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.Range range0 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.chart.block.BorderArrangement borderArrangement1 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.RIGHT;
        borderArrangement1.add(blockContainer0, rectangleEdge0);
        borderArrangement1.arrangeRR(blockContainer0, range0, range0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertFalse(borderArrangement1.equals(((java.lang.Object)(borderArrangement0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        borderArrangement0.add(blockContainer0, ((java.lang.Object)(null)));
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0);
        org.junit.Assert.assertEquals(0.0, size2D0.width, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.block.BorderArrangement borderArrangement1 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.BOTTOM;
        borderArrangement1.add(blockContainer0, rectangleEdge0);
        borderArrangement1.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0);
        org.junit.Assert.assertFalse(borderArrangement1.equals(((java.lang.Object)(borderArrangement0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.block.BorderArrangement borderArrangement1 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.BOTTOM;
        borderArrangement1.add(blockContainer0, rectangleEdge0);
        borderArrangement1.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertFalse(borderArrangement1.equals(((java.lang.Object)(borderArrangement0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.util.HorizontalAlignment horizontalAlignment0 = org.jfree.chart.util.HorizontalAlignment.RIGHT;
        org.jfree.chart.block.ColumnArrangement columnArrangement0 = new org.jfree.chart.block.ColumnArrangement(horizontalAlignment0 , ((org.jfree.chart.util.VerticalAlignment)(null)) , (-1.0) , (-1.0));
        org.jfree.chart.block.BlockContainer blockContainer1 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(columnArrangement0)));
        blockContainer0.add(((org.jfree.chart.block.Block)(blockContainer1)));
        org.jfree.chart.util.Size2D size2D0 = blockContainer0.arrange(((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.getHeight(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.block.BorderArrangement borderArrangement1 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.RIGHT;
        borderArrangement1.add(blockContainer0, rectangleEdge0);
        borderArrangement1.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertFalse(borderArrangement1.equals(((java.lang.Object)(borderArrangement0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.block.BorderArrangement borderArrangement1 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.LEFT;
        borderArrangement1.add(blockContainer0, rectangleEdge0);
        borderArrangement1.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertFalse(borderArrangement1.equals(((java.lang.Object)(borderArrangement0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.TOP;
        borderArrangement0.add(blockContainer0, rectangleEdge0);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.getWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.TOP;
        borderArrangement0.add(blockContainer0, rectangleEdge0);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0);
        org.junit.Assert.assertEquals(0.0, size2D0.getHeight(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
    }
}

