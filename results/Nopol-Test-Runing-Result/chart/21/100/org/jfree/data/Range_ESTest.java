package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2661.0547971550386 , 2661.0547971550386);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-998.13482));
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range1, 2661.0547971550386);
        org.jfree.data.Range range3 = org.jfree.data.Range.expand(range2, 2661.0547971550386, (-998.13482));
        range3.hashCode();
        org.junit.Assert.assertEquals(1660816.4668920487, range3.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(168.313456 , 168.313456);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 168.313456, false);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        boolean boolean0 = range0.equals(range2);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(252.47018400000002, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(168.313456 , 168.313456);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 168.313456, false);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(336.626912, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 2.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.0));
        org.junit.Assert.assertSame(range1, range0);
        org.junit.Assert.assertEquals(3.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-4034.6) , 1897.8);
        boolean boolean0 = range0.intersects((-3508.300279274), 0.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-4034.6) , 1897.8);
        boolean boolean0 = range0.intersects(1897.8, 0.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-1068.4), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-1780.8));
        boolean boolean0 = range0.intersects((-1780.8), (-1780.8));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1560.376), false);
        org.junit.Assert.assertEquals((-1561.376), range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0, false);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1560.376));
        org.junit.Assert.assertEquals((-1561.376), range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(168.313456 , 168.313456);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(168.313456, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(168.313456 , 168.313456);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(168.313456, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(168.313456 , 168.313456);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(168.313456, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-1.0), (-1.0));
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-4034.6) , 1897.8);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1918.192597), false);
        double double0 = range1.constrain(1.0);
        org.junit.Assert.assertEquals(5952.792597, range1.getLength(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 2.0);
        double double0 = range0.constrain((-1.0));
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
        org.junit.Assert.assertEquals(2.0, range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-487.5344260492) , (-487.5344260492));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertEquals((-487.5344260492), range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertEquals(0.0, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 2.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0));
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        org.junit.Assert.assertEquals(1.0, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertEquals(0.0, range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), (-1780.8));
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-1780.8), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(75.807 , 75.807);
        org.jfree.data.Range range1 = new org.jfree.data.Range(75.807 , 838.3275775724536);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertEquals(75.807, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(75.06413775579897 , 75.06413775579897);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 75.06413775579897);
        boolean boolean0 = range1.equals(range0);
        org.junit.Assert.assertEquals(150.12827551159793, range1.getLowerBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(168.313456 , 168.313456);
        java.lang.Object object0 = new java.lang.Object();
        boolean boolean0 = range0.equals(object0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 322.427514082666);
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(322.427514082666, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2565.44411053) , 989.04996117098);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2.0, true);
        org.junit.Assert.assertEquals((-2565.44411053), range0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals((-786.19707467951), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1.0, 1.0);
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertTrue(range1.equals(((java.lang.Object)(range0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2565.44411053) , 989.04996117098);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 989.04996117098);
        org.junit.Assert.assertSame(range1, range0);
        org.junit.Assert.assertEquals(3554.4940717009804, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 191.31827269);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNotNull(range1);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1774.3 , 1774.3);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
        org.junit.Assert.assertNotNull(range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 2.0);
        double double0 = range0.constrain(157.0);
        org.junit.Assert.assertEquals(3.0, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(2.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(168.313456 , 168.313456);
        double double0 = range0.constrain((-74.2677834));
        org.junit.Assert.assertEquals(168.313456, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1774.3 , 1774.3);
        org.junit.Assert.assertEquals(1774.3, range0.getUpperBound(), 0.01);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1.0));
        boolean boolean0 = range1.intersects(1161.4752, 1.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1775.3, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2565.44411053) , 989.04996117098);
        boolean boolean0 = range0.intersects(3554.4940717009804, (-4630.175828002107));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-788.19707467951), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(168.313456 , 168.313456);
        boolean boolean0 = range0.intersects(0.0, 0.0);
        org.junit.Assert.assertEquals(168.313456, range0.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 322.427514082666);
        boolean boolean0 = range0.intersects(0.0, 322.427514082666);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(0.0, range0.getLowerBound(), 0.01);
        org.junit.Assert.assertEquals(322.427514082666, range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2565.44411053) , 989.04996117098);
        boolean boolean0 = range0.intersects(2.0, 2.0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(168.313456 , 168.313456);
        boolean boolean0 = range0.contains(168.313456);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(168.313456, range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        boolean boolean0 = range0.contains(174.9785);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1.0, range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        boolean boolean0 = range0.contains((-2697.454));
        org.junit.Assert.assertEquals(0.0, range0.getLength(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2565.44411053) , 989.04996117098);
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[-2565.44411053,989.04996117098]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2565.44411053) , 989.04996117098);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-3508.300279274));
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, 2.0);
        org.junit.Assert.assertEquals(6073.744389804, range2.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-4034.6) , 1897.8);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals((-1068.4), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2565.44411053) , 989.04996117098);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(3554.4940717009804, double0, 0.01);
    }
}

