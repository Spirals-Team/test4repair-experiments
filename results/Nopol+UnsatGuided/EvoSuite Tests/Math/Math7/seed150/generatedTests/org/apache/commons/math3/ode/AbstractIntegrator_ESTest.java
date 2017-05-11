/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 14 18:19:39 GMT 2017
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.apache.commons.math3.analysis.solvers.BisectionSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.TestProblem5;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.nonstiff.StepProblem;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.apache.commons.math3.ode.sampling.StepNormalizerBounds;
import org.apache.commons.math3.ode.sampling.StepNormalizerMode;
import org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest;
import org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(0.0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[8];
      try { 
        threeEighthesIntegrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, (-1.0), doubleArray0, 0.0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 2
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((double) 125, 0.624, 0.624, 0.624);
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, 0.624, doubleArray0, (-2088.0813180770165), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 1
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1.7763568394002505E-12);
      midpointIntegrator0.setMaxEvaluations(5);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-0.2743949280846659);
      doubleArray0[1] = (-0.2743949280846659);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-0.2743949280846659), (-810.11083730599), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 448, 904, (-242.4806508568846));
      TestProblem5 testProblem5_0 = new TestProblem5();
      graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, 199.11, doubleArray0, (-242.4806508568846), doubleArray0);
      assertArrayEquals(new double[] {(-9.753686788906384E138), (-9.753686788906384E138)}, doubleArray0, 0.01);
      assertEquals(326, testProblem5_0.getCalls());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(5.6);
      classicalRungeKuttaIntegrator0.setMaxEvaluations(0);
      int int0 = classicalRungeKuttaIntegrator0.getMaxEvaluations();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(0, int0);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1.0, 1.0, doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getCurrentSignedStepsize();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0, 1.0, 2560.303499889, 1.0);
      double[] doubleArray0 = new double[1];
      StepProblem stepProblem0 = new StepProblem((-3290.0089533), 1.0, 941.24);
      graggBulirschStoerIntegrator0.setMaxEvaluations(0);
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, 2014.726097862594, doubleArray0, 2560.303499889, doubleArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-634.893850688897));
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        eulerIntegrator0.integrate((FirstOrderDifferentialEquations) null, (-634.893850688897), doubleArray0, 1392.47029, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2154.18, 1632.31691, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) testProblem5_0);
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1632.31691);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 9
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1.0), 1575.83826, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.integrate((ExpandableStatefulODE) null, 1523.85);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setMaxEvaluations(0);
      try { 
        graggBulirschStoerIntegrator0.computeDerivatives(0.0, doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(2110.2528521, 3100.851537521, 2632.0558583082, 0.0);
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.INCREMENT;
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.BOTH;
      StepNormalizer stepNormalizer0 = new StepNormalizer(2462.2739981948, (FixedStepHandler) null, stepNormalizerMode0, stepNormalizerBounds0);
      dormandPrince54Integrator0.addStepHandler(stepNormalizer0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) testProblem5_0);
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.integrate(expandableStatefulODE0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.sampling.StepNormalizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(0.0);
      eulerIntegrator0.setMaxEvaluations((-1642));
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1523.85);
      StepProblem stepProblem0 = new StepProblem((-1.0), 463.39781553, 1523.85);
      BisectionSolver bisectionSolver0 = new BisectionSolver(0.0);
      eulerIntegrator0.addEventHandler((EventHandler) stepProblem0, (-1.0), (-1561.167976610838), 230, (UnivariateSolver) bisectionSolver0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-2088.09));
      eulerIntegrator0.clearEventHandlers();
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1430.047087222);
      eulerIntegrator0.clearStepHandlers();
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.computeDerivatives(0.0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2642.0), (-2642.0), (-2642.0), (-2642.0));
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, (-2642.0), doubleArray0, (-2642.0), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(9, (-1.0298256125817504), (-1.0298256125817504), (-1.0298256125817504), (-1.0298256125817504));
      TestProblem5 testProblem5_0 = new TestProblem5();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) testProblem5_0);
      expandableStatefulODE0.setTime((-1.0298256125817504));
      // Undeclared exception!
      try { 
        adamsMoultonIntegrator0.integrate(expandableStatefulODE0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      Collection<EventHandler> collection0 = graggBulirschStoerIntegrator0.getEventHandlers();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-6.985952908805853E76));
      classicalRungeKuttaIntegrator0.getName();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1523.85);
      eulerIntegrator0.getStepHandlers();
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0, 1.0, 2560.303499889, 1.0);
      StepProblem stepProblem0 = new StepProblem(1.0, 11.595793324188385, (double) 14);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) stepProblem0, 2014.726097862594, (double) 14, 14);
      double[] doubleArray0 = new double[1];
      double double0 = graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, 2014.726097862594, doubleArray0, 2560.303499889, doubleArray0);
      assertEquals(2560.303499889, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      StepProblem stepProblem0 = new StepProblem((double) Integer.MAX_VALUE, 0.0, 0.0);
      BisectionSolver bisectionSolver0 = new BisectionSolver((-5.685526961588504), 0.0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) stepProblem0, 0.0, 0.0, (-1938), (UnivariateSolver) bisectionSolver0);
      Collection<EventHandler> collection0 = graggBulirschStoerIntegrator0.getEventHandlers();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-6.985952908805853E76));
      double double0 = classicalRungeKuttaIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(5.6);
      int int0 = classicalRungeKuttaIntegrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0, 1.0, 2560.303499889, 1.0);
      int int0 = graggBulirschStoerIntegrator0.getEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.getCurrentSignedStepsize();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, (double) 1, (double) 1, doubleArray0, doubleArray0);
      StepNormalizerOutputTest stepNormalizerOutputTest0 = new StepNormalizerOutputTest();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) stepNormalizerOutputTest0);
      // Undeclared exception!
      try { 
        adamsBashforthIntegrator0.integrate(expandableStatefulODE0, (double) 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math3.ode.MultistepIntegrator$NordsieckInitializer", e);
      }
  }
}
