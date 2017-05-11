/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 11 11:14:26 GMT 2017
 */

package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.TestProblem5;
import org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator;
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
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-979.91), (-3150.2360580306513), 0.0, 0.0);
      double double0 = highamHall54Integrator0.filterStep(0.0, false, true);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-979.91), double0, 0.01);
      assertEquals(1756.9712051211357, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(2674.3994413576643, 3.897258715788584E-7, 3.897258715788584E-7, 1.0E-15);
      double double0 = dormandPrince853Integrator0.filterStep(1.0E-15, true, true);
      assertEquals(0.032284402630885514, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(3.897258715788584E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 0.0);
      dormandPrince853Integrator0.setInitialStepSize(0.0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.initializeStep(testProblem5_0, false, 1, doubleArray0, 0.0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[6];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(10, (double) 10, (double) 10, doubleArray0, doubleArray1);
      // Undeclared exception!
      try { 
        adamsBashforthIntegrator0.integrate((FirstOrderDifferentialEquations) null, 0.0, doubleArray1, 10, doubleArray0);
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
      StepProblem stepProblem0 = new StepProblem(1.1102230246251565E-16, 1.1102230246251565E-16, 1.1102230246251565E-16);
      double[] doubleArray0 = new double[1];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(5.708345053925727E-13, 1.1102230246251565E-16, (-861.88424), 0.3010299956639812);
      dormandPrince853Integrator0.sanityChecks(stepProblem0, 2141.83, doubleArray0, 0.3010299956639812, doubleArray0);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(7.960864344638384E-15, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-336.7721108), (-1666.8504261768326), (-336.7721108), (-0.871391583777973));
      highamHall54Integrator0.resetInternalState();
      assertEquals(749.2320978251342, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1.1102230246251565E-16, 1.1102230246251565E-16, 1.1102230246251565E-16, 1.1102230246251565E-16);
      StepProblem stepProblem0 = new StepProblem(1.1102230246251565E-16, 1.1102230246251565E-16, 1.1102230246251565E-16);
      double[] doubleArray0 = new double[1];
      dormandPrince54Integrator0.integrate(stepProblem0, 1.1102230246251565E-16, doubleArray0, 0.0, doubleArray0);
      assertEquals(14, dormandPrince54Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(16.09629537188588, (-1600.8446), (-1600.8446), (-1600.8446));
      double double0 = dormandPrince54Integrator0.getMinStep();
      assertEquals(160.52310589472316, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(16.09629537188588, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1048.4079410768215), (-1324.2698253), doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMinStep();
      assertEquals(1178.2932576285648, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-1048.4079410768215), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 2046.7137, doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getMaxStep();
      assertEquals(2046.7137, double0, 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-173.0), (-1039.1455341), doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMaxStep();
      assertEquals(423.995492192193, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-1039.1455341), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 0.0);
      double double0 = dormandPrince54Integrator0.filterStep(0.0, false, false);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-653.2137), (-653.2137), doubleArray0, doubleArray0);
      StepProblem stepProblem0 = new StepProblem((-653.2137), (-653.2137), 0.0);
      try { 
        highamHall54Integrator0.sanityChecks(stepProblem0, (-653.2137), doubleArray0, 5113.53262102, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 1, initial state vector has dimension 5
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, (-541.210393365), 0.0);
      StepProblem stepProblem0 = new StepProblem(0.0, 0.25, (-2776.18839));
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.sanityChecks(stepProblem0, (-2776.18839), (double[]) null, (-247.37851623), (double[]) null);
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
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, (double) 2, 398.3, (-44.0), (double) 2);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        adamsMoultonIntegrator0.integrate(testProblem5_0, (-44.0), (double[]) null, (-44.0), doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(2576.063, 0.3010299956639812, doubleArray0, doubleArray0);
      highamHall54Integrator0.setMaxEvaluations(0);
      StepProblem stepProblem0 = new StepProblem((-1570.676606), 0.3010299956639812, (-1598.5894449963369));
      try { 
        highamHall54Integrator0.initializeStep(stepProblem0, false, 0, doubleArray0, 0.2980196957073414, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 0.0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[2];
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.initializeStep(testProblem5_0, false, 1, doubleArray0, 0.0, doubleArray0, doubleArray0, doubleArray1, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1146.349077837984, 1146.349077837984, 1146.349077837984, 1146.349077837984);
      try { 
        dormandPrince853Integrator0.filterStep(979.4481175, false, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (1.15E03) reached, integration needs 9.79E02
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1.1102230246251565E-16, (-1600.8446), (-1600.8446), (-1600.8446));
      StepProblem stepProblem0 = new StepProblem((-1600.8446), 1.1102230246251565E-16, (-1600.8446));
      double[] doubleArray0 = new double[1];
      dormandPrince54Integrator0.integrate(stepProblem0, (-1600.8446), doubleArray0, 1.0E-15, doubleArray0);
      double double0 = dormandPrince54Integrator0.initializeStep(stepProblem0, false, 40, doubleArray0, 1.1102230246251565E-16, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(63, dormandPrince54Integrator0.getEvaluations());
      assertEquals((-0.8912509381337456), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1.1102230246251565E-16, 1.1102230246251565E-16, 1.1102230246251565E-16, 1.1102230246251565E-16);
      StepProblem stepProblem0 = new StepProblem(1.1102230246251565E-16, 1.1102230246251565E-16, 1.1102230246251565E-16);
      double[] doubleArray0 = new double[1];
      dormandPrince54Integrator0.integrate(stepProblem0, 1.1102230246251565E-16, doubleArray0, 1.0E-15, doubleArray0);
      double double0 = dormandPrince54Integrator0.initializeStep(stepProblem0, true, 40, doubleArray0, 1.1102230246251565E-16, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(57, dormandPrince54Integrator0.getEvaluations());
      assertEquals(1.1102230246251565E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-1601.6413969841115), 1.1102230246251565E-16, (-1601.6413969841115));
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-1601.6413969841115);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(15.0, (-1601.6413969841115), 562.7, 5.746280211439194);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.initializeStep(stepProblem0, true, 2, doubleArray1, (-0.01), doubleArray1, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 2969.4732578767);
      StepProblem stepProblem0 = new StepProblem(718.43222825, 0.0, (-104.208));
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.initializeStep(stepProblem0, false, 913, doubleArray0, 0.03709200011850479, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1165.1696080127097, 1165.1696080127097, 1165.1696080127097, 1165.1696080127097);
      dormandPrince853Integrator0.setInitialStepSize(1165.1696080127097);
      double[] doubleArray0 = new double[9];
      double double0 = dormandPrince853Integrator0.initializeStep((FirstOrderDifferentialEquations) null, true, (-1), doubleArray0, 4326.02856565125, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(1165.1696080127097, double0, 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(1165.1696080127097, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, (-1600.8446), (-1600.8446), (-1600.8446));
      double double0 = dormandPrince54Integrator0.getMinStep();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 0.0);
      double double0 = dormandPrince853Integrator0.getMaxStep();
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1.1102230246251565E-16, 1.6643771824549864, 1.6643771824549864, 1.6643771824549864);
      StepProblem stepProblem0 = new StepProblem(1.6643771824549864, 1.1102230246251565E-16, 1.6643771824549864);
      double[] doubleArray0 = new double[1];
      dormandPrince54Integrator0.integrate(stepProblem0, 1.6643771824549864, doubleArray0, 1.0E-15, doubleArray0);
      assertEquals(44, dormandPrince54Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1.1102230246251565E-16, (-1606.7246311576191), (-1606.7246311576191), (-1606.7246311576191));
      StepProblem stepProblem0 = new StepProblem((-1606.7246311576191), 1.1102230246251565E-16, (-1606.7246311576191));
      double[] doubleArray0 = new double[1];
      dormandPrince54Integrator0.setSafety(1.0E-15);
      try { 
        dormandPrince54Integrator0.integrate(stepProblem0, (-1606.7246311576191), doubleArray0, 1.0E-15, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (1.11E-16) reached, integration needs 2.62E-17
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(16.09629537188588, (-1600.8446), (-1600.8446), (-1600.8446));
      StepProblem stepProblem0 = new StepProblem((-1600.8446), 16.09629537188588, (-1600.8446));
      double[] doubleArray0 = new double[1];
      dormandPrince54Integrator0.integrate(stepProblem0, (-1600.8446), doubleArray0, 1.0E-15, doubleArray0);
      double double0 = dormandPrince54Integrator0.initializeStep(stepProblem0, true, 40, doubleArray0, 16.09629537188588, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(27, dormandPrince54Integrator0.getEvaluations());
      assertEquals(16.09629537188588, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1.1102230246251565E-16, (-1601.6413969841115), (-1601.6413969841115), (-1601.6413969841115));
      StepProblem stepProblem0 = new StepProblem((-1601.6413969841115), 1.1102230246251565E-16, (-1601.6413969841115));
      double[] doubleArray0 = new double[5];
      stepProblem0.eventOccurred(1.1102230246251565E-16, doubleArray0, true);
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-1601.6413969841115);
      dormandPrince54Integrator0.integrate(stepProblem0, (-1601.6413969841115), doubleArray1, 1.1102230246251565E-16, doubleArray1);
      assertEquals(74, dormandPrince54Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1146.349077837984, 1146.349077837984, 1146.349077837984, 1146.349077837984);
      dormandPrince853Integrator0.setInitialStepSize(1146.349077837984);
      StepProblem stepProblem0 = new StepProblem((-3831.396210817974), 1.0, (-3831.396210817974));
      double[] doubleArray0 = new double[9];
      double double0 = dormandPrince853Integrator0.initializeStep(stepProblem0, false, 2146691822, doubleArray0, (-1622.3), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(1146.349077837984, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-1146.349077837984), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1.1102230246251565E-16, (-1600.8446), (-1600.8446), (-1600.8446));
      StepProblem stepProblem0 = new StepProblem((-1600.8446), 1.1102230246251565E-16, (-1600.8446));
      double[] doubleArray0 = new double[1];
      dormandPrince54Integrator0.setInitialStepSize(1.1102230246251565E-16);
      dormandPrince54Integrator0.integrate(stepProblem0, (-1600.8446), doubleArray0, 8.276804837640363, doubleArray0);
      assertEquals(133, dormandPrince54Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-589.025065), (-589.025065), 3650.323188258268, (-589.025065));
      dormandPrince54Integrator0.setInitialStepSize(3650.323188258268);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(589.025065, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-589.025065), (-589.025065), 3650.323188258268, (-589.025065));
      dormandPrince54Integrator0.setInitialStepSize(0.0);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(589.025065, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1165.1696080127097, 1165.1696080127097, 1165.1696080127097, 1165.1696080127097);
      double double0 = dormandPrince853Integrator0.getCurrentStepStart();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(1165.1696080127097, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }
}