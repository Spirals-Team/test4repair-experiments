package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2833.9) , (-2833.9));
        range0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0517977764143507 , 1.0517977764143507);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1.0, false);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 1.0517977764143507);
        boolean boolean0 = range0.equals(range2);
        org.junit.Assert.assertEquals(1.5517977764143507, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range0))));
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 3301.43332976285);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 3301.43332976285, 0.0);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-5448080.298769628), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2781.9) , 1471.5563357261892);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.0));
        org.junit.Assert.assertEquals((-655.1718321369054), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2781.9) , 1471.5563357261892);
        boolean boolean0 = range0.intersects((-1.0), 1471.5563357261892);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        boolean boolean0 = range0.intersects(455.17145, 2510.39449257);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2686.957248960035 , 2686.957248960035);
        boolean boolean0 = range0.intersects(0.0, (-3060.7502271));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 3301.43332976285);
        double double0 = range0.constrain(0.0);
        org.junit.Assert.assertEquals(3301.43332976285, range0.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2781.9) , 1471.5563357261892);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1471.5563357261892, false);
        org.junit.Assert.assertEquals(816.3845035892838, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2833.9) , (-2833.9));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2722.4499506639877, true);
        org.junit.Assert.assertEquals((-111.4500493360124), range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2833.9) , (-2833.9));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0);
        org.junit.Assert.assertEquals((-2833.9), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1238.897) , 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-619.4485), range0.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-376.847833288168) , (-1.0));
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-188.923916644084), range0.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-5862.586137) , (-5862.586137));
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals((-5862.586137), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 369.9);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(369.9, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-376.847833288168) , (-1.0));
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals((-188.923916644084), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1050.5) , (-1050.5));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1050.5));
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-376.847833288168) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1704.007834512597, 546.50732);
        org.junit.Assert.assertEquals((-217710.95412139362), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(375.847833288168, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2833.9) , (-2833.9));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 2722.4499506639877, (-2833.9));
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2781.9) , 1471.5563357261892);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1.401641091927228E7);
        double double0 = range1.constrain((-450.7137239022215));
        org.junit.Assert.assertEquals(1.4017882475608006E7, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2833.9) , (-2833.9));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertEquals((-2833.9), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2781.9) , 1471.5563357261892);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertEquals((-655.1718321369054), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0517977764143507 , 1.0517977764143507);
        boolean boolean0 = range0.contains(1.0517977764143507);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2686.957248960035 , 2686.957248960035);
        boolean boolean0 = range0.contains(1.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(706.7315 , 706.7315);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(706.7315, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2833.9) , (-2833.9));
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(213.94213637308 , 213.94213637308);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(213.94213637308, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(213.94213637308 , 213.94213637308);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1286.0663);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range0, range1);
        boolean boolean0 = range2.equals(range0);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertEquals(1286.0663, range2.getLength(), 0.01);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range2))));
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(213.94213637308 , 213.94213637308);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-2031.0));
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertEquals(213.94213637308, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(382.5856824310086 , 382.5856824310086);
        boolean boolean0 = range0.equals("Range[382.5856824310086,382.5856824310086]");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(213.94213637308 , 213.94213637308);
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(213.94213637308 , 213.94213637308);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-819.2353), false);
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, 1286.0663);
        org.junit.Assert.assertEquals(0.0, range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(1286.0663, range2.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(895.645572184 , 895.645572184);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 2690.768809741);
        org.junit.Assert.assertEquals(1795.123237557, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(895.645572184, range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2833.9) , (-2833.9));
        double double0 = range0.constrain(2.0);
        org.junit.Assert.assertEquals((-2833.9), range0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals((-2833.9), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2781.9) , 1471.5563357261892);
        boolean boolean0 = range0.intersects((-1222.6204334128695), (-1222.6204334128695));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(706.7315 , 706.7315);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 706.7315, true);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 0.0);
        boolean boolean0 = range2.intersects(706.7315, (-1257.82169675));
        org.junit.Assert.assertEquals(0.0, range2.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(1413.463, range2.getLength(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(382.5856824310086 , 382.5856824310086);
        boolean boolean0 = range0.intersects(382.5856824310086, 2247.699657);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        boolean boolean0 = range0.intersects(0.0, 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(706.7315 , 706.7315);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        boolean boolean0 = range1.intersects(706.7315, (-1257.82169675));
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(706.7315, range1.getLength(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2833.9) , (-2833.9));
        boolean boolean0 = range0.contains(0.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-2833.9), range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(706.7315 , 706.7315);
        double double0 = range0.constrain(706.7315);
        org.junit.Assert.assertEquals(706.7315, double0, 0.01);
        org.junit.Assert.assertEquals(706.7315, range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1238.897) , 0.0);
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[-1238.897,0.0]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(213.94213637308 , 213.94213637308);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(213.94213637308, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(213.94213637308 , 213.94213637308);
        org.junit.Assert.assertEquals(213.94213637308, range0.getUpperBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1676.0, 1.0);
        org.junit.Assert.assertEquals(213.94213637308, range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }
}

