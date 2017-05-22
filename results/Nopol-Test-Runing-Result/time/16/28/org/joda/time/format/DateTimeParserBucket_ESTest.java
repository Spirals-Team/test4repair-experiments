package org.joda.time.format;


public class DateTimeParserBucket_ESTest extends org.joda.time.format.DateTimeParserBucket_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfDay();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , 1);
        long long0 = dateTimeParserBucket_SavedField0.set(1, false);
        org.junit.Assert.assertEquals(3600001L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.Integer integer0 = new java.lang.Integer(0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1417L) , ((org.joda.time.Chronology)(null)) , locale0 , integer0);
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals(0, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0);
        dateTimeParserBucket0.setPivotYear(((java.lang.Integer)(1)));
        java.lang.Integer integer0 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals(1, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        java.util.Locale locale0 = new java.util.Locale(" &W " , "hf#t_y=");
        java.lang.Integer integer0 = new java.lang.Integer((-3857));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(768L , ((org.joda.time.Chronology)(julianChronology0)) , locale0 , integer0 , (-3857));
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals((-3857), ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.LenientChronology lenientChronology0 = org.joda.time.chrono.LenientChronology.getInstance(julianChronology0);
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(lenientChronology0)) , locale0);
        java.lang.Integer integer0 = new java.lang.Integer(3610);
        dateTimeParserBucket0.setOffset(integer0);
        java.lang.Integer integer1 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals(3610, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1524L) , ((org.joda.time.Chronology)(gregorianChronology0)) , locale0 , ((java.lang.Integer)(null)) , (-1991));
        java.lang.Integer integer0 = new java.lang.Integer((-20));
        dateTimeParserBucket0.setOffset(integer0);
        java.lang.Integer integer1 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals((-20), ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1524L) , ((org.joda.time.Chronology)(gregorianChronology0)) , locale0 , ((java.lang.Integer)(null)) , (-1991));
        java.lang.Integer integer0 = new java.lang.Integer((-20));
        dateTimeParserBucket0.setOffset(integer0);
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals((-20), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.US;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(copticChronology0)) , locale0);
        long long0 = dateTimeParserBucket0.computeMillis(false, "");
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.MockZone mockZone0 = new org.joda.time.MockZone(0L , (-1394) , (-1394));
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance(((org.joda.time.DateTimeZone)(mockZone0)));
        java.util.Locale locale0 = new java.util.Locale("*u J5Js_yuCW" , "5u");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-929L) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(1)));
        long long0 = dateTimeParserBucket0.computeMillis(false);
        org.junit.Assert.assertEquals(1394465L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1585L) , ((org.joda.time.Chronology)(null)) , locale0);
        long long0 = dateTimeParserBucket0.computeMillis(true);
        org.junit.Assert.assertEquals((-3601585L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0);
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(192L , ((org.joda.time.Chronology)(julianChronology0)) , locale0 , ((java.lang.Integer)(null)));
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals(192L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(((org.joda.time.DurationField)(null)), ((org.joda.time.DurationField)(null)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DurationField durationField0 = buddhistChronology0.hours();
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(((org.joda.time.DurationField)(null)), durationField0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.forID(((java.lang.String)(null)))));
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance(((org.joda.time.DateTimeZone)(cachedDateTimeZone0)));
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
        org.joda.time.field.LenientDateTimeField lenientDateTimeField0 = ((org.joda.time.field.LenientDateTimeField)(org.joda.time.field.LenientDateTimeField.getInstance(dateTimeField0, buddhistChronology0)));
        java.util.Locale locale0 = java.util.Locale.KOREA;
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(lenientDateTimeField0 , ((java.lang.String)(null)) , locale0);
        org.joda.time.DateTimeField dateTimeField1 = buddhistChronology0.centuryOfEra();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField1 , ((java.lang.String)(null)) , locale0);
        int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfHalfday();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , 1);
        int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.Integer integer0 = new java.lang.Integer(2);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-290L) , ((org.joda.time.Chronology)(iSOChronology0)) , ((java.util.Locale)(null)) , integer0);
        dateTimeParserBucket0.setOffset(integer0);
        long long0 = dateTimeParserBucket0.computeMillis(false, "mxcw80T&d.<x");
        org.junit.Assert.assertEquals((-292L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(2319L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0);
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals((-16187903997681L), long0);
        long long1 = dateTimeParserBucket0.computeMillis(true, "\":| ");
        org.junit.Assert.assertEquals((-16187904000000L), long1);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(2319L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0);
        long long0 = dateTimeParserBucket0.computeMillis(true, "\":| ");
        org.junit.Assert.assertEquals(2319L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-1));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , ((java.util.Locale)(null)) , integer0 , 8);
        org.junit.Assert.assertEquals(0, dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.joda.time.MockZone mockZone0 = new org.joda.time.MockZone(0L , (-1394) , (-1394));
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance(((org.joda.time.DateTimeZone)(mockZone0)));
        org.joda.time.DurationField durationField0 = buddhistChronology0.minutes();
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.years();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField0 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(durationField0, unsupportedDurationField0);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        boolean boolean0 = dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-131L) , ((org.joda.time.Chronology)(null)) , locale0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        dateTimeParserBucket0.saveField(dateTimeFieldType0, "J.%M}w?", locale0);
        boolean boolean0 = dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
        org.junit.Assert.assertTrue(boolean0);
        long long0 = dateTimeParserBucket0.computeMillis(false, "+01:00");
        org.junit.Assert.assertEquals((-3600131L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.LenientChronology lenientChronology0 = org.joda.time.chrono.LenientChronology.getInstance(julianChronology0);
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(lenientChronology0)) , locale0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket1 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(lenientChronology0)) , locale0 , ((java.lang.Integer)(null)));
        boolean boolean0 = dateTimeParserBucket1.restoreState(dateTimeParserBucket_SavedState0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_16_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance(((org.joda.time.DateTimeZone)(null)), islamicChronology_LeapYearPatternType0);
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(2410L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        java.lang.Object object0 = new java.lang.Object();
        boolean boolean0 = dateTimeParserBucket0.restoreState(object0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        java.util.Locale locale0 = new java.util.Locale("U{2@7)k-!hU" , "U{2@7)k-!hU" , "U{2@7)k-!hU");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1887L , ((org.joda.time.Chronology)(null)) , locale0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState1 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.junit.Assert.assertSame(dateTimeParserBucket_SavedState1, dateTimeParserBucket_SavedState0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_16_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance(((org.joda.time.DateTimeZone)(null)), islamicChronology_LeapYearPatternType0);
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(2410L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0);
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        dateTimeParserBucket0.saveField(dateTimeFieldType0, (-85));
        dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
        dateTimeParserBucket0.saveField(dateTimeFieldType0, "Mitteleurop\u00e4ische Zeit", locale0);
        org.junit.Assert.assertEquals("zho", locale0.getISO3Language());
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.Integer integer0 = new java.lang.Integer(778);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-2381L) , ((org.joda.time.Chronology)(null)) , locale0 , integer0 , (-5059));
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1524L) , ((org.joda.time.Chronology)(gregorianChronology0)) , locale0 , ((java.lang.Integer)(null)) , (-1991));
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        dateTimeParserBucket0.setOffset(((java.lang.Integer)(buddhistChronology0.BE)));
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.forLanguageTag("org.joda.time.MockNullZoneChronology");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(950L , ((org.joda.time.Chronology)(copticChronology0)) , locale0 , ((java.lang.Integer)(null)));
        dateTimeParserBucket0.setZone(((org.joda.time.DateTimeZone)(null)));
        org.joda.time.DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
        org.junit.Assert.assertNull(dateTimeZone0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1524L) , ((org.joda.time.Chronology)(gregorianChronology0)) , locale0 , ((java.lang.Integer)(null)) , (-1991));
        java.lang.Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.forLanguageTag("org.joda.time.MockNullZoneChronology");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(950L , ((org.joda.time.Chronology)(copticChronology0)) , locale0 , ((java.lang.Integer)(null)));
        java.util.Locale locale1 = dateTimeParserBucket0.getLocale();
        org.junit.Assert.assertEquals("", locale1.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(null)));
        dateTimeParserBucket0.setOffset(0);
        java.lang.Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(null)));
        java.lang.Integer integer0 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0);
        long long0 = dateTimeParserBucket0.computeMillis(true);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.forLanguageTag("org.joda.time.MockNullZoneChronology");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(950L , ((org.joda.time.Chronology)(copticChronology0)) , locale0 , ((java.lang.Integer)(null)));
        org.joda.time.chrono.CopticChronology copticChronology1 = ((org.joda.time.chrono.CopticChronology)(dateTimeParserBucket0.getChronology()));
        org.junit.Assert.assertSame(copticChronology1, copticChronology0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.forLanguageTag("org.joda.time.MockNullZoneChronology");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(950L , ((org.joda.time.Chronology)(copticChronology0)) , locale0 , ((java.lang.Integer)(null)));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeParserBucket0.getZone()));
        org.junit.Assert.assertTrue(fixedDateTimeZone0.isFixed());
    }
}

