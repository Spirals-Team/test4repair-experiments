/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 10 00:04:13 GMT 2017
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
      double[][] doubleArray0 = new double[2][8];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[7];
      try { 
        pearsonsCorrelation0.correlation(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 1; yArray has 7 elements
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[10][4];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationPValues();
      PearsonsCorrelation pearsonsCorrelation1 = new PearsonsCorrelation((RealMatrix) blockRealMatrix0, 52);
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[7][4];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationMatrix();
      assertEquals(4, blockRealMatrix0.getRowDimension());
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[7][4];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (double) 52;
      double[] doubleArray2 = new double[9];
      doubleArray2[3] = (double) Integer.MAX_VALUE;
      double double0 = pearsonsCorrelation0.correlation(doubleArray2, doubleArray1);
      assertEquals((-0.12500000000000017), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      double[][] doubleArray0 = new double[6][4];
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0);
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(4, blockRealMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
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
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      double[][] doubleArray0 = new double[0][8];
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
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      double[][] doubleArray0 = new double[7][4];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationPValues();
      BlockRealMatrix blockRealMatrix1 = (BlockRealMatrix)pearsonsCorrelation0.covarianceToCorrelation(blockRealMatrix0);
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(Double.NaN, blockRealMatrix1.getFrobeniusNorm(), 0.01);
      assertEquals(4, blockRealMatrix1.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[][] doubleArray0 = new double[7][4];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
      double[] doubleArray1 = new double[9];
      double double0 = pearsonsCorrelation0.correlation(doubleArray1, doubleArray1);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[][] doubleArray0 = new double[10][4];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
      double[] doubleArray1 = new double[1];
      try { 
        pearsonsCorrelation0.correlation(doubleArray1, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 1; yArray has 1 elements
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[][] doubleArray0 = new double[7][4];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationPValues();
      BlockRealMatrix blockRealMatrix1 = (BlockRealMatrix)pearsonsCorrelation0.computeCorrelationMatrix((RealMatrix) blockRealMatrix0);
      BlockRealMatrix blockRealMatrix2 = (BlockRealMatrix)pearsonsCorrelation0.covarianceToCorrelation(blockRealMatrix1);
      assertEquals(4, blockRealMatrix2.getColumnDimension());
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(Double.NaN, blockRealMatrix2.getFrobeniusNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[][] doubleArray0 = new double[1][8];
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 1 rows and 8 columns.
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      double[][] doubleArray0 = new double[1][4];
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
  public void test22()  throws Throwable  {
      double[][] doubleArray0 = new double[7][4];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
      double[] doubleArray1 = new double[9];
      double[] doubleArray2 = new double[0];
      try { 
        pearsonsCorrelation0.correlation(doubleArray1, doubleArray2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 9; yArray has 0 elements
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[][] doubleArray0 = new double[7][4];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationPValues();
      PearsonsCorrelation pearsonsCorrelation1 = new PearsonsCorrelation((RealMatrix) blockRealMatrix0);
      assertEquals(4, blockRealMatrix0.getColumnDimension());
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[][] doubleArray0 = new double[7][4];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationStandardErrors();
      assertEquals(4, blockRealMatrix0.getColumnDimension());
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
      double[][] doubleArray0 = new double[5][5];
      Covariance covariance0 = new Covariance(doubleArray0, false);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(covariance0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      double[][] doubleArray0 = new double[0][7];
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
  public void test28()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) null, (-1234));
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
      RealMatrix realMatrix0 = pearsonsCorrelation0.getCorrelationMatrix();
      assertNull(realMatrix0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[][] doubleArray0 = new double[3][1];
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 3 rows and 1 columns.
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }
}
