package org.apache.commons.math.analysis.solvers;


public class UnivariateRealSolverImpl_ESTest extends org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.defaultFunctionValueAccuracy = 3488.023396366591;
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertEquals(3488.023396366591, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.verifyInterval((-4112.818134), 2925.157443039641);
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        riddersSolver0.setResult(1459.912484845, 1459.912484845, (-1));
        riddersSolver0.checkResultComputed();
        org.junit.Assert.assertEquals((-1), riddersSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.clearResult();
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertEquals(0, bisectionSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.SecantSolver secantSolver0 = new org.apache.commons.math.analysis.solvers.SecantSolver();
        boolean boolean0 = secantSolver0.isSequence(0.0, 1.5, 127.0);
        org.junit.Assert.assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        boolean boolean0 = laguerreSolver0.isBracketing(989.3483768, (-16.012366829252972), expm1Function0);
        org.junit.Assert.assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resultComputed = true;
        bisectionSolver0.getResult();
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        riddersSolver0.setResult(1187.0471, (-410.5638990755), 100);
        double double0 = riddersSolver0.getResult();
        org.junit.Assert.assertEquals(100, riddersSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1187.0471, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        org.junit.Assert.assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
        mullerSolver0.setFunctionValueAccuracy((-1.0));
        double double0 = mullerSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        mullerSolver0.setResult(0.0, 0);
        mullerSolver0.getFunctionValue();
        org.junit.Assert.assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertEquals(0, mullerSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        riddersSolver0.setResult(5.0, 1.0E-15, 2319);
        double double0 = riddersSolver0.getFunctionValue();
        org.junit.Assert.assertEquals(2319, riddersSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        riddersSolver0.verifySequence((-1678.722109642804), 4.0, 1344.048139);
        org.junit.Assert.assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        boolean boolean0 = mullerSolver0.isSequence((-3019.654248089523), 0.0, 0);
        org.junit.Assert.assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.NewtonSolver newtonSolver0 = new org.apache.commons.math.analysis.solvers.NewtonSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        boolean boolean0 = newtonSolver0.isBracketing(4511.686426, 0.0, quinticFunction0);
        org.junit.Assert.assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        brentSolver0.verifyBracketing((-628.1209881679913), 1256.423, sinFunction0);
        org.junit.Assert.assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        boolean boolean0 = laguerreSolver0.isBracketing(1.0, 0.0, quinticFunction0);
        org.junit.Assert.assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.LaguerreSolver laguerreSolver0 = new org.apache.commons.math.analysis.solvers.LaguerreSolver();
        laguerreSolver0.setResult((-862.165), 1);
        double double0 = laguerreSolver0.getResult();
        org.junit.Assert.assertEquals(1, laguerreSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-862.165), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        riddersSolver0.setResult((-1678.722109642804), (-1678.722109642804), (-266));
        double double0 = riddersSolver0.getFunctionValue();
        org.junit.Assert.assertEquals((-266), riddersSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-1678.722109642804), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        mullerSolver0.setFunctionValueAccuracy(0.0);
        double double0 = mullerSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        double double0 = mullerSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }
}

