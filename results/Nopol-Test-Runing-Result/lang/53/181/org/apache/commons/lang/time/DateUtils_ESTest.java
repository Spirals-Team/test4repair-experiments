package org.apache.commons.lang.time;


public class DateUtils_ESTest extends org.apache.commons.lang.time.DateUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[2];
        stringArray0[0] = "";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate("uo_AF<-OBY5G$XL@", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }
}

