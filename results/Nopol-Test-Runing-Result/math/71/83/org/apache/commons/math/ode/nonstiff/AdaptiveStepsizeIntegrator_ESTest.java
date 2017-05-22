package org.apache.commons.math.ode.nonstiff;


public class AdaptiveStepsizeIntegrator_ESTest extends org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator((-2999.8029418) , 1106.963925961 , doubleArray0 , doubleArray0);
        dormandPrince54Integrator0.setInitialStepSize(0.0);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(4.69493693930736 , 1106.963925961 , 1106.963925961);
        try {
            dormandPrince54Integrator0.initializeStep(stepProblem0, true, 1807, doubleArray0, 1807, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(392.986511581 , 392.986511581 , 0.0);
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(259.864 , 392.986511581 , doubleArray0 , doubleArray0);
        double[] doubleArray1 = new double[1];
        dormandPrince853Integrator0.sanityChecks(stepProblem0, 0.00219116250796893, doubleArray0, 1.0E-12, doubleArray1);
        org.junit.Assert.assertEquals(319.5669677008013, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(1853.0 , 0.0 , 0.0 , 942.65792473581);
        graggBulirschStoerIntegrator0.resetInternalState();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(1853.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(392.986511581 , 392.986511581 , 0.0);
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 392.986511581;
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(392.986511581 , 392.986511581 , doubleArray0 , doubleArray0);
        dormandPrince853Integrator0.integrate(stepProblem0, 1.0E-6, doubleArray0, 0.0, doubleArray0);
        org.junit.Assert.assertEquals(26, dormandPrince853Integrator0.getEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(392.986511581 , 392.986511581 , 0.0);
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 392.986511581;
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(259.864 , 392.986511581 , doubleArray0 , doubleArray0);
        dormandPrince853Integrator0.integrate(stepProblem0, 1.0E-6, doubleArray0, 259.864, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 102516.03296407947 }, doubleArray0, 0.01);
        org.junit.Assert.assertEquals(319.5669677008013, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(0.0 , 0.0 , doubleArray0 , doubleArray0);
        double double0 = dormandPrince853Integrator0.getMinStep();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(1.35 , (-944.9) , doubleArray0 , doubleArray0);
        double double0 = dormandPrince853Integrator0.getMinStep();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(1.35, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals((-944.9), dormandPrince853Integrator0.getMaxStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(2517.75558972426 , 2517.75558972426 , 0.0 , 0.0);
        double double0 = graggBulirschStoerIntegrator0.getMaxStep();
        org.junit.Assert.assertEquals(2517.75558972426, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(2517.75558972426, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(0.0 , (-887.4) , doubleArray0 , doubleArray0);
        double double0 = dormandPrince54Integrator0.getMaxStep();
        org.junit.Assert.assertEquals((-887.4), double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals((-0.0), dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(1360.537905203 , 0.0 , 3729.714233063614 , 15.0);
        double double0 = dormandPrince54Integrator0.filterStep(15.0, true, true);
        org.junit.Assert.assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(1360.537905203, dormandPrince54Integrator0.getMinStep(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(2545.794733194552 , 2545.794733194552 , 1632.448116452 , 1632.448116452);
        double double0 = graggBulirschStoerIntegrator0.filterStep(2545.794733194552, true, true);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(2545.794733194552, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(2545.794733194552, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((-0.18980075407240762) , (-0.2908093278463649) , doubleArray0 , doubleArray0);
        double double0 = graggBulirschStoerIntegrator0.filterStep(1651.0, false, true);
        org.junit.Assert.assertEquals((-0.2908093278463649), double0, 0.01);
        org.junit.Assert.assertEquals(0.23493792736918842, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(392.986511581 , 392.986511581 , 0.0);
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 392.986511581;
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(259.864 , 392.986511581 , doubleArray0 , doubleArray0);
        dormandPrince853Integrator0.integrate(stepProblem0, 1.0E-6, doubleArray0, (-3580.524059153213), doubleArray0);
        double double0 = dormandPrince853Integrator0.initializeStep(stepProblem0, true, 1, doubleArray0, 1.0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(135, dormandPrince853Integrator0.getEvaluations());
        org.junit.Assert.assertEquals(259.864, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(392.986511581 , 392.986511581 , 0.0);
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 392.986511581;
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(0.0 , 392.986511581 , doubleArray0 , doubleArray0);
        dormandPrince853Integrator0.integrate(stepProblem0, 1.0E-6, doubleArray0, (-3580.524059153213), doubleArray0);
        double double0 = dormandPrince853Integrator0.initializeStep(stepProblem0, false, (-1520), doubleArray0, 29.8402934266605, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(159, dormandPrince853Integrator0.getEvaluations());
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(392.986511581 , 392.986511581 , 0.0);
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 392.986511581;
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(259.864 , 392.986511581 , doubleArray0 , doubleArray0);
        double[] doubleArray1 = new double[6];
        try {
            dormandPrince853Integrator0.initializeStep(stepProblem0, false, (-2146766056), doubleArray0, (-3670.578668), doubleArray0, doubleArray1, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator((-1231.6587355225404) , (-1231.6587355225404) , doubleArray0 , doubleArray0);
        double double0 = dormandPrince54Integrator0.getMinStep();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals((-1231.6587355225404), double0, 0.01);
        org.junit.Assert.assertEquals(1231.6587355225404, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(1360.537905203 , 0.0 , 3729.714233063614 , 15.0);
        double double0 = dormandPrince54Integrator0.getMaxStep();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(1360.537905203, dormandPrince54Integrator0.getMinStep(), 0.01);
        org.junit.Assert.assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(392.986511581 , 392.986511581 , 0.0);
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 392.986511581;
        org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator(2573.3614875463427 , 392.986511581 , doubleArray0 , doubleArray0);
        dormandPrince853Integrator0.integrate(stepProblem0, 1.0E-6, doubleArray0, (-3580.524059153213), doubleArray0);
        double double0 = dormandPrince853Integrator0.initializeStep(stepProblem0, false, (-1520), doubleArray0, 29.8402934266605, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(135, dormandPrince853Integrator0.getEvaluations());
        org.junit.Assert.assertEquals((-392.986511581), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator(0.0 , 0.0 , 0.0 , 0.0);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(0.0 , (-1473.795201515) , 0.01);
        double[] doubleArray0 = new double[0];
        try {
            graggBulirschStoerIntegrator0.initializeStep(stepProblem0, false, 0, doubleArray0, 0.01, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator((-2999.8029418) , 1133.733794140829 , doubleArray0 , doubleArray0);
        dormandPrince54Integrator0.setInitialStepSize(0.001);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(4.69493693930736 , 1133.733794140829 , 1133.733794140829);
        double double0 = dormandPrince54Integrator0.initializeStep(stepProblem0, true, 1807, doubleArray0, 1807, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.001, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(1133.733794140829, dormandPrince54Integrator0.getMaxStep(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals((-2999.8029418), dormandPrince54Integrator0.getMinStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(0.225 , 0.225 , 452.1879487692 , 1817.55);
        org.apache.commons.math.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math.ode.nonstiff.StepProblem(1969.719 , 1969.719 , 452.1879487692);
        double[] doubleArray0 = new double[3];
        dormandPrince54Integrator0.setInitialStepSize(0.225);
        double double0 = dormandPrince54Integrator0.initializeStep(stepProblem0, false, (-1888), doubleArray0, (-1888), doubleArray0, doubleArray0, ((double[])(null)), ((double[])(null)));
        org.junit.Assert.assertEquals(0.225, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals((-0.225), double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(73.0 , (-1.1) , (-1.1) , (-1.1));
        dormandPrince54Integrator0.setInitialStepSize(73.0);
        org.junit.Assert.assertEquals(8.961026726887942, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator(0.225 , 0.225 , 452.1879487692 , 1817.55);
        double double0 = dormandPrince54Integrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(0.225, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator((-1815.78045302) , (-2249.1842035589093) , (-2249.1842035589093) , (-1815.78045302));
        dormandPrince54Integrator0.setInitialStepSize((-1815.78045302));
        org.junit.Assert.assertEquals(2020.8970067926828, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
    }
}

