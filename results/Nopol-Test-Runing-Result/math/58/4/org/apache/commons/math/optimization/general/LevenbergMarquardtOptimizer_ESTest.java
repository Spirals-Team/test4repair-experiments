package org.apache.commons.math.optimization.general;


public class LevenbergMarquardtOptimizer_ESTest extends org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test0() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1918.063898844) , (-1487.2) , 2036.0130361077402 , (-1487.2) , 0.0);
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = new double[4];
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(929, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray1);
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair1 = levenbergMarquardtOptimizer0.doOptimize();
        org.junit.Assert.assertFalse(vectorialPointValuePair1.equals(((java.lang.Object)(vectorialPointValuePair0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test4() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(2036.013 , 2036.013 , (-248.634593329));
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = new double[23];
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(929, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray1);
        org.junit.Assert.assertNotNull(vectorialPointValuePair0);
    }

    @org.junit.Test(timeout = 4000)
    public void test7() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        double[] doubleArray0 = new double[1];
        circleVectorial0.addPoint(957, 957);
        double[] doubleArray1 = new double[2];
        levenbergMarquardtOptimizer0.optimize(957, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray1);
    }
}

