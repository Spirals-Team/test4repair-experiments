/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 13 08:18:01 GMT 2017
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
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1874.462353454005));
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      double double0 = pegasusSolver0.solve(1293, (UnivariateRealFunction) xMinus5Function0, (-1874.462353454005), 1978.317306384737, 1978.317306384737);
      assertEquals(1978.317306384737, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(5.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(1102, (UnivariateRealFunction) quinticFunction0, (double) 1102, 1.0, 0.14285714285714285, allowedSolution0);
      assertEquals(0.14285714285714285, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BaseSecantSolver.Method.valueOf("PEGASUS");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
      assertNotNull(baseSecantSolver_MethodArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1102, (UnivariateRealFunction) quinticFunction0, 0.0, 1.0, 0.14285714285714285, allowedSolution0);
      assertEquals(0.14285714285714285, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(630.41771448114, 0.0, 630.41771448114);
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      pegasusSolver0.solve(1274, univariateRealFunction0, 0.0, 1.0E-6, allowedSolution0);
      pegasusSolver0.doSolve();
      assertEquals(5.0E-7, pegasusSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.9841269659586505E-4));
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2566, (UnivariateRealFunction) sinFunction0, 1389.387, (double) 2566, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1,389.387, 2,566], values: [0.719, 0.63]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(15, (UnivariateRealFunction) quinticFunction0, (double) 15, (-217.702), 0.0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [15, -217.702]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(896.5);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(13, (UnivariateRealFunction) null, 2.7553817452272217E-6, (-4765.669882), 0.0, allowedSolution0);
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0, 0.0);
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1405, (UnivariateRealFunction) sincFunction0, (-50.18109298), 0.0, (-1487.291203939626));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1,405) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.167, 0.167, 0.167);
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2047, (UnivariateRealFunction) sinFunction0, 0.167, 0.167, (double) 2047);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.167, 0.167]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(9.140260083262505E-9, (-464.003371), (-464.003371));
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      UnivariateRealFunction univariateRealFunction0 = xMinus5Function0.derivative();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(5, univariateRealFunction0, 9.140260083262505E-9, 2242.1, (-3262.951390607));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 2,242.1], values: [1, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2122.50878024564));
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
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(3.638018303857865E-9);
      SincFunction sincFunction0 = new SincFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) sincFunction0);
      illinoisSolver0.setup(134, monitoredFunction0, 1.5874010519681994, (-4022.429), (-4022.429));
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1.587, -4,022.429]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      regulaFalsiSolver0.setup(1405, sincFunction0, 0.5, 2056.332608359, 0.0020048882739462453);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0.5, 2,056.333], values: [0.959, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2720.189456914537, 2.0, 0.5);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(261, (UnivariateRealFunction) quinticFunction0, (-47.1238898038469), 2720.189456914537, 2.0, allowedSolution0);
      assertEquals(2.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2720.189456914537, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2720.189456914537, 2.0, 2.0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(257, (UnivariateRealFunction) quinticFunction0, (-47.1238898038469), 2720.189456914537, 2.0, allowedSolution0);
      assertEquals(2.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-47.123885488419546), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2444.95023, 0.560027378010827, 2444.95023);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(261, (UnivariateRealFunction) quinticFunction0, (-47.1238898038469), 26.914484140738182, 0.560027378010827, allowedSolution0);
      assertEquals(0.560027378010827, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(22.67725599152373, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2444.95022881, 2.0, 0.5);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(261, (UnivariateRealFunction) quinticFunction0, (-47.1238898038469), 2.0, 2.0, allowedSolution0);
      assertEquals(2.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.9999952410178599, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2444.95023, 0.560027378010827, 0.5);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(261, (UnivariateRealFunction) quinticFunction0, (-47.1238898038469), 26.914484140738182, 0.560027378010827, allowedSolution0);
      assertEquals(0.560027378010827, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-47.1238898038469), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2444.95022881, 0.560027378010827, 0.5);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(261, (UnivariateRealFunction) quinticFunction0, (-47.1238898038469), 1.0E-15, 0.560027378010827, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (261) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2444.95023, 0.560027378010827, 0.5);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(261, (UnivariateRealFunction) quinticFunction0, 0.560027378010827, 26.914484140738182, 0.560027378010827, allowedSolution0);
      assertEquals(0.560027378010827, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(26.914484140738182, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(126, (UnivariateRealFunction) sincFunction0, 2.4999724819560025E-7, 47.12389080383605, (double) 126, allowedSolution0);
      assertEquals(126.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(56.548667764616305, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2444.95022881, 0.560027378010827, 0.5);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      regulaFalsiSolver0.solve(261, (UnivariateRealFunction) quinticFunction0, (-47.1238898038469), 1.0E-6, 0.560027378010827, allowedSolution0);
      assertEquals(0.560027378010827, regulaFalsiSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2.0, 0.560027378010827, 0.5);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      regulaFalsiSolver0.solve(261, (UnivariateRealFunction) quinticFunction0, (-47.1238898038469), 1.0E-6, 0.560027378010827, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(0.560027378010827, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(9.9999994927524E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1749.3));
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1253, univariateRealFunction0, (-1749.3), 0.1111111111111111, allowedSolution0);
      assertEquals(0.1111111111111111, regulaFalsiSolver0.getMax(), 0.01);
      assertEquals((-70.68583470577045), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(126, (UnivariateRealFunction) sincFunction0, 2.4999724819560025E-7, 47.12389080383605, (double) 126, allowedSolution0);
      assertEquals(126.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(47.12388980384692, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1749.3));
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1253, univariateRealFunction0, (-1749.3), 0.0, allowedSolution0);
      assertEquals((-874.65), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1170.243263462198), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1874.462353454005));
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      double double0 = pegasusSolver0.solve(1293, univariateRealFunction0, (-1874.462353454005), 1978.317306384737, 1978.317306384737);
      assertEquals((-1874.462353454005), pegasusSolver0.getMin(), 0.01);
      assertEquals(1977.6325754347747, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(451, (UnivariateRealFunction) expm1Function0, (-303.8), (double) 451, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (451) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.167, (-1.546907122064593), (-1.546907122064593));
      SinFunction sinFunction0 = new SinFunction();
      double double0 = illinoisSolver0.solve(2047, (UnivariateRealFunction) sinFunction0, (-1.546907122064593), 0.167, (double) 2047);
      assertEquals(2047.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-0.49999999999999994));
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(997, univariateRealFunction0, 1.2246467991473532E-16, (-21.986923), allowedSolution0);
      assertEquals((-21.986923), illinoisSolver0.getMax(), 0.01);
      assertEquals(1.2246467991473532E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-0.49999999999999994));
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(997, (UnivariateRealFunction) sincFunction0, 1.2246467991473532E-16, (-21.986923), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -21.987]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.0, 0.560027378010827);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2444.95023, 0.560027378010827, (-0.7101867949788809));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(261, (UnivariateRealFunction) quinticFunction0, (-47.1238898038469), 26.914484140738182, 0.560027378010827, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      regulaFalsiSolver0.solve(1405, (UnivariateRealFunction) sincFunction0, (-50.18109298), 0.0, (-1487.265554980558));
      regulaFalsiSolver0.doSolve();
  }
}