package org.joda.time.tz;


public class DateTimeZoneBuilder_ESTest extends org.joda.time.tz.DateTimeZoneBuilder_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset(-9223372036854775808L);
        org.junit.Assert.assertEquals(561000, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String string0 = cachedDateTimeZone0.getShortName(-9223372036854775808L, locale0);
        org.junit.Assert.assertEquals("+00:09:21", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[3];
        byteArray0[0] = ((byte)(34));
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(byteArrayInputStream0)));
        long long0 = org.joda.time.tz.DateTimeZoneBuilder.readMillis(dataInputStream0);
        org.junit.Assert.assertEquals((-54000000L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readMillis(((java.io.DataInput)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(null)));
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.DataInput)(dataInputStream0)), "DpY|xe_L1");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(97);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder1.toDateTimeZone("DNF", false)));
        org.junit.Assert.assertEquals("DNF", fixedDateTimeZone0.getID());
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(0, 'W', 0, 0, 256, true, (-1060));
        org.junit.Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.junit.Assert.assertEquals(4, localDateTime0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.previousTransition((-9223372036854775807L));
        org.junit.Assert.assertEquals((-9223372036854775807L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.previousTransition(327L);
        org.junit.Assert.assertEquals((-766623600001L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.previousTransition(-9223372036854775808L);
        org.junit.Assert.assertEquals(-9223372036854775808L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.previousTransition((-766623600000L));
        org.junit.Assert.assertEquals((-766623600001L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset(327L);
        org.junit.Assert.assertEquals(3600000, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset((-766623600000L));
        org.junit.Assert.assertEquals(3600000, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getOffset(9223372036854775762L);
        org.junit.Assert.assertEquals(7200000, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.previousTransition(9223372036854775762L);
        org.junit.Assert.assertEquals(9223372024736399999L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(80);
        dateTimeZoneBuilder1.addCutover(1262, 's', 84, 84, 84, true, 84);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.addCutover(80, 's', 292, 80, 80, false, 76);
        org.junit.Assert.assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings(((java.lang.String)(null)), 80, 3600000, 0, 'E', 0, 3600000, 3600000, false, 0);
        org.junit.Assert.assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(null)));
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.InputStream)(dataInputStream0)), "(I{% !#iF[Y+OqIba5");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset(26607895200000L);
        org.junit.Assert.assertEquals(3600000, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        dateTimeZoneBuilder0.setStandardOffset(3600000);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(98, 'w', 98, 3600000, 98, false, 73);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addRecurringSavings(" - ", 856, 73, 856, 'w', (-2829), 1203, 73, true, 81);
        org.junit.Assert.assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder1);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("g)/w>89??*", 98);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder1.toDateTimeZone("6{Mel)?fbs%nGgg", true)));
        org.junit.Assert.assertEquals("6{Mel)?fbs%nGgg", fixedDateTimeZone0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime(((java.lang.Object)(null)));
        boolean boolean0 = cachedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
        org.junit.Assert.assertFalse(boolean0);
    }
}

