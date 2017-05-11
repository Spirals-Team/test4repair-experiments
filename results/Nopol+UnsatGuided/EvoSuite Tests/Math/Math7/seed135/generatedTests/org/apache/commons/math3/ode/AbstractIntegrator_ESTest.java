/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 14 05:37:26 GMT 2017
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.TestProblem5;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.nonstiff.StepProblem;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
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
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.5301685333251953);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      double[] doubleArray0 = new double[1];
      midpointIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, 0.5301685333251953, doubleArray0, 0.6884893787679021, doubleArray0);
      double double0 = midpointIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, 1.1852121353149414, doubleArray0, 0.4345239027012372, doubleArray0);
      assertEquals(0.4345239027012372, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(Double.NaN, Double.NaN, doubleArray0, doubleArray0);
      StepNormalizerOutputTest stepNormalizerOutputTest0 = new StepNormalizerOutputTest();
      double[] doubleArray1 = new double[0];
      try { 
        dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputTest0, (-1.0), doubleArray0, 497.167945, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 9 != 1
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(10.0, 10.0, 0.0, 10.0);
      StepProblem stepProblem0 = new StepProblem(0.0, 1162.79375788, 6121.20097);
      dormandPrince54Integrator0.addEventHandler((EventHandler) stepProblem0, 10.0, 4392.85302509, 0);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.6059582233428955);
      StepProblem stepProblem0 = new StepProblem((-1687.0), (-295.22), 4.440892098500626E-13);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) stepProblem0);
      expandableStatefulODE0.setTime((-2054));
      classicalRungeKuttaIntegrator0.integrate(expandableStatefulODE0, (-2743.470805825719));
      assertEquals("classical Runge-Kutta", classicalRungeKuttaIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.5301685333251953);
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      double[] doubleArray0 = new double[1];
      double double0 = midpointIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, 0.5301685333251953, doubleArray0, 0.0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-9.15095847217987), (-1136.8729887605), (-1136.8729887605), (-9.15095847217987));
      graggBulirschStoerIntegrator0.setMaxEvaluations(0);
      int int0 = graggBulirschStoerIntegrator0.getMaxEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.5301685333251953);
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      double[] doubleArray0 = new double[1];
      midpointIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, 0.5301685333251953, doubleArray0, (-0.0017897164691161069), doubleArray0);
      int int0 = midpointIntegrator0.getEvaluations();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1.0, 0.0, 18.0, 1.0);
      double double0 = highamHall54Integrator0.getCurrentSignedStepsize();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      StepNormalizerOutputTest stepNormalizerOutputTest0 = new StepNormalizerOutputTest();
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-2065.38706));
      // Undeclared exception!
      try { 
        threeEighthesIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputTest0, (-611.847362), (double[]) null, (-611.847362), doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-9.15095847217987), (-1136.8729887605), (-1136.8729887605), (-9.15095847217987));
      graggBulirschStoerIntegrator0.setMaxEvaluations(0);
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0);
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-1360.12));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-141.802737), 1115.241605868956, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) testProblem5_0);
      try { 
        highamHall54Integrator0.integrate(expandableStatefulODE0, (-10.757575757575758));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 3
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-1.0), doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((ExpandableStatefulODE) null, Double.NaN);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.3055872321128845, 0.3055872321128845, (-872.0), (-872.0));
      double[] doubleArray0 = new double[4];
      highamHall54Integrator0.setMaxEvaluations(0);
      try { 
        highamHall54Integrator0.computeDerivatives(1.0, doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.6059582233428955);
      classicalRungeKuttaIntegrator0.setMaxEvaluations((-2054));
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1.4504190983558733);
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.INCREMENT;
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.FIRST;
      StepNormalizer stepNormalizer0 = new StepNormalizer((-0.08899), (FixedStepHandler) stepNormalizerOutputOverlapTest0, stepNormalizerMode0, stepNormalizerBounds0);
      midpointIntegrator0.addStepHandler(stepNormalizer0);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-9.15095847217987), (-1136.8729887605), (-1136.8729887605), (-9.15095847217987));
      graggBulirschStoerIntegrator0.clearEventHandlers();
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-9.15095847217987), (-1136.8729887605), (-1136.8729887605), (-9.15095847217987));
      graggBulirschStoerIntegrator0.clearStepHandlers();
      assertEquals(1136.8729887605, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.3055872321128845, 0.3055872321128845, (-872.0), (-872.0));
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        highamHall54Integrator0.computeDerivatives(1.0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((double) 1966);
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      double[] doubleArray0 = new double[1];
      try { 
        eulerIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, (double) 1966, doubleArray0, (double) 1966, doubleArray0);
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
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(6.6, 6.6, (-0.8613172805084709), (-383.2799105776));
      StepProblem stepProblem0 = new StepProblem((double) (-56), 1626.499800316, 1626.499800316);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1499.0795600169), (-1499.0795600169), (-3.2869429323931043));
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) stepProblem0, (-383.2799105776), 6.6, (-56), (UnivariateSolver) regulaFalsiSolver0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) testProblem5_0);
      expandableStatefulODE0.setTime(6.6);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 5.5);
      assertEquals(6.6, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1674.7661435989, 1674.7661435989, 0.0, 1674.7661435989);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = testProblem5_0.computeTheoreticalState(0.0);
      double[] doubleArray1 = new double[13];
      testProblem5_0.setInitialConditions(1674.7661435989, doubleArray1);
      try { 
        dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, 1674.7661435989, doubleArray1, 0.0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 13
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(4392.85302509);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[0];
      try { 
        midpointIntegrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, 4392.85302509, doubleArray0, 4392.85302509, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 2
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(5, (-39.6785076393748), (-970.0), 3914.0, (double) 5);
      adamsBashforthIntegrator0.setMaxEvaluations(Integer.MAX_VALUE);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.5301685333251953);
      midpointIntegrator0.getEventHandlers();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.5301685333251953);
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      double[] doubleArray0 = new double[1];
      StepProblem stepProblem0 = new StepProblem(5423.47007023, 5423.47007023, 0.6249561309814453);
      BrentSolver brentSolver0 = new BrentSolver();
      midpointIntegrator0.addEventHandler((EventHandler) stepProblem0, 1799.67396426797, 0.0, 54, (UnivariateSolver) brentSolver0);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      double double0 = midpointIntegrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, 0.5301685333251953, doubleArray0, 0.6870017394121852, doubleArray0);
      assertEquals(0.6870017394121852, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.6059582233428955);
      classicalRungeKuttaIntegrator0.getName();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(10.0, 10.0, 0.0, 10.0);
      Collection<StepHandler> collection0 = dormandPrince54Integrator0.getStepHandlers();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(864.0);
      StepProblem stepProblem0 = new StepProblem(864.0, 36.52917025056327, 2108.330417519);
      eulerIntegrator0.addEventHandler((EventHandler) stepProblem0, 2108.330417519, 2108.330417519, 477);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.3055872321128845, 0.3055872321128845, (-872.0), (-872.0));
      StepProblem stepProblem0 = new StepProblem(999.4698314666748, 4392.85302509, 4.2657777816050375E-213);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(999.4698314666748, 1361.454365175926);
      highamHall54Integrator0.addEventHandler((EventHandler) stepProblem0, 999.4698314666748, (-872.0), 0, (UnivariateSolver) regulaFalsiSolver0);
      Collection<EventHandler> collection0 = highamHall54Integrator0.getEventHandlers();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-2065.38706));
      double double0 = threeEighthesIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-9.15095847217987), (-1136.8729887605), (-1136.8729887605), (-9.15095847217987));
      int int0 = graggBulirschStoerIntegrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.5301685333251953);
      midpointIntegrator0.getEvaluations();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-9.15095847217987), (-1136.8729887605), (-1136.8729887605), (-9.15095847217987));
      double double0 = graggBulirschStoerIntegrator0.getCurrentSignedStepsize();
      assertEquals(101.99743873397188, double0, 0.01);
  }
}
