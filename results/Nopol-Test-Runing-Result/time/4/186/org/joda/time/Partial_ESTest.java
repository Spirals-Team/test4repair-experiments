package org.joda.time;


public class Partial_ESTest extends org.joda.time.Partial_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.TestDateMidnight_Basics testDateMidnight_Basics0 = new org.joda.time.TestDateMidnight_Basics("Z3ysiZ1k'k[HU7,c><");
        org.joda.time.TestDateMidnight_Basics.MockInstant testDateMidnight_Basics_MockInstant0 = testDateMidnight_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testDateMidnight_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 698 , ((org.joda.time.Chronology)(iSOChronology0)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(testDateMidnight_Basics_MockInstant0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int[] intArray0 = new int[5];
        org.joda.time.Partial partial1 = new org.joda.time.Partial(partial0 , intArray0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-9) , ((org.joda.time.Chronology)(null)));
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.joda.time.Partial partial1 = partial_Property0.addToCopy((-272));
        org.junit.Assert.assertEquals(1, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.TestTimeOfDay_Basics testTimeOfDay_Basics0 = new org.joda.time.TestTimeOfDay_Basics("vcx7z!_1xV#IFfW");
        org.joda.time.TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 1);
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(testTimeOfDay_Basics_MockInstant0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Duration duration0 = org.joda.time.Duration.standardHours(0L);
        org.joda.time.Hours hours0 = duration0.toStandardHours();
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(hours0, 61);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-9) , ((org.joda.time.Chronology)(null)));
        org.joda.time.TestYearMonthDay_Basics testYearMonthDay_Basics0 = new org.joda.time.TestYearMonthDay_Basics("cnZwX>$f`JSg4`");
        org.joda.time.TestYearMonthDay_Basics.MockInstant testYearMonthDay_Basics_MockInstant0 = testYearMonthDay_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testYearMonthDay_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(copticChronology0);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int int0 = partial0.size();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0 , ((org.joda.time.Chronology)(null)));
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals(0, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 1);
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals(1, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Period period0 = org.joda.time.Period.weeks(0);
        org.joda.time.Minutes minutes0 = period0.toStandardMinutes();
        org.joda.time.Duration duration0 = minutes0.toStandardDuration();
        org.joda.time.Days days0 = duration0.toStandardDays();
        org.joda.time.Weeks weeks0 = days0.toStandardWeeks();
        org.joda.time.Partial partial1 = partial0.plus(weeks0);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Duration duration0 = org.joda.time.Duration.standardHours(0L);
        org.joda.time.Hours hours0 = duration0.toStandardHours();
        org.joda.time.Seconds seconds0 = hours0.toStandardSeconds();
        org.joda.time.Partial partial1 = partial0.minus(seconds0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int[] intArray0 = partial0.getValues();
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.TestLocalTime_Basics testLocalTime_Basics0 = new org.joda.time.TestLocalTime_Basics("YearWeekDayTime");
        org.joda.time.TestLocalTime_Basics.MockInstant testLocalTime_Basics_MockInstant0 = testLocalTime_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalTime_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeField dateTimeField0 = partial0.getField(0, ((org.joda.time.Chronology)(copticChronology0)));
        org.junit.Assert.assertNotNull(dateTimeField0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        try {
            partial0.getFieldType(6);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-9) , ((org.joda.time.Chronology)(null)));
        java.lang.String string0 = partial0.toStringList();
        org.junit.Assert.assertEquals("[year=-9]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.joda.time.TestInstant_Basics testInstant_Basics0 = new org.joda.time.TestInstant_Basics("JQ5l9SK_t}[G3rd");
        org.joda.time.TestInstant_Basics.MockInstant testInstant_Basics_MockInstant0 = testInstant_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testInstant_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertNull(dateTimeFormatter0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertTrue(dateTimeFormatter0.isParser());
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(((org.joda.time.ReadablePeriod)(null)), 1968);
        org.junit.Assert.assertSame(partial0, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-9) , ((org.joda.time.Chronology)(null)));
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(partial0.getChronology()));
        org.junit.Assert.assertNotNull(iSOChronology0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 1);
        int int0 = partial0.size();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.joda.time.MockPartial mockPartial0 = new org.joda.time.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(mockPartial0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[3];
        int[] intArray0 = new int[3];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(iSOChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.junit.Assert.assertEquals(3, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = partial0.getFieldType(0);
        org.junit.Assert.assertEquals("hourOfDay", dateTimeFieldType1.getName());
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        int int0 = partial0.getValue(0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 1);
        int[] intArray0 = partial0.getValues();
        org.junit.Assert.assertArrayEquals(new int[]{ 1 }, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String string0 = partial0.toString(((java.lang.String)(null)), locale0);
        org.junit.Assert.assertEquals("00", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        java.lang.String string0 = partial0.toString("[]");
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("00", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[era=0]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-9) , ((org.joda.time.Chronology)(null)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(partial0)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(instant0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(mutableDateTime0)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-9) , ((org.joda.time.Chronology)(null)));
        org.joda.time.Period period0 = new org.joda.time.Period(((org.joda.time.ReadablePartial)(partial0)) , ((org.joda.time.ReadablePartial)(partial0)) , ((org.joda.time.PeriodType)(null)));
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(period0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        partial0.plus(((org.joda.time.ReadablePeriod)(null)));
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[era=0]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-9) , ((org.joda.time.Chronology)(null)));
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, (-9));
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-9) , ((org.joda.time.Chronology)(null)));
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, (-284));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType1);
        org.junit.Assert.assertEquals(1, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 6);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 44);
        org.junit.Assert.assertEquals(1, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.TestBasePartial.MockPartial testBasePartial_MockPartial0 = new org.joda.time.TestBasePartial.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testBasePartial_MockPartial0.getChronology()));
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(iSOChronology0);
        org.junit.Assert.assertEquals(0, partial1.size());
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 1);
        org.joda.time.Partial partial1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(partial0)));
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.junit.Assert.assertEquals(1, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test72() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.TestInterval_Constructors testInterval_Constructors0 = new org.joda.time.TestInterval_Constructors("aL.+K|");
        org.joda.time.TestInterval_Constructors.MockInterval testInterval_Constructors_MockInterval0 = testInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.junit.Assert.assertEquals(0, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test79() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.getPartial();
        org.junit.Assert.assertEquals(1, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test80() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , (-2031));
        org.joda.time.ReadablePartial readablePartial0 = partial_Property0.getReadablePartial();
        org.junit.Assert.assertNull(readablePartial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test81() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-9) , ((org.joda.time.Chronology)(null)));
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        partial_Property0.setCopy((-2410));
        org.junit.Assert.assertEquals((-9), partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test84() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test85() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-9) , ((org.joda.time.Chronology)(null)));
        org.joda.time.Period period0 = new org.joda.time.Period(((org.joda.time.ReadablePartial)(partial0)) , ((org.joda.time.ReadablePartial)(partial0)) , ((org.joda.time.PeriodType)(null)));
        org.joda.time.Partial partial1 = partial0.minus(period0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test86() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-9) , ((org.joda.time.Chronology)(null)));
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, (-9));
        partial0.getFormatter();
        org.junit.Assert.assertSame(partial0, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test88() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-9) , ((org.joda.time.Chronology)(null)));
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.joda.time.Partial partial1 = partial_Property0.addWrapFieldToCopy(1);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertEquals((-9), partial_Property0.get());
    }
}

