/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 19:21:35 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BrentSolver_ESTest extends BrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      brentSolver0.setFunctionValueAccuracy(3.336146802982907E-4);
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, 1.0, 1876.9176844224592, 3.75);
      assertEquals(3, brentSolver0.getIterationCount());
      assertEquals(3.141357313738196, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-1961.1921), 1.0E-15, (-1.0000000000264067));
      assertEquals(2.5000000000000007E-16, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.functionValueAccuracy = (-1671.560807906);
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1671.560807906), 2521.9978815265504, 0.0);
      assertEquals(1, brentSolver0.getIterationCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.setFunctionValueAccuracy(0.0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1671.560807906), 2521.9978815265504, 0.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver();
      double double0 = brentSolver0.solve((UnivariateRealFunction) expm1Function0, (-582.679982), 1888.5, 1.0E-6);
      assertEquals(3, brentSolver0.getIterationCount());
      assertEquals((-2.9086795531195456E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-1728.9019940979315), 1255.4136110475781);
      assertEquals(32, brentSolver0.getIterationCount());
      assertEquals((-0.999999992575109), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      double double0 = brentSolver0.solve((-1551.71), 1087.168296117144, 0.0);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      double double0 = brentSolver0.solve((-317.37397451581637), 1876.9176844224592, 3.336146802982907E-4);
      assertEquals(4, brentSolver0.getIterationCount());
      assertEquals((-2.9876301825830683E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = brentSolver0.solve(0.0, 1907.736343);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      double double0 = brentSolver0.solve(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) expm1Function0, 1.0, (-1898.839289), (-1898.839289));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=1, initial=-1,898.839, upper=-1,898.839
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) null, 1.0, 3213.22512554392, 1781.796135);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      brentSolver0.setMaximalIterationCount((-620));
      try { 
        brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-1713.5233477561337), 1255.4136110475781);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-620) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) null, 1972.616, 2467.5239678629);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      // Undeclared exception!
      try { 
        brentSolver0.solve((-320.426421006), (-320.426421006), (-320.426421006));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=-320.426, initial=-320.426, upper=-320.426
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      brentSolver0.setMaximalIterationCount((-1179052));
      try { 
        brentSolver0.solve((-314.1118368334), 1876.9176844224592, 1630.36085);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-1,179,052) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((-290.4987350356941), 0.0, (-157.4204534));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((-1.0), Double.NaN);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BrentSolver brentSolver0 = null;
      try {
        brentSolver0 = new BrentSolver((UnivariateRealFunction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function to solve cannot be null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1712.2260193570976), 1250.660182116884);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-1,712.226, 1,250.66], Values: [0.058, 0.302]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-15.916623132374944), 1255.4136110475781);
      assertEquals(36, brentSolver0.getIterationCount());
      assertEquals(0.9999998302499645, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1567.267704), 1.0E-15);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      brentSolver0.setMaximalIterationCount(2);
      try { 
        brentSolver0.solve(univariateRealFunction0, (-1961.1921), 1.0E-15, (-1.4830193029650036));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (2) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = brentSolver0.solve((UnivariateRealFunction) expm1Function0, Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.0, 1255.4136110475781);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      // Undeclared exception!
      try { 
        brentSolver0.solve(1795.57595982, 1902.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [1,795.576, 1,902], Values: [\u221E, \u221E]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 1.0E-15, 0.19442313661291902);
      assertEquals(1.0E-15, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-0.999999992575109), 1.0E-15);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = brentSolver0.solve((UnivariateRealFunction) expm1Function0, (-1961.1921), 1.0E-15, (-1.4830193029650036));
      assertEquals(1, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      double double0 = brentSolver0.solve(3.336146802982907E-4, 1876.9176844224592, 1630.36085);
      assertEquals(28, brentSolver0.getIterationCount());
      assertEquals(1794.7320728359762, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      brentSolver0.setFunctionValueAccuracy(3.336146802982907E-4);
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, 3.336146802982907E-4, 0.7524063780077955, 0.045254497924347784);
      assertEquals(3.3361467410980767E-4, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      double double0 = brentSolver0.solve((-692.6572049), 0.5);
      assertEquals(15, brentSolver0.getIterationCount());
      assertEquals((-534.0707511102377), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1961.1921), 1.0E-15, (-1.4830193029650036));
      assertEquals(1.0E-15, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }
}
