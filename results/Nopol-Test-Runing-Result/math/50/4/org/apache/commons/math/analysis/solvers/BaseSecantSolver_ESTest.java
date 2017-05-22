package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(462.240246106372 , 630.3);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = regulaFalsiSolver0.solve(5, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 1.0E-6, 0.5, allowedSolution0);
        org.junit.Assert.assertEquals(1.0E-6, regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(0.5, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = pegasusSolver0.solve(535, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.0, 442.54165103545, 82.68);
        org.junit.Assert.assertEquals(442.54165103545, pegasusSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values();
        org.junit.Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf("REGULA_FALSI");
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        pegasusSolver0.solve(3521, univariateRealFunction0, 0.0, 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(5.293583666102071E-12 , (-1191.87905529));
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        illinoisSolver0.solve(28, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 1.0, 1.0, 1538.074522, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(1538.074522, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0 , 404.0 , 0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(402809118, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-2186.475733030809), ((double)(402809118)), 404.0, allowedSolution0);
        org.junit.Assert.assertEquals(404.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(4.027971994268319E8, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(404.0 , 404.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(402809118, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-2186.475733030809), ((double)(402809118)), 404.0, allowedSolution0);
        org.junit.Assert.assertEquals(404.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(4.0277904334069204E8, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(733, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-989.076), 0.08371849358081818, 0.125, allowedSolution0);
        org.junit.Assert.assertEquals(0.125, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-125.66370614359172), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(733, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-989.076), 0.08371849358081818, 0.5, allowedSolution0);
        org.junit.Assert.assertEquals(0.5, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-125.66370614359174), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(3844.4934365089475 , 0.3333333134651184 , (-3409.7553046433354));
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(535, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1801.81), ((double)(535)), allowedSolution0);
        org.junit.Assert.assertEquals((-633.405), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1801.81), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0 , 0.5);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(733, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-989.076), 0.5, 0.1538461446762085, allowedSolution0);
        org.junit.Assert.assertEquals(0.1538461446762085, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-860.7916141486687), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.5 , (-7.800414592973399E-9));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = regulaFalsiSolver0.solve(891, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.08371849358081818, ((double)(733)), 3902.0412260895);
        org.junit.Assert.assertEquals(3902.0412260895, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(44.38126560342652, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.5 , 0.5 , 0.5);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(733, univariateRealFunction0, (-574.5218449208), 0.5, 0.08371849358081818, allowedSolution0);
        org.junit.Assert.assertEquals(0.08371849358081818, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-131.2707662704135), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(404.0 , 404.0 , 404.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(402809118, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-2186.475733030809), ((double)(402809118)), 404.0, allowedSolution0);
        org.junit.Assert.assertEquals(4.02809118E8, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(4.0277904334069204E8, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(733, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-994.1477367857071), 0.08371849358081818, 0.125, allowedSolution0);
        org.junit.Assert.assertEquals(0.125, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.5 , 0.5 , 0.5);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(733, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-574.5218449208), 0.5, 0.08371849358081818, allowedSolution0);
        org.junit.Assert.assertEquals(0.5, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-320.336687917223), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.5 , 0.5 , 0.5);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(733, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-989.076), 0.08371849358081818, 0.125, allowedSolution0);
        org.junit.Assert.assertEquals(0.125, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-47.26993835642709), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.5 , (-7.800414592973399E-9));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = regulaFalsiSolver0.solve(733, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-823.77569), 1.2675934823758863E-8, (-1301.9802194046154));
        org.junit.Assert.assertEquals((-823.77569), regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals((-5.827586677109586E-19), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(535, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1801.81), ((double)(535)), allowedSolution0);
        org.junit.Assert.assertEquals(535.0, pegasusSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        illinoisSolver0.solve(733, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-989.076), 1.7029898543501842E-8, 0.125, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(0.125, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-3.1916201452542037E-18), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.5 , 0.5 , (-7.800414592973399E-9));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(733, univariateRealFunction0, (-574.5218449208), (-7.800414592973399E-9), 0.08371849358081818, allowedSolution0);
        org.junit.Assert.assertEquals(0.08371849358081818, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-148.9759724598331), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.5 , 0.5 , (-7.800414592973399E-9));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        regulaFalsiSolver0.solve(733, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.0, 0.0, 0.5, allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals(0.5, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }
}

