package org.apache.commons.math.analysis.solvers;


public class UnivariateRealSolverImpl_ESTest extends org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        boolean boolean0 = bisectionSolver0.isBracketing((-1185.0503947), (-1185.0503947), univariateRealFunction0);
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        mullerSolver0.setResult(0.49352669998944976, 0.49352669998944976, 1733);
        org.junit.Assert.assertEquals(1733, mullerSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.functionValueAccuracy = 0.0;
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.verifyInterval(0.0, 4.0);
        org.junit.Assert.assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.SecantSolver secantSolver0 = new org.apache.commons.math.analysis.solvers.SecantSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        secantSolver0.verifyBracketing((-3961.45), 1207.369255, sinFunction0);
        org.junit.Assert.assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.clearResult();
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertEquals(0, bisectionSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        boolean boolean0 = brentSolver0.isSequence((-2870.41834899), 1.0, 504.78886221968);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        boolean boolean0 = brentSolver0.isSequence(1.0, 1.0, 1.0);
        org.junit.Assert.assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        boolean boolean0 = riddersSolver0.isBracketing(3.8137362040731713, (-3602.37251439), quinticFunction0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        boolean boolean0 = bisectionSolver0.isBracketing(2565.741576512249, (-1185.0503947), univariateRealFunction0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        riddersSolver0.resultComputed = false;
        riddersSolver0.resultComputed = true;
        riddersSolver0.getResult();
        org.junit.Assert.assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setResult(1.0E-14, 0);
        brentSolver0.getResult();
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setResult((-3602.37251439), 0);
        double double0 = bisectionSolver0.getResult();
        org.junit.Assert.assertEquals(0, bisectionSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertEquals((-3602.37251439), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.functionValueAccuracy = -3602.37251439;
        double double0 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertEquals((-3602.37251439), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resultComputed = true;
        brentSolver0.getFunctionValue();
        org.junit.Assert.assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setResult(3.141592653589793, 2604);
        brentSolver0.functionValue = 4059.868;
        double double0 = brentSolver0.getFunctionValue();
        org.junit.Assert.assertEquals(2604, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(4059.868, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.functionValue = -2522.56195;
        brentSolver0.resultComputed = true;
        double double0 = brentSolver0.getFunctionValue();
        org.junit.Assert.assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
        org.junit.Assert.assertEquals((-2522.56195), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.verifySequence(1.0, 655.437492, 2988.1075585940666);
        org.junit.Assert.assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        mullerSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-209.83867742834565), 1650.0618247797);
        mullerSolver0.checkResultComputed();
        org.junit.Assert.assertEquals(23, mullerSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.MullerSolver mullerSolver0 = new org.apache.commons.math.analysis.solvers.MullerSolver();
        mullerSolver0.setResult(1.0, 0.0, 1738);
        org.junit.Assert.assertEquals(1738, mullerSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RiddersSolver riddersSolver0 = new org.apache.commons.math.analysis.solvers.RiddersSolver();
        riddersSolver0.setFunctionValueAccuracy((-3342.538434));
        org.junit.Assert.assertEquals((-3342.538434), riddersSolver0.getFunctionValueAccuracy(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.SecantSolver secantSolver0 = new org.apache.commons.math.analysis.solvers.SecantSolver();
        double double0 = secantSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }
}

