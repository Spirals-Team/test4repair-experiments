package org.apache.commons.lang.time;


public class DurationFormatUtils_ESTest extends org.apache.commons.lang.time.DurationFormatUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        java.io.StringWriter stringWriter0 = new java.io.StringWriter();
        java.lang.StringBuffer stringBuffer0 = stringWriter0.getBuffer();
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token(stringBuffer0);
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token(stringBuffer0);
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("0java.lang.StringBuffer@000000000800java.lang.StringBuffer@000000000900java.lang.StringBuffer@000000001094" , 6);
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token(durationFormatUtils_Token0 , 3486);
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token(durationFormatUtils_Token1);
        boolean boolean0 = durationFormatUtils_Token2.equals(durationFormatUtils_Token1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1191L), "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO((-1865L));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO(3600000L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = org.apache.commons.lang.time.DurationFormatUtils.lexx("qrMfu};N[i");
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.format(durationFormatUtils_TokenArray0, (-1419), 1000, 0, (-1), 0, (-1419), 1306, true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((-376L), 2419200000L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(0L, false, true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS((-86401239L));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO(60000L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token(((java.lang.Object)(null)));
        durationFormatUtils_Token0.increment();
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000211java.lang.StringBuffer@0000000022699java.lang.StringBuffer@0000000023");
        java.lang.String string0 = ((java.lang.String)(durationFormatUtils_Token0.getValue()));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("");
        int int0 = durationFormatUtils_Token0.getCount();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = org.apache.commons.lang.time.DurationFormatUtils.lexx("rj$F.+E?Hr{y1`CJm;k");
        boolean boolean0 = org.apache.commons.lang.time.DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, ((java.lang.Object)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = org.apache.commons.lang.time.DurationFormatUtils.lexx("");
        org.junit.Assert.assertNotNull(durationFormatUtils_TokenArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(3600000L, 270L, "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "", true);
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[1];
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("The filters must not be null");
        durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.format(durationFormatUtils_TokenArray0, 100, 100, 100, 100, 100, 100, 0, true);
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "-300-300", false);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-380L), "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "FbN-[Jf5tA*/dS]", false);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("0java.lang.StringBuffer@000000000800java.lang.StringBuffer@000000000900java.lang.StringBuffer@000000001094" , 11);
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token(durationFormatUtils_Token0 , 3565);
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token(durationFormatUtils_Token0);
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token(durationFormatUtils_Token1);
        boolean boolean0 = durationFormatUtils_Token3.equals(durationFormatUtils_Token2);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(durationFormatUtils_Token1.equals(((java.lang.Object)(durationFormatUtils_Token2))));
        org.junit.Assert.assertFalse(durationFormatUtils_Token2.equals(((java.lang.Object)(durationFormatUtils_Token1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("B{|R(=<v'{=~r" , 260);
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token("B{|R(=<v'{=~r");
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("B{|R(=<v'{=~r" , 260);
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1421L), 2419200398L, "28java.lang.StringBuffer@00000000090java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000110java.lang.StringBuffer@0000000012", true, ((java.util.TimeZone)(zoneInfo0)));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-389L), 2419200000L, "M");
        org.junit.Assert.assertEquals("0", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(2419200398L, true, true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(3600000L, false, false);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(((long)(15)), 1223L, "", true, ((java.util.TimeZone)(zoneInfo0)));
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 2419200000L, "i");
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils0 = new org.apache.commons.lang.time.DurationFormatUtils();
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1421L), 2419200398L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true, ((java.util.TimeZone)(zoneInfo0)));
        org.junit.Assert.assertNotNull(string0);
    }
}

