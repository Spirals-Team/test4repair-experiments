package org.joda.time;


public class Partial_ESTest extends org.joda.time.Partial_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(" < ");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(partial0 , 1);
        org.joda.time.Partial partial1 = partial_Property0.addWrapFieldToCopy(1);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(" < ");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[1] = dateTimeFieldTypeArray0[0];
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.joda.time.Partial partial1 = partial_Property0.addToCopy(2);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(" < ");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[1] = dateTimeFieldTypeArray0[0];
        int[] intArray0 = new int[7];
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial partial1 = partial0.withFieldAdded(durationFieldType0, 168);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(" < ");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(((org.joda.time.ReadablePeriod)(null)), 1);
        org.junit.Assert.assertSame(partial0, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(" < ");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[1] = dateTimeFieldTypeArray0[0];
        int[] intArray0 = new int[7];
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 1);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertFalse(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(mockNullZoneChronology0);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(" < ");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        int int0 = partial0.size();
        org.junit.Assert.assertEquals(2, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        intArray0[0] = 32;
        org.joda.time.TestMutableInterval_Constructors testMutableInterval_Constructors0 = new org.joda.time.TestMutableInterval_Constructors("");
        org.joda.time.TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        org.junit.Assert.assertEquals(32, partial_Property0.get());
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Period period0 = org.joda.time.Period.weeks(1972);
        org.joda.time.Partial partial1 = partial0.plus(period0);
        org.junit.Assert.assertNotSame(partial1, partial0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 16);
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType0);
        org.joda.time.Period period0 = org.joda.time.Period.hours(16);
        org.joda.time.Partial partial2 = partial1.minus(period0);
        org.junit.Assert.assertEquals(0, partial2.size());
        org.junit.Assert.assertNotSame(partial2, partial1);
        org.junit.Assert.assertTrue(partial2.equals(((java.lang.Object)(partial1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        int[] intArray0 = new int[6];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)) , ((org.joda.time.DateTimeFieldType[])(null)) , intArray0);
        int[] intArray1 = partial0.getValues();
        org.junit.Assert.assertNotSame(intArray0, intArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(" < ");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        int int0 = partial0.getValue(1);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(" < ");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = partial0.getFieldType(1);
        org.junit.Assert.assertNull(dateTimeFieldType0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(" < ");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = partial0.getFieldType(1);
        org.junit.Assert.assertEquals("clockhourOfDay", dateTimeFieldType1.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(" < ");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.DateTimeField dateTimeField0 = partial0.getField(0, ((org.joda.time.Chronology)(copticChronology0)));
        org.junit.Assert.assertNotNull(dateTimeField0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        int[] intArray0 = new int[6];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.Chronology)(null)) , ((org.joda.time.DateTimeFieldType[])(null)) , intArray0);
        try {
            partial0.getFormatter();
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 16);
        java.lang.String string0 = partial0.toStringList();
        org.junit.Assert.assertEquals("[dayOfMonth=16]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertNull(dateTimeFormatter0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(((org.joda.time.ReadablePeriod)(null)), 0);
        org.junit.Assert.assertSame(partial0, partial1);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Period period0 = org.joda.time.Period.weeks(1972);
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(period0, 1972);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.TestMutableInterval_Updates testMutableInterval_Updates0 = new org.joda.time.TestMutableInterval_Updates("ywE8{|");
        org.joda.time.TestMutableInterval_Updates.MockBadInterval testMutableInterval_Updates_MockBadInterval0 = testMutableInterval_Updates0.new MockBadInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Updates_MockBadInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.junit.Assert.assertEquals(0, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 16);
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(partial0.getChronology()));
        org.junit.Assert.assertNotNull(iSOChronology0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int int0 = partial0.size();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        intArray0[0] = 32;
        org.joda.time.TestMutableInterval_Constructors testMutableInterval_Constructors0 = new org.joda.time.TestMutableInterval_Constructors("");
        org.joda.time.TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = new org.joda.time.Partial(partial0 , intArray0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        int[] intArray1 = partial0.getValues();
        org.junit.Assert.assertNotSame(intArray1, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 20);
        java.lang.String string0 = partial0.toString(((java.lang.String)(null)), ((java.util.Locale)(null)));
        org.junit.Assert.assertEquals("-W20", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        java.lang.String string0 = partial0.toString(((java.lang.String)(null)));
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertTrue(dateTimeFormatter0.isParser());
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(" < ");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        partial0.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        org.junit.Assert.assertNull(dateTimeFormatter0);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(" < ");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[1] = dateTimeFieldTypeArray0[0];
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldTypeArray0[0], 1);
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(partial1)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        intArray0[0] = 32;
        org.joda.time.TestMutableInterval_Constructors testMutableInterval_Constructors0 = new org.joda.time.TestMutableInterval_Constructors("");
        org.joda.time.TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadablePartial)(partial0)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(" < ");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime(1 , 3 , 1 , 3 , 3 , 1 , 1);
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(mutableDateTime0)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.DateTime dateTime0 = org.joda.time.DateTime.now();
        boolean boolean0 = partial0.isMatch(((org.joda.time.ReadableInstant)(dateTime0)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(" < ");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.Partial partial1 = partial0.withFieldAdded(durationFieldType0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        intArray0[0] = 32;
        org.joda.time.TestMutableInterval_Constructors testMutableInterval_Constructors0 = new org.joda.time.TestMutableInterval_Constructors("");
        org.joda.time.TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, 32);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        intArray0[0] = 32;
        org.joda.time.TestMutableInterval_Constructors testMutableInterval_Constructors0 = new org.joda.time.TestMutableInterval_Constructors("");
        org.joda.time.TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = partial0.withField(dateTimeFieldType0, 3002);
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 11);
        org.joda.time.Partial partial1 = partial0.without(dateTimeFieldType0);
        java.lang.String string0 = partial1.toString();
        org.junit.Assert.assertEquals("[]", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 11);
        org.joda.time.Partial partial1 = partial0.without(((org.joda.time.DateTimeFieldType)(null)));
        java.lang.String string0 = partial1.toString();
        org.junit.Assert.assertEquals("---11", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 16);
        org.joda.time.Partial partial1 = partial0.with(dateTimeFieldType0, 16);
        org.junit.Assert.assertEquals(1, partial1.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[1];
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        intArray0[0] = 32;
        org.joda.time.TestMutableInterval_Constructors testMutableInterval_Constructors0 = new org.joda.time.TestMutableInterval_Constructors("");
        org.joda.time.TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(testMutableInterval_Constructors_MockInterval0.getChronology()));
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0 , ((org.joda.time.Chronology)(iSOChronology0)));
        org.joda.time.Partial partial1 = partial0.withChronologyRetainFields(iSOChronology0);
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test71() throws java.lang.Throwable {
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)(localDate0)));
        org.junit.Assert.assertEquals(3, partial0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test82() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , 28265625);
        org.joda.time.Partial partial0 = partial_Property0.getPartial();
        org.junit.Assert.assertNull(partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        org.joda.time.Partial.Property partial_Property0 = new org.joda.time.Partial.Property(((org.joda.time.Partial)(null)) , 64);
        org.joda.time.ReadablePartial readablePartial0 = partial_Property0.getReadablePartial();
        org.junit.Assert.assertNull(readablePartial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test86() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(" < ");
        org.joda.time.TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        org.joda.time.chrono.CopticChronology copticChronology0 = ((org.joda.time.chrono.CopticChronology)(testLocalDate_Basics_MockInstant0.getChronology()));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[2];
        int[] intArray0 = new int[7];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(copticChronology0 , dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = partial0.getFieldTypes();
        org.junit.Assert.assertNotSame(dateTimeFieldTypeArray1, dateTimeFieldTypeArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test87() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 16);
        org.joda.time.Period period0 = org.joda.time.Period.hours(16);
        org.joda.time.Partial partial1 = partial0.minus(period0);
        org.junit.Assert.assertTrue(partial1.equals(((java.lang.Object)(partial0))));
        org.junit.Assert.assertNotSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test88() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldType0 , 16);
        org.joda.time.Partial partial1 = partial0.plus(((org.joda.time.ReadablePeriod)(null)));
        org.junit.Assert.assertSame(partial1, partial0);
    }

    @org.junit.Test(timeout = 4000)
    public void test89() throws java.lang.Throwable {
        org.joda.time.TestLocalDate_Basics testLocalDate_Basics0 = new org.joda.time.TestLocalDate_Basics(" < ");
        testLocalDate_Basics0.testCompareTo();
    }

    @org.junit.Test(timeout = 4000)
    public void test90() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        org.joda.time.Partial partial0 = new org.joda.time.Partial(dateTimeFieldTypeArray0 , intArray0);
        org.joda.time.MockNullZoneChronology mockNullZoneChronology0 = new org.joda.time.MockNullZoneChronology();
        org.joda.time.Period period0 = new org.joda.time.Period(((long)(0)) , ((org.joda.time.Chronology)(mockNullZoneChronology0)));
        org.joda.time.Weeks weeks0 = period0.toStandardWeeks();
        org.joda.time.Days days0 = weeks0.toStandardDays();
        org.joda.time.Partial partial1 = partial0.withPeriodAdded(days0, 0);
        org.junit.Assert.assertSame(partial1, partial0);
    }
}

