package org.joda.time.tz;


public class DateTimeZoneBuilder_ESTest extends org.joda.time.tz.DateTimeZoneBuilder_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-1394));
        dateTimeZoneBuilder1.addCutover(65, 'w', (-1394), 1, 317351877, true, 61);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover((-1394), 'w', 98, 66, 2557, false, (-775));
        org.junit.Assert.assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder1);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[7];
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(byteArrayInputStream0)));
        long long0 = org.joda.time.tz.DateTimeZoneBuilder.readMillis(dataInputStream0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[7];
        byteArray0[0] = ((byte)(69));
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(byteArrayInputStream0)));
        long long0 = org.joda.time.tz.DateTimeZoneBuilder.readMillis(dataInputStream0);
        org.junit.Assert.assertEquals(3, byteArrayInputStream0.available());
        org.junit.Assert.assertEquals(5033164800000L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("!5>", (-236), (-938), (-337), 'u', 10, (-337), 'u', false, 4279);
        dateTimeZoneBuilder1.toDateTimeZone("++a#O4a9K`0Wg9SE|", false);
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
    public void test17() throws java.lang.Throwable {
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.InputStream)(null)), "Fixing duplicate name key - ");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-337));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder1.toDateTimeZone("x~", false)));
        org.junit.Assert.assertEquals("x~", fixedDateTimeZone0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod(((long)(160)));
        mutablePeriod0.setPeriod(((long)(160)), (-2557L));
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isStandardOffset(955L);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover((-3699), 'g', (-3699), (-782), 2005, true, (-2056));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setStandardOffset((-3699));
        org.junit.Assert.assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings(((java.lang.String)(null)), (-870), 795, 66, '$', 80, 66, (-870), false, 1382);
        org.junit.Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        java.io.ByteArrayOutputStream byteArrayOutputStream0 = new java.io.ByteArrayOutputStream();
        java.io.DataOutputStream dataOutputStream0 = new java.io.DataOutputStream(((java.io.OutputStream)(byteArrayOutputStream0)));
        org.joda.time.tz.DateTimeZoneBuilder.writeMillis(dataOutputStream0, 1396141200000L);
        org.junit.Assert.assertEquals("Ac\ufffd", byteArrayOutputStream0.toString());
        org.junit.Assert.assertEquals(4, byteArrayOutputStream0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        java.io.ByteArrayOutputStream byteArrayOutputStream0 = new java.io.ByteArrayOutputStream();
        java.io.DataOutputStream dataOutputStream0 = new java.io.DataOutputStream(((java.io.OutputStream)(byteArrayOutputStream0)));
        org.joda.time.tz.DateTimeZoneBuilder.writeMillis(dataOutputStream0, 113542835878800000L);
        org.junit.Assert.assertEquals("\ufffd\ufffdb\ufffd\ufffdX\ufffd\ufffd", byteArrayOutputStream0.toString());
        org.junit.Assert.assertEquals(9, byteArrayOutputStream0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod(((long)(160)));
        mutablePeriod0.add(((long)(3)), ((org.joda.time.Chronology)(null)));
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-3699));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings("`9K!CQ<", 2005);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder2.toDateTimeZone("!Mvy\"q>8%L{x", true)));
        org.junit.Assert.assertTrue(fixedDateTimeZone0.isFixed());
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("!5>", (-236), (-938), (-337), 'u', 10, (-337), 0, false, 4279);
        dateTimeZoneBuilder1.addCutover((-236), 'u', 0, (-236), 4279, false, (-236));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setStandardOffset((-337));
        org.junit.Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder2);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset(113542886077200000L);
        org.junit.Assert.assertEquals(3600000, int0);
    }
}

