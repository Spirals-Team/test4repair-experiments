package org.joda.time.format;


public class DateTimeParserBucket_ESTest extends org.joda.time.format.DateTimeParserBucket_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.US;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(20L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeParserBucket0.saveField(dateTimeFieldType0, (-4232));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState1 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.junit.Assert.assertNotNull(dateTimeParserBucket_SavedState1);
        dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
        boolean boolean0 = dateTimeParserBucket_SavedState1.restoreState(dateTimeParserBucket0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField0 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField0);
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(delegatedDateTimeField0 , 1);
        long long0 = dateTimeParserBucket_SavedField0.set(1242L, false);
        org.junit.Assert.assertEquals((-378691198758L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)(null)));
        java.util.Locale locale0 = java.util.Locale.KOREA;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-2378L) , ((org.joda.time.Chronology)(iSOChronology0)) , locale0);
        dateTimeParserBucket0.setZone(((org.joda.time.DateTimeZone)(null)));
        org.joda.time.DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
        org.junit.Assert.assertNull(dateTimeZone0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.MockZone mockZone0 = new org.joda.time.MockZone(0L , 0 , 0);
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)(mockZone0)));
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.Integer integer0 = new java.lang.Integer(0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(86400L , ((org.joda.time.Chronology)(gJChronology0)) , locale0 , integer0);
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals(0, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_16_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance(((org.joda.time.DateTimeZone)(cachedDateTimeZone0)), islamicChronology_LeapYearPatternType0);
        org.joda.time.chrono.LenientChronology lenientChronology0 = org.joda.time.chrono.LenientChronology.getInstance(islamicChronology0);
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.Integer integer0 = new java.lang.Integer((-1));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1000000L , ((org.joda.time.Chronology)(lenientChronology0)) , locale0 , integer0 , (-1));
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals((-1), ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(24L , ((org.joda.time.Chronology)(ethiopicChronology0)) , locale0);
        dateTimeParserBucket0.setOffset((-607));
        dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals((-607), dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        java.util.Locale locale0 = new java.util.Locale("minuend" , "+00" , "");
        java.lang.Integer integer0 = new java.lang.Integer(0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1L , ((org.joda.time.Chronology)(gregorianChronology0)) , locale0 , integer0);
        dateTimeParserBucket0.setOffset(integer0);
        java.lang.Integer integer1 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals(0, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.forLanguageTag("-10:00");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(null)));
        dateTimeParserBucket0.setOffset((-563));
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals((-563), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.chrono.StrictChronology strictChronology0 = org.joda.time.chrono.StrictChronology.getInstance(buddhistChronology0);
        java.util.Locale locale0 = java.util.Locale.forLanguageTag("{bw %M:}v-v!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(strictChronology0)) , locale0 , ((java.lang.Integer)(1)));
        long long0 = dateTimeParserBucket0.computeMillis(false, "");
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0 , ((java.lang.Integer)(islamicChronology0.AH)));
        long long0 = dateTimeParserBucket0.computeMillis(true);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.forLanguageTag("-10:00");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(null)));
        dateTimeParserBucket0.setOffset((-563));
        long long0 = dateTimeParserBucket0.computeMillis(false);
        org.junit.Assert.assertEquals((-563), dateTimeParserBucket0.getOffset());
        org.junit.Assert.assertEquals(563L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)(null)));
        org.joda.time.chrono.LenientChronology lenientChronology0 = org.joda.time.chrono.LenientChronology.getInstance(copticChronology0);
        org.joda.time.chrono.LenientChronology lenientChronology1 = ((org.joda.time.chrono.LenientChronology)(lenientChronology0.withUTC()));
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(lenientChronology1)) , locale0 , ((java.lang.Integer)(1)) , 1);
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.US;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(2394L , ((org.joda.time.Chronology)(ethiopicChronology0)) , locale0 , ((java.lang.Integer)(1)) , 1);
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals(2394L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField0 = ((org.joda.time.field.UnsupportedDurationField)(buddhistChronology0.eras()));
        org.joda.time.chrono.LenientChronology lenientChronology0 = org.joda.time.chrono.LenientChronology.getInstance(copticChronology0);
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.weekyear();
        org.joda.time.field.SkipDateTimeField skipDateTimeField0 = new org.joda.time.field.SkipDateTimeField(((org.joda.time.Chronology)(lenientChronology0)) , dateTimeField0);
        org.joda.time.DurationField durationField0 = skipDateTimeField0.getDurationField();
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(unsupportedDurationField0, durationField0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.centuryOfEra();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , 1);
        org.joda.time.DateTimeField dateTimeField1 = buddhistChronology0.millisOfSecond();
        java.util.Locale locale0 = java.util.Locale.CHINA;
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField1 , "ww|!cv'|(lqLSFn" , locale0);
        int int0 = dateTimeParserBucket_SavedField1.compareTo(dateTimeParserBucket_SavedField0);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.joda.time.field.MillisDurationField millisDurationField0 = ((org.joda.time.field.MillisDurationField)(org.joda.time.field.MillisDurationField.INSTANCE));
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField0 = ((org.joda.time.field.UnsupportedDurationField)(buddhistChronology0.eras()));
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(millisDurationField0, unsupportedDurationField0);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.centuryOfEra();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , 1);
        org.joda.time.DateTimeField dateTimeField1 = buddhistChronology0.millisOfSecond();
        java.util.Locale locale0 = java.util.Locale.CHINA;
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField1 , "ww|!cv'|(lqLSFn" , locale0);
        int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField0 = ((org.joda.time.field.UnsupportedDurationField)(buddhistChronology0.eras()));
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.centuryOfEra();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , 1);
        int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-257L) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0);
        dateTimeParserBucket0.setOffset(((java.lang.Integer)(1)));
        long long0 = dateTimeParserBucket0.computeMillis(true, "BuddhistChronology[Europe/Paris]");
        org.junit.Assert.assertEquals((-258L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.US;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeParserBucket0.saveField(dateTimeFieldType0, (-4211));
        dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
        long long0 = dateTimeParserBucket0.computeMillis(true, "");
        org.junit.Assert.assertEquals((-3600000L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.ZonedChronology zonedChronology0 = org.joda.time.chrono.ZonedChronology.getInstance(ethiopicChronology0, fixedDateTimeZone0);
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)), 1);
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-3227L) , ((org.joda.time.Chronology)(zonedChronology0)) , locale0 , ((java.lang.Integer)(1)) , 1);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket1 = new org.joda.time.format.DateTimeParserBucket(1074L , ((org.joda.time.Chronology)(gregorianChronology0)) , locale0 , ((java.lang.Integer)(null)));
        boolean boolean0 = dateTimeParserBucket1.restoreState(dateTimeParserBucket_SavedState0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.ZonedChronology zonedChronology0 = org.joda.time.chrono.ZonedChronology.getInstance(ethiopicChronology0, fixedDateTimeZone0);
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-3227L) , ((org.joda.time.Chronology)(zonedChronology0)) , locale0 , ((java.lang.Integer)(1)) , 1);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        boolean boolean0 = dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.forLanguageTag("-10:00");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(null)));
        boolean boolean0 = dateTimeParserBucket0.restoreState(((java.lang.Object)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1L , ((org.joda.time.Chronology)(iSOChronology0)) , locale0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState1 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.junit.Assert.assertSame(dateTimeParserBucket_SavedState1, dateTimeParserBucket_SavedState0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.US;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        dateTimeParserBucket0.saveField(dateTimeFieldType0, (-4211));
        dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
        dateTimeParserBucket0.saveField(dateTimeFieldType0, 7);
        org.junit.Assert.assertEquals("dayOfMonth", dateTimeFieldType0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance(((org.joda.time.DateTimeZone)(cachedDateTimeZone0)));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(252L , ((org.joda.time.Chronology)(buddhistChronology0)) , ((java.util.Locale)(null)) , ((java.lang.Integer)(1)) , (-139));
        org.junit.Assert.assertEquals(0, dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-257L) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0);
        dateTimeParserBucket0.setOffset(((java.lang.Integer)(1)));
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(2713L , ((org.joda.time.Chronology)(null)) , locale0);
        java.lang.Integer integer0 = new java.lang.Integer(10);
        dateTimeParserBucket0.setPivotYear(integer0);
        org.junit.Assert.assertEquals(0, dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(2713L , ((org.joda.time.Chronology)(null)) , locale0);
        dateTimeParserBucket0.setZone(((org.joda.time.DateTimeZone)(null)));
        long long0 = dateTimeParserBucket0.computeMillis(true, "F[qY68`4l%");
        org.junit.Assert.assertEquals(2713L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1L , ((org.joda.time.Chronology)(iSOChronology0)) , locale0);
        java.lang.Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(128849018880000L , ((org.joda.time.Chronology)(iSOChronology0)) , locale0);
        java.util.Locale locale1 = dateTimeParserBucket0.getLocale();
        org.junit.Assert.assertEquals("GBR", locale1.getISO3Country());
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-257L) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0);
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals((-3600257L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.forLanguageTag("-10:00");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(null)));
        java.lang.Integer integer0 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.forLanguageTag("-10:00");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(null)));
        long long0 = dateTimeParserBucket0.computeMillis(false);
        org.junit.Assert.assertEquals((-3600000L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-257L) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0);
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = ((org.joda.time.chrono.BuddhistChronology)(dateTimeParserBucket0.getChronology()));
        org.junit.Assert.assertNotSame(buddhistChronology1, buddhistChronology0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.US;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(dateTimeParserBucket0.getZone()));
        org.junit.Assert.assertEquals("Europe/Paris", cachedDateTimeZone0.getID());
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-257L) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0);
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.dayOfYear();
        dateTimeParserBucket0.saveField(dateTimeField0, 1);
        long long0 = dateTimeParserBucket0.computeMillis(true, "BuddhistChronology[Europe/Paris]");
        org.junit.Assert.assertEquals((-16156369122000L), long0);
    }
}

