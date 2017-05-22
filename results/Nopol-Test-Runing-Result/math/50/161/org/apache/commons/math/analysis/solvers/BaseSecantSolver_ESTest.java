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
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(5, ((org.apache.commons.math.analysis.UnivariateRealFunction)(xMinus5Function0)), ((double)(5)), 1.0E-6, (-3018.553496686), allowedSolution0);
        org.junit.Assert.assertEquals((-3018.553496686), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(5.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-513.0225410951));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = illinoisSolver0.solve(108, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), ((double)(108)), 0.0, 2805.99);
        org.junit.Assert.assertEquals(108.0, illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1461.85182 , 0.0 , 0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = pegasusSolver0.solve(3, univariateRealFunction0, 0.0, (-2287.580657334508), 0.0);
        org.junit.Assert.assertEquals((-2287.580657334508), double0, 0.01);
        org.junit.Assert.assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(1522.657);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        regulaFalsiSolver0.setup(4545, quinticFunction0, (-1723.165561), 0.0, (-1723.165561));
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(1.0 , 2472.3867296066 , 3315.2);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        regulaFalsiSolver0.solve(938, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.5, (-3290.81425));
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals(0.5, regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(0.5, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(1.582787129497305E-12 , 9.313225746154785E-10);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        regulaFalsiSolver0.solve(888997182, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-3.8593733717463117E17), 1.582787129497305E-12, allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals((-1.92968668587315584E17), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-7.650825096074468E-19), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = illinoisSolver0.solve(2131, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-784.78351), (-1.0), 0.19999954104423523, allowedSolution0);
        org.junit.Assert.assertEquals(0.19999954104423523, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-468.097305384933), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(2116, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-784.78351), (-1.0), (-239.73), allowedSolution0);
        org.junit.Assert.assertEquals((-1.0), illinoisSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-468.0973053848792), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1.0E-6);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(2116, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-784.78351), (-1.1636114149898762), (-239.73), allowedSolution0);
        org.junit.Assert.assertEquals((-1.1636114149898762), illinoisSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-9.424777960769225), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(2116, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-784.78351), (-1.0), (-239.73), allowedSolution0);
        org.junit.Assert.assertEquals((-239.73), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-468.097305384933), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.2222222089767456 , 0.36787944117144233 , 25.35437313687385);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(4, univariateRealFunction0, 0.2222222089767456, 0.36787944117144233, allowedSolution0);
        org.junit.Assert.assertEquals(0.29505082507409397, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.36787944117144233, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1.192232125766232E-5 , (-345.015115) , 1.0E-6);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(2116, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-784.78351), (-1.1636114149898762), (-239.73), allowedSolution0);
        org.junit.Assert.assertEquals((-239.73), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-235.61837572896627), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-2604.049801129) , (-345.015115) , 1.0E-6);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(2116, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-2604.049801129), 1846.73790073446, allowedSolution0);
        org.junit.Assert.assertEquals((-378.65595019727016), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-2601.237910019467), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-2604.049801129) , (-2604.049801129) , 1.0E-6);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(2116, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-784.78351), (-1.0), 1.0E-6, allowedSolution0);
        org.junit.Assert.assertEquals(1.0E-6, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-593.7610115284709), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-2604.049801129) , (-2604.049801129) , 1.0E-6);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(2116, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-784.78351), (-1.0), (-239.73), allowedSolution0);
        org.junit.Assert.assertEquals((-239.73), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-593.7610115284709), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        double double0 = regulaFalsiSolver0.solve(600, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1.0), 657.1562657624643, 1637.0632847913428);
        org.junit.Assert.assertEquals(657.1562657624643, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(656.5928646002668, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-2604.049801129) , (-345.015115) , 1.0E-6);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(2116, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-784.78351), (-1.0), (-239.73), allowedSolution0);
        org.junit.Assert.assertEquals((-1.0), illinoisSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-593.7610115284693), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1.0E-6);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(2116, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-782.5636807048941), (-1.1636114149898762), (-239.73), allowedSolution0);
        org.junit.Assert.assertEquals((-239.73), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-166.50441106608912), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        double double0 = regulaFalsiSolver0.solve(1282618401, ((org.apache.commons.math.analysis.UnivariateRealFunction)(xMinus5Function0)), ((double)(0)), ((double)(1282618401)));
        org.junit.Assert.assertEquals(1.282618401E9, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(5.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(598, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), ((double)(598)), 0.0, 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(598.0, illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(598, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), 0.0, ((double)(598)), allowedSolution0);
        org.junit.Assert.assertEquals(598.0, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        double double0 = regulaFalsiSolver0.solve(600, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1.0), 657.0, 1637.0632847913428);
        org.junit.Assert.assertEquals(1637.0632847913428, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(656.5928646002692, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        illinoisSolver0.solve(1351, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-784.78351), (-1.0), (-784.78351), allowedSolution0);
    }
}

