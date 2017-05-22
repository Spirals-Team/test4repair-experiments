package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0 , 0.12954894024348937 , 1041.2890944);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(358094239, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 1.0, 1.0, allowedSolution0);
        org.junit.Assert.assertEquals(1.0, regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values();
        org.junit.Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf("REGULA_FALSI");
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0 , 0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(4573, univariateRealFunction0, 0.0, ((double)(4573)), (-3887.52415076587), allowedSolution0);
        org.junit.Assert.assertEquals((-3887.52415076587), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = pegasusSolver0.solve(40, univariateRealFunction0, 0.0, (-2770.058740741026), 0.2);
        org.junit.Assert.assertEquals(0.2, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-2770.058740741026), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        illinoisSolver0.solve(838, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.8585507738698142, ((double)(0)), allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(0.8585507738698142, illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        illinoisSolver0.solve(56, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.85855077, 1149.42, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(575.139275385, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(21.991148575128552, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        regulaFalsiSolver0.setup(311, univariateRealFunction0, (-0.24542353594711383), 6.617933848949409E-5, 894.6687668452);
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals((-1.5547370808493364E-10), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(836, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2108.9515032337), 1149.42, allowedSolution0);
        org.junit.Assert.assertEquals((-2108.9515032337), illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals((-650.3096792930872), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(834.160949156594 , 834.160949156594);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(7, univariateRealFunction0, 834.160949156594, 1817.6593066681419, allowedSolution0);
        org.junit.Assert.assertEquals(834.160949156594, illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1047.655069575409, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(838, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.8585507738698142, 179.6653433545295, allowedSolution0);
        org.junit.Assert.assertEquals(90.26194706419966, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(103.67255756846332, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(838, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.9323489014210486, 179.92905220307793, allowedSolution0);
        org.junit.Assert.assertEquals(0.9323489014210486, illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(28.274333882308138, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(838, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2108.9515032337), 1147.6120015346994, allowedSolution0);
        org.junit.Assert.assertEquals((-480.66975084950036), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1316.3273218541235), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0 , 0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        pegasusSolver0.solve(1132, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-6.339947461906432E-7), 0.13333332538604736, allowedSolution0);
        org.junit.Assert.assertEquals(0.0666663456956506, pegasusSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(838, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.85855077, 1149.42, allowedSolution0);
        org.junit.Assert.assertEquals(575.139275385, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(21.991148578660955, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(838, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.9323489014210486, 179.6653433545295, allowedSolution0);
        org.junit.Assert.assertEquals(90.29884612797528, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(78.53981621896502, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(838, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.85855077, 1149.42, allowedSolution0);
        org.junit.Assert.assertEquals(575.139275385, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(21.991148578660955, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(838, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-904.027), 1149.42, allowedSolution0);
        org.junit.Assert.assertEquals((-904.027), illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals((-103.67255756846318), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(838, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.85855077, 1149.42, allowedSolution0);
        org.junit.Assert.assertEquals(575.139275385, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(21.991148575128552, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = illinoisSolver0.solve(23, univariateRealFunction0, 0.0, ((double)(23)), ((double)(23)));
        org.junit.Assert.assertEquals(23.0, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(7.853981633974483, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0 , 0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(1132, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-6.339947461906432E-7), 0.1333, allowedSolution0);
        org.junit.Assert.assertEquals(0.06664968300262691, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2.2958874039497803E-41, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-2726.89673084432) , (-0.6591675784091514));
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = regulaFalsiSolver0.solve(2963, ((org.apache.commons.math.analysis.UnivariateRealFunction)(xMinus5Function0)), (-2726.89673084432), ((double)(2963)), (-2726.89673084432), allowedSolution0);
        org.junit.Assert.assertEquals((-2726.89673084432), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(5.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = illinoisSolver0.solve(56, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-2392.19955457), ((double)(56)), ((double)(56)));
        org.junit.Assert.assertEquals(56.0, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1.0000000000000064, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0 , 0.0 , 0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        double double0 = pegasusSolver0.solve(4859, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), ((double)(4859)), 0.0, 0.0);
        org.junit.Assert.assertEquals(4859.0, pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(2147, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1346.2773474748035), (-1.0), 0.0, allowedSolution0);
        org.junit.Assert.assertEquals((-1.0), pegasusSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }
}

