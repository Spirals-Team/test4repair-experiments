package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-5268.2379) , (-5268.2379));
        range0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3426.635944589) , (-3426.635944589));
        org.jfree.data.Range range1 = new org.jfree.data.Range((-3426.635944589) , 183.614099284693);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-1621.5109226521533), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1206.57 , 1206.57);
        org.jfree.data.Range range1 = new org.jfree.data.Range((-1474.0539038) , 0.0);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-737.0269519), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1691.773243818) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-614.3));
        org.junit.Assert.assertEquals((-845.886621909), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1691.773243818) , 0.0);
        boolean boolean0 = range0.intersects((-614.3), 0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1691.773243818) , 0.0);
        boolean boolean0 = range0.intersects(0.0, (-1.0));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1691.773243818, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(10.013709202430618 , 10.013709202430618);
        boolean boolean0 = range0.intersects(1.0, 1.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-423.16) , (-423.16));
        boolean boolean0 = range0.intersects((-423.16), (-423.16));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1097.5786028569491, false);
        org.junit.Assert.assertEquals(1097.5786028569491, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0, false);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-584.57817) , 1.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-291.789085), range0.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1691.773243818) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-614.3), true);
        double double0 = range1.getUpperBound();
        org.junit.Assert.assertEquals((-1460.1866219090002), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals((-614.3), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1206.57 , 1206.57);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(1206.57, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3426.635944589) , (-3426.635944589));
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-584.57817) , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 1703.6475874770556);
        double double0 = range1.getCentralValue();
        org.junit.Assert.assertEquals(559.5347087385278, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1613.3962920580325) , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals((-806.6981460290162), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-672.3519490348114) , (-672.3519490348114));
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-672.3519490348114), (-672.3519490348114));
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(10.013709202430618 , 10.013709202430618);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-395.06), 10.013709202430618);
        org.junit.Assert.assertEquals(10.013709202430618, range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1691.773243818) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 0.0, 598.7);
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, (-1691.773243818));
        org.junit.Assert.assertEquals(1014556.4143176548, range2.getLength(), 0.01);
        org.junit.Assert.assertEquals(1691.773243818, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1206.57 , 1206.57);
        double double0 = range0.constrain((-501.7896296206333));
        org.junit.Assert.assertEquals(1206.57, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(10.013709202430618 , 10.013709202430618);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertEquals(10.013709202430618, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1613.3962920580325) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 4215.0);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        org.junit.Assert.assertEquals(4215.0, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(5828.3962920580325, range2.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1691.773243818) , 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(1691.773243818, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1691.773243818) , 0.0);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(1691.773243818, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1691.773243818) , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(1691.773243818, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals((-1691.773243818), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3426.635944589) , (-3426.635944589));
        org.jfree.data.Range range1 = new org.jfree.data.Range((-3426.635944589) , 183.614099284693);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertEquals((-3426.635944589), range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0));
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertEquals((-2.0), range1.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1691.773243818) , 0.0);
        boolean boolean0 = range0.equals(((java.lang.Object)(null)));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-845.886621909), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3426.635944589) , (-3426.635944589));
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1691.773243818) , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0);
        org.junit.Assert.assertEquals((-845.886621909), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertEquals((-1691.773243818), range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 2171.3589487031);
        org.junit.Assert.assertEquals(2171.3589487031, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-1199.3065115502));
        org.junit.Assert.assertEquals((-1199.3065115502), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-672.3519490348114) , (-672.3519490348114));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertNotNull(range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.constrain((-0.5427741208024233));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1613.3962920580325) , 0.0);
        double double0 = range0.constrain(1.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals((-1613.3962920580325), range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-672.3519490348114) , (-672.3519490348114));
        double double0 = range0.constrain((-672.3519490348114));
        org.junit.Assert.assertEquals((-672.3519490348114), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1613.3962920580325) , 0.0);
        boolean boolean0 = range0.intersects((-773.082), (-1613.3962920580325));
        org.junit.Assert.assertEquals(1613.3962920580325, range0.getLength(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-4051.012557608839) , 2171.3589487031);
        boolean boolean0 = range0.intersects(0.0, 0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(10.013709202430618 , 10.013709202430618);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 2.0);
        boolean boolean0 = range1.intersects(0.0, 10.013709202430618);
        org.junit.Assert.assertEquals(6.006854601215309, range1.getCentralValue(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-4051.012557608839), true);
        boolean boolean0 = range1.intersects(0.0, 0.0);
        org.junit.Assert.assertEquals((-4051.012557608839), range1.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-4051.012557608839), range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 397.1);
        boolean boolean0 = range0.contains(0.0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(0.0, range0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(397.1, range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-3426.635944589) , (-3426.635944589));
        boolean boolean0 = range0.contains(0.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2.0 , 2.0);
        org.junit.Assert.assertEquals(2.0, range0.getUpperBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2.0);
        boolean boolean0 = range1.contains(2.0);
        org.junit.Assert.assertEquals(4.0, range1.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[0.0,0.0]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 2171.3589487031, 2171.3589487031);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }
}

