package org.apache.commons.lang.time;


public class DurationFormatUtils_ESTest extends org.apache.commons.lang.time.DurationFormatUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("java.lang.StringBuffer@00000000270java.lang.StringBuffer@0000000028");
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token("+(-5vBPB<sZ_(A?");
        durationFormatUtils_Token0.increment();
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = org.apache.commons.lang.time.DurationFormatUtils.lexx("org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate@0000000002");
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.format(durationFormatUtils_TokenArray0, 1347, (-366), 1908, 1347, 1908, (-1142), 13, false);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = org.apache.commons.lang.time.DurationFormatUtils.lexx("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.format(durationFormatUtils_TokenArray0, 0, (-1496), 42, 25, (-1547), 3, 5, true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO(1L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(1L, false, true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1625L), "The wildcard array must not be null");
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(1L, 2419200000L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[4];
        java.lang.Object object0 = new java.lang.Object();
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token(object0);
        durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
        durationFormatUtils_TokenArray0[1] = durationFormatUtils_TokenArray0[0];
        durationFormatUtils_TokenArray0[2] = durationFormatUtils_Token0;
        durationFormatUtils_TokenArray0[3] = durationFormatUtils_TokenArray0[0];
        java.io.StringWriter stringWriter0 = new java.io.StringWriter(0);
        java.lang.StringBuffer stringBuffer0 = stringWriter0.getBuffer();
        boolean boolean0 = org.apache.commons.lang.time.DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, stringBuffer0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("0java.lang.StringBuffer@000000000800java.lang.StringBuffer@000000000900java.lang.StringBuffer@0000000010000" , (-2052));
        java.lang.String string0 = ((java.lang.String)(durationFormatUtils_Token0.getValue()));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("0java.lang.StringBuffer@000000000800java.lang.StringBuffer@000000000900java.lang.StringBuffer@000000001099");
        int int0 = durationFormatUtils_Token0.getCount();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = org.apache.commons.lang.time.DurationFormatUtils.lexx("");
        org.junit.Assert.assertNotNull(durationFormatUtils_TokenArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 2419200000L, "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "", false);
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1019L), "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "org.apache.commons.io.IOCase", true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "H+DWWngRUy}44", true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(2419200000L, "hYKul^NoyBd'D#4J]", true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("java.lang.StringBuffer@00000000310java.lang.StringBuffer@00000000320java.lang.StringBuffer@00000000330java.lang.StringBuffer@0000000034");
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token("+(S5vBPI<sZ_(m?");
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("0java.lang.StringBuffer@000000000800java.lang.StringBuffer@000000000900java.lang.StringBuffer@0000000010000" , (-2052));
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token("m");
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("0java.lang.StringBuffer@00000000090java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000110java.lang.StringBuffer@0000000012");
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token(durationFormatUtils_Token0 , 121);
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("0java.lang.StringBuffer@000000000800java.lang.StringBuffer@000000000900java.lang.StringBuffer@0000000010000" , (-2052));
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("0java.lang.StringBuffer@00000000090java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000110java.lang.StringBuffer@0000000012");
        boolean boolean0 = durationFormatUtils_Token0.equals("d");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "0java.lang.StringBuffer@000000000800java.lang.StringBuffer@000000000900java.lang.StringBuffer@0000000010000", false);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-223L), (-1L), "VMJwBmW-yhp!DS");
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-19L), 2419203823L, "", true, ((java.util.TimeZone)(zoneInfo0)));
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(0L, true, true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(0L, false, false);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS((-1L));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils0 = new org.apache.commons.lang.time.DurationFormatUtils();
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((-2327L), 2419200000L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[4];
        java.lang.Object object0 = new java.lang.Object();
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token(object0);
        durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token0;
        java.lang.String string0 = durationFormatUtils_TokenArray0[1].toString();
        org.junit.Assert.assertNotNull(string0);
    }
}

