package org.joda.time.tz;


public class DateTimeZoneBuilder_ESTest extends org.joda.time.tz.DateTimeZoneBuilder_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String string0 = cachedDateTimeZone0.getShortName(-9223372036854775808L, locale0);
        org.junit.Assert.assertEquals("+00:09:21", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(895);
        dateTimeZoneBuilder1.addCutover(192, 's', 192, 895, 895, true, 192);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.addCutover(2899, 'w', (-3797), (-3797), (-3797), true, (-3797));
        org.junit.Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder2);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[7];
        byteArray0[0] = ((byte)(21));
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.BufferedInputStream bufferedInputStream0 = new java.io.BufferedInputStream(((java.io.InputStream)(byteArrayInputStream0)) , 2615);
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(bufferedInputStream0)));
        long long0 = org.joda.time.tz.DateTimeZoneBuilder.readMillis(dataInputStream0);
        org.junit.Assert.assertEquals(37800000L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[9];
        byteArray0[0] = ((byte)(-119));
        byteArray0[1] = ((byte)(-49));
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(byteArrayInputStream0)));
        long long0 = org.joda.time.tz.DateTimeZoneBuilder.readMillis(dataInputStream0);
        org.junit.Assert.assertEquals(4, byteArrayInputStream0.available());
        org.junit.Assert.assertEquals((-822083584000L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readMillis(((java.io.DataInput)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.InputStream)(null)), "Invalid encoding");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(null)));
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.DataInput)(dataInputStream0)), "lq8q@)ED0o");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("7Bc0.R;L$Wi", 100);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder1.toDateTimeZone("", false)));
        org.junit.Assert.assertTrue(fixedDateTimeZone0.isFixed());
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime(604800L);
        org.joda.time.LocalDateTime localDateTime1 = localDateTime0.minusMonths(7678125);
        boolean boolean0 = cachedDateTimeZone0.isLocalDateTimeGap(localDateTime1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime(604800L);
        boolean boolean0 = cachedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset((-2014L));
        org.junit.Assert.assertEquals(3600000, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.convertLocalToUTC(9223372036854775807L, true, -9223372036854775808L);
        org.junit.Assert.assertEquals(9223372036847575807L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        java.lang.String string0 = cachedDateTimeZone0.getNameKey((-766623600000L));
        org.junit.Assert.assertEquals("CET", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = new org.joda.time.tz.FixedDateTimeZone("Asia/Shanghai" , "Asia/Shanghai" , 165 , 165);
        java.util.SimpleTimeZone simpleTimeZone0 = ((java.util.SimpleTimeZone)(fixedDateTimeZone0.toTimeZone()));
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.forTimeZone(simpleTimeZone0)));
        org.junit.Assert.assertEquals("Asia/Shanghai", cachedDateTimeZone0.getID());
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.previousTransition(1382835599999L);
        org.junit.Assert.assertEquals(1364691599999L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime(604800L);
        org.joda.time.LocalDateTime localDateTime1 = localDateTime0.withWeekyear(7678125);
        org.joda.time.LocalDateTime localDateTime2 = localDateTime1.minusHours(103);
        boolean boolean0 = cachedDateTimeZone0.isLocalDateTimeGap(localDateTime2);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        dateTimeZoneBuilder0.addCutover(2712, '$', 2712, 2712, 2712, false, 2712);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder0.toDateTimeZone("UTC", false)));
        org.junit.Assert.assertTrue(fixedDateTimeZone0.isFixed());
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("", (-581), 0, (-7), '/', 3474, (-7), (-2842), true, (-7));
        org.junit.Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        java.io.BufferedOutputStream bufferedOutputStream0 = new java.io.BufferedOutputStream(((java.io.OutputStream)(null)));
        java.io.DataOutputStream dataOutputStream0 = new java.io.DataOutputStream(((java.io.OutputStream)(bufferedOutputStream0)));
        org.joda.time.tz.DateTimeZoneBuilder.writeMillis(dataOutputStream0, 242236062090000000L);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[1] = ((byte)(70));
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(byteArrayInputStream0)));
        dataInputStream0.readByte();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.DataInput)(dataInputStream0)), "lq8q@)ED0o")));
        org.junit.Assert.assertEquals("lq8q@)ED0o", fixedDateTimeZone0.getID());
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset(1382835599999L);
        org.junit.Assert.assertEquals(3600000, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-155));
        dateTimeZoneBuilder1.addCutover(435, 'w', (-155), 41, 41, false, (-155));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.addRecurringSavings("", (-155), (-155), (-155), 'w', 435, (-155), 41, false, 435);
        org.junit.Assert.assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime(604800L);
        org.joda.time.LocalDateTime localDateTime1 = localDateTime0.withWeekyear(7678125);
        cachedDateTimeZone0.isLocalDateTimeGap(localDateTime1);
    }
}

