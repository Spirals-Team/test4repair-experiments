package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-5019.543793) , (-5019.543793) , (-5019.543793));
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(1352, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.5, 251.000041, allowedSolution0);
        org.junit.Assert.assertEquals(125.7500205, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.5, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf("REGULA_FALSI");
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values();
        org.junit.Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0 , 0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(814, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), 0.0, 0.0, 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0 , (-2506.3062088));
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = pegasusSolver0.solve(255, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.0, (-2506.3062088), 0.0);
        org.junit.Assert.assertEquals((-2506.3062088), pegasusSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        double double0 = regulaFalsiSolver0.solve(1754, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1693.383094), ((double)(1754)), 0.0);
        org.junit.Assert.assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1404.2919161546376), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0 , 0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        illinoisSolver0.solve(814, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), 1.2675934823758863E-8, 0.0, allowedSolution0);
        illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(6.337967411879432E-9, illinoisSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        pegasusSolver0.solve(3436, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1173.146735097407), 1.9357612700332538E-5);
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals((-586.5733578698971), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1171.8140597889928), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(60, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.5, 192.775772, allowedSolution0);
        org.junit.Assert.assertEquals(0.5, illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(53.40707476383954, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1.2098510069336044E-6 , (-1154.6822799));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(20, univariateRealFunction0, (-1154.6822799), (-205.09), (-0.46826022525626), allowedSolution0);
        org.junit.Assert.assertEquals((-0.46826022525626), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1154.5353001924927), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(60, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.38661, 866.3874644, 1799.0834867018475, allowedSolution0);
        org.junit.Assert.assertEquals(1799.0834867018475, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(757.1238295151402, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(3436, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.0, 978.4040675702395, allowedSolution0);
        org.junit.Assert.assertEquals(489.70203378511974, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(474.3804906342815, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(60, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-10.338147889397812), 866.3874644, 1799.0834867018475, allowedSolution0);
        org.junit.Assert.assertEquals((-10.338147889397812), illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(430.3981935418016, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = illinoisSolver0.solve(60, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.3866061746189606, ((double)(60)), 1799.083);
        org.junit.Assert.assertEquals(1799.083, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(53.40707511102649, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(866.3874644 , 866.3874644 , 866.3874644);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(60, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.5, 866.3874644, 1799.0834867018475, allowedSolution0);
        org.junit.Assert.assertEquals(1799.0834867018475, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(371.950752804032, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(866.3874644 , 866.3874644 , 866.3874644);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(60, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), ((double)(60)), 662.35695090143, ((double)(60)), allowedSolution0);
        org.junit.Assert.assertEquals(60.0, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(60.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(866.3874644 , 866.3874644 , 866.3874644);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(60, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.3866061746189606, 866.3874644, 1786.8145193480707, allowedSolution0);
        org.junit.Assert.assertEquals(1786.8145193480707, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(866.3874644, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(60, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.3866061746189606, 866.3874644, 1799.0834867018475, allowedSolution0);
        org.junit.Assert.assertEquals(0.3866061746189606, illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(794.8229413582176, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(60, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.3866061746189606, 866.3874644, 1799.0834867018475, allowedSolution0);
        org.junit.Assert.assertEquals(0.3866061746189606, illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(794.8229413582177, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(866.3874644 , 866.3874644 , 866.3874644);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(60, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.5, 866.3874644, 1799.0834867018475, allowedSolution0);
        org.junit.Assert.assertEquals(1799.0834867018475, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(371.950752804032, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(60, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.3866061746189606, 866.3874644, 1799.083, allowedSolution0);
        org.junit.Assert.assertEquals(1799.083, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(794.8229413582177, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.5);
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        regulaFalsiSolver0.solve(2982, ((org.apache.commons.math.analysis.UnivariateRealFunction)(xMinus5Function0)), 1.0, ((double)(2982)));
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals(2982.0, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(5.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = regulaFalsiSolver0.solve(7, univariateRealFunction0, 1.997844754509471E-9, (-2450.37455275525), allowedSolution0);
        org.junit.Assert.assertEquals((-2450.37455275525), regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-2450.37455275525), double0, 0.01);
    }
}

