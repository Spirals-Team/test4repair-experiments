/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 22 06:40:38 GMT 2017
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
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2, (UnivariateRealFunction) monitoredFunction0, 0.0, (-1232.28634), allowedSolution0);
      assertEquals((-1232.28634), pegasusSolver0.getMax(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.17496926661752185);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) quinticFunction0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(275, (UnivariateRealFunction) monitoredFunction0, (-1.0), 0.17496926661752185, (-1.0), allowedSolution0);
      assertEquals((-1.0), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(165.03601, 0.99);
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      double double0 = pegasusSolver0.solve(1023, (UnivariateRealFunction) monitoredFunction0, (double) 1023, 0.0, 0.0);
      assertEquals(1023.0, pegasusSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0), (-2863.67825671518));
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      double double0 = pegasusSolver0.solve(398, univariateRealFunction0, 0.0, (-2863.67825671518), 0.5);
      assertEquals(0.5, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-2863.67825671518), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      illinoisSolver0.setup(367, quinticFunction0, 1.0E-6, 0.0, 367);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      illinoisSolver0.setup(367, quinticFunction0, 1.0E-6, (-1.0), 367);
      double double0 = illinoisSolver0.doSolve();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1, (UnivariateRealFunction) xMinus5Function0, (double) 1, (-2.8985943011601408E-5), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(14, (UnivariateRealFunction) sincFunction0, (double) 14, (double) 14, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [14, 14]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2826.76581964699, 2192.0466262363043);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2331, (UnivariateRealFunction) sincFunction0, (-2452.42839), 0.0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-2,452.428, 0], values: [0, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-3469), (UnivariateRealFunction) sincFunction0, 1.0E-6, 1.0E-6, (double) (-3469), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-3,469) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(382.336);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(192, (UnivariateRealFunction) quinticFunction0, (-978.18), (-978.18), (-978.18), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-978.18, -978.18]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1796.788238), 0.0, 0.0);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(4097, (UnivariateRealFunction) xMinus5Function0, (-548.95334), 0.0, (-1798.66565219659), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-548.953, 0], values: [-553.953, -5]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-601.6557562547));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-2988), (UnivariateRealFunction) quinticFunction0, (-601.6557562547), 1839.0233162643, (double) (-2988));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,988) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(4, (UnivariateRealFunction) sinFunction0, (double) 4, (double) 4, (-3.3871892168560223));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [4, 4]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(4, (UnivariateRealFunction) sinFunction0, (-0.25), (double) 4, (-0.25));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-0.25, 4], values: [-0.247, -0.757]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
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
  public void test18()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      illinoisSolver0.setup(367, quinticFunction0, 1.0E-6, 1.0E-6, 367);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      illinoisSolver0.setup(367, quinticFunction0, 1.0E-6, 15.639481350467259, 367);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 15.639], values: [0, 930,868.628]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2265.42999842671, 2265.42999842671);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(14, (UnivariateRealFunction) quinticFunction0, 0.75, 1372.3588667886, 1.0E-6, allowedSolution0);
      assertEquals(1372.3588667886, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2265.42999842671, 2265.42999842671);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(14, (UnivariateRealFunction) sincFunction0, (-1261.5704389), (double) 14, allowedSolution0);
      assertEquals((-623.78521945), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1247.7791049070356), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2265.82177);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(9, (UnivariateRealFunction) sincFunction0, (-1261.5704389), (double) 9, allowedSolution0);
      assertEquals(9.0, regulaFalsiSolver0.getMax(), 0.01);
      assertEquals((-1240.467552804072), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2265.82177);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(3, (UnivariateRealFunction) sincFunction0, (-1261.5704389), (double) 3, allowedSolution0);
      assertEquals((-629.28521945), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1241.1158876473717), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.0E-6, 1.0E-6);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(2930, (UnivariateRealFunction) sincFunction0, (-4139.855530522), (-1736.2), allowedSolution0);
      assertEquals((-2938.027765261), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-3226.4156476147914), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2265.82177);
      SincFunction sincFunction0 = new SincFunction();
      double double0 = regulaFalsiSolver0.solve(911, (UnivariateRealFunction) sincFunction0, 2.0361168711330653E-10, 1350.5, 1350.5);
      assertEquals(1350.5, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1350.1246925164533, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2265.82177, 2265.82177, 2265.82177);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(14, (UnivariateRealFunction) sincFunction0, 1.3105776597833636, 2265.82177, allowedSolution0);
      assertEquals(1133.5661738298916, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2265.82177, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(14, (UnivariateRealFunction) sincFunction0, (-1261.5704389), (double) 14, allowedSolution0);
      assertEquals(14.0, regulaFalsiSolver0.getMax(), 0.01);
      assertEquals((-1247.2122834751478), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2265.82177, 2265.82177, 2265.82177);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(14, (UnivariateRealFunction) sincFunction0, (-1261.5704389), 0.5, allowedSolution0);
      assertEquals(0.5, regulaFalsiSolver0.getMax(), 0.01);
      assertEquals((-1260.5533035658682), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.0E-6, 1.0E-6, 1.0E-6);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(2930, (UnivariateRealFunction) sincFunction0, (-4139.855530522), (-1736.2), allowedSolution0);
      assertEquals((-1736.2), illinoisSolver0.getMax(), 0.01);
      assertEquals((-1737.3007352398367), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2265.82177, 2265.82177, 2265.82177);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2065, (UnivariateRealFunction) sinFunction0, (-0.3058015757857271), (double) 14, allowedSolution0);
      assertEquals(14.0, regulaFalsiSolver0.getMax(), 0.01);
      assertEquals((-0.3058015757857271), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      double double0 = regulaFalsiSolver0.solve(911, (UnivariateRealFunction) sincFunction0, 2.0361168711330653E-10, 1350.5, 1350.5);
      assertEquals(1350.5, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1347.743248390022, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(14, (UnivariateRealFunction) sincFunction0, (-1261.5704389), 1.2843, allowedSolution0);
      assertEquals((-630.14306945), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1259.778653425739), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      illinoisSolver0.solve(3266, (UnivariateRealFunction) sincFunction0, (-2627.3423302), 745.2127335776034, 745.2127335776034, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(745.2127335776034, illinoisSolver0.getMax(), 0.01);
      assertEquals(744.5574589007812, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(437.219);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      double double0 = regulaFalsiSolver0.solve(77, (UnivariateRealFunction) xMinus5Function0, (-2590.143), (double) 77);
      assertEquals((-1256.5715), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(5.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, (-1069.785));
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(372, (UnivariateRealFunction) sinFunction0, (-1069.785), 0.0, (-507.1911582), allowedSolution0);
      assertEquals((-1069.785), regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(14, (UnivariateRealFunction) sincFunction0, (-1261.5704389), 1.2842724652143946, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }
}
