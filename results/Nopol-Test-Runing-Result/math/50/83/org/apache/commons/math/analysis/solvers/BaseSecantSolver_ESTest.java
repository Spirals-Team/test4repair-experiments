package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf("ILLINOIS");
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values();
        org.junit.Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(36, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), ((double)(36)), 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(18.0, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1272.6964665);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(2280, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.0, 2293.208494860007, 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-30.881027484905786) , (-30.881027484905786) , (-335.300444));
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = illinoisSolver0.solve(2, univariateRealFunction0, 9.50585857421585E-10, ((double)(2)), 9.50585857421585E-10, allowedSolution0);
        org.junit.Assert.assertEquals(9.50585857421585E-10, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(9.50585857421585E-10, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        regulaFalsiSolver0.solve(60, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.0, 0.0, ((double)(60)));
        regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals(60.0, regulaFalsiSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-3.0));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(4160, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1619.2789), (-3.0), allowedSolution0);
        org.junit.Assert.assertEquals((-811.13945), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-153.93804002589988), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-3.0) , 2975.7);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(4160, univariateRealFunction0, (-3.0), 3.5038234983417587, allowedSolution0);
        org.junit.Assert.assertEquals(0.25191174917087933, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.8517094187400311, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-3.0) , 2975.7);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(4160, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-3.0), 0.013816239016051056, allowedSolution0);
        org.junit.Assert.assertEquals((-1.4930918804919744), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.013766716176276752, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-3.0) , 2974.6517737940158);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(1065, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1147.32480155487), 2974.6517737940158, allowedSolution0);
        org.junit.Assert.assertEquals(913.6634861195728, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-496.1936618456102), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-3.0));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(4160, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1619.2789), 2976.3532225558506, allowedSolution0);
        org.junit.Assert.assertEquals(678.5371612779252, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(204.20352248333654, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(36, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1206.086), 0.0, allowedSolution0);
        org.junit.Assert.assertEquals((-603.043), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1203.229986324891), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = pegasusSolver0.solve(4160, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-3.0), 0.029592965257884303, allowedSolution0);
        org.junit.Assert.assertEquals((-1.4852035173710578), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1.7936620343357659E-43), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(1069, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-3.0), 2975.7, allowedSolution0);
        org.junit.Assert.assertEquals(1486.35, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2799.1590543485054, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-3.0) , 2975.9429941985286 , 2975.9429941985286);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(4160, univariateRealFunction0, (-3.0), 0.013816239016051056, allowedSolution0);
        org.junit.Assert.assertEquals((-1.4930918804919744), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.013816239016051056, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(4160, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-106.59821678), ((double)(4160)), allowedSolution0);
        org.junit.Assert.assertEquals(2026.70089161, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2846.2829441485137, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(3832.521382);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        illinoisSolver0.solve(5370, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1217.682), ((double)(5370)));
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(2076.1589999999997, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-0.9968767106042741), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-3.0));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(4160, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1619.2789), 2976.3532225558506, allowedSolution0);
        org.junit.Assert.assertEquals((-1619.2789), pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(204.20352248333657, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = pegasusSolver0.solve(1065, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1147.32480155487), 2975.7, allowedSolution0);
        org.junit.Assert.assertEquals(914.1875992225648, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(2.718281828459045 , 2.718281828459045 , 0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = pegasusSolver0.solve(19, univariateRealFunction0, 2.718281828459045, (-1312.67144274), 2.718281828459045, allowedSolution0);
        org.junit.Assert.assertEquals(2.718281828459045, pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals((-1312.67144274), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-7.44321345601866E-11) , (-7.44321345601866E-11));
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        double double0 = regulaFalsiSolver0.solve(8388607, univariateRealFunction0, (-7.44321345601866E-11), ((double)(8388607)), (-758.51));
        org.junit.Assert.assertEquals((-758.51), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-7.44321345601866E-11), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-7.44321345601866E-11) , (-7.44321345601866E-11));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        regulaFalsiSolver0.solve(8388607, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-7.44321345601866E-11), ((double)(8388607)), (-758.1756474495285));
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals((-758.1756474495285), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(4.87890977618477E-18, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-3.0) , (-3.0));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(4160, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-3.0), 0.013816239016051056, allowedSolution0);
        org.junit.Assert.assertEquals(0.013816239016051056, pegasusSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(3.4512664603419266E-31, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-3.0));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        pegasusSolver0.solve(4160, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-3.0), 4.9E-324, allowedSolution0);
    }
}

