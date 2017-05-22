package org.apache.commons.lang.time;


public class DurationFormatUtils_ESTest extends org.apache.commons.lang.time.DurationFormatUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("java.lang.StringBuffer@00000000120java.lang.StringBuffer@00000000130java.lang.StringBuffer@00000000140java.lang.StringBuffer@00000000150java.lang.StringBuffer@00000000160java.lang.StringBuffer@0000000017");
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token("d" , 1826);
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, 0L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((-36L), 2419199998L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-4178L), "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((-2655L), (-2655L));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(2419200000L, "Dzy$#*R.mnh8oV]21p");
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS(2419200000L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(86400000L, " 1 day");
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("");
        durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
        durationFormatUtils_TokenArray0[1] = durationFormatUtils_TokenArray0[0];
        boolean boolean0 = org.apache.commons.lang.time.DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, "");
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("");
        durationFormatUtils_Token0.increment();
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("java.lang.StringBuffer@00000000160java.lang.StringBuffer@000000001740320java.lang.StringBuffer@0000000018" , 3658);
        int int0 = durationFormatUtils_Token0.getCount();
        org.junit.Assert.assertEquals(3658, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = org.apache.commons.lang.time.DurationFormatUtils.lexx("Hoacy>|0wke");
        org.junit.Assert.assertNotNull(durationFormatUtils_TokenArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = org.apache.commons.lang.time.DurationFormatUtils.lexx("");
        org.junit.Assert.assertNotNull(durationFormatUtils_TokenArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 0L, "", true, ((java.util.TimeZone)(null)));
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("");
        durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
        durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token0;
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.format(durationFormatUtils_TokenArray0, (-647), 68, (-647), 20, 21, 452, (-1584), true);
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        java.util.SimpleTimeZone simpleTimeZone0 = new java.util.SimpleTimeZone(200 , ";O1ZND");
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(3600000L, 86400000L, "672java.lang.StringBuffer@000000003100java.lang.StringBuffer@000000003200java.lang.StringBuffer@0000000033000", false, ((java.util.TimeZone)(simpleTimeZone0)));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "", false);
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1662L, "java.lang.StringBuffer@0000000002");
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("/DJ@|S@Sf(!");
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token("0java.lang.StringBuffer@00000000090java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000110java.lang.StringBuffer@0000000012");
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("");
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token("M" , (-647));
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("");
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("");
        boolean boolean0 = durationFormatUtils_Token0.equals("M");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-9L), 2419200000L, "Nr>!@f9>~rI!fl@MU");
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 2419200000L, "aq4xS7GHn r| h", false, ((java.util.TimeZone)(zoneInfo0)));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        java.util.SimpleTimeZone simpleTimeZone0 = new java.util.SimpleTimeZone(58 , "@F^:1");
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-839L), 2419200000L, " 1 days", true, ((java.util.TimeZone)(simpleTimeZone0)));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 2419200000L, "FoM2muF^y}LKc8p2", false, ((java.util.TimeZone)(zoneInfo0)));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(1647L, true, false);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(1000L, false, true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(784L, 1000L, "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils0 = new org.apache.commons.lang.time.DurationFormatUtils();
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO(1647L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("aq4xS7GHn r| h" , 2);
        java.lang.String string0 = durationFormatUtils_Token0.toString();
        org.junit.Assert.assertNotNull(string0);
    }
}

