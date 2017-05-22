package org.apache.commons.lang.time;


public class DateUtils_ESTest extends org.apache.commons.lang.time.DateUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[4];
        stringArray0[0] = "";
        stringArray0[1] = "";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate("1f;|7X6", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }
}

