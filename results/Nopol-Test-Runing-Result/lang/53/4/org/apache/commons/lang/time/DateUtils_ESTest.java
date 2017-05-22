package org.apache.commons.lang.time;


public class DateUtils_ESTest extends org.apache.commons.lang.time.DateUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[3];
        stringArray0[0] = "";
        stringArray0[1] = "";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate("8')", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[7];
        stringArray0[0] = "";
        java.util.Date date0 = org.apache.commons.lang.time.DateUtils.parseDate("", stringArray0);
        java.util.Date date1 = org.apache.commons.lang.time.DateUtils.addWeeks(date0, (-1));
        boolean boolean0 = org.apache.commons.lang.time.DateUtils.isSameInstant(date1, date0);
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[6];
        stringArray0[0] = "";
        java.util.Date date0 = org.apache.commons.lang.time.DateUtils.parseDate("", stringArray0);
        java.util.Date date1 = org.apache.commons.lang.time.DateUtils.round(((java.lang.Object)(date0)), 1001);
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[7];
        stringArray0[0] = "";
        java.util.Date date0 = org.apache.commons.lang.time.DateUtils.parseDate("", stringArray0);
        java.util.Iterator iterator0 = org.apache.commons.lang.time.DateUtils.iterator(date0, 2);
        org.junit.Assert.assertNotNull(iterator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[7];
        stringArray0[0] = "";
        java.util.Date date0 = org.apache.commons.lang.time.DateUtils.parseDate("", stringArray0);
        boolean boolean0 = org.apache.commons.lang.time.DateUtils.isSameInstant(date0, date0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[7];
        stringArray0[0] = "";
        java.util.Date date0 = org.apache.commons.lang.time.DateUtils.parseDate("", stringArray0);
        java.util.Date date1 = org.apache.commons.lang.time.DateUtils.addHours(date0, 0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[7];
        stringArray0[0] = "";
        java.util.Date date0 = org.apache.commons.lang.time.DateUtils.parseDate("", stringArray0);
        java.util.Date date1 = org.apache.commons.lang.time.DateUtils.addSeconds(date0, 1);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[7];
        stringArray0[0] = "";
        java.util.Date date0 = org.apache.commons.lang.time.DateUtils.parseDate("", stringArray0);
        java.util.Date date1 = org.apache.commons.lang.time.DateUtils.addMonths(date0, 0);
        org.junit.Assert.assertNotSame(date0, date1);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[7];
        stringArray0[0] = "";
        java.util.Date date0 = org.apache.commons.lang.time.DateUtils.parseDate("", stringArray0);
        java.util.Date date1 = org.apache.commons.lang.time.DateUtils.addWeeks(date0, 11);
        boolean boolean0 = org.apache.commons.lang.time.DateUtils.isSameInstant(date1, date0);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[7];
        stringArray0[0] = "";
        java.util.Date date0 = org.apache.commons.lang.time.DateUtils.parseDate("", stringArray0);
        java.util.Date date1 = org.apache.commons.lang.time.DateUtils.addMinutes(date0, 1);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        org.apache.commons.lang.time.DateUtils dateUtils0 = new org.apache.commons.lang.time.DateUtils();
        org.junit.Assert.assertEquals(1, org.apache.commons.lang.time.DateUtils.RANGE_WEEK_SUNDAY);
    }
}

