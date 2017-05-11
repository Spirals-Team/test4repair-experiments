/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 20 00:37:50 GMT 2017
 */

package org.apache.commons.math3.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealVectorAbstractTest;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.linear.LinearConstraint;
import org.apache.commons.math3.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optimization.linear.SimplexSolver;
import org.apache.commons.math3.optimization.linear.SimplexTableau;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimplexSolver_ESTest extends SimplexSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[2];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (double) 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.3936265707015991, 100);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, simplexSolver0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(2256.415, 10);
      double[] doubleArray0 = new double[15];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 2256.415);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertNotSame(pointValuePair1, pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(2256.415, 10);
      double[] doubleArray0 = new double[15];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 2256.415);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 2256.415);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(2256.415, 10);
      double[] doubleArray0 = new double[15];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 2256.415);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 2256.415);
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[19];
      doubleArray0[5] = (double) 100;
      RealVectorAbstractTest.RealVectorTestImpl realVectorAbstractTest_RealVectorTestImpl0 = new RealVectorAbstractTest.RealVectorTestImpl(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction((RealVector) realVectorAbstractTest_RealVectorTestImpl0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
}
