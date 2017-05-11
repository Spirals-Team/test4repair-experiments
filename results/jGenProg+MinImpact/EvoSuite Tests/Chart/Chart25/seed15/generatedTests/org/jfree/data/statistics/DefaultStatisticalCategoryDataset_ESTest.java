/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 16 01:21:55 GMT 2017
 */

package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.jfree.data.Range;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Second;
import org.jfree.data.time.Week;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultStatisticalCategoryDataset_ESTest extends DefaultStatisticalCategoryDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add(1.0, 1.0, (Comparable) 546, (Comparable) 546);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue((Comparable) 546, (Comparable) 546);
      assertEquals(1.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((-6211.601421293), (-443.72), (Comparable) "ShortDescription", (Comparable) "ShortDescription");
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue((Comparable) "ShortDescription", (Comparable) "ShortDescription");
      assertEquals((-6211.601421293), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Integer integer0 = new Integer(0);
      Week week0 = new Week();
      defaultStatisticalCategoryDataset0.add((double) integer0, (double) integer0, (Comparable) week0, (Comparable) week0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue(0, 0);
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add(42.63286203219948, 42.63286203219948, (Comparable) month0, (Comparable) month0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) month0, (Comparable) month0);
      assertEquals(42.63286203219948, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add(0.0, 0.0, (Comparable) month0, (Comparable) month0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) month0, (Comparable) month0);
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 1497588338, (Number) 16, (Comparable) null, (Comparable) null);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getRowKey(0);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      defaultStatisticalCategoryDataset0.add((Number) 1852662636, (Number) 0, (Comparable) minute0, (Comparable) minute0);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getRowKey(0);
      assertNotNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add(0.0, 0.0, (Comparable) null, (Comparable) null);
      int int0 = defaultStatisticalCategoryDataset0.getRowIndex((Comparable) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Week week0 = new Week();
      defaultStatisticalCategoryDataset0.add((-1.7976931348623157E308), (-1.7976931348623157E308), (Comparable) week0, (Comparable) week0);
      defaultStatisticalCategoryDataset0.add(0.0, 0.0, (Comparable) null, (Comparable) null);
      int int0 = defaultStatisticalCategoryDataset0.getRowIndex((Comparable) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add(0.0, 0.0, (Comparable) month0, (Comparable) month0);
      int int0 = defaultStatisticalCategoryDataset0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) null, (Comparable) null, (Comparable) null);
      double double0 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(2842L);
      Minute minute0 = new Minute((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add((-384.045696671646), (-3224.061533813981), (Comparable) minute0, (Comparable) mockDate0);
      double double0 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
      assertEquals((-384.045696671646), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) null, (Comparable) null, (Comparable) null);
      double double0 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((-1.7976931348623157E308), 2063.22058028051, (Comparable) null, (Comparable) null);
      double double0 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(0, 1276, 0);
      Second second0 = new Second((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add((Number) 3, (Number) (byte)15, (Comparable) second0, (Comparable) second0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertEquals(3.0, range0.getCentralValue(), 0.01);
      assertNotNull(range0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add(42.63286203219948, 42.63286203219948, (Comparable) month0, (Comparable) month0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
      assertNotNull(range0);
      assertEquals(0.0, range0.getLowerBound(), 0.01);
      assertEquals(42.63286203219948, range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add((-6.183945168678186), (-6.183945168678186), (Comparable) month0, (Comparable) month0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertNotNull(range0);
      assertEquals((-6.183945168678186), range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add(0.0, 0.0, (Comparable) month0, (Comparable) month0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) month0, (Comparable) month0);
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add(1.0, 1.0, (Comparable) 546, (Comparable) 546);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) 546, (Comparable) 546);
      assertEquals(1.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add(1744.42407, 1744.42407, (Comparable) 583, (Comparable) 583);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) 583, (Comparable) 583);
      assertEquals(1744.42407, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Integer integer0 = new Integer(0);
      Week week0 = new Week();
      defaultStatisticalCategoryDataset0.add((double) integer0, (double) integer0, (Comparable) week0, (Comparable) week0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add(0.0, 0.0, (Comparable) null, (Comparable) null);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getColumnKey(0);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((-0.7025058418833234), (-0.7025058418833234), (Comparable) 546, (Comparable) 546);
      int int0 = defaultStatisticalCategoryDataset0.getColumnIndex(546);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((-6211.601421293), (-443.72), (Comparable) "ShortDescription", (Comparable) "ShortDescription");
      int int0 = defaultStatisticalCategoryDataset0.getColumnCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add(0.5, 0.5, (Comparable) null, (Comparable) null);
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
  public void test25()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getValue(61, 61);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 61, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getValue((-11), (-781));
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
      defaultStatisticalCategoryDataset0.add((double) 0, Double.NaN, (Comparable) null, (Comparable) null);
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
        defaultStatisticalCategoryDataset0.getStdDevValue(53, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 53, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getStdDevValue((-890), (-890));
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
        defaultStatisticalCategoryDataset0.getRowKey((-410));
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
      defaultStatisticalCategoryDataset0.add(769.4125, (-1387.407763222147), (Comparable) null, (Comparable) null);
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
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getMeanValue((-649), (-649));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getColumnKey((-499));
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
      MockDate mockDate0 = new MockDate(0, 1276, 0);
      Second second0 = new Second((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 0, (Comparable) second0, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.add((Number) 3, (Number) (byte)15, (Comparable) second0, (Comparable) second0);
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
      defaultStatisticalCategoryDataset0.add((-1.7976931348623157E308), 2063.22058028051, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.add((double) 1, (-1.7976931348623157E308), (Comparable) null, (Comparable) null);
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
      Week week0 = new Week();
      MockGregorianCalendar mockGregorianCalendar0 = (MockGregorianCalendar)MockCalendar.getInstance(week0.DEFAULT_TIME_ZONE);
      defaultStatisticalCategoryDataset0.add(Double.NaN, Double.NaN, (Comparable) week0, (Comparable) week0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue(0, 0);
      defaultStatisticalCategoryDataset0.add((Number) double0, (Number) 1, (Comparable) mockGregorianCalendar0, (Comparable) double0);
      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Number number0 = defaultStatisticalCategoryDataset0.getMeanValue((Comparable) null, (Comparable) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Week week0 = new Week();
      defaultStatisticalCategoryDataset0.add(1.15, 1.15, (Comparable) week0, (Comparable) week0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertNotNull(double0);
      assertEquals(1.15, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset1 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(2842L);
      Minute minute0 = new Minute((Date) mockDate0);
      defaultStatisticalCategoryDataset1.add((-384.045696671646), (-3224.061533813981), (Comparable) minute0, (Comparable) mockDate0);
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset1);
      assertFalse(defaultStatisticalCategoryDataset1.equals((Object)defaultStatisticalCategoryDataset0));
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
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals("mo+42=KnRPqOWHj;");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add(0.0, 0.0, (Comparable) month0, (Comparable) month0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertNotNull(range0);
      assertEquals(0.0, range0.getUpperBound(), 0.01);
      assertEquals(0.0, range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add((-0.7100849130677414), (-0.7100849130677414), (Comparable) month0, (Comparable) month0);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getRangeBounds(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-1.4201698261354827).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      defaultStatisticalCategoryDataset0.add((Number) 1852662636, (Number) 0, (Comparable) minute0, (Comparable) minute0);
      defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 59, (Comparable) minute0, (Comparable) "Year outside valid range.");
      assertEquals(1392409281320L, minute0.getFirstMillisecond());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add(0.0, 0.0, (Comparable) month0, (Comparable) month0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue((Comparable) month0, (Comparable) month0);
      defaultStatisticalCategoryDataset0.add((Number) double0, (Number) double0, (Comparable) month0, (Comparable) 1);
      assertEquals(1392409281320L, month0.getLastMillisecond());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Week week0 = new Week();
      defaultStatisticalCategoryDataset0.add(Double.NaN, Double.NaN, (Comparable) week0, (Comparable) week0);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getColumnKey(0);
      assertNotNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(2842L);
      Minute minute0 = new Minute((Date) mockDate0);
      defaultStatisticalCategoryDataset0.add((-384.045696671646), (-3224.061533813981), (Comparable) minute0, (Comparable) mockDate0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) minute0, (Comparable) mockDate0);
      assertNotNull(double0);
      assertEquals((-3224.061533813981), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate(2842L);
      Minute minute0 = new Minute((Date) mockDate0);
      Number number0 = defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) minute0, (Comparable) mockDate0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) null, (Comparable) null, (Comparable) null);
      Double double0 = new Double((double) 1);
      defaultStatisticalCategoryDataset0.add((Number) double0, (Number) double0, (Comparable) "*Ku-beQK", (Comparable) null);
      Number number0 = defaultStatisticalCategoryDataset0.getStdDevValue(1, 0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((-0.7025058418833234), (-0.7025058418833234), (Comparable) 546, (Comparable) 546);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) 546, (Comparable) 546);
      assertEquals((-0.7025058418833234), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      double double0 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
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
  public void test57()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      double double0 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      List list0 = defaultStatisticalCategoryDataset0.getColumnKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getColumnKey(546);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 546, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      List list0 = defaultStatisticalCategoryDataset0.getRowKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      int int0 = defaultStatisticalCategoryDataset0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      int int0 = defaultStatisticalCategoryDataset0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Week week0 = new Week();
      defaultStatisticalCategoryDataset0.add(1.15, 1.15, (Comparable) week0, (Comparable) week0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue(0, 0);
      Number number0 = defaultStatisticalCategoryDataset0.getValue((Comparable) "mo+42=KnRPqOWHj;", (Comparable) double0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      int int0 = defaultStatisticalCategoryDataset0.getColumnIndex(546);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      int int0 = defaultStatisticalCategoryDataset0.getRowIndex((Comparable) null);
      assertEquals((-1), int0);
  }
}
