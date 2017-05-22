package org.apache.commons.math.analysis.solvers;


public class UnivariateRealSolverUtils_ESTest extends org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((-898.8489), 0.0);
        org.junit.Assert.assertEquals((-449.42445), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.0, 1226.1264525211, 0.5);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2129.61498), 1997.8493969424, 0.0);
        org.junit.Assert.assertEquals(700.5751617505239, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1.0), 0.0, 0.0);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.0, 1897.98211);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-186.588114262), 0.5);
        org.junit.Assert.assertEquals(5.982287371122287E-8, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2505.442), (-0.5127536210996928));
        org.junit.Assert.assertEquals((-2032.6104468492797), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.5, 0.5);
        org.junit.Assert.assertEquals(0.5, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(null)));
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 636.88367981735, 1.5, 2623.9494094, 6);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double[] doubleArray0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.5, 1.5, 1212.80461373, 597);
        org.junit.Assert.assertArrayEquals(new double[]{ 1.5 , 3.5 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double[] doubleArray0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
        org.junit.Assert.assertArrayEquals(new double[]{ java.lang.Double.NaN , java.lang.Double.NaN }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(null)));
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-985.88293291), (-985.88293291), (-1.0));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }
}

