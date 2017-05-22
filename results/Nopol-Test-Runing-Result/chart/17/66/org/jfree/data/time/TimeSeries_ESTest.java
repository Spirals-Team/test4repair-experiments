package org.jfree.data.time;


public class TimeSeries_ESTest extends org.jfree.data.time.TimeSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        java.lang.Class<java.awt.Choice> class0 = java.awt.Choice.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("cut-to-clipboard")) , ((java.lang.Class)(class0)));
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second((-386) , minute0);
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(second0)), ((org.jfree.data.time.RegularTimePeriod)(minute0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        java.lang.Class<java.awt.Choice> class0 = java.awt.Choice.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("cut-to-clipboard")) , ((java.lang.Class)(class0)));
        timeSeries0.setMaximumItemCount(2099);
        org.junit.Assert.assertEquals(2099, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        java.lang.Class<java.awt.Choice> class0 = java.awt.Choice.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("cut-to-clipboard")) , ((java.lang.Class)(class0)));
        boolean boolean0 = timeSeries0.equals(timeSeries0);
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), 159.975958);
        java.lang.Double double0 = ((java.lang.Double)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(week0)))));
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(159.975958, ((double)(double0)), 0.01);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertNotNull(double0);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        java.lang.Class<java.lang.Integer> class0 = java.lang.Integer.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("cut-to-clipboard")) , "cut-to-clipboard" , "You are attempting to add an observation for " , ((java.lang.Class)(class0)));
        org.jfree.data.time.SpreadsheetDate spreadsheetDate0 = new org.jfree.data.time.SpreadsheetDate(32);
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day(((org.jfree.data.time.SerialDate)(spreadsheetDate0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(day0)), ((java.lang.Number)(2)));
        timeSeries0.getValue(0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("cut-to-clipboard", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("You are attempting to add an observation for ", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((double)(53)));
        timeSeries0.getItemCount();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        java.lang.Class<java.awt.Choice> class0 = java.awt.Choice.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("cut-to-clipboard")) , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getDomainDescription();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        java.lang.Class<java.awt.Choice> class0 = java.awt.Choice.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("cut-to-clipboard")) , ((java.lang.Class)(class0)));
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(((java.util.Date)(null)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(12)));
        timeSeries0.clone();
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        java.lang.Class<java.awt.Choice> class0 = java.awt.Choice.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("orientation")) , ((java.lang.Class)(class0)));
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(((java.util.Date)(null)));
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection(timeSeries0 , fixedMillisecond0.DEFAULT_TIME_ZONE);
        java.util.List list0 = timeSeriesCollection0.getSeries();
        timeSeries0.data = list0;
        try {
            timeSeries0.update(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(null)));
            org.junit.Assert.fail("Expecting exception: ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        java.lang.Class<java.awt.Choice> class0 = java.awt.Choice.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("cut-to-clipboard")) , ((java.lang.Class)(class0)));
        try {
            timeSeries0.update((-3879), ((java.lang.Number)(0)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        java.lang.Class<java.awt.Choice> class0 = java.awt.Choice.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("cut-to-clipboard")) , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getValue((-748));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        java.lang.Class<java.awt.Choice> class0 = java.awt.Choice.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("orientation")) , ((java.lang.Class)(class0)));
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(((java.util.Date)(null)));
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection0 = new org.jfree.data.time.TimeSeriesCollection(timeSeries0 , fixedMillisecond0.DEFAULT_TIME_ZONE);
        java.util.List list0 = timeSeriesCollection0.getSeries();
        timeSeries0.data = list0;
        try {
            timeSeries0.getNextTimePeriod();
            org.junit.Assert.fail("Expecting exception: ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        java.lang.Class<java.awt.Choice> class0 = java.awt.Choice.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("cut-to-clipboard")) , ((java.lang.Class)(class0)));
        try {
            timeSeries0.delete((-1550), (-1550));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)));
        java.lang.Object[][] objectArray0 = new java.lang.Object[4][1];
        java.lang.Object[] objectArray1 = new java.lang.Object[3];
        javax.swing.table.DefaultTableModel defaultTableModel0 = new javax.swing.table.DefaultTableModel(objectArray0 , objectArray1);
        java.util.Vector vector0 = defaultTableModel0.getDataVector();
        timeSeries0.data = ((java.util.List)(vector0));
        try {
            timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)));
            org.junit.Assert.fail("Expecting exception: ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        java.lang.Class<java.awt.Choice> class0 = java.awt.Choice.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("cut-to-clipboard")) , ((java.lang.Class)(class0)));
        timeSeries0.getTimePeriodClass();
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        java.lang.Class<java.lang.Integer> class0 = java.lang.Integer.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("cut-to-clipboard")) , "cut-to-clipboard" , "You are attempting to add an observation for " , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("You are attempting to add an observation for ", string0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("cut-to-clipboard", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((double)(53)));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        java.lang.Class<java.awt.Choice> class0 = java.awt.Choice.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("cut-to-clipboard")) , ((java.lang.Class)(class0)));
        java.lang.Class<java.lang.Integer> class1 = java.lang.Integer.class;
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("cut-to-clipboard")) , "cut-to-clipboard" , "You are attempting to add an observation for " , ((java.lang.Class)(class1)));
        timeSeries1.setDescription("layeredContainerLayer");
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals("cut-to-clipboard", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals("You are attempting to add an observation for ", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((double)(53)));
        timeSeries0.delete(((org.jfree.data.time.RegularTimePeriod)(week0)));
        org.junit.Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        java.lang.Class<java.awt.Choice> class0 = java.awt.Choice.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("cut-to-clipboard")) , ((java.lang.Class)(class0)));
        org.jfree.data.time.SpreadsheetDate spreadsheetDate0 = new org.jfree.data.time.SpreadsheetDate(19);
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day(((org.jfree.data.time.SerialDate)(spreadsheetDate0)));
        timeSeries0.delete(((org.jfree.data.time.RegularTimePeriod)(day0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        java.lang.Class<java.awt.Choice> class0 = java.awt.Choice.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("orientation")) , ((java.lang.Class)(class0)));
        timeSeries0.clear();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)));
        timeSeries0.removeAgedItems((-2060L), true);
        timeSeries0.removeAgedItems((-606L), true);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((double)(53)));
        timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(week0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        java.lang.Class<java.awt.Choice> class0 = java.awt.Choice.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("cut-to-clipboard")) , ((java.lang.Class)(class0)));
        org.jfree.data.time.SpreadsheetDate spreadsheetDate0 = new org.jfree.data.time.SpreadsheetDate(19);
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day(((org.jfree.data.time.SerialDate)(spreadsheetDate0)));
        timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(day0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        java.lang.Class<java.awt.Choice> class0 = java.awt.Choice.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("orientation")) , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getNextTimePeriod();
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)));
        boolean boolean0 = timeSeries0.equals(timeSeries1);
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        java.lang.Class<java.awt.Choice> class0 = java.awt.Choice.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("cut-to-clipboard")) , ((java.lang.Class)(class0)));
        java.lang.Class<java.lang.Integer> class1 = java.lang.Integer.class;
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("cut-to-clipboard")) , "cut-to-clipboard" , "You are attempting to add an observation for " , ((java.lang.Class)(class1)));
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        org.junit.Assert.assertEquals("You are attempting to add an observation for ", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals("cut-to-clipboard", timeSeries1.getDomainDescription());
        org.junit.Assert.assertFalse(boolean0);
    }
}

