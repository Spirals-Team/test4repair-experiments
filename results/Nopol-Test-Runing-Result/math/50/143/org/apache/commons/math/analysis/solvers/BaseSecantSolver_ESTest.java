package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf("ILLINOIS");
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values();
        org.junit.Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(649.6717856089576 , (-4567.290396));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = illinoisSolver0.solve(274, univariateRealFunction0, (-882.95), (-3804.6117440369676), allowedSolution0);
        org.junit.Assert.assertEquals((-2343.780872018484), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-882.95), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = pegasusSolver0.solve(2019, univariateRealFunction0, ((double)(2019)), 0.0, 0.0, allowedSolution0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
        org.junit.Assert.assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = pegasusSolver0.solve(23, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 3072.44492297152, 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1.0E-6 , 1.0E-6 , 1.0E-6);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(univariateRealFunction0);
        double double0 = pegasusSolver0.solve(688, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-1.58197967592821), 0.0, (-426.16));
        org.junit.Assert.assertEquals(7, monitoredFunction0.getCallsCount());
        org.junit.Assert.assertEquals((-1.5707963266264293), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0 , 4932.831921845048);
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(null)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        try {
            regulaFalsiSolver0.solve(866620, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 1323.9, (-464.29677425), (-1929.4820922792267), allowedSolution0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(14, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.1650475996129248, 130.213765132, 1.1650475996129248, allowedSolution0);
        org.junit.Assert.assertEquals(1.1650475996129248, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(84.82300164692441, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0 , 3011.443657011 , 0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(1231, univariateRealFunction0, 6.0, 3011.443657011, allowedSolution0);
        org.junit.Assert.assertEquals(1508.7218285055, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(3011.443657011, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0 , 3011.4436570107 , 0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(1231, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 6.0, 3011.4436570107, allowedSolution0);
        org.junit.Assert.assertEquals(1508.72182850535, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(3011.4436570107, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0 , 3011.4436570107 , 0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(1231, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 6.0, 3011.4436570107, allowedSolution0);
        org.junit.Assert.assertEquals(1508.72182850535, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2990.7073664828204, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0 , 3011.443657011 , 0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(1231, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 6.0, 3011.443657011, allowedSolution0);
        org.junit.Assert.assertEquals(1508.7218285055, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2990.707366484549, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(1231, univariateRealFunction0, 6.0, 3011.4436570107, allowedSolution0);
        org.junit.Assert.assertEquals(1508.72182850535, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(3011.216225865163, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        double double0 = illinoisSolver0.solve(3117, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-5.869731463), 2976.817056232836, 1.0);
        org.junit.Assert.assertEquals(1.0, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1567.654734141307, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(14, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.07750325280003643, 130.21376513150096, 0.07750325280003643, allowedSolution0);
        org.junit.Assert.assertEquals(0.07750325280003643, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(3.141592653589793, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0 , 0.0 , 3011.4436570107);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(1231, univariateRealFunction0, 6.0, 3011.4436570107, allowedSolution0);
        org.junit.Assert.assertEquals(1508.72182850535, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(3011.218161626435, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(1231, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 6.0, 3011.4436570107, allowedSolution0);
        org.junit.Assert.assertEquals(6.0, pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(2990.796206217483, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0 , 0.0 , 3011.4436570107);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(1231, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 6.0, 3011.4436570107, allowedSolution0);
        org.junit.Assert.assertEquals(1508.72182850535, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(2992.449029510392, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        illinoisSolver0.solve(952, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 1.0, ((double)(952)));
        double double0 = illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(476.5, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(662.8760499074464, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0 , 0.0 , (-3359.8733));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(univariateRealFunction0);
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = illinoisSolver0.solve(128, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.0, (-3359.8733), 3458.89, allowedSolution0);
        org.junit.Assert.assertEquals(3458.89, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-3359.8733), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        illinoisSolver0.solve(952, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 0.0, 0.0, allowedSolution0);
        illinoisSolver0.doSolve();
        org.junit.Assert.assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0 , 3011.4436570107 , 0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(1231, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), ((double)(1231)), 3011.4436570107, allowedSolution0);
        org.junit.Assert.assertEquals(1231.0, pegasusSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(2206.997229297215, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.17280247015473368 , 0.17280247015473368 , (-1342.8119019));
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(quinticFunction0)));
        double double0 = pegasusSolver0.solve(79484, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-1342.8119019), ((double)(1270)));
        org.junit.Assert.assertEquals(1270.0, pegasusSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        pegasusSolver0.solve(63, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), (-2353.9205784602523), 130.0, (-2353.9205784602523), allowedSolution0);
        pegasusSolver0.doSolve();
    }
}

