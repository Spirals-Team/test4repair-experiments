package org.apache.commons.math.optimization.general;


public class LevenbergMarquardtOptimizer_ESTest extends org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test4() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-202.07455474) , (-202.07455474) , (-202.07455474) , (-202.07455474) , java.lang.Double.POSITIVE_INFINITY);
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        double[] doubleArray1 = circleVectorial0.value(doubleArray0);
        double[] doubleArray2 = circleVectorial0.value(doubleArray0);
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(128, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray1, doubleArray2, doubleArray0);
        org.junit.Assert.assertNotNull(vectorialPointValuePair0);
    }

    @org.junit.Test(timeout = 4000)
    public void test5() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(java.lang.Double.POSITIVE_INFINITY , java.lang.Double.POSITIVE_INFINITY , java.lang.Double.POSITIVE_INFINITY);
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        double[] doubleArray1 = circleVectorial0.value(doubleArray0);
        double[] doubleArray2 = circleVectorial0.value(doubleArray0);
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(128, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray1, doubleArray2, doubleArray0);
        org.junit.Assert.assertNotNull(vectorialPointValuePair0);
    }

    @org.junit.Test(timeout = 4000)
    public void test6() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-135.8172842735638) , (-202.07455474) , (-135.8172842735638));
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        circleVectorial0.addPoint((-135.8172842735638), (-202.07455474));
        circleVectorial0.addPoint(707.0, 202.07455474);
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(128, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray0);
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair1 = levenbergMarquardtOptimizer0.doOptimize();
        org.junit.Assert.assertFalse(vectorialPointValuePair1.equals(((java.lang.Object)(vectorialPointValuePair0))));
    }
}

