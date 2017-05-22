package org.jfree.chart.block;


public class BorderArrangement_ESTest extends org.jfree.chart.block.BorderArrangement_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.data.statistics.DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
        org.jfree.data.Range range0 = defaultMultiValueCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-3872.20040612), false);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeRR(((org.jfree.chart.block.BlockContainer)(null)), range1, range0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.getWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.LEFT;
        org.jfree.chart.util.UnitType unitType0 = org.jfree.chart.util.UnitType.ABSOLUTE;
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = new org.jfree.chart.util.RectangleInsets(unitType0 , ((double)((byte)(32))) , ((double)(0.0F)) , 0.0 , 457.569065666);
        blockContainer0.setMargin(rectangleInsets0);
        borderArrangement0.add(blockContainer0, rectangleEdge0);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(457.569065666, size2D0.width, 0.01);
        org.junit.Assert.assertEquals(32.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.block.BlockBorder blockBorder0 = new org.jfree.chart.block.BlockBorder((-1266.38162759) , 0.0 , 3792.63 , (-1483.7));
        blockContainer0.setFrame(blockBorder0);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0);
        org.junit.Assert.assertEquals((-1483.7), size2D0.width, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        blockContainer0.setPadding(4000.39, ((double)(0.0F)), java.lang.Double.NEGATIVE_INFINITY, 0.0);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 1405.148);
        org.junit.Assert.assertEquals(java.lang.Double.NEGATIVE_INFINITY, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.getWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BorderArrangement borderArrangement1 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean0 = borderArrangement0.equals(borderArrangement1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean0 = borderArrangement0.equals(borderArrangement0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        java.awt.geom.Rectangle2D.Double rectangle2D_Double0 = new java.awt.geom.Rectangle2D.Double();
        boolean boolean0 = borderArrangement0.equals(rectangle2D_Double0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.TOP;
        borderArrangement0.add(blockContainer0, rectangleEdge0);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0F);
        org.junit.Assert.assertEquals(0.0, size2D0.width, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        java.awt.Color color0 = java.awt.Color.darkGray;
        org.jfree.chart.block.ColorBlock colorBlock0 = new org.jfree.chart.block.ColorBlock(((java.awt.Paint)(color0)) , (-1098.908804327716) , 502.5647849);
        blockContainer0.add(((org.jfree.chart.block.Block)(colorBlock0)), ((java.lang.Object)(null)));
        org.jfree.chart.util.Size2D size2D0 = blockContainer0.arrange(((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(502.5647849, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.TOP;
        borderArrangement0.add(blockContainer0, rectangleEdge0);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.BOTTOM;
        borderArrangement0.add(blockContainer0, rectangleEdge0);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0F);
        org.junit.Assert.assertEquals(0.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.TOP;
        borderArrangement0.add(blockContainer0, rectangleEdge0);
        org.jfree.data.statistics.DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
        org.jfree.data.Range range0 = defaultMultiValueCategoryDataset0.getRangeBounds(false);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.getWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.BOTTOM;
        borderArrangement0.add(blockContainer0, rectangleEdge0);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.getHeight(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
    }
}

