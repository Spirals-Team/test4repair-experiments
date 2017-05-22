package org.apache.commons.math.ode.nonstiff;


public class AdaptiveStepsizeIntegrator_ESTest extends org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 8.066751139533497E-4;
        doubleArray0[1] = 8.066751139533497E-4;
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(8.066751139533497E-4 , 8.066751139533497E-4 , doubleArray0 , doubleArray0);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        dormandPrince54Integrator0.integrate(testProblem5_0, 168.75371145, doubleArray0, (-13.23461598504303), doubleArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(1.0E-15 , (-1088.5114824186153) , (-152.99967760092497) , 1567.7);
        graggBulirschStoerIntegrator0.setInitialStepSize(1.0E-15);
        org.junit.Assert.assertEquals(1.0433175367157476E-6, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-1.337123720100254) , (-1088.5114824186153) , (-1.337123720100254) , 1567.7);
        graggBulirschStoerIntegrator0.setInitialStepSize(1575.8);
        org.junit.Assert.assertEquals(38.150681812300824, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(3766.13883612832 , 3766.13883612832 , 3766.13883612832 , 3766.13883612832);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(3766.13883612832 , 0.0 , 3766.13883612832);
        double[] doubleArray0 = new double[1];
        dormandPrince853Integrator0.sanityChecks(stepProblem0, (-696.3306473927307), doubleArray0, 3766.13883612832, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(3766.13883612832, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-709.9373) , 0.5667149535193777 , (-709.9373) , (-709.9373));
        graggBulirschStoerIntegrator0.resetInternalState();
        org.junit.Assert.assertEquals(20.058217367731675, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(1238.65644 , 1238.65644 , (-717.711956) , 1238.65644);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        highamHall54Integrator0.integrate(testProblem5_0, (-236.219), doubleArray0, (-717.711956), doubleArray0);
        org.junit.Assert.assertEquals(15, testProblem5_0.getCalls());
        org.junit.Assert.assertEquals(1238.65644, highamHall54Integrator0.getMaxStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(460.459443780601 , 0.0 , doubleArray0 , doubleArray0);
        double double0 = dormandPrince853Integrator0.getMinStep();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(460.459443780601, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(((double)(-10)) , 1688.835470837511 , doubleArray0 , doubleArray0);
        double double0 = highamHall54Integrator0.getMinStep();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals((-10.0), double0, 0.01);
        org.junit.Assert.assertEquals(1688.835470837511, highamHall54Integrator0.getMaxStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-838.81350865) , (-838.81350865) , (-838.81350865) , 164.44607233);
        double double0 = graggBulirschStoerIntegrator0.getMaxStep();
        org.junit.Assert.assertEquals(838.81350865, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(838.81350865, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-3567.0) , (-3567.0) , doubleArray0 , doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.getMaxStep();
        org.junit.Assert.assertEquals(3567.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals((-3567.0), double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(1.0E-10 , 0.0 , doubleArray0 , doubleArray0);
        double double0 = highamHall54Integrator0.filterStep(0.0, true, true);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(1.0E-10, highamHall54Integrator0.getMinStep(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.060083636995826084 , (-1914.68564) , doubleArray0 , doubleArray0);
        double double0 = highamHall54Integrator0.filterStep(2220.23286, false, false);
        org.junit.Assert.assertEquals((-1914.68564), double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(0.060083636995826084, highamHall54Integrator0.getMinStep(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator((-2152.9992503836575) , 140.018306 , 3299.62149232 , 3299.62149232);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(3299.62149232 , (-111.1150107092) , 0.001);
        dormandPrince54Integrator0.integrate(stepProblem0, (-111.1150107092), doubleArray0, 6.0, doubleArray0);
        double double0 = dormandPrince54Integrator0.initializeStep(stepProblem0, true, (-2131874439), doubleArray0, 2789.7, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(15, dormandPrince54Integrator0.getEvaluations());
        org.junit.Assert.assertEquals(140.018306, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator((-2152.9992503836575) , 140.018306 , 3299.62149232 , 3299.62149232);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(3299.62149232 , (-111.1150107092) , 0.001);
        dormandPrince54Integrator0.integrate(stepProblem0, (-111.1150107092), doubleArray0, 6.0, doubleArray0);
        stepProblem0.setRate(java.lang.Double.NaN);
        dormandPrince54Integrator0.initializeStep(stepProblem0, false, (-2131874439), doubleArray0, 2789.7, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(15, dormandPrince54Integrator0.getEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 1986.348892527;
        doubleArray0[1] = -1.0;
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((-2717.656149) , (-5.629942242093248E57) , 3766.13883612832 , 32.0);
        double[] doubleArray1 = new double[7];
        try {
            dormandPrince853Integrator0.initializeStep(testProblem5_0, true, 50, doubleArray0, (-45.786993), doubleArray0, doubleArray1, doubleArray0, doubleArray1);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.0 , (-953.45) , doubleArray0 , doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.getMinStep();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals((-0.0), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(835.1098 , 0.0 , 17.0 , 835.1098);
        double double0 = dormandPrince54Integrator0.getMaxStep();
        org.junit.Assert.assertEquals(835.1098, dormandPrince54Integrator0.getMinStep(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(1238.65644 , 1238.65644 , 1238.65644 , 1238.65644);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        highamHall54Integrator0.integrate(testProblem5_0, (-236.219), doubleArray0, 1238.65644, doubleArray0);
        org.junit.Assert.assertEquals(22, testProblem5_0.getCalls());
        org.junit.Assert.assertEquals(1238.65644, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator((-854.53) , (-854.53) , (-35.139) , (-2035.402145648331));
        double double0 = highamHall54Integrator0.filterStep(4.450312892752409, true, true);
        org.junit.Assert.assertEquals(854.53, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(854.53, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(((double)(0)) , 5.791903296748099 , ((double)(0)) , 5.791903296748099);
        graggBulirschStoerIntegrator0.setInitialStepSize(5.791903296748099);
        double[] doubleArray0 = new double[0];
        double double0 = graggBulirschStoerIntegrator0.initializeStep(((org.apache.commons.math.ode.FirstOrderDifferentialEquations)(null)), false, 2, doubleArray0, 5.791903296748099, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals((-5.791903296748099), double0, 0.01);
        org.junit.Assert.assertEquals(5.791903296748099, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
        org.junit.Assert.assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(136.588 , 136.588 , 136.588 , 136.588);
        dormandPrince853Integrator0.setInitialStepSize(0.01);
        org.junit.Assert.assertEquals(136.588, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(3766.13883612832 , 3766.13883612832 , 3766.13883612832 , 3766.13883612832);
        double double0 = dormandPrince853Integrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(3766.13883612832, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
    }
}

