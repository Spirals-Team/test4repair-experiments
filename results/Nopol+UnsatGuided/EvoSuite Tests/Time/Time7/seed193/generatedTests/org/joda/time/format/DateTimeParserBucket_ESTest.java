/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 22 08:25:10 GMT 2017
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.Minutes;
import org.joda.time.MockZone;
import org.joda.time.Period;
import org.joda.time.ReadableDateTime;
import org.joda.time.Seconds;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.era();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, dateTimeFieldType0, 1);
      Locale locale0 = Locale.US;
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(offsetDateTimeField0, 60000);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField0, "United States", locale0);
      int int0 = dateTimeParserBucket_SavedField1.compareTo(dateTimeParserBucket_SavedField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.ENGLISH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1877L, (Chronology) ethiopicChronology0, locale0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      dateTimeParserBucket0.saveField(dateTimeField0, (-15015));
      dateTimeParserBucket0.saveField(dateTimeField0, 32);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, "The date must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"The date must not be null\": Value -15015 for halfdayOfDay must be in the range [0,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, 2357);
      long long0 = dateTimeParserBucket_SavedField0.set(4294967295L, false);
      assertEquals((-4918601193705L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = new Locale("{hi$3/4", "{hi$3/4", "{hi$3/4");
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-292L), (Chronology) buddhistChronology0, locale0);
      dateTimeParserBucket0.setZone((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
      assertNull(dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      Integer integer0 = new Integer(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, locale0, integer0, 10080);
      Integer integer1 = dateTimeParserBucket0.getPivotYear();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1785L, (Chronology) buddhistChronology0, locale0, (Integer) 1);
      Integer integer0 = dateTimeParserBucket0.getPivotYear();
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.UK;
      Integer integer0 = new Integer((-1282));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, locale0, integer0);
      Integer integer1 = dateTimeParserBucket0.getPivotYear();
      assertEquals((-1282), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-576L), 3, 3);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) mockZone0);
      Locale locale0 = Locale.CANADA;
      LimitChronology limitChronology0 = LimitChronology.getInstance(julianChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 3, (Chronology) limitChronology0, locale0);
      Integer integer0 = new Integer(3);
      dateTimeParserBucket0.setOffset(integer0);
      Integer integer1 = dateTimeParserBucket0.getOffsetInteger();
      assertEquals(3, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.US;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-292L), (Chronology) buddhistChronology0, locale0);
      dateTimeParserBucket0.setOffset((-1534));
      dateTimeParserBucket0.getOffsetInteger();
      assertEquals(-1534, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1813L, (Chronology) ethiopicChronology0, locale0);
      dateTimeParserBucket0.setOffset((-583));
      dateTimeParserBucket0.getOffsetInteger();
      assertEquals(-583, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.US;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-292L), (Chronology) buddhistChronology0, locale0);
      dateTimeParserBucket0.setOffset((-1534));
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals((-1534), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) islamicChronology0, locale0, (Integer) 1);
      long long0 = dateTimeParserBucket0.computeMillis(false, "Ksf17WGb");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.JAPANESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) buddhistChronology0, locale0);
      long long0 = dateTimeParserBucket0.computeMillis(true);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("");
      Integer integer0 = new Integer(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1953L, (Chronology) null, locale0, integer0, (-283));
      dateTimeParserBucket0.setOffset(integer0);
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals(1953L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.ENGLISH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 1, (Chronology) ethiopicChronology0, locale0);
      dateTimeParserBucket0.setOffset(1);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(1, dateTimeParserBucket0.getOffset());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      UnsupportedDurationField unsupportedDurationField0 = (UnsupportedDurationField)buddhistChronology0.eras();
      DurationField durationField0 = buddhistChronology0.centuries();
      int int0 = DateTimeParserBucket.compareReverse(unsupportedDurationField0, durationField0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      Locale locale0 = Locale.CANADA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(305L, (Chronology) copticChronology0, locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.saveField((DateTimeFieldType) null, "", locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(18L, (Chronology) null, locale0, (Integer) null, 2960);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.saveField((DateTimeFieldType) null, (-968));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-803L), (Chronology) null, locale0);
      dateTimeParserBucket0.saveField((DateTimeField) null, 0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "MOM.Z0'$}=c)[SZ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(5076L, (Chronology) buddhistChronology0, locale0, (Integer) null);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "English (United States)", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"English (United States)\" for yearOfCentury is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.PRC;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(5076L, (Chronology) buddhistChronology0, locale0, (Integer) null);
      dateTimeParserBucket0.saveField((DateTimeField) null, 1);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      DurationField durationField0 = buddhistChronology0.weekyears();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, (DurationField) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.ENGLISH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1877L, (Chronology) ethiopicChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      dateTimeParserBucket0.saveField(dateTimeField0, (-15015));
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, "The date must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"The date must not be null\": Value -15015 for halfdayOfDay must be in the range [0,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.ENGLISH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1829L, (Chronology) ethiopicChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      long long0 = dateTimeParserBucket0.computeMillis(true, "The date must not be null");
      assertEquals((-1934668800000L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      Locale locale0 = new Locale("5eu-hQsB>C!", "ZTA^yK*@r)Z");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(724L, (Chronology) islamicChronology0, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      boolean boolean0 = dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.JAPANESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) buddhistChronology0, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState1 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      assertSame(dateTimeParserBucket_SavedState1, dateTimeParserBucket_SavedState0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2208L, (Chronology) islamicChronology0, (Locale) null, (Integer) 1, 54);
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Period period0 = Period.millis((-877));
      Seconds seconds0 = period0.toStandardSeconds();
      Minutes minutes0 = seconds0.toStandardMinutes();
      DurationFieldType durationFieldType0 = minutes0.getFieldType();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0, islamicChronology_LeapYearPatternType0);
      DurationField durationField0 = durationFieldType0.getField(islamicChronology0);
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      int int0 = DateTimeParserBucket.compareReverse(durationField0, unsupportedDurationField0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Period period0 = Period.millis((-877));
      Seconds seconds0 = period0.toStandardSeconds();
      Minutes minutes0 = seconds0.toStandardMinutes();
      DurationFieldType durationFieldType0 = minutes0.getFieldType();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      int int0 = DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-576L), 3, 3);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) mockZone0);
      Locale locale0 = Locale.CANADA;
      LimitChronology limitChronology0 = LimitChronology.getInstance(julianChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 3, (Chronology) limitChronology0, locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal instant due to time zone offset transition (MockZone)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Integer integer0 = new Integer((-296));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, locale0, integer0, (-296));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"\" for millisOfSecond is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = new Locale("{hi$3/4", "{hi$3/4", "{hi$3/4");
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-292L), (Chronology) buddhistChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 8);
      long long0 = dateTimeParserBucket0.computeMillis(false, "(mI(>l3.^6");
      assertEquals((-16166908800292L), long0);
      
      long long1 = dateTimeParserBucket0.computeMillis(false, "");
      assertEquals((-16166908800292L), long1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-576L), 3, 3);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) mockZone0);
      Locale locale0 = Locale.CANADA;
      LimitChronology limitChronology0 = LimitChronology.getInstance(julianChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 3, (Chronology) limitChronology0, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "", locale0);
      dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, "8U_5{k8rrIa{/-D");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"8U_5{k8rrIa{/-D\": Illegal instant due to time zone offset transition (MockZone)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.ENGLISH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 1, (Chronology) ethiopicChronology0, (Locale) null);
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket((long) 1, (Chronology) ethiopicChronology0, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket1.new SavedState();
      boolean boolean0 = dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = new Locale("{hi$3/4", "{hi$3/4", "{hi$3/4");
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-292L), (Chronology) buddhistChronology0, locale0);
      boolean boolean0 = dateTimeParserBucket0.restoreState("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(382L, (Chronology) buddhistChronology0, locale0, (Integer) null);
      dateTimeParserBucket0.setOffset((Integer) 1);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = new Locale("{hi$3/4", "{hi$3/4", "{hi$3/4");
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-292L), (Chronology) buddhistChronology0, locale0);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTime.parse("9(.VF%n_inDW|=\"NVd-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"9(.VF%n_inDW|=\"NVd-\" is malformed at \"(.VF%n_inDW|=\"NVd-\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Integer integer0 = new Integer((-296));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, locale0, integer0, (-296));
      dateTimeParserBucket0.setOffset(integer0);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(296L, long0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.PRC;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(5076L, (Chronology) buddhistChronology0, locale0, (Integer) null);
      dateTimeParserBucket0.setPivotYear((Integer) 1);
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Locale locale0 = new Locale("{hi$3/4", "{hi$3/4", "{hi$3/4");
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-292L), (Chronology) buddhistChronology0, locale0);
      dateTimeParserBucket0.setZone((DateTimeZone) null);
      long long0 = dateTimeParserBucket0.computeMillis(false, "(mI(>l3.^6");
      assertEquals((-292L), long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1813L, (Chronology) ethiopicChronology0, locale0);
      Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1813L, (Chronology) ethiopicChronology0, locale0);
      Locale locale1 = dateTimeParserBucket0.getLocale();
      assertEquals("ita", locale1.getISO3Language());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1813L, (Chronology) ethiopicChronology0, locale0);
      dateTimeParserBucket0.setOffset(1);
      long long0 = dateTimeParserBucket0.computeMillis(true, "");
      assertEquals(1, dateTimeParserBucket0.getOffset());
      assertEquals(1812L, long0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Integer integer0 = new Integer((-296));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, locale0, integer0, (-296));
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals((-3600000L), long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(5076L, (Chronology) buddhistChronology0, locale0, (Integer) null);
      Integer integer0 = dateTimeParserBucket0.getPivotYear();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1813L, (Chronology) ethiopicChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      long long0 = dateTimeParserBucket0.computeMillis(true, "The date must not be null");
      assertEquals(1189555200000L, long0);
      
      long long1 = dateTimeParserBucket0.computeMillis(true, "");
      assertEquals(1189555200000L, long1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.PRC;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(5076L, (Chronology) buddhistChronology0, locale0, (Integer) null);
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals((-3594924L), long0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1813L, (Chronology) ethiopicChronology0, locale0);
      EthiopicChronology ethiopicChronology1 = (EthiopicChronology)dateTimeParserBucket0.getChronology();
      assertSame(ethiopicChronology0, ethiopicChronology1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.PRC;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(5076L, (Chronology) buddhistChronology0, locale0, (Integer) null);
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)dateTimeParserBucket0.getZone();
      assertEquals("Europe/Paris", cachedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.era();
      Locale locale0 = Locale.US;
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, (String) null, locale0);
      DateTimeField dateTimeField1 = buddhistChronology0.halfdayOfDay();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField1, 1);
      int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Integer integer0 = new Integer((-296));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, locale0, integer0, (-296));
      dateTimeParserBucket0.saveField((DateTimeField) null, 354);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }
}