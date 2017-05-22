package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(2627.8579621);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(169, univariateRealFunction0, (-3625.2859), 6.084917829749588E-9, 0.5, allowedSolution0);
        org.junit.Assert.assertEquals(0.5, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-3625.2859), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf("REGULA_FALSI");
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values();
        org.junit.Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        pegasusSolver0.solve(1766, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.0, 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-0.25) , (-0.25) , (-0.25));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        double double0 = regulaFalsiSolver0.solve(2066, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-0.25), 0.0, (-1145.3873));
        org.junit.Assert.assertEquals((-0.25), regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-1125.0));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        pegasusSolver0.setup(946, expm1Function0, 0.0, (-1125.0), (-0.25));
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(1890, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.14285714285714285, ((double)(1890)), allowedSolution0);
        org.junit.Assert.assertEquals(945.0714285714286, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1888.0971838074659, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(1564, univariateRealFunction0, 0.14982304, 1730.43909941802, 591.4, allowedSolution0);
        org.junit.Assert.assertEquals(591.4, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1409.0043051350224, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(1564, univariateRealFunction0, (-1143.804211696541), 1730.43909941802, 591.4, allowedSolution0);
        org.junit.Assert.assertEquals(591.4, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(906.3494805606554, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-3089.0827211470328) , 0.8944071040972403);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(421, univariateRealFunction0, (-3093.123946), (-860.79778622), (-588.32943), allowedSolution0);
        org.junit.Assert.assertEquals((-1120.4021750175157), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.8944071040972403 , 5.650007086920087E-9);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(421, univariateRealFunction0, (-3093.123946), (-860.79778622), (-618.7672616725664), allowedSolution0);
        org.junit.Assert.assertEquals((-618.7672616725664), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-2961.9244820989356), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(1915, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.14285714285714285, ((double)(1915)), allowedSolution0);
        org.junit.Assert.assertEquals(0.14285714285714285, regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1913.229926036184, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        regulaFalsiSolver0.solve(1915, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.14285714285714285, ((double)(1915)), allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals(0.14285714285714285, regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1913.2299262167585, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(1915, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-2.449098717290399), ((double)(1915)), allowedSolution0);
        org.junit.Assert.assertEquals((-2.449098717290399), regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1913.2299260361842, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(1890, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.14285714285714285, ((double)(1890)), allowedSolution0);
        org.junit.Assert.assertEquals(0.14285714285714285, regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1888.0971848074657, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(1915, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.14285714285714285, ((double)(1915)), allowedSolution0);
        org.junit.Assert.assertEquals(0.14285714285714285, regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1913.2299262167585, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(1915, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-0.16624879837036133), ((double)(1915)), allowedSolution0);
        org.junit.Assert.assertEquals((-0.16624879837036133), regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1913.229926036184, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        pegasusSolver0.solve(1564, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-994.5781728959039), 0.14982304);
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals((-497.21417492795194), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-18.84955592153876), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(49, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-990.8149), ((double)(49)), allowedSolution0);
        org.junit.Assert.assertEquals((-990.8149), illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals((-216.76989309769576), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(4887.666606859597 , 4887.666606859597 , 4887.666606859597);
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        double double0 = regulaFalsiSolver0.solve(1694, ((org.apache.commons.math.analysis.UnivariateRealFunction)(xMinus5Function0)), 0.0, 2129.556695688225, 4887.666606859597);
        org.junit.Assert.assertEquals(4887.666606859597, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(5.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(56, univariateRealFunction0, 1620.705, (-3286.7224358164067), 2295.976523, allowedSolution0);
        org.junit.Assert.assertEquals(1620.705, regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals((-3286.7224358164067), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(4.503599627370496E15 , (-1147.0415555080717));
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        double double0 = illinoisSolver0.solve(2795, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1074.8560439634107), 414.0372479, (-1885.10379774));
        org.junit.Assert.assertEquals((-1074.8560439634107), illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals((-762.8744536602126), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        regulaFalsiSolver0.solve(123, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), 0.0, 0.5, 349.768662, allowedSolution0);
    }
}

