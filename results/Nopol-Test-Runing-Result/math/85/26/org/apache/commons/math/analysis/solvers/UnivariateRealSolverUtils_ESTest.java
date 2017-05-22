package org.apache.commons.math.analysis.solvers;


public class UnivariateRealSolverUtils_ESTest extends org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0, 1168.2);
        org.junit.Assert.assertEquals(584.1, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        double[] doubleArray0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
        org.junit.Assert.assertArrayEquals(new double[]{ java.lang.Double.NaN , java.lang.Double.NaN }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.0, ((double)(3)), 0.5);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (-174.335444323483), 0.0, (-174.335444323483));
        org.junit.Assert.assertEquals((-171.21679962064374), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.0, 1339.923899399711);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.5, 2767.123830751);
        org.junit.Assert.assertEquals(0.5, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((-1040.850588978707), 0.0);
        org.junit.Assert.assertEquals((-520.4252944893535), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double[] doubleArray0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2891.574685137), (-2891.574685137), (-1464.2172), 2858);
        org.junit.Assert.assertArrayEquals(new double[]{ -2891.574685137 , -2889.574685137 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-697.4313), 0.5, 0.5);
        org.junit.Assert.assertEquals(0.5, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1464.2172), (-1242.19273));
        org.junit.Assert.assertEquals((-1376.0175822723193), double0, 0.01);
    }
}

