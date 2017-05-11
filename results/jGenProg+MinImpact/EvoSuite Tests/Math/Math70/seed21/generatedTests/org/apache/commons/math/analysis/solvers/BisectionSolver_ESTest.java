/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 22 16:58:22 GMT 2017
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) sinFunction0);
      double double0 = bisectionSolver0.solve(univariateRealFunction0, (-5008.2), 0.0);
      assertEquals(32, bisectionSolver0.getIterationCount());
      assertEquals((-3064.6236337599685), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) expm1Function0);
      bisectionSolver0.setMaximalIterationCount(176620590);
      bisectionSolver0.setAbsoluteAccuracy(0.0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, 0.0, 215.33958687, 0.5);
      assertEquals(1082, bisectionSolver0.getIterationCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, (-94.7993915415424), 592.4, 592.4);
      assertEquals(29, bisectionSolver0.getIterationCount());
      assertEquals((-86.39379802009768), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      bisectionSolver0.solve(0.0, 2.1887967426117178E-18, 1.0E-15);
      assertEquals(0, bisectionSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = bisectionSolver0.solve(0.0, 989.32);
      assertEquals(29, bisectionSolver0.getIterationCount());
      assertEquals(4.606880247592926E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) expm1Function0);
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) monitoredFunction0);
      double double0 = bisectionSolver0.solve((-2885.203641611221), 41.86359435056036);
      assertEquals(31, bisectionSolver0.getIterationCount());
      assertEquals((-2.0159470905272762E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) sinFunction0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, 0.0, (-782.732), (-5008.2));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -782.732]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-1358.3), 0.0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) sinFunction0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, (-2157.6342525734713), (-2157.6342525734713));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-2,157.634, -2,157.634]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) null, (-106.7233469), 0.25);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) expm1Function0);
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) monitoredFunction0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(2.0720381745311265, 1.1223412418134004, (-2885.203641611221));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2.072, 1.122]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      bisectionSolver0.setMaximalIterationCount((-698));
      try { 
        bisectionSolver0.solve((-1.0), 1093.8, 1.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-698) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((-2322.5777162202), (-598.194), 1409.5337);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(1168.2561355, 1567.58);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BisectionSolver bisectionSolver0 = null;
      try {
        bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function to solve cannot be null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, 1.739499329824634E-25, 2.9183955988323126E-18);
      assertEquals(0, bisectionSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      try { 
        bisectionSolver0.solve((-246.3), 1.0249752375859595E27);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) expm1Function0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, 1.0E-6, 1.0, 1.0);
      assertEquals(19, bisectionSolver0.getIterationCount());
      assertEquals(0.9999995231633186, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) expm1Function0);
      bisectionSolver0.setAbsoluteAccuracy(0.0);
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, 0.0, 215.33958687, 0.5);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = bisectionSolver0.solve((-1.0), 1093.8, 1.0);
      assertEquals(30, bisectionSolver0.getIterationCount());
      assertEquals((-0.9999997450970113), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      bisectionSolver0.setMaximalIterationCount((-341));
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-2077.948501754699), 1.0E-6);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-341) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }
}