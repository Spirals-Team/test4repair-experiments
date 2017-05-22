package org.apache.commons.lang.time;


public class DateUtils_ESTest extends org.apache.commons.lang.time.DateUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[6];
        stringArray0[0] = "-S";
        stringArray0[1] = "-S";
        try {
            org.apache.commons.lang.time.DateUtils.parseDate("-S", stringArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[4];
        stringArray0[0] = "(";
        java.util.Date date0 = org.apache.commons.lang.time.DateUtils.parseDate("(", stringArray0);
        java.util.Iterator iterator0 = org.apache.commons.lang.time.DateUtils.iterator(((java.lang.Object)(date0)), 2);
        org.junit.Assert.assertNotNull(iterator0);
    }

    @org.junit.Test(timeout = 4000)
    public void test98() throws java.lang.Throwable {
        org.apache.commons.lang.time.DateUtils dateUtils0 = new org.apache.commons.lang.time.DateUtils();
        org.junit.Assert.assertEquals(86400000, org.apache.commons.lang.time.DateUtils.MILLIS_IN_DAY);
    }
}

