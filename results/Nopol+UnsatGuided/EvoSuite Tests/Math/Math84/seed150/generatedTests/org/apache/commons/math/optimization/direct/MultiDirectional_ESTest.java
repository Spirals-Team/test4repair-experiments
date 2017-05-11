/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 22 11:30:49 GMT 2017
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiDirectional_ESTest extends MultiDirectional_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional(Double.NaN, Double.NaN);
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[3];
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = Double.NaN;
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 0.591, true);
      realPointValuePairArray0[0] = realPointValuePair0;
      realPointValuePairArray0[1] = realPointValuePair0;
      multiDirectional0.simplex = realPointValuePairArray0;
      // Undeclared exception!
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional(0.5, 0.32);
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[4];
      double[] doubleArray0 = new double[3];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 0.5);
      realPointValuePairArray0[0] = realPointValuePair0;
      realPointValuePairArray0[1] = realPointValuePair0;
      RealPointValuePair realPointValuePair1 = new RealPointValuePair(doubleArray0, 0.1411200080598672);
      realPointValuePairArray0[2] = realPointValuePair1;
      multiDirectional0.simplex = realPointValuePairArray0;
      // Undeclared exception!
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional(0.5, 0.32);
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[4];
      double[] doubleArray0 = new double[3];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 0.5);
      realPointValuePairArray0[0] = realPointValuePair0;
      realPointValuePairArray0[1] = realPointValuePair0;
      multiDirectional0.setMaxEvaluations((-710));
      realPointValuePairArray0[2] = realPointValuePairArray0[0];
      realPointValuePairArray0[3] = realPointValuePair0;
      multiDirectional0.simplex = realPointValuePairArray0;
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of evaluations (-710) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional(Double.NaN, Double.NaN);
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[3];
      double[] doubleArray0 = new double[3];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 0.591, true);
      realPointValuePairArray0[0] = realPointValuePair0;
      realPointValuePairArray0[1] = realPointValuePairArray0[0];
      realPointValuePairArray0[2] = realPointValuePair0;
      multiDirectional0.simplex = realPointValuePairArray0;
      // Undeclared exception!
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-938));
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-938) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
