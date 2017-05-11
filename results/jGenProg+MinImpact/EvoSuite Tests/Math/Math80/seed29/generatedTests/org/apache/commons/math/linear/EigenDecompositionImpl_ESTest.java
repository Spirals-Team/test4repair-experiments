/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 29 14:34:26 GMT 2017
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      doubleArray1[4] = 2519.094141358329;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 1.0986122886681096;
      doubleArray0[2] = 1.0986122886681096;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 1.0986122886681096);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 1681.64798);
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
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = 1.0986122886681096;
      doubleArray1[2] = 2519.435275;
      doubleArray1[3] = (-1533.1859770464373);
      doubleArray1[4] = 2519.435275;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(3);
      assertEquals(1856.4366252085954, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1338.870985);
      doubleArray0[3] = (-1533.1859770464373);
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = 1.0986122886681096;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(3);
      assertEquals((-1.0986122886681096), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      eigenDecompositionImpl0.getImagEigenvalue(4);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = 1.0986122886681096;
      doubleArray0[3] = (-1533.1859770464373);
      doubleArray0[4] = 1.0986122886681096;
      doubleArray0[5] = 2519.435275;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 1.0986122886681096;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(5626986.255987869, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1338.870985);
      doubleArray0[5] = 2519.435275;
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = 1.0986122886681096;
      doubleArray1[3] = (-1338.870985);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals((-7.298074639525894E12), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986122886681096);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue((-76));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -76
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, 1753.90589578);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, 0.0);
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
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      array2DRowRealMatrix0.data = null;
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, (-1533.1859770464373));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 1.0986122886681096;
      doubleArray0[2] = 1.0986122886681096;
      doubleArray0[3] = (-1533.1859770464373);
      doubleArray0[4] = (-1533.1859770464373);
      double[] doubleArray1 = new double[5];
      doubleArray1[2] = 1.0986122886681096;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1338.870985);
      doubleArray0[5] = 2519.435275;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 1.0986122886681096;
      doubleArray1[1] = 1.0986122886681096;
      doubleArray1[2] = 2519.435275;
      doubleArray1[3] = 1.0986122886681096;
      doubleArray1[4] = 2519.435275;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(3.5619636273121556E18, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 1.0986122886681096;
      doubleArray1[1] = 1.0986122886681096;
      doubleArray1[2] = 2519.435275;
      doubleArray1[3] = 1.0986122886681096;
      doubleArray1[4] = 2519.435275;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(3.888877666534598E14, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[3] = (-1533.1859770464373);
      doubleArray0[4] = 2519.435275;
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = 1.0986122886681096;
      doubleArray1[2] = 2519.435275;
      doubleArray1[3] = (-1533.1859770464373);
      doubleArray1[4] = 2519.435275;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1338.870985);
      doubleArray0[3] = (-1533.1859770464373);
      doubleArray0[5] = 2519.435275;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-1338.870985);
      doubleArray1[1] = 1.0986122886681096;
      doubleArray1[2] = 2519.435275;
      doubleArray1[3] = (-1533.1859770464373);
      doubleArray1[4] = 2519.435275;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      assertEquals((-1.2183923337095853E20), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1338.870985);
      doubleArray0[3] = (-1533.1859770464373);
      doubleArray0[5] = 2519.435275;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-1533.1859770464373);
      doubleArray1[1] = 1.0986122886681096;
      doubleArray1[2] = 2519.435275;
      doubleArray1[3] = (-1338.870985);
      doubleArray1[4] = 2519.435275;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      assertEquals((-9.471144463099927E19), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1338.870985);
      doubleArray0[3] = (-1533.1859770464373);
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-1338.870985);
      doubleArray1[1] = 1.0986122886681096;
      doubleArray1[2] = 2519.435275;
      doubleArray1[3] = (-1533.1859770464373);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1338.870985);
      doubleArray0[3] = (-1533.1859770464373);
      doubleArray0[5] = 2519.435275;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-1533.1859770464373);
      doubleArray1[1] = 1.0986122886681096;
      doubleArray1[2] = 2519.435275;
      doubleArray1[3] = 1.0986122886681096;
      doubleArray1[4] = 2519.435275;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals((-2.255133556406296E20), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[3] = (-1533.1859770464373);
      doubleArray0[5] = 2519.435275;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-1533.1859770464373);
      doubleArray1[1] = 1.0986122886681096;
      doubleArray1[2] = 2519.435275;
      doubleArray1[3] = (-1533.1859770464373);
      doubleArray1[4] = 2519.435275;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      assertEquals((-9.471145305930881E19), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[3] = (-1533.1859770464373);
      doubleArray0[4] = 1.0986122886681096;
      doubleArray0[5] = 2519.435275;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 1.0986122886681096;
      doubleArray1[1] = (-1533.1859770464373);
      doubleArray1[2] = 1.0986122886681096;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      assertEquals(2.5132481943359388E16, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = 2.6388389699155157;
      doubleArray0[3] = (-1533.1859770464373);
      doubleArray0[4] = 2.6388389699155157;
      doubleArray0[5] = 2519.435275;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-1533.1859770464373);
      doubleArray1[1] = 2.6388389699155157;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      assertEquals(6.322859027560715E13, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 1.0986122886681096;
      doubleArray0[2] = 1.0986122886681096;
      doubleArray0[3] = 1.0986122886681096;
      doubleArray0[4] = 1.0986122886681096;
      double[] doubleArray1 = new double[5];
      doubleArray1[2] = 1.0986122886681096;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      eigenDecompositionImpl0.getVT();
      assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 1.0986122886681096;
      doubleArray0[2] = 1.0986122886681096;
      doubleArray0[3] = (-1533.1859770464373);
      doubleArray0[4] = 1.0986122886681096;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 1.0986122886681096;
      doubleArray1[3] = 1.0986122886681096;
      doubleArray1[2] = 1.0986122886681096;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 1.0986122886681096;
      doubleArray0[2] = 1.0986122886681096;
      doubleArray0[3] = 1.0986122886681096;
      doubleArray0[4] = 1.0986122886681096;
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = 1.0986122886681096;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1338.870985);
      doubleArray0[5] = 2519.435275;
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = 1.0986122886681096;
      doubleArray1[3] = (-1533.1859770464373);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, (-1533.1859770464373));
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
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1338.870985);
      doubleArray0[3] = (-1533.1859770464373);
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = 1.0986122886681096;
      doubleArray1[4] = 2519.435275;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, (-1533.1859770464373));
      assertEquals(1.5726384326649865E13, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertEquals(1.5726384326644918E13, eigenDecompositionImpl1.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = 1.0986122886681096;
      doubleArray1[2] = 2519.435275;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 1.0986122886681096;
      doubleArray0[2] = 1.0986122886681096;
      doubleArray0[0] = 1.0986122886681096;
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getV();
      eigenDecompositionImpl0.getSolver();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      try { 
        eigenDecompositionImpl0.getEigenvector((-5867));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5867
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      assertNotNull(array2DRowRealMatrix0);
      assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
      
      eigenDecompositionImpl0.getEigenvector(1);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getV();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      assertEquals(6, array2DRowRealMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      eigenDecompositionImpl0.getVT();
      eigenDecompositionImpl0.getVT();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      eigenDecompositionImpl0.getD();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertNotNull(array2DRowRealMatrix0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getSolver();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      assertNotNull(array2DRowRealMatrix0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getV();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      assertEquals(6, array2DRowRealMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, (-1533.1859770464373));
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)eigenDecompositionImpl1.getVT();
      assertFalse(array2DRowRealMatrix1.equals((Object)array2DRowRealMatrix0));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-1533.1859770464373);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 1809.466911527);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      eigenDecompositionImpl0.getRealEigenvalue(3);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      try { 
        eigenDecompositionImpl0.getImagEigenvalue((-2311));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2311
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.471461410547536));
      eigenDecompositionImpl0.getImagEigenvalues();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }
}