package org.apache.commons.math.ode.nonstiff;


public class AdaptiveStepsizeIntegrator_ESTest extends org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(1.2 , 1.2 , doubleArray0 , doubleArray0);
        graggBulirschStoerIntegrator0.setInitialStepSize(1.2);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem((-253.3630424) , (-5228.225232493964) , 3098.6);
        double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, false, 1263, doubleArray0, 1.2, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(1.2, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals((-1.2), double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(0.0 , 1117.1093 , doubleArray0 , doubleArray0);
        dormandPrince853Integrator0.setInitialStepSize(0.0);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        try {
            dormandPrince853Integrator0.initializeStep(testProblem5_0, true, 3, doubleArray0, java.lang.Double.NaN, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.0 , 0.0 , 0.0 , 65.2613558);
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        double[] doubleArray0 = new double[2];
        graggBulirschStoerIntegrator0.sanityChecks(testProblem5_0, (-0.27), doubleArray0, 65.2613558, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(15.697238121770845 , 0.0 , doubleArray0 , doubleArray0);
        highamHall54Integrator0.resetInternalState();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(15.697238121770845, highamHall54Integrator0.getMinStep(), 0.01);
        org.junit.Assert.assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.0 , (-1.0) , 0.0 , 0.0);
        double double0 = highamHall54Integrator0.getMinStep();
        org.junit.Assert.assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(1.0, highamHall54Integrator0.getMaxStep(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-2834.545017426537) , 0.0 , doubleArray0 , doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.getMinStep();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals((-0.0), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals((-2834.545017426537), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(0.0 , 0.0 , doubleArray0 , doubleArray0);
        double double0 = highamHall54Integrator0.getMaxStep();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(0.0 , (-286.112336401) , doubleArray0 , doubleArray0);
        double double0 = dormandPrince853Integrator0.getMaxStep();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals((-286.112336401), double0, 0.01);
        org.junit.Assert.assertEquals((-0.0), dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(0.0 , 0.0 , 0.0 , 0.0);
        double double0 = dormandPrince853Integrator0.filterStep(0.0, false, false);
        org.junit.Assert.assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(227.50553867820582 , 227.50553867820582 , 0.0 , 0.0);
        double double0 = graggBulirschStoerIntegrator0.filterStep(0.075, true, true);
        org.junit.Assert.assertEquals(227.50553867820582, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(227.50553867820582, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(5.746280211439194 , 3457480.0 , 5.746280211439194 , 816.8614057);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem((-0.84375) , (-0.84375) , (-0.84375));
        double[] doubleArray0 = new double[1];
        graggBulirschStoerIntegrator0.integrate(stepProblem0, 5.746280211439194, doubleArray0, 378.57101686, doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, false, (-433), doubleArray0, (-3457480.0), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(58.78117044785745, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals((-5.746280211439194), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(5.746280211439194 , 3457480.0 , 5.746280211439194 , 816.5335546814273);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem((-0.84375) , 0.075 , 0.075);
        double[] doubleArray0 = new double[1];
        graggBulirschStoerIntegrator0.integrate(stepProblem0, 5.746280211439194, doubleArray0, 378.57101686, doubleArray0);
        double[] doubleArray1 = new double[1];
        double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, true, (-433), doubleArray1, (-3457480.0), doubleArray1, doubleArray1, doubleArray1, doubleArray0);
        org.junit.Assert.assertEquals(58.78117044785745, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -859.6235826837602;
        doubleArray0[1] = 453.3300268885;
        doubleArray0[2] = ((double)(1550));
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator((-903.466337617871) , (-2063.475437580507) , doubleArray0 , doubleArray0);
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math.ode.TestProblem5();
        try {
            dormandPrince54Integrator0.initializeStep(testProblem5_0, false, 1550, doubleArray0, 1613.0, doubleArray0, doubleArray1, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(737.493006452546 , 737.493006452546 , doubleArray0 , doubleArray0);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(0.0 , java.lang.Double.NaN , 0.0);
        try {
            dormandPrince54Integrator0.initializeStep(stepProblem0, false, (-2146630729), doubleArray0, 2198.563432769732, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-5.685526961588504) , (-1543.20858036) , (-1543.20858036) , (-5.685526961588504));
        double double0 = graggBulirschStoerIntegrator0.getMinStep();
        org.junit.Assert.assertEquals(5.685526961588504, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(93.6693866265361, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-5.685526961588504) , (-1543.20858036) , (-1543.20858036) , (-5.685526961588504));
        double double0 = graggBulirschStoerIntegrator0.getMaxStep();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(1543.20858036, double0, 0.01);
        org.junit.Assert.assertEquals(93.6693866265361, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(2333.55592 , 100.0 , doubleArray0 , doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.filterStep(100.0, false, true);
        org.junit.Assert.assertEquals(483.06893089910056, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals((-100.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.2527665552160898 , 0.2527665552160898 , doubleArray0 , doubleArray0);
        graggBulirschStoerIntegrator0.setInitialStepSize(0.2527665552160898);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem((-31.139403219565178) , (-5228.225232493964) , 0.0);
        double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, true, 1263, doubleArray0, 0.2527665552160898, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.2527665552160898, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(0.2527665552160898, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(1.2 , (-253.3630424) , 1.2 , (-253.3630424));
        graggBulirschStoerIntegrator0.setInitialStepSize(1.2);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem((-253.3630424) , (-5228.225232493964) , 3098.6);
        double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, false, 1263, doubleArray0, 1.2, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals((-1.2), double0, 0.01);
        org.junit.Assert.assertEquals(17.436618103290556, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(15.697238121770845 , 0.0 , doubleArray0 , doubleArray0);
        highamHall54Integrator0.setInitialStepSize(280.74705188);
        org.junit.Assert.assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(15.697238121770845, highamHall54Integrator0.getMinStep(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math.ode.nonstiff.HighamHall54Integrator(15.697238121770845 , 0.0 , doubleArray0 , doubleArray0);
        highamHall54Integrator0.setInitialStepSize(0.0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(15.697238121770845, highamHall54Integrator0.getMinStep(), 0.01);
        org.junit.Assert.assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.0 , (-3048.7227448) , 0.075 , (-565.64));
        double double0 = graggBulirschStoerIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(3048.7227448, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
        org.junit.Assert.assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.0 , (-3048.7227448) , 0.075 , (-565.64));
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(0.0 , 0.0 , 0.0);
        double[] doubleArray0 = new double[1];
        graggBulirschStoerIntegrator0.integrate(stepProblem0, 1716.4456244786709, doubleArray0, 360.0, doubleArray0);
        org.junit.Assert.assertEquals((-1093.2307347018955), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }
}

