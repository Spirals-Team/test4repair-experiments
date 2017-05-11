/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 20 02:06:44 GMT 2017
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.MockPartial;
import org.joda.time.MockZone;
import org.joda.time.ReadableDateTime;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.LenientDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      Locale locale0 = Locale.CHINA;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      LenientDateTimeField lenientDateTimeField0 = (LenientDateTimeField)LenientDateTimeField.getInstance(dateTimeField0, islamicChronology0);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(lenientDateTimeField0, "SMiM0T,B", locale0);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField0, "", locale0);
      int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = new Locale(":", ":");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-747L), (Chronology) null, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField0);
      dateTimeParserBucket0.saveField((DateTimeField) delegatedDateTimeField0, 1);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState1 = dateTimeParserBucket0.new SavedState();
      dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      boolean boolean0 = dateTimeParserBucket_SavedState1.restoreState(dateTimeParserBucket0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = new Locale(":", ":");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-747L), (Chronology) null, locale0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField0);
      dateTimeParserBucket0.saveField((DateTimeField) delegatedDateTimeField0, 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 999);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, ":");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \":\": Value 999 for weekOfWeekyear must be in the range [1,52]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = new Locale("'", "FKH#A93I!L;h^N#");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 1, (Chronology) ethiopicChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      long long0 = dateTimeParserBucket0.computeMillis(true, "\"k[H!TX,zK!");
      assertEquals(1189548000000L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, 1);
      long long0 = dateTimeParserBucket_SavedField0.set(0L, false);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-3598L), (Chronology) copticChronology0, locale0, (Integer) 1);
      Integer integer0 = dateTimeParserBucket0.getPivotYear();
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Locale locale0 = Locale.ROOT;
      Integer integer0 = Integer.valueOf(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, (Chronology) gJChronology0, locale0, integer0);
      Integer integer1 = dateTimeParserBucket0.getPivotYear();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      Integer integer0 = new Integer((-1492));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, locale0, integer0);
      Integer integer1 = dateTimeParserBucket0.getPivotYear();
      assertEquals((-1492), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Locale locale0 = Locale.GERMANY;
      Integer integer0 = new Integer((-1));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(3000L, (Chronology) gregorianChronology0, locale0, integer0);
      Integer integer1 = dateTimeParserBucket0.getPivotYear();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.forLanguageTag("");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) buddhistChronology0, locale0);
      dateTimeParserBucket0.setOffset(122400000);
      dateTimeParserBucket0.getOffsetInteger();
      assertEquals(122400000, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2120L, (Chronology) null, locale0, (Integer) 1);
      Integer integer0 = new Integer((-1068));
      dateTimeParserBucket0.setOffset(integer0);
      Integer integer1 = dateTimeParserBucket0.getOffsetInteger();
      assertEquals((-1068), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2120L, (Chronology) null, locale0, (Integer) 1);
      Integer integer0 = new Integer((-1068));
      dateTimeParserBucket0.setOffset(integer0);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals((-1068), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 1, (Chronology) buddhistChronology0, locale0);
      dateTimeParserBucket0.setOffset((Integer) 1);
      long long0 = dateTimeParserBucket0.computeMillis(false, "C");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(julianChronology0, fixedDateTimeZone0);
      StrictChronology strictChronology0 = StrictChronology.getInstance(zonedChronology0);
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) strictChronology0, locale0);
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.ROOT;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(4785L, (Chronology) buddhistChronology0, locale0, (Integer) 1, 56);
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals(4785L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LimitChronology limitChronology0 = LimitChronology.getInstance(gregorianChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      Locale locale0 = new Locale("O,tJ", "O,tJ");
      LimitChronology limitChronology1 = (LimitChronology)limitChronology0.withUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) limitChronology1, locale0, (Integer) null, (-500));
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      Locale locale0 = Locale.JAPAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-3328L), (Chronology) islamicChronology0, locale0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeField0, 1);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(18682361996672L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, (DurationField) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.halfdays();
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, durationField0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(41);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.ENGLISH;
      Integer integer0 = new Integer(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(290L, (Chronology) gregorianChronology0, locale0, integer0, 0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.saveField((DateTimeFieldType) null, "+-8|'a&\"", locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, (Chronology) null, (Locale) null, integer0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.saveField((DateTimeFieldType) null, 0);
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
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-3598L), (Chronology) copticChronology0, locale0, (Integer) 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "gTvMsh@w", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"gTvMsh@w\" for secondOfMinute is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.months();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, (DurationField) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfYear();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, 43);
      Locale locale0 = Locale.FRENCH;
      DateTimeField dateTimeField1 = buddhistChronology0.dayOfMonth();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField1, "C", locale0);
      int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockPartial mockPartial0 = new MockPartial();
      ISOChronology iSOChronology0 = (ISOChronology)mockPartial0.getChronology();
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(482L, (Chronology) iSOChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 2);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2 for era must be in the range [0,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2120L, (Chronology) null, locale0, (Integer) 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, "org.joda.time.base.BaseDuration");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"org.joda.time.base.BaseDuration\": Illegal instant due to time zone offset transition (Europe/Paris)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.years();
      UnsupportedDurationField unsupportedDurationField0 = (UnsupportedDurationField)buddhistChronology0.eras();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, unsupportedDurationField0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 1, (Chronology) buddhistChronology0, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      boolean boolean0 = dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = new Locale("'", "FKH#A93I!L;h^N#");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 1, (Chronology) ethiopicChronology0, locale0);
      dateTimeParserBucket0.setZone((DateTimeZone) null);
      long long0 = dateTimeParserBucket0.computeMillis(false, "\"k[H!TX,zK!");
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2120L, (Chronology) null, locale0, (Integer) 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal instant due to time zone offset transition (Europe/Paris)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2120L, (Chronology) null, locale0, (Integer) 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      long long0 = dateTimeParserBucket0.computeMillis(true);
      assertEquals((-62135597361000L), long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 1, (Chronology) buddhistChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "_X#]UG7yub>)7O{iA", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "_X#]UG7yub>)7O{iA");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"_X#]UG7yub>)7O{iA\": Value \"_X#]UG7yub>)7O{iA\" for minuteOfDay is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = new Locale(":", ":");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-747L), (Chronology) null, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField0);
      dateTimeParserBucket0.saveField((DateTimeField) delegatedDateTimeField0, 1);
      boolean boolean0 = dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
      assertTrue(boolean0);
      
      long long0 = dateTimeParserBucket0.computeMillis(true, ":");
      assertEquals((-3600747L), long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = Locale.GERMAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-939L), (Chronology) copticChronology0, locale0, (Integer) 1);
      MockZone mockZone0 = new MockZone(1115313015000L, 0, 0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(2047L, (Chronology) buddhistChronology0, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket1.new SavedState();
      boolean boolean0 = dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      MockZone mockZone0 = new MockZone((-3428L), 1, 1);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) mockZone0, 1);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 1, (Chronology) ethiopicChronology0, locale0, (Integer) 1);
      Object object0 = new Object();
      boolean boolean0 = dateTimeParserBucket0.restoreState(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockPartial mockPartial0 = new MockPartial();
      ISOChronology iSOChronology0 = (ISOChronology)mockPartial0.getChronology();
      Locale locale0 = Locale.CANADA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) iSOChronology0, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState1 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      assertSame(dateTimeParserBucket_SavedState1, dateTimeParserBucket_SavedState0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = new Locale(":", ":");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-747L), (Chronology) null, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField0);
      dateTimeParserBucket0.saveField((DateTimeField) delegatedDateTimeField0, 1);
      dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 999);
      assertEquals("clockhourOfHalfday", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2120L, (Chronology) null, locale0, (Integer) 1);
      dateTimeParserBucket0.setOffset((Integer) copticChronology0.AM);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2120L, (Chronology) null, locale0, (Integer) 1);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1877L), (Chronology) ethiopicChronology0, (Locale) null, (Integer) 1, 26);
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), (Chronology) islamicChronology0, locale0);
      dateTimeParserBucket0.setOffset((Integer) 1);
      Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 1, (Chronology) buddhistChronology0, locale0);
      dateTimeParserBucket0.setPivotYear((Integer) null);
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.forLanguageTag("");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) buddhistChronology0, locale0);
      Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.forLanguageTag("");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) buddhistChronology0, locale0);
      Locale locale1 = dateTimeParserBucket0.getLocale();
      assertEquals("", locale1.toString());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LimitChronology limitChronology0 = LimitChronology.getInstance(gregorianChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      Locale locale0 = new Locale("O,tJ", "O,tJ");
      Integer integer0 = new Integer((-500));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) limitChronology0, locale0, integer0);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals((-3600000L), long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 1, (Chronology) buddhistChronology0, locale0);
      Integer integer0 = dateTimeParserBucket0.getPivotYear();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.forLanguageTag("");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) buddhistChronology0, locale0);
      BuddhistChronology buddhistChronology1 = (BuddhistChronology)dateTimeParserBucket0.getChronology();
      assertEquals(1, BuddhistChronology.BE);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockPartial mockPartial0 = new MockPartial();
      ISOChronology iSOChronology0 = (ISOChronology)mockPartial0.getChronology();
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(482L, (Chronology) iSOChronology0, locale0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeParserBucket0.getZone();
      assertEquals("UTC", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockPartial mockPartial0 = new MockPartial();
      ISOChronology iSOChronology0 = (ISOChronology)mockPartial0.getChronology();
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(482L, (Chronology) iSOChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"\" for monthOfYear is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), (Chronology) islamicChronology0, locale0);
      dateTimeParserBucket0.saveField((DateTimeField) null, 2745);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
