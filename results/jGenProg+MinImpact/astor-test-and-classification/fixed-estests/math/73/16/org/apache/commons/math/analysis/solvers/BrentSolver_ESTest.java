/**
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 19:49:15 GMT 2017
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
        Expm1Function expm1Function0 = new Expm1Function();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (expm1Function0)));
        brentSolver0.setFunctionValueAccuracy(0.2930073473023706);
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), (-539.8747452), 0.5);
        Assert.assertEquals(8, brentSolver0.getIterationCount());
        Assert.assertEquals((-0.10071246039513215), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BrentSolver brentSolver0 = new BrentSolver();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-1312.3677886489), 1.0E-15);
        Assert.assertEquals(1.0E-15, double0, 0.01);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), 1.0E-15, 1.0E-6);
        Assert.assertEquals(1.0E-15, double0, 0.01);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (expm1Function0)));
        brentSolver0.functionValueAccuracy = 0.0;
        double double0 = brentSolver0.solve(0.0, 3588.347991662336, 2812.09661515925);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sinFunction0)));
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (monitoredFunction0)));
        double double0 = brentSolver0.solve((-430.651358), 1792.8151, 1.0E-15);
        Assert.assertEquals(1, monitoredFunction0.getCallsCount());
        Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), (-210.0), 308.7215233, 1.0E-15);
        Assert.assertEquals(1.0E-15, double0, 0.01);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        try {
            Expm1Function expm1Function0 = new Expm1Function();
            BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (expm1Function0)));
            double double0 = brentSolver0.solve(9.904319078086061E-13, 3588.347991662336, 2812.09661515925);
            Assert.assertEquals(30, brentSolver0.getIterationCount());
            Assert.assertEquals(3329.5975328460136, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: ");
        } catch (IllegalArgumentException expectedException__IllegalArgumentException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (expm1Function0)));
        double double0 = brentSolver0.solve((-0.10071246039513215), 3588.347991662336, 2812.09661515925);
        Assert.assertEquals(6, brentSolver0.getIterationCount());
        Assert.assertEquals((-2.0334668479660322E-7), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sinFunction0)));
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (monitoredFunction0)));
        double double0 = brentSolver0.solve((-1422.77906), 0.003916217875041365);
        Assert.assertEquals(5, brentSolver0.getIterationCount());
        Assert.assertEquals(2.0457850444612936E-10, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (monitoredFunction0)));
        double double0 = brentSolver0.solve((-1422.77906), 0.0);
        Assert.assertEquals(14, brentSolver0.getIterationCount());
        Assert.assertEquals((-1082.2786691616839), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        // Undeclared exception!
        try {
            brentSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), 0.5, 0.5, 0.5);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // invalid interval, initial value parameters:  lower=0.5, initial=0.5, upper=0.5
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        // Undeclared exception!
        try {
            brentSolver0.solve(((UnivariateRealFunction) (null)), (-4311.395668), 1302.5088085822204, (-1.0));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        // Undeclared exception!
        try {
            brentSolver0.solve(((UnivariateRealFunction) (null)), (-400.2045473663481), 555.3660530623);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        // Undeclared exception!
        try {
            brentSolver0.solve((-1277.09210093), (-1277.09210093), (-1277.09210093));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // invalid interval, initial value parameters:  lower=-1,277.092, initial=-1,277.092, upper=-1,277.092
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        // Undeclared exception!
        try {
            brentSolver0.solve((-2192.5907), 1681.2392276681, 405.66860633915684);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        // Undeclared exception!
        try {
            brentSolver0.solve(0.0, 0.0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [0, 0]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        // Undeclared exception!
        try {
            brentSolver0.solve((-1460.0), 1473.87064);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
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
    public void test19() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sinFunction0)));
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (monitoredFunction0)));
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), (-1.000000137220548), 0.0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sinFunction0)));
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (monitoredFunction0)));
        QuinticFunction quinticFunction0 = new QuinticFunction();
        brentSolver0.setFunctionValueAccuracy((-2781.43));
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), (-516.3223223764), 0.0, (-430.651358));
        Assert.assertEquals(18, brentSolver0.getIterationCount());
        Assert.assertEquals((-1.000000137220548), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (expm1Function0)));
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = brentSolver0.solve(univariateRealFunction0, (-805.6940612522299), 704.5580753498267, 0.0);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (expm1Function0)));
        brentSolver0.setAbsoluteAccuracy(Double.NaN);
        try {
            brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), (-539.8747452), 0.5);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (100) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), (-806.086204830949), 9.542510724825778);
        Assert.assertEquals(29, brentSolver0.getIterationCount());
        Assert.assertEquals((-1.0000000087456566), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        SinFunction sinFunction0 = new SinFunction();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), 0.0, Double.NaN);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BrentSolver brentSolver0 = new BrentSolver();
        brentSolver0.functionValueAccuracy = 0.2988595744854121;
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-1312.3677886489), 0.17054655869233232);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
        Assert.assertEquals(0.17054655869233232, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (quinticFunction0)));
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), 1.0E-15, 647.953);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
        Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BrentSolver brentSolver0 = new BrentSolver();
        // Undeclared exception!
        try {
            brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-1312.3677886489), 0.17054655869233232);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function values at endpoints do not have different signs.  Endpoints: [-1,312.368, 0.171], Values: [0.73, 0.17]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sinFunction0)));
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (monitoredFunction0)));
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), (-516.3223223764), 0.0, (-430.651358));
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
        Assert.assertEquals(0, monitoredFunction0.getCallsCount());
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BrentSolver brentSolver0 = new BrentSolver();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), (-1157.86873437), 704.5580753498267, 36.31727544089211);
        Assert.assertEquals(15, brentSolver0.getIterationCount());
        Assert.assertEquals((-3.3292246408191E-8), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        try {
            SinFunction sinFunction0 = new SinFunction();
            MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sinFunction0)));
            BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (monitoredFunction0)));
            brentSolver0.setFunctionValueAccuracy((-2781.43));
            double double0 = brentSolver0.solve((-430.651358), 1792.8151, 0.0);
            Assert.assertEquals(1, brentSolver0.getIterationCount());
            Assert.assertEquals(0.0, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: ");
        } catch (IllegalArgumentException expectedException__IllegalArgumentException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sinFunction0)));
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (monitoredFunction0)));
        double double0 = brentSolver0.solve((-1423.3277094658704), 0.0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (expm1Function0)), (-1758.783176201047), 1507.2617, (-1183.919));
        Assert.assertEquals(24, brentSolver0.getIterationCount());
        Assert.assertEquals((-1.4689033911744961E-9), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (sinFunction0)));
        double double0 = brentSolver0.solve(((UnivariateRealFunction) (sinFunction0)), 1.0E-15, 1.2671840137124064E17);
        Assert.assertEquals(0, brentSolver0.getIterationCount());
        Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BrentSolver brentSolver0 = new BrentSolver();
        UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
        brentSolver0.setMaximalIterationCount((-976));
        try {
            brentSolver0.solve(univariateRealFunction0, (-1.0), 3593.422485, 1.0);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (-976) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BrentSolver brentSolver0 = new BrentSolver(((UnivariateRealFunction) (expm1Function0)));
        brentSolver0.setMaximalIterationCount((-453));
        try {
            brentSolver0.solve(9.904319078086061E-13, 3588.347991662336, 2812.09661515925);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (-453) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
        }
    }
}

