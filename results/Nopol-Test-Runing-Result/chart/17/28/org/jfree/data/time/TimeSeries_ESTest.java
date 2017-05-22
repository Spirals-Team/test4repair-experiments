package org.jfree.data.time;


public class TimeSeries_ESTest extends org.jfree.data.time.TimeSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin((-1.2243819868250387) , 2292.31);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        timeSeries0.setDomainDescription("");
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(31, 4443);
        timeSeries1.setMaximumItemAge(59);
        boolean boolean0 = timeSeries0.equals(timeSeries1);
        org.junit.Assert.assertEquals(59L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-1L));
        java.lang.Class<java.awt.TextArea> class0 = java.awt.TextArea.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , ((java.lang.String)(null)) , ((java.lang.String)(null)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.FixedMillisecond fixedMillisecond1 = ((org.jfree.data.time.FixedMillisecond)(fixedMillisecond0.previous()));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), 2157.7067445);
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond1)), ((java.lang.Number)((byte)(114))));
        timeSeries0.clone();
        org.junit.Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-1L));
        java.lang.Class<java.awt.TextArea> class0 = java.awt.TextArea.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , ((java.lang.String)(null)) , ((java.lang.String)(null)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.FixedMillisecond fixedMillisecond1 = new org.jfree.data.time.FixedMillisecond();
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), 2157.7067445);
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond1)), ((java.lang.Number)((byte)(114))));
        org.junit.Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("TableHeaderUI")) , "TableHeaderUI" , "TableHeaderUI" , ((java.lang.Class)(class0)));
        org.junit.Assert.assertEquals("TableHeaderUI", timeSeries0.getRangeDescription());
        timeSeries0.setRangeDescription(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("TableHeaderUI", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        boolean boolean0 = timeSeries0.equals(timeSeries0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-1L));
        java.lang.Class<java.awt.TextArea> class0 = java.awt.TextArea.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , ((java.lang.String)(null)) , ((java.lang.String)(null)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)((byte)(126))));
        java.lang.Byte byte0 = ((java.lang.Byte)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)))));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertNotNull(byte0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.Second second0 = millisecond0.getSecond();
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((double)(999)));
        java.lang.Double double0 = ((java.lang.Double)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(millisecond0)))));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(999.0, ((double)(double0)), 0.01);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertNotNull(double0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(0)), false);
        timeSeries0.getValue(0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(0)), false);
        timeSeries0.getTimePeriod(0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        timeSeries0.setRangeDescription(((java.lang.String)(null)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertNull(string0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(803.263743417 , 1572.861749641032);
        java.lang.Class<java.awt.Container> class0 = java.awt.Container.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(xYDataItem0)) , "" , "" , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.lang.Class<java.awt.TextComponent> class0 = java.awt.TextComponent.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(minute0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.getNextTimePeriod();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-1L));
        java.lang.Class<java.awt.TextArea> class0 = java.awt.TextArea.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , ((java.lang.String)(null)) , ((java.lang.String)(null)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)((byte)(114))));
        int int0 = timeSeries0.getItemCount();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(0)), true);
        timeSeries0.getIndex(day0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.Second second0 = millisecond0.getSecond();
        timeSeries0.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(day0)), ((org.jfree.data.time.RegularTimePeriod)(day0)));
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        timeSeries0.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(0, 4443);
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertNotSame(timeSeries1, timeSeries0);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.createCopy(0, 335);
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0);
        timeSeries0.createCopy(31, 4443);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(year0)), ((double)(4443)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(year0)), ((double)(31)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)));
        try {
            timeSeries0.getValue((-898));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin(0.0 , 2292.31);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        try {
            timeSeries0.getTimePeriod((-814));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(31, 4443);
        java.lang.Object[][] objectArray0 = new java.lang.Object[6][2];
        java.util.List list0 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objectArray0);
        timeSeries1.data = list0;
        try {
            timeSeries1.delete(((org.jfree.data.time.RegularTimePeriod)(year0)));
            org.junit.Assert.fail("Expecting exception: ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((org.jfree.data.time.RegularTimePeriod)(second0)));
        java.lang.Object[][] objectArray0 = new java.lang.Object[4][8];
        java.util.List list0 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objectArray0);
        timeSeries1.data = list0;
        try {
            timeSeries0.addAndOrUpdate(timeSeries1);
            org.junit.Assert.fail("Expecting exception: ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin(0.0 , 2292.31);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        try {
            timeSeries0.delete((-370), 53);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , ((java.lang.Class)(class0)));
        timeSeries0.removeAgedItems(false);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.lang.Class<java.awt.TextComponent> class0 = java.awt.TextComponent.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(minute0)), ((java.lang.Number)(59)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(minute0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , ((java.lang.Number)(null)));
        timeSeries0.add(timeSeriesDataItem0, true);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , ((java.lang.Number)(null)));
        timeSeries0.add(timeSeriesDataItem0, false);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.getIndex(day0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        timeSeries0.getTimePeriodClass();
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(0.0 , 0.0);
        java.lang.Class<java.awt.Frame> class0 = java.awt.Frame.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(xYDataItem0)) , ((java.lang.Class)(class0)));
        int int0 = timeSeries0.getMaximumItemCount();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.lang.Integer> class0 = java.lang.Integer.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , "" , "S{HH}]G$?`$S8z:7" , ((java.lang.Class)(class0)));
        long long0 = timeSeries0.getMaximumItemAge();
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, long0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("S{HH}]G$?`$S8z:7", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals("Value", string0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        java.lang.String string0 = timeSeries0.getDomainDescription();
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", string0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , ((java.lang.Class)(class0)));
        timeSeries0.getItemCount();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(0)), false);
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-1L));
        java.lang.Class<java.awt.TextArea> class0 = java.awt.TextArea.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , ((java.lang.String)(null)) , ((java.lang.String)(null)) , ((java.lang.Class)(class0)));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
        boolean boolean0 = timeSeries0.equals(timeSeries1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.Second second0 = millisecond0.getSecond();
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(31, 4443);
        timeSeries0.setMaximumItemAge(59);
        org.jfree.data.time.TimeSeries timeSeries2 = timeSeries1.createCopy(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((org.jfree.data.time.RegularTimePeriod)(second0)));
        boolean boolean0 = timeSeries0.equals(timeSeries2);
        org.junit.Assert.assertEquals(59L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((double)(2)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(day0)), ((org.jfree.data.time.RegularTimePeriod)(day0)));
        org.junit.Assert.assertNotSame(timeSeries1, timeSeries0);
        org.junit.Assert.assertEquals(1, timeSeries1.getItemCount());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(year0)), ((double)(4443)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.delete(((org.jfree.data.time.RegularTimePeriod)(year0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        timeSeries0.delete(((org.jfree.data.time.RegularTimePeriod)(year0)));
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        timeSeries0.clear();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(0)), true);
        timeSeries0.removeAgedItems((-4849L), true);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        timeSeries0.removeAgedItems(((long)(999)), false);
        timeSeries0.removeAgedItems(1L, false);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(null)));
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.lang.Class<java.awt.TextComponent> class0 = java.awt.TextComponent.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(minute0)), ((org.jfree.data.time.RegularTimePeriod)(minute0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(minute0)), ((java.lang.Number)(0)));
        timeSeries1.addAndOrUpdate(timeSeries0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(0)), false);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.update(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        timeSeries0.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , ((java.lang.Number)(0)));
        timeSeries0.add(timeSeriesDataItem0);
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(0)), false);
        timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(day0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(year0)), 0.0);
        timeSeries0.getTimePeriods();
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.lang.Class<java.awt.TextComponent> class0 = java.awt.TextComponent.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(minute0)), ((java.lang.Number)(59)));
        timeSeries0.getDataItem(((org.jfree.data.time.RegularTimePeriod)(minute0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.lang.Class<java.awt.TextComponent> class0 = java.awt.TextComponent.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)) , ((java.lang.Class)(class0)));
        timeSeries0.getDataItem(((org.jfree.data.time.RegularTimePeriod)(minute0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(null)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.setRangeDescription("");
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(0)), false);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.setMaximumItemCount(0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), 936.804262045703, false);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.clear();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.lang.Class<java.awt.TextComponent> class0 = java.awt.TextComponent.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)) , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getNextTimePeriod();
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.getItems();
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.lang.Class<java.awt.TextComponent> class0 = java.awt.TextComponent.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)) , ((java.lang.Class)(class0)));
        try {
            timeSeries0.update((-1971), ((java.lang.Number)(null)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.lang.Integer> class0 = java.lang.Integer.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , "" , "S{HH}]G$?`$S8z:7" , ((java.lang.Class)(class0)));
        timeSeries0.setDomainDescription("Requires start <= end.");
        org.junit.Assert.assertEquals("Requires start <= end.", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(year0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(31, 4443);
        boolean boolean0 = timeSeries0.equals(timeSeries1);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertNotSame(timeSeries1, timeSeries0);
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }
}

