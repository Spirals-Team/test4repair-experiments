/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 20 14:40:15 GMT 2017
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
      doubleArray0[0] = (-1.6195919296710175);
      double double0 = mean0.evaluate(doubleArray0);
      assertEquals((-0.5398639765570059), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Mean mean0 = new Mean();
      Mean mean1 = new Mean(mean0);
      assertEquals(Double.NaN, mean1.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Mean mean0 = new Mean();
      mean0.increment(0.0);
      double double0 = mean0.getResult();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Mean mean0 = new Mean();
      mean0.increment((-2562.08365646795));
      double double0 = mean0.getResult();
      assertEquals(1L, mean0.getN());
      assertEquals((-2562.08365646795), double0, 0.01);
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
      mean0.increment(0.0);
      long long0 = mean0.getN();
      assertEquals(0.0, mean0.getResult(), 0.01);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = (-40.75402513452138);
      double double0 = mean0.evaluate(doubleArray0, 2, 1);
      assertEquals((-40.75402513452138), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Mean mean0 = new Mean();
      mean0.increment((-2562.08365646795));
      mean0.copy();
      assertEquals((-2562.08365646795), mean0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      mean0.incMoment = true;
      // Undeclared exception!
      try { 
        mean0.increment(0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Mean", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        mean0.evaluate(doubleArray0, doubleArray0, (-1), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weigth array must contain at least one non-zero value
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Mean mean0 = new Mean((FirstMoment) null);
      double[] doubleArray1 = new double[2];
      // Undeclared exception!
      try { 
        mean0.evaluate(doubleArray0, doubleArray1, 13, 2277);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 1
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Mean mean0 = new Mean();
      // Undeclared exception!
      try { 
        mean0.evaluate((double[]) null, (double[]) null, 1, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        mean0.evaluate((double[]) null, doubleArray0, 12, 1460);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        mean0.evaluate(doubleArray0, doubleArray0, 1, 1477);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[9];
      // Undeclared exception!
      try { 
        mean0.evaluate(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 9 != 0
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[3];
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
  public void test17()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        mean0.evaluate(doubleArray0, (-2411), (-2411));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // start position (-2,411)
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        mean0.evaluate(doubleArray0, 1, 212);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // subarray ends after array end
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Mean mean0 = new Mean();
      // Undeclared exception!
      try { 
        mean0.evaluate((double[]) null, 2084, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      try { 
        Mean.copy((Mean) null, (Mean) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Mean mean0 = new Mean();
      mean0.moment = null;
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
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 3.0E-6;
      double double0 = mean0.evaluate(doubleArray0, doubleArray0, 1, 1);
      assertEquals(3.0E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Mean mean0 = new Mean();
      Mean.copy(mean0, mean0);
      assertEquals(Double.NaN, mean0.getResult(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      Mean mean0 = new Mean();
      double double0 = mean0.getResult();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 139.56764048882732;
      double double0 = mean0.evaluate(doubleArray0, doubleArray0);
      assertEquals(139.56764048882732, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[3];
      double double0 = mean0.evaluate(doubleArray0, 1, 1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[3];
      double double0 = mean0.evaluate(doubleArray0, 0, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Mean mean0 = new Mean();
      mean0.clear();
      assertEquals(0L, mean0.getN());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      mean0.clear();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Mean mean0 = new Mean();
      mean0.increment(0.0);
      mean0.copy();
      assertEquals(1L, mean0.getN());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Mean mean0 = new Mean((FirstMoment) null);
      mean0.increment(0.0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Mean mean0 = new Mean();
      double[] doubleArray0 = new double[5];
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
  public void test38()  throws Throwable  {
      Mean mean0 = new Mean();
      Mean mean1 = mean0.copy();
      assertNotSame(mean1, mean0);
  }
}
