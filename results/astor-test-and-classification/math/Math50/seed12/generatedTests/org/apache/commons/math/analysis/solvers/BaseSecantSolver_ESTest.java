/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 14 14:30:30 GMT 2017
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 1.0E-6);
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      double double0 = regulaFalsiSolver0.solve(1594, univariateRealFunction0, 0.0, (-2071.259551475), (double) 1594);
      assertEquals(1594.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-2071.259551475), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
      assertNotNull(baseSecantSolver_MethodArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BaseSecantSolver.Method.valueOf("REGULA_FALSI");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1385, univariateRealFunction0, (-2535.66025), 1388.1468740147, (double) 1385, allowedSolution0);
      assertEquals(1385.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-2535.66025), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = pegasusSolver0.solve(181, (UnivariateRealFunction) sinFunction0, 0.0, (-3168.2961911453062), (double) 181);
      assertEquals((-3168.2961911453062), pegasusSolver0.getMax(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(899.648, 2055.2285443519036);
      SinFunction sinFunction0 = new SinFunction();
      double double0 = pegasusSolver0.solve(2360, (UnivariateRealFunction) sinFunction0, (-6740.082920832), (-3688.6400048855485), (-6740.082920832));
      assertEquals((-6740.082920832), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-4571.748093522576), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      pegasusSolver0.solve(181, univariateRealFunction0, (-3874.94), 0.0, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-1937.47), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-3168.2961911453067), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-699), (UnivariateRealFunction) quinticFunction0, (double) (-699), 0.0, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-699) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1172, (UnivariateRealFunction) sinFunction0, (double) 1172, 241.9026343264141, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,172, 241.903]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(4.0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2092, (UnivariateRealFunction) null, (double) 2092, 0.0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1451.65977));
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-1062), (UnivariateRealFunction) sinFunction0, (-1451.65977), (double) (-1062), (-1451.65977), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,062) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2264, (UnivariateRealFunction) expm1Function0, 0.008333333333329196, (-1385.1533316763), 0.008333333333329196, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.008, -1,385.153]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(5, (UnivariateRealFunction) null, 1.0E-6, 0.2222222089767456, (-648.39217521), allowedSolution0);
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
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.0);
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) expm1Function0, Double.NaN, Double.NaN, 1043.4220577320339);
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1140.967175896259));
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2694, (UnivariateRealFunction) xMinus5Function0, (-1140.967175896259), (-1140.967175896259), (-1262.899835857246));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-1,140.967, -1,140.967]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) null, 0.0, (double) 0, (-1884.921022436848));
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
      PegasusSolver pegasusSolver0 = new PegasusSolver(1349.7044891976);
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(3300, (UnivariateRealFunction) monitoredFunction0, (double) 3300, (-213.0), 1.0E-6);
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
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      pegasusSolver0.setup(2557, expm1Function0, (-2069.0), 2557, 2557);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (2,557) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      illinoisSolver0.setup(101, expm1Function0, 934.473286258, 72.84017929572656, 3372.7719230418);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [934.473, 72.84]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      pegasusSolver0.setup(1172, univariateRealFunction0, (-0.007691803866532526), 1.0, (-2417.581923096435));
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-0.008, 1], values: [1, 0.54]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(899.648, 2055.2285443519036);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(6, (UnivariateRealFunction) sinFunction0, 7.042804919579654E-4, (double) 6, allowedSolution0);
      assertEquals(3.0003521402459787, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.015787780172241028, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1172, (UnivariateRealFunction) sinFunction0, (-3518.0), (double) 1172, 0.0, allowedSolution0);
      assertEquals(1172.0, pegasusSolver0.getMax(), 0.01);
      assertEquals(241.9026343264141, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(181, univariateRealFunction0, (-3874.94), 11.026406948187116, allowedSolution0);
      assertEquals((-1931.9567965259064), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(10.995574301418602, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(181, univariateRealFunction0, (-3874.9), 0.0, allowedSolution0);
      assertEquals((-1937.45), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-680.1548095021903), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(181, univariateRealFunction0, (-3874.94), 0.0, allowedSolution0);
      assertEquals((-1937.47), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-3168.2961911453062), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(939, univariateRealFunction0, 4.511783980915, (double) 939, allowedSolution0);
      assertEquals(471.75589199045754, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(611.0381345656078, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(220, (UnivariateRealFunction) sincFunction0, (-3874.94), (-1.0), allowedSolution0);
      assertEquals((-1937.97), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-3873.5837418762153), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(939, (UnivariateRealFunction) quinticFunction0, (-0.41746788188350836), (double) 939, allowedSolution0);
      assertEquals(939.0, illinoisSolver0.getMax(), 0.01);
      assertEquals(1.744210824012484E-18, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(181, (UnivariateRealFunction) sincFunction0, (-3874.94), (-1.0), allowedSolution0);
      assertEquals((-1.0), pegasusSolver0.getMax(), 0.01);
      assertEquals((-3873.5837418762153), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(220, (UnivariateRealFunction) sincFunction0, (-3874.94), 0.0, allowedSolution0);
      assertEquals((-1937.47), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-3873.58374187971), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(939, (UnivariateRealFunction) sincFunction0, 4.511783980915, (double) 939, allowedSolution0);
      assertEquals(471.75589199045754, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(929.9114254763134, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(181, univariateRealFunction0, (-3874.94), 0.49999999999999994, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1027.828780842223), (-2858.19708715), 4.511783980915);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(939, (UnivariateRealFunction) quinticFunction0, (-6.660455916753376), (double) 939, allowedSolution0);
      assertEquals(939.0, illinoisSolver0.getMax(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2440.4527));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      regulaFalsiSolver0.solve(1690, (UnivariateRealFunction) quinticFunction0, 0.0, 0.0, (-1027.828780842223), allowedSolution0);
      regulaFalsiSolver0.doSolve();
      assertEquals((-1027.828780842223), regulaFalsiSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1027.828780842223), (-2858.19708715), 4.511783980915);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(939, (UnivariateRealFunction) quinticFunction0, (-6.660455916753376), (double) 939, allowedSolution0);
      assertEquals(466.1697720416233, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.4551277009288408), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2240.993);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      pegasusSolver0.solve(126, (UnivariateRealFunction) quinticFunction0, 0.7937005259840998, 1657.7832208938, 1860.111676502681);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(1657.7832208938, pegasusSolver0.getMax(), 0.01);
      assertEquals(0.7937005259839225, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      pegasusSolver0.solve(1172, (UnivariateRealFunction) sinFunction0, (double) 1172, 0.0, allowedSolution0);
  }
}