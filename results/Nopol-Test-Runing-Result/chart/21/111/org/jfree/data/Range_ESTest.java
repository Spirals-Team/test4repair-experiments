package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2811.53151) , (-2811.53151));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1635.618147761529), true);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, (-2811.53151), (-1635.618147761529));
        org.jfree.data.Range range3 = org.jfree.data.Range.combine(range0, range2);
        boolean boolean0 = range2.equals(range3);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range3))));
        org.junit.Assert.assertTrue(range2.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertFalse(range3.equals(((java.lang.Object)(range0))));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range3.equals(((java.lang.Object)(range2))));
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2811.53151) , (-2811.53151));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1635.618147761529));
        org.junit.Assert.assertEquals((-4447.149657761529), range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2811.53151) , (-2811.53151));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1635.618147761529), true);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, (-2811.53151), (-1635.618147761529));
        org.jfree.data.Range range3 = org.jfree.data.Range.combine(range0, range2);
        org.jfree.data.Range range4 = org.jfree.data.Range.expand(range3, 28.6059936, 0.0);
        org.junit.Assert.assertEquals(0.0, range2.getLength(), 0.01);
        org.junit.Assert.assertEquals((-27023.581717335845), range4.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 3928.8);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 302.839);
        org.junit.Assert.assertEquals(3928.8, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 1408.54);
        boolean boolean0 = range0.intersects(28.6059936, 28.6059936);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-251.918445048) , 0.0);
        boolean boolean0 = range0.intersects(0.0, 0.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-125.959222524), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        boolean boolean0 = range0.intersects(0.0, 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-4583.6589259879) , 664.9);
        boolean boolean0 = range0.contains((-4583.6589259879));
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(664.9, range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0, false);
        org.junit.Assert.assertEquals(0.0, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 1403.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-2568.0));
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1976.89) , (-1976.89));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range0, range1);
        double double0 = range2.getUpperBound();
        org.junit.Assert.assertNotSame(range2, range1);
        org.junit.Assert.assertEquals((-988.445), range2.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1976.89) , (-1976.89));
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-1976.89), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 1403.0);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(638.1489975438935 , 638.1489975438935);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(638.1489975438935, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2263.5) , (-2263.5));
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals((-2263.5), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-1.0));
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1767.127602878602, 1767.127602878602);
        org.junit.Assert.assertEquals(0.0, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 1403.0);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1403.0, (-2568.0));
        org.junit.Assert.assertEquals(1403.0, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 3928.8);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 3928.8, true);
        double double0 = range1.constrain(0.0);
        org.junit.Assert.assertEquals(3928.8, double0, 0.01);
        org.junit.Assert.assertEquals(7857.6, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 1403.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertEquals(1403.0, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertNotSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 906.5779922886841, false);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(906.5779922886841, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 1403.0);
        range0.getUpperBound();
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-4583.6589259879) , 664.9);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(5248.5589259879, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3529.472) , (-3529.472));
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals((-3529.472), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 468.715);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-1.0), range1.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2811.53151) , (-2811.53151));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1635.618147761529), true);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, (-2811.53151), (-1635.618147761529));
        boolean boolean0 = range2.equals(range0);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(range2.equals(((java.lang.Object)(range1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2811.53151) , (-2811.53151));
        boolean boolean0 = range0.equals("Range[-2811.53151,-2811.53151]");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 3928.8);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 3928.8);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 0.0);
        org.junit.Assert.assertEquals(0.0, range2.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(5893.200000000001, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertEquals(0.0, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3273.18) , (-3273.18));
        double double0 = range0.constrain((-3274.493862364197));
        org.junit.Assert.assertEquals((-3273.18), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2811.53151) , (-2811.53151));
        double double0 = range0.constrain(28.6059936);
        org.junit.Assert.assertEquals((-2811.53151), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.constrain(0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 1408.54);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2.0);
        boolean boolean0 = range1.intersects(1408.54, 773.23);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1408.54, range0.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals(707.27, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3529.472) , (-3529.472));
        org.junit.Assert.assertEquals((-3529.472), range0.getLowerBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 635.2435579);
        boolean boolean0 = range1.intersects((-349.3785), 635.2435579);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1976.89) , (-1976.89));
        boolean boolean0 = range0.intersects((-1976.89), 0.0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals((-1976.89), range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1301.26 , 1301.26);
        boolean boolean0 = range0.intersects(1226.2463911, 1226.2463911);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1301.26, range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3529.472) , (-3529.472));
        boolean boolean0 = range0.intersects((-349.3785), 635.2435579);
        org.junit.Assert.assertEquals((-3529.472), range0.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains(2794.1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains((-1.0));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1301.26 , 1301.26);
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[1301.26,1301.26]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2811.53151) , (-2811.53151));
        range0.hashCode();
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }
}

