/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 27 23:13:35 GMT 2017
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
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) expm1Function0);
      bisectionSolver0.setAbsoluteAccuracy(0.005589694970240089);
      double double0 = bisectionSolver0.solve(3.266148269176483E-6, 2930.61, 2.899377860833173E-16);
      assertEquals(18, bisectionSolver0.getIterationCount());
      assertEquals(2930.6072051525152, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.0, 816.7687921, 816.7687921);
      assertEquals(29, bisectionSolver0.getIterationCount());
      assertEquals(3.803376071620733E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) expm1Function0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-5.55375009343293E-17), 0.0, (-5.55375009343293E-17));
      assertEquals((-4.165312570074698E-17), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) expm1Function0);
      bisectionSolver0.setAbsoluteAccuracy(1.0E-15);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-4275.23998251222), 3.266148269176483E-6);
      assertEquals(61, bisectionSolver0.getIterationCount());
      assertEquals(2.899377860833173E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) expm1Function0);
      double double0 = bisectionSolver0.solve((-1212.0), 33.43032825680248, 0.0);
      assertEquals(30, bisectionSolver0.getIterationCount());
      assertEquals((-1.4967281737249236E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) expm1Function0);
      bisectionSolver0.solve(0.0, 4.5E-13);
      assertEquals(0, bisectionSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) expm1Function0);
      double double0 = bisectionSolver0.solve((-2740.6452361712), 0.0);
      assertEquals(31, bisectionSolver0.getIterationCount());
      assertEquals((-3.19053097182326E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) expm1Function0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-5.55375009343293E-17), (-1212.0), 1.125E-13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-0, -1,212]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      bisectionSolver0.setMaximalIterationCount((-1768));
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, (-248.8105449), 1.0E-15, 0.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-1,768) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) expm1Function0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, 0.0, (-2740.645235852147));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -2,740.645]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) monitoredFunction0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) null, (-1828.542556), (-1401.5795844091053));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((-1218.4), (-1218.4), (-1218.4));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-1,218.4, -1,218.4]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) expm1Function0);
      bisectionSolver0.setAbsoluteAccuracy(1.0E-15);
      try { 
        bisectionSolver0.solve(0.25, 2930.61, 2.2358469706584283E-17);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((-84.9732683500444), 566.737835046, (-84.9732683500444));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.setMaximalIterationCount((-1043));
      try { 
        bisectionSolver0.solve((-1569.9252768178), 5.2161617168480956E-24);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-1,043) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((-1926.9343292), 1.0E-6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) expm1Function0);
      double double0 = bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-4275.23998251222), 3.266148269176483E-6);
      assertEquals(31, bisectionSolver0.getIterationCount());
      assertEquals((-2.1777580264589973E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      bisectionSolver0.setAbsoluteAccuracy((-2280.107));
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-2280.107), 0.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) expm1Function0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(2930.61, (-1.6077399872644245E-10));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,930.61, -0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, (-248.8105449), 1.0E-15, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }
}
