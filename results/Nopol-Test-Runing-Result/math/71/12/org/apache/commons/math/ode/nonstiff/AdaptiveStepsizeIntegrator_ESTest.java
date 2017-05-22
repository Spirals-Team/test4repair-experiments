package org.apache.commons.math.ode.nonstiff;


public class AdaptiveStepsizeIntegrator_ESTest extends org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = ((double)(2));
        doubleArray0[1] = ((double)(2));
        org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator adamsMoultonIntegrator0 = new org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator(2 , 3.0 , 3.0 , doubleArray0 , doubleArray0);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        adamsMoultonIntegrator0.integrate(testProblem5_0, 1412.46515, doubleArray0, 542.60618429, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 2.1487625576997494E302 , 2.1487625576997494E302 }, doubleArray0, 0.01);
        org.junit.Assert.assertEquals(604, adamsMoultonIntegrator0.getEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(100.0 , 1805.8 , 0.0 , 1805.8);
        highamHall54Integrator0.setInitialStepSize(1318.34341307385);
        org.junit.Assert.assertEquals(424.9470555257443, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(1435.0 , 1435.0 , 569.632143498);
        org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator adamsMoultonIntegrator0 = new org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator(2 , (-3638.89554993) , 0.01 , (-0.5) , (-483.645691));
        adamsMoultonIntegrator0.sanityChecks(stepProblem0, (-0.5), doubleArray0, 2062.8, doubleArray0);
        org.junit.Assert.assertEquals(6.032325878075554, adamsMoultonIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, adamsMoultonIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator((-3026.3976969004325) , (-3026.3976969004325) , doubleArray0 , doubleArray0);
        dormandPrince54Integrator0.resetInternalState();
        org.junit.Assert.assertEquals(3026.3976969004325, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(3128.73304713 , 3128.73304713 , 3128.73304713 , 3128.73304713);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(3128.73304713 , 3128.73304713 , 3128.73304713);
        double[] doubleArray0 = new double[1];
        graggBulirschStoerIntegrator0.integrate(stepProblem0, 1.0E-15, doubleArray0, (-3508.129), doubleArray0);
        org.junit.Assert.assertEquals(29, graggBulirschStoerIntegrator0.getEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(0.0 , 1077.7302 , 0.0 , 1077.7302);
        double double0 = dormandPrince54Integrator0.getMinStep();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(1077.7302, dormandPrince54Integrator0.getMaxStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-1950.45) , 0.0 , doubleArray0 , doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.getMinStep();
        org.junit.Assert.assertEquals((-0.0), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals((-1950.45), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-1950.45) , 0.0 , doubleArray0 , doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.getMaxStep();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals((-0.0), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((-1062.95699247309) , (-1062.95699247309) , doubleArray0 , doubleArray0);
        double double0 = dormandPrince853Integrator0.getMaxStep();
        org.junit.Assert.assertEquals((-1062.95699247309), double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(1062.95699247309, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(3128.73304713 , 3128.73304713 , 3128.73304713 , 3128.73304713);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(3128.73304713 , 3128.73304713 , 3128.73304713);
        double[] doubleArray0 = new double[1];
        graggBulirschStoerIntegrator0.integrate(stepProblem0, 3128.73304713, doubleArray0, 0, doubleArray0);
        graggBulirschStoerIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(22, graggBulirschStoerIntegrator0.getEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(((double)(5)) , 0.0 , ((double)(5)) , 0.0);
        double double0 = graggBulirschStoerIntegrator0.filterStep(1805.8, false, false);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(5.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.003333333333333336 , 0.003333333333333336 , doubleArray0 , doubleArray0);
        double double0 = highamHall54Integrator0.filterStep(0.003333333333333336, false, false);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.003333333333333336, double0, 0.01);
        org.junit.Assert.assertEquals(0.003333333333333336, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(2.2752000299540592E-4 , 2.2752000299540592E-4 , 2.2752000299540592E-4 , 2.2752000299540592E-4);
        double double0 = highamHall54Integrator0.filterStep((-0.871391583777973), true, true);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals((-2.2752000299540592E-4), double0, 0.01);
        org.junit.Assert.assertEquals(2.2752000299540592E-4, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(3128.73304713 , 3128.73304713 , 3128.73304713 , 3128.73304713);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(3128.73304713 , 3128.73304713 , 3128.73304713);
        double[] doubleArray0 = new double[1];
        graggBulirschStoerIntegrator0.integrate(stepProblem0, 3128.73304713, doubleArray0, 100.0, doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, false, 0, doubleArray0, 100.0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(23, graggBulirschStoerIntegrator0.getEvaluations());
        org.junit.Assert.assertEquals((-3128.73304713), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(3128.73304713 , 3128.73304713 , 3128.73304713 , 3128.73304713);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(3128.73304713 , 3128.73304713 , 3128.73304713);
        double[] doubleArray0 = new double[1];
        graggBulirschStoerIntegrator0.integrate(stepProblem0, 3128.73304713, doubleArray0, 100.0, doubleArray0);
        double[] doubleArray1 = new double[13];
        double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, true, 0, doubleArray1, 100.0, doubleArray0, doubleArray0, doubleArray1, doubleArray1);
        org.junit.Assert.assertEquals(23, graggBulirschStoerIntegrator0.getEvaluations());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(3128.73304713 , 3128.73304713 , 3128.73304713 , 3128.73304713);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(3128.73304713 , 3128.73304713 , 3128.73304713);
        double[] doubleArray0 = new double[1];
        try {
            graggBulirschStoerIntegrator0.initializeStep(stepProblem0, false, 0, doubleArray0, 100.0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(100.53260771254283 , 100.53260771254283 , 100.53260771254283 , 100.53260771254283);
        dormandPrince853Integrator0.setInitialStepSize(100.53260771254283);
        double double0 = dormandPrince853Integrator0.initializeStep(((org.apache.commons.math.ode.FirstOrderDifferentialEquations)(null)), false, 1495, doubleArray0, 0.3111643669578199, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals((-100.53260771254283), double0, 0.01);
        org.junit.Assert.assertEquals(100.53260771254283, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.003333333333333336 , 0.003333333333333336 , doubleArray0 , doubleArray0);
        highamHall54Integrator0.setInitialStepSize(0.003333333333333336);
        double double0 = highamHall54Integrator0.initializeStep(((org.apache.commons.math.ode.FirstOrderDifferentialEquations)(null)), true, (-2143422016), doubleArray0, 0.003333333333333336, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.003333333333333336, double0, 0.01);
        org.junit.Assert.assertEquals(0.003333333333333336, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(1.0 , 1676.96659135 , 9.822892851699436 , 354216.0);
        double[] doubleArray0 = new double[0];
        try {
            graggBulirschStoerIntegrator0.initializeStep(((org.apache.commons.math.ode.FirstOrderDifferentialEquations)(null)), true, 2, doubleArray0, 1.0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator((-1435.9940262796) , (-2.778205752353508) , (-2.778205752353508) , 0.6666666666666666);
        double double0 = dormandPrince54Integrator0.getMinStep();
        org.junit.Assert.assertEquals(1435.9940262796, double0, 0.01);
        org.junit.Assert.assertEquals(63.16238488337231, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(0.8888888888888888 , 2565.5531 , 0.8888888888888888 , 2.9475147891527724);
        double double0 = dormandPrince853Integrator0.getMaxStep();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(2565.5531, double0, 0.01);
        org.junit.Assert.assertEquals(47.75449344767929, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.003333333333333336 , 0.003333333333333336 , doubleArray0 , doubleArray0);
        highamHall54Integrator0.setInitialStepSize(1468.755238);
        org.junit.Assert.assertEquals(0.003333333333333336, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-3026.3976969004325) , (-3026.3976969004325) , (-3026.3976969004325) , (-3026.3976969004325));
        graggBulirschStoerIntegrator0.setInitialStepSize((-3026.3976969004325));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(3026.3976969004325, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(3128.73304713 , 3128.73304713 , 3128.73304713 , 3128.73304713);
        double double0 = graggBulirschStoerIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(3128.73304713, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }
}

