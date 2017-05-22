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
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(767, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-1135.4579017), 0.5, ((double)(767)), allowedSolution0);
        org.junit.Assert.assertEquals(767.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-3054.5516920666505) , 0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        double double0 = regulaFalsiSolver0.solve(1794, univariateRealFunction0, 0.0, (-3371.0), 0.14982303977012634);
        org.junit.Assert.assertEquals((-3371.0), regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1663.037919015956);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        illinoisSolver0.solve(362, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.0, 0.0, allowedSolution0);
        illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        regulaFalsiSolver0.solve(2909, ((org.apache.commons.math.analysis.UnivariateRealFunction)(xMinus5Function0)), 0.5, 401.0, ((double)(2909)), allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals(2909.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(5.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(408.96000509);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(924, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-2577.906263788), 0.3333333333332802, 408.96000509, allowedSolution0);
        org.junit.Assert.assertEquals(408.96000509, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-206.83981492055545), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(408.96000509);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(767, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-1135.4579017), 0.5, ((double)(767)), allowedSolution0);
        org.junit.Assert.assertEquals(767.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-175.36686872392067), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(408.96000509);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(767, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-1135.4579017), 0.5, ((double)(767)), allowedSolution0);
        org.junit.Assert.assertEquals(767.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.5, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(2025, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-5.3303841588318384E-14), 2.7553817452272217E-6, allowedSolution0);
        org.junit.Assert.assertEquals(4.1761948595190557E-53, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-921.4));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(767, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-1135.4579017), 0.5, ((double)(767)), allowedSolution0);
        org.junit.Assert.assertEquals(767.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-6.422488831378098E-16), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(767, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-5.3303841588319804E-14), 1.0, allowedSolution0);
        org.junit.Assert.assertEquals(1.0, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-6.780194531536821E-16), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(2025, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-1777.9), 2.7553817452272217E-6, allowedSolution0);
        org.junit.Assert.assertEquals((-888.9499986223092), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-6.750718358448926E-9), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(2025, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-1777.9), 2.7553817452272217E-6, allowedSolution0);
        org.junit.Assert.assertEquals((-888.9499986223092), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-6.750718358448926E-9), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(716.79152421 , 716.79152421 , 716.79152421);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(univariateRealFunction0);
        double double0 = pegasusSolver0.solve(1636, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.1716593258327805, ((double)(1636)), 0.1716593258327805);
        org.junit.Assert.assertEquals(5, monitoredFunction0.getCallsCount());
        org.junit.Assert.assertEquals(946.4043933895443, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(767, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-8.221413583658807E-16), 0.5, 0.5, allowedSolution0);
        org.junit.Assert.assertEquals(0.5, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(9.073524475097657E-7, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        illinoisSolver0.solve(8351723, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1887.27), (-1190.93), 0.030589580535888672);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(0.030589580535888672, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1595.929068023615), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1.0E-6 , 1.0E-14 , 0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(2146930791, univariateRealFunction0, (-1.0), (-1290.393), 1.0E-14, allowedSolution0);
        org.junit.Assert.assertEquals(1.0E-14, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1290.393), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = illinoisSolver0.solve(922, univariateRealFunction0, (-2566.45), 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, illinoisSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-2566.45), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        pegasusSolver0.solve(2025, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-5.3303841588318384E-14), 2.7553817452272217E-6, allowedSolution0);
    }
}

