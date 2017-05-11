/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 22 11:12:40 GMT 2017
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
      MultiDirectional multiDirectional0 = new MultiDirectional(0.0, 0.0);
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[3];
      double[] doubleArray0 = new double[3];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 1911.0499, false);
      realPointValuePairArray0[0] = realPointValuePair0;
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = 1911.0499;
      RealPointValuePair realPointValuePair1 = new RealPointValuePair(doubleArray1, 629.06386699169, false);
      realPointValuePairArray0[1] = realPointValuePair1;
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
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[3];
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = 0.005;
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 2954.47332, false);
      realPointValuePairArray0[0] = realPointValuePair0;
      realPointValuePairArray0[1] = realPointValuePairArray0[0];
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
      MultiDirectional multiDirectional0 = new MultiDirectional();
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[3];
      double[] doubleArray0 = new double[4];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 2954.47332, false);
      realPointValuePairArray0[0] = realPointValuePair0;
      realPointValuePairArray0[1] = realPointValuePairArray0[0];
      RealPointValuePair realPointValuePair1 = new RealPointValuePair(doubleArray0, 1446.54659003416);
      realPointValuePairArray0[2] = realPointValuePair1;
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
  public void test3()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[11];
      double[] doubleArray0 = new double[2];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 1903.5062233901745, false);
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
  public void test4()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional(1108.22, 1108.22);
      multiDirectional0.setMaxIterations((-1818));
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-1,818) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional(4.39, 4.39);
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[8];
      double[] doubleArray0 = new double[0];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 4.39, false);
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
}
