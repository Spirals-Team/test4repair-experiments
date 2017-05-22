package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(222.98998297921 , 222.98998297921);
        range0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 4005.489825931434);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range1);
        org.junit.Assert.assertNotNull(range2);
        boolean boolean0 = range0.equals(range2);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range0))));
        org.junit.Assert.assertEquals(0.0, range2.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2.0, false);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1294.4667113353464) , 103.92888);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.junit.Assert.assertEquals(1398.3955913353464, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2054.065660245) , 7916281.404893209);
        boolean boolean0 = range0.intersects(0.0, 465.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 2840.7963113399);
        boolean boolean0 = range1.intersects(2840.7963113399, (-2485.6265541));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(2839.7963113399, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(980.2650597231964 , 980.2650597231964);
        boolean boolean0 = range0.intersects(1.0, 980.2650597231964);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-19.760221274628265) , (-19.760221274628265));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 3283.05604729);
        double double0 = range1.constrain((-19.760221274628265));
        org.junit.Assert.assertEquals(1631.647913007686, range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals((-19.760221274628265), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 494.9415184586, false);
        org.junit.Assert.assertEquals(494.9415184586, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 1308.55878);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(1308.55878, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(1308.55878, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(2.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 879.778112859);
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, 879.778112859);
        double double0 = range2.getLength();
        org.junit.Assert.assertEquals(879.778112859, range2.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(879.778112859, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-19.760221274628265) , (-19.760221274628265));
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals((-19.760221274628265), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-352.3439297386));
        org.junit.Assert.assertEquals(351.3439297386, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 879.778112859);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, (-168.2516), 879.778112859);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(879.778112859, range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2054.065660245) , 7916281.404893209);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 0.0, 3435.821);
        org.junit.Assert.assertEquals(1.3606948761055836E10, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-19.760221274628265) , (-19.760221274628265));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-3361.310086), 0.0);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.constrain(0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        double double0 = range0.constrain(2840.7963113399);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 4005.489825931434);
        double double0 = range1.getCentralValue();
        org.junit.Assert.assertEquals(4005.489825931434, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.junit.Assert.assertEquals(1.0, range0.getUpperBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertNotSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-19.760221274628265) , (-19.760221274628265));
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-19.760221274628265), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2949.4901506359415) , (-2949.4901506359415));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2.0);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        org.jfree.data.Range range3 = org.jfree.data.Range.shift(range2, 0.0, false);
        boolean boolean0 = range3.equals(range0);
        org.junit.Assert.assertTrue(range3.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-2948.4901506359415), range3.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range2))));
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-687.6740816930192) , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-687.6740816930192), true);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertEquals((-687.6740816930192), range0.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-1031.0111225395287), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-19.760221274628265) , (-19.760221274628265));
        boolean boolean0 = range0.equals("Range[-19.760221274628265,-19.760221274628265]");
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = new org.jfree.data.Range((-2054.065660245) , 7916281.404893209);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range0, range1);
        org.jfree.data.Range range3 = org.jfree.data.Range.shift(range2, 3435.821);
        org.junit.Assert.assertEquals(3959858.612946605, range3.getCentralValue(), 0.01);
        org.junit.Assert.assertNotSame(range2, range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0, true);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        double double0 = range0.constrain((-1.67));
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
        org.junit.Assert.assertEquals((-1.0), range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 1181.715145644);
        boolean boolean0 = range0.intersects(1.0, (-1.0));
        org.junit.Assert.assertEquals(1181.715145644, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(2.0, 134.715);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        boolean boolean0 = range0.intersects(0.0, 4005.489825931434);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(0.0, (-4425.8804796));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2054.065660245) , 7916281.404893209);
        boolean boolean0 = range0.intersects(0.0, 0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        boolean boolean0 = range0.contains(0.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-1.0), range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains(0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains((-4292.8763238));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[0.0,0.0]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3528.0) , (-3528.0));
        range0.hashCode();
        org.junit.Assert.assertEquals((-3528.0), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 0.0, 3435.821);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }
}

