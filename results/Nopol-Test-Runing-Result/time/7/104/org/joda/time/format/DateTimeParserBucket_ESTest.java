package org.joda.time.format;


public class DateTimeParserBucket_ESTest extends org.joda.time.format.DateTimeParserBucket_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.minuteOfDay();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , 1);
        org.joda.time.DateTimeField dateTimeField1 = buddhistChronology0.millisOfDay();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField1 , "" , locale0);
        int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.minuteOfDay();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , 1);
        long long0 = dateTimeParserBucket_SavedField0.set(1372L, false);
        org.junit.Assert.assertEquals(61372L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)(cachedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(gJChronology0)) , locale0 , ((java.lang.Integer)(null)));
        java.lang.Integer integer0 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(((long)(0)) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(1)) , (-2225));
        java.lang.Integer integer0 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals(1, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(buddhistChronology0.getZone()));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1021L , ((org.joda.time.Chronology)(ethiopicChronology0)) , locale0 , ((java.lang.Integer)(null)) , 2754);
        java.lang.Integer integer0 = new java.lang.Integer((-551));
        dateTimeParserBucket0.setPivotYear(integer0);
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals((-551), ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.ROOT;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1474L , ((org.joda.time.Chronology)(ethiopicChronology0)) , locale0);
        dateTimeParserBucket0.setOffset(8);
        dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals(8, dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.forOffsetMillis(1612)));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)), islamicChronology_LeapYearPatternType0);
        java.util.Locale locale0 = java.util.Locale.US;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-2049L) , ((org.joda.time.Chronology)(islamicChronology0)) , locale0 , ((java.lang.Integer)(1)));
        dateTimeParserBucket0.setOffset((-8));
        dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals((-8), dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.forOffsetMillis(1614)));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)), islamicChronology_LeapYearPatternType0);
        java.util.Locale locale0 = java.util.Locale.US;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-2049L) , ((org.joda.time.Chronology)(islamicChronology0)) , locale0 , ((java.lang.Integer)(1)));
        dateTimeParserBucket0.setOffset((-8));
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals((-8), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(buddhistChronology0.getZone()));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1021L , ((org.joda.time.Chronology)(ethiopicChronology0)) , locale0 , ((java.lang.Integer)(null)) , 2754);
        long long0 = dateTimeParserBucket0.computeMillis(true);
        org.junit.Assert.assertEquals(1021L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.chrono.StrictChronology strictChronology0 = org.joda.time.chrono.StrictChronology.getInstance(gJChronology0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(strictChronology0)) , ((java.util.Locale)(null)));
        long long0 = dateTimeParserBucket0.computeMillis(false);
        org.junit.Assert.assertEquals((-3600000L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(26607895200000L , ((org.joda.time.Chronology)(gJChronology0)) , locale0 , ((java.lang.Integer)(null)));
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals(26607891600000L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DurationField durationField0 = buddhistChronology0.halfdays();
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(((org.joda.time.DurationField)(null)), durationField0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.DurationField durationField0 = buddhistChronology0.years();
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(durationField0, ((org.joda.time.DurationField)(null)));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.forLanguageTag(";voO,DSDc3?Jt");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField0 = dateTimeFieldType0.getField(islamicChronology0);
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField0 = new org.joda.time.field.SkipUndoDateTimeField(((org.joda.time.Chronology)(islamicChronology0)) , dateTimeField0);
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(skipUndoDateTimeField0 , ";voO,DSDc3?Jt" , locale0);
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = buddhistChronology0.clockhourOfDay();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField1 , 99);
        int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.Integer integer0 = new java.lang.Integer(0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , locale0 , integer0);
        dateTimeParserBucket0.setZone(((org.joda.time.DateTimeZone)(null)));
        long long0 = dateTimeParserBucket0.computeMillis(true, "Cannot parse \"");
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.Integer integer0 = new java.lang.Integer(0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , locale0 , integer0);
        dateTimeParserBucket0.setOffset(integer0);
        long long0 = dateTimeParserBucket0.computeMillis(true, "Cannot parse \"");
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(900L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(1)));
        long long0 = dateTimeParserBucket0.computeMillis(false, "");
        org.junit.Assert.assertEquals(900L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(2612L , ((org.joda.time.Chronology)(null)) , locale0 , integer0 , 352831696);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        boolean boolean0 = dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(16123L , ((org.joda.time.Chronology)(buddhistChronology0)) , ((java.util.Locale)(null)) , ((java.lang.Integer)(1)));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState1 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.junit.Assert.assertSame(dateTimeParserBucket_SavedState1, dateTimeParserBucket_SavedState0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-2206L) , ((org.joda.time.Chronology)(buddhistChronology0)) , ((java.util.Locale)(null)) , ((java.lang.Integer)(buddhistChronology0.BE)) , 1);
        org.junit.Assert.assertEquals(0, dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance(((org.joda.time.DateTimeZone)(cachedDateTimeZone0)));
        org.joda.time.DurationField durationField0 = buddhistChronology0.days();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField0 = ((org.joda.time.field.UnsupportedDurationField)(buddhistChronology0.eras()));
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(durationField0, unsupportedDurationField0);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField0 = ((org.joda.time.field.UnsupportedDurationField)(buddhistChronology0.eras()));
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(((org.joda.time.DurationField)(null)), ((org.joda.time.DurationField)(null)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.Integer integer0 = new java.lang.Integer(0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , locale0 , integer0);
        dateTimeParserBucket0.setZone(((org.joda.time.DateTimeZone)(null)));
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.Integer integer0 = new java.lang.Integer(0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , locale0 , integer0);
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.minuteOfDay();
        dateTimeParserBucket0.saveField(dateTimeField0, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        dateTimeParserBucket0.saveField(dateTimeFieldType0, 0);
        long long0 = dateTimeParserBucket0.computeMillis(true, "Cannot parse \"");
        org.junit.Assert.assertEquals((-3600000L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.Integer integer0 = new java.lang.Integer(0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , locale0 , integer0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.minuteOfDay();
        dateTimeParserBucket0.saveField(dateTimeField0, 0);
        dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
        long long0 = dateTimeParserBucket0.computeMillis(true, "Cannot parse \"");
        org.junit.Assert.assertEquals((-3600000L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.forOffsetMillis(1614)));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)), islamicChronology_LeapYearPatternType0);
        java.util.Locale locale0 = java.util.Locale.US;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-2049L) , ((org.joda.time.Chronology)(islamicChronology0)) , locale0 , ((java.lang.Integer)(1)));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket1 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket1.new SavedState();
        boolean boolean0 = dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.forOffsetMillis(1612)));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)), islamicChronology_LeapYearPatternType0);
        java.util.Locale locale0 = java.util.Locale.US;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-2049L) , ((org.joda.time.Chronology)(islamicChronology0)) , locale0 , ((java.lang.Integer)(1)));
        boolean boolean0 = dateTimeParserBucket0.restoreState(islamicChronology0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1500L , ((org.joda.time.Chronology)(copticChronology0)) , ((java.util.Locale)(null)) , ((java.lang.Integer)(1)));
        dateTimeParserBucket0.setOffset(((java.lang.Integer)(copticChronology0.AM)));
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        java.util.Locale locale0 = java.util.Locale.US;
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)(cachedDateTimeZone0)));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(((long)(1)) , ((org.joda.time.Chronology)(iSOChronology0)) , locale0);
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)(cachedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.Integer integer0 = new java.lang.Integer(0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(174L , ((org.joda.time.Chronology)(gJChronology0)) , locale0 , integer0 , 166);
        java.lang.Integer integer1 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertNull(integer1);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)(cachedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.Integer integer0 = new java.lang.Integer(0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(174L , ((org.joda.time.Chronology)(gJChronology0)) , locale0 , integer0 , 166);
        java.util.Locale locale1 = dateTimeParserBucket0.getLocale();
        org.junit.Assert.assertEquals("zh", locale1.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)(cachedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.Integer integer0 = new java.lang.Integer(0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(174L , ((org.joda.time.Chronology)(gJChronology0)) , locale0 , integer0 , 166);
        dateTimeParserBucket0.setOffset(0);
        java.lang.Integer integer1 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals(0, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.Integer integer0 = new java.lang.Integer((-21));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , locale0 , integer0);
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals((-3600000L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)(cachedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.Integer integer0 = new java.lang.Integer(0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(174L , ((org.joda.time.Chronology)(gJChronology0)) , locale0 , integer0 , 166);
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals(0, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.US;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(julianChronology0)) , locale0 , ((java.lang.Integer)(1)));
        long long0 = dateTimeParserBucket0.computeMillis(false);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)(cachedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.Integer integer0 = new java.lang.Integer(0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(174L , ((org.joda.time.Chronology)(gJChronology0)) , locale0 , integer0 , 166);
        org.joda.time.chrono.GJChronology gJChronology1 = ((org.joda.time.chrono.GJChronology)(dateTimeParserBucket0.getChronology()));
        org.junit.Assert.assertNotSame(gJChronology0, gJChronology1);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        java.util.Locale locale0 = java.util.Locale.US;
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)(cachedDateTimeZone0)));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(((long)(1)) , ((org.joda.time.Chronology)(iSOChronology0)) , locale0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone1 = ((org.joda.time.tz.CachedDateTimeZone)(dateTimeParserBucket0.getZone()));
        org.junit.Assert.assertSame(cachedDateTimeZone1, cachedDateTimeZone0);
    }
}

