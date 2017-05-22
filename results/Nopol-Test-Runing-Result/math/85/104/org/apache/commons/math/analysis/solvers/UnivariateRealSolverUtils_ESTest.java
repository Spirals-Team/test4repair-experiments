package org.apache.commons.math.analysis.solvers;


public class UnivariateRealSolverUtils_ESTest extends org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.0, 3828.675492978772, 3828.675492978772);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0, 0.5, 0.0);
        org.junit.Assert.assertEquals(0.271956127951169, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2383.2991093224578), 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (-1.0), 625.9287);
        org.junit.Assert.assertEquals(14.13716694104105, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (-2473.3205179451), 912.440648001816);
        org.junit.Assert.assertEquals((-642.4556976591497), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((-1610.71091589), (-1610.71091589));
        org.junit.Assert.assertEquals((-1610.71091589), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double[] doubleArray0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
        org.junit.Assert.assertArrayEquals(new double[]{ java.lang.Double.NaN , java.lang.Double.NaN }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(null)));
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.0, 0.5);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(null)));
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-5.939951299999848), (-1560.19220046185), (-5.939951299999848), 46);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(null)));
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-1.0), ((double)(-2136)), (-1.0));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double[] doubleArray0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1.0), (-2202.009424), (-1.0), 255);
        org.junit.Assert.assertArrayEquals(new double[]{ -4.0 , -1.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2355.05072), (-1270.326134038275), (-1.0));
        org.junit.Assert.assertEquals((-1862.9644435787477), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double double0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(896.261949005, 255);
        org.junit.Assert.assertEquals(575.6309745025001, double0, 0.01);
    }
}

