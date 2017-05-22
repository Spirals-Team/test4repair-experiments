package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1497.539 , 1497.539);
        range0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        range0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(282.94 , 282.94);
        org.jfree.data.Range range1 = new org.jfree.data.Range(282.94 , 1260.2456137219);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range0, 1260.2456137219, 282.94);
        boolean boolean0 = range2.equals(range1);
        org.junit.Assert.assertEquals(977.3056137219, range1.getLength(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(range2.equals(((java.lang.Object)(range0))));
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-269.9), true);
        org.junit.Assert.assertEquals((-269.9), range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 3797.20139188559);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, (-1.0), 376.9762846942595);
        org.junit.Assert.assertEquals(1431454.8729489006, range2.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2913.217) , 352.420247);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-2913.217));
        org.junit.Assert.assertSame(range1, range0);
        org.junit.Assert.assertEquals((-1280.3983765), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-269.9));
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        org.jfree.data.Range range3 = org.jfree.data.Range.expand(range2, 2543.0763279, 2543.0763279);
        boolean boolean0 = range3.intersects(0.0, 0.0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals((-134.95000000001164), range3.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        boolean boolean0 = range0.intersects(1.0, 2736.6757162118756);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(0.0, (-269.9));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3143.260219356) , (-3143.260219356));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range0, range1);
        double double0 = range2.constrain((-3143.260219356));
        org.junit.Assert.assertEquals(0.0, range2.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals((-1571.630109678), range2.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals((-3143.260219356), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1384.05494948752);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1.0, false);
        org.junit.Assert.assertEquals(693.52747474376, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0, false);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1.0);
        boolean boolean0 = range1.intersects((-1.0), 1.0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(0.0, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1497.539 , 1497.539);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(1497.539, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1083.4994682531997 , 1083.4994682531997);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        double double0 = range1.getLowerBound();
        org.junit.Assert.assertEquals(1083.4994682531997, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(985.3756312498 , 985.3756312498);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(985.3756312498, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2737.6757162118756) , (-1.0));
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(2736.6757162118756, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(384.99 , 384.99);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(384.99, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-269.9));
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        double double0 = range2.getCentralValue();
        org.junit.Assert.assertEquals(0.0, range2.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals((-269.9), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals((-134.95), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1083.4994682531997 , 1083.4994682531997);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 1083.4994682531997);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1899.78, 1899.78);
        org.junit.Assert.assertEquals(0.0, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-3311.874666969));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-892.027774491), (-3311.874666969));
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertNotSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-3311.874666969));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-892.027774491), false);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertEquals((-4203.90244146), range1.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        boolean boolean0 = range0.contains(1.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-488.3191261) , (-488.3191261));
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-488.3191261), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(985.3756312498 , 985.3756312498);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-488.3191261) , (-488.3191261));
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals((-488.3191261), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1497.539 , 1497.539);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-288.578231723));
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1208.960768277, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(985.3756312498 , 985.3756312498);
        java.lang.Object object0 = new java.lang.Object();
        boolean boolean0 = range0.equals(object0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-488.3191261) , (-488.3191261));
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3143.260219356) , (-3143.260219356));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, 1.0);
        org.junit.Assert.assertEquals((-1570.630109678), range2.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-488.3191261) , (-488.3191261));
        org.junit.Assert.assertEquals((-488.3191261), range0.getLowerBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-98.323916903847));
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertEquals((-293.3215215019235), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-3311.874666969));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNotNull(range1);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(455.2225813 , 455.2225813);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertEquals(455.2225813, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertNotNull(range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.constrain((-1.0));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3143.260219356) , (-3143.260219356));
        double double0 = range0.constrain((-3143.260219356));
        org.junit.Assert.assertEquals((-3143.260219356), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1083.4994682531997 , 1083.4994682531997);
        org.junit.Assert.assertEquals(1083.4994682531997, range0.getUpperBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        boolean boolean0 = range1.intersects(2.0, 0.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1083.4994682531997, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2913.217) , 352.420247);
        boolean boolean0 = range0.intersects(0.0, 2.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(985.3756312498 , 985.3756312498);
        boolean boolean0 = range0.intersects(985.3756312498, 985.3756312498);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 1240.71);
        boolean boolean0 = range0.intersects(1240.71, 0.0);
        org.junit.Assert.assertEquals(0.0, range0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(620.355, range0.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1497.539 , 1497.539);
        double double0 = range0.constrain(2005.370432);
        org.junit.Assert.assertEquals(1497.539, double0, 0.01);
        org.junit.Assert.assertEquals(1497.539, range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(985.3756312498 , 985.3756312498);
        boolean boolean0 = range0.contains(985.3756312498);
        org.junit.Assert.assertEquals(985.3756312498, range0.getLowerBound(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(426.0 , 1610.945457016);
        boolean boolean0 = range0.contains((-1655.0));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1184.945457016, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-488.3191261) , (-488.3191261));
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[-488.3191261,-488.3191261]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }
}

