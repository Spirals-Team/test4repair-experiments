package org.apache.commons.math.ode.nonstiff;


public class AdaptiveStepsizeIntegrator_ESTest extends org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(2075.1278927449075 , 2075.1278927449075 , 2075.1278927449075 , 2075.1278927449075);
        double double0 = highamHall54Integrator0.filterStep(2075.1278927449075, false, true);
        org.junit.Assert.assertEquals(2075.1278927449075, double0, 0.01);
        org.junit.Assert.assertEquals(2075.1278927449075, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(0.0 , 0.0 , 0.0 , 0.0);
        dormandPrince54Integrator0.setInitialStepSize(java.lang.Double.NaN);
        org.junit.Assert.assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(1.0E-10 , 0.0 , doubleArray0 , doubleArray0);
        graggBulirschStoerIntegrator0.setInitialStepSize(1.0E-10);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(1.0E-10, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-1559.1393366381203) , (-1559.1393366381203) , (-1559.1393366381203) , (-1715.532915830622));
        graggBulirschStoerIntegrator0.resetInternalState();
        org.junit.Assert.assertEquals(1559.1393366381203, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(185.43 , (-1.0) , doubleArray0 , doubleArray0);
        double double0 = dormandPrince54Integrator0.getMinStep();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals((-1.0), dormandPrince54Integrator0.getMaxStep(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(185.43, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator((-290.91591055) , 0.0 , doubleArray0 , doubleArray0);
        double double0 = highamHall54Integrator0.getMinStep();
        org.junit.Assert.assertEquals((-0.0), highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals((-290.91591055), double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(((double)(35)) , 1.5870143571105527E-6 , (-1.0) , ((double)(35)));
        double double0 = graggBulirschStoerIntegrator0.getMaxStep();
        org.junit.Assert.assertEquals(1.5870143571105527E-6, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.007452885514944487, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator((-840.99268275) , (-840.99268275) , doubleArray0 , doubleArray0);
        double double0 = highamHall54Integrator0.getMaxStep();
        org.junit.Assert.assertEquals(840.99268275, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals((-840.99268275), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-1878.111845526) , (-1878.111845526) , (-1878.111845526) , (-349.4962133092));
        double double0 = graggBulirschStoerIntegrator0.filterStep(1896.5819, true, true);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(1878.111845526, double0, 0.01);
        org.junit.Assert.assertEquals(1878.111845526, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-1123.7086) , 1370.46 , 1370.46 , (-1123.7086));
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -1123.7086;
        doubleArray0[1] = 1370.46;
        graggBulirschStoerIntegrator0.setStabilityCheck(false, (-2138815750), (-1), (-2024.208461));
        graggBulirschStoerIntegrator0.integrate(testProblem5_0, 1370.46, doubleArray0, 14.04, doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.initializeStep(testProblem5_0, true, (-2138815750), doubleArray0, (-1332.04892368282), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(23, testProblem5_0.getCalls());
        org.junit.Assert.assertEquals(1123.7086, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(2075.1278927449075 , 2075.1278927449075 , 2075.1278927449075 , 2075.1278927449075);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem((-47.70313826105734) , (-9.147934308113573) , 120.0);
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = new double[4];
        try {
            highamHall54Integrator0.initializeStep(stepProblem0, true, 0, doubleArray0, 0, doubleArray0, doubleArray0, doubleArray0, doubleArray1);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.0 , 0.0 , 0.0 , 0.0);
        double double0 = graggBulirschStoerIntegrator0.getMinStep();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.0 , 0.0 , doubleArray0 , doubleArray0);
        double double0 = highamHall54Integrator0.getMaxStep();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(2844.822814285692 , 2844.822814285692 , 2844.822814285692 , 1.0E-12);
        double double0 = dormandPrince54Integrator0.filterStep(1556.9, false, true);
        org.junit.Assert.assertEquals(2844.822814285692, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals((-2844.822814285692), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator adamsMoultonIntegrator0 = new org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator(1 , ((double)(1)) , 0.0 , 0.0 , 0.0);
        double double0 = adamsMoultonIntegrator0.filterStep(0.0, true, true);
        org.junit.Assert.assertEquals(1.0, adamsMoultonIntegrator0.getMinStep(), 0.01);
        org.junit.Assert.assertEquals(0.0, adamsMoultonIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, adamsMoultonIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-1123.7086) , 1370.46 , 1370.46 , (-1123.7086));
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        graggBulirschStoerIntegrator0.integrate(testProblem5_0, 1370.46, doubleArray0, 14.04, doubleArray0);
        graggBulirschStoerIntegrator0.initializeStep(testProblem5_0, true, (-2138815750), doubleArray0, (-1332.04892368282), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(23, testProblem5_0.getCalls());
        org.junit.Assert.assertEquals(1123.7086, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-1123.7086) , 1370.46 , 1370.46 , (-1123.7086));
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -1123.7086;
        doubleArray0[1] = 1370.46;
        graggBulirschStoerIntegrator0.setStabilityCheck(false, (-2138815750), (-1), (-2024.208461));
        graggBulirschStoerIntegrator0.integrate(testProblem5_0, 1370.46, doubleArray0, 14.04, doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.initializeStep(testProblem5_0, false, (-2138815750), doubleArray0, (-2.810211448068056E42), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(23, testProblem5_0.getCalls());
        org.junit.Assert.assertEquals((-1370.46), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(0.7279494384351507 , 0.7279494384351507 , (-748.56966) , 0.0);
        dormandPrince54Integrator0.setInitialStepSize(0.7279494384351507);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[5];
        double double0 = dormandPrince54Integrator0.initializeStep(testProblem5_0, true, java.lang.Integer.MAX_VALUE, doubleArray0, 0.0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.7279494384351507, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(0.7279494384351507, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(0.001 , 0.001 , (-748.56966) , 0.0);
        dormandPrince54Integrator0.setInitialStepSize(0.001);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[5];
        double double0 = dormandPrince54Integrator0.initializeStep(testProblem5_0, false, java.lang.Integer.MAX_VALUE, doubleArray0, 2.0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.001, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals((-0.001), double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(1478.116673691988 , 0.0 , doubleArray0 , doubleArray0);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        dormandPrince853Integrator0.sanityChecks(testProblem5_0, 0.0, doubleArray0, 1739.5581916367878, doubleArray0);
        org.junit.Assert.assertEquals(1478.116673691988, dormandPrince853Integrator0.getMinStep(), 0.01);
        org.junit.Assert.assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(0.0 , (-0.60440646027598) , (-0.60440646027598) , 0.0);
        dormandPrince853Integrator0.setInitialStepSize(4746.389406347252);
        org.junit.Assert.assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.60440646027598, dormandPrince853Integrator0.getMaxStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(0.0 , 0.0 , (-748.56966) , 0.0);
        dormandPrince54Integrator0.setInitialStepSize(0.0);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[5];
        try {
            dormandPrince54Integrator0.initializeStep(testProblem5_0, false, java.lang.Integer.MAX_VALUE, doubleArray0, 2.0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-1559.1393366381203) , (-1559.1393366381203) , (-1559.1393366381203) , (-1715.532915830622));
        graggBulirschStoerIntegrator0.setInitialStepSize((-1559.1393366381203));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(1559.1393366381203, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(0.0 , (-0.60440646027598) , (-0.60440646027598) , 0.0);
        double double0 = dormandPrince853Integrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(0.60440646027598, dormandPrince853Integrator0.getMaxStep(), 0.01);
        org.junit.Assert.assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }
}

