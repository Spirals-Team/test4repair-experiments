package org.apache.commons.math3.ode;


public class AbstractIntegrator_ESTest extends org.apache.commons.math3.ode.AbstractIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(1349.50744816806 , 1349.50744816806 , 1414.5423900168223 , 1414.5423900168223);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(1349.50744816806 , 1000.0 , 2275.531292544495);
        double[] doubleArray0 = new double[1];
        dormandPrince54Integrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)), (-3590.4672136602667), doubleArray0, 1000.0, doubleArray0);
        dormandPrince54Integrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)), 2275.531292544495, doubleArray0, 7.105427357601002E-12, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 3124023.2675775317 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator(17.896882516230132);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-5474.0) , (-1989.813044879568) , 0.0);
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)));
        expandableStatefulODE0.setTime((-438.887));
        midpointIntegrator0.integrate(expandableStatefulODE0, (-3158.37));
        org.junit.Assert.assertEquals("midpoint", midpointIntegrator0.getName());
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(1349.50744816806 , 1349.50744816806 , 1414.5423900168223 , 1414.5423900168223);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-2.209492705846306E-7) , 1000.0 , 2275.5312925445);
        double[] doubleArray0 = new double[1];
        dormandPrince54Integrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)), (-3551.5134), doubleArray0, 1000.0, doubleArray0);
        dormandPrince54Integrator0.computeDerivatives(1000.0, doubleArray0, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ -2.209492705846306E-7 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator((-1.0) , (-1.0) , (-1.0) , (-640.0));
        highamHall54Integrator0.setMaxEvaluations(0);
        int int0 = highamHall54Integrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(1349.50744816806 , 1349.50744816806 , 1414.5423900168223 , 1414.5423900168223);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-2.209492705846306E-7) , 1000.0 , 2275.531292544495);
        double[] doubleArray0 = new double[1];
        dormandPrince54Integrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)), (-3551.5134), doubleArray0, 1000.0, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ -0.001005653565786172 }, doubleArray0, 0.01);
        int int0 = dormandPrince54Integrator0.getEvaluations();
        org.junit.Assert.assertEquals(26, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator((-1.26892E-8) , (-1.26892E-8) , doubleArray0 , doubleArray0);
        double double0 = dormandPrince54Integrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(1.26892E-8, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator(738.832057 , 738.832057 , 738.832057 , (-2204.23));
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        org.apache.commons.math3.ode.TestProblem5 testProblem5_1 = testProblem5_0.copy();
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_1)));
        testProblem5_1.n = 16;
        try {
            highamHall54Integrator0.integrate(expandableStatefulODE0, (-2204.23));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((-3048.6791242) , 4094.4291202 , doubleArray0 , doubleArray0);
        graggBulirschStoerIntegrator0.setMaxEvaluations((-1544));
        org.junit.Assert.assertEquals(3533.0724000889527, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(1349.50744816806 , 1349.50744816806 , 1414.5423900168223 , 1414.5423900168223);
        dormandPrince54Integrator0.clearEventHandlers();
        org.junit.Assert.assertEquals(1349.50744816806, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator(0.0);
        threeEighthesIntegrator0.clearStepHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(1349.50744816806 , 1349.50744816806 , 1414.5423900168223 , 1414.5423900168223);
        double[] doubleArray0 = new double[1];
        try {
            dormandPrince54Integrator0.computeDerivatives(1000.0, doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-2247.9609063416) , 2796.5865 , (-1980.7654997273));
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)));
        expandableStatefulODE0.setTime((-1981.577814389454));
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((-1436.51748317) , (-1763.0) , (-1979.4137364783703) , (-3066.2381690881));
        graggBulirschStoerIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), (-2247.9609063416), 2796.5865, (-2806));
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-1979.4137364783703));
        org.junit.Assert.assertEquals(1763.0, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator(23.72858697681999);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-2247.9609063416) , 2796.5865 , (-1980.7654997273));
        org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest stepNormalizerOutputTest0 = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
        org.apache.commons.math3.ode.sampling.StepNormalizerBounds stepNormalizerBounds0 = org.apache.commons.math3.ode.sampling.StepNormalizerBounds.NEITHER;
        org.apache.commons.math3.ode.sampling.StepNormalizer stepNormalizer0 = new org.apache.commons.math3.ode.sampling.StepNormalizer(23.72858697681999 , ((org.apache.commons.math3.ode.sampling.FixedStepHandler)(stepNormalizerOutputTest0)) , stepNormalizerBounds0);
        threeEighthesIntegrator0.addStepHandler(stepNormalizer0);
        threeEighthesIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), 2796.5865, (-2.8589982771), 419);
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)));
        expandableStatefulODE0.setTime((-1981.577814389454));
        threeEighthesIntegrator0.integrate(expandableStatefulODE0, (-1980.7654997273));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator(23.72858697681999);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-2247.9609063416) , 2796.5865 , (-1980.7654997273));
        threeEighthesIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), 2796.5865, (-2.8589982771), 419);
        threeEighthesIntegrator0.getEventHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((-298.23094) , (-1188.5325) , java.lang.Double.NaN , 0.0);
        java.lang.String string0 = graggBulirschStoerIntegrator0.getName();
        org.junit.Assert.assertEquals("Gragg-Bulirsch-Stoer", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator((-1.26892E-8) , (-1.26892E-8) , doubleArray0 , doubleArray0);
        java.util.Collection<org.apache.commons.math3.ode.sampling.StepHandler> collection0 = dormandPrince54Integrator0.getStepHandlers();
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator(0.0);
        double double0 = threeEighthesIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator(java.lang.Double.NaN , java.lang.Double.NaN , java.lang.Double.NaN , java.lang.Double.NaN);
        int int0 = dormandPrince853Integrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator(1349.50744816806 , 1349.50744816806 , 1414.5423900168223 , 1414.5423900168223);
        int int0 = dormandPrince54Integrator0.getEvaluations();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator(2912.96 , 0.0 , 0.0 , (-9.0));
        double double0 = highamHall54Integrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }
}

