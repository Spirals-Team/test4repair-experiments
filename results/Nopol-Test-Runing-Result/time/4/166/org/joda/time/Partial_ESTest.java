package org.joda.time;


public class Partial_ESTest extends org.joda.time.Partial_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[6];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[8];
        intArray0[0] = 319;
        org.joda.time.Partial partial0 = new org.joda.time.Partial(mockNullZoneChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.TestInstant_Basics testInstant_Basics0 = new org.joda.time.TestInstant_Basics("");
        org.joda.time.TestInstant_Basics.MockInstant testInstant_Basics_MockInstant0 = testInstant_Basics0.new MockInstant();
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(testInstant_Basics_MockInstant0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.TestMutableInterval_Updates testMutableInterval_Updates0 = new org.joda.time.TestMutableInterval_Updates("GMT-02:00");
        org.joda.time.TestMutableInterval_Updates.MockBadInterval testMutableInterval_Updates_MockBadInterval0 = testMutableInterval_Updates0.new MockBadInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Updates_MockBadInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 32 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.junit.Assert.assertEquals(1, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 20);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.setCopy(20);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , 1851);
        org.joda.time.ReadablePartial readablePartial0 = partial_Property0.getReadablePartial();
        org.junit.Assert.assertNull(readablePartial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 10209375);
        try {
            partial_Property0.addWrapFieldToCopy((-41));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType0);
        org.junit.Assert.assertEquals(2, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType0);
        org.junit.Assert.assertEquals(0, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)));
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(((org.joda.time.ReadablePeriod)(null)), 1930);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics(".$Ui=]kApoBQC)");
        org.joda.time.TestMutableDateTime_Basics.MockEqualsChronology testMutableDateTime_Basics_MockEqualsChronology0 = testMutableDateTime_Basics0.new MockEqualsChronology();
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(testMutableDateTime_Basics_MockEqualsChronology0);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[6];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[8];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(mockNullZoneChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals(0, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[6];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
        int[] intArray0 = new int[8];
        intArray0[3] = -194;
        org.joda.time.Partial partial0 = new org.joda.time.Partial(mockNullZoneChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals((-194), partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.TestMutableInterval_Basics testMutableInterval_Basics0 = new org.joda.time.TestMutableInterval_Basics("@jfA'$! %!");
        org.joda.time.TestMutableInterval_Basics.MockInterval testMutableInterval_Basics_MockInterval0 = testMutableInterval_Basics0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Basics_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = partial0.plus(((org.joda.time.ReadablePeriod)(null)));
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)));
        int[] intArray0 = partial0.getValues();
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[6];
        int[] intArray0 = new int[8];
        intArray0[0] = 319;
        org.joda.time.Partial partial0 = new org.joda.time.Partial(mockNullZoneChronology0 , dateTimeFieldTypeArray0 , intArray0);
        int int0 = partial0.getValue(0);
        org.junit.Assert.assertEquals(319, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[6];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[1] = dateTimeFieldTypeArray0[0];
        int[] intArray0 = new int[8];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(mockNullZoneChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = partial0.getFieldType(1);
        org.junit.Assert.assertEquals("centuryOfEra", dateTimeFieldType1.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[6];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[8];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(mockNullZoneChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField0 = ((org.joda.time.field.UnsupportedDateTimeField)(partial0.getField(0, ((org.joda.time.Chronology)(mockNullZoneChronology0)))));
        org.junit.Assert.assertFalse(unsupportedDateTimeField0.isLenient());
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[24];
        int[] intArray0 = new int[8];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(mockNullZoneChronology0 , dateTimeFieldTypeArray0 , intArray0);
        try {
            partial0.without(dateTimeFieldTypeArray0[2]);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(((java.lang.String)(null)));
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 20);
        try {
            partial0.getField(20, ((org.joda.time.Chronology)(copticChronology0)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertNull(dateTimeFormatter0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDateTime0)));
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod(17 , (-1253) , (-1253) , (-2925));
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(mutablePeriod0, 61);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("");
        org.joda.time.TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(testDateTime_Basics_MockEqualsChronology0)));
        org.junit.Assert.assertEquals(0, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(partial0.getChronology()));
        org.junit.Assert.assertNotNull(iSOChronology0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[24];
        int[] intArray0 = new int[8];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(mockNullZoneChronology0 , dateTimeFieldTypeArray0 , intArray0);
        int int0 = partial0.size();
        org.junit.Assert.assertEquals(24, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[6];
        int[] intArray0 = new int[8];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(mockNullZoneChronology0 , dateTimeFieldTypeArray0 , intArray0);
        try {
            partial0.getFieldType(2903);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[6];
        int[] intArray0 = new int[8];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(mockNullZoneChronology0 , dateTimeFieldTypeArray0 , intArray0);
        int int0 = partial0.getValue(0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 20);
        int[] intArray0 = new int[2];
        org.joda.time.Partial partial1 = new org.joda.time.Partial(partial0 , intArray0);
        org.junit.Assert.assertEquals(1, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[24];
        int[] intArray0 = new int[8];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(mockNullZoneChronology0 , dateTimeFieldTypeArray0 , intArray0);
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String string0 = partial0.toString("{ 9~", locale0);
        org.junit.Assert.assertEquals("{ 9~", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        java.lang.String string0 = partial0.toString("[]");
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfMinute();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        int[] intArray0 = new int[2];
        org.joda.time.TestInterval_Basics testInterval_Basics0 = new org.joda.time.TestInterval_Basics("");
        org.joda.time.TestInterval_Basics.MockInterval testInterval_Basics_MockInterval0 = testInterval_Basics0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testInterval_Basics_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        java.lang.String string0 = partial0.toStringList();
        org.junit.Assert.assertEquals("[era=0, secondOfMinute=0]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 20);
        partial0.with(dateTimeFieldType0, 20);
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("20", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDateTime0)));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertTrue(dateTimeFormatter0.isPrinter());
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertEquals(2000, dateTimeFormatter0.getDefaultYear());
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDateTime0)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(localDateTime0)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfMinute();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        int[] intArray0 = new int[2];
        org.joda.time.TestInterval_Basics testInterval_Basics0 = new org.joda.time.TestInterval_Basics("");
        org.joda.time.TestInterval_Basics.MockInterval testInterval_Basics_MockInterval0 = testInterval_Basics0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testInterval_Basics_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 20);
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Partial partial1 = partial0.plus(period0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test67() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        org.joda.time.TestMonthDay_Basics testMonthDay_Basics0 = new org.joda.time.TestMonthDay_Basics("");
        org.joda.time.TestMonthDay_Basics.MockMD testMonthDay_Basics_MockMD0 = testMonthDay_Basics0.new MockMD();
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = testMonthDay_Basics_MockMD0.getFieldType(1);
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfMinute();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        int[] intArray0 = new int[2];
        intArray0[0] = 1;
        intArray0[1] = 1;
        org.joda.time.TestInterval_Basics testInterval_Basics0 = new org.joda.time.TestInterval_Basics("");
        org.joda.time.TestInterval_Basics.MockInterval testInterval_Basics_MockInterval0 = testInterval_Basics0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testInterval_Basics_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType1, 1);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[6];
        int[] intArray0 = new int[8];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(mockNullZoneChronology0 , dateTimeFieldTypeArray0 , intArray0);
        try {
            partial0.without(dateTimeFieldTypeArray0[0]);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test69() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 4);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 4);
        org.junit.Assert.assertEquals(4, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test73() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 1305);
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics(",cA6JGRw ");
        org.joda.time.TestDateTime_Basics.MockInstant testDateTime_Basics_MockInstant0 = testDateTime_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testDateTime_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(iSOChronology0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test77() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfMinute();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        int[] intArray0 = new int[2];
        org.joda.time.TestInterval_Basics testInterval_Basics0 = new org.joda.time.TestInterval_Basics("");
        org.joda.time.TestInterval_Basics.MockInterval testInterval_Basics_MockInterval0 = testInterval_Basics0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testInterval_Basics_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType1, 27);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(((java.lang.String)(null)));
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 20);
        int[] intArray0 = partial0.getValues();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        org.joda.time.Partial partial1 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(copticChronology0)));
        org.junit.Assert.assertEquals(1, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test88() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 4);
        org.joda.time.Partial.Property partial_Property0 = partial1.property(dateTimeFieldType0);
        org.joda.time.Partial partial2 = partial_Property0.addToCopy(4);
        org.junit.Assert.assertEquals(4, partial2.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test89() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , 660);
        org.joda.time.Partial partial0 = partial_Property0.getPartial();
        org.junit.Assert.assertNull(partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test92() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 20);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.withMinimumValue();
        org.junit.Assert.assertNotSame(partial0, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test93() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 20);
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 20);
        partial0.getFormatter();
        org.junit.Assert.assertSame(partial0, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test94() throws java.lang.Throwable {
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[6];
        int[] intArray0 = new int[8];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(mockNullZoneChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        try {
            partial_Property0.withMaximumValue();
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test95() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.junit.Assert.assertEquals(0, partial0.size());
        org.joda.time.Period period0 = new org.joda.time.Period(11 , 11 , 11 , 11);
        org.joda.time.Partial partial1 = partial0.minus(period0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test96() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.junit.Assert.assertEquals(0, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test97() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 20);
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.joda.time.Partial partial1 = partial_Property0.addWrapFieldToCopy(1);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }
}

