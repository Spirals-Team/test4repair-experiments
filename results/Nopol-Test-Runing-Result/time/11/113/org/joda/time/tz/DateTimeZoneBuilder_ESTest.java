package org.joda.time.tz;


public class DateTimeZoneBuilder_ESTest extends org.joda.time.tz.DateTimeZoneBuilder_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.adjustOffset(846377999999L, false);
        org.junit.Assert.assertEquals(846377999999L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(584);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings("", (-2620));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder2.toDateTimeZone("", false)));
        org.junit.Assert.assertEquals("", fixedDateTimeZone0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("|jC", 0);
        dateTimeZoneBuilder0.addCutover((-2148), 'w', 97, (-9), 508, true, 508);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings("/(BXj#Qj7", 1572);
        org.junit.Assert.assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder1);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("|jC", 0);
        dateTimeZoneBuilder0.addCutover((-2148), 'w', 97, (-9), 508, true, 508);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover((-9), 'w', 16, 16, 20503125, false, (-9));
        org.junit.Assert.assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder2);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        dateTimeZoneBuilder0.setFixedSavings("UTC", (-2767));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder0.toDateTimeZone("UTC", false)));
        org.junit.Assert.assertEquals("UTC", fixedDateTimeZone0.getID());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        sun.util.calendar.ZoneInfo zoneInfo0 = ((sun.util.calendar.ZoneInfo)(java.util.TimeZone.getDefault()));
        zoneInfo0.setID("PST");
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.forTimeZone(zoneInfo0)));
        org.junit.Assert.assertEquals("America/Los_Angeles", cachedDateTimeZone0.getID());
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[9];
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.BufferedInputStream bufferedInputStream0 = new java.io.BufferedInputStream(((java.io.InputStream)(byteArrayInputStream0)));
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(bufferedInputStream0)));
        long long0 = org.joda.time.tz.DateTimeZoneBuilder.readMillis(dataInputStream0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[9];
        byteArray0[0] = ((byte)(74));
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.BufferedInputStream bufferedInputStream0 = new java.io.BufferedInputStream(((java.io.InputStream)(byteArrayInputStream0)));
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(bufferedInputStream0)));
        long long0 = org.joda.time.tz.DateTimeZoneBuilder.readMillis(dataInputStream0);
        org.junit.Assert.assertEquals(10066329600000L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[9];
        byteArray0[0] = ((byte)(117));
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.BufferedInputStream bufferedInputStream0 = new java.io.BufferedInputStream(((java.io.InputStream)(byteArrayInputStream0)));
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(bufferedInputStream0)));
        long long0 = org.joda.time.tz.DateTimeZoneBuilder.readMillis(dataInputStream0);
        org.junit.Assert.assertEquals((-11072962560000L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readMillis(((java.io.DataInput)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.InputStream)(null)), "     - ");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(gJChronology0.getZone()));
        long long0 = cachedDateTimeZone0.previousTransition((-92));
        org.junit.Assert.assertEquals((-766623600001L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight((-3039) , 4 , 4);
        org.junit.Assert.assertEquals((-158060678961000L), dateMidnight0.getMillis());
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.previousTransition(-9223372036854775808L);
        org.junit.Assert.assertEquals(-9223372036854775808L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset((-2426L));
        org.junit.Assert.assertEquals(3600000, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset(-9223372036854775808L);
        org.junit.Assert.assertEquals(561000, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        java.lang.String string0 = cachedDateTimeZone0.getNameKey(-9223372036854775808L);
        org.junit.Assert.assertEquals("LMT", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover((-1589), 'w', (-1589), (-1589), (-952), true, 86);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder1.toDateTimeZone("UTC", false)));
        org.junit.Assert.assertTrue(fixedDateTimeZone0.isFixed());
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("x1PuGO*oB/xjj&Q~", 10209375, (-1589), (-292275054), '6', (-292275054), 10209375, (-1589), false, (-292275054));
        org.junit.Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("s\"y", 84);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder1.toDateTimeZone("UTC", false)));
        org.junit.Assert.assertEquals("UTC", fixedDateTimeZone0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        java.io.ByteArrayOutputStream byteArrayOutputStream0 = new java.io.ByteArrayOutputStream();
        java.io.DataOutputStream dataOutputStream0 = new java.io.DataOutputStream(((java.io.OutputStream)(byteArrayOutputStream0)));
        org.joda.time.tz.DateTimeZoneBuilder.writeMillis(dataOutputStream0, 2172099600000L);
        org.junit.Assert.assertEquals(4, byteArrayOutputStream0.size());
        org.junit.Assert.assertEquals("B(d\ufffd", byteArrayOutputStream0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isStandardOffset(859683600000L);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.weeks();
        org.joda.time.Period period0 = new org.joda.time.Period((-766623600000L) , periodType0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.adjustOffset(-9223372036854775808L, false);
        org.junit.Assert.assertEquals(-9223372036854775808L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.previousTransition(9223372036854775807L);
        org.junit.Assert.assertEquals(846377999999L, long0);
    }
}

