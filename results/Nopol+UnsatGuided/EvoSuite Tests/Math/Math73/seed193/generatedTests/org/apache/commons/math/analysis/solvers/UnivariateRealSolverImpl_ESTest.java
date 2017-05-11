/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 20:11:44 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnivariateRealSolverImpl_ESTest extends UnivariateRealSolverImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, 0.0, 0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        riddersSolver0.solve((UnivariateRealFunction) sinFunction0, (-375.493491849899), 2549.0, 2549.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=-375.493, initial=2,549, upper=2,549
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      boolean boolean0 = mullerSolver0.isSequence((-441.24471379982), (-441.24471379982), (-441.24471379982));
      assertFalse(boolean0);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      boolean boolean0 = laguerreSolver0.isBracketing((-2515.34), (-2079.527328166696), quinticFunction0);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        mullerSolver0.verifyBracketing(0.0, 1354.282493779, expm1Function0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [0, 1,354.282], Values: [0, \u221E]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.functionValueAccuracy = 0.0;
      bisectionSolver0.resetFunctionValueAccuracy();
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.verifyInterval((-2515.34), 1.0);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      SinFunction sinFunction0 = new SinFunction();
      mullerSolver0.verifyBracketing((-2725.616), 193.433632, sinFunction0);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      secantSolver0.setResult((-785.1425507769), (-785.1425507769), 2138317647);
      secantSolver0.checkResultComputed();
      assertEquals(2138317647, secantSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      mullerSolver0.setResult(0.0, (-2394));
      mullerSolver0.getResult();
      assertEquals(-2394, mullerSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      bisectionSolver0.solve(univariateRealFunction0, (-1.0), 2751.0);
      double double0 = bisectionSolver0.getResult();
      assertEquals(31, bisectionSolver0.getIterationCount());
      assertEquals(2750.999999679625, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.functionValueAccuracy = 0.0;
      double double0 = bisectionSolver0.getFunctionValueAccuracy();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.resultComputed = true;
      laguerreSolver0.getFunctionValue();
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      riddersSolver0.setResult(724.2910413052, 1826.0, 0);
      double double0 = riddersSolver0.getFunctionValue();
      assertEquals(1826.0, double0, 0.01);
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0, riddersSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      secantSolver0.setResult((-785.1425507769), (-785.1425507769), 2138317647);
      double double0 = secantSolver0.getFunctionValue();
      assertEquals(2138317647, secantSolver0.getIterationCount());
      assertEquals((-785.1425507769), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      // Undeclared exception!
      try { 
        secantSolver0.verifyInterval(1.0E-15, (-1381.748383149712));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -1,381.748]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        mullerSolver0.verifyBracketing((-3826.989054), (-441.24471379982), monitoredFunction0);
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
      NewtonSolver newtonSolver0 = new NewtonSolver();
      // Undeclared exception!
      try { 
        newtonSolver0.isBracketing(0.0, 0.5, (UnivariateRealFunction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      try { 
        mullerSolver0.checkResultComputed();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no result available
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.verifyBracketing((-1933.4478337), (-1599.122354796), sinFunction0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-1,933.448, -1,599.122], Values: [0.98, 0.052]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.verifySequence((-2720.09), (-1097.154519334), 2912.36426);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      boolean boolean0 = secantSolver0.isSequence(2.2250738585072014E-308, 1.0E-14, 2058.8089);
      assertTrue(boolean0);
      assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      // Undeclared exception!
      try { 
        mullerSolver0.verifySequence((-309.40915), 3748.403400359402, 1550.3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=-309.409, initial=3,748.403, upper=1,550.3
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      boolean boolean0 = mullerSolver0.isSequence(2225.57071309059, (-3826.989054), 2397.90091597866);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      boolean boolean0 = laguerreSolver0.isBracketing((-2515.34), 1.0, quinticFunction0);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      boolean boolean0 = mullerSolver0.isBracketing(27.069221031197394, (-2522.301899928), univariateRealFunction0);
      assertFalse(boolean0);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      boolean boolean0 = mullerSolver0.isBracketing(27.069221031197394, (-2522.301899928), expm1Function0);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      riddersSolver0.setResult((-3551.747167264), (-1917));
      double double0 = riddersSolver0.getResult();
      assertEquals(-1917, riddersSolver0.getIterationCount());
      assertEquals((-3551.747167264), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      mullerSolver0.clearResult();
      assertEquals(0, mullerSolver0.getIterationCount());
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = mullerSolver0.solve2((UnivariateRealFunction) quinticFunction0, (-1613.296), 149.8143899809883);
      assertEquals(34, mullerSolver0.getIterationCount());
      assertEquals((-0.9999999999999948), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      // Undeclared exception!
      try { 
        laguerreSolver0.getFunctionValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no result available
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
      
      secantSolver0.setFunctionValueAccuracy((-1.0));
      double double0 = secantSolver0.getFunctionValueAccuracy();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      // Undeclared exception!
      try { 
        riddersSolver0.getResult();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no result available
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      double double0 = secantSolver0.getFunctionValueAccuracy();
      assertEquals(1.0E-15, double0, 0.01);
  }
}