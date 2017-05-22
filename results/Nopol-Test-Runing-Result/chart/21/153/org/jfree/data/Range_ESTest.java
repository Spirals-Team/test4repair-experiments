package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1883.20603794) , (-1883.20603794));
        range0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(710.1615087551091 , 710.1615087551091);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 721.8854534148718);
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, 721.8854534148718, false);
        org.jfree.data.Range range3 = org.jfree.data.Range.shift(range0, 721.8854534148718, false);
        boolean boolean0 = range3.equals(range2);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range3))));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1437.9089344998622, range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1110.6667618977094 , 1188.921936);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1110.6667618977094, true);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(78.25517410229077, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-4655.371));
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 2036.9);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.0));
        org.junit.Assert.assertSame(range1, range0);
        org.junit.Assert.assertEquals(2037.9, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 2.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertNotNull(range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-0.24171717143112048) , 1800.06738188139);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1800.06738188139);
        boolean boolean0 = range1.intersects(1800.06738188139, 1800.06738188139);
        org.junit.Assert.assertEquals(1800.06738188139, range1.getCentralValue(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        boolean boolean0 = range0.intersects(560.13, 205.739);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(560.1345970757 , 560.1345970757);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 560.1345970757);
        boolean boolean0 = range1.intersects(560.1345970757, 560.1345970757);
        org.junit.Assert.assertEquals(1120.2691941514, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1043.41680425) , (-605.031492156418));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 3936.4, false);
        org.junit.Assert.assertEquals(438.385312093582, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 2.0);
        range0.getUpperBound();
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-654.0) , (-654.0));
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-654.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 2.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(2.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2062.244820386151) , (-2062.244820386151));
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals((-2062.244820386151), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 2.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        double double0 = range1.getLength();
        org.junit.Assert.assertEquals(2.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1043.41680425) , (-605.031492156418));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 3936.4);
        double double0 = range1.getCentralValue();
        org.junit.Assert.assertEquals((-824.2241482032091), range0.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 2.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(2.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1043.41680425) , (-605.031492156418));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 3936.4);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, 0.0, 0.0);
        org.junit.Assert.assertEquals(438.385312093582, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range2.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertNotSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.contains(0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 2.0);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 2.0);
        java.lang.Object object0 = new java.lang.Object();
        boolean boolean0 = range0.equals(object0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1173.67899975) , (-991.0));
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals((-1082.339499875), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 282.6278294324404, false);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.jfree.data.Range range2 = org.jfree.data.Range.expand(range1, (-914.9949035157383), (-316.773549435));
        org.junit.Assert.assertEquals(282.6278294324404, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(282.6278294324404, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1173.67899975) , (-991.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-2651.5501515383776), true);
        org.junit.Assert.assertEquals(182.67899975, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1426.8));
        org.junit.Assert.assertEquals((-713.4), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1173.67899975) , (-991.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-991.0));
        org.junit.Assert.assertEquals((-991.0), range1.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals((-1082.339499875), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 2.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNotNull(range1);
        org.junit.Assert.assertEquals(2.0, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        double double0 = range0.constrain(2.0);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-0.24171717143112048) , 1800.06738188139);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1800.06738188139);
        double double0 = range1.constrain((-0.24171717143112048));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(3600.13476376278, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1110.6667618977094 , 1188.921936);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1188.921936, 1188.921936);
        boolean boolean0 = range1.intersects(2336.41355, 1110.6667618977094);
        org.junit.Assert.assertEquals(1149.7943489488534, range1.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(78.25517410229054, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 1.0);
        boolean boolean0 = range0.intersects(1.0, 0.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0.5, range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 2.0);
        boolean boolean0 = range0.intersects(2.0, 3732.7);
        org.junit.Assert.assertEquals(2.0, range0.getUpperBound(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(560.1345970757 , 560.1345970757);
        boolean boolean0 = range0.intersects(560.1345970757, 560.1345970757);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(560.1345970757, range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1043.41680425) , (-605.031492156418));
        boolean boolean0 = range0.intersects((-1006.1815171), 3936.4);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals((-824.2241482032091), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-35.545375314728));
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        double double0 = range2.constrain((-19.772687657364));
        org.junit.Assert.assertEquals((-18.772687657364), range2.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals((-19.772687657364), double0, 0.01);
        org.junit.Assert.assertEquals((-1.0), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1043.41680425) , (-605.031492156418));
        boolean boolean0 = range0.contains(0.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(438.385312093582, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1234.5580889);
        boolean boolean0 = range1.contains((-1.0));
        org.junit.Assert.assertEquals(0.0, range1.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1173.67899975) , (-991.0));
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[-1173.67899975,-991.0]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1173.67899975) , (-991.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 447.3);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertEquals((-635.039499875), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        range0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1043.41680425) , (-605.031492156418));
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals((-824.2241482032091), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1173.67899975) , (-991.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 3319.523343527353, (-1048.512389905024));
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, (-991.0));
        boolean boolean0 = range2.equals(range1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(182.67899975, range0.getLength(), 0.01);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range0))));
        org.junit.Assert.assertEquals(415048.68842877063, range1.getLength(), 0.01);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertEquals((-304285.9415210512), range2.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range2))));
    }
}

