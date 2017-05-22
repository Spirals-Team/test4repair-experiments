package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(2.2250738585072014E-308 , 1179.349670107828 , 1179.349670107828);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(1338009747, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2025.0), 2.2250738585072014E-308, allowedSolution0);
        org.junit.Assert.assertEquals((-1012.5), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-4.64054995133801E-305), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf("PEGASUS");
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values();
        org.junit.Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        pegasusSolver0.solve(2004, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), 0.0, 3.9736429850260626E-8, allowedSolution0);
        org.junit.Assert.assertEquals(1.9868214925130313E-8, pegasusSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0 , 0.0 , 0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        regulaFalsiSolver0.solve(2, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), 0.0, 0.0, ((double)(2)));
        org.junit.Assert.assertEquals(2.0, regulaFalsiSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        pegasusSolver0.solve(2004, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), ((double)(2004)), 0.0, 0.0, allowedSolution0);
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.9995576540188896 , 1179.349670107828 , 1179.349670107828);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        illinoisSolver0.solve(1338009747, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2024.3131929383615), 0.9995576540188896, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals((-1011.6568176421713), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-975.5981853960625), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(53, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-324.267413), 795.95, allowedSolution0);
        org.junit.Assert.assertEquals(235.84129350000006, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-47.1238898038469), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.9995576540188896 , 0.9995576540188896);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(1338009720, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2025.2444772291865), 0.9995576540188896, allowedSolution0);
        org.junit.Assert.assertEquals((-1012.1224597875838), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-89.13457273434088), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.9995576540188896 , 1183.9021556332796 , 1183.9021556332796);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(1338009747, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2025.6560297837634), 0.9995576540188896, allowedSolution0);
        org.junit.Assert.assertEquals((-1012.3282360648723), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.9995576540188896, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-54.33546125909403));
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(1338009747, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2025.0), (-54.33546125909403), allowedSolution0);
        org.junit.Assert.assertEquals((-1039.667730629547), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-433.5397861953915), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-452.620282963));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = illinoisSolver0.solve(1338009763, univariateRealFunction0, (-2080.90740693), (-2025.0), (-1745.4), allowedSolution0);
        org.junit.Assert.assertEquals((-1745.4), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-2059.313984428109), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1691.35490895767 , (-3715.10329));
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        double double0 = pegasusSolver0.solve(2117803252, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-1113.51), 6.283185307179586, (-1113.51));
        org.junit.Assert.assertEquals((-1113.51), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(6.28318530713014, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(2801, univariateRealFunction0, (-0.3233370407462927), 386.4, allowedSolution0);
        org.junit.Assert.assertEquals(193.03833147962686, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(384.8425016050027, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.9995576540188896 , 0.9995576540188896 , 0.9995576540188896);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(1338009747, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2025.2444772291865), 0.9995576540188896, allowedSolution0);
        org.junit.Assert.assertEquals((-1012.1224597875838), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-987.4275123798103), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.9995576540188896 , 1178.5155964155442 , 1178.5155964155442);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(1338009788, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2024.3131929383615), 0.9995576540188896, allowedSolution0);
        org.junit.Assert.assertEquals((-1011.6568176421713), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-975.5981853960625), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.9995576540188896 , 1178.5155964155442 , 1178.5155964155442);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(1338009747, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-1301.3931258150835), 0.9995576540188896, allowedSolution0);
        org.junit.Assert.assertEquals((-650.1967840805323), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.9995576540188896, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.9995576540188896 , 1178.5155964155442 , 1178.5155964155442);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(1338009747, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), (-2584.034636861273), 1178.5155964155442, (-2024.3131929383615), allowedSolution0);
        org.junit.Assert.assertEquals((-2024.3131929383615), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-2584.034636861273), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(271, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 41.0, ((double)(271)), allowedSolution0);
        org.junit.Assert.assertEquals(41.0, regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(106.81414922205298, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0 , 0.0 , 0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(5, univariateRealFunction0, 0.0, (-971.619), allowedSolution0);
        org.junit.Assert.assertEquals((-485.8095), regulaFalsiSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-971.619), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1743.8158449 , (-2568.0));
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = pegasusSolver0.solve(2, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), 0.5, 9.243863392686452E-8, (-108.86), allowedSolution0);
        org.junit.Assert.assertEquals(0.5, pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(0.5, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.9995576540188896 , 1179.349670107828 , 1179.349670107828);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        illinoisSolver0.solve(1338009747, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-0.015354984424235399), 0.9995576540188896, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(0.49210133479732715, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0028374098338689313, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-847.555058) , (-847.555058));
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        double double0 = illinoisSolver0.solve(1756, ((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)), (-847.555058), 2934.707, ((double)(1756)));
        org.junit.Assert.assertEquals(2934.707, illinoisSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }
}

