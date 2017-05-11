/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 20 13:07:02 GMT 2017
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
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-1.8847037487192653), 0.0, (-1.8847037487192653), (-1.8847037487192653), 0.0);
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
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[7];
      levenbergMarquardtOptimizer0.optimize(7, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
      levenbergMarquardtOptimizer0.rows = 7;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dimensions mismatch: 0 != 7
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(4196.3832376, (-2013.53593), (-318.603236));
      levenbergMarquardtOptimizer0.rows = (-703);
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
  public void test3()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(43.475812895518295, 43.475812895518295, (-1.06972476384842), (-1.06972476384842), (-1.06972476384842));
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[9];
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(2, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-1.900112276416651), (-1.900112276416651), (-1.900112276416651));
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (-1.900112276416651);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(2, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parameters relative tolerance is too small (CONVERGENCE_FAILED), no further improvement in the approximate solution is possible
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-1.8847037487192653), 0.0, (-1.8847037487192653), (-1.8847037487192653), 0.0);
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[9];
      double[] doubleArray2 = new double[0];
      VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(2146261111, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray2, doubleArray0, doubleArray1);
      assertNotNull(vectorialPointValuePair0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[7];
      VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(7, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
      levenbergMarquardtOptimizer0.cols = 0;
      VectorialPointValuePair vectorialPointValuePair1 = levenbergMarquardtOptimizer0.doOptimize();
      assertNotSame(vectorialPointValuePair1, vectorialPointValuePair0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(43.475812895518295, 43.475812895518295, (-1.06972476384842));
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[9];
      VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(3, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
      assertNotNull(vectorialPointValuePair0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      CircleVectorial circleVectorial0 = new CircleVectorial();
      circleVectorial0.addPoint(783.51237, (-2504));
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[8];
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(10, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }
}
