/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 25 06:01:47 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver2;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2((-2244.3674856604193));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        mullerSolver2_0.solve(1036, (UnivariateFunction) quinticFunction0, (double) 1036, (-2244.3674856604193));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,036, -2,244.367]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver(1505.54270256934, 1505.54270256934);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      riddersSolver0.setup(2145, xMinus5Function0, (-143.286322552), 1505.54270256934, (-143.286322552));
      riddersSolver0.incrementEvaluationCount();
      assertEquals((-143.286322552), riddersSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      boolean boolean0 = riddersSolver0.isSequence((-733.2910691927017), 0.5, 0.5);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateFunction univariateFunction0 = quinticFunction0.derivative();
      riddersSolver0.setup(3983, univariateFunction0, (-1738.8), 567.2437648982, 3983);
      riddersSolver0.isBracketing((-1738.8), 755.271865863);
      assertEquals(3983.0, riddersSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateFunction univariateFunction0 = expm1Function0.derivative();
      mullerSolver0.setup(789, univariateFunction0, (-1470.808108), (-3294.11), (-1470.808108));
      mullerSolver0.computeObjectiveValue(0.0);
      assertEquals((-1470.808108), mullerSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      mullerSolver0.setup(789, xMinus5Function0, (-1470.808108), (-3294.11), (-1470.808108));
      mullerSolver0.computeObjectiveValue(0.0);
      assertEquals((-1470.808108), mullerSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver((-2281.4366480822223), (-953.3046603501));
      // Undeclared exception!
      try { 
        mullerSolver0.verifySequence(1.0E-12, (-2428.6529), 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -2,428.653]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      // Undeclared exception!
      try { 
        newtonSolver0.verifyInterval(0.5, (-613));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.5, -613]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver(1.0E-14, 1505.54270256934);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      riddersSolver0.setup(2145, xMinus5Function0, (-143.286322552), 1505.54270256934, (-0.0625));
      // Undeclared exception!
      try { 
        riddersSolver0.verifyBracketing(3.1184473002226595E-10, (-143.286322552));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -143.286]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(2683.241);
      // Undeclared exception!
      try { 
        laguerreSolver0.verifyBracketing(0.0, 2575.04944652);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(566.0, 566.0, 566.0);
      // Undeclared exception!
      try { 
        brentSolver0.setup(68, (UnivariateFunction) null, 566.0, (-1244.2429), 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      try { 
        brentSolver0.computeObjectiveValue((-0.0625));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(1511, (PolynomialFunction) null, (double) 1511, (-2879.194181484742), (double) 1511);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      riddersSolver0.solve(1192, (UnivariateFunction) quinticFunction0, (double) 0, (-662.6256));
      boolean boolean0 = riddersSolver0.isBracketing((-1715.1064354124342), 2220.5);
      assertEquals((-662.6256), riddersSolver0.getMax(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      // Undeclared exception!
      try { 
        riddersSolver0.isBracketing((-1738.8), 755.271865863);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver((-1491.7213));
      boolean boolean0 = newtonSolver0.isSequence((-2458.69378), 0.0, 3460.957206);
      assertTrue(boolean0);
      assertEquals((-1491.7213), newtonSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, newtonSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver(1505.54270256934, 1505.54270256934);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      riddersSolver0.setup(2145, xMinus5Function0, (-143.286322552), 1505.54270256934, (-143.286322552));
      double double0 = riddersSolver0.doSolve();
      assertEquals((-143.286322552), riddersSolver0.getStartValue(), 0.01);
      assertEquals(4.999999999999943, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      int int0 = riddersSolver0.getMaxEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1507.051036, 1507.051036, 345);
      SinFunction sinFunction0 = new SinFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateFunction) sinFunction0);
      bracketingNthOrderBrentSolver0.solve(1307, (UnivariateFunction) monitoredFunction0, 0.0);
      bracketingNthOrderBrentSolver0.computeObjectiveValue(0.0);
      assertEquals(Double.NaN, bracketingNthOrderBrentSolver0.getMin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver((-1491.7213));
      newtonSolver0.verifyInterval((-1), 0);
      assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, newtonSolver0.getRelativeAccuracy(), 0.01);
      assertEquals((-1491.7213), newtonSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) 368, 368);
      bracketingNthOrderBrentSolver0.verifySequence((-2710.375316891216), 542.13291249412, 1799.9446377);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(368.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      int int0 = riddersSolver0.getEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver(1505.54270256934, 1505.54270256934);
      // Undeclared exception!
      try { 
        riddersSolver0.incrementEvaluationCount();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
}
