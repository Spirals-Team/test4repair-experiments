package org.joda.time;


public class Partial_ESTest extends org.joda.time.Partial_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.TestMutableInterval_Constructors testMutableInterval_Constructors0 = new org.joda.time.TestMutableInterval_Constructors(" < ");
        org.joda.time.TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 32);
        org.joda.time.TestDateMidnight_Basics testDateMidnight_Basics0 = new org.joda.time.TestDateMidnight_Basics("");
        org.joda.time.TestDateMidnight_Basics.MockInstant testDateMidnight_Basics_MockInstant0 = testDateMidnight_Basics0.new MockInstant();
        org.joda.time.DateTime dateTime0 = testDateMidnight_Basics_MockInstant0.toDateTime();
        boolean boolean0 = partial1.isMatch(((org.joda.time.ReadableInstant)(dateTime0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-4260));
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, (-4260));
        boolean boolean0 = partial1.isMatch(((org.joda.time.ReadablePartial)(partial0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 32 , ((org.joda.time.Chronology)(null)));
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, 0);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.TestTimeOfDay_Basics testTimeOfDay_Basics0 = new org.joda.time.TestTimeOfDay_Basics(" < ");
        org.joda.time.TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testTimeOfDay_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(copticChronology0);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.TestInterval_Constructors testInterval_Constructors0 = new org.joda.time.TestInterval_Constructors("2G[xN");
        org.joda.time.TestInterval_Constructors.MockInterval testInterval_Constructors_MockInterval0 = testInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(iSOChronology0);
        org.junit.Assert.assertSame(partial1, partial0);
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
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals(0, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 17);
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals(17, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Period period0 = new org.joda.time.Period(168L);
        org.joda.time.Partial partial1 = partial0.plus(period0);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Period period0 = new org.joda.time.Period(1545 , 1545 , 1545 , 4);
        org.joda.time.Partial partial1 = partial0.minus(period0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)));
        int[] intArray0 = partial0.getValues();
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        int int0 = partial0.getValue(0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.TestMutableInterval_Constructors testMutableInterval_Constructors0 = new org.joda.time.TestMutableInterval_Constructors(" < ");
        org.joda.time.TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("pH8pH0S;lP!");
        org.joda.time.TestMutableDateTime_Basics.MockEqualsChronology testMutableDateTime_Basics_MockEqualsChronology0 = testMutableDateTime_Basics0.new MockEqualsChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(testMutableDateTime_Basics_MockEqualsChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = partial0.getFieldType(0);
        org.junit.Assert.assertEquals("millisOfSecond", dateTimeFieldType1.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("@.");
        org.joda.time.TestMutableDateTime_Basics.MockEqualsChronology testMutableDateTime_Basics_MockEqualsChronology0 = testMutableDateTime_Basics0.new MockEqualsChronology();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField0 = ((org.joda.time.field.UnsupportedDateTimeField)(partial0.getField(0, ((org.joda.time.Chronology)(testMutableDateTime_Basics_MockEqualsChronology0)))));
        org.junit.Assert.assertEquals("year", unsupportedDateTimeField0.getName());
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate(29L);
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.DAYS_TYPE;
        org.joda.time.Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 32);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.joda.time.TestMutableInterval_Constructors testMutableInterval_Constructors0 = new org.joda.time.TestMutableInterval_Constructors(" < ");
        org.joda.time.TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertFalse(dateTimeFormatter0.isOffsetParsed());
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(((org.joda.time.ReadablePeriod)(null)), 1545);
        org.junit.Assert.assertSame(partial0, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(partial0.getChronology()));
        org.junit.Assert.assertNotNull(iSOChronology0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate(29L);
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        int int0 = partial0.size();
        org.junit.Assert.assertEquals(3, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("pH8pH0S;lP!");
        org.joda.time.TestMutableDateTime_Basics.MockEqualsChronology testMutableDateTime_Basics_MockEqualsChronology0 = testMutableDateTime_Basics0.new MockEqualsChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(testMutableDateTime_Basics_MockEqualsChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = partial0.getFieldType(0);
        org.junit.Assert.assertNull(dateTimeFieldType0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.junit.Assert.assertEquals(0, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial1 = new org.joda.time.Partial(partial0 , intArray0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        int[] intArray0 = partial0.getValues();
        org.junit.Assert.assertArrayEquals(new int[]{ 0 }, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.joda.time.TestMutableInterval_Constructors testMutableInterval_Constructors0 = new org.joda.time.TestMutableInterval_Constructors(" < ");
        org.joda.time.TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String string0 = partial0.toString(((java.lang.String)(null)), locale0);
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        java.lang.String string0 = partial0.toString("4");
        org.junit.Assert.assertEquals("4", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate(29L);
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        java.lang.String string0 = partial0.toStringList();
        org.junit.Assert.assertEquals("[year=1970, monthOfYear=1, dayOfMonth=1]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 32 , ((org.joda.time.Chronology)(null)));
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[weekyearOfCentury=32]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.joda.time.TestMutableInterval_Constructors testMutableInterval_Constructors0 = new org.joda.time.TestMutableInterval_Constructors(" < ");
        org.joda.time.TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        java.lang.String string0 = partial0.toString(((java.lang.String)(null)));
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("6");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertNull(dateTimeFormatter0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        partial0.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertTrue(dateTimeFormatter0.isPrinter());
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 16);
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial1 = partial0.withFieldAdded(durationFieldType0, 16);
        boolean boolean0 = partial1.isMatch(((org.joda.time.ReadablePartial)(partial0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate(29L);
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(localDate0)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Instant instant0 = org.joda.time.Instant.parse("4");
        org.joda.time.DateTime dateTime0 = instant0.toDateTime(((org.joda.time.Chronology)(null)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(dateTime0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Period period0 = new org.joda.time.Period(168L);
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(period0, 93);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Period period0 = new org.joda.time.Period(168L);
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(period0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 22);
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, ((byte)(66)));
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial1 = partial0.withFieldAdded(durationFieldType0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-4260));
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial1 = partial0.withFieldAdded(durationFieldType0, (-4260));
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-4260));
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, (-4260));
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 22);
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, 1611);
        java.lang.String string0 = partial1.toString();
        org.junit.Assert.assertEquals("1611", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate(3844L);
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType0);
        org.junit.Assert.assertEquals(3, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 93);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate(29L);
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 1);
        org.junit.Assert.assertEquals(4, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test67() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-4260));
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, (-4260));
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 32 , ((org.joda.time.Chronology)(null)));
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(((org.joda.time.Chronology)(null)));
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test76() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(null)));
        org.junit.Assert.assertEquals(0, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test77() throws java.lang.Throwable {
        org.joda.time.TestLocalDateTime_Basics testLocalDateTime_Basics0 = new org.joda.time.TestLocalDateTime_Basics("[weekyearOfCentury=32]");
        testLocalDateTime_Basics0.testEqualsHashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.addToCopy(12);
        org.junit.Assert.assertNotSame(partial0, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test84() throws java.lang.Throwable {
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("6");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 1764);
        org.joda.time.Partial partial1 = partial_Property0.getPartial();
        org.junit.Assert.assertSame(partial0, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test85() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , 32);
        org.joda.time.ReadablePartial readablePartial0 = partial_Property0.getReadablePartial();
        org.junit.Assert.assertNull(readablePartial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test86() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.setCopy(0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test90() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test91() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial partial1 = partial0.minus(((org.joda.time.ReadablePeriod)(null)));
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test92() throws java.lang.Throwable {
        org.joda.time.TestMutableInterval_Constructors testMutableInterval_Constructors0 = new org.joda.time.TestMutableInterval_Constructors(" < ");
        org.joda.time.TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        org.junit.Assert.assertEquals(0, partial0.size());
        org.joda.time.Period period0 = new org.joda.time.Period(((org.joda.time.ReadablePartial)(partial0)) , ((org.joda.time.ReadablePartial)(partial0)));
        org.joda.time.Partial partial1 = partial0.plus(period0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test93() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate(29L);
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 1);
        org.junit.Assert.assertEquals(4, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test95() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-4310));
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals((-4310), partial_Property0.get());
    }
}

