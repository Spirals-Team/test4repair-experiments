package org.apache.commons.math.analysis.solvers;


public class BrentSolver_ESTest extends org.apache.commons.math.analysis.solvers.BrentSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setAbsoluteAccuracy((-1164.54592));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1810.9479724611704), 1217.4, (-1164.54592));
        org.junit.Assert.assertEquals(35, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        brentSolver0.setAbsoluteAccuracy((-1667.0));
        double double0 = brentSolver0.solve(univariateRealFunction0, (-867.0795723907829), 6.996384074128987E-5, 1.0E-15);
        org.junit.Assert.assertEquals(47, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(6.996384004626155E-5, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(univariateRealFunction0);
        brentSolver0.functionValueAccuracy = 112.10147795505;
        double double0 = brentSolver0.solve(univariateRealFunction0, (-18.324642458146048), 1.0E-15);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(univariateRealFunction0);
        brentSolver0.functionValueAccuracy = 112.10147795505;
        double double0 = brentSolver0.solve(univariateRealFunction0, 0.0, 1.0E-15);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        brentSolver0.setFunctionValueAccuracy((-1.0));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1800.98), 1.0, (-1164.5459244));
        org.junit.Assert.assertEquals(16, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(3.1570081215849446E-10, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        brentSolver0.functionValueAccuracy = 0.0;
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1800.98), 1.0, (-1164.5459244));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1.0), 1353.26552952, 121.174);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.0, 1.0E-15);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)));
        double double0 = brentSolver0.solve((-2077.852513), 1.0, 0.0);
        org.junit.Assert.assertEquals(1, monitoredFunction0.getCallsCount());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(univariateRealFunction0);
        double double0 = brentSolver0.solve((-663.34092), 0.0, (-557.287252));
        org.junit.Assert.assertEquals(15, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-0.8222162209910691), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        double double0 = brentSolver0.solve((-5195.329843), 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)));
        double double0 = brentSolver0.solve(java.lang.Double.NaN, java.lang.Double.NaN);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        double double0 = brentSolver0.solve((-78.684245120408), 369.86);
        org.junit.Assert.assertEquals(19, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-2.303588488403619E-8), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1666.5864), (-5.135879338193687));
        org.junit.Assert.assertEquals(15, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals((-816.8140899329442), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-816.8140899333463), 1.0E-15);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 1.0E-6, 1.0);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.0E-15, 1.0);
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-867.0795723907829), 1.0E-15);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1800.98), 1.0, (-1164.5459244));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 1.0E-15, 1.2349274364283065, 1.0425682050827592);
        org.junit.Assert.assertEquals(2, monitoredFunction0.getCallsCount());
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = brentSolver0.solve(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-867.0795723907829), 6.996384074128987E-5, 1.0E-15);
        org.junit.Assert.assertEquals(0, brentSolver0.getIterationCount());
        org.junit.Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)));
        double double0 = brentSolver0.solve((-2077.852513), 1.0, (-1.2157538505112293));
        org.junit.Assert.assertEquals(10, monitoredFunction0.getCallsCount());
        org.junit.Assert.assertEquals(1.7608249682497158E-7, double0, 0.01);
    }
}

