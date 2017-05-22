package org.apache.commons.math.analysis.solvers;


public class BaseSecantSolver_ESTest extends org.apache.commons.math.analysis.solvers.BaseSecantSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-1228.453431));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(2, univariateRealFunction0, (-1189.89710016409), 1.0, allowedSolution0);
        org.junit.Assert.assertEquals((-594.448550082045), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-1189.89710016409), double0, 0.01);
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
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0 , 922.7077185953334);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        pegasusSolver0.solve(306, ((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)), 0.0, 922.7077185953334, 0.0);
        double double0 = pegasusSolver0.doSolve();
        org.junit.Assert.assertEquals(922.7077185953334, pegasusSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        regulaFalsiSolver0.solve(964, univariateRealFunction0, 0.41951439113204153, ((double)(964)), ((double)(964)));
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals(0.41951439113204153, regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals(435.11058252218635, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(null)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        try {
            illinoisSolver0.solve(692, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-0.2156348606749859), 475.971128111467, (-0.2156348606749859), allowedSolution0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0);
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(null)));
        try {
            pegasusSolver0.solve(3, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.5, (-4430.0), 1.537069238111144E-6);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-4430.0) , 565.946852 , 0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(1329, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.0, 1367.8589254744, (-4430.0), allowedSolution0);
        org.junit.Assert.assertEquals((-4430.0), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1366.4986430548302, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1394.520676);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(1524, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.0, 1863.5088823176325, 1394.520676, allowedSolution0);
        org.junit.Assert.assertEquals(1394.520676, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1862.9910881726025, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1394.520676);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(1329, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.0, 1394.520676, 1394.520676, allowedSolution0);
        org.junit.Assert.assertEquals(1394.520676, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1394.1811863173564, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(2.404307984052299E-9);
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(599956464, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sinFunction0)), 9.140260083262505E-9, 1539.007974085292, allowedSolution0);
        org.junit.Assert.assertEquals(769.5039870472162, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(216.76989309769573, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(1394.520676 , 1394.520676);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(1329, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.0, 1367.8589254744, (-4430.0), allowedSolution0);
        org.junit.Assert.assertEquals((-4430.0), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(1329, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.0, 1367.8589254744, (-4430.0), allowedSolution0);
        org.junit.Assert.assertEquals((-4430.0), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1366.59280431156, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(1329, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.0, 1367.8589254744, 1394.520676, allowedSolution0);
        org.junit.Assert.assertEquals(1394.520676, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1366.5928043115616, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-0.24004936814810723));
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(1329, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.0, 1530.91963220158, 1394.520676, allowedSolution0);
        org.junit.Assert.assertEquals(1394.520676, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1529.9556222982292, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(3287.1574151 , 3287.1574151 , 565.946852);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(1329, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.0, 1367.8589254744, (-4430.0), allowedSolution0);
        org.junit.Assert.assertEquals((-4430.0), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver((-0.24004936814810723));
        org.apache.commons.math.analysis.QuinticFunction quinticFunction0 = new org.apache.commons.math.analysis.QuinticFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(68, univariateRealFunction0, 0.5, 3287.1574151, allowedSolution0);
        org.junit.Assert.assertEquals(1643.82870755, pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(0.8222164340791341, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.PegasusSolver pegasusSolver0 = new org.apache.commons.math.analysis.solvers.PegasusSolver(0.0);
        org.apache.commons.math.analysis.SincFunction sincFunction0 = new org.apache.commons.math.analysis.SincFunction();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(1329, ((org.apache.commons.math.analysis.UnivariateRealFunction)(sincFunction0)), 0.0, ((double)(1329)), (-4430.0), allowedSolution0);
        org.junit.Assert.assertEquals((-4430.0), pegasusSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(1328.8936924684826, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.RegulaFalsiSolver regulaFalsiSolver0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
        org.apache.commons.math.analysis.SinFunction sinFunction0 = new org.apache.commons.math.analysis.SinFunction();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        regulaFalsiSolver0.solve(964, univariateRealFunction0, (-39.22388941242629), ((double)(964)), ((double)(964)));
        double double0 = regulaFalsiSolver0.doSolve();
        org.junit.Assert.assertEquals((-39.22388941242629), regulaFalsiSolver0.getMin(), 0.01);
        org.junit.Assert.assertEquals((-10.995574287564276), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver();
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(692, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), (-0.2156348606749859), 475.971128111467, (-0.2156348606749859), allowedSolution0);
        org.junit.Assert.assertEquals((-0.2156348606749859), illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals((-2.2211024944904792E-13), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(0.0 , 0.0);
        org.apache.commons.math.analysis.XMinus5Function xMinus5Function0 = new org.apache.commons.math.analysis.XMinus5Function();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(1076, ((org.apache.commons.math.analysis.UnivariateRealFunction)(xMinus5Function0)), 0.0, ((double)(1076)), allowedSolution0);
        org.junit.Assert.assertEquals(538.0, illinoisSolver0.getStartValue(), 0.01);
        org.junit.Assert.assertEquals(5.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver((-3844.2) , (-3844.2) , (-2293.0));
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
        double double0 = illinoisSolver0.solve(5, univariateRealFunction0, 0.0, (-3844.2), allowedSolution0);
        org.junit.Assert.assertEquals((-3844.2), illinoisSolver0.getMax(), 0.01);
        org.junit.Assert.assertEquals((-3844.2), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.analysis.solvers.IllinoisSolver illinoisSolver0 = new org.apache.commons.math.analysis.solvers.IllinoisSolver(1083.1321838328 , 0.0);
        org.apache.commons.math.analysis.Expm1Function expm1Function0 = new org.apache.commons.math.analysis.Expm1Function();
        org.apache.commons.math.analysis.MonitoredFunction monitoredFunction0 = new org.apache.commons.math.analysis.MonitoredFunction(((org.apache.commons.math.analysis.UnivariateRealFunction)(expm1Function0)));
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution0 = org.apache.commons.math.analysis.solvers.AllowedSolution.RIGHT_SIDE;
        illinoisSolver0.solve(1896, ((org.apache.commons.math.analysis.UnivariateRealFunction)(monitoredFunction0)), 0.0, 0.0, allowedSolution0);
    }
}

