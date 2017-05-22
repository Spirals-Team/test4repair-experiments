package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(175.2802 , 175.2802 , 2.9808280810593163E-10);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(525, univariateRealFunction0, (-1868.6), 2.9808280810593163E-10, allowedSolution0);
        org.junit.Assert.assertEquals((-934.2999999998509), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2.9808280810593163E-10, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf("ILLINOIS");
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values();
        org.junit.Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(264, univariateRealFunction0, 0.0, ((double)(264)), 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1.0E-6 , 0.0);
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        illinoisSolver0.solve(422, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 48.27539, 0.0, 0.0);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(48.27539, illinoisSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-549.307887618375));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(3244, univariateRealFunction0, (-1086.24331543), 807.64532746938, ((double)(3244)), allowedSolution0);
        org.junit.Assert.assertEquals(3244.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(529.3583621298801, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-273.6) , 1516.20258860885 , (-273.6));
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(133, univariateRealFunction0, (-967.8), (-273.6), 0.1818181574344635, allowedSolution0);
        org.junit.Assert.assertEquals(0.1818181574344635, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-812.0469829844469), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        pegasusSolver0.solve(3437, univariateRealFunction0, 1.0, ((double)(3437)), allowedSolution0);
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals(1719.0, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(3435.33127609859, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-549.307887618375));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(477285303, univariateRealFunction0, (-1086.24331543), 807.64532746938, ((double)(477285303)), allowedSolution0);
        org.junit.Assert.assertEquals(4.77285303E8, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(529.3583621298801, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(3437, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-3860.0), (-1928.3950191653707), allowedSolution0);
        org.junit.Assert.assertEquals((-2894.1975095826856), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-2186.548486898496), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-273.6) , 1516.20258860885 , (-273.6));
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        double double0 = pegasusSolver0.solve(133, univariateRealFunction0, 1.5, ((double)(133)));
        org.junit.Assert.assertEquals(67.25, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(131.79245347786178, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(175.2802 , 27.7580310153246 , 27.7580310153246);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(546, univariateRealFunction0, (-1868.6), 27.7580310153246, allowedSolution0);
        org.junit.Assert.assertEquals(27.7580310153246, regulaFalsiSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-1843.6074905438727), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(3437, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1928.4), ((double)(3437)), allowedSolution0);
        org.junit.Assert.assertEquals(754.2999999999997, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(3041.0616886749194, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-1047.12713) , (-1047.12713) , 2320.207);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        regulaFalsiSolver0.solve(40, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), (-1.3438699868383645E-7), ((double)(40)), ((double)(40)), allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals(40.0, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1.343870010828141E-7), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(525, univariateRealFunction0, (-1868.6), 1.8379230800878759, allowedSolution0);
        org.junit.Assert.assertEquals((-933.381038459956), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1867.676297134591), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(3437, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1928.3950191653707), ((double)(3437)), allowedSolution0);
        org.junit.Assert.assertEquals(754.3024904173149, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1768.7166644982776), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(3437, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1928.3950191653707), ((double)(3437)), allowedSolution0);
        org.junit.Assert.assertEquals(754.3024904173149, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1768.7166644982776), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-1964.61553) , (-1964.61553));
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        double double0 = regulaFalsiSolver0.solve(715, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 782.6168, 2532.54178378, (-1964.61553));
        org.junit.Assert.assertEquals((-1964.61553), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2287.0794518133694, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(3437, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-3860.0), (-1928.3950191653707), allowedSolution0);
        org.junit.Assert.assertEquals((-2894.1975095826856), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-3474.601474870311), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-202.4826233423) , (-202.4826233423));
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = illinoisSolver0.solve(4589, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-442.71519), ((double)(4589)), (-654.395160462));
        org.junit.Assert.assertEquals((-654.395160462), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver((-1047.12713) , (-1047.12713) , 2320.207);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = regulaFalsiSolver0.solve(40, univariateRealFunction0, (-1047.12713), 2320.207, allowedSolution0);
        org.junit.Assert.assertEquals(636.539935, regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1047.12713), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-1568.654));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        illinoisSolver0.solve(4959, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), 1.5, 0.0, allowedSolution0);
    }
}

