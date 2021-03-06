/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 25 14:35:09 GMT 2017
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeZoneBuilder_ESTest extends DateTimeZoneBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      boolean boolean0 = cachedDateTimeZone0.isStandardOffset(2801L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(lenientChronology0, cachedDateTimeZone0);
      Period period0 = Period.days(7);
      Period period1 = period0.plusDays(7);
      long long0 = zonedChronology0.add((ReadablePeriod) period1, 1800000L, (-1075));
      assertEquals((-1300314600000L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("", 3214);
      dateTimeZoneBuilder0.addCutover(83, 's', 2, 88, 0, false, (-837));
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(3214, 's', 7, 83, 7, true, 1342);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) pipedOutputStream0);
      try { 
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, (-3600000L));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("2147483648");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      dateTimeZoneBuilder0.writeTo("2147483648", (OutputStream) mockPrintStream0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("2147483648");
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) mockFileInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(4, mockFileInputStream0.available());
      assertEquals(6039848940000L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("2147483648");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      dateTimeZoneBuilder0.writeTo("2147483648", (OutputStream) mockPrintStream0);
      assertEquals(8L, mockFile0.length());
      
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("2147483648");
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) mockFileInputStream0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, "");
      assertEquals("", fixedDateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("l_Raej0gIJVkH0/ie8", (-2065), 86, 1881, 'u', (-2065), 1881, 1881, false, (-2065));
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 86);
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) bufferedOutputStream0, false);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("Magnitude of add amount is too large: ", (OutputStream) mockPrintStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2065 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo(",N7Tt97u;K'h++", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        dateTimeZoneBuilder0.writeTo("", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("", 10, 10, 83, 's', 10, 10, 2538, false, 10);
      MockPrintStream mockPrintStream0 = new MockPrintStream(" - ");
      dateTimeZoneBuilder0.addCutover(3206, 's', 7, 83, 7, true, 1342);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) mockPrintStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("KR", (DataOutput) dataOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 83 for dayOfMonth must be in the range [1,31]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) pipedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) mockPrintStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (DataOutput) dataOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) pipedOutputStream0);
      try { 
        dateTimeZoneBuilder0.writeTo("Fixing duplicate name key - ", (DataOutput) dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) pipedOutputStream0);
      try { 
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, 1013L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("", 10, 10, 1011, 's', 10, (-2614), 2538, true, 10);
      // Undeclared exception!
      dateTimeZoneBuilder0.toDateTimeZone("dn8F2n/0`lGRXy#:o", true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readMillis((DataInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) pushbackInputStream0);
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 3046, (-1269));
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
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
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) null, "NoLimit");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream((InputStream) byteArrayInputStream0, (InputStream) byteArrayInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) sequenceInputStream0, (int) (byte)4);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) bufferedInputStream0, "org.joda.time.DateTimeFieldType");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) null, "Ew`lS");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2175), 34);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "String pool is too large");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2175
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 80, (int) (byte) (-79));
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
  public void test22()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings(".A$X5V;", 99, 99, 99, 'x', 93, 93, 1854, true, 26);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: x
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo(" \t", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("", 10, 10, 83, 's', 10, 10, 2538, false, 10);
      MockPrintStream mockPrintStream0 = new MockPrintStream(" - ");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      dateTimeZoneBuilder1.writeTo("FdBLki`rh&YvF*VJ", (DataOutput) objectOutputStream0);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone((String) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(703, '!', 703, 703, 703, true, 783);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("2147483648", (-1550));
      MockFile mockFile0 = new MockFile("2147483648");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      dateTimeZoneBuilder1.writeTo("2147483648", (OutputStream) mockPrintStream0);
      assertEquals(23L, mockFile0.length());
      
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("2147483648");
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) mockFileInputStream0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "Invalid encoding");
      assertEquals("Invalid encoding", fixedDateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-837), 3133);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream((InputStream) byteArrayInputStream0, (InputStream) byteArrayInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) sequenceInputStream0, 661);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) pushbackInputStream0, "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -837
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(lenientChronology0, cachedDateTimeZone0);
      DateTime dateTime0 = DateTime.now((DateTimeZone) cachedDateTimeZone0);
      DateTime dateTime1 = dateTime0.withYearOfEra(274);
      Period period0 = new Period((ReadableInstant) dateTime1, (ReadableInstant) dateTime0);
      long long0 = zonedChronology0.add((ReadablePeriod) period0, 1800000L, (-1059));
      assertEquals((-58149894551961000L), long0);
      assertEquals((-53516688479680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      Locale locale0 = Locale.CHINESE;
      String string0 = cachedDateTimeZone0.getShortName(1303L, locale0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      String string0 = cachedDateTimeZone0.getName((-9223372036854775796L));
      assertEquals("+00:09:21", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("", 10, 10, 83, 's', 10, 10, 2538, false, 10);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings("dn8F2n/`lRXy#:o", 's');
      MockPrintStream mockPrintStream0 = new MockPrintStream("YearWeekDayTime");
      dateTimeZoneBuilder2.writeTo("FdBLki`rh&YvF*VJ", (OutputStream) mockPrintStream0);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      DateTime dateTime0 = DateTime.now((DateTimeZone) cachedDateTimeZone0);
      int int0 = cachedDateTimeZone0.getOffset((ReadableInstant) dateTime0);
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("", 10, 10, 83, 's', 10, 83, 2538, true, 10);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("$O~-W%,?", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 83 for dayOfMonth must be in the range [1,31]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("", 4063);
      dateTimeZoneBuilder1.addCutover(4063, 's', 7, 10, 7, true, 1342);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder1.toDateTimeZone("H", false);
      assertTrue(fixedDateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("u:!_8+fZh", 1524);
      dateTimeZoneBuilder1.addCutover((-2273), 'u', 32, (-1269), (-1269), true, (-974));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone(" - ", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 32 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("Types array must not contain null", (-2147483647), (-2147483647), (-2147483647), 'w', (-2147483647), (-2147483647), 4099, false, 4099);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("", 10, 10, 10, 's', 10, 10, 2538, false, 10);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder0.toDateTimeZone("dn8F2n/`lRXy#:o", false);
      assertEquals("dn8F2n/`lRXy#:o", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (OutputStream) dataOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("", (-5), 1751, (-5), '3', 1751, (-5), (-2285), true, 96);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("UTC", 251);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder0.toDateTimeZone("UTC", true);
      assertTrue(fixedDateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder0.toDateTimeZone("UTC", true);
      assertEquals("UTC", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 1000000000000000L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) byteArrayOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 60000L);
      assertEquals(4, byteArrayOutputStream0.size());
      assertEquals("@\u0000\u0000\u0001", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("", 10, 10, 83, 's', 10, 10, 2538, false, 10);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(10);
      MockPrintStream mockPrintStream0 = new MockPrintStream(" - ");
      dateTimeZoneBuilder1.writeTo("FdBLki`rh&YvF*VJ", (OutputStream) mockPrintStream0);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("2147483648", (-1550));
      MockFile mockFile0 = new MockFile("2147483648");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      dateTimeZoneBuilder1.writeTo("2147483648", (OutputStream) mockPrintStream0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("2147483648");
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) mockFileInputStream0);
      byte[] byteArray0 = new byte[5];
      dataInputStream0.readFully(byteArray0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "Invalid encoding");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockFile mockFile0 = new MockFile("2147483648");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("2147483648");
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) mockFileInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, "");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      boolean boolean0 = cachedDateTimeZone0.isStandardOffset(9223310204521975818L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      String string0 = cachedDateTimeZone0.getName(9223372036854775807L);
      assertEquals("+02:00", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      boolean boolean0 = cachedDateTimeZone0.isFixed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(1);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.addCutover(1, 'A', 1970, 1, 'A', true, 'A');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: A
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("|", 0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder0.toDateTimeZone("UTC", true);
      assertEquals("UTC", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      DateTime dateTime0 = DateTime.now((DateTimeZone) cachedDateTimeZone0);
      dateTime0.plusMonths(77);
  }
}
