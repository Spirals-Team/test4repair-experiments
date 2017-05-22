package org.jfree.data.time;


public class TimeSeries_ESTest extends org.jfree.data.time.TimeSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.lang.Class<java.awt.Panel> class0 = java.awt.Panel.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)) , "Null 'id' argument." , "" , ((java.lang.Class)(class0)));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Null 'id' argument.", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((org.jfree.data.time.RegularTimePeriod)(millisecond0)));
        timeSeries1.setMaximumItemCount(0);
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertEquals(0, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.Minute minute1 = ((org.jfree.data.time.Minute)(minute0.next()));
        java.lang.Class<java.awt.Panel> class0 = java.awt.Panel.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute1)) , "Null 'id' argument." , "" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(minute0)), ((org.jfree.data.time.RegularTimePeriod)(minute1)));
        org.junit.Assert.assertEquals("Null 'id' argument.", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals("", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.Day day1 = ((org.jfree.data.time.Day)(day0.previous()));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(23)), true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day1)) , ((java.lang.Number)(0)));
        timeSeries0.add(timeSeriesDataItem0, false);
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(day0)), ((double)(0L)));
        org.junit.Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.Day day1 = ((org.jfree.data.time.Day)(day0.previous()));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(23)), true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day1)) , ((java.lang.Number)(0)));
        timeSeries0.add(timeSeriesDataItem0, false);
        timeSeries0.getDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)));
        org.junit.Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.lang.Class<java.awt.Panel> class0 = java.awt.Panel.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)) , "Null 'id' argument." , "" , ((java.lang.Class)(class0)));
        timeSeries0.setMaximumItemCount(182);
        org.junit.Assert.assertEquals(182, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.setRangeDescription("Following");
        timeSeries0.setRangeDescription("");
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), (-9.4409242228));
        timeSeries0.update(0, ((java.lang.Number)(999)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        boolean boolean0 = timeSeries0.equals(timeSeries0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(23)));
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , ((java.lang.Number)(0)));
        timeSeries0.add(timeSeriesDataItem0, true);
        java.lang.Integer integer0 = ((java.lang.Integer)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(day0)))));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertNotNull(integer0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((double)(999)));
        java.lang.Double double0 = ((java.lang.Double)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(millisecond0)))));
        org.junit.Assert.assertNotNull(double0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(999.0, ((double)(double0)), 0.01);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(23)), true);
        timeSeries0.getTimePeriod(0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), (-9.4409242228));
        timeSeries0.getNextTimePeriod();
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.setMaximumItemCount(0);
        int int0 = timeSeries0.getMaximumItemCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), (-9.4409242228));
        timeSeries0.getItemCount();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), (-9.4409242228));
        timeSeries0.getIndex(millisecond0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.setDomainDescription("");
        timeSeries0.getDomainDescription();
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), (-9.4409242228));
        timeSeries0.getDataItem(0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((org.jfree.data.time.RegularTimePeriod)(millisecond0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((org.jfree.data.time.RegularTimePeriod)(millisecond0)));
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , ((java.lang.Number)(0)));
        timeSeries0.add(timeSeriesDataItem0, false);
        timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(hour0)), ((org.jfree.data.time.RegularTimePeriod)(day0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(23)), true);
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(day0)), ((double)(0L)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.data = null;
        try {
            timeSeries0.getTimePeriods();
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        try {
            timeSeries0.getTimePeriod((-6021));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test036() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.lang.Class<java.awt.Panel> class0 = java.awt.Panel.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)) , "Null 'id' argument." , "" , ((java.lang.Class)(class0)));
        try {
            timeSeries0.delete((-1843), 1556);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.lang.Class<java.awt.Panel> class0 = java.awt.Panel.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)) , "Null 'id' argument." , "Fri Feb 14 20:21:21 GMT 2014" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(minute0)), (-1.0));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.delete(0, 0);
        org.junit.Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.Day day1 = ((org.jfree.data.time.Day)(day0.previous()));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), (-1584.30806), false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day1)) , ((java.lang.Number)(0)));
        timeSeries0.add(timeSeriesDataItem0, true);
        timeSeries0.removeAgedItems(true);
        org.junit.Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6009) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.removeAgedItems(true);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), (-9.4409242228));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((java.lang.Number)(999)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.getIndex(millisecond0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        int int0 = timeSeries0.getMaximumItemCount();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.lang.Class<java.awt.Panel> class0 = java.awt.Panel.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)) , "Null 'id' argument." , "" , ((java.lang.Class)(class0)));
        long long0 = timeSeries0.getMaximumItemAge();
        org.junit.Assert.assertEquals("Null 'id' argument.", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, long0);
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Container> class0 = java.awt.Container.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "" , ((java.lang.String)(null)) , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertNull(string0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6009) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        try {
            timeSeries0.getValue((-1));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        java.lang.String string0 = timeSeries0.getDomainDescription();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        try {
            timeSeries0.getDataItem((-4494));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , ((java.lang.Number)(0)));
        timeSeries0.add(timeSeriesDataItem0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.getItemCount();
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(23)), true);
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((org.jfree.data.time.RegularTimePeriod)(millisecond0)));
        timeSeries0.setMaximumItemCount(0);
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((org.jfree.data.time.RegularTimePeriod)(millisecond0)));
        timeSeries0.setRangeDescription("Following");
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertEquals("Following", timeSeries0.getRangeDescription());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        javax.swing.table.DefaultTableModel defaultTableModel0 = new javax.swing.table.DefaultTableModel();
        boolean boolean0 = timeSeries0.equals(defaultTableModel0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.Day day1 = ((org.jfree.data.time.Day)(day0.previous()));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(23)), true);
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(day1)), ((org.jfree.data.time.RegularTimePeriod)(day1)));
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals(0, timeSeries1.getItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(9223372036854775807L);
        java.lang.Class<org.jfree.data.time.Day> class0 = org.jfree.data.time.Day.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "java.lang.Class" , ",QbY.T7" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(0, java.lang.Integer.MAX_VALUE);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals("java.lang.Class", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals(",QbY.T7", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), (-9.4409242228));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.delete(((org.jfree.data.time.RegularTimePeriod)(millisecond0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), 0.0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.clear();
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.clear();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), (-1584.30806), false);
        timeSeries0.removeAgedItems(((long)(-6021)), false);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.removeAgedItems(((long)(java.lang.Integer.MAX_VALUE)), false);
        timeSeries0.removeAgedItems((-1616L), true);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), (-9.4409242228));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((org.jfree.data.time.RegularTimePeriod)(millisecond0)));
        timeSeries1.addAndOrUpdate(timeSeries0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        org.junit.Assert.assertTrue(timeSeries0.equals(((java.lang.Object)(timeSeries1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), (-1584.30806), false);
        timeSeries0.update(((org.jfree.data.time.RegularTimePeriod)(hour0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.Day day1 = ((org.jfree.data.time.Day)(day0.previous()));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(23)), true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day1)) , ((java.lang.Number)(0)));
        timeSeries0.add(timeSeriesDataItem0, false);
        timeSeries0.clone();
        org.junit.Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Dialog> class0 = java.awt.Dialog.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , ((java.lang.Class)(class0)));
        timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(day0)));
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), (-9.4409242228));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((org.jfree.data.time.RegularTimePeriod)(millisecond0)));
        timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        org.junit.Assert.assertNotSame(timeSeries0, timeSeries1);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), (-9.4409242228));
        timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(23)), true);
        timeSeries0.getTimePeriods();
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(23)), true);
        timeSeries0.getDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0);
        timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((org.jfree.data.time.RegularTimePeriod)(millisecond0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), (-9.4409242228));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.setMaximumItemCount(0);
        org.junit.Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((java.lang.Number)(999)));
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour((-6021) , day0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        timeSeries0.setRangeDescription(((java.lang.String)(null)));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Dialog> class0 = java.awt.Dialog.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)((byte)(18))));
        timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(day0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        java.lang.Class<java.lang.Object> class0 = java.lang.Object.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("AcceleratorKey")) , "D4Ln#`mIPT$VC17um" , "D4Ln#`mIPT$VC17um" , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getNextTimePeriod();
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Container> class0 = java.awt.Container.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "" , ((java.lang.String)(null)) , ((java.lang.Class)(class0)));
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        timeSeries0.setDomainDescription(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((org.jfree.data.time.RegularTimePeriod)(millisecond0)));
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }
}

