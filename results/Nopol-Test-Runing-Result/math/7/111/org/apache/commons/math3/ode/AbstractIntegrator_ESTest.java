package org.apache.commons.math3.ode;


public class AbstractIntegrator_ESTest extends org.apache.commons.math3.ode.AbstractIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator(0.0 , 0.0 , doubleArray0 , doubleArray0);
        highamHall54Integrator0.setMaxEvaluations(0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.EulerIntegrator eulerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.EulerIntegrator((-2406.96795303663));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        eulerIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_0)), (-1546.08654945499), doubleArray0, 1.0, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.EulerIntegrator eulerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.EulerIntegrator(1244.0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        double[] doubleArray0 = new double[3];
        testProblem5_0.setInitialConditions(0.0, doubleArray0);
        double double0 = eulerIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_0)), 1244.0, doubleArray0, (-1.2), doubleArray0);
        org.junit.Assert.assertEquals((-1.2), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((-3287.8050734) , 0.0 , 0.0 , 0.0);
        double double0 = graggBulirschStoerIntegrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator adamsBashforthIntegrator0 = new org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator(9 , ((double)(9)) , 1757.5339566 , ((double)(9)) , ((double)(9)));
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        org.apache.commons.math3.ode.TestProblem5 testProblem5_1 = testProblem5_0.copy();
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_1)));
        testProblem5_1.n = 122;
        try {
            adamsBashforthIntegrator0.integrate(expandableStatefulODE0, 3267.4685105641);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator(0.0 , 0.0 , 0.0 , 0.0);
        highamHall54Integrator0.setMaxEvaluations((-561));
        org.junit.Assert.assertEquals(0.0, highamHall54Integrator0.getMinStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.EulerIntegrator eulerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.EulerIntegrator(1244.0);
        eulerIntegrator0.addStepHandler(((org.apache.commons.math3.ode.sampling.StepHandler)(null)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator adamsBashforthIntegrator0 = new org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator(9 , ((double)(9)) , 1757.5339566 , ((double)(9)) , ((double)(9)));
        adamsBashforthIntegrator0.clearEventHandlers();
        org.junit.Assert.assertEquals(1.080059738892306, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator(722.778133647);
        classicalRungeKuttaIntegrator0.clearStepHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator(java.lang.Double.NaN);
        double[] doubleArray0 = new double[1];
        try {
            threeEighthesIntegrator0.computeDerivatives(5159.0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(1.2 , 0.0 , 0.0);
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(1000.0 , (-1366.87965) , 4082.410102882851 , 0.0);
        graggBulirschStoerIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), 4.547473508864641E-10, 473.8249146, java.lang.Integer.MAX_VALUE);
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)));
        expandableStatefulODE0.setTime(4.547473508864641E-10);
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 2.2737367544323206E-10);
        org.junit.Assert.assertEquals(1366.87965, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.EulerIntegrator eulerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.EulerIntegrator((-2406.96795303663));
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        eulerIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_0)), (-1546.08654945499), doubleArray0, 0.0, doubleArray0);
        int int0 = eulerIntegrator0.getEvaluations();
        org.junit.Assert.assertEquals(2, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.EulerIntegrator eulerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.EulerIntegrator(3246.0);
        eulerIntegrator0.setMaxEvaluations(871);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(8.71806581670702 , 8.71806581670702 , 8.71806581670702 , 152.508550115517);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(152.508550115517 , 0.0 , 8.71806581670702);
        org.apache.commons.math3.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math3.analysis.solvers.PegasusSolver((-0.607981885) , 152.508550115517);
        dormandPrince54Integrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), (-0.607981885), 152.508550115517, (-163), ((org.apache.commons.math3.analysis.solvers.UnivariateSolver)(pegasusSolver0)));
        java.util.Collection<org.apache.commons.math3.ode.events.EventHandler> collection0 = dormandPrince54Integrator0.getEventHandlers();
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator adamsBashforthIntegrator0 = new org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator(9 , ((double)(9)) , 1757.5339566 , ((double)(9)) , ((double)(9)));
        java.lang.String string0 = adamsBashforthIntegrator0.getName();
        org.junit.Assert.assertEquals("Adams-Bashforth", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.EulerIntegrator eulerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.EulerIntegrator(1244.0);
        eulerIntegrator0.getStepHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.EulerIntegrator eulerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.EulerIntegrator(3246.0);
        double double0 = eulerIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(0.0 , 1.2 , 0.0 , 152.508550115517);
        int int0 = dormandPrince54Integrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(1000.0 , (-1366.87965) , 4082.410102882851 , 0.0);
        int int0 = graggBulirschStoerIntegrator0.getEvaluations();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator adamsBashforthIntegrator0 = new org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator(9 , ((double)(9)) , 1757.5339566 , ((double)(9)) , ((double)(9)));
        double double0 = adamsBashforthIntegrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(125.76885786791578, double0, 0.01);
    }
}

