package org.apache.commons.lang.time;


public class DurationFormatUtils_ESTest extends org.apache.commons.lang.time.DurationFormatUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        java.io.StringWriter stringWriter0 = new java.io.StringWriter();
        java.lang.StringBuffer stringBuffer0 = stringWriter0.getBuffer();
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token(stringBuffer0 , 1004);
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token(stringBuffer0);
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
        org.junit.Assert.assertFalse(durationFormatUtils_Token1.equals(((java.lang.Object)(durationFormatUtils_Token0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1757L, (-5154L), "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = org.apache.commons.lang.time.DurationFormatUtils.lexx(" 1 days");
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.format(durationFormatUtils_TokenArray0, 13, 64, (-161), 83, (-161), (-413), (-5045), true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, 2419200000L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(1000L, 86400000L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = org.apache.commons.lang.time.DurationFormatUtils.lexx("in+sm>NFH");
        boolean boolean0 = org.apache.commons.lang.time.DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, "0java.lang.StringBuffer@000000001300java.lang.StringBuffer@000000001400java.lang.StringBuffer@0000000015059");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("y");
        java.lang.String string0 = ((java.lang.String)(durationFormatUtils_Token0.getValue()));
        org.junit.Assert.assertEquals("y", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("y" , 2461);
        int int0 = durationFormatUtils_Token0.getCount();
        org.junit.Assert.assertEquals(2461, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = org.apache.commons.lang.time.DurationFormatUtils.lexx("");
        org.junit.Assert.assertNotNull(durationFormatUtils_TokenArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-255L), (-255L), "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-3141L), "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 2419200731L, "pA^d", false, ((java.util.TimeZone)(zoneInfo0)));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "0java.lang.StringBuffer@00000000090java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000110java.lang.StringBuffer@0000000012", false);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, " 0 minutes", true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(392L, "H", true);
        org.junit.Assert.assertEquals("0", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "pA^d", false);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-968L), "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("0java.lang.StringBuffer@00000000090java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000115java.lang.StringBuffer@0000000012");
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token("java.lang.String@0000000014");
        boolean boolean0 = durationFormatUtils_Token1.equals(durationFormatUtils_Token0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("0java.lang.StringBuffer@00000000090java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000114java.lang.StringBuffer@0000000012");
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token("java.lang.String@0000000014");
        durationFormatUtils_Token0.increment();
        boolean boolean0 = durationFormatUtils_Token1.equals(durationFormatUtils_Token0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("H|$" , 1);
        durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
        boolean boolean0 = durationFormatUtils_TokenArray0[0].equals(((java.lang.Object)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-5930L), (-5930L), "0java.lang.StringBuffer@000000000800java.lang.StringBuffer@0000000009-5java.lang.StringBuffer@000000001070");
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((-1L), 2419200000L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 2419200731L, "mW|y3w&:,", false, ((java.util.TimeZone)(zoneInfo0)));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-5124L), 2419200731L, "", false, ((java.util.TimeZone)(zoneInfo0)));
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((-2328L), false, false);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(2332L, true, true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(115, false, true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "", false);
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(2419200000L, 0L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils0 = new org.apache.commons.lang.time.DurationFormatUtils();
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO(2580L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS(0L);
        org.junit.Assert.assertNotNull(string0);
    }
}

