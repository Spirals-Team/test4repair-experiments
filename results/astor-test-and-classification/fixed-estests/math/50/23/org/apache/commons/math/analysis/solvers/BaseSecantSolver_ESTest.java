/**
 * This file was automatically generated by EvoSuite
 * Wed Jan 25 05:49:53 GMT 2017
 */


package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.QuinticFunction;
import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.SinFunction;
import static org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf;
import static org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;

public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2312.1529739));
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = regulaFalsiSolver0.solve(40, univariateRealFunction0, (-2312.1529739), ((double) (40)), ((double) (40)));
        Assert.assertEquals(40.0, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-2312.1529739), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
        Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BaseSecantSolver.Method.valueOf("REGULA_FALSI");
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(615.7651, 0.5);
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = illinoisSolver0.solve(4, ((UnivariateRealFunction) (expm1Function0)), 0.0, 0.5, ((double) (4)));
        Assert.assertEquals(0.5, illinoisSolver0.getMax(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-763.0968283321331));
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        // Undeclared exception!
        try {
            regulaFalsiSolver0.solve(2, ((UnivariateRealFunction) (quinticFunction0)), (-763.0968283321331), (-763.0968283321331), allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [-763.097, -763.097]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-299.875));
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        // Undeclared exception!
        try {
            regulaFalsiSolver0.solve(2726, ((UnivariateRealFunction) (quinticFunction0)), (-299.875), 1.494140625, (-1959.038183085), allowedSolution0);
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (2,726) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        // Undeclared exception!
        try {
            pegasusSolver0.solve(0, ((UnivariateRealFunction) (sinFunction0)), ((double) (0)), 0.0, 0.0, allowedSolution0);
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (0) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.375);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        // Undeclared exception!
        try {
            regulaFalsiSolver0.solve(1322, ((UnivariateRealFunction) (xMinus5Function0)), ((double) (1322)), ((double) (1322)), (-1.0), allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [1,322, 1,322]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(139.5990193599356, 139.5990193599356, 139.5990193599356);
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        // Undeclared exception!
        try {
            regulaFalsiSolver0.solve(2197, ((UnivariateRealFunction) (null)), 139.5990193599356, 139.5990193599356, 139.5990193599356, allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // null is not allowed
            // 
            EvoAssertions.verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1286.3535, 1286.3535);
        SincFunction sincFunction0 = new SincFunction();
        // Undeclared exception!
        try {
            pegasusSolver0.solve(49, ((UnivariateRealFunction) (sincFunction0)), 0.5, ((double) (49)), 0.5, ((AllowedSolution) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SincFunction sincFunction0 = new SincFunction();
        // Undeclared exception!
        try {
            illinoisSolver0.solve(2765, ((UnivariateRealFunction) (sincFunction0)), ((double) (2765)), ((double) (2765)), 0.0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [2,765, 2,765]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-303.23299178060876));
        // Undeclared exception!
        try {
            regulaFalsiSolver0.solve(827, ((UnivariateRealFunction) (null)), (-303.23299178060876), ((double) (827)), 631.10958);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // null is not allowed
            // 
            EvoAssertions.verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(1115.99305890399, 1115.99305890399, 1115.99305890399);
        // Undeclared exception!
        try {
            illinoisSolver0.doSolve();
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (0) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        pegasusSolver0.setup(380, quinticFunction0, 918.0, 918.0, (-603.3386909414742));
        // Undeclared exception!
        try {
            pegasusSolver0.doSolve();
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [918, 918]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        UnivariateRealFunction univariateRealFunction0 = xMinus5Function0.derivative();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
        pegasusSolver0.setup(3278, monitoredFunction0, (-0.0400749547750642), 1323.4984601867873, 0.7937005259840998);
        // Undeclared exception!
        try {
            pegasusSolver0.doSolve();
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function values at endpoints do not have different signs, endpoints: [-0.04, 1,323.498], values: [1, 1]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-303.23299178060876));
            SinFunction sinFunction0 = new SinFunction();
            UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
            AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
            double double0 = regulaFalsiSolver0.solve(2807, univariateRealFunction0, (-2550.6543009), ((double) (827)), allowedSolution0);
            Assert.assertEquals((-861.8271504500001), regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals((-205.77431881013146), double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1286.4, 1286.4);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(49, ((UnivariateRealFunction) (sincFunction0)), 0.5, 1286.4, 0.5, allowedSolution0);
        Assert.assertEquals(0.5, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1285.3618486897697, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1286.3535, 1286.3535);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(49, ((UnivariateRealFunction) (sincFunction0)), 0.5, 1286.3535, 0.5, allowedSolution0);
        Assert.assertEquals(0.5, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1285.3204420565708, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1286.3535, 1286.3535, 1286.3535);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(49, ((UnivariateRealFunction) (sincFunction0)), 0.5, 1286.3535, 0.5, allowedSolution0);
        Assert.assertEquals(0.5, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.5, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(615.7651, 0.5);
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = illinoisSolver0.solve(4, ((UnivariateRealFunction) (expm1Function0)), (-2.91331), 0.8775825618903728, 36.12880449844337);
        Assert.assertEquals(36.12880449844337, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1.3882591537382027), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-4387.484074436672), 0.5, 393.2);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(4, ((UnivariateRealFunction) (sinFunction0)), 0.5, ((double) (4)), allowedSolution0);
        Assert.assertEquals(2.25, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1.8573461684124686, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1939.4375619953094, 1939.4375619953094, 1939.4375619953094);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(49, ((UnivariateRealFunction) (sincFunction0)), 1.9402442282562793, 1939.4375619953094, 1.9402442282562793, allowedSolution0);
        Assert.assertEquals(1.9402442282562793, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1939.4375619953094, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(49, ((UnivariateRealFunction) (sincFunction0)), 0.5, 1286.3535, 0.5, allowedSolution0);
        Assert.assertEquals(0.5, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1284.9113953182255, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1286.35, 1286.35, 1286.35);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        pegasusSolver0.solve(49, ((UnivariateRealFunction) (sincFunction0)), 0.5, 1286.35, 0.5, allowedSolution0);
        double double0 = pegasusSolver0.doSolve();
        Assert.assertEquals(0.5, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1285.3174159022476, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1286.3535, 1286.3535, 1286.3535);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(49, ((UnivariateRealFunction) (sincFunction0)), 1.9402442282562793, 1286.3535, 1.9402442282562793, allowedSolution0);
        Assert.assertEquals(1.9402442282562793, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1286.3535, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-4387.484074436672), 0.5, 393.2);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(2047, ((UnivariateRealFunction) (sinFunction0)), ((double) (4)), 785.7638459, 393.2, allowedSolution0);
        Assert.assertEquals(393.2, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(135.69908715360884, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1286.3535, 1286.3535, 1286.3535);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        pegasusSolver0.solve(49, ((UnivariateRealFunction) (sincFunction0)), 0.0, 1286.3535, 0.0, allowedSolution0);
        double double0 = pegasusSolver0.doSolve();
        Assert.assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(2.774527274596039E-10, 2.774527274596039E-10);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = pegasusSolver0.solve(3, ((UnivariateRealFunction) (quinticFunction0)), (-7.800414592973399E-9), 2.774527274596039E-10, allowedSolution0);
        Assert.assertEquals((-3.761480932756897E-9), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1.0339757656912846E-25), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-303.23299178060876));
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        // Undeclared exception!
        try {
            regulaFalsiSolver0.solve(2807, ((UnivariateRealFunction) (sinFunction0)), (-2550.6543009), ((double) (827)), allowedSolution0);
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (2,807) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.75381842382194E-8);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        // Undeclared exception!
        try {
            regulaFalsiSolver0.solve(2807, ((UnivariateRealFunction) (quinticFunction0)), (-2550.6543009), ((double) (794)), allowedSolution0);
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (2,807) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(306.257936753);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
        // Undeclared exception!
        try {
            illinoisSolver0.solve(5, ((UnivariateRealFunction) (monitoredFunction0)), (-2813.19765912166), ((double) (5)), 306.257936753);
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (5) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1171.4012461);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        pegasusSolver0.solve(14, univariateRealFunction0, (-20.0705757), (-2.432607015639602), (-2.432607015639602), allowedSolution0);
        double double0 = pegasusSolver0.doSolve();
        Assert.assertEquals((-19.47527259338622), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1169.65747), (-1169.65747));
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        double double0 = regulaFalsiSolver0.solve(1346, ((UnivariateRealFunction) (xMinus5Function0)), 0.0, ((double) (1346)), ((double) (1346)));
        Assert.assertEquals(1346.0, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-4377.389983432172), (-4377.389983432172), 393.2);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        // Undeclared exception!
        try {
            pegasusSolver0.solve(4, univariateRealFunction0, 0.5, 2729.6733102346, ((AllowedSolution) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        double double0 = illinoisSolver0.solve(548639535, univariateRealFunction0, 1.3245471311735498E-8, 7.202061169664375E-11);
        Assert.assertEquals(7.202061169664375E-11, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0E-6, (-20.0705757), 1171.4012461);
        double double0 = regulaFalsiSolver0.solve(14, univariateRealFunction0, 0.0, ((double) (14)), allowedSolution0);
        Assert.assertEquals(7.0, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-4377.389983432172), (-4377.389983432172), 393.2);
        SinFunction sinFunction0 = new SinFunction();
        // Undeclared exception!
        try {
            pegasusSolver0.solve(4, ((UnivariateRealFunction) (sinFunction0)), 0.5, 2729.6733102346, ((AllowedSolution) (null)));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function values at endpoints do not have different signs, endpoints: [0.5, 2,729.673], values: [0.479, 0.362]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }
}
