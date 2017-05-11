/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 22 14:13:06 GMT 2017
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
      double double0 = UnivariateRealSolverUtils.midpoint(0.0, 1168.2);
      assertEquals(584.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      double[] doubleArray0 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, Double.NaN, Double.NaN, Double.NaN);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 0.0, 0.0, 703.78638688, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) quinticFunction0, 0.0, (double) 3, 0.5);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      double double0 = UnivariateRealSolverUtils.solve(univariateRealFunction0, (-174.335444323483), 0.0, (-174.335444323483));
      assertEquals((-171.21679962064374), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) quinticFunction0, 0.0, 1339.923899399711);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) quinticFunction0, 0.5, 2767.123830751);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint((-1040.850588978707), 0.0);
      assertEquals((-520.4252944893535), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) quinticFunction0, (-797.7982363238594), (-797.7982363238594), 0.5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-797.798, -797.798]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, (-2335.2538), (-2335.2538), 1579.2667499, 1009);
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
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 2181.325200676659, 0.0, 2181.325200676659);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=2,182, maximum iterations=2,147,483,647, initial=2,181.325, lower bound=0, upper bound=2,181.325, final a value=0, final b value=2,181.325, f(a)=0, f(b)=49,385,785,947,814,176
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      double[] doubleArray0 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (-2891.574685137), (-2891.574685137), (-1464.2172), 2858);
      assertArrayEquals(new double[] {(-2891.574685137), (-2889.574685137)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-1.0), (-1.0), (-275.5647410726653), 2356);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-1,  initial=-1, upper bound=-275.565
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 0.5, 1318.4999, 0.0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=1,318.5,  initial=0.5, upper bound=0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 0.0, 0.0, 0.0, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=0, upper bound=0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) null, 0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 19.325200676658824, 19.325200676658824, 976.22405446404, 1927);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=957, maximum iterations=1,927, initial=19.325, lower bound=19.325, upper bound=976.224, final a value=19.325, final b value=976.224, f(a)=2,686,363.638, f(b)=886,639,251,065,474.9
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 849.6433090278978, (-1500.0785939112), 849.6433090278978, 7);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=7, maximum iterations=7, initial=849.643, lower bound=-1,500.079, upper bound=849.643, final a value=842.643, final b value=849.643, f(a)=424,832,877,047,800.5, f(b)=442,774,352,240,092.2
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, 1200.5672754383584, 1200.5672754383584, 1640.9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 428.42368143487556, 0.5, 0.5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0.5,  initial=428.424, upper bound=0.5
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (double) (-78), (double) (-78), (double) (-78), (-78));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -78
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) null, 2.7912245693879387, 2.7912245693879387, 2.7912245693879387, 695);
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
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) quinticFunction0, (-697.4313), 0.5, 0.5);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) sinFunction0, (-1464.2172), (-1242.19273));
      assertEquals((-1376.0175822723193), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, Double.NaN, 2.443011593545957E26, 1.0E-15);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=244,301,159,354,595,700,000,000,000,  initial=\uFFFD, upper bound=0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }
}
