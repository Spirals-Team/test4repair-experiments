package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-6244.1827704808875) , (-6244.1827704808875) , (-1631.046989943531));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(univariateRealFunction0);
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(2, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-1330.1471445127), (-1193.0), (-4193.591958437), allowedSolution0);
        org.junit.Assert.assertEquals((-4193.591958437), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1330.1471445127), double0, 0.01);
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
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0 , 1484.3008661057);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(5, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), ((double)(5)), 0.0, 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = pegasusSolver0.solve(3249, univariateRealFunction0, ((double)(3249)), (-1.7976931348623157E308), ((double)(3249)));
        org.junit.Assert.assertEquals(3249.0, pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals((-1.7976931348623157E308), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.16147567905222449 , 0.16147567905222449 , 0.16147567905222449);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        regulaFalsiSolver0.solve(67, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.16147567905222449, 0.5, allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals(0.16147567905222449, regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(0.5, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(2024.1161);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(660, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-812.21), 1.0E-14, (-812.21), allowedSolution0);
        org.junit.Assert.assertEquals((-812.21), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1.0E-14, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-3891.03749705) , 4147.2125568 , 4147.2125568);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(67, univariateRealFunction0, 0.16147567905222449, 0.5, allowedSolution0);
        org.junit.Assert.assertEquals(0.33073783952611224, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.5, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(4334.862939999992 , 0.036);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(5, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.036, ((double)(5)), allowedSolution0);
        org.junit.Assert.assertEquals(2.5180000000000002, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(4.2010365118541095, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.14062500002 , 1.0E-6);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(1832, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.37500000000227374, ((double)(1832)), allowedSolution0);
        org.junit.Assert.assertEquals(0.37500000000227374, pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1831.5483409415713, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.14062500002154948 , 1.0E-6);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(1832, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.37500000000227374, ((double)(1832)), allowedSolution0);
        org.junit.Assert.assertEquals(0.37500000000227374, pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1831.5483409415713, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(4334.862939999992 , 0.036);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(5, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.036, ((double)(5)), allowedSolution0);
        org.junit.Assert.assertEquals(2.5180000000000002, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(4.2010365118541095, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(((double)(51)) , 1.4456468917292502E-16);
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(49, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-1875.0), ((double)(49)), allowedSolution0);
        org.junit.Assert.assertEquals((-913.0), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1875.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1223.8 , 1223.8);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = illinoisSolver0.solve(877927295, univariateRealFunction0, 1223.8, ((double)(877927295)), 103.015);
        org.junit.Assert.assertEquals(103.015, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2.1614254010570467E8, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.16147567905222449 , 0.16147567905222449 , 0.16147567905222449);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(67, univariateRealFunction0, 0.16147567905222449, 0.5, allowedSolution0);
        org.junit.Assert.assertEquals(0.16147567905222449, regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(0.271956127951169, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(1832, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.5382167547941096, ((double)(1832)), allowedSolution0);
        org.junit.Assert.assertEquals(0.5382167547941096, pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1831.5485170428497, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-812.21) , (-812.21));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(660, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-812.21), 1.0E-14, 1937.7613, allowedSolution0);
        org.junit.Assert.assertEquals(1937.7613, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1.6789230698117E-310, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(1832, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.37500000000227374, ((double)(1832)), allowedSolution0);
        org.junit.Assert.assertEquals(0.37500000000227374, pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1831.5485170440331, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        double double0 = illinoisSolver0.solve(613338729, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.9998398410291656, ((double)(613338729)), 3178.814188);
        org.junit.Assert.assertEquals(6.13338729E8, illinoisSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(6.133387289368514E8, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(1832, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.5382167547941096, ((double)(1832)), allowedSolution0);
        org.junit.Assert.assertEquals(0.5382167547941096, pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(1831.5485170428494, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.5 , (-2675.57630509) , 1024.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        regulaFalsiSolver0.solve(1035, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), ((double)(1035)), 0.0, allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals(1035.0, regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = illinoisSolver0.solve(1037, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.0, ((double)(1037)), (-1246.2665));
        org.junit.Assert.assertEquals((-1246.2665), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-276.28) , (-276.28));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        regulaFalsiSolver0.solve(660, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-812.21), 1.0E-14, 1937.7613, allowedSolution0);
        regulaFalsiSolver0.doSolve();
    }
}

