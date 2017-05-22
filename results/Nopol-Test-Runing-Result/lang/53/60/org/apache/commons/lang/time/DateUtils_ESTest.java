package org.apache.commons.lang.time;


public class DateUtils_ESTest extends org.apache.commons.lang.time.DateUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[5];
        stringArray0[0] = "";
        java.util.Date date0 = org.apache.commons.lang.time.DateUtils.parseDate("", stringArray0);
        java.util.Iterator iterator0 = org.apache.commons.lang.time.DateUtils.iterator(date0, 6);
        org.junit.Assert.assertNotNull(iterator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[8];
        stringArray0[0] = "";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate("aaKz4!-h[E-", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test90() throws java.lang.Throwable {
        org.apache.commons.lang.time.DateUtils dateUtils0 = new org.apache.commons.lang.time.DateUtils();
        org.junit.Assert.assertEquals(3, org.apache.commons.lang.time.DateUtils.RANGE_WEEK_RELATIVE);
    }
}

