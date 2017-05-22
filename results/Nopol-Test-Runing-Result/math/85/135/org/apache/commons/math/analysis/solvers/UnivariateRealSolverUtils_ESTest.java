package org.apache.commons.math.analysis.solvers;


public class UnivariateRealSolverUtils_ESTest extends org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0, 835.80382);
        org.junit.Assert.assertEquals(417.90191, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.5, 1282.911905358, 0.5);
        org.junit.Assert.assertEquals(0.5, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (-3198.6), 0.0, (-3198.6));
        org.junit.Assert.assertEquals((-3198.6), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0, 2724.307939);
        org.junit.Assert.assertEquals(2238.384765681401, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (-933.7), 2435.8443625879127);
        org.junit.Assert.assertEquals((-933.7), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((-14.369882797229689), (-14.369882797229689));
        org.junit.Assert.assertEquals((-14.369882797229689), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double[] doubleArray0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 1401.900638504, (-1.0), ((double)(1981316427)), 1981316427);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.9006385039999714 , 2802.900638504 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-3198.6), 0.0, (-3198.6));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-3198.6), 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double[] doubleArray0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), java.lang.Double.NaN, 0.0, java.lang.Double.NaN);
        org.junit.Assert.assertArrayEquals(new double[]{ java.lang.Double.NaN , java.lang.Double.NaN }, doubleArray0, 0.01);
    }
}

