package org.joda.time;


public class Partial_ESTest extends org.joda.time.Partial_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.TestBasePartial.MockPartial testBasePartial_MockPartial0 = new org.joda.time.TestBasePartial.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testBasePartial_MockPartial0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 44 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime(2535L , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.LocalTime localTime1 = localTime0.withLocalMillis((-1454L));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(localTime1)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.joda.time.TestTimeOfDay_Basics testTimeOfDay_Basics0 = new org.joda.time.TestTimeOfDay_Basics(((java.lang.String)(null)));
        org.joda.time.TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testTimeOfDay_Basics_MockInstant0.getChronology()));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)(copticChronology0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType0);
        org.junit.Assert.assertEquals(2, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , (-1779));
        org.joda.time.ReadablePartial readablePartial0 = partial_Property0.getReadablePartial();
        org.junit.Assert.assertNull(readablePartial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.TestBasePartial.MockPartial testBasePartial_MockPartial0 = new org.joda.time.TestBasePartial.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testBasePartial_MockPartial0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 44 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, 5);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.TestLocalDateTime_Basics testLocalDateTime_Basics0 = new org.joda.time.TestLocalDateTime_Basics(((java.lang.String)(null)));
        org.joda.time.TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(testLocalDateTime_Basics_MockInstant0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 9);
        org.junit.Assert.assertEquals(4, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.TestTimeOfDay_Basics testTimeOfDay_Basics0 = new org.joda.time.TestTimeOfDay_Basics(((java.lang.String)(null)));
        org.joda.time.TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testTimeOfDay_Basics_MockInstant0.getChronology()));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)(copticChronology0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.TestLocalTime_Basics testLocalTime_Basics0 = new org.joda.time.TestLocalTime_Basics("");
        org.joda.time.TestLocalTime_Basics.MockInstant testLocalTime_Basics_MockInstant0 = testLocalTime_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(copticChronology0)));
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Days days0 = period0.toStandardDays();
        org.joda.time.Weeks weeks0 = days0.toStandardWeeks();
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(weeks0, 8);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.TestLocalTime_Basics testLocalTime_Basics0 = new org.joda.time.TestLocalTime_Basics("");
        org.joda.time.TestLocalTime_Basics.MockInstant testLocalTime_Basics_MockInstant0 = testLocalTime_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(copticChronology0)));
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(copticChronology0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("2002-06-09T02:00:00.000+02:00");
        org.joda.time.TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(testDateTime_Basics_MockEqualsChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals(0, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.TestBasePartial.MockPartial testBasePartial_MockPartial0 = new org.joda.time.TestBasePartial.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testBasePartial_MockPartial0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 44 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Period period0 = org.joda.time.Period.days(402);
        org.joda.time.Partial partial1 = partial0.minus(period0);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("2002-06-09T02:00:00.000+02:00");
        org.joda.time.TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        int[] intArray0 = new int[9];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(testDateTime_Basics_MockEqualsChronology0 , dateTimeFieldTypeArray0 , intArray0);
        int[] intArray1 = partial0.getValues();
        org.junit.Assert.assertArrayEquals(new int[]{ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 }, intArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.joda.time.TestLocalDateTime_Basics testLocalDateTime_Basics0 = new org.joda.time.TestLocalDateTime_Basics("@z!");
        org.joda.time.TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[4];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = partial0.getFieldTypes();
        org.junit.Assert.assertNotSame(dateTimeFieldTypeArray1, dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.joda.time.TestTimeOfDay_Basics testTimeOfDay_Basics0 = new org.joda.time.TestTimeOfDay_Basics(((java.lang.String)(null)));
        org.joda.time.TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testTimeOfDay_Basics_MockInstant0.getChronology()));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)(copticChronology0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = partial0.getFieldType(0);
        org.junit.Assert.assertEquals("year", dateTimeFieldType0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("2002-06-09T02:00:00.000+02:00");
        org.joda.time.TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(testDateTime_Basics_MockEqualsChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField0 = ((org.joda.time.field.UnsupportedDateTimeField)(partial0.getField(0, ((org.joda.time.Chronology)(testDateTime_Basics_MockEqualsChronology0)))));
        org.junit.Assert.assertFalse(unsupportedDateTimeField0.isLenient());
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[4];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[1] = dateTimeFieldTypeArray0[0];
        dateTimeFieldTypeArray0[2] = dateTimeFieldTypeArray0[0];
        dateTimeFieldTypeArray0[3] = dateTimeFieldTypeArray0[2];
        int[] intArray0 = new int[24];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(iSOChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.CENTURIES_TYPE;
        org.joda.time.Partial partial1 = partial0.withFieldAdded(durationFieldType0, 1154);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("Hw[{48,A-_DN");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        try {
            partial0.getField((-4129), ((org.joda.time.Chronology)(iSOChronology0)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertNull(dateTimeFormatter0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.joda.time.TestTimeOfDay_Basics testTimeOfDay_Basics0 = new org.joda.time.TestTimeOfDay_Basics(((java.lang.String)(null)));
        org.joda.time.TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testTimeOfDay_Basics_MockInstant0.getChronology()));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)(copticChronology0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(((org.joda.time.ReadablePeriod)(null)), 89);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(null)));
        org.junit.Assert.assertEquals(1, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.joda.time.TestLocalTime_Basics testLocalTime_Basics0 = new org.joda.time.TestLocalTime_Basics("");
        org.joda.time.TestLocalTime_Basics.MockInstant testLocalTime_Basics_MockInstant0 = testLocalTime_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(copticChronology0)));
        org.joda.time.chrono.CopticChronology copticChronology1 = ((org.joda.time.chrono.CopticChronology)(partial0.getChronology()));
        org.junit.Assert.assertEquals(1, org.joda.time.chrono.CopticChronology.AM);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.TestBasePartial.MockPartial testBasePartial_MockPartial0 = new org.joda.time.TestBasePartial.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testBasePartial_MockPartial0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 44 , ((org.joda.time.Chronology)(iSOChronology0)));
        int int0 = partial0.size();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.joda.time.TestLocalTime_Basics testLocalTime_Basics0 = new org.joda.time.TestLocalTime_Basics("");
        org.joda.time.TestLocalTime_Basics.MockInstant testLocalTime_Basics_MockInstant0 = testLocalTime_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(copticChronology0)));
        try {
            partial0.getFieldType(1);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        int int0 = partial0.getValue(0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics("EW");
        org.joda.time.TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        int[] intArray0 = new int[9];
        org.joda.time.Partial partial1 = new org.joda.time.Partial(partial0 , intArray0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int[] intArray0 = partial0.getValues();
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 3 , ((org.joda.time.Chronology)(null)));
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("-W-3", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.TestLocalDateTime_Basics testLocalDateTime_Basics0 = new org.joda.time.TestLocalDateTime_Basics("8utkIlzKRoD zY");
        org.joda.time.TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 44 , ((org.joda.time.Chronology)(copticChronology0)));
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        partial0.toString();
        java.lang.String string0 = partial0.toString(((java.lang.String)(null)), locale0);
        org.junit.Assert.assertEquals("[weekyearOfCentury=44]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("2002-06-09T02:00:00.000+02:00");
        org.joda.time.TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(testDateTime_Basics_MockEqualsChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertTrue(dateTimeFormatter0.isPrinter());
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("2002-06-09T02:00:00.000+02:00");
        org.joda.time.TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[6];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[8];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(testDateTime_Basics_MockEqualsChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertTrue(dateTimeFormatter0.isPrinter());
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.joda.time.TestLocalTime_Basics testLocalTime_Basics0 = new org.joda.time.TestLocalTime_Basics("");
        org.joda.time.TestLocalTime_Basics.MockInstant testLocalTime_Basics_MockInstant0 = testLocalTime_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(copticChronology0)));
        org.junit.Assert.assertEquals(0, partial0.size());
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("2002-06-09T02:00:00.000+02:00");
        org.joda.time.TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[6];
        int[] intArray0 = new int[8];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(testDateTime_Basics_MockEqualsChronology0 , dateTimeFieldTypeArray0 , intArray0);
        partial0.getFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertNull(dateTimeFormatter0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.TestBasePartial.MockPartial testBasePartial_MockPartial0 = new org.joda.time.TestBasePartial.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testBasePartial_MockPartial0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 44 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime(2535L , ((org.joda.time.Chronology)(iSOChronology0)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(localTime0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("2002-06-09T02:00:00.000+02:00");
        org.joda.time.TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[6];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[8];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(testDateTime_Basics_MockEqualsChronology0 , dateTimeFieldTypeArray0 , intArray0);
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        org.joda.time.TestTimeOfDay_Basics testTimeOfDay_Basics0 = new org.joda.time.TestTimeOfDay_Basics(((java.lang.String)(null)));
        org.joda.time.TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testTimeOfDay_Basics_MockInstant0.getChronology()));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)(copticChronology0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.Period period0 = new org.joda.time.Period(((org.joda.time.ReadableDuration)(null)) , ((org.joda.time.ReadableInstant)(null)));
        org.joda.time.Partial partial1 = partial0.plus(period0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        org.joda.time.TestTimeOfDay_Basics testTimeOfDay_Basics0 = new org.joda.time.TestTimeOfDay_Basics(((java.lang.String)(null)));
        org.joda.time.TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testTimeOfDay_Basics_MockInstant0.getChronology()));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)(copticChronology0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.Period period0 = new org.joda.time.Period(((org.joda.time.ReadableDuration)(null)) , ((org.joda.time.ReadableInstant)(null)));
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(period0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("2002-06-09T02:00:00.000+02:00");
        org.joda.time.TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(testDateTime_Basics_MockEqualsChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, 0);
        org.junit.Assert.assertEquals(1, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.TestBasePartial.MockPartial testBasePartial_MockPartial0 = new org.joda.time.TestBasePartial.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testBasePartial_MockPartial0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 44 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType0);
        int int0 = partial1.size();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.TestBasePartial.MockPartial testBasePartial_MockPartial0 = new org.joda.time.TestBasePartial.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testBasePartial_MockPartial0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 44 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 44);
        org.junit.Assert.assertEquals(1, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        org.joda.time.TestLocalDateTime_Basics testLocalDateTime_Basics0 = new org.joda.time.TestLocalDateTime_Basics(((java.lang.String)(null)));
        org.joda.time.TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(testLocalDateTime_Basics_MockInstant0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 9);
        org.junit.Assert.assertEquals(5, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test72() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.TestBasePartial.MockPartial testBasePartial_MockPartial0 = new org.joda.time.TestBasePartial.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testBasePartial_MockPartial0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 44 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(iSOChronology0);
        java.lang.String string0 = partial1.toString();
        org.junit.Assert.assertSame(partial1, partial0);
        org.junit.Assert.assertEquals("-44", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test77() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.junit.Assert.assertEquals(1, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , 1326);
        org.joda.time.Partial partial0 = partial_Property0.getPartial();
        org.junit.Assert.assertNull(partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test85() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        try {
            partial_Property0.setCopy(((java.lang.String)(null)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test86() throws java.lang.Throwable {
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("2002-06-09T02:00:00.000+02:00");
        org.joda.time.TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        int[] intArray0 = new int[9];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(testDateTime_Basics_MockEqualsChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = partial0.getFieldTypes();
        org.junit.Assert.assertNotSame(dateTimeFieldTypeArray1, dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test88() throws java.lang.Throwable {
        org.joda.time.TestLocalTime_Basics testLocalTime_Basics0 = new org.joda.time.TestLocalTime_Basics("");
        org.joda.time.TestLocalTime_Basics.MockInstant testLocalTime_Basics_MockInstant0 = testLocalTime_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(copticChronology0)));
        org.joda.time.Partial partial1 = partial0.minus(((org.joda.time.ReadablePeriod)(null)));
        org.junit.Assert.assertEquals(0, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test89() throws java.lang.Throwable {
        org.joda.time.TestLocalTime_Basics testLocalTime_Basics0 = new org.joda.time.TestLocalTime_Basics("");
        org.joda.time.TestLocalTime_Basics.MockInstant testLocalTime_Basics_MockInstant0 = testLocalTime_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(copticChronology0)));
        org.joda.time.Partial partial1 = partial0.plus(((org.joda.time.ReadablePeriod)(null)));
        org.junit.Assert.assertEquals(0, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test91() throws java.lang.Throwable {
        org.joda.time.TestTimeOfDay_Basics testTimeOfDay_Basics0 = new org.joda.time.TestTimeOfDay_Basics(((java.lang.String)(null)));
        org.joda.time.TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testTimeOfDay_Basics_MockInstant0.getChronology()));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)(copticChronology0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 5);
        org.joda.time.Partial.Property partial_Property0 = partial1.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals(4, partial1.size());
        org.junit.Assert.assertEquals(5, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test92() throws java.lang.Throwable {
        org.joda.time.TestTimeOfDay_Basics testTimeOfDay_Basics0 = new org.joda.time.TestTimeOfDay_Basics(((java.lang.String)(null)));
        org.joda.time.TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testTimeOfDay_Basics_MockInstant0.getChronology()));
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)(copticChronology0)));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(partial0)));
        org.junit.Assert.assertTrue(boolean0);
    }
}

