package org.apache.commons.math.optimization.general;


public class LevenbergMarquardtOptimizer_ESTest extends org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test5() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.8847037487192653) , 0.0 , (-1.8847037487192653) , (-1.8847037487192653) , 0.0);
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = new double[9];
        double[] doubleArray2 = new double[0];
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(2146261111, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray2, doubleArray0, doubleArray1);
        org.junit.Assert.assertNotNull(vectorialPointValuePair0);
    }

    @org.junit.Test(timeout = 4000)
    public void test6() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(7, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray1);
        levenbergMarquardtOptimizer0.cols = 0;
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair1 = levenbergMarquardtOptimizer0.doOptimize();
        org.junit.Assert.assertNotSame(vectorialPointValuePair1, vectorialPointValuePair0);
    }

    @org.junit.Test(timeout = 4000)
    public void test7() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(43.475812895518295 , 43.475812895518295 , (-1.06972476384842));
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = new double[9];
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(3, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray1);
        org.junit.Assert.assertNotNull(vectorialPointValuePair0);
    }
}

