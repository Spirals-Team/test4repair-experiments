package org.joda.time;


public class Partial_ESTest extends org.joda.time.Partial_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1872));
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 32);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 289);
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial1 = partial0.withFieldAdded(durationFieldType0, 289);
        boolean boolean0 = partial1.isMatch(((org.joda.time.ReadablePartial)(partial0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[3];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.minuteOfHour();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
        int[] intArray0 = new int[3];
        intArray0[1] = 61;
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType2);
        org.junit.Assert.assertEquals(2, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , 44);
        org.joda.time.ReadablePartial readablePartial0 = partial_Property0.getReadablePartial();
        org.junit.Assert.assertNull(readablePartial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[hourOfHalfday=0]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Period period0 = new org.joda.time.Period((-2716) , (-2716) , 7 , 1651);
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(period0, 7);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(mockNullZoneChronology0)));
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(instant0.getChronology()));
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(iSOChronology0);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int int0 = partial0.size();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Partial partial1 = partial0.plus(((org.joda.time.ReadablePeriod)(null)));
        org.junit.Assert.assertSame(partial0, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Partial partial1 = partial0.minus(((org.joda.time.ReadablePeriod)(null)));
        org.junit.Assert.assertSame(partial0, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("hP8wgg\t\'c^Z");
        org.joda.time.TestDateTime_Basics.MockInstant testDateTime_Basics_MockInstant0 = testDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1872));
        org.joda.time.DateTimeField dateTimeField0 = partial0.getField(0, ((org.joda.time.Chronology)(iSOChronology0)));
        org.junit.Assert.assertNotNull(dateTimeField0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1850));
        java.lang.String string0 = partial0.toStringList();
        org.junit.Assert.assertEquals("[weekyear=-1850]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertNull(dateTimeFormatter0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1872));
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(((org.joda.time.ReadablePeriod)(null)), (-1872));
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(partial0.getChronology()));
        org.junit.Assert.assertNotNull(iSOChronology0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        int int0 = partial0.size();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("");
        org.joda.time.TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(testDateTime_Basics_MockEqualsChronology0 , ((org.joda.time.DateTimeFieldType[])(null)) , ((int[])(null)));
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.SECONDS_TYPE;
        try {
            partial0.withFieldAdded(durationFieldType0, 716);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        try {
            partial0.getFieldType((-1));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int[] intArray0 = new int[2];
        org.joda.time.Partial partial1 = new org.joda.time.Partial(partial0 , intArray0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[3];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfSecond();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
        int[] intArray0 = new int[3];
        intArray0[1] = 49;
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        int[] intArray1 = partial0.getValues();
        org.junit.Assert.assertNotSame(intArray0, intArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1846));
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String string0 = partial0.toString(((java.lang.String)(null)), locale0);
        org.junit.Assert.assertEquals("-1846", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        java.lang.String string0 = partial0.toString(((java.lang.String)(null)));
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[3];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.minuteOfHour();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
        int[] intArray0 = new int[3];
        intArray0[1] = 61;
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[year=0, yearOfEra=61, minuteOfHour=0]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1798));
        partial0.getFormatter();
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("-1798", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[3];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfSecond();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
        int[] intArray0 = new int[3];
        intArray0[1] = 49;
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertTrue(dateTimeFormatter0.isPrinter());
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1798));
        partial0.getFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertFalse(dateTimeFormatter0.isOffsetParsed());
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1872));
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial1 = partial0.withFieldAdded(durationFieldType0, (-1872));
        boolean boolean0 = partial1.isMatch(((org.joda.time.ReadablePartial)(partial0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1850));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(partial0)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(mutableDateTime0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("hP8wgg\t\'c^Z");
        org.joda.time.TestDateTime_Basics.MockInstant testDateTime_Basics_MockInstant0 = testDateTime_Basics0.new MockInstant();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1798));
        org.joda.time.DateTime dateTime0 = partial0.toDateTime(testDateTime_Basics_MockInstant0);
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(dateTime0)));
        org.junit.Assert.assertEquals((-118898102085000L), dateTime0.getMillis());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[3];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.secondOfDay();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
        int[] intArray0 = new int[3];
        org.joda.time.TestMutableInterval_Constructors testMutableInterval_Constructors0 = new org.joda.time.TestMutableInterval_Constructors("");
        org.joda.time.TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Constructors_MockInterval0.getChronology()));
        intArray0[1] = 49;
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.Period period0 = new org.joda.time.Period(((long)(32)) , 0L , periodType0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = partial0.minus(period0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(instant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Period period0 = org.joda.time.Period.hours(873);
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(period0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1850));
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial1 = partial0.withFieldAdded(durationFieldType0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1872));
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, (-1872));
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1858));
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial1 = partial0.withFieldAdded(durationFieldType0, (-1858));
        org.joda.time.Partial partial2 = partial1.withField(dateTimeFieldType0, (-1858));
        org.junit.Assert.assertTrue(partial2.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial2, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1850));
        org.joda.time.Partial partial1 = partial0.without(((org.joda.time.DateTimeFieldType)(null)));
        org.junit.Assert.assertSame(partial0, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1858));
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 1400);
        org.joda.time.Partial.Property partial_Property0 = partial1.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals(1400, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        org.joda.time.TestMonthDay_Basics testMonthDay_Basics0 = new org.joda.time.TestMonthDay_Basics("");
        testMonthDay_Basics0.testCompareTo();
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1858));
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, (-1858));
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("hP8wgg\t\'c^Z");
        org.joda.time.TestDateTime_Basics.MockInstant testDateTime_Basics_MockInstant0 = testDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1798));
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(iSOChronology0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime((-2051L));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDateTime0)));
        org.junit.Assert.assertEquals(4, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test73() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("M^H`OzFCJZ?");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(copticChronology0)));
        org.junit.Assert.assertEquals(0, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test79() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1798));
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        partial_Property0.addToCopy(45);
        org.junit.Assert.assertEquals((-1798), partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test80() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[3];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfSecond();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
        int[] intArray0 = new int[3];
        intArray0[1] = 49;
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , (-1));
        org.joda.time.Partial partial1 = partial_Property0.getPartial();
        org.junit.Assert.assertEquals(3, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test81() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1850));
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        partial_Property0.withMaximumValue();
        org.junit.Assert.assertEquals((-1850), partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test82() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1846));
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        partial_Property0.addWrapFieldToCopy((-1846));
        org.junit.Assert.assertEquals((-1846), partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test84() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[3];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfSecond();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
        int[] intArray0 = new int[3];
        intArray0[1] = 49;
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = partial0.getFieldTypes();
        org.junit.Assert.assertNotSame(dateTimeFieldTypeArray0, dateTimeFieldTypeArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test85() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1846));
        org.joda.time.Partial partial1 = partial0.plus(((org.joda.time.ReadablePeriod)(null)));
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test86() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1850));
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, (-1850));
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test87() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(instant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0 , ((org.joda.time.Chronology)(iSOChronology0)));
        int int0 = partial0.getValue(0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test88() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1850));
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType0);
        org.junit.Assert.assertEquals(0, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test89() throws java.lang.Throwable {
        org.joda.time.TestMutableInterval_Constructors testMutableInterval_Constructors0 = new org.joda.time.TestMutableInterval_Constructors("");
        org.joda.time.TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        int[] intArray0 = partial0.getValues();
        org.junit.Assert.assertEquals(0, partial0.size());
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test90() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-1850));
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.joda.time.Partial partial1 = partial_Property0.setCopy((-1850));
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }
}

