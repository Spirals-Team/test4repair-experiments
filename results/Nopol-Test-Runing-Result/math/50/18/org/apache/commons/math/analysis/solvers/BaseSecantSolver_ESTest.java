package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        double double0 = pegasusSolver0.solve(227, ((org.apache.commons.math.analysis.UnivariateRealFunction)(xMinus5Function0)), (-1.0), ((double)(227)), (-1.0));
        org.junit.Assert.assertEquals((-1.0), pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(5.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values();
        org.junit.Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf("REGULA_FALSI");
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-1.0));
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(17, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.0, (-1.0), allowedSolution0);
        org.junit.Assert.assertEquals((-1.0), regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.19999999999923582 , (-1070.0));
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(27, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-1.0), (-1.0), allowedSolution0);
        org.junit.Assert.assertEquals((-1.0), pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(9.220590270857665E-9 , 0.0 , 0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        double double0 = illinoisSolver0.solve(4, univariateRealFunction0, 0.0, ((double)(4)), 1.0E-6);
        org.junit.Assert.assertEquals(1.0E-6, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0 , (-1884.86));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(univariateRealFunction0);
        double double0 = pegasusSolver0.solve(2694, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.0, (-1884.86), 0.0);
        org.junit.Assert.assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1884.86), double0, 0.01);
        org.junit.Assert.assertEquals(0.0, pegasusSolver0.getMin(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(1878, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-486.3), 1.625, 29.189039182181823, allowedSolution0);
        org.junit.Assert.assertEquals(29.189039182181823, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-219.91148554688124), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(java.lang.Double.POSITIVE_INFINITY , java.lang.Double.POSITIVE_INFINITY);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(950, univariateRealFunction0, (-22.4), ((double)(950)), (-22.4), allowedSolution0);
        org.junit.Assert.assertEquals((-22.4), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(695.247555454348, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(java.lang.Double.POSITIVE_INFINITY);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        pegasusSolver0.solve(2116891581, univariateRealFunction0, (-22.4), ((double)(2116891581)), (-22.4), allowedSolution0);
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals((-22.4), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1.139399777543923E9, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-1.0) , 0.7853981633974483);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(39, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 3.3636031800315114, ((double)(39)), allowedSolution0);
        org.junit.Assert.assertEquals(3.3636031800315114, regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(31.008582337760895, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1.5);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(70, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), ((double)(70)), 720.103288882, allowedSolution0);
        org.junit.Assert.assertEquals(395.051644441, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(687.9327606718497, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-1.0) , (-1.0));
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(746, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 1.0E-6, 4.0, allowedSolution0);
        org.junit.Assert.assertEquals(2.0000005, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(3.141592653589793, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(java.lang.Double.POSITIVE_INFINITY , java.lang.Double.POSITIVE_INFINITY , java.lang.Double.POSITIVE_INFINITY);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(950, univariateRealFunction0, (-22.4), ((double)(950)), (-22.4), allowedSolution0);
        org.junit.Assert.assertEquals((-22.4), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(695.247555454348, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(java.lang.Double.POSITIVE_INFINITY , java.lang.Double.POSITIVE_INFINITY , java.lang.Double.POSITIVE_INFINITY);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(931, univariateRealFunction0, (-22.4), ((double)(931)), (-22.4), allowedSolution0);
        org.junit.Assert.assertEquals((-22.4), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(610.9178455671902, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(java.lang.Double.POSITIVE_INFINITY , java.lang.Double.POSITIVE_INFINITY , java.lang.Double.POSITIVE_INFINITY);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        pegasusSolver0.solve(931, univariateRealFunction0, (-22.4), ((double)(931)), (-22.4), allowedSolution0);
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals((-22.4), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-22.4), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(java.lang.Double.POSITIVE_INFINITY , java.lang.Double.POSITIVE_INFINITY , java.lang.Double.POSITIVE_INFINITY);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(950, univariateRealFunction0, (-22.4), ((double)(950)), (-22.4), allowedSolution0);
        org.junit.Assert.assertEquals((-22.4), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(950.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-1.0) , 0.7853981633974483);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(2146760832, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.7853981633974483, 3.3636031800315114, (-871.896342), allowedSolution0);
        org.junit.Assert.assertEquals((-871.896342), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(3.141592653589793, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(java.lang.Double.POSITIVE_INFINITY , java.lang.Double.POSITIVE_INFINITY , java.lang.Double.POSITIVE_INFINITY);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = pegasusSolver0.solve(950, univariateRealFunction0, (-22.723829792422418), ((double)(950)), (-22.723829792422418), allowedSolution0);
        org.junit.Assert.assertEquals((-22.723829792422418), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(653.6409875724768, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1.5);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(70, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), ((double)(70)), 720.103288882, allowedSolution0);
        org.junit.Assert.assertEquals(395.051644441, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(687.9327606718497, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(1878, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-486.3), 1.625, 29.189039182181823, allowedSolution0);
        org.junit.Assert.assertEquals(29.189039182181823, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(java.lang.Double.POSITIVE_INFINITY , java.lang.Double.POSITIVE_INFINITY , (-3594.52218));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        pegasusSolver0.setup(44532, sinFunction0, 1.0E-6, 0.0, 2.0813231423926306E-5);
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(10.478942041689834 , 10.478942041689834 , 1844.0);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        illinoisSolver0.solve(2713, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-3589.3092531), 725.36218753966, 2156.45932);
    }
}

