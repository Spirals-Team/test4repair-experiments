package org.apache.commons.lang.time;


public class DateUtils_ESTest extends org.apache.commons.lang.time.DateUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[6];
        stringArray0[0] = "?";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate("Unable to parse the date: ", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test93() throws java.lang.Throwable {
        org.apache.commons.lang.time.DateUtils dateUtils0 = new org.apache.commons.lang.time.DateUtils();
        org.junit.Assert.assertEquals(2, org.apache.commons.lang.time.DateUtils.RANGE_WEEK_MONDAY);
    }
}

