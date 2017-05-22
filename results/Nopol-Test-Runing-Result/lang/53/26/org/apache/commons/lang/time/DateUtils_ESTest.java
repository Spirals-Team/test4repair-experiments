package org.apache.commons.lang.time;


public class DateUtils_ESTest extends org.apache.commons.lang.time.DateUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[21];
        stringArray0[0] = "<=";
        stringArray0[1] = "";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate("Mp?AlG", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test82() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[2];
        stringArray0[0] = "";
        java.util.Date date0 = org.apache.commons.lang.time.DateUtils.parseDate("", stringArray0);
        boolean boolean0 = org.apache.commons.lang.time.DateUtils.isSameInstant(date0, date0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test99() throws java.lang.Throwable {
        org.apache.commons.lang.time.DateUtils dateUtils0 = new org.apache.commons.lang.time.DateUtils();
        org.junit.Assert.assertEquals(3, org.apache.commons.lang.time.DateUtils.RANGE_WEEK_RELATIVE);
    }
}

