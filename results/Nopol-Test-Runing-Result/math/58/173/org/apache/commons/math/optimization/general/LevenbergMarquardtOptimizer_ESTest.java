package org.apache.commons.math.optimization.general;


public class LevenbergMarquardtOptimizer_ESTest extends org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test5() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1595.4901641) , (-1595.4901641) , (-1595.4901641));
        double[][] doubleArray0 = new double[1][8];
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(1536, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray1, doubleArray1, doubleArray0[0]);
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair1 = levenbergMarquardtOptimizer0.doOptimize();
        org.junit.Assert.assertNotSame(vectorialPointValuePair1, vectorialPointValuePair0);
    }
}

