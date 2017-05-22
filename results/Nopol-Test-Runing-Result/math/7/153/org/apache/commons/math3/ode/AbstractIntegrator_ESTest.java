package org.apache.commons.math3.ode;


public class AbstractIntegrator_ESTest extends org.apache.commons.math3.ode.AbstractIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-1256.4280877) , (-1256.4280877) , (-1.0));
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)));
        expandableStatefulODE0.setTime((-0.4831900357003607));
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(((double)(-1988)) , java.lang.Double.NaN , (-0.4831900357003607) , (-0.4831900357003607));
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-1256.4280877));
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 2264.2322129275);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(1.0 , 1.0 , 1.0 , 1.0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-1256.4280877) , (-1256.4280877) , (-1.0));
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)));
        double[] doubleArray0 = expandableStatefulODE0.getCompleteState();
        expandableStatefulODE0.setTime((-0.4831900357003607));
        dormandPrince54Integrator0.integrate(expandableStatefulODE0, 0.0);
        dormandPrince54Integrator0.computeDerivatives((-1043), doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 1000.0;
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(1000.0 , 1000.0 , doubleArray0 , doubleArray0);
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
        double double0 = dormandPrince54Integrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepNormalizerOutputOverlapTest0)), (-0.360467705442685), doubleArray0, 1000.0, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 2.4020106470808166E18 }, doubleArray0, 0.01);
        org.junit.Assert.assertEquals(1000.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator(7.8);
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        double double0 = threeEighthesIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_0)), 284.20572798813, doubleArray0, (-419.01125079491), doubleArray0);
        org.junit.Assert.assertEquals(364, testProblem5_0.getCalls());
        org.junit.Assert.assertEquals((-419.01125079491), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(0.0 , 0.0 , 0.0 , (-902.872817));
        double double0 = dormandPrince853Integrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator(1.0663697110471944E-8);
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_0)));
        testProblem5_0.n = 1995219137;
        try {
            classicalRungeKuttaIntegrator0.integrate(expandableStatefulODE0, 1.0663697110471944E-8);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GillIntegrator gillIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GillIntegrator((-541.9062329325326));
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
        double double0 = gillIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepNormalizerOutputOverlapTest0)), (-541.9062329325326), doubleArray0, 0.0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator(614.4227071206);
        classicalRungeKuttaIntegrator0.setMaxEvaluations((-2564));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GillIntegrator gillIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GillIntegrator(104.0996495089623);
        gillIntegrator0.clearEventHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(1.0 , 1.0 , 1.0 , 1.0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-1256.4280877) , (-1256.4280877) , (-1.0));
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)));
        double[] doubleArray0 = expandableStatefulODE0.getCompleteState();
        try {
            dormandPrince54Integrator0.computeDerivatives((-1043), doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(1.0 , 1.0 , 1.0 , 1.0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-1256.4280877) , (-1256.4280877) , (-1.0));
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)));
        expandableStatefulODE0.setTime((-0.4831900357003607));
        dormandPrince54Integrator0.integrate(expandableStatefulODE0, 0.0);
        int int0 = dormandPrince54Integrator0.getEvaluations();
        org.junit.Assert.assertEquals(8, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(1.0 , 1.0 , 1.0 , 1.0);
        java.util.Collection<org.apache.commons.math3.ode.events.EventHandler> collection0 = dormandPrince54Integrator0.getEventHandlers();
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-1256.4280877) , (-1256.4280877) , (-1.0));
        org.apache.commons.math3.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math3.analysis.solvers.BisectionSolver((-1256.4280877) , 1000.0);
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)));
        expandableStatefulODE0.setTime((-0.4831900357003607));
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(((double)(-1988)) , java.lang.Double.NaN , (-0.4831900357003607) , (-0.4831900357003607));
        graggBulirschStoerIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), (-782.13), 1.0, 232, ((org.apache.commons.math3.analysis.solvers.UnivariateSolver)(bisectionSolver0)));
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-1256.4280877));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(0.0 , ((double)(1023)) , doubleArray0 , doubleArray0);
        java.lang.String string0 = dormandPrince853Integrator0.getName();
        org.junit.Assert.assertEquals("Dormand-Prince 8 (5, 3)", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator(7.8);
        threeEighthesIntegrator0.getStepHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(1.0 , 1.0 , 1.0 , 1.0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-1256.4280877) , (-1256.4280877) , (-1.0));
        dormandPrince54Integrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), (-2104.2791891763), (-1256.4280877), 0);
        org.junit.Assert.assertEquals(1.0, dormandPrince54Integrator0.getMinStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(1.0 , 1.0 , 1.0 , 1.0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-1256.4280877) , (-1256.4280877) , (-1.0));
        org.apache.commons.math3.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math3.analysis.solvers.BisectionSolver((-1256.4280877) , 1000.0);
        dormandPrince54Integrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), 1000.0, 1597.89, (-1043), ((org.apache.commons.math3.analysis.solvers.UnivariateSolver)(bisectionSolver0)));
        java.util.Collection<org.apache.commons.math3.ode.events.EventHandler> collection0 = dormandPrince54Integrator0.getEventHandlers();
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator(614.4227071206);
        double double0 = classicalRungeKuttaIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator((-610.9) , 1381.8800806 , doubleArray0 , doubleArray0);
        int int0 = dormandPrince853Integrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(1.0 , 1.0 , 1.0 , 1.0);
        int int0 = dormandPrince54Integrator0.getEvaluations();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator((-1507.31579) , 0.6 , 704.81 , 51544.0);
        double double0 = highamHall54Integrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(30.07306891555965, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator(7.8);
        threeEighthesIntegrator0.clearStepHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
    }
}

