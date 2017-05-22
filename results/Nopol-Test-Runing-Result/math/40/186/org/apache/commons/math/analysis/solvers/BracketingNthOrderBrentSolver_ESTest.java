package org.apache.commons.math.analysis.solvers;


public class BracketingNthOrderBrentSolver_ESTest extends org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-6.680679913078676E139) , 1231);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2285, ((org.apache.commons.math.analysis.UnivariateFunction)(expm1Function0)), (-271.2078544082334), 7.116796041373163E-11, allowedSolution0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        double double1 = bracketingNthOrderBrentSolver0.doSolve();
        org.junit.Assert.assertEquals(0.0, double1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1950.6717488661288) , 2266);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2266, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-1950.6717488661288), ((double)(2266)), allowedSolution0);
        org.junit.Assert.assertEquals(2266, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals(2164.5573383233673, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2266, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-1940.9728452), 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals((-1624.2034024564725), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(440.54746148066556 , 440.54746148066556 , 440.54746148066556 , 4216);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        bracketingNthOrderBrentSolver0.setup(4216, sinFunction0, 764.913932593, 5424.1013, 1565.8152865);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        org.junit.Assert.assertEquals(1565.8152865, double0, 0.01);
        org.junit.Assert.assertEquals(4216, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1940.9728452) , 2266);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2266, univariateFunction0, (-1940.9728452), ((double)(2266)), allowedSolution0);
        org.junit.Assert.assertEquals((-519.9316608417924), double0, 0.01);
        double double1 = bracketingNthOrderBrentSolver0.doSolve();
        org.junit.Assert.assertEquals(2266, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals((-519.9316608417924), double1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1210.571) , (-1210.571) , 3643.0542 , 296);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(296, ((org.apache.commons.math.analysis.UnivariateFunction)(sinFunction0)), (-1210.571), 3643.0542, ((double)(296)), allowedSolution0);
        org.junit.Assert.assertEquals(296, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals(3643.0542, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(156.14330112823 , 156.14330112823 , 156.14330112823 , 1766);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1766, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-2004.438886070063), 156.14330112823, (-964.813), allowedSolution0);
        org.junit.Assert.assertEquals(156.14330112823, bracketingNthOrderBrentSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-964.813), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1210.571) , (-1210.571) , 3643.0542 , 296);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        double double0 = bracketingNthOrderBrentSolver0.solve(296, ((org.apache.commons.math.analysis.UnivariateFunction)(expm1Function0)), (-1.0), 769.177408);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
        org.junit.Assert.assertEquals(296, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(3132.3239727623836 , 2706.1885 , 998);
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(4, ((org.apache.commons.math.analysis.UnivariateFunction)(sinFunction0)), java.lang.Double.NaN, 0.0, (-1145.1786984885296), allowedSolution0);
        org.junit.Assert.assertEquals((-1145.1786984885296), bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1950.6717488661288) , 2266);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2266, univariateFunction0, ((double)(0)), 32.0, allowedSolution0);
        org.junit.Assert.assertEquals(2266, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1950.6717488661288) , 2266);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        bracketingNthOrderBrentSolver0.solve(2249, univariateFunction0, (-9.628709342929729E-9), ((double)(0)), allowedSolution0);
        org.junit.Assert.assertEquals(2266, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(((double)(2)) , 1304.27 , 2);
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.junit.Assert.assertEquals(2, int0);
    }
}

