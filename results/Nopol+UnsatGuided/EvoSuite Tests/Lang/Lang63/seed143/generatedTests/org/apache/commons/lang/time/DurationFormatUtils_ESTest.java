/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 25 07:06:50 GMT 2017
 */

package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Clock;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.JapaneseDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DurationFormatUtils_ESTest extends DurationFormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(mockHijrahDate0, 0);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0, 1723);
      DurationFormatUtils.Token durationFormatUtils_Token2 = new DurationFormatUtils.Token(durationFormatUtils_Token0, 0);
      boolean boolean0 = durationFormatUtils_Token1.equals(durationFormatUtils_Token2);
      assertFalse(boolean0);
      assertFalse(durationFormatUtils_Token2.equals((Object)durationFormatUtils_Token1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 0, (-81), (-81), 880, 0);
      Locale locale0 = Locale.UK;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
      int int0 = DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar1, 1, (-1792));
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=57942418881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=3806,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[6];
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0);
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("M", (-1));
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token1;
      // Undeclared exception!
      try { 
        DurationFormatUtils.format(durationFormatUtils_TokenArray0, (-1592), 2834, 2523, 2523, (-371), (-2924), (-371), false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[5];
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("7m5f1=P>B2B1", 1637);
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_TokenArray0[0];
      durationFormatUtils_TokenArray0[2] = durationFormatUtils_TokenArray0[1];
      durationFormatUtils_TokenArray0[3] = durationFormatUtils_Token0;
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("y");
      durationFormatUtils_TokenArray0[4] = durationFormatUtils_Token1;
      String string0 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, 1637, 1588, 72, 72, 72, 1588, 13, true);
      //  // Unstable assertion: assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((long) 0, 2419200000L, "+ WI]BcAF}K`!");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(1929L, false, true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(59999L, (-1L), "org.apache.commons.io.filefilter.AgeFileFilter");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(2419200000L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Clock clock0 = MockClock.systemDefaultZone();
      JapaneseDate japaneseDate0 = MockJapaneseDate.now(clock0);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(japaneseDate0, 0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 0, (-81), (-81), 880, 0);
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[9];
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[2] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[3] = durationFormatUtils_TokenArray0[2];
      durationFormatUtils_TokenArray0[4] = durationFormatUtils_TokenArray0[2];
      durationFormatUtils_TokenArray0[5] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[6] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[7] = durationFormatUtils_TokenArray0[3];
      durationFormatUtils_TokenArray0[8] = durationFormatUtils_Token0;
      boolean boolean0 = DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Clock clock0 = MockClock.systemDefaultZone();
      JapaneseDate japaneseDate0 = MockJapaneseDate.now(clock0);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(japaneseDate0, 0);
      durationFormatUtils_Token0.increment();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000210java.lang.StringBuffer@000000002299java.lang.StringBuffer@0000000023", (-736));
      String string0 = (String)durationFormatUtils_Token0.getValue();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(mockThaiBuddhistDate0, 0);
      int int0 = durationFormatUtils_Token0.getCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("");
      assertNotNull(durationFormatUtils_TokenArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone("");
      String string0 = DurationFormatUtils.formatPeriod(0L, 1799L, "", true, (TimeZone) zoneInfo0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((long) 0, 60000L, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(1615L, "0java.lang.StringBuffer@000000001100java.lang.StringBuffer@000000001205java.lang.StringBuffer@0000000013345");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("org.apache.commons.io.filefilter.EmptyFileFilter");
      String string0 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, 115, 3390, 5345, 291, 3390, 115, 3115, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect((Calendar) null, (Calendar) null, 1483, 1483);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone(zoneId0);
      Locale locale0 = Locale.ITALIAN;
      MockGregorianCalendar mockGregorianCalendar0 = (MockGregorianCalendar)MockCalendar.getInstance((TimeZone) zoneInfo0, locale0);
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar0, 910, (-2114));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((TimeZone) zoneInfo0);
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar0, (-92), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -92
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.lexx((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatPeriod(1825L, 2419202116L, "java.lang.StringBuffer@00000000040java.lang.StringBuffer@0000000005", true, (TimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatPeriod(1852L, 1852L, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatDuration(1L, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatDuration((-1295L), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone("java.lang.StringBuffer@00000000340java.lang.StringBuffer@00000000350java.lang.StringBuffer@00000000360java.lang.StringBuffer@00000000370java.lang.StringBuffer@00000000380java.lang.StringBuffer@0000000039-2java.lang.StringBuffer@000000004046java.lang.StringBuffer@0000000041");
      String string0 = DurationFormatUtils.formatPeriod((long) 95, 571L, "5Y,^@(j{Yn)3lD", false, (TimeZone) zoneInfo0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "", true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-1L), "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000210java.lang.StringBuffer@000000002299java.lang.StringBuffer@0000000023", (-736));
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("java.lang.StringBuffer@000000003400004713java.lang.StringBuffer@0000000035java.lang.StringBuffer@0000000036java.lang.StringBuffer@0000000037java.lang.StringBuffer@0000000038java.lang.StringBuffer@0000000039java.lang.StringBuffer@0000000040java.lang.StringBuffer@0000000041java.lang.StringBuffer@0000000042");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(mockHijrahDate0, 0);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000210java.lang.StringBuffer@0000000022097java.lang.StringBuffer@0000000023");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone("java.lang.StringBuffer@00000000340java.lang.StringBuffer@00000000350java.lang.StringBuffer@00000000360java.lang.StringBuffer@00000000370java.lang.StringBuffer@00000000380java.lang.StringBuffer@0000000039-2java.lang.StringBuffer@000000004046java.lang.StringBuffer@0000000041");
      String string0 = DurationFormatUtils.formatPeriod((-2078L), 2419202111L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true, (TimeZone) zoneInfo0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone((ZoneId) zoneOffset0);
      String string0 = DurationFormatUtils.formatPeriod((-2341L), 2419200000L, "java.lang.StringBuffer@000000003400004713java.lang.StringBuffer@0000000035java.lang.StringBuffer@0000000036java.lang.StringBuffer@0000000037java.lang.StringBuffer@0000000038java.lang.StringBuffer@0000000039java.lang.StringBuffer@0000000040java.lang.StringBuffer@0000000041java.lang.StringBuffer@0000000042", false, (TimeZone) zoneInfo0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO((-2111L), 2419200000L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(3772, true, true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(2419200000L, false, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((long) 95, (-2559L), "The wildcard array must not be null");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(durationFormatUtils0, 95);
      boolean boolean0 = durationFormatUtils_Token0.equals("java.lang.StringBuffer@000000001200java.lang.StringBuffer@0000000013java.lang.StringBuffer@00000000140java.lang.StringBuffer@00000000150java.lang.StringBuffer@0000000016-2java.lang.StringBuffer@0000000017");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0);
      String string0 = durationFormatUtils_Token0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO((-1L));
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000210java.lang.StringBuffer@000000002299java.lang.StringBuffer@0000000023", (-736));
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }
}
