package org.jfree.data.time;


public class TimeSeries_ESTest extends org.jfree.data.time.TimeSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.setRangeDescription("5]%C*.!Bd");
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals("5]%C*.!Bd", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        org.jfree.data.jdbc.JDBCXYDataset jDBCXYDataset0 = new org.jfree.data.jdbc.JDBCXYDataset(((java.sql.Connection)(null)));
        java.lang.Comparable comparable0 = jDBCXYDataset0.getSeriesKey(2971);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(comparable0);
        timeSeries0.setDomainDescription("P.H=kk");
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals("P.H=kk", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.data.jdbc.JDBCXYDataset jDBCXYDataset0 = new org.jfree.data.jdbc.JDBCXYDataset(((java.sql.Connection)(null)));
        java.lang.Comparable comparable0 = jDBCXYDataset0.getSeriesKey(2965);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(comparable0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0L);
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries(comparable0);
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.setMaximumItemCount(59);
        org.junit.Assert.assertEquals(59, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), 0.0);
        timeSeries0.update(0, ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.data.jdbc.JDBCXYDataset jDBCXYDataset0 = new org.jfree.data.jdbc.JDBCXYDataset(((java.sql.Connection)(null)));
        java.lang.Comparable comparable0 = jDBCXYDataset0.getSeriesKey(2971);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(comparable0);
        boolean boolean0 = timeSeries0.equals(timeSeries0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), (-2.147483648E9));
        java.lang.Double double0 = ((java.lang.Double)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(second0)))));
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals((-2.147483648E9), ((double)(double0)), 0.01);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertNotNull(double0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(59)));
        java.lang.Integer integer0 = ((java.lang.Integer)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(second0)))));
        org.junit.Assert.assertNotNull(integer0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        timeSeries0.getNextTimePeriod();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(null)));
        timeSeries0.getItemCount();
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        timeSeries0.getIndex(second0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(second0)), ((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(second0)), ((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0);
        timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(second0)), ((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((double)(59)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        try {
            timeSeries0.update((-569), ((java.lang.Number)(0)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        org.jfree.data.jdbc.JDBCXYDataset jDBCXYDataset0 = new org.jfree.data.jdbc.JDBCXYDataset(((java.sql.Connection)(null)));
        java.lang.Comparable comparable0 = jDBCXYDataset0.getSeriesKey(2965);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(comparable0);
        try {
            timeSeries0.delete((-1171), 2965);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        org.jfree.data.jdbc.JDBCXYDataset jDBCXYDataset0 = new org.jfree.data.jdbc.JDBCXYDataset(((java.sql.Connection)(null)));
        java.lang.Comparable comparable0 = jDBCXYDataset0.getSeriesKey(2965);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(comparable0);
        timeSeries0.removeAgedItems(false);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(null)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.getIndex(second0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<org.jfree.data.time.Month> class0 = org.jfree.data.time.Month.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.getTimePeriodClass();
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        java.lang.Class<java.lang.Object> class0 = java.lang.Object.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("divider")) , "divider" , "divider" , ((java.lang.Class)(class0)));
        int int0 = timeSeries0.getMaximumItemCount();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("divider", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
        org.junit.Assert.assertEquals("divider", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        long long0 = timeSeries0.getMaximumItemAge();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, long0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<org.jfree.data.time.Hour> class0 = org.jfree.data.time.Hour.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "jI*QiV8" , "" , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals("", string0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("jI*QiV8", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        java.lang.Class<java.awt.FileDialog> class0 = java.awt.FileDialog.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("dialog-type-selection")) , "org.jfree.data.xy.XIntervalDataItem" , "dialog-type-selection" , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getValue((-29));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.Class<java.awt.TextField> class0 = java.awt.TextField.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)) , ((java.lang.String)(null)) , "X'" , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getTimePeriod((-420));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        org.jfree.data.jdbc.JDBCXYDataset jDBCXYDataset0 = new org.jfree.data.jdbc.JDBCXYDataset(((java.sql.Connection)(null)));
        java.lang.Comparable comparable0 = jDBCXYDataset0.getSeriesKey(2965);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(comparable0);
        java.lang.String string0 = timeSeries0.getDomainDescription();
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", string0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week((-2451) , (-2451));
        java.lang.Class<java.awt.FileDialog> class0 = java.awt.FileDialog.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , "Negative 'w' argument." , "Negative 'w' argument." , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getDataItem((-2093));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.getItemCount();
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), 0.0);
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(0, 3910);
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        timeSeries1.addAndOrUpdate(timeSeries0);
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        boolean boolean0 = timeSeries2.equals(timeSeries1);
        org.junit.Assert.assertEquals(1, timeSeries1.getItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        org.jfree.data.jdbc.JDBCXYDataset jDBCXYDataset0 = new org.jfree.data.jdbc.JDBCXYDataset(((java.sql.Connection)(null)));
        java.lang.Comparable comparable0 = jDBCXYDataset0.getSeriesKey(2965);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(comparable0);
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries(comparable0);
        timeSeries0.setRangeDescription("'lDrq::5byZ_x");
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertEquals("'lDrq::5byZ_x", timeSeries0.getRangeDescription());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        org.jfree.data.jdbc.JDBCXYDataset jDBCXYDataset0 = new org.jfree.data.jdbc.JDBCXYDataset(((java.sql.Connection)(null)));
        java.lang.Comparable comparable0 = jDBCXYDataset0.getSeriesKey(2965);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(comparable0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        timeSeries0.setDomainDescription(((java.lang.String)(null)));
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries(comparable0);
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        javax.swing.text.StyleConstants styleConstants0 = ((javax.swing.text.StyleConstants)(javax.swing.text.AttributeSet.ResolveAttribute));
        boolean boolean0 = timeSeries0.equals(styleConstants0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        org.jfree.data.jdbc.JDBCXYDataset jDBCXYDataset0 = new org.jfree.data.jdbc.JDBCXYDataset(((java.sql.Connection)(null)));
        java.lang.Comparable comparable0 = jDBCXYDataset0.getSeriesKey(2965);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(comparable0);
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries(comparable0);
        timeSeries1.setMaximumItemAge(2971L);
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertEquals(2971L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        timeSeries0.delete(((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.delete(((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        timeSeries0.clear();
        org.junit.Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.clear();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        timeSeries0.removeAgedItems(4525L, false);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.removeAgedItems((-2495L), false);
        timeSeries0.removeAgedItems(4525L, false);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), 0.0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.update(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(59)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
        timeSeries1.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries1);
        org.junit.Assert.assertEquals(1, timeSeries1.getItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        timeSeries0.getTimePeriods();
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        timeSeries0.getDataItem(((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.getDataItem(((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.setMaximumItemCount(0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(null)));
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(0, 3910);
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        timeSeries1.addAndOrUpdate(timeSeries0);
        timeSeries1.getValue(((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        org.jfree.data.jdbc.JDBCXYDataset jDBCXYDataset0 = new org.jfree.data.jdbc.JDBCXYDataset(((java.sql.Connection)(null)));
        java.lang.Comparable comparable0 = jDBCXYDataset0.getSeriesKey(2965);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(comparable0);
        try {
            timeSeries0.getNextTimePeriod();
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.getItems();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), 0.0);
        timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(second0)), ((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        org.jfree.data.jdbc.JDBCXYDataset jDBCXYDataset0 = new org.jfree.data.jdbc.JDBCXYDataset(((java.sql.Connection)(null)));
        java.lang.Comparable comparable0 = jDBCXYDataset0.getSeriesKey(2965);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(comparable0);
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries(comparable0);
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
    }
}

