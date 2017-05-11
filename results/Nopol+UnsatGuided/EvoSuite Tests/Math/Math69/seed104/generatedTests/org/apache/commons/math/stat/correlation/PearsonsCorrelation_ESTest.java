/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 09 23:37:59 GMT 2017
 */

package org.apache.commons.math.stat.correlation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.stat.correlation.Covariance;
import org.apache.commons.math.stat.correlation.PearsonsCorrelation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PearsonsCorrelation_ESTest extends PearsonsCorrelation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[2][5];
      double[] doubleArray1 = new double[2];
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[8];
      try { 
        pearsonsCorrelation0.correlation(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 5; yArray has 8 elements
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[19][8];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0);
      PearsonsCorrelation pearsonsCorrelation1 = new PearsonsCorrelation((RealMatrix) blockRealMatrix0, 1);
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[8][8];
      Covariance covariance0 = new Covariance(doubleArray0, true);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(covariance0);
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationMatrix();
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(8, blockRealMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (-1192.7866356261745);
      double[] doubleArray1 = new double[5];
      doubleArray1[4] = (-1192.7866356261745);
      double double0 = pearsonsCorrelation0.correlation(doubleArray0, doubleArray1);
      assertEquals((-0.24999999999999992), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.getCorrelationStandardErrors();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.getCorrelationPValues();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive (-2)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.covarianceToCorrelation((RealMatrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.correlation((double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      double[][] doubleArray0 = new double[1][7];
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 1; yArray has 1 elements
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.computeCorrelationMatrix((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      double[][] doubleArray0 = new double[0][5];
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      // Undeclared exception!
      try { 
        pearsonsCorrelation0.computeCorrelationMatrix((RealMatrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[][] doubleArray0 = new double[0][2];
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation((Covariance) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      double[][] doubleArray0 = new double[8][8];
      Covariance covariance0 = new Covariance(doubleArray0, true);
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)covariance0.computeCovarianceMatrix(doubleArray0, true);
      BlockRealMatrix blockRealMatrix1 = (BlockRealMatrix)pearsonsCorrelation0.covarianceToCorrelation(blockRealMatrix0);
      assertEquals(8, blockRealMatrix1.getColumnDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(Double.NaN, blockRealMatrix1.getFrobeniusNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      double[] doubleArray0 = new double[5];
      double double0 = pearsonsCorrelation0.correlation(doubleArray0, doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      double[] doubleArray0 = new double[2];
      double[][] doubleArray1 = new double[6][0];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.computeCorrelationMatrix(doubleArray1);
      BlockRealMatrix blockRealMatrix1 = (BlockRealMatrix)pearsonsCorrelation0.computeCorrelationMatrix((RealMatrix) blockRealMatrix0);
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertFalse(blockRealMatrix1.equals((Object)blockRealMatrix0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[][] doubleArray0 = new double[8][8];
      Covariance covariance0 = new Covariance(doubleArray0, true);
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)covariance0.computeCovarianceMatrix(doubleArray0, true);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) blockRealMatrix0);
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[][] doubleArray0 = new double[2][5];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 2 rows and 1 columns.
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[][] doubleArray0 = new double[1][3];
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 1 rows and 3 columns.
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      double[] doubleArray0 = new double[0];
      try { 
        pearsonsCorrelation0.correlation(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 0; yArray has 0 elements
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[1];
      try { 
        pearsonsCorrelation0.correlation(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 5; yArray has 1 elements
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[][] doubleArray0 = new double[9][8];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationStandardErrors();
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(8, blockRealMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(covariance0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // covariance matrix is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[][] doubleArray0 = new double[8][8];
      Covariance covariance0 = new Covariance(doubleArray0, true);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(covariance0);
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationPValues();
      assertEquals(8, blockRealMatrix0.getColumnDimension());
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.correlation.PearsonsCorrelation", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationMatrix();
      assertNull(blockRealMatrix0);
  }
}
