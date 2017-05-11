/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 25 01:10:14 GMT 2017
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalTime;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BasicChronology;
import org.joda.time.chrono.BasicMonthOfYearDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicMonthOfYearDateTimeField_ESTest extends BasicMonthOfYearDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, 1);
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
  public void test01()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, (-4));
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.set((-1L), 3729);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 3729 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
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
  public void test03()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, 290);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.isLeap(290);
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
  public void test04()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetHoursMinutes(0, 0);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(ethiopicChronology0, 1);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.getLeapAmount(1);
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
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.getDifferenceAsLong((-1983L), 0L);
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
        gJMonthOfYearDateTimeField0.add((long) 1, (long) 1);
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
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = null;
      try {
        basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField((BasicChronology) null, 556);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, (-14));
      LocalTime localTime0 = new LocalTime((long) (-14), (Chronology) julianChronology0);
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.add((ReadablePartial) localTime0, (-14), intArray0, (-14));
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
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      Partial partial0 = new Partial();
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add((ReadablePartial) partial0, 1, intArray0, 1);
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
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, 1);
      Partial partial0 = new Partial();
      int[] intArray0 = new int[1];
      int[] intArray1 = basicMonthOfYearDateTimeField0.add((ReadablePartial) partial0, 1, intArray0, 0);
      assertSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add((ReadablePartial) null, 1, intArray0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Partial must not be null
         //
         verifyException("org.joda.time.DateTimeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, 0);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.add((-62167651200000L), 0);
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
  public void test13()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add(1901L, (-2704));
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
  public void test14()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, (-14));
      DurationField durationField0 = basicMonthOfYearDateTimeField0.getRangeDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.addWrapField((long) 0, 216);
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
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, 1);
      int int0 = basicMonthOfYearDateTimeField0.getMaximumValue();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetHoursMinutes(0, 0);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(ethiopicChronology0, 1);
      boolean boolean0 = basicMonthOfYearDateTimeField0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      int int0 = gJMonthOfYearDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.get(1);
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
      assertTrue(preciseDurationField0.isPrecise());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.remainder(2071);
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
        basicMonthOfYearDateTimeField0.roundFloor(1);
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
