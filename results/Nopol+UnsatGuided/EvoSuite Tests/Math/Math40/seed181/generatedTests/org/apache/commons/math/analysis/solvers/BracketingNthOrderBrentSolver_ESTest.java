/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 25 03:10:02 GMT 2017
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
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BracketingNthOrderBrentSolver_ESTest extends BracketingNthOrderBrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateFunction univariateFunction0 = expm1Function0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(2, univariateFunction0, (-520.7630737448686), 0.32905077934265137, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (2) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      bracketingNthOrderBrentSolver0.solve(2637, (UnivariateFunction) quinticFunction0, (-2814.05890885), (double) 2637, 2086.271608305562, allowedSolution0);
      double double0 = bracketingNthOrderBrentSolver0.doSolve();
      assertEquals(2086.271608305562, bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
      assertEquals(1.0000000016566446, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(1435, (UnivariateFunction) sincFunction0, (double) 1435, (double) 1435, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,435, 1,435]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(354, (UnivariateFunction) sinFunction0, (double) 354, Double.NaN, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [354, \uFFFD], values: [0.841, \uFFFD]
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(1435, (UnivariateFunction) sincFunction0, (double) 1435, 2117.0, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 5);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(0, (UnivariateFunction) expm1Function0, Double.NaN, 0.5, Double.NaN, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(18.704788193976338, 1051);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(1051, (UnivariateFunction) sincFunction0, (-941.3960339), (-941.3960339), (-941.3960339), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-941.396, -941.396]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(5.0, 1590);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(1590, (UnivariateFunction) expm1Function0, Double.NaN, 5.0, Double.NaN, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [\uFFFD, 5], values: [\uFFFD, 147.413]
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, (-3163.2), 0.0, 13);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      bracketingNthOrderBrentSolver0.setup((-1256), xMinus5Function0, (-3163.2), 0.0, Double.NaN);
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,256) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(18.704788193976338, 1051);
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      UnivariateFunction univariateFunction0 = sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1435, univariateFunction0, (double) 1435, 2117.0, allowedSolution0);
      assertEquals(2040.463938421987, double0, 0.01);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(2637, (UnivariateFunction) sincFunction0, (-2788.6581660714123), (double) 2637, 2069.9027396166894, allowedSolution0);
      assertEquals(2067.167966062084, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(18.704788193976338, 1051);
      SincFunction sincFunction0 = new SincFunction();
      UnivariateFunction univariateFunction0 = sincFunction0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateFunction0);
      double double0 = bracketingNthOrderBrentSolver0.solve(1051, (UnivariateFunction) monitoredFunction0, (-941.3960339), (double) 1051, 18.704788193976338);
      assertEquals(3, monitoredFunction0.getCallsCount());
      assertEquals((-941.3960339), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1435, (UnivariateFunction) sincFunction0, (double) 1435, 2117.0, allowedSolution0);
      assertEquals(1586.5042900527487, double0, 0.01);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1082.5115235747128), (-1082.5115235747128), 3203);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1442, (UnivariateFunction) sincFunction0, (-1082.5115235747128), (double) 3203, allowedSolution0);
      assertEquals((-1082.5115235747128), bracketingNthOrderBrentSolver0.getMin(), 0.01);
      assertEquals((-1074.4246875277092), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(18.704788193976338, 1051);
      SincFunction sincFunction0 = new SincFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateFunction) sincFunction0);
      double double0 = bracketingNthOrderBrentSolver0.solve(1051, (UnivariateFunction) monitoredFunction0, (-941.3960339156645), (double) 1051, 18.704788193976338);
      assertEquals(13, monitoredFunction0.getCallsCount());
      assertEquals(157.71254894693828, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) sincFunction0, (-1.0), 1.1897985529427766E28, allowedSolution0);
      assertEquals(2.9744963823569416E27, double0, 0.01);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2189.90987606662), 192.3771515415974, 2);
      Expm1Function expm1Function0 = new Expm1Function();
      bracketingNthOrderBrentSolver0.setup(476, expm1Function0, 7.802219817310385E-9, 124.742425479769, 0.16607704758644104);
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 124.742], values: [0, 1,496,053,226,440,067,500,000,000,000,000,000,000,000,000,000,000,000,000]
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0625, (-630.64294529105), 0.0625, 673);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = bracketingNthOrderBrentSolver0.solve(673, (UnivariateFunction) quinticFunction0, 0.0625, 0.5);
      assertEquals(673, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      bracketingNthOrderBrentSolver0.solve(2637, (UnivariateFunction) sincFunction0, (-2814.05890885), (double) 2637, 2086.271608305562, allowedSolution0);
      double double0 = bracketingNthOrderBrentSolver0.doSolve();
      assertEquals((-1423.141471381903), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 2708);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(2708, (UnivariateFunction) quinticFunction0, 0.0, (double) 2708, allowedSolution0);
      assertEquals(2708, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = bracketingNthOrderBrentSolver0.solve(2276, (UnivariateFunction) sinFunction0, (double) 0);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) 5, (-2788.6581660714123), 2069.9027396166894, (-2522));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,522 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-26.468330521944498), 0.0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(234.9784084444, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      bracketingNthOrderBrentSolver0.solve(2637, (UnivariateFunction) quinticFunction0, (-2814.05890885), (double) 2637, (-1.545495535488274E-89), allowedSolution0);
      double double0 = bracketingNthOrderBrentSolver0.doSolve();
      assertEquals(0.0, double0, 0.01);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
      assertEquals(5, int0);
  }
}
