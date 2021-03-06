/**
 * This file was automatically generated by EvoSuite
 * Thu Jan 19 00:37:47 GMT 2017
 */


package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateRealFunction;

public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (quinticFunction0)));
        bisectionSolver0.setAbsoluteAccuracy(0.0);
        double double0 = bisectionSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), 1.0E-15, 201.25784459, (-1.0));
        Assert.assertEquals(53, bisectionSolver0.getIterationCount());
        Assert.assertEquals(201.25784459, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        double double0 = bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), (-3477.854038), 7.62939735757584E-6, (-113.946866));
        Assert.assertEquals(31, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-6.323710421617684E-8), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (sinFunction0)));
        Expm1Function expm1Function0 = new Expm1Function();
        bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 5.127595883936577E-44, 1.0E-15);
        Assert.assertEquals(0, bisectionSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (sinFunction0)));
        bisectionSolver0.solve(0.0, 6.310887241768094E-44, 6.310887241768094E-44);
        Assert.assertEquals(0, bisectionSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (sinFunction0)));
        double double0 = bisectionSolver0.solve((-3198.702), 1.0E-14, 85.33703730716);
        Assert.assertEquals(31, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-2745.751979057024), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (sinFunction0)));
        bisectionSolver0.solve(1.5777218104420236E-44, 6.310887241768094E-44);
        Assert.assertEquals(0, bisectionSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        double double0 = bisectionSolver0.solve((-1.0), 0.0);
        Assert.assertEquals(19, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-4.76837158203125E-7), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 919.41162827, 919.41162827, 919.41162827);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [919.412, 919.412]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (sinFunction0)));
        bisectionSolver0.setMaximalIterationCount((-622));
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-2606.2891006), 0.0, (-3145.4698365371273));
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (-622) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 395.5, 395.5);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [395.5, 395.5]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (null)), (-954.10282405121), (-301.322212444));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.setMaximalIterationCount(0);
        try {
            bisectionSolver0.solve(0.0, 94.5956, 2250.8264251015);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (0) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve((-1965.810406362), 0.0, 1.0E-14);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve((-1201.7), (-1201.7));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [-1,201.7, -1,201.7]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(0.0, 2056.455251569257);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BisectionSolver bisectionSolver0 = null;
        try {
            bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (null)));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function to solve cannot be null
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (sinFunction0)));
        bisectionSolver0.setAbsoluteAccuracy(6.310887241768094E-44);
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (sinFunction0)), 0.0, 25.996685795729327);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (100) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sinFunction0)));
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (monitoredFunction0)));
        try {
            bisectionSolver0.solve(1854.977845960338, 1.9583675617965434E30);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (100) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        // Undeclared exception!
        try {
            bisectionSolver0.solve(3772.0920185655064, (-4.76837158203125E-7), 0.0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [3,772.092, -0]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        SinFunction sinFunction0 = new SinFunction();
        double double0 = bisectionSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-1066.4908748717737), 0.5);
        Assert.assertEquals(29, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-298.45130219163764), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (null)));
        // Undeclared exception!
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (monitoredFunction0)), 0.0, 1139.5673, 1.0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }
}

