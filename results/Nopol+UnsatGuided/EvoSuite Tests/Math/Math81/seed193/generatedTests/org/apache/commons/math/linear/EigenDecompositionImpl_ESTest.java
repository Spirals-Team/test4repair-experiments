/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 22 00:50:31 GMT 2017
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) (-33);
      doubleArray0[1] = (double) (-33);
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (double) 46);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      assertEquals(2, array2DRowRealMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (-0.4072559492402666);
      doubleArray0[2] = (-0.4072559492402666);
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-0.4072559492402666));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 913.48223462);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2214.87013628357);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 46;
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2214.87013628357);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
      assertEquals(46.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2214.87013628357);
      eigenDecompositionImpl0.getImagEigenvalue(0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 46;
      doubleArray0[1] = (double) 46;
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2214.87013628357);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(2116.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1569.003324710492;
      doubleArray0[3] = 603.045182003097;
      double[] doubleArray1 = new double[3];
      doubleArray1[1] = 1569.003324710492;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.3333333333333333);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals((-2.3292786372091963E12), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (double) 46);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(46);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 46
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, (double[]) null, 0.9950547536867305);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, 1.232595164407831E-28);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (double) 46);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 101884.02626904422);
      eigenDecompositionImpl1.getVT();
      assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 115174.42997140993;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, Double.NEGATIVE_INFINITY);
      eigenDecompositionImpl0.getVT();
      assertEquals(0.3240706450381231, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 46;
      doubleArray0[1] = (double) 46;
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2214.87013628357);
      eigenDecompositionImpl0.getV();
      assertEquals(2116.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1569.003324710492;
      doubleArray0[1] = 1569.003324710492;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 1569.003324710492;
      doubleArray1[1] = 1569.003324710492;
      doubleArray1[2] = 847.216995220694;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.3333333333333333);
      assertEquals((-0.002780741589347605), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1.1102230246251565E-14;
      doubleArray0[2] = 1.1102230246251565E-14;
      double[] doubleArray1 = new double[2];
      doubleArray0[1] = 1.1102230246251565E-14;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2226.728133073129));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 1406.26486695373;
      doubleArray0[2] = 847.216995220694;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 1406.26486695373;
      doubleArray1[1] = 1569.003324710492;
      doubleArray1[2] = 847.216995220694;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.3333333333333333);
      assertEquals(1.419461350572942E12, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 1406.26486695373;
      doubleArray1[1] = 1569.003324710492;
      doubleArray1[2] = 1406.26486695373;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.3333333333333333);
      assertEquals(3.910826121233218E12, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2214.87013628357);
      eigenDecompositionImpl0.getV();
      eigenDecompositionImpl0.getSolver();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2214.87013628357);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (double) 46);
      try { 
        eigenDecompositionImpl0.getEigenvector(46);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 46
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2214.87013628357);
      eigenDecompositionImpl0.getV();
      ArrayRealVector arrayRealVector0 = (ArrayRealVector)eigenDecompositionImpl0.getEigenvector(0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertEquals(Double.NaN, arrayRealVector0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2214.87013628357);
      eigenDecompositionImpl0.getV();
      eigenDecompositionImpl0.getVT();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 46.0);
      eigenDecompositionImpl0.getVT();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      assertEquals(2, array2DRowRealMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2214.87013628357);
      eigenDecompositionImpl0.getD();
      eigenDecompositionImpl0.getD();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2214.87013628357);
      eigenDecompositionImpl0.getSolver();
      eigenDecompositionImpl0.getV();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2214.87013628357);
      eigenDecompositionImpl0.getV();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      assertEquals(2, array2DRowRealMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2214.87013628357);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 2214.87013628357);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl1.getSolver();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertTrue(decompositionSolver0.isNonSingular());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) 46;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 46.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, (double) 46);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-0.4072559492402666));
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 115174.42997140993;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, Double.NEGATIVE_INFINITY);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(2);
      assertEquals((-115174.42997140995), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (double) 46);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(46);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 46
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[3];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.3333333333333333);
      eigenDecompositionImpl0.getImagEigenvalues();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }
}
