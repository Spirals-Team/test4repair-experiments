package org.apache.commons.math.ode.nonstiff;


public class AdaptiveStepsizeIntegrator_ESTest extends org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 661.5818027878898;
        doubleArray0[1] = 661.5818027878898;
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(661.5818027878898 , 661.5818027878898 , doubleArray0 , doubleArray0);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        dormandPrince853Integrator0.integrate(testProblem5_0, 661.5818027878898, doubleArray0, (-617.212436294), doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 2.1108160251805356E51 , 2.1108160251805356E51 }, doubleArray0, 0.01);
        org.junit.Assert.assertEquals(38, dormandPrince853Integrator0.getEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(119.8241622058294 , (-3.6840314986403864) , (-3.6840314986403864) , (-3.6840314986403864));
        double double0 = dormandPrince54Integrator0.filterStep(119.8241622058294, false, true);
        org.junit.Assert.assertEquals(3.6840314986403864, double0, 0.01);
        org.junit.Assert.assertEquals(21.010378099036448, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(1.8641099758258801 , 1.8641099758258801 , 1.8641099758258801 , 1.09861228866811);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(1.09861228866811 , 1.8641099758258801 , 1.8641099758258801);
        double[] doubleArray0 = new double[1];
        graggBulirschStoerIntegrator0.integrate(stepProblem0, 0.0, doubleArray0, (-11.57390253996), doubleArray0);
        org.junit.Assert.assertEquals(64, graggBulirschStoerIntegrator0.getEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-7.138976441746258) , (-7.138976441746258) , (-7.138976441746258) , (-7.138976441746258));
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        graggBulirschStoerIntegrator0.sanityChecks(testProblem5_0, (-337.2), doubleArray0, (-7.138976441746258), doubleArray0);
        org.junit.Assert.assertEquals(7.138976441746258, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.0 , 0.0 , 0.0 , 0.0);
        graggBulirschStoerIntegrator0.resetInternalState();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 664.0844998166298;
        doubleArray0[1] = 664.0844998166298;
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(664.0844998166298 , 664.0844998166298 , doubleArray0 , doubleArray0);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        dormandPrince853Integrator0.integrate(testProblem5_0, 664.0844998166298, doubleArray0, 0.0, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 1.8778689473633449E27 , 1.8778689473633449E27 }, doubleArray0, 0.01);
        org.junit.Assert.assertEquals(26, dormandPrince853Integrator0.getEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.01 , 0.01 , 0.01 , 0.01);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(0.01 , 0.01 , (-959.2));
        double[] doubleArray0 = new double[1];
        graggBulirschStoerIntegrator0.integrate(stepProblem0, 0.0, doubleArray0, 0.01, doubleArray0);
        org.junit.Assert.assertEquals(8, graggBulirschStoerIntegrator0.getEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.0 , 0.0 , 0.0 , 0.0);
        double double0 = graggBulirschStoerIntegrator0.getMinStep();
        org.junit.Assert.assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-3.6840314986403864) , (-617.212436294) , doubleArray0 , doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.getMinStep();
        org.junit.Assert.assertEquals((-3.6840314986403864), double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(47.68469415503961, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(27.94888452941996 , 27.94888452941996 , doubleArray0 , doubleArray0);
        double double0 = dormandPrince853Integrator0.getMaxStep();
        org.junit.Assert.assertEquals(27.94888452941996, double0, 0.01);
        org.junit.Assert.assertEquals(27.94888452941996, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-689.1157167091) , (-689.1157167091) , doubleArray0 , doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.getMaxStep();
        org.junit.Assert.assertEquals((-689.1157167091), double0, 0.01);
        org.junit.Assert.assertEquals(689.1157167091, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.01 , 0.01 , 0.01 , 0.01);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(0.01 , 0.01 , (-959.2));
        double[] doubleArray0 = new double[1];
        graggBulirschStoerIntegrator0.integrate(stepProblem0, 0.0, doubleArray0, (-11.573902539959631), doubleArray0);
        graggBulirschStoerIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(8121, graggBulirschStoerIntegrator0.getEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.0 , 0.0 , 0.0 , 0.0);
        double double0 = graggBulirschStoerIntegrator0.filterStep(0.0, false, false);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.01 , 0.01 , 0.01 , 0.01);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(0.01 , 0.01 , (-959.2));
        double[] doubleArray0 = new double[1];
        graggBulirschStoerIntegrator0.integrate(stepProblem0, 0.0, doubleArray0, (-11.573902539959631), doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, false, 1654, doubleArray0, 1654, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(8122, graggBulirschStoerIntegrator0.getEvaluations());
        org.junit.Assert.assertEquals((-0.01), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.3266554585296874 , 1469.8567685750174 , doubleArray0 , doubleArray0);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        try {
            highamHall54Integrator0.initializeStep(testProblem5_0, false, (-2738), doubleArray0, 1469.8567685750174, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(661.5818027878898 , 661.5818027878898 , doubleArray0 , doubleArray0);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        dormandPrince853Integrator0.setInitialStepSize(661.5818027878898);
        double double0 = dormandPrince853Integrator0.initializeStep(testProblem5_0, true, 1463, doubleArray0, 0.064, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(661.5818027878898, double0, 0.01);
        org.junit.Assert.assertEquals(661.5818027878898, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.3266554585296874 , 1469.8567685750174 , doubleArray0 , doubleArray0);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        highamHall54Integrator0.setInitialStepSize(0.3266554585296874);
        double double0 = highamHall54Integrator0.initializeStep(testProblem5_0, false, (-2738), doubleArray0, 1469.8567685750174, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(21.912022652229915, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals((-0.3266554585296874), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(367.5302715 , 0.0 , 1326.099465504856 , 367.5302715);
        double double0 = dormandPrince853Integrator0.getMinStep();
        org.junit.Assert.assertEquals(367.5302715, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(0.0 , 0.0 , 1293.864034 , (-2084.22));
        double double0 = dormandPrince853Integrator0.getMaxStep();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(1730.768473914 , 15.0 , 15.0 , 15.0);
        double double0 = graggBulirschStoerIntegrator0.filterStep(674.0, true, true);
        org.junit.Assert.assertEquals(15.0, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(161.1258114291748, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((-4421.938723) , (-4421.938723) , (-4421.938723) , (-4421.938723));
        double double0 = dormandPrince853Integrator0.filterStep((-170.967), false, true);
        org.junit.Assert.assertEquals(4421.938723, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals((-4421.938723), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.01 , 0.01 , 0.01 , 0.01);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(0.01 , 0.01 , (-959.2));
        double[] doubleArray0 = new double[1];
        try {
            graggBulirschStoerIntegrator0.initializeStep(stepProblem0, true, 1654, doubleArray0, 1654, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.01 , 0.01 , 0.01 , 0.01);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(0.01 , 0.01 , (-959.2));
        stepProblem0.setRate(0.0);
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = -506.420814;
        graggBulirschStoerIntegrator0.integrate(stepProblem0, 0.0, doubleArray0, (-11.573902539959631), doubleArray0);
        org.junit.Assert.assertEquals(8121, graggBulirschStoerIntegrator0.getEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.01 , 0.01 , 0.01 , 0.01);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(0.01 , 0.01 , (-959.2));
        double[] doubleArray0 = new double[1];
        graggBulirschStoerIntegrator0.setInitialStepSize(0.01);
        graggBulirschStoerIntegrator0.integrate(stepProblem0, 0.0, doubleArray0, (-11.573902539959631), doubleArray0);
        graggBulirschStoerIntegrator0.integrate(stepProblem0, (-1207.5412669), doubleArray0, (-11.573902539959631), doubleArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.01 , 0.01 , 0.01 , 0.01);
        graggBulirschStoerIntegrator0.setInitialStepSize(6.265569375E11);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.01, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(662.8087010695589 , 662.8087010695589 , doubleArray0 , doubleArray0);
        dormandPrince853Integrator0.setInitialStepSize(0.0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(662.8087010695589, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.3266554585296874 , 1469.8567685750174 , doubleArray0 , doubleArray0);
        double double0 = highamHall54Integrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(21.912022652229915, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.01 , 0.01 , 0.01 , 0.01);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(0.01 , 0.01 , (-959.2));
        double[] doubleArray0 = new double[1];
        graggBulirschStoerIntegrator0.integrate(stepProblem0, 0.0, doubleArray0, (-11.573902539959631), doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, true, 1654, doubleArray0, 1654, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(8122, graggBulirschStoerIntegrator0.getEvaluations());
        org.junit.Assert.assertEquals(0.01, double0, 0.01);
    }
}

