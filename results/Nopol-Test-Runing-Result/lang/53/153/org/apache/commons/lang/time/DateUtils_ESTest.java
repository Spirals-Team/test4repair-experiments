package org.apache.commons.lang.time;


public class DateUtils_ESTest extends org.apache.commons.lang.time.DateUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[3];
        stringArray0[0] = "";
        java.util.Date date0 = org.apache.commons.lang.time.DateUtils.parseDate("", stringArray0);
        java.util.Date date1 = org.apache.commons.lang.time.DateUtils.addSeconds(date0, 3022);
        boolean boolean0 = org.apache.commons.lang.time.DateUtils.isSameInstant(date0, date1);
    }

    @org.junit.Test(timeout = 4000)
    public void test98() throws java.lang.Throwable {
        org.apache.commons.lang.time.DateUtils dateUtils0 = new org.apache.commons.lang.time.DateUtils();
        org.junit.Assert.assertEquals(3600000, org.apache.commons.lang.time.DateUtils.MILLIS_IN_HOUR);
    }
}

