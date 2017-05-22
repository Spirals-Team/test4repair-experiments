package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0 , 1.0E-6);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = regulaFalsiSolver0.solve(1594, univariateRealFunction0, 0.0, (-2071.259551475), ((double)(1594)));
        org.junit.Assert.assertEquals(1594.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-2071.259551475), double0, 0.01);
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
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(1385, univariateRealFunction0, (-2535.66025), 1388.1468740147, ((double)(1385)), allowedSolution0);
        org.junit.Assert.assertEquals(1385.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-2535.66025), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = pegasusSolver0.solve(181, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.0, (-3168.2961911453062), ((double)(181)));
        org.junit.Assert.assertEquals((-3168.2961911453062), pegasusSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(899.648 , 2055.2285443519036);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = pegasusSolver0.solve(2360, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-6740.082920832), (-3688.6400048855485), (-6740.082920832));
        org.junit.Assert.assertEquals((-6740.082920832), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-4571.748093522576), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        pegasusSolver0.solve(181, univariateRealFunction0, (-3874.94), 0.0, allowedSolution0);
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals((-1937.47), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-3168.2961911453067), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(899.648 , 2055.2285443519036);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(6, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 7.042804919579654E-4, ((double)(6)), allowedSolution0);
        org.junit.Assert.assertEquals(3.0003521402459787, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.015787780172241028, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(1172, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-3518.0), ((double)(1172)), 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(1172.0, pegasusSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(241.9026343264141, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(181, univariateRealFunction0, (-3874.94), 11.026406948187116, allowedSolution0);
        org.junit.Assert.assertEquals((-1931.9567965259064), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(10.995574301418602, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(181, univariateRealFunction0, (-3874.9), 0.0, allowedSolution0);
        org.junit.Assert.assertEquals((-1937.45), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-680.1548095021903), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(181, univariateRealFunction0, (-3874.94), 0.0, allowedSolution0);
        org.junit.Assert.assertEquals((-1937.47), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-3168.2961911453062), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(939, univariateRealFunction0, 4.511783980915, ((double)(939)), allowedSolution0);
        org.junit.Assert.assertEquals(471.75589199045754, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(611.0381345656078, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(220, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-3874.94), (-1.0), allowedSolution0);
        org.junit.Assert.assertEquals((-1937.97), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-3873.5837418762153), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(939, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-0.41746788188350836), ((double)(939)), allowedSolution0);
        org.junit.Assert.assertEquals(939.0, illinoisSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(1.744210824012484E-18, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(181, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-3874.94), (-1.0), allowedSolution0);
        org.junit.Assert.assertEquals((-1.0), pegasusSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-3873.5837418762153), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(220, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-3874.94), 0.0, allowedSolution0);
        org.junit.Assert.assertEquals((-1937.47), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-3873.58374187971), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(939, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 4.511783980915, ((double)(939)), allowedSolution0);
        org.junit.Assert.assertEquals(471.75589199045754, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(929.9114254763134, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-1027.828780842223) , (-2858.19708715) , 4.511783980915);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(939, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-6.660455916753376), ((double)(939)), allowedSolution0);
        org.junit.Assert.assertEquals(939.0, illinoisSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-2440.4527));
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        regulaFalsiSolver0.solve(1690, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.0, 0.0, (-1027.828780842223), allowedSolution0);
        regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals((-1027.828780842223), regulaFalsiSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-1027.828780842223) , (-2858.19708715) , 4.511783980915);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = illinoisSolver0.solve(939, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-6.660455916753376), ((double)(939)), allowedSolution0);
        org.junit.Assert.assertEquals(466.1697720416233, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1.4551277009288408), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(2240.993);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        pegasusSolver0.solve(126, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.7937005259840998, 1657.7832208938, 1860.111676502681);
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals(1657.7832208938, pegasusSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(0.7937005259839225, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        pegasusSolver0.solve(1172, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), ((double)(1172)), 0.0, allowedSolution0);
    }
}

