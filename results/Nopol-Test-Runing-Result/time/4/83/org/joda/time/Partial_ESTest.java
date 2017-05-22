package org.joda.time;


public class Partial_ESTest extends org.joda.time.Partial_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDateTime0)));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.DateTime dateTime0 = org.joda.time.DateTime.now(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(dateTime0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, (-2318));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.Partial partial1 = partial0.withFieldAdded(durationFieldType0, 1);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, 1287);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("Types array must not contain null: index ");
        org.joda.time.TestDateTime_Basics.MockInstant testDateTime_Basics_MockInstant0 = testDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 651 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.junit.Assert.assertEquals(1, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , 2011);
        org.joda.time.ReadablePartial readablePartial0 = partial_Property0.getReadablePartial();
        org.junit.Assert.assertNull(readablePartial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        partial_Property0.getField();
        org.junit.Assert.assertEquals(814, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 784);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        java.util.Locale locale0 = java.util.Locale.ROOT;
        partial_Property0.setCopy("0000", locale0);
        org.junit.Assert.assertEquals(784, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDateTime0)));
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.Partial partial1 = partial0.plus(period0);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.Instant instant0 = new org.joda.time.Instant(((long)(0)));
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(instant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Period period0 = new org.joda.time.Period(0L , ((long)(0)));
        org.joda.time.Partial partial1 = partial0.minus(period0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)));
        int[] intArray0 = partial0.getValues();
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.setCopy(0);
        partial1.getValue(0);
        org.junit.Assert.assertEquals(814, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        org.joda.time.DateTimeField dateTimeField0 = partial0.getField(0, ((org.joda.time.Chronology)(null)));
        org.junit.Assert.assertNotNull(dateTimeField0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)) , ((org.joda.time.DateTimeFieldType[])(null)) , intArray0);
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        try {
            partial0.without(dateTimeFieldType0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("");
        org.joda.time.TestDateTime_Basics.MockInstant testDateTime_Basics_MockInstant0 = testDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(iSOChronology0 , dateTimeFieldTypeArray0 , intArray0);
        try {
            partial0.getFieldType(446);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.TestMutableInterval_Basics testMutableInterval_Basics0 = new org.joda.time.TestMutableInterval_Basics("");
        org.joda.time.TestMutableInterval_Basics.MockInterval testMutableInterval_Basics_MockInterval0 = testMutableInterval_Basics0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Basics_MockInterval0.getChronology()));
        try {
            partial0.getField((-1), ((org.joda.time.Chronology)(iSOChronology0)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.joda.time.Instant instant0 = new org.joda.time.Instant(((long)(0)));
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(instant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertNull(dateTimeFormatter0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.Period period0 = new org.joda.time.Period(944 , 944 , 0 , 1);
        org.joda.time.Seconds seconds0 = period0.toStandardSeconds();
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(seconds0, 32);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(partial0.getChronology()));
        org.junit.Assert.assertNotNull(iSOChronology0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        int int0 = partial0.size();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = partial0.getFieldType(1);
        org.junit.Assert.assertEquals("monthOfYear", dateTimeFieldType0.getName());
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        int int0 = partial0.getValue(0);
        org.junit.Assert.assertEquals(814, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[6];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)) , dateTimeFieldTypeArray0 , ((int[])(null)));
        org.joda.time.Partial partial1 = new org.joda.time.Partial(partial0 , ((int[])(null)));
        org.junit.Assert.assertEquals(6, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        int[] intArray0 = partial0.getValues();
        org.junit.Assert.assertArrayEquals(new int[]{ 814 }, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        java.lang.String string0 = partial0.toString("0000");
        org.junit.Assert.assertEquals("0000", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.setCopy(0);
        partial1.toString(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(814, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        java.lang.String string0 = partial0.toString(((java.lang.String)(null)), locale0);
        org.junit.Assert.assertEquals("[centuryOfEra=0]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)));
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(localDate0)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(localDateTime0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTime dateTime0 = org.joda.time.DateTime.now(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(dateTime0)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDateTime0)));
        org.joda.time.TestMutableInterval_Constructors testMutableInterval_Constructors0 = new org.joda.time.TestMutableInterval_Constructors("C?tr`(E,@*IS^");
        org.joda.time.TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod(((long)(0)) , ((long)(0)) , ((org.joda.time.PeriodType)(null)) , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(mutablePeriod0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 1);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.Partial partial1 = partial0.withFieldAdded(durationFieldType0, (-939));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, 814);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.hourOfDay();
        partial0.without(dateTimeFieldType1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertEquals(2000, dateTimeFormatter0.getDefaultYear());
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 86400);
        org.joda.time.DateTime dateTime0 = org.joda.time.DateTime.now(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        boolean boolean0 = partial1.isMatch(((org.joda.time.ReadableInstant)(dateTime0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 0);
        org.joda.time.Partial.Property partial_Property0 = partial1.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals(0, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(((org.joda.time.Chronology)(null)));
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test74() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.TestYearMonth_Basics testYearMonth_Basics0 = new org.joda.time.TestYearMonth_Basics("m\"\"vm`");
        org.joda.time.TestYearMonth_Basics.MockYM testYearMonth_Basics_MockYM0 = testYearMonth_Basics0.new MockYM();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testYearMonth_Basics_MockYM0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(copticChronology0)));
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(mockNullZoneChronology0);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test79() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        partial_Property0.withMinimumValue();
        org.junit.Assert.assertEquals(814, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test80() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.withMaximumValue();
        boolean boolean0 = partial1.isMatch(((org.joda.time.ReadablePartial)(partial0)));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(814, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test81() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.addToCopy((-1));
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test82() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 784);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        partial_Property0.getMinimumValue();
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("0784", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.addWrapFieldToCopy(0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertEquals(814, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test85() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(((org.joda.time.ReadablePeriod)(null)), 20);
        org.junit.Assert.assertEquals(0, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test87() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.Period period0 = new org.joda.time.Period((-939) , 0 , (-2318) , 0 , 1 , 32 , (-939) , 944);
        org.joda.time.Partial partial1 = partial0.minus(period0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test88() throws java.lang.Throwable {
        org.joda.time.Instant instant0 = new org.joda.time.Instant(((long)(0)));
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(instant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        org.junit.Assert.assertEquals(0, partial0.size());
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod(0 , 0 , (-1496) , 0);
        org.joda.time.Partial partial1 = partial0.plus(mutablePeriod0);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test89() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.setCopy(0);
        org.joda.time.Partial partial2 = partial1.with(dateTimeFieldType0, 0);
        org.junit.Assert.assertEquals(814, partial_Property0.get());
        org.junit.Assert.assertSame(partial2, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test90() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType0);
        int int0 = partial1.size();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test91() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)));
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 93);
        org.joda.time.Partial partial1 = partial_Property0.getPartial();
        org.junit.Assert.assertEquals(0, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test93() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 814);
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals(814, partial_Property0.get());
    }
}

