package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1156.72) , (-1156.72));
        range0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1.0);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 1.0);
        org.jfree.data.Range range3 = new org.jfree.data.Range(1.0 , 1.0);
        boolean boolean0 = range3.equals(range2);
        org.junit.Assert.assertTrue(range3.equals(((java.lang.Object)(range0))));
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range3))));
        org.junit.Assert.assertEquals(1.5, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range2))));
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1156.72) , (-1156.72));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1354.5423694547644);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1245.325068717) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1527.220787589, false);
        org.junit.Assert.assertEquals(1527.220787589, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.0));
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-6788.584) , 2767.4110212501773);
        boolean boolean0 = range0.intersects(1432.45, 2767.4110212501773);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1.0);
        boolean boolean0 = range1.intersects(1.0, 1.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(2.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        boolean boolean0 = range0.contains(0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1.0, true);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, (-766.8221));
        boolean boolean0 = range2.intersects(1.0, (-4253.503461));
        org.junit.Assert.assertEquals((-382.91105), range2.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0, false);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-404.6326032116) , 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(404.6326032116, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3394.292) , (-3394.292));
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-3394.292), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.0));
        double double0 = range1.getLength();
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-2877.7731528365));
        double double0 = range1.getCentralValue();
        org.junit.Assert.assertEquals(2.0, range0.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 1246.96064033);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-1.0), 2244.421919047);
        double double0 = range1.getLowerBound();
        org.junit.Assert.assertEquals(1401722.0682726204, range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(1246.96064033, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-2877.7731528365));
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, 1.0, (-2877.7731528365));
        org.junit.Assert.assertEquals(0.0, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1156.72) , (-1156.72));
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1.0, (-1156.72));
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3394.292) , (-3394.292));
        boolean boolean0 = range0.contains(4544.146077359796);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2135.00651);
        boolean boolean0 = range0.contains((-70.8134981014203));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(2133.00651, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(3979.2424 , 3979.2424);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(3979.2424, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2059.11635864326) , (-2059.11635864326));
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 1246.96064033);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(622.980320165, range0.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 1246.96064033);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0), true);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        boolean boolean0 = range2.equals(range1);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertEquals(1246.96064033, range0.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range0))));
        org.junit.Assert.assertEquals(622.480320165, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(1245.96064033, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-404.6326032116) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-404.6326032116), true);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-404.6326032116), range1.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals((-809.2652064232), range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        java.lang.Object object0 = new java.lang.Object();
        boolean boolean0 = range0.equals(object0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 1246.96064033);
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertEquals(1247.96064033, range0.getLength(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2059.11635864326) , (-2059.11635864326));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-2059.11635864326), true);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, (-2059.11635864326));
        org.junit.Assert.assertEquals(2059.11635864326, range2.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-658.3901504329845) , 2919.72237777);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.junit.Assert.assertEquals(3578.1125282029843, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(3979.2424 , 3979.2424);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertNotNull(range1);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-326.68) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-1.0), 2.0);
        double double0 = range1.constrain(0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(324.68, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-326.68) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-1.0), 2.0);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        boolean boolean0 = range2.intersects(2.0, (-1.0));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-1.0), range1.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(325.68, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(161.84, range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(1.0, (-4253.503461));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3394.292) , (-3394.292));
        org.junit.Assert.assertEquals((-3394.292), range0.getLowerBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-3394.292), false);
        boolean boolean0 = range1.intersects((-6788.584), (-3394.292));
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-5370.1389844) , (-5370.1389844));
        boolean boolean0 = range0.intersects((-5370.1389844), (-5370.1389844));
        org.junit.Assert.assertEquals((-5370.1389844), range0.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-658.3901504329845) , 2919.72237777);
        boolean boolean0 = range0.intersects(0.0, 0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1156.72) , (-1156.72));
        double double0 = range0.constrain(1.0);
        org.junit.Assert.assertEquals((-1156.72), double0, 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(3979.2424 , 3979.2424);
        double double0 = range0.constrain(0.0);
        org.junit.Assert.assertEquals(3979.2424, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(3979.2424 , 3979.2424);
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[3979.2424,3979.2424]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 1246.96064033);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2244.421919047);
        org.junit.Assert.assertEquals(3491.382559377, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 1246.96064033);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(622.980320165, double0, 0.01);
    }
}

