package org.apache.commons.math.analysis.solvers;


public class UnivariateRealSolverImpl_ESTest extends org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        boolean boolean0 = brentSolver0.isBracketing(2374.3381660309, 2374.3381660309, sinFunction0);
        org.junit.Assert.assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        boolean boolean0 = riddersSolver0.isBracketing(649.05421025622, 0.0, sinFunction0);
        org.junit.Assert.assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        riddersSolver0.setFunctionValueAccuracy(0.0);
        riddersSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setFunctionValueAccuracy((-1940.563807603));
        org.junit.Assert.assertEquals((-1940.563807603), bisectionSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.NewtonSolver newtonSolver0 = new org.apache.commons.math.analysis.solvers.NewtonSolver();
        newtonSolver0.verifySequence((-1659.93), (-236.2149), 1.0);
        org.junit.Assert.assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.NewtonSolver newtonSolver0 = new org.apache.commons.math.analysis.solvers.NewtonSolver();
        newtonSolver0.verifyInterval((-876.372), 0.0);
        org.junit.Assert.assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setResult(0.0, 0.0, (-3733));
        bisectionSolver0.checkResultComputed();
        org.junit.Assert.assertEquals((-3733), bisectionSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.clearResult();
        org.junit.Assert.assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        boolean boolean0 = bisectionSolver0.isSequence(0.0, 0.0, 0.0);
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        boolean boolean0 = mullerSolver0.isBracketing((-392.793), 137.76861256107, quinticFunction0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        riddersSolver0.setResult(1.0E-15, (-1.0), (-100));
        double double0 = riddersSolver0.getResult();
        org.junit.Assert.assertEquals((-100), riddersSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setResult((-1.0), 61, 61);
        double double0 = bisectionSolver0.getResult();
        org.junit.Assert.assertEquals(61, bisectionSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        laguerreSolver0.functionValueAccuracy = -95.493617683;
        double double0 = laguerreSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertEquals((-95.493617683), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resultComputed = true;
        brentSolver0.getFunctionValue();
        org.junit.Assert.assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setResult((-1.0), 61, 61);
        double double0 = bisectionSolver0.getFunctionValue();
        org.junit.Assert.assertEquals(61, bisectionSolver0.getIterationCount());
        org.junit.Assert.assertEquals(61.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setResult((-491.93154), (-1.0), 1);
        double double0 = brentSolver0.getFunctionValue();
        org.junit.Assert.assertEquals(1, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.NewtonSolver newtonSolver0 = new org.apache.commons.math.analysis.solvers.NewtonSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        newtonSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.0E-15, 1230.966802389762);
        org.junit.Assert.assertEquals(2, newtonSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        boolean boolean0 = bisectionSolver0.isSequence((-3733), (-950.3902388903703), 0.0);
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.SecantSolver secantSolver0 = new org.apache.commons.math.analysis.solvers.SecantSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        secantSolver0.verifyBracketing((-700.726135948252), 1.0, univariateRealFunction0);
        org.junit.Assert.assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = mullerSolver0.solve(univariateRealFunction0, 0.0, 2063.4);
        org.junit.Assert.assertEquals(12, mullerSolver0.getIterationCount());
        org.junit.Assert.assertEquals(2018.473279931442, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
        boolean boolean0 = laguerreSolver0.isBracketing(0, 0, univariateRealFunction0);
        org.junit.Assert.assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        double[] doubleArray0 = new double[5];
        laguerreSolver0.solveAll(doubleArray0, 0.0);
        laguerreSolver0.getResult();
        org.junit.Assert.assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        laguerreSolver0.setResult((-236.2149), 0);
        org.junit.Assert.assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertEquals(0, laguerreSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        laguerreSolver0.setFunctionValueAccuracy(0.0);
        double double0 = laguerreSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        double double0 = laguerreSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }
}

