/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 27 18:42:00 GMT 2017
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeZoneBuilder_ESTest extends DateTimeZoneBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(153);
      dateTimeZoneBuilder1.setFixedSavings("", (-1173));
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        dateTimeZoneBuilder1.writeTo("FpipAhp!h", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("Fixing duplicate name key - ", (-2145968132), 35, 45, 's', 45, 35, (-1133), true, (-1186));
      dateTimeZoneBuilder1.setFixedSavings("'-&s~,r", 22);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("Fixing duplicate recurrent name key - ", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 45 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-2145968132));
      dateTimeZoneBuilder1.addRecurringSavings("Fixing duplicate name key - ", (-2145968132), 35, 45, 's', 45, 35, (-1133), true, (-1186));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("Fixing duplicate recurrent name key - ", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 45 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-2145968132));
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.addCutover(35, 's', 45, 's', (-2145968132), true, (-2145968132));
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.addCutover((-1186), 's', 236548278, (-1133), 45, false, (-2145968132));
      assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("UTC", (-3898));
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder1.toDateTimeZone("UTC", true);
      assertEquals("UTC", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte) (-126);
      byteArray0[5] = (byte) (-126);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      dataInputStream0.readInt();
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 31557600000L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) pipedOutputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) filterOutputStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 1000L);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(18000000L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)42;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals((-39600000L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("Europe/London", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("org.joda.time.TestBaseSingleFieldPeriod", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("mc<+Rr", "Ewna5(es7Q#!:+:M `9");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream((File) mockFile0, false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockFileOutputStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (DataOutput) objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readMillis((DataInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-13), 119);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) byteArrayInputStream0, 1073741824);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) pushbackInputStream0);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -13
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) pipedInputStream0);
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) null, "5\"M2");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2569), 1970);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "UTC");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2569
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "l/bTN");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, (String) null);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings((String) null, 336, 80, 80, 'x', 80, 0, 0, false, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: x
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forID("Africa/Johannesburg");
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, cachedDateTimeZone0);
      Duration duration0 = Duration.ZERO;
      Seconds seconds0 = duration0.toStandardSeconds();
      Hours hours0 = seconds0.toStandardHours();
      Minutes minutes0 = hours0.toStandardMinutes();
      Days days0 = minutes0.toStandardDays();
      Period period0 = days0.toPeriod();
      // Undeclared exception!
      try { 
        zonedChronology0.get((ReadablePeriod) period0, 2585L, (-9223372036854775808L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The minuend instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(7200000, '/', 543, 2, 326565, false, (-1610612734));
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "//y^K<\"OXEyI");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) pipedInputStream0, "3tqnDJs\"cg*%T");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forID("Africa/Johannesburg");
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, cachedDateTimeZone0);
      zonedChronology0.getZone();
      int int0 = cachedDateTimeZone0.getStandardOffset(2862L);
      assertEquals(7200000, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forID("Africa/Johannesburg");
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, cachedDateTimeZone0);
      CachedDateTimeZone cachedDateTimeZone1 = (CachedDateTimeZone)zonedChronology0.getZone();
      zonedChronology0.getDateTimeMillis(1, 1, 1, 1);
      cachedDateTimeZone1.getShortName((-9223372036854775808L), (Locale) null);
      cachedDateTimeZone0.getStandardOffset((-9223372036854775808L));
      cachedDateTimeZone1.getNameKey((-123L));
      copticChronology0.add(934L, 2862L, (-878));
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) zonedChronology0);
      boolean boolean0 = cachedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forID("Africa/Johannesburg");
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, cachedDateTimeZone0);
      CachedDateTimeZone cachedDateTimeZone1 = CachedDateTimeZone.forZone(cachedDateTimeZone0);
      copticChronology0.add(934L, 2862L, (-883));
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) zonedChronology0);
      cachedDateTimeZone1.getShortName((long) (-883));
      boolean boolean0 = cachedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-2145968132));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.addCutover((-1133), '\"', 45, (-1133), 35, false, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: \"
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings((String) null, 58, 1551, 1779, 'u', 1779, 58, 60, true, 1551);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("LasGr7)7cQ0<TI)", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1779 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) pipedOutputStream0);
      dateTimeZoneBuilder0.writeTo("3tqnDJs\"cg*%T", (OutputStream) objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset(4);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder0.toDateTimeZone("UTC", false);
      assertEquals("UTC", fixedDateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone((String) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("Africa/Johannesburg", 15271875, 145, 1, 'g', Integer.MIN_VALUE, 61, (-669), false, 145);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("x|1mk?L", 2458);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder0.toDateTimeZone("UTC", true);
      assertEquals("UTC", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("wzc1?V*Bg$VD", '\"');
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) pipedOutputStream0);
      dateTimeZoneBuilder0.writeTo("", (DataOutput) objectOutputStream0);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 604800000L);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) byteArrayOutputStream0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) mockPrintStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, (-60000L));
      assertEquals(4, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.getDefault();
      assertEquals("Etc/UTC", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, (String) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("Fixing duplicate name key - ", (-2145968132), 35, 45, 's', 45, 35, (-1133), true, (-1186));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("Fixing duplicate name key - ", (DataOutput) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 45 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("k$c5T.eS", (-283), (-283), (-283), 'w', 1146, (-283), (-86), true, 2147429963);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(475);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(475, 'w', 4, 475, (-283), true, (-86));
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("k$c5T.eS", 115);
      assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("UTC", 4);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder1.toDateTimeZone("UTC", true);
      assertTrue(fixedDateTimeZone0.isFixed());
  }
}