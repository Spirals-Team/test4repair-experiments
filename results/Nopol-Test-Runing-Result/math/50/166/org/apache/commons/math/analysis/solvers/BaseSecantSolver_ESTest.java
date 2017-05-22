package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values();
        org.junit.Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf("PEGASUS");
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(1009, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.0, ((double)(1009)), allowedSolution0);
        org.junit.Assert.assertEquals(504.5, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-2.2543161611487674) , (-2.2543161611487674) , (-2.2543161611487674));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(2767, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-1625.886928809), 1.0, (-1800.77504041), allowedSolution0);
        org.junit.Assert.assertEquals((-1800.77504041), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        illinoisSolver0.solve(40, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.0, 0.35241834572136493, 1.0);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(0.35241834572136493, illinoisSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1.0);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        pegasusSolver0.solve(295, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1104.12949005), 2271.576339273199, 2271.576339273199, allowedSolution0);
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals(2271.576339273199, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(null)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        try {
            illinoisSolver0.solve(2767, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-1625.886928809), 1.0, (-1800.77504041), allowedSolution0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(null)));
        try {
            regulaFalsiSolver0.solve(1807, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 5.0161740951102296E-6, (-1.2797178052748238E-11), 0.013744028349775037);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(2872.86985);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(295, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1108.7773288010826), ((double)(295)), ((double)(295)), allowedSolution0);
        org.junit.Assert.assertEquals(295.0, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(293.13103046574116, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.5168381);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(1009, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.5168381, ((double)(1009)), allowedSolution0);
        org.junit.Assert.assertEquals(504.75841905, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(971.0296182784058, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-2.2543161611487674) , 3345.5 , (-2.2543161611487674));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(2767, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-1625.886928809), 1.0, (-1800.77504041), allowedSolution0);
        org.junit.Assert.assertEquals(5, monitoredFunction0.getCallsCount());
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.51683806849);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = pegasusSolver0.solve(1009, univariateRealFunction0, 0.51683806849, 454.0770459, allowedSolution0);
        org.junit.Assert.assertEquals(227.29694198424497, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(14.046542201386057, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(2872.86985);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(295, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1104.12949005), 2271.576339273199, 2271.576339273199, allowedSolution0);
        org.junit.Assert.assertEquals(2271.576339273199, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2271.576339273199, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(1009, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.5168381, ((double)(1009)), allowedSolution0);
        org.junit.Assert.assertEquals(504.75841905, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(970.7521299592462, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.5168380684915581);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = pegasusSolver0.solve(1032, univariateRealFunction0, 0.5168380684915581, 454.0770459, allowedSolution0);
        org.junit.Assert.assertEquals(227.29694198424576, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(14.147294990493192, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-10.481690230762702));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(1009, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-10.481690230762702), ((double)(1009)), allowedSolution0);
        org.junit.Assert.assertEquals(499.2591548846187, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(116.23892818282235, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(2767, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-1625.886928809), 1.0, (-1800.77504041), allowedSolution0);
        org.junit.Assert.assertEquals((-1800.77504041), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(3.2096166801266127E-17, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(2767, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-1625.886928809), 1.0, 1.0, allowedSolution0);
        org.junit.Assert.assertEquals(1.0, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-3.209632780189957E-17), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(2.567149883481114 , 2.567149883481114 , 2272.7362332918574);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        illinoisSolver0.solve(93, univariateRealFunction0, 1256.628813, 2272.4427569471313, 998.474430188);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(998.474430188, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2059.8469113506385, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0 , 0.0);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(1790, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-655.15), 2270.549782519, allowedSolution0);
        org.junit.Assert.assertEquals(807.6998912595001, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-2331.41319669182) , (-2331.41319669182));
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(1382574054, univariateRealFunction0, (-2331.41319669182), 5.406357583837007E-10, (-1323.522), allowedSolution0);
        org.junit.Assert.assertEquals((-2331.41319669182), illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(5.406357583837007E-10, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = regulaFalsiSolver0.solve(3, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1.0), 1762.45);
        org.junit.Assert.assertEquals((-1.0), regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        double double0 = regulaFalsiSolver0.solve(1043, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-828.856318161), 1.7823501497359106E-17, 1507.830005666198);
        org.junit.Assert.assertEquals(1507.830005666198, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1.4755298326340778E-14), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.51683806849 , 0.51683806849 , 0.51683806849);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = pegasusSolver0.solve(1009, univariateRealFunction0, 0.51683806849, 454.0770459, allowedSolution0);
        org.junit.Assert.assertEquals(227.29694198424497, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(12.84608261033007, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        illinoisSolver0.solve(2767, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-1.0), 1.0, (-1800.77504041), allowedSolution0);
    }
}

