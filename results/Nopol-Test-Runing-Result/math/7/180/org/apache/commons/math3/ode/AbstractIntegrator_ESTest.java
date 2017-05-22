package org.apache.commons.math3.ode;


public class AbstractIntegrator_ESTest extends org.apache.commons.math3.ode.AbstractIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator((-688.37) , (-688.37) , (-688.37) , (-688.37));
        dormandPrince853Integrator0.setMaxEvaluations(0);
        org.junit.Assert.assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator((-688.37) , (-688.37) , (-688.37) , (-688.37));
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(((double)(0)) , (-688.37) , 29.8402934266605);
        dormandPrince853Integrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), 29.8402934266605, 0.0, 0);
        org.junit.Assert.assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GillIntegrator gillIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GillIntegrator(((double)(5)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        gillIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_0)), (-2497.9), doubleArray0, (-2.5857668567479893E-8), doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(3045.756767664319 , 3045.756767664319 , (-1047.9252514) , 1.0);
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        double[] doubleArray0 = new double[1];
        testProblem5_0.setInitialConditions(1.0, doubleArray0);
        dormandPrince853Integrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_0)), 3045.756767664319, doubleArray0, 3520.57187728297, doubleArray0);
        org.junit.Assert.assertEquals(17, testProblem5_0.getCalls());
        int int0 = dormandPrince853Integrator0.getEvaluations();
        org.junit.Assert.assertEquals(17, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator((-3946.83934443));
        double double0 = classicalRungeKuttaIntegrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(1.0 , (-1120.3261197607) , doubleArray0 , doubleArray0);
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_0)));
        testProblem5_0.n = 2145616040;
        try {
            dormandPrince54Integrator0.integrate(expandableStatefulODE0, ((double)(8257536)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(1910.7990930548679 , 1910.7990930548679 , 1910.7990930548679 , 3.3);
        graggBulirschStoerIntegrator0.setMaxEvaluations((-96));
        org.junit.Assert.assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator(0.0);
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest stepNormalizerOutputTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
        org.apache.commons.math3.ode.sampling.StepNormalizer stepNormalizer0 = new org.apache.commons.math3.ode.sampling.StepNormalizer((-1532.315) , ((org.apache.commons.math3.ode.sampling.FixedStepHandler)(stepNormalizerOutputTest0)));
        threeEighthesIntegrator0.addStepHandler(stepNormalizer0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(0.0 , 4087.56482962218 , 0.0 , 0.0);
        dormandPrince853Integrator0.clearEventHandlers();
        org.junit.Assert.assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator((-2497.9) , 0.5177683167071423 , 560.951 , 0.5177683167071423);
        double[] doubleArray0 = new double[2];
        try {
            highamHall54Integrator0.computeDerivatives(0.40416217, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator((-3946.83934443));
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(320.51856166773007 , 0.0 , (-3946.83934443));
        org.apache.commons.math3.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math3.analysis.solvers.RiddersSolver();
        classicalRungeKuttaIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), 320.51856166773007, (-3946.83934443), (-1), ((org.apache.commons.math3.analysis.solvers.UnivariateSolver)(riddersSolver0)));
        classicalRungeKuttaIntegrator0.getEventHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(3045.756767664319 , 3045.756767664319 , (-1047.9252514) , 1.0);
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        double[] doubleArray0 = new double[1];
        testProblem5_0.setInitialConditions(1.0, doubleArray0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(3045.756767664319 , 1147.746092394772 , 3520.57187728297);
        org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver(3520.57187728297);
        dormandPrince853Integrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), 250.81200674, 1.0, 274, ((org.apache.commons.math3.analysis.solvers.UnivariateSolver)(regulaFalsiSolver0)));
        dormandPrince853Integrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_0)), 3045.756767664319, doubleArray0, 3520.57187728297, doubleArray0);
        org.junit.Assert.assertEquals(33, testProblem5_0.getCalls());
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(0.0 , 4087.56482962218 , 0.0 , 0.0);
        java.lang.String string0 = dormandPrince853Integrator0.getName();
        org.junit.Assert.assertEquals("Dormand-Prince 8 (5, 3)", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(3045.756767664319 , 3045.756767664319 , (-1047.9252514) , 1.0);
        java.util.Collection<org.apache.commons.math3.ode.sampling.StepHandler> collection0 = dormandPrince853Integrator0.getStepHandlers();
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator(1367.45040498906);
        double double0 = threeEighthesIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(3045.756767664319 , 3045.756767664319 , (-1047.9252514) , 1.0);
        int int0 = dormandPrince853Integrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(3045.756767664319 , 3045.756767664319 , (-1047.9252514) , 1.0);
        int int0 = dormandPrince853Integrator0.getEvaluations();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(1.2210872189854344E-232 , 1.2210872189854344E-232 , 1.2210872189854344E-232 , 1.2518336773);
        double double0 = dormandPrince54Integrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(1.2210872189854344E-232 , 1.2210872189854344E-232 , 1.2210872189854344E-232 , 1.2518336773);
        dormandPrince54Integrator0.clearStepHandlers();
        org.junit.Assert.assertEquals(1.2210872189854344E-232, dormandPrince54Integrator0.getMaxStep(), 0.01);
    }
}

