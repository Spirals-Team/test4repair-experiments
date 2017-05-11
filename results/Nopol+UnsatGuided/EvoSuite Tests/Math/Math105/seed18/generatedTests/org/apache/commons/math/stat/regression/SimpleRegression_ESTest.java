/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 22 17:57:04 GMT 2017
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
  public void test01()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval(1475.1398329148526);
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
      simpleRegression0.addData(4799.01, 4.9E-323);
      simpleRegression0.addData(4.9E-323, 4.9E-323);
      double double0 = simpleRegression0.getR();
      assertEquals(2L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0, 1.0);
      simpleRegression0.addData((-995.8193), 1.0);
      simpleRegression0.addData((-527.26647), 0.0);
      double double0 = simpleRegression0.getRSquare();
      assertEquals(3L, simpleRegression0.getN());
      assertEquals(0.0011947410357642796, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0, 1.0);
      simpleRegression0.addData((-9.847254317862866), (-9.847254317862866));
      double double0 = simpleRegression0.predict(0.0);
      assertEquals(0.0, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0, 1.0);
      simpleRegression0.addData((-9.847254317862866), (-9.847254317862866));
      double double0 = simpleRegression0.predict((-4.434735790847994));
      assertEquals(58.8314631181973, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals((-4.434735790847994), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0, 1.0);
      simpleRegression0.addData((-995.8193), 1.0);
      double double0 = simpleRegression0.getSumSquaredErrors();
      assertEquals(0.0, simpleRegression0.getSlope(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0, 1.0);
      simpleRegression0.addData((-995.8193), 3051.07665);
      double double0 = simpleRegression0.getSumSquaredErrors();
      assertEquals(2L, simpleRegression0.getN());
      assertEquals((-9.313225746154785E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(4799.01, 4.9E-323);
      simpleRegression0.addData(4.9E-323, 4.9E-323);
      simpleRegression0.addData(4799.01, 4.9E-323);
      double double0 = simpleRegression0.getSlopeStdErr();
      assertEquals(3L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(4.9E-323, 4.9E-323);
      simpleRegression0.addData(4.9E-323, 4.9E-323);
      simpleRegression0.addData(919.38150995488, 919.38150995488);
      double double0 = simpleRegression0.getSlopeConfidenceInterval(0.05);
      assertEquals(3L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0, 1.0);
      simpleRegression0.addData(4799.01, (-9.847254317862866));
      simpleRegression0.addData((-9.847254317862866), (-9.847254317862866));
      double double0 = simpleRegression0.getSlopeConfidenceInterval(0.024877282721533965);
      assertEquals(0.0019578846011446133, simpleRegression0.getSlopeStdErr(), 0.01);
      assertEquals(0.05007755703499132, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[6][6];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSlopeConfidenceInterval();
      assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0, 1.0);
      simpleRegression0.addData((-995.8193), 3049.08570412507);
      double double0 = simpleRegression0.getSlope();
      assertEquals(2L, simpleRegression0.getN());
      assertEquals((-3.057811685753948), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0, 1.0);
      simpleRegression0.addData(1434.5026751254704, 1434.5026751254704);
      simpleRegression0.addData(1.0, 1.0);
      double double0 = simpleRegression0.getSignificance();
      assertEquals(3L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[6][6];
      simpleRegression0.addData(doubleArray0);
      simpleRegression0.getSignificance();
      assertEquals(6L, simpleRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0, 1.0);
      simpleRegression0.addData((-995.8193), 1.0);
      double double0 = simpleRegression0.getRegressionSumSquares();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(4799.01, 4.9E-323);
      simpleRegression0.addData(4.9E-323, 4.9E-323);
      simpleRegression0.addData(4799.01, 4.9E-323);
      double double0 = simpleRegression0.getInterceptStdErr();
      assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0, 1.0);
      simpleRegression0.addData((-9.847254317862866), (-9.847254317862866));
      double double0 = simpleRegression0.getIntercept();
      assertEquals(2L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData((-995.8193), 1.0);
      simpleRegression0.addData(1.0, (-2258.0811896847517));
      double double0 = simpleRegression0.getIntercept();
      assertEquals(2L, simpleRegression0.getN());
      assertEquals((-2255.81490010781), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0E-6, 1.0E-6);
      simpleRegression0.addData(1434.903139323889, 3050.447408831024);
      simpleRegression0.addData(1.2878237474768708, 1.2878237474768708);
      // Undeclared exception!
      simpleRegression0.getSlopeConfidenceInterval(1.0E-6);
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
      double[][] doubleArray0 = new double[6][2];
      double[] doubleArray1 = new double[1];
      doubleArray0[2] = doubleArray1;
      // Undeclared exception!
      try { 
        simpleRegression0.addData(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval(0.024877282721533965);
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
      simpleRegression0.addData(4.9E-323, 4.9E-323);
      simpleRegression0.addData(4.9E-323, 4.9E-323);
      simpleRegression0.addData(919.38150995488, 919.38150995488);
      double double0 = simpleRegression0.getMeanSquareError();
      assertEquals(3L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getMeanSquareError();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getTotalSumSquares();
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData((-602.34401), 0.0);
      simpleRegression0.addData(0.0, 0.0);
      double double0 = simpleRegression0.getTotalSumSquares();
      assertEquals(2L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0, 1.0);
      simpleRegression0.addData((-995.8193), 1.0);
      double double0 = simpleRegression0.getSlope();
      assertEquals(2L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getSlope();
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getSlopeStdErr();
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getSumSquaredErrors();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0L, simpleRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval((-59.4264));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0, 1.0);
      simpleRegression0.addData(4799.01, (-9.847254317862866));
      double double0 = simpleRegression0.getR();
      assertEquals(2L, simpleRegression0.getN());
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(4799.01, 4.9E-323);
      simpleRegression0.addData(4.9E-323, 4.9E-323);
      simpleRegression0.addData(4799.01, 4.9E-323);
      double double0 = simpleRegression0.getSlopeConfidenceInterval();
      assertEquals(3L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0, 1.0);
      simpleRegression0.addData(1.0, 3050.447408831024);
      double double0 = simpleRegression0.getSlope();
      assertEquals(4649564.749613123, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[6][6];
      simpleRegression0.addData(doubleArray0);
      long long0 = simpleRegression0.getN();
      assertEquals(6L, long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0, 1.0);
      simpleRegression0.addData((-9.847254317862866), (-9.847254317862866));
      double double0 = simpleRegression0.getR();
      assertEquals(58.8314631181973, simpleRegression0.getRegressionSumSquares(), 0.01);
      assertEquals(1.0, double0, 0.01);
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
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
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
      double double0 = simpleRegression0.getRegressionSumSquares();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.predict(0.0);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
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
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01);
  }
}
