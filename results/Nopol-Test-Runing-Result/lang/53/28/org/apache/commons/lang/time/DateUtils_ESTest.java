package org.apache.commons.lang.time;


public class DateUtils_ESTest extends org.apache.commons.lang.time.DateUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[9];
        stringArray0[0] = "k";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate("k", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }
}

