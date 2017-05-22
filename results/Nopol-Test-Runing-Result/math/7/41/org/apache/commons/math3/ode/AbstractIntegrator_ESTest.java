package org.apache.commons.math3.ode;


public class AbstractIntegrator_ESTest extends org.apache.commons.math3.ode.AbstractIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator((-1047.758));
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
        double[] doubleArray0 = new double[1];
        double double0 = threeEighthesIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepNormalizerOutputOverlapTest0)), 2.220446049250313E-13, doubleArray0, (-1047.758), doubleArray0);
        double double1 = threeEighthesIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepNormalizerOutputOverlapTest0)), (-1047.758), doubleArray0, 0.0, doubleArray0);
        org.junit.Assert.assertNotEquals(double1, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.EulerIntegrator eulerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.EulerIntegrator(4.450312892752409);
        eulerIntegrator0.setMaxEvaluations(2950);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator((-1047.758));
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
        double[] doubleArray0 = new double[1];
        threeEighthesIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepNormalizerOutputOverlapTest0)), (-1047.758), doubleArray0, 0.0, doubleArray0);
        threeEighthesIntegrator0.computeDerivatives(0.0, doubleArray0, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator((-1047.758));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
        double[] doubleArray0 = new double[1];
        double double0 = threeEighthesIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepNormalizerOutputOverlapTest0)), (-1047.758), doubleArray0, 1.02654690214993, doubleArray0);
        org.junit.Assert.assertEquals(1.02654690214993, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator(0.0);
        classicalRungeKuttaIntegrator0.setMaxEvaluations(0);
        int int0 = classicalRungeKuttaIntegrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(0, int0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator adamsMoultonIntegrator0 = new org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator(5 , 0.0 , ((double)(5)) , 0.0 , ((double)(5)));
        double double0 = adamsMoultonIntegrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator(0.0 , (-1.0) , 2937500.0 , 4365.5209350041);
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
        double[] doubleArray0 = new double[1];
        highamHall54Integrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepNormalizerOutputOverlapTest0)), 4365.5209350041, doubleArray0, 0.0, doubleArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator((-3.096733638475319E128));
        midpointIntegrator0.setMaxEvaluations((-1350));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((-1854.5910046) , (-6.818702940330079) , doubleArray0 , doubleArray0);
        graggBulirschStoerIntegrator0.clearEventHandlers();
        org.junit.Assert.assertEquals(1854.5910046, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GillIntegrator gillIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GillIntegrator(0.0);
        gillIntegrator0.clearStepHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator((-1047.758));
        double[] doubleArray0 = new double[1];
        try {
            threeEighthesIntegrator0.computeDerivatives(0.0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(0.0 , (-1854.5910046) , (-1854.5910046) , 0.0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(0.0 , 0.0 , 0.0);
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)));
        expandableStatefulODE0.setTime((-0.871391583777973));
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 0.0);
        org.junit.Assert.assertEquals(0.0, expandableStatefulODE0.getTime(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator(0.0);
        classicalRungeKuttaIntegrator0.getEventHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator((-1047.758));
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(1553.327577 , 6.709727430151118 , (-415.5536668319));
        threeEighthesIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), (-415.5536668319), (-415.5536668319), 5);
        double[] doubleArray0 = new double[1];
        double double0 = threeEighthesIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepNormalizerOutputOverlapTest0)), (-1047.758), doubleArray0, 0.0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(((double)(5)) , 1.0E-8 , ((double)(5)) , 1.0E-8);
        java.lang.String string0 = graggBulirschStoerIntegrator0.getName();
        org.junit.Assert.assertEquals("Gragg-Bulirsch-Stoer", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator(0.0);
        classicalRungeKuttaIntegrator0.getStepHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GillIntegrator gillIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GillIntegrator(((double)(-1380)));
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-1.0) , (-352.6) , ((double)(2146384474)));
        gillIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), (-352.6), 0.0, (-1380));
        gillIntegrator0.getEventHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator((-3.096733638475319E128));
        double double0 = midpointIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator((-1047.758));
        int int0 = threeEighthesIntegrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator((-1047.758));
        threeEighthesIntegrator0.getEvaluations();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator(0.0);
        double double0 = midpointIntegrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator((-1047.758));
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
        double[] doubleArray0 = new double[1];
        threeEighthesIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepNormalizerOutputOverlapTest0)), (-1047.758), doubleArray0, 0.0, doubleArray0);
        int int0 = threeEighthesIntegrator0.getEvaluations();
        org.junit.Assert.assertEquals(4, int0);
    }
}

