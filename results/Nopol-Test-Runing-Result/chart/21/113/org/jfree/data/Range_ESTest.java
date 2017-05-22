package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-290.208145) , (-290.208145));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 4454.8791375046);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertEquals((-290.208145), range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 102.73);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 3029.89160323, 34.5);
        org.junit.Assert.assertEquals(102.73, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals((-153806.92469990897), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.0));
        org.junit.Assert.assertEquals((-0.5), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(216.782383718 , 216.782383718);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1905.6607304));
        boolean boolean0 = range1.intersects((-1.0), 216.782383718);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(2310.0359517754, 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(5751.0 , 5751.0);
        boolean boolean0 = range0.intersects(1882.15, 1882.15);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1142.3656);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1.0, false);
        org.junit.Assert.assertEquals(572.6828, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-290.208145) , (-290.208145));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1167.497864091735, false);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2486.2) , 399.002);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 3311.059);
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, (-32.57183275), false);
        org.junit.Assert.assertEquals(5797.259, range2.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2807.47) , (-2807.47));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-878.04752));
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertEquals((-3685.51752), range1.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-290.208145) , (-290.208145));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1167.497864091735);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-791.84386) , 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-395.92193), range0.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(216.782383718 , 216.782383718);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(216.782383718, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2486.2) , 399.002);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(2885.2019999999998, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3914.4) , 259.426175742);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals((-1827.486912129), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(136.3 , 136.3);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 136.3);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 54.290441144286);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, 0.0, 0.0);
        org.junit.Assert.assertEquals(54.290441144286, range2.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-0.29654645776257804), 0.0);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(5525.88032958 , 5525.88032958);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 102.73);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertEquals(102.73, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2486.2) , 399.002);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-32.57183275), false);
        org.junit.Assert.assertEquals((-1076.1708327499998), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1142.3656);
        boolean boolean0 = range0.contains(3593.66911846838);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(571.6828, range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(5525.88032958 , 5525.88032958);
        boolean boolean0 = range0.contains((-981.391779928));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2807.47) , (-2807.47));
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-2807.47), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2807.47) , (-2807.47));
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3914.4) , 259.426175742);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(4173.8261757420005, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals((-3914.4), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-290.208145) , (-290.208145));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 1985.14962);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertEquals((-290.208145), range1.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2807.47) , (-2807.47));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-2807.47), true);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(5751.0 , 5751.0);
        boolean boolean0 = range0.equals(((java.lang.Object)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-290.208145) , (-290.208145));
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-290.208145) , (-290.208145));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-290.208145));
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2807.47) , (-2807.47));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertSame(range0, range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(216.782383718 , 216.782383718);
        double double0 = range0.constrain(216.782383718);
        org.junit.Assert.assertEquals(216.782383718, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-471.85839357161194), true);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range0, range1);
        org.jfree.data.Range range3 = org.jfree.data.Range.shift(range2, 101.717084617);
        boolean boolean0 = range3.intersects(0.0, (-471.85839357161194));
        org.junit.Assert.assertEquals(0.0, range2.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(471.85839357161194, range3.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3914.4) , 259.426175742);
        boolean boolean0 = range0.intersects((-1.0), (-1.0));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.junit.Assert.assertEquals(1.0, range0.getUpperBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1.0);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, (-1311.577901395), 1.0);
        boolean boolean0 = range2.intersects((-2184.2539758795033), 2.0);
        org.junit.Assert.assertEquals(0.0, range2.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(0.0, 1094.129524914096);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 1147.9255135);
        boolean boolean0 = range0.intersects(1147.9255135, 255.1955143632);
        org.junit.Assert.assertEquals(573.96275675, range0.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-0.29654645776257804), true);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 0.0);
        boolean boolean0 = range2.contains((-0.29654645776257804));
        org.junit.Assert.assertEquals(0.0, range2.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals((-0.29654645776257804), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-290.208145) , (-290.208145));
        double double0 = range0.constrain(0.0);
        org.junit.Assert.assertEquals((-290.208145), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.constrain((-0.14827322888128902));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-290.208145) , (-290.208145));
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[-290.208145,-290.208145]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2170.36815) , (-2170.36815));
        range0.hashCode();
        org.junit.Assert.assertEquals((-2170.36815), range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 1147.9255135);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(573.96275675, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-290.208145) , (-290.208145));
        org.junit.Assert.assertEquals((-290.208145), range0.getLowerBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1167.497864091735, (-290.208145));
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }
}

