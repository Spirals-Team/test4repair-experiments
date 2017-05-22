package org.apache.commons.math.analysis.solvers;


public class UnivariateRealSolverImpl_ESTest extends org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.NewtonSolver newtonSolver0 = new org.apache.commons.math.analysis.solvers.NewtonSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        boolean boolean0 = newtonSolver0.isBracketing((-2.1013490038137945), (-2.1013490038137945), sinFunction0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        boolean boolean0 = bisectionSolver0.isBracketing(0.0, 2692.85, quinticFunction0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setFunctionValueAccuracy(2692.85);
        org.junit.Assert.assertEquals(2692.85, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.verifySequence((-3130.6598470633367), (-697.3730030547), (-1.0));
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.SecantSolver secantSolver0 = new org.apache.commons.math.analysis.solvers.SecantSolver();
        secantSolver0.verifyInterval((-1718.232190704825), (-1614.365134));
        org.junit.Assert.assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        laguerreSolver0.verifyBracketing((-1.0), 2705.02971426, expm1Function0);
        org.junit.Assert.assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        laguerreSolver0.setResult((-237.15251515), (-3307));
        laguerreSolver0.checkResultComputed();
        org.junit.Assert.assertEquals((-3307), laguerreSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        riddersSolver0.clearResult();
        org.junit.Assert.assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertEquals(0, riddersSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        boolean boolean0 = bisectionSolver0.isSequence(0.0, (-2170), 0.0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.NewtonSolver newtonSolver0 = new org.apache.commons.math.analysis.solvers.NewtonSolver();
        newtonSolver0.resultComputed = true;
        newtonSolver0.getResult();
        org.junit.Assert.assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        mullerSolver0.setResult(1.0, 1.0E-15, 2874);
        double double0 = mullerSolver0.getResult();
        org.junit.Assert.assertEquals(2874, mullerSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        laguerreSolver0.setResult((-111.4271), (-111.4271), (-1611));
        double double0 = laguerreSolver0.getResult();
        org.junit.Assert.assertEquals((-1611), laguerreSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-111.4271), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setResult(2.0, 2.0, (-2768));
        double double0 = brentSolver0.getFunctionValue();
        org.junit.Assert.assertEquals((-2768), brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(2.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.SecantSolver secantSolver0 = new org.apache.commons.math.analysis.solvers.SecantSolver();
        secantSolver0.setResult(1205.932315859267, 0);
        secantSolver0.functionValue = -2423.606362;
        double double0 = secantSolver0.getFunctionValue();
        org.junit.Assert.assertEquals(0, secantSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-2423.606362), double0, 0.01);
        org.junit.Assert.assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        boolean boolean0 = riddersSolver0.isSequence((-2058.92198175818), 0.0, 1.5);
        org.junit.Assert.assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.SecantSolver secantSolver0 = new org.apache.commons.math.analysis.solvers.SecantSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        boolean boolean0 = secantSolver0.isBracketing(212.0, (-476.2933336148), sinFunction0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        boolean boolean0 = riddersSolver0.isBracketing(2115.1640064710746, 0.0, monitoredFunction0);
        org.junit.Assert.assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.NewtonSolver newtonSolver0 = new org.apache.commons.math.analysis.solvers.NewtonSolver();
        boolean boolean0 = newtonSolver0.isBracketing(1939.180291, 0.0, sinFunction0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        mullerSolver0.solve2(univariateRealFunction0, 0.0, 58.394709);
        mullerSolver0.getFunctionValue();
        org.junit.Assert.assertEquals(11, mullerSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        laguerreSolver0.setFunctionValueAccuracy((-476.2933336148));
        double double0 = laguerreSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertEquals((-476.2933336148), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        double double0 = laguerreSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }
}

