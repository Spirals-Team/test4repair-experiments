package org.joda.time.chrono;


public class BasicMonthOfYearDateTimeField_ESTest extends org.joda.time.chrono.BasicMonthOfYearDateTimeField_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(ethiopicChronology0);
        try {
            gJMonthOfYearDateTimeField0.getDifferenceAsLong(1, 688L);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.forOffsetMillis((-1))));
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(gregorianChronology0 , 0);
        try {
            basicMonthOfYearDateTimeField0.add(((long)(-1)), (-1));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(ethiopicChronology0 , 0);
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)(ethiopicChronology0)));
        int[] intArray0 = new int[8];
        int[] intArray1 = basicMonthOfYearDateTimeField0.add(((org.joda.time.ReadablePartial)(localDate0)), 1, intArray0, 0);
        org.junit.Assert.assertSame(intArray1, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(gregorianChronology0);
        try {
            gJMonthOfYearDateTimeField0.set(((long)(12)), 12);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(ethiopicChronology0);
        try {
            gJMonthOfYearDateTimeField0.isLeap(1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(islamicChronology0);
        try {
            gJMonthOfYearDateTimeField0.getLeapAmount(1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.forOffsetMillis(17887500)));
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(gregorianChronology0 , 17887500);
        try {
            basicMonthOfYearDateTimeField0.add(1L, ((long)(17887500)));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)(cachedDateTimeZone0)));
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(ethiopicChronology0 , 1);
        org.joda.time.MockPartial mockPartial0 = new org.joda.time.MockPartial();
        int[] intArray0 = new int[9];
        try {
            basicMonthOfYearDateTimeField0.add(((org.joda.time.ReadablePartial)(mockPartial0)), 1, intArray0, 1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(ethiopicChronology0 , 0);
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)(ethiopicChronology0)));
        int[] intArray0 = basicMonthOfYearDateTimeField0.add(((org.joda.time.ReadablePartial)(localDate0)), 1, ((int[])(null)), 0);
        org.junit.Assert.assertNull(intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(ethiopicChronology0 , 0);
        try {
            basicMonthOfYearDateTimeField0.add(((long)(0)), 0);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(ethiopicChronology0);
        try {
            gJMonthOfYearDateTimeField0.add(((long)(1)), 1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(ethiopicChronology0);
        org.joda.time.DurationField durationField0 = gJMonthOfYearDateTimeField0.getRangeDurationField();
        org.junit.Assert.assertNotNull(durationField0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(ethiopicChronology0 , 1);
        try {
            basicMonthOfYearDateTimeField0.addWrapField(((long)(1)), 1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(ethiopicChronology0);
        int int0 = gJMonthOfYearDateTimeField0.getMaximumValue();
        org.junit.Assert.assertEquals(13, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(gregorianChronology0);
        boolean boolean0 = gJMonthOfYearDateTimeField0.isLenient();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 0)));
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(julianChronology0 , 0);
        int int0 = basicMonthOfYearDateTimeField0.getMinimumValue();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(islamicChronology0);
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
        org.junit.Assert.assertEquals("days", preciseDurationField0.getName());
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(ethiopicChronology0);
        try {
            gJMonthOfYearDateTimeField0.remainder(1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(copticChronology0);
        try {
            gJMonthOfYearDateTimeField0.roundFloor(1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }
}

