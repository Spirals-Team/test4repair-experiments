/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 21 22:16:17 GMT 2017
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
import org.joda.time.MockZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
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
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField0, dateTimeFieldType0);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(delegatedDateTimeField0, 1);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField0, 1);
      int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(4755L, (Chronology) gregorianChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 2005);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, ")6|?5,S9WzC8pg#o)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \")6|?5,S9WzC8pg#o)\": Value 2005 for dayOfWeek must be in the range [1,7]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-839L), (Chronology) null, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-1563));
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, "ht+igL@`[9");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"ht+igL@`[9\": Value -1563 for weekOfWeekyear must be in the range [1,52]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, 1);
      long long0 = dateTimeParserBucket_SavedField0.set(1, true);
      assertEquals((-259200000L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, (String) null, locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket_SavedField0.set(1, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for dayOfWeek must be in the range [1,7]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) copticChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.setPivotYear((Integer) null);
      Integer integer0 = dateTimeParserBucket0.getPivotYear();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) copticChronology0, locale0, (Integer) 1);
      Integer integer0 = dateTimeParserBucket0.getPivotYear();
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Locale locale0 = Locale.US;
      Integer integer0 = new Integer((-1));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) gregorianChronology0, locale0, integer0);
      Integer integer1 = dateTimeParserBucket0.getPivotYear();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(324L, (Chronology) null, locale0);
      Integer integer0 = new Integer(0);
      dateTimeParserBucket0.setOffset(integer0);
      Integer integer1 = dateTimeParserBucket0.getOffsetInteger();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.JAPAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2368L, (Chronology) ethiopicChronology0, locale0);
      dateTimeParserBucket0.setOffset(10);
      dateTimeParserBucket0.getOffsetInteger();
      assertEquals(10, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(4);
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.CHINESE;
      Integer integer0 = new Integer(4);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1660L), (Chronology) iSOChronology0, locale0, integer0, (-281));
      dateTimeParserBucket0.setOffset((-1627));
      dateTimeParserBucket0.getOffsetInteger();
      assertEquals(-1627, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-2909L), 0, 93);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) buddhistChronology0, locale0, (Integer) buddhistChronology0.BE, 1149);
      dateTimeParserBucket0.setOffset(1811);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(1811, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.JAPAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2368L, (Chronology) ethiopicChronology0, locale0);
      long long0 = dateTimeParserBucket0.computeMillis(false, "");
      assertEquals(2368L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 0, (Chronology) buddhistChronology0, locale0);
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Locale locale0 = Locale.CHINA;
      Integer integer0 = new Integer((-1932));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1509L, (Chronology) julianChronology0, locale0, integer0);
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals(1509L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      IslamicChronology islamicChronology1 = (IslamicChronology)islamicChronology0.withUTC();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) islamicChronology1, locale0, (Integer) islamicChronology0.AH);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.PRC;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(172800000L, (Chronology) ethiopicChronology0, locale0, (Integer) 1);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(172800000L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Locale locale0 = new Locale("\"pb4UN'-%wB!");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-815L), (Chronology) iSOChronology0, locale0, (Integer) null);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.saveField((DateTimeFieldType) null, (String) null, locale0);
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
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Locale locale0 = Locale.CHINA;
      Integer integer0 = new Integer((-1932));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1509L, (Chronology) julianChronology0, locale0, integer0);
      dateTimeParserBucket0.saveField((DateTimeField) null, (-1932));
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "Jro[?_YvfmIfhA!R\"");
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
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.CANADA_FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1000000L, (Chronology) buddhistChronology0, locale0, (Integer) buddhistChronology0.BE);
      dateTimeParserBucket0.saveField((DateTimeField) null, 0);
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

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      StrictChronology strictChronology0 = StrictChronology.getInstance(gJChronology0);
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1168L, (Chronology) strictChronology0, locale0, (Integer) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "\">l(b<{U^n:.&/)", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"\">l(b<{U^n:.&/)\" for dayOfYear is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      DateTimeField dateTimeField1 = buddhistChronology0.dayOfWeek();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField1, 1);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField0, "_9.6K+ruPl*Tcv{|", (Locale) null);
      int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      Integer integer0 = Integer.valueOf(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2124L), (Chronology) iSOChronology0, (Locale) null, integer0);
      dateTimeParserBucket0.setOffset(0);
      long long0 = dateTimeParserBucket0.computeMillis(true, "s&4V2ey^-SG");
      assertEquals((-2124L), long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      Integer integer0 = Integer.valueOf(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2124L), (Chronology) iSOChronology0, (Locale) null, integer0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      dateTimeParserBucket0.saveField(dateTimeField0, 0);
      long long0 = dateTimeParserBucket0.computeMillis(true, "s&4V2ey^-SG");
      assertEquals((-7200000L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-839L), (Chronology) null, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "ht+igL@`[9", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "ht+igL@`[9");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"ht+igL@`[9\": Value \"ht+igL@`[9\" for era is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.CANADA_FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1000000L, (Chronology) buddhistChronology0, locale0, (Integer) buddhistChronology0.BE);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      assertNotNull(dateTimeParserBucket_SavedState0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) gJChronology0, (Locale) null, (Integer) null, (-70));
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      DurationField durationField0 = buddhistChronology0.millis();
      UnsupportedDurationField unsupportedDurationField0 = (UnsupportedDurationField)buddhistChronology0.eras();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, unsupportedDurationField0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfDay();
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField((Chronology) ethiopicChronology0, dateTimeField0);
      DurationField durationField0 = skipUndoDateTimeField0.getRangeDurationField();
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, durationField0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      UnsupportedDurationField unsupportedDurationField0 = (UnsupportedDurationField)buddhistChronology0.eras();
      int int0 = DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, (DurationField) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(4755L, (Chronology) gregorianChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, ")6|?5,S9WzC8pg#o)", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, ")6|?5,S9WzC8pg#o)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \")6|?5,S9WzC8pg#o)\": Value \")6|?5,S9WzC8pg#o)\" for millisOfSecond is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-2909L), 0, 93);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) buddhistChronology0, locale0, (Integer) buddhistChronology0.BE, 1149);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"\": Illegal instant due to time zone offset transition (MockZone)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-2909L), 0, 93);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) buddhistChronology0, locale0, (Integer) buddhistChronology0.BE, 1149);
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
  public void test34()  throws Throwable  {
      Integer integer0 = new Integer((-868));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1449L), (Chronology) null, (Locale) null, integer0);
      dateTimeParserBucket0.setZone((DateTimeZone) null);
      long long0 = dateTimeParserBucket0.computeMillis(true, "$'*~Xmy");
      assertEquals((-1449L), long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      Integer integer0 = Integer.valueOf(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2124L), (Chronology) iSOChronology0, (Locale) null, integer0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      dateTimeParserBucket0.saveField(dateTimeField0, 0);
      long long0 = dateTimeParserBucket0.computeMillis(true);
      assertEquals((-7200000L), long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(iSOChronology0);
      Locale locale0 = Locale.forLanguageTag("");
      Integer integer0 = new Integer((-1750));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) lenientChronology0, locale0, integer0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      boolean boolean0 = dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      assertTrue(boolean0);
      
      long long0 = dateTimeParserBucket0.computeMillis(true, "");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1505L, (Chronology) buddhistChronology0, locale0, (Integer) 1);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket((long) 1, (Chronology) buddhistChronology0, locale0, (Integer) null, 1);
      boolean boolean0 = dateTimeParserBucket1.restoreState(dateTimeParserBucket_SavedState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.CANADA_FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1000000L, (Chronology) buddhistChronology0, locale0, (Integer) buddhistChronology0.BE);
      boolean boolean0 = dateTimeParserBucket0.restoreState(buddhistChronology0.BE);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MockZone mockZone0 = new MockZone(62035200000L, 0, (-833));
      DateTime dateTime0 = null;
      try {
        dateTime0 = new DateTime((Object) "-23:59", (DateTimeZone) mockZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-23:59\" is malformed at \":59\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) iSOChronology0, locale0);
      Integer integer0 = new Integer((-2344));
      dateTimeParserBucket0.setOffset(integer0);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals((-2344), int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(324L, (Chronology) null, locale0);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = new Locale("}gk2]=XqUM");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2078L), (Chronology) buddhistChronology0, locale0, (Integer) 1);
      Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.CANADA_FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1000000L, (Chronology) buddhistChronology0, locale0, (Integer) buddhistChronology0.BE);
      Locale locale1 = dateTimeParserBucket0.getLocale();
      assertEquals("CAN", locale1.getISO3Country());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      Locale locale0 = Locale.ENGLISH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(939L, (Chronology) zonedChronology0, locale0);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals((-3599061L), long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      Integer integer0 = Integer.valueOf(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2124L), (Chronology) iSOChronology0, (Locale) null, integer0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfDay();
      dateTimeParserBucket0.saveField(dateTimeField0, 0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for clockhourOfDay must be in the range [1,24]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      Integer integer0 = Integer.valueOf(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2124L), (Chronology) iSOChronology0, (Locale) null, integer0);
      Integer integer1 = dateTimeParserBucket0.getPivotYear();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1505L, (Chronology) buddhistChronology0, locale0, (Integer) 1);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.saveField((DateTimeFieldType) null, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(iSOChronology0);
      Locale locale0 = Locale.forLanguageTag("");
      Integer integer0 = new Integer((-1750));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) lenientChronology0, locale0, integer0);
      LenientChronology lenientChronology1 = (LenientChronology)dateTimeParserBucket0.getChronology();
      assertSame(lenientChronology0, lenientChronology1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = new Locale("}gk2]=XqUM");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2078L), (Chronology) buddhistChronology0, locale0, (Integer) 1);
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)dateTimeParserBucket0.getZone();
      assertEquals("Europe/Paris", cachedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      Integer integer0 = Integer.valueOf(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2124L), (Chronology) iSOChronology0, (Locale) null, integer0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      boolean boolean0 = dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
      assertTrue(boolean0);
      
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState1 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      assertSame(dateTimeParserBucket_SavedState1, dateTimeParserBucket_SavedState0);
  }
}
