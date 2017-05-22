package org.apache.commons.lang.time;


public class DateUtils_ESTest extends org.apache.commons.lang.time.DateUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[5];
        stringArray0[0] = "_Y`";
        stringArray0[1] = "_Y`";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate("_Y`", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[7];
        stringArray0[0] = "";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate("|7?V\"V[~K", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }
}

