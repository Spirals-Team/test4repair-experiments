package org.joda.time.tz;


public class DateTimeZoneBuilder_ESTest extends org.joda.time.tz.DateTimeZoneBuilder_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("MockZone", (-571));
        dateTimeZoneBuilder0.setStandardOffset((-366));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder1.toDateTimeZone("MockZone", false)));
        org.junit.Assert.assertTrue(fixedDateTimeZone0.isFixed());
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(2007);
        dateTimeZoneBuilder0.addCutover(0, 's', 192, 6, (-2727), false, (-2727));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.addCutover(1, 's', 192, 0, 2259, false, 2259);
        org.junit.Assert.assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder1);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[2];
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.SequenceInputStream sequenceInputStream0 = new java.io.SequenceInputStream(((java.io.InputStream)(byteArrayInputStream0)) , ((java.io.InputStream)(byteArrayInputStream0)));
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(sequenceInputStream0)));
        long long0 = org.joda.time.tz.DateTimeZoneBuilder.readMillis(dataInputStream0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[4];
        byteArray0[0] = ((byte)(32));
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(byteArrayInputStream0)));
        long long0 = org.joda.time.tz.DateTimeZoneBuilder.readMillis(dataInputStream0);
        org.junit.Assert.assertEquals((-57600000L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readMillis(((java.io.DataInput)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.InputStream)(null)), ";Ra/`'NC7");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(null)));
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.DataInput)(dataInputStream0)), ((java.lang.String)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(gJChronology0.getZone()));
        long long0 = cachedDateTimeZone0.previousTransition((-9223372036854775782L));
        org.junit.Assert.assertEquals((-9223372036854775782L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getOffsetFromLocal(3540L);
        org.junit.Assert.assertEquals(3600000, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(gJChronology0.getZone()));
        long long0 = cachedDateTimeZone0.previousTransition(-9223372036854775808L);
        org.junit.Assert.assertEquals(-9223372036854775808L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset(-9223372036854775808L);
        org.junit.Assert.assertEquals(561000, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset(2863L);
        org.junit.Assert.assertEquals(3600000, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.joda.time.Duration duration0 = org.joda.time.Duration.standardDays(31622400000L);
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period0 = duration0.toPeriodFrom(((org.joda.time.ReadableInstant)(null)), periodType0);
        org.junit.Assert.assertNotNull(period0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(0, 'w', 192, 6, (-2727), false, (-2727));
        dateTimeZoneBuilder0.addCutover(1, 'w', 192, 0, 2259, false, (-3417));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings("QZ%_swS WYF>N4lOl", (-3417));
        org.junit.Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder2);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        dateTimeZoneBuilder0.setStandardOffset((-373));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder0.toDateTimeZone("+01:00", false)));
        org.junit.Assert.assertEquals("+01:00", fixedDateTimeZone0.getID());
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("", 3538, 3538, 0, '|', 0, 3538, (-2227), false, 0);
        org.junit.Assert.assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        dateTimeZoneBuilder0.setFixedSavings("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone", 1998);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder0.toDateTimeZone("UTC", true)));
        org.junit.Assert.assertTrue(fixedDateTimeZone0.isFixed());
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder0.toDateTimeZone("UTC", true)));
        org.junit.Assert.assertEquals("UTC", fixedDateTimeZone0.getID());
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        java.io.ByteArrayOutputStream byteArrayOutputStream0 = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream0 = new java.io.ObjectOutputStream(((java.io.OutputStream)(byteArrayOutputStream0)));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone", 1998);
        java.io.DataOutputStream dataOutputStream0 = new java.io.DataOutputStream(((java.io.OutputStream)(objectOutputStream0)));
        dateTimeZoneBuilder0.writeTo("", ((java.io.OutputStream)(dataOutputStream0)));
        org.junit.Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isFixed();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getOffsetFromLocal(1392409281320L);
        org.junit.Assert.assertEquals(3600000, int0);
    }
}

