/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 13 21:33:36 GMT 2017
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.TestBaseDateTimeField;
import org.joda.time.field.TestPreciseDateTimeField;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.joda.time.field.ZeroIsMaxDateTimeField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ZeroIsMaxDateTimeField_ESTest extends ZeroIsMaxDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.set((long) 60, 60);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfFloor(1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfFloor(21260793600000L);
      assertEquals(21260793600000L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfEven((-1L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfEven(974L);
      assertEquals(960L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfCeiling(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfCeiling((-2121L));
      assertEquals((-2100L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundFloor(86400);
      assertEquals(86400L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundFloor((-380L));
      assertEquals((-43200000L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundCeiling((-2872L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundCeiling(1L);
      assertEquals(60000L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) delegatedDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.remainder(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.remainder((-4577L));
      assertEquals((-17L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(2001);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.getDifferenceAsLong(0L, 1525L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.getDifferenceAsLong(0, 1);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) delegatedDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getDifference(0L, 0L);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getDifference((-323L), 3600001L);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.get((-641L));
      assertEquals((-10), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      LocalDate localDate0 = new LocalDate((DateTimeZone) null);
      int[] intArray0 = new int[5];
      intArray0[1] = 1;
      int[] intArray1 = zeroIsMaxDateTimeField0.addWrapField((ReadablePartial) localDate0, 1, intArray0, 0);
      assertArrayEquals(new int[] {0, 1, 1, 0, 0}, intArray1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.addWrapField((long) 1, 1);
      assertEquals(3600001L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.addWrapField((-1L), 1);
      assertEquals((-43200001L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.years();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, durationField0, dateTimeFieldType0, 1440);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) remainderDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add(1234L, (-1629L));
      assertEquals((-395L), long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField((Chronology) gregorianChronology0, (DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) skipUndoDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add((long) 0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add((-3939L), 0);
      assertEquals((-3939L), long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.set(0L, (-2586));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2586 for secondOfDay must be in the range [1,60]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.getDifference(0L, (-12219292800000L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 12219292800000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      MonthDay monthDay0 = new MonthDay((Chronology) buddhistChronology0);
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.addWrapField((ReadablePartial) monthDay0, 3, (int[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) delegatedDateTimeField0, dateTimeFieldType0);
      int[] intArray0 = new int[4];
      YearMonth yearMonth0 = YearMonth.now();
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.addWrapField((ReadablePartial) yearMonth0, 60, intArray0, 60);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 60
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.get(1);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) delegatedDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.set((-2820L), 60);
      assertEquals(1000L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.set((-1904L), 1);
      assertEquals((-86281904L), long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.get(3600001L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfYear();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = null;
      try {
        zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrapped field's minumum value must be zero
         //
         verifyException("org.joda.time.field.ZeroIsMaxDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundFloor(1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getDifference(1886L, 2);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue((ReadablePartial) localDateTime0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) iSOChronology0);
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue((ReadablePartial) localTime0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      boolean boolean0 = zeroIsMaxDateTimeField0.isLeap(3245L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.remainder(1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) iSOChronology0);
      int[] intArray0 = new int[7];
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue((ReadablePartial) localTime0, intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue((long) 1);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 2227);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) dividedDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue((long) 2227);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.addWrapField(0L, 86400);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfEven((-527L));
      assertEquals((-540L), long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getLeapAmount(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) delegatedDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfFloor((-799L));
      assertEquals((-780L), long0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 2227);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) dividedDateTimeField0, dateTimeFieldType0);
      DurationField durationField0 = zeroIsMaxDateTimeField0.getLeapDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 2227);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) dividedDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfCeiling(918518400000L);
      assertEquals(918518400000L, long0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 2227);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) dividedDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) delegatedDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.getDifferenceAsLong(1000L, 2719L);
      assertEquals(30L, long0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) delegatedDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundCeiling((-2916L));
      assertEquals((-2820L), long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add(1029L, 5);
      assertEquals(301029L, long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add(0L, (long) 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, dateTimeFieldType0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis((-2737));
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      int[] intArray0 = new int[2];
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue((ReadablePartial) localDate0, intArray0);
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 2227);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) dividedDateTimeField0, dateTimeFieldType0);
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.addWrapField((ReadablePartial) null, 1, intArray0, 576);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MIN > MAX
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
