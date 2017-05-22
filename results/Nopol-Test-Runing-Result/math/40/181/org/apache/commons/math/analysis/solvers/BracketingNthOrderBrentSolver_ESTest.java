package org.apache.commons.math.analysis.solvers;


public class BracketingNthOrderBrentSolver_ESTest extends org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        bracketingNthOrderBrentSolver0.solve(2637, ((org.apache.commons.math.analysis.UnivariateFunction)(quinticFunction0)), (-2814.05890885), ((double)(2637)), 2086.271608305562, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        org.junit.Assert.assertEquals(2086.271608305562, bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1.0000000016566446, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        try {
            bracketingNthOrderBrentSolver0.solve(1435, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), ((double)(1435)), 2117.0, ((org.apache.commons.math.analysis.solvers.AllowedSolution)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1435, univariateFunction0, ((double)(1435)), 2117.0, allowedSolution0);
        org.junit.Assert.assertEquals(2040.463938421987, double0, 0.01);
        org.junit.Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2637, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-2788.6581660714123), ((double)(2637)), 2069.9027396166894, allowedSolution0);
        org.junit.Assert.assertEquals(2067.167966062084, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(18.704788193976338 , 1051);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(univariateFunction0);
        double double0 = bracketingNthOrderBrentSolver0.solve(1051, ((org.apache.commons.math.analysis.UnivariateFunction)(monitoredFunction0)), (-941.3960339), ((double)(1051)), 18.704788193976338);
        org.junit.Assert.assertEquals(3, monitoredFunction0.getCallsCount());
        org.junit.Assert.assertEquals((-941.3960339), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1435, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), ((double)(1435)), 2117.0, allowedSolution0);
        org.junit.Assert.assertEquals(1586.5042900527487, double0, 0.01);
        org.junit.Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1082.5115235747128) , (-1082.5115235747128) , 3203);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1442, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-1082.5115235747128), ((double)(3203)), allowedSolution0);
        org.junit.Assert.assertEquals((-1082.5115235747128), bracketingNthOrderBrentSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals((-1074.4246875277092), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(18.704788193976338 , 1051);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)));
        double double0 = bracketingNthOrderBrentSolver0.solve(1051, ((org.apache.commons.math.analysis.UnivariateFunction)(monitoredFunction0)), (-941.3960339156645), ((double)(1051)), 18.704788193976338);
        org.junit.Assert.assertEquals(13, monitoredFunction0.getCallsCount());
        org.junit.Assert.assertEquals(157.71254894693828, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(5, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-1.0), 1.1897985529427766E28, allowedSolution0);
        org.junit.Assert.assertEquals(2.9744963823569416E27, double0, 0.01);
        org.junit.Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0625 , (-630.64294529105) , 0.0625 , 673);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(673, ((org.apache.commons.math.analysis.UnivariateFunction)(quinticFunction0)), 0.0625, 0.5);
        org.junit.Assert.assertEquals(673, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals(0.5, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        bracketingNthOrderBrentSolver0.solve(2637, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-2814.05890885), ((double)(2637)), 2086.271608305562, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        org.junit.Assert.assertEquals((-1423.141471381903), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0 , 0.0 , 2708);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2708, ((org.apache.commons.math.analysis.UnivariateFunction)(quinticFunction0)), 0.0, ((double)(2708)), allowedSolution0);
        org.junit.Assert.assertEquals(2708, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(2276, ((org.apache.commons.math.analysis.UnivariateFunction)(sinFunction0)), ((double)(0)));
        org.junit.Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        bracketingNthOrderBrentSolver0.solve(2637, ((org.apache.commons.math.analysis.UnivariateFunction)(quinticFunction0)), (-2814.05890885), ((double)(2637)), (-1.545495535488274E-89), allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.junit.Assert.assertEquals(5, int0);
    }
}

