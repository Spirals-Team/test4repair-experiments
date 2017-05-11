/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 16 23:27:35 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver2;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver((-5451.42057469777), (-5451.42057469777));
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      try { 
        riddersSolver0.solve(71, (UnivariateFunction) sincFunction0, (double) 71, (double) 71);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [71, 71]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.verifySequence(Double.NaN, Double.NaN, Double.NaN);
      assertEquals(0.0, laguerreSolver0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.verifyInterval(Double.NaN, Double.NaN);
      assertEquals(0.0, laguerreSolver0.getMin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(0.5);
      SincFunction sincFunction0 = new SincFunction();
      mullerSolver2_0.setup(701, sincFunction0, 0.0, (-39.54112), 670.16269);
      mullerSolver2_0.verifyBracketing((-565.1), 0.0);
      assertEquals(670.16269, mullerSolver2_0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(0.0, 0.0, 0.5);
      boolean boolean0 = laguerreSolver0.isSequence((-2119.0), 0.0, 0.5);
      assertEquals(0.5, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, laguerreSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(0.0, laguerreSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      bisectionSolver0.setup(0, expm1Function0, 0.0, 1009.61, 1297.8733672657083);
      boolean boolean0 = bisectionSolver0.isBracketing(1857.27, (-2427.1));
      assertEquals(1009.61, bisectionSolver0.getMax(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      SincFunction sincFunction0 = new SincFunction();
      mullerSolver2_0.setup(701, sincFunction0, 701, 4105.238404107264, 4105.238404107264);
      mullerSolver2_0.isBracketing(701, 701);
      assertEquals(4105.238404107264, mullerSolver2_0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(0.5);
      SincFunction sincFunction0 = new SincFunction();
      mullerSolver2_0.setup(701, sincFunction0, 701, (-39.54112), 670.16269);
      mullerSolver2_0.computeObjectiveValue(2617.3488132101843);
      assertEquals(701.0, mullerSolver2_0.getMin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver(2.0, Double.NaN);
      // Undeclared exception!
      try { 
        bisectionSolver0.verifySequence(1.0, (-1849.6), 0.5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1, -1,849.6]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver(5.0);
      // Undeclared exception!
      try { 
        riddersSolver0.verifyInterval(5.0, 5.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [5, 5]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(0.5);
      SincFunction sincFunction0 = new SincFunction();
      mullerSolver2_0.setup(701, sincFunction0, 701, (-39.54112), 670.16269);
      // Undeclared exception!
      try { 
        mullerSolver2_0.verifyBracketing(747, (-1.495337053742998E-4));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [747, -0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.setup(1, (UnivariateFunction) null, (-6642.4482), 1134.778121855625, (-4320.85491109));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.incrementEvaluationCount();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver(4486.553);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(285, (UnivariateFunction) quinticFunction0, 2.0, 2.0, 2.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2, 2]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(0.5);
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      try { 
        mullerSolver2_0.solve(701, (UnivariateFunction) sincFunction0, (-1972.44463));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (701) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver((-2347.5083908));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        mullerSolver0.solve(0, (UnivariateFunction) quinticFunction0, (-2347.5083908), 2.0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.isBracketing(1857.27, (-2427.1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(0.5);
      SincFunction sincFunction0 = new SincFunction();
      mullerSolver2_0.setup(701, sincFunction0, 0.0, (-39.54112), 670.16269);
      mullerSolver2_0.computeObjectiveValue(0.0);
      assertEquals(670.16269, mullerSolver2_0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(0.5);
      // Undeclared exception!
      try { 
        mullerSolver2_0.verifyBracketing((-565.1), 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      boolean boolean0 = laguerreSolver0.isSequence(Double.NaN, Double.NaN, (-0.5291769530497932));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(0.5);
      mullerSolver2_0.getMaxEvaluations();
      assertEquals(0.5, mullerSolver2_0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver2_0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver2_0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      int int0 = bisectionSolver0.getEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(0.5);
      try { 
        mullerSolver2_0.computeObjectiveValue(2617.3488132101843);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
}
