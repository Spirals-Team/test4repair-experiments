/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 19 22:35:32 GMT 2017
 */

package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormatSymbols;
import java.text.ParsePosition;
import java.util.Date;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.jfree.data.Range;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.statistics.SimpleHistogramBin;
import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Second;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultStatisticalCategoryDataset_ESTest extends DefaultStatisticalCategoryDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getStdDevValue(244, 30);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 244, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getValue(0, (-150));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Float float0 = new Float((double) 0);
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) float0, (Comparable) float0, (Comparable) float0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getValue((Comparable) float0, (Comparable) float0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-3299.8724), 17.0);
      defaultStatisticalCategoryDataset0.add((Number) (byte)113, (Number) (byte)8, (Comparable) simpleHistogramBin0, (Comparable) simpleHistogramBin0);
      Byte byte0 = (Byte)defaultStatisticalCategoryDataset0.getValue((Comparable) simpleHistogramBin0, (Comparable) simpleHistogramBin0);
      assertEquals((byte)113, (byte)byte0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Hour hour0 = new Hour();
      defaultStatisticalCategoryDataset0.add(1.7976931348623157E308, Double.NaN, (Comparable) hour0, (Comparable) hour0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue((Comparable) hour0, (Comparable) hour0);
      assertEquals(1.7976931348623157E308, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) 0, (Comparable) minute0, (Comparable) minute0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getValue(0, 0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Float float0 = new Float((double) 0);
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) float0, (Comparable) float0, (Comparable) float0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getValue(0, 0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      defaultStatisticalCategoryDataset0.add((Number) 59, (Number) null, (Comparable) minute0, (Comparable) minute0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getValue(0, 0);
      assertEquals(59, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      defaultStatisticalCategoryDataset0.add(1456.8087, (double) (-1), (Comparable) minute0, (Comparable) minute0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue(0, 0);
      assertEquals(1456.8087, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) 0, (Comparable) minute0, (Comparable) minute0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) minute0, (Comparable) minute0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      defaultStatisticalCategoryDataset0.add(1456.8087, (double) (-1), (Comparable) minute0, (Comparable) minute0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) minute0, (Comparable) minute0);
      assertEquals((-1.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Float float0 = new Float((double) 0);
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) float0, (Comparable) float0, (Comparable) float0);
      Float float1 = (Float)defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
      assertEquals(0.0F, (float)float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Second second0 = new Second();
      defaultStatisticalCategoryDataset0.add(Double.NaN, Double.NaN, (Comparable) second0, (Comparable) second0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
      assertEquals(Double.NaN, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add((double) 1001, (-2423.706), (Comparable) month0, (Comparable) month0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
      assertEquals((-2423.706), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 1001, (Number) null, (Comparable) null, (Comparable) null);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getRowKey(0);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      ParsePosition parsePosition0 = new ParsePosition(0);
      Date date0 = mockSimpleDateFormat0.parse("", parsePosition0);
      Millisecond millisecond0 = new Millisecond(date0);
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) null, (Comparable) millisecond0, (Comparable) millisecond0);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getRowKey(0);
      assertNotNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      defaultStatisticalCategoryDataset0.add((Number) 59, (Number) null, (Comparable) minute0, (Comparable) minute0);
      int int0 = defaultStatisticalCategoryDataset0.getRowIndex(minute0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      ParsePosition parsePosition0 = new ParsePosition(0);
      Date date0 = mockSimpleDateFormat0.parse("", parsePosition0);
      Millisecond millisecond0 = new Millisecond(date0);
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) null, (Comparable) millisecond0, (Comparable) millisecond0);
      int int0 = defaultStatisticalCategoryDataset0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 2, (Comparable) month0, (Comparable) month0);
      double double0 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 2, (Comparable) month0, (Comparable) month0);
      double double0 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((-2984.6), (-2984.6), (Comparable) "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", (Comparable) "org.jfree.data.statistics.DefaultStatisticalCategoryDataset");
      double double0 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
      assertEquals((-2984.6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) 0, (Comparable) minute0, (Comparable) minute0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
      assertNotNull(range0);
      assertEquals(0.0, range0.getLowerBound(), 0.01);
      assertEquals(0.0, range0.getCentralValue(), 0.01);
      assertEquals(0.0, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Day day0 = new Day();
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 14, (Comparable) day0, (Comparable) day0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
      assertNotNull(range0);
      assertEquals(0.0, range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) (-1), (Number) null, (Comparable) null, (Comparable) null);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertNotNull(range0);
      assertEquals((-1.0), range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((-2984.6), (-2984.6), (Comparable) "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", (Comparable) "org.jfree.data.statistics.DefaultStatisticalCategoryDataset");
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", (Comparable) "org.jfree.data.statistics.DefaultStatisticalCategoryDataset");
      assertEquals((-2984.6), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Float float0 = new Float((double) 52);
      defaultStatisticalCategoryDataset0.add((Number) 52, (Number) float0, (Comparable) float0, (Comparable) float0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) float0, (Comparable) float0);
      assertEquals(52, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Float float0 = new Float((double) 0);
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) float0, (Comparable) float0, (Comparable) float0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add(787.3826450493519, 787.3826450493519, (Comparable) month0, (Comparable) month0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertEquals(787.3826450493519, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) null, (Comparable) null, (Comparable) null);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getColumnKey(0);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Integer integer0 = new Integer(1001);
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((double) 0, 2625.269372328974, (Comparable) null, (Comparable) integer0);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getColumnKey(0);
      assertEquals(1001, comparable0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      defaultStatisticalCategoryDataset0.add((Number) 59, (Number) null, (Comparable) minute0, (Comparable) minute0);
      int int0 = defaultStatisticalCategoryDataset0.getColumnIndex(minute0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add((Number) 4, (Number) 2, (Comparable) month0, (Comparable) month0);
      Month month1 = (Month)month0.next();
      defaultStatisticalCategoryDataset0.add(787.3826450493519, 787.3826450493519, (Comparable) month1, (Comparable) month1);
      int int0 = defaultStatisticalCategoryDataset0.getColumnIndex(month1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      defaultStatisticalCategoryDataset0.add((Number) 59, (Number) null, (Comparable) minute0, (Comparable) minute0);
      int int0 = defaultStatisticalCategoryDataset0.getColumnCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 1001, (Number) null, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getValue((Comparable) null, (Comparable) "VERTICAL_SCROLLBAR");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getValue((-1790), (-1790));
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
      defaultStatisticalCategoryDataset0.add((Number) 1001, (Number) null, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) null, (Comparable) "VERTICAL_SCROLLBAR");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getStdDevValue((-469), (-469));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getRowKey((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      defaultStatisticalCategoryDataset0.add(1456.8087, (double) (-1), (Comparable) minute0, (Comparable) minute0);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getRangeBounds(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (1457.8087) <= upper (1455.8087).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 1001, (Number) null, (Comparable) null, (Comparable) null);
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
  public void test40()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getMeanValue(1, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getMeanValue((-6), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getColumnKey((-2729));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 1001, (Number) null, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.add((Number) null, (Number) null, (Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 1001, (Number) null, (Comparable) null, (Comparable) null);
      Integer integer0 = new Integer(1001);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.add((double) 0, (-2829.4630683017), (Comparable) null, (Comparable) integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Float float0 = new Float((double) 0);
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) float0, (Comparable) float0, (Comparable) float0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) float0, (Comparable) float0);
      defaultStatisticalCategoryDataset0.add((Number) 4096, (Number) float0, (Comparable) float0, (Comparable) integer0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Number number0 = defaultStatisticalCategoryDataset0.getMeanValue((Comparable) "Fri Feb 14 20:21:21 GMT 2014", (Comparable) "Fri Feb 14 20:21:21 GMT 2014");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset1 = new DefaultStatisticalCategoryDataset();
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Hour hour0 = new Hour();
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(hour0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset1 = new DefaultStatisticalCategoryDataset();
      assertTrue(defaultStatisticalCategoryDataset1.equals((Object)defaultStatisticalCategoryDataset0));
      
      defaultStatisticalCategoryDataset0.add((Number) 1986618743, (Number) 1986618743, (Comparable) null, (Comparable) null);
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset1);
      assertFalse(defaultStatisticalCategoryDataset1.equals((Object)defaultStatisticalCategoryDataset0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add((double) 1001, (-2423.706), (Comparable) month0, (Comparable) month0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertNotNull(range0);
      assertEquals(1001.0, range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      defaultStatisticalCategoryDataset0.add((Number) 59, (Number) null, (Comparable) minute0, (Comparable) minute0);
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) 0, (Comparable) minute0, (Comparable) minute0);
      assertEquals(1392409281320L, minute0.getLastMillisecond());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) null, (Comparable) null, (Comparable) null);
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) null, (Comparable) "anchorSelectionPath", (Comparable) "anchorSelectionPath");
      int int0 = defaultStatisticalCategoryDataset0.getRowIndex("anchorSelectionPath");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 2, (Comparable) month0, (Comparable) month0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) month0, (Comparable) month0);
      assertEquals(2, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(59, 0, (-696), 1, (-1));
      Number number0 = defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) mockGregorianCalendar0, (Comparable) minute0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 2, (Comparable) month0, (Comparable) month0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
      assertEquals(2, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) null, (Comparable) null, (Comparable) null);
      Number number0 = defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add((double) 1001, (-2423.706), (Comparable) month0, (Comparable) month0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertEquals(1001.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 1001, (Number) null, (Comparable) null, (Comparable) null);
      Number number0 = defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      double double0 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Second second0 = new Second();
      defaultStatisticalCategoryDataset0.add(Double.NaN, Double.NaN, (Comparable) second0, (Comparable) second0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) second0, (Comparable) second0);
      defaultStatisticalCategoryDataset0.add((Number) double0, (Number) 0, (Comparable) second0, (Comparable) second0);
      assertEquals(59, Second.LAST_SECOND_IN_MINUTE);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
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
  public void test65()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      double double0 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      List list0 = defaultStatisticalCategoryDataset0.getColumnKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
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
  public void test68()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      List list0 = defaultStatisticalCategoryDataset0.getRowKeys();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      int int0 = defaultStatisticalCategoryDataset0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      int int0 = defaultStatisticalCategoryDataset0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Float float0 = new Float((double) 0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getValue((Comparable) float0, (Comparable) float0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      int int0 = defaultStatisticalCategoryDataset0.getColumnIndex(minute0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      int int0 = defaultStatisticalCategoryDataset0.getRowIndex("anchorSelectionPath");
      assertEquals((-1), int0);
  }
}
