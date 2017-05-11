/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 21 00:07:21 GMT 2017
 */

package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.FirstMoment;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Mean_ESTest extends Mean_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = 48.24337377143675;
      double double0 = mean0.evaluate(doubleArray0, doubleArray0);
      assertEquals(48.24337377143675, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1572.8950185770145);
      doubleArray0[2] = (-1.0);
      double double0 = mean0.evaluate(doubleArray0);
      assertEquals((-262.3158364295024), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[5];
      mean0.incrementAll(doubleArray0);
      double double0 = mean0.getResult();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (-413.875);
      mean0.incrementAll(doubleArray0);
      double double0 = mean0.getResult();
      assertEquals(4L, mean0.getN());
      assertEquals((-103.46875), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Mean mean0 = new Mean();
      long long0 = mean0.getN();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Mean mean0 = new Mean();
      mean0.increment((-588.0));
      long long0 = mean0.getN();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 432.10536492178096;
      double[] doubleArray1 = new double[2];
      double double0 = mean0.evaluate(doubleArray1, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (-2128.444948);
      double double0 = mean0.evaluate(doubleArray0, 1, 1);
      assertEquals((-2128.444948), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[5];
      mean0.incrementAll(doubleArray0);
      mean0.copy();
      assertEquals(0.0, mean0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Mean mean0 = new Mean();
      mean0.moment = null;
      // Undeclared exception!
      try { 
        mean0.increment(3029.431422896148);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Mean", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      // Undeclared exception!
      try { 
        mean0.getResult();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Mean", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        mean0.evaluate(doubleArray0, doubleArray0, 1, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weigth array must contain at least one non-zero value
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[4];
      // Undeclared exception!
      try { 
        mean0.evaluate(doubleArray1, doubleArray0, (-743), (-743));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 4
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      // Undeclared exception!
      try { 
        mean0.evaluate((double[]) null, (double[]) null, 149, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        mean0.evaluate((double[]) null, doubleArray0, 1, 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        mean0.evaluate(doubleArray0, doubleArray0, 2064, 353);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2064
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[2];
      // Undeclared exception!
      try { 
        mean0.evaluate(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 9
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        mean0.evaluate(doubleArray0, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Mean mean0 = new Mean();
      // Undeclared exception!
      try { 
        mean0.evaluate((double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Mean", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        mean0.evaluate(doubleArray0, 1599, (-2809));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length (-2,809)
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        mean0.evaluate(doubleArray0, 0, 311);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // subarray ends after array end
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Mean mean0 = new Mean();
      // Undeclared exception!
      try { 
        mean0.evaluate((double[]) null, (-2516), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      // Undeclared exception!
      try { 
        Mean.copy(mean0, mean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Mean", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      // Undeclared exception!
      try { 
        mean0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Mean", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Mean mean0 = new Mean();
      mean0.moment = null;
      // Undeclared exception!
      try { 
        mean0.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Mean", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Mean mean0 = null;
      try {
        mean0 = new Mean((Mean) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Mean mean0 = new Mean();
      mean0.moment = null;
      Mean mean1 = null;
      try {
        mean1 = new Mean(mean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Mean", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      double[] doubleArray0 = new double[12];
      doubleArray0[4] = 0.00833675;
      double double0 = mean0.evaluate(doubleArray0, doubleArray0, 1, 4);
      assertEquals(0.00833675, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Mean mean0 = new Mean();
      mean0.increment((-588.0));
      mean0.copy();
      assertEquals(1L, mean0.getN());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      mean0.increment(0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Mean mean0 = new Mean();
      Mean.copy(mean0, mean0);
      assertEquals(0L, mean0.getN());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[8];
      double double0 = mean0.evaluate(doubleArray0, 1, 1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      double[] doubleArray0 = new double[4];
      double double0 = mean0.evaluate(doubleArray0, 0, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Mean mean0 = new Mean();
      mean0.clear();
      assertEquals(Double.NaN, mean0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      mean0.clear();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[2];
      Mean mean1 = new Mean(mean0);
      mean1.incMoment = false;
      mean1.incrementAll(doubleArray0);
      assertEquals(0L, mean1.getN());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        mean0.evaluate(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weigth array must contain at least one non-zero value
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      // Undeclared exception!
      try { 
        mean0.getN();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Mean", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Mean mean0 = new Mean();
      Mean mean1 = mean0.copy();
      assertNotSame(mean1, mean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Mean mean0 = new Mean();
      double double0 = mean0.getResult();
      assertEquals(Double.NaN, double0, 0.01);
  }
}
