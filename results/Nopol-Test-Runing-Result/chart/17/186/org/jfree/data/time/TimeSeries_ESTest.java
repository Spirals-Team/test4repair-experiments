package org.jfree.data.time;


public class TimeSeries_ESTest extends org.jfree.data.time.TimeSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Dialog> class0 = java.awt.Dialog.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "Dg4i(3'AC49NZe|W4{" , "Dg4i(3'AC49NZe|W4{" , ((java.lang.Class)(class0)));
        java.lang.Integer integer0 = javax.swing.JLayeredPane.DRAG_LAYER;
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(integer0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)));
        boolean boolean0 = timeSeries0.equals(timeSeries1);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week((-7) , (-7));
        java.lang.Class<java.awt.Checkbox> class0 = java.awt.Checkbox.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(1);
        org.junit.Assert.assertEquals(1L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("AcceleratorKey")));
        timeSeries0.setMaximumItemCount(2100);
        org.junit.Assert.assertEquals(2100, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Month> class0 = org.jfree.data.time.Month.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(" for that time period. Duplicates are not ")) , " for that time period. Duplicates are not " , " for that time period. Duplicates are not " , ((java.lang.Class)(class0)));
        timeSeries0.setRangeDescription("");
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Month> class0 = org.jfree.data.time.Month.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(" for that time period. Duplicates are not ")) , " for that time period. Duplicates are not " , " for that time period. Duplicates are not " , ((java.lang.Class)(class0)));
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((double)(0)));
        java.lang.Double double0 = ((java.lang.Double)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(second0)))));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertNotNull(double0);
        org.junit.Assert.assertEquals(" for that time period. Duplicates are not ", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(" for that time period. Duplicates are not ", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week((-7) , (-7));
        java.lang.Class<java.awt.Checkbox> class0 = java.awt.Checkbox.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        timeSeries0.getNextTimePeriod();
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Month> class0 = org.jfree.data.time.Month.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(" for that time period. Duplicates are not ")) , " for that time period. Duplicates are not " , " for that time period. Duplicates are not " , ((java.lang.Class)(class0)));
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(null)));
        timeSeries0.getItemCount();
        org.junit.Assert.assertEquals(" for that time period. Duplicates are not ", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(" for that time period. Duplicates are not ", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Month> class0 = org.jfree.data.time.Month.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(" for that time period. Duplicates are not ")) , " for that time period. Duplicates are not " , " for that time period. Duplicates are not " , ((java.lang.Class)(class0)));
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((double)(0)));
        timeSeries0.getIndex(second0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(" for that time period. Duplicates are not ", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(" for that time period. Duplicates are not ", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week((-7) , (-7));
        java.lang.Class<java.awt.Checkbox> class0 = java.awt.Checkbox.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        timeSeries0.setDomainDescription(((java.lang.String)(null)));
        java.lang.String string0 = timeSeries0.getDomainDescription();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertNull(string0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week((-7) , (-7));
        java.lang.Class<java.awt.Checkbox> class0 = java.awt.Checkbox.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.setDomainDescription("");
        timeSeries0.getDomainDescription();
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week((-7) , (-7));
        java.lang.Class<java.awt.Checkbox> class0 = java.awt.Checkbox.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        timeSeries0.clone();
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Month> class0 = org.jfree.data.time.Month.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(" for that time period. Duplicates are not ")) , " for that time period. Duplicates are not " , " for that time period. Duplicates are not " , ((java.lang.Class)(class0)));
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(null)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), 1.0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week((-7) , (-7));
        java.lang.Class<java.awt.Checkbox> class0 = java.awt.Checkbox.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        try {
            timeSeries0.update((-7), ((java.lang.Number)(1)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(0.0 , 0.0);
        java.lang.Class<java.awt.Dialog> class0 = java.awt.Dialog.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(xYDataItem0)) , "Null 'minute' argument." , "Null 'minute' argument." , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getDataItem((-160));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(" for that time period. Duplicates are not ")) , " for that time period. Duplicates are not " , " for that time period. Duplicates are not " , ((java.lang.Class)(null)));
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        try {
            timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week((-7) , (-7));
        java.lang.Class<java.awt.Checkbox> class0 = java.awt.Checkbox.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.removeAgedItems(true);
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Month> class0 = org.jfree.data.time.Month.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(" for that time period. Duplicates are not ")) , " for that time period. Duplicates are not " , " for that time period. Duplicates are not " , ((java.lang.Class)(class0)));
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(null)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(null)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Month> class0 = org.jfree.data.time.Month.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(" for that time period. Duplicates are not ")) , " for that time period. Duplicates are not " , " for that time period. Duplicates are not " , ((java.lang.Class)(class0)));
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        timeSeries0.getIndex(second0);
        org.junit.Assert.assertEquals(" for that time period. Duplicates are not ", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(" for that time period. Duplicates are not ", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("aMy^|{af19Xpb")) , "Od+8}@n!(X*V" , "Od+8}@n!(X*V" , ((java.lang.Class)(class0)));
        long long0 = timeSeries0.getMaximumItemAge();
        org.junit.Assert.assertEquals(9223372036854775807L, long0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Od+8}@n!(X*V", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Od+8}@n!(X*V", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Checkbox> class0 = java.awt.Checkbox.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getTimePeriod((-734));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week((-7) , (-7));
        java.lang.Class<java.awt.Checkbox> class0 = java.awt.Checkbox.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getDomainDescription();
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", string0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week((-7) , (-7));
        java.lang.Class<java.awt.Checkbox> class0 = java.awt.Checkbox.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.getItemCount();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Dialog> class0 = java.awt.Dialog.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "Dg4i(3'AC49NZe|W4{" , "Dg4i(3'AC49NZe|W4{" , ((java.lang.Class)(class0)));
        java.lang.Integer integer0 = javax.swing.JLayeredPane.DRAG_LAYER;
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(integer0)));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Dg4i(3'AC49NZe|W4{", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Dg4i(3'AC49NZe|W4{", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week((-7) , (-7));
        java.lang.Class<java.awt.Checkbox> class0 = java.awt.Checkbox.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        timeSeries0.setDomainDescription(((java.lang.String)(null)));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Month> class0 = org.jfree.data.time.Month.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(" for that time period. Duplicates are not ")) , " for that time period. Duplicates are not " , " for that time period. Duplicates are not " , ((java.lang.Class)(class0)));
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        boolean boolean0 = timeSeries0.equals(second0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(" for that time period. Duplicates are not ", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(" for that time period. Duplicates are not ", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week((-1044) , (-1044));
        java.lang.Class<java.awt.Checkbox> class0 = java.awt.Checkbox.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(395, 722);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertNotSame(timeSeries1, timeSeries0);
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week((-1044) , (-1044));
        java.lang.Class<java.awt.Checkbox> class0 = java.awt.Checkbox.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        try {
            timeSeries0.delete((-1192), 809);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.Class<java.awt.Checkbox> class0 = java.awt.Checkbox.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(week0)), ((java.lang.Number)(1)));
        timeSeries0.delete(((org.jfree.data.time.RegularTimePeriod)(week0)));
        org.junit.Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week((-1044) , (-1044));
        java.lang.Class<java.awt.Checkbox> class0 = java.awt.Checkbox.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.delete(((org.jfree.data.time.RegularTimePeriod)(week0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Month> class0 = org.jfree.data.time.Month.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(" for that time period. Duplicates are not ")) , " for that time period. Duplicates are not " , " for that time period. Duplicates are not " , ((java.lang.Class)(class0)));
        timeSeries0.clear();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(" for that time period. Duplicates are not ", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(" for that time period. Duplicates are not ", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Month> class0 = org.jfree.data.time.Month.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(" for that time period. Duplicates are not ")) , " for that time period. Duplicates are not " , " for that time period. Duplicates are not " , ((java.lang.Class)(class0)));
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((double)(1)));
        timeSeries0.removeAgedItems(1842L, true);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Month> class0 = org.jfree.data.time.Month.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("")) , "" , "" , ((java.lang.Class)(class0)));
        timeSeries0.removeAgedItems((-349L), true);
        timeSeries0.removeAgedItems(((long)(-436)), true);
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Month> class0 = org.jfree.data.time.Month.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(" for that time period. Duplicates are not ")) , " for that time period. Duplicates are not " , " for that time period. Duplicates are not " , ((java.lang.Class)(class0)));
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(null)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.update(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(null)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Dialog> class0 = java.awt.Dialog.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "Dg4i(3'AC49NZe|W4{" , "Dg4i(3'AC49NZe|W4{" , ((java.lang.Class)(class0)));
        java.lang.Integer integer0 = javax.swing.JLayeredPane.DRAG_LAYER;
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(integer0)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)));
        timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        org.junit.Assert.assertEquals("Dg4i(3'AC49NZe|W4{", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Dialog> class0 = java.awt.Dialog.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "Dg4i(3'AC49NZe|W4{" , "Dg4i(3'AC49NZe|W4{" , ((java.lang.Class)(class0)));
        java.lang.Integer integer0 = javax.swing.JLayeredPane.DRAG_LAYER;
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)), ((java.lang.Number)(integer0)));
        timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Month> class0 = org.jfree.data.time.Month.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(" for that time period. Duplicates are not ")) , " for that time period. Duplicates are not " , " for that time period. Duplicates are not " , ((java.lang.Class)(class0)));
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(null)));
        timeSeries0.getTimePeriods();
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Month> class0 = org.jfree.data.time.Month.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(" for that time period. Duplicates are not ")) , " for that time period. Duplicates are not " , " for that time period. Duplicates are not " , ((java.lang.Class)(class0)));
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((double)(0)));
        timeSeries0.getDataItem(((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Month> class0 = org.jfree.data.time.Month.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(" for that time period. Duplicates are not ")) , " for that time period. Duplicates are not " , " for that time period. Duplicates are not " , ((java.lang.Class)(class0)));
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((double)(1)));
        timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        java.lang.Class<org.jfree.data.time.Month> class0 = org.jfree.data.time.Month.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(" for that time period. Duplicates are not ")) , " for that time period. Duplicates are not " , " for that time period. Duplicates are not " , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getNextTimePeriod();
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week((-7) , (-7));
        java.lang.Class<java.awt.Checkbox> class0 = java.awt.Checkbox.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        timeSeries0.getItems();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        java.lang.Class<java.awt.Button> class0 = java.awt.Button.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)("aMy^|{af19Xpb")) , "Od+8}@n!(X*V" , "Od+8}@n!(X*V" , ((java.lang.Class)(class0)));
        timeSeries0.setDomainDescription("q0WT~fdeH\"");
        org.junit.Assert.assertEquals("q0WT~fdeH\"", timeSeries0.getDomainDescription());
    }
}

