/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 21 18:26:14 GMT 2017
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
      Expm1Function expm1Function0 = new Expm1Function();
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-248.71460009867), (-248.71460009867), 0.0, 1250);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=249, maximum iterations=1,250, initial=-248.715, lower bound=-248.715, upper bound=0, final a value=-248.715, final b value=0, f(a)=-1, f(b)=0
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-459.04), (-459.04), (-459.04), 1080);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-459.04,  initial=-459.04, upper bound=-459.04
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) quinticFunction0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, 3158.927197728152, (-1.0), (-1.0), 0);
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
      SinFunction sinFunction0 = new SinFunction();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) sinFunction0, (-1628.6292621), 0.0, (-1628.6292621));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) quinticFunction0, 0.5, 3486.273141, 290.64379);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      double double0 = UnivariateRealSolverUtils.solve(univariateRealFunction0, (-806.5), 0.0, 1.0);
      assertEquals((-598.6289962434203), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) expm1Function0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) monitoredFunction0, 0.0, 0.5);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) expm1Function0, (-1317.4869695036778), 370.7320336860928);
      assertEquals(2.1014462150453135E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) sinFunction0, (-1014.4152812), 0.5);
      assertEquals((-703.7167543030894), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(1251.0055691823688, (-1094.53185740933));
      assertEquals(78.23685588651938, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(556.1645585817929, (-1093.965));
      assertEquals((-268.9002207091035), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) monitoredFunction0, (-843.61268248), 1.0, 1.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) quinticFunction0, 642.11, 642.11);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [642.11, 642.11]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, 3.5049592630358522E31, (-28.95), 3.5049592630358522E31, 1519);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 858.0441674211246, 858.0441674211246, 2389.54360900478);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=1,532, maximum iterations=2,147,483,647, initial=858.044, lower bound=858.044, upper bound=2,389.544, final a value=858.044, final b value=2,389.544, f(a)=465,101,221,699,909.56, f(b)=77,906,682,071,158,800
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, 0.5, (-2343.331232478546), 0.5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      double[] doubleArray0 = UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-446.7937574312), (-446.7937574312), 217.7892520406, 964);
      assertArrayEquals(new double[] {(-446.7937574312), (-443.7937574312)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 0.0, 0.0, (-694.38003713984), 2936);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=0, upper bound=-694.38
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) null, 899.463000043, 0.0, 899.463000043, 3788);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) null, 370.7320336860928, (-1317.4869695036778), 370.7320336860928);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 3.75, 1.0, 3.75, 257);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=3, maximum iterations=257, initial=3.75, lower bound=1, upper bound=3.75, final a value=1, final b value=3.75, f(a)=1.718, f(b)=41.521
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-445.519812176874), (-2375.09888013642), (-445.519812176874), 1127);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=1,127, maximum iterations=1,127, initial=-445.52, lower bound=-2,375.099, upper bound=-445.52, final a value=-1,572.52, final b value=-445.52, f(a)=-9,615,689,024,255,732, f(b)=-17,552,232,941,328.416
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double[] doubleArray0 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 858.7516, 0.5, 1.5739468074073822E29);
      assertArrayEquals(new double[] {0.7516000000000531, 1716.7516}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, Double.NaN, 3546.4423984522714, (-1.0), 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=3,546.442,  initial=\uFFFD, upper bound=-1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 2193.3974, 2193.3974, (-1421.2902049483912));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=2,193.397,  initial=2,193.397, upper bound=-1,421.29
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-1.0), 1.0, (-1.0), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=1,  initial=-1, upper bound=-1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 904.0527999936, 904.0527999936, 777.142033190833, (-960));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -960
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) expm1Function0, (-1466.3774), 3.638411107282073E31);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      double[] doubleArray0 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, Double.NaN, Double.NaN, 1.5);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }
}
