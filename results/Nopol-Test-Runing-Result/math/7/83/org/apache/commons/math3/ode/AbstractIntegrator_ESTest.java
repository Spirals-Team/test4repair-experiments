package org.apache.commons.math3.ode;


public class AbstractIntegrator_ESTest extends org.apache.commons.math3.ode.AbstractIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 2412.2909;
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(2.8 , 2412.2909 , doubleArray0 , doubleArray0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(((double)(295)) , 0.0 , (-88.445313458321));
        graggBulirschStoerIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)), (-1523.546071348), doubleArray0, 1754.6743, doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)), (-603.8), doubleArray0, (-2377.5294), doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 446237.1274476598 }, doubleArray0, 0.01);
        org.junit.Assert.assertEquals((-2377.5294), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 2412.2909;
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(2.8 , 2412.2909 , doubleArray0 , doubleArray0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(((double)(295)) , 0.0 , (-88.445313458321));
        double double0 = graggBulirschStoerIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)), (-603.8), doubleArray0, 0.0, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 180533.29089999996 }, doubleArray0, 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 2412.2909;
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(2.8 , 2412.2909 , doubleArray0 , doubleArray0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(((double)(295)) , ((double)(295)) , (-88.445313458321));
        graggBulirschStoerIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)), (-603.8), doubleArray0, (-2377.5294), doubleArray0);
        int int0 = graggBulirschStoerIntegrator0.getEvaluations();
        org.junit.Assert.assertArrayEquals(new double[]{ -520837.88209999993 }, doubleArray0, 0.01);
        org.junit.Assert.assertEquals(38, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(0.0 , 0.0 , 0.0 , 0.0);
        double double0 = dormandPrince54Integrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        double[] doubleArray0 = new double[17];
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(1.0 , 171.893337 , doubleArray0 , doubleArray0);
        graggBulirschStoerIntegrator0.setMaxEvaluations((-1118));
        org.junit.Assert.assertEquals(1.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GillIntegrator gillIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GillIntegrator(1.0);
        double[] doubleArray0 = new double[2];
        try {
            gillIntegrator0.computeDerivatives(1.0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 2412.2909;
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(2.8 , 2412.2909 , doubleArray0 , doubleArray0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(((double)(295)) , 0.0 , (-88.445313458321));
        graggBulirschStoerIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), (-2564.4), 2412.2909, 295, ((org.apache.commons.math3.analysis.solvers.UnivariateSolver)(null)));
        double double0 = graggBulirschStoerIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)), (-603.8), doubleArray0, (-2377.5294), doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ -520837.88209999993 }, doubleArray0, 0.01);
        org.junit.Assert.assertEquals((-2377.5294), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator((-1446.059) , 4.620409634780994 , 4.620409634780994 , 4.620409634780994);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(4.620409634780994 , (-1446.059) , (-1446.059));
        org.apache.commons.math3.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math3.analysis.solvers.BisectionSolver(4.620409634780994);
        highamHall54Integrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), (-1446.059), (-1130.782354623617), 2298, ((org.apache.commons.math3.analysis.solvers.UnivariateSolver)(bisectionSolver0)));
        java.util.Collection<org.apache.commons.math3.ode.events.EventHandler> collection0 = highamHall54Integrator0.getEventHandlers();
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(107.295735390281 , 107.295735390281 , 107.295735390281 , 107.295735390281);
        dormandPrince54Integrator0.clearEventHandlers();
        org.junit.Assert.assertEquals(107.295735390281, dormandPrince54Integrator0.getMinStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        java.lang.Double double0 = new java.lang.Double((-1130.782354623617));
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator((-1.0) , 4.620409634780994 , (-28.89938254) , ((double)(double0)));
        java.lang.String string0 = dormandPrince54Integrator0.getName();
        org.junit.Assert.assertEquals("Dormand-Prince 5(4)", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(608.5773080347975 , (-0.6563302822683906) , 608.5773080347975 , 608.5773080347975);
        org.apache.commons.math3.ode.sampling.DummyStepHandler dummyStepHandler0 = org.apache.commons.math3.ode.sampling.DummyStepHandler.getInstance();
        dormandPrince54Integrator0.addStepHandler(dummyStepHandler0);
        org.junit.Assert.assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(1069.0 , 1069.0 , doubleArray0 , doubleArray0);
        java.util.Collection<org.apache.commons.math3.ode.sampling.StepHandler> collection0 = graggBulirschStoerIntegrator0.getStepHandlers();
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator((-65.6937164));
        double double0 = classicalRungeKuttaIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(1069.0 , 1069.0 , doubleArray0 , doubleArray0);
        int int0 = graggBulirschStoerIntegrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(2.8 , 2412.2909 , doubleArray0 , doubleArray0);
        int int0 = graggBulirschStoerIntegrator0.getEvaluations();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(608.5773080347975 , (-0.6563302822683906) , 608.5773080347975 , 608.5773080347975);
        double double0 = dormandPrince54Integrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(19.985687788130182, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(1069.0 , 1069.0 , doubleArray0 , doubleArray0);
        graggBulirschStoerIntegrator0.clearStepHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }
}

