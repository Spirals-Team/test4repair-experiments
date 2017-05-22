package org.apache.commons.math.ode.nonstiff;


public class AdaptiveStepsizeIntegrator_ESTest extends org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(3350.3 , 3350.3 , doubleArray0 , doubleArray0);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(0.0 , 1303.326989374945 , 3350.3);
        highamHall54Integrator0.setInitialStepSize(3350.3);
        double double0 = highamHall54Integrator0.initializeStep(stepProblem0, false, 0, doubleArray0, 3350.3, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(3350.3, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals((-3350.3), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(3247.5931 , 3247.5931 , doubleArray0 , doubleArray0);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(3247.5931 , (-1853.20827) , 3247.5931);
        highamHall54Integrator0.sanityChecks(stepProblem0, 3247.5931, doubleArray0, 1948.04408965, doubleArray0);
        org.junit.Assert.assertEquals(3247.5931, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((-550.39562141) , 2112.8214978 , (-550.39562141) , 2112.8214978);
        dormandPrince853Integrator0.resetInternalState();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(1078.372709785461, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-1100.685) , (-1100.685) , 1.0 , (-598.7677039398));
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        graggBulirschStoerIntegrator0.integrate(testProblem5_0, (-598.7677039398), doubleArray0, 0.0, doubleArray0);
        org.junit.Assert.assertEquals(598.7677039398, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-1100.685) , (-1100.685) , 1.0 , (-598.7677039398));
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        graggBulirschStoerIntegrator0.integrate(testProblem5_0, (-598.7677039398), doubleArray0, 1.0E-10, doubleArray0);
        org.junit.Assert.assertEquals(598.7677039399, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.0 , 0.0 , doubleArray0 , doubleArray0);
        double double0 = highamHall54Integrator0.getMinStep();
        org.junit.Assert.assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator adamsBashforthIntegrator0 = new org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator(1 , 1675.82464883344 , java.lang.Double.NaN , doubleArray0 , doubleArray0);
        double double0 = adamsBashforthIntegrator0.getMinStep();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, adamsBashforthIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(1675.82464883344, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, adamsBashforthIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator((-0.008298) , (-0.008298) , (-0.008298) , (-0.008298));
        double double0 = dormandPrince54Integrator0.getMaxStep();
        org.junit.Assert.assertEquals(0.008298, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(0.008298, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator((-0.008298) , (-0.008298) , doubleArray0 , doubleArray0);
        double double0 = dormandPrince54Integrator0.getMaxStep();
        org.junit.Assert.assertEquals((-0.008298), double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.008298, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-1100.685) , (-1100.685) , 1.0 , (-592.1076464903913));
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        graggBulirschStoerIntegrator0.integrate(testProblem5_0, 1.0E-10, doubleArray0, 0.0, doubleArray0);
        graggBulirschStoerIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals((-1.000444171950221E-10), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-1100.685) , (-1100.685) , 1.0 , (-598.7677039398));
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        graggBulirschStoerIntegrator0.integrate(testProblem5_0, 1.0E-10, doubleArray0, (-3234.126893184), doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(36, graggBulirschStoerIntegrator0.getEvaluations());
        org.junit.Assert.assertEquals((-3234.126893184), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.0 , 0.0 , doubleArray0 , doubleArray0);
        double double0 = highamHall54Integrator0.filterStep(0.0, false, false);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator((-1011.3638055844772) , (-1011.3638055844772) , (-1011.3638055844772) , 6.8812326946963);
        double double0 = highamHall54Integrator0.filterStep(6.8812326946963, true, true);
        org.junit.Assert.assertEquals(1011.3638055844772, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(1011.3638055844772, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(1.0 , 1.0 , 1.0 , 0.0);
        double[] doubleArray0 = new double[7];
        try {
            dormandPrince853Integrator0.initializeStep(((org.apache.commons.math.ode.FirstOrderDifferentialEquations)(null)), false, 2039, doubleArray0, 1330.9496371, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(0.0016700967670767813 , 0.0016700967670767813 , (-719.10884957) , (-719.10884957));
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem((-1512.5142967332124) , 1292.48231 , (-1242.59979));
        double[] doubleArray0 = new double[0];
        try {
            dormandPrince853Integrator0.initializeStep(stepProblem0, true, 1, doubleArray0, 354216.0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-2054.2294) , 1574.76584430052 , doubleArray0 , doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.getMinStep();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(1574.76584430052, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
        org.junit.Assert.assertEquals((-2054.2294), double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.0 , 0.0 , 0.0 , 0.0);
        double double0 = graggBulirschStoerIntegrator0.getMaxStep();
        org.junit.Assert.assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-1100.685) , (-1100.685) , 1.0 , (-598.7677039398));
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        graggBulirschStoerIntegrator0.integrate(testProblem5_0, (-598.7677039398), doubleArray0, (-1.5452908439318527), doubleArray0);
        org.junit.Assert.assertEquals(15, testProblem5_0.getCalls());
        org.junit.Assert.assertEquals(1100.685, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(3247.5931 , 3247.5931 , doubleArray0 , doubleArray0);
        double double0 = highamHall54Integrator0.filterStep((-825.760445), false, true);
        org.junit.Assert.assertEquals((-3247.5931), double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(3247.5931, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-0.4957589496572502) , (-0.4957589496572502) , 1.0 , (-598.7677039398));
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        doubleArray0[1] = -598.7677039398;
        graggBulirschStoerIntegrator0.integrate(testProblem5_0, (-598.7677039398), doubleArray0, 1.0E-10, doubleArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 3247.5931;
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(3247.5931 , 3247.5931 , doubleArray0 , doubleArray0);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(0.01 , 1.0 , (-825.760445));
        highamHall54Integrator0.integrate(stepProblem0, 19.085536923187668, doubleArray0, 3235.094354, doubleArray0);
        double double0 = highamHall54Integrator0.initializeStep(stepProblem0, false, 696, doubleArray0, 0.01, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.01 }, doubleArray0, 0.01);
        org.junit.Assert.assertEquals((-3247.5931), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(2752.4667421 , 3350.3 , 3350.3 , 3350.3);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(3350.3 , 1303.326989374945 , 3350.3);
        highamHall54Integrator0.setInitialStepSize(3350.3);
        double double0 = highamHall54Integrator0.initializeStep(stepProblem0, false, 0, doubleArray0, 3350.3, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals((-3350.3), double0, 0.01);
        org.junit.Assert.assertEquals(3036.7069871914923, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(0.0016700967670767813 , 0.0016700967670767813 , 0.0016700967670767813 , 0.0016700967670767813);
        dormandPrince853Integrator0.setInitialStepSize(0.1412071432281581);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0016700967670767813, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(0.0016700967670767813 , (-719.1088496) , (-719.1088496) , (-719.1088496));
        dormandPrince853Integrator0.setInitialStepSize(0.1412071432281581);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[9];
        double double0 = dormandPrince853Integrator0.initializeStep(testProblem5_0, true, (-527), doubleArray0, 0.1412071432281581, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(1.0958929532090547, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.1412071432281581, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-1100.685) , (-1100.685) , (-1100.685) , (-592.1076464903913));
        graggBulirschStoerIntegrator0.setInitialStepSize(1.0E-12);
        org.junit.Assert.assertEquals(1100.685, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-1100.685) , (-1100.685) , 1.0 , (-592.1076464903913));
        double double0 = graggBulirschStoerIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(1100.685, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-1100.685) , (-1100.685) , (-1100.685) , (-592.1076464903913));
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        graggBulirschStoerIntegrator0.integrate(testProblem5_0, (-1100.685), doubleArray0, (-3234.126893184), doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.initializeStep(testProblem5_0, true, 0, doubleArray0, (-3234.126893184), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(30, testProblem5_0.getCalls());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }
}

