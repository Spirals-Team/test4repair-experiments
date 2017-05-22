package org.apache.commons.lang.time;


public class DateUtils_ESTest extends org.apache.commons.lang.time.DateUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[8];
        stringArray0[0] = "s6FX}{";
        stringArray0[1] = "s6FX}{";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate("s6FX}{", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[7];
        stringArray0[0] = "";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate("<@;jrT2Gug~1qDp7$b", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }
}

