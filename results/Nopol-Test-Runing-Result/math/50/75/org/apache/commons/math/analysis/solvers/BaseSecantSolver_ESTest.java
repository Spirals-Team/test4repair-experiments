package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.125 , 0.125);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(1716, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1.035339851490575), 1889.0, (-1599.3895705), allowedSolution0);
        org.junit.Assert.assertEquals((-1599.3895705), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
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
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0 , 0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        regulaFalsiSolver0.solve(773, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), 3583.889343486809, 0.0, allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals(1791.9446717434046, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0 , 0.0 , 0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        regulaFalsiSolver0.solve(67, univariateRealFunction0, 2.96123507E-316, (-989.9395), (-989.9395), allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals((-989.9395), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2.96123507E-316, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-3489.012069923239) , 2147.78481309 , 0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        illinoisSolver0.solve(4156, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-2661.076757), 5.23774898406112E-309, (-3489.012069923239), allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals((-3489.012069923239), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-2661.076757), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.125 , 0.125);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(1716, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-0.4741591316148197), 1889.0, (-1599.3895705), allowedSolution0);
        org.junit.Assert.assertEquals((-1599.3895705), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.007640381114796577, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(31.320818690948315 , 31.320818690948315);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(199, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-2.356194490192345), 31.320818690948315, 31.320818690948315, allowedSolution0);
        org.junit.Assert.assertEquals(31.320818690948315, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(30.98397974334872, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(31.320818690948315 , 31.320818690948315);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(199, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-2.356194490192345), 31.320818690948315, 31.320818690948315, allowedSolution0);
        org.junit.Assert.assertEquals(31.320818690948315, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(30.98397974334872, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(199, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-2.356194490192345), ((double)(199)), ((double)(199)), allowedSolution0);
        org.junit.Assert.assertEquals(199.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(197.92033617615698, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(194, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-2.356194490192345), ((double)(194)), ((double)(194)), allowedSolution0);
        org.junit.Assert.assertEquals(194.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(191.63715186894584, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = illinoisSolver0.solve(30, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2536.361), ((double)(30)), ((double)(30)));
        org.junit.Assert.assertEquals((-2536.361), illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals((-1448.2742133048946), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(3160, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-584.2536753931414), 0.031, allowedSolution0);
        org.junit.Assert.assertEquals((-292.11133769657073), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(3.5E-323, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(2015, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-2.356194490192345), 3974.6922, 3974.6922, allowedSolution0);
        org.junit.Assert.assertEquals(3974.6922, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(3974.1147067911097, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(1.0E-6 , 1.0E-6 , 1.0E-6);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(199, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-2.356194490192345), 3974.6922, 3974.6922, allowedSolution0);
        org.junit.Assert.assertEquals(3974.6922, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(3974.1147067911097, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(3160, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-559.8843111753359), 0.031, allowedSolution0);
        org.junit.Assert.assertEquals((-279.926655587668), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-2.616880796694137E-17), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(199, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-2.356194490192345), 3974.6922, 3974.6922, allowedSolution0);
        org.junit.Assert.assertEquals(3974.6922, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(3974.1147067911097, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(4156, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-2661.076757), 5.23774898406112E-309, (-3489.012069923239), allowedSolution0);
        org.junit.Assert.assertEquals((-3489.012069923239), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-4.526133679786076E-154), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(3160, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-583.070316), 0.031, allowedSolution0);
        org.junit.Assert.assertEquals((-291.51965800000005), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(8.9215087890625E-7, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.125 , 0.125);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(1716, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-3.896299246239511E-298), 1889.0, (-1599.3895705), allowedSolution0);
        org.junit.Assert.assertEquals((-1599.3895705), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.125 , 0.125);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(1291, univariateRealFunction0, (-4.848465601082039E-10), (-4.503599627370496E15), allowedSolution0);
        org.junit.Assert.assertEquals((-4.503599627370496E15), pegasusSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-4.503599627370496E15), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = regulaFalsiSolver0.solve(1819, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.0, ((double)(0)), 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        illinoisSolver0.solve(30, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2758.27859548), ((double)(30)), ((double)(30)));
    }
}

