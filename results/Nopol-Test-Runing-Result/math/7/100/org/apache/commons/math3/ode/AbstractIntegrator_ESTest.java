package org.apache.commons.math3.ode;


public class AbstractIntegrator_ESTest extends org.apache.commons.math3.ode.AbstractIntegrator_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = -106.0;
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator((-106.0) , (-106.0) , doubleArray0 , doubleArray0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(0.0 , 1063.5 , (-106.0));
        dormandPrince54Integrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)), (-1596.2), doubleArray0, 650.9630102, doubleArray0);
        dormandPrince54Integrator0.computeDerivatives((-106.0), doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = -106.0;
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator((-106.0) , 82.728429 , doubleArray0 , doubleArray0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(0.0 , 1063.5 , (-5096.2329894));
        double double0 = dormandPrince54Integrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)), (-5096.2329894), doubleArray0, (-2314.462350229758), doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ -106.0 }, doubleArray0, 0.01);
        org.junit.Assert.assertEquals((-2314.462350229758), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(0.6353566646575928 , 0.6353566646575928 , 0.6353566646575928 , 0.6353566646575928);
        graggBulirschStoerIntegrator0.setMaxEvaluations(0);
        int int0 = graggBulirschStoerIntegrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator((-116.9229));
        org.apache.commons.math3.ode.TestProblem5 testProblem5_0 = new org.apache.commons.math3.ode.TestProblem5();
        midpointIntegrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(testProblem5_0)), 4045.02379251, doubleArray0, ((double)(3057)), doubleArray0);
        org.junit.Assert.assertEquals(18, testProblem5_0.getCalls());
        int int0 = midpointIntegrator0.getEvaluations();
        org.junit.Assert.assertEquals(18, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator((-0.0) , (-0.0) , doubleArray0 , doubleArray0);
        double double0 = dormandPrince853Integrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator highamHall54Integrator0 = new org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator((-31.139403219565178) , (-1247.1179) , (-901.3823751705721) , (-1247.1179));
        highamHall54Integrator0.setMaxEvaluations((-452));
        org.junit.Assert.assertEquals(197.06472832660177, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator threeEighthesIntegrator0 = new org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator(0.0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(0.0 , (-9.194632392478356) , 3992.87184005378);
        org.apache.commons.math3.analysis.solvers.MullerSolver2 mullerSolver2_0 = new org.apache.commons.math3.analysis.solvers.MullerSolver2(1000.0);
        threeEighthesIntegrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), (-9.194632392478356), (-1430.96), 0, ((org.apache.commons.math3.analysis.solvers.UnivariateSolver)(mullerSolver2_0)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator((-106.0) , (-106.0) , doubleArray0 , doubleArray0);
        try {
            dormandPrince54Integrator0.computeDerivatives((-106.0), doubleArray0, doubleArray0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(436.6502715 , 436.6502715 , 436.6502715 , 436.6502715);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(5031.869697793352 , 0.0 , 436.6502715);
        org.apache.commons.math3.ode.ExpandableStatefulODE expandableStatefulODE0 = new org.apache.commons.math3.ode.ExpandableStatefulODE(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)));
        expandableStatefulODE0.setTime(5031.869697793352);
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1034.5);
        org.junit.Assert.assertEquals(1034.5, expandableStatefulODE0.getTime(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = -106.0;
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator((-106.0) , 82.728429 , doubleArray0 , doubleArray0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-0.08041192207330436) , 1063.5 , 82.728429);
        dormandPrince54Integrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), 643.3311350726229, 82.728429, java.lang.Integer.MAX_VALUE);
        org.apache.commons.math3.ode.sampling.DummyStepHandler dummyStepHandler0 = org.apache.commons.math3.ode.sampling.DummyStepHandler.getInstance();
        dormandPrince54Integrator0.addStepHandler(dummyStepHandler0);
        double double0 = dormandPrince54Integrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)), (-1596.2), doubleArray0, 643.3311350726229, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 577874.4619832716 }, doubleArray0, 0.01);
        org.junit.Assert.assertEquals(643.3311350726229, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator((-106.0) , (-106.0) , doubleArray0 , doubleArray0);
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem(0.0 , 1063.5 , (-106.0));
        dormandPrince54Integrator0.addEventHandler(((org.apache.commons.math3.ode.events.EventHandler)(stepProblem0)), 650.9630102, (-106.0), java.lang.Integer.MAX_VALUE);
        java.util.Collection<org.apache.commons.math3.ode.events.EventHandler> collection0 = dormandPrince54Integrator0.getEventHandlers();
        org.junit.Assert.assertNotNull(collection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator((-116.9229));
        midpointIntegrator0.clearEventHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator(((double)(0)) , ((double)(0)) , ((double)(0)) , 1036.33768491);
        java.lang.String string0 = graggBulirschStoerIntegrator0.getName();
        org.junit.Assert.assertEquals("Gragg-Bulirsch-Stoer", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.EulerIntegrator eulerIntegrator0 = new org.apache.commons.math3.ode.nonstiff.EulerIntegrator((-1560.6));
        eulerIntegrator0.getStepHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator((-116.9229));
        double double0 = midpointIntegrator0.getCurrentStepStart();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator((-106.0) , (-106.0) , (-106.0) , (-106.0));
        int int0 = dormandPrince54Integrator0.getMaxEvaluations();
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator((-116.9229));
        midpointIntegrator0.getEvaluations();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator dormandPrince853Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator((-106.0) , 82.728429 , (-106.0) , 0.0);
        double double0 = dormandPrince853Integrator0.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals(93.64407869160762, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math3.ode.nonstiff.MidpointIntegrator midpointIntegrator0 = new org.apache.commons.math3.ode.nonstiff.MidpointIntegrator((-116.9229));
        midpointIntegrator0.clearStepHandlers();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator dormandPrince54Integrator0 = new org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator((-106.0) , (-106.0) , (-106.0) , (-106.0));
        org.apache.commons.math3.ode.nonstiff.StepProblem stepProblem0 = new org.apache.commons.math3.ode.nonstiff.StepProblem((-0.08041192207330436) , 1063.5 , (-106.0));
        dormandPrince54Integrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)), 2606.0, doubleArray0, 0.0, doubleArray0);
        double double0 = dormandPrince54Integrator0.integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)(stepProblem0)), (-1596.2), doubleArray0, 633.6003775948448, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 30.25093472084988 }, doubleArray0, 0.01);
        org.junit.Assert.assertEquals(633.6003775948448, double0, 0.01);
    }
}

