package org.jfree.data.time;


public class TimeSeries_ESTest extends org.jfree.data.time.TimeSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-507L));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)));
        org.jfree.data.time.FixedMillisecond fixedMillisecond1 = ((org.jfree.data.time.FixedMillisecond)(fixedMillisecond0.previous()));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond1)), java.lang.Double.NEGATIVE_INFINITY);
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.Week week1 = ((org.jfree.data.time.Week)(week0.next()));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(week0)), ((org.jfree.data.time.RegularTimePeriod)(week1)));
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin((-1389.454671390483) , (-1.0) , false , false);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        timeSeries0.update(0, ((java.lang.Number)(9)));
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), (-927.37961633332));
        java.lang.Double double0 = ((java.lang.Double)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(week0)))));
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertNotNull(double0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals((-927.37961633332), ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin((-1389.454671390483) , (-1.0) , false , false);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        timeSeries0.setRangeDescription(((java.lang.String)(null)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertNull(string0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        timeSeries0.getNextTimePeriod();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.setMaximumItemCount(0);
        int int0 = timeSeries0.getMaximumItemCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        timeSeries0.getItemCount();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        timeSeries0.getIndex(week0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        timeSeries0.getDataItem(0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin((-1389.454671390483) , (-1.0) , false , false);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        timeSeries0.setMaximumItemCount(0);
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(second0)), ((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin((-1389.454671390483) , 1.0 , false , false);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.createCopy(0, 0);
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), (-927.37961633332));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin((-1389.454671390483) , (-1.0) , false , false);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        try {
            timeSeries0.update((-602), ((java.lang.Number)((byte)(117))));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<org.jfree.data.time.Hour> class0 = org.jfree.data.time.Hour.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , "j_!hxtf0T.wlB" , "XHgmO=e&JS~QhLN|g" , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getTimePeriod((-2409));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin((-1389.0) , (-1.0) , false , false);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        try {
            timeSeries0.getDataItem((-21));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        timeSeries0.createCopy(0, 0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin((-1389.454671390483) , (-1.0) , false , false);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.FixedMillisecond fixedMillisecond1 = ((org.jfree.data.time.FixedMillisecond)(fixedMillisecond0.previous()));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond1)), ((double)(0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)((byte)(4))));
        timeSeries0.removeAgedItems(false);
        org.junit.Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-488L));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)));
        timeSeries0.removeAgedItems(false);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(53)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        java.lang.Class<java.lang.String> class0 = java.lang.String.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("3hj8&?,=4\"!n")) , ((java.lang.Class)(class0)));
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        timeSeries0.getIndex(second0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        java.lang.Class<java.lang.String> class0 = java.lang.String.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("")) , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getValue((-261));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin((-1389.454671390483) , (-1.0) , false , false);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        timeSeries0.getItemCount();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.Week week1 = ((org.jfree.data.time.Week)(week0.next()));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week1)), (-927.37961633332));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin((-1389.454671390483) , (-1.0) , false , false);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        timeSeries0.setRangeDescription(((java.lang.String)(null)));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-507L));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)));
        boolean boolean0 = timeSeries0.equals(fixedMillisecond0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-488L));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(36)));
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        timeSeries0.delete(((org.jfree.data.time.RegularTimePeriod)(month0)));
        org.junit.Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        timeSeries0.clear();
        org.junit.Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin((-1389.454671390483) , (-1.0) , false , false);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((double)(0)));
        timeSeries0.removeAgedItems(((long)(0)), true);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin((-1389.454671390483) , (-1.0) , true , true);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        timeSeries0.removeAgedItems(((long)(0)), false);
        timeSeries0.removeAgedItems(((long)(0)), false);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin((-1389.454671390483) , (-1.0) , false , false);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)((byte)(4))));
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(week0)), ((org.jfree.data.time.RegularTimePeriod)(week0)));
        timeSeries1.addAndOrUpdate(timeSeries0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        org.junit.Assert.assertTrue(timeSeries0.equals(((java.lang.Object)(timeSeries1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.update(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(53)));
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin((-1389.454671390483) , (-1.0) , false , false);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        timeSeries0.setMaximumItemCount(0);
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), 0.0, false);
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        timeSeries0.getTimePeriods();
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        timeSeries0.getDataItem(((org.jfree.data.time.RegularTimePeriod)(week0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.getDataItem(((org.jfree.data.time.RegularTimePeriod)(millisecond0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(month0)));
        timeSeries0.setMaximumItemAge(1392409281320L);
        org.junit.Assert.assertEquals(1392409281320L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.Week week1 = ((org.jfree.data.time.Week)(week0.next()));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week1)), (-927.37961633332));
        timeSeries0.setMaximumItemCount(1);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        timeSeries0.setMaximumItemCount(1);
        org.junit.Assert.assertEquals(1, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin((-1389.454671390483) , (-1.0) , false , false);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", string0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        long long0 = timeSeries0.getMaximumItemAge();
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, long0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , "j_!hxtf0T.wlB" , "j_!hxtf0T.wlB" , ((java.lang.Class)(null)));
        timeSeries0.setRangeDescription("j_!hxtf0T.wlB");
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("j_!hxtf0T.wlB", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("j_!hxtf0T.wlB", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin((-1389.454671390483) , (-1.0) , false , false);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleHistogramBin0)));
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(32772)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-507L));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)));
        org.jfree.data.time.TimeSeries timeSeries1 = ((org.jfree.data.time.TimeSeries)(timeSeries0.clone()));
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertNotSame(timeSeries1, timeSeries0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , "j_!hxtf0T.wlB" , "j_!hxtf0T.wlB" , ((java.lang.Class)(null)));
        try {
            timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(week0)), 1634.078190662);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(week0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getNextTimePeriod();
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.getTimePeriodClass();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), 0.0);
        timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(week0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        int int0 = timeSeries0.getMaximumItemCount();
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(week0)), ((org.jfree.data.time.RegularTimePeriod)(week0)));
        timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.setDomainDescription("Week 7, 2014");
        timeSeries0.setDomainDescription("");
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
    }
}

