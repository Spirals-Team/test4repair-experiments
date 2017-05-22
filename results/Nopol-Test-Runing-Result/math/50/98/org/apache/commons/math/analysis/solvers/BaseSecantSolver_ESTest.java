package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-393.84854221));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        regulaFalsiSolver0.setup(4, univariateRealFunction0, 1449.3578372815653, (-2159.057), (-114.2));
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals((-2159.057), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values();
        org.junit.Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf("ILLINOIS");
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(univariateRealFunction0);
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        pegasusSolver0.solve(3, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.0, 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(560.6066695910566 , 560.6066695910566 , 560.6066695910566);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = regulaFalsiSolver0.solve(750, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 1.0E-6, 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        double double0 = pegasusSolver0.solve(37, univariateRealFunction0, (-1037.864019209), 532.6065068, (-2740.38242));
        org.junit.Assert.assertEquals((-2740.38242), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1035.1538133181282), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1213.0 , 0.5);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(1665, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.625, 1449.9987, 5.3037447649069705E-9, allowedSolution0);
        org.junit.Assert.assertEquals(5, monitoredFunction0.getCallsCount());
        org.junit.Assert.assertEquals(0.625, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.625 , 0.5);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        illinoisSolver0.solve(1665, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.625, 1449.9987, 0.625, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(0.625, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(487.0003136547506, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.08713622391223907 , 0.08713622391223907 , 0.08713622391223907);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(1704, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-0.4467613708797695), ((double)(1704)), (-2350.0), allowedSolution0);
        org.junit.Assert.assertEquals((-2350.0), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(574.743048558424, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(295, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1481.9846320654185), 0.8292929881518186, (-4889.7470308757), allowedSolution0);
        org.junit.Assert.assertEquals((-4889.7470308757), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1479.6901398423693), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.625 , 0.5);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(1688, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.625, 1449.9987, 5.3037447649069705E-9, allowedSolution0);
        org.junit.Assert.assertEquals(5.3037447649069705E-9, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1.0940662082499937, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-1.0) , 0.5474754645445221);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(851, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1609.59498, 4753.706274804065, allowedSolution0);
        org.junit.Assert.assertEquals(3181.650627402033, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(3685.0703169639896, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1213.0 , 0.5);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        double double0 = illinoisSolver0.solve(1665, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 1213.0, ((double)(1665)), 2249.80969);
        org.junit.Assert.assertEquals(1213.0, illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1625.815913732743, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.5 , 0.625 , 0.5);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(1665, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.625, 1449.9987, 5.3037447649069705E-9, allowedSolution0);
        org.junit.Assert.assertEquals(5.3037447649069705E-9, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1.121846569860418, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        illinoisSolver0.solve(295, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1482.7900599604936), 0.8292929881518186, (-4889.7470308757), allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals((-4889.7470308757), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1479.6901398407927), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(295, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1482.7900599604936), 0.8292929881518186, (-4889.7470308757), allowedSolution0);
        org.junit.Assert.assertEquals((-4889.7470308757), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1479.6901398407924), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(808.26 , 0.14982303977012634 , 0.479425538604203);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(295, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1481.9846320654185), 0.8292929881518186, (-4889.7470308757), allowedSolution0);
        org.junit.Assert.assertEquals((-4889.7470308757), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.8292929881518186, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(281, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1455.0386683346596), 1.125, (-4889.7470308757), allowedSolution0);
        org.junit.Assert.assertEquals((-4889.7470308757), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1454.557398632901), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.08713622391223907 , 0.08713622391223907 , 0.08713622391223907);
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        double double0 = illinoisSolver0.solve(1704, ((org.apache.commons.math.analysis.UnivariateRealFunction)(xMinus5Function0)), (-1352.7885597), 1824.202157858423, (-4025.274003), allowedSolution0);
        org.junit.Assert.assertEquals((-4025.274003), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(5.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-2554.0) , 0.0);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        illinoisSolver0.solve(1139, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.4456468917292502E-16, 0.0, 0.0, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.75 , 0.75 , (-2711.0));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(11, univariateRealFunction0, (-2711.0), (-287.38315824), allowedSolution0);
        org.junit.Assert.assertEquals((-2711.0), regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals((-2711.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.5474754645445221 , 0.5474754645445221 , 0.5474754645445221);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(818, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1609.59498, 4753.706274804065, allowedSolution0);
        org.junit.Assert.assertEquals(1609.59498, pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(3682.1413408990584, double0, 0.01);
    }
}

