package org.joda.time.chrono;


public class BasicMonthOfYearDateTimeField_ESTest extends org.joda.time.chrono.BasicMonthOfYearDateTimeField_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.MockZone mockZone0 = new org.joda.time.MockZone(0L , (-31) , (-31));
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)(mockZone0)));
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(gregorianChronology0 , (-31));
        try {
            basicMonthOfYearDateTimeField0.add(((long)(-31)), 12);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.forOffsetMillis(4333)));
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(gregorianChronology0);
        try {
            gJMonthOfYearDateTimeField0.set(((long)(12)), 12);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(copticChronology0);
        try {
            gJMonthOfYearDateTimeField0.isLeap(1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(julianChronology0);
        try {
            gJMonthOfYearDateTimeField0.getLeapAmount((-1L));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(islamicChronology0 , 0);
        try {
            basicMonthOfYearDateTimeField0.getDifferenceAsLong(0, (-2665L));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(gregorianChronology0 , 1803);
        try {
            basicMonthOfYearDateTimeField0.add(((long)(1803)), ((long)(1803)));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(copticChronology0);
        int int0 = gJMonthOfYearDateTimeField0.getMinimumValue();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.forOffsetMillis(4333)));
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(gregorianChronology0);
        int int0 = gJMonthOfYearDateTimeField0.getMaximumValue();
        org.junit.Assert.assertEquals(12, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(copticChronology0);
        org.joda.time.DurationField durationField0 = gJMonthOfYearDateTimeField0.getLeapDurationField();
        org.junit.Assert.assertNotNull(durationField0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(islamicChronology0);
        org.joda.time.chrono.ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = ((org.joda.time.chrono.ZonedChronology.ZonedDurationField)(gJMonthOfYearDateTimeField0.getRangeDurationField()));
        org.junit.Assert.assertTrue(zonedChronology_ZonedDurationField0.isSupported());
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(gregorianChronology0 , (-2036));
        org.joda.time.MockZone mockZone0 = new org.joda.time.MockZone((-8155L) , (-2036) , (-2483));
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime(((org.joda.time.DateTimeZone)(mockZone0)));
        int[] intArray0 = new int[0];
        int[] intArray1 = basicMonthOfYearDateTimeField0.add(((org.joda.time.ReadablePartial)(localTime0)), (-1797), intArray0, 0);
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(copticChronology0);
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int[] intArray0 = new int[9];
        try {
            gJMonthOfYearDateTimeField0.add(((org.joda.time.ReadablePartial)(partial0)), (-838), intArray0, 1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(islamicChronology0);
        try {
            gJMonthOfYearDateTimeField0.add(((long)(1)), 0);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)(null)));
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(gregorianChronology0);
        try {
            gJMonthOfYearDateTimeField0.add(388L, (-3151));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(gregorianChronology0 , 1);
        try {
            basicMonthOfYearDateTimeField0.addWrapField(((long)(1)), 1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(julianChronology0);
        boolean boolean0 = gJMonthOfYearDateTimeField0.isLenient();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(copticChronology0 , 1);
        try {
            basicMonthOfYearDateTimeField0.get((-1050));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(gregorianChronology0);
        try {
            gJMonthOfYearDateTimeField0.remainder((-1548L));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(gregorianChronology0 , (-2036));
        try {
            basicMonthOfYearDateTimeField0.roundFloor((-2036));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }
}

