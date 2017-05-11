/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 15:09:12 GMT 2017
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
      BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
      assertNotNull(baseSecantSolver_MethodArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseSecantSolver.Method.valueOf("ILLINOIS");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(39.5);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(3504, (UnivariateRealFunction) expm1Function0, (-3293.8489823309), 0.0, allowedSolution0);
      assertEquals((-3293.8489823309), regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0E-6);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1205, (UnivariateRealFunction) quinticFunction0, (-1.0), (double) 1205, allowedSolution0);
      assertEquals((-1.0), pegasusSolver0.getMin(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = regulaFalsiSolver0.solve(3776, (UnivariateRealFunction) expm1Function0, 0.0, 0.008641031970818228, 9.738936877454163E-13);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(39.5);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      regulaFalsiSolver0.solve(3504, (UnivariateRealFunction) expm1Function0, 4553.73579889, 0.0, (-3293.8489823309), allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(4553.73579889, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-273.0));
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-430), (UnivariateRealFunction) sincFunction0, 0.0, 0.0, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-430) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2582, (UnivariateRealFunction) xMinus5Function0, (double) 2582, 0.0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,582, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(4950.161376776148, 4950.161376776148);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(3, (UnivariateRealFunction) null, 4950.161376776148, 4950.161376776148, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2440.460982824195);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-430), (UnivariateRealFunction) sincFunction0, 0.0, 2440.460982824195, (double) (-430), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-430) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1057, (UnivariateRealFunction) quinticFunction0, (double) 1057, 652.35347683, (double) 1057, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,057, 652.353]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 1493.4437705458126, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-1216), (UnivariateRealFunction) null, (-261.3693), 274.6282, (-4462.135717214), allowedSolution0);
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
      PegasusSolver pegasusSolver0 = new PegasusSolver(2440.460982824195);
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(118, (UnivariateRealFunction) sincFunction0, 0.0, (double) 118, 0.0, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1, (UnivariateRealFunction) quinticFunction0, 0.0, 0.0, (-1138.545130547));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1025, (UnivariateRealFunction) quinticFunction0, 2868.36396997, (double) 1025, 2.4384203044354907E-8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,868.364, 1,025]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1003), (UnivariateRealFunction) null, -0.0, 0.005740246800479706, (-6.931128735776204E-4));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1612.7));
      SincFunction sincFunction0 = new SincFunction();
      pegasusSolver0.setup(5, sincFunction0, 307.2703437, (-1612.7), (-1612.7));
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [307.27, -1,612.7]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      illinoisSolver0.setup(702, monitoredFunction0, (-2733.51706849843), 0.0, 0.0);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-2,733.517, 0], values: [0.946, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.7564283208000936);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(112, (UnivariateRealFunction) sincFunction0, (-2.1494168261657992E-5), (double) 112, (-2.1494168261657992E-5), allowedSolution0);
      assertEquals(109.27768571231735, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2440.460982824195);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(118, (UnivariateRealFunction) sincFunction0, 0.0, (double) 118, 0.0, allowedSolution0);
      assertEquals(117.02615183366147, double0, 0.01);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2440.460982824195);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(118, (UnivariateRealFunction) sincFunction0, 0.0, (double) 118, 0.0, allowedSolution0);
      assertEquals(117.02615183366147, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.7564283208000936);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(112, (UnivariateRealFunction) sincFunction0, 27.77172288296264, (double) 112, 27.77172288296264, allowedSolution0);
      assertEquals(27.77172288296264, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(84.74610313354984, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2.1494168261657992E-5), 0.7564283208000936, (-2.1494168261657992E-5));
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(112, (UnivariateRealFunction) sincFunction0, (-0.44305709109412605), (double) 112, (-2.1494168261657992E-5), allowedSolution0);
      assertEquals((-0.44305709109412605), pegasusSolver0.getMin(), 0.01);
      assertEquals(109.95043240539201, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2440.460982824195);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(118, (UnivariateRealFunction) sincFunction0, 0.0, (double) 118, 0.0, allowedSolution0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2440.460982824195);
      SincFunction sincFunction0 = new SincFunction();
      double double0 = pegasusSolver0.solve(118, (UnivariateRealFunction) sincFunction0, (double) 118, 2440.460982824195, 0.0);
      assertEquals(118.0, pegasusSolver0.getMin(), 0.01);
      assertEquals(2381.5853212619786, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-273.0));
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(112, (UnivariateRealFunction) sincFunction0, 0.0, (double) 112, (-273.0), allowedSolution0);
      assertEquals((-273.0), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(109.95574287564277, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-267.2482863147398));
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(112, (UnivariateRealFunction) sincFunction0, 876.0, 1844.9411543357376, 876.0, allowedSolution0);
      assertEquals(876.0, pegasusSolver0.getMin(), 0.01);
      assertEquals(876.5043503515524, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(118, (UnivariateRealFunction) sincFunction0, 0.0, (double) 118, 0.0, allowedSolution0);
      assertEquals(116.23892818282326, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(118, (UnivariateRealFunction) sincFunction0, 0.0, (double) 118, 0.0, allowedSolution0);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(116.23892818282326, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0), (-1.0));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2385, univariateRealFunction0, 0.3333333134651184, 2458.07, allowedSolution0);
      assertEquals(1229.2016666567326, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.8222164340791341, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      double double0 = regulaFalsiSolver0.solve(314, (UnivariateRealFunction) sincFunction0, (-0.22289071769194038), (double) 314, (-1197.4772));
      assertEquals((-0.22289071769194038), regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(311.01767270538954, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-273.0));
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      pegasusSolver0.solve(112, (UnivariateRealFunction) sincFunction0, 0.0, (double) 112, (-273.0), allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-273.0), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(109.95574287564276, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1896.1198121228613), (-1896.1198121228613));
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      double double0 = pegasusSolver0.solve(175, (UnivariateRealFunction) xMinus5Function0, (-1896.1198121228613), (double) 175, 2052.0);
      assertEquals((-1896.1198121228613), pegasusSolver0.getMin(), 0.01);
      assertEquals(5.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1298.8514208574));
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      double double0 = illinoisSolver0.solve(853, univariateRealFunction0, (double) 853, (-3501.37039047986), 0.5);
      assertEquals(0.5, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-3501.37039047986), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0E-6);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      pegasusSolver0.solve(8, (UnivariateRealFunction) quinticFunction0, (-1.0), (double) 8, (-1.0E-6), allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-1.0E-6), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }
}