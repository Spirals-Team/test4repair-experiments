package org.apache.commons.lang.time;


public class DurationFormatUtils_ESTest extends org.apache.commons.lang.time.DurationFormatUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("d");
        durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token(durationFormatUtils_TokenArray0[0] , (-1138));
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token(durationFormatUtils_Token0 , 825);
        boolean boolean0 = durationFormatUtils_Token1.equals(durationFormatUtils_Token2);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(durationFormatUtils_Token2.equals(((java.lang.Object)(durationFormatUtils_Token1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = org.apache.commons.lang.time.DurationFormatUtils.lexx("%&hopdKy0Mrna");
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.format(durationFormatUtils_TokenArray0, 118, (-1), 11, (-1), 20, 72, (-1), false);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO((-934L));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(2419200000L, 1L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("~{DAh3r3_nY");
        durationFormatUtils_Token0.increment();
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("~{DAh3r3_nY");
        java.lang.String string0 = ((java.lang.String)(durationFormatUtils_Token0.getValue()));
        org.junit.Assert.assertEquals("~{DAh3r3_nY", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("");
        int int0 = durationFormatUtils_Token0.getCount();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = org.apache.commons.lang.time.DurationFormatUtils.lexx(" 1 minutes");
        boolean boolean0 = org.apache.commons.lang.time.DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, "java.lang.StringBuffer@0000000012");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = org.apache.commons.lang.time.DurationFormatUtils.lexx("");
        org.junit.Assert.assertNotNull(durationFormatUtils_TokenArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        java.util.SimpleTimeZone simpleTimeZone0 = new java.util.SimpleTimeZone(1 , "Iv8u**GA;[B");
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(4235L, (-2645L), "", true, ((java.util.TimeZone)(simpleTimeZone0)));
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1066L), 2419200033L, "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "1yhhK_eBJ");
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("~{DAh3r3_nY");
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[3];
        durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
        durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token0;
        durationFormatUtils_TokenArray0[2] = durationFormatUtils_Token0;
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.format(durationFormatUtils_TokenArray0, (-2709), (-627), (-627), 741, 0, (-627), 491, true);
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.time.DurationFormatUtils.lexx(((java.lang.String)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 1L, ((java.lang.String)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), ((java.lang.String)(null)), true);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.time.DurationFormatUtils.formatDuration(2228L, ((java.lang.String)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(60000L, "", true);
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-2702L), "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("d");
        durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token("d" , 1216);
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token(durationFormatUtils_TokenArray0[0] , (-1138));
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token(durationFormatUtils_Token1 , (-1138));
        boolean boolean0 = durationFormatUtils_Token3.equals(durationFormatUtils_Token2);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("y");
        boolean boolean0 = durationFormatUtils_Token0.equals("0java.lang.StringBuffer@00000000110java.lang.StringBuffer@00000000120java.lang.StringBuffer@0000000013-1java.lang.StringBuffer@0000000014");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getTimeZone("java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000210java.lang.StringBuffer@0000000022001java.lang.StringBuffer@0000000023")));
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 0L, "java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000210java.lang.StringBuffer@0000000022001java.lang.StringBuffer@0000000023", true, ((java.util.TimeZone)(zoneInfo0)));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-2330L), "java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@0000000021-2java.lang.StringBuffer@000000002270java.lang.StringBuffer@0000000023", false);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(2419200000L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1066L), 2419200033L, "2T%AVM");
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        java.util.SimpleTimeZone simpleTimeZone0 = new java.util.SimpleTimeZone(1 , "Iv8u**GA;[B");
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-40L), 2419200000L, " XtD", false, ((java.util.TimeZone)(simpleTimeZone0)));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        java.util.SimpleTimeZone simpleTimeZone0 = new java.util.SimpleTimeZone(1 , "?v>u**G;[B");
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 2419200000L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", false, ((java.util.TimeZone)(simpleTimeZone0)));
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(0L, true, true);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((-1439L), true, false);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(2, false, false);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS(1005L);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils durationFormatUtils0 = new org.apache.commons.lang.time.DurationFormatUtils();
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.apache.commons.lang.time.DurationFormatUtils.Token durationFormatUtils_Token0 = new org.apache.commons.lang.time.DurationFormatUtils.Token("~{DAh3r3_nY");
        java.lang.String string0 = durationFormatUtils_Token0.toString();
        org.junit.Assert.assertNotNull(string0);
    }
}

