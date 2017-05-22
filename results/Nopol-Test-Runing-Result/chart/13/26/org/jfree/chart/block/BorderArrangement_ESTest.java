package org.jfree.chart.block;


public class BorderArrangement_ESTest extends org.jfree.chart.block.BorderArrangement_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.EmptyBlock emptyBlock0 = new org.jfree.chart.block.EmptyBlock(0.0 , (-548.201));
        org.jfree.chart.block.BlockBorder blockBorder0 = new org.jfree.chart.block.BlockBorder(0.0 , 345.9 , 873.2551284435 , 0.0);
        emptyBlock0.setFrame(blockBorder0);
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.RIGHT;
        borderArrangement0.add(emptyBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(345.9, size2D0.width, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.EmptyBlock emptyBlock0 = new org.jfree.chart.block.EmptyBlock(0.0 , (-548.201));
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.LEFT;
        org.jfree.chart.block.BlockBorder blockBorder0 = new org.jfree.chart.block.BlockBorder(0.0 , 0.0 , 0.0 , 1377.0);
        emptyBlock0.setFrame(blockBorder0);
        borderArrangement0.add(emptyBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(1377.0, size2D0.width, 0.01);
        org.junit.Assert.assertEquals(0.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.EmptyBlock emptyBlock0 = new org.jfree.chart.block.EmptyBlock(0.0 , (-548.201));
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.LEFT;
        emptyBlock0.setHeight(1377.0);
        borderArrangement0.add(emptyBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(1377.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        blockContainer0.setMargin(2305.564, 2305.564, 452.7, 452.7);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0);
        org.junit.Assert.assertEquals(2758.2639999999997, size2D0.getHeight(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        blockContainer0.setPadding(0.0, 0.0, (-556.0858474394), (-556.0858474394));
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0);
        org.junit.Assert.assertEquals((-556.0858474394), size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0);
        org.junit.Assert.assertEquals(0.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BorderArrangement borderArrangement1 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean0 = borderArrangement0.equals(borderArrangement1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean0 = borderArrangement0.equals(borderArrangement0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        java.lang.Integer integer0 = javax.swing.JLayeredPane.MODAL_LAYER;
        boolean boolean0 = borderArrangement0.equals(integer0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.EmptyBlock emptyBlock0 = new org.jfree.chart.block.EmptyBlock(0.0 , (-548.201));
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.RIGHT;
        borderArrangement0.add(emptyBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.EmptyBlock emptyBlock0 = new org.jfree.chart.block.EmptyBlock(0.0 , (-548.201));
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.LEFT;
        borderArrangement0.add(emptyBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.getWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.EmptyBlock emptyBlock0 = new org.jfree.chart.block.EmptyBlock(0.0 , (-548.201));
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.LEFT;
        borderArrangement0.add(emptyBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0);
        org.junit.Assert.assertEquals(0.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.block.BlockContainer blockContainer1 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        blockContainer0.add(((org.jfree.chart.block.Block)(blockContainer1)));
        org.jfree.chart.util.Size2D size2D0 = blockContainer0.arrange(((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        blockContainer0.add(((org.jfree.chart.block.Block)(blockContainer0)));
        try {
            blockContainer0.arrange(((java.awt.Graphics2D)(null)));
            org.junit.Assert.fail("Expecting exception: StackOverflowError");
        } catch (java.lang.StackOverflowError e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.EmptyBlock emptyBlock0 = new org.jfree.chart.block.EmptyBlock((-548.201) , (-548.201));
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.RIGHT;
        borderArrangement0.add(emptyBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.width, 0.01);
        org.junit.Assert.assertEquals(0.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.EmptyBlock emptyBlock0 = new org.jfree.chart.block.EmptyBlock((-548.201) , (-548.201));
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.TOP;
        borderArrangement0.add(emptyBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals((-548.201), size2D0.height, 0.01);
        org.junit.Assert.assertEquals(0.0, size2D0.width, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        borderArrangement0.add(blockContainer0, ((java.lang.Object)(null)));
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0);
        org.junit.Assert.assertEquals(0.0, size2D0.getWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.EmptyBlock emptyBlock0 = new org.jfree.chart.block.EmptyBlock((-548.201) , (-548.201));
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.BOTTOM;
        borderArrangement0.add(emptyBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals((-548.201), size2D0.height, 0.01);
        org.junit.Assert.assertEquals(0.0, size2D0.width, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.EmptyBlock emptyBlock0 = new org.jfree.chart.block.EmptyBlock(0.0 , (-548.201));
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.RIGHT;
        borderArrangement0.add(emptyBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0);
        org.junit.Assert.assertEquals(0.0, size2D0.width, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
    }
}

