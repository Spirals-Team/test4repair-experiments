/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 12:16:36 GMT 2017
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.TestProblem5;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.nonstiff.StepProblem;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest;
import org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((double) Integer.MAX_VALUE, (-3144.569257258), 1011.085459854);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) Integer.MAX_VALUE;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4.050833763855709E-193, (double) Integer.MAX_VALUE, doubleArray0, doubleArray0);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(761.1406075203889, 3896.951960737746);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) stepProblem0, 761.1406075203889, 3896.951960737746, 10, (UnivariateSolver) regulaFalsiSolver0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) stepProblem0, (-237.1), (double) (-739), Integer.MAX_VALUE);
      graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, (-5132.18), doubleArray0, 2793.141426835221, doubleArray0);
      assertArrayEquals(new double[] {1.319470399406499E13}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((double) Integer.MAX_VALUE, (-3144.569257258), 1011.085459854);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) Integer.MAX_VALUE;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4.050833763855709E-193, (double) Integer.MAX_VALUE, doubleArray0, doubleArray0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) stepProblem0);
      expandableStatefulODE0.setTime((-237.1));
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 223.7151963746576);
      graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, (-5132.18), doubleArray0, 2793.141426835221, doubleArray0);
      assertArrayEquals(new double[] {1.7021645644994344E13}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1.0), (-1.0), (-465.5595739884), (-1.0));
      double[] doubleArray0 = new double[3];
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      double[] doubleArray1 = new double[9];
      try { 
        dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, (-465.5595739884), doubleArray0, (-465.5595739884), doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 1
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 2353.35, 0.0, 2353.35);
      StepNormalizerOutputTest stepNormalizerOutputTest0 = new StepNormalizerOutputTest();
      double[] doubleArray0 = new double[0];
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputTest0, (double) Integer.MAX_VALUE, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 1
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-237.1));
      StepProblem stepProblem0 = new StepProblem((double) Integer.MAX_VALUE, (-3144.569257258), 1011.085459854);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) stepProblem0);
      expandableStatefulODE0.setTime((-739));
      eulerIntegrator0.integrate(expandableStatefulODE0, 2457.2);
      assertEquals(2457.2, expandableStatefulODE0.getTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-237.1));
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      
      StepProblem stepProblem0 = new StepProblem((double) Integer.MAX_VALUE, (-3144.569257258), 1011.085459854);
      double[] doubleArray0 = new double[1];
      double double0 = eulerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, 1203.23453694657, doubleArray0, (double) (-739), doubleArray0);
      assertArrayEquals(new double[] {(-4.170916906731377E12)}, doubleArray0, 0.01);
      assertEquals((-739.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-3.081552929643174E-9));
      eulerIntegrator0.setMaxEvaluations(0);
      int int0 = eulerIntegrator0.getMaxEvaluations();
      assertEquals(0, int0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((double) Integer.MAX_VALUE, (-3144.569257258), 1011.085459854);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) Integer.MAX_VALUE;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(296.0, 1274.1434998865652, doubleArray0, doubleArray0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) stepProblem0);
      expandableStatefulODE0.setTime((-237.1));
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 223.7151963746576);
      int int0 = graggBulirschStoerIntegrator0.getEvaluations();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getCurrentSignedStepsize();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3284.62377, (-1920.024933447), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.addStepHandler((StepHandler) null);
      TestProblem5 testProblem5_0 = new TestProblem5();
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, 0.0, doubleArray0, 3284.62377, doubleArray0);
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
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.1, 0.1, 0.1, 0.1);
      TestProblem5 testProblem5_0 = new TestProblem5();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) testProblem5_0);
      dormandPrince853Integrator0.setMaxEvaluations(4);
      try { 
        dormandPrince853Integrator0.integrate(expandableStatefulODE0, 0.1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (4) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(Double.NaN, (-1084.33529), doubleArray0, doubleArray0);
      StepProblem stepProblem0 = new StepProblem(3314.994615739855, 1111.004989, Double.NaN);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) stepProblem0);
      try { 
        highamHall54Integrator0.integrate(expandableStatefulODE0, (-928.44353230459));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 396.542569431539, Double.NaN, 0.0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((ExpandableStatefulODE) null, 396.542569431539);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, (-0.020331201708508627), (-2428.91705624), 0.0);
      double[] doubleArray0 = new double[3];
      dormandPrince853Integrator0.setMaxEvaluations(0);
      try { 
        dormandPrince853Integrator0.computeDerivatives((-2428.91705624), doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(Double.NaN, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setMaxEvaluations((-1));
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.0);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      classicalRungeKuttaIntegrator0.addStepHandler(dummyStepHandler0);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(223.7151963746576);
      midpointIntegrator0.clearEventHandlers();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-237.1));
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        eulerIntegrator0.computeDerivatives(4.050833763855709E-193, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(223.365);
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      double[] doubleArray0 = new double[1];
      try { 
        midpointIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, 4059.6000000002273, doubleArray0, 4059.6000000002273, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(140.0, 140.0, (-829.86), (-829.86));
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[6];
      try { 
        dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, 2.0483260435783403E-214, doubleArray0, 3283.4237700000003, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 2
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(0.0);
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(0.0);
      StepProblem stepProblem0 = new StepProblem((-1223.07075), 1831.046087, 0.0);
      eulerIntegrator0.addEventHandler((EventHandler) stepProblem0, 2.2737367544323206E-10, (-1223.07075), 952, (UnivariateSolver) brentSolver0);
      eulerIntegrator0.getEventHandlers();
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(140.0, 140.0, (-829.86), (-829.86));
      String string0 = dormandPrince54Integrator0.getName();
      assertEquals("Dormand-Prince 5(4)", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(223.71519637466);
      midpointIntegrator0.getStepHandlers();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-3.081552929643174E-9));
      double double0 = eulerIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(223.7151963746576);
      int int0 = midpointIntegrator0.getMaxEvaluations();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(296.0, 1274.1434998865652, doubleArray0, doubleArray0);
      int int0 = graggBulirschStoerIntegrator0.getEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.0);
      double double0 = classicalRungeKuttaIntegrator0.getCurrentSignedStepsize();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(223.7151963746576);
      midpointIntegrator0.clearStepHandlers();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-237.1));
      StepProblem stepProblem0 = new StepProblem((double) Integer.MAX_VALUE, (-3144.569257258), 1011.085459854);
      double[] doubleArray0 = new double[1];
      eulerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, (-3144.569257258), doubleArray0, 761.1406075203889, doubleArray0);
      eulerIntegrator0.computeDerivatives(4.050833763855709E-193, doubleArray0, doubleArray0);
      assertEquals("Euler", eulerIntegrator0.getName());
  }
}