package org.joda.time;


public class Partial_ESTest extends org.joda.time.Partial_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.LocalDate localDate1 = localDate0.plusWeeks((-2));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(localDate1)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.withMaximumValue();
        org.joda.time.TestInstant_Basics testInstant_Basics0 = new org.joda.time.TestInstant_Basics("XA7d{}b[z");
        org.joda.time.TestInstant_Basics.MockInstant testInstant_Basics_MockInstant0 = testInstant_Basics0.new MockInstant();
        boolean boolean0 = partial1.isMatch(((org.joda.time.ReadableInstant)(testInstant_Basics_MockInstant0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, (-33));
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.withMinimumValue();
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 1 , ((org.joda.time.Chronology)(null)));
        org.junit.Assert.assertEquals(1, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , (-3365));
        org.joda.time.ReadablePartial readablePartial0 = partial_Property0.getReadablePartial();
        org.junit.Assert.assertNull(readablePartial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.DateTimeField dateTimeField0 = partial_Property0.getField();
        org.junit.Assert.assertNotNull(dateTimeField0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.addWrapFieldToCopy(0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, 2);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.withMaximumValue();
        org.joda.time.Partial partial2 = partial1.with(dateTimeFieldType0, 0);
        org.junit.Assert.assertNotSame(partial2, partial1);
        org.junit.Assert.assertTrue(partial2.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.TestDateTime_Basics testDateTime_Basics0 = new org.joda.time.TestDateTime_Basics("");
        org.joda.time.TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(testDateTime_Basics_MockEqualsChronology0);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.withMaximumValue();
        org.joda.time.Partial.Property partial_Property1 = partial1.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals(1, partial_Property1.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-292275054));
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals((-292275054), partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.joda.time.TestMutableDateTime_Basics testMutableDateTime_Basics0 = new org.joda.time.TestMutableDateTime_Basics(((java.lang.String)(null)));
        org.joda.time.TestMutableDateTime_Basics.MockEqualsChronology testMutableDateTime_Basics_MockEqualsChronology0 = testMutableDateTime_Basics0.new MockEqualsChronology();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(testMutableDateTime_Basics_MockEqualsChronology0)));
        org.joda.time.Period period0 = org.joda.time.Period.seconds(20);
        org.joda.time.Partial partial1 = partial0.plus(period0);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)));
        int[] intArray0 = partial0.getValues();
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.TestInterval_Constructors testInterval_Constructors0 = new org.joda.time.TestInterval_Constructors("yE\"h}W<IV]");
        org.joda.time.TestInterval_Constructors.MockInterval testInterval_Constructors_MockInterval0 = testInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.DateTimeField dateTimeField0 = partial0.getField(0, ((org.joda.time.Chronology)(iSOChronology0)));
        org.junit.Assert.assertNotNull(dateTimeField0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        try {
            partial0.getFieldType(1457);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertTrue(dateTimeFormatter0.isParser());
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertNull(dateTimeFormatter0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertNull(dateTimeFormatter0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(((org.joda.time.ReadablePeriod)(null)), 2);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Period period0 = org.joda.time.Period.years(0);
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(period0, 1);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)));
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(partial0.getChronology()));
        org.junit.Assert.assertNotNull(iSOChronology0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        int int0 = partial0.size();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.joda.time.TestYearMonth_Basics testYearMonth_Basics0 = new org.joda.time.TestYearMonth_Basics("");
        org.joda.time.TestYearMonth_Basics.MockYM testYearMonth_Basics_MockYM0 = testYearMonth_Basics0.new MockYM();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testYearMonth_Basics_MockYM0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[10];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , ((int[])(null)));
        try {
            partial0.toStringList();
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = partial0.getFieldType(0);
        org.junit.Assert.assertSame(dateTimeFieldType0, dateTimeFieldType1);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        int int0 = partial0.getValue(0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.junit.Assert.assertEquals(0, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int[] intArray0 = new int[8];
        org.joda.time.Partial partial1 = new org.joda.time.Partial(partial0 , intArray0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.withMaximumValue();
        java.lang.String string0 = partial1.toString();
        org.junit.Assert.assertEquals("[era=1]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String string0 = partial0.toString(((java.lang.String)(null)), locale0);
        org.junit.Assert.assertEquals("00", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.junit.Assert.assertEquals(0, partial0.size());
        java.lang.String string0 = partial0.toString();
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.withMaximumValue();
        partial0.getFormatter();
        org.junit.Assert.assertFalse(partial0.equals(((java.lang.Object)(partial1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.withMaximumValue();
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(partial1)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(partial0)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.TestInstant_Basics testInstant_Basics0 = new org.joda.time.TestInstant_Basics("DtW@]vv");
        org.joda.time.TestInstant_Basics.MockInstant testInstant_Basics_MockInstant0 = testInstant_Basics0.new MockInstant();
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(testInstant_Basics_MockInstant0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Period period0 = org.joda.time.Period.years(0);
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(period0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Partial partial1 = partial0.minus(((org.joda.time.ReadablePeriod)(null)));
        org.junit.Assert.assertEquals(0, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 2643);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test67() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial partial1 = partial0.withFieldAdded(durationFieldType0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test69() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , (-292275054));
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, (-292275054));
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test71() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[2];
        org.joda.time.TestYearMonth_Basics.main(stringArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test73() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType1, 2000);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test74() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.TestInterval_Constructors testInterval_Constructors0 = new org.joda.time.TestInterval_Constructors("[era=1]");
        org.joda.time.TestInterval_Constructors.MockInterval testInterval_Constructors_MockInterval0 = testInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(iSOChronology0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test77() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test85() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(mockNullZoneChronology0)));
        org.junit.Assert.assertEquals(0, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test88() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.addToCopy(1);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test89() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , 0);
        org.joda.time.Partial partial0 = partial_Property0.getPartial();
        org.junit.Assert.assertNull(partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test93() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Period period0 = new org.joda.time.Period(0 , 0 , 0 , 898);
        org.joda.time.Weeks weeks0 = period0.toStandardWeeks();
        org.joda.time.Seconds seconds0 = weeks0.toStandardSeconds();
        org.joda.time.Days days0 = seconds0.toStandardDays();
        org.joda.time.MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
        org.joda.time.Partial partial1 = partial0.minus(mutablePeriod0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test94() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Period period0 = org.joda.time.Period.years(0);
        org.joda.time.Partial partial1 = partial0.plus(period0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test95() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 0);
        org.joda.time.Partial partial1 = partial_Property0.withMaximumValue();
        org.joda.time.TestInstant_Basics testInstant_Basics0 = new org.joda.time.TestInstant_Basics(((java.lang.String)(null)));
        org.joda.time.TestInstant_Basics.MockInstant testInstant_Basics_MockInstant0 = testInstant_Basics0.new MockInstant();
        boolean boolean0 = partial1.isMatch(((org.joda.time.ReadableInstant)(testInstant_Basics_MockInstant0)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test96() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType0);
        org.junit.Assert.assertEquals(0, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test97() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 0);
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals(0, partial_Property0.get());
    }
}

