package org.apache.commons.math3.ode;


public class AbstractIntegrator_ESTest extends org.apache.commons.math3.ode.AbstractIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator(0.5301685333251953);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
        double[] doubleArray0 = new double[1];
        midpointIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepNormalizerOutputOverlapTest0)), 0.5301685333251953, doubleArray0, 0.6884893787679021, doubleArray0);
        double double0 = midpointIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepNormalizerOutputOverlapTest0)), 1.1852121353149414, doubleArray0, 0.4345239027012372, doubleArray0);
        org.junit.Assert.assertEquals(0.4345239027012372, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(10.0 , 10.0 , 0.0 , 10.0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(0.0 , 1162.79375788 , 6121.20097);
        dormandPrince54Integrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), 10.0, 4392.85302509, 0);
        org.junit.Assert.assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator(0.6059582233428955);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-1687.0) , (-295.22) , 4.440892098500626E-13);
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)));
        expandableStatefulODE0.setTime((-2054));
        classicalRungeKuttaIntegrator0.integrate(expandableStatefulODE0, (-2743.470805825719));
        org.junit.Assert.assertEquals("classical Runge-Kutta", classicalRungeKuttaIntegrator0.getName());
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator(0.5301685333251953);
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
        double[] doubleArray0 = new double[1];
        double double0 = midpointIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepNormalizerOutputOverlapTest0)), 0.5301685333251953, doubleArray0, 0.0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((-9.15095847217987) , (-1136.8729887605) , (-1136.8729887605) , (-9.15095847217987));
        graggBulirschStoerIntegrator0.setMaxEvaluations(0);
        int int0 = graggBulirschStoerIntegrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator(0.5301685333251953);
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
        double[] doubleArray0 = new double[1];
        midpointIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepNormalizerOutputOverlapTest0)), 0.5301685333251953, doubleArray0, (-0.0017897164691161069), doubleArray0);
        int int0 = midpointIntegrator0.getEvaluations();
        org.junit.Assert.assertEquals(4, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator(1.0 , 0.0 , 18.0 , 1.0);
        double double0 = highamHall54Integrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator(0.6059582233428955);
        classicalRungeKuttaIntegrator0.setMaxEvaluations((-2054));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator(1.4504190983558733);
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
        org.apache.commons.math3.ode.sampling.StepNormalizerMode stepNormalizerMode0 = org.apache.commons.math3.ode.sampling.StepNormalizerMode.INCREMENT;
        org.apache.commons.math3.ode.sampling.StepNormalizerBounds stepNormalizerBounds0 = org.apache.commons.math3.ode.sampling.StepNormalizerBounds.FIRST;
        org.apache.commons.math3.ode.sampling.StepNormalizer stepNormalizer0 = new org.apache.commons.math3.ode.sampling.StepNormalizer((-0.08899) , ((org.apache.commons.math3.ode.sampling.FixedStepHandler)(stepNormalizerOutputOverlapTest0)) , stepNormalizerMode0 , stepNormalizerBounds0);
        midpointIntegrator0.addStepHandler(stepNormalizer0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((-9.15095847217987) , (-1136.8729887605) , (-1136.8729887605) , (-9.15095847217987));
        graggBulirschStoerIntegrator0.clearEventHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((-9.15095847217987) , (-1136.8729887605) , (-1136.8729887605) , (-9.15095847217987));
        graggBulirschStoerIntegrator0.clearStepHandlers();
        org.junit.Assert.assertEquals(1136.8729887605, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator(0.3055872321128845 , 0.3055872321128845 , (-872.0) , (-872.0));
        double[] doubleArray0 = new double[4];
        try {
            highamHall54Integrator0.computeDerivatives(1.0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(6.6 , 6.6 , (-0.8613172805084709) , (-383.2799105776));
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(((double)(-56)) , 1626.499800316 , 1626.499800316);
        org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver((-1499.0795600169) , (-1499.0795600169) , (-3.2869429323931043));
        graggBulirschStoerIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), (-383.2799105776), 6.6, (-56), ((org.apache.commons.math3.analysis.solvers.UnivariateSolver)(regulaFalsiSolver0)));
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_0)));
        expandableStatefulODE0.setTime(6.6);
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 5.5);
        org.junit.Assert.assertEquals(6.6, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator adamsBashforthIntegrator0 = new org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator(5 , (-39.6785076393748) , (-970.0) , 3914.0 , ((double)(5)));
        adamsBashforthIntegrator0.setMaxEvaluations(java.lang.Integer.MAX_VALUE);
        org.junit.Assert.assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator(0.5301685333251953);
        midpointIntegrator0.getEventHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator(0.5301685333251953);
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(5423.47007023 , 5423.47007023 , 0.6249561309814453);
        org.apache.commons.math3.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math3.analysis.solvers.BrentSolver();
        midpointIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), 1799.67396426797, 0.0, 54, ((org.apache.commons.math3.analysis.solvers.UnivariateSolver)(brentSolver0)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
        double double0 = midpointIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepNormalizerOutputOverlapTest0)), 0.5301685333251953, doubleArray0, 0.6870017394121852, doubleArray0);
        org.junit.Assert.assertEquals(0.6870017394121852, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator(0.6059582233428955);
        classicalRungeKuttaIntegrator0.getName();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(10.0 , 10.0 , 0.0 , 10.0);
        java.util.Collection<org.apache.commons.math3.ode.sampling.StepHandler> collection0 = dormandPrince54Integrator0.getStepHandlers();
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.EulerIntegrator eulerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.EulerIntegrator(864.0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(864.0 , 36.52917025056327 , 2108.330417519);
        eulerIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), 2108.330417519, 2108.330417519, 477);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator(0.3055872321128845 , 0.3055872321128845 , (-872.0) , (-872.0));
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(999.4698314666748 , 4392.85302509 , 4.2657777816050375E-213);
        org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver(999.4698314666748 , 1361.454365175926);
        highamHall54Integrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), 999.4698314666748, (-872.0), 0, ((org.apache.commons.math3.analysis.solvers.UnivariateSolver)(regulaFalsiSolver0)));
        java.util.Collection<org.apache.commons.math3.ode.events.EventHandler> collection0 = highamHall54Integrator0.getEventHandlers();
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator((-2065.38706));
        double double0 = threeEighthesIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((-9.15095847217987) , (-1136.8729887605) , (-1136.8729887605) , (-9.15095847217987));
        int int0 = graggBulirschStoerIntegrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator(0.5301685333251953);
        midpointIntegrator0.getEvaluations();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((-9.15095847217987) , (-1136.8729887605) , (-1136.8729887605) , (-9.15095847217987));
        double double0 = graggBulirschStoerIntegrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(101.99743873397188, double0, 0.01);
    }
}

