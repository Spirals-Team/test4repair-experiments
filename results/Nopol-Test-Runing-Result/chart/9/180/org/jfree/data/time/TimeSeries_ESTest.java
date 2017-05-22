package org.jfree.data.time;


public class TimeSeries_ESTest extends org.jfree.data.time.TimeSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "[" , "[" , ((java.lang.Class)(class0)));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals("[", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("[", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "[" , "[" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)));
        org.junit.Assert.assertTrue(timeSeries1.equals(((java.lang.Object)(timeSeries0))));
        timeSeries1.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(4)));
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertFalse(timeSeries1.equals(((java.lang.Object)(timeSeries0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((org.jfree.data.time.RegularTimePeriod)(quarter0)));
        org.junit.Assert.assertEquals("", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries1.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(3, 1252);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals("", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.Day day1 = ((org.jfree.data.time.Day)(day0.next()));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day1)), ((java.lang.Number)(0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(1)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(day1)), ((java.lang.Number)(null)));
        org.junit.Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        timeSeries0.setMaximumItemAge(1021L);
        org.junit.Assert.assertEquals(1021L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)));
        timeSeries0.setMaximumItemCount(4);
        org.junit.Assert.assertEquals(4, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        boolean boolean0 = timeSeries0.equals(timeSeries0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), (-138.58944));
        org.junit.Assert.assertNull(timeSeriesDataItem0);
        java.lang.Double double0 = ((java.lang.Double)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)))));
        org.junit.Assert.assertEquals((-138.58944), ((double)(double0)), 0.01);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertNotNull(double0);
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "90oK0Ru0%*^4" , "90oK0Ru0%*^4" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), 0.0);
        org.junit.Assert.assertNull(timeSeriesDataItem0);
        java.lang.Double double0 = ((java.lang.Double)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)))));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertNotNull(double0);
        org.junit.Assert.assertEquals("90oK0Ru0%*^4", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("90oK0Ru0%*^4", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(1886610481)));
        org.junit.Assert.assertNull(timeSeriesDataItem0);
        java.lang.Integer integer0 = ((java.lang.Integer)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)))));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertNotNull(integer0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(1886610481)));
        org.junit.Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.getValue(0);
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        org.jfree.data.jdbc.JDBCXYDataset jDBCXYDataset0 = new org.jfree.data.jdbc.JDBCXYDataset(((java.sql.Connection)(null)));
        java.lang.Comparable comparable0 = jDBCXYDataset0.getSeriesKey(72);
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(comparable0);
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", string0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(1002)));
        org.junit.Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.getItemCount();
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "[" , "[" , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getDomainDescription();
        org.junit.Assert.assertEquals("[", string0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("[", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(0)));
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        java.lang.Class<java.awt.ScrollPane> class0 = java.awt.ScrollPane.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)) , ((java.lang.Class)(class0)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.createCopy(3430, 3430);
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "90oK0Ru0%*^4" , "90oK0Ru0%*^4" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((double)(1021L)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), (-138.58944));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.lang.Class<java.awt.Choice> class0 = java.awt.Choice.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)) , ((java.lang.Class)(class0)));
        try {
            timeSeries0.delete((-1147), 3);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        java.lang.Class<java.awt.ScrollPane> class0 = java.awt.ScrollPane.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(millisecond0)) , ((java.lang.Class)(class0)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(0L);
        java.lang.Class<java.awt.TextComponent> class0 = java.awt.TextComponent.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , ((java.lang.Class)(class0)));
        timeSeries0.getIndex(fixedMillisecond0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(quarter0)));
        int int0 = timeSeries0.getMaximumItemCount();
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        long long0 = timeSeries0.getMaximumItemAge();
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, long0);
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getTimePeriod((-3122));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getDomainDescription();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", string0);
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        timeSeries0.getItemCount();
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(1002)));
        org.junit.Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)));
        org.junit.Assert.assertTrue(timeSeries1.equals(((java.lang.Object)(timeSeries0))));
        timeSeries1.setDomainDescription(((java.lang.String)(null)));
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertFalse(timeSeries1.equals(((java.lang.Object)(timeSeries0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        boolean boolean0 = timeSeries0.equals(day0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(1002)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)));
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.Day day1 = ((org.jfree.data.time.Day)(day0.next()));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day1)), ((java.lang.Number)(0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(day0)), ((org.jfree.data.time.RegularTimePeriod)(day0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(0, timeSeries1.getItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(1886610481)));
        timeSeries0.delete(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)));
        org.junit.Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)));
        timeSeries0.removeAgedItems((-86L), false);
        timeSeries0.removeAgedItems(((long)(10)), true);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.Day day1 = ((org.jfree.data.time.Day)(day0.next()));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day1)), ((java.lang.Number)(0)));
        timeSeries0.setMaximumItemAge(0);
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((double)(0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.Day day1 = ((org.jfree.data.time.Day)(day0.next()));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day1)), ((java.lang.Number)(0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(1)));
        timeSeries0.setMaximumItemAge(0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(0)));
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        timeSeries0.update(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(16)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(0)));
        org.jfree.data.time.Day day1 = ((org.jfree.data.time.Day)(timeSeries0.getNextTimePeriod()));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day1)), ((double)(0)));
        org.junit.Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        org.jfree.data.jdbc.JDBCXYDataset jDBCXYDataset0 = new org.jfree.data.jdbc.JDBCXYDataset(((java.sql.Connection)(null)));
        java.lang.Comparable comparable0 = jDBCXYDataset0.getSeriesKey(72);
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(comparable0)) , "Null 'locale' argument." , "Null 'locale' argument." , ((java.lang.Class)(class0)));
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(week0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Null 'locale' argument.", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Null 'locale' argument.", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(3)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)));
        timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(1886610481)));
        org.junit.Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(1002)));
        org.junit.Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.getTimePeriods();
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        timeSeries0.getDataItem(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(0L);
        java.lang.Class<java.awt.TextComponent> class0 = java.awt.TextComponent.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , ((java.lang.Class)(class0)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)));
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(month0)));
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(month0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        org.jfree.data.jdbc.JDBCXYDataset jDBCXYDataset0 = new org.jfree.data.jdbc.JDBCXYDataset(((java.sql.Connection)(null)));
        java.lang.Comparable comparable0 = jDBCXYDataset0.getSeriesKey(72);
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(comparable0)) , "Null 'locale' argument." , "Null 'locale' argument." , ((java.lang.Class)(class0)));
        timeSeries0.setRangeDescription("Null 'locale' argument.");
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Null 'locale' argument.", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Null 'locale' argument.", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = ((org.jfree.data.time.TimeSeries)(timeSeries0.clone()));
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals("", timeSeries1.getRangeDescription());
        org.junit.Assert.assertNotSame(timeSeries1, timeSeries0);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(1002)));
        org.junit.Assert.assertNull(timeSeriesDataItem0);
        java.lang.Integer integer0 = ((java.lang.Integer)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)))));
        org.junit.Assert.assertNotNull(integer0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        try {
            timeSeries0.getNextTimePeriod();
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        timeSeries0.getTimePeriodClass();
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        timeSeries0.getItems();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), (-138.58944));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        java.lang.Double double0 = ((java.lang.Double)(timeSeries0.getValue(0)));
        org.junit.Assert.assertEquals((-138.58944), ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(1002)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)));
        timeSeries1.addAndOrUpdate(timeSeries0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)));
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals("", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }
}

