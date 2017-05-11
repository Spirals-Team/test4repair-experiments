/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 10 09:10:25 GMT 2017
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.analysis.solvers.IllinoisSolver;
import org.apache.commons.math3.analysis.solvers.MullerSolver2;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.TestProblem5;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.StepProblem;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1000.0);
      StepProblem stepProblem0 = new StepProblem(1522.991711, 0.0, 1000.0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      eulerIntegrator0.addEventHandler((EventHandler) stepProblem0, 1000.0, 205.2925238279234, Integer.MAX_VALUE, (UnivariateSolver) illinoisSolver0);
      MullerSolver2 mullerSolver2_0 = new MullerSolver2((-1814.140799313355), (double) Integer.MAX_VALUE);
      eulerIntegrator0.addEventHandler((EventHandler) stepProblem0, (-572.0), 205.2925238279234, Integer.MAX_VALUE, (UnivariateSolver) mullerSolver2_0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      
      double[] doubleArray0 = new double[1];
      double double0 = eulerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, 0.0, doubleArray0, 1000.0, doubleArray0);
      assertArrayEquals(new double[] {1522991.711}, doubleArray0, 0.01);
      assertEquals(1000.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1397.63752675), (-1397.63752675), (-1397.63752675), 4319.80755733);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[9];
      testProblem5_0.setInitialConditions(0.0, doubleArray0);
      double[] doubleArray1 = new double[1];
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, 4319.80755733, doubleArray0, (-1397.63752675), doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 9
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator((-892.32));
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[7];
      try { 
        gillIntegrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, (double) 0, doubleArray0, 0.0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 != 2
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(706.2157481521205);
      eulerIntegrator0.setMaxEvaluations(235);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1000.0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      
      StepProblem stepProblem0 = new StepProblem(1522.991711, 0.0, 1000.0);
      double[] doubleArray0 = new double[1];
      double double0 = eulerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, 0.0, doubleArray0, (-4518.62167562), doubleArray0);
      assertArrayEquals(new double[] {(-6881823.35711419)}, doubleArray0, 0.01);
      assertEquals((-4518.62167562), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(706.2157481521205);
      eulerIntegrator0.setMaxEvaluations(0);
      int int0 = eulerIntegrator0.getMaxEvaluations();
      assertEquals(0, int0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1000.0);
      StepProblem stepProblem0 = new StepProblem(1522.9954467777623, 0.0, 1000.0);
      double[] doubleArray0 = new double[1];
      eulerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, 0.0, doubleArray0, 1000.0, doubleArray0);
      int int0 = eulerIntegrator0.getEvaluations();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getCurrentSignedStepsize();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1000.0);
      StepProblem stepProblem0 = new StepProblem(1522.991711, 0.0, 1000.0);
      double[] doubleArray0 = new double[1];
      BrentSolver brentSolver0 = new BrentSolver(1522.991711, 1522.991711);
      eulerIntegrator0.addEventHandler((EventHandler) stepProblem0, Double.NaN, 0.0, (-3447), (UnivariateSolver) brentSolver0);
      try { 
        eulerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, 0.0, doubleArray0, 1000.0, doubleArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-3,447) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.2, 0.0, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, 1.0, (double[]) null, 0.0, doubleArray0);
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
      double[] doubleArray0 = new double[9];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1312.7482, (-678.909944909558), doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) testProblem5_0);
      try { 
        highamHall54Integrator0.integrate(expandableStatefulODE0, 229.3461195081864);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 9
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(414.335836835307, 7.3, 414.335836835307, 7.3);
      // Undeclared exception!
      try { 
        highamHall54Integrator0.integrate((ExpandableStatefulODE) null, 7.3);
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
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(706.2157481521205);
      double[] doubleArray0 = new double[8];
      eulerIntegrator0.setMaxEvaluations(0);
      try { 
        eulerIntegrator0.computeDerivatives(0.0, doubleArray0, doubleArray0);
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
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(706.2157481521205);
      eulerIntegrator0.setMaxEvaluations((-851));
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator((-1.0));
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      gillIntegrator0.addStepHandler(dummyStepHandler0);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(715.05703525, 0.13095238095238096, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.clearEventHandlers();
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1000.0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        eulerIntegrator0.computeDerivatives(3400.92023521, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1397.63752675), (-1397.63752675), (-1397.63752675), (-1397.63752675));
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[9];
      testProblem5_0.setInitialConditions(0.0, doubleArray0);
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, (-1397.63752675), doubleArray0, (-1397.63752675), doubleArray0);
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
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1397.63752675), (-1397.63752675), (-1397.63752675), 4319.80755733);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[9];
      testProblem5_0.setInitialConditions((-1397.63752675), doubleArray0);
      double[] doubleArray1 = new double[10];
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, 613.0, doubleArray0, (-1397.63752675), doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 10 != 9
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, (-1757.070964367524));
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[1];
      try { 
        dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, (-3807.044979217489), doubleArray0, (-1757.070964367524), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 2
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1000.0);
      eulerIntegrator0.setMaxEvaluations(0);
      StepProblem stepProblem0 = new StepProblem(1522.991711, 0.0, 1000.0);
      double[] doubleArray0 = new double[1];
      try { 
        eulerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, 0.0, doubleArray0, 1000.0, doubleArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      StepProblem stepProblem0 = new StepProblem(0.0, (-473.37), 0.0);
      dormandPrince54Integrator0.addEventHandler((EventHandler) stepProblem0, 0.0, 0.0, 244);
      Collection<EventHandler> collection0 = dormandPrince54Integrator0.getEventHandlers();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(706.2157481521205);
      eulerIntegrator0.getName();
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(706.2157481521205);
      eulerIntegrator0.getStepHandlers();
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(522.9917109999999);
      StepProblem stepProblem0 = new StepProblem((-1170.863), (-1170.863), 522.9917109999999);
      threeEighthesIntegrator0.addEventHandler((EventHandler) stepProblem0, (-2399.828576036743), 999.1970463440563, 220);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(0.0);
      double double0 = gillIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1000.0);
      int int0 = eulerIntegrator0.getMaxEvaluations();
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1000.0);
      eulerIntegrator0.getEvaluations();
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(0.0);
      double double0 = gillIntegrator0.getCurrentSignedStepsize();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1000.0);
      eulerIntegrator0.clearStepHandlers();
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1000.0);
      StepProblem stepProblem0 = new StepProblem(3657.904531287319, (-7.771851003708454), 1000.0);
      double[] doubleArray0 = new double[1];
      eulerIntegrator0.integrate((FirstOrderDifferentialEquations) stepProblem0, 0.0, doubleArray0, 1000.0, doubleArray0);
      eulerIntegrator0.computeDerivatives(3400.92023521, doubleArray0, doubleArray0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }
}
