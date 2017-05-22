package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-1.0));
        range0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 8095653.441);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range0))));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1.0, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2535.2595377566 , 2535.2595377566);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 237.9415322174253, true);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 833.8354221316415);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 833.8354221316415);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1289.247473754705) , (-1289.247473754705));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1289.247473754705), false);
        boolean boolean0 = range1.intersects((-1289.247473754705), 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 833.8354221316415);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 833.8354221316415, false);
        boolean boolean0 = range1.intersects(0.0, 833.8354221316415);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1667.670844263283, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 833.8354221316415);
        boolean boolean0 = range0.intersects(0.0, 833.8354221316415);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1289.247473754705) , (-1289.247473754705));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1289.247473754705), true);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 1.0);
        boolean boolean0 = range2.intersects((-1289.247473754705), 0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 465.8);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1678.8182921182874 , 1678.8182921182874);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(1678.8182921182874, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 833.8354221316415);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(4606.1125189664 , 4606.1125189664);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(4606.1125189664, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-2251.1));
        double double0 = range1.getCentralValue();
        org.junit.Assert.assertEquals((-1125.55), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2853.381945933793, true);
        double double0 = range1.getLowerBound();
        org.junit.Assert.assertEquals(2853.381945933793, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.8377090635921455 , 2.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1807.96074);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, 1.0, 2.0);
        org.junit.Assert.assertEquals(4.6491637456310855, range2.getLength(), 0.01);
        org.junit.Assert.assertEquals(1.1622909364078544, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-13.80578938) , (-13.80578938));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2647.0, false);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, (-13.80578938), 0.0);
        org.junit.Assert.assertEquals(0.0, range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-1.0));
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-1.0), (-1.0));
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range0, range1);
        org.junit.Assert.assertEquals(0.0, range2.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.8377090635921455 , 2.0);
        double double0 = range0.constrain(1807.96074);
        org.junit.Assert.assertEquals(2.0, double0, 0.01);
        org.junit.Assert.assertEquals(0.8377090635921455, range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(4606.1125189664 , 4606.1125189664);
        boolean boolean0 = range0.contains(9357.56794511138);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        boolean boolean0 = range0.contains((-142.755728326));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2403.7557023442637) , (-2403.7557023442637));
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-2403.7557023442637), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-13.80578938) , (-13.80578938));
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals((-13.80578938), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 1688.03);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1678.8182921182874 , 1678.8182921182874);
        org.junit.Assert.assertEquals(1678.8182921182874, range0.getUpperBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1678.8182921182874);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertEquals(3357.636584236575, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2403.7557023442637) , (-2403.7557023442637));
        boolean boolean0 = range0.equals("&'K");
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-2403.7557023442637), range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-2251.1));
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, (-2251.1));
        org.junit.Assert.assertEquals((-3376.6499999999996), range2.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals((-2251.1), range2.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2219.1) , 880.6649);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1.0, true);
        org.junit.Assert.assertEquals((-668.21755), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2219.1) , 880.6649);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 794.213684864);
        org.junit.Assert.assertEquals((-669.21755), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertNotNull(range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 833.8354221316415);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertNotNull(range1);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2219.1) , 880.6649);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertNotSame(range1, range0);
        org.junit.Assert.assertEquals((-2219.1), range0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(880.6649, range0.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals(3099.7649, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.constrain(0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-131.08530664162785) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 0.0, 2718.65812995);
        boolean boolean0 = range1.intersects(2718.65812995, 0.0);
        org.junit.Assert.assertEquals(356507.21992489195, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(131.08530664162785, range0.getLength(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0.0, range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(4606.1125189664 , 4606.1125189664);
        boolean boolean0 = range0.intersects(4606.1125189664, 9357.56794511138);
        org.junit.Assert.assertEquals(4606.1125189664, range0.getUpperBound(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2219.1) , 880.6649);
        boolean boolean0 = range0.intersects(794.213684864, 794.213684864);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        double double0 = range0.constrain(465.8);
        org.junit.Assert.assertEquals((-1.0), range0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2219.1) , 880.6649);
        boolean boolean0 = range0.contains((-1.0));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-579.7128533377) , (-579.7128533377));
        double double0 = range0.constrain((-2779.1504673));
        org.junit.Assert.assertEquals((-579.7128533377), double0, 0.01);
        org.junit.Assert.assertEquals((-579.7128533377), range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2219.1) , 880.6649);
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[-2219.1,880.6649]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-2251.1));
        boolean boolean0 = range1.intersects(0.0, 0.0);
        org.junit.Assert.assertEquals((-2251.1), range1.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(2251.1, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2219.1) , 880.6649);
        range0.hashCode();
        org.junit.Assert.assertEquals((-669.21755), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2219.1) , 880.6649);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(3099.7649, double0, 0.01);
    }
}

