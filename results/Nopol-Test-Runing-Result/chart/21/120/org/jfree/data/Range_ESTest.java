package org.jfree.data;


public class Range_ESTest extends org.jfree.data.Range_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1607.6231836097745) , (-1607.6231836097745));
        range0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(507.85733 , 2948.257);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 507.85733, false);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range0, range1);
        boolean boolean0 = range0.equals(range2);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range0))));
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertEquals(1981.9858299999999, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(86.29 , 86.29);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1.0);
        boolean boolean0 = range0.equals(range1);
        org.junit.Assert.assertEquals(87.29, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2416.3575853) , (-24.918976398510427));
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-466.0));
        org.junit.Assert.assertEquals((-1220.6382808492554), range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(507.85733 , 2948.257);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1419.727, 2948.257);
        boolean boolean0 = range1.intersects((-2454.162703441018), (-271.73075114316));
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(1866840.1109575504, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2416.3575853) , (-24.918976398510427));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-2416.3575853), false);
        boolean boolean0 = range1.intersects((-2262.2116223618), (-2416.3575853));
        org.junit.Assert.assertEquals(2391.4386089014897, range1.getLength(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(507.85733 , 507.85733);
        boolean boolean0 = range0.intersects((-2454.162703441018), (-271.73075114316));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 1109.5395515373339, false);
        org.junit.Assert.assertEquals(1109.5395515373339, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0, false);
        org.junit.Assert.assertEquals(0.0, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 0.0);
        org.junit.Assert.assertEquals(0.0, range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0));
        org.junit.Assert.assertEquals((-2.0), range1.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 1103.709305);
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals(1104.709305, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(1103.709305, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2645.7097954581736 , 2645.7097954581736);
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals(2645.7097954581736, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1162.902266590147) , 1873.0);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(3035.902266590147, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2416.3575853) , (-24.918976398510427));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-2416.3575853), 2454.074602585348);
        double double0 = range1.getCentralValue();
        org.junit.Assert.assertEquals(5822449.149791939, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1637.0382775076087) , (-1637.0382775076087));
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals((-1637.0382775076087), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 0.0);
        org.junit.Assert.assertSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 4510.0, (-491.6517483866));
        org.junit.Assert.assertEquals(0.0, range1.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertNull(range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1607.6231836097745) , (-1607.6231836097745));
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertNotSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , (-1.0));
        double double0 = range0.getUpperBound();
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2416.3575853) , (-24.918976398510427));
        double double0 = range0.getLowerBound();
        org.junit.Assert.assertEquals((-2416.3575853), double0, 0.01);
        org.junit.Assert.assertEquals((-24.918976398510427), range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2645.7097954581736 , 2645.7097954581736);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, 2645.7097954581736);
        org.jfree.data.Range range2 = org.jfree.data.Range.combine(range1, range0);
        boolean boolean0 = range2.equals(range0);
        org.junit.Assert.assertEquals(3968.5646931872607, range2.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(range1.equals(((java.lang.Object)(range2))));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(range2.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertFalse(range0.equals(((java.lang.Object)(range2))));
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(507.85733 , 2948.257);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 507.85733, 2948.257);
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, 0.0, false);
        boolean boolean0 = range0.equals(range2);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(range2.equals(((java.lang.Object)(range1))));
        org.junit.Assert.assertEquals(2979503.331833055, range2.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2416.3575853) , (-24.918976398510427));
        boolean boolean0 = range0.equals(((java.lang.Object)(null)));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals((-1220.6382808492554), range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(2645.7097954581736 , 2645.7097954581736);
        boolean boolean0 = range0.equals(range0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 1103.709305);
        org.jfree.data.Range range1 = org.jfree.data.Range.shift(range0, (-1.0), true);
        org.junit.Assert.assertEquals(550.3546525, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 1.0);
        org.junit.Assert.assertSame(range1, range0);
        org.junit.Assert.assertEquals(1.0, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, 1137.41337);
        org.junit.Assert.assertEquals(568.706685, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1055.44377643452 , 1055.44377643452);
        org.jfree.data.Range range1 = org.jfree.data.Range.expandToInclude(range0, (-1034.59223928977));
        org.junit.Assert.assertEquals(10.425768572374977, range1.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-1.0) , 1103.709305);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, ((org.jfree.data.Range)(null)));
        org.junit.Assert.assertEquals(551.3546525, range1.getCentralValue(), 0.01);
        org.junit.Assert.assertNotNull(range1);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.Range range0 = org.jfree.data.Range.expandToInclude(((org.jfree.data.Range)(null)), 14.479036184152118);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(((org.jfree.data.Range)(null)), range0);
        org.junit.Assert.assertNotNull(range1);
        org.junit.Assert.assertEquals(14.479036184152118, range1.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        org.jfree.data.Range range1 = org.jfree.data.Range.combine(range0, range0);
        org.junit.Assert.assertNotSame(range1, range0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.constrain(2466.637967);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2416.3575853) , (-24.918976398510427));
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, (-2416.3575853), 2454.074602585348);
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, (-24.918976398510427));
        double double0 = range2.constrain((-554.0));
        org.junit.Assert.assertEquals(5776129.545836697, double0, 0.01);
        org.junit.Assert.assertEquals(2391.4386089014897, range0.getLength(), 0.01);
        org.junit.Assert.assertEquals(5868718.915794385, range2.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range((-2416.3575853) , (-24.918976398510427));
        double double0 = range0.constrain((-2416.3575853));
        org.junit.Assert.assertEquals((-2416.3575853), double0, 0.01);
        org.junit.Assert.assertEquals((-24.918976398510427), range0.getUpperBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(507.85733 , 2948.257);
        boolean boolean0 = range0.intersects(617.10074669493, 0.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1728.057165, range0.getCentralValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(507.85733 , 2948.257);
        org.jfree.data.Range range1 = org.jfree.data.Range.expand(range0, 1419.727, 2948.257);
        org.jfree.data.Range range2 = org.jfree.data.Range.shift(range1, 0.0, false);
        boolean boolean0 = range2.intersects(0.0, 0.0);
        org.junit.Assert.assertEquals(7197873.666875191, range1.getUpperBound(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(1.0662067111835282E7, range2.getLength(), 0.01);
        org.junit.Assert.assertEquals(2440.3996700000002, range0.getLength(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(0.0, 1772.1875);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        boolean boolean0 = range0.intersects(0.0, 0.0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(532.0702169035695 , 816.0);
        boolean boolean0 = range0.intersects(816.0, 1138.617);
        org.junit.Assert.assertEquals(283.92978309643047, range0.getLength(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 1.0);
        boolean boolean0 = range0.contains(1.0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(0.0, range0.getLowerBound(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1055.44377643452 , 1055.44377643452);
        boolean boolean0 = range0.contains(1068.5764996956);
        org.junit.Assert.assertEquals(1055.44377643452, range0.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1.0 , 1.0);
        boolean boolean0 = range0.contains((-3132.0));
        org.junit.Assert.assertEquals(1.0, range0.getCentralValue(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(532.0702169035695 , 816.0);
        java.lang.String string0 = range0.toString();
        org.junit.Assert.assertEquals("Range[532.0702169035695,816.0]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(0.0 , 0.0);
        double double0 = range0.getCentralValue();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.jfree.data.Range range0 = new org.jfree.data.Range(1055.44377643452 , 1055.44377643452);
        double double0 = range0.getLength();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }
}

