package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(246.710511422 , 246.710511422);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 1723.16954978);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range0))));
        org.junit.Assert.assertEquals(246.710511422, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(210.712123256 , 210.712123256);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-2781.028361209149));
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1563.780365349) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1526.0));
        org.junit.Assert.assertEquals((-781.8901826745), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 1385.536658912819);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, 0.0, 1385.536658912819);
        org.jfree.data.Range range3 = org.jfree.data.Range.combine(range1, range2);
        boolean boolean0 = range3.intersects(960223.1173982611, 1921097.36985021);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(960548.684925105, range3.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3163.3954) , (-3163.3954));
        boolean boolean0 = range0.intersects((-773.147090629), (-773.147090629));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(210.712123256 , 210.712123256);
        boolean boolean0 = range0.intersects(0.0, 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 253.0);
        boolean boolean0 = range1.contains(0.0);
        org.junit.Assert.assertEquals(253.0, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2530.7062325 , 2530.7062325);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2530.7062325, true);
        org.junit.Assert.assertEquals(5061.412465, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(210.712123256 , 210.712123256);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(210.712123256, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2972.80291965);
        double double0 = range1.getLowerBound();
        org.junit.Assert.assertEquals(2972.80291965, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 1385.536658912819);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, 0.0, 1385.536658912819);
        double double0 = range2.getLength();
        org.junit.Assert.assertEquals(1921097.36985021, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 1385.536658912819);
        double double0 = range1.getCentralValue();
        org.junit.Assert.assertEquals(692.7683294564094, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3540.2758185872835) , (-3540.2758185872835));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-3540.2758185872835));
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(210.712123256 , 210.712123256);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-998.023), (-2781.028361209149));
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(210.712123256 , 210.712123256);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-2781.028361209149));
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, (-2781.028361209149), 0.0);
        org.junit.Assert.assertEquals(0.0, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2764.829830924275) , (-2764.829830924275));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-2764.829830924275), (-2764.829830924275));
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.constrain((-47.65552336));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
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
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1361.1) , (-1361.1));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertNotSame(range0, range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0, false);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains(253.0);
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
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
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
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2764.829830924275) , (-2764.829830924275));
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals((-2764.829830924275), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3543.4023057700438) , (-3543.4023057700438));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 922.9165529594942);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertEquals((-3543.4023057700438), range1.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3543.0317479426735) , (-3543.0317479426735));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-3543.0317479426735));
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-7086.063495885347), range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.equals("pThLm;#1yL-");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3543.4023057700438) , (-3543.4023057700438));
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1809.3846434637), true);
        org.junit.Assert.assertEquals((-1809.3846434637), range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1135.5521877550802);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, (-1.0));
        org.junit.Assert.assertEquals((-0.5), range2.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.43312747740204516);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertEquals(0.43312747740204516, range1.getCentralValue(), 0.01);
        org.junit.Assert.assertNotNull(range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertNotNull(range1);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.43312747740204516);
        double double0 = range0.constrain(0.0);
        org.junit.Assert.assertEquals(0.43312747740204516, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(210.712123256 , 210.712123256);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 2490.692816223193);
        boolean boolean0 = range1.intersects(2074.3246, 210.712123256);
        org.junit.Assert.assertEquals(210.712123256, range0.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1350.7024697395964, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2217.441476940978) , 2489.811883827129);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2489.811883827129, false);
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, (-2217.441476940978));
        org.jfree.data.Range range3 = org.jfree.data.Range.combine(range2, range2);
        boolean boolean0 = range3.intersects(2489.811883827129, 2489.811883827129);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertNotSame(range3, range2);
        org.junit.Assert.assertEquals(272.3704068861507, range3.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals((-2217.441476940978), range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(0.0, 1.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects((-404.65195), 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2217.441476940978) , 2489.811883827129);
        boolean boolean0 = range0.intersects(2489.811883827129, 2489.811883827129);
        org.junit.Assert.assertEquals(136.18520344307535, range0.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3543.0317479426735) , (-3543.0317479426735));
        double double0 = range0.constrain(922.9165529594942);
        org.junit.Assert.assertEquals((-3543.0317479426735), range0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals((-3543.0317479426735), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3540.2758185872835) , (-3540.2758185872835));
        double double0 = range0.constrain((-3540.2758185872835));
        org.junit.Assert.assertEquals((-3540.2758185872835), range0.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals((-3540.2758185872835), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2.0);
        boolean boolean0 = range0.contains((-2184.10945168927));
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 2.0);
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[0.0,2.0]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1361.1) , (-1361.1));
        range0.hashCode();
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }
}

