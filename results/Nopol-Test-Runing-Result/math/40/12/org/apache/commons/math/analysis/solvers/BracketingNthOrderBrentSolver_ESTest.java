package org.apache.commons.math.analysis.solvers;


public class BracketingNthOrderBrentSolver_ESTest extends org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(861.14 , java.lang.Double.NaN , 3);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        bracketingNthOrderBrentSolver0.solve(3, univariateFunction0, (-1152.58443416), ((double)(3)), 0.0, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        org.junit.Assert.assertEquals(3, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0 , 2759);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        bracketingNthOrderBrentSolver0.solve(2759, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-2244.1), (-3.1989450260797914E-30), allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        org.junit.Assert.assertEquals((-1790.7078125461824), double0, 0.01);
        org.junit.Assert.assertEquals(2759, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0 , 2759);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        try {
            bracketingNthOrderBrentSolver0.solve(2759, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-2244.1), (-3.1989450260797914E-30), ((org.apache.commons.math.analysis.solvers.AllowedSolution)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        try {
            bracketingNthOrderBrentSolver0.solve(635, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-1996.4265206669588), java.lang.Double.NaN, 0.0595084804376466, ((org.apache.commons.math.analysis.solvers.AllowedSolution)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0 , 2759);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2759, univariateFunction0, (-1.4291517981101049E-8), ((double)(2759)), allowedSolution0);
        org.junit.Assert.assertEquals(1.0008479783940239E-8, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6 , 474);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(474, ((org.apache.commons.math.analysis.UnivariateFunction)(sinFunction0)), 1.0E-6, ((double)(474)), allowedSolution0);
        org.junit.Assert.assertEquals(135.08848398525853, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-6 , 474);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(474, ((org.apache.commons.math.analysis.UnivariateFunction)(sinFunction0)), (-2587.127213121), (-1.0), allowedSolution0);
        org.junit.Assert.assertEquals((-1090.132650795499), double0, 0.01);
        org.junit.Assert.assertEquals(474, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateFunction univariateFunction0 = sinFunction0.derivative();
        double double0 = bracketingNthOrderBrentSolver0.solve(918, univariateFunction0, (-597.0763901), 5.7455368446308694E197);
        org.junit.Assert.assertEquals(2.695233042364632E197, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-1996.4265206669588) , (-1996.4265206669588) , 635);
        double double0 = bracketingNthOrderBrentSolver0.solve(635, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-1996.4265206669588), 389.93447, 0.0595084804376466, allowedSolution0);
        org.junit.Assert.assertEquals((-1994.9113350295177), double0, 0.01);
        org.junit.Assert.assertEquals(635, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((-239.9723) , 5);
        double double0 = bracketingNthOrderBrentSolver0.solve(5, ((org.apache.commons.math.analysis.UnivariateFunction)(expm1Function0)), (-2525.096348), 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(1.0E-15 , 1.0E-15 , 635);
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(635, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-1996.4265206669588), 389.93447, (-9.693721577387622), allowedSolution0);
        org.junit.Assert.assertEquals(376.9911184307752, double0, 0.01);
        org.junit.Assert.assertEquals(635, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0 , 0.0 , (-703.4282695400998) , 2493);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        double double0 = bracketingNthOrderBrentSolver0.solve(2493, ((org.apache.commons.math.analysis.UnivariateFunction)(expm1Function0)), 0.0, 4742.6407598301885);
        org.junit.Assert.assertEquals(2493, bracketingNthOrderBrentSolver0.getMaximalOrder());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        double double0 = bracketingNthOrderBrentSolver0.solve(635, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-1996.4265206669588), java.lang.Double.NaN, 0.0595084804376466, allowedSolution0);
        org.junit.Assert.assertEquals(0.0595084804376466, bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1994.91133503867), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(918, ((org.apache.commons.math.analysis.UnivariateFunction)(sinFunction0)), (-597.0763901), 5.7455368446308694E197);
        org.junit.Assert.assertEquals(5.536364726831056E197, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0 , 2759);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        bracketingNthOrderBrentSolver0.solve(2759, ((org.apache.commons.math.analysis.UnivariateFunction)(sincFunction0)), (-1.4291517981101049E-8), ((double)(2759)), allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        org.junit.Assert.assertEquals(1379.1591749259192, double0, 0.01);
        org.junit.Assert.assertEquals(2759, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver(0.0 , 2759);
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        org.junit.Assert.assertEquals(2759, int0);
    }
}

