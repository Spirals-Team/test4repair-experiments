package org.apache.commons.lang.time;


public class DateUtils_ESTest extends org.apache.commons.lang.time.DateUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[7];
        stringArray0[0] = "";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate("Lmw,]DMMR0b7X1iA(", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[3];
        stringArray0[0] = "6k";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate("6k", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.apache.commons.lang.time.DateUtils dateUtils0 = new org.apache.commons.lang.time.DateUtils();
        org.junit.Assert.assertEquals(1000, org.apache.commons.lang.time.DateUtils.MILLIS_IN_SECOND);
    }
}

