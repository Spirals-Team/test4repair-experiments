/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 21:35:20 GMT 2017
 */

package org.apache.commons.math;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.integration.RombergIntegrator;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.univariate.BrentOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConvergingAlgorithmImpl_ESTest extends ConvergingAlgorithmImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      brentOptimizer0.setMaximalIterationCount(1632);
      assertEquals(1632, brentOptimizer0.getMaximalIterationCount());
      
      brentOptimizer0.resetMaximalIterationCount();
      assertEquals(0, brentOptimizer0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      secantSolver0.setAbsoluteAccuracy(1.0E-14);
      secantSolver0.resetAbsoluteAccuracy();
      assertEquals(1.0E-14, secantSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, secantSolver0.getMaximalIterationCount());
      assertEquals(0, secantSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
      
      laguerreSolver0.setRelativeAccuracy(1.0E-14);
      assertEquals(0, laguerreSolver0.getIterationCount());
      assertEquals(100, laguerreSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      secantSolver0.setMaximalIterationCount(780);
      assertEquals(780, secantSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.setAbsoluteAccuracy(0.0);
      assertEquals(0, laguerreSolver0.getIterationCount());
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, laguerreSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      mullerSolver0.resetRelativeAccuracy();
      assertEquals(0, mullerSolver0.getIterationCount());
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      riddersSolver0.resetMaximalIterationCount();
      assertEquals(100, riddersSolver0.getMaximalIterationCount());
      assertEquals(0, riddersSolver0.getIterationCount());
      assertEquals(1.0E-14, riddersSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      riddersSolver0.resetAbsoluteAccuracy();
      assertEquals(1.0E-14, riddersSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0, riddersSolver0.getIterationCount());
      assertEquals(100, riddersSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      assertEquals(1.0E-14, newtonSolver0.getRelativeAccuracy(), 0.01);
      
      newtonSolver0.setRelativeAccuracy(0.0);
      newtonSolver0.getRelativeAccuracy();
      assertEquals(100, newtonSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      
      brentOptimizer0.setMaximalIterationCount(0);
      int int0 = brentOptimizer0.getMaximalIterationCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      Expm1Function expm1Function0 = new Expm1Function();
      GoalType goalType0 = GoalType.MAXIMIZE;
      brentOptimizer0.optimize((UnivariateRealFunction) expm1Function0, goalType0, 0.0, 1.0E-6, (-2320.3877));
      int int0 = brentOptimizer0.getIterationCount();
      assertEquals(18, brentOptimizer0.getEvaluations());
      assertEquals(17, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.setAbsoluteAccuracy(0.0);
      rombergIntegrator0.getAbsoluteAccuracy();
      assertEquals(0, rombergIntegrator0.getIterationCount());
      assertEquals(32, rombergIntegrator0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.setAbsoluteAccuracy((-9.281025407020278));
      double double0 = rombergIntegrator0.getAbsoluteAccuracy();
      assertEquals((-9.281025407020278), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.setRelativeAccuracy((-15.2));
      double double0 = bisectionSolver0.getRelativeAccuracy();
      assertEquals((-15.2), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      double double0 = brentOptimizer0.getRelativeAccuracy();
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(1.0E-14, double0, 0.01);
      assertEquals(0, brentOptimizer0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      brentOptimizer0.setMaximalIterationCount((-19));
      int int0 = brentOptimizer0.getMaximalIterationCount();
      assertEquals((-19), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      int int0 = brentOptimizer0.getIterationCount();
      assertEquals(1.0E-14, brentOptimizer0.getRelativeAccuracy(), 0.01);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.resetRelativeAccuracy();
      assertEquals(1.0E-14, rombergIntegrator0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.getAbsoluteAccuracy();
      assertEquals(32, rombergIntegrator0.getMaximalIterationCount());
      assertEquals(0, rombergIntegrator0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      int int0 = brentOptimizer0.getMaximalIterationCount();
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(1.0E-14, brentOptimizer0.getRelativeAccuracy(), 0.01);
      assertEquals(100, int0);
  }
}
