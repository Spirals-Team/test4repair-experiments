package org.joda.time.tz;


public class DateTimeZoneBuilder_ESTest extends org.joda.time.tz.DateTimeZoneBuilder_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("Ayq}|XH_lzi7x7", 845, 0, 0, 'u', 1, 845, 0, false, 1);
        dateTimeZoneBuilder1.addCutover(0, 'u', 1279, 0, (-2359), true, 1279);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(((byte)(0)), 'u', 845, 1, 84, false, 1785);
        org.junit.Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder2);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[9];
        byteArray0[0] = ((byte)(-34));
        byteArray0[1] = ((byte)(65));
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(byteArrayInputStream0)));
        long long0 = org.joda.time.tz.DateTimeZoneBuilder.readMillis(dataInputStream0);
        org.junit.Assert.assertEquals(0, byteArrayInputStream0.available());
        org.junit.Assert.assertEquals(4683743612465315840L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[9];
        byteArray0[0] = ((byte)(-49));
        byteArray0[1] = ((byte)(-115));
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.SequenceInputStream sequenceInputStream0 = new java.io.SequenceInputStream(((java.io.InputStream)(byteArrayInputStream0)) , ((java.io.InputStream)(byteArrayInputStream0)));
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(sequenceInputStream0)));
        long long0 = org.joda.time.tz.DateTimeZoneBuilder.readMillis(dataInputStream0);
        org.junit.Assert.assertEquals(0, byteArrayInputStream0.available());
        org.junit.Assert.assertEquals((-8286623314361712640L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readMillis(((java.io.DataInput)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        java.io.ByteArrayOutputStream byteArrayOutputStream0 = new java.io.ByteArrayOutputStream(1);
        java.io.ObjectOutputStream objectOutputStream0 = new java.io.ObjectOutputStream(((java.io.OutputStream)(byteArrayOutputStream0)));
        dateTimeZoneBuilder0.writeTo("", ((java.io.DataOutput)(objectOutputStream0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        dateTimeZoneBuilder0.addCutover(26, '5', 67, 117, (-2397), false, 117);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder0.toDateTimeZone("String pool is too large", false)));
        org.junit.Assert.assertEquals("String pool is too large", fixedDateTimeZone0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.InputStream)(null)), "");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getOffsetFromLocal((-673L));
        org.junit.Assert.assertEquals(3600000, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isStandardOffset(0L);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        java.io.ByteArrayOutputStream byteArrayOutputStream0 = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream0 = new java.io.ObjectOutputStream(((java.io.OutputStream)(byteArrayOutputStream0)));
        dateTimeZoneBuilder0.writeTo("Ayq}|XH_lzi7x7", ((java.io.OutputStream)(objectOutputStream0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("", 1315, 3600000, 0, 'w', 3600000, 1546, 1546, true, 2040);
        org.junit.Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("UTC", 3335);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder1.toDateTimeZone("UTC", false)));
        org.junit.Assert.assertTrue(fixedDateTimeZone0.isFixed());
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        java.io.ByteArrayOutputStream byteArrayOutputStream0 = new java.io.ByteArrayOutputStream();
        java.io.BufferedOutputStream bufferedOutputStream0 = new java.io.BufferedOutputStream(((java.io.OutputStream)(byteArrayOutputStream0)));
        java.io.DataOutputStream dataOutputStream0 = new java.io.DataOutputStream(((java.io.OutputStream)(bufferedOutputStream0)));
        org.joda.time.tz.DateTimeZoneBuilder.writeMillis(dataOutputStream0, 63158400000L);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[0] = ((byte)(70));
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(byteArrayInputStream0)));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.DataInput)(dataInputStream0)), "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField")));
        org.junit.Assert.assertEquals("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField", fixedDateTimeZone0.getID());
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isFixed();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("yE/D$ztP=q7AR", 1707);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(1707, 'w', 0, 0, 1707, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.setStandardOffset(0);
        org.junit.Assert.assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)(null)));
        org.junit.Assert.assertNotNull(gJChronology0);
    }
}

