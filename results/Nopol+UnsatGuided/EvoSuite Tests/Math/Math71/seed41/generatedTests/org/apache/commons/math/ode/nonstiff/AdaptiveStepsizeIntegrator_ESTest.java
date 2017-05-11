/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 10 15:44:17 GMT 2017
 */

package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.TestProblem5;
import org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math.ode.nonstiff.StepProblem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AdaptiveStepsizeIntegrator_ESTest extends AdaptiveStepsizeIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(2.843164437819893E-6, (-0.10416666666666667), (-833.0), 2166.0);
      double double0 = highamHall54Integrator0.filterStep(0, true, true);
      assertEquals(5.442085650491965E-4, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(2.843164437819893E-6, double0, 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 0.0);
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, (-417.12568));
      dormandPrince54Integrator0.setInitialStepSize(0.0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.initializeStep(stepProblem0, false, (-3273), doubleArray0, (-417.12568), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(503.588386, 503.588386, doubleArray0, doubleArray0);
      StepProblem stepProblem0 = new StepProblem((-2403.2), (-512.0000000000001), (-2041.0));
      graggBulirschStoerIntegrator0.sanityChecks(stepProblem0, 503.588386, doubleArray0, (-512.0000000000001), doubleArray0);
      assertEquals(503.588386, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-427.3623284626841), Double.NaN, Double.NaN, 1137963.0);
      dormandPrince853Integrator0.resetInternalState();
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(427.3623284626841, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.414213562373095, 1.414213562373095, 1.414213562373095, 1078.89842);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      graggBulirschStoerIntegrator0.integrate(testProblem5_0, 0.001, doubleArray0, 1.414213562373095, doubleArray0);
      assertEquals(8, testProblem5_0.getCalls());
      assertEquals(1.413213562373095, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.7656348732002608, 0.7656348732002608, 0.7656348732002608, 0.7656348732002608);
      double double0 = dormandPrince54Integrator0.getMinStep();
      assertEquals(0.7656348732002608, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.7656348732002608, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-2550.364), (-2550.364), doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getMinStep();
      assertEquals(2550.364, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-2550.364), double0, 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1.0, 1.0, doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getMaxStep();
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(1.0, double0, 0.01);
      assertEquals(1.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-937.41), (-937.41), doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMaxStep();
      assertEquals(937.41, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-937.41), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 0.0);
      double double0 = dormandPrince54Integrator0.filterStep(0.0, false, false);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1098.3977825531344), 2176.206942488, (-1098.3977825531344), 2176.206942488);
      double double0 = graggBulirschStoerIntegrator0.filterStep(0.0, false, true);
      assertEquals((-1098.3977825531344), double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(1546.0727279159787, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, (-599.5095859327434), 0.0, 0.0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[0];
      try { 
        dormandPrince54Integrator0.sanityChecks(testProblem5_0, 940.1503263040726, doubleArray0, (-599.5095859327434), doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 2, initial state vector has dimension 0
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-205.19117940071), 1029.038, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        highamHall54Integrator0.sanityChecks((FirstOrderDifferentialEquations) null, 1029.038, doubleArray0, 100.0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-779.522765), (-779.522765), 660.6976, 1.1102230246251565E-16);
      StepProblem stepProblem0 = new StepProblem(660.6976, 660.6976, 0.01);
      double[] doubleArray0 = new double[0];
      try { 
        dormandPrince853Integrator0.integrate(stepProblem0, 0.0, doubleArray0, 0.01, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 1, initial state vector has dimension 0
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1089.37967, 0.0, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) null, 1089.37967, doubleArray0, (-367.3), doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-937.41), (-937.41), doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray1 = new double[4];
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.initializeStep(testProblem5_0, false, (-3935), doubleArray0, (-937.41), doubleArray0, doubleArray1, doubleArray0, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(462.0, 462.0, doubleArray0, doubleArray0);
      try { 
        highamHall54Integrator0.filterStep(0.0, false, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (4.62E02) reached, integration needs 0.00E00
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.0E-10, 0.0, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.initializeStep(testProblem5_0, true, (-1), doubleArray0, 1928.1495499, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 0.0);
      double double0 = dormandPrince54Integrator0.getMinStep();
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(4527.3, 0.0, 0.0, 0.001);
      double double0 = highamHall54Integrator0.getMaxStep();
      assertEquals(4527.3, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.414213562373095, 1.414213562373095, 1.414213562373095, 1078.89842);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-3441.682628935295);
      try { 
        graggBulirschStoerIntegrator0.integrate(testProblem5_0, 0.0, doubleArray0, (-392.160551220139), doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (1.41E00) reached, integration needs 7.07E-01
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (double) 2, (-1535.122), (double) 2, (-1535.122));
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      adamsBashforthIntegrator0.integrate(testProblem5_0, 0.7656, doubleArray0, (-0.7656348732002608), doubleArray0);
      assertEquals(38, testProblem5_0.getCalls());
      assertEquals(38, adamsBashforthIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(720.19764207298, 720.19764207298, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      dormandPrince54Integrator0.setInitialStepSize(720.19764207298);
      double double0 = dormandPrince54Integrator0.initializeStep(testProblem5_0, true, 2129, doubleArray0, 0.0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(720.19764207298, double0, 0.01);
      assertEquals(720.19764207298, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-427.3623284626841), Double.NaN, Double.NaN, 1137963.0);
      dormandPrince853Integrator0.setInitialStepSize(1935.0);
      StepProblem stepProblem0 = new StepProblem(180.0, 180.0, 180.0);
      double double0 = dormandPrince853Integrator0.initializeStep(stepProblem0, false, 8, doubleArray0, 1.718281828459045, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals((-1935.0), double0, 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(427.3623284626841, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[8];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-6, 1.0E-6, doubleArray0, doubleArray1);
      StepProblem stepProblem0 = new StepProblem(1.0E-15, 1.0E-6, 17.0);
      try { 
        graggBulirschStoerIntegrator0.integrate(stepProblem0, 631.6526605846765, doubleArray0, 1.0E-6, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: state vector has dimension 1, relative tolerance vector has dimension 8
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-2550.364), (-2550.364), doubleArray0, doubleArray0);
      highamHall54Integrator0.setInitialStepSize((-1483.5595918));
      assertEquals(2550.364, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(720.19764207298, 720.19764207298, doubleArray0, doubleArray0);
      dormandPrince54Integrator0.setInitialStepSize(9.0);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(720.19764207298, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-0.4957589496572502), 2176.206942488, 2176.206942488, 0.0);
      double double0 = dormandPrince54Integrator0.getCurrentStepStart();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(32.84621847404457, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.414213562373095, 1.414213562373095, 1.414213562373095, 1078.89842);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      graggBulirschStoerIntegrator0.integrate(testProblem5_0, 0.0, doubleArray0, (-392.160551220139), doubleArray0);
      assertEquals(1961, testProblem5_0.getCalls());
      assertEquals(1.414213562373095, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }
}
