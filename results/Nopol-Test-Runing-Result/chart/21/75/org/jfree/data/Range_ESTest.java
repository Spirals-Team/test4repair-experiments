package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-795.727090378678) , (-795.727090378678));
        range0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-907.95) , 2272.41278734613);
        org.jfree.data.Range range1 = new org.jfree.data.Range((-907.95) , (-1.0));
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertEquals((-907.95), range1.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1957.2) , 1216.972);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0));
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-371.11400000000003), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1958.4406411117402) , 1216.972);
        boolean boolean0 = range0.intersects((-1.0), 0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(1843.9805278903668, 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects((-1437.86484), (-1437.86484));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0, true);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 2.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2.0, false);
        org.junit.Assert.assertEquals(4.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0));
        org.junit.Assert.assertEquals((-2.0), range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-907.95) , 2272.41278734613);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(3180.36278734613, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(2272.41278734613, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1540.2 , 1540.2);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(1540.2, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1052.034) , (-1052.034));
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals((-1052.034), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-4761.32), true);
        double double0 = range1.getCentralValue();
        org.junit.Assert.assertEquals((-4761.32), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1957.2) , 1216.972);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-352.03180563244), 884.51);
        org.junit.Assert.assertEquals(1693351.5471720665, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(3174.172, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2337.24693);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, (-1.0), (-1.0));
        org.junit.Assert.assertEquals(0.0, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 6.025046437119522);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, 1843.9805278903668, 0.0);
        org.junit.Assert.assertEquals(6.025046437119522, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-1.0), (-352.03180563244));
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1957.2) , 1216.972);
        double double0 = range0.constrain((-1.0));
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-1.0));
        org.junit.Assert.assertEquals((-1.0), range0.getLowerBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2337.24693);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertEquals(0.0, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertNotNull(range2);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains(3911.342595724);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains(0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1052.034) , (-1052.034));
        range0.getUpperBound();
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.junit.Assert.assertEquals(1.0, range0.getUpperBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1593.6238435754);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        boolean boolean0 = range2.equals(range0);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertEquals(1.0, range0.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1593.6238435754, range2.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1957.2) , 1216.972);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1957.2), false);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-1957.2), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1957.2) , 1216.972);
        java.lang.Object object0 = new java.lang.Object();
        boolean boolean0 = range0.equals(object0);
        org.junit.Assert.assertEquals(3174.172, range0.getLength(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1957.2) , 1216.972);
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertEquals(3174.172, range0.getLength(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1957.2) , 1216.972);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1957.2), false);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 2.0);
        org.junit.Assert.assertEquals(2.0, range2.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals(3914.4, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-388.9898649695297));
        org.junit.Assert.assertEquals((-388.9898649695297), range1.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals((-193.99493248476486), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1957.2) , 1216.972);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1957.2));
        org.junit.Assert.assertEquals((-370.11400000000003), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertSame(range1, range0);
        org.junit.Assert.assertEquals(1216.972, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 6.025046437119522);
        double double0 = range1.constrain(0.0);
        org.junit.Assert.assertEquals(6.025046437119522, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals(6.025046437119522, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(6.025046437119522, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1957.2) , 1216.972);
        boolean boolean0 = range0.intersects((-1.0), (-1528.123946591789));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-370.11400000000003), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2120.80281134) , 0.0);
        boolean boolean0 = range0.intersects(0.0, (-2120.80281134));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-1060.40140567), range0.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-907.95) , 2272.41278734613);
        boolean boolean0 = range0.intersects((-907.95), 0.0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(682.2313936730649, range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(0.0, 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1957.2) , 1216.972);
        boolean boolean0 = range0.intersects(0.0, 0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        boolean boolean0 = range0.contains((-1667.2819080194622));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1957.2) , 1216.972);
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[-1957.2,1216.972]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1957.2) , 1216.972);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1957.2), false);
        double double0 = range1.constrain(1216.972);
        org.junit.Assert.assertEquals(3914.4, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 2.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(2.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1957.2) , 1216.972);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(3174.172, double0, 0.01);
    }
}

