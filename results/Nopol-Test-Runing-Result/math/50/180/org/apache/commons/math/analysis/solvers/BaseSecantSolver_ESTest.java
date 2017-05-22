package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(2498, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 1.0, 1317.37548499, ((double)(2498)), allowedSolution0);
        org.junit.Assert.assertEquals(2498.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values();
        org.junit.Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf("PEGASUS");
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1478.0 , 0.0);
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(1905, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.0, 0.0, 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-83.377946689) , 0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        double double0 = regulaFalsiSolver0.solve(3626, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), 0.0, (-83.377946689), (-233.68499269119));
        org.junit.Assert.assertEquals((-83.377946689), regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(1477.71097215 , 1477.71097215);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        regulaFalsiSolver0.setup(855, univariateRealFunction0, 855, 0.0, 0.0);
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-1.0) , (-1.0) , (-1.0));
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        pegasusSolver0.solve(226, ((org.apache.commons.math.analysis.UnivariateRealFunction)(xMinus5Function0)), (-1.0), ((double)(226)), ((double)(226)), allowedSolution0);
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals(226.0, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(5.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1.329 , 1.329);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(4, univariateRealFunction0, (-1198.0), 1.329, allowedSolution0);
        org.junit.Assert.assertEquals((-598.3355), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1124.2383727521617), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(2762, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.3287406718783419, ((double)(31)), 1.3287406718783419, allowedSolution0);
        org.junit.Assert.assertEquals(1.3287406718783419, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(21.991148575128555, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(2768.9567595 , 1.0);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(4, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.0, 2768.9567595, allowedSolution0);
        org.junit.Assert.assertEquals(1384.97837975, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1310.7188093891793, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(2768.9567595 , 1.0);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = pegasusSolver0.solve(24, univariateRealFunction0, (-1198.0), 1.0, allowedSolution0);
        org.junit.Assert.assertEquals(1.0, pegasusSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-624.8574099906533), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(2768.9567595 , 1.0);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = pegasusSolver0.solve(4, univariateRealFunction0, 1.0, 1070.942819496, 1070.942819496);
        org.junit.Assert.assertEquals(1070.942819496, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(390.82210187248893, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1.0 , 2768.9567595 , 1.0);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(2762, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.0, ((double)(4)), 397.2119369351686, allowedSolution0);
        org.junit.Assert.assertEquals(397.2119369351686, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2.579462454848934, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1.3287406718783419 , 1.3287406718783419 , 1.3287406718783419);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = pegasusSolver0.solve(4, univariateRealFunction0, (-1198.0), 1.3287406718783419, allowedSolution0);
        org.junit.Assert.assertEquals(1.3287406718783419, pegasusSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-1110.0333797171834), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1.0 , 2768.9567595 , 1.0);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(4, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.0, 2768.9567595, allowedSolution0);
        org.junit.Assert.assertEquals(1.0, pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1310.7188093891793, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1.0 , 2768.9567595 , 1.0);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(4, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.0, 2768.9567595, allowedSolution0);
        org.junit.Assert.assertEquals(1.0, pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1.3287406718783419 , 1.3287406718783419 , 1.3287406718783419);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(2762, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.3287406718783419, ((double)(4)), 1.3287406718783419, allowedSolution0);
        org.junit.Assert.assertEquals(1.3287406718783419, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(4.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1.0 , 2768.9567595 , 1.0);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = pegasusSolver0.solve(4, univariateRealFunction0, (-1198.0), 1.0, allowedSolution0);
        org.junit.Assert.assertEquals((-1198.0), pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1.0 , 2768.9567595 , 1.0);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = pegasusSolver0.solve(4, univariateRealFunction0, (-1198.0), 1.0, allowedSolution0);
        org.junit.Assert.assertEquals(1.0, pegasusSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-624.8574099906533), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        double double0 = regulaFalsiSolver0.solve(127, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-275.7219), ((double)(127)), (-275.7219));
        org.junit.Assert.assertEquals(127.0, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-235.61944901923448), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(89, univariateRealFunction0, (-1100.265943532), 1.5874010519681994, allowedSolution0);
        org.junit.Assert.assertEquals((-1100.265943532), regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals((-331.4380259537232), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        regulaFalsiSolver0.solve(3846, univariateRealFunction0, 1.0, (-781.0), 1.0E-6, allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals(1.0E-6, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-781.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(1477.71097215 , 1477.71097215);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        regulaFalsiSolver0.solve(855, univariateRealFunction0, 0.0, 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        regulaFalsiSolver0.solve(3846, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-4.4094866234946765E-14), 0.3956831015156119, allowedSolution0);
    }
}

