package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-69.7591111869548));
        range1.hashCode();
        org.junit.Assert.assertEquals((-69.7591111869548), range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 2015194.8887710825);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertEquals(2.0, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-69.7591111869548));
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertEquals((-69.7591111869548), range1.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2.0, false);
        org.junit.Assert.assertEquals(2.0, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1969.3935576) , (-1969.3935576));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1103.0, true);
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, 1916.918899);
        org.junit.Assert.assertEquals(0.0, range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 2738.783157751547, 1.0);
        org.junit.Assert.assertEquals(2740.783157751547, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 1491.3470181011771);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2012212.19473488);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        org.jfree.data.Range range3 = org.jfree.data.Range.expandToInclude(range2, 1512.2);
        org.junit.Assert.assertEquals(2012212.19473488, range3.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 1491.3470181011771);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2012212.19473488);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        boolean boolean0 = range2.intersects(3495.658, 3495.658);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(2013703.5417529813, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 1.0);
        boolean boolean0 = range0.intersects(1.0, 0.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0.5, range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        boolean boolean0 = range0.intersects((-1.0), 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.6283123657315833 , 0.6283123657315833);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-0.674870283));
        double double0 = range1.constrain((-0.023278958634208313));
        org.junit.Assert.assertEquals((-0.023278958634208313), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 1491.3470181011771);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 1512.2);
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, 1966.481380876586, false);
        org.junit.Assert.assertEquals(3468.254889927174, range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0, true);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0);
        org.junit.Assert.assertEquals(0.5, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2.0, true);
        double double0 = range1.getUpperBound();
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1708.90555 , 1708.90555);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(1708.90555, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.6283123657315833 , 0.6283123657315833);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-0.674870283));
        double double0 = range1.getLowerBound();
        org.junit.Assert.assertEquals(1.3031826487315832, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals((-0.674870283), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1969.3935576) , (-357.0));
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(1612.3935576, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.6283123657315833 , 0.6283123657315833);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.6283123657315833, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.6283123657315833 , 0.6283123657315833);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-0.674870283));
        double double0 = range1.getCentralValue();
        org.junit.Assert.assertEquals((-0.023278958634208313), double0, 0.01);
        org.junit.Assert.assertEquals(0.6283123657315833, range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1.0, 0.0);
        org.junit.Assert.assertEquals(2.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 1491.3470181011771);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-1.0), 3450.0);
        org.junit.Assert.assertEquals(1491.3470181011771, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.6283123657315833 , 0.6283123657315833);
        double double0 = range0.constrain(0.6283123657315833);
        org.junit.Assert.assertEquals(0.6283123657315833, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1412.5261509647032) , (-1412.5261509647032));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertNotSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains(1226.6885346367576);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains((-866.0));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1969.3935576) , (-1969.3935576));
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-1969.3935576), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1969.3935576) , (-1969.3935576));
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1969.3935576) , (-1969.3935576));
        org.jfree.data.Range range1 = new org.jfree.data.Range((-1969.3935576) , 1103.0);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertEquals((-433.19677879999995), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0), true);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertEquals((-1.0), range1.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 1491.3470181011771);
        java.lang.Object object0 = new java.lang.Object();
        boolean boolean0 = range0.equals(object0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1491.3470181011771, range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1969.3935576) , (-1969.3935576));
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1412.5261509647032) , (-1412.5261509647032));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1412.5261509647032));
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 1491.3470181011771);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertNotNull(range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertSame(range0, range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 1491.3470181011771);
        org.junit.Assert.assertEquals(1491.3470181011771, range0.getUpperBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2012212.19473488);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        boolean boolean0 = range2.intersects(1512.2, 1491.3470181011771);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1007597.4443855413, range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1412.5261509647032) , (-1412.5261509647032));
        org.junit.Assert.assertEquals((-1412.5261509647032), range0.getLowerBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 632.9588457593284);
        boolean boolean0 = range1.intersects(417.886672048, 632.9588457593284);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(0.0, 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1412.5261509647032) , (-1412.5261509647032));
        boolean boolean0 = range0.intersects((-1412.5261509647032), 632.9588457593284);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1412.5261509647032) , (-1412.5261509647032));
        boolean boolean0 = range0.intersects(417.886672048, 632.9588457593284);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-1412.5261509647032), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        double double0 = range0.constrain(1.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        boolean boolean0 = range0.contains(0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.constrain((-866.0));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1412.5261509647032) , (-1412.5261509647032));
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[-1412.5261509647032,-1412.5261509647032]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1969.3935576) , (-1969.3935576));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-1969.3935576), (-1969.3935576));
        org.junit.Assert.assertEquals((-1969.3935576), range0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }
}

