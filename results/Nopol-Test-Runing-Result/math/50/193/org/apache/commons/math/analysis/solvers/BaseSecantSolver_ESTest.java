package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = regulaFalsiSolver0.solve(1212, univariateRealFunction0, ((double)(1212)), (-3220.533253222499), (-3220.533253222499), allowedSolution0);
        org.junit.Assert.assertEquals((-3220.533253222499), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-3220.533253222499), double0, 0.01);
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
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(3887.8 , (-750.6034347));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(10632, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-750.6034347), 0.07490822288864472, allowedSolution0);
        org.junit.Assert.assertEquals((-375.26426323855566), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.07490822288864472, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(1259, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.0, (-875.165), 2607.89883, allowedSolution0);
        org.junit.Assert.assertEquals(2607.89883, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(2.85040095144011776E17 , 2.85040095144011776E17);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        pegasusSolver0.solve(java.lang.Integer.MAX_VALUE, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.0, ((double)(java.lang.Integer.MAX_VALUE)), 0.0);
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1.0 , 0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        illinoisSolver0.solve(1126, univariateRealFunction0, (-1430.033), 0.0, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals((-715.0165), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1430.033), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1520.8389);
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(43, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1.2575465430691556E-4), 1520.8389, 0.3333333333332802, allowedSolution0);
        org.junit.Assert.assertEquals(0.3333333333332802, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.6303797177054093, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1520.8389);
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(43, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), ((double)(43)), 1520.8389, ((double)(43)), allowedSolution0);
        org.junit.Assert.assertEquals(43.0, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(43.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1520.8389);
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(43, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1.2575465430691556E-4), 1520.8389, 1036.71079120695, allowedSolution0);
        org.junit.Assert.assertEquals(1036.71079120695, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.6303797177054093, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1520.8389);
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(227264985, univariateRealFunction0, (-2.2250738585072014E-308), 2535.2682431, (-83.6), allowedSolution0);
        org.junit.Assert.assertEquals((-83.6), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1267.6369200851773, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1520.8389);
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(6, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), ((double)(6)), 1520.8389, ((double)(6)), allowedSolution0);
        org.junit.Assert.assertEquals(6.0, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(732.4908252795514, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(2.85040095144011776E17);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        pegasusSolver0.solve(java.lang.Integer.MAX_VALUE, univariateRealFunction0, 0.0, ((double)(java.lang.Integer.MAX_VALUE)), 0.0);
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals(1.2715756694106712E9, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(43, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1.2575465430691556E-4), 1548.6733210387677, 3.1645034745843077, allowedSolution0);
        org.junit.Assert.assertEquals(3.1645034745843077, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(5.779983852554353E-26, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(2146760832, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1.2575465430691556E-4), 2507.1148943352446, 0.3333333333332802, allowedSolution0);
        org.junit.Assert.assertEquals(0.3333333333332802, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1.7149763597082424E-13, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1520.8389 , ((double)(2146760832)) , ((double)(2146760832)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(52, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 501.248491, 1520.8389, 0.3333333333332802, allowedSolution0);
        org.junit.Assert.assertEquals(0.3333333333332802, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1520.8389, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-1.3509355296465255));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(2146760830, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1.2575465430691556E-4), 1520.8389, 0.3333333333, allowedSolution0);
        org.junit.Assert.assertEquals(0.3333333333, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-7.1746481373430634E-43), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-373.96947));
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(univariateRealFunction0);
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(14, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-373.96947), 2917.321009976657, 2917.321009976657, allowedSolution0);
        org.junit.Assert.assertEquals(2917.321009976657, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2841.570203253878, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-373.96947));
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        double double0 = regulaFalsiSolver0.solve(389360050, univariateRealFunction0, (-1119.613), (-4.470168341785966E-5), (-373.96947));
        org.junit.Assert.assertEquals((-373.96947), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-4.493409457909064), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1520.8389);
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(43, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1.2575465430691556E-4), 1520.8389, 1036.71079120695, allowedSolution0);
        org.junit.Assert.assertEquals(1036.71079120695, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1.2575465430691556E-4), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(((double)(-1658)));
        double double0 = pegasusSolver0.solve(1382, ((org.apache.commons.math.analysis.UnivariateRealFunction)(xMinus5Function0)), (-42.74030983594), 319.1503471, (-42.74030983594));
        org.junit.Assert.assertEquals((-42.74030983594), pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(5.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1520.8389 , ((double)(2146760832)) , ((double)(2146760832)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(52, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 501.248491, 1520.8389, 0.3333333333332802, allowedSolution0);
        org.junit.Assert.assertEquals(0.3333333333332802, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1281.1372190191928, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1.0 , 0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        illinoisSolver0.solve(1126, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-1430.033), 0.0, allowedSolution0);
    }
}

