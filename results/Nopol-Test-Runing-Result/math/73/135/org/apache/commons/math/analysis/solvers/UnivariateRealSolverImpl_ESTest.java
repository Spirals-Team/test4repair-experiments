package org.apache.commons.math.analysis.solvers;


public class UnivariateRealSolverImpl_ESTest extends org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        boolean boolean0 = laguerreSolver0.isBracketing((-1567.4089732241232), (-1567.4089732241232), sinFunction0);
        org.junit.Assert.assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.NewtonSolver newtonSolver0 = new org.apache.commons.math.analysis.solvers.NewtonSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        boolean boolean0 = newtonSolver0.isBracketing(0.0, 0.0, sinFunction0);
        org.junit.Assert.assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setResult((-1.0), 1.0E-15, 207);
        org.junit.Assert.assertEquals(207, bisectionSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        laguerreSolver0.verifySequence((-537.2813009), (-0.8414709848078965), 912.0408806116155);
        org.junit.Assert.assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.SecantSolver secantSolver0 = new org.apache.commons.math.analysis.solvers.SecantSolver();
        secantSolver0.verifyInterval(java.lang.Double.NaN, 2115.8);
        org.junit.Assert.assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resultComputed = true;
        bisectionSolver0.checkResultComputed();
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        mullerSolver0.clearResult();
        org.junit.Assert.assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertEquals(0, mullerSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        boolean boolean0 = riddersSolver0.isSequence(0.0, 497.21475, 558.2057971095136);
        org.junit.Assert.assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.SecantSolver secantSolver0 = new org.apache.commons.math.analysis.solvers.SecantSolver();
        secantSolver0.resultComputed = true;
        secantSolver0.getResult();
        org.junit.Assert.assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        riddersSolver0.setResult(988.6990912, 102);
        riddersSolver0.result = -614.0;
        double double0 = riddersSolver0.getResult();
        org.junit.Assert.assertEquals(102, riddersSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-614.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setFunctionValueAccuracy((-2852.6142722232));
        double double0 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertEquals((-2852.6142722232), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        mullerSolver0.setResult(0.0, 1295);
        mullerSolver0.getFunctionValue();
        org.junit.Assert.assertEquals(1295, mullerSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resultComputed = true;
        bisectionSolver0.functionValue = 0.95;
        bisectionSolver0.functionValue = -2717.445890682;
        double double0 = bisectionSolver0.getFunctionValue();
        org.junit.Assert.assertEquals((-2717.445890682), double0, 0.01);
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        boolean boolean0 = bisectionSolver0.isSequence((-2717.445890682), 3.141592653589793, (-2717.445890682));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        boolean boolean0 = laguerreSolver0.isBracketing((-4.001419940638257E-6), 1.0E-15, expm1Function0);
        org.junit.Assert.assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.SecantSolver secantSolver0 = new org.apache.commons.math.analysis.solvers.SecantSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        secantSolver0.verifyBracketing((-2510.6830814352697), (-1.0), sinFunction0);
        org.junit.Assert.assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        boolean boolean0 = brentSolver0.isBracketing((-3857.0264057), 1.0, quinticFunction0);
        org.junit.Assert.assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1981.0), 1.5, 1.0);
        double double0 = brentSolver0.getResult();
        org.junit.Assert.assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        riddersSolver0.setResult(1883.744963724149, 1.0E-6, 3137);
        double double0 = riddersSolver0.getFunctionValue();
        org.junit.Assert.assertEquals(3137, riddersSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-6, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        riddersSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        mullerSolver0.setFunctionValueAccuracy(0.0);
        mullerSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double0 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }
}

