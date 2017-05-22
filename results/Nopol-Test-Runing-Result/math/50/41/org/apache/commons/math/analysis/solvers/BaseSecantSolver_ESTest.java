package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-1874.462353454005));
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        double double0 = pegasusSolver0.solve(1293, ((org.apache.commons.math.analysis.UnivariateRealFunction)(xMinus5Function0)), (-1874.462353454005), 1978.317306384737, 1978.317306384737);
        org.junit.Assert.assertEquals(1978.317306384737, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(5.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(1102, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), ((double)(1102)), 1.0, 0.14285714285714285, allowedSolution0);
        org.junit.Assert.assertEquals(0.14285714285714285, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf("PEGASUS");
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values();
        org.junit.Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(1102, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.0, 1.0, 0.14285714285714285, allowedSolution0);
        org.junit.Assert.assertEquals(0.14285714285714285, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(630.41771448114 , 0.0 , 630.41771448114);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        pegasusSolver0.solve(1274, univariateRealFunction0, 0.0, 1.0E-6, allowedSolution0);
        pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals(5.0E-7, pegasusSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(2720.189456914537 , 2.0 , 0.5);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(261, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-47.1238898038469), 2720.189456914537, 2.0, allowedSolution0);
        org.junit.Assert.assertEquals(2.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2720.189456914537, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(2720.189456914537 , 2.0 , 2.0);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(257, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-47.1238898038469), 2720.189456914537, 2.0, allowedSolution0);
        org.junit.Assert.assertEquals(2.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-47.123885488419546), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(2444.95023 , 0.560027378010827 , 2444.95023);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(261, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-47.1238898038469), 26.914484140738182, 0.560027378010827, allowedSolution0);
        org.junit.Assert.assertEquals(0.560027378010827, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(22.67725599152373, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(2444.95022881 , 2.0 , 0.5);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(261, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-47.1238898038469), 2.0, 2.0, allowedSolution0);
        org.junit.Assert.assertEquals(2.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1.9999952410178599, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(2444.95023 , 0.560027378010827 , 0.5);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(261, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-47.1238898038469), 26.914484140738182, 0.560027378010827, allowedSolution0);
        org.junit.Assert.assertEquals(0.560027378010827, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-47.1238898038469), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(2444.95023 , 0.560027378010827 , 0.5);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(261, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.560027378010827, 26.914484140738182, 0.560027378010827, allowedSolution0);
        org.junit.Assert.assertEquals(0.560027378010827, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(26.914484140738182, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(126, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 2.4999724819560025E-7, 47.12389080383605, ((double)(126)), allowedSolution0);
        org.junit.Assert.assertEquals(126.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(56.548667764616305, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(2444.95022881 , 0.560027378010827 , 0.5);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        regulaFalsiSolver0.solve(261, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-47.1238898038469), 1.0E-6, 0.560027378010827, allowedSolution0);
        org.junit.Assert.assertEquals(0.560027378010827, regulaFalsiSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(2.0 , 0.560027378010827 , 0.5);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        regulaFalsiSolver0.solve(261, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-47.1238898038469), 1.0E-6, 0.560027378010827, allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals(0.560027378010827, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(9.9999994927524E-7, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-1749.3));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(1253, univariateRealFunction0, (-1749.3), 0.1111111111111111, allowedSolution0);
        org.junit.Assert.assertEquals(0.1111111111111111, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-70.68583470577045), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(126, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 2.4999724819560025E-7, 47.12389080383605, ((double)(126)), allowedSolution0);
        org.junit.Assert.assertEquals(126.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(47.12388980384692, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-1749.3));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(1253, univariateRealFunction0, (-1749.3), 0.0, allowedSolution0);
        org.junit.Assert.assertEquals((-874.65), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1170.243263462198), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-1874.462353454005));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = pegasusSolver0.solve(1293, univariateRealFunction0, (-1874.462353454005), 1978.317306384737, 1978.317306384737);
        org.junit.Assert.assertEquals((-1874.462353454005), pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1977.6325754347747, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.167 , (-1.546907122064593) , (-1.546907122064593));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = illinoisSolver0.solve(2047, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1.546907122064593), 0.167, ((double)(2047)));
        org.junit.Assert.assertEquals(2047.0, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-0.49999999999999994));
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(997, univariateRealFunction0, 1.2246467991473532E-16, (-21.986923), allowedSolution0);
        org.junit.Assert.assertEquals((-21.986923), illinoisSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(1.2246467991473532E-16, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(2.0 , 0.560027378010827);
        org.junit.Assert.assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        regulaFalsiSolver0.solve(1405, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-50.18109298), 0.0, (-1487.265554980558));
        regulaFalsiSolver0.doSolve();
    }
}

