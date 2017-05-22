package org.joda.time;


public class Partial_ESTest extends org.joda.time.Partial_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.TestBasePartial.MockPartial testBasePartial_MockPartial0 = new org.joda.time.TestBasePartial.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testBasePartial_MockPartial0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, (-1183));
        boolean boolean0 = partial1.isMatch(((org.joda.time.ReadablePartial)(testBasePartial_MockPartial0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.joda.time.TestBasePartial.MockPartial testBasePartial_MockPartial0 = new org.joda.time.TestBasePartial.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testBasePartial_MockPartial0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, (-1183));
        boolean boolean0 = partial1.isMatch(((org.joda.time.ReadableInstant)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(testLocalDate_Basics_MockInstant0)));
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.months();
        org.joda.time.Period period0 = new org.joda.time.Period(((org.joda.time.ReadableInstant)(dateTime0)) , ((org.joda.time.ReadableInstant)(dateTime0)) , periodType0);
        org.joda.time.Partial partial1 = partial0.minus(period0);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics(((java.lang.String)(null)));
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 44 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , (-824));
        java.util.Locale locale0 = java.util.Locale.ROOT;
        try {
            partial_Property0.setCopy("GMT+2", locale0);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.TestBasePartial.MockPartial testBasePartial_MockPartial0 = new org.joda.time.TestBasePartial.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testBasePartial_MockPartial0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, (-1187));
        org.joda.time.Partial partial2 = partial1.withField(dateTimeFieldType0, 1);
        org.junit.Assert.assertNotSame(partial2, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Period period0 = org.joda.time.Period.months(1060);
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(period0, 9);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(testLocalDate_Basics_MockInstant0)));
        int int0 = partial0.size();
        org.junit.Assert.assertEquals(3, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.joda.time.TestBasePartial.MockPartial testBasePartial_MockPartial0 = new org.joda.time.TestBasePartial.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testBasePartial_MockPartial0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, (-1187));
        org.joda.time.Partial.Property partial_Property0 = partial1.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals((-1187), partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Duration duration0 = org.joda.time.Duration.standardDays(824L);
        org.joda.time.Hours hours0 = duration0.toStandardHours();
        org.joda.time.Days days0 = hours0.toStandardDays();
        org.joda.time.Partial partial1 = partial0.minus(days0);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.TestBasePartial.MockPartial testBasePartial_MockPartial0 = new org.joda.time.TestBasePartial.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testBasePartial_MockPartial0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Period period0 = new org.joda.time.Period(((long)(-4187)) , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, (-1183));
        org.joda.time.Partial partial2 = partial1.minus(period0);
        org.junit.Assert.assertNotSame(partial2, partial1);
        org.junit.Assert.assertTrue(partial2.equals(((java.lang.Object)(partial1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int[] intArray0 = partial0.getValues();
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.TestInterval_Constructors testInterval_Constructors0 = new org.joda.time.TestInterval_Constructors("");
        org.joda.time.TestInterval_Constructors.MockInterval testInterval_Constructors_MockInterval0 = testInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = partial0.getFieldTypes();
        org.junit.Assert.assertFalse(dateTimeFieldTypeArray1.equals(((java.lang.Object)(dateTimeFieldTypeArray0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(testLocalDate_Basics_MockInstant0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = partial0.getFieldType(0);
        org.junit.Assert.assertEquals("year", dateTimeFieldType0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(testLocalDate_Basics_MockInstant0)));
        org.joda.time.DateTimeField dateTimeField0 = partial0.getField(0, ((org.joda.time.Chronology)(null)));
        org.junit.Assert.assertNotNull(dateTimeField0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("Cbwnzf0Y^x");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , ((org.joda.time.DateTimeFieldType[])(null)) , intArray0);
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        try {
            partial0.without(dateTimeFieldType0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(((java.lang.String)(null)));
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        int[] intArray0 = new int[9];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        try {
            partial0.getField(0, ((org.joda.time.Chronology)(copticChronology0)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Instant instant0 = new org.joda.time.Instant(((long)(-1814)));
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(instant0.getChronology()));
        try {
            partial0.getField((-1814), ((org.joda.time.Chronology)(iSOChronology0)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.joda.time.TestBasePartial.MockPartial testBasePartial_MockPartial0 = new org.joda.time.TestBasePartial.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testBasePartial_MockPartial0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, (-1187));
        java.lang.String string0 = partial1.toString();
        org.junit.Assert.assertEquals("-1187", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(testLocalDate_Basics_MockInstant0)));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertFalse(dateTimeFormatter0.isOffsetParsed());
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertNull(dateTimeFormatter0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("Values array must not be null");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(testLocalDate_Basics_MockInstant0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 259);
        org.junit.Assert.assertNotSame(partial0, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(partial0.getChronology()));
        org.junit.Assert.assertNotNull(iSOChronology0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int int0 = partial0.size();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.junit.Assert.assertEquals(0, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        int[] intArray0 = new int[3];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)) , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial partial1 = new org.joda.time.Partial(partial0 , intArray0);
        org.junit.Assert.assertEquals(1, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics(((java.lang.String)(null)));
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 44 , ((org.joda.time.Chronology)(iSOChronology0)));
        int[] intArray0 = partial0.getValues();
        org.junit.Assert.assertArrayEquals(new int[]{ 44 }, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        java.lang.String string0 = partial0.toString("[]");
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(testLocalDate_Basics_MockInstant0)));
        java.lang.String string0 = partial0.toStringList();
        org.junit.Assert.assertEquals("[year=1970, monthOfYear=6, dayOfMonth=9]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        java.lang.String string0 = partial0.toString(((java.lang.String)(null)));
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(testLocalDate_Basics_MockInstant0)));
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        partial0.toString(((java.lang.String)(null)), locale0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertTrue(dateTimeFormatter0.isPrinter());
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(partial0)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 10);
        org.joda.time.Instant instant0 = new org.joda.time.Instant(((long)(10)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(instant0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Instant instant0 = new org.joda.time.Instant(((long)(0)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(instant0)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 10);
        org.joda.time.Instant instant0 = new org.joda.time.Instant(((long)(10)));
        org.joda.time.Duration duration0 = new org.joda.time.Duration(((org.joda.time.ReadableInstant)(instant0)) , ((org.joda.time.ReadableInstant)(instant0)));
        org.joda.time.Minutes minutes0 = duration0.toStandardMinutes();
        org.joda.time.Days days0 = minutes0.toStandardDays();
        org.joda.time.MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(mutablePeriod0, 10);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Instant instant0 = new org.joda.time.Instant(((long)(0)));
        org.joda.time.Duration duration0 = new org.joda.time.Duration(((org.joda.time.ReadableInstant)(instant0)) , ((org.joda.time.ReadableInstant)(instant0)));
        org.joda.time.Minutes minutes0 = duration0.toStandardMinutes();
        org.joda.time.Days days0 = minutes0.toStandardDays();
        org.joda.time.MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(mutablePeriod0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Partial partial1 = partial0.plus(((org.joda.time.ReadablePeriod)(null)));
        org.junit.Assert.assertSame(partial0, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial partial1 = partial0.withFieldAdded(durationFieldType0, 398);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, 0);
        java.lang.String string0 = partial1.toString();
        org.junit.Assert.assertEquals("[secondOfDay=0]", string0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        org.joda.time.TestBasePartial.MockPartial testBasePartial_MockPartial0 = new org.joda.time.TestBasePartial.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testBasePartial_MockPartial0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        org.junit.Assert.assertEquals(0, partial0.size());
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, (-1183));
        org.joda.time.Partial partial2 = partial1.without(dateTimeFieldType0);
        org.junit.Assert.assertEquals(0, partial2.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.TestInterval_Constructors testInterval_Constructors0 = new org.joda.time.TestInterval_Constructors("");
        org.joda.time.TestInterval_Constructors.MockInterval testInterval_Constructors_MockInterval0 = testInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType0);
        org.junit.Assert.assertEquals(0, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 0);
        org.junit.Assert.assertEquals(1, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 8);
        org.joda.time.TestYearMonthDay_Basics testYearMonthDay_Basics0 = new org.joda.time.TestYearMonthDay_Basics("");
        org.joda.time.TestYearMonthDay_Basics.MockInstant testYearMonthDay_Basics_MockInstant0 = testYearMonthDay_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testYearMonthDay_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(copticChronology0);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test69() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.TestInterval_Constructors testInterval_Constructors0 = new org.joda.time.TestInterval_Constructors("");
        org.joda.time.TestInterval_Constructors.MockInterval testInterval_Constructors_MockInterval0 = testInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(((org.joda.time.Chronology)(null)));
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test74() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(testLocalDate_Basics_MockInstant0)));
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.withMinimumValue();
        org.junit.Assert.assertNotSame(partial0, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test76() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(testLocalDate_Basics_MockInstant0)));
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.addToCopy((-1));
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test77() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , 0);
        org.joda.time.Partial partial0 = partial_Property0.getPartial();
        org.junit.Assert.assertNull(partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test78() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , 2);
        org.joda.time.ReadablePartial readablePartial0 = partial_Property0.getReadablePartial();
        org.junit.Assert.assertNull(readablePartial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test79() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(testLocalDate_Basics_MockInstant0)));
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.setCopy(2442);
        org.junit.Assert.assertNotSame(partial0, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test80() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics("");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(testLocalDate_Basics_MockInstant0)));
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.addWrapFieldToCopy(0);
        org.junit.Assert.assertEquals(1970, partial_Property0.get());
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test84() throws java.lang.Throwable {
        org.joda.time.MockPartial mockPartial0 = new org.joda.time.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(mockPartial0.getChronology()));
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(iSOChronology0 , ((org.joda.time.DateTimeFieldType[])(null)) , intArray0);
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.standard();
        org.joda.time.Period period0 = new org.joda.time.Period(((long)(2156)) , periodType0);
        try {
            partial0.minus(period0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test85() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Instant instant0 = new org.joda.time.Instant(((long)(0)));
        org.joda.time.Duration duration0 = new org.joda.time.Duration(((org.joda.time.ReadableInstant)(instant0)) , ((org.joda.time.ReadableInstant)(instant0)));
        org.joda.time.Minutes minutes0 = duration0.toStandardMinutes();
        org.joda.time.Days days0 = minutes0.toStandardDays();
        org.joda.time.Partial partial1 = partial0.plus(days0);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test86() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 398);
        boolean boolean0 = partial1.isMatch(((org.joda.time.ReadablePartial)(partial0)));
        org.junit.Assert.assertEquals(1, partial1.size());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test87() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[9];
        org.joda.time.TestLocalDate_Basics.main(stringArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test88() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals(0, partial_Property0.get());
    }
}

