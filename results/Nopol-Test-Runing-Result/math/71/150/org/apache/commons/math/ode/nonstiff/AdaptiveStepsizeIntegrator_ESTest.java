package org.apache.commons.math.ode.nonstiff;


public class AdaptiveStepsizeIntegrator_ESTest extends org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(3356.208237938 , (-1481.0238813236838) , doubleArray0 , doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.filterStep((-0.16188677833796986), true, true);
        org.junit.Assert.assertEquals((-1481.0238813236838), double0, 0.01);
        org.junit.Assert.assertEquals(3356.208237938, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.0625 , 1220.7844254963625 , 0.0625 , 1220.7844254963625);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        highamHall54Integrator0.setInitialStepSize(1220.7844254963625);
        highamHall54Integrator0.integrate(testProblem5_0, 1220.7844254963625, doubleArray0, (-15.0), doubleArray0);
        org.junit.Assert.assertEquals(21, testProblem5_0.getCalls());
        org.junit.Assert.assertEquals(8.734931401763992, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.0625 , 1220.7844254963625 , 0.0625 , 1220.7844254963625);
        highamHall54Integrator0.setInitialStepSize(0.0625);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        highamHall54Integrator0.integrate(testProblem5_0, 1220.7844254963625, doubleArray0, (-15.0), doubleArray0);
        org.junit.Assert.assertEquals(49, testProblem5_0.getCalls());
        org.junit.Assert.assertEquals(49, highamHall54Integrator0.getEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.0625 , 1220.7844254963625 , 0.0625 , 1220.7844254963625);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        highamHall54Integrator0.setInitialStepSize(1220.7844254963625);
        double double0 = highamHall54Integrator0.initializeStep(testProblem5_0, true, 5, doubleArray0, (-15.000000000000002), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(1220.7844254963625, double0, 0.01);
        org.junit.Assert.assertEquals(8.734931401763992, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.0625 , 1220.7844254963625 , 0.0625 , 1220.7844254963625);
        highamHall54Integrator0.setInitialStepSize(0.0625);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        highamHall54Integrator0.integrate(testProblem5_0, 0.0625, doubleArray0, 1220.7844254963625, doubleArray0);
        org.junit.Assert.assertEquals(49, testProblem5_0.getCalls());
        org.junit.Assert.assertEquals(8.734931401763992, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(8.0 , 8.0 , (-3816.73) , 0.0);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        highamHall54Integrator0.sanityChecks(testProblem5_0, 0.0, doubleArray0, (-3816.73), doubleArray0);
        org.junit.Assert.assertEquals(8.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator((-363.13) , (-1758.376758) , 0.6666666666666666 , (-1758.376758));
        highamHall54Integrator0.resetInternalState();
        org.junit.Assert.assertEquals(799.0740592288928, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.0625 , 1220.7844254963625 , 0.0625 , 1220.7844254963625);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        highamHall54Integrator0.integrate(testProblem5_0, 1220.7844254963625, doubleArray0, (-15.0), doubleArray0);
        org.junit.Assert.assertEquals(50, testProblem5_0.getCalls());
        org.junit.Assert.assertEquals(8.734931401763992, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
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
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((-1813.09042231024) , 1.0E-12 , doubleArray0 , doubleArray0);
        double double0 = dormandPrince853Integrator0.getMinStep();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals((-1813.09042231024), double0, 0.01);
        org.junit.Assert.assertEquals(1.0E-12, dormandPrince853Integrator0.getMaxStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.0015034249455254476 , 0.0015034249455254476 , 0.0015034249455254476 , 0.0015034249455254476);
        double double0 = highamHall54Integrator0.getMaxStep();
        org.junit.Assert.assertEquals(0.0015034249455254476, double0, 0.01);
        org.junit.Assert.assertEquals(0.0015034249455254476, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(3356.208237938 , (-1481.0238813236838) , doubleArray0 , doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.getMaxStep();
        org.junit.Assert.assertEquals(3356.208237938, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
        org.junit.Assert.assertEquals((-1481.0238813236838), double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(0.0 , 0.0 , 0.0 , 0.0);
        double double0 = dormandPrince853Integrator0.filterStep(0.0, false, false);
        org.junit.Assert.assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.0625 , 0.0625 , 0.0625 , (-1758.376758));
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        highamHall54Integrator0.integrate(testProblem5_0, (-1758.376758), doubleArray0, (-15.0), doubleArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(1.0E-12 , 484.6459912464015 , doubleArray0 , doubleArray0);
        double[] doubleArray1 = new double[9];
        try {
            dormandPrince54Integrator0.initializeStep(((org.apache.commons.math.ode.FirstOrderDifferentialEquations)(null)), false, 755960, doubleArray0, 484.6459912464015, doubleArray0, doubleArray0, doubleArray0, doubleArray1);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.0625 , 0.0625 , 0.0625 , (-4016.5));
        highamHall54Integrator0.setInitialStepSize(0.0625);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        double double0 = highamHall54Integrator0.initializeStep(testProblem5_0, false, 5, doubleArray0, doubleArray0[0], doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals((-0.0625), double0, 0.01);
        org.junit.Assert.assertEquals(0.0625, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(2.2404374302607883 , 1865.06811949292 , (-3436.1802049887) , (-3436.1802049887));
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(1865.06811949292 , 2.2404374302607883 , 682.8);
        double[] doubleArray0 = new double[1];
        try {
            graggBulirschStoerIntegrator0.initializeStep(stepProblem0, false, (-493), doubleArray0, (-493), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.0015034249455254476 , 0.0015034249455254476 , 0.0015034249455254476 , 0.0015034249455254476);
        double double0 = highamHall54Integrator0.getMinStep();
        org.junit.Assert.assertEquals(0.0015034249455254476, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(0.0015034249455254476, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(236.4551196 , 0.0 , 0.0 , 236.4551196);
        double double0 = graggBulirschStoerIntegrator0.getMaxStep();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(236.4551196, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((-110.09493) , (-110.09493) , 3837.668809 , 0.0);
        double double0 = dormandPrince853Integrator0.filterStep(0.0, true, true);
        org.junit.Assert.assertEquals(110.09493, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(110.09493, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-568.6) , (-568.6) , doubleArray0 , doubleArray0);
        graggBulirschStoerIntegrator0.setInitialStepSize(2686.3222029);
        org.junit.Assert.assertEquals(568.6, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(0.0 , 0.0 , 0.0 , 0.0);
        dormandPrince853Integrator0.setInitialStepSize((-844));
        org.junit.Assert.assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator adamsBashforthIntegrator0 = new org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator(8 , (-0.0013990241651590145) , ((double)(8)) , ((double)(8)) , ((double)(8)));
        double double0 = adamsBashforthIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(0.10579316292309308, adamsBashforthIntegrator0.getCurrentSignedStepsize(), 0.01);
    }
}

