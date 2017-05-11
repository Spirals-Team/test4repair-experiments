/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 17:36:42 GMT 2017
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDateTime;
import org.joda.time.MockZone;
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
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicMonthOfYearDateTimeField_ESTest extends BasicMonthOfYearDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, 668);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.add((long) 668, 668);
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
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(0);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.set((long) 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.set((long) 1, 1);
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
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
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
  public void test04()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forID((String) null);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) cachedDateTimeZone0, 1);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(ethiopicChronology0, 123);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.getLeapAmount(0L);
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
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, 860);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.getDifferenceAsLong((-917L), 860);
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
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
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
  public void test07()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add((long) 2415, (long) 2415);
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
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = null;
      try {
        basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField((BasicChronology) null, (-1610));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      int int0 = gJMonthOfYearDateTimeField0.getMaximumValue();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, (-1));
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-1), (-1), (-1), (-1), (-1));
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(mockGregorianCalendar0);
      int[] intArray0 = new int[5];
      int[] intArray1 = basicMonthOfYearDateTimeField0.add((ReadablePartial) localDateTime0, (-1), intArray0, 0);
      assertSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      Partial partial0 = new Partial();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add((ReadablePartial) partial0, (-52), intArray0, (-3977));
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
  public void test12()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add((long) (byte)18, (int) (byte)0);
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
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add((long) 1, (-3343));
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
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      DurationField durationField0 = gJMonthOfYearDateTimeField0.getRangeDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockZone mockZone0 = new MockZone(100000000000L, 116, 116);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) mockZone0);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 116);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.addWrapField(100000000000000L, 1);
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
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
      boolean boolean0 = basicMonthOfYearDateTimeField0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      int int0 = gJMonthOfYearDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = (ZonedChronology.ZonedDurationField)gJMonthOfYearDateTimeField0.getLeapDurationField();
      assertEquals("days", zonedChronology_ZonedDurationField0.getName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.remainder(1);
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
  public void test21()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, (-4015));
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.roundFloor((-4015));
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