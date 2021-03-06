/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 22:07:04 GMT 2017
 */

package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.HijrahDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DurationFormatUtils_ESTest extends DurationFormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("Yq");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("Yq", 34);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, " 1 minutes");
      Locale locale0 = Locale.GERMAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((TimeZone) simpleTimeZone0, locale0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
      int int0 = DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar1, mockGregorianCalendar0, 1, 256);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id= 1 minutes,offset=1,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=321,ZONE_OFFSET=1,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(256, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, " 1 minutes");
      Locale locale0 = Locale.GERMAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((TimeZone) simpleTimeZone0, locale0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
      mockGregorianCalendar1.set(1, (-942));
      int int0 = DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar1, 1, 1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=127,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
      assertEquals(1070, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, (-1375), (-85), (-2353), 0, (-2353));
      MockGregorianCalendar mockGregorianCalendar1 = (MockGregorianCalendar)MockCalendar.getInstance();
      int int0 = DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar1, 0, (-1375));
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-65799308353000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=117,MONTH=10,WEEK_OF_YEAR=49,WEEK_OF_MONTH=5,DAY_OF_MONTH=28,DAY_OF_YEAR=333,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=20,SECOND=47,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(1514L, 1514L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO((-958L), 66L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(86400000L, 1L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[9];
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("java.lang.StringBuffer@0000000010-4163java.lang.StringBuffer@0000000011java.lang.StringBuffer@0000000012");
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[2] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[3] = durationFormatUtils_TokenArray0[2];
      durationFormatUtils_TokenArray0[4] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[5] = durationFormatUtils_Token0;
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("y");
      durationFormatUtils_TokenArray0[6] = durationFormatUtils_Token1;
      // Undeclared exception!
      try { 
        DurationFormatUtils.format(durationFormatUtils_TokenArray0, (-984), 27, 27, 2002, (-1689), 207, 1379, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((long) (-2375), "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(1L, 86400000L, "The strings must not be null");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(86400039L, " 1 days");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(mockMinguoDate0);
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[8];
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[2] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[3] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[4] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[5] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[6] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[7] = durationFormatUtils_Token0;
      boolean boolean0 = DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      String string0 = (String)durationFormatUtils_Token0.getValue();
      assertEquals("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token((Object) null);
      int int0 = durationFormatUtils_Token0.getCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-829), 0, 2547, (-2375), 0);
      int int0 = DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar0, 0, 2908);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-88117196400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=824,MONTH=8,WEEK_OF_YEAR=38,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=256,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("b%4#");
      assertNotNull(durationFormatUtils_TokenArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("");
      assertNotNull(durationFormatUtils_TokenArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone("0java.lang.StringBuffer@000000004100java.lang.StringBuffer@000000004200java.lang.StringBuffer@0000000043066");
      String string0 = DurationFormatUtils.formatPeriod(86399999L, 66L, "", true, (TimeZone) zoneInfo0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(0L, 0L, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "", true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-4067L), "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[7];
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[2] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[3] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[4] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[5] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[6] = durationFormatUtils_Token0;
      String string0 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, 1, (-855), 1, 1364, 3864, 3864, 1, true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 2713, (-1722), (-1722), 13);
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, (Calendar) null, 13, 13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1236), "java.lang.StringBuffer@0000000056000000-1java.lang.StringBuffer@0000000057java.lang.StringBuffer@0000000058java.lang.StringBuffer@0000000059java.lang.StringBuffer@0000000060java.lang.StringBuffer@0000000061java.lang.StringBuffer@0000000062java.lang.StringBuffer@0000000063java.lang.StringBuffer@0000000064");
      MockGregorianCalendar mockGregorianCalendar0 = (MockGregorianCalendar)MockCalendar.getInstance((TimeZone) simpleTimeZone0);
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar0, 63, 115);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone(zoneId0);
      MockGregorianCalendar mockGregorianCalendar0 = (MockGregorianCalendar)MockCalendar.getInstance((TimeZone) zoneInfo0);
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar0, (-2604), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2604
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.lexx((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone("");
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatPeriod(0L, 3534L, (String) null, false, (TimeZone) zoneInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatPeriod(0L, 0L, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatDuration((long) (-944), (String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatDuration((-619L), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1236), "java.lang.StringBuffer@0000000056000000-1java.lang.StringBuffer@0000000057java.lang.StringBuffer@0000000058java.lang.StringBuffer@0000000059java.lang.StringBuffer@0000000060java.lang.StringBuffer@0000000061java.lang.StringBuffer@0000000062java.lang.StringBuffer@0000000063java.lang.StringBuffer@0000000064");
      String string0 = DurationFormatUtils.formatPeriod((-1L), 2419201744L, "c`I|`2!N`i ", true, (TimeZone) simpleTimeZone0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
      String string0 = DurationFormatUtils.formatPeriod((-1L), (-4067L), "java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@0000000019-23java.lang.StringBuffer@0000000020-59java.lang.StringBuffer@0000000021-59java.lang.StringBuffer@0000000022java.lang.StringBuffer@0000000023", false, (TimeZone) zoneInfo0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-1774L), "The offs_ cannIt be negXive", false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((long) 1, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("", 5);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[4];
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutesSeconds(5, 5, 5);
      HijrahDate hijrahDate0 = MockHijrahDate.now((ZoneId) zoneOffset0);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(hijrahDate0, 5);
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0, 5);
      boolean boolean0 = durationFormatUtils_TokenArray0[0].equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("", 5);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(3081L, (-1082L), "java.lang.StringBuffer@00000000042419201java.lang.StringBuffer@0000000005");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-1774L), 2419200000L, "]y.&uVFb2B@{p;");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-717L), 2419200000L, "org.apache.commons.io.filefilter.MagicNumberFileFilter");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-958L), true, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-1774L), false, true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(1L, 86400000L, "07H/yC}tX%:");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS((-3L));
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("java.lang.StringBuffer@00000000170000java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000210java.lang.StringBuffer@00000000220java.lang.StringBuffer@000000002397java.lang.StringBuffer@0000000024");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(0L, 2419200000L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO((-822L));
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(mockMinguoDate0);
      String string0 = durationFormatUtils_Token0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("", 5);
      durationFormatUtils_Token0.increment();
  }
}
