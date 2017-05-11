/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 11 06:16:19 GMT 2017
 */

package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.TestProblem5;
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
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(564.952, 564.952, 564.952, (-631.784));
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 109.64649624786;
      try { 
        graggBulirschStoerIntegrator0.integrate(testProblem5_0, 109.64649624786, doubleArray0, (-631.784), doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (5.65E02) reached, integration needs 2.82E02
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.2, 1.2, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInitialStepSize(1.2);
      StepProblem stepProblem0 = new StepProblem((-253.3630424), (-5228.225232493964), 3098.6);
      double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, false, 1263, doubleArray0, 1.2, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(1.2, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-1.2), double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 1117.1093, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.setInitialStepSize(0.0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.initializeStep(testProblem5_0, true, 3, doubleArray0, Double.NaN, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-248.5339), (-248.5339), doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[8];
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) null, (-248.5339), doubleArray0, (-248.5339), doubleArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 65.2613558);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      graggBulirschStoerIntegrator0.sanityChecks(testProblem5_0, (-0.27), doubleArray0, 65.2613558, doubleArray0);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(15.697238121770845, 0.0, doubleArray0, doubleArray0);
      highamHall54Integrator0.resetInternalState();
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(15.697238121770845, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, (-1.0), 0.0, 0.0);
      double double0 = highamHall54Integrator0.getMinStep();
      assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(1.0, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2834.545017426537), 0.0, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.getMinStep();
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(-0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-2834.545017426537), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getMaxStep();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, (-286.112336401), doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMaxStep();
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-286.112336401), double0, 0.01);
      assertEquals(-0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 0.0);
      double double0 = dormandPrince853Integrator0.filterStep(0.0, false, false);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(227.50553867820582, 227.50553867820582, 0.0, 0.0);
      double double0 = graggBulirschStoerIntegrator0.filterStep(0.075, true, true);
      assertEquals(227.50553867820582, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(227.50553867820582, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.2, (-253.3630424), 1.2, (-253.3630424));
      StepProblem stepProblem0 = new StepProblem((-253.3630424), (-5228.225232493964), 3098.6);
      try { 
        graggBulirschStoerIntegrator0.sanityChecks(stepProblem0, (-26.4487168125169), doubleArray0, 1.2, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 1, initial state vector has dimension 7
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1137.719739576), (-1647.1800257), 170.004618, 574.155);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.sanityChecks((FirstOrderDifferentialEquations) null, 574.155, doubleArray0, (-4.422011983080043), doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.3, 0.3, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) null, 0.3, doubleArray0, 130.0, doubleArray0);
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
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-43.53345659001114), (-43.53345659001114), doubleArray0, doubleArray0);
      double[][] doubleArray1 = new double[8][6];
      double[] doubleArray2 = new double[6];
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.initializeStep((FirstOrderDifferentialEquations) null, false, 1511, doubleArray0, (-43.53345659001114), doubleArray2, doubleArray2, doubleArray1[0], doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(2690.0, 2690.0, 2690.0, (-2003.33));
      try { 
        dormandPrince853Integrator0.filterStep((-2003.33), false, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (2.69E03) reached, integration needs 2.00E03
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(5.746280211439194, 3457480.0, 5.746280211439194, 816.8614057);
      StepProblem stepProblem0 = new StepProblem((-0.84375), (-0.84375), (-0.84375));
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.integrate(stepProblem0, 5.746280211439194, doubleArray0, 378.57101686, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, false, (-433), doubleArray0, (-3457480.0), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(58.78117044785745, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-5.746280211439194), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(5.746280211439194, 3457480.0, 5.746280211439194, 816.5335546814273);
      StepProblem stepProblem0 = new StepProblem((-0.84375), 0.075, 0.075);
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.integrate(stepProblem0, 5.746280211439194, doubleArray0, 378.57101686, doubleArray0);
      double[] doubleArray1 = new double[1];
      double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, true, (-433), doubleArray1, (-3457480.0), doubleArray1, doubleArray1, doubleArray1, doubleArray0);
      assertEquals(58.78117044785745, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-859.6235826837602);
      doubleArray0[1] = 453.3300268885;
      doubleArray0[2] = (double) 1550;
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-903.466337617871), (-2063.475437580507), doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[5];
      TestProblem5 testProblem5_0 = new TestProblem5();
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.initializeStep(testProblem5_0, false, 1550, doubleArray0, 1613.0, doubleArray0, doubleArray1, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(737.493006452546, 737.493006452546, doubleArray0, doubleArray0);
      StepProblem stepProblem0 = new StepProblem(0.0, Double.NaN, 0.0);
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.initializeStep(stepProblem0, false, (-2146630729), doubleArray0, 2198.563432769732, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-5.685526961588504), (-1543.20858036), (-1543.20858036), (-5.685526961588504));
      double double0 = graggBulirschStoerIntegrator0.getMinStep();
      assertEquals(5.685526961588504, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(93.6693866265361, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-5.685526961588504), (-1543.20858036), (-1543.20858036), (-5.685526961588504));
      double double0 = graggBulirschStoerIntegrator0.getMaxStep();
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(1543.20858036, double0, 0.01);
      assertEquals(93.6693866265361, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2333.55592, 100.0, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep(100.0, false, true);
      assertEquals(483.06893089910056, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals((-100.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 227.50553867820582;
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(227.50553867820582, 0.0, doubleArray0, doubleArray0);
      try { 
        highamHall54Integrator0.integrate(stepProblem0, (-1623), doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (2.28E02) reached, integration needs 0.00E00
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.2527665552160898, 0.2527665552160898, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInitialStepSize(0.2527665552160898);
      StepProblem stepProblem0 = new StepProblem((-31.139403219565178), (-5228.225232493964), 0.0);
      double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, true, 1263, doubleArray0, 0.2527665552160898, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(0.2527665552160898, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.2527665552160898, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.2, (-253.3630424), 1.2, (-253.3630424));
      graggBulirschStoerIntegrator0.setInitialStepSize(1.2);
      StepProblem stepProblem0 = new StepProblem((-253.3630424), (-5228.225232493964), 3098.6);
      double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, false, 1263, doubleArray0, 1.2, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals((-1.2), double0, 0.01);
      assertEquals(17.436618103290556, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[16];
      double[] doubleArray1 = new double[2];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1605.526, 1605.526, doubleArray1, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        dormandPrince54Integrator0.integrate(testProblem5_0, 1605.526, doubleArray1, 3130.0, doubleArray1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: state vector has dimension 2, relative tolerance vector has dimension 16
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[2];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1605.526, Double.NaN, doubleArray0, doubleArray1);
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        dormandPrince54Integrator0.integrate(testProblem5_0, 1.0E-6, doubleArray1, Double.NaN, doubleArray1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: state vector has dimension 2, absolute tolerance vector has dimension 5
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(15.697238121770845, 0.0, doubleArray0, doubleArray0);
      highamHall54Integrator0.setInitialStepSize(280.74705188);
      assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(15.697238121770845, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(15.697238121770845, 0.0, doubleArray0, doubleArray0);
      highamHall54Integrator0.setInitialStepSize(0.0);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(15.697238121770845, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-3048.7227448), 0.075, (-565.64));
      double double0 = graggBulirschStoerIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(3048.7227448, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-3048.7227448), 0.075, (-565.64));
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.integrate(stepProblem0, 1716.4456244786709, doubleArray0, 360.0, doubleArray0);
      assertEquals((-1093.2307347018955), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }
}
