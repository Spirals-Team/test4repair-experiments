/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 29 18:25:09 GMT 2017
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
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BracketingNthOrderBrentSolver_ESTest extends BracketingNthOrderBrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 2211);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1320, (UnivariateFunction) expm1Function0, (-752.67943908), 0.5, allowedSolution0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = bracketingNthOrderBrentSolver0.doSolve();
      assertEquals(2211, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) 2211, 2211);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      bracketingNthOrderBrentSolver0.solve(1320, (UnivariateFunction) expm1Function0, (-752.67943908), 0.5, allowedSolution0);
      double double0 = bracketingNthOrderBrentSolver0.doSolve();
      assertEquals(2211, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      bracketingNthOrderBrentSolver0.solve(3784, (UnivariateFunction) sinFunction0, (-3380.6729249), (-2121.84675697928), allowedSolution0);
      double double0 = bracketingNthOrderBrentSolver0.doSolve();
      assertEquals((-3173.0085801254604), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve((-904), (UnivariateFunction) sincFunction0, (double) (-904), 3817.551772533, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-904) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(3784, (UnivariateFunction) sinFunction0, (double) 3784, (double) 3784, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,784, 3,784]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(1014, (UnivariateFunction) sinFunction0, (-3373.4273794785863), (double) 1014, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-3,373.427, 1,014], values: [0.6, 0.67]
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateFunction) null);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(2204, (UnivariateFunction) monitoredFunction0, (double) 2204, 2559.59710775977, allowedSolution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve((-56), (UnivariateFunction) expm1Function0, (-2896.1021745542703), 1590.837249812231, (-3.24981577480893E-27), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-56) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(2646, (UnivariateFunction) expm1Function0, (double) 2646, (double) 2646, (double) 2646, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,646, 2,646]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve((-2711), (UnivariateFunction) null, (-717.6761), (double) (-2711), (-717.6761), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.5, 1320);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      bracketingNthOrderBrentSolver0.solve(1320, (UnivariateFunction) quinticFunction0, (-495.08034922902), 2596.186726682122, 2005.202771);
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      bracketingNthOrderBrentSolver0.setup((-1408), sincFunction0, (-1.0009621198179834), 5, (-9.85701751097696E-8));
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,408) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0038558004159115478, 0.0038558004159115478, 2);
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
  public void test13()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      double double0 = bracketingNthOrderBrentSolver0.solve(2747, (UnivariateFunction) expm1Function0, (-1.7151045468861743), 2213.0, 0.609149694442749, allowedSolution0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1014, (UnivariateFunction) sinFunction0, 1.00000001E-6, (double) 1014, allowedSolution0);
      assertEquals(172.7875959474094, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1014, (UnivariateFunction) sinFunction0, 1.00000001E-6, (double) 1014, allowedSolution0);
      assertEquals(172.78759594744045, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = bracketingNthOrderBrentSolver0.solve(1320, (UnivariateFunction) quinticFunction0, (-495.08034922902), 2596.186726682122, 2005.202771);
      assertEquals((-1.0000000003759422), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      double double0 = bracketingNthOrderBrentSolver0.solve(2712, (UnivariateFunction) expm1Function0, (-0.6487212707001282), 2203.7654505340643, 0.609149694442749, allowedSolution0);
      assertEquals((-5.9573457278361275E-12), double0, 0.01);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(3784, (UnivariateFunction) sinFunction0, (-3380.6729249), (double) 3784, allowedSolution0);
      assertEquals((-3173.0085801219816), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1006, (UnivariateFunction) sinFunction0, (-3380.6729249), (double) 1006, allowedSolution0);
      assertEquals((-1910.0883333825948), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.5, 1320);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = bracketingNthOrderBrentSolver0.solve(727, (UnivariateFunction) quinticFunction0, (-495.08034922902), 0.0);
      assertEquals(1320, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.solve(2712, (UnivariateFunction) expm1Function0, (-269.5249811401473), 2006.272463013812, (-1.0), (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(1014, (UnivariateFunction) sinFunction0, 0.0, (double) 1014, allowedSolution0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-0.15496404236136763), 1313);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = bracketingNthOrderBrentSolver0.solve(1313, (UnivariateFunction) quinticFunction0, (-490.2590048021029), 2595.4963997991754, 0.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1313, bracketingNthOrderBrentSolver0.getMaximalOrder());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-3297.815953558162), (-3297.815953558162), (-3297.815953558162), (-1104));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,104 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0E-14, 1.0E-14, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(607.46416124278, 607.46416124278, 1447);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      bracketingNthOrderBrentSolver0.setup(1447, quinticFunction0, 183.19141791946, 607.46416124278, 477.48);
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [183.191, 607.464], values: [206,304,852,935.192, 82,718,344,298,631.78]
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) (-2775), (-2775));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,775 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-0.15496404236136763), 1313);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = bracketingNthOrderBrentSolver0.solve(466479614, (UnivariateFunction) quinticFunction0, (-0.15496404236136763), (double) 466479614, 1399.98927, allowedSolution0);
      assertEquals(1313, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(5.421010862427522E-20, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
      assertEquals(5, int0);
  }
}