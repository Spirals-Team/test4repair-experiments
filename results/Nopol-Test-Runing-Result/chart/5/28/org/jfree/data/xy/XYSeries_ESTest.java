package org.jfree.data.xy;


public class XYSeries_ESTest extends org.jfree.data.xy.XYSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-951L));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , false);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(876825682)) , ((java.lang.Number)(null)));
        xYSeries0.add(xYDataItem0);
        xYSeries0.add(1411.61752145, ((double)(-951L)), true);
        xYSeries0.addOrUpdate(((java.lang.Number)((byte)(124))), ((java.lang.Number)(13)));
        xYSeries0.add(0.0, ((java.lang.Number)(2)), false);
        xYSeries0.addOrUpdate(((java.lang.Number)(3)), ((java.lang.Number)(null)));
        xYSeries0.hashCode();
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , true);
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(999)));
        xYSeries0.add(((double)(999)), ((double)(59)));
        xYSeries0.update(999, ((byte)(5)));
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , true);
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(999)));
        xYSeries0.add(((double)(999)), ((double)(59)));
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(0)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.getDataItem(0);
        xYSeries0.add(xYDataItem0, true);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(999.0, xYDataItem0.getYValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , false);
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(999)));
        xYSeries0.updateByIndex(0, 999);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , true);
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(999)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.remove(((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(999.0, xYDataItem0.getYValue(), 0.01);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("Null 'date' argument.")));
        xYSeries0.add(java.lang.Double.NaN, ((double)(1110589745)));
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.remove(((java.lang.Number)(1886610483)));
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(1.110589745E9, xYDataItem0.getYValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , true);
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(0)));
        xYSeries0.remove(0);
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("Null 'date' argument.")) , false , false);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((double)(1600)) , java.lang.Double.NaN);
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.remove(0);
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("Null 'date' argument.")) , false , false);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((double)(1600)) , (-2257.0));
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.getY(0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("Null 'date' argument.")) , false , false);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((double)(11)) , ((double)(0)));
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.getY(0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("Null 'date' argument.")) , false , false);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((double)(1600)) , ((double)(165)));
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.getY(0);
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-951L));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , false);
        xYSeries0.addOrUpdate(((java.lang.Number)((byte)(124))), ((java.lang.Number)(13)));
        xYSeries0.add(((java.lang.Number)(0.5F)), ((java.lang.Number)(1684893284)));
        xYSeries0.add(0.0, ((java.lang.Number)(2)), false);
        java.lang.Double double0 = ((java.lang.Double)(xYSeries0.getX(2)));
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(0.0, ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-951L));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , false);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(876825682)) , ((java.lang.Number)(null)));
        xYSeries0.add(xYDataItem0);
        xYSeries0.add(1411.61752145, ((double)(-951L)), true);
        xYSeries0.addOrUpdate(((java.lang.Number)((byte)(124))), ((java.lang.Number)(13)));
        java.lang.Byte byte0 = ((java.lang.Byte)(xYSeries0.getX(2)));
        org.junit.Assert.assertEquals(((byte)(124)), ((byte)(byte0)));
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)));
        xYSeries0.setMaximumItemCount(0);
        int int0 = xYSeries0.getMaximumItemCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , false);
        xYSeries0.add((-132.7959514665), ((double)(0)));
        xYSeries0.getItemCount();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , false);
        xYSeries0.add(((double)(999)), ((double)(59)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.getDataItem(0);
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(999.0, xYDataItem0.getXValue(), 0.01);
        org.junit.Assert.assertEquals(59.0, xYDataItem0.getYValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , false);
        xYSeries0.add((-132.7959514665), ((double)(0)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.getDataItem(0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(0.0, xYDataItem0.getYValue(), 0.01);
        org.junit.Assert.assertEquals((-132.7959514665), xYDataItem0.getXValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , true);
        boolean boolean0 = xYSeries0.getAutoSort();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)) , false);
        xYSeries0.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy(23, (-1718));
        org.junit.Assert.assertNotSame(xYSeries1, xYSeries0);
        org.junit.Assert.assertFalse(xYSeries1.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)));
        xYSeries0.setMaximumItemCount(0);
        xYSeries0.createCopy(0, 0);
        org.junit.Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week((-3277) , 1084);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(week0)) , true , false);
        try {
            xYSeries0.updateByIndex((-3277), 1);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)) , true);
        try {
            xYSeries0.getX((-6));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)) , false , false);
        xYSeries0.add(1584.0811194244, ((double)(9999)), false);
        int int0 = xYSeries0.indexOf(9999);
        org.junit.Assert.assertEquals((-1), int0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)));
        xYSeries0.setMaximumItemCount(0);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((double)(59)) , ((double)(59)));
        xYSeries0.add(xYDataItem0, true);
        org.junit.Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , false);
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(999)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.getDataItem(0);
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        xYSeries0.add(xYDataItem0, true);
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(0.0, xYDataItem0.getXValue(), 0.01);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(999.0, xYDataItem0.getYValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , true);
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(999)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.getDataItem(0);
        xYSeries0.add(xYDataItem0, true);
        org.junit.Assert.assertEquals(999.0, xYDataItem0.getYValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, xYDataItem0.getXValue(), 0.01);
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute(5 , hour0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , false);
        try {
            xYSeries0.getY((-98));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-951L));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , false);
        try {
            xYSeries0.getDataItem((-1742));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-3226) , day0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)) , true);
        try {
            xYSeries0.remove((-1050));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , false);
        xYSeries0.getItemCount();
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)) , false , false);
        xYSeries0.hashCode();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-951L));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , false);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(876825682)) , ((java.lang.Number)(null)));
        xYSeries0.add(xYDataItem0);
        xYSeries0.add(1411.61752145, ((double)(-951L)), true);
        xYSeries0.hashCode();
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)));
        xYSeries0.hashCode();
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("Null 'date' argument.")));
        org.jfree.data.xy.XYSeries xYSeries1 = ((org.jfree.data.xy.XYSeries)(xYSeries0.clone()));
        org.junit.Assert.assertTrue(xYSeries1.equals(((java.lang.Object)(xYSeries0))));
        xYSeries1.add(java.lang.Double.NaN, ((double)(1110589745)));
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("Null 'date' argument.")));
        org.jfree.data.xy.XYSeries xYSeries1 = ((org.jfree.data.xy.XYSeries)(xYSeries0.clone()));
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        org.junit.Assert.assertNotSame(xYSeries1, xYSeries0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertTrue(xYSeries1.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , true , true);
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , false , false);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(xYSeries1.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("Null kdate' argument.")));
        org.jfree.data.xy.XYSeries xYSeries1 = ((org.jfree.data.xy.XYSeries)(xYSeries0.clone()));
        xYSeries1.setMaximumItemCount(1110589745);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertEquals(1110589745, xYSeries1.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("Null 'date' argument.")));
        org.jfree.data.xy.XYSeries xYSeries1 = ((org.jfree.data.xy.XYSeries)(xYSeries0.clone()));
        org.junit.Assert.assertTrue(xYSeries1.equals(((java.lang.Object)(xYSeries0))));
        xYSeries1.setDescription("");
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertFalse(xYSeries1.equals(((java.lang.Object)(xYSeries0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test67() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , true , true);
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , true , false);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries1.getAutoSort());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("Null 'date' argument.")));
        boolean boolean0 = xYSeries0.equals(xYSeries0);
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test69() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-951L));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , false);
        boolean boolean0 = xYSeries0.equals(fixedMillisecond0);
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , true);
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(999)));
        xYSeries0.createCopy(0, 0);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test71() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(2461.904618 , ((double)(-2)));
        xYSeries0.add(xYDataItem0, true);
        try {
            xYSeries0.createCopy((-2), 23);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test72() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("Null 'date' argument.")) , false , false);
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy(165, 1600);
        org.junit.Assert.assertFalse(xYSeries1.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        org.junit.Assert.assertNotSame(xYSeries1, xYSeries0);
    }

    @org.junit.Test(timeout = 4000)
    public void test73() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-983L));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , false);
        xYSeries0.addOrUpdate(((java.lang.Number)(3)), ((java.lang.Number)(null)));
        xYSeries0.toArray();
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test74() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)));
        xYSeries0.setMaximumItemCount(0);
        xYSeries0.addOrUpdate(((java.lang.Number)(59)), ((java.lang.Number)(1)));
        org.junit.Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test75() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-951L));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , false);
        xYSeries0.addOrUpdate(((java.lang.Number)((byte)(124))), ((java.lang.Number)(13)));
        xYSeries0.add(0.0, ((java.lang.Number)(2)), false);
        xYSeries0.addOrUpdate(((java.lang.Number)(-1)), ((java.lang.Number)(null)));
        org.junit.Assert.assertEquals(3, xYSeries0.getItemCount());
        java.lang.Integer integer0 = ((java.lang.Integer)(xYSeries0.getX(2)));
        org.junit.Assert.assertEquals((-1), ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test78() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-983L));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , false);
        xYSeries0.add(((java.lang.Number)(1)), ((java.lang.Number)(1)), false);
        xYSeries0.update(1, ((byte)(124)));
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test79() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(12)) , false);
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(6)), false);
        xYSeries0.clear();
        org.junit.Assert.assertEquals(0, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test80() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(12)) , false);
        xYSeries0.clear();
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test81() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(0L);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , true);
        try {
            xYSeries0.delete((-2001), (-2001));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test82() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute(5 , hour0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , false);
        xYSeries0.delete(23, 0);
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test84() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("Null 'date' argument.")) , false , false);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((double)(1600)) , ((double)(1600)));
        xYSeries0.add(xYDataItem0, true);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
        java.lang.Double double0 = ((java.lang.Double)(xYSeries0.getY(0)));
        int int0 = xYSeries0.indexOf(double0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test85() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , true);
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(999)));
        xYSeries0.add(((double)(999)), ((double)(59)));
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(0)));
        int int0 = xYSeries0.indexOf(0);
        org.junit.Assert.assertEquals(3, xYSeries0.getItemCount());
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test87() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)));
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        xYSeries0.setMaximumItemCount(0);
        xYSeries0.add(0.0, ((java.lang.Number)(0)));
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test88() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , false);
        boolean boolean0 = xYSeries0.getAutoSort();
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test89() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , true);
        try {
            xYSeries0.remove(((java.lang.Number)(0)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test90() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)));
        xYSeries0.addOrUpdate(((double)(59)), ((double)(59)));
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
        xYSeries0.setMaximumItemCount(0);
        org.junit.Assert.assertEquals(0, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test92() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , true , true);
        xYSeries0.add((-66.19955), ((java.lang.Number)(0)));
        xYSeries0.toArray();
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test93() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)));
        int int0 = xYSeries0.getMaximumItemCount();
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
    }
}

