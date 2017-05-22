package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = pegasusSolver0.solve(112, univariateRealFunction0, ((double)(183)), (-982.6));
        org.junit.Assert.assertEquals(183.0, pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals((-982.6), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf("ILLINOIS");
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values();
        org.junit.Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(1.073741824E9 , 0.0);
        double double0 = regulaFalsiSolver0.solve(6, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.0, ((double)(-1986005976)), allowedSolution0);
        org.junit.Assert.assertEquals((-9.93002988E8), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0 , (-140.169969772));
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(3735, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1518.7978), (-140.169969772), 55.2, allowedSolution0);
        org.junit.Assert.assertEquals(55.2, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1485.9733251479722), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-1552.619));
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        double double0 = regulaFalsiSolver0.solve(12, ((org.apache.commons.math.analysis.UnivariateRealFunction)(xMinus5Function0)), 0.0, 2776.60104019, (-1088.51951074046));
        org.junit.Assert.assertEquals((-1088.51951074046), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(5.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(6.123233995736766E-17 , 6.123233995736766E-17);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = regulaFalsiSolver0.solve(1024, univariateRealFunction0, (-2009.141522629), (-2009.141522629), (-2009.141522629));
        org.junit.Assert.assertEquals((-2009.141522629), regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals((-2009.141522629), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-366.678476072));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(728199437, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 712.776576621, ((double)(728199437)), allowedSolution0);
        org.junit.Assert.assertEquals(3.641000748882883E8, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(7.216139962029771E8, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-366.678476072));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(728199437, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 712.776576621, ((double)(728199437)), allowedSolution0);
        org.junit.Assert.assertEquals(3.641000748882883E8, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(7.216139962029772E8, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1.073741824E9);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(6, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.0E-6, ((double)(6)), (-211.0), allowedSolution0);
        org.junit.Assert.assertEquals((-211.0), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2.247331685367726E-5, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = pegasusSolver0.solve(742, univariateRealFunction0, 0.0, 253.76472374654452);
        org.junit.Assert.assertEquals(126.88236187327226, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(202.63272615654168, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-366.678476072));
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(728199437, univariateRealFunction0, 712.776576621, ((double)(728199437)), allowedSolution0);
        org.junit.Assert.assertEquals(3.641000748882883E8, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(7.281988639402919E8, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0 , (-0.09489056177858377));
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(3735, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-0.09489056177858377), ((double)(3735)), allowedSolution0);
        org.junit.Assert.assertEquals(1867.4525547191106, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1.504632769052528E-36, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1060.2559180271674 , 1060.2559180271674 , 1060.2559180271674);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(14, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-6.032174644509064E-23), 1060.2559180271674, allowedSolution0);
        org.junit.Assert.assertEquals(530.1279590135837, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-6.032174644509064E-23), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-366.678476072));
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(728199423, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 712.776576621, ((double)(728199423)), allowedSolution0);
        org.junit.Assert.assertEquals(3.641000678882883E8, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(7.28198259183706E8, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-366.678476072));
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(728199437, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 712.776576621, ((double)(728199437)), allowedSolution0);
        org.junit.Assert.assertEquals(3.641000748882883E8, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(7.281935028124294E8, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        illinoisSolver0.solve(3735, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-0.09489056177858377), 1930.746, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(965.3255547191108, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(6.008405587225413E-10, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-366.678476072));
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        double double0 = pegasusSolver0.solve(728199403, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 712.776576621, 1418.574);
        org.junit.Assert.assertEquals(1065.6752883105, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1372.8759896187396, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(9587, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-936.9230718701311), 0.008333333333329196, allowedSolution0);
        org.junit.Assert.assertEquals((-468.4573692683989), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-622.0353454107791), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        illinoisSolver0.solve(3735, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-0.09489056177858377), 1930.746, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(965.3255547191108, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-8.965758960673982E-20), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(4.062448741381501E-29 , (-1.866852726275606E-6) , (-1.866852726275606E-6));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        pegasusSolver0.solve(233, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1.866852726275606E-6), 1.0E-6);
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = illinoisSolver0.solve(3735, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-2605.6139566297), 0.0, (-1252.2717170339));
        org.junit.Assert.assertEquals((-2605.6139566297), illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1.073741824E9);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(6, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.0E-6, ((double)(6)), (-211.0), allowedSolution0);
        org.junit.Assert.assertEquals(1.0E-6, illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(2.247331685367726E-5, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0 , 0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        illinoisSolver0.solve(1451, univariateRealFunction0, 0.0, 0.0, 768.1562722, allowedSolution0);
        org.junit.Assert.assertEquals(768.1562722, illinoisSolver0.getStartValue(), 0.01);
    }
}

