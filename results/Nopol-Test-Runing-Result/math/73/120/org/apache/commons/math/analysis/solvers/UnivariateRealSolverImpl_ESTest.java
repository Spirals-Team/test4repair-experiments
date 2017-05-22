package org.apache.commons.math.analysis.solvers;


public class UnivariateRealSolverImpl_ESTest extends org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        boolean boolean0 = bisectionSolver0.isSequence((-637.9319), (-637.9319), (-637.9319));
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        boolean boolean0 = mullerSolver0.isBracketing(0.0, 0.0, quinticFunction0);
        org.junit.Assert.assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        riddersSolver0.setFunctionValueAccuracy((-4624.1026424227));
        org.junit.Assert.assertEquals((-4624.1026424227), riddersSolver0.getFunctionValueAccuracy(), 0.01);
        riddersSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.verifyInterval((-202.577877), 0.0);
        org.junit.Assert.assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        mullerSolver0.setResult(1782.734, 0.0, 0);
        mullerSolver0.checkResultComputed();
        org.junit.Assert.assertEquals(0, mullerSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.clearResult();
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        double[] doubleArray0 = new double[2];
        laguerreSolver0.solveAll(doubleArray0, 0.0);
        laguerreSolver0.getResult();
        org.junit.Assert.assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setResult(1560, (-288));
        double double0 = brentSolver0.getResult();
        org.junit.Assert.assertEquals((-288), brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1560.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        mullerSolver0.setResult((-1.0), (-1.0), 0);
        double double0 = mullerSolver0.getResult();
        org.junit.Assert.assertEquals(0, mullerSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
        org.junit.Assert.assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        laguerreSolver0.functionValueAccuracy = -6.066559136274256;
        double double0 = laguerreSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertEquals((-6.066559136274256), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        mullerSolver0.resultComputed = true;
        mullerSolver0.getFunctionValue();
        org.junit.Assert.assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        riddersSolver0.setResult((-1574.47982331478), (-1899.863), 2142743693);
        double double0 = riddersSolver0.getFunctionValue();
        org.junit.Assert.assertEquals(2142743693, riddersSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-1899.863), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        laguerreSolver0.verifySequence(0.0707372016677029, 813.0, 1830.9969099971497);
        org.junit.Assert.assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        boolean boolean0 = laguerreSolver0.isSequence((-291.6627004714158), (-147.7813653), 3004.3776556625);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        boolean boolean0 = laguerreSolver0.isBracketing((-291.6627004714158), (-291.6627004714158), sinFunction0);
        org.junit.Assert.assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        boolean boolean0 = mullerSolver0.isBracketing(1.5, 749.67816254, univariateRealFunction0);
        org.junit.Assert.assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        boolean boolean0 = bisectionSolver0.isBracketing(24.04702527189903, 0.0, quinticFunction0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        bisectionSolver0.verifyBracketing((-987.4415028077368), 10.0, quinticFunction0);
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.SecantSolver secantSolver0 = new org.apache.commons.math.analysis.solvers.SecantSolver();
        secantSolver0.setResult(2722.190931620958, 2731.414280919806, java.lang.Integer.MIN_VALUE);
        double double0 = secantSolver0.getFunctionValue();
        org.junit.Assert.assertEquals(-2147483648, secantSolver0.getIterationCount());
        org.junit.Assert.assertEquals(2731.414280919806, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.NewtonSolver newtonSolver0 = new org.apache.commons.math.analysis.solvers.NewtonSolver();
        newtonSolver0.setFunctionValueAccuracy(0.0);
        double double0 = newtonSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.NewtonSolver newtonSolver0 = new org.apache.commons.math.analysis.solvers.NewtonSolver();
        double double0 = newtonSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }
}

