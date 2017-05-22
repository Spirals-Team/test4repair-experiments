package org.apache.commons.lang.time;


public class DateUtils_ESTest extends org.apache.commons.lang.time.DateUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[10];
        stringArray0[0] = "";
        stringArray0[1] = "";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate(",i_e_`sg4au*X", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test98() throws java.lang.Throwable {
        org.apache.commons.lang.time.DateUtils dateUtils0 = new org.apache.commons.lang.time.DateUtils();
        org.junit.Assert.assertEquals(86400000L, org.apache.commons.lang.time.DateUtils.MILLIS_PER_DAY);
    }
}

