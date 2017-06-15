/**
 * This file was automatically generated by EvoSuite
 * Sun Jan 29 17:22:44 GMT 2017
 */


package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.SincFunction;
import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import static org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf;
import static org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.junit.Test;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;

public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = pegasusSolver0.solve(2615, univariateRealFunction0, 0.0, (-1624.4436185978177), 0.0);
        Assert.assertEquals((-1624.4436185978177), double0, 0.01);
        Assert.assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
        Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BaseSecantSolver.Method.valueOf("ILLINOIS");
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 2299.0, 0.0);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        regulaFalsiSolver0.solve(414, univariateRealFunction0, 0.0, 0.0, 269.7179909);
        Assert.assertEquals(269.7179909, regulaFalsiSolver0.getStartValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1001.56735785612));
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = regulaFalsiSolver0.solve(1533, univariateRealFunction0, (-1887.0), ((double) (1533)), (-1001.56735785612));
        Assert.assertEquals((-1887.0), regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals((-1887.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        // Undeclared exception!
        try {
            regulaFalsiSolver0.solve((-4118), ((UnivariateRealFunction) (sincFunction0)), (-1164.986214083343), 297.8277639063605, allowedSolution0);
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (-4,118) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        // Undeclared exception!
        try {
            illinoisSolver0.solve(2909, ((UnivariateRealFunction) (sincFunction0)), ((double) (2909)), ((double) (2909)), allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [2,909, 2,909]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.5);
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        // Undeclared exception!
        try {
            regulaFalsiSolver0.solve(0, ((UnivariateRealFunction) (null)), 0.0, ((double) (23)), allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // null is not allowed
            // 
            EvoAssertions.verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SincFunction sincFunction0 = new SincFunction();
        // Undeclared exception!
        try {
            illinoisSolver0.solve(2909, ((UnivariateRealFunction) (sincFunction0)), (-333.8086123005498), ((double) (2909)), ((AllowedSolution) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.1142219591420144E-8);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        // Undeclared exception!
        try {
            illinoisSolver0.solve((-4127), ((UnivariateRealFunction) (expm1Function0)), 1.1142219591420144E-8, ((double) (-4127)), ((double) (-4127)), allowedSolution0);
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (-4,127) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(936.1287810072371, (-78.6192994937));
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        // Undeclared exception!
        try {
            illinoisSolver0.solve(863, ((UnivariateRealFunction) (sincFunction0)), 814.015971409, 624.89, (-78.6192994937), allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [814.016, 624.89]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2794.248119, 0.0);
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        // Undeclared exception!
        try {
            regulaFalsiSolver0.solve(3744, univariateRealFunction0, 0.0, 695.0135319637, 0.0, allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function values at endpoints do not have different signs, endpoints: [0, 695.014], values: [1, 69,269,456,471,734,600,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver((-723.238), (-723.238));
        SincFunction sincFunction0 = new SincFunction();
        // Undeclared exception!
        try {
            illinoisSolver0.solve(225, ((UnivariateRealFunction) (sincFunction0)), (-723.238), ((double) (225)), ((double) (225)), ((AllowedSolution) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2045.6256814075355), (-2045.6256814075355), 0.0);
        SincFunction sincFunction0 = new SincFunction();
        // Undeclared exception!
        try {
            regulaFalsiSolver0.solve((-670), ((UnivariateRealFunction) (sincFunction0)), ((double) (-670)), 1.7976931348623157E308, ((double) (-670)));
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (-670) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1301.0);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        // Undeclared exception!
        try {
            regulaFalsiSolver0.solve(19, ((UnivariateRealFunction) (xMinus5Function0)), 0.0, (-242.2108751278447), (-242.2108751278447));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [0, -242.211]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        // Undeclared exception!
        try {
            illinoisSolver0.solve(2226, ((UnivariateRealFunction) (null)), (-1.0), ((double) (2226)), (-1.0));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // null is not allowed
            // 
            EvoAssertions.verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        // Undeclared exception!
        try {
            regulaFalsiSolver0.doSolve();
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (0) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SincFunction sincFunction0 = new SincFunction();
        illinoisSolver0.setup(2909, sincFunction0, 2909, 2909, 2905.9732045705587);
        // Undeclared exception!
        try {
            illinoisSolver0.doSolve();
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [2,909, 2,909]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
        regulaFalsiSolver0.setup(2, univariateRealFunction0, 0.0, 0.041666666666666664, 0.0);
        // Undeclared exception!
        try {
            regulaFalsiSolver0.doSolve();
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function values at endpoints do not have different signs, endpoints: [0, 0.042], values: [0.25, 0.244]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.1142219591420144E-8, 1.1142219591420144E-8);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(1093, ((UnivariateRealFunction) (expm1Function0)), ((double) (-4137)), 14.945630800361704, allowedSolution0);
        Assert.assertEquals((-2061.027184599819), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(2.298598966959459E-12, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1668.21));
            SinFunction sinFunction0 = new SinFunction();
            MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sinFunction0)));
            AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
            double double0 = regulaFalsiSolver0.solve(437, ((UnivariateRealFunction) (monitoredFunction0)), (-1171.4072420891648), (-55.514974), (-55.514974), allowedSolution0);
            Assert.assertEquals((-55.514974), regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals((-653.451271946677), double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        illinoisSolver0.solve(225, ((UnivariateRealFunction) (sincFunction0)), (-723.238), ((double) (225)), ((double) (225)), allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        Assert.assertEquals(225.0, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-546.6371214085897), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1668.21));
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(437, ((UnivariateRealFunction) (sinFunction0)), (-1668.21), (-1171.0), allowedSolution0);
        Assert.assertEquals((-1419.605), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1196.9468010177113), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1668.21));
            SinFunction sinFunction0 = new SinFunction();
            MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sinFunction0)));
            double double0 = regulaFalsiSolver0.solve(126, ((UnivariateRealFunction) (monitoredFunction0)), 0.7046485195119203, 1485.9948742575, 0.7046485195119203);
            Assert.assertEquals(0.7046485195119203, regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals(688.0087911361647, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.1142219591420144E-8);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(1116, ((UnivariateRealFunction) (expm1Function0)), (-3510.0), 1.1969468010177113E-11, allowedSolution0);
        Assert.assertEquals((-1754.999999999994), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1.1969468010177113E-11, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(2909, ((UnivariateRealFunction) (sincFunction0)), (-334.7726656723), ((double) (2909)), allowedSolution0);
        Assert.assertEquals((-334.7726656723), illinoisSolver0.getMin(), 0.01);
        Assert.assertEquals(2905.973204570559, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(2909, ((UnivariateRealFunction) (sincFunction0)), (-334.877708308716), ((double) (2909)), allowedSolution0);
        Assert.assertEquals((-334.877708308716), illinoisSolver0.getMin(), 0.01);
        Assert.assertEquals(1831.5485170492127, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-1.7168146928204135));
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(1809381256, ((UnivariateRealFunction) (quinticFunction0)), (-3674.8428017), 1.0E-6, allowedSolution0);
        Assert.assertEquals((-1837.42140035), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        illinoisSolver0.solve(2909, ((UnivariateRealFunction) (sincFunction0)), (-334.7726656723), ((double) (2909)), allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        Assert.assertEquals((-334.7726656723), illinoisSolver0.getMin(), 0.01);
        Assert.assertEquals(2905.9732045705587, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(2909, ((UnivariateRealFunction) (sincFunction0)), 1.2675934823758863E-8, ((double) (2909)), allowedSolution0);
        Assert.assertEquals(1454.5000000063378, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(2905.9732045705755, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SincFunction sincFunction0 = new SincFunction();
        double double0 = illinoisSolver0.solve(2909, ((UnivariateRealFunction) (sincFunction0)), (-3073.679), ((double) (2909)), ((double) (2909)));
        Assert.assertEquals(2909.0, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1184.380430403352, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(2909, ((UnivariateRealFunction) (sincFunction0)), (-334.7726656723), ((double) (2909)), allowedSolution0);
        Assert.assertEquals(1287.1136671638499, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(2905.9732045705587, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        double double0 = regulaFalsiSolver0.solve(750, ((UnivariateRealFunction) (xMinus5Function0)), (-0.7830544106677141), 1282.61117731353, 0.0);
        Assert.assertEquals((-0.7830544106677141), regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1952.76), 2.7553817452272217E-6, 2.7553817452272217E-6);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        illinoisSolver0.solve(265, ((UnivariateRealFunction) (expm1Function0)), (-522.9396848246897), 0.0, 569.774955, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        Assert.assertEquals((-522.9396848246897), illinoisSolver0.getMin(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1668.21));
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(126, ((UnivariateRealFunction) (sinFunction0)), (-1668.21), (-1171.4072420891648), allowedSolution0);
        Assert.assertEquals((-1419.8086210445824), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1573.9379194484868), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1668.21));
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (null)));
        // Undeclared exception!
        try {
            regulaFalsiSolver0.solve(959139158, ((UnivariateRealFunction) (monitoredFunction0)), 0.7046485195119203, 1485.9948742575, 0.7046485195119203);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
        }
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(32.88599317045032, 0.10526403784751892, 1.0);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        illinoisSolver0.solve(3, ((UnivariateRealFunction) (quinticFunction0)), (-479.9953276357295), 4.547473508864641E-13, (-479.9953276357295), allowedSolution0);
    }
}
