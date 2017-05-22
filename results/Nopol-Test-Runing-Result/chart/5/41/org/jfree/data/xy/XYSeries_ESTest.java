package org.jfree.data.xy;


public class XYSeries_ESTest extends org.jfree.data.xy.XYSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("AcceleratorKey")) , false , false);
        xYSeries0.add(((double)((byte)(12))), 2716.0909825);
        xYSeries0.add(((java.lang.Number)((byte)(12))), ((java.lang.Number)((byte)(12))), false);
        xYSeries0.add(1.0, ((double)((byte)(12))));
        xYSeries0.add(0.0, java.lang.Double.NaN);
        xYSeries0.addOrUpdate(2447.60306744933, 1979.2843860375);
        xYSeries0.hashCode();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("")));
        xYSeries0.add(((double)(java.lang.Integer.MAX_VALUE)), ((java.lang.Number)(2)));
        xYSeries0.setMaximumItemCount(2);
        java.lang.Integer integer0 = ((java.lang.Integer)(xYSeries0.getY(0)));
        xYSeries0.addOrUpdate(((java.lang.Number)(integer0)), ((java.lang.Number)(integer0)));
        org.junit.Assert.assertEquals(2, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , true);
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(999)), false);
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.remove(((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(999.0, xYDataItem0.getYValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week(0 , 2163);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(week0)) , true);
        xYSeries0.add(java.lang.Double.NaN, ((java.lang.Number)(1)), false);
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.remove(((java.lang.Number)(53)));
        org.junit.Assert.assertEquals(1.0, xYDataItem0.getYValue(), 0.01);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("$ename")));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(701.9410937 , 701.9410937);
        xYSeries0.add(xYDataItem0);
        xYSeries0.add(((double)(1)), ((java.lang.Number)(2)));
        org.jfree.data.xy.XYDataItem xYDataItem1 = xYSeries0.remove(1);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(701.9410937, xYDataItem1.getYValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week(0 , 2163);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(week0)) , true);
        xYSeries0.add((-2422.0), 0.0);
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.remove(0);
        org.junit.Assert.assertEquals((-2422.0), xYDataItem0.getXValue(), 0.01);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(0.0, xYDataItem0.getYValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("$ename")));
        xYSeries0.setMaximumItemCount(0);
        int int0 = xYSeries0.getMaximumItemCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week(0 , 2163);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(week0)) , true);
        xYSeries0.add(0.0, ((double)(-3668)), true);
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.remove(0);
        org.junit.Assert.assertEquals((-3668.0), xYDataItem0.getYValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, xYDataItem0.getXValue(), 0.01);
        xYSeries0.add(java.lang.Double.NaN, ((java.lang.Number)(1)), false);
        xYSeries0.getDataItem(0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year(0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)));
        xYSeries0.getAutoSort();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(15)) , false , false);
        xYSeries0.getAllowDuplicateXValues();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("AcceleratorKey")) , false , false);
        xYSeries0.add(((double)((byte)(12))), 2727.597555475468);
        xYSeries0.addOrUpdate(((double)((byte)(12))), 1.0);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)));
        try {
            xYSeries0.updateByIndex((-1492), 9999);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("")));
        try {
            xYSeries0.remove((-3349));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("org.jfree.data.xy.DefaultHighLowDataset")) , false);
        try {
            xYSeries0.getY((-5415));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , false);
        try {
            xYSeries0.getX((-33));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("AcceleratorKey")) , false , false);
        try {
            xYSeries0.delete((-637), (-637));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , true);
        xYSeries0.add(((java.lang.Number)(1)), ((java.lang.Number)(null)));
        try {
            xYSeries0.createCopy((-951), (-951));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("AcceleratorKey")) , false , false);
        xYSeries0.add(((java.lang.Number)((byte)(12))), ((java.lang.Number)((byte)(12))), false);
        int int0 = xYSeries0.indexOf(((byte)(12)));
        org.junit.Assert.assertEquals(0, int0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("AcceleratorKey")) , false , false);
        xYSeries0.add(((double)((byte)(12))), 2701.2278735662894);
        int int0 = xYSeries0.indexOf(0.714);
        org.junit.Assert.assertEquals((-1), int0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(15)) , false , false);
        xYSeries0.addOrUpdate(((java.lang.Number)(0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , true);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((double)(2640)) , ((double)(999)));
        xYSeries0.add(xYDataItem0, false);
        xYSeries0.add(xYDataItem0, true);
        org.junit.Assert.assertEquals(2, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week(0 , 2163);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(week0)) , true);
        xYSeries0.getItemCount();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("$ename")));
        xYSeries0.add(((double)(2)), ((java.lang.Number)(null)));
        xYSeries0.toArray();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test69() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("$ename")));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(701.9410937 , 701.9410937);
        xYSeries0.add(xYDataItem0);
        xYSeries0.clear();
        org.junit.Assert.assertEquals(0, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test71() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , true);
        xYSeries0.delete(1268, 0);
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test72() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("$ename")));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(701.9410937 , 701.9410937);
        xYSeries0.setMaximumItemCount(0);
        xYSeries0.add(xYDataItem0, false);
        org.junit.Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test73() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , false);
        xYSeries0.add(((double)(-2664)), ((double)(-4272)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.getDataItem(0);
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals((-4272.0), xYDataItem0.getYValue(), 0.01);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals((-2664.0), xYDataItem0.getXValue(), 0.01);
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test75() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("$ename")));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(701.9410937 , 701.9410937);
        xYSeries0.add(xYDataItem0);
        xYSeries0.setMaximumItemCount(0);
        org.junit.Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test76() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("$ename")));
        xYSeries0.setMaximumItemCount(0);
        xYSeries0.addOrUpdate(((java.lang.Number)(2)), ((java.lang.Number)(2)));
        org.junit.Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test77() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("Point2D.Double[-114.0, -733.2092]")) , false , false);
        xYSeries0.getAutoSort();
        org.junit.Assert.assertFalse(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test78() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)));
        boolean boolean0 = xYSeries0.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test79() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week(0 , 2163);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(week0)) , true);
        try {
            xYSeries0.remove(((java.lang.Number)(53)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test81() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("$ename")));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(701.9410937 , 701.9410937);
        xYSeries0.add(xYDataItem0);
        xYSeries0.toArray();
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }
}

