package org.apache.commons.math3.ode;


public class AbstractIntegrator_ESTest extends org.apache.commons.math3.ode.AbstractIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GillIntegrator gillIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GillIntegrator((-1.0));
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-1.0) , java.lang.Double.NaN , (-1.0));
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)));
        expandableStatefulODE0.setTime((-1.0));
        gillIntegrator0.integrate(expandableStatefulODE0, 1000.0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(1000.0 , java.lang.Double.NEGATIVE_INFINITY , java.lang.Double.NEGATIVE_INFINITY , 0.0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(1.0 , 341.0473532200114 , 1847.0690396);
        double[] doubleArray0 = new double[1];
        graggBulirschStoerIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)), 0.0, doubleArray0, 1000.0, doubleArray0);
        graggBulirschStoerIntegrator0.computeDerivatives(830.79130806845, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(1000.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator((-1615.3985372635) , 2696.3311205658 , (-1615.3985372635) , 0.0);
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest stepNormalizerOutputTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
        double[] doubleArray0 = new double[1];
        double double0 = highamHall54Integrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepNormalizerOutputTest0)), (-1615.3985372635), doubleArray0, 0.0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((-1224.681) , java.lang.Double.NEGATIVE_INFINITY , (-25.698632590091478) , (-25.698632590091478));
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(1.7320319038380332 , 341.0473532200114 , 1847.0690396);
        double[] doubleArray0 = new double[1];
        double double0 = graggBulirschStoerIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)), 0.0, doubleArray0, (-1224.681), doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ -2121.1865640242663 }, doubleArray0, 0.01);
        org.junit.Assert.assertEquals((-1224.681), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator(0.0);
        threeEighthesIntegrator0.setMaxEvaluations(0);
        int int0 = threeEighthesIntegrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(0, int0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator(0.0 , (-1610.8840822) , doubleArray0 , doubleArray0);
        double double0 = highamHall54Integrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator((-581.1020996415563) , (-2505.391753178) , doubleArray0 , doubleArray0);
        dormandPrince54Integrator0.setMaxEvaluations((-1));
        org.junit.Assert.assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(473.410524 , 473.410524 , 473.410524 , 1000.0);
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest stepNormalizerOutputTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
        org.apache.commons.math3.ode.sampling.StepNormalizer stepNormalizer0 = new org.apache.commons.math3.ode.sampling.StepNormalizer(1.0 , ((org.apache.commons.math3.ode.sampling.FixedStepHandler)(stepNormalizerOutputTest0)));
        dormandPrince853Integrator0.addStepHandler(stepNormalizer0);
        org.junit.Assert.assertEquals(473.410524, dormandPrince853Integrator0.getMinStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator((-1.5707963267948966));
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-1.5707963267948966) , 3031.0 , (-1.5707963267948966));
        threeEighthesIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), java.lang.Double.NaN, java.lang.Double.NaN, (-1215), ((org.apache.commons.math3.analysis.solvers.UnivariateSolver)(null)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(5.326182134294869E-8 , 5.326182134294869E-8 , 1644.5708649815 , 5.2869976233132615E-298);
        dormandPrince54Integrator0.clearEventHandlers();
        org.junit.Assert.assertEquals(5.326182134294869E-8, dormandPrince54Integrator0.getMinStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(473.410524 , 473.410524 , 473.410524 , 1000.0);
        dormandPrince853Integrator0.clearStepHandlers();
        org.junit.Assert.assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(1000.0 , java.lang.Double.NEGATIVE_INFINITY , java.lang.Double.NEGATIVE_INFINITY , 0.0);
        double[] doubleArray0 = new double[1];
        try {
            graggBulirschStoerIntegrator0.computeDerivatives(830.79130806845, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator((-1615.3985372635) , 2696.3311205658 , (-1615.3985372635) , 0.0);
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest stepNormalizerOutputTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
        double[] doubleArray0 = new double[1];
        double double0 = highamHall54Integrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepNormalizerOutputTest0)), (-1615.3985372635), doubleArray0, 1000.0, doubleArray0);
        org.junit.Assert.assertEquals(1000.0, double0, 0.01);
        int int0 = highamHall54Integrator0.getEvaluations();
        org.junit.Assert.assertEquals(15, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(1000.0 , java.lang.Double.NEGATIVE_INFINITY , 0.0 , 0.0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(1061.21 , 1.0 , java.lang.Double.NEGATIVE_INFINITY);
        org.apache.commons.math3.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math3.analysis.solvers.BisectionSolver(2.8421709430404007E-11 , 1476.3105906077515);
        graggBulirschStoerIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), (-3687.111), 1.5790297768522832E146, (-2274), ((org.apache.commons.math3.analysis.solvers.UnivariateSolver)(bisectionSolver0)));
        java.util.Collection<org.apache.commons.math3.ode.events.EventHandler> collection0 = graggBulirschStoerIntegrator0.getEventHandlers();
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(954.08 , 1912.36819 , 1912.36819 , 1912.36819);
        java.lang.String string0 = dormandPrince853Integrator0.getName();
        org.junit.Assert.assertEquals("Dormand-Prince 8 (5, 3)", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator adamsMoultonIntegrator0 = new org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator(5 , 1245.71 , ((double)(5)) , 1245.71 , (-1369.3547577572074));
        java.util.Collection<org.apache.commons.math3.ode.sampling.StepHandler> collection0 = adamsMoultonIntegrator0.getStepHandlers();
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator(4835.5671807222);
        double double0 = midpointIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(1000.0 , java.lang.Double.NEGATIVE_INFINITY , java.lang.Double.NEGATIVE_INFINITY , 0.0);
        int int0 = graggBulirschStoerIntegrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator((-1615.3985372635) , 2696.3311205658 , (-1615.3985372635) , 0.0);
        int int0 = highamHall54Integrator0.getEvaluations();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator((-1615.3985372635) , 2696.3311205658 , (-1615.3985372635) , 0.0);
        double double0 = highamHall54Integrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(2087.01924958541, double0, 0.01);
    }
}

