/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 16 01:18:37 GMT 2017
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.MockNullZoneChronology;
import org.joda.time.TestDateTime_Basics;
import org.joda.time.TestInterval_Constructors;
import org.joda.time.TestLocalTime_Basics;
import org.joda.time.TestMonthDay_Basics;
import org.joda.time.TestMutableDateTime_Basics;
import org.joda.time.TestMutableInterval_Basics;
import org.joda.time.TestYearMonth_Basics;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeFieldType_ESTest extends DateTimeFieldType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.era();
      // Undeclared exception!
      try { 
        TestCase.assertEquals("clockhourOfHalfday", (Object) dateTimeFieldType1, (Object) dateTimeFieldType0);
        fail("Expecting exception: AssertionFailedError");
      
      } catch(AssertionFailedError e) {
         //
         // clockhourOfHalfday expected:<era> but was:<clockhourOfHalfday>
         //
         verifyException("junit.framework.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      assertNull(durationFieldType0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TestMonthDay_Basics testMonthDay_Basics0 = new TestMonthDay_Basics("");
      testMonthDay_Basics0.testToDateTime_RI();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      boolean boolean0 = dateTimeFieldType0.isSupported((Chronology) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("");
      TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(testDateTime_Basics_MockEqualsChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      TestYearMonth_Basics testYearMonth_Basics0 = new TestYearMonth_Basics("f!wz3s#m+v1rT");
      TestYearMonth_Basics.MockYM testYearMonth_Basics_MockYM0 = testYearMonth_Basics0.new MockYM();
      CopticChronology copticChronology0 = (CopticChronology)testYearMonth_Basics_MockYM0.getChronology();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(copticChronology0);
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField((Chronology) null);
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      String string0 = dateTimeFieldType0.toString();
      assertEquals("clockhourOfHalfday", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      boolean boolean0 = dateTimeFieldType0.isSupported((Chronology) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      assertEquals("monthOfYear", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("");
      TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(testDateTime_Basics_MockEqualsChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      TestMutableDateTime_Basics testMutableDateTime_Basics0 = new TestMutableDateTime_Basics("weekyear");
      TestMutableDateTime_Basics.MockEqualsChronology testMutableDateTime_Basics_MockEqualsChronology0 = testMutableDateTime_Basics0.new MockEqualsChronology();
      UnsupportedDateTimeField unsupportedDateTimeField0 = (UnsupportedDateTimeField)dateTimeFieldType0.getField(testMutableDateTime_Basics_MockEqualsChronology0);
      assertEquals("minuteOfHour", unsupportedDateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("");
      TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
      UnsupportedDateTimeField unsupportedDateTimeField0 = (UnsupportedDateTimeField)dateTimeFieldType0.getField(testDateTime_Basics_MockEqualsChronology0);
      assertEquals("era", unsupportedDateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("");
      TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(testDateTime_Basics_MockEqualsChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      boolean boolean0 = dateTimeFieldType0.isSupported((Chronology) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      TestMutableInterval_Basics testMutableInterval_Basics0 = new TestMutableInterval_Basics("Ryo3");
      TestMutableInterval_Basics.MockInterval testMutableInterval_Basics_MockInterval0 = testMutableInterval_Basics0.new MockInterval();
      ISOChronology iSOChronology0 = (ISOChronology)testMutableInterval_Basics_MockInterval0.getChronology();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      assertEquals("secondOfDay", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      boolean boolean0 = dateTimeFieldType0.isSupported((Chronology) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      TestInterval_Constructors testInterval_Constructors0 = new TestInterval_Constructors("centuryOfEra");
      TestInterval_Constructors.MockInterval testInterval_Constructors_MockInterval0 = testInterval_Constructors0.new MockInterval();
      ISOChronology iSOChronology0 = (ISOChronology)testInterval_Constructors_MockInterval0.getChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(iSOChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      String string0 = dateTimeFieldType0.getName();
      assertEquals("clockhourOfHalfday", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      assertEquals("dayOfMonth", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      UnsupportedDateTimeField unsupportedDateTimeField0 = (UnsupportedDateTimeField)dateTimeFieldType0.getField(mockNullZoneChronology0);
      assertEquals("centuryOfEra", unsupportedDateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(mockNullZoneChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      TestLocalTime_Basics testLocalTime_Basics0 = new TestLocalTime_Basics("hourOfDay");
      TestLocalTime_Basics.MockInstant testLocalTime_Basics_MockInstant0 = testLocalTime_Basics0.new MockInstant();
      CopticChronology copticChronology0 = (CopticChronology)testLocalTime_Basics_MockInstant0.getChronology();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(copticChronology0);
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField((Chronology) null);
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.dayOfWeek();
      // Undeclared exception!
      try { 
        TestCase.assertEquals("clockhourOfHalfday", (Object) dateTimeFieldType0, (Object) dateTimeFieldType1);
        fail("Expecting exception: AssertionFailedError");
      
      } catch(AssertionFailedError e) {
         //
         // clockhourOfHalfday expected:<clockhourOfHalfday> but was:<dayOfWeek>
         //
         verifyException("junit.framework.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(mockNullZoneChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      assertEquals("halfdays", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      assertEquals("hours", durationFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(mockNullZoneChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[0];
      TestMutableDateTime_Basics.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        TestCase.assertEquals((Object) dateTimeFieldType0, object0);
        fail("Expecting exception: AssertionFailedError");
      
      } catch(AssertionFailedError e) {
         //
         // expected:<dayOfWeek> but was:<java.lang.Object@e9073e1>
         //
         verifyException("junit.framework.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      boolean boolean0 = dateTimeFieldType0.isSupported((Chronology) null);
      assertTrue(boolean0);
  }
}
