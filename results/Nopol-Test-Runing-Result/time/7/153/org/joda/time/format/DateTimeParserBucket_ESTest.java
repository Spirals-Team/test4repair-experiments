package org.joda.time.format;


public class DateTimeParserBucket_ESTest extends org.joda.time.format.DateTimeParserBucket_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , 1753);
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        org.joda.time.DateTimeField dateTimeField1 = buddhistChronology0.weekyearOfCentury();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField1 , "a" , locale0);
        int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        java.util.Locale locale0 = new java.util.Locale("" , "0+*$s");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , locale0);
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
        dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
        long long0 = dateTimeParserBucket0.computeMillis(false);
        org.junit.Assert.assertEquals(946681200000L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)(null)))));
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance(((org.joda.time.DateTimeZone)(cachedDateTimeZone0)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField0 = dateTimeFieldType0.getField(buddhistChronology0);
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , 1);
        long long0 = dateTimeParserBucket_SavedField0.set(7785L, false);
        org.junit.Assert.assertEquals(7785L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(julianChronology0)) , locale0);
        dateTimeParserBucket0.setZone(((org.joda.time.DateTimeZone)(null)));
        org.joda.time.DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
        org.junit.Assert.assertNull(dateTimeZone0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-412L) , ((org.joda.time.Chronology)(gJChronology0)) , locale0 , ((java.lang.Integer)(null)));
        java.lang.Integer integer0 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.Integer integer0 = new java.lang.Integer(0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(((long)(1)) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , integer0 , 0);
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals(0, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        java.util.Locale locale0 = new java.util.Locale("");
        java.lang.Integer integer0 = new java.lang.Integer((-15));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(41000L , ((org.joda.time.Chronology)(gregorianChronology0)) , locale0 , integer0 , (-1));
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals((-15), ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1L , ((org.joda.time.Chronology)(ethiopicChronology0)) , locale0 , ((java.lang.Integer)(ethiopicChronology0.EE)));
        dateTimeParserBucket0.setOffset(0);
        java.lang.Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        java.util.Locale locale0 = new java.util.Locale("m6$Z[M2" , "m6$Z[M2");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(gregorianChronology0)) , locale0);
        dateTimeParserBucket0.setOffset(((java.lang.Integer)(1)));
        java.lang.Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals(1, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = new java.util.Locale("" , "" , "wZ~cn H,/7Y");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(24L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(1)));
        dateTimeParserBucket0.setOffset((-2172));
        dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals((-2172), dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 0)));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.StrictChronology strictChronology0 = org.joda.time.chrono.StrictChronology.getInstance(ethiopicChronology0);
        java.util.Locale locale0 = java.util.Locale.CANADA;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(275L , ((org.joda.time.Chronology)(strictChronology0)) , locale0 , ((java.lang.Integer)(1)) , 0);
        dateTimeParserBucket0.setOffset(((java.lang.Integer)(ethiopicChronology0.EE)));
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(copticChronology0)) , locale0 , ((java.lang.Integer)(1)) , 2161);
        long long0 = dateTimeParserBucket0.computeMillis(true);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        java.util.Locale locale0 = new java.util.Locale("org.joda.time.field.TestPreciseDurationDateTimeField$MockCountingDurationField");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(2355L , ((org.joda.time.Chronology)(ethiopicChronology0)) , locale0 , ((java.lang.Integer)(ethiopicChronology0.EE)));
        long long0 = dateTimeParserBucket0.computeMillis(true);
        org.junit.Assert.assertEquals((-3597645L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.MockPartial mockPartial0 = new org.joda.time.MockPartial();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(mockPartial0.getChronology()));
        java.util.Locale locale0 = java.util.Locale.US;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(iSOChronology0)) , locale0);
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-104L) , ((org.joda.time.Chronology)(gJChronology0)) , ((java.util.Locale)(null)));
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals((-3600104L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.DurationField durationField0 = buddhistChronology0.years();
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(durationField0, durationField0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.DurationField durationField0 = durationFieldType0.getField(julianChronology0);
        org.joda.time.field.PreciseDurationField preciseDurationField0 = new org.joda.time.field.PreciseDurationField(durationFieldType0 , ((long)(0)));
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(durationField0, preciseDurationField0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , 1);
        org.joda.time.DateTimeField dateTimeField1 = buddhistChronology0.dayOfWeek();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField1 , 1);
        int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        java.util.Locale locale0 = new java.util.Locale("" , "0+*$s");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , locale0);
        dateTimeParserBucket0.setOffset((-1648));
        long long0 = dateTimeParserBucket0.computeMillis(true, "");
        org.junit.Assert.assertEquals((-1648), dateTimeParserBucket0.getOffset());
        org.junit.Assert.assertEquals(1648L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.chrono.LenientChronology lenientChronology0 = org.joda.time.chrono.LenientChronology.getInstance(gregorianChronology0);
        java.lang.Integer integer0 = new java.lang.Integer((-4569));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1398L) , ((org.joda.time.Chronology)(lenientChronology0)) , ((java.util.Locale)(null)) , integer0 , (-4569));
        org.junit.Assert.assertEquals(0, dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.forOffsetMillis(493)));
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.DurationField durationField0 = buddhistChronology0.hours();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField0 = ((org.joda.time.field.UnsupportedDurationField)(buddhistChronology0.eras()));
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(durationField0, unsupportedDurationField0);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        java.util.Locale locale0 = new java.util.Locale("" , "0+*$s");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , locale0);
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
        long long0 = dateTimeParserBucket0.computeMillis(false);
        org.junit.Assert.assertEquals(946681200000L, long0);
        long long1 = dateTimeParserBucket0.computeMillis(true, "");
        org.junit.Assert.assertEquals(946681200000L, long1);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.era();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , 1);
        int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        java.util.Locale locale0 = new java.util.Locale("" , "0+*$s");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , locale0);
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
        long long0 = dateTimeParserBucket0.computeMillis(true, "");
        org.junit.Assert.assertEquals(946681200000L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        java.util.Locale locale0 = new java.util.Locale("" , "");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(83L , ((org.joda.time.Chronology)(copticChronology0)) , locale0 , ((java.lang.Integer)(copticChronology0.AM)));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
        org.joda.time.field.SkipDateTimeField skipDateTimeField0 = new org.joda.time.field.SkipDateTimeField(((org.joda.time.Chronology)(null)) , dateTimeField0);
        dateTimeParserBucket0.saveField(((org.joda.time.DateTimeField)(skipDateTimeField0)), 2951);
        dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
        long long0 = dateTimeParserBucket0.computeMillis(true, "");
        org.junit.Assert.assertEquals((-3599917L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = new java.util.Locale("" , "" , "wZ~cn H,/7Y");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(24L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(1)));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket1 = new org.joda.time.format.DateTimeParserBucket(3042L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(1)) , 1);
        boolean boolean0 = dateTimeParserBucket1.restoreState(dateTimeParserBucket_SavedState0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = new java.util.Locale("" , "" , "wZ~cn H,/7Y");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(24L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(1)));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        boolean boolean0 = dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        java.util.Locale locale0 = new java.util.Locale("m6$Z[M2" , "m6$Z[M2");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(gregorianChronology0)) , locale0);
        boolean boolean0 = dateTimeParserBucket0.restoreState(gregorianChronology0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        java.util.Locale locale0 = new java.util.Locale("" , "0+*$s");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , locale0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState1 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.junit.Assert.assertSame(dateTimeParserBucket_SavedState1, dateTimeParserBucket_SavedState0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        java.util.Locale locale0 = new java.util.Locale("org.joda.time.field.TestPreciseDurationDateTimeField$MockCountingDurationField");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(2355L , ((org.joda.time.Chronology)(ethiopicChronology0)) , locale0 , ((java.lang.Integer)(ethiopicChronology0.EE)));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
        dateTimeParserBucket0.saveField(dateTimeField0, 1);
        dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeParserBucket0.saveField(dateTimeFieldType0, "org.joda.time.field.TestPreciseDurationDateTimeField$MockCountingDurationField", locale0);
        org.junit.Assert.assertEquals("centuryOfEra", dateTimeFieldType0.getName());
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        java.util.Locale locale0 = new java.util.Locale("org.joda.time.field.TestPreciseDurationDateTimeField$MockCountingDurationField");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(2355L , ((org.joda.time.Chronology)(ethiopicChronology0)) , locale0 , ((java.lang.Integer)(ethiopicChronology0.EE)));
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(buddhistChronology0.BE)));
        dateTimeParserBucket0.setPivotYear(((java.lang.Integer)(1)));
        org.junit.Assert.assertEquals(0, dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(julianChronology0)) , locale0);
        dateTimeParserBucket0.setZone(((org.joda.time.DateTimeZone)(null)));
        long long0 = dateTimeParserBucket0.computeMillis(false, "fPoA5invv");
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = new java.util.Locale("" , "" , "wZ~cn H,/7Y");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(24L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(1)));
        java.lang.Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(julianChronology0)) , locale0);
        java.util.Locale locale1 = dateTimeParserBucket0.getLocale();
        org.junit.Assert.assertEquals("ja_JP", locale1.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        java.util.Locale locale0 = new java.util.Locale("" , "0+*$s");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , locale0);
        dateTimeParserBucket0.setOffset((-1648));
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals((-1648), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = new java.util.Locale("" , "" , "wZ~cn H,/7Y");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(24L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(1)));
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals(24L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(buddhistChronology0.BE)));
        java.lang.Integer integer0 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals(1, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        java.util.Locale locale0 = new java.util.Locale("" , "0+*$s");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , locale0);
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(dateTimeParserBucket0.getChronology()));
        org.junit.Assert.assertNotNull(iSOChronology0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(julianChronology0)) , locale0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeParserBucket0.getZone()));
        org.junit.Assert.assertEquals("UTC", fixedDateTimeZone0.toString());
    }
}

