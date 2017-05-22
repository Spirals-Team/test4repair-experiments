package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-331.19) , (-331.19));
        range0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 1.0);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertEquals((-1.0), range1.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-276.7369) , (-276.7369));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2799.8091290078582);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1076.6935838662) , (-1076.6935838662));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1076.6935838662));
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.0));
        org.junit.Assert.assertSame(range1, range0);
        org.junit.Assert.assertEquals((-0.5), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 0.0, 0.0);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range0, range1);
        org.junit.Assert.assertEquals(0.0, range2.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-207.1747480636294));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertNotNull(range1);
        org.junit.Assert.assertEquals((-207.1747480636294), range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 4739.927635489617);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-208.00310718879277));
        boolean boolean0 = range1.intersects(2.0, 4739.927635489617);
        org.junit.Assert.assertEquals(4531.924528300825, range1.getLength(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(1553.298135457, 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1539.1627595069426 , 1539.1627595069426);
        boolean boolean0 = range0.intersects(1539.1627595069426, 1539.1627595069426);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 4739.927635489617);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-208.00310718879277));
        double double0 = range1.constrain(0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(2265.9622641504125, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 565.56061, false);
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, 0.0);
        org.junit.Assert.assertEquals(565.56061, range2.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1907.448582406568 , 1907.448582406568);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(1907.448582406568, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1076.6935838662) , (-1076.6935838662));
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-1076.6935838662), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2969.14181035172 , 2969.14181035172);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(2969.14181035172, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-1.0));
        range0.getLowerBound();
        org.junit.Assert.assertEquals((-1.0), range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(721.705007 , 721.705007);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(721.705007, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1794.028) , 2238.8959836571244);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-1794.028), 2238.8959836571244);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 378.88228);
        org.junit.Assert.assertEquals(4032.923983657124, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(4515957.543834041, range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 0.0, 1.0746154229098697);
        org.junit.Assert.assertEquals(2.0746154229098694, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1076.6935838662) , (-1076.6935838662));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-1076.6935838662), 1660.94);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        double double0 = range0.constrain((-633.886323));
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 1767.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertNotSame(range1, range0);
        org.junit.Assert.assertEquals(1765.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-331.19) , (-331.19));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-2335.587));
        boolean boolean0 = range1.contains((-331.19));
        org.junit.Assert.assertEquals((-2666.777), range1.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1794.028) , 2238.8959836571244);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(4032.923983657124, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1036.29345) , (-304.4518916265));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1036.29345));
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range1);
        org.jfree.data.Range range3 = org.jfree.data.Range.expandToInclude(range2, (-622.0));
        boolean boolean0 = range3.equals(range2);
        org.junit.Assert.assertTrue(range2.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertEquals((-1706.6661208132498), range2.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range3))));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertNotSame(range2, range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-276.7369) , (-276.7369));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-276.7369));
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-553.4738), range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1036.29345) , (-304.4518916265));
        boolean boolean0 = range0.equals("");
        org.junit.Assert.assertEquals((-670.3726708132499), range0.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1036.29345) , (-304.4518916265));
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals((-670.3726708132499), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0, false);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2.0);
        org.junit.Assert.assertEquals(2.0, range0.getUpperBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1.0, true);
        org.junit.Assert.assertEquals(3.0, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertNotNull(range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-4815729.492266055) , (-4815729.492266055));
        double double0 = range0.constrain((-4815729.492266055));
        org.junit.Assert.assertEquals((-4815729.492266055), double0, 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1096.36444));
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 3160.4);
        boolean boolean0 = range2.intersects(2.0, (-319.356));
        org.junit.Assert.assertEquals(1032.0177800000001, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-547.18222), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1365.39839016));
        boolean boolean0 = range1.intersects(0.0, 0.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-682.69919508), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-276.7369) , (-276.7369));
        boolean boolean0 = range0.intersects((-276.7369), 2799.8091290078582);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(3209.7699852495707 , 3209.7699852495707);
        boolean boolean0 = range0.intersects(1539.1627595069426, 1539.1627595069426);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(3209.7699852495707, range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1096.36444));
        boolean boolean0 = range1.intersects((-17.492226423550562), (-17.492226423550562));
        org.junit.Assert.assertEquals(2.0, range0.getUpperBound(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1036.29345) , (-304.4518916265));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1036.29345));
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range1);
        org.jfree.data.Range range3 = org.jfree.data.Range.shift(range2, 0.0, false);
        double double0 = range3.constrain((-304.4518916265));
        org.junit.Assert.assertEquals((-1036.29345), range0.getLowerBound(), 0.01);
        org.junit.Assert.assertTrue(range2.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertEquals((-1340.7453416264998), double0, 0.01);
        org.junit.Assert.assertNotSame(range2, range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains(0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(3109.4280954279 , 3109.4280954279);
        boolean boolean0 = range0.contains(1.0);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2.0);
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[2.0,2.0]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-331.19) , (-331.19));
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals((-331.19), double0, 0.01);
    }
}

