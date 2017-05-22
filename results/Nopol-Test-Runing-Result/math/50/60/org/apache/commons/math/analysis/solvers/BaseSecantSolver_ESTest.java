package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = regulaFalsiSolver0.solve(255, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 1.0, ((double)(255)), ((double)(255)));
        org.junit.Assert.assertEquals(255.0, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values();
        org.junit.Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf("ILLINOIS");
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(1738, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.0, ((double)(1738)), allowedSolution0);
        org.junit.Assert.assertEquals(869.0, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0 , 0.0 , 0.625);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(1177, univariateRealFunction0, (-269.289002721308), (-2282.0042700474), (-679.493015), allowedSolution0);
        org.junit.Assert.assertEquals((-679.493015), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-2282.0042700474), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = regulaFalsiSolver0.solve(255, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.0, (-1693.568099732), 3763.85634);
        org.junit.Assert.assertEquals((-1693.568099732), regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(1023, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), ((double)(1023)), 2898.35, ((double)(1023)), allowedSolution0);
        org.junit.Assert.assertEquals(1023.0, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2569.8227906364505, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(1023, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), ((double)(1023)), 2898.3496680270728, 223.45574354738, allowedSolution0);
        org.junit.Assert.assertEquals(223.45574354738, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1941.5042599184924, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0 , 795.36193);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(1496, univariateRealFunction0, 2.0, 1377.14, allowedSolution0);
        org.junit.Assert.assertEquals(689.57, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1371.6155767220234, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        pegasusSolver0.setup(137, sinFunction0, 137, 4456.36185, 6.881225132664271);
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals(980.1769079200158, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(737.3895065 , 11.263728146946836 , 11.263728146946836);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(univariateRealFunction0);
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(828, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-1561.16473), ((double)(828)), allowedSolution0);
        org.junit.Assert.assertEquals(5, monitoredFunction0.getCallsCount());
        org.junit.Assert.assertEquals(440.9708032893344, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(2143672144, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-944.78653208), 3.0, allowedSolution0);
        org.junit.Assert.assertEquals((-470.89326604), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-728.849495632832), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(2143672144, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-944.78653208), 3.0, allowedSolution0);
        org.junit.Assert.assertEquals(3.0, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-728.8494954988815), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(737.3895065 , 11.263728146946836 , 11.263728146946836);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(2143672144, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-944.78653208), 0.5, allowedSolution0);
        org.junit.Assert.assertEquals((-472.14326604), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-371.1897210115454), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(2143672144, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-944.78653208), 3.0, allowedSolution0);
        org.junit.Assert.assertEquals((-470.89326604), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-728.8494954988815), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(2143672151, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-944.78653208), 0.5, allowedSolution0);
        org.junit.Assert.assertEquals((-472.14326604), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-18.84955592153876), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(2143672144, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-944.78653208), 0.5, allowedSolution0);
        org.junit.Assert.assertEquals(0.5, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-18.849556921538756), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-0.5) , (-0.5) , 0.7076665202829873);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)));
        double double0 = illinoisSolver0.solve(133, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-1492.5547339578), 0.5718793159141403, (-0.5));
        org.junit.Assert.assertEquals(5, monitoredFunction0.getCallsCount());
        org.junit.Assert.assertEquals((-1492.2442085397374), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(1023, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), ((double)(1023)), 2898.3496680270728, 0.5, allowedSolution0);
        org.junit.Assert.assertEquals(0.5, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1941.5042599184924, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        double double0 = regulaFalsiSolver0.solve(335791812, ((org.apache.commons.math.analysis.UnivariateRealFunction)(xMinus5Function0)), (-1858.6603836805948), 1690.069354358639, (-1858.6603836805948));
        org.junit.Assert.assertEquals((-1858.6603836805948), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(5.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-959.63001407586) , 0.5);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = illinoisSolver0.solve(15, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-959.63001407586), 0.0, 0.0, allowedSolution0);
        org.junit.Assert.assertEquals((-959.63001407586), illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        pegasusSolver0.setup(2887, sinFunction0, 0.0, 0.0, 0.0);
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        regulaFalsiSolver0.solve(2143672151, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-944.78653208), 0.5, allowedSolution0);
        regulaFalsiSolver0.doSolve();
    }
}

