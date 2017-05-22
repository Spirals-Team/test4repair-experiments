package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2748.36) , (-2748.36));
        range0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-680.197668) , (-680.197668));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-680.197668));
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-1360.395336), range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 2903.71092);
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, 1.0);
        org.junit.Assert.assertEquals(0.0, range2.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(1452.35546, range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-191.3632579));
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, (-191.3632579));
        org.junit.Assert.assertSame(range2, range1);
        org.junit.Assert.assertEquals(191.3632579, range2.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-191.3632579));
        boolean boolean0 = range1.intersects((-1.0), 0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-2720.01504898));
        boolean boolean0 = range1.intersects(0.0, (-2720.01504898));
        org.junit.Assert.assertEquals((-2720.01504898), range1.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        boolean boolean0 = range0.intersects((-2835.0), (-1023.9346406));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-4398.039078992085) , (-1627.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2091.598491351891, true);
        org.junit.Assert.assertEquals(2771.039078992085, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0), true);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, (-1.0));
        org.jfree.data.Range range3 = org.jfree.data.Range.shift(range2, 1.0);
        org.junit.Assert.assertEquals((-0.5), range3.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-365.2888806251416) , (-365.2888806251416));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1161.712392164515, false);
        double double0 = range1.getUpperBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-5943.0) , (-5943.0));
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-5943.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2748.36) , (-2748.36));
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals((-2748.36), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2748.36) , (-2748.36));
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals((-2748.36), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2.0);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 2.0);
        org.jfree.data.Range range3 = org.jfree.data.Range.expand(range2, 2484.0, 2.0);
        org.junit.Assert.assertEquals((-2479.0), range3.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(2.0, range2.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2097.1156958597244);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, (-1268.020209782), 0.028980481451549966);
        org.junit.Assert.assertEquals(0.0, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-141.920413967867), 4946.120734717163);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        double double0 = range0.constrain(0.8257136492597268);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2748.36) , (-2748.36));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1220.79866), false);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range0, range1);
        org.junit.Assert.assertEquals((-3358.75933), range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertTrue(range1.equals(((java.lang.Object)(range0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0), false);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, (-1.0));
        double double0 = range2.getLength();
        org.junit.Assert.assertEquals((-1.5), range2.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-680.197668) , (-680.197668));
        boolean boolean0 = range0.contains((-680.197668));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3921.72) , (-3921.72));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-2.702212165826305));
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertEquals((-3921.72), range1.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.junit.Assert.assertEquals((-1.0), range0.getLowerBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-141.920413967867), true);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        java.lang.Object object0 = new java.lang.Object();
        boolean boolean0 = range0.equals(object0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1746.49127156 , 1746.49127156);
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 3639.1, true);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 2950.6344977267613);
        org.junit.Assert.assertEquals(2950.6344977267613, range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-5943.0) , (-5943.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-5943.0) , (-5943.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertNotSame(range1, range0);
        org.junit.Assert.assertEquals(1.0, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.constrain((-2675.961477319));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        double double0 = range0.constrain(0.028980481451549966);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(326.20735821 , 326.20735821);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 2685.006);
        boolean boolean0 = range1.intersects(1704.92853859456, 0.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1505.606679105, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-191.3632579));
        boolean boolean0 = range1.intersects(0.0, (-191.3632579));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-95.68162895), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals((-191.3632579), range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1452.35546);
        boolean boolean0 = range0.intersects((-3834.97829685702), 1452.35546);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(726.67773, range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(0.0, 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2866.393856510181) , 3639.1);
        boolean boolean0 = range0.intersects(0.0, 0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains(2144.10344490249);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(486.5006521287506 , 486.5006521287506);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-2860.337621362772));
        double double0 = range1.constrain((-2860.337621362772));
        org.junit.Assert.assertEquals((-2860.337621362772), double0, 0.01);
        org.junit.Assert.assertEquals(486.5006521287506, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals((-2860.337621362772), range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        boolean boolean0 = range0.contains((-572.020338384095));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[1.0,1.0]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.junit.Assert.assertEquals(1.0, range0.getUpperBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1.0);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range0, range1);
        boolean boolean0 = range0.equals(range2);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range0))));
        org.junit.Assert.assertEquals(1.5, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        range0.hashCode();
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-572.020338384095), 1.0);
        org.junit.Assert.assertEquals(1.0, range0.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals(1.0, range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }
}

