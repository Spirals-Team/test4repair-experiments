package org.apache.commons.math.analysis.solvers;


public class BrentSolver_ESTest extends org.apache.commons.math.analysis.solvers.BrentSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        brentSolver0.setAbsoluteAccuracy(0.0);
        brentSolver0.setRelativeAccuracy((-476.0033));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), 7.719562909767598E-5, 5442.16361047131, 1701.3089988953839);
        org.junit.Assert.assertEquals(54, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(4195.212073279334, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(univariateRealFunction0);
        brentSolver0.setFunctionValueAccuracy(0.6752700909244995);
        double double0 = brentSolver0.solve(univariateRealFunction0, (-1052.421568), 0.25);
        org.junit.Assert.assertEquals(0.25, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        brentSolver0.setFunctionValueAccuracy(0.6752700909244995);
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.25, 2733.455954175372);
        org.junit.Assert.assertEquals(0.25, double0, 0.01);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.0, 527.9581097514287, 1.0E-15);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        brentSolver0.defaultFunctionValueAccuracy = -1194.124668430838;
        brentSolver0.resetFunctionValueAccuracy();
        double double0 = brentSolver0.solve(0.0, 1799.56767, 0.5);
        org.junit.Assert.assertEquals(1, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(0.5, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        double double0 = brentSolver0.solve(0.0, 2905.41);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(univariateRealFunction0);
        double double0 = brentSolver0.solve(1648.535040999028, 1904.0064964107512);
        org.junit.Assert.assertEquals(11, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1833.1193133696445, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(univariateRealFunction0);
        double double0 = brentSolver0.solve((-1351.59370577503), 0.0);
        org.junit.Assert.assertEquals((-1351.59370577503), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), ((double)(-1611)), 1648.535040999028, 0.5);
        org.junit.Assert.assertEquals(14, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-201.0619298294395), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.0E-15, 1.5, 3.593838301043376E-11);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        brentSolver0.functionValueAccuracy = -1.0;
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1310.094), 0.0, (-1125.4404542787584));
        org.junit.Assert.assertEquals(19, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-0.9999999973205176), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1.4286770768339505), 2733.455954175372);
        org.junit.Assert.assertEquals(19, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-1.0000000024857787), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setFunctionValueAccuracy(1647.975);
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.017596166554644545, 3.75);
        org.junit.Assert.assertEquals(0.017596166554644545, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = brentSolver0.solve(univariateRealFunction0, 0.0, java.lang.Double.NaN);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1668.3483), 1.0E-15);
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.0E-15, 0.017020460719235797);
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), 0.0, 1799.56767);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-5354.8761668652), 9.738898256163898E-7, (-804.0604648442759));
        org.junit.Assert.assertEquals(2, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-2.6110174383610114E-8), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1310.094), 0.0, (-1125.4404542787584));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        double double0 = brentSolver0.solve((-461.3311569561909), 3784.2336876797126, 1102.3);
        org.junit.Assert.assertEquals(13, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-12.56637061438438), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.0, 527.9581097514287, 1.0E-15);
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        double double0 = brentSolver0.solve(0.0, 1799.56767, 0.5);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }
}

