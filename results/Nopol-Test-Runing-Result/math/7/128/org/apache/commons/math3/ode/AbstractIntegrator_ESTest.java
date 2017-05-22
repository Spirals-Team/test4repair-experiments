package org.apache.commons.math3.ode;


public class AbstractIntegrator_ESTest extends org.apache.commons.math3.ode.AbstractIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.EulerIntegrator eulerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.EulerIntegrator(1.0);
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        double double0 = eulerIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_0)), 217.65305201769553, doubleArray0, 0.0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator(5.016939499436828);
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        double double0 = classicalRungeKuttaIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_0)), (-3259.4926839370983), doubleArray0, 5.016939499436828, doubleArray0);
        org.junit.Assert.assertEquals(2604, testProblem5_0.getCalls());
        org.junit.Assert.assertEquals(5.016939499436828, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((-14.126) , (-14.126) , (-1347.0) , (-1378.147));
        graggBulirschStoerIntegrator0.setMaxEvaluations(0);
        int int0 = graggBulirschStoerIntegrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(0.0 , 0.0 , (-208.826888) , 0.0);
        try {
            dormandPrince54Integrator0.computeDerivatives(0.0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator(((double)(-185)));
        classicalRungeKuttaIntegrator0.setMaxEvaluations((-185));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator(((double)(-185)));
        org.apache.commons.math3.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math3.analysis.solvers.BisectionSolver(((double)(-185)) , 6.6);
        classicalRungeKuttaIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(null)), 0.0, 1000.0, (-585), ((org.apache.commons.math3.analysis.solvers.UnivariateSolver)(bisectionSolver0)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator adamsMoultonIntegrator0 = new org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator(5 , ((double)(5)) , 0.0 , 0.0 , 931.6266162);
        adamsMoultonIntegrator0.clearEventHandlers();
        org.junit.Assert.assertEquals("Adams-Moulton", adamsMoultonIntegrator0.getName());
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator((-1.0) , (-3497.1155383) , 1000.0 , 2202.3893665);
        dormandPrince853Integrator0.clearStepHandlers();
        org.junit.Assert.assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator((-1.0) , (-3497.1155383) , 1000.0 , 2202.3893665);
        java.util.Collection<org.apache.commons.math3.ode.events.EventHandler> collection0 = dormandPrince853Integrator0.getEventHandlers();
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(2202.3893665 , (-886.1684745729482) , doubleArray0 , doubleArray0);
        java.lang.String string0 = graggBulirschStoerIntegrator0.getName();
        org.junit.Assert.assertEquals("Gragg-Bulirsch-Stoer", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.EulerIntegrator eulerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.EulerIntegrator(1.0);
        eulerIntegrator0.getStepHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-3497.1155383) , 829.95499 , ((double)(8)));
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(2202.3893665 , (-886.1684745729482) , doubleArray0 , doubleArray0);
        org.apache.commons.math3.analysis.solvers.SecantSolver secantSolver0 = new org.apache.commons.math3.analysis.solvers.SecantSolver();
        graggBulirschStoerIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), 0.9166666666666666, (-1.0), java.lang.Integer.MAX_VALUE, ((org.apache.commons.math3.analysis.solvers.UnivariateSolver)(secantSolver0)));
        java.util.Collection<org.apache.commons.math3.ode.events.EventHandler> collection0 = graggBulirschStoerIntegrator0.getEventHandlers();
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator(1.0);
        double double0 = threeEighthesIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((-3497.1155383) , (-886.1684745729482) , doubleArray0 , doubleArray0);
        int int0 = graggBulirschStoerIntegrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(2.2737367544323206E-10 , 2.2737367544323206E-10 , doubleArray0 , doubleArray0);
        int int0 = graggBulirschStoerIntegrator0.getEvaluations();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.EulerIntegrator eulerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.EulerIntegrator(1.0);
        double double0 = eulerIntegrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }
}

