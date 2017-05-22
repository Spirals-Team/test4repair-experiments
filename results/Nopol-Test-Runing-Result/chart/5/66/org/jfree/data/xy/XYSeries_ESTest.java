package org.jfree.data.xy;


public class XYSeries_ESTest extends org.jfree.data.xy.XYSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.add(((double)(1)), (-1038.581528));
        xYSeries0.add(((double)(0)), 1.0);
        xYSeries0.addOrUpdate(((java.lang.Number)(4)), ((java.lang.Number)(4)));
        xYSeries0.add(((java.lang.Number)(1)), ((java.lang.Number)(4)), false);
        xYSeries0.hashCode();
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("toggle popup")));
        xYSeries0.setMaximumItemCount(1);
        xYSeries0.addOrUpdate(((java.lang.Number)(1)), ((java.lang.Number)((byte)(16))));
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.add(((double)(1)), (-1038.581528));
        xYSeries0.add(((java.lang.Number)(1)), ((java.lang.Number)(4)), false);
        xYSeries0.update(1, 4);
        org.junit.Assert.assertEquals(2, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false);
        xYSeries0.addOrUpdate(((java.lang.Number)(9999)), ((java.lang.Number)(-9999)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.remove(((java.lang.Number)(9999)));
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals((-9999.0), xYDataItem0.getYValue(), 0.01);
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.addOrUpdate(((java.lang.Number)(4)), ((java.lang.Number)(4)));
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
        xYSeries0.remove(((java.lang.Number)(quarter0.LAST_QUARTER)));
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , true);
        xYSeries0.add(((double)(1)), (-1038.581528));
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.remove(0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals((-1038.581528), xYDataItem0.getYValue(), 0.01);
        org.junit.Assert.assertEquals(1.0, xYDataItem0.getXValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(0.0 , 0.0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)) , true);
        xYSeries0.add(0.0, 1149.0043599823);
        org.jfree.data.xy.XYDataItem xYDataItem1 = xYSeries0.remove(((int)((byte)(0))));
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(1149.0043599823, xYDataItem1.getYValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("java.text.ParsePosition[index=0,errorIndex=-1]")) , true , true);
        xYSeries0.add(((java.lang.Number)(4)), ((java.lang.Number)(3)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.remove(0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(3.0, xYDataItem0.getYValue(), 0.01);
        org.junit.Assert.assertEquals(4.0, xYDataItem0.getXValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.add(((double)(1)), (-1038.581528));
        xYSeries0.addOrUpdate(((java.lang.Number)(4)), ((java.lang.Number)(4)));
        int int0 = xYSeries0.indexOf(4);
        org.junit.Assert.assertEquals(2, xYSeries0.getItemCount());
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , true);
        xYSeries0.add(((double)(1)), (-1038.581528));
        java.lang.Double double0 = ((java.lang.Double)(xYSeries0.getY(0)));
        org.junit.Assert.assertEquals((-1038.581528), ((double)(double0)), 0.01);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.add(((double)(1)), ((double)(1)));
        java.lang.Double double0 = ((java.lang.Double)(xYSeries0.getY(0)));
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(1.0, ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(999)) , ((java.lang.Number)(0)));
        xYSeries0.add(xYDataItem0, true);
        xYDataItem0.setY(((double)(999)));
        xYSeries0.getY(0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.add(((double)(1)), (-1038.581528));
        java.lang.Double double0 = ((java.lang.Double)(xYSeries0.getX(0)));
        org.junit.Assert.assertEquals(1.0, ((double)(double0)), 0.01);
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(999)) , ((java.lang.Number)(0)));
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.getX(0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.setMaximumItemCount(0);
        int int0 = xYSeries0.getMaximumItemCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , true , false);
        xYSeries0.add(((double)(1129142560)), ((double)(1129142560)));
        xYSeries0.getItemCount();
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.add(((double)(1)), (-1038.581528));
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.getDataItem(0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(1.0, xYDataItem0.getXValue(), 0.01);
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals((-1038.581528), xYDataItem0.getYValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("java.text.ParsePosition[index=0,errorIndex=-1]")) , true , true);
        xYSeries0.add(((double)(0)), ((java.lang.Number)(1129142603)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.getDataItem(0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(1.129142603E9, xYDataItem0.getYValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, xYDataItem0.getXValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(2)) , true , true);
        xYSeries0.add(((double)(-241)), ((java.lang.Number)(0)), true);
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.getDataItem(0);
        org.junit.Assert.assertEquals(0.0, xYDataItem0.getYValue(), 0.01);
        org.junit.Assert.assertEquals((-241.0), xYDataItem0.getXValue(), 0.01);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)) , true);
        xYSeries0.getAutoSort();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("")));
        xYSeries0.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy(32, (-2));
        org.junit.Assert.assertNotSame(xYSeries1, xYSeries0);
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.setMaximumItemCount(0);
        xYSeries0.createCopy(0, 4684);
        org.junit.Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , true , false);
        xYSeries0.add(((double)(1129142560)), ((double)(1129142560)));
        xYSeries0.addOrUpdate(((java.lang.Number)(1129142560)), ((java.lang.Number)(null)));
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("")));
        try {
            xYSeries0.updateByIndex((-165), ((java.lang.Number)(null)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        try {
            xYSeries0.remove(((java.lang.Number)(1)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(day0)) , false , true);
        try {
            xYSeries0.getY((-1044));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("")) , false , false);
        try {
            xYSeries0.getX((-3740));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(0L);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)));
        try {
            xYSeries0.delete((-1), 2000);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.add(((double)(1)), (-1038.581528));
        try {
            xYSeries0.createCopy((-250), 1);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(0.0 , 0.0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)) , true);
        org.jfree.data.xy.XYSeries xYSeries1 = ((org.jfree.data.xy.XYSeries)(xYSeries0.clone()));
        java.lang.Object[][] objectArray0 = new java.lang.Object[7][4];
        java.util.List list0 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objectArray0);
        xYSeries1.data = list0;
        try {
            xYSeries1.addOrUpdate(((double)(-1)), 0.0);
            org.junit.Assert.fail("Expecting exception: ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.data = null;
        try {
            xYSeries0.add(((double)(1)), (-1038.581528));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.addOrUpdate(((java.lang.Number)(4)), ((java.lang.Number)(4)));
        int int0 = xYSeries0.indexOf(4);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(0L);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)));
        xYSeries0.indexOf(2);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        org.jfree.data.time.SpreadsheetDate spreadsheetDate0 = new org.jfree.data.time.SpreadsheetDate(2958435);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(spreadsheetDate0)) , false);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((double)(2958435)) , 0.5);
        xYSeries0.add(xYDataItem0, false);
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , true , false);
        xYSeries0.getItemCount();
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , true , false);
        xYSeries0.hashCode();
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , true);
        xYSeries0.add(((double)(1)), (-1038.581528));
        xYSeries0.add(((java.lang.Number)(1)), ((java.lang.Number)(4)), true);
        xYSeries0.hashCode();
        org.junit.Assert.assertEquals(2, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(0.0 , 0.0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)) , false);
        org.jfree.data.xy.XYSeries xYSeries1 = ((org.jfree.data.xy.XYSeries)(xYSeries0.clone()));
        xYSeries1.addOrUpdate(((double)(-1)), 0.0);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertEquals(1, xYSeries1.getItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy(0, 0);
        xYSeries1.setMaximumItemCount(0);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertEquals(0, xYSeries1.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy(0, 0);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertNotSame(xYSeries1, xYSeries0);
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertFalse(xYSeries1.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(day0)) , true , true);
        boolean boolean0 = xYSeries0.equals(xYSeries0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        boolean boolean0 = xYSeries0.equals(quarter0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , true , false);
        xYSeries0.addOrUpdate(((java.lang.Number)(1129142560)), ((java.lang.Number)(null)));
        xYSeries0.toArray();
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.add(((double)(1)), ((double)(1)));
        int int0 = xYSeries0.indexOf(1);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.setMaximumItemCount(0);
        xYSeries0.addOrUpdate(((java.lang.Number)(4)), ((java.lang.Number)(4)));
        org.junit.Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , true , false);
        xYSeries0.add(503.52, ((double)(1129142560)));
        xYSeries0.addOrUpdate(503.52, (-2.147483648E9));
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(0.0 , 0.0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)) , true);
        xYSeries0.add(0.0, 1149.0043599823);
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        xYSeries0.update(((byte)(0)), 1002);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.add(((double)(1)), (-1038.581528));
        xYSeries0.clear();
        org.junit.Assert.assertEquals(0, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(10)));
        xYSeries0.clear();
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.delete(4, 1);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , true);
        xYSeries0.add(((double)(1)), (-1038.581528));
        xYSeries0.addOrUpdate(((java.lang.Number)(4)), ((java.lang.Number)(4)));
        xYSeries0.add(((java.lang.Number)(1)), ((java.lang.Number)(4)), true);
        org.junit.Assert.assertEquals(3, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(999)) , ((java.lang.Number)(0)));
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.add(xYDataItem0, false);
        org.junit.Assert.assertEquals(2, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.add(((double)(1)), ((double)(1)));
        xYSeries0.setMaximumItemCount(0);
        org.junit.Assert.assertEquals(0, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.setMaximumItemCount(0);
        xYSeries0.add(((java.lang.Number)(1)), ((java.lang.Number)(4)), false);
        org.junit.Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)) , false);
        boolean boolean0 = xYSeries0.getAutoSort();
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        boolean boolean0 = xYSeries0.getAllowDuplicateXValues();
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(999)) , ((java.lang.Number)(0)));
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.toArray();
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(0.0 , 0.0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)) , true);
        int int0 = xYSeries0.getMaximumItemCount();
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(quarter0)) , ((java.lang.Number)(1)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false);
        xYSeries0.add(((double)(1)), ((double)(1)));
        xYSeries0.createCopy(0, 0);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }
}

