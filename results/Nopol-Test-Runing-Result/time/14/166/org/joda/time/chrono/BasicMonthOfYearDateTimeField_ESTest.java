package org.joda.time.chrono;


public class BasicMonthOfYearDateTimeField_ESTest extends org.joda.time.chrono.BasicMonthOfYearDateTimeField_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(islamicChronology0 , 1);
        try {
            basicMonthOfYearDateTimeField0.add(((long)(1)), 1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(copticChronology0 , 1);
        try {
            basicMonthOfYearDateTimeField0.set(((long)(1)), 1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(gregorianChronology0 , 290);
        try {
            basicMonthOfYearDateTimeField0.isLeap(290);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 0)));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(ethiopicChronology0 , 1);
        try {
            basicMonthOfYearDateTimeField0.getLeapAmount(1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(gregorianChronology0);
        try {
            gJMonthOfYearDateTimeField0.getDifferenceAsLong((-1983L), 0L);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(julianChronology0);
        try {
            gJMonthOfYearDateTimeField0.add(((long)(1)), ((long)(1)));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(julianChronology0 , (-14));
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime(((long)(-14)) , ((org.joda.time.Chronology)(julianChronology0)));
        int[] intArray0 = new int[5];
        try {
            basicMonthOfYearDateTimeField0.add(((org.joda.time.ReadablePartial)(localTime0)), (-14), intArray0, (-14));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(copticChronology0);
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int[] intArray0 = new int[2];
        try {
            gJMonthOfYearDateTimeField0.add(((org.joda.time.ReadablePartial)(partial0)), 1, intArray0, 1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(islamicChronology0 , 1);
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int[] intArray0 = new int[1];
        int[] intArray1 = basicMonthOfYearDateTimeField0.add(((org.joda.time.ReadablePartial)(partial0)), 1, intArray0, 0);
        org.junit.Assert.assertSame(intArray1, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(julianChronology0 , 0);
        try {
            basicMonthOfYearDateTimeField0.add((-62167651200000L), 0);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(julianChronology0);
        try {
            gJMonthOfYearDateTimeField0.add(1901L, (-2704));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(julianChronology0 , (-14));
        org.joda.time.DurationField durationField0 = basicMonthOfYearDateTimeField0.getRangeDurationField();
        org.junit.Assert.assertNotNull(durationField0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(gregorianChronology0);
        try {
            gJMonthOfYearDateTimeField0.addWrapField(((long)(0)), 216);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(islamicChronology0 , 1);
        int int0 = basicMonthOfYearDateTimeField0.getMaximumValue();
        org.junit.Assert.assertEquals(12, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 0)));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(ethiopicChronology0 , 1);
        boolean boolean0 = basicMonthOfYearDateTimeField0.isLenient();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(gregorianChronology0);
        int int0 = gJMonthOfYearDateTimeField0.getMinimumValue();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(copticChronology0);
        try {
            gJMonthOfYearDateTimeField0.get(1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(gregorianChronology0);
        org.joda.time.field.PreciseDurationField preciseDurationField0 = ((org.joda.time.field.PreciseDurationField)(gJMonthOfYearDateTimeField0.getLeapDurationField()));
        org.junit.Assert.assertTrue(preciseDurationField0.isPrecise());
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(gregorianChronology0);
        try {
            gJMonthOfYearDateTimeField0.remainder(2071);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(islamicChronology0 , 1);
        try {
            basicMonthOfYearDateTimeField0.roundFloor(1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }
}

