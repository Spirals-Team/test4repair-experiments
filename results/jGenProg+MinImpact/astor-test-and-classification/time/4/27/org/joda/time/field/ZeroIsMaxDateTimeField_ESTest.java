/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 28 08:25:30 GMT 2017
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.TestBaseDateTimeField;
import org.joda.time.field.TestOffsetDateTimeField;
import org.joda.time.field.TestPreciseDateTimeField;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.joda.time.field.ZeroIsMaxDateTimeField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ZeroIsMaxDateTimeField_ESTest extends ZeroIsMaxDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.get(43200001L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.set((long) 1, 1);
      assertEquals(43200001L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfFloor(1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfFloor((-2066L));
      assertEquals((-2040L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfEven(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfEven(2011L);
      assertEquals(2040L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfCeiling(buddhistChronology0.BE);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, dateTimeFieldType0, 2093);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) remainderDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfCeiling(3000L);
      assertEquals(3000L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundFloor(40L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundFloor(1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField((Chronology) null);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundCeiling(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundCeiling(1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.remainder((-919L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.remainder(2860L);
      assertEquals(40L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.getDifferenceAsLong(0L, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.getDifferenceAsLong(60, (-2242));
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getDifference(1, (-887L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis((-654));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getDifference(1L, 120000L);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetHours((-2));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2), 1, 1, (-2), 1);
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(mockGregorianCalendar0);
      int[] intArray0 = new int[17];
      int[] intArray1 = zeroIsMaxDateTimeField0.addWrapField((ReadablePartial) yearMonth0, 1, intArray0, 629);
      assertSame(intArray0, intArray1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.addWrapField(0L, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.addWrapField(0L, 2943);
      assertEquals(3000L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.addWrapField((-2465L), 47);
      assertEquals((-3245L), long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfHalfday();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add(50400000L, 1209600000L);
      assertEquals(52254720050400000L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add(0L, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfHalfday();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add((long) 1, 1);
      assertEquals(3600001L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.set(987L, 728);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 728 for dayOfYear must be in the range [1,60]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0, 17);
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField((DateTimeField) offsetDateTimeField0, dateTimeFieldType0, 17);
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField((DateTimeField) remainderDateTimeField0, dateTimeFieldType0, 3391);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) dividedDateTimeField0, dateTimeFieldType0);
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.roundHalfEven((-1900L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -17 for minuteOfHour must be in the range [17,76]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis((-654));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      MockDate mockDate0 = new MockDate(1, 5062500, 292278993, 823, 1, (-16));
      LocalDate localDate0 = LocalDate.fromDateFields(mockDate0);
      LocalTime localTime0 = new LocalTime((DateTimeZone) fixedDateTimeZone0);
      LocalDateTime localDateTime0 = localDate0.toLocalDateTime(localTime0);
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.addWrapField((ReadablePartial) localDateTime0, (-1), intArray0, (-28));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField((Chronology) null);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue();
      assertEquals(86400000, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField((Chronology) null);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.set(135L, 86400000);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.set((-448L), 767);
      assertEquals((-86399233L), long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.get((-2520L));
      assertEquals((-42), int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
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
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundFloor((-2548));
      assertEquals((-2520L), long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, dateTimeFieldType0, 2093);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) remainderDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getDifference(2093, (-1L));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue((ReadablePartial) null);
      assertEquals(86400000, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, dateTimeFieldType0);
      LocalTime localTime0 = new LocalTime((-1477L));
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue((ReadablePartial) localTime0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField((Chronology) null);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      boolean boolean0 = zeroIsMaxDateTimeField0.isLeap((-220L));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.remainder((-129L));
      assertEquals((-9L), long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, dateTimeFieldType0);
      LocalTime localTime0 = LocalTime.now();
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue((ReadablePartial) localTime0, (int[]) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfHalfday();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue(0L);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue(0L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, dateTimeFieldType0, 2093);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) remainderDateTimeField0, dateTimeFieldType0);
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.addWrapField(0L, (-1464));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 632 for secondOfMinute must be in the range [3,62]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfEven((-2548));
      assertEquals((-2520L), long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getLeapAmount(1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfHalfday();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfFloor(2147483647L);
      assertEquals(2149200000L, long0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      DurationField durationField0 = zeroIsMaxDateTimeField0.getLeapDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundHalfCeiling((-2659L));
      assertEquals((-2640L), long0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      int int0 = zeroIsMaxDateTimeField0.get(0L);
      assertEquals(86400000, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.getDifferenceAsLong((-2546998L), 0L);
      assertEquals((-2546L), long0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.roundCeiling((-86399233L));
      assertEquals((-86399233L), long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add(1002L, (-2548));
      assertEquals((-2546998L), long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField((Chronology) null);
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      long long0 = zeroIsMaxDateTimeField0.add((-2921L), 0L);
      assertEquals((-2921L), long0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, dateTimeFieldType0);
      int[] intArray0 = new int[1];
      int int0 = zeroIsMaxDateTimeField0.getMaximumValue((ReadablePartial) null, intArray0);
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, dateTimeFieldType0);
      LocalTime localTime0 = LocalTime.now();
      // Undeclared exception!
      try { 
        zeroIsMaxDateTimeField0.addWrapField((ReadablePartial) localTime0, (-1638), (int[]) null, (-1638));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }
}
