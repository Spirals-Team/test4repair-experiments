package org.jfree.data.time;


public class TimeSeries_ESTest extends org.jfree.data.time.TimeSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<org.jfree.data.time.Millisecond> class0 = org.jfree.data.time.Millisecond.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , "" , "D}nN>_\"\"-#}gf3XF{" , ((java.lang.Class)(class0)));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("D}nN>_\"\"-#}gf3XF{", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.Year year1 = ((org.jfree.data.time.Year)(year0.previous()));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(year1)) , ((java.lang.Number)(0)));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(timeSeriesDataItem0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(year1)), ((java.lang.Number)(null)));
        timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(year1)), ((org.jfree.data.time.RegularTimePeriod)(year0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.Year year1 = ((org.jfree.data.time.Year)(year0.previous()));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(year1)) , ((java.lang.Number)(1935897188)));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(timeSeriesDataItem0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(year1)), ((org.jfree.data.time.RegularTimePeriod)(year0)));
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute((-1009) , hour0);
        org.jfree.data.time.Day day0 = minute0.getDay();
        java.lang.Class<java.awt.Panel> class0 = java.awt.Panel.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , " for that time period. Duplicates are not " , "I)5E!k-^8')DPXA" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(59, 1615);
        org.junit.Assert.assertEquals("I)5E!k-^8')DPXA", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals(" for that time period. Duplicates are not ", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertNotSame(timeSeries1, timeSeries0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)));
        timeSeries0.setMaximumItemCount(0);
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<org.jfree.data.time.Millisecond> class0 = org.jfree.data.time.Millisecond.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , "" , "D}nN>_\"\"-#}gf3XF{" , ((java.lang.Class)(class0)));
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        timeSeries0.setDomainDescription("D}nN>_\"\"-#}gf3XF{");
        org.junit.Assert.assertEquals("D}nN>_\"\"-#}gf3XF{", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        java.lang.Class<org.jfree.data.time.Month> class0 = org.jfree.data.time.Month.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(month0)) , ((java.lang.Class)(class0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(month0)), 423.25);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.jfree.data.time.SpreadsheetDate spreadsheetDate0 = new org.jfree.data.time.SpreadsheetDate(50);
        java.util.Date date0 = spreadsheetDate0.toDate();
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute(date0);
        java.lang.Class<java.awt.List> class0 = java.awt.List.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)) , ((java.lang.String)(null)) , ((java.lang.String)(null)) , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertNull(string0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<org.jfree.data.time.Millisecond> class0 = org.jfree.data.time.Millisecond.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , "" , "" , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("", string0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Container> class0 = java.awt.Container.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , "" , "" , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getDomainDescription();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("", string0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Container> class0 = java.awt.Container.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , "" , "" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(53)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), 0.0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        java.lang.Class<java.awt.TextArea> class0 = java.awt.TextArea.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(month0)) , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getValue((-1434));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(quarter0)));
        timeSeries0.removeAgedItems(false);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(year0)) , ((java.lang.Number)(1935897188)));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(timeSeriesDataItem0)));
        timeSeries0.getIndex(year0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(10)));
        timeSeries0.getTimePeriodClass();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)));
        long long0 = timeSeries0.getMaximumItemAge();
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, long0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<org.jfree.data.time.Millisecond> class0 = org.jfree.data.time.Millisecond.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , "" , "D}nN>_\"\"-#}gf3XF{" , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals("D}nN>_\"\"-#}gf3XF{", string0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<org.jfree.data.time.Millisecond> class0 = org.jfree.data.time.Millisecond.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , "" , "D}nN>_\"\"-#}gf3XF{" , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getTimePeriod((-1960));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ((java.lang.String)(null)) , "D}nN>_\"\"-#}gf3XF{" , ((java.lang.Class)(null)));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals("D}nN>_\"\"-#}gf3XF{", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Container> class0 = java.awt.Container.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , "" , "" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(53)));
        timeSeries0.delete(((org.jfree.data.time.RegularTimePeriod)(week0)));
        org.junit.Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(year0)) , ((java.lang.Number)(0)));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(timeSeriesDataItem0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(year0)), ((java.lang.Number)(null)));
        timeSeries0.removeAgedItems(0L, true);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)));
        timeSeries0.removeAgedItems(((long)(0)), false);
        timeSeries0.removeAgedItems(((long)(0)), false);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(year0)) , ((java.lang.Number)(0)));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(timeSeriesDataItem0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(year0)), ((java.lang.Number)(null)));
        timeSeries0.getTimePeriods();
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(year0)) , ((java.lang.Number)(0)));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(timeSeriesDataItem0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0L);
        timeSeries0.createCopy(0, 0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)));
        try {
            timeSeries0.getNextTimePeriod();
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(year0)) , ((java.lang.Number)(0)));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(timeSeriesDataItem0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertNotSame(timeSeries1, timeSeries0);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)));
        try {
            timeSeries0.update((-1950), ((java.lang.Number)(999)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(year0)) , ((java.lang.Number)(0)));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(timeSeriesDataItem0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(year0)), ((java.lang.Number)(null)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(year0)), ((org.jfree.data.time.RegularTimePeriod)(year0)));
        org.jfree.data.time.TimeSeries timeSeries2 = timeSeries1.addAndOrUpdate(timeSeries0);
        timeSeries1.createCopy(0, 0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        org.junit.Assert.assertFalse(timeSeries0.equals(((java.lang.Object)(timeSeries2))));
    }
}

