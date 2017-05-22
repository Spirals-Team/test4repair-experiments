package org.apache.commons.math.ode.nonstiff;


public class AdaptiveStepsizeIntegrator_ESTest extends org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator((-979.91) , (-3150.2360580306513) , 0.0 , 0.0);
        double double0 = highamHall54Integrator0.filterStep(0.0, false, true);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals((-979.91), double0, 0.01);
        org.junit.Assert.assertEquals(1756.9712051211357, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(2674.3994413576643 , 3.897258715788584E-7 , 3.897258715788584E-7 , 1.0E-15);
        double double0 = dormandPrince853Integrator0.filterStep(1.0E-15, true, true);
        org.junit.Assert.assertEquals(0.032284402630885514, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(3.897258715788584E-7, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(0.0 , 0.0 , 0.0 , 0.0);
        dormandPrince853Integrator0.setInitialStepSize(0.0);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[8];
        try {
            dormandPrince853Integrator0.initializeStep(testProblem5_0, false, 1, doubleArray0, 0.0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(1.1102230246251565E-16 , 1.1102230246251565E-16 , 1.1102230246251565E-16);
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(5.708345053925727E-13 , 1.1102230246251565E-16 , (-861.88424) , 0.3010299956639812);
        dormandPrince853Integrator0.sanityChecks(stepProblem0, 2141.83, doubleArray0, 0.3010299956639812, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(7.960864344638384E-15, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator((-336.7721108) , (-1666.8504261768326) , (-336.7721108) , (-0.871391583777973));
        highamHall54Integrator0.resetInternalState();
        org.junit.Assert.assertEquals(749.2320978251342, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(1.1102230246251565E-16 , 1.1102230246251565E-16 , 1.1102230246251565E-16 , 1.1102230246251565E-16);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(1.1102230246251565E-16 , 1.1102230246251565E-16 , 1.1102230246251565E-16);
        double[] doubleArray0 = new double[1];
        dormandPrince54Integrator0.integrate(stepProblem0, 1.1102230246251565E-16, doubleArray0, 0.0, doubleArray0);
        org.junit.Assert.assertEquals(14, dormandPrince54Integrator0.getEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(16.09629537188588 , (-1600.8446) , (-1600.8446) , (-1600.8446));
        double double0 = dormandPrince54Integrator0.getMinStep();
        org.junit.Assert.assertEquals(160.52310589472316, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(16.09629537188588, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((-1048.4079410768215) , (-1324.2698253) , doubleArray0 , doubleArray0);
        double double0 = dormandPrince853Integrator0.getMinStep();
        org.junit.Assert.assertEquals(1178.2932576285648, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals((-1048.4079410768215), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.0 , 2046.7137 , doubleArray0 , doubleArray0);
        double double0 = highamHall54Integrator0.getMaxStep();
        org.junit.Assert.assertEquals(2046.7137, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((-173.0) , (-1039.1455341) , doubleArray0 , doubleArray0);
        double double0 = dormandPrince853Integrator0.getMaxStep();
        org.junit.Assert.assertEquals(423.995492192193, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals((-1039.1455341), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(0.0 , 0.0 , 0.0 , 0.0);
        double double0 = dormandPrince54Integrator0.filterStep(0.0, false, false);
        org.junit.Assert.assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(1.1102230246251565E-16 , (-1600.8446) , (-1600.8446) , (-1600.8446));
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem((-1600.8446) , 1.1102230246251565E-16 , (-1600.8446));
        double[] doubleArray0 = new double[1];
        dormandPrince54Integrator0.integrate(stepProblem0, (-1600.8446), doubleArray0, 1.0E-15, doubleArray0);
        double double0 = dormandPrince54Integrator0.initializeStep(stepProblem0, false, 40, doubleArray0, 1.1102230246251565E-16, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(63, dormandPrince54Integrator0.getEvaluations());
        org.junit.Assert.assertEquals((-0.8912509381337456), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(1.1102230246251565E-16 , 1.1102230246251565E-16 , 1.1102230246251565E-16 , 1.1102230246251565E-16);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(1.1102230246251565E-16 , 1.1102230246251565E-16 , 1.1102230246251565E-16);
        double[] doubleArray0 = new double[1];
        dormandPrince54Integrator0.integrate(stepProblem0, 1.1102230246251565E-16, doubleArray0, 1.0E-15, doubleArray0);
        double double0 = dormandPrince54Integrator0.initializeStep(stepProblem0, true, 40, doubleArray0, 1.1102230246251565E-16, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(57, dormandPrince54Integrator0.getEvaluations());
        org.junit.Assert.assertEquals(1.1102230246251565E-16, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem((-1601.6413969841115) , 1.1102230246251565E-16 , (-1601.6413969841115));
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[1];
        doubleArray1[0] = -1601.6413969841115;
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(15.0 , (-1601.6413969841115) , 562.7 , 5.746280211439194);
        try {
            graggBulirschStoerIntegrator0.initializeStep(stepProblem0, true, 2, doubleArray1, (-0.01), doubleArray1, doubleArray0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(0.0 , 0.0 , 0.0 , 2969.4732578767);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(718.43222825 , 0.0 , (-104.208));
        double[] doubleArray0 = new double[0];
        try {
            dormandPrince853Integrator0.initializeStep(stepProblem0, false, 913, doubleArray0, 0.03709200011850479, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(1165.1696080127097 , 1165.1696080127097 , 1165.1696080127097 , 1165.1696080127097);
        dormandPrince853Integrator0.setInitialStepSize(1165.1696080127097);
        double[] doubleArray0 = new double[9];
        double double0 = dormandPrince853Integrator0.initializeStep(((org.apache.commons.math.ode.FirstOrderDifferentialEquations)(null)), true, (-1), doubleArray0, 4326.02856565125, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(1165.1696080127097, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(1165.1696080127097, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(0.0 , (-1600.8446) , (-1600.8446) , (-1600.8446));
        double double0 = dormandPrince54Integrator0.getMinStep();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(0.0 , 0.0 , 0.0 , 0.0);
        double double0 = dormandPrince853Integrator0.getMaxStep();
        org.junit.Assert.assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(1.1102230246251565E-16 , 1.6643771824549864 , 1.6643771824549864 , 1.6643771824549864);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(1.6643771824549864 , 1.1102230246251565E-16 , 1.6643771824549864);
        double[] doubleArray0 = new double[1];
        dormandPrince54Integrator0.integrate(stepProblem0, 1.6643771824549864, doubleArray0, 1.0E-15, doubleArray0);
        org.junit.Assert.assertEquals(44, dormandPrince54Integrator0.getEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(16.09629537188588 , (-1600.8446) , (-1600.8446) , (-1600.8446));
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem((-1600.8446) , 16.09629537188588 , (-1600.8446));
        double[] doubleArray0 = new double[1];
        dormandPrince54Integrator0.integrate(stepProblem0, (-1600.8446), doubleArray0, 1.0E-15, doubleArray0);
        double double0 = dormandPrince54Integrator0.initializeStep(stepProblem0, true, 40, doubleArray0, 16.09629537188588, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(27, dormandPrince54Integrator0.getEvaluations());
        org.junit.Assert.assertEquals(16.09629537188588, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(1.1102230246251565E-16 , (-1601.6413969841115) , (-1601.6413969841115) , (-1601.6413969841115));
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem((-1601.6413969841115) , 1.1102230246251565E-16 , (-1601.6413969841115));
        double[] doubleArray0 = new double[5];
        stepProblem0.eventOccurred(1.1102230246251565E-16, doubleArray0, true);
        double[] doubleArray1 = new double[1];
        doubleArray1[0] = -1601.6413969841115;
        dormandPrince54Integrator0.integrate(stepProblem0, (-1601.6413969841115), doubleArray1, 1.1102230246251565E-16, doubleArray1);
        org.junit.Assert.assertEquals(74, dormandPrince54Integrator0.getEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(1146.349077837984 , 1146.349077837984 , 1146.349077837984 , 1146.349077837984);
        dormandPrince853Integrator0.setInitialStepSize(1146.349077837984);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem((-3831.396210817974) , 1.0 , (-3831.396210817974));
        double[] doubleArray0 = new double[9];
        double double0 = dormandPrince853Integrator0.initializeStep(stepProblem0, false, 2146691822, doubleArray0, (-1622.3), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(1146.349077837984, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals((-1146.349077837984), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(1.1102230246251565E-16 , (-1600.8446) , (-1600.8446) , (-1600.8446));
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem((-1600.8446) , 1.1102230246251565E-16 , (-1600.8446));
        double[] doubleArray0 = new double[1];
        dormandPrince54Integrator0.setInitialStepSize(1.1102230246251565E-16);
        dormandPrince54Integrator0.integrate(stepProblem0, (-1600.8446), doubleArray0, 8.276804837640363, doubleArray0);
        org.junit.Assert.assertEquals(133, dormandPrince54Integrator0.getEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator((-589.025065) , (-589.025065) , 3650.323188258268 , (-589.025065));
        dormandPrince54Integrator0.setInitialStepSize(3650.323188258268);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(589.025065, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator((-589.025065) , (-589.025065) , 3650.323188258268 , (-589.025065));
        dormandPrince54Integrator0.setInitialStepSize(0.0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(589.025065, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(1165.1696080127097 , 1165.1696080127097 , 1165.1696080127097 , 1165.1696080127097);
        double double0 = dormandPrince853Integrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(1165.1696080127097, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
    }
}

