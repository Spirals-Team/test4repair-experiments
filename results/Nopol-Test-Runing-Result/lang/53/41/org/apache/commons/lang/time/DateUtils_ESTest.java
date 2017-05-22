package org.apache.commons.lang.time;


public class DateUtils_ESTest extends org.apache.commons.lang.time.DateUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[11];
        stringArray0[0] = "k=2[,z";
        stringArray0[1] = "k=2[,z";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate("k=2[,z", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[5];
        stringArray0[0] = "";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate("The range style ", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }
}

