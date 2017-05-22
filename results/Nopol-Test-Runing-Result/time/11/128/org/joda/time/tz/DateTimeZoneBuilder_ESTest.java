package org.joda.time.tz;


public class DateTimeZoneBuilder_ESTest extends org.joda.time.tz.DateTimeZoneBuilder_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset((-9223372036854775803L));
        org.junit.Assert.assertEquals(561000, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.forOffsetHours(1)));
        org.joda.time.chrono.ZonedChronology zonedChronology0 = org.joda.time.chrono.ZonedChronology.getInstance(ethiopicChronology0, fixedDateTimeZone0);
        zonedChronology0.getZone();
        org.joda.time.Duration duration0 = org.joda.time.Duration.millis(1);
        duration0.minus((-9223372036854775785L));
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime((-9223372036854775785L));
        org.joda.time.DateTime dateTime1 = dateTime0.withMillis(0L);
        org.joda.time.DateTime dateTime2 = dateTime0.withYear(457);
        org.junit.Assert.assertFalse(dateTime2.equals(((java.lang.Object)(dateTime1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("", 844);
        dateTimeZoneBuilder1.setStandardOffset(711);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder1.toDateTimeZone("", true)));
        org.junit.Assert.assertTrue(fixedDateTimeZone0.isFixed());
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        dateTimeZoneBuilder0.addRecurringSavings("The offset cannot be zero", 2216, 2216, 2216, 'u', 2216, 2216, 2216, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(80, 'u', 2297, 2297, 0, false, 2216);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings("CM|4D.{p5Db<$6f>", 0);
        org.junit.Assert.assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        dateTimeZoneBuilder0.setFixedSavings("NoYears", 1001);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(1001, 'w', 1001, 1, 0, true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(0, 'w', 2163, 1, 2983, true, (-4053));
        org.junit.Assert.assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[3];
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(byteArrayInputStream0)));
        long long0 = org.joda.time.tz.DateTimeZoneBuilder.readMillis(dataInputStream0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[3];
        byteArray0[0] = ((byte)(43));
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.BufferedInputStream bufferedInputStream0 = new java.io.BufferedInputStream(((java.io.InputStream)(byteArrayInputStream0)));
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(bufferedInputStream0)));
        long long0 = org.joda.time.tz.DateTimeZoneBuilder.readMillis(dataInputStream0);
        org.junit.Assert.assertEquals((-37800000L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readMillis(((java.io.DataInput)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        dateTimeZoneBuilder0.setStandardOffset((-587));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder0.toDateTimeZone("UTC", false)));
        org.junit.Assert.assertTrue(fixedDateTimeZone0.isFixed());
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover((-2263), 'M', 3600000, 357, (-2263), true, 2049);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings("0/]", (-2263));
        org.junit.Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder2);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[4];
        byteArray0[0] = ((byte)(81));
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(byteArrayInputStream0)));
        long long0 = org.joda.time.tz.DateTimeZoneBuilder.readMillis(dataInputStream0);
        org.junit.Assert.assertEquals(0, byteArrayInputStream0.available());
        org.junit.Assert.assertEquals(17112760320000L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.previousTransition((-766623600030L));
        org.junit.Assert.assertEquals((-781052400001L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.previousTransition((-766623600000L));
        org.junit.Assert.assertEquals((-766623600001L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isStandardOffset(1000L);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isStandardOffset((-766623600000L));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.joda.time.Duration duration0 = org.joda.time.Duration.millis(1);
        org.joda.time.Duration duration1 = duration0.minus(9223372036854775807L);
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime(1 , 1 , 1 , 1 , 1 , 1);
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)(duration1)) , ((org.joda.time.ReadableInstant)(dateTime0)));
        org.joda.time.DateTime dateTime1 = dateTime0.minus(((org.joda.time.ReadablePeriod)(mutablePeriod0)));
        org.junit.Assert.assertEquals(9223309901261075806L, dateTime1.getMillis());
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("-Summer", (-1), (-1), 90, 's', 2147483645, 2147483645, 36, true, 2147483645);
        org.junit.Assert.assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-587));
        java.io.ByteArrayOutputStream byteArrayOutputStream0 = new java.io.ByteArrayOutputStream();
        java.io.BufferedOutputStream bufferedOutputStream0 = new java.io.BufferedOutputStream(((java.io.OutputStream)(byteArrayOutputStream0)));
        dateTimeZoneBuilder0.writeTo("Unknownmode: ", ((java.io.OutputStream)(bufferedOutputStream0)));
        org.junit.Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings(((java.lang.String)(null)), 704, 969, 0, '1', 1119, 704, ((byte)(122)), true, ((byte)(122)));
        org.junit.Assert.assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        java.io.ByteArrayOutputStream byteArrayOutputStream0 = new java.io.ByteArrayOutputStream();
        java.io.BufferedOutputStream bufferedOutputStream0 = new java.io.BufferedOutputStream(((java.io.OutputStream)(byteArrayOutputStream0)));
        java.io.ObjectOutputStream objectOutputStream0 = new java.io.ObjectOutputStream(((java.io.OutputStream)(bufferedOutputStream0)));
        org.joda.time.tz.DateTimeZoneBuilder.writeMillis(objectOutputStream0, 9223247816355600000L);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        java.io.ByteArrayOutputStream byteArrayOutputStream0 = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream0 = new java.io.ObjectOutputStream(((java.io.OutputStream)(byteArrayOutputStream0)));
        org.joda.time.tz.DateTimeZoneBuilder.writeMillis(objectOutputStream0, 10000L);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(null)));
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.InputStream)(dataInputStream0)), "");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset(9223372036854775807L);
        org.junit.Assert.assertEquals(3600000, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isFixed();
        org.junit.Assert.assertFalse(boolean0);
    }
}

