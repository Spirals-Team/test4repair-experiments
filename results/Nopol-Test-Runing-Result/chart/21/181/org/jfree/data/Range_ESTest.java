package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.9950429564893425 , 0.9950429564893425);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0), true);
        range1.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-645.72) , (-645.72));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 2.0);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(647.72, range1.getLength(), 0.01);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3036.1889) , (-3036.1889));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-3036.1889), false);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-6072.3778), range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0);
        org.junit.Assert.assertEquals((-1.0), range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-444.00546300749494) , 795.615);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 795.615, true);
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 795.615);
        org.junit.Assert.assertEquals(971.4197684962526, range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2461.4587657) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1466.9809145492, 1.0);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range1);
        boolean boolean0 = range2.intersects(1.0, 1616.2482299177);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(2461.4587657, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals((-1805456.5156158656), range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-645.72) , (-645.72));
        boolean boolean0 = range0.intersects(0.0, (-2796.54175337867));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.9950429564893425 , 0.9950429564893425);
        boolean boolean0 = range0.intersects(0.0, 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0, true);
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
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2461.4587657) , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(2461.4587657, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals((-2461.4587657), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2461.4587657) , 0.0);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(2461.4587657, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1477.172) , 1326.9964646673961);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals((-75.08776766630194), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.0));
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2461.4587657) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 0.0, (-1.0));
        org.junit.Assert.assertEquals((-2461.4587657), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.9030769816161445);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 0.9030769816161445, 0.9030769816161445);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        org.junit.Assert.assertEquals(0.0, range2.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertNotSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-645.72) , (-645.72));
        boolean boolean0 = range0.contains((-2796.54175337867));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 1787.7503);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertEquals(1.0, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-448.97) , (-448.97));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-71.7767702743), true);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        java.lang.Object object0 = new java.lang.Object();
        boolean boolean0 = range0.equals(object0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, 3587.594118);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(1.0, range2.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.9030769816161445);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNotNull(range1);
        org.junit.Assert.assertEquals(0.9030769816161445, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2772.912957157) , (-2772.912957157));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.9950429564893425 , 0.9950429564893425);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0), true);
        range1.constrain(0.0);
        org.junit.Assert.assertEquals((-0.004957043510657511), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 494.0);
        double double0 = range0.constrain(0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(494.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-645.72) , (-645.72));
        org.junit.Assert.assertEquals((-645.72), range0.getLowerBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-645.72));
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 2.0);
        boolean boolean0 = range2.intersects((-645.72), (-2796.54175337867));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1293.44, range2.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 2.639816551566425);
        boolean boolean0 = range0.intersects(0.0, 2.639816551566425);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(0.0, range0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(2.639816551566425, range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        boolean boolean0 = range0.intersects(0.0, 1.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-444.00546300749494) , 795.615);
        boolean boolean0 = range0.intersects(795.615, 795.615);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1239.620463007495, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains(0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        boolean boolean0 = range0.contains(3587.594118);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1.0, range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.9950429564893425 , 0.9950429564893425);
        double double0 = range0.constrain(0.0);
        org.junit.Assert.assertEquals(0.9950429564893425, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-444.00546300749494) , 795.615);
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[-444.00546300749494,795.615]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-513.7225816332593));
        org.junit.Assert.assertEquals(0.0, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-444.00546300749494) , 795.615);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 795.615, true);
        boolean boolean0 = range1.intersects(795.615, 795.615);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(795.615, range0.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals(971.4197684962526, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }
}

