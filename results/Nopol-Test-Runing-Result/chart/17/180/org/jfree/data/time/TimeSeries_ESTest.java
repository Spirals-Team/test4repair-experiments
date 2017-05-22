package org.jfree.data.time;


public class TimeSeries_ESTest extends org.jfree.data.time.TimeSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(3)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(3, 3);
        org.junit.Assert.assertTrue(timeSeries1.equals(((java.lang.Object)(timeSeries0))));
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(minute0)) , ((double)(0)));
        timeSeries1.add(timeSeriesDataItem0, false);
        boolean boolean0 = timeSeries0.equals(timeSeries1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(3)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(3, 3);
        timeSeries0.setMaximumItemCount(3);
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertEquals(3, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        timeSeries1.setMaximumItemAge(0);
        boolean boolean0 = timeSeries0.equals(timeSeries1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.Hour hour1 = ((org.jfree.data.time.Hour)(hour0.previous()));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(hour1)), ((org.jfree.data.time.RegularTimePeriod)(hour0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(minute0)), ((java.lang.Number)(59)), true);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.data.time.SimpleTimePeriod simpleTimePeriod0 = new org.jfree.data.time.SimpleTimePeriod(53L , 53L);
        java.lang.Class<java.awt.Window> class0 = java.awt.Window.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleTimePeriod0)) , "" , "The 'item' index is out of bounds." , ((java.lang.Class)(class0)));
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((java.lang.Number)(0)));
        timeSeries0.update(0, ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals("The 'item' index is out of bounds.", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        boolean boolean0 = timeSeries0.equals(timeSeries0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.lang.Object> class0 = java.lang.Object.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "P\nSXX${z*{" , "P\nSXX${z*{" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)((byte)(29))));
        java.lang.Byte byte0 = ((java.lang.Byte)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)))));
        org.junit.Assert.assertEquals("P\nSXX${z*{", timeSeries0.getDomainDescription());
        org.junit.Assert.assertNotNull(byte0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("P\nSXX${z*{", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.data.time.SimpleTimePeriod simpleTimePeriod0 = new org.jfree.data.time.SimpleTimePeriod(63L , 63L);
        java.lang.Class<java.awt.Window> class0 = java.awt.Window.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleTimePeriod0)) , "" , "The 'item' index is out of bounds." , ((java.lang.Class)(class0)));
        timeSeries0.setMaximumItemCount(0);
        int int0 = timeSeries0.getMaximumItemCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getDomainDescription();
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", string0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(12)) , ((java.lang.Class)(class0)));
        timeSeries0.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(12, 12);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertNotSame(timeSeries1, timeSeries0);
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0);
        timeSeries0.createCopy(0, 0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(minute0)) , 0.0);
        timeSeries0.add(timeSeriesDataItem0, false);
        timeSeries0.createCopy(0, 0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.jfree.data.time.SimpleTimePeriod simpleTimePeriod0 = new org.jfree.data.time.SimpleTimePeriod(53L , 53L);
        java.lang.Class<java.awt.Window> class0 = java.awt.Window.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleTimePeriod0)) , "" , "The 'item' index is out of bounds." , ((java.lang.Class)(class0)));
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((java.lang.Number)(0)));
        timeSeries0.clone();
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        java.lang.Class<java.lang.Integer> class0 = java.lang.Integer.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("Value")) , ((java.lang.Class)(class0)));
        timeSeries0.data = null;
        try {
            timeSeries0.getNextTimePeriod();
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(1886597737)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(1886597737, 1886597737);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list0 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        timeSeries1.data = list0;
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem0 = new org.jfree.data.statistics.BoxAndWhiskerItem(((java.lang.Number)((byte)(16))) , ((java.lang.Number)((byte)(5))) , ((java.lang.Number)(2)) , ((java.lang.Number)(11)) , ((java.lang.Number)(3)) , ((java.lang.Number)(8)) , ((java.lang.Number)((byte)(16))) , ((java.lang.Number)(1281450528)) , ((java.util.List)(list0)));
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem0, ((java.lang.Comparable)("The 'week' argument must be in the range 1 - 53.")), ((java.lang.Comparable)(hour0)));
        try {
            timeSeries1.getDataItem(((org.jfree.data.time.RegularTimePeriod)(hour0)));
            org.junit.Assert.fail("Expecting exception: ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        try {
            timeSeries0.delete((-4070), 0);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "P\nSXX${z*{" , ((java.lang.String)(null)) , ((java.lang.Class)(null)));
        try {
            timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(2)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(3)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(minute0)) , ((double)(0)));
        timeSeries0.add(timeSeriesDataItem0, true);
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(minute0)), ((double)(3)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        org.jfree.data.time.SimpleTimePeriod simpleTimePeriod0 = new org.jfree.data.time.SimpleTimePeriod(53L , 53L);
        java.lang.Class<java.awt.Window> class0 = java.awt.Window.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleTimePeriod0)) , "" , "The 'item' index is out of bounds." , ((java.lang.Class)(class0)));
        int int0 = timeSeries0.getMaximumItemCount();
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
        org.junit.Assert.assertEquals("The 'item' index is out of bounds.", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", string0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Container> class0 = java.awt.Container.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , ((java.lang.Class)(class0)));
        timeSeries0.getItemCount();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(minute0)) , 0.0);
        timeSeries0.add(timeSeriesDataItem0, false);
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
        timeSeries0.setMaximumItemCount(2907);
        boolean boolean0 = timeSeries0.equals(timeSeries1);
        org.junit.Assert.assertEquals(2907, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
        timeSeries0.setMaximumItemAge(1000L);
        boolean boolean0 = timeSeries0.equals(timeSeries1);
        org.junit.Assert.assertEquals(1000L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
        timeSeries0.setRangeDescription("Null 'categoryKeys' argument.");
        boolean boolean0 = timeSeries0.equals(timeSeries1);
        org.junit.Assert.assertEquals("Null 'categoryKeys' argument.", timeSeries0.getRangeDescription());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(1651208308)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(1651208308, 1651208308);
        timeSeries1.setDomainDescription("iMFLpre##]?jEQ]$aN");
        boolean boolean0 = timeSeries0.equals(timeSeries1);
        org.junit.Assert.assertEquals("iMFLpre##]?jEQ]$aN", timeSeries1.getDomainDescription());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
        org.junit.Assert.assertTrue(timeSeries1.equals(((java.lang.Object)(timeSeries0))));
        timeSeries0.setDescription("The 'week' argument must be in the range 1 - 53.");
        boolean boolean0 = timeSeries0.equals(timeSeries1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(timeSeries1.equals(((java.lang.Object)(timeSeries0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        org.jfree.data.time.SimpleTimePeriod simpleTimePeriod0 = new org.jfree.data.time.SimpleTimePeriod(63L , 63L);
        java.lang.Class<java.awt.Window> class0 = java.awt.Window.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleTimePeriod0)) , "" , "" , ((java.lang.Class)(class0)));
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((java.lang.Number)(0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((org.jfree.data.time.RegularTimePeriod)(millisecond0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals(0, timeSeries1.getItemCount());
        org.junit.Assert.assertEquals("", timeSeries1.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        org.jfree.data.time.SimpleTimePeriod simpleTimePeriod0 = new org.jfree.data.time.SimpleTimePeriod(63L , 63L);
        java.lang.Class<java.awt.Window> class0 = java.awt.Window.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleTimePeriod0)) , "" , "The 'item' index is out of bounds." , ((java.lang.Class)(class0)));
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((java.lang.Number)(0)));
        timeSeries0.clear();
        org.junit.Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        timeSeries0.clear();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        timeSeries0.removeAgedItems(((long)(0)), true);
        timeSeries0.removeAgedItems((-3405L), false);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        org.jfree.data.time.SimpleTimePeriod simpleTimePeriod0 = new org.jfree.data.time.SimpleTimePeriod(63L , 63L);
        java.lang.Class<java.awt.Window> class0 = java.awt.Window.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleTimePeriod0)) , "" , "The 'item' index is out of bounds." , ((java.lang.Class)(class0)));
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        org.jfree.data.time.SimpleTimePeriod simpleTimePeriod0 = new org.jfree.data.time.SimpleTimePeriod(63L , 63L);
        java.lang.Class<java.awt.Window> class0 = java.awt.Window.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleTimePeriod0)) , "" , "The 'item' index is out of bounds." , ((java.lang.Class)(class0)));
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.update(((org.jfree.data.time.RegularTimePeriod)(millisecond0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.createCopy(0, 0);
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(minute0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(minute0)) , ((double)(0)));
        timeSeries0.add(timeSeriesDataItem0);
        timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(minute0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        org.jfree.data.time.SimpleTimePeriod simpleTimePeriod0 = new org.jfree.data.time.SimpleTimePeriod(63L , 63L);
        java.lang.Class<java.awt.Window> class0 = java.awt.Window.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(simpleTimePeriod0)) , "" , "The 'item' index is out of bounds." , ((java.lang.Class)(class0)));
        timeSeries0.getTimePeriodClass();
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("The 'item' index is out of bounds.", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.lang.Object> class0 = java.lang.Object.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "P\nSXX${z*{" , "P\nSXX${z*{" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((double)(-108L)));
        timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Minute> class0 = org.jfree.data.time.Minute.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(0)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
        boolean boolean0 = timeSeries0.equals(timeSeries1);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertNotSame(timeSeries1, timeSeries0);
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
    }
}

