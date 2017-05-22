package org.joda.time;


public class Partial_ESTest extends org.joda.time.Partial_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 3293);
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime(((java.lang.Object)(null)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(dateTime0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 3293);
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, 32);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 3293);
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[millisOfDay=3293]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 3293);
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType0);
        org.junit.Assert.assertEquals(0, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("[]");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(copticChronology0);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int int0 = partial0.size();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod((-950) , 0 , 0 , 0);
        org.joda.time.Partial partial1 = partial0.plus(mutablePeriod0);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.TestDateMidnight_Basics testDateMidnight_Basics0 = new org.joda.time.TestDateMidnight_Basics("org.joda.time.convert.ConverterManager");
        org.joda.time.TestDateMidnight_Basics.MockInstant testDateMidnight_Basics_MockInstant0 = testDateMidnight_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testDateMidnight_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 9 , ((org.joda.time.Chronology)(iSOChronology0)));
        int[] intArray0 = partial0.getValues();
        org.junit.Assert.assertArrayEquals(new int[]{ 9 }, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.TestMutableInterval_Constructors testMutableInterval_Constructors0 = new org.joda.time.TestMutableInterval_Constructors("ReadablePartial objects must be contiguous");
        org.joda.time.TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.DateTimeField dateTimeField0 = partial0.getField(0, ((org.joda.time.Chronology)(iSOChronology0)));
        org.junit.Assert.assertNotNull(dateTimeField0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime(0L , ((org.joda.time.Chronology)(null)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDateTime0)));
        java.lang.String string0 = partial0.toStringList();
        org.junit.Assert.assertEquals("[year=1970, monthOfYear=1, dayOfMonth=1, millisOfDay=3600000]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.junit.Assert.assertEquals(0, partial0.size());
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime(0L , ((org.joda.time.Chronology)(null)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDateTime0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 32);
        org.junit.Assert.assertEquals(5, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        int[] intArray0 = new int[2];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(null)));
        org.junit.Assert.assertEquals(2, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics(((java.lang.String)(null)));
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.junit.Assert.assertEquals(0, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("ZonedChronology[");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(copticChronology0)));
        partial0.getChronology();
        org.junit.Assert.assertEquals(0, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 3293);
        int int0 = partial0.size();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("Eyp8-0pAs2");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(copticChronology0)));
        try {
            partial0.getFieldType(java.lang.Integer.MAX_VALUE);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 3293);
        int[] intArray0 = new int[2];
        org.joda.time.Partial partial1 = new org.joda.time.Partial(partial0 , intArray0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("Eyp8-0pAs2");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(copticChronology0)));
        int[] intArray0 = partial0.getValues();
        org.junit.Assert.assertEquals(0, partial0.size());
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.joda.time.TestYearMonthDay_Basics testYearMonthDay_Basics0 = new org.joda.time.TestYearMonthDay_Basics("z");
        org.joda.time.TestYearMonthDay_Basics.MockInstant testYearMonthDay_Basics_MockInstant0 = testYearMonthDay_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testYearMonthDay_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        int[] intArray0 = new int[3];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String string0 = partial0.toString("z", locale0);
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.TestDateMidnight_Basics testDateMidnight_Basics0 = new org.joda.time.TestDateMidnight_Basics("org.joda.time.convert.ConverterManager");
        org.joda.time.TestDateMidnight_Basics.MockInstant testDateMidnight_Basics_MockInstant0 = testDateMidnight_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testDateMidnight_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 9 , ((org.joda.time.Chronology)(iSOChronology0)));
        java.lang.String string0 = partial0.toString(((java.lang.String)(null)));
        org.junit.Assert.assertEquals("-09", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 3293);
        partial0.toString();
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("3293", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("Eyp8-0pAs2");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(copticChronology0)));
        partial0.getFormatter();
        org.junit.Assert.assertEquals(0, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime(0L , ((org.joda.time.Chronology)(null)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDateTime0)));
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[year=1970, monthOfYear=1, dayOfMonth=1, millisOfDay=3600000]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime(0L , ((org.joda.time.Chronology)(null)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDateTime0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial1.getFormatter();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals(5, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime(0L , ((org.joda.time.Chronology)(null)));
        org.joda.time.LocalDateTime localDateTime1 = localDateTime0.plusHours(32);
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDateTime1)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(localDateTime0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime(0L , ((org.joda.time.Chronology)(null)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDateTime0)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(localDateTime0)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.joda.time.TestYearMonthDay_Basics testYearMonthDay_Basics0 = new org.joda.time.TestYearMonthDay_Basics("z");
        org.joda.time.TestYearMonthDay_Basics.MockInstant testYearMonthDay_Basics_MockInstant0 = testYearMonthDay_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testYearMonthDay_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[3];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime0 = instant0.toDateTime(((org.joda.time.Chronology)(copticChronology0)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(dateTime0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 3317);
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime(((java.lang.Object)(null)));
        org.joda.time.DateTime dateTime1 = dateTime0.withField(dateTimeFieldType0, 3317);
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(dateTime1)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod((-950) , 0 , 0 , 0);
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(mutablePeriod0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
        org.junit.Assert.assertEquals(0, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Partial partial1 = partial0.minus(((org.joda.time.ReadablePeriod)(null)));
        org.junit.Assert.assertEquals(0, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 3293);
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, 3293);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 3293);
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, 7593750);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime(0L , ((org.joda.time.Chronology)(null)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDateTime0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 32);
        org.joda.time.Partial partial2 = partial1.without(dateTimeFieldType0);
        org.junit.Assert.assertTrue(partial2.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime(0L , ((org.joda.time.Chronology)(null)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDateTime0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType0);
        org.junit.Assert.assertEquals(4, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 3293);
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 985);
        org.junit.Assert.assertEquals(1, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 3317);
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 3317);
        org.junit.Assert.assertEquals(1, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 3293);
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(((org.joda.time.Chronology)(null)));
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String string0 = partial0.toString(((java.lang.String)(null)), locale0);
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test73() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , (-903));
        org.joda.time.Partial partial0 = partial_Property0.getPartial();
        org.junit.Assert.assertNull(partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test74() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , (-3050));
        org.joda.time.ReadablePartial readablePartial0 = partial_Property0.getReadablePartial();
        org.junit.Assert.assertNull(readablePartial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test79() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 3293);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test80() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 3293);
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime(((java.lang.Object)(null)));
        org.joda.time.Duration duration0 = org.joda.time.Duration.millis(3293);
        org.joda.time.Period period0 = duration0.toPeriodTo(((org.joda.time.ReadableInstant)(dateTime0)));
        org.joda.time.Partial partial1 = partial0.minus(period0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test81() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 3293);
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime(((java.lang.Object)(null)));
        org.joda.time.Duration duration0 = org.joda.time.Duration.millis(3293);
        org.joda.time.Period period0 = duration0.toPeriodTo(((org.joda.time.ReadableInstant)(dateTime0)));
        org.joda.time.Partial partial1 = partial0.plus(period0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test82() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 3317);
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime(((java.lang.Object)(null)));
        org.joda.time.Duration duration0 = org.joda.time.Duration.millis(3317);
        org.joda.time.Period period0 = duration0.toPeriodTo(((org.joda.time.ReadableInstant)(dateTime0)));
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(period0, 3317);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[7];
        org.joda.time.TestLocalDate_Basics.main(stringArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test85() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 719527);
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals(719527, partial_Property0.get());
    }
}

