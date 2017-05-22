package org.apache.commons.math3.ode;


public class AbstractIntegrator_ESTest extends org.apache.commons.math3.ode.AbstractIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(0.0 , 2003.0 , 0.0 , (-2565.287));
        graggBulirschStoerIntegrator0.setMaxEvaluations(1);
        org.junit.Assert.assertEquals(2003.0, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GillIntegrator gillIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GillIntegrator(144.7);
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest stepNormalizerOutputTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
        double[] doubleArray0 = new double[1];
        gillIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepNormalizerOutputTest0)), ((double)(2)), doubleArray0, 144.7, doubleArray0);
        int int0 = gillIntegrator0.getEvaluations();
        org.junit.Assert.assertEquals(8, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(50.666666666666664 , 0.0 , 12.360567175794303 , 12.360567175794303);
        double double0 = dormandPrince54Integrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(2886.8129343736987 , 2886.8129343736987 , 2886.8129343736987 , 2886.8129343736987);
        graggBulirschStoerIntegrator0.setMaxEvaluations((-994));
        org.junit.Assert.assertEquals(2886.8129343736987, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator(306.7984008968);
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
        org.apache.commons.math3.ode.sampling.StepNormalizer stepNormalizer0 = new org.apache.commons.math3.ode.sampling.StepNormalizer(306.7984008968 , ((org.apache.commons.math3.ode.sampling.FixedStepHandler)(stepNormalizerOutputOverlapTest0)));
        classicalRungeKuttaIntegrator0.addStepHandler(stepNormalizer0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(3287.8556921366 , 3287.8556921366 , 1002.443054 , (-2151.058028907));
        graggBulirschStoerIntegrator0.clearEventHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(152.0 , 0.0 , 152.0 , 0.0);
        double[] doubleArray0 = new double[7];
        try {
            graggBulirschStoerIntegrator0.computeDerivatives(152.0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(2916.234102 , 2916.234102 , 2916.234102 , 2.1742808735341656E284);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(5.6843418860808015E-11 , 5.6843418860808015E-11 , 2.1742808735341656E284);
        graggBulirschStoerIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), java.lang.Double.NaN, 1.0, 2142154904);
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)));
        expandableStatefulODE0.setTime(2916.234102);
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 3214.517572459905);
        org.junit.Assert.assertEquals(3214.517572459905, expandableStatefulODE0.getTime(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator(1702.761383318832);
        midpointIntegrator0.setMaxEvaluations(0);
        int int0 = midpointIntegrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GillIntegrator gillIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GillIntegrator(1000.0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(((double)(4165)) , 1.4833003969415539E273 , 1000.0);
        org.apache.commons.math3.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math3.analysis.solvers.BrentSolver(1.4833003969415539E273 , 1.4833003969415539E273 , 1000.0);
        gillIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), 0.0, (-1973.7488617186555), java.lang.Integer.MAX_VALUE, ((org.apache.commons.math3.analysis.solvers.UnivariateSolver)(brentSolver0)));
        gillIntegrator0.getEventHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GillIntegrator gillIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GillIntegrator(144.7);
        gillIntegrator0.getName();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator((-4599.5) , (-4599.5) , doubleArray0 , doubleArray0);
        java.util.Collection<org.apache.commons.math3.ode.sampling.StepHandler> collection0 = dormandPrince853Integrator0.getStepHandlers();
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GillIntegrator gillIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GillIntegrator(144.7);
        double double0 = gillIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator(1702.761383318832);
        int int0 = midpointIntegrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GillIntegrator gillIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GillIntegrator(144.7);
        gillIntegrator0.getEvaluations();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.EulerIntegrator eulerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.EulerIntegrator(1.366837978363037);
        double double0 = eulerIntegrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator((-4599.5) , (-4599.5) , doubleArray0 , doubleArray0);
        dormandPrince853Integrator0.clearStepHandlers();
        org.junit.Assert.assertEquals(4599.5, dormandPrince853Integrator0.getMinStep(), 0.01);
    }
}

