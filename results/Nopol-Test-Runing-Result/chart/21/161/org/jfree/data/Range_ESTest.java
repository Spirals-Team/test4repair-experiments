package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1079.6822) , (-1079.6822));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1079.6822, range1.getLength(), 0.01);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-2676.90882370692), false);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-2676.90882370692), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-0.301) , 0.0);
        boolean boolean0 = range0.intersects((-0.1505), 1368.7084);
        org.junit.Assert.assertEquals((-0.301), range0.getLowerBound(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-454.3891) , (-454.3891));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        boolean boolean0 = range1.intersects(0.0, (-2883.27));
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-227.19455), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        boolean boolean0 = range0.intersects((-256.5908916), (-2415.9046));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 3466.1930766303, true);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 2.0);
        org.jfree.data.Range range3 = org.jfree.data.Range.expand(range2, 3466.1930766303, 3466.1930766303);
        double double0 = range3.constrain(3466.1930766303);
        org.junit.Assert.assertEquals(2.403245508203628E7, range3.getLength(), 0.01);
        org.junit.Assert.assertEquals(3466.1930766303, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 1599.205617228);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0), false);
        org.junit.Assert.assertEquals(798.102808614, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1664.9446943059147, false);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1079.6822) , (-1079.6822));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0);
        org.junit.Assert.assertEquals((-1079.6822), range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(1.0, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1173.920442913 , 1173.920442913);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(1173.920442913, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1924.996 , 1924.996);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(1924.996, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1000.2639342329991 , 1732.10872);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(731.8447857670009, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1173.920442913 , 1173.920442913);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(1173.920442913, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-2415.9046));
        org.junit.Assert.assertEquals(2414.9046, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1.0, 0.0);
        org.junit.Assert.assertEquals(1.0, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-38.7261854) , (-38.7261854));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 555.90279938);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, 2.0, 0.0);
        double double0 = range2.getLowerBound();
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-0.301) , (-0.301));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2.0);
        double double0 = range0.constrain(3466.1930766303);
        org.junit.Assert.assertEquals(2.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertNotSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        range0.getUpperBound();
        org.junit.Assert.assertEquals((-1.0), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1079.6822) , (-1079.6822));
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals((-1079.6822), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-817.15), true);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range0, range1);
        boolean boolean0 = range2.equals(range1);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range0))));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-408.575), range2.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range2))));
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1.0);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertEquals(1.0, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 1449.9978419430595);
        boolean boolean0 = range0.equals(((java.lang.Object)(null)));
        org.junit.Assert.assertEquals(1449.9978419430595, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 1449.9978419430595);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1449.9978419430595, 1449.9978419430595);
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, 0.0);
        org.junit.Assert.assertEquals(0.0, range0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(4206437.481121003, range2.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 1449.9978419430595);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.junit.Assert.assertSame(range1, range0);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(1449.9978419430595, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertEquals(1.0, range1.getCentralValue(), 0.01);
        org.junit.Assert.assertNotNull(range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1079.6822) , (-1079.6822));
        double double0 = range0.constrain((-1403.73));
        org.junit.Assert.assertEquals((-1079.6822), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        double double0 = range0.constrain(0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2.0);
        org.junit.Assert.assertEquals(2.0, range0.getUpperBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 3466.1930766303, true);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 2.0);
        org.jfree.data.Range range3 = org.jfree.data.Range.expand(range2, 3466.1930766303, 3466.1930766303);
        org.jfree.data.Range range4 = org.jfree.data.Range.combine(range3, range0);
        boolean boolean0 = range4.intersects(2.0, 0.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(2.403245508203628E7, range4.getLength(), 0.01);
        org.junit.Assert.assertNotSame(range4, range3);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-454.3891) , (-454.3891));
        boolean boolean0 = range0.intersects(0.0, (-2883.27));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(0.0, 409.309405530139);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-454.3891) , (-454.3891));
        boolean boolean0 = range0.intersects((-454.3891), (-454.3891));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-454.3891), range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(859.1429 , 859.1429);
        boolean boolean0 = range0.contains(859.1429);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(859.1429, range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 1599.205617228);
        boolean boolean0 = range0.contains(2750.2);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1600.205617228, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains((-1.0));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 1449.9978419430595);
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[0.0,1449.9978419430595]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-454.3891) , (-454.3891));
        range0.hashCode();
        org.junit.Assert.assertEquals((-454.3891), range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-0.301) , (-0.301));
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals((-0.301), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 1449.9978419430595);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1449.9978419430595, 1449.9978419430595);
        boolean boolean0 = range1.intersects(0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, range0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(4206437.481121003, range1.getLength(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(1449.9978419430595, range0.getLength(), 0.01);
    }
}

