/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 18 20:45:59 GMT 2017
 */

package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.jfree.data.Range;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.Second;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.SpreadsheetDate;
import org.jfree.data.time.Week;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultStatisticalCategoryDataset_ESTest extends DefaultStatisticalCategoryDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(999, 563, (-2181), 563, 563);
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 0, (Comparable) mockDate0, (Comparable) mockDate0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getValue((Comparable) mockDate0, (Comparable) mockDate0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 13, (Number) 15, (Comparable) "DKw)Y", (Comparable) "DKw)Y");
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getValue((Comparable) "DKw)Y", (Comparable) "DKw)Y");
      assertEquals(13, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(7L, 286L);
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) null, (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Number number0 = defaultStatisticalCategoryDataset0.getValue(0, 0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 1886597747, (Comparable) date0, (Comparable) date0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getValue(0, 0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      defaultStatisticalCategoryDataset0.add((Number) 2, (Number) 1886597747, (Comparable) date0, (Comparable) date0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getValue(0, 0);
      assertEquals(2, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(999, (-1), (-2181), 0, 0);
      Minute minute0 = new Minute((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add((-1.0), (-1.0), (Comparable) minute0, (Comparable) mockDate0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue(0, 0);
      assertEquals((-1.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Short short0 = new Short((short)0);
      defaultStatisticalCategoryDataset0.add((Number) (byte)12, (Number) short0, (Comparable) short0, (Comparable) short0);
      Short short1 = (Short)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) short0, (Comparable) short0);
      assertEquals((short)0, (short)short1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(999, 563, (-2181), 0, 0);
      Minute minute0 = new Minute((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add((-1.0), (-1.0), (Comparable) minute0, (Comparable) mockDate0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) minute0, (Comparable) mockDate0);
      assertEquals((-1.0), (double)double0, 0.01);
      assertNotNull(double0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((-1566.0186), 38.665122257, (Comparable) null, (Comparable) null);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getRowKey(0);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 13, (Number) 15, (Comparable) "DKw)Y", (Comparable) "DKw)Y");
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getRowKey(0);
      assertEquals("DKw)Y", comparable0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      defaultStatisticalCategoryDataset0.add((Number) 2, (Number) 1886597747, (Comparable) date0, (Comparable) date0);
      int int0 = defaultStatisticalCategoryDataset0.getRowIndex(date0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(999, 563, (-2181), 563, 563);
      Minute minute0 = new Minute((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add((-1.0), (-1.0), (Comparable) minute0, (Comparable) mockDate0);
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 0, (Comparable) mockDate0, (Comparable) mockDate0);
      int int0 = defaultStatisticalCategoryDataset0.getRowIndex(mockDate0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Second second0 = new Second();
      defaultStatisticalCategoryDataset0.add((Number) 1162038354, (Number) 84, (Comparable) second0, (Comparable) second0);
      int int0 = defaultStatisticalCategoryDataset0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(999, 563, (-2181), 0, 0);
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 0, (Comparable) mockDate0, (Comparable) mockDate0);
      double double0 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(999, 563, (-2181), 0, 0);
      Minute minute0 = new Minute((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add((-1.0), (-1.0), (Comparable) minute0, (Comparable) mockDate0);
      double double0 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 1886597747, (Comparable) date0, (Comparable) date0);
      double double0 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(999, 563, (-2181), 0, 0);
      Minute minute0 = new Minute((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add((-1.0), (-1.0), (Comparable) minute0, (Comparable) mockDate0);
      double double0 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) (byte)125, (Number) null, (Comparable) "", (Comparable) "");
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
      assertEquals(125.0, range0.getCentralValue(), 0.01);
      assertEquals(125.0, range0.getUpperBound(), 0.01);
      assertNotNull(range0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      defaultStatisticalCategoryDataset0.add((Number) 2, (Number) 1886597747, (Comparable) date0, (Comparable) date0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
      assertNotNull(range0);
      assertEquals((-1.886597745E9), range0.getLowerBound(), 0.01);
      assertEquals(3.773195494E9, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(999, 563, (-2181), 0, 0);
      Minute minute0 = new Minute((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add((-1.0), (-1.0), (Comparable) minute0, (Comparable) mockDate0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertNotNull(range0);
      assertEquals((-1.0), range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Week week0 = new Week();
      defaultStatisticalCategoryDataset0.add(1133.7308125, 1133.7308125, (Comparable) week0, (Comparable) week0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) week0, (Comparable) week0);
      assertEquals(1133.7308125, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(45);
      defaultStatisticalCategoryDataset0.add(0.010373932973872346, (-1919.090654077278), (Comparable) spreadsheetDate0, (Comparable) spreadsheetDate0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertEquals(0.010373932973872346, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate();
      defaultStatisticalCategoryDataset0.add((Number) (byte)118, (Number) (byte)113, (Comparable) mockDate0, (Comparable) mockDate0);
      Byte byte0 = (Byte)defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertEquals((byte)118, (byte)byte0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 11, (Number) 1936744803, (Comparable) null, (Comparable) null);
      int int0 = defaultStatisticalCategoryDataset0.getColumnIndex((Comparable) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(999, 563, (-2181), 0, 0);
      Minute minute0 = new Minute((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add((-1.0), (-1.0), (Comparable) minute0, (Comparable) mockDate0);
      int int0 = defaultStatisticalCategoryDataset0.getColumnCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((-1566.0186), 38.665122257, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getValue((Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getValue((-480), 324);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((double) (-1), 2176.991044, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getStdDevValue(31, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 31, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getStdDevValue((-755), (-755));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getRowKey((-2112));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Quarter quarter0 = new Quarter();
      defaultStatisticalCategoryDataset0.add((-429.2171), (-429.2171), (Comparable) quarter0, (Comparable) mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getRangeBounds(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-858.4342).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((-524.552742), (-524.552742), (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getMeanValue((Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getMeanValue(305, 305);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 305, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getMeanValue((-4135), (-4135));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getColumnKey((-160));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 11, (Number) 1936744803, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.add((Number) 1886610481, (Number) null, (Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 11, (Number) 1936744803, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.add((double) 11, 1919.1010280102519, (Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Long long0 = new Long(53L);
      defaultStatisticalCategoryDataset0.add((Number) long0, (Number) long0, (Comparable) long0, (Comparable) long0);
      defaultStatisticalCategoryDataset0.add((Number) long0, (Number) long0, (Comparable) long0, (Comparable) long0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Number number0 = defaultStatisticalCategoryDataset0.getMeanValue((Comparable) mockGregorianCalendar0, (Comparable) mockGregorianCalendar0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Second second0 = new Second();
      defaultStatisticalCategoryDataset0.add((Number) 1162038354, (Number) 1162038354, (Comparable) second0, (Comparable) second0);
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset1 = new DefaultStatisticalCategoryDataset();
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset1 = new DefaultStatisticalCategoryDataset();
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(date0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 1886597747, (Comparable) date0, (Comparable) date0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
      assertEquals(1.886597747E9, range0.getUpperBound(), 0.01);
      assertNotNull(range0);
      assertEquals(3.773195494E9, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Second second0 = new Second();
      defaultStatisticalCategoryDataset0.add((Number) 1162038354, (Number) 84, (Comparable) second0, (Comparable) second0);
      defaultStatisticalCategoryDataset0.add((Number) 11, (Number) 1936744803, (Comparable) null, (Comparable) null);
      int int0 = defaultStatisticalCategoryDataset0.getColumnIndex((Comparable) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 1886597747, (Comparable) date0, (Comparable) date0);
      Quarter quarter0 = new Quarter(date0);
      defaultStatisticalCategoryDataset0.add(1.0, (-2470.2382), (Comparable) quarter0, (Comparable) mockGregorianCalendar0);
      assertEquals(6332L, quarter0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Long long0 = new Long(53L);
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add(Double.NaN, (-518.39), (Comparable) long0, (Comparable) long0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) long0, (Comparable) long0);
      assertEquals(Double.NaN, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(7L, 286L);
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) null, (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertEquals(0.0, range0.getUpperBound(), 0.01);
      assertEquals(0.0, range0.getLowerBound(), 0.01);
      assertNotNull(range0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Week week0 = new Week();
      defaultStatisticalCategoryDataset0.add(1133.7308125, 1133.7308125, (Comparable) week0, (Comparable) week0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) week0, (Comparable) week0);
      assertEquals(1133.7308125, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(999, (-1), (-2181), 0, 0);
      Minute minute0 = new Minute((Date) mockDate0);
      Number number0 = defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) minute0, (Comparable) minute0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(45);
      defaultStatisticalCategoryDataset0.add((-1.0), (-1919.090654077278), (Comparable) spreadsheetDate0, (Comparable) spreadsheetDate0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) spreadsheetDate0, (Comparable) spreadsheetDate0);
      assertEquals((-1.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(45);
      defaultStatisticalCategoryDataset0.add((-1.0), (-1919.090654077278), (Comparable) spreadsheetDate0, (Comparable) spreadsheetDate0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertEquals((-1.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add(2153.3, (-1.0), (Comparable) null, (Comparable) null);
      Byte byte0 = (Byte)defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      double double0 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(999, 563, (-2181), 563, 563);
      Minute minute0 = new Minute((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add((-1.0), (-1.0), (Comparable) minute0, (Comparable) mockDate0);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getColumnKey(0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue((Comparable) minute0, (Comparable) comparable0);
      assertNotNull(double0);
      assertEquals((-1.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getRowKey(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      double double0 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      List list0 = defaultStatisticalCategoryDataset0.getColumnKeys();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getColumnKey(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getValue(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      List list0 = defaultStatisticalCategoryDataset0.getRowKeys();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      int int0 = defaultStatisticalCategoryDataset0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      int int0 = defaultStatisticalCategoryDataset0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(999, 563, (-2181), 563, 563);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getValue((Comparable) mockDate0, (Comparable) mockDate0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(45);
      int int0 = defaultStatisticalCategoryDataset0.getColumnIndex(spreadsheetDate0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(999, 563, (-2181), 563, 563);
      int int0 = defaultStatisticalCategoryDataset0.getRowIndex(mockDate0);
      assertEquals((-1), int0);
  }
}
