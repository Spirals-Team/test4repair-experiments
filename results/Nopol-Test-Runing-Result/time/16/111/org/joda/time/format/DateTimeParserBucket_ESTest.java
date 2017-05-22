package org.joda.time.format;


public class DateTimeParserBucket_ESTest extends org.joda.time.format.DateTimeParserBucket_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , (-1249));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField0 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField0 , dateTimeFieldType0);
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new org.joda.time.format.DateTimeParserBucket.SavedField(delegatedDateTimeField0 , "org.joda.time.tz.FixedDateTimeZone" , locale0);
        int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.CANADA;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1L) , ((org.joda.time.Chronology)(copticChronology0)) , locale0 , ((java.lang.Integer)(copticChronology0.AM)) , (-2324));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        boolean boolean0 = dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfHalfday();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , 1);
        long long0 = dateTimeParserBucket_SavedField0.set(3402L, false);
        org.junit.Assert.assertEquals(3603402L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.util.Locale locale0 = new java.util.Locale("R5e@XvRiz3?OgOn+" , "LcteM}d}`L5");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        dateTimeParserBucket0.setZone(((org.joda.time.DateTimeZone)(null)));
        org.joda.time.DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
        org.junit.Assert.assertNull(dateTimeZone0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.forID(((java.lang.String)(null)))));
        org.joda.time.chrono.ZonedChronology zonedChronology0 = org.joda.time.chrono.ZonedChronology.getInstance(julianChronology0, cachedDateTimeZone0);
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.Integer integer0 = new java.lang.Integer(0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1L) , ((org.joda.time.Chronology)(zonedChronology0)) , locale0 , integer0 , 0);
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals(0, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(647L , ((org.joda.time.Chronology)(copticChronology0)) , locale0 , ((java.lang.Integer)(1)) , 1);
        java.lang.Integer integer0 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals(1, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.Integer integer0 = new java.lang.Integer((-2096));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1L) , ((org.joda.time.Chronology)(copticChronology0)) , locale0 , integer0 , (-2324));
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals((-2096), ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.ROOT;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(259200000L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        dateTimeParserBucket0.setOffset(1);
        dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals(1, dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(((long)(1)) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(1)));
        dateTimeParserBucket0.setOffset(0);
        java.lang.Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(905L , ((org.joda.time.Chronology)(gregorianChronology0)) , locale0);
        dateTimeParserBucket0.setOffset((-229));
        dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals((-229), dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(905L , ((org.joda.time.Chronology)(gregorianChronology0)) , locale0);
        dateTimeParserBucket0.setOffset((-229));
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals((-229), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.KOREA;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(((long)(0)) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0);
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance(((org.joda.time.DateTimeZone)(cachedDateTimeZone0)), islamicChronology_LeapYearPatternType0);
        org.joda.time.chrono.IslamicChronology islamicChronology1 = ((org.joda.time.chrono.IslamicChronology)(islamicChronology0.withUTC()));
        java.util.Locale locale0 = java.util.Locale.ITALY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(782L , ((org.joda.time.Chronology)(islamicChronology1)) , locale0);
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals(782L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.DurationField durationField0 = buddhistChronology0.years();
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(((org.joda.time.DurationField)(null)), durationField0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.joda.time.MockZone mockZone0 = new org.joda.time.MockZone(4317L , (-367) , (-367));
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance(((org.joda.time.DateTimeZone)(mockZone0)));
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField0 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField0);
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(delegatedDateTimeField0 , "" , locale0);
        org.joda.time.DateTimeField dateTimeField1 = buddhistChronology0.yearOfEra();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField1 , "" , locale0);
        int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.ROOT;
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField1 = buddhistChronology0.clockhourOfDay();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , ((java.lang.String)(null)) , locale0);
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField1 , 1324);
        int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.util.Locale locale0 = new java.util.Locale("R5e@XvRiz3?OgOn+" , "LcteM}d}`L5");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        dateTimeParserBucket0.setZone(((org.joda.time.DateTimeZone)(null)));
        long long0 = dateTimeParserBucket0.computeMillis(true, "");
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.ROOT;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(259200000L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.weekyear();
        dateTimeParserBucket0.saveField(dateTimeField0, 1);
        dateTimeParserBucket0.saveField(dateTimeField0, 1);
        long long0 = dateTimeParserBucket0.computeMillis(true, "`UI JL");
        org.junit.Assert.assertEquals((-79271396322000L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-982L) , ((org.joda.time.Chronology)(ethiopicChronology0)) , ((java.util.Locale)(null)) , ((java.lang.Integer)(1)));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        boolean boolean0 = dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.KOREA;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(((long)(0)) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState1 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.junit.Assert.assertSame(dateTimeParserBucket_SavedState1, dateTimeParserBucket_SavedState0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(((long)(1)) , ((org.joda.time.Chronology)(ethiopicChronology0)) , ((java.util.Locale)(null)) , ((java.lang.Integer)(1)) , 1);
        org.junit.Assert.assertEquals(0, dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DurationField durationField0 = buddhistChronology0.weekyears();
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.seconds();
        org.joda.time.Period period0 = new org.joda.time.Period(0L , periodType0 , ((org.joda.time.Chronology)(buddhistChronology0)));
        org.joda.time.Hours hours0 = period0.toStandardHours();
        org.joda.time.Minutes minutes0 = hours0.toStandardMinutes();
        org.joda.time.Days days0 = minutes0.toStandardDays();
        org.joda.time.DurationFieldType durationFieldType0 = days0.getFieldType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField0 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(durationField0, unsupportedDurationField0);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(((org.joda.time.DurationField)(null)), ((org.joda.time.DurationField)(null)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField0 = ((org.joda.time.field.UnsupportedDurationField)(buddhistChronology0.eras()));
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(((long)(1)) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(1)));
        dateTimeParserBucket0.setOffset(0);
        long long0 = dateTimeParserBucket0.computeMillis(true, "America/New_York");
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)(cachedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(((long)(1)) , ((org.joda.time.Chronology)(ethiopicChronology0)) , locale0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket1 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(ethiopicChronology0)) , locale0 , ((java.lang.Integer)(null)) , (-228));
        boolean boolean0 = dateTimeParserBucket1.restoreState(dateTimeParserBucket_SavedState0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.util.Locale locale0 = new java.util.Locale("R5e@XvRiz3?OgOn+" , "LcteM}d}`L5");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        boolean boolean0 = dateTimeParserBucket0.restoreState(((java.lang.Object)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.Instant instant0 = gJChronology0.getGregorianCutover();
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(instant0.getChronology()));
        java.util.Locale locale0 = new java.util.Locale("org.joda.time.base.BaseDateTime" , "" , "");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1L , ((org.joda.time.Chronology)(iSOChronology0)) , locale0 , ((java.lang.Integer)(null)) , 1963);
        dateTimeParserBucket0.setOffset(1963);
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals(1963, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(((long)(1)) , ((org.joda.time.Chronology)(null)) , ((java.util.Locale)(null)));
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.util.Locale locale0 = new java.util.Locale("R5e@XvRiz3?OgOn+" , "LcteM}d}`L5");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        dateTimeParserBucket0.setOffset(((java.lang.Integer)(null)));
        org.junit.Assert.assertEquals(0, dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(((long)(1)) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(1)));
        dateTimeParserBucket0.setPivotYear(((java.lang.Integer)(1)));
        org.junit.Assert.assertEquals(0, dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.util.Locale locale0 = new java.util.Locale("R5e@XvRiz3?OgOn+" , "LcteM}d}`L5");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        dateTimeParserBucket0.setZone(((org.joda.time.DateTimeZone)(null)));
        long long0 = dateTimeParserBucket0.computeMillis(true);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , locale0);
        java.lang.Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(((long)(1)) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(1)));
        java.util.Locale locale1 = dateTimeParserBucket0.getLocale();
        org.junit.Assert.assertEquals("ko", locale1.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , locale0);
        dateTimeParserBucket0.setOffset(10980000);
        dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals(10980000, dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(iSOChronology0)) , ((java.util.Locale)(null)));
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals((-3600000L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.ROOT;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(259200000L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        java.lang.Integer integer0 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.util.Locale locale0 = new java.util.Locale("R5e@XvRiz3?OgOn+" , "LcteM}d}`L5");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        long long0 = dateTimeParserBucket0.computeMillis(true);
        org.junit.Assert.assertEquals((-3600000L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , locale0);
        org.joda.time.chrono.ISOChronology iSOChronology0 = ((org.joda.time.chrono.ISOChronology)(dateTimeParserBucket0.getChronology()));
        org.junit.Assert.assertNotNull(iSOChronology0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.ROOT;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(259200000L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(dateTimeParserBucket0.getZone()));
        org.junit.Assert.assertEquals("Europe/Paris", cachedDateTimeZone0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.ROOT;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(259200000L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
        dateTimeParserBucket0.saveField(dateTimeField0, 1);
        dateTimeParserBucket0.computeMillis(true, "`UI JL");
        long long0 = dateTimeParserBucket0.computeMillis(true);
        org.junit.Assert.assertEquals(18712245600000L, long0);
    }
}

