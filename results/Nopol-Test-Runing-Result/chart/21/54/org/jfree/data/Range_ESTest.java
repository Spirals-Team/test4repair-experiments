package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        range0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3430.319188343578) , (-3430.319188343578));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 4999.7);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertEquals((-3430.319188343578), range1.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-2584.703));
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-406.18762271474776) , (-406.18762271474776));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.0));
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, 1837.308379, 1837.308379);
        boolean boolean0 = range2.intersects(1837.308379, 1837.308379);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals((-203.59381135739386), range2.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1063.58258116) , 877.968508584);
        boolean boolean0 = range0.intersects(877.968508584, 0.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1941.551089744, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1223.24 , 1223.24);
        boolean boolean0 = range0.intersects(1223.24, 1223.24);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 742.3);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        org.jfree.data.Range range3 = org.jfree.data.Range.shift(range2, 0.0, false);
        org.junit.Assert.assertEquals(371.15, range3.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-406.18762271474776) , (-406.18762271474776));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.0));
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, (-1.0));
        org.junit.Assert.assertEquals((-204.59381135737388), range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 159.67738432);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, (-1.0));
        double double0 = range2.getUpperBound();
        org.junit.Assert.assertEquals(79.33869216, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertSame(range2, range1);
        org.junit.Assert.assertEquals(159.67738432, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(378.47 , 378.47);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(378.47, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.0));
        double double0 = range1.getLength();
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.1553162514136734 , 0.1553162514136734);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.1553162514136734, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1063.58258116) , 877.968508584);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1.0, 0.0);
        org.junit.Assert.assertEquals(1941.551089744, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(3883.102179488, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1223.24 , 1223.24);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1223.24, 2665.4974141665);
        org.junit.Assert.assertEquals(1223.24, range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 159.67738432, 159.67738432);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.1553162514136734 , 0.1553162514136734);
        double double0 = range0.constrain(0.11802468593662162);
        org.junit.Assert.assertEquals(0.1553162514136734, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0));
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range0, range1);
        org.junit.Assert.assertEquals((-1.5), range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0, false);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains((-1.0));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1542.057883382365) , (-1542.057883382365));
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3430.319188343578) , (-3430.319188343578));
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals((-3430.319188343578), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3430.319188343578) , (-3430.319188343578));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-3430.319188343578), true);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 0.0);
        org.jfree.data.Range range3 = org.jfree.data.Range.shift(range0, (-3430.319188343578));
        boolean boolean0 = range3.equals(range2);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(range3.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertEquals(0.0, range2.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range3))));
        org.junit.Assert.assertEquals((-6860.638376687156), range2.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1542.057883382365) , (-1542.057883382365));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1542.057883382365));
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, 0.0);
        boolean boolean0 = range1.equals(range2);
        org.junit.Assert.assertEquals((-3084.11576676473), range1.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(range2.equals(((java.lang.Object)(range0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1223.24 , 1223.24);
        java.lang.Object object0 = new java.lang.Object();
        boolean boolean0 = range0.equals(object0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3430.319188343578) , (-3430.319188343578));
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertNotNull(range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3430.319188343578) , (-3430.319188343578));
        double double0 = range0.constrain(0.0);
        org.junit.Assert.assertEquals((-3430.319188343578), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1063.58258116) , 877.968508584);
        double double0 = range0.constrain(0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1223.24 , 1223.24);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2665.4974141665, true);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 1223.24);
        boolean boolean0 = range2.intersects(2694.0, 1223.24);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(2665.4974141665007, range2.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1063.58258116) , 877.968508584);
        boolean boolean0 = range0.intersects(0.0, 1.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.junit.Assert.assertEquals(1.0, range0.getUpperBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1554.62501422);
        boolean boolean0 = range1.intersects(1554.62501422, 1.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1555.62501422, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(0.0, 1713.7001315);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3430.319188343578) , (-3430.319188343578));
        boolean boolean0 = range0.intersects(0.0, 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3430.319188343578) , (-3430.319188343578));
        org.junit.Assert.assertEquals((-3430.319188343578), range0.getLowerBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-3430.319188343578), true);
        boolean boolean0 = range1.contains((-3430.319188343578));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3430.319188343578) , (-3430.319188343578));
        boolean boolean0 = range0.contains((-3430.319188343578));
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals((-3430.319188343578), range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3430.319188343578) , (-3430.319188343578));
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[-3430.319188343578,-3430.319188343578]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1063.58258116) , 877.968508584);
        range0.hashCode();
        org.junit.Assert.assertEquals((-92.807036288), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1063.58258116) , 877.968508584);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals((-92.807036288), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-4656.5798308641), 0.0);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }
}

