/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 19 22:40:56 GMT 2017
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
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
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1426.72858);
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1426.72858));
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      assertTrue(decompositionSolver0.isNonSingular());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 6.38905609893065);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 68.84638244979);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 0.0);
      assertFalse(eigenDecompositionImpl1.equals((Object)eigenDecompositionImpl0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = (-23.507994854147597);
      doubleArray0[6] = (-2372.6);
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.08325);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(5);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertEquals((-23.507994854147597), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.08325);
      eigenDecompositionImpl0.getImagEigenvalue(5);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 208.9170411491006);
      eigenDecompositionImpl0.getEigenvector(2);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 208.9170411491006;
      doubleArray0[1] = 208.9170411491006;
      doubleArray0[2] = 1.1102230246251565E-14;
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 208.9170411491006);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(4.845716059797556E-10, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 68.84638244979;
      doubleArray1[1] = 68.84638244979;
      doubleArray0[2] = (-1337.8104049191274);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray0, (-831.41));
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals((-8.483037540918843E9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 68.84638244979);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      double[][] doubleArray2 = new double[1][5];
      array2DRowRealMatrix0.data = doubleArray2;
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 208.9170411491006);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x5 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, (-208.544));
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
      double[] doubleArray0 = new double[7];
      doubleArray0[5] = (-23.507994854147597);
      doubleArray0[6] = 957.196721;
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-23.507994854147597));
      try { 
        eigenDecompositionImpl0.getEigenvector((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 208.9170411491006;
      doubleArray0[1] = 208.9170411491006;
      doubleArray0[2] = 1.1102230246251565E-14;
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 208.9170411491006);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      assertEquals(3, array2DRowRealMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = 28.96008390972947;
      doubleArray0[5] = 28.96008390972947;
      doubleArray0[6] = (-2372.6);
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = (-2372.6);
      doubleArray1[2] = (double) 32;
      doubleArray1[3] = (-2372.6);
      doubleArray1[4] = 28.96008390972947;
      doubleArray1[5] = (-2372.6);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.08325);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[5] = (-23.507994854147597);
      doubleArray0[6] = (-2372.6);
      double[] doubleArray1 = new double[6];
      doubleArray1[2] = (double) 32;
      doubleArray1[3] = 32.0;
      doubleArray1[4] = (-23.507994854147597);
      doubleArray1[5] = (-2372.6);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.08325);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = 957.196721;
      doubleArray0[5] = (-23.507994854147597);
      doubleArray0[6] = (-2372.6);
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = (-2372.6);
      doubleArray1[2] = (double) 32;
      doubleArray1[3] = (-2372.6);
      doubleArray1[4] = (-23.507994854147597);
      doubleArray1[5] = (-2372.6);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-23.507994854147597));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = 957.196721;
      doubleArray0[6] = 957.196721;
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = (-23.507994854147597);
      doubleArray1[2] = (double) 32;
      doubleArray1[3] = 957.196721;
      doubleArray1[4] = (-23.507994854147597);
      doubleArray1[5] = 957.196721;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-23.507994854147597));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = (-23.507994854147597);
      doubleArray0[6] = 719.70334;
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = 719.70334;
      doubleArray1[2] = (double) 32;
      doubleArray1[3] = 719.70334;
      doubleArray1[4] = (-23.507994854147597);
      doubleArray1[5] = 719.70334;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.08325);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = (-2372.6);
      doubleArray1[2] = (double) 32;
      doubleArray1[3] = (-2372.6);
      doubleArray1[4] = (-2372.6);
      doubleArray1[5] = (-2372.6);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.08325);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = 5.464739403977089;
      doubleArray0[3] = (-23.507994854147597);
      doubleArray0[5] = (-23.507994854147597);
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = (-2372.6);
      doubleArray1[3] = (double) 32;
      doubleArray1[4] = (-23.507994854147597);
      doubleArray1[5] = (-2372.6);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2372.6));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = (-23.507994854147597);
      doubleArray0[6] = (-23.507994854147597);
      double[] doubleArray1 = new double[6];
      doubleArray1[2] = (double) 5;
      doubleArray1[3] = (-23.507994854147597);
      doubleArray1[4] = (-23.507994854147597);
      doubleArray1[5] = (-23.507994854147597);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      doubleArray1[2] = (double) 5;
      doubleArray1[3] = (-2372.6);
      doubleArray1[4] = (-23.507994854147597);
      doubleArray1[5] = (-2372.6);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.08325);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(5);
      assertEquals(0.0, double0, 0.01);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = (-23.507994854147597);
      doubleArray0[6] = (-2372.6);
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = (-2372.6);
      doubleArray1[2] = (double) 32;
      doubleArray1[3] = (-2372.6);
      doubleArray1[4] = (-23.507994854147597);
      doubleArray1[5] = (-2372.6);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.08325);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[6] = (-2372.6);
      double[] doubleArray1 = new double[6];
      doubleArray1[2] = (double) 2143621549;
      doubleArray1[3] = (-2372.6);
      doubleArray1[4] = 10.06766199577777;
      doubleArray1[5] = (-2372.6);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.08325);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 68.84638244979;
      doubleArray1[1] = 68.84638244979;
      doubleArray1[2] = 68.84638244979;
      doubleArray1[3] = 68.84638244979;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray0, (-831.41));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 234.97338236009966;
      doubleArray1[1] = 234.97338236009966;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 234.97338236009966);
      assertEquals(7.783456057957537E-9, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = 208.917;
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 208.917;
      doubleArray1[1] = 1.0E-14;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 208.9170411491006);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = (-23.507994854147597);
      doubleArray0[6] = (-23.507994854147597);
      double[] doubleArray1 = new double[6];
      doubleArray1[3] = (-23.507994854147597);
      doubleArray1[4] = (-23.507994854147597);
      doubleArray1[5] = (-23.507994854147597);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      doubleArray1[2] = (double) 2143621549;
      doubleArray1[3] = 10.06766199577777;
      doubleArray1[4] = 10.06766199577777;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.08325);
      assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 68.84638244979);
      eigenDecompositionImpl0.getV();
      eigenDecompositionImpl0.getSolver();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 208.9170411491006);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 208.9170411491006);
      eigenDecompositionImpl0.getVT();
      try { 
        eigenDecompositionImpl0.getEigenvector((-527));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -527
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-14);
      eigenDecompositionImpl0.getV();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      assertEquals(3, array2DRowRealMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 208.9170411491006);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 208.9170411491006);
      eigenDecompositionImpl0.getD();
      eigenDecompositionImpl0.getD();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 68.84638244979);
      eigenDecompositionImpl0.getSolver();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 0.0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl1.getSolver();
      assertTrue(decompositionSolver0.isNonSingular());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-14);
      eigenDecompositionImpl0.getV();
      eigenDecompositionImpl0.getV();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = 208.9170411491006;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 68.84638244979);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 208.9170411491006);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 68.84638244979);
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 68.84638244979);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue((-531));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -531
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.08325);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(2143621549);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2143621549
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-14);
      eigenDecompositionImpl0.getImagEigenvalues();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }
}
