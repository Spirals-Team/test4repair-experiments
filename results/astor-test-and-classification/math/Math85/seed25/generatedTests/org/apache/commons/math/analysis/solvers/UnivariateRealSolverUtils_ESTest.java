/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 27 21:54:38 GMT 2017
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
import org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnivariateRealSolverUtils_ESTest extends UnivariateRealSolverUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (-653.2445534809619), 0.0, 0.0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      double double0 = UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0, 2.304533611493684E29, 3.75);
      assertEquals(1.4272260705529162E29, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      double double0 = UnivariateRealSolverUtils.solve(univariateRealFunction0, (-1060.11342), 0.0, 0.0);
      assertEquals((-1044.5795573186087), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) expm1Function0, (-1256.322221), 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) quinticFunction0, 0.5, 1.0);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) quinticFunction0, (-1.0), 0.0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint((-1.0), 0.0);
      assertEquals((-0.5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      double[] doubleArray0 = UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, (-653.2445534809619), 0.0);
      assertArrayEquals(new double[] {(-2.0), 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) quinticFunction0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) monitoredFunction0, 396.216, 396.216);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [396.216, 396.216]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, 3534.5340539136673, (-1.0), 3534.5340539136673, 879);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 0.0, (-333.3593285229567), 0.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=1, maximum iterations=2,147,483,647, initial=0, lower bound=-333.359, upper bound=0, final a value=-1, final b value=0, f(a)=0, f(b)=0
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, (-1.0), (-1.0), 2339.431396242279);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) sinFunction0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, 0.0, 0.0, 0.0, 84);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=0, upper bound=0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) null, (-1009.24142972582), (-1009.24142972582), (-1009.24142972582));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      try { 
        UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1512.0, (-305.2510142), 1512.0, 2538);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=1,818, maximum iterations=2,538, initial=1,512, lower bound=-305.251, upper bound=1,512, final a value=-305.251, final b value=1,512, f(a)=0, f(b)=\u221E
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      double[] doubleArray0 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 1512.0, (-305.2510142), 1512.0, 2538);
      assertArrayEquals(new double[] {0.0, 1512.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 0.25, 0.25, (double) 472, 472);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=472, maximum iterations=472, initial=0.25, lower bound=0.25, upper bound=472, final a value=0.25, final b value=472, f(a)=0.044, f(b)=23,426,507,987,190
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      double[] doubleArray0 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, Double.NaN, Double.NaN, (-1.0), 7);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 802.0189425682, (-1.0), (double) 7, 7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-1,  initial=802.019, upper bound=7
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 0.0, 673.786977, 673.786977, 3373);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=673.787,  initial=0, upper bound=673.787
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-146.83041815), 1256.309, (-2128.5968314), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) null, (-760.831397), 0.0, (-2388.54883), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) sinFunction0, 0.0, 2.304533611493684E29, 3.75);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.5, 0.5);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) monitoredFunction0, Double.NaN, Double.NaN);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, Double.NaN, (-1783.746220829634), (-2151.84));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-1,783.746,  initial=\uFFFD, upper bound=-2,151.84
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }
}