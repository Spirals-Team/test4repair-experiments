/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 11 10:00:17 GMT 2017
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
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3356.208237938, (-1481.0238813236838), doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-0.16188677833796986), true, true);
      assertEquals((-1481.0238813236838), double0, 0.01);
      assertEquals(3356.208237938, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0625, 1220.7844254963625, 0.0625, 1220.7844254963625);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      highamHall54Integrator0.setInitialStepSize(1220.7844254963625);
      highamHall54Integrator0.integrate(testProblem5_0, 1220.7844254963625, doubleArray0, (-15.0), doubleArray0);
      assertEquals(21, testProblem5_0.getCalls());
      assertEquals(8.734931401763992, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0625, 1220.7844254963625, 0.0625, 1220.7844254963625);
      highamHall54Integrator0.setInitialStepSize(0.0625);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      highamHall54Integrator0.integrate(testProblem5_0, 1220.7844254963625, doubleArray0, (-15.0), doubleArray0);
      assertEquals(49, testProblem5_0.getCalls());
      assertEquals(49, highamHall54Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0625, 1220.7844254963625, 0.0625, 1220.7844254963625);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      highamHall54Integrator0.setInitialStepSize(1220.7844254963625);
      double double0 = highamHall54Integrator0.initializeStep(testProblem5_0, true, 5, doubleArray0, (-15.000000000000002), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(1220.7844254963625, double0, 0.01);
      assertEquals(8.734931401763992, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0625, 1220.7844254963625, 0.0625, 1220.7844254963625);
      highamHall54Integrator0.setInitialStepSize(0.0625);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      highamHall54Integrator0.integrate(testProblem5_0, 0.0625, doubleArray0, 1220.7844254963625, doubleArray0);
      assertEquals(49, testProblem5_0.getCalls());
      assertEquals(8.734931401763992, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(8.0, 8.0, (-3816.73), 0.0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      highamHall54Integrator0.sanityChecks(testProblem5_0, 0.0, doubleArray0, (-3816.73), doubleArray0);
      assertEquals(8.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-363.13), (-1758.376758), 0.6666666666666666, (-1758.376758));
      highamHall54Integrator0.resetInternalState();
      assertEquals(799.0740592288928, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0625, 1220.7844254963625, 0.0625, 1220.7844254963625);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      highamHall54Integrator0.integrate(testProblem5_0, 1220.7844254963625, doubleArray0, (-15.0), doubleArray0);
      assertEquals(50, testProblem5_0.getCalls());
      assertEquals(8.734931401763992, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getMinStep();
      assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1813.09042231024), 1.0E-12, doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMinStep();
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-1813.09042231024), double0, 0.01);
      assertEquals(1.0E-12, dormandPrince853Integrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0015034249455254476, 0.0015034249455254476, 0.0015034249455254476, 0.0015034249455254476);
      double double0 = highamHall54Integrator0.getMaxStep();
      assertEquals(0.0015034249455254476, double0, 0.01);
      assertEquals(0.0015034249455254476, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3356.208237938, (-1481.0238813236838), doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.getMaxStep();
      assertEquals(3356.208237938, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
      assertEquals((-1481.0238813236838), double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 0.0);
      double double0 = dormandPrince853Integrator0.filterStep(0.0, false, false);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2.185039863261519), (-2.185039863261519), doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        graggBulirschStoerIntegrator0.sanityChecks(testProblem5_0, (-2.185039863261519), doubleArray0, 2.185039863261519, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 2, initial state vector has dimension 6
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        highamHall54Integrator0.sanityChecks((FirstOrderDifferentialEquations) null, 0.0, doubleArray0, 0.0, doubleArray0);
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
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0625, 0.0625, 0.0625, (-1758.376758));
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      highamHall54Integrator0.integrate(testProblem5_0, (-1758.376758), doubleArray0, (-15.0), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(8.0, 8.0, (-3816.73), 0.0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1.240059744060978E-7;
      try { 
        highamHall54Integrator0.integrate(testProblem5_0, (-2404.3812721284844), doubleArray0, 3696.90248351, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (8.00E00) reached, integration needs 5.44E00
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, (-1273.0029700134755), (-1273.0029700134755));
      TestProblem5 testProblem5_0 = new TestProblem5();
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.integrate(testProblem5_0, 0.0, (double[]) null, (-1273.0029700134755), (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1537.407), 6.265569375E11, doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[6];
      TestProblem5 testProblem5_0 = new TestProblem5();
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.initializeStep(testProblem5_0, false, (-2278), doubleArray0, 6.265569375E11, doubleArray0, doubleArray1, doubleArray0, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1.0E-12, 484.6459912464015, doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[9];
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.initializeStep((FirstOrderDifferentialEquations) null, false, 755960, doubleArray0, 484.6459912464015, doubleArray0, doubleArray0, doubleArray0, doubleArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0625, 0.0625, 0.0625, (-4016.5));
      highamHall54Integrator0.setInitialStepSize(0.0625);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      double double0 = highamHall54Integrator0.initializeStep(testProblem5_0, false, 5, doubleArray0, doubleArray0[0], doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals((-0.0625), double0, 0.01);
      assertEquals(0.0625, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.2404374302607883, 1865.06811949292, (-3436.1802049887), (-3436.1802049887));
      StepProblem stepProblem0 = new StepProblem(1865.06811949292, 2.2404374302607883, 682.8);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.initializeStep(stepProblem0, false, (-493), doubleArray0, (-493), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0015034249455254476, 0.0015034249455254476, 0.0015034249455254476, 0.0015034249455254476);
      double double0 = highamHall54Integrator0.getMinStep();
      assertEquals(0.0015034249455254476, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.0015034249455254476, double0, 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(236.4551196, 0.0, 0.0, 236.4551196);
      double double0 = graggBulirschStoerIntegrator0.getMaxStep();
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(236.4551196, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 815.38394;
      doubleArray0[1] = (-3.0);
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(8, 815.38394, (-3.0), doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        adamsBashforthIntegrator0.integrate(testProblem5_0, 584.3002230575389, doubleArray0, (-246.670574984), doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (8.15E02) reached, integration needs 3.27E00
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-110.09493), (-110.09493), 3837.668809, 0.0);
      double double0 = dormandPrince853Integrator0.filterStep(0.0, true, true);
      assertEquals(110.09493, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(110.09493, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1.0, (-2800.4), 0.0, 0.0);
      try { 
        dormandPrince54Integrator0.filterStep(0.0, false, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (1.00E00) reached, integration needs 0.00E00
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[6];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(10.0178749274099, 0.0015034249455254476, doubleArray1, doubleArray0);
      try { 
        graggBulirschStoerIntegrator0.integrate(testProblem5_0, 1.0E-15, doubleArray0, (-0.0015034249455254476), doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: state vector has dimension 2, absolute tolerance vector has dimension 6
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-568.6), (-568.6), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInitialStepSize(2686.3222029);
      assertEquals(568.6, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 0.0);
      dormandPrince853Integrator0.setInitialStepSize((-844));
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(8, (-0.0013990241651590145), (double) 8, (double) 8, (double) 8);
      double double0 = adamsBashforthIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0.10579316292309308, adamsBashforthIntegrator0.getCurrentSignedStepsize(), 0.01);
  }
}
