package org.apache.commons.math.analysis.solvers;


public class BracketingNthOrderBrentSolver_ESTest extends org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0 , 0.0 , 86);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(86, ((org.apache.commons.math.analysis.UnivariateFunction)(sinFunction0)), 0.0, ((double)(86)), allowedSolution0);
        org.junit.Assert.assertEquals(86, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0 , 53.0 , 107);
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(107, ((org.apache.commons.math.analysis.UnivariateFunction)(sinFunction0)), (-715.8), 694.5806, 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(107, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1957.19625) , 618);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1428, univariateFunction0, java.lang.Double.NaN, ((double)(618)), 1.1357430455034003E-9, allowedSolution0);
        org.junit.Assert.assertEquals(618, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals(1.1357430455034003E-9, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        bracketingNthOrderBrentSolver0.solve(5256, ((org.apache.commons.math.analysis.UnivariateFunction)(xMinus5Function0)), ((double)(5)));
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        org.junit.Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals(5.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0 , 1468.5842 , 267);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        bracketingNthOrderBrentSolver0.solve(267, ((org.apache.commons.math.analysis.UnivariateFunction)(sinFunction0)), (-994.674), 1.0E-6, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        org.junit.Assert.assertEquals(267, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals((-497.3369995), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-17.305354596992295) , 20);
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(20, ((org.apache.commons.math.analysis.UnivariateFunction)(xMinus5Function0)), (-1.0), ((double)(20)), allowedSolution0);
        org.junit.Assert.assertEquals(9.5, bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(5.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1151, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-2424.0), ((double)(1151)), allowedSolution0);
        org.junit.Assert.assertEquals((-636.5), bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1906.946740728996), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(((double)(-2185)) , 618);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(618, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-3707.6256974463367), ((double)(618)), allowedSolution0);
        org.junit.Assert.assertEquals(618, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals((-3210.707691968767), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0 , 0.0 , 86);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(86, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), 1.0E-15, ((double)(86)), allowedSolution0);
        org.junit.Assert.assertEquals(40.840704496667314, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1957.19625) , 618);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1428, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), ((double)(-2185)), ((double)(618)), allowedSolution0);
        org.junit.Assert.assertEquals(376.99111843077503, double0, 0.01);
        org.junit.Assert.assertEquals(618, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1957.19625) , 618);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1428, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), ((double)(-2185)), ((double)(618)), allowedSolution0);
        org.junit.Assert.assertEquals(618.0, bracketingNthOrderBrentSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(376.9911184307752, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0 , 0.0 , 86);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(86, ((org.apache.commons.math.analysis.UnivariateFunction)(sinFunction0)), (-441.66), 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(86, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-2.0330362973820856E-8) , (-2.0330362973820856E-8) , (-2.0330362973820856E-8) , 479);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(479, univariateFunction0, (-1.4173514838169418E-27), ((double)(479)), 204.867814708083, allowedSolution0);
        org.junit.Assert.assertEquals((-1.4173514838169418E-27), double0, 0.01);
        org.junit.Assert.assertEquals(479, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(3510.532085012 , 3510.532085012 , 4073);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(687, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-8.56825295972308E226), 3510.532085012);
        org.junit.Assert.assertEquals(4073, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals((-4.28412647986154E226), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0 , 0.0 , 0.0 , 3);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        bracketingNthOrderBrentSolver0.solve(3, univariateFunction0, 0.0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(3, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.junit.Assert.assertEquals(5, int0);
    }
}

