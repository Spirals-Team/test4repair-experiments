/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 18 00:42:03 GMT 2017
 */

package org.apache.commons.math;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.integration.RombergIntegrator;
import org.apache.commons.math.analysis.integration.SimpsonIntegrator;
import org.apache.commons.math.analysis.integration.TrapezoidIntegrator;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.apache.commons.math.optimization.univariate.BrentOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConvergingAlgorithmImpl_ESTest extends ConvergingAlgorithmImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator();
      trapezoidIntegrator0.resetRelativeAccuracy();
      assertEquals(1.0E-14, trapezoidIntegrator0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      brentOptimizer0.setMaximalIterationCount(0);
      assertEquals(0, brentOptimizer0.getMaximalIterationCount());
      
      brentOptimizer0.resetMaximalIterationCount();
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      secantSolver0.setAbsoluteAccuracy(1.0E-14);
      secantSolver0.resetAbsoluteAccuracy();
      assertEquals(100, secantSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, secantSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0, secantSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      simpsonIntegrator0.setMaximalIterationCount(64);
      assertEquals(64, simpsonIntegrator0.getMaximalIterationCount());
      assertEquals(0, simpsonIntegrator0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.setAbsoluteAccuracy(35.0);
      assertEquals(35.0, brentSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.resetRelativeAccuracy();
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      brentOptimizer0.resetMaximalIterationCount();
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentOptimizer0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.resetAbsoluteAccuracy();
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      assertEquals(1.0E-14, riddersSolver0.getRelativeAccuracy(), 0.01);
      
      riddersSolver0.setRelativeAccuracy(0.0);
      riddersSolver0.getRelativeAccuracy();
      assertEquals(0, riddersSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      brentOptimizer0.setRelativeAccuracy((-2267.9173818568));
      double double0 = brentOptimizer0.getRelativeAccuracy();
      assertEquals((-2267.9173818568), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator();
      trapezoidIntegrator0.setMaximalIterationCount((-955));
      int int0 = trapezoidIntegrator0.getMaximalIterationCount();
      assertEquals((-955), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, (-4681.78128), 1699.820176512847);
      int int0 = bisectionSolver0.getIterationCount();
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.setAbsoluteAccuracy((-275.83208864557));
      double double0 = rombergIntegrator0.getAbsoluteAccuracy();
      assertEquals((-275.83208864557), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      double double0 = brentOptimizer0.getRelativeAccuracy();
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(1.0E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.setAbsoluteAccuracy(0.0);
      rombergIntegrator0.getAbsoluteAccuracy();
      assertEquals(32, rombergIntegrator0.getMaximalIterationCount());
      assertEquals(0, rombergIntegrator0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      
      brentOptimizer0.setMaximalIterationCount(0);
      int int0 = brentOptimizer0.getMaximalIterationCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      int int0 = bisectionSolver0.getIterationCount();
      assertEquals(0, int0);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.getAbsoluteAccuracy();
      assertEquals(32, rombergIntegrator0.getMaximalIterationCount());
      assertEquals(0, rombergIntegrator0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      int int0 = brentOptimizer0.getMaximalIterationCount();
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(100, int0);
      assertEquals(1.0E-14, brentOptimizer0.getRelativeAccuracy(), 0.01);
  }
}
