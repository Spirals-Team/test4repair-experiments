package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(5650.71554574408 , 5650.71554574408);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 5650.71554574408);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range0, range1);
        boolean boolean0 = range2.equals(range0);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertEquals(8476.07331861612, range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(3896.3 , 3896.3);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.0));
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range0))));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(3897.3, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(456.2 , 456.2);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.0));
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, 24.90009483596475, 0.0);
        org.jfree.data.Range range3 = org.jfree.data.Range.expandToInclude(range2, (-5182.053942689206));
        org.junit.Assert.assertEquals(457.2, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(11841.523359003084, range3.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3071.800015796286) , 0.3826534780005836);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertEquals(3072.1826692742866, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1489.1) , (-1489.1));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0, true);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        org.junit.Assert.assertEquals((-1489.1), range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3057.1398128) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertEquals((-1528.5699064), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertNotNull(range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(456.2 , 456.2);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.0));
        boolean boolean0 = range1.intersects(24.90009483596475, 1272.49449);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals((-1.0), range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(456.2 , 456.2);
        boolean boolean0 = range0.intersects(24.90009483596475, 24.90009483596475);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2963.89844) , (-2963.89844));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        double double0 = range1.constrain((-2963.89844));
        org.junit.Assert.assertEquals((-2963.89844), double0, 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3071.800015796286) , 0.3826534780005836);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.3826534780005836);
        org.junit.Assert.assertEquals((-1535.3260276811423), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0));
        org.junit.Assert.assertEquals((-2.0), range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1211.487730019639) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 433.3846805139773);
        double double0 = range1.getUpperBound();
        org.junit.Assert.assertEquals((-389.05152475283086), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(433.3846805139773, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1489.1) , (-1489.1));
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-1489.1), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3057.1398128) , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals((-1528.5699064), range0.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals((-3057.1398128), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-5804.4659625786) , 0.0);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(5804.4659625786, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0), false);
        double double0 = range1.getCentralValue();
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.0));
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1489.1) , (-1489.1));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 0.0, 979.718823158156);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1.0);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, (-1.0), 1.0);
        org.junit.Assert.assertEquals(0.0, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(0.0, range2.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1.0, false);
        double double0 = range1.constrain((-0.1565));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 654.15989, false);
        boolean boolean0 = range1.contains(0.0);
        org.junit.Assert.assertEquals(654.15989, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1211.487730019639) , 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-605.7438650098195), range0.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(456.2 , 456.2);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(456.2, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 3397.62, true);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 0.0);
        boolean boolean0 = range0.equals(range2);
        org.junit.Assert.assertNotSame(range2, range1);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertEquals(0.0, range2.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1607.3311337948), false);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertEquals((-1607.3311337948), range1.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        java.lang.Object object0 = new java.lang.Object();
        boolean boolean0 = range0.equals(object0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(456.2 , 456.2);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.0));
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, 0.011171344699981147, false);
        org.junit.Assert.assertEquals(227.61117134469995, range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1798.82508070018) , (-1798.82508070018));
        org.junit.Assert.assertEquals((-1798.82508070018), range0.getLowerBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 1.0);
        boolean boolean0 = range1.intersects(1.0, 2773.2585224051);
        org.junit.Assert.assertEquals(1.0, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(456.2 , 456.2);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 456.2);
        org.junit.Assert.assertEquals(456.2, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2.0);
        double double0 = range0.constrain(1488.641553131);
        org.junit.Assert.assertEquals(2.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2963.89844) , (-2963.89844));
        double double0 = range0.constrain((-2963.89844));
        org.junit.Assert.assertEquals((-2963.89844), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3071.800015796286) , 0.3826534780005836);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1704.6078, 859.7);
        boolean boolean0 = range1.intersects(1704.6078, 0.0);
        org.junit.Assert.assertEquals(3072.1826692742866, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals((-1299391.2588284914), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1798.82508070018) , (-1798.82508070018));
        boolean boolean0 = range0.intersects(1.0, 2773.2585224051);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        boolean boolean0 = range0.intersects((-1.0), (-1.0));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(456.2 , 456.2);
        boolean boolean0 = range0.intersects(0.0, 1272.49449);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(456.2 , 456.2);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.0));
        boolean boolean0 = range1.intersects(0.0, 0.0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(456.2, range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        boolean boolean0 = range0.contains(0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1798.82508070018) , (-1798.82508070018));
        boolean boolean0 = range0.contains(846.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-1798.82508070018), range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(456.2 , 456.2);
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[456.2,456.2]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-769.2568408728) , (-769.2568408728));
        range0.hashCode();
        org.junit.Assert.assertEquals((-769.2568408728), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(456.2 , 456.2);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(456.2, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(456.2 , 456.2);
        org.junit.Assert.assertEquals(456.2, range0.getUpperBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 0.0, 0.011171344699981147);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(456.2, range1.getCentralValue(), 0.01);
    }
}

