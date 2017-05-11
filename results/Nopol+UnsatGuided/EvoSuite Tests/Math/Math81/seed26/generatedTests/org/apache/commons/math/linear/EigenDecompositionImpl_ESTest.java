/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 20 14:00:49 GMT 2017
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-357.00095);
      doubleArray0[1] = (-357.00095);
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (-357.00095);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-357.00095));
      eigenDecompositionImpl0.getSolver();
      assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-138888.89583004694);
      doubleArray0[2] = (-602.2482746497102);
      doubleArray0[3] = (-602.2482746497102);
      doubleArray0[5] = (-2826.116921158);
      doubleArray0[6] = 18.0;
      doubleArray0[7] = (-602.2482746497102);
      doubleArray0[8] = (-1383.295209);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-602.2482746497102);
      doubleArray1[1] = (-602.2482746497102);
      doubleArray1[3] = 316.8781610497305;
      doubleArray1[4] = (-2826.116921158);
      doubleArray1[7] = (-138888.89583004694);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2826.116921158));
      assertEquals(6.250949853904606E35, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-394.38988840705485);
      doubleArray0[1] = (-394.38988840705485);
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-394.38988840705485));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 2.718281828459045);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = 1.732050807568877;
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 1.732050807568877;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 2199.905745932889);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getRealEigenvalue(1);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = 14.635035232975266;
      doubleArray0[2] = 1.732050807568877;
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 14.635035232975266);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(1);
      assertEquals(1.732050807568877, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-357.00095);
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = (-357.00095);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 14.635035232975266);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(1);
      assertEquals(4.549965623061658E7, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertEquals((-357.00095), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 14.635035232975266);
      ArrayRealVector arrayRealVector0 = (ArrayRealVector)eigenDecompositionImpl0.getEigenvector(1);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-357.00095);
      doubleArray0[1] = (-357.00095);
      doubleArray0[2] = 1.732050807568877;
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-357.00095));
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(220749.3182254742, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = 1.732050807568877;
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 1.732050807568877;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals((-5.196152422706628), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 375.890407);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue((-3084));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3084
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, doubleArray0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, (-340.22));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 32.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 1.732050807568877);
      eigenDecompositionImpl1.getVT();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 316.8781610497305;
      doubleArray0[2] = (-138888.89583004694);
      doubleArray0[7] = 316.8781610497305;
      doubleArray0[5] = (-138888.89583004694);
      doubleArray0[8] = (-1383.295209);
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (-138888.89583004694);
      doubleArray1[2] = (-138888.89583004694);
      doubleArray1[3] = 316.8781610497305;
      doubleArray1[4] = 316.8781610497305;
      doubleArray1[5] = 316.8781610497305;
      doubleArray1[6] = (-138888.89583004694);
      doubleArray1[7] = 0.5;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-138888.89583004694));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (-138888.89583004694);
      doubleArray0[4] = (-138888.89583004694);
      doubleArray0[5] = (-2826.116921158);
      doubleArray0[8] = (-138888.89583004694);
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (-602.2482746497102);
      doubleArray1[2] = (-602.2482746497102);
      doubleArray1[3] = 316.8781610497305;
      doubleArray1[4] = (-2826.116921158);
      doubleArray1[5] = (-138888.89583004694);
      doubleArray1[6] = 18.0;
      doubleArray1[7] = 0.5;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2826.116921158));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (-138888.89583004694);
      doubleArray0[4] = (-138888.89583004694);
      doubleArray0[7] = (-602.2482746497102);
      doubleArray0[8] = (-138888.89583004694);
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (-602.2482746497102);
      doubleArray1[2] = (-602.2482746497102);
      doubleArray1[3] = 316.8781610497305;
      doubleArray1[4] = (-138888.89583004694);
      doubleArray1[5] = (-138888.89583004694);
      doubleArray1[6] = 18.0;
      doubleArray1[7] = 0.5;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2826.116921158));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-138888.89583004694);
      doubleArray0[8] = (-1383.295209);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-602.2482746497102);
      doubleArray1[1] = (-602.2482746497102);
      doubleArray1[2] = (-602.2482746497102);
      doubleArray1[3] = 316.8781610497305;
      doubleArray1[4] = (-2826.116921158);
      doubleArray1[5] = (-602.2482746497102);
      doubleArray1[6] = (-602.2482746497102);
      doubleArray1[7] = (-138888.89583004694);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(9.859782036055459E31, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 316.8781610497305;
      doubleArray0[5] = (-2826.116921158);
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (-602.2482746497102);
      doubleArray1[2] = (-602.2482746497102);
      doubleArray1[3] = 316.8781610497305;
      doubleArray1[4] = (-2826.116921158);
      doubleArray1[5] = (-602.2482746497102);
      doubleArray1[6] = (-602.2482746497102);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2826.116921158));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 316.8781610497305;
      doubleArray0[4] = 302.8660297637741;
      doubleArray0[5] = (-2826.116921158);
      doubleArray0[7] = (-602.2482746497102);
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (-602.2482746497102);
      doubleArray1[2] = (-602.2482746497102);
      doubleArray1[3] = 316.8781610497305;
      doubleArray1[4] = (-2826.116921158);
      doubleArray1[5] = (-602.2482746497102);
      doubleArray1[6] = (-602.2482746497102);
      doubleArray1[7] = 0.5;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2826.116921158));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      doubleArray1[2] = (-602.2482746497102);
      doubleArray1[3] = 316.8781610497305;
      doubleArray1[4] = (-138888.89583004694);
      doubleArray1[5] = (-138888.89583004694);
      doubleArray1[6] = 18.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2826.116921158));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (-138888.89583004694);
      doubleArray0[4] = (-138888.89583004694);
      doubleArray0[8] = (-138888.89583004694);
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (-602.2482746497102);
      doubleArray1[2] = (-602.2482746497102);
      doubleArray1[3] = 316.8781610497305;
      doubleArray1[4] = (-138888.89583004694);
      doubleArray1[5] = (-138888.89583004694);
      doubleArray1[6] = 18.0;
      doubleArray1[7] = 0.5;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2826.116921158));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (-138888.89583004694);
      doubleArray0[4] = (-138888.89583004694);
      doubleArray0[6] = (-2826.116921158);
      doubleArray0[7] = (-138888.89583004694);
      doubleArray0[8] = (-138888.89583004694);
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (-602.2482746497102);
      doubleArray1[2] = (-602.2482746497102);
      doubleArray1[3] = 316.8781610497305;
      doubleArray1[4] = (-2826.116921158);
      doubleArray1[5] = (-138888.89583004694);
      doubleArray1[6] = 18.0;
      doubleArray1[7] = 0.5;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (-602.2482746497102);
      doubleArray0[5] = (-2826.116921158);
      doubleArray0[6] = 18.0;
      doubleArray0[7] = (-602.2482746497102);
      double[] doubleArray1 = new double[8];
      doubleArray1[3] = 316.8781610497305;
      doubleArray1[4] = (-2826.116921158);
      doubleArray1[7] = (-138888.89583004694);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2826.116921158));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-138888.89583004694);
      doubleArray0[1] = 316.8781610497305;
      doubleArray0[2] = (-138888.89583004694);
      double[] doubleArray1 = new double[8];
      doubleArray1[2] = (-138888.89583004694);
      doubleArray1[3] = 316.8781610497305;
      doubleArray1[4] = 0.5;
      doubleArray1[5] = 316.8781610497305;
      doubleArray1[6] = (-138888.89583004694);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-138888.89583004694));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 316.8781610497305;
      doubleArray0[2] = (-602.2482746497102);
      doubleArray0[3] = 0.5;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = Double.POSITIVE_INFINITY;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2826.116921158));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-138888.89583004694);
      doubleArray0[1] = (-138888.89583004694);
      doubleArray0[4] = (-138888.89583004694);
      doubleArray0[8] = (-138888.89583004694);
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (-602.2482746497102);
      doubleArray1[2] = (-602.2482746497102);
      doubleArray1[3] = 316.8781610497305;
      doubleArray1[4] = (-2826.116921158);
      doubleArray1[5] = (-138888.89583004694);
      doubleArray1[6] = 18.0;
      doubleArray1[7] = 0.5;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2826.116921158));
      assertEquals((-1.4876305484155914E36), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = (-138888.89583004694);
      doubleArray0[5] = (-2826.116921158);
      doubleArray0[6] = 18.0;
      doubleArray0[8] = (-138888.89583004694);
      double[] doubleArray1 = new double[8];
      doubleArray1[6] = 18.0;
      doubleArray1[7] = 0.5;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2826.116921158));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-138888.89583004694);
      doubleArray0[1] = 316.8781610497305;
      doubleArray0[2] = (-602.2482746497102);
      doubleArray0[3] = (-602.2482746497102);
      doubleArray0[5] = (-2826.116921158);
      doubleArray0[6] = 18.0;
      doubleArray0[7] = (-602.2482746497102);
      double[] doubleArray1 = new double[8];
      doubleArray1[3] = 316.8781610497305;
      doubleArray1[4] = (-2826.116921158);
      doubleArray1[7] = (-138888.89583004694);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2826.116921158));
      assertEquals(8.23234430293877E35, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-138888.89583004694);
      doubleArray0[1] = (-138888.89583004694);
      doubleArray0[2] = (-138888.89583004694);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-138888.89583004694);
      doubleArray1[2] = (-138888.89583004694);
      doubleArray1[3] = (-138888.89583004694);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-138888.89583004694));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-357.00095);
      doubleArray0[1] = (-357.00095);
      doubleArray0[2] = 1.5116994588631323;
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-357.00095));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getVT();
      eigenDecompositionImpl0.getSolver();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-357.00095));
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 0.0);
      try { 
        eigenDecompositionImpl1.getEigenvector(1257);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1257
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-357.00095));
      eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getEigenvector(4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-357.00095));
      eigenDecompositionImpl0.getSolver();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      assertEquals(3, array2DRowRealMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-357.00095));
      eigenDecompositionImpl0.getVT();
      eigenDecompositionImpl0.getVT();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-357.00095));
      eigenDecompositionImpl0.getD();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertNotNull(array2DRowRealMatrix0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2826.116921158));
      eigenDecompositionImpl0.getVT();
      eigenDecompositionImpl0.getV();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-357.00095));
      eigenDecompositionImpl0.getV();
      eigenDecompositionImpl0.getV();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-357.00095));
      try { 
        eigenDecompositionImpl0.getRealEigenvalue((-634));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -634
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 375.890407);
      eigenDecompositionImpl0.getImagEigenvalue(0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getImagEigenvalues();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }
}
