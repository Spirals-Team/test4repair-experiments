/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 21 03:13:13 GMT 2017
 */

package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.optimization.general.CircleVectorial;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LevenbergMarquardtOptimizer_ESTest extends LevenbergMarquardtOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // evaluations
         //
         verifyException("org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-13.205047), 0.1, 0.1, (-2157.608877919), 1806.07946);
      levenbergMarquardtOptimizer0.rows = (-3376);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-18.92902083580168), (-18.92902083580168), (-18.92902083580168), (-18.92902083580168), (-18.92902083580168));
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[8];
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(462, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-18.92902083580168), (-18.92902083580168), (-18.92902083580168));
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[8];
      VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(462, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
      VectorialPointValuePair vectorialPointValuePair1 = levenbergMarquardtOptimizer0.doOptimize();
      assertNotSame(vectorialPointValuePair1, vectorialPointValuePair0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-3.148396556259198), (-3.148396556259198), (-3.148396556259198));
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[13];
      doubleArray1[2] = Double.NaN;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(432, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // orthogonality tolerance is too small (CONVERGENCE_FAILED), solution is orthogonal to the jacobian
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[2];
      circleVectorial0.addPoint(432, 432);
      VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(432, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
      assertNotNull(vectorialPointValuePair0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-18.92902083580168), (-18.92902083580168), (-18.92902083580168));
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-18.92902083580168);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(462, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parameters relative tolerance is too small (CONVERGENCE_FAILED), no further improvement in the approximate solution is possible
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[8];
      levenbergMarquardtOptimizer0.optimize(462, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
      levenbergMarquardtOptimizer0.rows = 462;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dimensions mismatch: 0 != 462
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }
}