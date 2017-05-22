package org.apache.commons.math.analysis.solvers;


public class BrentSolver_ESTest extends org.apache.commons.math.analysis.solvers.BrentSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), java.lang.Double.NaN, java.lang.Double.NaN);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), 2.5000000000000007E-16, 3.2063754133559996E-5);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        brentSolver0.functionValueAccuracy = -744.0;
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-1601.3813367381927), 193.0, 0.0);
        org.junit.Assert.assertEquals(1, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = brentSolver0.solve(univariateRealFunction0, (-124.05690337264), 0.9926621058527174, (-3.001803000960893E-6));
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.3266960107487683E-54, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = brentSolver0.solve(univariateRealFunction0, (-2385.713741), 4.778782197917556E-10);
        org.junit.Assert.assertEquals((-2385.713741), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        brentSolver0.solve((-951.19), 1.0E-14, 0.0);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        double double0 = brentSolver0.solve((-2607.24683661), 4.635177408083326E-12, (-387.9582363399));
        org.junit.Assert.assertEquals(1, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(4.635177408083326E-12, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        double double0 = brentSolver0.solve(0.0, 1.0E-15);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        double double0 = brentSolver0.solve((-2385.713741), 0.0033747506828700887);
        org.junit.Assert.assertEquals(5, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-6.770805695009886E-8), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-2179.9), 1.0E-14, (-1.0));
        org.junit.Assert.assertEquals(1, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-14, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1697.1933334604726), 1377.2534299817046);
        org.junit.Assert.assertEquals(32, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0000000003907257, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-2385.713741), 3.75, 1.0E-6);
        org.junit.Assert.assertEquals(2, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-1053.089165874), 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        double double0 = brentSolver0.solve((-1696.0), 379.8845);
        org.junit.Assert.assertEquals(33, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(4.778782197917556E-10, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.0E-15, 1240.062867699774);
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
        org.junit.Assert.assertEquals(0, monitoredFunction0.getCallsCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        double double0 = brentSolver0.solve((-951.19), 2065.0, (-50.04791603849103));
        org.junit.Assert.assertEquals(21, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-3.451811472271954E-9), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-124.06688213177893), 2.5000000000000007E-16, (-3.001803000960893E-6));
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(2.220446049250313E-16, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-2581.5682), 3927.0, 619.73622);
        org.junit.Assert.assertEquals(41, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-0.9999999978872747), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.0E-15, 1711.649, 5.0);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2297.5164267394), 1.2320517726038815E-5, 1.0E-15);
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), 1.2320517726038815E-5, 2056.26, 2022.63872);
        org.junit.Assert.assertEquals(26, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(2045.0529068326694, double0, 0.01);
    }
}

