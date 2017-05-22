package org.apache.commons.lang.time;


public class DateUtils_ESTest extends org.apache.commons.lang.time.DateUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[6];
        stringArray0[0] = "";
        java.util.Date date0 = org.apache.commons.lang.time.DateUtils.parseDate("", stringArray0);
        java.util.Iterator iterator0 = org.apache.commons.lang.time.DateUtils.iterator(date0, 2);
        org.junit.Assert.assertNotNull(iterator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.apache.commons.lang.time.DateUtils dateUtils0 = new org.apache.commons.lang.time.DateUtils();
        org.junit.Assert.assertEquals(1, org.apache.commons.lang.time.DateUtils.RANGE_WEEK_SUNDAY);
    }
}

