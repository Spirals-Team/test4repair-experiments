package org.apache.commons.math.analysis.solvers;


public class BrentSolver_ESTest extends org.apache.commons.math.analysis.solvers.BrentSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1817.985024726), 1.0E-15);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)));
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = brentSolver0.solve(univariateRealFunction0, (-687.1), 1.0E-15);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-687.1), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        brentSolver0.functionValueAccuracy = -754.053175075;
        double double0 = brentSolver0.solve((-2002.031214919866), 1796.30774152, 0.0);
        org.junit.Assert.assertEquals(17, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(813.672497279747, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)));
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = brentSolver0.solve(univariateRealFunction0, (-2742.879001404222), 1044.8951964999449, 1.0E-15);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(univariateRealFunction0);
        double double0 = brentSolver0.solve((-1985.4921950685894), 1796.30774152, (-131.0));
        org.junit.Assert.assertEquals(14, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1613.2078276183695, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(univariateRealFunction0);
        double double0 = brentSolver0.solve((-2002.031214919866), 1796.30774152, 0.0);
        org.junit.Assert.assertEquals(15, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-1955.6414270749674), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)));
        double double0 = brentSolver0.solve((-2744.38), 0.0);
        org.junit.Assert.assertEquals(2, monitoredFunction0.getCallsCount());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-2958.98451309), 0.0);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2742.879001404222), 1043.61087385, 1.0E-15);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-728.9847325776194), 2052.7473, 4.5);
        org.junit.Assert.assertEquals(30, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(0.999999823490202, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        double double0 = brentSolver0.solve(java.lang.Double.NaN, 1.0);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-28.5859047), 3.94694872303623E-299);
        org.junit.Assert.assertEquals(3.94694872303623E-299, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.0E-15, 1383.53446185508);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-2744.38), 0.25, (-1359.1019));
        org.junit.Assert.assertEquals(10, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-1.54662540475457E-7), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-2744.38), 0.0, (-1359.1019));
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1.0), 1880.033, 1.0);
        org.junit.Assert.assertEquals(1, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        brentSolver0.functionValueAccuracy = 3.523679293160135E-10;
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 3.523679293160135E-10, 1290.72353469335, 0.5);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(3.523679293160135E-10, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)));
        double double0 = brentSolver0.solve((-2744.38), 0.909863472724605);
        org.junit.Assert.assertEquals(17, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-3.6011009282930786E-9), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), 0.0, 714.704496633);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        double double0 = brentSolver0.solve((-2002.031214919866), 1796.30774152, 0.0);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }
}

