/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 25 17:12:42 GMT 2017
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
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeZoneBuilder_ESTest extends DateTimeZoneBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      Locale locale0 = Locale.GERMANY;
      String string0 = cachedDateTimeZone0.getName(196819200000L, locale0);
      assertEquals("+02:00", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings((String) null, 577, 577, 577, 's', 577, 577, 577, false, 577);
      dateTimeZoneBuilder1.setFixedSavings("PTV(GOZPe:PB", (-2784));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("{8j'wC=d-", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 577 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings((String) null, 577, 577, 577, 's', 577, 577, 577, false, 577);
      dateTimeZoneBuilder1.setStandardOffset(577);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("K6smH;6y<JZ_nWeTf~", (DataOutput) objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 577 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(695, '|', 160, 160, 160, false, 695);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.addCutover(58, '|', 160, 1026, 160, false, 1026);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: |
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings((String) null, 577);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(577, 's', 's', 2837, 's', false, 's');
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setStandardOffset((-1876));
      assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addCutover(4, '^', 4, 4, 789, true, 0);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(0, 's', 789, 58, 0, false, 0);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(0, 's', 0, 41, 789, false, 1874);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-2622));
      MockFile mockFile0 = new MockFile("pFA");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      dateTimeZoneBuilder1.setFixedSavings("3Kl^tnfVZ", 8);
      dateTimeZoneBuilder1.writeTo("pFA", (OutputStream) mockPrintStream0);
      assertEquals(30L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("pFA");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      dateTimeZoneBuilder0.writeTo("JZ%w bbdXeBed.m7Yv", (DataOutput) objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)12;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, 74);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(21600000L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings((String) null, 577, 577, 577, 's', 577, 577, 577, true, 577);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("v", (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 577 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("Invalid pattern specification", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        dateTimeZoneBuilder0.writeTo("B/skv;t", (OutputStream) pipedOutputStream0);
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
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("UTC");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream((File) mockFile0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) mockFileOutputStream0);
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
  public void test13()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) pipedOutputStream0);
      try { 
        dateTimeZoneBuilder0.writeTo("qf~9$>WI", (DataOutput) dataOutputStream0);
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
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, 63158400000L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1077), 96);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1077
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null, 2003);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) bufferedInputStream0);
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 84, (int) (byte) (-52));
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
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte) (-126), 3145);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, (String) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -126
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2622), 8);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "--05-06");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2622
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      dataInputStream0.skipBytes((byte)9);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("V*o*L5U!qSZX@aLX-", 2007, 0, 2050, 'G', 'G', 1405, 0, true, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: G
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("(a.3y#]|", (DataOutput) dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-2622));
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder1.toDateTimeZone("qR}W}Bdl||T", true);
      assertEquals("qR}W}Bdl||T", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = MutableDateTime.now((DateTimeZone) cachedDateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) cachedDateTimeZone0, (ReadableInstant) mutableDateTime0, 5);
      DateTimeZone dateTimeZone0 = cachedDateTimeZone0.getUncachedZone();
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone(dateTimeZone0);
      assertNotSame(gJChronology0, gJChronology1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = new MutableDateTime((DateTimeZone) cachedDateTimeZone0);
      mutableDateTime0.setWeekyear(66);
      mutableDateTime0.addWeeks(1);
      assertEquals((-60079459679680L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = MutableDateTime.now((DateTimeZone) cachedDateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) cachedDateTimeZone0, (ReadableInstant) mutableDateTime0, 5);
      long long0 = gJChronology0.getDateTimeMillis((-331L), 0, 4, 4, 4);
      assertEquals((-3355996L), long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      int int0 = cachedDateTimeZone0.getStandardOffset(63158400000L);
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forID((String) null);
      boolean boolean0 = cachedDateTimeZone0.isStandardOffset((-9223372036854214808L));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      String string0 = cachedDateTimeZone0.getName(8L);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forID((String) null);
      String string0 = cachedDateTimeZone0.getShortName((-9223372036854214808L));
      assertEquals("+00:09:21", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forID((String) null);
      int int0 = cachedDateTimeZone0.getOffset((ReadableInstant) null);
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = new MutableDateTime((DateTimeZone) cachedDateTimeZone0);
      mutableDateTime0.addWeeks(1);
      assertEquals(1393014081320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("YK`l4U5j^tLs", 1829);
      dateTimeZoneBuilder1.addCutover(1829, 'w', 3316, 263, 3316, true, 3316);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("qf~9$>WI", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 3316 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("YK`l4U5j^tLs", 1829);
      dateTimeZoneBuilder1.addCutover(1829, 's', 3311, 263, 3311, true, 3311);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("qf~9$>WI", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 3311 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(0, 'G', 0, 0, 0, true, 2007);
      MockFile mockFile0 = new MockFile("]p@3z4");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream((File) mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockFileOutputStream0);
      dateTimeZoneBuilder0.writeTo("V*o*L5U!qSZX@aLX-", (OutputStream) objectOutputStream0);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) byteArrayOutputStream0);
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
  public void test41()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("inz;Wpq", 2780, 155, 8, '4', 32, 2441, 32, false, 32);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("4\"|x", 0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder1.toDateTimeZone("UTC", false);
      assertEquals("UTC", fixedDateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder0.toDateTimeZone("UTC", false);
      assertEquals("UTC", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MockFile mockFile0 = new MockFile("]p@3z4");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream((File) mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockFileOutputStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 1000L);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) pipedOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, (-9223372030863600000L));
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) pipedInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "e2gm?QvY40>X{cu");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockFile mockFile0 = new MockFile("pFA");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) mockPrintStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, (-766623600000L));
      assertEquals(4L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("pFA");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      dateTimeZoneBuilder0.setFixedSavings("3Kl^tnfVZ", 8);
      dateTimeZoneBuilder0.writeTo("pFA", (OutputStream) mockPrintStream0);
      assertEquals(22L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)70;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, ",");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, ",");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) pipedInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, "LetterS: ");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      int int0 = cachedDateTimeZone0.getStandardOffset(1393014081320L);
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forID((String) null);
      String string0 = cachedDateTimeZone0.getNameKey(9223372036854775807L);
      assertEquals("CEST", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forID((String) null);
      int int0 = cachedDateTimeZone0.getOffsetFromLocal(9223372036854775807L);
      assertEquals(7200000, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 1, (Chronology) buddhistChronology0);
  }
}
