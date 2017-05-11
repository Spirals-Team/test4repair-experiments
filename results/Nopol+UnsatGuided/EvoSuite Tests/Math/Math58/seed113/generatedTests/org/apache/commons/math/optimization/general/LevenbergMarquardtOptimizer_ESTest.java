/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 20 21:17:00 GMT 2017
 */

package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LevenbergMarquardtOptimizer_ESTest extends LevenbergMarquardtOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(0.0, 2082.413115, 2082.413115);
      levenbergMarquardtOptimizer0.rows = (-1504);
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
  public void test1()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(1118.4120056, 1118.4120056, (-4336.7941), (-4336.7941), 1118.4120056);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(0.0, 0.0, 0.0);
      levenbergMarquardtOptimizer0.rows = 208;
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
  public void test3()  throws Throwable  {
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
}
