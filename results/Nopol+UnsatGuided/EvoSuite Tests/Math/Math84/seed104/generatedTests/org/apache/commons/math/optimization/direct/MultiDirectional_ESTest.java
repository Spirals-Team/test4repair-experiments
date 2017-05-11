/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 22 11:08:27 GMT 2017
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
      MultiDirectional multiDirectional0 = new MultiDirectional(0.0, (-1364.1581246));
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[6];
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (-1364.1581246);
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, (-201.45));
      realPointValuePairArray0[0] = realPointValuePair0;
      realPointValuePairArray0[1] = realPointValuePair0;
      double[] doubleArray1 = new double[4];
      RealPointValuePair realPointValuePair1 = new RealPointValuePair(doubleArray1, 0.0323);
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
  public void test1()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[2];
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 801.815147;
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 2710.5, true);
      realPointValuePairArray0[0] = realPointValuePair0;
      realPointValuePairArray0[1] = realPointValuePairArray0[0];
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
  public void test2()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional((-951.05), (-951.05));
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[23];
      double[] doubleArray0 = new double[0];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, (-951.05));
      realPointValuePairArray0[0] = realPointValuePair0;
      multiDirectional0.simplex = realPointValuePairArray0;
      // Undeclared exception!
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.direct.MultiDirectional", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[8];
      double[] doubleArray0 = new double[1];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 2256.29358);
      realPointValuePairArray0[0] = realPointValuePair0;
      realPointValuePairArray0[1] = realPointValuePair0;
      multiDirectional0.setMaxEvaluations(0);
      multiDirectional0.simplex = realPointValuePairArray0;
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of evaluations (0) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional(1.1, 1856.91242629);
      multiDirectional0.setMaxIterations((-413));
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-413) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}