/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 19 23:57:48 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3410.0405), (-8.0E298), (-8.0E298));
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      double double0 = pegasusSolver0.solve(421, univariateRealFunction0, (-8.0E298), 4.890303768410003E-8, (-3410.0405));
      assertEquals((-3410.0405), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-8.0E298), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseSecantSolver.Method.valueOf("PEGASUS");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
      assertNotNull(baseSecantSolver_MethodArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1086.398985375, 1086.398985375);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      illinoisSolver0.solve(1550, (UnivariateRealFunction) expm1Function0, (-5.086782598236228E-6), 0.0, allowedSolution0);
      illinoisSolver0.doSolve();
      assertEquals((-2.543391299118114E-6), illinoisSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(404.0, (-6.439446281883341E-13), 404.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      regulaFalsiSolver0.solve(1202, (UnivariateRealFunction) sinFunction0, (-1210.229695869679), (-6.439446281883341E-13), allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals((-605.1148479348399), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1.1872446783936203E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0, 0.0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) quinticFunction0, 0.0, 1153.7816, allowedSolution0);
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3309, (UnivariateRealFunction) sincFunction0, (double) 3309, (double) 3309, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,309, 3,309]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(40, (UnivariateRealFunction) expm1Function0, (double) 40, 1026.094182207469, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [40, 1,026.094], values: [235,385,266,837,020,000, \u221E]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2351.135724644, 2351.135724644, 2351.135724644);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) xMinus5Function0, 0.0, 0.0, 0.0, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1862, (UnivariateRealFunction) quinticFunction0, (double) 1862, (double) 1862, 609.7586241643534, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,862, 1,862]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) null, 5204.898740934667, (-2863.628205359), (-2181.875538248), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-2936), (UnivariateRealFunction) quinticFunction0, (double) (-2936), (double) (-2936), (double) (-2936));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,936) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(13, (UnivariateRealFunction) expm1Function0, 0.14285714285714285, (double) 13, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0.143, 13], values: [0.154, 442,412.392]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.003, 899.772104389, 561.678047307414);
      Expm1Function expm1Function0 = new Expm1Function();
      regulaFalsiSolver0.setup(3, expm1Function0, 10.098357605367543, 8.297884433314596, 707.2475);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [10.098, 8.298]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(125.0);
      SinFunction sinFunction0 = new SinFunction();
      illinoisSolver0.setup(274, sinFunction0, 125.0, 2783.3325806500798, 125.0);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [125, 2,783.333], values: [-0.616, -0.118]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1757, univariateRealFunction0, 3.142931200272869E-5, (double) 1757, (-219.834644464383), allowedSolution0);
      assertEquals((-219.834644464383), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(793.2521450314227, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-624.660351926), 1.0E-6, (-624.660351926));
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(1198, univariateRealFunction0, (-624.660351926), 1.0E-6, allowedSolution0);
      assertEquals((-312.330175463), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-359.71235883603134), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(404.0, 404.0, 404.0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1198, (UnivariateRealFunction) quinticFunction0, (-1209.4827195751), 404.0, allowedSolution0);
      assertEquals((-402.74135978755), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(397.3185963436734, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1086.398985375, 1086.398985375);
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      illinoisSolver0.solve(1550, (UnivariateRealFunction) expm1Function0, (-5.086782598236228E-6), 125.0, 1756.0097522476206, allowedSolution0);
      assertEquals(1756.0097522476206, illinoisSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(404.0, 1.0E-6, 404.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1198, (UnivariateRealFunction) sinFunction0, (-1209.4827195751), 1.0E-6, allowedSolution0);
      assertEquals((-604.7413592875499), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.0E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1756.29), 1086.398985375, (-1756.29));
      SinFunction sinFunction0 = new SinFunction();
      illinoisSolver0.setup(274, sinFunction0, 1.0E-6, 2783.3325806500798, 125.0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(462.1581764074339, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(404.0, 1.0E-6, 404.0);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1193, univariateRealFunction0, (-1209.0), 1.0E-6, allowedSolution0);
      assertEquals((-604.4999995), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-646.1122787094846), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(404.0, (-6.439446281883341E-13), 404.0);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(1202, univariateRealFunction0, (-1210.229695869679), (-6.439446281883341E-13), allowedSolution0);
      assertEquals((-605.1148479348399), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1210.229695869679), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(964, (UnivariateRealFunction) sincFunction0, (double) 4, 2790.3088275028567, allowedSolution0);
      assertEquals(1397.1544137514284, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2789.7342763877364, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(952, (UnivariateRealFunction) sincFunction0, (double) 4, 2790.347291, allowedSolution0);
      assertEquals(1397.1736455, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2789.734277328548, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0E-6, 1.0E-6, 404.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1198, (UnivariateRealFunction) sinFunction0, (-1209.4827195751), 1.0E-6, allowedSolution0);
      assertEquals((-604.7413592875499), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(4.3840572465310467E-23, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(952, univariateRealFunction0, (double) 4, 2789.7012659554366, allowedSolution0);
      assertEquals(4.0, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(2781.879935284031, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2247.0));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = pegasusSolver0.solve(619, (UnivariateRealFunction) quinticFunction0, (-10.209356132080046), 0.14285714285714285, (-15.911393014830411));
      assertEquals((-10.209356132080046), pegasusSolver0.getMin(), 0.01);
      assertEquals(4.524906152347724E-27, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2247.0), (-2247.0));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = pegasusSolver0.solve(619, (UnivariateRealFunction) quinticFunction0, (-2247.0), 2775.596749161927, (-0.1666666567325592));
      assertEquals((-0.1666666567325592), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(952, (UnivariateRealFunction) sincFunction0, (double) 4, 2790.347291, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2247.0), 0.14285714285714285);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = pegasusSolver0.solve(619, (UnivariateRealFunction) quinticFunction0, (-6.256084152296984E-17), 2775.596749161927, (-0.1666666567325592));
      assertEquals((-0.1666666567325592), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2247.0), 0.14285714285714285);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(56, (UnivariateRealFunction) quinticFunction0, 0.0, 2822.94415, 4.890303768410003E-8, allowedSolution0);
      assertEquals(4.890303768410003E-8, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(13.0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = illinoisSolver0.solve(2285, (UnivariateRealFunction) quinticFunction0, 4179.899787623652, 0.5, (-7.800414592973399E-9));
      assertEquals(0.5, illinoisSolver0.getMax(), 0.01);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-624.660351926), 1.0E-6, (-624.660351926));
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(1198, (UnivariateRealFunction) expm1Function0, (-624.660351926), 1.0E-6, allowedSolution0);
      assertEquals((-312.330175463), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(3, (UnivariateRealFunction) expm1Function0, (double) 3, (double) 3, (double) 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3, 3]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }
}
