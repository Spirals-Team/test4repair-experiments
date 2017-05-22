package org.apache.commons.math3.ode;


public class AbstractIntegrator_ESTest extends org.apache.commons.math3.ode.AbstractIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator(1383.88845106 , 1715.454246347226 , 236.28218008623 , (-636.304988282));
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(1715.454246347226 , 1383.88845106 , 1383.88845106);
        double[] doubleArray0 = new double[1];
        highamHall54Integrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)), (-636.304988282), doubleArray0, 3466933.3024131004, doubleArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator((-2033.36091) , (-2033.36091) , doubleArray0 , doubleArray0);
        java.util.Collection<org.apache.commons.math3.ode.sampling.StepHandler> collection0 = dormandPrince853Integrator0.getStepHandlers();
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator((-2033.36091) , (-2033.36091) , doubleArray0 , doubleArray0);
        dormandPrince853Integrator0.setMaxEvaluations(0);
        int int0 = dormandPrince853Integrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator((-7.2) , (-7.2) , (-7.2) , (-7.2));
        int int0 = dormandPrince54Integrator0.getEvaluations();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(0.0 , (-25.69393346270375) , doubleArray0 , doubleArray0);
        double double0 = dormandPrince853Integrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator((-7.2));
        try {
            threeEighthesIntegrator0.computeDerivatives((-7.2), doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((-306.4259596287) , 1697.465773 , doubleArray0 , doubleArray0);
        graggBulirschStoerIntegrator0.setMaxEvaluations((-1726));
        org.junit.Assert.assertEquals(1697.465773, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GillIntegrator gillIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GillIntegrator((-2589.1));
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest stepNormalizerOutputTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
        org.apache.commons.math3.ode.sampling.StepNormalizerMode stepNormalizerMode0 = org.apache.commons.math3.ode.sampling.StepNormalizerMode.MULTIPLES;
        org.apache.commons.math3.ode.sampling.StepNormalizerBounds stepNormalizerBounds0 = org.apache.commons.math3.ode.sampling.StepNormalizerBounds.BOTH;
        org.apache.commons.math3.ode.sampling.StepNormalizer stepNormalizer0 = new org.apache.commons.math3.ode.sampling.StepNormalizer((-2589.1) , ((org.apache.commons.math3.ode.sampling.FixedStepHandler)(stepNormalizerOutputTest0)) , stepNormalizerMode0 , stepNormalizerBounds0);
        gillIntegrator0.addStepHandler(stepNormalizer0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GillIntegrator gillIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GillIntegrator((-2701.836282211));
        gillIntegrator0.clearEventHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(2650.926040543025 , 3.5555555555555554 , 2650.926040543025 , (-0.08333333333333333));
        graggBulirschStoerIntegrator0.clearStepHandlers();
        org.junit.Assert.assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator((-1447.009) , (-1447.009) , (-1149.7095855359328) , (-1149.7095855359328));
        dormandPrince853Integrator0.setMaxEvaluations(560);
        org.junit.Assert.assertEquals(1447.009, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator(4.8);
        classicalRungeKuttaIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(null)), 4.8, 4.8, 1257, ((org.apache.commons.math3.analysis.solvers.UnivariateSolver)(null)));
        classicalRungeKuttaIntegrator0.getEventHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator(4.8);
        classicalRungeKuttaIntegrator0.getName();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GillIntegrator gillIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GillIntegrator(635.304988282);
        double double0 = gillIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(2019.88845106 , 2019.88845106 , (-2245.29308057) , 2019.88845106);
        int int0 = dormandPrince853Integrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(0.027880118163850387 , 0.027880118163850387 , 0.027880118163850387 , 0.027880118163850387);
        double double0 = dormandPrince54Integrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(0.027880118163850387, double0, 0.01);
    }
}

