package org.apache.commons.math.analysis.solvers;


public class BracketingNthOrderBrentSolver_ESTest extends org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.8050544360646619 , 1.8050544360646619 , 1.8050544360646619 , 3380);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        bracketingNthOrderBrentSolver0.solve(3380, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), 1.8050544360646619, 613.905);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        org.junit.Assert.assertEquals(307.8550272180323, double0, 0.01);
        org.junit.Assert.assertEquals(3380, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1580.66983) , 672);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1402, ((org.apache.commons.math.analysis.UnivariateFunction)(expm1Function0)), (-1580.66983), ((double)(1402)), allowedSolution0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        double double1 = bracketingNthOrderBrentSolver0.doSolve();
        org.junit.Assert.assertEquals(672, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals(0.0, double1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(((double)(22)) , 1610.681 , 22);
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(22, ((org.apache.commons.math.analysis.UnivariateFunction)(xMinus5Function0)), 0.0, 1610.681, 0.1309533376025487, allowedSolution0);
        org.junit.Assert.assertEquals(1610.681, double0, 0.01);
        org.junit.Assert.assertEquals(22, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1831, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-8.269235578021753E-33), ((double)(783)), allowedSolution0);
        org.junit.Assert.assertEquals(650.3096793242769, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(3380, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), 1.8050544360646619, 613.905);
        org.junit.Assert.assertEquals(304.7344873982098, double0, 0.01);
        org.junit.Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(717, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-2520.0), (-8.269235578021753E-33), allowedSolution0);
        org.junit.Assert.assertEquals((-1633.628179866751), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1580.66983) , 672);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1415, ((org.apache.commons.math.analysis.UnivariateFunction)(expm1Function0)), (-1580.66983), ((double)(1415)), allowedSolution0);
        org.junit.Assert.assertEquals(672, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals((-6.938893903907228E-18), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(((double)(708)) , ((double)(708)) , (-1583.3729443547973) , 708);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1415, ((org.apache.commons.math.analysis.UnivariateFunction)(expm1Function0)), (-1583.3729443547973), ((double)(1415)), allowedSolution0);
        org.junit.Assert.assertEquals(1415.0, double0, 0.01);
        org.junit.Assert.assertEquals(708, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0 , 0.0 , 5);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        bracketingNthOrderBrentSolver0.solve(5, ((org.apache.commons.math.analysis.UnivariateFunction)(expm1Function0)), (-7.219344506270708E-4), 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-3897.9) , (-470.820587644989) , 386);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(386, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-3897.9), (-2170.2692));
        org.junit.Assert.assertEquals((-3895.5748904513434), double0, 0.01);
        double double1 = bracketingNthOrderBrentSolver0.doSolve();
        org.junit.Assert.assertEquals(386, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals((-3895.5748904513434), double1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        double double0 = bracketingNthOrderBrentSolver0.solve(717, univariateFunction0, (-8.269235578021753E-33), ((double)(717)), allowedSolution0);
        org.junit.Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals((-8.269235578021753E-33), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1580.66983) , 672);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(672, ((org.apache.commons.math.analysis.UnivariateFunction)(expm1Function0)), (-1580.66983), ((double)(672)), 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(672, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(((double)(672)) , (-1580.66983) , (-1580.66983) , 672);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(4, ((org.apache.commons.math.analysis.UnivariateFunction)(expm1Function0)), (-657.0097389219655), ((double)(672)), (-454.33491500000014), allowedSolution0);
        org.junit.Assert.assertEquals((-454.33491500000014), bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-454.33491500000014), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1580.66983) , 708);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        bracketingNthOrderBrentSolver0.solve(708, ((org.apache.commons.math.analysis.UnivariateFunction)(quinticFunction0)), (-1580.66983), ((double)(708)), allowedSolution0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.junit.Assert.assertEquals(5, int0);
    }
}

