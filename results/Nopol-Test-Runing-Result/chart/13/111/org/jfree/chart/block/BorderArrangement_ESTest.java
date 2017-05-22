package org.jfree.chart.block;


public class BorderArrangement_ESTest extends org.jfree.chart.block.BorderArrangement_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.block.BlockContainer blockContainer1 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.block.BlockBorder blockBorder0 = new org.jfree.chart.block.BlockBorder(1.0 , 1.0 , 1.0 , 1.0);
        blockContainer1.setFrame(blockBorder0);
        blockContainer0.add(((org.jfree.chart.block.Block)(blockContainer1)));
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer1, range0, range0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(2.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.block.BlockContainer blockContainer1 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.block.BlockBorder blockBorder0 = new org.jfree.chart.block.BlockBorder(1.0 , 1.0 , 1.0 , 1.0);
        blockContainer1.setFrame(blockBorder0);
        blockContainer0.add(((org.jfree.chart.block.Block)(blockContainer1)));
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(2.0, size2D0.width, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 2.0);
        org.junit.Assert.assertEquals(2.0, size2D0.getWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.block.BlockContainer blockContainer1 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.block.BlockBorder blockBorder0 = new org.jfree.chart.block.BlockBorder(1.0 , 1.0 , 1.0 , 1.0);
        blockContainer1.setFrame(blockBorder0);
        blockContainer0.add(((org.jfree.chart.block.Block)(blockContainer1)));
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0);
        org.junit.Assert.assertEquals(4.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = new org.jfree.chart.util.RectangleInsets((-1.0) , (-1.0) , 0.0 , (-597.7519828513609));
        blockContainer0.setMargin(rectangleInsets0);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0);
        org.junit.Assert.assertEquals((-1.0), size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.data.jdbc.JDBCXYDataset jDBCXYDataset0 = new org.jfree.data.jdbc.JDBCXYDataset(((java.sql.Connection)(null)));
        org.jfree.data.Range range0 = jDBCXYDataset0.getRangeBounds(true);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.RIGHT;
        borderArrangement0.add(blockContainer0, rectangleEdge0);
        org.junit.Assert.assertEquals(0.0, blockContainer0.getContentXOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.BOTTOM;
        borderArrangement0.add(blockContainer0, rectangleEdge0);
        org.junit.Assert.assertEquals(0.0, blockContainer0.getWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.TOP;
        borderArrangement0.add(blockContainer0, rectangleEdge0);
        org.junit.Assert.assertEquals(0.0, blockContainer0.getHeight(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.LEFT;
        borderArrangement0.add(blockContainer0, rectangleEdge0);
        org.junit.Assert.assertEquals(0.0, blockContainer0.getWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BorderArrangement borderArrangement1 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement1)));
        org.junit.Assert.assertTrue(borderArrangement1.equals(((java.lang.Object)(borderArrangement0))));
        borderArrangement1.add(blockContainer0, ((java.lang.Object)(null)));
        boolean boolean0 = borderArrangement1.equals(borderArrangement0);
        org.junit.Assert.assertFalse(borderArrangement1.equals(((java.lang.Object)(borderArrangement0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BorderArrangement borderArrangement1 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean0 = borderArrangement1.equals(borderArrangement0);
        org.junit.Assert.assertTrue(boolean0);
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
        boolean boolean0 = borderArrangement0.equals(((java.lang.Object)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.block.BlockContainer blockContainer1 = new org.jfree.chart.block.BlockContainer();
        blockContainer0.add(((org.jfree.chart.block.Block)(blockContainer1)));
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.getWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.Size2D size2D0 = blockContainer0.arrange(((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
    }
}

