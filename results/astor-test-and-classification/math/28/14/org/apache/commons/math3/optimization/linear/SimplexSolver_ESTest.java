/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 14:39:03 GMT 2017
 */

package org.apache.commons.math3.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
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
  public void test1()  throws Throwable  {
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
  public void test2()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
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

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (double) 100);
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(0, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0, 0);
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-157.772205163479));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100.0);
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
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0, 0);
      double[] doubleArray0 = new double[8];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-157.772205163479));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100.0);
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
      double[] doubleArray0 = new double[4];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertNotSame(pointValuePair1, pointValuePair0);
  }
}