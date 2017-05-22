package org.joda.time.format;


public class DateTimeParserBucket_ESTest extends org.joda.time.format.DateTimeParserBucket_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , (-719));
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField0 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField0);
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new org.joda.time.format.DateTimeParserBucket.SavedField(delegatedDateTimeField0 , 23);
        int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)(null)));
        java.util.Locale locale0 = new java.util.Locale("M" , "M");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(4776L , ((org.joda.time.Chronology)(gJChronology0)) , locale0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        dateTimeParserBucket0.saveField(dateTimeFieldType0, 15);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState1 = dateTimeParserBucket0.new SavedState();
        dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
        boolean boolean0 = dateTimeParserBucket_SavedState1.restoreState(dateTimeParserBucket0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.StrictChronology strictChronology0 = org.joda.time.chrono.StrictChronology.getInstance(copticChronology0);
        org.joda.time.DateTimeField dateTimeField0 = dateTimeFieldType0.getField(strictChronology0);
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , 1);
        long long0 = dateTimeParserBucket_SavedField0.set(1L, true);
        org.junit.Assert.assertEquals(60000L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.ITALY;
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.lang.Integer integer0 = new java.lang.Integer((-422));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1466L) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , integer0 , 1);
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals((-422), ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime((-2577L));
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)), ((org.joda.time.ReadableInstant)(dateTime0)));
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.Integer integer0 = new java.lang.Integer(0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-2577L) , ((org.joda.time.Chronology)(gJChronology0)) , locale0 , integer0);
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals(0, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.ITALY;
        org.joda.time.YearMonth yearMonth0 = org.joda.time.YearMonth.now(((org.joda.time.Chronology)(gJChronology0)));
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1466L) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(yearMonth0.MONTH_OF_YEAR)) , 1);
        java.lang.Integer integer0 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals(1, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.forOffsetMillis(388)));
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)), ((org.joda.time.ReadableInstant)(null)), 1);
        org.joda.time.chrono.StrictChronology strictChronology0 = org.joda.time.chrono.StrictChronology.getInstance(gJChronology0);
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.Integer integer0 = new java.lang.Integer((-1810800000));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(strictChronology0)) , locale0 , integer0);
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals((-1810800000), ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(16L , ((org.joda.time.Chronology)(islamicChronology0)) , ((java.util.Locale)(null)) , ((java.lang.Integer)(1)));
        dateTimeParserBucket0.setOffset(1);
        dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals(1, dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(buddhistChronology0.getZone()));
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.CHINA;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1953L) , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        dateTimeParserBucket0.setOffset((-2667));
        dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals((-2667), dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(16L , ((org.joda.time.Chronology)(islamicChronology0)) , ((java.util.Locale)(null)) , ((java.lang.Integer)(1)));
        dateTimeParserBucket0.setOffset(1);
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.util.Locale locale0 = new java.util.Locale(">d\"[" , ">d\"[");
        java.lang.Integer integer0 = new java.lang.Integer(37230040);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(iSOChronology0)) , locale0 , integer0);
        long long0 = dateTimeParserBucket0.computeMillis(true);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.MockZone mockZone0 = new org.joda.time.MockZone((-2222L) , 41 , 1659);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance(((org.joda.time.DateTimeZone)(mockZone0)), islamicChronology_LeapYearPatternType0);
        org.joda.time.chrono.IslamicChronology islamicChronology1 = ((org.joda.time.chrono.IslamicChronology)(islamicChronology0.withUTC()));
        java.util.Locale locale0 = new java.util.Locale("" , "");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(islamicChronology1)) , locale0 , ((java.lang.Integer)(1)));
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.ITALY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1589L , ((org.joda.time.Chronology)(ethiopicChronology0)) , locale0);
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals(1589L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.DurationField durationField0 = buddhistChronology0.halfdays();
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.field.ScaledDurationField scaledDurationField0 = new org.joda.time.field.ScaledDurationField(durationField0 , durationFieldType0 , 2007);
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(scaledDurationField0, durationField0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.weekyear();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , 1);
        org.joda.time.DateTimeField dateTimeField1 = buddhistChronology0.halfdayOfDay();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField1 , (-6));
        int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DurationField durationField0 = buddhistChronology0.weeks();
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField0 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(durationField0, unsupportedDurationField0);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField0 = ((org.joda.time.field.UnsupportedDurationField)(buddhistChronology0.eras()));
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(((org.joda.time.DurationField)(null)), ((org.joda.time.DurationField)(null)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)(null)));
        java.util.Locale locale0 = new java.util.Locale("M" , "M");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(4776L , ((org.joda.time.Chronology)(gJChronology0)) , locale0);
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        dateTimeParserBucket0.saveField(dateTimeFieldType0, 15);
        dateTimeParserBucket0.saveField(dateTimeFieldType0, 1304);
        long long0 = dateTimeParserBucket0.computeMillis(true, "J79O>]");
        org.junit.Assert.assertEquals((-3598696L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)(null)));
        java.util.Locale locale0 = new java.util.Locale("M" , "M");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(4776L , ((org.joda.time.Chronology)(gJChronology0)) , locale0);
        dateTimeParserBucket0.setZone(((org.joda.time.DateTimeZone)(null)));
        long long0 = dateTimeParserBucket0.computeMillis(true, "J79O>]");
        org.junit.Assert.assertEquals(4776L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)(null)));
        java.util.Locale locale0 = new java.util.Locale("M" , "M");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(4776L , ((org.joda.time.Chronology)(gJChronology0)) , locale0);
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        dateTimeParserBucket0.saveField(dateTimeFieldType0, 15);
        long long0 = dateTimeParserBucket0.computeMillis(true);
        org.junit.Assert.assertEquals((-3599985L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.StrictChronology strictChronology0 = org.joda.time.chrono.StrictChronology.getInstance(ethiopicChronology0);
        org.joda.time.chrono.LimitChronology limitChronology0 = org.joda.time.chrono.LimitChronology.getInstance(strictChronology0, ((org.joda.time.ReadableDateTime)(null)), ((org.joda.time.ReadableDateTime)(null)));
        java.util.Locale locale0 = java.util.Locale.CHINA;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(limitChronology0)) , locale0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        dateTimeParserBucket0.saveField(dateTimeFieldType0, "", locale0);
        dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
        long long0 = dateTimeParserBucket0.computeMillis(true, "");
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(buddhistChronology0.getZone()));
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.CHINA;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1953L) , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket1 = new org.joda.time.format.DateTimeParserBucket(1L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(islamicChronology0.AH)) , 561000);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket1.new SavedState();
        boolean boolean0 = dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-361L) , ((org.joda.time.Chronology)(islamicChronology0)) , locale0 , ((java.lang.Integer)(islamicChronology0.AH)));
        boolean boolean0 = dateTimeParserBucket0.restoreState(islamicChronology0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1516L , ((org.joda.time.Chronology)(iSOChronology0)) , ((java.util.Locale)(null)));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState1 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.junit.Assert.assertSame(dateTimeParserBucket_SavedState1, dateTimeParserBucket_SavedState0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.ITALY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(((long)(0)) , ((org.joda.time.Chronology)(gJChronology0)) , locale0);
        dateTimeParserBucket0.setOffset((-1454));
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals((-1454), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.ITALY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1589L , ((org.joda.time.Chronology)(ethiopicChronology0)) , locale0);
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1L) , ((org.joda.time.Chronology)(gJChronology0)) , locale0 , ((java.lang.Integer)(1)) , 1);
        dateTimeParserBucket0.setOffset(((java.lang.Integer)(1)));
        org.junit.Assert.assertEquals(1, dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)(null)));
        java.util.Locale locale0 = new java.util.Locale("M" , "M");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(4776L , ((org.joda.time.Chronology)(gJChronology0)) , locale0);
        dateTimeParserBucket0.setPivotYear(((java.lang.Integer)(null)));
        org.junit.Assert.assertEquals(0, dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(buddhistChronology0.getZone()));
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.CHINA;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1953L) , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        java.lang.Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(buddhistChronology0.getZone()));
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.CHINA;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1953L) , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        dateTimeParserBucket0.setOffset((-2667));
        long long0 = dateTimeParserBucket0.computeMillis(false, ((java.lang.String)(null)));
        org.junit.Assert.assertEquals((-2667), dateTimeParserBucket0.getOffset());
        org.junit.Assert.assertEquals(714L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.ITALY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-3091L) , ((org.joda.time.Chronology)(gJChronology0)) , locale0);
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals((-3603091L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.chrono.LenientChronology lenientChronology0 = org.joda.time.chrono.LenientChronology.getInstance(iSOChronology0);
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-59999L) , ((org.joda.time.Chronology)(lenientChronology0)) , locale0);
        java.lang.Integer integer0 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.StrictChronology strictChronology0 = org.joda.time.chrono.StrictChronology.getInstance(ethiopicChronology0);
        org.joda.time.chrono.LimitChronology limitChronology0 = org.joda.time.chrono.LimitChronology.getInstance(strictChronology0, ((org.joda.time.ReadableDateTime)(null)), ((org.joda.time.ReadableDateTime)(null)));
        java.util.Locale locale0 = java.util.Locale.CHINA;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(limitChronology0)) , locale0);
        org.joda.time.chrono.LimitChronology limitChronology1 = ((org.joda.time.chrono.LimitChronology)(dateTimeParserBucket0.getChronology()));
        org.junit.Assert.assertSame(limitChronology1, limitChronology0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(buddhistChronology0.getZone()));
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.CHINA;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1953L) , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone1 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeParserBucket0.getZone()));
        org.junit.Assert.assertSame(fixedDateTimeZone0, fixedDateTimeZone1);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(buddhistChronology0.getZone()));
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.CHINA;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1953L) , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        boolean boolean0 = dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.yearOfEra();
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , "" , locale0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)(null)));
        java.util.Locale locale0 = new java.util.Locale("M" , "M");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(4776L , ((org.joda.time.Chronology)(gJChronology0)) , locale0);
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        dateTimeParserBucket0.saveField(dateTimeFieldType0, 15);
        long long0 = dateTimeParserBucket0.computeMillis(true);
        org.junit.Assert.assertEquals(947890800000L, long0);
        long long1 = dateTimeParserBucket0.computeMillis(true, "J79O>]");
        org.junit.Assert.assertEquals(947890800000L, long1);
    }
}

