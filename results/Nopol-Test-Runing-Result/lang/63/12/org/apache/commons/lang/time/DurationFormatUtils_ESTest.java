package org.apache.commons.lang.time;


public class DurationFormatUtils_ESTest extends org.apache.commons.lang.time.DurationFormatUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        java.io.StringWriter stringWriter0 = new java.io.StringWriter(12);
        java.lang.StringBuffer stringBuffer0 = stringWriter0.getBuffer();
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token(stringBuffer0 , 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token(stringBuffer0 , 0);
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        java.io.StringWriter stringWriter0 = new java.io.StringWriter(12);
        java.lang.StringBuffer stringBuffer0 = stringWriter0.getBuffer();
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token(stringBuffer0 , 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token(stringBuffer0);
        boolean boolean0 = durationFormatUtils_Token1.equals(durationFormatUtils_Token0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(durationFormatUtils_Token0.equals(((java.lang.Object)(durationFormatUtils_Token1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO(2405L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = org.apache.commons.lang.time.DurationFormatUtils.lexx("~+OM9k-~R'Rp");
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.format(durationFormatUtils_TokenArray0, (-1620), (-856), 2483, 2483, (-1620), 101, 554, true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[1];
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("y");
        durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.format(durationFormatUtils_TokenArray0, (-662), 793, 289, 72, 793, 8192, 851, false);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = org.apache.commons.lang.time.DurationFormatUtils.lexx("T(d(IbI<=>G+z)y}");
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.format(durationFormatUtils_TokenArray0, (-995), (-995), 14, 2227, 4462, (-3370), 2227, false);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, 2419200000L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(2419200073L, (-4390L));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(60000L, false, false);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS(3600000L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("");
        durationFormatUtils_Token0.increment();
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[4];
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("");
        durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
        durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token0;
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token(durationFormatUtils_Token0);
        durationFormatUtils_TokenArray0[2] = durationFormatUtils_Token1;
        boolean boolean0 = org.apache.commons.lang.time.DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, durationFormatUtils_Token0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("java.lang.StringBuffer@000000004100000000java.lang.StringBuffer@0000000042java.lang.StringBuffer@0000000043java.lang.StringBuffer@0000000044java.lang.StringBuffer@0000000045java.lang.StringBuffer@0000000046java.lang.StringBuffer@0000000047java.lang.StringBuffer@0000000048java.lang.StringBuffer@0000000049");
        int int0 = durationFormatUtils_Token0.getCount();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = org.apache.commons.lang.time.DurationFormatUtils.lexx("");
        org.junit.Assert.assertNotNull(durationFormatUtils_TokenArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        java.util.SimpleTimeZone simpleTimeZone0 = new java.util.SimpleTimeZone(1440 , "");
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(((long)(-80)), ((long)(-1)), "", true, ((java.util.TimeZone)(simpleTimeZone0)));
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-2124L), 2419200073L, "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(2419200073L, "", true);
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1073L, "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(((long)(0)), "+", false);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-75L), "org.apache.commons.io.filefilter.NameFileFilter", true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("");
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token("" , 121);
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        java.lang.Object object0 = new java.lang.Object();
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token(object0 , 12);
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token(durationFormatUtils_Token0 , 7);
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("");
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        java.util.SimpleTimeZone simpleTimeZone0 = new java.util.SimpleTimeZone((-1609) , "dHJvYf6#rAB");
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 0L, "0java.lang.StringBuffer@00000000090java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000110java.lang.StringBuffer@0000000012", false, ((java.util.TimeZone)(simpleTimeZone0)));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "java.lang.StringBuffer@00000000230java.lang.StringBuffer@00000000240java.lang.StringBuffer@00000000250java.lang.StringBuffer@00000000260java.lang.StringBuffer@00000000270java.lang.StringBuffer@00000000280java.lang.StringBuffer@0000000029000java.lang.StringBuffer@0000000030");
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(((long)(2)), "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-2419204463L), 508L, "<", true, ((java.util.TimeZone)(zoneInfo0)));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((-1), true, false);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((-696L), false, true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(2419200000L, 0L, " 1 day");
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils0 = new org.apache.commons.lang.time.DurationFormatUtils();
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("java.lang.StringBuffer@000000004100000000java.lang.StringBuffer@0000000042java.lang.StringBuffer@0000000043java.lang.StringBuffer@0000000044java.lang.StringBuffer@0000000045java.lang.StringBuffer@0000000046java.lang.StringBuffer@0000000047java.lang.StringBuffer@0000000048java.lang.StringBuffer@0000000049");
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("java.lang.StringBuffer@000000004100000000java.lang.StringBuffer@0000000042java.lang.StringBuffer@0000000043java.lang.StringBuffer@0000000044java.lang.StringBuffer@0000000045java.lang.StringBuffer@0000000046java.lang.StringBuffer@0000000047java.lang.StringBuffer@0000000048java.lang.StringBuffer@0000000049");
        java.lang.String string0 = durationFormatUtils_Token0.toString();
        org.junit.Assert.assertNotNull(string0);
    }
}

