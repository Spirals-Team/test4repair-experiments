/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 20 18:22:35 GMT 2017
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
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[2];
      VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(1209, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
      VectorialPointValuePair vectorialPointValuePair1 = levenbergMarquardtOptimizer0.doOptimize();
      assertFalse(vectorialPointValuePair1.equals((Object)vectorialPointValuePair0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
  public void test2()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.rows = (-3543);
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
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-0.7853981633974483), (-0.7853981633974483), 1271.154314, (-0.7853981633974483), (-0.7853981633974483));
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (double) 1209;
      VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(1209, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
      assertNotNull(vectorialPointValuePair0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(0.0, 0.0, 0.0);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[2];
      levenbergMarquardtOptimizer0.optimize(1209, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
      levenbergMarquardtOptimizer0.cols = 1209;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }
}
