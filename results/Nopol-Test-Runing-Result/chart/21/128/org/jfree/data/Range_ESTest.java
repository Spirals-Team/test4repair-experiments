package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1707.83) , (-1707.83));
        range0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(639.351644 , 639.351644);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 639.351644);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range0, range1);
        boolean boolean0 = range2.equals(range0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertEquals(959.027466, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-468.4083559999999));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-468.4083559999999), false);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-683.0) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-683.0));
        org.junit.Assert.assertEquals((-341.5), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-691.9395245573));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertSame(range0, range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 15.349660997885863);
        org.jfree.data.Range range1 = new org.jfree.data.Range((-901.38) , (-901.38));
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        boolean boolean0 = range2.intersects((-646.2291692770175), 0.0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(15.349660997885863, range2.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-683.0) , 0.0);
        boolean boolean0 = range0.intersects(0.0, (-1880.564034065239));
        org.junit.Assert.assertEquals((-341.5), range0.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(634.133807 , 634.133807);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 634.133807);
        boolean boolean0 = range1.intersects(634.133807, 634.133807);
        org.junit.Assert.assertEquals(1268.267614, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1000.209559921496 , 1000.209559921496);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2640.0);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 2640.0);
        double double0 = range2.constrain(2640.0);
        org.junit.Assert.assertEquals(1000.2095599214958, range2.getLength(), 0.01);
        org.junit.Assert.assertEquals(2640.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0, false);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1589.6763118694, false);
        org.junit.Assert.assertEquals(1589.6763118694, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 15.349660997885863);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(15.349660997885863, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(15.349660997885863, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-714.43126806792));
        double double0 = range1.getUpperBound();
        org.junit.Assert.assertEquals((-714.43126806792), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 464.4153059983115);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(463.4153059983115, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 15.349660997885863);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(15.349660997885863, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.6806394474564255 , 0.6806394474564255);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.6806394474564255, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1707.83) , (-1707.83));
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals((-1707.83), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 204.832518748);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 204.832518748);
        org.junit.Assert.assertSame(range2, range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(639.351644 , 639.351644);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 600.07, (-1782.239998));
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-691.9395245573));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-691.9395245573), (-691.9395245573));
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-683.0) , 0.0);
        double double0 = range0.constrain(0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals((-683.0), range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertNotSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains(0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains((-1906.677782221216));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-683.0) , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals((-341.5), range0.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals((-683.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0), false);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, (-1.0));
        boolean boolean0 = range1.equals(range2);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range0))));
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertEquals((-1.0), range2.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0));
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertEquals((-2.0), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-683.0) , 0.0);
        java.lang.Object object0 = new java.lang.Object();
        boolean boolean0 = range0.equals(object0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-341.5), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-1.0));
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals((-1.0), range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-683.0) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1880.564034065239), false);
        org.junit.Assert.assertEquals((-683.0), range0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals((-2222.064034065239), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 3557.692290738724);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2.0);
        org.junit.Assert.assertEquals(0.0, range0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(1780.846145369362, range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(3557.692290738724, range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0), true);
        org.junit.Assert.assertEquals((-1.0), range1.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals((-1.0), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals((-1.0), range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertEquals((-1.0), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertNotNull(range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 464.4153059983115);
        double double0 = range0.constrain(1195.55364);
        org.junit.Assert.assertEquals(464.4153059983115, double0, 0.01);
        org.junit.Assert.assertEquals(1.0, range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 15.349660997885863);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 4812.925767710127, 4812.925767710127);
        boolean boolean0 = range1.intersects(961.04261267, (-901.38));
        org.junit.Assert.assertEquals(15.349660997885863, range0.getLength(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(147768.9075456779, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-714.43126806792));
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        boolean boolean0 = range2.intersects((-1.0), (-1.0));
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(714.43126806792, range2.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range2.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(0.0, 1.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects((-1706.0249736051514), 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-714.43126806792));
        boolean boolean0 = range1.intersects((-1.0), (-1.0));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-714.43126806792), range1.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals((-714.43126806792), range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2885.48914347) , (-2885.48914347));
        boolean boolean0 = range0.contains(1.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-1.0));
        double double0 = range0.constrain((-1.0));
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.6806394474564255 , 0.6806394474564255);
        double double0 = range0.constrain(0.23881430368706338);
        org.junit.Assert.assertEquals(0.6806394474564255, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[0.0,0.0]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-1.0), 0.0);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }
}

