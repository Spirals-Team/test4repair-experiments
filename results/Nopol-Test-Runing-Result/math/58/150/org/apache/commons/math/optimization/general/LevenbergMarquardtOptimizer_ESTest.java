package org.apache.commons.math.optimization.general;


public class LevenbergMarquardtOptimizer_ESTest extends org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(6.070161590459059 , (-785.969) , 6.070161590459059 , (-785.969) , 0.0);
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        double[] doubleArray0 = new double[2];
        circleVectorial0.addPoint(6.070161590459059, (-291.47397));
        circleVectorial0.addPoint((-3025.788188748296), 0.651);
        levenbergMarquardtOptimizer0.optimize(4530, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray0);
        levenbergMarquardtOptimizer0.cols = 4530;
        try {
            levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0 , 0.0 , 0.0);
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = ((double)(4530));
        circleVectorial0.addPoint(2384.41679031, (-291.47397));
        circleVectorial0.addPoint(4.0, 4530.0);
        levenbergMarquardtOptimizer0.optimize(4530, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(8, levenbergMarquardtOptimizer0.getJacobianEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        double[] doubleArray0 = new double[2];
        circleVectorial0.addPoint((-291.47397), 0.6194403915594);
        circleVectorial0.addPoint(1546, 0.0);
        doubleArray0[1] = 0.6194403915594;
        levenbergMarquardtOptimizer0.optimize(1546, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(1.6364477143148036E-26, levenbergMarquardtOptimizer0.getChiSquare(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.6194403915594 , 0.0 , 0.6194403915594);
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        double[] doubleArray0 = new double[2];
        circleVectorial0.addPoint((-291.47397), 0.6194403915594);
        circleVectorial0.addPoint(1888.7298101600627, 0.0);
        doubleArray0[1] = 0.6194403915594;
        levenbergMarquardtOptimizer0.optimize(4530, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray0);
        levenbergMarquardtOptimizer0.doOptimize();
        org.junit.Assert.assertEquals(5.289221447196053E-26, levenbergMarquardtOptimizer0.getChiSquare(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = new double[8];
        levenbergMarquardtOptimizer0.optimize(10, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray1);
    }
}

