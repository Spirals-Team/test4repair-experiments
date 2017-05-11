/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 14 11:24:28 GMT 2017
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = regulaFalsiSolver0.solve(255, (UnivariateRealFunction) quinticFunction0, 1.0, (double) 255, (double) 255);
      assertEquals(255.0, regulaFalsiSolver0.getMax(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
      assertNotNull(baseSecantSolver_MethodArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BaseSecantSolver.Method.valueOf("ILLINOIS");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1738, (UnivariateRealFunction) quinticFunction0, 0.0, (double) 1738, allowedSolution0);
      assertEquals(869.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0, 0.625);
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1177, univariateRealFunction0, (-269.289002721308), (-2282.0042700474), (-679.493015), allowedSolution0);
      assertEquals((-679.493015), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-2282.0042700474), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = regulaFalsiSolver0.solve(255, (UnivariateRealFunction) quinticFunction0, 0.0, (-1693.568099732), 3763.85634);
      assertEquals((-1693.568099732), regulaFalsiSolver0.getMax(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-431), (UnivariateRealFunction) expm1Function0, 0.0, (double) (-431), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-431) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) quinticFunction0);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3, (UnivariateRealFunction) monitoredFunction0, (double) 3, (double) 3, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3, 3]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1023, (UnivariateRealFunction) sinFunction0, (-3482.02629254), 1941.5042599184922, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-3,482.026, 1,941.504], values: [-0.909, -0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1130.02), (-3055.35596312));
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1291, (UnivariateRealFunction) monitoredFunction0, (-1130.02), 3140.37647120637, allowedSolution0);
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
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-5832), (UnivariateRealFunction) xMinus5Function0, 0.0, 0.031, (double) (-5832), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-5,832) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2, (UnivariateRealFunction) expm1Function0, 181.551808, (-685.246666943), 0.0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [181.552, -685.247]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.003, 0.003);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3, (UnivariateRealFunction) monitoredFunction0, 0.0, 1.0E-15, 0.087, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 0], values: [1, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(4703.24963, 12.0);
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1168, (UnivariateRealFunction) monitoredFunction0, (double) 1168, 0.5, 4535.98, allowedSolution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-221.35), (-0.16624879837036133), 0.0);
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-3830), (UnivariateRealFunction) sincFunction0, 0.0, 1.0E-6, 594.3);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-3,830) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(34, (UnivariateRealFunction) sincFunction0, 906.8, 906.8, (double) 34);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [906.8, 906.8]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2019.9), (-2019.9), 1284.03);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      UnivariateRealFunction univariateRealFunction0 = xMinus5Function0.derivative();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(5064, univariateRealFunction0, 1.176342548272881E-8, 1284.03, (double) 5064);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 1,284.03], values: [1, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(498.11089);
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
      SinFunction sinFunction0 = new SinFunction();
      illinoisSolver0.setup(262, sinFunction0, 262, (-844.0264527774267), 712.457884);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [262, -844.026]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      pegasusSolver0.setup(2887, sinFunction0, 28.26031840618686, 2887, 0.5);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [28.26, 2,887], values: [0.014, 0.123]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1023, (UnivariateRealFunction) sinFunction0, (double) 1023, 2898.35, (double) 1023, allowedSolution0);
      assertEquals(1023.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2569.8227906364505, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(1023, (UnivariateRealFunction) sinFunction0, (double) 1023, 2898.3496680270728, 223.45574354738, allowedSolution0);
      assertEquals(223.45574354738, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1941.5042599184924, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 795.36193);
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1496, univariateRealFunction0, 2.0, 1377.14, allowedSolution0);
      assertEquals(689.57, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1371.6155767220234, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      pegasusSolver0.setup(137, sinFunction0, 137, 4456.36185, 6.881225132664271);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(980.1769079200158, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(737.3895065, 11.263728146946836, 11.263728146946836);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(828, (UnivariateRealFunction) monitoredFunction0, (-1561.16473), (double) 828, allowedSolution0);
      assertEquals(5, monitoredFunction0.getCallsCount());
      assertEquals(440.9708032893344, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(2143672144, (UnivariateRealFunction) sinFunction0, (-944.78653208), 3.0, allowedSolution0);
      assertEquals((-470.89326604), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-728.849495632832), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2143672144, (UnivariateRealFunction) sinFunction0, (-944.78653208), 3.0, allowedSolution0);
      assertEquals(3.0, regulaFalsiSolver0.getMax(), 0.01);
      assertEquals((-728.8494954988815), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(737.3895065, 11.263728146946836, 11.263728146946836);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2143672144, (UnivariateRealFunction) sinFunction0, (-944.78653208), 0.5, allowedSolution0);
      assertEquals((-472.14326604), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-371.1897210115454), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(2143672144, (UnivariateRealFunction) sinFunction0, (-944.78653208), 3.0, allowedSolution0);
      assertEquals((-470.89326604), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-728.8494954988815), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2143672151, (UnivariateRealFunction) sinFunction0, (-944.78653208), 0.5, allowedSolution0);
      assertEquals((-472.14326604), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-18.84955592153876), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2143672144, (UnivariateRealFunction) sinFunction0, (-944.78653208), 0.5, allowedSolution0);
      assertEquals(0.5, regulaFalsiSolver0.getMax(), 0.01);
      assertEquals((-18.849556921538756), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-0.5), (-0.5), 0.7076665202829873);
      SincFunction sincFunction0 = new SincFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) sincFunction0);
      double double0 = illinoisSolver0.solve(133, (UnivariateRealFunction) monitoredFunction0, (-1492.5547339578), 0.5718793159141403, (-0.5));
      assertEquals(5, monitoredFunction0.getCallsCount());
      assertEquals((-1492.2442085397374), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(1023, (UnivariateRealFunction) sinFunction0, (double) 1023, 2898.3496680270728, 0.5, allowedSolution0);
      assertEquals(0.5, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1941.5042599184924, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      double double0 = regulaFalsiSolver0.solve(335791812, (UnivariateRealFunction) xMinus5Function0, (-1858.6603836805948), 1690.069354358639, (-1858.6603836805948));
      assertEquals((-1858.6603836805948), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(5.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-959.63001407586), 0.5);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(15, (UnivariateRealFunction) expm1Function0, (-959.63001407586), 0.0, 0.0, allowedSolution0);
      assertEquals((-959.63001407586), illinoisSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      pegasusSolver0.setup(2887, sinFunction0, 0.0, 0.0, 0.0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-0.5));
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(133, (UnivariateRealFunction) monitoredFunction0, (-1492.5547), 0.5718793159141403, (-4736.31928));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      regulaFalsiSolver0.solve(2143672151, (UnivariateRealFunction) sinFunction0, (-944.78653208), 0.5, allowedSolution0);
      regulaFalsiSolver0.doSolve();
  }
}
