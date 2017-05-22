package org.jfree.chart.block;


public class BorderArrangement_ESTest extends org.jfree.chart.block.BorderArrangement_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        javax.swing.text.DefaultStyledDocument defaultStyledDocument0 = new javax.swing.text.DefaultStyledDocument();
        javax.swing.JTextPane jTextPane0 = new javax.swing.JTextPane(((javax.swing.text.StyledDocument)(defaultStyledDocument0)));
        sun.swing.PrintColorUIResource printColorUIResource0 = ((sun.swing.PrintColorUIResource)(jTextPane0.getCaretColor()));
        org.jfree.chart.block.ColorBlock colorBlock0 = new org.jfree.chart.block.ColorBlock(((java.awt.Paint)(printColorUIResource0)) , 1.0 , 1.0);
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.RIGHT;
        borderArrangement0.add(colorBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.data.time.DynamicTimeSeriesCollection dynamicTimeSeriesCollection0 = new org.jfree.data.time.DynamicTimeSeriesCollection(0 , 8);
        org.jfree.data.Range range0 = dynamicTimeSeriesCollection0.getRangeBounds(false);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(1.0, size2D0.width, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        blockContainer0.setPadding((-611.5), (-1446.785052), 0.0, (-1.0));
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0);
        org.junit.Assert.assertEquals((-1447.785052), size2D0.width, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BorderArrangement borderArrangement1 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean0 = borderArrangement0.equals(borderArrangement1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem0 = new javax.swing.JRadioButtonMenuItem("");
        boolean boolean0 = borderArrangement0.equals(jRadioButtonMenuItem0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean0 = borderArrangement0.equals(borderArrangement0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        javax.swing.text.DefaultStyledDocument defaultStyledDocument0 = new javax.swing.text.DefaultStyledDocument();
        javax.swing.JTextPane jTextPane0 = new javax.swing.JTextPane(((javax.swing.text.StyledDocument)(defaultStyledDocument0)));
        sun.swing.PrintColorUIResource printColorUIResource0 = ((sun.swing.PrintColorUIResource)(jTextPane0.getCaretColor()));
        org.jfree.chart.block.ColorBlock colorBlock0 = new org.jfree.chart.block.ColorBlock(((java.awt.Paint)(printColorUIResource0)) , (-163.10194369568) , 1.0);
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.RIGHT;
        borderArrangement0.add(colorBlock0, rectangleEdge0);
        org.jfree.chart.block.BorderArrangement borderArrangement1 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean0 = borderArrangement0.equals(borderArrangement1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        javax.swing.text.DefaultStyledDocument defaultStyledDocument0 = new javax.swing.text.DefaultStyledDocument();
        javax.swing.JTextPane jTextPane0 = new javax.swing.JTextPane(((javax.swing.text.StyledDocument)(defaultStyledDocument0)));
        sun.swing.PrintColorUIResource printColorUIResource0 = ((sun.swing.PrintColorUIResource)(jTextPane0.getCaretColor()));
        org.jfree.chart.block.ColorBlock colorBlock0 = new org.jfree.chart.block.ColorBlock(((java.awt.Paint)(printColorUIResource0)) , 1212.191187 , 1.0);
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.RIGHT;
        borderArrangement0.add(colorBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 452.7);
        org.junit.Assert.assertEquals(1.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        javax.swing.text.DefaultStyledDocument defaultStyledDocument0 = new javax.swing.text.DefaultStyledDocument();
        javax.swing.JTextPane jTextPane0 = new javax.swing.JTextPane(((javax.swing.text.StyledDocument)(defaultStyledDocument0)));
        sun.swing.PrintColorUIResource printColorUIResource0 = ((sun.swing.PrintColorUIResource)(jTextPane0.getCaretColor()));
        org.jfree.chart.block.ColorBlock colorBlock0 = new org.jfree.chart.block.ColorBlock(((java.awt.Paint)(printColorUIResource0)) , 1212.19118719193 , 1.0);
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.LEFT;
        borderArrangement0.add(colorBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 452.7);
        org.junit.Assert.assertEquals(1.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        javax.swing.text.DefaultStyledDocument defaultStyledDocument0 = new javax.swing.text.DefaultStyledDocument();
        javax.swing.JTextPane jTextPane0 = new javax.swing.JTextPane(((javax.swing.text.StyledDocument)(defaultStyledDocument0)));
        sun.swing.PrintColorUIResource printColorUIResource0 = ((sun.swing.PrintColorUIResource)(jTextPane0.getCaretColor()));
        org.jfree.chart.block.ColorBlock colorBlock0 = new org.jfree.chart.block.ColorBlock(((java.awt.Paint)(printColorUIResource0)) , 1212.191187 , 1.0);
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.BOTTOM;
        borderArrangement0.add(colorBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 452.7);
        org.junit.Assert.assertEquals(1.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        borderArrangement0.add(blockContainer0, ((java.lang.Object)(null)));
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.getWidth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        javax.swing.text.DefaultStyledDocument defaultStyledDocument0 = new javax.swing.text.DefaultStyledDocument();
        javax.swing.JTextPane jTextPane0 = new javax.swing.JTextPane(((javax.swing.text.StyledDocument)(defaultStyledDocument0)));
        sun.swing.PrintColorUIResource printColorUIResource0 = ((sun.swing.PrintColorUIResource)(jTextPane0.getCaretColor()));
        org.jfree.chart.block.ColorBlock colorBlock0 = new org.jfree.chart.block.ColorBlock(((java.awt.Paint)(printColorUIResource0)) , 1212.191187 , 1.0);
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.RIGHT;
        borderArrangement0.add(colorBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(1212.191187, size2D0.width, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        javax.swing.text.DefaultStyledDocument defaultStyledDocument0 = new javax.swing.text.DefaultStyledDocument();
        javax.swing.JTextPane jTextPane0 = new javax.swing.JTextPane(((javax.swing.text.StyledDocument)(defaultStyledDocument0)));
        sun.swing.PrintColorUIResource printColorUIResource0 = ((sun.swing.PrintColorUIResource)(jTextPane0.getCaretColor()));
        org.jfree.chart.block.ColorBlock colorBlock0 = new org.jfree.chart.block.ColorBlock(((java.awt.Paint)(printColorUIResource0)) , 1212.19118719193 , 1.0);
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.LEFT;
        borderArrangement0.add(colorBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(1212.19118719193, size2D0.width, 0.01);
        org.junit.Assert.assertEquals(1.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        javax.swing.text.DefaultStyledDocument defaultStyledDocument0 = new javax.swing.text.DefaultStyledDocument();
        javax.swing.JTextPane jTextPane0 = new javax.swing.JTextPane(((javax.swing.text.StyledDocument)(defaultStyledDocument0)));
        sun.swing.PrintColorUIResource printColorUIResource0 = ((sun.swing.PrintColorUIResource)(jTextPane0.getCaretColor()));
        org.jfree.chart.block.ColorBlock colorBlock0 = new org.jfree.chart.block.ColorBlock(((java.awt.Paint)(printColorUIResource0)) , 1212.191187 , 1.0);
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.BOTTOM;
        borderArrangement0.add(colorBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(1.0, size2D0.height, 0.01);
        org.junit.Assert.assertEquals(1212.191187, size2D0.width, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer(((org.jfree.chart.block.Arrangement)(borderArrangement0)));
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, ((java.awt.Graphics2D)(null)), 0.0);
        org.junit.Assert.assertEquals(0.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        javax.swing.text.DefaultStyledDocument defaultStyledDocument0 = new javax.swing.text.DefaultStyledDocument();
        javax.swing.JTextPane jTextPane0 = new javax.swing.JTextPane(((javax.swing.text.StyledDocument)(defaultStyledDocument0)));
        sun.swing.PrintColorUIResource printColorUIResource0 = ((sun.swing.PrintColorUIResource)(jTextPane0.getCaretColor()));
        org.jfree.chart.block.ColorBlock colorBlock0 = new org.jfree.chart.block.ColorBlock(((java.awt.Paint)(printColorUIResource0)) , (-163.10194369568) , 1.0);
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.RIGHT;
        borderArrangement0.add(colorBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.data.time.DynamicTimeSeriesCollection dynamicTimeSeriesCollection0 = new org.jfree.data.time.DynamicTimeSeriesCollection(0 , 8);
        org.jfree.data.Range range0 = dynamicTimeSeriesCollection0.getRangeBounds(false);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(1.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        javax.swing.text.DefaultStyledDocument defaultStyledDocument0 = new javax.swing.text.DefaultStyledDocument();
        javax.swing.JTextPane jTextPane0 = new javax.swing.JTextPane(((javax.swing.text.StyledDocument)(defaultStyledDocument0)));
        sun.swing.PrintColorUIResource printColorUIResource0 = ((sun.swing.PrintColorUIResource)(jTextPane0.getCaretColor()));
        org.jfree.chart.block.ColorBlock colorBlock0 = new org.jfree.chart.block.ColorBlock(((java.awt.Paint)(printColorUIResource0)) , (-163.10194369568) , 1.0);
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.LEFT;
        borderArrangement0.add(colorBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.data.time.DynamicTimeSeriesCollection dynamicTimeSeriesCollection0 = new org.jfree.data.time.DynamicTimeSeriesCollection(3 , 12);
        org.jfree.data.Range range0 = dynamicTimeSeriesCollection0.getRangeBounds(false);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(1.0, size2D0.height, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        javax.swing.text.DefaultStyledDocument defaultStyledDocument0 = new javax.swing.text.DefaultStyledDocument();
        javax.swing.JTextPane jTextPane0 = new javax.swing.JTextPane(((javax.swing.text.StyledDocument)(defaultStyledDocument0)));
        sun.swing.PrintColorUIResource printColorUIResource0 = ((sun.swing.PrintColorUIResource)(jTextPane0.getCaretColor()));
        org.jfree.chart.block.ColorBlock colorBlock0 = new org.jfree.chart.block.ColorBlock(((java.awt.Paint)(printColorUIResource0)) , (-163.10194369568) , 1.0);
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.TOP;
        borderArrangement0.add(colorBlock0, rectangleEdge0);
        org.junit.Assert.assertEquals(0.0, colorBlock0.getContentYOffset(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        borderArrangement0.add(blockContainer0, ((java.lang.Object)(null)));
        org.jfree.data.statistics.DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new org.jfree.data.statistics.DefaultMultiValueCategoryDataset();
        org.jfree.data.Range range0 = defaultMultiValueCategoryDataset0.getRangeBounds(true);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.width, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        javax.swing.text.DefaultStyledDocument defaultStyledDocument0 = new javax.swing.text.DefaultStyledDocument();
        javax.swing.JTextPane jTextPane0 = new javax.swing.JTextPane(((javax.swing.text.StyledDocument)(defaultStyledDocument0)));
        sun.swing.PrintColorUIResource printColorUIResource0 = ((sun.swing.PrintColorUIResource)(jTextPane0.getCaretColor()));
        org.jfree.chart.block.ColorBlock colorBlock0 = new org.jfree.chart.block.ColorBlock(((java.awt.Paint)(printColorUIResource0)) , (-163.10194369568) , 1.0);
        org.jfree.chart.util.RectangleEdge rectangleEdge0 = org.jfree.chart.util.RectangleEdge.BOTTOM;
        borderArrangement0.add(colorBlock0, rectangleEdge0);
        org.jfree.chart.block.BlockContainer blockContainer0 = new org.jfree.chart.block.BlockContainer();
        org.jfree.data.time.DynamicTimeSeriesCollection dynamicTimeSeriesCollection0 = new org.jfree.data.time.DynamicTimeSeriesCollection(3 , 8);
        org.jfree.data.Range range0 = dynamicTimeSeriesCollection0.getRangeBounds(false);
        org.jfree.chart.util.Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, ((java.awt.Graphics2D)(null)));
        org.junit.Assert.assertEquals(0.0, size2D0.width, 0.01);
        org.junit.Assert.assertEquals(1.0, size2D0.height, 0.01);
    }
}

