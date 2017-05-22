package org.joda.time.chrono;


public class BasicMonthOfYearDateTimeField_ESTest extends org.joda.time.chrono.BasicMonthOfYearDateTimeField_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(islamicChronology0 , 0);
        try {
            basicMonthOfYearDateTimeField0.getDifferenceAsLong(1, 0);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(julianChronology0 , 1);
        try {
            basicMonthOfYearDateTimeField0.add(((long)(1)), 1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(copticChronology0 , 1);
        try {
            basicMonthOfYearDateTimeField0.set(((long)(1)), 1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(julianChronology0);
        try {
            gJMonthOfYearDateTimeField0.isLeap(12);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(ethiopicChronology0 , 1);
        try {
            basicMonthOfYearDateTimeField0.getLeapAmount(1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(ethiopicChronology0 , 1);
        try {
            basicMonthOfYearDateTimeField0.add(((long)(1)), ((long)(1)));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.UTC));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)(fixedDateTimeZone0)));
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(ethiopicChronology0 , 1);
        int int0 = basicMonthOfYearDateTimeField0.getMinimumValue();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(julianChronology0);
        int int0 = gJMonthOfYearDateTimeField0.getMaximumValue();
        org.junit.Assert.assertEquals(12, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(islamicChronology0 , (-551));
        try {
            basicMonthOfYearDateTimeField0.get(1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime(((long)(157)) , ((org.joda.time.Chronology)(ethiopicChronology0)));
        int[] intArray0 = new int[6];
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(ethiopicChronology0);
        int[] intArray1 = gJMonthOfYearDateTimeField0.add(((org.joda.time.ReadablePartial)(localTime0)), (-2283), intArray0, 0);
        org.junit.Assert.assertSame(intArray1, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(julianChronology0 , 0);
        try {
            basicMonthOfYearDateTimeField0.add(((long)(0)), 0);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(julianChronology0 , 0);
        try {
            basicMonthOfYearDateTimeField0.add(16123L, (-1));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(islamicChronology0);
        org.joda.time.chrono.ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = ((org.joda.time.chrono.ZonedChronology.ZonedDurationField)(gJMonthOfYearDateTimeField0.getRangeDurationField()));
        org.junit.Assert.assertTrue(zonedChronology_ZonedDurationField0.isSupported());
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.joda.time.MockZone mockZone0 = new org.joda.time.MockZone(6L , 39 , 39);
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)(mockZone0)));
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(copticChronology0);
        try {
            gJMonthOfYearDateTimeField0.addWrapField(6L, 39);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(copticChronology0 , 1);
        boolean boolean0 = basicMonthOfYearDateTimeField0.isLenient();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay(1 , 1);
        try {
            monthDay0.minusDays(1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(gregorianChronology0);
        org.joda.time.chrono.ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = ((org.joda.time.chrono.ZonedChronology.ZonedDurationField)(gJMonthOfYearDateTimeField0.getLeapDurationField()));
        org.junit.Assert.assertEquals("days", zonedChronology_ZonedDurationField0.getName());
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.DateTimeZone.forOffsetMillis(1)));
        org.joda.time.chrono.ZonedChronology zonedChronology0 = org.joda.time.chrono.ZonedChronology.getInstance(ethiopicChronology0, fixedDateTimeZone0);
        org.joda.time.chrono.JulianChronology julianChronology0 = new org.joda.time.chrono.JulianChronology(zonedChronology0 , ethiopicChronology0 , 1);
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(julianChronology0 , 1);
        try {
            basicMonthOfYearDateTimeField0.remainder(0L);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(ethiopicChronology0);
        try {
            gJMonthOfYearDateTimeField0.roundFloor(157);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }
}

