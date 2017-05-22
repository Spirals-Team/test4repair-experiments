package org.jfree.data.time;


public class TimeSeries_ESTest extends org.jfree.data.time.TimeSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{Zz&" , "" , ((java.lang.Class)(class0)));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(")O.N$AM3{B2{Zz&", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.setDomainDescription("Fri Feb 14 20:21:21 GMT 2014");
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals("Fri Feb 14 20:21:21 GMT 2014", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.Hour hour1 = ((org.jfree.data.time.Hour)(hour0.next()));
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour1)));
        org.jfree.data.time.TimeSeries timeSeries1 = timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(hour0)), ((org.jfree.data.time.RegularTimePeriod)(hour1)));
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(2618L);
        java.lang.Class<org.jfree.data.time.Week> class0 = org.jfree.data.time.Week.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , ((java.lang.String)(null)) , "" , ((java.lang.Class)(class0)));
        timeSeries0.setDomainDescription(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{ZzP#&" , ")O.N$AM3{B2{ZzP#&" , ((java.lang.Class)(class0)));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.update(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(59)));
        java.lang.Integer integer0 = ((java.lang.Integer)(timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(second0)))));
        org.junit.Assert.assertEquals(")O.N$AM3{B2{ZzP#&", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(")O.N$AM3{B2{ZzP#&", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertNotNull(integer0);
        org.junit.Assert.assertEquals(59, ((int)(integer0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{Zz&" , "" , ((java.lang.Class)(class0)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("", string0);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(")O.N$AM3{B2{Zz&", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{Zz&" , "iBgT@QD" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.getNextTimePeriod();
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{ZzP#&" , "" , ((java.lang.Class)(class0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        timeSeries0.setMaximumItemCount(0);
        int int0 = timeSeries0.getMaximumItemCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{Zz&" , "" , ((java.lang.Class)(class0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        timeSeries0.setMaximumItemCount(0);
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(second0)), ((org.jfree.data.time.RegularTimePeriod)(week0)));
        org.junit.Assert.assertEquals(")O.N$AM3{B2{Zz&", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{ZzP#&" , ")O.N$AM3{B2{ZzP#&" , ((java.lang.Class)(class0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.createCopy(3561, 3561);
        org.junit.Assert.assertEquals(")O.N$AM3{B2{ZzP#&", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{Zz&" , "" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((double)(0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{ZzP#&" , ")O.N$AM3{B2{ZzP#&" , ((java.lang.Class)(class0)));
        try {
            timeSeries0.update((-351), ((java.lang.Number)(5)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week(0 , 0);
        java.lang.Class<org.jfree.data.time.TimeSeries> class0 = org.jfree.data.time.TimeSeries.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(week0)) , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getTimePeriod((-2887));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        org.jfree.data.statistics.DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
        java.util.List list0 = defaultStatisticalCategoryDataset0.getRowKeys();
        timeSeries0.data = list0;
        timeSeries0.data = null;
        try {
            timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), 0.0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.removeAgedItems(true);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{ZzP#&" , "" , ((java.lang.Class)(class0)));
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{Zz&" , "" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(59)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        try {
            timeSeries0.getDataItem((-281));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(hour0)), ((double)(0)));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        timeSeries0.setDomainDescription(((java.lang.String)(null)));
        timeSeries0.hashCode();
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{Zz&" , ")O.N$AM3{B2{Zz&" , ((java.lang.Class)(class0)));
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        boolean boolean0 = timeSeries0.equals(minute0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(")O.N$AM3{B2{Zz&", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(")O.N$AM3{B2{Zz&", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{ZzP#&" , ")O.N$AM3{B2{ZzP#&" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        timeSeries0.createCopy(((org.jfree.data.time.RegularTimePeriod)(second0)), ((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{Zz&" , ")O.N$AM3{B2{Zz&" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.delete(((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{Zz&" , "" , ((java.lang.Class)(class0)));
        timeSeries0.delete(((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(")O.N$AM3{B2{Zz&", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(hour0)), ((double)(0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.clear();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(hour0)), (-1423.8252));
        timeSeries0.removeAgedItems(((long)(0)), false);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.removeAgedItems(1935897198L, false);
        timeSeries0.removeAgedItems(((long)(0)), false);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{ZzP#&" , ")O.N$AM3{B2{ZzP#&" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        timeSeries0.getValue(((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test75() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{Zz&" , "XX{5" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        timeSeries0.getDataItem(((org.jfree.data.time.RegularTimePeriod)(second0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test78() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        java.lang.Class<java.awt.Frame> class0 = java.awt.Frame.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , ((java.lang.Class)(class0)));
        timeSeries0.setMaximumItemAge(java.lang.Integer.MAX_VALUE);
        org.junit.Assert.assertEquals(2147483647L, timeSeries0.getMaximumItemAge());
    }

    @org.junit.Test(timeout = 4000)
    public void test79() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{Zz&" , "" , ((java.lang.Class)(class0)));
        timeSeries0.addOrUpdate(((org.jfree.data.time.RegularTimePeriod)(second0)), ((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.setMaximumItemCount(0);
        org.junit.Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test81() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.setMaximumItemCount(23);
        org.junit.Assert.assertEquals(23, timeSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test82() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        org.junit.Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        java.lang.String string0 = timeSeries0.getRangeDescription();
        org.junit.Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("Value", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test88() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(day0)));
        timeSeries0.add(((org.jfree.data.time.RegularTimePeriod)(day0)), 0.0);
        org.junit.Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test90() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        java.lang.Class<java.awt.Label> class0 = java.awt.Label.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(second0)) , ")O.N$AM3{B2{Zz&" , ")O.N$AM3{B2{Zz&" , ((java.lang.Class)(class0)));
        try {
            timeSeries0.getNextTimePeriod();
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test91() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-3594L));
        java.lang.Class<java.lang.Object> class0 = java.lang.Object.class;
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(fixedMillisecond0)) , "" , "Null 'array' argument." , ((java.lang.Class)(class0)));
        java.lang.Class class1 = timeSeries0.getTimePeriodClass();
        org.junit.Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals("Null 'array' argument.", timeSeries0.getRangeDescription());
        org.junit.Assert.assertNotNull(class1);
        org.junit.Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        org.junit.Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @org.junit.Test(timeout = 4000)
    public void test97() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.time.TimeSeries timeSeries0 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)(hour0)));
        timeSeries0.setDomainDescription("Fri Feb 14 20:21:21 GMT 2014");
        timeSeries0.getDomainDescription();
        org.junit.Assert.assertEquals("Fri Feb 14 20:21:21 GMT 2014", timeSeries0.getDomainDescription());
    }
}

