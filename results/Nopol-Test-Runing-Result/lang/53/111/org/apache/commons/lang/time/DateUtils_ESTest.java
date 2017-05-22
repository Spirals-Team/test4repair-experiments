package org.apache.commons.lang.time;


public class DateUtils_ESTest extends org.apache.commons.lang.time.DateUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[9];
        stringArray0[0] = "X";
        stringArray0[1] = "X";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate("X", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[2];
        stringArray0[0] = "";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate(":X6D", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[6];
        stringArray0[0] = "&&";
        java.util.Date date0 = org.apache.commons.lang.time.DateUtils.parseDate("&&", stringArray0);
        boolean boolean0 = org.apache.commons.lang.time.DateUtils.isSameInstant(date0, date0);
        org.junit.Assert.assertTrue(boolean0);
    }
}

