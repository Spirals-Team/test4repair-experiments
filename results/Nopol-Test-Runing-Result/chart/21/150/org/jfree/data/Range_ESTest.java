package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        range0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-4640.68868) , (-4640.68868));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-348.747679548));
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-2494.718179774), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-993.7843997));
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertEquals(994.7843997, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1672.9) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1672.9));
        org.junit.Assert.assertSame(range1, range0);
        org.junit.Assert.assertEquals(1672.9, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertEquals(1.0, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1284.3517873182527 , 1667840.6079866248);
        boolean boolean0 = range0.intersects(1504.0, 2795.7);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1284.3517873182527 , 1667840.6079866248);
        boolean boolean0 = range0.intersects(1667840.6079866248, 1667840.6079866248);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(834562.4798869715, range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(0.0, 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1284.3517873182527 , 1667840.6079866248);
        double double0 = range0.constrain(2795.7);
        org.junit.Assert.assertEquals(2795.7, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3309.0) , (-784.4627367303221));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-3309.0), false);
        org.junit.Assert.assertEquals(2524.537263269678, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0, true);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1015.5090636830508));
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(2.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-3780.9), true);
        double double0 = range1.getUpperBound();
        org.junit.Assert.assertEquals((-3780.9), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-346.0) , (-58.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 4576.4430518, false);
        double double0 = range1.getLowerBound();
        org.junit.Assert.assertEquals((-202.0), range0.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 1932.57802);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2039.776);
        double double0 = range1.getLowerBound();
        org.junit.Assert.assertEquals(3006.06501, range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(2039.776, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3166.56619) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-3166.56619), 3634.905593206662);
        double double0 = range1.getCentralValue();
        org.junit.Assert.assertEquals(1.0767072012375612E7, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-155.942987418) , (-155.942987418));
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals((-155.942987418), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 0.0, 2.0);
        org.junit.Assert.assertEquals(0.0, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3166.56619) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-3166.56619), 3634.905593206662);
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, 0.0);
        org.jfree.data.Range range3 = org.jfree.data.Range.combine(range2, range1);
        org.junit.Assert.assertEquals(1.0767072012375612E7, range3.getCentralValue(), 0.01);
        org.junit.Assert.assertNotSame(range3, range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertNotSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3166.56619) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-3166.56619), 3634.905593206662);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range0, range1);
        org.junit.Assert.assertEquals(1.151333572148011E7, range2.getLength(), 0.01);
        org.junit.Assert.assertEquals(3166.56619, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(1.0023974869461115E7, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3140.8704) , (-3140.8704));
        boolean boolean0 = range0.contains(0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains(0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-346.0) , (-58.0));
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(288.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-346.0) , (-58.0));
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(288.0, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals((-346.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-2391.8290829302127));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-2391.8290829302127), true);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, (-2391.8290829302127));
        boolean boolean0 = range1.equals(range2);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range0))));
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-3587.743624395319), range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = new org.jfree.data.Range((-1.0) , 0.0);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3166.56619) , 0.0);
        boolean boolean0 = range0.equals("");
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(3166.56619, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-2391.8290829302127));
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-4640.68868) , (-4640.68868));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.4899222198991136 , 1.4899222198991136);
        double double0 = range0.constrain(1.0);
        org.junit.Assert.assertEquals(1.4899222198991136, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1284.3517873182527 , 1667840.6079866248);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1667840.6079866248);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 1284.3517873182527);
        boolean boolean0 = range2.intersects(1667840.6079866248, 1065.427635);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1667840.6079866248, range0.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals(2502403.087873596, range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(3334396.864185931, range2.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-671.3481811866469) , (-671.3481811866469));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0));
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, (-1.0));
        boolean boolean0 = range2.intersects((-671.3481811866469), (-671.3481811866469));
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals((-672.3481811866469), range1.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals((-1.0), range2.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(0.0, 1.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 1.0);
        boolean boolean0 = range0.intersects((-1.0), (-1.0));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.constrain(0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-671.3481811866469) , (-671.3481811866469));
        double double0 = range0.constrain((-1.0));
        org.junit.Assert.assertEquals((-671.3481811866469), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3592.124824276159) , (-3592.124824276159));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1828.53560102, true);
        boolean boolean0 = range1.contains((-3592.124824276159));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-671.3481811866469) , (-671.3481811866469));
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[-671.3481811866469,-671.3481811866469]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-671.3481811866469) , (-671.3481811866469));
        org.junit.Assert.assertEquals((-671.3481811866469), range0.getLowerBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0));
        boolean boolean0 = range1.intersects((-671.3481811866469), (-671.3481811866469));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-672.3481811866469), range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-2391.8290829302127));
        range0.hashCode();
        org.junit.Assert.assertEquals((-2391.8290829302127), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-671.3481811866469) , (-671.3481811866469));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-671.3481811866469), (-671.3481811866469));
        org.junit.Assert.assertEquals((-671.3481811866469), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals((-671.3481811866469), range0.getLowerBound(), 0.01);
    }
}

