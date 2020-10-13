/**
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 14:29:22 GMT 2017
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

public class BrentSolver_ESTest extends BrentSolver_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (sinFunction0)));
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-918.71983), 1.0E-15);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
        Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        try {
            BrentSolver brentSolver0 = new BrentSolver();
            Expm1Function expm1Function0 = new Expm1Function();
            double double0 = brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 2.007163685495782E-14, 1950.0, 917.469161075);
            Assert.assertEquals(30, brentSolver0.getIterationCount());
            Assert.assertEquals(1605.8230535505868, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: ");
        } catch (IllegalArgumentException expectedException__IllegalArgumentException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        brentSolver0.functionValueAccuracy = 25.0778426;
        QuinticFunction quinticFunction0 = new QuinticFunction();
        UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
        double double0 = brentSolver0.solve(univariateRealFunction0, (-433.282946719655), 1.0079830303766357E-6);
        Assert.assertEquals(1.0079830303766357E-6, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        brentSolver0.functionValueAccuracy = 3.950942597344266;
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 1.0E-14, 3.950942597344266);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
        Assert.assertEquals(1.0E-14, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        brentSolver0.functionValueAccuracy = 0.0;
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), (-135.2841849502963), 0.45738702026129796, 0.0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        double double0 = brentSolver0.solve((-2126.34065), 0.0, (-1494.5));
        Assert.assertEquals(0, brentSolver0.getIterationCount());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        double double0 = brentSolver0.solve((-2126.34065), 0.0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
        double double0 = brentSolver0.solve(161.70335369, 2355.0203084484515);
        Assert.assertEquals(11, brentSolver0.getIterationCount());
        Assert.assertEquals(337.7212102609195, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        // Undeclared exception!
        try {
            brentSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), 1.0E-6, (-1.0), 1.0E-6);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // invalid interval, initial value parameters:  lower=0, initial=0, upper=-1
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
        brentSolver0.setMaximalIterationCount((-680));
        try {
            brentSolver0.solve(univariateRealFunction0, (-545.4988), 40.1, 0.5);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (-680) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        // Undeclared exception!
        try {
            brentSolver0.solve(((UnivariateRealFunction) (null)), (-135.2841849502963), 0.45738702026129796, 0.0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        brentSolver0.setMaximalIterationCount(25);
        try {
            brentSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), (-2126.34065), ((double) (25)));
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (25) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (null)));
        // Undeclared exception!
        try {
            brentSolver0.solve(((UnivariateRealFunction) (monitoredFunction0)), 0.0, 3.75);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        // Undeclared exception!
        try {
            brentSolver0.solve(0.0, 0.0, (-227.995309902));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // invalid interval, initial value parameters:  lower=0, initial=-227.995, upper=0
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        // Undeclared exception!
        try {
            brentSolver0.solve((-113.849521681), 169.0307666, 1.2998587567425446E-8);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        // Undeclared exception!
        try {
            brentSolver0.solve(1.0, 1.0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [1, 1]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        // Undeclared exception!
        try {
            brentSolver0.solve((-2432.6), 1171.7583558528);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BrentSolver brentSolver0 = null;
        try {
            brentSolver0 = new BrentSolver(((UnivariateRealFunction) (null)));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function to solve cannot be null
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        brentSolver0.functionValueAccuracy = Double.NaN;
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), (-135.2841849502963), 0.45738702026129796, 0.0);
        Assert.assertEquals(1, brentSolver0.getIterationCount());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        brentSolver0.setAbsoluteAccuracy((-2126.34065));
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), (-2126.34065), 9.021879948994835);
        Assert.assertEquals(42, brentSolver0.getIterationCount());
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        brentSolver0.setMaximalIterationCount(25);
        try {
            brentSolver0.solve((-2126.34065), 6.495261869252602);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (25) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        SinFunction sinFunction0 = new SinFunction();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-1.0), 0.0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 0.0, 2044.3497949886);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (sinFunction0)));
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-2160.887174), 1.0E-15);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
        Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        // Undeclared exception!
        try {
            brentSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), (-3007.1084279428), (-241.2494252573823));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function values at endpoints do not have different signs.  Endpoints: [-3,007.108, -241.249], Values: [-245,892,554,723,420,704, -817,188,242,277.597]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), (-473.4842447), 1.0E-14, (-227.995309902));
        Assert.assertEquals(1, brentSolver0.getIterationCount());
        Assert.assertEquals(1.0E-14, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), (-444.3521308342028), 0.0, (-227.995309902));
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        try {
            QuinticFunction quinticFunction0 = new QuinticFunction();
            UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
            BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
            double double0 = brentSolver0.solve((-3566.19046), 1.762197798856576E11, 0.25);
            Assert.assertEquals(46, brentSolver0.getIterationCount());
            Assert.assertEquals(0.822216434101702, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: ");
        } catch (IllegalArgumentException expectedException__IllegalArgumentException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        brentSolver0.functionValueAccuracy = 3.950942597344266;
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), (-2554.2751), 3.950942597344266, 3.75);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        double double0 = brentSolver0.solve((-3566.19046), 1.762197798856576E11, 0.25);
        Assert.assertEquals(6, brentSolver0.getIterationCount());
        Assert.assertEquals((-1.0000000007749084), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        double double0 = brentSolver0.solve((-2126.34065), 6.495261869252602);
        Assert.assertEquals(41, brentSolver0.getIterationCount());
        Assert.assertEquals((-1.000000000154552), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), (-135.2841849502963), 0.45738702026129796, 0.0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (sinFunction0)));
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), 1.0E-15, 7.96360537389527E-6);
        Assert.assertEquals(1.0E-15, double0, 0.01);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
    }
}
