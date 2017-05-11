/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 16 07:17:48 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BaseSecantSolver.Method.valueOf("ILLINOIS");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
      assertNotNull(baseSecantSolver_MethodArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(36, (UnivariateRealFunction) expm1Function0, (double) 36, 0.0, allowedSolution0);
      assertEquals(18.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1272.6964665);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(2280, (UnivariateRealFunction) quinticFunction0, 0.0, 2293.208494860007, 0.0, allowedSolution0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-30.881027484905786), (-30.881027484905786), (-335.300444));
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(2, univariateRealFunction0, 9.50585857421585E-10, (double) 2, 9.50585857421585E-10, allowedSolution0);
      assertEquals(9.50585857421585E-10, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(9.50585857421585E-10, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) quinticFunction0);
      regulaFalsiSolver0.solve(60, (UnivariateRealFunction) monitoredFunction0, 0.0, 0.0, (double) 60);
      regulaFalsiSolver0.doSolve();
      assertEquals(60.0, regulaFalsiSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) xMinus5Function0, (double) 0, (double) 0, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(24, (UnivariateRealFunction) expm1Function0, (double) 24, (double) 24, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [24, 24]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3.0), 2975.7);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(4160, (UnivariateRealFunction) sincFunction0, 3.5038234983417587, 2975.7, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [3.504, 2,975.7], values: [-0.101, -0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0));
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(3509, (UnivariateRealFunction) monitoredFunction0, 0.5, 0.08713622391223907, allowedSolution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-614), (UnivariateRealFunction) sinFunction0, (double) (-614), (double) (-614), (double) (-614), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-614) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1.0), (-1.0), 0.5);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(8388607, univariateRealFunction0, 0.5, 1.0E-6, (-1.0), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.5, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1309.708001949648, 1309.708001949648);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1025, (UnivariateRealFunction) expm1Function0, 1.7029898543501842E-8, (double) 1025, (-1321.84416880004), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 1,025], values: [0, \u221E]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-5040.817), (-5040.817), (-5040.817));
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(245, (UnivariateRealFunction) sincFunction0, (-5040.817), (double) 245, (-5040.817));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (245) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3275, (UnivariateRealFunction) quinticFunction0, (double) 3275, (double) 3275, (-2686.6298932308473));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,275, 3,275]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-4072.449587835));
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1170, (UnivariateRealFunction) monitoredFunction0, (-4072.449587835), 1.0E-6, (double) 1170);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-4,072.45, 0], values: [0.585, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.5, 1.0E-6, (-336.2));
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1099, (UnivariateRealFunction) monitoredFunction0, 8388607.0, 3129.65501293231, 484.5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2124.12992159));
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      regulaFalsiSolver0.setup(1531, xMinus5Function0, 978.4, (-1767.5), 1.0);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [978.4, -1,767.5]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.07404736404715513, 0.07404736404715513);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      pegasusSolver0.setup(1541, quinticFunction0, 1541, 2232.999, 0.7249995199969751);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1,541, 2,232.999], values: [8,689,863,707,334,810, 55,519,114,921,827,840]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3.0));
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(4160, (UnivariateRealFunction) sinFunction0, (-1619.2789), (-3.0), allowedSolution0);
      assertEquals((-811.13945), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-153.93804002589988), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3.0), 2975.7);
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(4160, univariateRealFunction0, (-3.0), 3.5038234983417587, allowedSolution0);
      assertEquals(0.25191174917087933, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.8517094187400311, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3.0), 2975.7);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(4160, (UnivariateRealFunction) quinticFunction0, (-3.0), 0.013816239016051056, allowedSolution0);
      assertEquals((-1.4930918804919744), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.013766716176276752, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3.0), 2974.6517737940158);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1065, (UnivariateRealFunction) sincFunction0, (-1147.32480155487), 2974.6517737940158, allowedSolution0);
      assertEquals(913.6634861195728, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-496.1936618456102), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3.0));
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(4160, (UnivariateRealFunction) sinFunction0, (-1619.2789), 2976.3532225558506, allowedSolution0);
      assertEquals(678.5371612779252, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(204.20352248333654, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(36, (UnivariateRealFunction) sincFunction0, (-1206.086), 0.0, allowedSolution0);
      assertEquals((-603.043), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1203.229986324891), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = pegasusSolver0.solve(4160, (UnivariateRealFunction) quinticFunction0, (-3.0), 0.029592965257884303, allowedSolution0);
      assertEquals((-1.4852035173710578), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.7936620343357659E-43), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1069, (UnivariateRealFunction) sincFunction0, (-3.0), 2975.7, allowedSolution0);
      assertEquals(1486.35, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2799.1590543485054, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3.0), 2975.9429941985286, 2975.9429941985286);
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(4160, univariateRealFunction0, (-3.0), 0.013816239016051056, allowedSolution0);
      assertEquals((-1.4930918804919744), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.013816239016051056, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(4160, (UnivariateRealFunction) sincFunction0, (-106.59821678), (double) 4160, allowedSolution0);
      assertEquals(2026.70089161, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2846.2829441485137, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(3832.521382);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      illinoisSolver0.solve(5370, (UnivariateRealFunction) quinticFunction0, (-1217.682), (double) 5370);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(2076.1589999999997, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-0.9968767106042741), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3.0));
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(4160, (UnivariateRealFunction) sinFunction0, (-1619.2789), 2976.3532225558506, allowedSolution0);
      assertEquals((-1619.2789), pegasusSolver0.getMin(), 0.01);
      assertEquals(204.20352248333657, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = pegasusSolver0.solve(1065, (UnivariateRealFunction) quinticFunction0, (-1147.32480155487), 2975.7, allowedSolution0);
      assertEquals(914.1875992225648, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2.718281828459045, 2.718281828459045, 0.0);
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(19, univariateRealFunction0, 2.718281828459045, (-1312.67144274), 2.718281828459045, allowedSolution0);
      assertEquals(2.718281828459045, pegasusSolver0.getMin(), 0.01);
      assertEquals((-1312.67144274), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-7.44321345601866E-11), (-7.44321345601866E-11));
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      double double0 = regulaFalsiSolver0.solve(8388607, univariateRealFunction0, (-7.44321345601866E-11), (double) 8388607, (-758.51));
      assertEquals((-758.51), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-7.44321345601866E-11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-7.44321345601866E-11), (-7.44321345601866E-11));
      SinFunction sinFunction0 = new SinFunction();
      regulaFalsiSolver0.solve(8388607, (UnivariateRealFunction) sinFunction0, (-7.44321345601866E-11), (double) 8388607, (-758.1756474495285));
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals((-758.1756474495285), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(4.87890977618477E-18, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3.0), (-3.0));
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(4160, (UnivariateRealFunction) sinFunction0, (-3.0), 0.013816239016051056, allowedSolution0);
      assertEquals(0.013816239016051056, pegasusSolver0.getMax(), 0.01);
      assertEquals(3.4512664603419266E-31, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3.0));
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      pegasusSolver0.solve(4160, (UnivariateRealFunction) sinFunction0, (-3.0), 4.9E-324, allowedSolution0);
  }
}