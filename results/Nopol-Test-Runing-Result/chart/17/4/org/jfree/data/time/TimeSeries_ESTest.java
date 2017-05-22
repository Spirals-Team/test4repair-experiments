package org.jfree.data.time;


public class TimeSeries_ESTest extends org.jfree.data.time.TimeSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week(2039 , 2039);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)));
        timeSeries0.setMaximumItemCount(1);
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(53)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(9223372036854775807L);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0L);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.time.SimpleTimePeriod simpleTimePeriod0 = new org.jfree.data.time.SimpleTimePeriod(167L , 167L);
        org.jfree.data.time.SpreadsheetDate spreadsheetDate0 = new org.jfree.data.time.SpreadsheetDate(2);
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day(((org.jfree.data.time.SerialDate)(spreadsheetDate0)));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleTimePeriod0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), 0.0, false);
        java.lang.Double double0 = ((java.lang.Double)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(day0)))));
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertNotNull(double0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.time.SimpleTimePeriod simpleTimePeriod0 = new org.jfree.data.time.SimpleTimePeriod(167L , 167L);
        org.jfree.data.time.SpreadsheetDate spreadsheetDate0 = new org.jfree.data.time.SpreadsheetDate(2);
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day(((org.jfree.data.time.SerialDate)(spreadsheetDate0)));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleTimePeriod0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), 924.2985);
        java.lang.Double double0 = ((java.lang.Double)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(day0)))));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(924.2985, ((double)(double0)), 0.01);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertNotNull(double0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "Null 'start' argument." , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(day0)), ((double)(355)));
        org.junit.Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.getNextTimePeriod();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Null 'start' argument.", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("LepeH?ah1>+)8", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "Null 'start' argument." , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(day0)), ((double)(366)));
        org.junit.Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.getItemCount();
        org.junit.Assert.assertEquals("Null 'start' argument.", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("LepeH?ah1>+)8", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.time.SimpleTimePeriod simpleTimePeriod0 = new org.jfree.data.time.SimpleTimePeriod(167L , 167L);
        org.jfree.data.time.SpreadsheetDate spreadsheetDate0 = new org.jfree.data.time.SpreadsheetDate(2);
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day(((org.jfree.data.time.SerialDate)(spreadsheetDate0)));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleTimePeriod0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), 0.0, false);
        timeSeries0.getIndex(day0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.jfree.data.time.SimpleTimePeriod simpleTimePeriod0 = new org.jfree.data.time.SimpleTimePeriod(167L , 167L);
        org.jfree.data.time.SpreadsheetDate spreadsheetDate0 = new org.jfree.data.time.SpreadsheetDate(2);
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day(((org.jfree.data.time.SerialDate)(spreadsheetDate0)));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleTimePeriod0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((double)(1)));
        timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(day0)), ((org.jfree.data.time.RegularTimePeriod)(day0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "Null 'start' argument." , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(day0)), ((double)(366)));
        timeSeries0.clone();
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        try {
            timeSeries0.update((-3326), ((java.lang.Number)(59)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)));
        try {
            timeSeries0.delete((-2563), 1);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "Null 'start' argument." , ((java.lang.Class)(class0)));
        timeSeries0.removeAgedItems(false);
        org.junit.Assert.assertEquals("Null 'start' argument.", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("LepeH?ah1>+)8", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.time.SimpleTimePeriod simpleTimePeriod0 = new org.jfree.data.time.SimpleTimePeriod(167L , 167L);
        org.jfree.data.time.SpreadsheetDate spreadsheetDate0 = new org.jfree.data.time.SpreadsheetDate(2);
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day(((org.jfree.data.time.SerialDate)(spreadsheetDate0)));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleTimePeriod0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), 0.0, false);
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(3)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.time.SimpleTimePeriod simpleTimePeriod0 = new org.jfree.data.time.SimpleTimePeriod(167L , 167L);
        org.jfree.data.time.SpreadsheetDate spreadsheetDate0 = new org.jfree.data.time.SpreadsheetDate(2);
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day(((org.jfree.data.time.SerialDate)(spreadsheetDate0)));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleTimePeriod0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , 348.529836);
        timeSeries0.add(timeSeriesDataItem0, true);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.jfree.data.time.SimpleTimePeriod simpleTimePeriod0 = new org.jfree.data.time.SimpleTimePeriod(167L , 167L);
        org.jfree.data.time.SpreadsheetDate spreadsheetDate0 = new org.jfree.data.time.SpreadsheetDate(2);
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day(((org.jfree.data.time.SerialDate)(spreadsheetDate0)));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleTimePeriod0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , ((java.lang.Number)(2958465)));
        timeSeries0.add(timeSeriesDataItem0, false);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "Null 'start' argument." , ((java.lang.Class)(class0)));
        timeSeries0.getTimePeriodClass();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("LepeH?ah1>+)8", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Null 'start' argument.", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.time.SimpleTimePeriod simpleTimePeriod0 = new org.jfree.data.time.SimpleTimePeriod(167L , 167L);
        org.jfree.data.time.SpreadsheetDate spreadsheetDate0 = new org.jfree.data.time.SpreadsheetDate(2);
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day(((org.jfree.data.time.SerialDate)(spreadsheetDate0)));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleTimePeriod0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(3)), false);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        try {
            timeSeries0.getTimePeriod((-2147090046));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "Null 'start' argument." , ((java.lang.Class)(class0)));
        timeSeries0.getItemCount();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Null 'start' argument.", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("LepeH?ah1>+)8", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "org.jfree.data.time.RegularTimePeriod" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(day0)), ((double)(366)));
        org.junit.Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals("LepeH?ah1>+)8", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("org.jfree.data.time.RegularTimePeriod", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "LepeH?ah1>+)8" , ((java.lang.Class)(class0)));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("LepeH?ah1>+)8", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("LepeH?ah1>+)8", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , ((java.lang.String)(null)) , "Null 'start' arguent." , ((java.lang.Class)(class0)));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Null 'start' arguent.", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimePeriodValues timePeriodValues0 = new org.jfree.data.time.TimePeriodValues(((java.lang.Comparable)(second0)) , "mb_%L}UEl;j_" , "SpreadsheetDate: Serial must be in range 2 to 2958465.");
        org.jfree.data.time.TimePeriodValuesCollection timePeriodValuesCollection0 = new org.jfree.data.time.TimePeriodValuesCollection(timePeriodValues0);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        boolean boolean0 = timeSeries0.equals(timePeriodValuesCollection0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "Null 'start' argument." , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(day0)), ((double)(366)));
        timeSeries0.delete(((org.jfree.data.time.RegularTimePeriod)(day0)));
        org.junit.Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "Null 'start' argument." , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(2)));
        timeSeries0.clear();
        org.junit.Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "LepeH?ah1>+)8" , ((java.lang.Class)(class0)));
        timeSeries0.clear();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("LepeH?ah1>+)8", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("LepeH?ah1>+)8", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)));
        timeSeries0.removeAgedItems(((long)(11)), false);
        timeSeries0.removeAgedItems(((long)(11)), true);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "org.jfree.data.time.RegularTimePeriod" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(day0)), ((double)(366)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.update(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(null)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test72() throws java.lang.Throwable {
        org.jfree.data.time.SimpleTimePeriod simpleTimePeriod0 = new org.jfree.data.time.SimpleTimePeriod(167L , 167L);
        org.jfree.data.time.SpreadsheetDate spreadsheetDate0 = new org.jfree.data.time.SpreadsheetDate(2);
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day(((org.jfree.data.time.SerialDate)(spreadsheetDate0)));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleTimePeriod0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((double)(1)));
        timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(day0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test73() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "LepeH?ah1>+)8" , ((java.lang.Class)(class0)));
        timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(day0)));
        org.junit.Assert.assertEquals("LepeH?ah1>+)8", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("LepeH?ah1>+)8", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test75() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)));
        timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test76() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "Null 'start' argument." , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(day0)), ((double)(366)));
        timeSeries0.getTimePeriods();
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test78() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)));
        timeSeries0.getDataItem(((org.jfree.data.time.RegularTimePeriod)(week0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test80() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "Null 'start' argument." , ((java.lang.Class)(class0)));
        timeSeries0.setMaximumItemAge(366);
        org.junit.Assert.assertEquals(366L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test81() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "Null 'start' argument." , ((java.lang.Class)(class0)));
        java.lang.Object[][] objectArray0 = new java.lang.Object[4][1];
        java.util.List list0 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objectArray0);
        timeSeries0.data = list0;
        timeSeries0.setMaximumItemCount(2);
        org.junit.Assert.assertEquals(2, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("SpreadsheetDate: Serial must be in range 2 to 2958465.")));
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test84() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "Null 'start' argument." , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals("Null 'start' argument.", string0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("LepeH?ah1>+)8", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test85() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        long long0 = timeSeries0.getMaximumItemAge();
        org.junit.Assert.assertEquals(9223372036854775807L, long0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test86() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "Null 'start' argument." , ((java.lang.Class)(class0)));
        timeSeries0.setRangeDescription("vlaPe6Ar[ls7w0oMh}");
        org.junit.Assert.assertEquals("vlaPe6Ar[ls7w0oMh}", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test90() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "Null 'start' argument." , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getValue((-247));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test91() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "Null 'start' argument." , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getNextTimePeriod();
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test92() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "Null 'start' argument." , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals("LepeH?ah1>+)8", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Null 'start' argument.", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test93() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "LepeH?ah1>+)8" , ((java.lang.Class)(class0)));
        timeSeries0.getItems();
        org.junit.Assert.assertEquals("LepeH?ah1>+)8", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("LepeH?ah1>+)8", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test94() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , "LepeH?ah1>+)8" , "Null 'start' argument." , ((java.lang.Class)(class0)));
        int int0 = timeSeries0.getMaximumItemCount();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("LepeH?ah1>+)8", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Null 'start' argument.", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test96() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(9223372036854775807L);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)));
        timeSeries0.setDomainDescription("");
        timeSeries0.getDomainDescription();
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test97() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(9223372036854775807L);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)));
        java.lang.String string0 = timeSeries0.getDomainDescription();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", string0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }
}

