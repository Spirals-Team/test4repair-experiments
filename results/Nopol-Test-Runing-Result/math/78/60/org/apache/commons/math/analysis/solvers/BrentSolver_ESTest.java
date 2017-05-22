package org.apache.commons.math.analysis.solvers;


public class BrentSolver_ESTest extends org.apache.commons.math.analysis.solvers.BrentSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        brentSolver0.setFunctionValueAccuracy(0.87758256189);
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-1533.1175784186655), 173.7458282725739);
        org.junit.Assert.assertEquals(10, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(0.39252845713629725, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-4006.3827917559), 1.0705226485453166E-27);
        org.junit.Assert.assertEquals(1.0705226485453166E-27, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.0E-15, 1.0E-14);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.0E-15, 0.5, 1.0E-14);
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-578.735511205), 0.0, (-471.275));
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(univariateRealFunction0);
        double double0 = brentSolver0.solve((-4006.3827917559), 199.73224784014, 23.061745143580715);
        org.junit.Assert.assertEquals(11, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(155.508836347938, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)));
        double double0 = brentSolver0.solve(0.0, 0.5);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(univariateRealFunction0);
        double double0 = brentSolver0.solve((-4589.023), (-1.0));
        org.junit.Assert.assertEquals((-4589.023), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-4006.3827917559), 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), 1.0E-14, 2831.4508207904128, 1281.876877522);
        org.junit.Assert.assertEquals(31, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(2314.9261730153257, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.0, 213.35792577390492, 1.0E-15);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(univariateRealFunction0);
        double double0 = brentSolver0.solve(univariateRealFunction0, 6.952138282763926E-6, 3396.55112673, 0.25);
        org.junit.Assert.assertEquals(16, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(3180.862561747787, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1.0111495082343325E-6), 2486.5, 1050.546765906);
        org.junit.Assert.assertEquals(4, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-1.1149508234332518E-8), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.0E-15, 3467.9793041);
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = brentSolver0.solve(univariateRealFunction0, (-943.8711), 846.358);
        org.junit.Assert.assertEquals((-943.8711), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 5.96134553242446E-73, 160.0184433304287);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(5.96134553242446E-73, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-4006.3827917559), 1.0E-15);
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        brentSolver0.setFunctionValueAccuracy((-0.044600167429775205));
        double double0 = brentSolver0.solve((-4006.3827917559), 199.73224784014, 0.0);
        org.junit.Assert.assertEquals(1, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-4006.3827917559), 1.0E-15, (-515.16));
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(univariateRealFunction0);
        double double0 = brentSolver0.solve((-4006.3827917559), 199.73224784014, 0.0);
        org.junit.Assert.assertEquals(7, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-1207.9423753052154), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(univariateRealFunction0);
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-428.3211794821118), 0.25, (-1.0));
        org.junit.Assert.assertEquals(2, monitoredFunction0.getCallsCount());
        org.junit.Assert.assertEquals(9.604511228914799E-187, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        double double0 = brentSolver0.solve((-4006.3827917559), 199.73224784014, 0.0);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        double double0 = brentSolver0.solve(java.lang.Double.NaN, java.lang.Double.NaN);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }
}

