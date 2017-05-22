package org.apache.commons.math.analysis.solvers;


public class UnivariateRealSolverUtils_ESTest extends org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.5, 864.8, (-809.3692876348234));
        org.junit.Assert.assertEquals(493.23004661359755, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-70.3080159), 2707.663039657, 2707.663039657);
        org.junit.Assert.assertEquals((-70.3080159), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 1.0, 2609.3337822468);
        org.junit.Assert.assertEquals(2609.0926988063234, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-147.99864037836), ((double)(1)));
        org.junit.Assert.assertEquals((-1.7695733256538684E-7), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((-29.89398006284281), (-29.89398006284281));
        org.junit.Assert.assertEquals((-29.89398006284281), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double[] doubleArray0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 220.98, 5261);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 2.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double[] doubleArray0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), java.lang.Double.NaN, java.lang.Double.NaN, (-8.152762563349995));
        org.junit.Assert.assertArrayEquals(new double[]{ java.lang.Double.NaN , java.lang.Double.NaN }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), 0.0, 1.0, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((-1.0), 647.1402269351);
        org.junit.Assert.assertEquals(323.07011346755, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-1.0), 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }
}

