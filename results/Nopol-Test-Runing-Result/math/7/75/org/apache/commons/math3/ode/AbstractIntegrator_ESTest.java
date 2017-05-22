package org.apache.commons.math3.ode;


public class AbstractIntegrator_ESTest extends org.apache.commons.math3.ode.AbstractIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator adamsBashforthIntegrator0 = new org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator(3 , 1892.5489835678952 , 1892.5489835678952 , 1892.5489835678952 , 1892.5489835678952);
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_0)));
        expandableStatefulODE0.setTime(62.5);
        try {
            adamsBashforthIntegrator0.integrate(expandableStatefulODE0, (-1112.73));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(3851.778304115624 , 3851.778304115624 , 3851.778304115624 , 3851.778304115624);
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_0)));
        expandableStatefulODE0.setTime(3863.3118489225803);
        dormandPrince853Integrator0.integrate(expandableStatefulODE0, 3851.778304115624);
        org.junit.Assert.assertEquals(8, dormandPrince853Integrator0.getOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(62.5 , 62.5 , 0.2728353993743053 , 62.5);
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        dormandPrince853Integrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_0)), 62.5, doubleArray0, 0.0, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator((-1.0));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        double double0 = classicalRungeKuttaIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_0)), 4.94E-321, testProblem5_0.errorScale, (-2.708333333333333), testProblem5_0.errorScale);
        org.junit.Assert.assertEquals((-2.708333333333333), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(java.lang.Double.NaN , 3285.03866357006 , 3855.9 , 0.0);
        graggBulirschStoerIntegrator0.setMaxEvaluations(0);
        int int0 = graggBulirschStoerIntegrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator(((double)(0)) , ((double)(0)) , ((double)(0)) , 3850.045251306083);
        double double0 = highamHall54Integrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(0.0 , 0.0 , 0.0 , 0.0);
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_0)));
        double[] doubleArray0 = new double[4];
        testProblem5_0.setInitialConditions(0.0, doubleArray0);
        try {
            dormandPrince853Integrator0.integrate(expandableStatefulODE0, 0.0);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator(0.0);
        midpointIntegrator0.setMaxEvaluations((-908));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GillIntegrator gillIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GillIntegrator(3855.9);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(0.008273789163814023 , 0.0 , 0.0);
        org.apache.commons.math3.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math3.analysis.solvers.IllinoisSolver((-1.0) , (-1333.9354263737) , 0.0);
        gillIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), (-389.1), 0.0, 1, ((org.apache.commons.math3.analysis.solvers.UnivariateSolver)(illinoisSolver0)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator((-0.022459085953066622));
        classicalRungeKuttaIntegrator0.clearEventHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator((-1777.0) , (-577.69055322417) , (-577.69055322417) , 1.0E-7);
        dormandPrince853Integrator0.clearStepHandlers();
        org.junit.Assert.assertEquals(577.69055322417, dormandPrince853Integrator0.getMaxStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(62.5 , 62.5 , 0.2728353993743053 , 62.5);
        double[] doubleArray0 = new double[2];
        try {
            dormandPrince853Integrator0.computeDerivatives(0.2728353993743053, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GillIntegrator gillIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GillIntegrator(0.0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(0.0 , 0.0 , 0.0);
        gillIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), 0.0, 0.0, 2515);
        gillIntegrator0.getEventHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(62.5 , 62.5 , 0.2728353993743053 , 62.5);
        java.lang.String string0 = dormandPrince853Integrator0.getName();
        org.junit.Assert.assertEquals("Dormand-Prince 8 (5, 3)", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator((-2.0) , (-2.0) , doubleArray0 , doubleArray0);
        java.util.Collection<org.apache.commons.math3.ode.sampling.StepHandler> collection0 = dormandPrince54Integrator0.getStepHandlers();
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator((-0.022459085953066622));
        double double0 = classicalRungeKuttaIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator((-1.0));
        int int0 = classicalRungeKuttaIntegrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(62.5 , 62.5 , 0.2728353993743053 , 62.5);
        int int0 = dormandPrince853Integrator0.getEvaluations();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GillIntegrator gillIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GillIntegrator(3855.9);
        double double0 = gillIntegrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }
}

