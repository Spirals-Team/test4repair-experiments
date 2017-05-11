/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 23 10:33:16 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
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
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, (-663.5199698705), (double) 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-663.52, 6], values: [0, 403.429]
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.8050544360646619, 1.8050544360646619, 1.8050544360646619, 3380);
      SincFunction sincFunction0 = new SincFunction();
      bracketingNthOrderBrentSolver0.solve(3380, (UnivariateFunction) sincFunction0, 1.8050544360646619, 613.905);
      double double0 = bracketingNthOrderBrentSolver0.doSolve();
      assertEquals(307.8550272180323, double0, 0.01);
      assertEquals(3380, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0, 1.0, 1.0, 2);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve((-1), (UnivariateFunction) xMinus5Function0, (double) (-1), 1773.0, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(0, (UnivariateFunction) quinticFunction0, (double) 0, (double) 0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 506);
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(506, (UnivariateFunction) sincFunction0, 0.0, 0.5, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 0.5], values: [1, 0.959]
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(701, (UnivariateFunction) sincFunction0, 0.0625, (double) 701, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 1784);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(0, (UnivariateFunction) sinFunction0, (-1.0), 0.0, Double.NaN, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) 672, (-1580.66983), (-1580.66983), 672);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(4, (UnivariateFunction) expm1Function0, (-1580.66983), (-657.0097389219655), (double) 4, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [4, -657.01]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.5, 3);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(3, (UnivariateFunction) null, (double) 3, 0.5, 0.0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1580.66983), 672);
      SinFunction sinFunction0 = new SinFunction();
      bracketingNthOrderBrentSolver0.setup((-3381), sinFunction0, (-3381), (-207.7149), (-1580.66983));
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-3,381) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(2829.23, 2829.23, 2829.23, 2);
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
  public void test11()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1580.66983), 672);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1402, (UnivariateFunction) expm1Function0, (-1580.66983), (double) 1402, allowedSolution0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = bracketingNthOrderBrentSolver0.doSolve();
      assertEquals(672, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) 22, 1610.681, 22);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(22, (UnivariateFunction) xMinus5Function0, 0.0, 1610.681, 0.1309533376025487, allowedSolution0);
      assertEquals(1610.681, double0, 0.01);
      assertEquals(22, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1831, (UnivariateFunction) sincFunction0, (-8.269235578021753E-33), (double) 783, allowedSolution0);
      assertEquals(650.3096793242769, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      double double0 = bracketingNthOrderBrentSolver0.solve(3380, (UnivariateFunction) sincFunction0, 1.8050544360646619, 613.905);
      assertEquals(304.7344873982098, double0, 0.01);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(717, (UnivariateFunction) sincFunction0, (-2520.0), (-8.269235578021753E-33), allowedSolution0);
      assertEquals((-1633.628179866751), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1580.66983), 672);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1415, (UnivariateFunction) expm1Function0, (-1580.66983), (double) 1415, allowedSolution0);
      assertEquals(672, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals((-6.938893903907228E-18), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) 708, (double) 708, (-1583.3729443547973), 708);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1415, (UnivariateFunction) expm1Function0, (-1583.3729443547973), (double) 1415, allowedSolution0);
      assertEquals(1415.0, double0, 0.01);
      assertEquals(708, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 5);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-7.219344506270708E-4), 0.0, allowedSolution0);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-3897.9), (-470.820587644989), 386);
      SincFunction sincFunction0 = new SincFunction();
      double double0 = bracketingNthOrderBrentSolver0.solve(386, (UnivariateFunction) sincFunction0, (-3897.9), (-2170.2692));
      assertEquals((-3895.5748904513434), double0, 0.01);
      
      double double1 = bracketingNthOrderBrentSolver0.doSolve();
      assertEquals(386, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals((-3895.5748904513434), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      UnivariateFunction univariateFunction0 = sincFunction0.derivative();
      double double0 = bracketingNthOrderBrentSolver0.solve(717, univariateFunction0, (-8.269235578021753E-33), (double) 717, allowedSolution0);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals((-8.269235578021753E-33), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1580.66983), 672);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(672, (UnivariateFunction) expm1Function0, (-1580.66983), (double) 672, 0.0, allowedSolution0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(672, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 1610.681, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) (-1), (double) (-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) 22, 1610.681, 22);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      UnivariateFunction univariateFunction0 = xMinus5Function0.derivative();
      bracketingNthOrderBrentSolver0.setup(312, univariateFunction0, (-1.0), 2903.383889825, 650.3096792930835);
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1, 2,903.384], values: [1, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) 5, (-878));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -878 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) 672, (-1580.66983), (-1580.66983), 672);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(4, (UnivariateFunction) expm1Function0, (-657.0097389219655), (double) 672, (-454.33491500000014), allowedSolution0);
      assertEquals((-454.33491500000014), bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
      assertEquals((-454.33491500000014), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1580.66983), 708);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(708, (UnivariateFunction) quinticFunction0, (-1580.66983), (double) 708, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
      assertEquals(5, int0);
  }
}
