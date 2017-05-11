/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 13:24:58 GMT 2017
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeZoneBuilder_ESTest extends DateTimeZoneBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(100);
      dateTimeZoneBuilder1.setFixedSavings("i_1B", (-2595));
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      dateTimeZoneBuilder0.writeTo("org.joda.time.Instant", (OutputStream) byteArrayOutputStream0);
      assertEquals(25, byteArrayOutputStream0.size());
      assertEquals("F\u0000\u0004i_1B\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFDA\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000d", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("", (-485), (-2595), 5, 'w', 5, (-1086), (-1086), false, 65);
      dateTimeZoneBuilder0.setFixedSavings("i_1B", (-2595));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("i_1B", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("", 0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.addCutover(1070, '~', 1070, 0, (-1989), true, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: ~
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(867);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(386, 'w', 867, (-2010), 386, true, 0);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.setFixedSavings(".J", 255);
      assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("", 120, 0, 0, 'C', 0, Integer.MAX_VALUE, 0, false, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: C
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("", (-485), (-2595), 5, 'w', 5, (-1086), (-1086), false, 65);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover((-2595), 'w', (-485), (-2595), (-2595), false, 65);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.addCutover(80, 'w', 1190, 1272, 80, true, 65);
      assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("LC,sn", "LC,sn");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      mockPrintStream0.append('\'');
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream((File) mockFile0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) mockFileInputStream0, 400);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) pushbackInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals((-45000000L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 30962843999979L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("LC,sn", "LC,sn");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream((File) mockFile0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) mockFileInputStream0, 400);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) pushbackInputStream0);
      dataInputStream0.readUnsignedShort();
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("LC,sn", "LC,sn");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      mockPrintStream0.append((CharSequence) "LC,sn");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream((File) mockFile0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) mockFileInputStream0, 400);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) pushbackInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(1, mockFileInputStream0.available());
      assertEquals(12343732980000L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("", (-485), (-2595), 100, 'w', 100, (-1086), (-1086), false, 65);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("org.joda.time.Instant", (OutputStream) byteArrayOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 100 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(16);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) byteArrayOutputStream0, 16);
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) bufferedOutputStream0, false);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (OutputStream) mockPrintStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("i_1B", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) pipedOutputStream0);
      try { 
        dateTimeZoneBuilder0.writeTo("Z+up(x<.cO5Q[S#8", (DataOutput) dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
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
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) mockFileInputStream0);
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)88, 72);
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
        DateTimeZoneBuilder.readFrom((InputStream) null, "org.joda.time.tz.DateTimeZoneBuilder$RuleSet");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)70, (int) (byte)70);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) null, "S7{{bLCr#IKh");
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
      MockFile mockFile0 = new MockFile("LC,sn", "LC,sn");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.writeTo("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone", (DataOutput) objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      MockFile mockFile0 = new MockFile("LC,sn", "LC,sn");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      mockPrintStream0.append((CharSequence) "LC,sn");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream((File) mockFile0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) mockFileInputStream0, 400);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) pushbackInputStream0);
      DateTimeZoneBuilder.readMillis(dataInputStream0);
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
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-3695), 68);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "C]:MDhuzJ$(7");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3695
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      int int0 = cachedDateTimeZone0.getOffsetFromLocal((-144057484797406L));
      assertEquals(561000, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      boolean boolean0 = cachedDateTimeZone0.isStandardOffset(8L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      int int0 = cachedDateTimeZone0.getOffsetFromLocal((-2246L));
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      String string0 = cachedDateTimeZone0.getNameKey(1073741823L);
      assertEquals("CET", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      String string0 = cachedDateTimeZone0.getName((-9223372036854775797L));
      assertEquals("+00:09:21", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("i_1B", (-485));
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover((-485), 'w', 5, 1272, (-485), true, 65);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("^q(txs]?tn?5X*");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockFileOutputStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder2.writeTo("i_1B", (DataOutput) objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1272 for dayOfMonth must be in the range [1,31]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("%fHgLI", (-485), (-2608), 5, 's', 5, (-1086), (-1086), true, 65);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("i_1B", (-2608), (-485), 5, 's', 5, (-1086), 65, true, (-1086));
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("^q(txs]?tn?5X*");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockFileOutputStream0);
      dateTimeZoneBuilder0.writeTo("i_1B", (DataOutput) objectOutputStream0);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      long long0 = cachedDateTimeZone0.convertLocalToUTC(7730941132800000L, false);
      assertEquals(7730941125600000L, long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("Fn*sIP0M?d'*a<#mqh!", (-485), (-485), 5, 'w', 5, 1960, 1960, false, 65);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("i_1B", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1960 for dayOfMonth must be in the range [1,31]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      int int0 = cachedDateTimeZone0.getOffsetFromLocal(9223372036854775805L);
      assertEquals(7200000, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("%fHgLI", (-485), (-2608), 5, 's', 5, (-1086), (-1086), true, 65);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(80, 's', (-485), 1272, 80, true, 65);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("^q(txs]?tn?5X*");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockFileOutputStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder2.writeTo("i_1B", (DataOutput) objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -485 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("", (-485), (-2595), 5, 'w', 5, (-1086), (-1086), false, 65);
      dateTimeZoneBuilder0.addCutover((-2595), 'u', 4803, Integer.MAX_VALUE, 5, true, 5);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("i_1B", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 4803 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo(" ", (OutputStream) dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(79, '<', 34, 3600000, 0, false, 255);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder1.toDateTimeZone(" - ", false);
      assertEquals(" - ", fixedDateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) pipedOutputStream0);
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
  public void test40()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("i_1B", (-485), (-485), (-2595), 's', 1272, (-1), (-485), true, 's');
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("Yhg_e8:~HWlk/DBU$|+", 75);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder1.toDateTimeZone("UTC", false);
      assertTrue(fixedDateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder0.toDateTimeZone("UTC", false);
      assertTrue(fixedDateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(65);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) pipedOutputStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 2147483648000L);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("O.!gz(~r:x1=%t", false);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) mockFileOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 7730974198800000L);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 30962844000000L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockFile mockFile0 = new MockFile("=Kf)E0a", "=Kf)E0a");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream((File) mockFile0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) mockFileInputStream0, 400);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) pushbackInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "");
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
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) pipedInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, "Unknown mode: ");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      boolean boolean0 = cachedDateTimeZone0.isStandardOffset(1414285200000L);
      assertTrue(boolean0);
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
      dateTimeZoneBuilder0.addRecurringSavings("LC,sn", (-485), (-2595), 5, 's', 5, (-1), (-1), true, 65);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("^q(txs]?tn?5X*");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockFileOutputStream0);
      // Undeclared exception!
      dateTimeZoneBuilder0.writeTo("i_1B", (DataOutput) objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      int int0 = cachedDateTimeZone0.getOffsetFromLocal(9223227615021175868L);
      assertEquals(3600000, int0);
  }
}
