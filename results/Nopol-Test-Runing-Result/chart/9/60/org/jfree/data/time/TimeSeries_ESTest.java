package org.jfree.data.time;


public class TimeSeries_ESTest extends org.jfree.data.time.TimeSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        java.lang.Class<java.lang.String> class0 = java.lang.String.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(16)) , ((java.lang.Class)(class0)));
        timeSeries0.setRangeDescription("The 'row' agument is out of bound.");
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals("The 'row' agument is out of bound.", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        java.lang.Class<java.lang.String> class0 = java.lang.String.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(16)) , ((java.lang.Class)(class0)));
        timeSeries0.setDomainDescription("The 'row' agument is out of bound.");
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals("The 'row' agument is out of bound.", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , (-16.5654672));
        org.jfree.data.time.TimeSeries timeSeries1 = ((org.jfree.data.time.TimeSeries)(timeSeries0.clone()));
        org.junit.Assert.assertTrue(timeSeries1.equals(((java.lang.Object)(timeSeries0))));
        timeSeries0.add(timeSeriesDataItem0, false);
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.TimeSeries timeSeries1 = ((org.jfree.data.time.TimeSeries)(timeSeries0.clone()));
        org.jfree.data.time.TimeSeries timeSeries2 = timeSeries0.addAndOrUpdate(timeSeries1);
        org.junit.Assert.assertNotSame(timeSeries2, timeSeries1);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries2.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries2.getDomainDescription());
        org.junit.Assert.assertNotSame(timeSeries2, timeSeries0);
        org.junit.Assert.assertEquals("Value", timeSeries2.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries2.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        java.lang.Class<org.jfree.data.time.Year> class0 = org.jfree.data.time.Year.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)) , "l;352~QauQcj9<" , "" , ((java.lang.Class)(class0)));
        timeSeries0.setMaximumItemAge(23);
        org.junit.Assert.assertEquals(23L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.lang.Object> class0 = java.lang.Object.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , "" , "" , ((java.lang.Class)(class0)));
        timeSeries0.setRangeDescription("");
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        java.lang.Class<org.jfree.data.time.Year> class0 = org.jfree.data.time.Year.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)) , "l;352~QauQcj9<" , "" , ((java.lang.Class)(class0)));
        timeSeries0.setDomainDescription("?");
        org.junit.Assert.assertEquals("?", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(1835955314)), false);
        timeSeries0.update(0, ((java.lang.Number)(1649693251)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        boolean boolean0 = timeSeries0.equals(timeSeries0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , 0.0);
        timeSeries0.add(timeSeriesDataItem0, false);
        java.lang.Double double0 = ((java.lang.Double)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(day0)))));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertNotNull(double0);
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , (-16.5654672));
        timeSeriesDataItem0.setValue(8);
        timeSeries0.add(timeSeriesDataItem0, false);
        java.lang.Integer integer0 = ((java.lang.Integer)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(day0)))));
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertNotNull(integer0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        java.lang.Class<java.lang.String> class0 = java.lang.String.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(16)) , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", string0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), 3112.37906);
        timeSeries0.getNextTimePeriod();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.lang.Object> class0 = java.lang.Object.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , "" , "" , ((java.lang.Class)(class0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0);
        timeSeries0.getMaximumItemAge();
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), 3112.37906);
        timeSeries0.getIndex(day0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(minute0)), ((org.jfree.data.time.RegularTimePeriod)(minute0)));
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.lang.Object> class0 = java.lang.Object.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , "" , "" , ((java.lang.Class)(class0)));
        timeSeries0.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(59, 1970);
        org.junit.Assert.assertNotSame(timeSeries1, timeSeries0);
        org.junit.Assert.assertEquals("", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries1.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        java.lang.Class<org.jfree.data.time.Year> class0 = org.jfree.data.time.Year.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)) , "l;352~QauQcj9<" , "" , ((java.lang.Class)(class0)));
        try {
            timeSeries0.update((-3227), ((java.lang.Number)(23)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        java.lang.Class<java.lang.String> class0 = java.lang.String.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(36)) , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getValue((-1));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)));
        try {
            timeSeries0.getDataItem((-1174));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.TimeSeries timeSeries1 = ((org.jfree.data.time.TimeSeries)(timeSeries0.clone()));
        timeSeries1.data = null;
        try {
            timeSeries1.equals(timeSeries0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test036() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<org.jfree.data.time.Quarter> class0 = org.jfree.data.time.Quarter.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ((java.lang.Class)(class0)));
        try {
            timeSeries0.delete((-2431), 59);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(minute0)), ((java.lang.Number)(59)));
        timeSeries0.createCopy(0, 0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.removeAgedItems(false);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.getIndex(day0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.getTimePeriodClass();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        java.lang.Class<java.lang.String> class0 = java.lang.String.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(36)) , ((java.lang.Class)(class0)));
        int int0 = timeSeries0.getMaximumItemCount();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.lang.Object> class0 = java.lang.Object.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , "" , "" , ((java.lang.Class)(class0)));
        long long0 = timeSeries0.getMaximumItemAge();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, long0);
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        java.lang.Class<org.jfree.data.time.Year> class0 = org.jfree.data.time.Year.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)) , "l;352~QauQcj9<" , "" , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals("", string0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("l;352~QauQcj9<", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        java.lang.String string0 = timeSeries0.getDomainDescription();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        java.lang.Class<java.lang.String> class0 = java.lang.String.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(16)) , ((java.lang.Class)(class0)));
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        timeSeries0.setRangeDescription(((java.lang.String)(null)));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        java.lang.Class<java.lang.String> class0 = java.lang.String.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(16)) , ((java.lang.Class)(class0)));
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        timeSeries0.setDomainDescription(((java.lang.String)(null)));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , (-16.5654672));
        org.jfree.data.time.TimeSeries timeSeries1 = ((org.jfree.data.time.TimeSeries)(timeSeries0.clone()));
        org.junit.Assert.assertTrue(timeSeries1.equals(((java.lang.Object)(timeSeries0))));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem1 = ((org.jfree.data.time.TimeSeriesDataItem)(timeSeriesDataItem0.clone()));
        timeSeries0.add(timeSeriesDataItem0, false);
        timeSeriesDataItem1.setValue(3);
        timeSeries1.add(timeSeriesDataItem1, true);
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , (-16.5654672));
        org.jfree.data.time.TimeSeries timeSeries1 = ((org.jfree.data.time.TimeSeries)(timeSeries0.clone()));
        timeSeries0.add(timeSeriesDataItem0, false);
        org.junit.Assert.assertNotSame(timeSeries0, timeSeries1);
        org.junit.Assert.assertFalse(timeSeries0.equals(((java.lang.Object)(timeSeries1))));
        timeSeries1.add(timeSeriesDataItem0, true);
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertTrue(timeSeries0.equals(((java.lang.Object)(timeSeries1))));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.TimeSeries timeSeries1 = ((org.jfree.data.time.TimeSeries)(timeSeries0.clone()));
        timeSeries1.setMaximumItemCount(1942);
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertEquals(1942, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.TimeSeries timeSeries1 = ((org.jfree.data.time.TimeSeries)(timeSeries0.clone()));
        timeSeries1.setDomainDescription("");
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertEquals("", timeSeries1.getDomainDescription());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.TimeSeries timeSeries1 = ((org.jfree.data.time.TimeSeries)(timeSeries0.clone()));
        org.junit.Assert.assertTrue(timeSeries1.equals(((java.lang.Object)(timeSeries0))));
        timeSeries1.add(((org.jfree.data.time.RegularTimePeriod)(day0)), 0.0, false);
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(timeSeries1.equals(((java.lang.Object)(timeSeries0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        java.lang.Class<org.jfree.data.time.Year> class0 = org.jfree.data.time.Year.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)) , "l;352~QauQcj9<" , "" , ((java.lang.Class)(class0)));
        timeSeries0.delete(((org.jfree.data.time.RegularTimePeriod)(hour0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("l;352~QauQcj9<", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("l;352~QauQcj9<")));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(hour0)), 0.0);
        timeSeries0.clear();
        org.junit.Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.lang.Object> class0 = java.lang.Object.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , "" , "" , ((java.lang.Class)(class0)));
        timeSeries0.clear();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , (-16.5654672));
        timeSeries0.add(timeSeriesDataItem0, false);
        timeSeries0.removeAgedItems(0L, false);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(minute0)), ((java.lang.Number)(59)));
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , (-16.5654672));
        org.jfree.data.time.TimeSeries timeSeries1 = ((org.jfree.data.time.TimeSeries)(timeSeries0.clone()));
        timeSeries0.add(timeSeriesDataItem0, false);
        timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , (-16.5654672));
        timeSeries0.add(timeSeriesDataItem0, false);
        timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , (-16.5654672));
        timeSeries0.add(timeSeriesDataItem0, false);
        timeSeries0.getDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.lang.Object> class0 = java.lang.Object.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , "" , "" , ((java.lang.Class)(class0)));
        timeSeries0.getDataItem(((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.lang.Object> class0 = java.lang.Object.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , "" , "" , ((java.lang.Class)(class0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0);
        timeSeries0.createCopy(59, 1970);
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(minute0)), (-215.7080395993));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.setMaximumItemCount(0);
        org.junit.Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)));
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)));
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), 3112.37906);
        timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(day0)), ((org.jfree.data.time.RegularTimePeriod)(day0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        java.lang.Double double0 = ((java.lang.Double)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(day0)))));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(double0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , (-16.5654672));
        timeSeries0.add(timeSeriesDataItem0, false);
        timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(day0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.lang.Object> class0 = java.lang.Object.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , "" , "" , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getNextTimePeriod();
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(minute0)));
        timeSeries0.getItems();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("l;352~QauQcj9<")));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(hour0)), 0.0);
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(hour0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(day0)) , (-16.5654672));
        timeSeries0.add(timeSeriesDataItem0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }
}

