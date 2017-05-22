package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 3654.575703854);
        range0.hashCode();
        org.junit.Assert.assertEquals(1826.787851927, range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.1173572411680661) , (-1.1173572411680661));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 4748.46);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-1.1173572411680661), range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = new org.jfree.data.Range((-2440.33) , (-2440.33));
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.1173572411680661) , (-1.1173572411680661));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 4748.46);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, (-1.1173572411680661));
        org.junit.Assert.assertSame(range2, range1);
        org.junit.Assert.assertEquals(2373.671321379416, range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.1173572411680661) , (-1.1173572411680661));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.1173572411680661));
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-781.05513489253) , (-220.7800676327592));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-220.7800676327592));
        boolean boolean0 = range1.intersects((-781.05513489253), (-781.05513489253));
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(560.2750672597707, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-781.05513489253) , (-781.05513489253));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-781.05513489253));
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, (-781.05513489253));
        boolean boolean0 = range2.intersects((-781.05513489253), (-781.05513489253));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-1171.582702338795), range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(518.03297615 , 518.03297615);
        boolean boolean0 = range0.intersects(0.0, 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2634.7240476 , 2634.7240476);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(2634.7240476, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(518.03297615 , 518.03297615);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(518.03297615, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        double double0 = range1.getLength();
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.1173572411680661) , (-1.1173572411680661));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 4748.46);
        double double0 = range1.getCentralValue();
        org.junit.Assert.assertEquals(2373.671321379416, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-837.70429) , (-837.70429));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-398.14438032));
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, (-837.70429));
        org.jfree.data.Range range3 = org.jfree.data.Range.expand(range2, 0.0, 0.0);
        org.junit.Assert.assertEquals(439.5599096799999, range3.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 4157.6412484, true);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, (-1.0), 4157.6412484);
        org.junit.Assert.assertEquals(0.0, range2.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2336.5213374315417) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-1.0), 0.0);
        org.junit.Assert.assertEquals(2335.5213374315417, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals((-1.0), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.constrain(0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-630.0749) , (-630.0749));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2696.6, false);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        org.jfree.data.Range range3 = org.jfree.data.Range.shift(range2, 2696.6);
        boolean boolean0 = range3.contains(0.0);
        org.junit.Assert.assertEquals(1348.3, range3.getCentralValue(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2012.0) , (-2012.0));
        boolean boolean0 = range0.contains((-3839.81597));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2336.5213374315417) , (-1.0));
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(2335.5213374315417, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2012.0) , (-2012.0));
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals((-2012.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2408.962275 , 2408.962275);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 528.42);
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, 528.42);
        org.jfree.data.Range range3 = org.jfree.data.Range.shift(range1, 2408.962275, true);
        boolean boolean0 = range2.equals(range3);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertFalse(range3.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertEquals(3877.6534125, range3.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range0))));
        org.junit.Assert.assertEquals(2937.382275, range2.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2408.962275 , 2408.962275);
        java.lang.Object object0 = new java.lang.Object();
        boolean boolean0 = range0.equals(object0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2408.962275 , 2408.962275);
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2408.962275 , 2408.962275);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 824.0, true);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(3232.962275, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-735.1579213172793) , (-735.1579213172793));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertSame(range0, range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-735.1579213172793) , (-735.1579213172793));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertEquals((-735.1579213172793), range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2408.962275 , 2408.962275);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertNotSame(range1, range0);
        org.junit.Assert.assertEquals(2408.962275, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1490.082944) , (-1490.082944));
        org.junit.Assert.assertEquals((-1490.082944), range0.getLowerBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1490.082944), false);
        double double0 = range1.constrain((-1490.082944));
        org.junit.Assert.assertEquals((-2980.165888), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2634.7240476 , 2634.7240476);
        org.junit.Assert.assertEquals(2634.7240476, range0.getUpperBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-607.49156));
        boolean boolean0 = range1.intersects(1.0, 0.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(3242.2156076, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2336.5213374315417) , (-1.0));
        boolean boolean0 = range0.intersects(0.0, (-1.0));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-1168.7606687157709), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1932.4502902983054) , (-1932.4502902983054));
        boolean boolean0 = range0.intersects((-1932.4502902983054), (-10.3));
        org.junit.Assert.assertEquals((-1932.4502902983054), range0.getUpperBound(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects((-1161.978869), 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2336.5213374315417) , (-1.0));
        boolean boolean0 = range0.intersects((-294.2), 360.7788473);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(2335.5213374315417, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains(1255.593741574762);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2408.962275 , 2408.962275);
        double double0 = range0.constrain(2408.962275);
        org.junit.Assert.assertEquals(2408.962275, range0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(2408.962275, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2408.962275 , 2408.962275);
        double double0 = range0.constrain((-2.570024352467317E7));
        org.junit.Assert.assertEquals(2408.962275, double0, 0.01);
        org.junit.Assert.assertEquals(2408.962275, range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2408.962275 , 2408.962275);
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[2408.962275,2408.962275]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-837.70429) , (-837.70429));
        range0.hashCode();
        org.junit.Assert.assertEquals((-837.70429), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2012.0) , (-2012.0));
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals((-2012.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2408.962275 , 2408.962275);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }
}

