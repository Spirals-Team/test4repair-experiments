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
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(univariateRealFunction0);
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(2, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.0, (-1232.28634), allowedSolution0);
        org.junit.Assert.assertEquals((-1232.28634), pegasusSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.17496926661752185);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(275, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-1.0), 0.17496926661752185, (-1.0), allowedSolution0);
        org.junit.Assert.assertEquals((-1.0), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(165.03601 , 0.99);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(univariateRealFunction0);
        double double0 = pegasusSolver0.solve(1023, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), ((double)(1023)), 0.0, 0.0);
        org.junit.Assert.assertEquals(1023.0, pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-1.0) , (-2863.67825671518));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = pegasusSolver0.solve(398, univariateRealFunction0, 0.0, (-2863.67825671518), 0.5);
        org.junit.Assert.assertEquals(0.5, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-2863.67825671518), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        illinoisSolver0.setup(367, quinticFunction0, 1.0E-6, 0.0, 367);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        illinoisSolver0.setup(367, quinticFunction0, 1.0E-6, (-1.0), 367);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(2265.42999842671 , 2265.42999842671);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(14, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.75, 1372.3588667886, 1.0E-6, allowedSolution0);
        org.junit.Assert.assertEquals(1372.3588667886, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(2265.42999842671 , 2265.42999842671);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(14, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1261.5704389), ((double)(14)), allowedSolution0);
        org.junit.Assert.assertEquals((-623.78521945), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1247.7791049070356), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(2265.82177);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(9, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1261.5704389), ((double)(9)), allowedSolution0);
        org.junit.Assert.assertEquals(9.0, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-1240.467552804072), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(2265.82177);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(3, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1261.5704389), ((double)(3)), allowedSolution0);
        org.junit.Assert.assertEquals((-629.28521945), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1241.1158876473717), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1.0E-6 , 1.0E-6);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(2930, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-4139.855530522), (-1736.2), allowedSolution0);
        org.junit.Assert.assertEquals((-2938.027765261), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-3226.4156476147914), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(2265.82177);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        double double0 = regulaFalsiSolver0.solve(911, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 2.0361168711330653E-10, 1350.5, 1350.5);
        org.junit.Assert.assertEquals(1350.5, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1350.1246925164533, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(2265.82177 , 2265.82177 , 2265.82177);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(14, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 1.3105776597833636, 2265.82177, allowedSolution0);
        org.junit.Assert.assertEquals(1133.5661738298916, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2265.82177, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(14, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1261.5704389), ((double)(14)), allowedSolution0);
        org.junit.Assert.assertEquals(14.0, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-1247.2122834751478), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(2265.82177 , 2265.82177 , 2265.82177);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(14, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1261.5704389), 0.5, allowedSolution0);
        org.junit.Assert.assertEquals(0.5, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-1260.5533035658682), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1.0E-6 , 1.0E-6 , 1.0E-6);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(2930, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-4139.855530522), (-1736.2), allowedSolution0);
        org.junit.Assert.assertEquals((-1736.2), illinoisSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-1737.3007352398367), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(2265.82177 , 2265.82177 , 2265.82177);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(2065, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-0.3058015757857271), ((double)(14)), allowedSolution0);
        org.junit.Assert.assertEquals(14.0, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-0.3058015757857271), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        double double0 = regulaFalsiSolver0.solve(911, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 2.0361168711330653E-10, 1350.5, 1350.5);
        org.junit.Assert.assertEquals(1350.5, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1347.743248390022, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(14, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1261.5704389), 1.2843, allowedSolution0);
        org.junit.Assert.assertEquals((-630.14306945), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1259.778653425739), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        illinoisSolver0.solve(3266, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-2627.3423302), 745.2127335776034, 745.2127335776034, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(745.2127335776034, illinoisSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(744.5574589007812, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(437.219);
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        double double0 = regulaFalsiSolver0.solve(77, ((org.apache.commons.math.analysis.UnivariateRealFunction)(xMinus5Function0)), (-2590.143), ((double)(77)));
        org.junit.Assert.assertEquals((-1256.5715), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(5.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0 , (-1069.785));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(372, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1069.785), 0.0, (-507.1911582), allowedSolution0);
        org.junit.Assert.assertEquals((-1069.785), regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }
}

