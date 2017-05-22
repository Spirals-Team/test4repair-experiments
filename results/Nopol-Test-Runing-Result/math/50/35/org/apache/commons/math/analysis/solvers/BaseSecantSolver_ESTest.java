package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values();
        org.junit.Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf("ILLINOIS");
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = pegasusSolver0.solve(746, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), ((double)(746)), 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(373.0, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-1425.4) , (-1425.4));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = regulaFalsiSolver0.solve(1942, univariateRealFunction0, (-1425.4), ((double)(1942)), allowedSolution0);
        org.junit.Assert.assertEquals(258.29999999999995, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1425.4), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = illinoisSolver0.solve(java.lang.Integer.MAX_VALUE, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-2461.5010863176), 0.0, 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(2096.55971103);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        pegasusSolver0.solve(1004, univariateRealFunction0, (-1069.9773331), 2922.5779732119886, ((double)(1004)));
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals(1004.0, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1069.9773331), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.5 , 0.5);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(1344, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.04168701738764507, ((double)(1344)), 0.5, allowedSolution0);
        org.junit.Assert.assertEquals(0.5, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1341.4600628161, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(24.18346493848108 , (-383.6374626567826) , 0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(2299, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.0, 1669.3, 1344.1734051857318, allowedSolution0);
        org.junit.Assert.assertEquals(5, monitoredFunction0.getCallsCount());
        org.junit.Assert.assertEquals(1668.4028795329286, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.333333333333333 , (-383.63746265678265) , 0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(2279, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.0, ((double)(2279)), 5.0, allowedSolution0);
        org.junit.Assert.assertEquals(5.0, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2278.0257275802455, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-623.0) , 5.5344232771374716E-5);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(java.lang.Integer.MAX_VALUE, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-1854.0), 1.5830993332061267E-10, 0.0, allowedSolution0);
        org.junit.Assert.assertEquals((-2.933483064198878E-7), double0, 0.01);
        org.junit.Assert.assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.333333333333333 , (-383.63746265678265) , 0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(2303, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.0, 5.0, 1344.1734051857318, allowedSolution0);
        org.junit.Assert.assertEquals(1344.1734051857318, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(3.2544642357220774, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.5 , 0.5 , 0.5);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(1283, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-9.501787376057395), ((double)(1283)), 0.5, allowedSolution0);
        org.junit.Assert.assertEquals(0.5, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1175.4815496764697, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(1344, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.0, ((double)(1344)), (-1229.761396), allowedSolution0);
        org.junit.Assert.assertEquals((-1229.761396), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1344.601655736435, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(1344, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.04168701738764507, ((double)(1344)), 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(1341.4600628161, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0 , 1.5830993332061267E-10);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        illinoisSolver0.solve(java.lang.Integer.MAX_VALUE, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-623.0), 1.5830993332061267E-10, 797.0667, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(797.0667, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(7.794303767674833E-18, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0 , 1.5830993332061267E-10);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(java.lang.Integer.MAX_VALUE, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-2461.5010863176), 1.5830993332061267E-10, 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-3.083258161520777E-17), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        double double0 = regulaFalsiSolver0.solve(1369, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.04168701738764507, ((double)(1369)), (-1.0));
        org.junit.Assert.assertEquals(0.04168701738764507, regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1366.59280431156, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(1369, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.04168701738764507, ((double)(1369)), 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(0.04168701738764507, regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1366.5928043115655, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(1344, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.04168701738764507, ((double)(1344)), 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(0.04168701738764507, regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1341.460063082842, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = illinoisSolver0.solve(java.lang.Integer.MAX_VALUE, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-2461.5010863176), 1.5830993332061267E-10, (-1702.9215892577568), allowedSolution0);
        org.junit.Assert.assertEquals((-1702.9215892577568), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-3.8952176287941417E-7), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0 , 0.0);
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(201, ((org.apache.commons.math.analysis.UnivariateRealFunction)(xMinus5Function0)), (-217.87755), ((double)(201)), allowedSolution0);
        org.junit.Assert.assertEquals((-217.87755), regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(5.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-0.5) , (-0.5) , 2142.69);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = regulaFalsiSolver0.solve(3, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1567.374019132), 0.5, 2142.69);
        org.junit.Assert.assertEquals(0.5, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(0.5, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        regulaFalsiSolver0.solve(6502, univariateRealFunction0, 0.0, 496.953449268034, 0.0);
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals(496.953449268034, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }
}

