package org.joda.time.format;


public class DateTimeParserBucket_ESTest extends org.joda.time.format.DateTimeParserBucket_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance(((org.joda.time.DateTimeZone)(null)));
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.year();
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField0 = new org.joda.time.field.SkipUndoDateTimeField(((org.joda.time.Chronology)(copticChronology0)) , dateTimeField0 , 1);
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(skipUndoDateTimeField0 , (-1162));
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , "zLl;|" , locale0);
        int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , 1);
        long long0 = dateTimeParserBucket_SavedField0.set(1, true);
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-335L) , ((org.joda.time.Chronology)(null)) , locale0 , ((java.lang.Integer)(null)));
        java.lang.Integer integer0 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.Integer integer0 = new java.lang.Integer(0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-3246L) , ((org.joda.time.Chronology)(julianChronology0)) , locale0 , integer0 , 0);
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals(0, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.Integer integer0 = java.lang.Integer.valueOf(2000);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(604800L , ((org.joda.time.Chronology)(null)) , locale0 , integer0);
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals(2000, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1L) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(1)) , 1);
        dateTimeParserBucket0.setOffset(0);
        java.lang.Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1469L , ((org.joda.time.Chronology)(islamicChronology0)) , locale0 , ((java.lang.Integer)(islamicChronology0.AH)) , 4986);
        dateTimeParserBucket0.setOffset((-185));
        dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals((-185), dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.Integer integer0 = java.lang.Integer.valueOf(2000);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(604800L , ((org.joda.time.Chronology)(null)) , locale0 , integer0);
        dateTimeParserBucket0.setOffset(integer0);
        java.lang.Integer integer1 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertEquals(2000, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.MockZone mockZone0 = new org.joda.time.MockZone(30962844000000L , 0 , 0);
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)(mockZone0)), 30585600000L, 6);
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(gJChronology0)) , locale0);
        long long0 = dateTimeParserBucket0.computeMillis(true, "v0$L.er`^MAgZ/ez6");
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.MockZone mockZone0 = new org.joda.time.MockZone(30962844000000L , 0 , 0);
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)(mockZone0)), 30585600000L, 6);
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(gJChronology0)) , locale0);
        long long0 = dateTimeParserBucket0.computeMillis(false);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.chrono.CopticChronology copticChronology1 = ((org.joda.time.chrono.CopticChronology)(copticChronology0.withZone(cachedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.US;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(91L , ((org.joda.time.Chronology)(copticChronology1)) , locale0);
        long long0 = dateTimeParserBucket0.computeMillis(false);
        org.junit.Assert.assertEquals((-3599909L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.Integer integer0 = new java.lang.Integer((-2689));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(gJChronology0)) , locale0 , integer0);
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)(cachedDateTimeZone0)));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = ((org.joda.time.chrono.EthiopicChronology)(ethiopicChronology0.withUTC()));
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(2395L , ((org.joda.time.Chronology)(ethiopicChronology1)) , locale0 , ((java.lang.Integer)(1)));
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals(2395L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.joda.time.MockZone mockZone0 = new org.joda.time.MockZone((-4224L) , 0 , 5733);
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance(((org.joda.time.DateTimeZone)(mockZone0)));
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.weekyear();
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField0 , 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField0 = new org.joda.time.field.RemainderDateTimeField(dateTimeField0 , dateTimeFieldType0 , 5733);
        org.joda.time.format.DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new org.joda.time.format.DateTimeParserBucket.SavedField(remainderDateTimeField0 , 4);
        int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(((long)(1)) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(1)) , 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        dateTimeParserBucket0.saveField(dateTimeField0, 1);
        dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
        dateTimeParserBucket0.computeMillis(true, ((java.lang.String)(null)));
        long long0 = dateTimeParserBucket0.computeMillis(true, "CT,J[l");
        org.junit.Assert.assertEquals((-79239946722000L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField0 = ((org.joda.time.field.UnsupportedDurationField)(buddhistChronology0.eras()));
        org.joda.time.DurationField durationField0 = buddhistChronology0.years();
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(durationField0, unsupportedDurationField0);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.DurationField durationField0 = buddhistChronology0.years();
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(((org.joda.time.DurationField)(null)), durationField0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField0 = ((org.joda.time.field.UnsupportedDurationField)(buddhistChronology0.eras()));
        int int0 = org.joda.time.format.DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(3475L , ((org.joda.time.Chronology)(copticChronology0)) , locale0 , ((java.lang.Integer)(copticChronology0.AM)) , (-2989));
        dateTimeParserBucket0.setZone(((org.joda.time.DateTimeZone)(null)));
        long long0 = dateTimeParserBucket0.computeMillis(false, "zLl;|");
        org.junit.Assert.assertEquals(3475L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.Integer integer0 = java.lang.Integer.valueOf(2000);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(604800L , ((org.joda.time.Chronology)(null)) , locale0 , integer0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        dateTimeParserBucket0.saveField(dateTimeFieldType0, "gknS}^<Hsx", locale0);
        boolean boolean0 = dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
        org.junit.Assert.assertTrue(boolean0);
        long long0 = dateTimeParserBucket0.computeMillis(false, "");
        org.junit.Assert.assertEquals((-2995200L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(gregorianChronology0)) , locale0 , ((java.lang.Integer)(null)));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket1 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(gregorianChronology0)) , locale0 , ((java.lang.Integer)(null)) , 1574);
        boolean boolean0 = dateTimeParserBucket1.restoreState(dateTimeParserBucket_SavedState0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(gregorianChronology0)) , locale0 , ((java.lang.Integer)(null)));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
        boolean boolean0 = dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.Integer integer0 = java.lang.Integer.valueOf(2000);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(604800L , ((org.joda.time.Chronology)(null)) , locale0 , integer0);
        boolean boolean0 = dateTimeParserBucket0.restoreState(integer0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.Integer integer0 = java.lang.Integer.valueOf(2000);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(604800L , ((org.joda.time.Chronology)(null)) , locale0 , integer0);
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState1 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        org.junit.Assert.assertSame(dateTimeParserBucket_SavedState1, dateTimeParserBucket_SavedState0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(2771L , ((org.joda.time.Chronology)(null)) , ((java.util.Locale)(null)));
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = ((org.joda.time.format.DateTimeParserBucket.SavedState)(dateTimeParserBucket0.saveState()));
        dateTimeParserBucket0.saveField(dateTimeFieldType0, 2);
        dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
        dateTimeParserBucket0.saveField(dateTimeField0, 2543);
        org.junit.Assert.assertEquals(0, dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1512L , ((org.joda.time.Chronology)(null)) , locale0 , ((java.lang.Integer)(null)) , 10);
        dateTimeParserBucket0.setOffset(10);
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals(10, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)(cachedDateTimeZone0)));
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(2395L , ((org.joda.time.Chronology)(ethiopicChronology0)) , locale0 , ((java.lang.Integer)(1)));
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.Integer integer0 = new java.lang.Integer((-2541));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(gregorianChronology0)) , locale0 , integer0);
        dateTimeParserBucket0.setOffset(integer0);
        int int0 = dateTimeParserBucket0.getOffset();
        org.junit.Assert.assertEquals((-2541), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(((long)(1)) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0);
        dateTimeParserBucket0.setPivotYear(((java.lang.Integer)(1)));
        org.junit.Assert.assertEquals(0, dateTimeParserBucket0.getOffset());
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(gregorianChronology0)) , locale0 , ((java.lang.Integer)(null)));
        java.lang.Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket((-1L) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(1)) , 1);
        dateTimeParserBucket0.setOffset(1);
        long long0 = dateTimeParserBucket0.computeMillis(false, ((java.lang.String)(null)));
        org.junit.Assert.assertEquals(1, dateTimeParserBucket0.getOffset());
        org.junit.Assert.assertEquals((-2L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(1512L , ((org.joda.time.Chronology)(null)) , locale0 , ((java.lang.Integer)(null)) , 10);
        long long0 = dateTimeParserBucket0.computeMillis();
        org.junit.Assert.assertEquals((-3598488L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        java.lang.Integer integer0 = new java.lang.Integer((-933));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(julianChronology0)) , ((java.util.Locale)(null)) , integer0 , (-933));
        java.lang.Integer integer1 = dateTimeParserBucket0.getPivotYear();
        org.junit.Assert.assertEquals((-933), ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.US;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(91L , ((org.joda.time.Chronology)(copticChronology0)) , locale0);
        long long0 = dateTimeParserBucket0.computeMillis(false);
        org.junit.Assert.assertEquals(91L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        java.util.Locale locale0 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(0L , ((org.joda.time.Chronology)(gregorianChronology0)) , locale0 , ((java.lang.Integer)(null)));
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = ((org.joda.time.chrono.GregorianChronology)(dateTimeParserBucket0.getChronology()));
        org.junit.Assert.assertSame(gregorianChronology0, gregorianChronology1);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = new org.joda.time.format.DateTimeParserBucket(((long)(1)) , ((org.joda.time.Chronology)(buddhistChronology0)) , locale0 , ((java.lang.Integer)(1)) , 1);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(dateTimeParserBucket0.getZone()));
        org.junit.Assert.assertEquals("Europe/Paris", cachedDateTimeZone0.toString());
    }
}

