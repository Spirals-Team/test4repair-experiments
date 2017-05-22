package org.joda.time;


public class Partial_ESTest extends org.joda.time.Partial_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.TestBasePartial.MockPartial testBasePartial_MockPartial0 = new org.joda.time.TestBasePartial.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testBasePartial_MockPartial0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.junit.Assert.assertEquals(1, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("|KU94BVu");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.field.PreciseDateTimeField preciseDateTimeField0 = ((org.joda.time.field.PreciseDateTimeField)(partial_Property0.getField()));
        org.junit.Assert.assertTrue(preciseDateTimeField0.isSupported());
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod(((long)(61)) , 59000L);
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(mutablePeriod0, (-1468));
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        int int0 = partial0.size();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 976);
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals(976, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Period period0 = new org.joda.time.Period(((org.joda.time.ReadablePartial)(partial0)) , ((org.joda.time.ReadablePartial)(partial0)));
        org.joda.time.Partial partial1 = partial0.plus(period0);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Duration duration0 = org.joda.time.Duration.standardDays(0L);
        org.joda.time.Hours hours0 = duration0.toStandardHours();
        org.joda.time.Partial partial1 = partial0.minus(hours0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int[] intArray0 = partial0.getValues();
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("|KU94BVu");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.DateTimeField dateTimeField0 = partial0.getField(0, ((org.joda.time.Chronology)(iSOChronology0)));
        org.junit.Assert.assertNotNull(dateTimeField0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("|KU94BVu");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        java.lang.String string0 = partial0.toStringList();
        org.junit.Assert.assertEquals("[secondOfDay=0]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertNull(dateTimeFormatter0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 976);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertNull(dateTimeFormatter0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("|KU94BVu");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(((org.joda.time.ReadablePeriod)(null)), 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("|KU94BVu");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.chrono.ISOChronology iSOChronology1 = ((org.joda.time.chrono.ISOChronology)(partial0.getChronology()));
        org.junit.Assert.assertNotSame(iSOChronology0, iSOChronology1);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("|KU94BVu");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        int int0 = partial0.size();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 976);
        try {
            partial0.getFieldType(2040);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("|KU94BVu");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        int[] intArray1 = partial0.getValues();
        org.junit.Assert.assertArrayEquals(new int[]{ 0 }, intArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)));
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial1 = new org.joda.time.Partial(partial0 , intArray0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 976);
        partial0.toString();
        java.lang.String string0 = partial0.toString(((java.lang.String)(null)));
        org.junit.Assert.assertEquals("[yearOfEra=976]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String string0 = partial0.toString(((java.lang.String)(null)), locale0);
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("|KU94BVu");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime(1L , ((org.joda.time.DateTimeZone)(cachedDateTimeZone0)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(localTime0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("|KU94BVu");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.TestLocalDateTime_Basics testLocalDateTime_Basics0 = new org.joda.time.TestLocalDateTime_Basics("---.000");
        org.joda.time.TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(testLocalDateTime_Basics_MockInstant0)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 976);
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(instant0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime(336L);
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(dateTime0)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("|KU94BVu");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("|KU94BVu");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, 120);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType0);
        org.junit.Assert.assertEquals(0, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 976);
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 976);
        org.junit.Assert.assertEquals(1, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.joda.time.TestYearMonthDay_Basics testYearMonthDay_Basics0 = new org.joda.time.TestYearMonthDay_Basics("");
        testYearMonthDay_Basics0.testCompareTo();
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 976);
        org.joda.time.TestInterval_Basics testInterval_Basics0 = new org.joda.time.TestInterval_Basics(") ");
        org.joda.time.TestInterval_Basics.MockInterval testInterval_Basics_MockInterval0 = testInterval_Basics0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testInterval_Basics_MockInterval0.getChronology()));
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(iSOChronology0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.TestYearMonthDay_Basics testYearMonthDay_Basics0 = new org.joda.time.TestYearMonthDay_Basics("");
        org.joda.time.TestYearMonthDay_Basics.MockInstant testYearMonthDay_Basics_MockInstant0 = testYearMonthDay_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testYearMonthDay_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(copticChronology0);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime(0L);
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDateTime0)));
        org.junit.Assert.assertEquals(4, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 32);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 32);
        org.joda.time.Partial partial1 = partial_Property0.getPartial();
        org.junit.Assert.assertSame(partial0, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test71() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , 0);
        org.joda.time.ReadablePartial readablePartial0 = partial_Property0.getReadablePartial();
        org.junit.Assert.assertNull(readablePartial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test73() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 976);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test74() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("|KU94BVu");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Duration duration0 = org.joda.time.Duration.millis(4L);
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Period period0 = new org.joda.time.Period(((org.joda.time.ReadableDuration)(duration0)) , ((org.joda.time.ReadableInstant)(testMutableDateTime_Basics_MockInstant0)) , periodType0);
        org.joda.time.Partial partial1 = partial0.minus(period0);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test75() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("|KU94BVu");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        partial0.plus(((org.joda.time.ReadablePeriod)(null)));
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[secondOfDay=0]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test76() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 976);
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 431);
        org.junit.Assert.assertEquals(1, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test77() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("|KU94BVu");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        partial0.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertTrue(dateTimeFormatter0.isPrinter());
    }

    @org.junit.Test(timeout = 4000)
    public void test78() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("|KU94BVu");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType0);
        org.junit.Assert.assertEquals(0, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test80() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , (-28));
        try {
            partial_Property0.addWrapFieldToCopy((-28));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }
}

