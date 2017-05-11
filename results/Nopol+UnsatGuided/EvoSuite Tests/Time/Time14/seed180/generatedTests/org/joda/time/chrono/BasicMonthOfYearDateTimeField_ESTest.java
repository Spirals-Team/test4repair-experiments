/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 25 02:23:22 GMT 2017
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BasicChronology;
import org.joda.time.chrono.BasicMonthOfYearDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.tz.CachedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicMonthOfYearDateTimeField_ESTest extends BasicMonthOfYearDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(ethiopicChronology0, 1);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.getDifference(1, 2297L);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.add((long) 1, 1);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, 1);
      MonthDay monthDay0 = new MonthDay(1, 1);
      int[] intArray0 = new int[9];
      basicMonthOfYearDateTimeField0.add((ReadablePartial) monthDay0, 1, intArray0, 0);
      assertEquals(1, basicMonthOfYearDateTimeField0.getMinimumValue());
      assertEquals(12, basicMonthOfYearDateTimeField0.getMaximumValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.set((-2455L), (-146));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -146 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(ethiopicChronology0, 1);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.set((long) 1, 1);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(ethiopicChronology0, 1);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.isLeap(1);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.getLeapAmount(31557600000L);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.getDifferenceAsLong((-705), (-705));
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(ethiopicChronology0, 1);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.add((ReadablePartial) null, 1, (int[]) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Partial must not be null
         //
         verifyException("org.joda.time.DateTimeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add((long) 12, (long) 12);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = null;
      try {
        basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField((BasicChronology) null, 1288);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
      int int0 = basicMonthOfYearDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      int int0 = gJMonthOfYearDateTimeField0.getMaximumValue();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 123, (-657), 0, (-657), 0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      int[] intArray0 = new int[0];
      int[] intArray1 = gJMonthOfYearDateTimeField0.add((ReadablePartial) localDateTime0, 1, intArray0, 0);
      assertArrayEquals(new int[] {}, intArray1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add((long) 1, 0);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, (-3085));
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.add((long) (-3085), (-3085));
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = (ZonedChronology.ZonedDurationField)gJMonthOfYearDateTimeField0.getRangeDurationField();
      assertTrue(zonedChronology_ZonedDurationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.addWrapField((long) 1, 1);
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      boolean boolean0 = gJMonthOfYearDateTimeField0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, (-1));
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.get((-1));
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      PreciseDurationField preciseDurationField0 = (PreciseDurationField)gJMonthOfYearDateTimeField0.getLeapDurationField();
      assertTrue(preciseDurationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.remainder((-565L));
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, 1);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.roundFloor((-3244));
       //  fail("Expecting exception: IllegalAccessError");
       // Unstable assertion
      } catch(IllegalAccessError e) {
         //
         // tried to access field org.joda.time.field.ImpreciseDateTimeField.iUnitMillis from class org.joda.time.chrono.BasicMonthOfYearDateTimeField
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }
}
