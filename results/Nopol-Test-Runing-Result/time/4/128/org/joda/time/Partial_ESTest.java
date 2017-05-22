package org.joda.time;


public class Partial_ESTest extends org.joda.time.Partial_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.TestTimeOfDay_Basics testTimeOfDay_Basics0 = new org.joda.time.TestTimeOfDay_Basics("");
        org.joda.time.TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testTimeOfDay_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[3];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[2] = dateTimeFieldTypeArray0[0];
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, (-14));
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[9];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        dateTimeFieldTypeArray0[4] = dateTimeFieldType1;
        dateTimeFieldTypeArray0[5] = dateTimeFieldTypeArray0[0];
        dateTimeFieldTypeArray0[6] = dateTimeFieldTypeArray0[5];
        dateTimeFieldTypeArray0[7] = dateTimeFieldTypeArray0[0];
        dateTimeFieldTypeArray0[8] = dateTimeFieldTypeArray0[0];
        int[] intArray0 = new int[17];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)) , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType1, 49);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 1574);
        org.junit.Assert.assertEquals(1, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.TestTimeOfDay_Basics testTimeOfDay_Basics0 = new org.joda.time.TestTimeOfDay_Basics("");
        testTimeOfDay_Basics0.testCompareTo();
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Period period0 = new org.joda.time.Period(1612L , 1612L , ((org.joda.time.Chronology)(null)));
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(period0, 3683);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.TestTimeOfDay_Basics testTimeOfDay_Basics0 = new org.joda.time.TestTimeOfDay_Basics("");
        org.joda.time.TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testTimeOfDay_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[3];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[1] = dateTimeFieldTypeArray0[0];
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType1;
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType1.getDurationType();
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial partial1 = partial0.withFieldAdded(durationFieldType0, 28181250);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[9];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[2] = dateTimeFieldTypeArray0[1];
        dateTimeFieldTypeArray0[3] = dateTimeFieldTypeArray0[2];
        dateTimeFieldTypeArray0[4] = dateTimeFieldTypeArray0[0];
        dateTimeFieldTypeArray0[5] = dateTimeFieldTypeArray0[4];
        dateTimeFieldTypeArray0[6] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[7] = dateTimeFieldTypeArray0[4];
        dateTimeFieldTypeArray0[8] = dateTimeFieldType0;
        int[] intArray0 = new int[17];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)) , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, 32);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        java.lang.String string0 = partial0.toString("[]");
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType0);
        int int0 = partial1.size();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals(0, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[9];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
        int[] intArray0 = new int[2];
        intArray0[1] = -368;
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)) , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldTypeArray0[1]);
        org.junit.Assert.assertEquals((-368), partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Partial partial1 = partial0.plus(period0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int[] intArray0 = partial0.getValues();
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeField dateTimeField0 = partial0.getField(0, ((org.joda.time.Chronology)(null)));
        org.junit.Assert.assertNotNull(dateTimeField0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        try {
            partial0.getFieldType(20);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertTrue(dateTimeFormatter0.isParser());
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertNull(dateTimeFormatter0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(period0, 56);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.joda.time.TestDateMidnight_Basics testDateMidnight_Basics0 = new org.joda.time.TestDateMidnight_Basics("Values array ust not be null");
        org.joda.time.TestDateMidnight_Basics.MockInstant testDateMidnight_Basics_MockInstant0 = testDateMidnight_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testDateMidnight_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.chrono.ISOChronology iSOChronology1 = ((org.joda.time.chrono.ISOChronology)(partial0.getChronology()));
        org.junit.Assert.assertNotSame(iSOChronology0, iSOChronology1);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        int int0 = partial0.size();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = partial0.getFieldType(0);
        org.junit.Assert.assertEquals("year", dateTimeFieldType0.getName());
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.junit.Assert.assertEquals(0, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.joda.time.TestDateMidnight_Basics testDateMidnight_Basics0 = new org.joda.time.TestDateMidnight_Basics("Values array must not be null");
        org.joda.time.TestDateMidnight_Basics.MockInstant testDateMidnight_Basics_MockInstant0 = testDateMidnight_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testDateMidnight_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(iSOChronology0)));
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial1 = new org.joda.time.Partial(partial0 , intArray0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 2 , ((org.joda.time.Chronology)(null)));
        int[] intArray0 = partial0.getValues();
        org.junit.Assert.assertArrayEquals(new int[]{ 2 }, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        java.lang.String string0 = partial0.toString("[]", ((java.util.Locale)(null)));
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 2 , ((org.joda.time.Chronology)(null)));
        partial0.getFormatter();
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[clockhourOfHalfday=2]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[9];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
        int[] intArray0 = new int[17];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)) , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertEquals(2000, dateTimeFormatter0.getDefaultYear());
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(localDateTime0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(localDate0)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("[year=2014, monthOfYear=2, dayOfMonth=14]");
        org.joda.time.TestDateTime_Basics.MockInstant testDateTime_Basics_MockInstant0 = testDateTime_Basics0.new MockInstant();
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(testDateTime_Basics_MockInstant0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(period0, 0);
        partial1.getFormatter();
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Partial partial1 = partial0.minus(((org.joda.time.ReadablePeriod)(null)));
        org.junit.Assert.assertEquals(0, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        org.joda.time.TestTimeOfDay_Basics testTimeOfDay_Basics0 = new org.joda.time.TestTimeOfDay_Basics("");
        org.joda.time.TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testTimeOfDay_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[21];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.Partial partial1 = partial0.without(((org.joda.time.DateTimeFieldType)(null)));
        org.junit.Assert.assertEquals(3, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[9];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[2] = dateTimeFieldTypeArray0[0];
        int[] intArray0 = new int[17];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)) , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldTypeArray0[2], 0);
        org.junit.Assert.assertSame(partial0, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[9];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfSecond();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        int[] intArray0 = new int[2];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)) , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        try {
            partial0.with(dateTimeFieldType2, 0);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[9];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int[] intArray0 = new int[2];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)) , dateTimeFieldTypeArray0 , intArray0);
        try {
            partial0.with(dateTimeFieldType2, (-18));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test73() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(((org.joda.time.Chronology)(null)));
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test87() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , 1698);
        org.joda.time.Partial partial0 = partial_Property0.getPartial();
        org.junit.Assert.assertNull(partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test88() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , 0);
        org.joda.time.ReadablePartial readablePartial0 = partial_Property0.getReadablePartial();
        org.junit.Assert.assertNull(readablePartial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test91() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(mockNullZoneChronology0);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test92() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 2 , ((org.joda.time.Chronology)(null)));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test94() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.Period period0 = new org.joda.time.Period((-21) , (-21) , 2 , (-1) , 7 , 2 , (-21) , (-21));
        org.joda.time.Partial partial1 = partial0.minus(period0);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test95() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.TestInstant_Basics testInstant_Basics0 = new org.joda.time.TestInstant_Basics("\" is too short");
        org.joda.time.TestInstant_Basics.MockInstant testInstant_Basics_MockInstant0 = testInstant_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testInstant_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Period period0 = new org.joda.time.Period(10125000 , 10125000 , 1413 , 632);
        org.joda.time.Partial partial1 = partial0.plus(period0);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test96() throws java.lang.Throwable {
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("");
        org.joda.time.TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(testDateTime_Basics_MockEqualsChronology0)));
        org.junit.Assert.assertEquals(0, partial0.size());
        java.lang.String string0 = partial0.toStringList();
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test98() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.TestInstant_Basics testInstant_Basics0 = new org.joda.time.TestInstant_Basics("The partial must not be null");
        org.joda.time.TestInstant_Basics.MockInstant testInstant_Basics_MockInstant0 = testInstant_Basics0.new MockInstant();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testInstant_Basics_MockInstant0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 6 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals(6, partial_Property0.get());
    }
}

