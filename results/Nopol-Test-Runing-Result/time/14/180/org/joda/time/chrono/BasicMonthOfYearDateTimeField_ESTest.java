package org.joda.time.chrono;


public class BasicMonthOfYearDateTimeField_ESTest extends org.joda.time.chrono.BasicMonthOfYearDateTimeField_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(ethiopicChronology0 , 1);
        try {
            basicMonthOfYearDateTimeField0.getDifference(1, 2297L);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(copticChronology0 , 1);
        try {
            basicMonthOfYearDateTimeField0.add(((long)(1)), 1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(julianChronology0 , 1);
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay(1 , 1);
        int[] intArray0 = new int[9];
        basicMonthOfYearDateTimeField0.add(((org.joda.time.ReadablePartial)(monthDay0)), 1, intArray0, 0);
        org.junit.Assert.assertEquals(1, basicMonthOfYearDateTimeField0.getMinimumValue());
        org.junit.Assert.assertEquals(12, basicMonthOfYearDateTimeField0.getMaximumValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(ethiopicChronology0 , 1);
        try {
            basicMonthOfYearDateTimeField0.set(((long)(1)), 1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(ethiopicChronology0 , 1);
        try {
            basicMonthOfYearDateTimeField0.isLeap(1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(julianChronology0);
        try {
            gJMonthOfYearDateTimeField0.getLeapAmount(31557600000L);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(gregorianChronology0);
        try {
            gJMonthOfYearDateTimeField0.getDifferenceAsLong((-705), (-705));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(gregorianChronology0);
        try {
            gJMonthOfYearDateTimeField0.add(((long)(12)), ((long)(12)));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(copticChronology0 , 1);
        int int0 = basicMonthOfYearDateTimeField0.getMinimumValue();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(gregorianChronology0);
        int int0 = gJMonthOfYearDateTimeField0.getMaximumValue();
        org.junit.Assert.assertEquals(12, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(julianChronology0);
        try {
            gJMonthOfYearDateTimeField0.add(((long)(1)), 0);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance(((org.joda.time.DateTimeZone)(null)));
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(julianChronology0 , (-3085));
        try {
            basicMonthOfYearDateTimeField0.add(((long)(-3085)), (-3085));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(copticChronology0);
        org.joda.time.chrono.ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = ((org.joda.time.chrono.ZonedChronology.ZonedDurationField)(gJMonthOfYearDateTimeField0.getRangeDurationField()));
        org.junit.Assert.assertTrue(zonedChronology_ZonedDurationField0.isSupported());
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(copticChronology0 , 1);
        try {
            basicMonthOfYearDateTimeField0.addWrapField(((long)(1)), 1);
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(julianChronology0);
        boolean boolean0 = gJMonthOfYearDateTimeField0.isLenient();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(gregorianChronology0 , (-1));
        try {
            basicMonthOfYearDateTimeField0.get((-1));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(gregorianChronology0);
        org.joda.time.field.PreciseDurationField preciseDurationField0 = ((org.joda.time.field.PreciseDurationField)(gJMonthOfYearDateTimeField0.getLeapDurationField()));
        org.junit.Assert.assertTrue(preciseDurationField0.isSupported());
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.chrono.GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new org.joda.time.chrono.GJMonthOfYearDateTimeField(gregorianChronology0);
        try {
            gJMonthOfYearDateTimeField0.remainder((-565L));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(islamicChronology0 , 1);
        try {
            basicMonthOfYearDateTimeField0.roundFloor((-3244));
        } catch (java.lang.IllegalAccessError e) {
            org.evosuite.runtime.EvoAssertions.verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
        }
    }
}

