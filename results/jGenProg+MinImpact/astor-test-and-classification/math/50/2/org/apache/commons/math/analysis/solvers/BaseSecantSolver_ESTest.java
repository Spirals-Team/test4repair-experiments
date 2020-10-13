/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 18 00:49:10 GMT 2017
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
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-341.672532010667), 13.07, 13.07);
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(2232, (UnivariateRealFunction) monitoredFunction0, 4.672457227737554E-7, (-2070.99), allowedSolution0);
      assertEquals((-1035.494999766377), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2070.99), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
      assertNotNull(baseSecantSolver_MethodArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BaseSecantSolver.Method.valueOf("PEGASUS");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1572.1427094259, 1572.1427094259, 1572.1427094259);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(4, (UnivariateRealFunction) sinFunction0, 0.0, 920.7780236, allowedSolution0);
      assertEquals(460.3890118, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1426.9592078921858, 0.0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = illinoisSolver0.solve(Integer.MAX_VALUE, (UnivariateRealFunction) quinticFunction0, 0.0, 1426.9592078921858, (-0.9578494700100256));
      assertEquals((-0.9578494700100256), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, (-517.7538339815), 0.0);
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      double double0 = illinoisSolver0.solve(5, univariateRealFunction0, 4.9E-324, 7497.161, 0.0);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, (-1.0));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-1595), (UnivariateRealFunction) quinticFunction0, 0.5, (-1424.926193), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,595) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1572.1427094259, 1572.1427094259, 1572.1427094259);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(4, univariateRealFunction0, 0.0, 1572.1427094259, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 1,572.143], values: [1, 0.223]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2393.9752338302, 876.297899355, (-829.55023387345));
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(152, (UnivariateRealFunction) monitoredFunction0, (double) 152, 1495.80018249431, allowedSolution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(32, (UnivariateRealFunction) sinFunction0, (-0.7853981633974483), (-0.7853981633974483), 0.0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-0.785, -0.785]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2192.9907), (-2192.9907), 3959.106);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2905, (UnivariateRealFunction) null, 3959.106, 3959.106, 0.07692307692307693, allowedSolution0);
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(184.66740082183);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) xMinus5Function0, 0.0, (double) 0, 1264.622073);
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
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(266, (UnivariateRealFunction) sincFunction0, 1928.57827, (-3342.613), 1928.57827);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,928.578, -3,342.613]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2652.84), 0.1666666505023083);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1222.6241), (-4.819469902562238E-19), (-3355.161232112861));
      SinFunction sinFunction0 = new SinFunction();
      illinoisSolver0.setup(3, sinFunction0, 1.0737418222663723E9, 1.0, (-265.03377));
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,073,741,822.266, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(675.13013204538, 1749.48, 1749.48);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      pegasusSolver0.setup(2, quinticFunction0, 675.13013204538, 1455.9, 2);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [675.13, 1,455.9], values: [140,260,785,607,810.03, 6,541,200,692,634,979]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2093.7, (-13.740945544487712));
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1793, (UnivariateRealFunction) sinFunction0, 2093.7, 2629.78705685245, allowedSolution0);
      assertEquals(2361.7435284262247, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2514.2861781897755, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(4032, univariateRealFunction0, (-4003.709481), (double) 4032, allowedSolution0);
      assertEquals((-4003.709481), illinoisSolver0.getMin(), 0.01);
      assertEquals(4016.526207614551, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(4032, univariateRealFunction0, (-4003.71), (double) 4032, allowedSolution0);
      assertEquals((-4003.71), illinoisSolver0.getMin(), 0.01);
      assertEquals((-218.34068942449062), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1572.1427094259);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(4, univariateRealFunction0, 0.0, 920.7780236, allowedSolution0);
      assertEquals(460.3890118, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(470.3007241896308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1846, (UnivariateRealFunction) sincFunction0, 504.9468116404529, (double) 1846, allowedSolution0);
      assertEquals(504.9468116404529, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(1071.2830938741197, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      illinoisSolver0.solve(706462278, (UnivariateRealFunction) sinFunction0, 1.2958646899018938E-9, (double) 706462278, (double) 706462278, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(7.06462278E8, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(3.70497147964503E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(706462278, (UnivariateRealFunction) sincFunction0, 1.2958646899018938E-9, (double) 706462278, (-214.939337), allowedSolution0);
      assertEquals((-214.939337), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(7.064622770470874E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1572.1427094259, 1572.1427094259, 1572.1427094259);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(29, (UnivariateRealFunction) sinFunction0, 920.7780236, 1572.1427094259, (double) 29, allowedSolution0);
      assertEquals(920.7780236, illinoisSolver0.getMin(), 0.01);
      assertEquals(920.7780236, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1572.1427094259, 1572.1427094259, 1572.1427094259);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(4, univariateRealFunction0, 0.0, 920.7780236, allowedSolution0);
      assertEquals(460.3890118, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(920.7780236, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1572.1427094259, 1572.1427094259, 1572.1427094259);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(29, univariateRealFunction0, 0.0, 920.7780236, allowedSolution0);
      assertEquals(460.3890118, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(470.3007241896308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1572.1427094259, 1572.1427094259, 1572.1427094259);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(4, (UnivariateRealFunction) monitoredFunction0, 0.0, (double) 4, 1.0, allowedSolution0);
      assertEquals(5, monitoredFunction0.getCallsCount());
      assertEquals(2.418900874126076, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1572.1427094259, 1572.1427094259, 1572.1427094259);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(4, (UnivariateRealFunction) monitoredFunction0, 0.0, (double) 4, 1572.1427094259, allowedSolution0);
      assertEquals(1572.1427094259, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2.418900874126076, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) sincFunction0);
      double double0 = regulaFalsiSolver0.solve(1846, (UnivariateRealFunction) monitoredFunction0, 504.9468116404529, (double) 1846);
      assertEquals(1175.4734058202266, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1071.2830948741196, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(405, (UnivariateRealFunction) sincFunction0, (double) 405, 582.023060870166, 915.9878140039, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (405) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1572.1427094259, 1572.1427094259, 1572.1427094259);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(4, (UnivariateRealFunction) monitoredFunction0, 0.0, (double) 4, 1.0, allowedSolution0);
      assertEquals(1.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, (-1.0));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(964, (UnivariateRealFunction) quinticFunction0, (-1424.926193), 1647.89, (double) 964, allowedSolution0);
      assertEquals(964.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      regulaFalsiSolver0.solve(1565648374, univariateRealFunction0, (-4.487847957548284E-4), 1.0, 1351.414677);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(1.0, regulaFalsiSolver0.getMax(), 0.01);
      assertEquals((-4.140443467682414E-12), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1426.9592078921858, 0.0);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      illinoisSolver0.solve(Integer.MAX_VALUE, (UnivariateRealFunction) expm1Function0, (double) Integer.MAX_VALUE, 0.0, 0.0, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(2.147483647E9, illinoisSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, (-517.7538339815), 0.0);
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(5, (UnivariateRealFunction) sincFunction0, 4.9E-324, 7497.161, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 7,497.161], values: [1, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }
}