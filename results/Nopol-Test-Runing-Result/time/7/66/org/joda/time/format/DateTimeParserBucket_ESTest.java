package org.joda.time.format;


public class DateTimeParserBucket_ESTest extends org.joda.time.format.DateTimeParserBucket_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(julianChronology0)) , locale0);
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.minuteOfDay();
        dateTimeParserBucket0.saveField(dateTimeField0, 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        dateTimeParserBucket0.saveField(dateTimeFieldType0, 253);
        long long0 = dateTimeParserBucket0.computeMillis(false, "");
        org.junit.Assert.assertEquals((-71220000L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.year();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , 219);
        long long0 = dateTimeParserBucket_SavedField0.set(1, true);
        org.junit.Assert.assertEquals((-72392054400000L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.US;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(((long)(8)) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(1)) , 24);
        dateTimeParserBucket0.setZone(((org.joda.time.DateTimeZone)(null)));
        org.joda.time.DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
        org.junit.Assert.assertNull(dateTimeZone0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.ITALY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-381L) , ((org.joda.time.Chronology)(ethiopicChronology0)) , locale0);
        java.lang.Integer integer0 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.Integer integer0 = new java.lang.Integer((-990));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1L , ((org.joda.time.Chronology)(copticChronology0)) , locale0 , integer0 , (-990));
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals((-990), ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.Integer integer0 = new java.lang.Integer(0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1707L , ((org.joda.time.Chronology)(null)) , locale0 , integer0 , 0);
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals(0, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.Integer integer0 = java.lang.Integer.getInteger("UgGlxTc|9](=2cgeyH+", 2040);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(845L , ((org.joda.time.Chronology)(gregorianChronology0)) , locale0 , integer0);
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals(2040, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , locale0);
        dateTimeParserBucket0.setOffset(0);
        java.lang.Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)(null)));
        org.joda.time.Interval interval0 = new org.joda.time.Interval((-2543L) , ((long)(3248)) , ((org.joda.time.DateTimeZone)(null)));
        org.joda.time.DateTime dateTime0 = interval0.getEnd();
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.chrono.LimitChronology limitChronology0 = org.joda.time.chrono.LimitChronology.getInstance(gregorianChronology0, dateTime0, mutableDateTime0);
        java.util.Locale locale0 = new java.util.Locale("#d&kO+mM");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-2543L) , ((org.joda.time.Chronology)(limitChronology0)) , locale0);
        dateTimeParserBucket0.setOffset(((java.lang.Integer)(1)));
        java.lang.Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals(1, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.ITALY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-381L) , ((org.joda.time.Chronology)(ethiopicChronology0)) , locale0);
        dateTimeParserBucket0.setOffset((-1));
        dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals((-1), dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-138L) , ((org.joda.time.Chronology)(copticChronology0)) , locale0 , ((java.lang.Integer)(1)) , 0);
        dateTimeParserBucket0.setOffset((-209));
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals((-209), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.chrono.IslamicChronology islamicChronology1 = ((org.joda.time.chrono.IslamicChronology)(islamicChronology0.withUTC()));
        java.util.Locale locale0 = java.util.Locale.KOREA;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(islamicChronology1)) , locale0);
        long long0 = dateTimeParserBucket0.computeMillis(false, "ReadablePartial objects must not have overlapping fields");
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.CANADA;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(gJChronology0)) , locale0);
        long long0 = dateTimeParserBucket0.computeMillis(false);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(buddhistChronology0)) , ((java.util.Locale)(null)) , ((java.lang.Integer)(1)) , 1);
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(null)) , (-2686));
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals((-3600000L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.DurationField durationField0 = buddhistChronology0.weekyears();
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(((org.joda.time.DurationField)(null)), durationField0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField0 = new org.joda.time.field.PreciseDurationField(durationFieldType0 , 1L);
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(preciseDurationField0, ((org.joda.time.DurationField)(null)));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.centuryOfEra();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , 463);
        org.joda.time.DateTimeField dateTimeField1 = buddhistChronology0.dayOfYear();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField1 , (-1847));
        int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.chrono.StrictChronology strictChronology0 = org.joda.time.chrono.StrictChronology.getInstance(buddhistChronology0);
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTimeField dateTimeField0 = dateTimeFieldType0.getField(strictChronology0);
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , "T(kJ$<`fH" , locale0);
        int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.Integer integer0 = new java.lang.Integer((-700));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(null)) , locale0 , integer0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        boolean boolean0 = dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.forOffsetHours(0)));
        org.joda.time.chrono.ZonedChronology zonedChronology0 = org.joda.time.chrono.ZonedChronology.getInstance(iSOChronology0, fixedDateTimeZone0);
        java.util.Locale locale0 = new java.util.Locale("N%7ZbkH|[^" , "");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(zonedChronology0)) , locale0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState1 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.junit.Assert.assertSame(dateTimeParserBucket_SavedState1, dateTimeParserBucket_SavedState0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField0 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)(null)));
        org.joda.time.DurationField durationField0 = buddhistChronology0.seconds();
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(durationField0, unsupportedDurationField0);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField0 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)(null)));
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        java.util.Locale locale0 = new java.util.Locale("{4):{]?AS289MkR>");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1923L , ((org.joda.time.Chronology)(gJChronology0)) , locale0);
        dateTimeParserBucket0.setZone(((org.joda.time.DateTimeZone)(null)));
        long long0 = dateTimeParserBucket0.computeMillis(true, "m%)N47YG:{S{U:,");
        org.junit.Assert.assertEquals(1923L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.chrono.StrictChronology strictChronology0 = org.joda.time.chrono.StrictChronology.getInstance(buddhistChronology0);
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(strictChronology0)) , locale0);
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
        dateTimeParserBucket0.saveField(dateTimeField0, 1);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        long long0 = dateTimeParserBucket0.computeMillis(true);
        org.junit.Assert.assertEquals((-16156887522000L), long0);
        boolean boolean0 = dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
        org.junit.Assert.assertTrue(boolean0);
        long long1 = dateTimeParserBucket0.computeMillis(true, "The end instant must be greater or equal to the start");
        org.junit.Assert.assertEquals((-16187904561000L), long1);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1999L , ((org.joda.time.Chronology)(null)) , locale0);
        java.lang.Integer integer0 = new java.lang.Integer((-861));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket1 = new org.joda.time.format.DateTimeParserBucket(((long)(-433)) , ((org.joda.time.Chronology)(null)) , locale0 , integer0 , 0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket1.new SavedState();
        boolean boolean0 = dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0);
        dateTimeParserBucket0.setOffset(65533);
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals(65533, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(495L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(null)));
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(495L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(null)));
        dateTimeParserBucket0.setOffset(((java.lang.Integer)(1)));
        long long0 = dateTimeParserBucket0.computeMillis(false);
        org.junit.Assert.assertEquals(494L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(495L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(null)));
        dateTimeParserBucket0.setPivotYear(((java.lang.Integer)(1)));
        org.junit.Assert.assertEquals(0, dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.ITALY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-381L) , ((org.joda.time.Chronology)(ethiopicChronology0)) , locale0);
        java.lang.Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(26050L , ((org.joda.time.Chronology)(copticChronology0)) , locale0 , ((java.lang.Integer)(1)));
        java.util.Locale locale1 = dateTimeParserBucket0.getLocale();
        org.junit.Assert.assertEquals("zh_TW", locale1.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1999L , ((org.joda.time.Chronology)(null)) , locale0);
        dateTimeParserBucket0.setOffset((-433));
        long long0 = dateTimeParserBucket0.computeMillis(false, "A\"I:0,WHRD#fk");
        org.junit.Assert.assertEquals((-433), dateTimeParserBucket0.getOffset());
        org.junit.Assert.assertEquals(2432L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(26050L , ((org.joda.time.Chronology)(copticChronology0)) , locale0 , ((java.lang.Integer)(1)));
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals(26050L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(26050L , ((org.joda.time.Chronology)(copticChronology0)) , locale0 , ((java.lang.Integer)(1)));
        org.joda.time.chrono.CopticChronology copticChronology1 = ((org.joda.time.chrono.CopticChronology)(dateTimeParserBucket0.getChronology()));
        org.junit.Assert.assertSame(copticChronology0, copticChronology1);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(dateTimeParserBucket0.getZone()));
        boolean boolean0 = dateTimeParserBucket0.restoreState(cachedDateTimeZone0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(26050L , ((org.joda.time.Chronology)(copticChronology0)) , locale0 , ((java.lang.Integer)(1)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals(9908784026050L, long0);
        long long1 = dateTimeParserBucket0.computeMillis(true, ((java.lang.String)(null)));
        org.junit.Assert.assertEquals(9930556800000L, long1);
    }
}

