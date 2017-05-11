/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 25 10:42:23 GMT 2017
 */

package org.apache.commons.math.stat.regression;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.regression.SimpleRegression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleRegression_ESTest extends SimpleRegression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval((-2171.53889));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval(2451.56206);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(0.9999999999999971, 0.0);
      simpleRegression0.addData(0.0, 0.0);
      double double0 = simpleRegression0.predict((-2780.6152656175154));
      assertEquals(2L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[5][6];
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (-1402.403);
      doubleArray1[1] = 3823.0;
      doubleArray0[1] = doubleArray1;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.predict(1471.2147117774475);
      assertEquals(5L, simpleRegression0.getN());
      assertEquals((-4010.5831512947284), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[3][1];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (-1.0);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[4];
      doubleArray0[1] = doubleArray2;
      doubleArray0[2] = doubleArray0[1];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSumSquaredErrors();
      assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1422195.4084904473, (-860.0));
      simpleRegression0.addData((-1.0), (-1.0));
      double double0 = simpleRegression0.getSumSquaredErrors();
      assertEquals(368940.5, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals((-5.820766091346741E-11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[3][1];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (-1.0);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[4];
      doubleArray0[1] = doubleArray2;
      doubleArray0[2] = doubleArray0[1];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSlopeStdErr();
      assertEquals(3L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(6060847.336512, 2426.454071366262);
      simpleRegression0.addData(3025.4119221, 6060847.336512);
      simpleRegression0.addData(2426.454071366262, 2426.454071366262);
      double double0 = simpleRegression0.getSlopeConfidenceInterval(0.8661110222516145);
      assertEquals(3L, simpleRegression0.getN());
      assertEquals(0.18488778853911889, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[10][7];
      simpleRegression0.addData(392.90091267, 392.90091267);
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSlopeConfidenceInterval();
      assertEquals(0.0, simpleRegression0.getMeanSquareError(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[12][9];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSlopeConfidenceInterval();
      assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1656.39573, (-1210.367148011857));
      simpleRegression0.addData(0.0, 0.0);
      double double0 = simpleRegression0.getSlope();
      assertEquals(0.0, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals((-0.7307234171702779), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[1][9];
      simpleRegression0.addData(doubleArray0);
      simpleRegression0.addData(1074.4004, 945.0);
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSignificance();
      assertEquals(595350.0, simpleRegression0.getRegressionSumSquares(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[12][9];
      simpleRegression0.addData(doubleArray0);
      simpleRegression0.getSignificance();
      assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[3][1];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.9999999999999971;
      doubleArray1[1] = 0.9999999999999971;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[2];
      doubleArray2[0] = 0.9999999999999971;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[4];
      doubleArray3[1] = 0.9999999999999971;
      doubleArray0[2] = doubleArray3;
      simpleRegression0.addData(doubleArray0);
      simpleRegression0.addData(0.0, 0.0);
      double double0 = simpleRegression0.getRSquare();
      assertEquals(4L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(6060847.336512176, 2426.454071366262);
      simpleRegression0.addData(6060847.336512176, 6060847.336512176);
      simpleRegression0.addData(2426.454071366262, 2426.454071366262);
      simpleRegression0.addData(2426.454071366262, 6060847.336512176);
      double double0 = simpleRegression0.getR();
      assertEquals(4L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1656.39573, (-1210.367148011857));
      long long0 = simpleRegression0.getN();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[4][8];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (-3531.8082);
      doubleArray0[0] = doubleArray1;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getInterceptStdErr();
      assertEquals(4L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(0.9999999999999971, 0.0);
      simpleRegression0.addData(0.0, 0.0);
      double double0 = simpleRegression0.getIntercept();
      assertEquals(0.0, simpleRegression0.getRegressionSumSquares(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[3][1];
      double[] doubleArray1 = new double[3];
      doubleArray1[1] = (-1.0);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = (-1.0);
      doubleArray0[1] = doubleArray2;
      doubleArray0[2] = doubleArray2;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getIntercept();
      assertEquals(3L, simpleRegression0.getN());
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[3][1];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      simpleRegression0.addData(doubleArray1);
      // Undeclared exception!
      simpleRegression0.getSlopeConfidenceInterval(2.1743961811521265E-4);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.addData((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[1][0];
      // Undeclared exception!
      try { 
        simpleRegression0.addData(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval(2.1743961811521265E-4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.TDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[5][6];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getMeanSquareError();
      assertEquals(5L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getMeanSquareError();
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0L, simpleRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getTotalSumSquares();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[3][1];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      doubleArray0[2] = doubleArray1;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getTotalSumSquares();
      assertEquals(3L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1656.39573, 1656.39573);
      simpleRegression0.addData(1656.39573, 1656.39573);
      double double0 = simpleRegression0.getSlope();
      assertEquals(2L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1656.39573, (-1210.367148011857));
      simpleRegression0.addData((-1210.367148011857), (-1210.367148011857));
      double double0 = simpleRegression0.getSlope();
      assertEquals(2L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getSlope();
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.getRSquare();
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getSumSquaredErrors();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0L, simpleRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval(0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval(1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[5][6];
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (-1402.403);
      doubleArray1[1] = 3823.0;
      doubleArray0[1] = doubleArray1;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getR();
      assertEquals(5L, simpleRegression0.getN());
      assertEquals((-0.9999999999999998), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(6060847.336512176, 2426.454071366262);
      simpleRegression0.addData(6060847.336512176, 6060847.336512176);
      double double0 = simpleRegression0.getR();
      assertEquals(2L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(6060847.336512176, 2426.454071366262);
      simpleRegression0.addData(2426.454071366262, 2426.454071366262);
      double double0 = simpleRegression0.getRegressionSumSquares();
      assertEquals(2L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(6060847.336512176, 2426.454071366262);
      simpleRegression0.addData(6060847.336512176, 6060847.336512176);
      double double0 = simpleRegression0.getRegressionSumSquares();
      assertEquals(2L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.TDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.getInterceptStdErr();
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      long long0 = simpleRegression0.getN();
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.clear();
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.predict((-2780.6152656175154));
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(6060847.336512176, 2426.454071366262);
      simpleRegression0.addData(6060847.336512176, 6060847.336512176);
      simpleRegression0.addData(2426.454071366262, 2426.454071366262);
      double double0 = simpleRegression0.getSlopeStdErr();
      assertEquals(3L, simpleRegression0.getN());
      assertEquals(0.8660254037844386, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSignificance();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.TDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.getIntercept();
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01);
  }
}
