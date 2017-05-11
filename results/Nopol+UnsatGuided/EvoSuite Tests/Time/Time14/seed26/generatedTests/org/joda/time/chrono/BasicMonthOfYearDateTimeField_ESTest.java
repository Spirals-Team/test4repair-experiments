/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 13:00:29 GMT 2017
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BasicChronology;
import org.joda.time.chrono.BasicMonthOfYearDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicMonthOfYearDateTimeField_ESTest extends BasicMonthOfYearDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.getDifferenceAsLong(1, 3566L);
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
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(ethiopicChronology0, 1);
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
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, (-688));
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.set((long) (-688), 3216);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 3216 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.isLeap(1);
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
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.getLeapAmount(600000L);
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
        gJMonthOfYearDateTimeField0.add((-2517L), (long) (-10));
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
        basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField((BasicChronology) null, (-318));
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
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forID((String) null);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      JulianChronology julianChronology0 = new JulianChronology(islamicChronology0, mockThaiBuddhistDate0, 1);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      Partial partial0 = new Partial();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add((ReadablePartial) partial0, (-2994), intArray0, 1315);
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
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, 0);
      LocalDate localDate0 = LocalDate.now((Chronology) islamicChronology0);
      int[] intArray0 = new int[1];
      int[] intArray1 = basicMonthOfYearDateTimeField0.add((ReadablePartial) localDate0, 1, intArray0, 0);
      assertSame(intArray0, intArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, 0);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.add((ReadablePartial) null, 1, intArray0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Partial must not be null
         //
         verifyException("org.joda.time.DateTimeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
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
  public void test12()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, 0);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.add((long) 0, (-3171));
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
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
      DurationField durationField0 = basicMonthOfYearDateTimeField0.getRangeDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, 1);
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
  public void test15()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      int int0 = gJMonthOfYearDateTimeField0.getMaximumValue();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      boolean boolean0 = gJMonthOfYearDateTimeField0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      int int0 = gJMonthOfYearDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 31);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.get(31);
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
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.remainder(1);
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
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.roundFloor(1);
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
