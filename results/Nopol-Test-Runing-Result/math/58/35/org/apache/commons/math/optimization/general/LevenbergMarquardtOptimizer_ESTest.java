package org.apache.commons.math.optimization.general;


public class LevenbergMarquardtOptimizer_ESTest extends org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test0() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = new double[0];
        double[] doubleArray2 = new double[5];
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(619, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray1, doubleArray2);
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair1 = levenbergMarquardtOptimizer0.doOptimize();
        org.junit.Assert.assertNotSame(vectorialPointValuePair1, vectorialPointValuePair0);
    }

    @org.junit.Test(timeout = 4000)
    public void test4() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = new double[0];
        double[] doubleArray2 = new double[5];
        doubleArray2[1] = ((double)(619));
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(619, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray1, doubleArray2);
        org.junit.Assert.assertNotNull(vectorialPointValuePair0);
    }

    @org.junit.Test(timeout = 4000)
    public void test5() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0 , 0.0 , 0.0);
        org.junit.Assert.assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
    }
}

